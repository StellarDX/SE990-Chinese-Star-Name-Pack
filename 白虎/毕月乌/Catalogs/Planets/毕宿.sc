// 毕宿二(C为光学伴星)
Remove "DEL3 Tau (AB)"{ParentBody "DEL3 Tau"}
Remove "DEL3 Tau A"{ParentBody "DEL3 Tau (AB)"}
Remove "DEL3 Tau B"{ParentBody "DEL3 Tau (AB)"}
Remove "DEL3 Tau C"{ParentBody "DEL3 Tau"}
Star "HIP 20648 A"
{
	ParentBody "HIP 20648"
	Class      "A2IV"
	MassSol    2.27
  Luminosity 1.47
  Teff       9025

	Orbit
	{
		Period          291.9987981
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 20648 B"
{
	ParentBody "HIP 20648"
	Class      ""
	MassSol    2 // ?

  AppMagn    8.37 // Limit luminosity

	Orbit
	{
		Period          291.9987981
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 毕宿三
Remove "Hyadum II Aa"{ParentBody "Hyadum II"}
Remove "Hyadum II Ab"{ParentBody "Hyadum II"}
Star "HIP 20455 Aa"
{
	ParentBody "HIP 20455"
	Class      "G9.5 III CN0.5"
	MassSol    2.8
  RadSol     11.4
  Luminosity 69
  Teff       5000
  FeH        0.1
  RotationDays 138.2
  Age        0.62

	Orbit
	{
		PeriodDays      529.8
		Eccentricity    0.42
    Epoch           2434356.5
		ArgOfPericenter 155
		MeanAnomaly     0
    //SemiAmplitude   3
	}
}

Star "HIP 20455 Ab"
{
	ParentBody "HIP 20455"
	Class      ""
	MassSol    1.28

	Orbit
	{
    PeriodDays      529.8
		Eccentricity    0.42
    Epoch           2434356.5
		ArgOfPericenter 335
		MeanAnomaly     0
	}
}

// 毕宿五
Remove "Aldebaran A"{ParentBody "Aldebaran"}
Remove "Aldebaran B"{ParentBody "Aldebaran"}
Star "HIP 21421 A"
{
	ParentBody "HIP 21421"
	Class      "K5 III"
	MassSol    1.16
  RadSol     44.13
  Luminosity 439
  Teff       3900
  FeH        -0.33
  RotationDays 520
  Age        6.4

	Orbit
	{
		Period          11058.85665033
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 21421 B"
{
	ParentBody "HIP 21421"
	Class      "M2.5"

	Orbit
	{
		Period          11058.85665033
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 毕宿六 - 毕宿增十三 (有双星关系吗？)
Remove "TET1 Tau A"{ParentBody "TET1 Tau"}
Remove "TET1 Tau B"{ParentBody "TET1 Tau"}
Remove "TET2 Tau A"{ParentBody "TET2 Tau"}
Remove "TET2 Tau B"{ParentBody "TET2 Tau"}
/*Barycenter "毕宿六/TET1 Tau/77 Tau/BD+15 631/HD 28307/HIP 20885/HR 1411/SAO 93955"
{
	RA      04 28 34.43
	Dec     +15 57 44.0
	Dist    47.2393

	ParentBody "TET Tau"
	Orbit
	{
		PeriodDays      5997
		Eccentricity    0.64
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   8.39
	}
}
*/
Star "HIP 20885 A"
{
	ParentBody "HIP 20885"
	Class      "G9III Fe-0.5"
	MassSol    2.67
	RadSol     10.55
	Luminosity 71
	Teff       5080
	FeH        0.14
	Age        0.51

	Orbit
	{
		Period          16.26
		Eccentricity    0.57
		/*Inclination     92.35
		AscendingNode   355.54*/
		ArgOfPericenter 70.1
		Epoch           2451000.322522
		MeanAnomaly     0
	}
}

Star "HIP 20885 B"
{
	ParentBody "HIP 20885"
	Class      ""
	MassSol    1.31

	Orbit
	{
		Period          16.26
		Eccentricity    0.57
		/*Inclination     92.35
		AscendingNode   355.54*/
		ArgOfPericenter 250.1
		Epoch           2451000.322522
		MeanAnomaly     0
	}
}

/*Barycenter "毕宿增十三/TET2 Tau/Chamukuy/78 Tau/BD+15 632/HD 28319/HIP 20894/HR 1412/SAO 93957"
{
	RA      04 28 39.74
	Dec     +15 52 15.2
	Dist    46.0123

	ParentBody "TET Tau"
	Orbit
	{
		PeriodDays      5997
		Eccentricity    0.64
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   8.39
	}
}*/

Star "HIP 20894 A"
{
	ParentBody "HIP 20894"
	Class      "A7III"
	MassSol    2.86
	RadSol     4.4
	Luminosity 59
	Teff       7800

	Orbit
	{
		PeriodDays      140.7302
		Eccentricity    0.736
		Inclination     47.8
		//AscendingNode   353.82
		ArgOfPericenter 55.41
		MeanAnomaly     0
		//SemiAmplitude   32.95
	}
}

Star "HIP 20894 B"
{
	ParentBody "HIP 20894"
	Class      ""
	MassSol    2.16
	RadSol     2.7
	Luminosity 21
	Teff       7800
	Age        0.65

	Orbit
	{
		PeriodDays      140.7302
		Eccentricity    0.736
		Inclination     47.8
		//AscendingNode   353.82
		ArgOfPericenter 235.41
		MeanAnomaly     0
		//SemiAmplitude   43.68
	}
}

// 毕宿七(*)
Star	"HIP 20713 A"
{
	ParentBody     "HIP 20713"
	Class	         "F0 V"
	Luminosity      23.53
	MassSol         1.94
	RadSol          3.34
	Teff            7543
	RotationDays    14.2
	Age             0.966

	Orbit
	{
		RefPlane        "Equator"
		Period          2559.48
		Eccentricity    0.164513
		Inclination     -89.4814
		AscendingNode   -147.39
		ArgOfPericenter 3.98089
		MeanAnomaly     93.4967
	}
}

Barycenter	"HIP 20713 B"
{
	ParentBody     "HIP 20713"
	Orbit
	{
		RefPlane        "Equator"
		Period          2559.48
		Eccentricity    0.164513
		Inclination     -89.4814
		AscendingNode   -147.39
		ArgOfPericenter 183.981
		MeanAnomaly     93.4967
	}
}

Star	"HIP 20713 Ba"
{
	ParentBody     "HIP 20713 B"
	Class	         "F3.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.63279
		Eccentricity    0.343762
		Inclination     24.1442
		AscendingNode   40.8159
		ArgOfPericenter 115.027
		MeanAnomaly     -167.7
	}
}

Star	"HIP 20713 Bb"
{
	ParentBody     "HIP 20713 B"
	Class	         "G2.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.63279
		Eccentricity    0.343762
		Inclination     24.1442
		AscendingNode   40.8159
		ArgOfPericenter 295.027
		MeanAnomaly     -167.7
	}
}

// 毕宿八
Remove "LAM Tau (AB)"{ParentBody "LAM Tau"}
Remove "LAM Tau A"{ParentBody "LAM Tau (AB)"}
Remove "LAM Tau B"{ParentBody "LAM Tau (AB)"}
Remove "LAM Tau C"{ParentBody "LAM Tau"}
Barycenter "HIP 18724 AB"
{
	ParentBody "HIP 18724"
	Orbit
	{
		PeriodDays      33.025
		Eccentricity    0.15
		Inclination     71
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 18724 A"
{
	ParentBody "HIP 18724 AB"
	Class      "B3 V"
	MassSol    7.18
	RadSol     6.4
	Luminosity 5801
	Teff       18700
	Age        0.0332

	Orbit
	{
		PeriodDays      3.9529552
		Eccentricity    0.025
		Inclination     76
		Epoch           2444667.3
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   56.9
	}
}

Star "HIP 18724 B"
{
	ParentBody "HIP 18724 AB"
	Class      "A4 IV"
	MassSol    1.89
	RadSol     5.3
	Luminosity 128
	Teff       8405

	Orbit
	{
		PeriodDays      3.9529552
		Eccentricity    0.025
		Inclination     76
		Epoch           2444667.3
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   56.9
	}
}

Star "HIP 18724 C"
{
	ParentBody "HIP 18724"
	Class      ""
	MassSol    0.7

	Orbit
	{
		PeriodDays      33.025
		Eccentricity    0.15
		Inclination     71
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天节二(没有伴星)
Remove "RHO Tau A"{ParentBody "RHO Tau"}
Remove "RHO Tau B"{ParentBody "RHO Tau"}

// 天节七(仅整理，未修改)
Remove "88 Tau A"{ParentBody "88 Tau"}
Remove "88 Tau B"{ParentBody "88 Tau"}
Remove "88 Tau Aa"{ParentBody "88 Tau A"}
Remove "88 Tau (AB)"{ParentBody "88 Tau A"}
Remove "88 Tau Aa1"{ParentBody "88 Tau Aa"}
Remove "88 Tau Aa2"{ParentBody "88 Tau Aa"}
Remove "88 Tau Ab1"{ParentBody "88 Tau Ab"}
Remove "88 Tau Ab2"{ParentBody "88 Tau Ab"}
Remove "88 Tau Ba"{ParentBody "88 Tau B"}
Remove "88 Tau Bb"{ParentBody "88 Tau B"}
Barycenter "HIP 21402 A/d Tau/88 Tau/BD+09° 607/HD 29140/SAO 94026/HR 1458/GC 5599"
{
	ParentBody "HIP 21402"
	Orbit
	{
		Period          80661
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "HIP 21402 B/BD+09° 606/HD 286909/SAO 94024/GC 5596/TYC 673-1487-1"
{
	ParentBody "HIP 21402"
	Orbit
	{
		Period          80661
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 21402 Aa"
{
	ParentBody "HIP 21402 A"
	Orbit
	{
		PeriodDays      6585
		//SemiMajorAxis   12.17
		Eccentricity    0.0715
		Inclination     69.923
		AscendingNode   146.734
		Epoch           2455261
		ArgOfPericenter 25.7
		MeanAnomaly     0
	}
}

Barycenter "HIP 21402 Ab"
{
	ParentBody "HIP 21402 A"
	Orbit
	{
		PeriodDays      6585
		//SemiMajorAxis   12.17
		Eccentricity    0.0715
		Inclination     69.923
		AscendingNode   146.734
		Epoch           2455261
		ArgOfPericenter 205.7
		MeanAnomaly     0
	}
}

Star "HIP 21402 Aa1"
{
	ParentBody "HIP 21402 Aa"
	Class      "A6m"
	MassSol    2.06

	Orbit
	{
		PeriodDays      3.571096
		//SemiMajorAxis   0.0689
		Eccentricity    0
		Inclination     110.6
		AscendingNode   287.5
		Epoch           2453389.3824
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 21402 Aa2"
{
	ParentBody "HIP 21402 Aa"
	Class      "F5"
	MassSol    1.361

	Orbit
	{
		PeriodDays      3.571096
		//SemiMajorAxis   0.0689
		Eccentricity    0
		Inclination     110.6
		AscendingNode   287.5
		Epoch           2453389.3824
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 21402 Ab1"
{
	ParentBody "HIP 21402 Ab"
	Class      "G3"
	MassSol    1.069

	Orbit
	{
		PeriodDays      7.886969
		//SemiMajorAxis   0.0997
		Eccentricity    0
		Inclination     27.23
		AscendingNode   34
		Epoch           2452507.31
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 21402 Ab2"
{
	ParentBody "HIP 21402 Ab"
	Class      "G2"
	MassSol    1.057

	Orbit
	{
		PeriodDays      7.886969
		//SemiMajorAxis   0.0997
		Eccentricity    0
		Inclination     27.23
		AscendingNode   34
		Epoch           2452507.31
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 21402 Ba"
{
	ParentBody "HIP 21402 B"
	Class      "F8V"
	MassSol    1.2

	Orbit
	{
		PeriodDays      1350
		Eccentricity    0.663
		Epoch           2450498
		ArgOfPericenter 43
		MeanAnomaly     0
		//SemiAmplitude   3.24
	}
}

Star "HIP 21402 Bb"
{
	ParentBody "HIP 21402 B"
	Class      "M"
	MassSol    0.15

	Orbit
	{
		PeriodDays      1350
		Eccentricity    0.663
		Epoch           2450498
		ArgOfPericenter 223
		MeanAnomaly     0
	}
}

// 天节八
Star "HIP 20522 A"
{
	ParentBody "HIP 20522"
	Class      "A3V"
	MassSol    2.89

	Orbit
	{
		Period          54.77
		Eccentricity    0.72
		Inclination     34.2
		AscendingNode   239.8
		//EpochB          1937.24
		ArgOfPericenter 152
		MeanAnomaly     0
	}
}

Star "HIP 20522 B"
{
	ParentBody "HIP 20522"
	Class      "A4V"
	MassSol    2.76

	Orbit
	{
		Period          54.77
		Eccentricity    0.72
		Inclination     34.2
		AscendingNode   239.8
		//EpochB          1937.24
		ArgOfPericenter 332
		MeanAnomaly     0
	}
}

// 诸王一
Star "HIP 27830 A"
{
	ParentBody "HIP 27830"
	Class      "A0V"
	RadSol     2.1
	Luminosity 197.19
	Teff       8732

	Orbit
	{
		PeriodDays      5.969
		Eccentricity    0
		Epoch           2420147.25
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   48.9
	}
}

Star "HIP 27830 B"
{
	ParentBody "HIP 27830"
	Class      "A0V"

	Orbit
	{
		PeriodDays      5.969
		Eccentricity    0
		Epoch           2420147.25
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   71
	}
}

// 诸王六
Barycenter "HIP 21881 A"
{
	ParentBody "HIP 21881"
	Orbit
	{
		Period          140903
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "HIP 21881 Aab"
{
	ParentBody "HIP 21881 A"
	Orbit
	{
		Period          57.8960
		//EpochB          2037.956
		Eccentricity    0.357
		AscendingNode   4.1
		ArgOfPericenter 142.2
		Inclination     130.7
		MeanAnomaly     0
	}
}

Star "HIP 21881 Aa"
{
	ParentBody "HIP 21881 Aab"
	Class      "B3 V"
	MassSol    6.4
	Luminosity 1472
	Teff       18700
	FeH        -0.51

	Orbit
	{
		PeriodDays      2.956549
		//SemiMajorAxis   0.01455
		Eccentricity    0.051
		Epoch           2436424.207
		ArgOfPericenter 306.7
		MeanAnomaly     0
		//SemiAmplitude   53.6
	}
}

Star "HIP 21881 Ab"
{
	ParentBody "HIP 21881 Aab"
	Class      ""
	MassSol    3.28

	Orbit
	{
		PeriodDays      2.956549
		//SemiMajorAxis   0.01455
		Eccentricity    0.051
		Epoch           2436424.207
		ArgOfPericenter 126.7
		MeanAnomaly     0
		//SemiAmplitude   179
	}
}

Star "HIP 21881 Ac"
{
	ParentBody "HIP 21881 A"
	Class      "A0V"
	MassSol    1.72

	Orbit
	{
		Period          57.8960
		//EpochB          2037.956
		Eccentricity    0.357
		AscendingNode   4.1
		ArgOfPericenter 322.2
		Inclination     130.7
		MeanAnomaly     0
	}
}

Star "HIP 21881 B"
{
	ParentBody "HIP 21881"
	Class      "A1V"
	MassSol    1.67

	Orbit
	{
		Period          140903
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 九州殊口一
Star "HIP 19777 A"
{
	ParentBody "HIP 19777"
	Class      "K3III"
	MassSol    1.77
	RadSol     12
	Luminosity 81.3
	Teff       4641
	FeH        0.18
	Age        1.12

	Orbit
	{
		Period          100 // ?
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 19777 B"
{
	ParentBody "HIP 19777"
	Class      "G2V"
	RadSol     1.15
	Luminosity 1.369
	Teff       5816

	Orbit
	{
		Period          100 // ?
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 九州殊口六(这个系统到底有多少颗恒星？？？)
Barycenter "HIP 21986 AB"
{
	ParentBody "HIP 21986"
	Orbit
	{
		Period          20108
		ArgOfPericen    0
		MeanAnomaly     0
	}
}

Star "HIP 21986 A"
{
	ParentBody "HIP 21986 AB"
	Class      "G5III" // G8III
	MassSol    2.41

	Orbit
	{
		PeriodDays      42.3279
		Epoch           2443778.18
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 21986 B"
{
	ParentBody "HIP 21986 AB"
	Class      ""
	MassSol    0.98

	Orbit
	{
		PeriodDays      42.3279
		Epoch           2443778.18
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 21986 C"
{
	ParentBody "HIP 21986"
	Class      "F2VpSrSi" // F4III
	MassSol    2.33

	Orbit
	{
		Period          20108
		ArgOfPericen    180
		MeanAnomaly     0
	}
}

// 五车二
Remove "Capella (AB)"{ParentBody "Capella"}
Remove "Capella (HL)"{ParentBody "Capella"}
Remove "Capella A"{ParentBody "Capella (AB)"}
Remove "Capella B"{ParentBody "Capella (AB)"}
Remove "Capella H"{ParentBody "Capella (HL)"}
Remove "Capella L"{ParentBody "Capella (HL)"}
Barycenter "HIP 24608 Aab"
{
	ParentBody "HIP 24608"
	Orbit
	{
		Period          376493
		//SemiMajorAxis   10000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "HIP 24608 HL"
{
	ParentBody "HIP 24608"
	Orbit
	{
		Period          376493
		//SemiMajorAxis   10000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 24608 Aa"
{
	ParentBody "HIP 24608 Aab"
	Class      "K0 III"
	MassSol    2.5687
	RadSol     11.98
	LumBol     78.7
	Teff       4970
	RotationDays 104

	Orbit
	{
		PeriodDays      104.02128
		//SemiMajorAxis   0.74272
		Eccentricity    0.00089
		Inclination     137.156
		AscendingNode   40.522
		Epoch           2448147.6
		ArgOfPericenter 162.6
		MeanAnomaly     0
		//SemiAmplitude   25.9611
	}
}

Star "HIP 24608 Ab"
{
	ParentBody "HIP 24608 Aab"
	Class      "G1III"
	MassSol    2.4828
	RadSol     8.83
	LumBol     72.7
	Teff       5730
	RotationDays 8.5

	Orbit
	{
		PeriodDays      104.02128
		//SemiMajorAxis   0.74272
		Eccentricity    0.00089
		Inclination     137.156
		AscendingNode   40.522
		Epoch           2448147.6
		ArgOfPericenter 342.6
		MeanAnomaly     0
		//SemiAmplitude   26.86
	}
}

Star "HIP 24608 H"
{
	ParentBody "HIP 24608 HL"
	Class      "M2.5V"
	MassSol    0.57
	RadSol     0.54
	LumBol     0.05
	Teff       3700
	FeH        0.1

	Orbit
	{
		Period          300
		//SemiMajorAxis   40
		Eccentricity    0.75
		Inclination     52
		AscendingNode   288
		//EpochB          2220
		ArgOfPericenter 268
		MeanAnomaly     0
	}
}

Star "HIP 24608 L"
{
	ParentBody "HIP 24608 HL"
	Class      "M4:"
	MassSol    0.53

	Orbit
	{
		Period          300
		//SemiMajorAxis   40
		Eccentricity    0.75
		Inclination     52
		AscendingNode   288
		//EpochB          2220
		ArgOfPericenter 88
		MeanAnomaly     0
	}
}

// 五车三
Remove "Menkalinan (AB)"{ParentBody "Menkalinan"}
Remove "Menkalinan C"{ParentBody "Menkalinan"}
Remove "Menkalinan A"{ParentBody "Menkalinan (AB)"}
Remove "Menkalinan B"{ParentBody "Menkalinan (AB)"}
Star "HIP 28360 A"
{
	ParentBody "HIP 28360"
	Class      "A1m IV"
	MassSol    2.389
	RadSol     2.77
	Luminosity 48
	Teff       9350
	Age        0.57

	Orbit
	{
		PeriodDays      3.96004
		Eccentricity    0
		Inclination     76
		Epoch           2454539.0162
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   108.053
	}
}

Star "HIP 28360 B"
{
	ParentBody "HIP 28360"
	Class      "A1m IV"
	MassSol    2.327
	RadSol     2.63
	Luminosity 48
	Teff       9200

	Orbit
	{
		PeriodDays      3.96004
		Eccentricity    0
		Inclination     76
		Epoch           2454539.0162
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   110.911
	}
}

Star "HIP 28360 C"
{
	ParentBody "HIP 28360"
	Class      ""
	MassSol    0.15

	Orbit
	{
		SemiMajorAxis   330
	}
}

// 五车四
Remove "TET Aur A"{ParentBody "TET Aur"}
Remove "TET Aur B"{ParentBody "TET Aur"}
Star "HIP 28380 A"
{
	ParentBody "HIP 28380"
	Class      "A0VpSi"
	MassSol    3.38
	RadSol     5.1
	Luminosity 263
	Teff       10400
	RotationDays 3.6187

	Orbit
	{
		Period          1134
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 28380 B"
{
	ParentBody "HIP 28380"
	Class      "F2-5 V"

	Orbit
	{
		Period          1134
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 柱一
Remove "Almaaz A"{ParentBody "Almaaz"}
Remove "Almaaz B"{ParentBody "Almaaz"}
Star "HIP 23416 A"
{
	ParentBody "HIP 23416"
	Class      "F0 Iab"
	MassSol    15 // 2.2
	RadSol     358 // 143
	Luminosity 37875 // Bolometic
	Teff       7750

	Orbit
	{
		PeriodDays      9896
		//SemiMajorAxis   18.1
		Eccentricity    0.227
		Inclination     89
		AscendingNode   264
		Epoch           2434723
		ArgOfPericenter 219.2
		MeanAnomaly     0
		//SemiAmplitude   13.84
	}
}

Star "HIP 23416 B"
{
	ParentBody "HIP 23416"
	Class      "B5V"
	MassSol    14 // 6
	RadSol     3.9
	Teff       15000

	Orbit
	{
		PeriodDays      9896
		//SemiMajorAxis   18.1
		Eccentricity    0.227
		Inclination     89
		AscendingNode   264
		Epoch           2434723
		ArgOfPericenter 39.2
		MeanAnomaly     0
	}
}

// 柱二
Remove "Haedus A"{ParentBody "Haedus"}
Remove "Haedus B"{ParentBody "Haedus"}
Star "HIP 23453 A"
{
	ParentBody "HIP 23453"
	Class      "K5 II"
	MassSol    4.94
	RadSol     102
	Luminosity 1888 // 2128
	Teff       3869
	FeH        -0.26

	Orbit
	{
		PeriodDays      972.162
		//SemiMajorAxis   905*RadSol
		Eccentricity    0.3973
		Inclination     87
		Epoch           2453039.9
		ArgOfPericenter 148.9
		MeanAnomaly     0
		//SemiAmplitude   23.17
	}
}

Star "HIP 23453 B"
{
	ParentBody "HIP 23453"
	Class      "B7 V"
	MassSol    4.8

	Orbit
	{
		PeriodDays      972.162
		//SemiMajorAxis   905*RadSol
		Eccentricity    0.3973
		Inclination     87
		Epoch           2453039.9
		ArgOfPericenter 328.9
		MeanAnomaly     0
	}
}

// 柱五(*)
Star "HIP 27673 A"
{
	ParentBody "HIP 27673"
	Class      "G9.5 III Fe1 Ba0.2"
	MassSol    2.12
	RadSol     19
	Luminosity 135
	Teff       4571
	FeH        -0.14
	Age        1.11

	Orbit
	{
		RefPlane        "Equator"
		Period          0.564997
		Eccentricity    0.75754
		Inclination     -119.461
		AscendingNode   -30.8872
		ArgOfPericenter 169.956
		MeanAnomaly     122.912
	}
}

Star "HIP 27673 B"
{
	ParentBody "HIP 27673"
	Class      "wd"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.564997
		Eccentricity    0.75754
		Inclination     -119.461
		AscendingNode   -30.8872
		ArgOfPericenter 349.956
		MeanAnomaly     122.912
	}
}

// 柱七
Star "HIP 25984 A"
{
	ParentBody "HIP 25984"
	Class      "B5Iab"
	MassSol    16.5 // 19
	RadSol     42.3
	Luminosity 95000
	Teff       15500

	Orbit
	{
		PeriodDays    676.85
		Eccentricity  0.116
		AscendingNode 181.7
		Epoch         2422754.2
		ArgOfPericen  0
		MeanAnomaly   0
	}
}

Star "HIP 25984 B"
{
	ParentBody "HIP 25984"
	Class      ""
	MassSol    16 // ?

	Orbit
	{
		PeriodDays    676.85
		Eccentricity  0.116
		AscendingNode 181.7
		Epoch         2422754.2
		ArgOfPericen  180
		MeanAnomaly   0
	}
}

// 柱八
Star "HIP 26536 A"
{
	ParentBody "HIP 26536"
	Class      "G8III"
	MassSol    2.1

	Orbit
	{
		Period          52.735
		//SemiMajorAxis   21.1
		Eccentricity    0.653
		Inclination     124.22
		AscendingNode   127.08
		//EpochB          1974.927
		ArgOfPericenter 129.07
		MeanAnomaly     0
	}
}

Star "HIP 26536 B"
{
	ParentBody "HIP 26536"
	Class      "A1IV"
	MassSol    3

	Orbit
	{
		Period          52.735
		//SemiMajorAxis   21.1
		Eccentricity    0.653
		Inclination     124.22
		AscendingNode   127.08
		//EpochB          1974.927
		ArgOfPericenter 309.07
		MeanAnomaly     0
	}
}

// 天潢三
Remove "14 Aur A"{ParentBody "14 Aur"}
Remove "14 Aur C"{ParentBody "14 Aur"}
Remove "14 Aur Aa"{ParentBody "14 Aur A"}
Remove "14 Aur Ab"{ParentBody "14 Aur A"}
Remove "14 Aur (Ca)"{ParentBody "14 Aur C"}
Remove "14 Aur Cb"{ParentBody "14 Aur C"}
Remove "14 Aur Caa"{ParentBody "14 Aur (Ca)"}
Remove "14 Aur Cab"{ParentBody "14 Aur (Ca)"}
Barycenter "HIP 24504 A"
{
	ParentBody "HIP 24504"
	Orbit
	{
		Period          17371
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "HIP 24504 C"
{
	ParentBody "HIP 24504"
	Orbit
	{
		Period          17371
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 24504 Aa"
{
	ParentBody "HIP 24504 A"
	Class      "A9IV"
	MassSol    1.64
	Luminosity 62.07
	Teff       7498
	FeH        -0.02
	RotationPeriod 2.11
	Age        0.609

	Orbit
	{
		PeriodDays      3.7887
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 24504 Ab"
{
	ParentBody "HIP 24504 A"
	Class      "?"
	MassSol    0.27

	Orbit
	{
		PeriodDays      3.7887
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 24504 Ca"
{
	ParentBody "HIP 24504 C"
	Orbit
	{
		Period          1300
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 24504 Cb"
{
	ParentBody "HIP 24504 C"
	Class      "WDA"
	MassSol    0.5

	Orbit
	{
		Period          1300
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 24504 Ca1"
{
	ParentBody "HIP 24504 Ca"
	Class      "F5V"
	MassSol    1.3
	Orbit
	{
		PeriodDays      2.9934
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 24504 Ca2"
{
	ParentBody "HIP 24504 Ca"
	Class      "M3V:"
	MassSol    0.27

	Orbit
	{
		PeriodDays      2.9934
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 咸池一
Star "HIP 25048 A"
{
	ParentBody "HIP 25048"
	Class      "B5V"
	MassSol    5 // 7
	RadSol     3.2 // 3.4

	Orbit
	{
		PeriodDays      34.49321
		Eccentricity    0.104
		Epoch           2447962.5
		ArgOfPericenter 183.4
		MeanAnomaly     0
		//SemiAmplitude   39.8
	}
}

Star "HIP 25048 B"
{
	ParentBody "HIP 25048"
	Class      ""
	MassSol    2 // 4

	Orbit
	{
		PeriodDays      34.49321
		Eccentricity    0.104
		Epoch           2447962.5
		ArgOfPericenter 3.4
		MeanAnomaly     0
	}
}

// 天关
Remove "ZET Tau A"{ParentBody "ZET Tau"}
Remove "ZET Tau B"{ParentBody "ZET Tau"}
Star "HIP 26451 A"
{
	ParentBody "HIP 26451"
	Class      "B2IIIpe"
	MassSol    11.2
	RadSol     5.5
	Luminosity 4169
	Teff       15500
	Age        0.0225

	Orbit
	{
		PeriodDays      132.987
		//SemiMajorAxis   1.17
		Eccentricity    0
		Inclination     92.8
		AscendingNode   -58
		Epoch           2447025.6
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   7.43
	}
}

Star "HIP 26451 B"
{
	ParentBody "HIP 26451"
	Class      "G4" // WD? // Neutron??
	MassSol    0.94

	Orbit
	{
		PeriodDays      132.987
		//SemiMajorAxis   1.17
		Eccentricity    0
		Inclination     92.8
		AscendingNode   -58
		Epoch           2447025.6
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 参旗一
Star "HIP 22667 A"
{
	ParentBody "HIP 22667"
	Class      "MS3III" // S-type Star
	MassSol    0.9
	RadSol     214
	Luminosity 4046
	Teff       3465
	FeH        -0.03

	Orbit
	{
		PeriodDays      1900
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 22667 B"
{
	ParentBody "HIP 22667"
	Class      ""
	MassSol    0.8 // Unknown

	Orbit
	{
		PeriodDays      1900
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 参旗七
Remove "PI4 Ori Aa"{ParentBody "PI4 Ori"}
Remove "PI4 Ori Ab"{ParentBody "PI4 Ori"}
Star "HIP 22549 A"
{
	ParentBody "HIP 22549"
	Class      "B2 III"
	MassSol    10.95
	RadSol     9.1
	Luminosity 19726
	Teff       21874
	FeH        -0.31
	Age        0.0154

	Orbit
	{
		PeriodDays      9.5191
		Eccentricity    0.03
		Epoch           2418275.65
		ArgOfPericenter 345
		MeanAnomaly     0
		//SemiAmplitude   25.8
	}
}

Star "HIP 22549 B"
{
	ParentBody "HIP 22549"
	Class      ""
	MassSol    10

	Orbit
	{
		PeriodDays      9.5191
		Eccentricity    0.03
		Epoch           2418275.65
		ArgOfPericenter 165
		MeanAnomaly     0
	}
}

// 参旗八
Star "HIP 22797 A"
{
	ParentBody "HIP 22797"
	Class      "B2 III"
	MassSol    12.5
	RadSol     20 // Limited
	Luminosity 11262
	Teff       14496
	FeH        -0.28
	Age        0.0158

	Oblateness 0

	Orbit
	{
		PeriodDays      3.7005
		Eccentricity    0
		Epoch           2417921.64
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   57.88
	}
}

Star "HIP 22797 B"
{
	ParentBody "HIP 22797"
	Class      "B0V" // ?

	Orbit
	{
		PeriodDays      3.7005
		Eccentricity    0
		Epoch           2417921.64
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 九斿二
Star "HIP 22109 A"
{
	ParentBody "HIP 22109"
	Class      "B5IV"
	MassSol    6.2
	RadSol     6.1
	Luminosity 1905
	Teff       15668
	FeH        0

	Orbit
	{
		PeriodDays      7.38090
		Eccentricity    0.344
		Epoch           2455143.254
		ArgOfPericenter 340.5
		MeanAnomaly     0
		//SemiAmplitude  0.344
	}
}

Star "HIP 22109 B"
{
	ParentBody "HIP 22109"
	Class      ""
	MassSol    6 // ?

	Orbit
	{
		PeriodDays      7.38090
		Eccentricity    0.344
		Epoch           2455143.254
		ArgOfPericenter 160.5
		MeanAnomaly     0
	}
}

// 九斿三
Star "HIP 22701 A"
{
	ParentBody "HIP 22701"
	Class      "A9IVn"
	RadSol     6.7
	Luminosity 69
	Teff       6878
	FeH        0.18

	Oblateness (0 0.11504424778761061946902654867257‬ 0)

	Orbit
	{
		PeriodDays      3057
		Eccentricity    0.46
		Epoch           2419973
		ArgOfPericenter 47
		MeanAnomaly     0
		//SemiAmplitude  18.1
	}
}

Star "HIP 22701 B"
{
	ParentBody "HIP 22701"
	Class      ""
	MassSol    2 // ?

	Orbit
	{
		PeriodDays      3057
		Eccentricity    0.46
		Epoch           2419973
		ArgOfPericenter 227
		MeanAnomaly     0
	}
}

// 九斿四
Remove "63 Eri A"{ParentBody "63 Eri"}
Remove "63 Eri B"{ParentBody "63 Eri"}
Star "HIP 23221 A"
{
	ParentBody "HIP 23221"
	Class      "G4IV-V"
	RadSol     4.97 // Swedish Wiki
	Luminosity 20.65
	Teff       5311

	Orbit // 未做任何修改
	{
		Period          2.474
		SemiMajorAxis   0.6988
		Eccentricity    0.3
		Inclination     109.5
		AscendingNode   40.9
		ArgOfPericenter 171
		Epoch           2450384
		MeanAnomaly     0
	}
}

Star "HIP 23221 B"
{
	ParentBody "HIP 23221"
	Class      "DA"

	Orbit
	{
		Period          2.474
		SemiMajorAxis   1.3977
		Eccentricity    0.3
		Inclination     109.5
		AscendingNode   40.9
		ArgOfPericenter 351
		Epoch           2450384
		MeanAnomaly     0
	}
}

// 九斿五
Star "HIP 23231*"
{
	ParentBody "HIP 23231"
	Class      "F0V"
	MassSol    1.52
  Luminosity 80.17
  Teff       7346
  Age        0.644

	Oblateness 0.074

	Orbit
	{
		RefPlane "Static"
	}
}

// 九斿八(*)
Star "HIP 21763 A"
{
	ParentBody "HIP 21763"
	Class      "M3III"
	RadSol     69
	Luminosity 1021
	Teff       3915

	Orbit
	{
		RefPlane        "Equator"
		Period          42.9784
		Eccentricity    0.449147
		Inclination     162.56
		AscendingNode   -77.1069
		ArgOfPericenter 94.4954
		MeanAnomaly     -117.919
	}
}

Star "HIP 21763 B"
{
	ParentBody "HIP 21763"
	Class      "A9.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          42.9784
		Eccentricity    0.449147
		Inclination     162.56
		AscendingNode   -77.1069
		ArgOfPericenter 274.495
		MeanAnomaly     -117.919
	}
}

// 天园二(*)
Star "HIP 9007 A"
{
	ParentBody "HIP 9007"
	Class      "G8IV"
	MassSol    1.58
	RadSol     3.993
	Luminosity 9.84
	Teff       5115
	FeH        -0.18

	Orbit
	{
		RefPlane        "Equator"
		Period          0.299039
		Eccentricity    0.860326
		Inclination     112.19
		AscendingNode   164.026
		ArgOfPericenter -81.386
		MeanAnomaly     2.8113
	}
}

Star "HIP 9007 B"
{
	ParentBody "HIP 9007"
	Class      "G1.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.299039
		Eccentricity    0.860326
		Inclination     112.19
		AscendingNode   164.026
		ArgOfPericenter 98.614
		MeanAnomaly     2.8113
	}
}

// 天园三(可能为双星)
Star "HIP 10602 A"
{
	ParentBody "HIP 10602"
	Class      "B8IV"
	MassSol    3.55
	RadSol     3.4
	Luminosity 255
	Teff       13716
	Age        0.044

	Orbit // 系统生成
	{
		RefPlane        "Equator"
		Period          0.449257
		Eccentricity    0.758348
		Inclination     -148.502
		AscendingNode   -4.36247
		ArgOfPericenter -137.794
		MeanAnomaly     167.303
	}
}

Star "HIP 10602 B"
{
	ParentBody "HIP 10602"
	Class      "G2V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.449257
		Eccentricity    0.758348
		Inclination     -148.502
		AscendingNode   -4.36247
		ArgOfPericenter 42.2056
		MeanAnomaly     167.303
	}
}

// 天园五
Barycenter "HIP 12413 A"
{
	ParentBody "HIP 12413"
	Orbit
	{
		Period          15867
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 12413 Aa"
{
	ParentBody "HIP 12413 A"
	Class      "A1Vb"
	MassSol    1.95
	RadSol     1.93
	Luminosity 17.44
	Teff       9099
	FeH        -0.06
	Age        30

	Orbit
	{
		Period          1 // ?
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 12413 Ab"
{
	ParentBody "HIP 12413 A"
	Class      ""
	MassSol    0.6

	Orbit
	{
		Period          1 // ?
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 12413 B"
{
	ParentBody "HIP 12413"
	Class      "M5"
	MassSol    0.33

	Orbit
	{
		Period          15867
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天园六
Remove "TET1 Eri"{ParentBody "TET Eri"}
Remove "TET2 Eri"{ParentBody "TET Eri"}
Star "TET1 Eri A/HD 18622 A/HR 897 A/Acamar"
{
	ParentBody "HIP 13847"
	Class      "A3IV"
	MassSol    2.6
	RadSol     16
	Luminosity 145
	Teff       8200
	RotationPeriod 13656

	Orbit
	{
		Period          3704.4865
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "TET2 Eri B/HD 18623 B/HR 898 B"
{
	ParentBody "HIP 13847"
	Class      "A1V"
	MassSol    2.4
	Luminosity 36
	Teff       9200

	Orbit
	{
		Period          3704.4865
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天园八
Star "HD 24072/HR 1190/SAO 194551"
{
	ParentBody "HIP 17797"
	Class      "B9.5Van"
	MassSol    2.29

	Orbit
	{
		Period          4518
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 24071/HR 1189/SAO 194550"
{
	ParentBody "HIP 17797"
	Class      "A1Va"
	MassSol    1.91

	Orbit
	{
		Period          4518
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天园十
Star "HIP 20042 A"
{
	ParentBody "HIP 20042"
	Class      "B8V"
	MassSol    3.17
	RadSol     2.32
	Luminosity 100.6
	Teff       12930
	Age        0.146

	Orbit
	{
		PeriodDays      5.010325
		Eccentricity    0
		Inclination     146.2
		Epoch           2454407.7214
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   62.68
	}
}

Star "HIP 20042 B"
{
	ParentBody "HIP 20042"
	Class      "B9.5V"
	MassSol    3.07
	RadSol     2.32
	Luminosity 87.4
	Teff       12250

	Orbit
	{
		PeriodDays      5.010325
		Eccentricity    0
		Inclination     146.2
		Epoch           2454407.7214
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   62.68
	}
}
