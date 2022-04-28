// 离宫三(*)
Star	"HIP 112051 A"
{
	ParentBody     "HIP 112051"
	Class	       "A1 IV"
  MassSol        2.24
  Luminosity     104.24
  Teff           9956
  FeH            0
  Age            0.184

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.373334
		Period          0.344786
		Eccentricity    0.242965
		Inclination     -4.06832
		AscendingNode   -178.208
		ArgOfPericenter 133.014
		MeanAnomaly     -121.777
	}
}

Star	"HIP 112051 B"
{
	ParentBody     "HIP 112051"
	Class	       "A1.6 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.384844
		Period          0.344786
		Eccentricity    0.242965
		Inclination     -4.06832
		AscendingNode   -178.208
		ArgOfPericenter 313.014
		MeanAnomaly     -121.777
	}
}

// 离宫四
Remove "Matar A"{ParentBody "Matar"}
Remove "Matar B"{ParentBody "Matar"}
Star "HIP 112158 A"
{
	ParentBody "HIP 112158"
	Class      "G2 II"
	MassSol    3.51
  RadSol     24.51
  Luminosity 330.8
  Teff       4970
  FeH        0.39
  RotationDays 818
  Age        0.27

	Orbit
	{
		PeriodDays      813
		Eccentricity    0.183
  	Epoch           2452025
		ArgOfPericenter 164.7
		MeanAnomaly     0
    //SemiAmplitude   14.37
	}
}

Star "HIP 112158 B"
{
	ParentBody "HIP 112158"
	Class      "F0 V"

	Orbit
	{
    PeriodDays      813
		Eccentricity    0.183
  	Epoch           2452025
		ArgOfPericenter 344.7
		MeanAnomaly     0
	}
}

// 雷电一(单星)
Remove "Homam A"{ParentBody "Homam"}
Remove "Homam B"{ParentBody "Homam"}

// 雷电二
Remove "KSI Peg A"{ParentBody "KSI Peg"}
Remove "KSI Peg B"{ParentBody "KSI Peg"}
Star "HIP 112447 A"
{
	ParentBody "HIP 112447"
	Class      "F6 V"
	MassSol    1.17
  RadSol     1.86
  Luminosity 4.5
  Teff       6178
  FeH        -0.27
  Age        5

	Orbit
	{
		Period          1886.4
		//SemiMajorAxis   192.3
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 112447 B"
{
	ParentBody "HIP 112447"
	Class      "M3.5 V"
	MassSol    0.32
  Teff       3569
  FeH        -0.25

	Orbit
	{
		Period          1886.4
		//SemiMajorAxis   192.3
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 雷电三(*)
Star	"HIP 112935 A"
{
	ParentBody     "HIP 112935"
	Class	       "F7 IV"
	MassSol        1.275
	Teff           6250
	FeH            -0.32
	Age            2.71

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.178533
		Period          0.2713
		Eccentricity    0.614394
		Inclination     -156.073
		AscendingNode   172.91
		ArgOfPericenter 141.12
		MeanAnomaly     138.999
	}
}

Star	"HIP 112935 B"
{
	ParentBody     "HIP 112935"
	Class	       "M4 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.307766
		Period          0.2713
		Eccentricity    0.614394
		Inclination     -156.073
		AscendingNode   172.91
		ArgOfPericenter 321.12
		MeanAnomaly     138.999
	}
}

// 雷电六
Star "HIP 115919 A"
{
	ParentBody "HIP 115919"
	Class      "G8IIIa"
	MassSol    2.49
  RadSol     8.44
  Luminosity 47.9
  Teff       5032
  FeH        0.05
  Age        0.59

	Orbit
	{
		PeriodDays      941.03
		Eccentricity    0.713
		ArgOfPericenter 237
		MeanAnomaly     0
		//SemiAmplitude   3.16
	}
}

Star "HIP 115919 B"
{
	ParentBody "HIP 115919"
	Class      ""
	MassSol    0.4

	Orbit
	{
		PeriodDays      941.03
		Eccentricity    0.713
		ArgOfPericenter 57
		MeanAnomaly     0
	}
}

// 垒壁阵二(*)
Barycenter	"HIP 106723 A"
{
	ParentBody     "HIP 106723"
	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   28.2381
		Period          417.92
		Eccentricity    0.197572
		Inclination     61.5023
		AscendingNode   49.982
		ArgOfPericenter 169.519
		MeanAnomaly     13.4586
	}
}

Star	"HIP 106723 Aa"
{
	ParentBody     "HIP 106723 A"
	Class	       "B2.5Vpe"
	MassSol        7.6
	RadSol         4.8
	Luminosity     4649
	Teff           18800
	FeH            -0.08
	Age            0.0275

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      129
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 106723 Ab"
{
	ParentBody     "HIP 106723 A"
	Class	       "A3.5 V"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      129
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter	"HIP 106723 BC"
{
	ParentBody     "HIP 106723"
	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   91.6635
		Period          417.92
		Eccentricity    0.197572
		Inclination     61.5023
		AscendingNode   49.982
		ArgOfPericenter 349.519
		MeanAnomaly     13.4586
	}
}

Star	"HIP 106723 B"
{
	ParentBody     "HIP 106723 BC"
	Class	       "A1.1 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0400656
		Period          0.0158741
		Eccentricity    0
		Inclination     18.4132
		AscendingNode   -19.8366
		ArgOfPericenter 14.0124
		MeanAnomaly     32.9581
	}
}

Star	"HIP 106723 C"
{
	ParentBody     "HIP 106723 BC"
	Class	       "A8.7 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0506454
		Period          0.0158741
		Eccentricity    0
		Inclination     18.4132
		AscendingNode   -19.8366
		ArgOfPericenter 194.012
		MeanAnomaly     32.9581
	}
}

