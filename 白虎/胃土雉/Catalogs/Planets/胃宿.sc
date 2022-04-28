// 胃宿一
Remove "35 Ari A"{ParentBody "35 Ari"}
Remove "35 Ari B"{ParentBody "35 Ari"}
Star "HIP 12719 A"
{
	ParentBody "HIP 12719"
	Class      "B3V"
	MassSol    5.7
	RadSol     2.2
	Luminosity 870
	Teff       17520
	Age        0.0055

	Orbit
	{
		PeriodDays      490
		Eccentricity    0.14
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 12719 B"
{
	ParentBody "HIP 12719"
	Class      ""
	MassSol    3 // Unknown

	Orbit
	{
		PeriodDays      490
		Eccentricity    0.14
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 胃宿三(*)
Remove "41 Ari A"{ParentBody "Bharani"}
Remove "41 Ari B"{ParentBody "Bharani"}
Barycenter	"HIP 13209 A"
{
	ParentBody     "HIP 13209"
	Orbit
	{
		RefPlane        "Equator"
		Period          5.31317
		Eccentricity    0.832167
		Inclination     25.8315
		AscendingNode   -132.005
		ArgOfPericenter -68.6627
		MeanAnomaly     64.8474
	}
}

Star	"HIP 13209 Aa"
{
	ParentBody     "HIP 13209 A"
	Class	       "B8 V"
	MassSol        3.1
	Luminosity     160
	Teff           11900
	Age            0.13

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00774976
		Eccentricity    0
		Inclination     -44.6039
		AscendingNode   24.2657
		ArgOfPericenter -103.597
		MeanAnomaly     106.348
	}
}

Star	"HIP 13209 Ab"
{
	ParentBody     "HIP 13209 A"
	Class	       "A9.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00774976
		Eccentricity    0
		Inclination     -44.6039
		AscendingNode   24.2657
		ArgOfPericenter 76.4028
		MeanAnomaly     106.348
	}
}

Star	"HIP 13209 B"
{
	ParentBody     "HIP 13209"
	Class	         "F5.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          5.31317
		Eccentricity    0.832167
		Inclination     25.8315
		AscendingNode   -132.005
		ArgOfPericenter 111.337
		MeanAnomaly     64.8474
	}
}

// 天廪一
Star "HIP 16369 A"
{
	ParentBody "HIP 16369"
	Class      "K0III"
	MassSol    4
	RadSol     8.5
	Luminosity 329.38
	Teff       4644
	Age        0.05

	Orbit
	{
		PeriodDays      960
		Eccentricity    0.397
		Inclination     36.95
		AscendingNode   207.61
		Epoch           2414889.565
		ArgOfPericenter 146.32
		MeanAnomaly     0
		//SemiAmplitude   8.25
	}
}

Star "HIP 16369 B"
{
	ParentBody "HIP 16369"
	Class      ""
	MassSol    1.13

	Orbit
	{
		PeriodDays      960
		Eccentricity    0.397
		Inclination     36.95
		AscendingNode   207.61
		Epoch           2414889.565
		ArgOfPericenter 326.32
		MeanAnomaly     0
	}
}

// 天廪三
Remove "KSI Tau (ABC)"{ParentBody "KSI Tau"}
Remove "KSI Tau (AB)"{ParentBody "KSI Tau (ABC)"}
Remove "KSI Tau A"{ParentBody "KSI Tau (AB)"}
Remove "KSI Tau B"{ParentBody "KSI Tau (AB)"}
Remove "KSI Tau C"{ParentBody "KSI Tau (ABC)"}
Remove "KSI Tau D"{ParentBody "KSI Tau"}
Barycenter "HIP 16083 A-B"
{
	ParentBody "HIP 16083"
	Orbit
	{
		Period          51
		Eccentricity    0.573
		Inclination     25.4
		AscendingNode   106.4
		Epoch           2465615
		ArgOfPericenter 10.6
		MeanAnomaly     0
	}
}

Barycenter "HIP 16083 A"
{
	ParentBody "HIP 16083 A-B"
	Orbit
	{
		PeriodDays      145.12
		Eccentricity    0.213
		Inclination     87.07
		AscendingNode   328.63
		Epoch           2453712.9
		ArgOfPericenter 343.07
		MeanAnomaly     0
		//SemiAmplitude   38.02
	}
}

Star "HIP 16083 Aa"
{
	ParentBody "HIP 16083 A"
	Class      "B8Vn"
	MassSol    2.29
	RadSol     2
	Teff       9400

	Orbit
	{
		PeriodDays      7.146651
		Eccentricity    0
		Inclination     86.2
		AscendingNode   350.5
		Epoch           2448299.075
		ArgOfPericenter 270
		MeanAnomaly     0
		//SemiAmplitude   89.1
	}
}

Star "HIP 16083 Ab"
{
	ParentBody "HIP 16083 A"
	Class      "B8Vn"
	MassSol    2.2
	RadSol     1.5
	Teff       9200

	Orbit
	{
		PeriodDays      7.146651
		Eccentricity    0
		Inclination     86.2
		AscendingNode   350.5
		Epoch           2448299.075
		ArgOfPericenter 90
		MeanAnomaly     0
	}
}

Star "HIP 16083 B"
{
	ParentBody "HIP 16083 A-B"
	Class      "B7Vn"
	MassSol    3.08
	Teff       15100

	Orbit
	{
		PeriodDays      145.12
		Eccentricity    0.213
		Inclination     87.07
		AscendingNode   328.63
		Epoch           2453712.9
		ArgOfPericenter 163.07
		MeanAnomaly     0
	}
}

Star "HIP 16083 C"
{
	ParentBody "HIP 16083"
	Class      "F"
	MassSol    1.32

	Orbit
	{
		Period          51
		Eccentricity    0.573
		Inclination     25.4
		AscendingNode   106.4
		Epoch           2465615
		ArgOfPericenter 190.6
		MeanAnomaly     0
	}
}

// 天廪四
Remove "OMI Tau Aa"{ParentBody "OMI Tau"}
Remove "OMI Tau Ab"{ParentBody "OMI Tau"}
Star "HIP 15900 A"
{
	ParentBody "HIP 15900"
	Class      "G6 III"
	MassSol    3.01
	RadSol     18.1
	Luminosity 149.4
	Teff       5180
	FeH        -0.12
	Age        0.38

	Orbit
	{
		PeriodDays      1654.9
		Eccentricity    0.26
		Epoch           2429974.34
		ArgOfPericenter 335.6
		MeanAnomaly     0
		//SemiAmplitude   4.4
	}
}

Star "HIP 15900 B"
{
	ParentBody "HIP 15900"
	Class      ""
	MassSol    0.5
	Orbit
	{
		PeriodDays      1654.9
		Eccentricity    0.26
		Epoch           2429974.34
		ArgOfPericenter 155.6
		MeanAnomaly     0
	}
}

// 天囷四
Remove "MU Cet A"{ParentBody "MU Cet"} // 后来的研究未能找到任何有关伴星的证据
Remove "MU Cet B"{ParentBody "MU Cet"} // 但是我还不确定它到底是不是真的没有伴星

// 天囷五(*)
Remove "KSI1 Cet A"{ParentBody "KSI1 Cet"}
Remove "KSI1 Cet B"{ParentBody "KSI1 Cet"}
Star "HIP 10324 A"
{
	ParentBody "HIP 10324"
	Class      "G6III"
	MassSol    4
	Luminosity 190
	Teff       4200
	Age        0.3

	Orbit
	{
		RefPlane "Static"
	}
}

Star "HIP 10324 Ab(?)" // A可能还有一颗白矮星伴星
{
	ParentBody "HIP 10324"
	Class      "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0779267
		Eccentricity    0
		Inclination     146.392
		AscendingNode   92.681
		ArgOfPericenter 149.186
		MeanAnomaly     150.124
	}
}

