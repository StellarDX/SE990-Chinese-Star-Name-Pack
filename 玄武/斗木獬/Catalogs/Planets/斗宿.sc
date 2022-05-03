// 斗宿三(BSG******) (六星系统)
Remove "Polis A"{ParentBody "Polis"}
Remove "Polis Ab"{ParentBody "Polis"}
Star "天机/HIP 89341 Aa"
{
	ParentBody "HIP 89341"
	Class      "B8Iap"
	MassSol    14.1 // 30
  RadSol     67.9
  Luminosity 200000
  Teff       12000

	Orbit
	{
		PeriodDays      181
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "善/HIP 89341 Ab"
{
	ParentBody "HIP 89341"
	Class      "B1.5V"
  MassSol    9.8 // 15
  RadSol     12.2
  Teff       23000
  Age        0.01

	Orbit
	{
		PeriodDays      181
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 89341 B"
{
	ParentBody "HIP 89341"
	Class      "B9III"
  Luminosity 603
  Teff       18200

	Orbit
	{
		SemiMajorAxis   42200
		ArgOfPericenter 247
		MeanAnomaly     0
	}
}

Star "HIP 89341 C" // 光学伴星?
{
	ParentBody "HIP 89341"
	Class      "B" // ?

	Orbit
	{
		SemiMajorAxis   64500
		ArgOfPericenter 220
		MeanAnomaly     0
	}
}

Star "HIP 89341 D/HD 314059/BD-21 4907"
{
	ParentBody "HIP 89341"
	Class      "B2IV"
  Luminosity 1660
  Teff       20400

	Orbit
	{
		SemiMajorAxis   121200
		ArgOfPericenter 300
		MeanAnomaly     0
	}
}

Star "HIP 89341 E/HD 314057/BD-21 4909/2MASS J18134906-2103528"
{
	ParentBody "HIP 89341"
	Class      "B2.5V"
  Luminosity 2450
  Teff       20900

	Orbit
	{
		SemiMajorAxis   125000
		ArgOfPericenter 115
		MeanAnomaly     0
	}
}

// 斗宿四(假双星)
Remove "Nunki A"{ParentBody "Nunki"}
Remove "Nunki B"{ParentBody "Nunki"}

// 斗宿六(***)
Remove "Ascella A"{ParentBody "Ascella"}
Remove "Ascella B"{ParentBody "Ascella"}
Barycenter "HIP 93506 AB"
{
	ParentBody "HIP 93506"
	BinaryOrbit
	{
		Separation      2025
	}
}

Star "七杀/HIP 93506 A"
{
	ParentBody "HIP 93506 AB"
	Class      "A2.5Va"
	MassSol    5.26
  Teff       8799
  Age        0.5

	Orbit
	{
		Period          21
		Eccentricity    0.211
		Inclination     111.1
		AscendingNode   74
  	Epoch           2453732.33416880
		ArgOfPericenter 187.2
		MeanAnomaly     0
	}
}

Star "将(D)/HIP 93506 B"
{
	ParentBody "HIP 93506 AB"
	Class      "A4IV"

  Orbit
	{
		Period          21
		Eccentricity    0.211
		Inclination     111.1
		AscendingNode   74
  	Epoch           2453732.33416880
		ArgOfPericenter 7.2
		MeanAnomaly     0
	}
}

Star "HIP 93506 C"
{
	ParentBody "HIP 93506"
	Class      "A" // ?

	BinaryOrbit
	{
		Separation      2025
	}
}

// 建三(***)
Star "HIP 94141 B" // Nothing is known about the orbits of these stars.
{
	ParentBody "HIP 94141"
	Class      "B8.6 V"

  Orbit
	{
		SemiMajorAxis   13
	}
}

Star "HIP 94141 C"
{
	ParentBody "HIP 94141"
	Class      "A0.1 V"

  Orbit
	{
		SemiMajorAxis   40
	}
}

// 建六(Be**)
Remove "UPS Sgr A"{ParentBody "UPS Sgr"}
Remove "UPS Sgr B"{ParentBody "UPS Sgr"}
Star "HIP 95176 A"
{
	ParentBody "HIP 95176"
	Class      "A2Ia"
	MassSol    2.5
	RadSol     50
	Luminosity 39000
	Teff       12300
	FeH        -0.2
	Age        52

	Orbit
	{
		PeriodDays      137.9
		//SemiMajorAxis   270.8*RadSol
		Eccentricity    0
		Inclination     50
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   49.6
	}
}

Star "HIP 95176 B"
{
	ParentBody "HIP 95176"
	Class      "B2Vpe"
	MassSol    4

	Orbit
	{
		PeriodDays      137.9
		//SemiMajorAxis   270.8*RadSol
		Eccentricity    0
		Inclination     50
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   29.7
	}
}

// 天弁二(所有伴星均为光学伴星)
Remove "DEL Sct (AB)"{ParentBody "DEL Sct"}
Remove "DEL Sct C"{ParentBody "DEL Sct"}
Remove "DEL Sct A"{ParentBody "DEL Sct (AB)"}
Remove "DEL Sct B"{ParentBody "DEL Sct (AB)"}

// 天弁三 (所有伴星均为光学伴星)

// 天弁四
Remove "BET Sct A"{ParentBody "BET Sct"}
Remove "BET Sct B"{ParentBody "BET Sct"}
Star "HIP 92175 A"
{
	ParentBody "HIP 92175"
	Class      "G4II"
	Luminosity 1270
	Teff       4622
	FeH        -0.16

	Orbit
	{
		PeriodDays      834
		Eccentricity    0.35
		Inclination     105.9
		AscendingNode   288.1
		Epoch           2422480.9
		ArgOfPericenter 213.9
		MeanAnomaly     0
	}
}

Star "HIP 92175 B"
{
	ParentBody "HIP 92175"
	Class      "B9"

	Orbit
	{
		PeriodDays      834
		Eccentricity    0.35
		Inclination     105.9
		AscendingNode   288.1
		Epoch           2422480.9
		ArgOfPericenter 33.9
		MeanAnomaly     0
	}
}

// 天弁九(**)
Star	"HIP 93526 A"
{
	ParentBody     "HIP 93526"
	Class	         "A1 V"
	MassSol        3.25
	RadSol         2
	Luminosity     213.9
	Teff           9908

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00777806
		Eccentricity    0
		Inclination     -87.9989
		AscendingNode   124.355
		ArgOfPericenter -86.7705
		MeanAnomaly     -44.0215
	}
}

Star	"HIP 93526 B(?)"
{
	ParentBody     "HIP 93526"
	Class	         "F5.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00777806
		Eccentricity    0
		Inclination     -87.9989
		AscendingNode   124.355
		ArgOfPericenter 93.2295
		MeanAnomaly     -44.0215
	}
}

// 鳖二(**)
Star	"HIP 92308 A"
{
	ParentBody     "HIP 92308"
	Class	         "A3 V"
	RadSol         2.2
	Luminosity     57.72
	Teff           8371

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0399882
		Eccentricity    0.147932
		Inclination     -101.039
		AscendingNode   89.9453
		ArgOfPericenter 42.2276
		MeanAnomaly     164.017
	}
}

Star	"HIP 92308 B"
{
	ParentBody     "HIP 92308"
	Class	         "G5.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0399882
		Eccentricity    0.147932
		Inclination     -101.039
		AscendingNode   89.9453
		ArgOfPericenter 222.228
		MeanAnomaly     164.017
	}
}

