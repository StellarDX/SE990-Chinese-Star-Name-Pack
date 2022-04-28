// 参宿一
Remove "Alnitak A"{ParentBody "Alnitak"}
Remove "Alnitak B"{ParentBody "Alnitak"}
Remove "Alnitak Aa"{ParentBody "Alnitak A"}
Remove "Alnitak AB"{ParentBody "Alnitak A"}
Barycenter "HIP 26727 A"
{
	ParentBody "HIP 26727"
	Orbit
	{
		Period          1508.6
		Eccentricity    0.07
		Inclination     72
		AscendingNode   155.5
		Epoch           2402070.6
		ArgOfPericenter 227.3
		MeanAnomaly     0
	}
}

Star "福/HIP 26727 A1" // 不冲突
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
	Class      "B1 IV"
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
	Class      "B0 III"
  MassSol    16
  Radius     5011200
  Age        0.007

	Orbit
	{
    Period          1508.6
		Eccentricity    0.07
		Inclination     72
		AscendingNode   155.5
		Epoch           2402070.6
		ArgOfPericenter 47.3
		MeanAnomaly     0
	}
}

// 参宿二
Star "禄/HIP 26311 A" // 不冲突
{
	ParentBody "HIP 26311"
	Class      "B0Ia"
	MassSol    40
	RadSol     32.4
	Luminosity 537000
	Teff       27500
	Age        0.0057

	Orbit
	{
		RefPlane "Static"
	}
}

