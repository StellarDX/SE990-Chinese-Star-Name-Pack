// 奎宿一
Remove "ETA And A"{ParentBody "ETA And"}
Remove "ETA And B"{ParentBody "ETA And"}
Star "HIP 4463 A"
{
	ParentBody "HIP 4463"
	Class      "G8 III"
	MassSol    2.6
  LumBol     65
  Teff       4900
  Age        0.8

	Orbit
	{
		PeriodDays      115.72
		//SemiMajorAxis   0.3579
		Eccentricity    0.006
		Inclination     30.5
		AscendingNode   69.4
    Epoch           2448013
		ArgOfPericenter 35
		MeanAnomaly     0
	}
}

Star "HIP 4463 B"
{
	ParentBody "HIP 4463"
	Class      "G8 III"
	MassSol    2.3
  LumBol     39
  Teff       4900

  Orbit
	{
		PeriodDays      115.72
		//SemiMajorAxis   0.3579
		Eccentricity    0.006
		Inclination     30.5
		AscendingNode   69.4
    Epoch           2448013
		ArgOfPericenter 215
		MeanAnomaly     0
	}
}

// 奎宿二
Remove "ZET And A"{ParentBody "ZET And"}
Remove "ZET And B"{ParentBody "ZET And"}
Star "HIP 3693 Aa"
{
	ParentBody "HIP 3693"
	Class      "K1 III"
	MassSol    2.6
  RadSol     15.9
  Luminosity 95.5
  Teff       4665
  FeH        -0.3
  RotationDays 17.77

	Orbit
	{
		PeriodDays      17.769426
		//SemiMajorAxis   0.0554
    Eccentricity    0
    Inclination     65
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 3693 Ab"
{
	ParentBody "HIP 3693"
	Class      "K"
  MassSol    0.75

  Orbit
	{
		PeriodDays      17.769426
		//SemiMajorAxis   0.0554
    Eccentricity    0
    Inclination     65
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 奎宿三
Star	"HIP 3885 A"
{
	ParentBody     "HIP 3885"
	Class	       "F0"
  AbsMagn        1.12

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.187177
		Period          0.182946
		Eccentricity    0.136857
		Inclination     34.3869
		AscendingNode   103.758
		ArgOfPericenter -126.001
		MeanAnomaly     149.463
	}
}

Star	"HIP 3885 B"
{
	ParentBody     "HIP 3885"
	Class	       "F0.7 IV"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.281464
		Period          0.182946
		Eccentricity    0.136857
		Inclination     34.3869
		AscendingNode   103.758
		ArgOfPericenter 53.9993
		MeanAnomaly     149.463
	}
}

// 奎宿五
Remove "DEL And A"{ParentBody "DEL And"}
Remove "DEL And B"{ParentBody "DEL And"}
Remove "DEL And Aa"{ParentBody "DEL And A"}
Remove "DEL And Ab"{ParentBody "DEL And A"}
Star "HIP 3092 A"
{
	ParentBody "HIP 3092"
	Class      "K3III"
	MassSol    1.8
	RadSol     13.6
	Luminosity 68
	Teff       4315
	FeH        0.04
	Age        3.2

	Orbit
	{
		PeriodDays      15000
		Eccentricity    0.34
		/*Inclination     137
		AscendingNode   290*/
		Epoch           2415568
		ArgOfPericenter 176.1
		MeanAnomaly     0
		//SemiAmplitude   4
	}
}

Star "HIP 3092 B"
{
	ParentBody "HIP 3092"
	Class      "K"

	Orbit
	{
		PeriodDays      15000
		Eccentricity    0.34
		/*Inclination     137
		AscendingNode   290*/
		Epoch           2415568
		ArgOfPericenter 356.1
		MeanAnomaly     0
		//SemiAmplitude   4
	}
}

Star "HIP 3092 C"
{
	ParentBody "HIP 3092"
	Class      "M3"

	Orbit
	{
		SemiMajorAxis   900
	}
}

// 奎宿六
Remove "PI And (AC)"{ParentBody "PI And"}
Remove "PI And B"{ParentBody "PI And"}
Remove "PI And A"{ParentBody "PI And (AC)"}
Remove "PI And C"{ParentBody "PI And (AC)"}
Remove "PI And Aa"{ParentBody "PI And A"}
Remove "PI And Ab"{ParentBody "PI And A"}
Barycenter "HIP 2912 AB"
{
	ParentBody "HIP 2912"
	Orbit
	{
		Period          175000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 2912 A"
{
	ParentBody "HIP 2912 AB"
	Class      "B5V"
	Luminosity 1136
	Teff       15276
	FeH        -0.2

	Orbit
	{
		PeriodDays      143
		Eccentricity    0.56
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 2912 B"
{
	ParentBody "HIP 2912 AB"
	Class      "B5V"

	Orbit
	{
		PeriodDays      143
		Eccentricity    0.56
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "BD+32 102/HIP 2912 C"
{
	ParentBody "HIP 2912"
	Class      "A6V"
	Orbit
	{
		Period          175000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 奎宿七
Remove "NU And A"{ParentBody "NU And"}
Remove "NU And B"{ParentBody "NU And"}
Star "HIP 3881 A"
{
	ParentBody "HIP 3881"
	Class      "B4V"
	MassSol    5.9
	RadSol     3.4
	Luminosity 1104
	Teff       14851
	FeH        0.14
	Age        0.0631

	Orbit
	{
		PeriodDays      4.2827
		Eccentricity    0.03
		AscendingNode   25
		Epoch           2418155.67
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   71.7
	}
}

Star "HIP 3881 B"
{
	ParentBody "HIP 3881"
	Class      "F8 V"

	Orbit
	{
		PeriodDays      4.2827
		Eccentricity    0.03
		AscendingNode   25
		Epoch           2418155.67
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   101.9
	}
}

// 奎宿八(*)
Star "HIP 4436 A"
{
	ParentBody "HIP 4436"
	Class      "A5V"
	MassSol    2
	RadSol     2.4
	Luminosity 21
	Teff       7959
	FeH        0.03
	Age        0.6

	Orbit
	{
		PeriodDays      550.7
		Eccentricity    0.8405
		Inclination     52.5
		AscendingNode   -17.6
		Epoch           2455765.45
		ArgOfPericenter 348.9
		MeanAnomaly     0
		//SemiAmplitude   11.1
	}
}

Star "HIP 4436 B"
{
	ParentBody "HIP 4436"
	Class      "F0.5 V" // ?

	Orbit
	{
		PeriodDays      550.7
		Eccentricity    0.8405
		Inclination     52.5
		AscendingNode   -17.6
		Epoch           2455765.45
		ArgOfPericenter 168.9
		MeanAnomaly     0
	}
}

// 奎宿九
Remove "Mirach A"{ParentBody "Mirach"}
Remove "Mirach B"{ParentBody "Mirach"}

// 奎宿十四
Star "HIP 5742 A"
{
	ParentBody "HIP 5742"
	Class      "K0III"
	FeH        -0.08

	Orbit
	{
		Period          7473
		Eccentricity    0.815
		ArgOfPericenter 251.9
		MeanAnomaly     0
	}
}

Barycenter "HIP 5742 B"
{
	ParentBody "HIP 5742"
	Orbit
	{
		Period          7473
		Eccentricity    0.815
		ArgOfPericenter 71.9
		MeanAnomaly     0
	}
}

Star "HIP 5742 Ba"
{
	ParentBody "HIP 5742 B"
	Class      "K0"

	Orbit
	{
		Period          0.01 //(guess)
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 5742 Bb"
{
	ParentBody "HIP 5742 B"
	Class      "M2V"

	Orbit
	{
		Period          0.01 //(guess)
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 奎宿十六
Barycenter "奎宿十六/PSI1 Psc A/BD+20° 156/HD 6456/HIP 5131/HR 310/SAO 74482"
{
	ParentBody "74 Psc"
	Orbit
	{
		Period          44169
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 5131 A"
{
	ParentBody "HIP 5131"
	Class      "A1V"
	MassSol    2.21

	Orbit
	{
		Period          14.44
		Eccentricity    0.519
		Inclination     77.43
		AscendingNode   134.8
		//EpochB          2007.512
		ArgOfPericenter 125.4
		MeanAnomaly     0
	}
}

Star "HIP 5131 B"
{
	ParentBody "HIP 5131"
	Class      "A4V"
	MassSol    1.73

	Orbit
	{
		Period          14.44
		Eccentricity    0.519
		Inclination     77.43
		AscendingNode   134.8
		//EpochB          2007.512
		ArgOfPericenter 305.4
		MeanAnomaly     0
	}
}

Star "PSI1 Psc B/BD+20° 157/HD 6457/HIP 5132/HR 311/SAO 74483"
{
	ParentBody "74 Psc"
	Class      "A0Vn"
	MassSol    2.37

	Orbit
	{
		Period          44169
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 外屏三
Remove "ZET Psc A"{ParentBody "ZET Psc"}
Remove "ZET Psc BC"{ParentBody "ZET Psc"}
Remove "ZET Psc Aa"{ParentBody "ZET Psc A"}
Remove "ZET Psc Ab"{ParentBody "ZET Psc A"}
Remove "ZET Psc B"{ParentBody "ZET Psc BC"}
Remove "ZET Psc C"{ParentBody "ZET Psc BC"}
Remove "ZET Psc Ba"{ParentBody "ZET Psc B"}
Remove "ZET Psc Bb"{ParentBody "ZET Psc B"}
Barycenter "外屏三/ZET Psc 1/BD+06° 174 A/FK5 1033 A/HD 7344 1/HIP 5737 1/HR 361 A/SAO 109739 A/WDS J01137+0735A"
{
	ParentBody "86 Psc"
	MassSol    4.14
	Orbit
	{
		Period          11556
		ArgOfPericenter 0	// unknown
		MeanAnomaly     175	// unknown
	}
}

Star "HIP 5737 Aa"
{
	ParentBody "HIP 5737 1"
	Class      "A7IV"
	MassSol    1.37
	Luminosity 27.4
	Teff       7345

	Orbit
	{
		Period          8.836
		ArgOfPericenter 0	// unknown
		MeanAnomaly     0	// unknown
	}
}

Star "HIP 5737 Ab"
{
	ParentBody "HIP 5737 1"
	Class      "A7IV"
	MassSol    1.37

	Orbit
	{
		Period          8.836
		ArgOfPericenter 180	// unknown
		MeanAnomaly     0	// unknown
	}
}

Barycenter	"ZET Psc 2/BD+06° 175 B/HD 7345 2/HIP 5743 2/HR 362 B/SAO 109740 B/WDS J01137+0735BC"
{
	ParentBody "86 Psc"
	Orbit
	{
		Period          11556
		ArgOfPericenter 180	// unknown
		MeanAnomaly     175	// unknown
	}
}

Star "HIP 5743 C"
{
	ParentBody "HIP 5743 2"
	Class      ""
	MassSol    0.6

	Orbit
	{
		Period          357.897
		ArgOfPericenter 80	// unknown
		MeanAnomaly     0	// unknown
	}
}

Barycenter	"HIP 5743 Bab"
{
	ParentBody "HIP 5743 2"
	Orbit
	{
		Period          357.897
		ArgOfPericenter 260	// unknown
		MeanAnomaly     0	// unknown
	}
}

Star "HIP 5743 Ba"
{
	ParentBody "HIP 5743 Bab"
	Class      "F7V"
	MassSol    1.30

	Orbit
	{
		PeriodDays      9.075
		Eccentricity    0.04
		ArgOfPericenter 180	// unknown
		MeanAnomaly     0	// unknown
	}
}

Star "HIP 5743 Bb"
{
	ParentBody "HIP 5743 Bab"
	Class      "G7V"
	MassSol    0.98
	Orbit
	{
		PeriodDays      9.075
		Eccentricity    0.04
		ArgOfPericenter 0	// unknown
		MeanAnomaly     0	// unknown
	}
}

// 外屏五(*)
Star	"HIP 7884 A"
{
	ParentBody     "HIP 7884"
	Class	         "K3 IIIb"
	MassSol        1.66
	RadSol         34
	Luminosity     380
	Teff           4154
	FeH            -0.16
	Age            3.41

	Orbit
	{
		RefPlane        "Equator"
		Period          52.6877
		Eccentricity    0.0309826
		Inclination     133.066
		AscendingNode   79.1337
		ArgOfPericenter 163.047
		MeanAnomaly     81.8273
	}
}

Star	"HIP 7884 B"
{
	ParentBody     "HIP 7884"
	Class	       "A7.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          52.6877
		Eccentricity    0.0309826
		Inclination     133.066
		AscendingNode   79.1337
		ArgOfPericenter 343.047
		MeanAnomaly     81.8273
	}
}

// 外屏六(*)
Star	"HIP 8833 A"
{
	ParentBody     "HIP 8833"
	Class	         "K0 III"
	MassSol        2
	RadSol         9
	Luminosity     45.7
	Teff           4947
	FeH            -0.11
	Age            1.22

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1672.4
		Eccentricity    0.18
		Epoch           2437651
		ArgOfPericenter 251
		MeanAnomaly     0
	}
}

Star	"HIP 8833 B"
{
	ParentBody     "HIP 8833"
	Class	       "A8.2 V"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1672.4
		Eccentricity    0.18
		Epoch           2437651
		ArgOfPericenter 71
		MeanAnomaly     0
	}
}

// 外屏七
Remove "Alrischa A"{ParentBody "Alrischa"}
Remove "Alrischa B"{ParentBody "Alrischa"}
Star "HIP 9487 A"
{
	ParentBody "HIP 9487"
	Class      "kA0hA7 Sr"
	Luminosity 31
	Teff       9500
	MassSol    2.37

	Orbit
	{
		Period          3267.4
		Eccentricity    0.465
		Inclination     113.4
		AscendingNode   3.7
		//EpochB          2188.6
		ArgOfPericenter 327.9
		MeanAnomaly     0
	}
}

Star "HIP 9487 B"
{
	ParentBody "HIP 9487"
	Class      "kA2hF2mF2 (IV)"
	Luminosity 12
	Teff       8600
	MassSol    1.82

	Orbit
	{
		Period          3267.4
		Eccentricity    0.465
		Inclination     113.4
		AscendingNode   3.7
		//EpochB          2188.6
		ArgOfPericenter 147.9
		MeanAnomaly     0
	}
}

// 军南门
Remove "PHI And A"{ParentBody "PHI And"}
Remove "PHI And B"{ParentBody "PHI And"}
Star "HIP 5434 A"
{
	ParentBody "HIP 5434"
	Class      "B7Ve"
	Luminosity 882
	Teff       13490
	Age        0.0631

	Orbit
	{
		Period          554.3
		Eccentricity    0.385
		Inclination     142.2
		AscendingNode   337.2
		Epoch           2417740
		ArgOfPericenter 292.6
		MeanAnomaly     0
	}
}

Star "HIP 5434 B"
{
	ParentBody "HIP 5434"
	Class      "B9V"

	Orbit
	{
		Period          554.3
		Eccentricity    0.385
		Inclination     142.2
		AscendingNode   337.2
		Epoch           2417740
		ArgOfPericenter 112.6
		MeanAnomaly     0
	}
}

// 阁道一
Remove "IOT Cas (AB)"{ParentBody "IOT Cas"}
Remove "IOT Cas C"{ParentBody "IOT Cas"}
Remove "IOT Cas A"{ParentBody "IOT Cas (AB)"}
Remove "IOT Cas Aa"{ParentBody "IOT Cas A"}
Remove "IOT Cas Ab"{ParentBody "IOT Cas A"}
Remove "IOT Cas B"{ParentBody "IOT Cas (AB)"}
Remove "IOT Cas Ca"{ParentBody "IOT Cas C"}
Remove "IOT Cas Cb"{ParentBody "IOT Cas C"}
Barycenter "HIP 11569 A-B"
{
	ParentBody "HIP 11569"
	Orbit
	{
		Period          2250 // 2178
		//Eccentricity    8.1
		Inclination     87.6
		AscendingNode   109.8
		ArgOfPericenter 8.8
		//EpochB          2250
		MeanAnomaly     0
	}
}

Barycenter "HIP 11569 C/TYC 4058-1505-1"
{
	ParentBody "HIP 11569"
	Orbit
	{
		Period          2250 // 2178
		//Eccentricity    8.1
		Inclination     87.6
		AscendingNode   109.8
		ArgOfPericenter 188.8
		//EpochB          2250
		MeanAnomaly     0
	}
}

Barycenter "HIP 11569 A/TYC 4058-1504-1"
{
	ParentBody "HIP 11569 A-B"
	Orbit
	{
		Period          620
		Eccentricity    0.75
		Inclination     115
		AscendingNode   0.8
		//EpochB          1640
		ArgOfPericenter 103
		MeanAnomaly     0
	}
}

Star "HIP 11569 Aa"
{
	ParentBody "HIP 11569 A"
	Class      "A3Vp"
	MassSol    1.99
	RadSol     2.3
	Luminosity 24
	Teff       8360
	RotationDays 1.74033
	Age        0.1

	Orbit
	{
		Period          50.2
		Eccentricity    0.642
		Inclination     149
		AscendingNode   180
	  //EpochB          1993.24
		ArgOfPericenter 151.3
		MeanAnomaly     0
	}
}

Star "HIP 11569 Ab"
{
	ParentBody "HIP 11569 A"
	Class      "G6"
	MassSol    0.69

	Orbit
	{
		Period          50.2
		Eccentricity    0.642
		Inclination     149
		AscendingNode   180
	  //EpochB          1993.24
		ArgOfPericenter 331.3
		MeanAnomaly     0
	}
}

Star "HIP 11569 B/TYC 4058-1504-2"
{
	ParentBody "HIP 11569 A-B"
	Class      "F5"
	MassSol    1.4
	Teff       6540

	Orbit
	{
		Period          620
		Eccentricity    0.75
		Inclination     115
		AscendingNode   0.8
		//EpochB          1640
		ArgOfPericenter 283
		MeanAnomaly     0
	}
}

Star "HIP 11569 Ca"
{
	ParentBody "HIP 11569 C"
	Class      "K4"
	MassSol    0.96
	Teff       4520

	Orbit
	{
		Period          61.582
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 11569 Cb"
{
	ParentBody "HIP 11569 C"
	Class      "M2"
	MassSol    0.7
	Teff       3590

	Orbit
	{
		Period          61.582
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 阁道三(*)
Remove "Ksora A"{ParentBody "Ksora"}
Remove "Ksora B"{ParentBody "Ksora"}
Star "HIP 6686 A"
{
	ParentBody "HIP 6686"
	Class      "A5 IV"
	MassSol    2.49
	RadSol     3.9
	Luminosity 72.88
	Teff       7980
	Age        0.06

	Orbit
	{
		PeriodDays      759
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 6686 B"
{
	ParentBody "HIP 6686"
	Class      "F1.5 V"

	Orbit
	{
		PeriodDays      759
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 阁道六
Remove "OMI Cas A"{ParentBody "OMI Cas"}
Remove "OMI Cas B"{ParentBody "OMI Cas"}
Remove "OMI Cas Aa"{ParentBody "OMI Cas A"}
Remove "OMI Cas Ab"{ParentBody "OMI Cas A"}
Barycenter "HIP 3504 A"
{
	ParentBody "HIP 3504"
	Orbit
	{
		Period          237063.79
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 3504 Aa"
{
	ParentBody "HIP 3504 A"
	Class      "B2III" // B5Ve
	MassSol    6.2
	RadSol     8
	Teff       14000

	AbsMagn    -2.55 // Fix Luminosity

	Orbit
	{
		PeriodDays      1031.55
		Eccentricity    0
		Inclination     115
		AscendingNode   267.3
		Epoch           2452792.2
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   21.593
	}
}

Barycenter "HIP 3504 Abc"
{
	ParentBody "HIP 3504 A"
	Orbit
	{
		PeriodDays      1031.55
		Eccentricity    0
		Inclination     115
		AscendingNode   267.3
		Epoch           2452792.2
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 3504 Ab"
{
	ParentBody "HIP 3504 Abc"
	Class      "A"
	MassSol    3 // Unknown

	Orbit
	{
		PeriodDays      100 // Guess
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 3504 Ac"
{
	ParentBody "HIP 3504 Abc"
	Class      "A"
	MassSol    2 // Unknown

	Orbit
	{
		PeriodDays      100 // Guess
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 3504 B"
{
	ParentBody "HIP 3504"
	Class      "F"
	Orbit
	{
		Period          237063.79
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 王良三
Remove "ETA1 Cas"{ParentBody "Achird"}
Remove "ETA2 Cas"{ParentBody "Achird"}
Star "HIP 3821 A"
{
	ParentBody "HIP 3821"
	Class      "G0 V"
	MassSol    0.972
	RadSol     1.0386
	Luminosity 1.2321
	Teff       5973
	FeH        -0.31
	Age        5.4

	Orbit
	{
		Period          480
		Eccentricity    0.497
		Inclination     34.76
		AscendingNode   98.42
		//EpochB          1889.6
		ArgOfPericenter 268.59
		MeanAnomaly     0
	}
}

Star "HIP 3821 B"
{
	ParentBody "HIP 3821"
	Class      "K7 V"
	MassSol    0.57
	RadSol     0.66
	Luminosity 0.06
	Teff       4036

	Orbit
	{
		Period          480
		Eccentricity    0.497
		Inclination     34.76
		AscendingNode   98.42
		//EpochB          1889.6
		ArgOfPericenter 88.59
		MeanAnomaly     0
	}
}

// 王良五
Remove "LAM Cas A"{ParentBody "LAM Cas"}
Remove "LAM Cas B"{ParentBody "LAM Cas"}
Star "王良/HIP 2505 A"
{
	ParentBody "HIP 2505"
	Class      "B7.5V" // From SimBad
	MassSol    2.9
	RadSol     3.5
	Luminosity 255
	Teff       12000
	Age        0.058

	Orbit
	{
		Period          245.7
		Eccentricity    0.689
		Inclination     53.6
		AscendingNode   17.6
		//EpochB          2025.54
		ArgOfPericenter 121
		MeanAnomaly     0
	}
}

Star "HIP 2505 B"
{
	ParentBody "HIP 2505"
	Class      "B8.5V"

	Orbit
	{
		Period          245.7
		Eccentricity    0.689
		Inclination     53.6
		AscendingNode   17.6
		//EpochB          2025.54
		ArgOfPericenter 301
		MeanAnomaly     0
	}
}

// 策
Star "HIP 4427 A"
{
	ParentBody "HIP 4427"
	Class      "B0.5IVe"
	MassSol    17
	RadSol     10
	Luminosity 34000
	Teff       25000
	Age        0.008

	Orbit
	{
		PeriodDays      203.59
		Eccentricity    0.26
		ArgOfPericenter 23
		MeanAnomaly     0
	}
}

Star "HIP 4427 B"
{
	ParentBody "HIP 4427"
	Class      ""
	MassSol    1.02

	Orbit
	{
		PeriodDays      203.59
		Eccentricity    0.26
		ArgOfPericenter 203
		MeanAnomaly     0
	}
}
