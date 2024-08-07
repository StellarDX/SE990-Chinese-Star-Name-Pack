#define _USE_CSE_DEFINES

#include <iostream>
#include <fstream>
#include <CSE/Base.h>

using namespace std;
using namespace cse;

void GetRadiusFromLumBolTeff()
{
    float64 LumBol, Teff;
    cout << "Bolometric Luminosity in LSun : ";
    cin >> LumBol;
    cout << LumBol << '\n';
    cout << "Effective Temperature in K : ";
    cin >> Teff;
    cout << Teff << '\n';
    float64 Radius = cse::sqrt(LumBol * SolarLum / (4. * CSE_PI * StBConstant * cse::pow(Teff, 4.)));
    cout << "Radius in Km: " << Radius / 1000. << '\n';
}

void GetMassFromRadiusGravity()
{
    float64 Radius, logg;
    cout << "Radius in Km (If you have SolarRadius, put a '-' sign for the number) : ";
    cin >> Radius;
    if (Radius < 0) {Radius = cse::abs(Radius * SolarRadius);}
    else {Radius *= 1000.;}
    cout << Radius << '\n';
    cout << "Surface Gravity (log g) in cm/s^2 : ";
    cin >> logg;
    cout << logg << '\n';
    float64 Mass = ((cse::pow(10, logg) / 100.) * cse::pow(Radius, 2)) / GravConstant;
    int Option;
    cout << "Output format\n"
            " 1 - Kg\n"
            " 2 - MSun\n"
            "(Defuault: 1) : ";
    cin >> Option;
    switch (Option)
    {
    default:
    case 1:
        break;
    case 2:
        Mass /= SolarMass;
        break;
    }
    cout << Mass << '\n';
}

void GetRadiusFromMassGravity()
{
    float64 Mass, logg;
    cout << "Mass in MSun : ";
    cin >> Mass;
    Mass *= SolarMass;
    cout << Mass << '\n';
    cout << "Surface Gravity (log g) in cm/s^2 : ";
    cin >> logg;
    cout << logg << '\n';
    float64 Radius = cse::sqrt((GravConstant * Mass) / ((cse::pow(10, logg) / 100.)));
    cout << Radius / 1000. << '\n';
}

void GetDistFromSeparation()
{
    float64 AngularSep, Dist;
    cout << "Angular separation in asec (If you have mas, put a '-' sign for the number) : ";
    cin >> AngularSep;
    if (AngularSep < 0) {AngularSep = cse::abs(AngularSep / 1000.);}
    cout << AngularSep << '\n';
    cout << "Distance of system in Pc (If you have Parallax in mas, put a '-' sign for the number) : ";
    cin >> Dist;
    if (Dist < 0) {Dist = cse::abs(1. / (Dist / 1000.));}
    cout << Dist << '\n';
    float64 ActualDist = Parsec *
        cse::sqrt(pow(Dist, 2) + cse::pow(Dist, 2) - (2 * Dist * Dist * cse::cos(AngularSep / 3600.)));
    int Option;
    cout << "Output format\n"
            " 1 - Km\n"
            " 2 - AU\n"
            " 3 - Pc\n"
            "(Defuault: 1) : ";
    cin >> Option;
    switch (Option)
    {
    default:
    case 1:
        ActualDist /= 1000.;
        break;
    case 2:
        ActualDist /= AU;
        break;
    case 3:
        ActualDist /= Parsec;
        break;
    }
    cout << ActualDist << '\n';
}

int main()
{
    cout.precision(15);
    while(true)
    {
        cout << "\nCommon Calculator\n(Based on CSpaceEngine)\n----------------------------------------------\n";
        cout << "Mode\n"
                " 1 = Calculate radius from luminosity and temperature\n"
                " 2 = Calculate mass from radius and log g\n"
                " 3 = Calculate radius from mass and log g\n"
                " 4 = Calculate actual distance from angular separation\n"
                " 0 = Exit\n";

        int Preset;
        cin >> Preset;

        switch (Preset)
        {
        case 1:
            GetRadiusFromLumBolTeff();
            break;

        case 2:
            GetMassFromRadiusGravity();
            break;

        case 3:
            GetRadiusFromMassGravity();
            break;

        case 4:
            GetDistFromSeparation();
            break;

        case 0:
            printf("Exiting...");
            exit(0);
        default:
            break;
        }
    }

    return 0;
}

