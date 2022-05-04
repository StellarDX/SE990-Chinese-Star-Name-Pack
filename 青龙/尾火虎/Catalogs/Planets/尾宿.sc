// 尾宿一(EB**)
Star "HIP 82514 A"
{
	ParentBody "HIP 82514"
	Class      "B1.5V"
	MassSol    8.49
	RadSol     4.07
	Teff       23725

	Orbit
	{
		PeriodDays      1.44627
		//SemiMajorAxis   12.9*RadSol
		Eccentricity    0
		Inclination     65.2
		Epoch           2412374.434
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 82514 B"
{
	ParentBody "HIP 82514"
	Class      "B6.5V"
	MassSol    5.33
	RadSol     4.38
	Teff       16850

	Orbit
	{
		PeriodDays      1.44627
		//SemiMajorAxis   12.9*RadSol
		Eccentricity    0
		Inclination     65.2
		Epoch           2412374.434
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 尾宿五(**)
Star	"HIP 86228 A"
{
	ParentBody     "HIP 86228"
	Class	         "F0II"
	MassSol        5.66
	RadSol         26
	Luminosity     1834
	Teff           7268

	BinaryOrbit
	{
		Separation      582.3
	}
}

Star	"HIP 86228 B"
{
	ParentBody     "HIP 86228"
	Class	         "A"
	Luminosity     30

	BinaryOrbit
	{
		Separation      582.3
	}
}

// 尾宿七(bC**)
Star "HIP 86670 A"
{
	ParentBody "HIP 86670"
	Class      "B1.5III"
	MassSol    17
	RadSol     6.8
	Luminosity 6911
	Teff       23400
	RotationPeriod 45.6
	Age        0.0251

	Orbit
	{
		PeriodDays      195.65
		Eccentricity    0.488
		Epoch           1754918.0876631
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   48
	}
}

Star "HIP 86670 B"
{
	ParentBody "HIP 86670"
	Class      ""
	MassSol    12
	RadSol     5.8
	Teff       18800

	Orbit
	{
		PeriodDays      195.65
		Eccentricity    0.488
		Epoch           1754918.0876631
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 尾宿八(bC***)
Remove "LAM Sco A"{ParentBody "Shaula"}
Remove "LAM Sco Aa"{ParentBody "LAM Sco A"}
Remove "LAM Sco Ab"{ParentBody "LAM Sco A"}
Remove "LAM Sco B"{ParentBody "Shaula"}
Barycenter "HIP 85927 A"
{
	ParentBody "HIP 85927"
	Orbit
	{
		PeriodDays      1053
		SemiMajorAxis   2.09655172
		Eccentricity    0.121
		Inclination     77.2
		AscendingNode   271.3
		ArgOfPericenter 74.8
		Epoch           2451562.3
		MeanAnomaly     0
	}
}

Star "HIP 85927 Aa"
{
	ParentBody "HIP 85927 A"
	Class      "B2IV"
	MassSol    14.5
	RadSol     8.8
	Luminosity 36300
	Teff       25000

	Orbit
	{
		PeriodDays      6
		Inclination     77.2
		AscendingNode   271.3
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 85927 Ab"
{
	ParentBody "HIP 85927 A"
	Class      "DA7.9"
	MassSol    2

	Orbit
	{
		PeriodDays      6
		Inclination     77.2
		AscendingNode   271.3
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 85927 B"
{
	ParentBody "HIP 85927"
	Class      "B"
	MassSol    9.6 // 11.6
	RadSol     4.7
	Teff       25000

	Orbit
	{
		PeriodDays      1053
		SemiMajorAxis   3.60344828
		Eccentricity    0.121
		Inclination     77.2
		AscendingNode   271.3
		ArgOfPericenter 254.8
		Epoch           2451562.3
		MeanAnomaly     0
	}
}

// 龟二 (假双星)
Remove "GAM Ara A"{ParentBody "GAM Ara"}
Remove "GAM Ara B"{ParentBody "GAM Ara"}

// 龟三(PM**)
Star	"HIP 85727 A"
{
	ParentBody     "HIP 85727"
	Class	         "B8Vn"
	MassSol        3.56
	RadSol         3.12
	Luminosity     214
	Teff           11962
	Age            0.125

	Orbit
	{
		RefPlane        "Equator"
		Period          4.10716
		Eccentricity    0.0986494
		Inclination     -28.9183
		AscendingNode   57.2303
		ArgOfPericenter 71.1042
		MeanAnomaly     -70.5728
	}
}

Star	"HIP 85727 B"
{
	ParentBody     "HIP 85727"
	Class	         "G8V"

	Orbit
	{
		RefPlane        "Equator"
		Period          4.10716
		Eccentricity    0.0986494
		Inclination     -28.9183
		AscendingNode   57.2303
		ArgOfPericenter 251.104
		MeanAnomaly     -70.5728
	}
}

// 天江二 - 天江增三(***) (修改部分数据)
Remove "36 Oph (AB)"{ParentBody "36 Oph"}
Remove "36 Oph A"{ParentBody "36 Oph (AB)"}
Remove "36 Oph B"{ParentBody "36 Oph (AB)"}
Remove "36 Oph C"{ParentBody "36 Oph"}
Barycenter	"天江二/36 Oph AB/GJ 663 AB/CD-26 12026/GCTP 3908.00 AB/HIP 84405 AB"
{
	ParentBody "36 Oph"
	BinaryOrbit
	{
		Separation      4354.4
		PositionAngle 	240
	}
}

Star	"36 Oph A/Guniibuu/HR 6402 A/HD 155886 A/LHS 437/SAO 185198 A/Gaia DR2 4109030160308320128"
{
	ParentBody	"HIP 84405 AB"
	Class		    "K2V"
	MassSol     0.85
	RadSol      0.817
	LumBol      0.33
	Luminosity  0.28
	Teff        4843
	FeH         -0.2
	Age         0.6

	Orbit
	{
		Period		  	  568.9
		Eccentricity	  0.922
		Inclination	  	99.6
		AscendingNode	  -83.6
		Epoch	      		2365124.57674453
		ArgOfPericenter	0
		MeanAnomaly	  	0
	}
}

Star	"36 Oph B/HR 6401 B/HD 155885 B/LHS 438/SAO 185199 B/Gaia DR2 4109030160308317312"
{
	ParentBody	"HIP 84405 AB"
	Class	    	"K1V"
	MassSol     0.85
	RadSol      0.81
	LumBol      0.36
	Luminosity  0.3
	Teff        4985
	FeH         -0.31
	Age         1.8

	Orbit
	{
		Period		  	  568.9
		Eccentricity	  0.922
		Inclination	  	99.6
		AscendingNode	  -83.6
		Epoch	      		2365124.57674453
		ArgOfPericenter	180
		MeanAnomaly	  	0
	}
}

Star	"天江增三/30 Sco/V2215 Oph/GJ 664 C/HD 156026 C/GCTP 3913.00 C/LHS 439/SAO 185213 C/HIP 84478 C/Gaia DR2 4109034455276324608"
{
	ParentBody	"36 Oph"
	Class		    "K5V"
	MassSol     0.71
	RadSol      0.72
	LumBol      0.2
	Luminosity  0.09
	Teff        4550
	FeH         0

	/*BinaryOrbit
	{
		Separation      4354.4
		PositionAngle 	240
	}*/
}

// 天江三(bC***)
Remove "TET Oph (AB)"{ParentBody "TET Oph"}
Remove "TET Oph A"{ParentBody "TET Oph (AB)"}
Remove "TET Oph B"{ParentBody "TET Oph (AB)"}
Remove "TET Oph C"{ParentBody "TET Oph"}
Barycenter "HIP 84970 AB"
{
	ParentBody "HIP 84970"
	BinaryOrbit
	{
		Separation      20.1012
	}
}

Star "HIP 84970 A"
{
	ParentBody "HIP 84970 AB"
	Class      "B2IV"
	MassSol    8.8
	RadSol     6.3
	Luminosity 5000
	Teff       22260
	FeH        -0.15
	Age        0.0213

	Orbit
	{
		PeriodDays      56.71
		Eccentricity    0.17
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 84970 B"
{
	ParentBody "HIP 84970 AB"
	Class      "B5.5 V"

	Orbit
	{
		PeriodDays      56.71
		Eccentricity    0.17
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 84970 C"
{
	ParentBody "HIP 84970"
	Class      "B5 V"
	/*BinaryOrbit
	{
		Separation      20.1012
	}*/
}
