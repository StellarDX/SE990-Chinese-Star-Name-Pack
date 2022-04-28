// 虚宿二
Remove "Kitalpha A"{ParentBody "Kitalpha"}
Remove "Kitalpha B"{ParentBody "Kitalpha"}
Star "HIP 104987 A"
{
	ParentBody "HIP 104987"
	Class      "G7III"
	MassSol    2.3
  RadSol     9.2
  Luminosity 52.5
  Teff       5100

	Orbit
	{
		PeriodDays      98.8098
		Eccentricity    0
		/*Inclination     151.5
		AscendingNode   33.9
		Epoch           2447592.1*/
  	ArgOfPericenter 270
		MeanAnomaly     0
    //SemiAmplitude   16.34
	}
}

Star "HIP 104987 B"
{
	ParentBody "HIP 104987"
	Class      "kA3hA4mA9"
	MassSol    2
  RadSol     2.6
  Luminosity 26.3
  Teff       8150
  Age        0.74

  Orbit
	{
		PeriodDays      98.8098
		Eccentricity    0
		/*Inclination     151.5
		AscendingNode   33.9
		Epoch           2447592.1*/
  	ArgOfPericenter 90
		MeanAnomaly     0
    //SemiAmplitude   17.9
	}
}

// 司非一
Remove "GAM Equ A"{ParentBody "GAM Equ"}
Remove "GAM Equ B"{ParentBody "GAM Equ"}
Star "HIP 104521 A"
{
	ParentBody "HIP 104521"
	Class      "A9VpSrCrEu"
	RadSol     2.2
	Luminosity 12.8
	Teff       8574
	FeH        0.68

	Orbit
	{
		Period          250
		//SemiMajorAxis   54
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 104521 B"
{
	ParentBody "HIP 104521"
	Class      "G9"

	Orbit
	{
		Period          250
		//SemiMajorAxis   54
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 司非二
Remove "DEL Equ A"{ParentBody "DEL Equ"}
Remove "DEL Equ B"{ParentBody "DEL Equ"}
Star "HIP 104858 A"
{
	ParentBody "HIP 104858"
	Class      "F7 V"
	MassSol    1.192
	RadSol     1.3
	Luminosity 2.25
	Teff       6200
	FeH        -0.07
	Age        3

	Orbit
	{
		PeriodDays      2084.03
		Eccentricity    0.436851
		Inclination     99.4083
		AscendingNode   23.362
		Epoch           2453112.071
		ArgOfPericenter 187.735
		MeanAnomaly     0
	}
}

Star "HIP 104858 B"
{
	ParentBody "HIP 104858"
	Class      "F7V"
	MassSol    1.187
	RadSol     1.25
	Luminosity 2.07
	Teff       6200

	Orbit
	{
		PeriodDays      2084.03
		Eccentricity    0.436851
		Inclination     99.4083
		AscendingNode   23.362
		Epoch           2453112.071
		ArgOfPericenter 7.735
		MeanAnomaly     0
	}
}

// 泣一(*)
Star	"HIP 110273 A"
{
	ParentBody     "HIP 110273"
	Class	       "B8 IIIp Mn:Hg:"
	MassSol        5
	Luminosity     1035
	Teff           12593

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0443785
		Period          0.0114054
		Eccentricity    0
		Inclination     -58.836
		AscendingNode   -31.7525
		ArgOfPericenter 16.8705
		MeanAnomaly     168.113
	}
}

Star	"HIP 110273 B"
{
	ParentBody     "HIP 110273"
	Class	       "B6.7 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0487328
		Period          0.0114054
		Eccentricity    0
		Inclination     -58.836
		AscendingNode   -31.7525
		ArgOfPericenter 196.87
		MeanAnomaly     168.113
	}
}

// 天垒城一
Remove "KSI Aqr A"{ParentBody "KSI Aqr"}
Remove "KSI Aqr B"{ParentBody "KSI Aqr"}
Star "HIP 106786 A"
{
	ParentBody "HIP 106786"
	Class      "A7 V"
	MassSol    1.9
	Teff       7691
	FeH        -0.03

	Orbit
	{
		PeriodDays      8016
		//SemiMajorAxis   4.9417
		Eccentricity    0.54
		/*Inclination     95
		AscendingNode   300
		Epoch           2440733.364314*/
		ArgOfPericenter 270
		MeanAnomaly     0
	}
}

Star "HIP 106786 B"
{
	ParentBody "HIP 106786"
	Class      "M" //unknown, could be also a white dwarf
	MassSol    0.9
	Orbit
	{
		PeriodDays      8016
		//SemiMajorAxis   10.4325
		Eccentricity    0.54
		/*Inclination     95
		AscendingNode   300
		Epoch           2440733.364314*/
		ArgOfPericenter 90
		MeanAnomaly     0
	}
}

// 天垒城十二(*)
Star "HIP 105574 A"
{
	ParentBody "HIP 105574"
	Class      "K4III"
	Luminosity 495.46
	Teff       3951
	FeH        -0.1

	Orbit
	{
		PeriodDays      7290
		Eccentricity    0.4
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 105574 B"
{
	ParentBody "HIP 105574"
	Class      "F2IV"

	Orbit
	{
		PeriodDays      7290
		Eccentricity    0.4
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 败臼三
Remove "GAM PsA A"{ParentBody "GAM PsA"}
Remove "GAM PsA B"{ParentBody "GAM PsA"}
Star "HIP 112948 1" // 不冲突
{
    ParentBody "HIP 112948"
    Class      "A0 Vp(SrCrEu)"
    MassSol    2.63
		Teff       10776
		Age        0.214
    Orbit
    {
        Period          2075.882339
        //SemiMajorAxis   75.196078
        ArgOfPericenter 0
        MeanAnomaly     0
    }
}

Star "HIP 112948 2"
{
    ParentBody "HIP 112948"
    Class      "F5 V"

    Orbit
    {
        Period          2075.882339
        //SemiMajorAxis   184.803922
        ArgOfPericenter 180
        MeanAnomaly     0
    }
}
