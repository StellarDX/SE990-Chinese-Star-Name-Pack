#include <format>
#include <fstream>
#include <iostream>
#include <vector>
#include "CSE/Parser.h"
#include "CSE/Sexagesimal.h"

using namespace std;
using namespace cse;
using namespace cse::Epoch;
using namespace cse::scenario;
using namespace cse::__scstream_table_helpers;

static const int Precision = 15;

using StdStringList = vector<string>;

static const regex IdentifierRegex("^Identifiers \\(([0-9]+)\\):$");
static const regex CoordinateRegex(
    "^Coordinates\\(([a-zA-Z0-9]+),ep=([a-zA-Z0-9]+),eq=([0-9]+)\\): "
    "(([0-9.]+) ([0-9.]+) ([0-9.]+))  (([+-][0-9.]+) ([0-9.]+) ([0-9.]+)).*$");
static const regex ParallaxRegex("^Parallax: ([0-9.]+) \\[([~0-9.]+)\\].*$");
static const regex AppMagnRegex("^Flux V : ([0-9.]+) \\[([~0-9.]+)\\].*$");
static const regex SpectralTypeRegex("^Spectral type: ([\\S]+).*$");

static const regex NomenclatureNameRegex("^NAME (.+)$");
static const regex BayerDesignationRegex("^\\* ([A-Za-z][A-Za-z][A-Za-z.]) ([A-Za-z][A-Za-z][A-Za-z])$");
static const regex BayerDesignationRegex2("^\\* ([A-Za-z]) ([A-Za-z][A-Za-z][A-Za-z])$");
static const regex BayerDesignationRegex3("^\\* ([A-Za-z][A-Za-z][A-Za-z.])([0-9][0-9]) ([A-Za-z][A-Za-z][A-Za-z])$");
static const regex BayerDesignationRegexV("^V\\* ([A-Za-z][A-Za-z][A-Za-z.]) ([A-Za-z][A-Za-z][A-Za-z])$");
static const regex BayerDesignationRegexV2("^V\\* ([A-Za-z][A-Za-z][A-Za-z.])([0-9][0-9]) ([A-Za-z][A-Za-z][A-Za-z])$");
static const regex FlamsteedDesignationRegex("^\\* ([0-9]+) ([A-Za-z][A-Za-z][A-Za-z])$");

void __Remove_White_Spaces(string& Str)
{
    Str.erase(0, Str.find_first_not_of(" \t"));
    Str.erase(Str.find_last_not_of(" \t") + 1);
}

void __Add_Comment(SCSTable* PTable, string Content)
{
    __Add_Empty_Tag(PTable);
    PTable->Get().back().Key = "// " + Content;
}

StdStringList ReadAllFile(ifstream& Fin)
{
    StdStringList Lines;
    string LineBuffer;
    while (getline(Fin, LineBuffer, '\n'))
    {
        Lines.push_back(LineBuffer);
    }
    return Lines;
}

string GetMainIdentifier(StdStringList Input)
{
    return Input.at(2);
}

string GetObjectTypes(StdStringList Input, string* ObjType)
{
    static const string TypeKey = "Object types: ";
    auto ObjectTypeStringIt = find_if(Input.begin(), Input.end(), [](string Str)
    {
        return Str.substr(0, TypeKey.size()) == TypeKey;
    });
    if (ObjectTypeStringIt == Input.end()) {return _NoDataStr;}
    string ObjectTypeString = *ObjectTypeStringIt;

    if (ObjType)
    {
        if (ObjectTypeString.find("Binary") != ObjectTypeString.npos ||
            ObjectTypeString.find("Multiple") != ObjectTypeString.npos)
        {
            *ObjType = "StarBarycenter";
        }
        else //if (ObjectTypeString.find("Star") != ObjectTypeString.npos)
        {
            *ObjType = "Star";
        }
    }

    return ObjectTypeString;
}

void __Convert_Nomenclature_Name(string& Identifier)
{
    smatch Match;
    if (std::regex_search(Identifier, Match, NomenclatureNameRegex))
    {
        Identifier = Match[1];
    }
}