// 鳖七(**) (增加数据)
Remove "GAM CrA A"{ParentBody "GAM CrA"}
Remove "GAM CrA B"{ParentBody "GAM CrA"}
Star "HIP 93825 1/HR 7226 A/HD 177474 A"
{
	ParentBody "HIP 93825"
  Class      "F8 V"
  MassSol    1.15
	RadSol     1.47
	Teff       6090
	FeH        -0.07
	Age        5

  Orbit
  {
    Period          121.76
    Eccentricity    0.32
    Inclination     149.6
    AscendingNode   50.3
		Epoch           2451778.28840532
    ArgOfPericenter 169
    MeanAnomaly     0
  }
}

Star "HIP 93825 2/HR 7227 B/HD 177475 B"
{
  ParentBody "HIP 93825"
  Class      "F8 V"
  MassSol    1.14
	RadSol     1.42
	Teff       6100
	Age        5

  Orbit
  {
		Period          121.76
    Eccentricity    0.32
    Inclination     149.6
    AscendingNode   50.3
		Epoch           2451778.28840532
    ArgOfPericenter 349
    MeanAnomaly     0
  }
}

// 鳖八(EB**)
Remove "EPS CrA A"{ParentBody "EPS CrA"}
Remove "EPS CrA B"{ParentBody "EPS CrA"}
Star "HIP 93174 1" // 不冲突
{
  ParentBody "EPS CrA"
  Class      "F2 V"
  MassSol    1.9
	RadSol     2.167
	Teff       6481

  Orbit
  {
    PeriodDays      0.59143357
    //SemiMajorAxis   3.795*RadSol
		Eccentricity    0
		Inclination     73.05
		AscendingNode   2.0113
		Epoch           2442296.95907
    ArgOfPericenter 0
    MeanAnomaly     0
  }
}

