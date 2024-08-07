#define _USE_CSE_DEFINES

#include <iostream>
#include <fstream>
#include <format>
#include <CSE/Base.h>
#include <CSE/Parser.h>

using namespace std;
using namespace cse;
using namespace cse::__scstream_table_helpers;

static const auto DefConfig =
    "Catalog         \"Star\"\n"
    "Parallax        \n"
    "AppMagn         \n"
    "logGrav         \n"
    "RadSol          \n"
    "Teff            \n"
    "FeH             \n";

static const auto OutputFormat1 =
    "\tAbsMagn         {:.3} // 计算的值\n"
    "\tMassSol         {:.15} // log(g) = {:.15} cm/s^2\n"
    "\tRadSol          {:.15} // Gaia DR3\n"
    "\tLumBol          {:.15} // 计算的值\n"
    "\tTeff            {:.15}\n"
    "\tFeH             {:.15}\n";

static const auto OutputFormat2 =
    "AbsMagn         {:.3} // 计算的值\n"
    "MassKg          {:.15} // log(g) = {:.15} cm/s^2\n"
    "RadSol          {:.15} // Gaia DR3\n"
    "LumBol          {:.15} // 计算的值\n"
    "Teff            {:.15}\n"
    "FeH             {:.15}\n";

int main(int argc, char const *argv[])
{
    if (argc > 1 && argv[1] == string("--genconfig"))
    {
        ofstream Conf("GaiaAutoComplete.conf");
        Conf << DefConfig;
        Conf.close();
        return 114514;
    }

    ustring Catalog;
    float64 Parallax;
    float64 AppMagn;
    float64 logGrav;
    float64 RadSol;
    float64 Teff;
    float64 FeH;

    auto Table = ParseFile("GaiaAutoComplete.conf");
    __Get_Value_From_Table(&Catalog, Table, L"Catalog", ustring());
    __Get_Value_From_Table(&Parallax, Table, L"Parallax", 0.);
    __Get_Value_From_Table(&AppMagn, Table, L"AppMagn", 0.);
    __Get_Value_From_Table(&logGrav, Table, L"logGrav", 0.);
    __Get_Value_From_Table(&RadSol, Table, L"RadSol", 0.);
    __Get_Value_From_Table(&Teff, Table, L"Teff", 0.);
    __Get_Value_From_Table(&FeH, Table, L"FeH", 0.);

    Parallax /= 1000;
    float64 Radius = RadSol * SolarRadius;

    float64 Mass = ((cse::pow(10, logGrav) / 100.) * cse::pow(Radius, 2)) / GravConstant;
    float64 LumBol = StBConstant * (4. * CSE_PI * Radius * Radius) * cse::pow(Teff, 4);
    LumBol /= SolarLum;
    float64 AbsMagn = AppMagn + 5 * (cse::log(Parallax) + 1);

    ofstream fout("GaiaAutoCompleteResult.txt");
    if (Catalog == "Planet")
    {
        fout << vformat(OutputFormat2,
            make_format_args(AbsMagn, Mass, logGrav, RadSol, LumBol, Teff, FeH));
    }
    else
    {
        float64 MassSol = Mass / SolarMass;
        fout << vformat(OutputFormat1,
            make_format_args(AbsMagn, MassSol, logGrav, RadSol, LumBol, Teff, FeH));
    }
    fout.close();

    return 0;
}