// 参宿三
Remove "Mintaka A"{ParentBody "Mintaka"}
Remove "Mintaka C"{ParentBody "Mintaka"}
Remove "Mintaka Aa"{ParentBody "Mintaka A"}
Remove "Mintaka Ab"{ParentBody "Mintaka A"}
Remove "Mintaka Aa1"{ParentBody "Mintaka Aa"}
Remove "Mintaka Aa2"{ParentBody "Mintaka Aa"}
Remove "Mintaka Ca"{ParentBody "Mintaka C"}
Remove "Mintaka Cb"{ParentBody "Mintaka C"}
Barycenter "HIP 25930 Aab"
{
	ParentBody "HIP 25930"
	Orbit
	{
		Period          425065
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 25930 Aa"
{
	ParentBody "HIP 25930 Aab"
	Orbit
	{
		Period          346
    Eccentricity    0.812
    AscendingNode   148.4
    ArgOfPericenter 260
    Inclination     107
		MeanAnomaly     0
	}
}

Star "寿/HIP 25930 Aa1"
{
	ParentBody "HIP 25930 Aa"
	Class      "O9.5 II"
	MassSol    24
  RadSol     16.5
  Luminosity 190000
  Teff       29500

	Orbit
	{
		PeriodDays      5.732436
		Eccentricity    0.1133
		Inclination     76.5
		Epoch           2456295.674
		ArgOfPericenter 321.3
		MeanAnomaly     0
	}
}

Star "HIP 25930 Aa2"
{
	ParentBody "HIP 25930 Aa"
	Class      "B1 V"
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

Star "HIP 25930 Ab"
{
	ParentBody "HIP 25930 Aab"
	Class      "B0 IV"
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

/*Star "HIP 25930 B"
{
	ParentBody "HIP 25930 Aab"
	Class      ""
  RadSol     0.77
  Luminosity 0.431
  Teff       5324

	Orbit
	{
    Period          704.8
	}
}*/

Barycenter "HIP 25930 C/HD 36485 C"
{
	ParentBody "HIP 25930"
	Orbit
	{
    Period          425065
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 25930 Ca"
{
	ParentBody "HIP 25930 C"
	Class      "B3 V"
	MassSol    9
  RadSol     5.7
  Luminosity 3300
  Teff       18400

	Orbit
	{
		PeriodDays      29.96
    Eccentricity    0.32
    AscendingNode   0
		ArgOfPericenter 175
    Inclination     0
		MeanAnomaly     0
	}
}

Star "HIP 25930 Cb"
{
	ParentBody "HIP 25930 C"
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

// 参宿七
Remove "Rigel A"{ParentBody "Rigel"}
Remove "Rigel B"{ParentBody "Rigel"}
Remove "Rigel Ba"{ParentBody "Rigel B"}
Remove "Rigel Bb"{ParentBody "Rigel B"}
Star "HIP 24436 A1" // 不冲突
{
	ParentBody "Rigel"
	Class      "B8 Ia"
	MassSol    21
  RadSol     78.9
  LumBol     1.2e+5
  Teff       12100
  FeH        -0.06
  Age        0.008

	Orbit
	{
		Period          24000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 24436 BC"
{
	ParentBody "Rigel"
	Orbit
	{
    Period          24000
		ArgOfPericenter 0
		MeanAnomaly     0
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
	Class      "B9 V"
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
	Class      "B9 V"
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
	Class      ""
	MassSol    3.84

	Orbit
	{
    Period          63
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 伐一
Barycenter "HIP 26237 A"
{
	ParentBody "HIP 26237"
	Orbit
	{
		Period          1454
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 26237 Aa"
{
	ParentBody "HIP 26237 A"
	Class      "B1V"
	MassSol    12
  Teff       25400

	Orbit
	{
		Period          80.7
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 26237 Ab"
{
	ParentBody "HIP 26237 A"
	Class      ""
	MassSol    4.55

	Orbit
	{
		Period          80.7
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 26237 B"
{
	ParentBody "HIP 26237"
	Class      ""
  MassSol    3.04

	Orbit
	{
		Period          1454
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 伐二
Barycenter "HIP 26235 A"
{
	ParentBody "HIP 26235"
	Orbit
	{
		Period          355.62
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 26235 Aa"
{
	ParentBody "HIP 26235 A"
	Class      "O9.5IVp"
	MassSol    39
	Luminosity 107000
  Teff       34900

	Orbit
	{
		PeriodDays      20.9643
		Epoch           2443997.465
		Eccentricity    0.231
		AscendingNode   0
		ArgOfPericenter 356
		Inclination     0
		MeanAnomaly     0
	}
}

Star "HIP 26235 Ab"
{
	ParentBody "HIP 26235 A"
	Class      "B0.7V"
	MassSol    12.6

	Orbit
	{
		PeriodDays      20.9643
		Epoch           2443997.465
		Eccentricity    0.231
		AscendingNode   0
		ArgOfPericenter 176
		Inclination     0
		MeanAnomaly     0
	}
}

Star "HIP 26235 Ac"
{
	ParentBody "HIP 26235"
	Class      "B5V"
  MassSol    3.26

	Orbit
	{
		Period          355.62
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 伐三(Aa,Ab未做任何修改)
Remove "Hatsya A"{ParentBody "Hatsya"}
Remove "Hatsya B"{ParentBody "Hatsya"}
Remove "Hatsya Aa"{ParentBody "Hatsya A"}
Remove "Hatsya Ab"{ParentBody "Hatsya A"}
Barycenter "HIP 26241 A/44 Ori/HR 1899/2MASS J05352597-0554357"
{
	ParentBody "HIP 26241"
	Orbit
	{
		Period          55452
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 26241 Aa"
{
	ParentBody "HIP 26241 A"
	Class      "O9 III"
	MassSol    23.1
	RadSol     8.3
	Luminosity 68000
	Teff       32500
	Age        0.005 // system components has a different age
	FeH        0.1

	Orbit
	{
		Epoch           2450072.8
		PeriodDays      29.1338
		Eccentricity    0.764
		Inclination     60
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 26241 Ab"
{
	ParentBody "HIP 26241 A"
	Class      "B0.8 III"
	MassSol    13.1
	RadSol     5.4
	Luminosity 8630
	Teff       27000
	Age        0.0094 // system components has a different age

	Orbit
	{
		Epoch           2450072.8
		PeriodDays      29.1338
		Eccentricity    0.764
		Inclination     60
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 26241 B/V2451 Ori/2MASS J05352645-0554445"
{
	ParentBody "HIP 26241"
	Class      "B8 III"
	MassSol    5.12
	RadSol     4 // guess
	Teff       18000
	Age        0.003 // system components has a different age

	Orbit
	{
		Period          55452
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 26241 C/2MASS J05352920-0554471"
{
	ParentBody "HIP 26241"
	Class      "A0"

	Orbit
	{
		SemiMajorAxis   22272 // ?
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 军井一
Remove "IOT Lep A"{ParentBody "IOT Lep"}
Remove "IOT Lep B"{ParentBody "IOT Lep"}
Remove "IOT Lep Aa"{ParentBody "IOT Lep A"}
Remove "IOT Lep Ab"{ParentBody "IOT Lep A"}
Barycenter "HIP 24244 A"
{
  ParentBody "HIP 24244"
  Orbit
  {
    Period          10559
    ArgOfPericenter 0
    MeanAnomaly     0
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

	Orbit
  {
    Period          10559
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}

// 军井二(*)
Star	"HIP 24327 A"
{
	ParentBody     "HIP 24327"
	Class	         "B9V"
	MassSol        4.86
	RadSol         2.6
	Luminosity     1346
	Teff           11588
	FeH            -0.07

	Orbit
	{
		RefPlane        "Equator"
		Period          0.133839
		Eccentricity    0.22715
		Inclination     30.2344
		AscendingNode   -169.623
		ArgOfPericenter -3.00123
		MeanAnomaly     121.865
	}
}

Star	"HIP 24327 B"
{
	ParentBody     "HIP 24327"
	Class	         "A5.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.133839
		Eccentricity    0.22715
		Inclination     30.2344
		AscendingNode   -169.623
		ArgOfPericenter 176.999
		MeanAnomaly     121.865
	}
}

// 军井四(*)
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
	Class	         "B8V"

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
	Class	         "G5 II"
	MassSol        3.5
	RadSol         16
	Luminosity     171
	Teff           5450
	FeH            0.05
	Age            0.24

	Orbit
	{
		RefPlane        "Equator"
		Period          0.057958
		Eccentricity    0
		Inclination     -18.5828
		AscendingNode   -6.00329
		ArgOfPericenter 142.307
		MeanAnomaly     -70.2245
	}
}

Star	"HIP 25606 B"
{
	ParentBody     "HIP 25606"
	Class	         "A3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.057958
		Eccentricity    0
		Inclination     -18.5828
		AscendingNode   -6.00329
		ArgOfPericenter 322.307
		MeanAnomaly     -70.2245
	}
}*/

// 厕三
Remove "GAM Lep A"{ParentBody "GAM Lep/HD 38393/HR 1983"}
Remove "GAM Lep B"{ParentBody "GAM Lep"}
Star "HIP 27072 A/BD−22° 1211 A/GJ 216 A/HD 38393 A/HR 1983 A/SAO 170759 A"
{
  ParentBody "HIP 27072"
  Class      "F6 V"
  MassSol    1.23
	RadSol     1.33
	LumBol     2.291
	Teff       6299
	FeH        -0.12
	RotationDays 5.91
	Age        1.3

  Orbit
  {
    Period          18006
    ArgOfPericenter 0
    MeanAnomaly     0
  }
}

Star "HIP 27072 B/BD−22 1210 B/GJ 216 B/HD 38392 B/HR 1982 B/LTT 2363/SAO 170757 B"
{
  ParentBody "HIP 27072"
  Class      "K2 V"
  MassSol    0.78
	Teff       4869
	FeH        0.01
	Age        0.9

  Orbit
  {
    Period          18006
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}