void __Convert_Bayer_Flamsteed_Designation(string& Identifier)
{
    smatch Match;
    if (std::regex_search(Identifier, Match, BayerDesignationRegex))
    {
        string GreekChar = Match[1];
        transform(GreekChar.begin(), GreekChar.end(), GreekChar.begin(), ::toupper);
        if (GreekChar.back() == '.') {GreekChar = GreekChar.substr(0, 2);}
        Identifier = GreekChar + ' ' + Match[2];
    }
    else if (std::regex_search(Identifier, Match, BayerDesignationRegex2))
    {
        Identifier = string(Match[1]) + ' ' + Match[2];
    }
    else if (std::regex_search(Identifier, Match, BayerDesignationRegex3))
    {
        string GreekChar = Match[1];
        transform(GreekChar.begin(), GreekChar.end(), GreekChar.begin(), ::toupper);
        if (GreekChar.back() == '.') {GreekChar = GreekChar.substr(0, 2);}
        int Num = stoi(string(Match[2]));
        Identifier = format("{}{} {}", GreekChar, Num, string(Match[3]));
    }
    else if (std::regex_search(Identifier, Match, BayerDesignationRegexV))
    {
        string GreekChar = Match[1];
        transform(GreekChar.begin(), GreekChar.end(), GreekChar.begin(), ::toupper);
        if (GreekChar.back() == '.') {GreekChar = GreekChar.substr(0, 2);}
        Identifier = format("V* {} {}", GreekChar, string(Match[2]));
    }
    else if (std::regex_search(Identifier, Match, BayerDesignationRegexV2))
    {
        string GreekChar = Match[1];
        transform(GreekChar.begin(), GreekChar.end(), GreekChar.begin(), ::toupper);
        if (GreekChar.back() == '.') {GreekChar = GreekChar.substr(0, 2);}
        int Num = stoi(string(Match[2]));
        Identifier = format("V* {}{} {}", GreekChar, Num, string(Match[3]));
    }
    else if (std::regex_search(Identifier, Match, FlamsteedDesignationRegex))
    {
        Identifier = string(Match[1]) + ' ' + Match[2];
    }
}

string GetIdentifiers(StdStringList Input, StdStringList* IdentifierBuffer = nullptr)
{
    StdStringList Identifiers;
    smatch Match;
    bool FoundKey = false;
    int CIndex = 0, ICount, LCount;
    for (const auto& i : Input)
    {
        if (std::regex_search(i, Match, IdentifierRegex))
        {
            FoundKey = true;
            ICount = stoi(Match[1]);
            LCount = cse::ceil(ICount / 3.);
            break;
        }
        ++CIndex;
    }

    int TargetIndices[] = {3, 40, 77, 0};
    int NameCount = 3;
    for (int i = CIndex + 1; i < CIndex + 1 + LCount; ++i)
    {
        TargetIndices[3] = Input[i].size();
        if (TargetIndices[3] <= TargetIndices[1]) {NameCount = 1;}
        if (TargetIndices[3] <= TargetIndices[2]) {NameCount = 2;}
        sort(TargetIndices, TargetIndices + 4, [](int Left, int Right) {return Left < Right;});

        string IBuffer;
        for (int j = 0; j < NameCount; ++j)
        {
            IBuffer = Input[i].substr(TargetIndices[j], TargetIndices[j + 1] - TargetIndices[j]);
            __Remove_White_Spaces(IBuffer);
            if (IBuffer.empty()) {continue;}
            bool IsMain = Input[5].find(IBuffer) != Input[5].npos;
            __Convert_Nomenclature_Name(IBuffer);
            __Convert_Bayer_Flamsteed_Designation(IBuffer);
            if (IsMain) {Identifiers.insert(Identifiers.begin(), IBuffer);}
            else {Identifiers.push_back(IBuffer);}
            IBuffer.clear();
        }
    }

    if (IdentifierBuffer) {*IdentifierBuffer = Identifiers;}

    string FinalString = Identifiers[0];
    for (int i = 1; i < Identifiers.size(); ++i)
    {
        FinalString.append('/' + Identifiers[i]);
    }
    return FinalString;
}

array<string, 11> GetCoordinates(StdStringList Input)
{
    array<string, 11> ResultInfo;
    smatch Match;
    bool FoundKey = false;
    string System, Epoch, Equinox, RA, Dec;
    for (const auto& i : Input)
    {
        if (std::regex_search(i, Match, CoordinateRegex))
        {
            FoundKey = true;
            for (int j = 1; j < Match.size(); ++j)
            {
                ResultInfo[j - 1] = Match[j];
            }
            break;
        }
    }
    if (!FoundKey) {return {_NoDataStr};}
    return ResultInfo;
}

Sexagesimal __String_To_Sexageximal(string deg, string min, string sec)
{
    return ConstructSexagesimal(stoi(deg), stoi(min), stod(sec));
}