Star "HIP 10324 B"
{
	ParentBody "HIP 10324"
	Class      "A2V"
	MassSol    2
	Luminosity 30

	Orbit
	{
		SemiMajorAxis   4.2
		Inclination     106.47
		AscendingNode   71.24
		ArgOfPericenter 180
		Epoch           2434985.5
		MeanAnomaly     0
	}
}

// 天囷六(*)
Star	"HIP 11484 A"
{
	ParentBody     "HIP 11484"
	Class	       "A0III"
	MassSol        2.45
	RadSol         2.6
	Luminosity     74
	Teff           10630
	Age            0.127

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00410157
		Eccentricity    0
		Inclination     -146.303
		AscendingNode   28.0665
		ArgOfPericenter -40.6092
		MeanAnomaly     167.521
	}
}

Star	"HIP 11484 B"
{
	ParentBody     "HIP 11484"
	Class	       "B9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00410157
		Eccentricity    0
		Inclination     -146.303
		AscendingNode   28.0665
		ArgOfPericenter 139.391
		MeanAnomaly     167.521
	}
}

// 天囷七
Barycenter "HIP 12093 A"
{
	ParentBody "HIP 12093"
	Orbit
	{
		Period          12068
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}
Star	"HIP 12093 Aa"
{
	ParentBody     "HIP 12093 A"
	Class	       "G8III"
	MassSol        2.65
	RadSol         15.87
	Luminosity     161.4
	Teff           5164

	Orbit
	{
		PeriodDays      714.48
		Eccentricity    0.274
		Epoch           2456364.9
		ArgOfPericenter 299.5
		MeanAnomaly     0
		//SemiAmplitude   5.09
	}
}

Star	"HIP 12093 Ab"
{
	ParentBody     "HIP 12093 A"
	Class	       ""
	MassSol        0.51

	Orbit
	{
		PeriodDays      714.48
		Eccentricity    0.274
		Epoch           2456364.9
		ArgOfPericenter 119.5
		MeanAnomaly     0
	}
}

Star	"HIP 12093 B"
{
	ParentBody     "HIP 12093"
	Class	       "F7V"
	MassSol        1.18

	Orbit
	{
		Period          12068
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天囷八
Remove "GAM Cet (AB)"{ParentBody "GAM Cet"}
Remove "GAM Cet A"{ParentBody "GAM Cet (AB)"}
Remove "GAM Cet B"{ParentBody "GAM Cet (AB)"}
Remove "GAM Cet C"{ParentBody "GAM Cet"}
Barycenter "HIP 12706 AB"
{
	ParentBody "HIP 12706"
	Orbit
	{
		Period          1412000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 12706 A"
{
	ParentBody "HIP 12706 AB"
	Class      "A3V"
	MassSol    1.88
	RadSol     1.9
	Luminosity 21
	Teff       8551
	FeH        0
	Age        0.647

	Orbit
	{
		Period          166.411
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 12706 B"
{
	ParentBody "HIP 12706 AB"
	Class      "F3V"
	MassSol    1.17
	Teff       6051

	Orbit
	{
		Period          166.411
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 12706 C"
{
	ParentBody "HIP 12706"
	Class      "K5"
	MassSol    0.64

	Orbit
	{
		Period          1412000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 大陵二
Remove "TAU Per A"{ParentBody "TAU Per"}
Remove "TAU Per B"{ParentBody "TAU Per"}
Star "HIP 13531 A"
{
	ParentBody "HIP 13531"
	Class      "G8III"
	MassSol    2.99
	RadSol     16.08
	Luminosity 191
	Teff       5507
	FeH        -0.2
	Age        0.39

	Orbit
	{
		Period          4.149
		Eccentricity    0.728
		Inclination     94.5
		AscendingNode   100.6
		//EpochB          2013.888
		ArgOfPericenter 234.1
		MeanAnomaly     0
	}
}

Star "HIP 13531 B"
{
	ParentBody "HIP 13531"
	Class      "A3V"
	MassSol    1.8
	RadSol     2.2
	Teff       8970

	Orbit
	{
		Period          4.149
		Eccentricity    0.728
		Inclination     94.5
		AscendingNode   100.6
		//EpochB          2013.888
		ArgOfPericenter 54.1
		MeanAnomaly     0
	}
}

// 大陵四(*)
Barycenter	"HIP 14668 A"
{
	ParentBody     "HIP 14668"
	Orbit
	{
		RefPlane        "Equator"
		Period          2.89539
		Eccentricity    0.0936665
		Inclination     -65.5734
		AscendingNode   -113.88
		ArgOfPericenter -43.5282
		MeanAnomaly     146.479
	}
}

Star	"HIP 14668 Aa"
{
	ParentBody     "HIP 14668 A"
	Class	       "G9.5IIIb"
	MassSol        1.5
	RadSol         9
	Luminosity     39.8
	Teff           4857
	FeH            0.04
	Age            4.58

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0233745
		Eccentricity    0
		Inclination     -89.6121
		AscendingNode   -81.9757
		ArgOfPericenter 146.464
		MeanAnomaly     2.74633
	}
}

Star	"HIP 14668 Ab"
{
	ParentBody     "HIP 14668 A"
	Class	       "L4.1 V" // 系统生成的红矮星伴星

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0233745
		Eccentricity    0
		Inclination     -89.6121
		AscendingNode   -81.9757
		ArgOfPericenter 326.464
		MeanAnomaly     2.74633
	}
}

Star	"HIP 14668 B"
{
	ParentBody     "HIP 14668"
	Class	       "F2.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          2.89539
		Eccentricity    0.0936665
		Inclination     -65.5734
		AscendingNode   -113.88
		ArgOfPericenter 136.472
		MeanAnomaly     146.479
	}
}

// 大陵五
Remove "Algol (AB)"{ParentBody "Algol"}
Remove "Algol A"{ParentBody "Algol (AB)"}
Remove "Algol B"{ParentBody "Algol (AB)"}
Remove "Algol C"{ParentBody "Algol"}
Barycenter	"HIP 14576 Aab"
{
	ParentBody	"HIP 14576"
	Orbit
	{
		PeriodDays		680.168
		Eccentricity	0.227
		Inclination		83.66
		AscendingNode	132.66
		Epoch         2446927.22
		ArgOfPericenter	310.02
		MeanAnomaly     0
	}
}

Star	"HIP 14576 Aa"
{
	ParentBody	"HIP 14576 Aab"
	Class		"B8V"
	MassSol     3.17
	RadSol      2.73
	Luminosity  182
	Teff        13000
	Age         0.57

	Oblateness  0

	Orbit
	{
		PeriodDays		2.867328
		Eccentricity	0
		Inclination		98.7
		AscendingNode	43.43
		ArgOfPericenter 242
		MeanAnomaly     0
	}
}

Star	"HIP 14576 Ab"
{
	ParentBody	"HIP 14576 Aab"
	Class		"K0IV"
	MassSol     0.7
	RadSol      3.48
	Luminosity  6.92
	Teff        4500

	Oblateness  0

	Orbit
	{
		PeriodDays		2.867328
		Eccentricity	0
		Inclination		98.7
		AscendingNode	43.43
		ArgOfPericenter 62
		MeanAnomaly     0
	}
}

Star	"HIP 14576 Ac"
{
	ParentBody	"Algol"
	Class		"A7m"
	MassSol     1.76
	RadSol      1.73
	Luminosity  10
	Teff        7500

	Oblateness  0

	Orbit
	{
		PeriodDays		680.168
		Eccentricity	0.227
		Inclination		83.66
		AscendingNode	132.66
		Epoch         2446927.22
		ArgOfPericenter	130.02
		MeanAnomaly     0
	}
}

// 大陵八
Remove "12 Per A"{ParentBody "12 Per"}
Remove "12 Per B"{ParentBody "12 Per"}
Star "HIP 12623 A"
{
	ParentBody "HIP 12623"
	Class      "F9V"
	MassSol    1.382
	RadSol     1.55
	Luminosity 3.02
	Teff       6195
	FeH        0.35
	Age        1.12

	Orbit
	{
		PeriodDays      330.98
		Eccentricity    0.663
		Inclination     127.17
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 12623 B"
{
	ParentBody "HIP 12623"
	Class      ""
	MassSol    1.24
	RadSol     1.31
	Luminosity 1.86
	Teff       6000

	Orbit
	{
		PeriodDays      330.98
		Eccentricity    0.663
		Inclination     127.17
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天船一(Triple System with procedural data)
Star	"HIP 13268 A"
{
	ParentBody     "HIP 13268"
	Class	         "K3 Ib"
	RadSol         134
	Luminosity     4130
	Teff           3986

	Orbit
	{
		RefPlane        "Equator"
		Period          37.5277
		Eccentricity    0.132631
		Inclination     -176.289
		AscendingNode   24.5701
		ArgOfPericenter 178.537
		MeanAnomaly     173.997
	}
}

Star	"HIP 13268 B"
{
	ParentBody   "HIP 13268"
	Class	       ""
	MassSol      10.7138 // Generate
	AbsMagn      -1.5 // Limit luminosity

	Orbit
	{
		RefPlane        "Equator"
		Period          37.5277
		Eccentricity    0.132631
		Inclination     -176.289
		AscendingNode   24.5701
		ArgOfPericenter 358.537
		MeanAnomaly     173.997
	}
}

Star	"HD 237009"
{
	ParentBody   "HIP 13268"
	Class	       "B9V"

	Orbit
	{
		Period          1000 // Guess
	}
}

// 天船二
Remove "GAM Per A"{ParentBody "GAM Per"}
Remove "GAM Per B"{ParentBody "GAM Per"}
Star "HIP 14328 A"
{
	ParentBody "HIP 14328"
	Class      "G8III"
	MassSol    2.7
	Teff       5170
	FeH        -0.19
	RotationDays 5350

	Orbit
	{
		Period          14.6
		Eccentricity    0.785
		Inclination     90.9
		AscendingNode   244.1
		//EpochB          1991.08
		ArgOfPericenter 350
		MeanAnomaly     0
	}
}

Star "HIP 14328 B"
{
	ParentBody "HIP 14328"
	Class      "A2V"
	MassSol    1.65
	Teff       7895

	Orbit
	{
		Period          14.6
		Eccentricity    0.785
		Inclination     90.9
		AscendingNode   244.1
		//EpochB          1991.08
		ArgOfPericenter 170
		MeanAnomaly     0
	}
}

// 天船七
Remove "MU Per A"{ParentBody "MU Per"}
Remove "MU Per B"{ParentBody "MU Per"}
Star "HIP 19812 A"
{
	ParentBody "HIP 19812"
	Class      "G0 Ib"
	RadSol     53
	Luminosity 2030
	Teff       5418
	FeH        0.09

	Orbit
	{
		PeriodDays      284
		Eccentricity    0.062
		Inclination     74
		AscendingNode   296
		Epoch           2420062
		ArgOfPericenter 122
		MeanAnomaly     0
	}
}

Star "HIP 19812 B"
{
	ParentBody "HIP 19812"
	Class      ""
	MassSol    3.64

	Orbit
	{
		PeriodDays      284
		Eccentricity    0.062
		Inclination     74
		AscendingNode   296
		Epoch           2420062
		ArgOfPericenter 302
		MeanAnomaly     0
	}
}
