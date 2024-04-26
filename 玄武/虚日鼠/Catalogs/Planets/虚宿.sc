// 虚宿二(SB**)
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
		Inclination     151.5
		AscendingNode   33.9
		Epoch           2447592.1
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
		Inclination     151.5
		AscendingNode   33.9
		Epoch           2447592.1
  	ArgOfPericenter 90
		MeanAnomaly     0
    //SemiAmplitude   17.9
	}
}

// 司命一(SB**)
Barycenter "HIP 106758 A"
{
	ParentBody "HIP 106758"
	BinaryOrbit
	{
		Period          48.65
		Eccentricity    0.868
		Inclination     58
		AscendingNode   139.3
		Epoch           2441153.39284278
		ArgOfPericenter 113
		MeanAnomaly     0
	}
}

Star "HIP 106758 Aa"
{
	ParentBody "HIP 106758 A"
	Class      "F7V"
	MassSol    1.25
  RadSol     1.42
  Luminosity 2.864
  Teff       6231
	FeH        -0.09
	Age        3.5

	Orbit
	{
		PeriodDays      5.8839
		Eccentricity    0.071
  	ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 106758 Ab"
{
	ParentBody "HIP 106758 A"
	Class      "K2.8 V"

	Orbit
	{
		PeriodDays      5.8839
		Eccentricity    0.071
  	ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 106758 B"
{
	ParentBody "HIP 106758"
	Class      "F9V"

  /*BinaryOrbit
	{
		Period          48.65
		Eccentricity    0.868
		Inclination     58
		AscendingNode   139.3
		Epoch           2441153.39284278
		ArgOfPericenter 293
		MeanAnomaly     0
	}*/
}


// 司非一(a2**)
Remove "GAM Equ A"{ParentBody "GAM Equ"}
Remove "GAM Equ B"{ParentBody "GAM Equ"}
Star "HIP 104521 A"
{
	ParentBody "HIP 104521"
	Class      "A9VpSrCrEu"
	MassSol    1.78
	RadSol     2.11
	Luminosity 11
	Teff       7550
	FeH        0.68
	Age        1

	BinaryOrbit
	{
		Separation      45.738
	}
}

Star "HIP 104521 B"
{
	ParentBody "HIP 104521"
	Class      "G9"

	/*BinaryOrbit
	{
		Separation      45.738
	}*/
}

// 司非二(SB**)
Remove "DEL Equ A"{ParentBody "DEL Equ"}
Remove "DEL Equ B"{ParentBody "DEL Equ"}
Star "HIP 104858 A"
{
	ParentBody "HIP 104858"
	Class      "F7V"
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
		Epoch           2453112.571
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
		Epoch           2453112.571
		ArgOfPericenter 7.735
		MeanAnomaly     0
	}
}

// 泣一(SB**)
Star	"HIP 110273 A"
{
	ParentBody     "HIP 110273"
	Class	         "B8IIIpMn:Hg:"
	MassSol        5
	Luminosity     1035
	Teff           12593

	Orbit
	{
		PeriodDays      220.41
		Epoch           2418548.7
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   18.66
	}
}

Star	"HIP 110273 B"
{
	ParentBody     "HIP 110273"
	Class	         "B6.7 V"

	Orbit
	{
		PeriodDays      220.41
		Epoch           2418548.7
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天垒城一(SB**)
Remove "KSI Aqr A"{ParentBody "KSI Aqr"}
Remove "KSI Aqr B"{ParentBody "KSI Aqr"}
Star "HIP 106786 A"
{
	ParentBody "HIP 106786"
	Class      "A7V"
	MassSol    1.9
	Teff       7691
	FeH        -0.03

	Orbit
	{
		PeriodDays      8016
		Eccentricity    0.54
		Inclination     95
		AscendingNode   300
		Epoch           2440733.364314
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
		Eccentricity    0.54
		Inclination     95
		AscendingNode   300
		Epoch           2440733.364314
		ArgOfPericenter 90
		MeanAnomaly     0
	}
}

// 天垒城十二(**)
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
	Class      "F2 IV"

	Orbit
	{
		PeriodDays      7290
		Eccentricity    0.4
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 败臼三(**)
Remove "GAM PsA A"{ParentBody "GAM PsA"}
Remove "GAM PsA B"{ParentBody "GAM PsA"}
Star "HIP 112948 1" // 不冲突
{
  ParentBody "HIP 112948"
  Class      "A0Vp(SrCrEu)"
  MassSol    2.63
	Teff       10776
	Age        0.214

  BinaryOrbit
  {
		Epoch           2455196.95538591
    Separation      248
		PositionAngle   255
  }
}

Star "HIP 112948 2"
{
  ParentBody "HIP 112948"
  Class      "F5V"

	/*BinaryOrbit
  {
		Epoch           2455196.95538591
    Separation      248
		PositionAngle   255
  }*/
}
