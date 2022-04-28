// 井宿二
Remove "NU Gem AA"{ParentBody "NU Gem"}
Remove "NU Gem Ab"{ParentBody "NU Gem"}
Remove "NU Gem Aa1"{ParentBody "NU Gem AA"}
Remove "NU Gem Aa2"{ParentBody "NU Gem AA"}
Barycenter "HIP 30883 A"
{
	ParentBody "HIP 30883"
	Orbit
	{
		Period          865643
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 30883 Aa"
{
	ParentBody "HIP 30883 A"
	Class      "B6III"
	MassSol    6.4
  Luminosity 1380
  Teff       14100

	Orbit
	{
		Period          18.75
    Eccentricity    0.297
		Inclination     72.9
		AscendingNode   120.9
    //EpochB          1992.57
		ArgOfPericenter 48.4
		MeanAnomaly     0
	}
}

Star "HIP 30883 Ab"
{
	ParentBody "HIP 30883 A"
	Class      "B8III"
	MassSol    4.6

  Orbit
	{
		Period          18.75
    Eccentricity    0.297
		Inclination     72.9
		AscendingNode   120.9
    //EpochB          1992.57
		ArgOfPericenter 228.4
		MeanAnomaly     0
	}
}

Barycenter "HIP 30883 B/HD 257937"
{
	ParentBody "HIP 30883"
	Orbit
	{
		Period          865643
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 30883 Ba"
{
	ParentBody "HIP 30883 B"
	Class      "A0"
	MassSol    1.84

	Orbit
	{
		Period          157.029
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 30883 Bb"
{
	ParentBody "HIP 30883 B"
	Class      ""
  MassSol    1.72

	Orbit
	{
		Period          157.029
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 井宿三
Remove "GAM Gem A"{ParentBody "Alhena"}
Remove "GAM Gem B"{ParentBody "Alhena"}
Star "HIP 31681 A"
{
	ParentBody "HIP 31681"
	Class      "A1.5IV+"
	MassSol    2.81
  RadSol     3.3
  Luminosity 123
  Teff       9260
  FeH        -0.12

	Orbit
	{
		PeriodDays      4614.51
		Eccentricity    0.8933
		Inclination     106.7
		AscendingNode   243.6
		Epoch           2443999.1
		ArgOfPericenter 132.6
		MeanAnomaly     0
    //SemiAmplitude   11.881
	}
}

Star "HIP 31681 B"
{
	ParentBody "HIP 31681"
	Class      "A0IV" // ?

  Orbit
	{
		PeriodDays      4614.51
		Eccentricity    0.8933
		Inclination     106.7
		AscendingNode   243.6
		Epoch           2443999.1
		ArgOfPericenter 312.6
		MeanAnomaly     0
	}
}

// 井宿八(*)
Remove "LAM Gem A"{ParentBody "LAM Gem"}
Remove "LAM Gem B"{ParentBody "LAM Gem"}
Barycenter	"HIP 35350 A"
{
	ParentBody     "HIP 35350"
	Orbit
	{
		RefPlane        "Equator"
		Period          18.1753
		Eccentricity    0.434587
		Inclination     148.064
		AscendingNode   -147.044
		ArgOfPericenter 0.314761
		MeanAnomaly     166.469
	}
}

Star	"HIP 35350 Aa"
{
	ParentBody     "HIP 35350 A"
	Class	         "A3 V"
  MassSol        2.098
  RadSol         2.7773
  Luminosity     27.3901
  Teff           7932
  FeH            -0.04
  Age            0.8

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0386197
		Eccentricity    0.0751604
		Inclination     -38.8475
		AscendingNode   135.58
		ArgOfPericenter 146.493
		MeanAnomaly     -165.197
	}
}

Star	"HIP 35350 Ab"
{
	ParentBody     "HIP 35350 A"
	Class	         "F4.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0386197
		Eccentricity    0.0751604
		Inclination     -38.8475
		AscendingNode   135.58
		ArgOfPericenter 326.493
		MeanAnomaly     -165.197
	}
}

Star	"HIP 35350 B"
{
	ParentBody     "HIP 35350"
	Class	         "F1.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          18.1753
		Eccentricity    0.434587
		Inclination     148.064
		AscendingNode   -147.044
		ArgOfPericenter 180.315
		MeanAnomaly     166.469
	}
}

// 钺
Remove "Tejat Prior A"{ParentBody "Tejat Prior"}
Remove "ETA Gem B"{ParentBody "Tejat Prior"}
Remove "Tejat Prior Aa"{ParentBody "Tejat Prior A"}
Remove "ETA Gem Ab"{ParentBody "Tejat Prior A"}
Barycenter "HIP 29655 A"
{
	ParentBody "HIP 29655"
	Orbit
	{
		Period          473.7
		Eccentricity    0.54
		Inclination     142.7
		AscendingNode   84.5
		ArgOfPericenter 26.2
		Epoch           2385691.364958
		MeanAnomaly     0
	}
}

Star "HIP 29655 Aa"
{
	ParentBody "HIP 29655 A"
	Class      "M2IIIa"
	MassSol    2.5
	RadSol     314
	Luminosity 12823 // 15136
	Teff       3605
	FeH        0.04
	Age        0.81

	Orbit
	{
		Period          8.17
		Eccentricity    0.53
		Epoch           2426570
		ArgOfPericenter 348
		MeanAnomaly     0
	}
}

Star "HIP 29655 Ab"
{
	ParentBody "HIP 29655 A"
	Class      "M III"
	Luminosity 2313‬ // 补光

	Orbit
	{
		Period          8.17
		Eccentricity    0.53
		Epoch           2426570
		ArgOfPericenter 168
		MeanAnomaly     0
	}
}

Star "HIP 29655 B"
{
	ParentBody "HIP 29655"
	Class      "G0III"

	Orbit
	{
		Period          473.7
		Eccentricity    0.54
		Inclination     142.7
		AscendingNode   84.5
		ArgOfPericenter 206.2
		Epoch           2385691.364958
		MeanAnomaly     0
	}
}

// 南河一(*)
Star	"HIP 36041 A"
{
	ParentBody     "HIP 36041"
	Class	         "G6.5IIb"
	MassSol        4.63
	RadSol         45.51
	Luminosity     1086.5
	Teff           4916
	FeH            -0.12
	Age            0.14

	Orbit
	{
		RefPlane        "Equator"
		Period          1601.56
		Eccentricity    0.206025
		Inclination     5.97322
		AscendingNode   172.354
		ArgOfPericenter -150.956
		MeanAnomaly     -148.219
	}
}

Star	"HIP 36041 B"
{
	ParentBody     "HIP 36041"
	Class	         "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          1601.56
		Eccentricity    0.206025
		Inclination     5.97322
		AscendingNode   172.354
		ArgOfPericenter 29.0441
		MeanAnomaly     -148.219
	}
}

// 南河二(双星？)
Star "HIP 36188 A"
{
	ParentBody "HIP 36188"
	Class      "B8Ve"
	MassSol    3.5
  RadSol     3.5
  Luminosity 195
  Teff       11772
  Age        0.16

	Orbit
	{
		PeriodDays      170
		ArgOfPericen    0
		MeanAnomaly     0
	}
}

Star "HIP 36188 B"
{
	ParentBody "HIP 36188"
	Class      "sdO" // ?
	MassSol    0.42

	Orbit
	{
		PeriodDays      170
		ArgOfPericen    180
		MeanAnomaly     0
	}
}

// 南河三
Remove "Procyon A"{ParentBody "Procyon"}
Remove "Procyon B"{ParentBody "Procyon"}
Star	"HIP 37279 A"
{
	ParentBody  "HIP 37279"
	Class       "F5IV"
	MassSol     1.499
	RadSol      2.048
	Luminosity  6.93
	Teff        6530
	FeH         -0.05
	RotationDays 23
	Age         1.87

	Orbit
	{
		Period          40.84
		Eccentricity    0.39785
		Inclination     31.408
		AscendingNode   100.683
		//EpochB          1968.076
		ArgOfPericenter 269.23
		MeanAnomaly     0
	}
}

Star	"HIP 37279 B"
{
	ParentBody  "HIP 37279"
	Class       "DQZ"
	MassSol     0.602
	RadSol      0.01234
	Luminosity  0.00049
	Teff        7740
	Age         1.37

	Orbit
	{
		Period          40.84
		Eccentricity    0.39785
		Inclination     31.408
		AscendingNode   100.683
		//EpochB          1968.076
		ArgOfPericenter 89.23
		MeanAnomaly     0
	}
}

// 北河一
Remove "RHO Gem (AB)"{ParentBody "RHO Gem"}
Remove "RHO Gem C"{ParentBody "RHO Gem"}
Remove "RHO Gem A"{ParentBody "RHO Gem (AB)"}
Remove "RHO Gem B"{ParentBody "RHO Gem (AB)"}
Barycenter "RHO Gem AB"
{
	ParentBody "RHO Gem"
	Orbit
	{
		Period          992439
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "北河一/62 Gem A/BD+32° 1562 A/HD 58946 A/HIP 36366 A/Gliese 274 A/HR 2852 A"
{
	ParentBody "RHO Gem AB"
	Class      "F1V"
	MassSol    1.355
	RadSol     1.655
	Luminosity 5.542
	Teff       6899
	FeH        -0.25
	Age        2.1

	Orbit
	{
		Period          356.906
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "Gliese 274 B"
{
	ParentBody "RHO Gem AB"
	Class      "M5"

	Orbit
	{
		Period          356.906
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 36357 C/BD+32° 1561 C/Gliese 273.1 C/V376 Gem C"
{
	ParentBody "RHO Gem"
	Class      "K2.V"
	MassSol    0.77
	Teff       4948

	Orbit
	{
		Period          992439
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 北河二
// http://www.solstation.com/stars2/castor6.htm
// https://en.wikipedia.org/wiki/Castor_(star)
// http://www.ctio.noao.edu/~atokovin/stars/stars.php?cat=HIP&number=36850

Remove "Castor (AB)"{ParentBody "Castor"}
Remove "Castor C"{ParentBody "Castor"}
Remove "Castor A"{ParentBody "Castor (AB)"}
Remove "Castor B"{ParentBody "Castor (AB)"}
Remove "Castor Aa"{ParentBody "Castor A"}
Remove "Castor Ab"{ParentBody "Castor A"}
Remove "Castor Ba"{ParentBody "Castor B"}
Remove "Castor Bb"{ParentBody "Castor B"}
Remove "Castor Ca"{ParentBody "Castor C"}
Remove "Castor Cb"{ParentBody "Castor C"}

//-------------------------------------------------------

Barycenter	"Castor Gem A-B"
{
	ParentBody  "Castor Gem"

	Orbit
	{
		Period          14000 // 10681.406
		Eccentricity    0.9
		Inclination     100
		AscendingNode   56.072
		ArgOfPericenter 213.139
		MeanAnomaly     60
	}
}

Barycenter	"Castor Gem C/YY Gem/BD+32°1582"
{
	ParentBody  "Castor Gem"

	Orbit
	{
		Period          14000 // 10681.406
		Eccentricity    0.9
		Inclination     100
		AscendingNode   56.072
		ArgOfPericenter 33.139
		MeanAnomaly     60
	}
}

//-------------------------------------------------------

Barycenter	"Castor Gem A/BD+32°1581 A/PLX 1785.00/HR 2891 A/HD 60179 A"
{
	ParentBody  "Castor Gem A-B"
	Orbit
	{
		Period          445 // 467 // 459.8
		Eccentricity    0.36 // 0.343 // 0.336
		Inclination     112.9 // 114.5 // 114.6
		AscendingNode   41.7 // 56.072 // 41.2
		Epoch           2401950.650 // 1958.7
		ArgOfPericenter 59.8 // 213.139
		MeanAnomaly     0 // 60
	}
}

Barycenter	"Castor Gem B/BD+32°1581 B/HR 2890 B/HD 60178 B"
{
	ParentBody  "Castor Gem A-B"
	Orbit
	{
		Period          445 // 467 // 459.8
		Eccentricity    0.36 // 0.343 // 0.336
		Inclination     112.9 // 114.5 // 114.6
		AscendingNode   41.7 // 56.072 // 41.2
		Epoch           2401950.650 // 1958.7
		ArgOfPericenter 239.8 // 33.139 // 250.5
		MeanAnomaly     0 // 60
	}
}

//-------------------------------------------------------

Star	"Castor Gem Aa"
{
	ParentBody  "Castor Gem A"
	Class       "A1V"
	Luminosity  17 // 17 - 34
	MassSol     2.76 // 2.15
	RadSol      2.4 // 2.3
	Teff        10286
	FeH         0.98
	Age         0.2

	Orbit
	{
		//Period          0.025215606
		PeriodDays      9.2128
		Eccentricity    0.5 // 0.499
		Inclination     100
		AscendingNode   56.072
		Epoch           2427543.938
		ArgOfPericenter 266.4 // 213.139
		MeanAnomaly     60
	}
}

Star	"Castor Gem Ab"
{
	ParentBody  "Castor Gem A"
	Class       "dM1e" // M5V
	//Luminosity  0.01
	MassSol     0.4 // 0.4 - 0.6
	//Radius      552416
	//Age         0.2

	Orbit
	{
		//Period          0.025215606
		PeriodDays      9.2128
		Eccentricity    0.5 // 0.499
		Inclination     100
		AscendingNode   56.072
		Epoch           2427543.938
		ArgOfPericenter 86.4 // 33.139
		MeanAnomaly     60
	}
}

//-------------------------------------------------------

Star	"Castor Gem Ba"
{
	ParentBody  "Castor Gem B"
	Class       "Am" // A2-5Vm
	Luminosity  14
	MassSol     2.98 // 1.7
	RadSol      3.3 // 1.6
	Teff        8842
	Age         0.2

	Orbit
	{
		//Period          0.008021903
		PeriodDays      2.9283
		Eccentricity    0.01
		Inclination     100
		AscendingNode   56.072
		Epoch           2427501.703
		ArgOfPericenter 94.7 // 213.139
		MeanAnomaly     60
	}
}

Star	"Castor Gem Bb"
{
	ParentBody  "Castor Gem B"
	Class       "dM1e" // M2V
	//Luminosity  0.02
	MassSol     0.4 // 0.4 - 0.6
	//Radius      500000
	//Age         0.2

	Orbit
	{
		//Period          0.008021903
		PeriodDays      2.9283
		Eccentricity    0.01
		Inclination     100
		AscendingNode   56.072
		Epoch           2427501.703
		ArgOfPericenter 274.7 // 33.139
		MeanAnomaly     60
	}
}

//-------------------------------------------------------

Star	"Castor Gem Ca/YY Gem A" // components are identical
{
	ParentBody  "Castor Gem C"
	Class       "dM1e" // M0.5Ve
	Luminosity  0.0733 //  0.026
	MassSol     0.5992 // 0.62
	RadSol      0.6191 // 0.76
	Teff        3820
	FeH         0
	Age         0.37 // 0.2

	Orbit
	{
		//Period          0.002228658
		PeriodDays      0.814
		Eccentricity    0
		Inclination     86.29 // 100
		AscendingNode   7.315 // 56.072
		Epoch           2424989.1
		ArgOfPericenter 213.139
		MeanAnomaly     60
	}
}

Star	"Castor Gem Cb/YY Gem B" // components are identical
{
	ParentBody  "Castor Gem C"
	Class       "dM1e" // M0.5Ve
	Luminosity  0.0733 // 0.026
	MassSol     0.5992 // 0.57
	RadSol      0.6191 // 0.68
	Teff        3820
	FeH         0
	Age         0.37 // 0.2

	Orbit
	{
		//Period          0.002228658
		PeriodDays      0.814
		Eccentricity    0
		Inclination     86.29 // 100
		AscendingNode   7.315 // 56.072
		Epoch           2424989.1
		ArgOfPericenter 33.139
		MeanAnomaly     60
	}
}

//-------------------------------------------------------

// 天樽二
Remove "Wasat A"{ParentBody "Wasat"}
Remove "DEL Gem B"{ParentBody "Wasat"}
Remove "DEL Gem Aa"{ParentBody "Wasat A"}
Remove "DEL Gem Ab"{ParentBody "Wasat A"}
Barycenter "HIP 35550 A"
{
	ParentBody "HIP 35550"
	Orbit
	{
		Period          1200
		SemiMajorAxis   23.2345
		Eccentricity    0.11
		Inclination     63.28
		AscendingNode   18.38
		Epoch           2245913.175484
		ArgOfPericenter 237.19
		MeanAnomaly     0
	}
}

Star "HIP 35550 Aa"
{
	ParentBody "HIP 35550 A"
	Class      "F0IV"
	MassSol    1.57
	Teff       6900
	FeH        -0.26
	Age        1.6

	Orbit
	{
		PeriodDays      2238.7
		Eccentricity    0.353
		Inclination     92.4
		AscendingNode   70.04
		ArgOfPericenter 34.6
		Epoch           2415466.5
		MeanAnomaly     0
	}
}

Star "HIP 35550 Ab"
{
	ParentBody "HIP 35550 A"
	Class      ""
	MassSol    1.07

	Orbit
	{
		PeriodDays      2238.7
		Eccentricity    0.353
		Inclination     92.4
		AscendingNode   70.04
		ArgOfPericenter 214.6
		Epoch           2415466.5
		MeanAnomaly     0
	}
}

Star "HIP 35550 B"
{
	ParentBody "HIP 35550"
	Class      "K"
	MassSol    0.74

	Orbit
	{
		Period          1200
		Eccentricity    0.11
		Inclination     63.28
		AscendingNode   18.38
		Epoch           2245913.175484
		ArgOfPericenter 57.19
		MeanAnomaly     0
	}
}

// 五诸侯五(*)
Remove "PHI Gem A"{ParentBody "PHI Gem"}
Remove "PHI Gem B"{ParentBody "PHI Gem"}
Star	"HIP 38538 A"
{
	ParentBody     "HIP 38538"
	Class	         "A3V"
	MassSol        1.9
	Luminosity     36.5
	Teff           8551
	Age            0.637

	Orbit
	{
		PeriodDays      581.751
		Eccentricity    0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 38538 B"
{
	ParentBody     "HIP 38538"
	Class	         "A5.3 V"

	Orbit
	{
		PeriodDays      581.751
		Eccentricity    0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 积水(*)
Star	"HIP 35710 A"
{
	ParentBody     "HIP 35710"
	Class	         "K0 III"
	Luminosity      69.6
	MassSol         1.34
	RadSol          13.02
	Teff            4575
	FeH             -0.35
	Age             3.31

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0358721
		Eccentricity    0
		Inclination     -95.5544
		AscendingNode   103.909
		ArgOfPericenter -58.6215
		MeanAnomaly     -16.6734
	}
}

Star	"HIP 35710 B"
{
	ParentBody     "HIP 35710"
	Class	         "F1.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0358721
		Eccentricity    0
		Inclination     -95.5544
		AscendingNode   103.909
		ArgOfPericenter 121.379
		MeanAnomaly     -16.6734
	}
}

// 积薪(*)
Remove "KAP Gem A"{ParentBody "KAP Gem"}
Remove "KAP Gem B"{ParentBody "KAP Gem"}
Star "HIP 37740 A"
{
	ParentBody "HIP 37740"
	Class      "G9III"
	MassSol    2.07
	RadSol     11
	Luminosity 67.6
	Teff       4932
	FeH        -0.16
	Age        2.67

	Orbit
	{
		RefPlane        "Equator"
		Period          1935.95
		Eccentricity    0.492181
		Inclination     121.007
		AscendingNode   86.7746
		ArgOfPericenter -50.1125
		MeanAnomaly     -69.3998
	}
}

Star "HIP 37740 B"
{
	ParentBody "HIP 37740"
	Class      "K8.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1935.95
		Eccentricity    0.492181
		Inclination     121.007
		AscendingNode   86.7746
		ArgOfPericenter 129.888
		MeanAnomaly     -69.3998
	}
}

// 水府一
Star "HIP 29038 A"
{
	ParentBody "HIP 29038"
	Class      "B3IV"
	MassSol    6.7
	RadSol     4.3
	Luminosity 1965
	Teff       17880
	FeH        -0.05
	Age        0.0263

	Orbit
	{
		PeriodDays      131.211
		Eccentricity    0.64
		Epoch           2436475.852
		ArgOfPericenter 186.6
		MeanAnomaly     0
		//SemiAmplitude   33.3
	}
}

Star "HIP 29038 B"
{
	ParentBody "HIP 29038"
	Class      "B3V"

	Orbit
	{
		PeriodDays      131.211
		Eccentricity    0.64
		Epoch           2436475.852
		ArgOfPericenter 6.6
		MeanAnomaly     0
	}
}

// 水府二(*)
Star	"HIP 29426 A"
{
	ParentBody     "HIP 29426"
	Class	         "B3IV"
	Luminosity      1390
	MassSol         6.7
	Teff            15476
	Age             0.0321

	Orbit
	{
		PeriodDays      45.1
		Eccentricity    0.26
		Epoch           2441962.3
		ArgOfPericenter 25
		MeanAnomaly     0
		//SemiAmplitude   22.4
	}
}

Star	"HIP 29426 B"
{
	ParentBody     "HIP 29426"
	Class	         "B3 IV"

	Orbit
	{
		PeriodDays      45.1
		Eccentricity    0.26
		Epoch           2441962.3
		ArgOfPericenter 205
		MeanAnomaly     0
	}
}

// 水位四(未做任何修改)
Remove "ZET1 CnC"{ParentBody "Tegmine"}
Remove "ZET2 CnC"{ParentBody "ZET CnC"}
Remove "ZET Cnc A"{ParentBody "ZET1 CnC"}
Remove "ZET Cnc B"{ParentBody "ZET1 CnC"}
Remove "ZET2 Cnc Ca"{ParentBody "ZET2 CnC"}
Remove "ZET2 Cnc Cb"{ParentBody "ZET2 CnC"}
Remove "ZET2 Cnc Cb1"{ParentBody "ZET2 CnC Cb"}
Remove "ZET2 Cnc Cb2"{ParentBody "ZET2 CnC Cb"}
Barycenter "ZET1 CnC AB/SAO 97645 AB/HIP 40167 AB"
{
	ParentBody "HIP 40167"
	Orbit
	{
		Period          1115
		Eccentricity    0.24
		Inclination     146
		AscendingNode   74.2
		ArgOfPericenter 345.5
		Epoch           2440587.267435
		MeanAnomaly     0
	}
}

Star "ZET1 Cnc A/HD 68257 A/HR 3208 A/HIP 40167 A"
{
	ParentBody "HIP 40167 AB"
	Radius     2450000
	Class      "F7 V"
	MassSol    1.28
	Teff       6200

	Orbit
	{
		Period          59.582
		Eccentricity    0.3186
		Inclination     173.94
		AscendingNode   157.6
		ArgOfPericenter 330.2
		Epoch           2447559.010525
		MeanAnomaly     0
	}
}

Star "ZET1 Cnc B/HD 68255 B/HR 3209 B/HIP 40167 B"
{
	ParentBody "HIP 40167 AB"
	Radius     1260000
	Class      "F9 V"
	MassSol    1.18
	Teff       6050

	Orbit
	{
		Period          59.582
		Eccentricity    0.3186
		Inclination     173.94
		AscendingNode   157.6
		ArgOfPericenter 150.2
		Epoch           2447559.010525
		MeanAnomaly     0
	}
}

Barycenter "ZET2 CnC C/HIP 40167 C/HR 3210 C/HD 68256 C/SAO 97646 C"
{
	ParentBody "HIP 40167"
	Orbit
	{
		Period          1115
		Eccentricity    0.24
		Inclination     146
		AscendingNode   74.2
		ArgOfPericenter 165.5
		Epoch           2440587.267435
		MeanAnomaly     0
	}
}

Star "ZET2 Cnc C1/HIP 40167 Ca"
{
	ParentBody "HIP 40167 C"
	Class      "G0 V"
	MassSol    1.15
	Teff       6008

	Orbit
	{
		Period          17.32
		Eccentricity    0.08
		Inclination     142
		AscendingNode   77
		ArgOfPericenter 193
		Epoch           2445722.57275
		MeanAnomaly     0
	}
}

Barycenter "ZET2 Cnc Cb1-2/HIP 40167 Cb"
{
	ParentBody "HIP 40167 C"
	MassSol    0.9
	Orbit
	{
		Period          17.32
		Eccentricity    0.08
		Inclination     142
		AscendingNode   77
		ArgOfPericenter 13
		Epoch           2445722.57275
		MeanAnomaly     0
	}
}

Star "ZET2 Cnc Cb1"
{
	ParentBody "HIP 40167 Cb"
	Class      "M0V"
	MassSol    0.45
	Orbit
	{
		PeriodDays      10 // no data
		Eccentricity    0
		Inclination     142
		AscendingNode   77
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "ZET2 Cnc Cb2"
{
	ParentBody "HIP 40167 Cb"
	Class      "M0V"
	MassSol    0.45
	Orbit
	{
		PeriodDays      10 // no data
		Eccentricity    0
		Inclination     142
		AscendingNode   77
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 四渎四
Remove "EPS Mon A"{ParentBody "EPS Mon"}
Remove "EPS Mon B"{ParentBody "EPS Mon"}
Remove "EPS Mon Aa"{ParentBody "EPS Mon A"}
Remove "EPS Mon Ab"{ParentBody "EPS Mon A"}
Barycenter "四渎四/EPS Mon Aab/BD+04° 1236/FK5 244/GC 8240/HD 44769 A/HIP 30419 A/HR 2298/SAO 113810"
{
	ParentBody "EPS Mon"
	Orbit
	{
		Period          6060
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "济河/HIP 30419 Aa"
{
	ParentBody "HIP 30419 A"
	Class      "A5 IV"
	MassSol    2.04
	RadSol     2.5
	Luminosity 25
	Teff       7923
	FeH        -0.11

	Orbit
	{
		PeriodDays      331
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 30419 Ab"
{
	ParentBody "HIP 30419 A"
	Class      "F4 V" // Generate

	Orbit
	{
		PeriodDays      331
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 30422 B/BD+04° 1237/GC 8241/HD 44770/HR 2299/SAO 113811"
{
	ParentBody "EPS Mon"
	Class      "F5 V"
	MassSol    1.16
	RadSol     1.1
	Luminosity 2.39
	Teff       7923

	Orbit
	{
		Period          6060
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 军市二
Star	"HIP 31700 A"
{
	ParentBody     "HIP 31700"
	Class	         "K0II"
	Luminosity      398
	MassSol         3.38
	RadSol          32.7
	Teff            4510
	FeH             -0.24
	RotationDays    183
	Age             0.38

	Orbit
	{
		RefPlane        "Equator"
		Period          21.5376
		Eccentricity    0.772512
		Inclination     88.3029
		AscendingNode   17.5561
		ArgOfPericenter -96.8207
		MeanAnomaly     -102.653
	}
}

Star	"HIP 31700 B"
{
	ParentBody     "HIP 31700"
	Class	         "B6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          21.5376
		Eccentricity    0.772512
		Inclination     88.3029
		AscendingNode   17.5561
		ArgOfPericenter 83.1793
		MeanAnomaly     -102.653
	}
}

// 子一(双星？)(*)
Star	"HIP 27810 A"
{
	ParentBody     "HIP 27810"
	Class	         "B5V"
	Luminosity      213
	MassSol         4
	RadSol          3.4
	Teff            13524
	FeH             -0.06
	Age             0.0566

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00746427
		Eccentricity    0
		Inclination     71.6178
		AscendingNode   -175.553
		ArgOfPericenter -127.146
		MeanAnomaly     101.098
	}
}

Star	"HIP 27810 B"
{
	ParentBody     "HIP 27810"
	Class	         "F2.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00746427
		Eccentricity    0
		Inclination     71.6178
		AscendingNode   -175.553
		ArgOfPericenter 52.8544
		MeanAnomaly     101.098
	}
}

// 阙丘一
Star	"HIP 32578 A"
{
	ParentBody     "HIP 32578"
	Class	         "K0+IIIaBa0.2"
	Luminosity      311.2
	RadSol          26.95
	Teff            4750
	FeH             -0.03

	Orbit
	{
		PeriodDays      1760.9
		Eccentricity    0.4
		Inclination     96.25
		AscendingNode   47.63
		Epoch           2441942.5
		ArgOfPericenter 352.6
		MeanAnomaly     0
	}
}

Star	"HIP 32578 B"
{
	ParentBody     "HIP 32578"
	Class	         "WD" // ?

	Orbit
	{
		PeriodDays      1760.9
		Eccentricity    0.4
		Inclination     96.25
		AscendingNode   47.63
		Epoch           2441942.5
		ArgOfPericenter 172.6
		MeanAnomaly     0
	}
}

// 天狼(本体不做修改，轨道数据为宇宙沙盘模拟后结果)
//Remove "Sirius A"{ParentBody "Sirius"}
//Remove "Sirius B"{ParentBody "Sirius"}
Star	"Sirius A/ALF Cen A/Dog Star"
{
	ParentBody  "Sirius"
	Class       "A0mA1Va"
	MassSol     2.063
	RadSol      1.711
	Luminosity  25.4
	Teff        9940
	FeH         0.5
	RotationPeriod 136
	Oblateness  0
	Age         0.242

	Orbit
	{
		Period          50.1284
		//SemiMajorAxis   6.73   // mass ratio 1.99:1.03
		Eccentricity    0.59142
		Inclination     136.336
		AscendingNode   45.4
		Epoch           2401994.5715
		ArgOfPericenter 329.161
		MeanAnomaly     -40.7
	}
}

Star	"Sirius B/ALF CMa B"
{
	ParentBody  "Sirius"
	Class       "DA2"
	MassSol     1.018
	RadSol      0.0084
	Luminosity  0.056
	Teff        25000
	Age         0.228

	RotationEpoch  2451545
	RotationPeriod 5.3
	Oblateness     0
	Obliquity      136
	EqAscendNode   121

	Orbit
	{
		Period          50.1284
		//SemiMajorAxis   13.00  // mass ratio 1.99:1.03
		Eccentricity    0.59142
		Inclination     136.336
		AscendingNode   45.4
		Epoch           2401994.5715
		ArgOfPericenter 149.161
		MeanAnomaly     -40.7
	}
}

// 弧矢三(*)
Star	"HIP 37819 A"
{
	ParentBody     "HIP 37819"
	Class	         "K2.5Ib" // K5IIa
	MassSol         9.8
	RadSol          202
	Luminosity      9600
	Teff            4000

	Orbit
	{
		RefPlane        "Equator"
		Period          1.14397
		Eccentricity    0
		Inclination     175.535
		AscendingNode   152.418
		ArgOfPericenter 41.9846
		MeanAnomaly     142.634
	}
}

Star	"HIP 37819 B"
{
	ParentBody     "HIP 37819"
	Class	         "B9V"
	MassSol         2.8
	RadSol          2.4
	Luminosity      65
	Teff            10200

	Orbit
	{
		RefPlane        "Equator"
		Period          1.14397
		Eccentricity    0
		Inclination     175.535
		AscendingNode   152.418
		ArgOfPericenter 221.985
		MeanAnomaly     142.634
	}
}

// 弧矢五
Star	"HIP 38070 A"
{
	ParentBody     "HIP 38070"
	Class	         "B1IVnne"
	MassSol         15.5
	LumBol          59279
	Teff            24200
	Age             0.0111

	Orbit
	{
		PeriodDays      28.903
		Eccentricity    0
		Epoch           2456012.93
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 38070 B"
{
	ParentBody     "HIP 38070"
	Class	         "sdO"

	Orbit
	{
		PeriodDays      28.903
		Eccentricity    0
		Epoch           2456012.93
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 弧矢六(*)(k2为光学伴星)
Star	"HIP 37229 A/HR 2948/HD 61555/SAO 174198"
{
	ParentBody     "HIP 37229"
	Class	         "B5 IV"
	MassSol        4.3
	RadSol         3.7
	Luminosity     490
	Teff           13600

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0781915
		Eccentricity    0.0674442
		Inclination     42.5716
		AscendingNode   -3.15444
		ArgOfPericenter 169.247
		MeanAnomaly     -31.7807
	}
}

Star	"HIP 37229 B"
{
	ParentBody     "HIP 37229"
	Class	         "A4.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0781915
		Eccentricity    0.0674442
		Inclination     42.5716
		AscendingNode   -3.15444
		ArgOfPericenter 349.247
		MeanAnomaly     -31.7807
	}
}

// 弧矢七(*)
Remove "Adhara A"{ParentBody "Adhara"}
Remove "Adhara B"{ParentBody "Adhara"}
Star "HIP 33579 A"
{
	ParentBody "HIP 33579"
	Class      "B2II"
	MassSol    12.6
	RadSol     13.9
	Luminosity 38700
	Teff       22900
	Age        0.0225

	Orbit
	{
		Period          7500
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 33579 B"
{
	ParentBody "HIP 33579"
	Class      ""
	MassSol    11.4409 // 就来个跟主星差不多的吧

	Orbit
	{
		Period          7500
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