// 垒壁阵四
Remove "DEL Cap A"{ParentBody "Deneb Algedi"}
Remove "DEL Cap B"{ParentBody "Deneb Algedi"}
Star "HIP 107556 Aa"
{
	ParentBody "HIP 107556"
	Class      "A7III"
	MassSol    2
	RadSol     1.91
	Luminosity 8.5
	Teff       7301
	FeH        -0.13

	Orbit
	{
		PeriodDays      1.0227683
		Eccentricity    0
		Inclination     72.5
		Epoch           2448105.793
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   75.3
	}
}

Star "HIP 107556 B"
{
	ParentBody "HIP 107556"
	Class      ""
	MassSol    0.73
	RadSol     0.9
	Teff       4500

	Orbit
	{
		PeriodDays      1.0227683
		Eccentricity    0
		Inclination     72.5
		Epoch           2448105.793
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 垒壁阵六(*)
Star	"HIP 111123 A"
{
	ParentBody     "HIP 111123"
	Class	       "A0 IVs"
	MassSol        2.87
	RadSol         2.87
	Luminosity     105
	Teff           10115
	FeH            0.44
	Age            30

	Orbit
	{
		PeriodDays      654
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 111123 B"
{
	ParentBody     "HIP 111123"
	Class	       "A6.9 V"

	Orbit
	{
		PeriodDays      654
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 垒壁阵八(*)
Star	"HIP 114724 A"
{
	ParentBody     "HIP 114724"
	Class	       "M1.5 III"
	MassSol        1
	RadSol         34.77
	Luminosity     207.7
	Teff           3715
	Age            10.97

	Orbit
	{
		PeriodDays      2500
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 114724 B"
{
	ParentBody     "HIP 114724"
	Class	       "F1.7 V"

	Orbit
	{
		PeriodDays      2500
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 垒壁阵九
Star	"HIP 118209 A"
{
	ParentBody     "HIP 118209"
	Class	       "G8 III"
	MassSol        2.39
	RadSol         9.73
	Luminosity     56
	Teff           5014
	FeH            0.03
	Age            0.71

	Orbit
	{
		Period          695
		Eccentricity    0.766
		Inclination     81
		AscendingNode   81.1
		//EpochB          2550
		ArgOfPericenter 289.6
		MeanAnomaly     0
	}
}

Star	"HIP 118209 B"
{
	ParentBody     "HIP 118209"
	Class	       "A8.2 V"

	Orbit
	{
		Period          695
		Eccentricity    0.766
		Inclination     81
		AscendingNode   81.1
		//EpochB          2550
		ArgOfPericenter 109.6
		MeanAnomaly     0
	}
}

// 垒壁阵十一
Remove "33 Psc A"{ParentBody "33 Psc"}
Remove "33 Psc B"{ParentBody "33 Psc"}
Star "HIP 443 A"
{
	ParentBody "HIP 443"
	Class      "K0 III"
	MassSol    0.83
	RadSol     7
	Luminosity 24
	Teff       4736
	FeH        -0.12
	Age        0.0048

	Orbit
	{
		PeriodDays      72.93
		Eccentricity    0.272
		Epoch           2422530.330
		ArgOfPericenter 157.71
		MeanAnomaly     0
		//SemiAmplitude   16.43
	}
}

Star "HIP 443 B"
{
	ParentBody "HIP 443"
	Class      ""
	MassSol    0.76

	Orbit
	{
		PeriodDays      72.93
		Eccentricity    0.272
		Epoch           2422530.330
		ArgOfPericenter 337.71
		MeanAnomaly     0
	}
}

// 羽林军一
Star "HIP 108797 A"
{
	ParentBody "HIP 108797"
	Class      "A2V"
	RadSol     2 // ?

	Orbit
	{
		PeriodDays      0.945
		Eccentricity    0
		Epoch           2436814.418
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   97.9
	}
}

Star "HIP 108797 B"
{
	ParentBody "HIP 108797"
	Class      "K0III"
	RadSol     5 // ?
	Oblateness 0

	Orbit
	{
		PeriodDays      0.945
		Eccentricity    0
		Epoch           2436814.418
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 羽林军三
Star "HIP 109786 A"
{
	ParentBody "HIP 109786"
	Class      "K0III"
	RadSol     7.88
	Luminosity 33.93
	Teff       4750
	FeH        -0.13

	Orbit
	{
		Period          1000000
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   97.9
	}
}

Star "HIP 109786 B"
{
	ParentBody "HIP 109786"
	Class      "F8V"
	RadSol     1.76
	Luminosity 6.319
	Teff       6899

	Orbit
	{
		Period          1000000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 羽林军十一(*)
Star	"HIP 111449 A"
{
	ParentBody     "HIP 111449"
	Class	       "F5 V"
	Teff           6597
	FeH            -0.04
	Age            0.9

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   38.0862
		Period          724.391
		Eccentricity    0.670717
		Inclination     -132.77
		AscendingNode   -129.178
		ArgOfPericenter -116.266
		MeanAnomaly     81.9491
	}
}

Star	"HIP 111449 B"
{
	ParentBody     "HIP 111449"
	Class	       "G8.6 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   52.6027
		Period          724.391
		Eccentricity    0.670717
		Inclination     -132.77
		AscendingNode   -129.178
		ArgOfPericenter 63.7338
		MeanAnomaly     81.9491
	}
}

// 羽林军十五
Remove "53 Aqr A" {ParentBody "53 Aqr"}
Remove "53 Aqr B" {ParentBody "53 Aqr"}
Star "HIP 110778 A/BD–17 6521/HD 212698 A/HR 8545/LTT 9026/SAO 165078"
{
	ParentBody "53 Aqr"
	Class      "G1V"
	MassSol    1.01
	RadSol     1.11
	Luminosity 1.39
	Teff       5922
	FeH        -0.1
	Age        0.18

	Orbit
	{
		Period          3500
		Eccentricity    0.9
		Inclination     44.13
		AscendingNode   294.55
		//EpochB          2023
		ArgOfPericenter 331.4
		MeanAnomaly     0
	}
}

Star "HIP 110778 B/BD–17 6520/HD 212697 B/HR 8544/LTT 9025/SAO 165077"
{
	ParentBody "53 Aqr"
	Class      "G5V"
	MassSol    0.99
	Teff       5811
	FeH        -0.19

	Orbit
	{
		Period          3500
		Eccentricity    0.9
		Inclination     44.13
		AscendingNode   294.55
		//EpochB          2023
		ArgOfPericenter 151.4
		MeanAnomaly     0
	}
}

// 羽林军十九
Star "HIP 111200 A"
{
	ParentBody "HIP 111200"
	Class      "A9"
	MassSol    1.734
	RadSol     2.059
	Luminosity 11.73
	Teff       7477
	FeH        0.014
	Age        1.086

	Orbit
	{
		PeriodDays      829.976
		Eccentricity    0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 111200 B"
{
	ParentBody "HIP 111200"
	Class      "F0"

	Orbit
	{
		PeriodDays      829.976
		Eccentricity    0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 羽林军廿三(*)
Star "HIP 113031 A"
{
	ParentBody "HIP 113031 AB"
	Class      "B8IV"

	Orbit
	{
		PeriodDays      3.429616
		Eccentricity    0.05
		Epoch           2452909.15
		ArgOfPericenter 266.5
		MeanAnomaly     0
		//SemiAmplitude   95
	}
}

Barycenter "HIP 113031 AB"
{
	ParentBody "HIP 113031"
	Orbit
	{
		Period          9.479
		Eccentricity    0.862
		Inclination     29.8
		AscendingNode   40.9
		//EpochB          2010.039
		ArgOfPericenter 250.7
		MeanAnomaly     0
	}
}

Star "HIP 113031 B"
{
	ParentBody "HIP 113031 AB"
	Class      "F1.3V"

	Orbit
	{
		PeriodDays      3.429616
		Eccentricity    0.05
		Epoch           2452909.15
		ArgOfPericenter 86.5
		MeanAnomaly     0
		//SemiAmplitude   113
	}
}

Star "HIP 113031 C"
{
	ParentBody "HIP 113031"
	Class      "A6.5V"

	Orbit
	{
		Period          9.479
		Eccentricity    0.862
		Inclination     29.8
		AscendingNode   40.9
		//EpochB          2010.039
		ArgOfPericenter 70.7
		MeanAnomaly     0
	}
}

// 羽林军廿六
Star "HIP 113136 A"
{
	ParentBody "HIP 113136"
	Class      "A3V"
	MassSol    2.51
	RadSol     2.4
	Luminosity 48
	Teff       8650
	FeH        -0.21
	Age        0.3

	Orbit // ?
	{
		PeriodDays      483
		Eccentricity    0.12
		Inclination     41
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

/*Star "HIP 113136 B" // Hipparcos
{
	ParentBody "HIP 113136"
	Class      ""
	MassSol    0.07

	Orbit // ?
	{
		PeriodDays      483
		Eccentricity    0.12
		Inclination     41
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}*/

Star "HIP 113136 B" // Infrared interferometric observations
{
	ParentBody "HIP 113136"
	Class      "G5"

	Orbit // ?
	{
		PeriodDays      483
		Eccentricity    0.12
		Inclination     41
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 羽林军廿九
Star "HIP 114375 A/HD 218640"
{
	ParentBody "HIP 114375"
	Class      "G3II"
	MassSol    2.9
	Teff       5640
	FeH        0.27
	Age        0.32

	Orbit
	{
		Period          201
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 114375 B/HD 218641"
{
	ParentBody "HIP 114375"
	Class      "A2V"
	MassSol    2
	Teff       8912

	Orbit // ?
	{
		Period          201
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 羽林军三十(*)
Star	"HIP 114119 A"
{
	ParentBody     "HIP 114119"
	Class	         "G8 III"
	Teff           4900
	FeH            -0.14

	Orbit
	{
		RefPlane        "Equator"
		Period          21.7439
		Eccentricity    0.583989
		Inclination     52.0084
		AscendingNode   146.427
		ArgOfPericenter 48.2977
		MeanAnomaly     35.2098
	}
}

Star	"HIP 114119 B"
{
	ParentBody     "HIP 114119"
	Class	         "F4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          21.7439
		Eccentricity    0.583989
		Inclination     52.0084
		AscendingNode   146.427
		ArgOfPericenter 228.298
		MeanAnomaly     35.2098
	}
}

// 羽林军卅一(*)
Star	"HIP 116247 A"
{
	ParentBody     "HIP 116247"
	Class	         "A0 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          14.1672
		Eccentricity    0.661376
		Inclination     -20.2385
		AscendingNode   168.032
		ArgOfPericenter -124.745
		MeanAnomaly     -12.9229
	}
}

Star	"HIP 116247 B"
{
	ParentBody     "HIP 116247"
 	Class	         "A8.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          14.1672
		Eccentricity    0.661376
		Inclination     -20.2385
		AscendingNode   168.032
		ArgOfPericenter 55.2546
		MeanAnomaly     -12.9229
	}
}

// 羽林军卅五
Star "HIP 115404 A"
{
	ParentBody "HIP 115404"
	Class      "A2V"

	Orbit
	{
		Period          64.62
		Eccentricity    0.14
		Inclination     77.6
		AscendingNode   276.3
		//EpochB          1941.29
		ArgOfPericenter 174.6
		MeanAnomaly     0
	}
}

Star "HIP 115404 B"
{
	ParentBody "HIP 115404"
	Class      "A7V"

	Orbit
	{
		Period          64.62
		Eccentricity    0.14
		Inclination     77.6
		AscendingNode   276.3
		//EpochB          1941.29
		ArgOfPericenter 354.6
		MeanAnomaly     0
	}
}

// 羽林军卅六
Remove "94 Aqr A"{ParentBody "94 Aqr"}
Remove "94 Aqr Aa"{ParentBody "94 Aqr A"}
Remove "94 Aqr Ab"{ParentBody "94 Aqr A"}
Remove "94 Aqr B"{ParentBody "94 Aqr"}
Barycenter "HIP 115126 A"
{
	ParentBody "94 Aqr"
	Orbit
	{
		Period          2554.65
		//SemiMajorAxis   83.0652
		Inclination     45.8
		AscendingNode   162.6
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 115126 Aa"
{
	ParentBody "HIP 115126 A"
	Class      "G8.5 IV"
	MassSol    1.07
	Teff       5461
	FeH        0.23

	Orbit
	{
		Period          6.321
		//SemiMajorAxis   1.6581
		Eccentricity    0.173
		Inclination     44.5
		AscendingNode   341.9
		//EpochB          2012.301
		ArgOfPericenter 208.3
		MeanAnomaly     0
	}
}

Star "HIP 115126 Ab"
{
	ParentBody "HIP 115126 A"
	Class      "K V"
	MassSol    0.8
	Teff       4670

	Orbit
	{
		Period          6.321
		//SemiMajorAxis   1.6581
		Eccentricity    0.173
		Inclination     44.5
		AscendingNode   341.9
		//EpochB          2012.301
		ArgOfPericenter 28.3
		MeanAnomaly     0
	}
}

Star "羽林军卅六/HIP 115125 B"
{
	ParentBody "94 Aqr"
	Class      "K2 V"
	Teff       5136
	FeH        0.24

	Orbit
	{
		Period          2554.65
		//SemiMajorAxis   192.0882
		Inclination     45.8
		AscendingNode   162.6
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 羽林军卅七(*)
Remove "PSI3 Aqr A"{ParentBody "PSI3 Aqr"}
Remove "PSI3 Aqr B"{ParentBody "PSI3 Aqr"}
Star	"HIP 115115 A"
{
	ParentBody     "HIP 115115"
	Class	         "A0 V"
	RadSol         2
	Luminosity     70

	Orbit
	{
		RefPlane        "Equator"
		Period          0.452399
		Eccentricity    0.437377
		Inclination     -122.199
		AscendingNode   -47.2549
		ArgOfPericenter 11.9263
		MeanAnomaly     -79.5903
	}
}

Star	"HIP 115115 B"
{
	ParentBody     "HIP 115115"
	Class	       "G0.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.452399
		Eccentricity    0.437377
		Inclination     -122.199
		AscendingNode   -47.2549
		ArgOfPericenter 191.926
		MeanAnomaly     -79.5903
	}
}

// 羽林军卅九
Remove "91 Aqr A"{ParentBody "91 Aqr"}
Remove "91 Aqr B"{ParentBody "91 Aqr (BC)"}
Remove "91 Aqr C"{ParentBody "91 Aqr (BC)"}
Remove "91 Aqr (BC)"{ParentBody "91 Aqr"}
Star "羽林军卅九/HIP 114855 A/D–09 6156/FK5 1608/HD 219449 A/HR 8841/LTT 9437/SAO 146598"
{
	ParentBody "91 Aqr"
	Class      "K0 III"
	MassSol    1.38
	RadSol     10.96
	Luminosity 54.3
	Teff       4730
	FeH       -0.14
	Age        2.98

	Orbit
	{
		Period          61411.77
		//SemiMajorAxis   1264.6634
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HD 219430 BC/BD–09 6155/LTT 9434/SAO 146596"
{
	ParentBody "91 Aqr"
	Orbit
	{
		Period          61411.77
		SemiMajorAxis   1017.5452
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 219430 B"
{
	ParentBody "HD 219430 BC"
	Class      ""
	MassSol    0.7

	Orbit
	{
		Period          84
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 219430 C"
{
	ParentBody "HD 219430 BC"
	Class      ""
	MassSol    0.7

	Orbit
	{
		Period          84
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 羽林军四二
Star "HIP 113996 A"
{
	ParentBody "HIP 113996"
	Class      "F2Vn"

	Orbit
	{
		Period          21.84
		Eccentricity    0.3878
		Inclination     48.01
		AscendingNode   204.87
		//EpochB          1983.108
		ArgOfPericenter 262.83
		MeanAnomaly     0
	}
}

Star "HIP 113996 B"
{
	ParentBody "HIP 113996"
	Class      "F2V"

	Orbit
	{
		Period          21.84
		Eccentricity    0.3878
		Inclination     48.01
		AscendingNode   204.87
		//EpochB          1983.108
		ArgOfPericenter 82.83
		MeanAnomaly     0
	}
}

// 羽林军四五(*)
Remove "OME2 Aqr A"{ParentBody "OME2 Aqr"}
Remove "OME2 Aqr B"{ParentBody "OME2 Aqr"}
Barycenter	"HIP 116971 AB"
{
	ParentBody     "HIP 116971"
	Orbit
	{
		Period          2349
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 116971 A"
{
	ParentBody     "HIP 116971 AB"
	Class	         "B9 V"
	RadSol         1.94
	Luminosity     37
	Teff           10504

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00983162
		Eccentricity    0
		Inclination     117.69
		AscendingNode   163.736
		ArgOfPericenter 179.199
		MeanAnomaly     109.587
	}
}

Star	"HIP 116971 B"
{
	ParentBody     "HIP 116971 AB"
	Class	         "F2.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00983162
		Eccentricity    0
		Inclination     117.69
		AscendingNode   163.736
		ArgOfPericenter 359.199
		MeanAnomaly     109.587
	}
}

Star "HIP 116971 C"
{
	ParentBody "HIP 116971"
	Class      "F5.5 V"

	Orbit
	{
		Period          2349
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 鈇钺二(可能是双星)
Star	"HIP 117089 A"
{
	ParentBody     "HIP 117089"
	Class	         "B9 V"
	MassSol        3
	RadSol         2.7
	Luminosity     151.88
	Teff           11555

	Orbit
	{
		RefPlane        "Equator"
		Period          0.902272
		Eccentricity    0.469324
		Inclination     29.9097
		AscendingNode   173.471
		ArgOfPericenter 33.3213
		MeanAnomaly     -169.644
	}
}

Star	"HIP 117089 B(?)"
{
	ParentBody     "HIP 117089"
	Class	         "F3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.902272
		Eccentricity    0.469324
		Inclination     29.9097
		AscendingNode   173.471
		ArgOfPericenter 213.321
		MeanAnomaly     -169.644
	}
}

// 北落师门
Star	"北落师门/Fomalhaut A/ALF PsA A/24 PsA A/CPD −30° 6685/FK5 867/Gl 881/HD 216956/HIP 113368/HR 8728/SAO 191524"
{
	ParentBody     "24 PsA"
	Class	         "A3V"
	MassSol        1.92
	RadSol         1.842
	Luminosity     16.63
	Teff           8590
	FeH            -0.03 // -0.34
	Age            0.44

	Orbit
	{
		RefPlane        "Static"
	}
}

Star	"TW PsA/Fomalhaut B/ALF PsA B/24 PsA B/Gl 879/HR 8721/CD -32°17321/HD 216803/LTT 9283/GCTP 5562.00/SAO 214197/CPD-32 6550/HIP 113283"
{
	ParentBody     "24 PsA"
	Class	         "K5Vp"
	MassSol        0.725
	RadSol         0.629
	Luminosity     0.19
	Teff           4711
	RotationDays   10.3
	Age            0.44

	Orbit
	{
		RefPlane        "Extrasolar"
		SemiMajorAxis   57754.144
		ArgOfPericenter 186
		MeanAnomaly     0
	}
}

Star	"LP 876-10/Fomalhaut C/ALF PsA C/24 PsA C/2MASS J22480446-2422075/NLTT 54872/GSC 06964-01226"
{
	ParentBody     "24 PsA"
	Class	         "M4V"

	Orbit
	{
		RefPlane        "Extrasolar"
		SemiMajorAxis   158823.896
		ArgOfPericenter 338
		MeanAnomaly     0
	}
}

// 天纲
Remove "DEL PsA A"{ParentBody "DEL PsA"}
Remove "DEL PsA B"{ParentBody "DEL PsA"}
Star "HIP 113246 1" // 不冲突
{
    ParentBody "HIP 113246"
    Class      "G8 III"
    MassSol    1.42
		Luminosity 52
		Teff       4828
		FeH        -0.21
		Age        3.74

    Orbit
    {
        Period          3955.365682
        //SemiMajorAxis   106.809619
        ArgOfPericenter 0
        MeanAnomaly     0
    }
}

Star "HIP 113246 2"
{
    ParentBody "HIP 113246"
    Class      "G8IV"

    Orbit
    {
        Period          3955.365682
        //SemiMajorAxis   258.221056
        ArgOfPericenter 180
        MeanAnomaly     0
    }
}

// 螣蛇三(*)
Barycenter	"HIP 107533 A"
{
	ParentBody     "HIP 107533"
	Orbit
	{
		RefPlane        "Equator"
		Period          41.1112
		Eccentricity    0.216456
		Inclination     48.1151
		AscendingNode   -13.012
		ArgOfPericenter -101.649
		MeanAnomaly     -112.951
	}
}

Star	"HIP 107533 Aa"
{
	ParentBody     "HIP 107533 A"
	Class	       "B2.5 III"
	MassSol        8.4
	RadSol         7.1
	Luminosity     8442 // = LumBol
	LumBol         8442
	Teff           20815
	FeH            0.04
	Age            33.2

	Orbit
	{
		PeriodDays      72.0162
		Eccentricity    0.34
		Epoch           2428410.6
		ArgOfPericenter 58.1
		MeanAnomaly     0
	}
}

Star	"HIP 107533 Ab"
{
	ParentBody     "HIP 107533 A"
	Class	       "B5.9 IV"

	Orbit
	{
		PeriodDays      72.0162
		Eccentricity    0.34
		Epoch           2428410.6
		ArgOfPericenter 238.1
		MeanAnomaly     0
	}
}

Star	"HIP 107533 B"
{
	ParentBody     "HIP 107533"
	Class	       "A2V" // ?

	Orbit
	{
		RefPlane        "Equator"
		Period          41.1112
		Eccentricity    0.216456
		Inclination     48.1151
		AscendingNode   -13.012
		ArgOfPericenter 78.3513
		MeanAnomaly     -112.951
	}
}

// 螣蛇四(*)
Star	"HIP 107136 A"
{
	ParentBody     "HIP 107136"
	Class	       "B3 IV"
	MassSol        10.1
	RadSol         5.6
	Luminosity     16538
	Teff           18360
	Age            0.0251

	Orbit
	{
		PeriodDays      26.33
		Eccentricity    0
		Epoch           2431306.5
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 107136 B"
{
	ParentBody     "HIP 107136"
	Class	       "A0 V"

	Orbit
	{
		PeriodDays      26.33
		Eccentricity    0
		Epoch           2431306.5
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 螣蛇七(*)
Barycenter	"HIP 106886 A"
{
	ParentBody     "HIP 106886"
	Orbit
	{
		RefPlane        "Equator"
		Period          4.12489
		Eccentricity    0.774547
		Inclination     -164.321
		AscendingNode   109.764
		ArgOfPericenter 1.99756
		MeanAnomaly     -111.981
	}
}

Star	"HIP 106886 Aa"
{
	ParentBody     "HIP 106886 A"
	Class	       "O6Vf"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.7
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 106886 Ab"
{
	ParentBody     "HIP 106886 A"
	Class	       "O9V"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.7
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 106886 B"
{
	ParentBody     "HIP 106886"
	Class	       "O9.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          4.12489
		Eccentricity    0.774547
		Inclination     -164.321
		AscendingNode   109.764
		ArgOfPericenter 181.998
		MeanAnomaly     -111.981
	}
}

// 螣蛇九
Star	"HIP 109857 Aa"
{
	ParentBody     "HIP 109857"
	Class	       "F0 V (Sr II)"
	MassSol        1.64
	RadSol         1.86
	Luminosity     11.65
	Teff           7514
	FeH            0.08
	Age            1.097

	Orbit
	{
		Period          17
		Eccentricity    0.7
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 109857 Ab"
{
	ParentBody     "HIP 109857"
	Class	       "K8"
	MassSol        0.57

	Orbit
	{
		Period          17
		Eccentricity    0.7
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 螣蛇十
Star	"HIP 110538 A"
{
	ParentBody     "HIP 110538"
	Class	       "G9 III"
	MassSol        0.97
	RadSol         10.96
	Luminosity     57.7
	Teff           4803
	FeH            -0.33
	Age            6.76

	Orbit
	{
		RefPlane        "Equator"
		Period          6.58393
		Eccentricity    0.629264
		Inclination     146.934
		AscendingNode   103.938
		ArgOfPericenter 93.8668
		MeanAnomaly     114.842
	}
}

Star	"HIP 110538 B"
{
	ParentBody     "HIP 110538"
	Class	       "F2.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          6.58393
		Eccentricity    0.629264
		Inclination     146.934
		AscendingNode   103.938
		ArgOfPericenter 273.867
		MeanAnomaly     114.842
	}
}

// 螣蛇十一
Remove "SIG Cas A"{ParentBody "SIG Cas"}
Remove "SIG Cas B"{ParentBody "SIG Cas"}
Star "HIP 118243 A"
{
	ParentBody "HIP 118243"
	Class      "B2IV"
	MassSol    12
	RadSol     11.3
	Luminosity 25000
	Teff       21000
	Age        0.0158

	Orbit
	{
		Period          94463.49045043
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 118243 B"
{
	ParentBody "HIP 118243"
	Class      "B3 V" // B5?

	Orbit
	{
		Period          94463.49045043
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 螣蛇十四
/*
AR Cassiopeiae is more complicated; it contains three main subsets:
AR Cassiopeiae AB: The contains three stars: Aa and Ab, a binary orbiting each other every 6 days, and B, orbiting A every 545 years.
AR Cassiopeiae CD: These pair of binary stars orbit each other once every 2,200 years, and orbit component AB in 438,000 years.
AR Cassiopeiae FG: This is another binary, with a period of 58,000 years. It orbits AB every 381,000 years.
*/
Barycenter "HIP 115990 AB"
{
	ParentBody "HIP 115990"
	Orbit
	{
		RefPlane "Static"
	}
}

Barycenter "HIP 115990 A"
{
	ParentBody "HIP 115990 AB"
	Orbit
	{
		Period          544.978
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 115990 A1"
{
	ParentBody "HIP 115990 A"
	Class      "B3IV"
	AbsMagn    -1.87
	AbsMagnBol -3.56
	MassSol    5.9 // 5.64
	RadSol     5.05
	Teff       17200

	Orbit
	{
		PeriodDays      6.066317
		Eccentricity    0.24
		Inclination     85.34
		Epoch           2436847.9404
		ArgOfPericenter 221.82
		MeanAnomaly     0
	}
}

Star "HIP 115990 A2"
{
	ParentBody "HIP 115990 A"
	Class      "A6"
	AbsMagn    2.2
	AbsMagnBol 2.18
	MassSol    1.86 // 2.24
	RadSol     1.6
	Teff       8150

	Orbit
	{
		PeriodDays      6.066317
		Eccentricity    0.24
		Inclination     85.34
		Epoch           2436847.9404
		ArgOfPericenter 41.82
		MeanAnomaly     0
	}
}

Star "HIP 115990 B"
{
	ParentBody "HIP 115990 AB"
	Class      ""
	AppMagn    9.3
	MassSol    1.43

	Orbit
	{
		Period          544.978
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 115990 CD"
{
	ParentBody "HIP 115990"
	Orbit
	{
		Period          438329
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 115990 C"
{
	ParentBody "HIP 115990 CD"
	Class      "A1V" // B9V
	AppMagn    8.2
	MassSol    1.8

	Orbit
	{
		Period          2194
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 115990 D"
{
	ParentBody "HIP 115990 CD"
	Class      ""
	AppMagn    9.8
	MassSol    1.28

	Orbit
	{
		Period          2194
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 115990 FG"
{
	ParentBody "HIP 115990"
	Orbit
	{
		Period          380636
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 115990 F"
{
	ParentBody "HIP 115990 FG"
	Class      "F7IV"
	AppMagn    11.06
	MassSol    1.01

	Orbit
	{
		Period          58104
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 115990 G"
{
	ParentBody "HIP 115990 FG"
	Class      "F9V"
	AppMagn    11.11
	MassSol    1

	Orbit
	{
		Period          58104
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 螣蛇十八(*)
Barycenter	"HIP 115022 A"
{
	ParentBody     "HIP 115022"
	Orbit
	{
		RefPlane        "Equator"
		Period          47.3993
		Eccentricity    0.330376
		Inclination     -123.461
		AscendingNode   -26.5898
		ArgOfPericenter 48.8463
		MeanAnomaly     -126.664
	}
}

Star	"HIP 115022 Aa"
{
	ParentBody     "HIP 115022 A"
	Class	       "M2.5 III Ba0.5"
	RadSol         30
	Teff           3616
	FeH            0.04

	Orbit
	{
		RefPlane        "Equator"
		Period          0.441038
		Eccentricity    0
		Inclination     165.867
		AscendingNode   154.667
		ArgOfPericenter 175.836
		MeanAnomaly     17.4734
	}
}

Star	"HIP 115022 Ab(?)"
{
	ParentBody     "HIP 115022 A"
	Class	       "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.441038
		Eccentricity    0
		Inclination     165.867
		AscendingNode   154.667
		ArgOfPericenter 355.836
		MeanAnomaly     17.4734
	}
}

Star	"HIP 115022 B"
{
	ParentBody     "HIP 115022"
	Class	       "A0.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          47.3993
		Eccentricity    0.330376
		Inclination     -123.461
		AscendingNode   -26.5898
		ArgOfPericenter 228.846
		MeanAnomaly     -126.664
	}
}

// 螣蛇十九
Star	"HIP 116584 A"
{
	ParentBody     "HIP 116584"
	Class	         "G8 III"
	MassSol        1
	RadSol         7
	Luminosity     23.4
	Teff           4800
	FeH            -0.56
	RotationDays   54

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      20.5212
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 116584 B"
{
	ParentBody     "HIP 116584"
	Class	         "M3.7 V"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      20.5212
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 螣蛇二十(*)
Remove "PSI And A"{ParentBody "PSI And"}
Remove "PSI And B"{ParentBody "PSI And"}
Barycenter	"HIP 117221 AB"
{
	ParentBody     "HIP 117221"
	Orbit
	{
		RefPlane        "Equator"
		Period          2340.22
		Eccentricity    0.762085
		Inclination     -96.8778
		AscendingNode   75.934
		ArgOfPericenter 76.5363
		MeanAnomaly     -67.5725
	}
}

Star	"HIP 117221 A"
{
	ParentBody     "HIP 117221 AB"
	Class	       "G5 Ib"
	MassSol        5.4
	Teff           4990
	FeH            0.1
	Age            0.079

	Orbit
	{
		Period          276.9368
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 117221 B"
{
	ParentBody     "HIP 117221 AB"
	Class	       "B9V"

	Orbit
	{
		Period          276.9368
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 117221 C"
{
	ParentBody     "HIP 117221"
	Class	       "A4.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          2340.22
		Eccentricity    0.762085
		Inclination     -96.8778
		AscendingNode   75.934
		ArgOfPericenter -103.464
		MeanAnomaly     -67.5725
	}
}