void __Add_Coordinates(SCSTable* Table, Sexagesimal RA, Sexagesimal Dec)
{
    auto __Add_Value = [Table](auto Value)
    {
        std::wostringstream ValueStr;
        ValueStr << setprecision(Precision) << Value;
        Table->Get().back().Value.push_back(
        {
            .Type = _SC ValueType::ToTypeID<float64>(),
            .Value = {ustring(ValueStr.str())}
        });
    };

    __Add_Empty_Tag(Table);
    Table->Get().back().Key = "RA";
    __Add_Value(RA.Degrees);
    __Add_Value(RA.Minutes);
    __Add_Value(RA.Seconds);

    __Add_Empty_Tag(Table);
    Table->Get().back().Key = "Dec";
    __Add_Value((Dec.Negative ? -1 : 1) * Dec.Degrees);
    __Add_Value(Dec.Minutes);
    __Add_Value(Dec.Seconds);
}

vec2 GetParallax(StdStringList Input)
{
    vec2 ResultInfo;
    smatch Match;
    bool FoundKey = false;
    for (const auto& i : Input)
    {
        if (std::regex_search(i, Match, ParallaxRegex))
        {
            FoundKey = true;
            ResultInfo = vec2(stod(Match[1]), Match[2] == "~" ? 0 : stod(Match[2]));
            break;
        }
    }
    if (!FoundKey) {return vec2(_NoDataDbl);}
    return ResultInfo;
}

vec2 GetAppMagn(StdStringList Input)
{
    vec2 ResultInfo;
    smatch Match;
    bool FoundKey = false;
    for (const auto& i : Input)
    {
        if (std::regex_search(i, Match, AppMagnRegex))
        {
            FoundKey = true;
            ResultInfo = vec2(stod(Match[1]), Match[2] == "~" ? 0 : stod(Match[2]));
            break;
        }
    }
    if (!FoundKey) {return vec2(_NoDataDbl);}
    return ResultInfo;
}

string GetSpectralType(StdStringList Input)
{
    string ResultInfo;
    smatch Match;
    bool FoundKey = false;
    for (const auto& i : Input)
    {
        if (std::regex_search(i, Match, SpectralTypeRegex))
        {
            FoundKey = true;
            ResultInfo = Match[1];
            break;
        }
    }
    if (!FoundKey) {return _NoDataStr;}
    return ResultInfo;
}

void AddMeasures(SCSTable* PTable)
{
    __Add_Empty_Tag(PTable);
    PTable->Get().back().Key = "AbsMagn";
    __Add_Empty_Tag(PTable);
    PTable->Get().back().Key = "MassSol";
    __Add_Empty_Tag(PTable);
    PTable->Get().back().Key = "RadSol";
    __Add_Empty_Tag(PTable);
    PTable->Get().back().Key = "LumBol";
    __Add_Empty_Tag(PTable);
    PTable->Get().back().Key = "Teff";
    __Add_Empty_Tag(PTable);
    PTable->Get().back().Key = "FeH";
    __Add_Empty_Tag(PTable);
    PTable->Get().back().Key = "Age";
}

void AddBinaryOrbit(SCSTable* PTable)
{
    __Add_Empty_Tag(PTable);
    PTable->Get().back().Key = "BinaryOrbit";
    SCSTable OrbitTable;
    __Add_Empty_Tag(&OrbitTable);
    OrbitTable.Get().back().Key = "PeriodDays";
    __Add_Empty_Tag(&OrbitTable);
    OrbitTable.Get().back().Key = "Separation";
    __Add_Empty_Tag(&OrbitTable);
    OrbitTable.Get().back().Key = "Eccentricity";
    __Add_Empty_Tag(&OrbitTable);
    OrbitTable.Get().back().Key = "Inclination";
    __Add_Empty_Tag(&OrbitTable);
    OrbitTable.Get().back().Key = "AscendingNode";
    __Add_Empty_Tag(&OrbitTable);
    OrbitTable.Get().back().Key = "Epoch";
    __Add_Empty_Tag(&OrbitTable);
    OrbitTable.Get().back().Key = "ArgOfPericenter";
    __Add_Empty_Tag(&OrbitTable);
    OrbitTable.Get().back().Key = "MeanAnomaly";
    OrbitTable.Get().back().Value.push_back(
    {
        .Type = _SC ValueType::ToTypeID<float64>(),
        .Value = {ustring("0")}
    });
    PTable->Get().back().SubTable = make_shared<SCSTable>(OrbitTable);
}

