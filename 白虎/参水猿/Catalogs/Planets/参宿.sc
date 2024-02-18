// 参宿一(***)
Remove "Alnitak A"{ParentBody "Alnitak"}
Remove "Alnitak B"{ParentBody "Alnitak"}
Remove "Alnitak Aa"{ParentBody "Alnitak A"}
Remove "Alnitak Ab"{ParentBody "Alnitak A"}
Barycenter "HIP 26727 A"
{
	ParentBody "HIP 26727"
	BinaryOrbit
	{
		Period          1508.6
		Eccentricity    0.07
		Inclination     72
		AscendingNode   155.5
		Epoch           2477330.63263204
		ArgOfPericenter 227.3
		MeanAnomaly     0
	}
}

Star "寿/HIP 26727 A1" // 不冲突
{
	ParentBody "HIP 26727 A"
	Class      "O9.5Iab"
	MassSol    33
  RadSol     20
  Luminosity 250000
  Teff       29500
  RotationPeriod 160.08
  Age        0.0064

	Orbit
	{
		PeriodDays      2687.3
		Eccentricity    0.338
		Inclination     139.3
		AscendingNode   83.8
		Epoch           2452734.2
		ArgOfPericenter 24.2
		MeanAnomaly     0
    //SemiAmplitude   10.1
	}
}

Star "HIP 26727 A2"
{
	ParentBody "HIP 26727 A"
	Class      "B1IV"
	MassSol    14
  RadSol     7.3
  Luminosity 32000
  Teff       29000
  Age        0.0072

	Orbit
	{
    PeriodDays      2687.3
		Eccentricity    0.338
		Inclination     139.3
		AscendingNode   83.8
		Epoch           2452734.2
		ArgOfPericenter 204.2
		MeanAnomaly     0
    //SemiAmplitude   19.6
	}
}

Star "HIP 26727 B"
{
	ParentBody "HIP 26727"
	Class      "B0III"
	MassSol    16.66
  AbsMagn    -4.1
  Age        0.007

	/* Orbit
	{
    Period          1508.6
		Eccentricity    0.07
		Inclination     72
		AscendingNode   155.5
		Epoch           2477330.63263204
		ArgOfPericenter 47.3
		MeanAnomaly     0
	} */
}

// 参宿二
Star "禄/Alnilam A" // 不冲突
{
	ParentBody "HIP 26311"
	Class      "B0Ia"
	MassSol    40 // 44
	RadSol     32.4
	Luminosity 537000
	Teff       27500
	Age        0.0057

	Orbit
	{
		RefPlane "Static"
	}
}

// 参宿三(SB*****)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=25930
Remove "Mintaka A"{ParentBody "Mintaka"}
Remove "Mintaka C"{ParentBody "Mintaka"}
Remove "Mintaka Aa"{ParentBody "Mintaka A"}
Remove "Mintaka Ab"{ParentBody "Mintaka A"}
Remove "Mintaka Aa1"{ParentBody "Mintaka Aa"}
Remove "Mintaka Aa2"{ParentBody "Mintaka Aa"}
Remove "Mintaka Ca"{ParentBody "Mintaka C"}
Remove "Mintaka Cb"{ParentBody "Mintaka C"}
Barycenter "DEL Ori Aab"
{
	ParentBody "CCDM J05320-0018"
	BinaryOrbit // STF_14 AC
	{
		Separation      19261.1
		Period          425065
	}
}

Barycenter "HD 36485/DEL Ori C/HR 1851/SAO 132221/BD-00 982/GC 6848/PLX 1261/CCDM J05320-0018C"
{
	ParentBody "CCDM J05320-0018"
	/* BinaryOrbit // STF_14 AC
	{
		Separation      19261.1
		Period          425065
	} */
}

Barycenter "DEL Ori Aa/HD 36486/HR 1851/BD-00 983/GC 6847"
{
	ParentBody "DEL Ori Aab"
	Orbit // VB6_Tok2014a HEI_42Aa/Gr.4
	{
		Period          346
    Eccentricity    0.812
    AscendingNode   148.4
    ArgOfPericenter 260
    Inclination     107
		MeanAnomaly     0
	}
}