Star "HIP 93174 2"
{
  ParentBody "EPS CrA"
  Class      ""
  MassSol    0.24
	RadSol     0.869
	Teff       5939

	Orbit
  {
    PeriodDays      0.59143357
    //SemiMajorAxis   3.795*RadSol
		Eccentricity    0
		Inclination     73.05
		AscendingNode   2.0113
		Epoch           2442296.95907
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}

// 天鸡一(**)
Star	"HIP 96950 A"
{
	ParentBody     "HIP 96950"
	Class          "F3IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          114.489334
		Eccentricity    0.250712037
		Inclination     -0.347533703
		AscendingNode   0
		ArgOfPericenter -116.644863
		MeanAnomaly     39.1751631
	}
}

Star	"HIP 96950 B"
{
	ParentBody     "HIP 96950"
	Class          "F7.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          114.489334
		Eccentricity    0.250712037
		Inclination     -0.347533703
		AscendingNode   0
		ArgOfPericenter 63.3551375
		MeanAnomaly     39.1751631
	}
}

// 天龠四(**)
Star	"HIP 86352 A"
{
	ParentBody     "HIP 86352"
	Class          "G6III"

	Orbit
	{
		RefPlane        "Equator"
		Period          20.4985027
		Eccentricity    0.559572041
		Inclination     -0.84509182
		AscendingNode   0
		ArgOfPericenter 14.2293466
		MeanAnomaly     -69.8513214
	}
}

Star	"HIP 86352 B"
{
	ParentBody     "HIP 86352"
	Class          "K3.3V"

	Orbit
	{
		RefPlane        "Equator"
		Period          20.4985027
		Eccentricity    0.559572041
		Inclination     -0.84509182
		AscendingNode   0
		ArgOfPericenter 194.229347
		MeanAnomaly     -69.8513214
	}
}

// 天龠七(**)
Star	"HIP 85783 A"
{
	ParentBody     "CHR 229"
	Class          "B9Iab"
	AbsMagn        0.52

	Orbit
	{
		RefPlane        "Equator"
		Period          0.227855281
		Eccentricity    0.80700314
		Inclination     -1.32842755
		AscendingNode   0
		ArgOfPericenter 40.8065076
		MeanAnomaly     -60.2942006
	}
}

Star	"HIP 85783 B"
{
	ParentBody     "CHR 229"
	Class          "A7.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.227855281
		Eccentricity    0.80700314
		Inclination     -1.32842755
		AscendingNode   0
		ArgOfPericenter 220.806508
		MeanAnomaly     -60.2942006
	}
}

// 天龠八(cC*)
Remove "X Sgr A"{ParentBody "X Sgr"}
Remove "X Sgr B"{ParentBody "X Sgr"}

// 狗国一(SB**)
Star "HIP 98066 A"
{
  ParentBody "HIP 98066"
  Class      "G5IV"
  MassSol    1.52
	RadSol     2.87
	Luminosity 7.1
	Teff       5499
	FeH        0.06
	Age        3

  Orbit
  {
    PeriodDays      1712.74
    //SemiMajorAxis   1.1044
		Eccentricity    0.82
		Epoch           2457549.31
    ArgOfPericenter 321.17
    MeanAnomaly     0
		//SemiAmplitude   12.255
  }
}

Star "HIP 98066 B"
{
  ParentBody "HIP 98066"
  Class      "F5.2 V"

	Orbit
  {
    PeriodDays      1712.74
    //SemiMajorAxis   1.1044
		Eccentricity    0.82
		Epoch           2457549.31
    ArgOfPericenter 141.17
    MeanAnomaly     0
  }
}