int main(int argc, char const* const* argv)
{
    if (argc == 1) {return 114514;}
    ifstream Fin(argv[1]);
    if (!Fin.is_open()) {return 1919810;}

    StdStringList InputLines = ReadAllFile(Fin);
    SCSTable
        MainTable, SubTable,
        ObjectMainTable, ObjectSubTable,
        BarycenTable, BarycenSubTable,
        CompMainTable, CompSubTable;
    string MainIdentifier = GetMainIdentifier(InputLines);
    StdStringList IdentifierList;
    string Identifiers = GetIdentifiers(InputLines, &IdentifierList);

    __Add_Comment(&MainTable, InputLines[5]);
    string ObjType;
    string ObjTypeString = GetObjectTypes(InputLines, &ObjType);
    __Add_Comment(&MainTable, ObjTypeString);
    __Add_Key_Value(&MainTable, ObjType, ustring(Identifiers), 0, Precision);

    __Add_Key_Value(&SubTable, "DateUpdated", CSEDate::CurrentDate(), 0, Precision);

    auto Coordiantes = GetCoordinates(InputLines);
    if (!IS_NO_DATA_STR(Coordiantes[0]))
    {
        __Add_Comment(&SubTable, format("Coordinate System: {}, Epoch: {}, Equinox: {}",
            Coordiantes[0], Coordiantes[1], Coordiantes[2]));
        __Add_Coordinates(&SubTable,
            __String_To_Sexageximal(Coordiantes[4], Coordiantes[5], Coordiantes[6]),
            __String_To_Sexageximal(Coordiantes[8], Coordiantes[9], Coordiantes[10]));
    }

    auto Parallax = GetParallax(InputLines);
    if (!IS_NO_DATA_DBL(Parallax[0]))
    {
        __Add_Key_Value(&SubTable, "Parallax", Parallax[0], 0, Precision);
    }

    auto AppMagn = GetAppMagn(InputLines);
    if (!IS_NO_DATA_DBL(Parallax[0]))
    {
        __Add_Key_Value(&SubTable, "AppMagn", AppMagn[0], 0, Precision);
    }

    auto SpectralType = GetSpectralType(InputLines);
    if (!IS_NO_DATA_STR(SpectralType))
    {
        __Add_Key_Value(&SubTable, "Class", ustring(SpectralType), 0, Precision);
    }

    if (ObjType == "StarBarycenter")
    {
        __Add_Comment(&ObjectMainTable, InputLines[5]);
        __Add_Comment(&ObjectMainTable, ObjTypeString);
        __Add_Key_Value(&ObjectMainTable, "Star", ustring(MainIdentifier + " A"), 0, Precision);
        __Add_Key_Value(&ObjectSubTable, "DateUpdated", CSEDate::CurrentDate(), 0, Precision);
        __Add_Key_Value(&ObjectSubTable, "ParentBody", ustring(IdentifierList[0]), 0, Precision);
        __Add_Key_Value(&ObjectSubTable, "Class", ustring(SpectralType), 0, Precision);
        AddMeasures(&ObjectSubTable);
        AddBinaryOrbit(&ObjectSubTable);
        ObjectMainTable.Get().back().SubTable = make_shared<decltype(ObjectSubTable)>(ObjectSubTable);

        __Add_Comment(&BarycenTable, InputLines[5]);
        __Add_Comment(&BarycenTable, ObjTypeString);
        __Add_Key_Value(&BarycenTable, "Barycenter", ustring(MainIdentifier + " A"), 0, Precision);
        __Add_Key_Value(&BarycenSubTable, "ParentBody", ustring(IdentifierList[0]), 0, Precision);
        AddBinaryOrbit(&BarycenSubTable);
        BarycenTable.Get().back().SubTable = make_shared<decltype(BarycenSubTable)>(BarycenSubTable);

        __Add_Comment(&CompMainTable, InputLines[5]);
        __Add_Comment(&CompMainTable, ObjTypeString);
        __Add_Key_Value(&CompMainTable, "Star", ustring(MainIdentifier + " B"), 0, Precision);
        __Add_Key_Value(&CompSubTable, "DateUpdated", CSEDate::CurrentDate(), 0, Precision);
        __Add_Key_Value(&CompSubTable, "ParentBody", ustring(IdentifierList[0]), 0, Precision);
        __Add_Key_Value(&CompSubTable, "Class", ustring(""), 0, Precision);
        AddMeasures(&CompSubTable);
        CompMainTable.Get().back().SubTable = make_shared<decltype(CompSubTable)>(CompSubTable);
    }
    else
    {
        __Add_Comment(&SubTable, "Measures");
        AddMeasures(&SubTable);
    }

    MainTable.Get().back().SubTable = make_shared<decltype(SubTable)>(SubTable);

    ofstream Fout(MainIdentifier + ".sc");
    OSCStream os(Fout);
    os << MainTable;
    if (ObjType == "StarBarycenter") {os << ObjectMainTable << BarycenTable << CompMainTable;}
    os.Write();
    Fout.close();

    return 0;
}