Star "DEL Ori Ab/CCDM J05320-0018D/WDS J05320-0018Ab"
{
	ParentBody "DEL Ori Aab"
	Class      "B0IV"
	MassSol    22.5
  RadSol     10.4
  Luminosity 63000
  Teff       28400

	Orbit
	{
    Period          346
    Eccentricity    0.812
    AscendingNode   148.4
    ArgOfPericenter 80
    Inclination     107
		MeanAnomaly     0
	}
}

Star "福/DEL Ori Aa1/SAO 132220"
{
	ParentBody "DEL Ori Aa"
	Class      "O9.5II"
	MassSol    24
  RadSol     16.5
  Luminosity 190000
  Teff       29500

	Orbit // SB9_331 1987Obs...107..205H
	{
		PeriodDays      5.732436
		Eccentricity    0.1133
		Inclination     76.5
		Epoch           2456295.674
		ArgOfPericenter 321.3
		MeanAnomaly     0
	}
}

Star "DEL Ori Aa2/SAO 132221"
{
	ParentBody "DEL Ori Aa"
	Class      "B1V"
	MassSol    8.4
  RadSol     6.5
  Luminosity 16000
  Teff       25600

	Orbit
	{
    PeriodDays      5.732436
		Eccentricity    0.1133
		Inclination     76.5
		Epoch           2456295.674
		ArgOfPericenter 141.3
		MeanAnomaly     0
	}
}

// Zasche et al. (2009) compute prelim. orbit of AB, P=704.8y, a=0.970".
Star "DEL Ori B"
{
	ParentBody "DEL Ori Aab"
	Class      ""
  RadSol     0.77
  Luminosity 0.431
  Teff       5324

	Orbit
	{
    Period          704.8
	}
}

Star "HD 36485 Ca"
{
	ParentBody "HD 36485"
	Class      "B3V"
	MassSol    9
  RadSol     5.7
  Luminosity 3300
  Teff       18400

	Orbit // 2010MNRAS.401.2739L
	{
		PeriodDays      29.96
    Eccentricity    0.32
    AscendingNode   0
		ArgOfPericenter 175
    Inclination     0
		MeanAnomaly     0
	}
}

Star "HD 36485 Cb"
{
	ParentBody "HD 36485"
	Class      ""
	MassSol    3

	Orbit
	{
    PeriodDays      29.96
    Eccentricity    0.32
    AscendingNode   0
		ArgOfPericenter 355
    Inclination     0
		MeanAnomaly     0
	}
}

// 参宿四
Star "Betelgeuse A"
{
	ParentBody "HIP 27989"
	Class      "M1Ia" // M1-M2Ia-ab
	MassSol    14 // 19
	RadSol     764 // 640 - 1021
	Luminosity 87100 // 126000 // 90000 - 150000
	Teff       3600
	FeH        0.05
	RotationPeriod 315569.2518747072 // 36 years
	Age        0.008 // 0.0085

	Orbit
	{
		RefPlane "Static"
	}
}

// 参宿七(BSG****)
Remove "Rigel A"{ParentBody "Rigel"}
Remove "Rigel B"{ParentBody "Rigel"}
Remove "Rigel Ba"{ParentBody "Rigel B"}
Remove "Rigel Bb"{ParentBody "Rigel B"}
Star "HIP 24436 A" // 不冲突
{
	ParentBody "CCDM J05145-0812"
	Class      "B8Ia"
	MassSol    21
  RadSol     78.9
	Luminosity 61500 // 363000
  LumBol     1.2e+5
  Teff       12100
  FeH        -0.06
  Age        0.008

	/* BinaryOrbit
	{
		Period          24000
	} */
}

Barycenter "HIP 24436 BC"
{
	ParentBody "CCDM J05145-0812"
	BinaryOrbit
	{
		Period          24000
	}
}