// 狗国二
Star	"HD 189005 A"
{
	ParentBody     "HD 189005"
	Class          "G6III"
	RadSol         17.42
	Luminosity     170.3
	Teff           4997
	FeH            -0.38

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0259383213
		Eccentricity    0
		Inclination     -0.833215475
		AscendingNode   0
		ArgOfPericenter -165.334908
		MeanAnomaly     79.935519
	}
}

Star	"HD 189005 B"
{
	ParentBody     "HD 189005"
	Class          "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0259383213
		Eccentricity    0
		Inclination     -0.833215475
		AscendingNode   0
		ArgOfPericenter 14.6650917
		MeanAnomaly     79.935519
	}
}

// 天渊一(PM**)
Star	"HIP 95294 A"
{
	ParentBody     "HIP 95294"
	Class	         "F2V"
	MassSol        1.43
	Oblateness     0.18032786885245901639344262295082
	Luminosity     20
	Teff           7035
	FeH            -0.54
	Age            0.933

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0138795
		Eccentricity    0
		Inclination     154.012
		AscendingNode   22.8708
		ArgOfPericenter 68.8068
		MeanAnomaly     -85.8894
	}
}

Star	"HIP 95294 B"
{
	ParentBody     "HIP 95294"
	Class	         "F8.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0138795
		Eccentricity    0
		Inclination     154.012
		AscendingNode   22.8708
		ArgOfPericenter 248.807
		MeanAnomaly     -85.8894
	}
}

// 天渊二(**)
Remove "Arkab Prior A"{ParentBody "Arkab Prior"}
Remove "Arkab Prior B"{ParentBody "Arkab Prior"}
Star "HIP 95241 A"
{
	ParentBody "HIP 95241"
	Class      "B9 V"
	MassSol    3.67
	RadSol     2.73
	Luminosity 324
	Teff       11960
	FeH        -0.35
	Age        0.224

	BinaryOrbit
	{
		Separation      3290
	}
}

Star "HIP 95241 B"
{
	ParentBody "HIP 95241"
	Class      "A5 V"
	RadSol     1.89

	BinaryOrbit
	{
		Separation      3290
	}
}

// 天渊三(**)
Star	"HIP 95347 A"
{
	ParentBody     "HIP 95347"
	Class	         "B8V"
	MassSol        2.95
	RadSol         2.49
	Luminosity     117
	Teff           12387
	FeH            -0.02
	Age            0.0337766

	Orbit
	{
		RefPlane        "Equator"
		Period          0.029831
		Eccentricity    0.033539
		Inclination     -169.07
		AscendingNode   112.824
		ArgOfPericenter 28.2907
		MeanAnomaly     171.578
	}
}

Star	"HIP 95347 B"
{
	ParentBody     "HIP 95347"
	Class	         "Ae" // ProtoStar

	Orbit
	{
		RefPlane        "Equator"
		Period          0.029831
		Eccentricity    0.033539
		Inclination     -169.07
		AscendingNode   112.824
		ArgOfPericenter 208.291
		MeanAnomaly     171.578
	}
}

// 狗一(PM**)
Star	"HIP 96465 A"
{
	ParentBody     "HIP 96465"
	Class	         "B8 V"
	MassSol        3
	RadSol         2.1
	Luminosity     60.5
	Teff           10592
	FeH            0
	Age            0.0573

	BinaryOrbit
	{
		Separation      139.4
	}
}

Star	"HIP 96465 B"
{
	ParentBody     "HIP 96465"
	Class	       "K2V"

	BinaryOrbit
	{
		Separation      139.4
	}
}

// 狗二(**)
Star	"HIP 95477 A"
{
	ParentBody     "HIP 95477"
	Class	         "A3IV"
	MassSol        1.64
	Luminosity     42.9
	Teff           7859
	Age            0.393

	Orbit
	{
		Period          5.72
		Eccentricity    0.71
		Inclination     97.3
		AscendingNode   259
		Epoch           2445806.57845525
		ArgOfPericenter 190.7
		MeanAnomaly     0
	}
}

Star	"HIP 95477 B"
{
	ParentBody     "HIP 95477"
	Class	         "A5 V"

	Orbit
	{
		Period          5.72
		Eccentricity    0.71
		Inclination     97.3
		AscendingNode   259
		Epoch           2445806.57845525
		ArgOfPericenter 10.7
		MeanAnomaly     0
	}
}