Barycenter "HIP 24436 Bab"
{
	ParentBody "HIP 24436 BC"
	Orbit
	{
    Period          63
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 24436 Ba"
{
	ParentBody "HIP 24436 Bab"
	Class      "B9V"
	MassSol    3.84

	Orbit
	{
		PeriodDays      9.86
		Eccentricity    0.1
		ArgOfPericenter 0
		MeanAnomaly     0
    //SemiAmplitude   25
	}
}

Star "HIP 24436 Bb"
{
	ParentBody "HIP 24436 Bab"
	Class      ""
	MassSol    2.94

	Orbit
	{
    PeriodDays      9.86
		Eccentricity    0.1
		ArgOfPericenter 180
		MeanAnomaly     0
    //SemiAmplitude   32.6
	}
}

Star "HIP 24436 C"
{
	ParentBody "HIP 24436 BC"
	Class      "B9V"
	MassSol    3.84

	Orbit
	{
    Period          63
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 伐一(YSO***)
Barycenter "HIP 26237 A"
{
	ParentBody "HIP 26237"
	BinaryOrbit
	{
		Separation      385.542
	}
}

Star "HIP 26237 Aa"
{
	ParentBody "HIP 26237 A"
	Class      "B1V"
	MassSol    12
  Teff       25400

	BinaryOrbit
	{
		Separation      38.5551
	}
}

Star "HIP 26237 Ab"
{
	ParentBody "HIP 26237 A"
	Class      ""
	MassSol    4.55

	/* BinaryOrbit
	{
		Separation      38.5551
	} */
}

Star "HIP 26237 B"
{
	ParentBody "HIP 26237"
	Class      ""
  MassSol    3.04

	/* BinaryOrbit
	{
		Separation      385.542
	} */
}

// 伐三(SB****)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=26241
Remove "Hatsya A"{ParentBody "Hatsya"}
Remove "Hatsya B"{ParentBody "Hatsya"}
Remove "Hatsya Aa"{ParentBody "Hatsya A"}
Remove "Hatsya Ab"{ParentBody "Hatsya A"}
Barycenter "IOT Ori A/44 Ori/HD 37043/HIP 26241/HR 1899/2MASS J05352597-0554357"
{
	ParentBody "ADS 4193"
	Orbit
	{
		RefPlane        "Static"
		/* Period          55452
		//Separation      5000
		ArgOfPericenter 0
		MeanAnomaly     0 */
	}
}

Barycenter "IOT Ori Aa"
{
	ParentBody "IOT Ori A"
	BinaryOrbit
	{
		Period          80.105
		Separation      57.6835
	}
}

Star "IOT Ori Aa1"
{
	ParentBody "IOT Ori Aa"
	Class      "O9III"
	MassSol    23.1
	RadSol     8.3
	Luminosity 68000
	Teff       32500
	FeH        0.1
	Age        0.005

	Orbit
	{
		PeriodDays      29.1338
		Eccentricity    0.764
		Inclination     60
		Epoch           2450072.8
		ArgOfPericenter 310
		MeanAnomaly     0
	}
}

Star "IOT Ori Aa2"
{
	ParentBody "IOT Ori Aa"
	Class      "B0.8III"
	MassSol    13.1
	RadSol     5.4
	Luminosity 8630
	Teff       27000
	Age        0.0094

	Orbit
	{
		PeriodDays      29.1338
		Eccentricity    0.764
		Inclination     60
		Epoch           2450072.8
		ArgOfPericenter 130
		MeanAnomaly     0
	}
}

Star "IOT Ori Ab"
{
	ParentBody "IOT Ori A"
	Class      "B2IV"
	MassSol    7.77

	/* BinaryOrbit
	{
		Period          80.105
		Separation      57.6835
	} */
}

Star "IOT Ori B/V2451 Ori/2MASS J05352645-0554445"
{
	ParentBody "ADS 4193"
	Class      "B8III"
	MassSol    5.12
	RadSol     4 // guess
	Teff       18000
	Age        0.003 // system components has a different age

	Orbit
	{
		//Period          55452
		SemiMajorAxis   5000
		ArgOfPericenter 135
		MeanAnomaly     0
	}
}

Star "Brun 731/IOT Ori C/2MASS J05352920-0554471"
{
	ParentBody "ADS 4193"
	Class      "A0"

	Orbit
	{
		SemiMajorAxis   20188
		ArgOfPericenter 108
		MeanAnomaly     0
	}
}

// 军井一(***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=24244
Remove "IOT Lep A"{ParentBody "IOT Lep"}
Remove "IOT Lep B"{ParentBody "IOT Lep"}
Remove "IOT Lep Aa"{ParentBody "IOT Lep A"}
Remove "IOT Lep Ab"{ParentBody "IOT Lep A"}
Barycenter "HIP 24244 A"
{
  ParentBody "HIP 24244"
  BinaryOrbit
  {
    Period          10559
    Separation      858.888
  }
}

Star "HIP 24244 A1"
{
  ParentBody "HIP 24244 A"
  Class      "B7.5Vn"
  MassSol    3.37
	Luminosity 153
	Teff       13781
	Age        94

  Orbit
  {
    Period          63.928
	  ArgOfPericenter 0
    MeanAnomaly     0
  }
}

Star "HIP 24244 A2"
{
  ParentBody "HIP 24244 A"
  Class      "K7.2XR"
	MassSol    1.05

  Orbit
  {
    Period          63.928
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}

Star "HIP 24244 B"
{
  ParentBody "HIP 24244"
  Class      "G8Ve"
	MassSol    0.88

	/* BinaryOrbit
  {
    Period          10559
    Separation      858.888
  } */
}

// 军井二(**)
Star	"HIP 24327 A"
{
	ParentBody     "HIP 24327"
	Class	         "B9V"
	MassSol        4.86
	RadSol         2.6
	Luminosity     1346
	Teff           11588
	FeH            -0.07

	BinaryOrbit
	{
		Epoch           2451545
		Separation      479.38
		PositionAngle   357.3
	}
}

Star	"HIP 24327 B"
{
	ParentBody     "HIP 24327"
	Class	         "A5.8 V"

	/* BinaryOrbit
	{
		Epoch           2451545
		Separation      479.38
		PositionAngle   357.3
	} */
}

// 军井四(**)
Star	"HIP 24873 A"
{
	ParentBody     "HIP 24873"
	Class	         "B7V"
	MassSol        3.28
	RadSol         3
	Luminosity     138
	Teff           12417

	Orbit
	{
		RefPlane        "Equator"
		Period          7020.99
		Eccentricity    0.666068
		Inclination     -8.88373
		AscendingNode   -153.931
		ArgOfPericenter -88.1976
		MeanAnomaly     -165.731
	}
}

Star	"HIP 24873 B"
{
	ParentBody     "HIP 24873"
	Class	         "B8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          7020.99
		Eccentricity    0.666068
		Inclination     -8.88373
		AscendingNode   -153.931
		ArgOfPericenter 91.8024
		MeanAnomaly     -165.731
	}
}

// 厕二(光学伴星？)
Remove "BET Lep A"{ParentBody "BET Lep"}
Remove "BET Lep B"{ParentBody "BET Lep"}
/*Star	"HIP 25606 A"
{
	ParentBody     "HIP 25606"
	Class	         "G5II"
	MassSol        3.5
	RadSol         16
	Luminosity     171
	Teff           5450
	FeH            0.05
	Age            0.24

	BinaryOrbit
	{
		Separation      126.936
	}
}

Star	"HIP 25606 B"
{
	ParentBody     "HIP 25606"
	Class	         "A3 V"

	BinaryOrbit
	{
		Separation      126.936
	}
}*/

// 厕三(PM**)
Remove "GAM Lep A"{ParentBody "GAM Lep/HD 38393/HR 1983"}
Remove "GAM Lep B"{ParentBody "GAM Lep"}
Star "GAM Lep A/BD-22 1211 A/GJ 216 A/HD 38393 A/HR 1983 A/SAO 170759 A"
{
  ParentBody "HIP 27072"
  Class      "F6V"
  MassSol    1.23
	RadSol     1.33
	LumBol     2.291
	Teff       6299
	FeH        -0.12
	RotationPeriod 141.84
	Age        1.3

	BinaryOrbit
  {
		Separation      848.35
  }
}

Star "GAM Lep B/BD-22 1210 B/GJ 216 B/HD 38392 B/HR 1982 B/LTT 2363/SAO 170757 B"
{
  ParentBody "HIP 27072"
  Class      "K2 V"
  MassSol    0.78
	Teff       4869
	FeH        0.01
	Age        0.9

  /* BinaryOrbit
  {
		Separation      848.35
  } */
}
