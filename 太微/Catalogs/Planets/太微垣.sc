// 太微左垣一(SB***)
Remove "ETA Vir A"{ParentBody "ETA Vir"}
Remove "ETA Vir B"{ParentBody "ETA Vir"}
Remove "ETA Vir Aa"{ParentBody "ETA Vir A"}
Remove "ETA Vir Ab"{ParentBody "ETA Vir A"}
Barycenter "HIP 60129 A"
{
	ParentBody "HIP 60129"
	Orbit
	{
		PeriodDays      7896.2
		Eccentricity    0.133
		Inclination     50.6
		AscendingNode   173
		Epoch           2447965.15985
		ArgOfPericenter 4
		MeanAnomaly     0
	}
}

Star "HIP 60129 Aa"
{
	ParentBody "HIP 60129 A"
	Class      "A2V"
	MassSol    2.5039
	Teff       9333
	FeH        0.11

	Orbit
	{
		PeriodDays      71.7916
		Eccentricity    0.244
		Inclination     45.5
		Epoch           2454403.6116
		ArgOfPericenter 197.21
		MeanAnomaly     0
	}
}

Star "HIP 60129 Ab"
{
	ParentBody "HIP 60129 A"
	Class      ""
	MassSol    1.8907

	Orbit
	{
		PeriodDays      71.7916
		Eccentricity    0.244
		Inclination     45.5
		Epoch           2454403.6116
		ArgOfPericenter 17.21
		MeanAnomaly     0
	}
}

Star "HIP 60129 B"
{
	ParentBody "HIP 60129"
	Class      ""
	MassSol    1.66

	Orbit
	{
		PeriodDays      7896.2
		Eccentricity    0.133
		Inclination     50.6
		AscendingNode   173
		Epoch           2447965.15985
		ArgOfPericenter 184
		MeanAnomaly     0
	}
}

// 太微左垣二(PM**)
Remove "Porrima A"{ParentBody "Porrima"}
Remove "Porrima B"{ParentBody "Porrima"}
Star "HIP 61941 A/HD 110379 A/HR 4825/LFT 937/LTT 4843"
{
	ParentBody "HIP 61941"
	Class      "F0V"
	MassSol    1.56
	Teff       6757
	FeH        -0.07
	Age        1.14

	Orbit
	{
		Period          168.93
		Eccentricity    0.8825
		Inclination     148.82
		AscendingNode   213.79
		Epoch           2453530.72047507
		ArgOfPericenter 255.02
		MeanAnomaly     0
	}
}

Star "HIP 61941 B/HD 110380 B/HR 4826/LTT 4844"
{
	ParentBody "HIP 61941"
	Class      "F0V"

	Orbit
	{
		Period          168.93
		Eccentricity    0.8825
		Inclination     148.82
		AscendingNode   213.79
		Epoch           2453530.72047507
		ArgOfPericenter 75.02
		MeanAnomaly     0
	}
}

// 太微左垣三(RG**?)
Star "HIP 63090 A"
{
	ParentBody "HIP 63090"
	Class      "M3III"
	MassSol    1.4
	RadSol     48
	Luminosity 468
	Teff       3999
	FeH        -0.16

	Orbit
	{
		Period          200000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 63090 B"
{
	ParentBody "HIP 63090"
	Class      "K"

	Orbit
	{
		Period          200000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 太微左垣五(**)
Remove "Diadem A"{ParentBody "Diadem"}
Remove "Diadem B"{ParentBody "Diadem"}
Star "HIP 64241 A"
{
	ParentBody "HIP 64241"
	Class      "F5V"
	MassSol    1.237
	Luminosity 1.72
	Teff       6365
	FeH        -0.23

	Orbit
	{
		Period          25.8696
		Eccentricity    0.51060
		Inclination     90.0501
		AscendingNode   12.2272
		Epoch           2457057.34
		ArgOfPericenter 280.563
		MeanAnomaly     0
	}
}

Star "HIP 64241 B"
{
	ParentBody "HIP 64241"
	Class      "F5V"
	MassSol    1.087
	Luminosity 1.75
	Teff       6378

	Orbit
	{
		Period          25.8696
		Eccentricity    0.51060
		Inclination     90.0501
		AscendingNode   12.2272
		Epoch           2457057.34
		ArgOfPericenter 100.563
		MeanAnomaly     0
	}
}

// 太微右垣三(SB***)
Remove "IOT Leo A"{ParentBody "IOT Leo"}
Remove "IOT Leo B"{ParentBody "IOT Leo"}
Barycenter "HIP 55642 A"
{
  ParentBody "HIP 55642"
	Orbit
	{
		Period          186
		Eccentricity    0.53
		Inclination     128
		AscendingNode   235
		Epoch           2432844.13282051
		ArgOfPericenter 145
		MeanAnomaly     0
	}
}

Star "HIP 55642 A1"
{
	ParentBody "HIP 55642 A"
	Class      "F4IV"
	MassSol    1.62
	RadSol     2.1
	Luminosity 11.5
	Teff       6739
	FeH        0.06
	Age        1.7

	Orbit
	{
		RefPlane        "Equator"
		Period          0.336088595
		Eccentricity    0.205320626
		Inclination     -2.14215612
		AscendingNode   0
		ArgOfPericenter 121.136417
		MeanAnomaly     -38.7230254
	}
}

Star "HIP 55642 A2"
{
	ParentBody "HIP 55642 A"
	Class      "K2.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.336088595
		Eccentricity    0.205320626
		Inclination     -2.14215612
		AscendingNode   0
		ArgOfPericenter 301.136417
		MeanAnomaly     -38.7230254
	}
}

Star "HIP 55642 B"
{
	ParentBody "HIP 55642"
	Class      "G"
	MassSol    1.08

	Orbit
	{
		Period          186
		Eccentricity    0.53
		Inclination     128
		AscendingNode   235
		Epoch           2432844.13282051
		ArgOfPericenter 325
		MeanAnomaly     0
	}
}

// 五诸侯一(**)
Star "HIP 63948 A"
{
	ParentBody "HIP 63948"
	Class      "F4V"

	Orbit
	{
		Period          756.15557751
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 63948 B"
{
	ParentBody "HIP 63948"
	Class      "F9.1 V"

	Orbit
	{
		Period          756.15557751
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 内屏三(SB**)
Remove "PI Vir A"{ParentBody "PI Vir"}
Remove "PI Vir B"{ParentBody "PI Vir"}
Star "HIP 58590 A"
{
	ParentBody "HIP 58590"
	Class      "A5 V"
	MassSol    2.2
	RadSol     1.5
	Teff       8000

	Orbit
	{
		PeriodDays      282.69
		Eccentricity    0.265
		Inclination     62.71
		AscendingNode   149.34
		Epoch           2448281.3906
		ArgOfPericenter 132
		//SemiAmplitude   26.2
		MeanAnomaly     0
	}
}

Star "HIP 58590 B"
{
	ParentBody "HIP 58590"
	Class      ""  //unknown,related with appmag
	MassSol    1.034 //Calculated with mass ratio 0.47

	Orbit
	{
		PeriodDays      282.69
		Eccentricity    0.265
		Inclination     62.71
		AscendingNode   149.34
		Epoch           2448281.3906
		ArgOfPericenter 312
		MeanAnomaly     0
	}
}

// 内屏四(PM**)
Star	"HIP 58948 A"
{
	ParentBody     "HIP 58948"
	Class          "G8IIIaCN-1Ba1CH1"
	MassSol        2.17
	RadSol         9.62
	Luminosity     57
	Teff           5107
	FeH            -0.3
	Age            0.88

	Orbit
	{
		RefPlane        "Equator"
		Period          13.2386832
		Eccentricity    0.0210146699
		Inclination     -1.94427013
		AscendingNode   0
		ArgOfPericenter 144.322435
		MeanAnomaly     157.683723
	}
}

Star	"HIP 58948 B"
{
	ParentBody     "HIP 58948"
	Class          "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          13.2386832
		Eccentricity    0.0210146699
		Inclination     -1.94427013
		AscendingNode   0
		ArgOfPericenter 324.322435
		MeanAnomaly     157.683723
	}
}

// 太子(RS**)
Star "HIP 57565 A"
{
  ParentBody "HIP 57565"
	Class      "G5III"
	MassSol    2.25
	RadSol     9.1
	Luminosity 49.4
	Teff       5100

	Orbit
	{
	  PeriodDays      71.69
		Eccentricity    0
		Inclination     50.1
		AscendingNode   138
		Epoch           2447642.6
		ArgOfPericenter 180
		//SemiAmplitude   29.67
		MeanAnomaly 0
	}
}

Star "HIP 57565 B"
{
  ParentBody "HIP 57565"
	Class      "A7V"
	MassSol    1.97
	RadSol     2.7
	Luminosity 23.9
	Teff       7800

	Orbit
	{
		PeriodDays      71.69
		Eccentricity    0
		Inclination     50.1
		AscendingNode   138
		Epoch           2447642.6
		ArgOfPericenter 0
		//SemiAmplitude   33.8
		MeanAnomaly     0
	}
}

// 常陈一(a2**)
Remove "Cor Caroli A"{ParentBody "Cor Caroli"}
Remove "Cor Caroli B"{ParentBody "Cor Caroli"}
Star "常陈一/ALF2 CVn A/ALF CVn A/12 CVn A/FK5 485/GC 17557/HD 112413/HIP 63125/HR 4915/SAO 63257"
{ // 此处为了不冲突
	ParentBody "Cor Caroli"
	Class      "A0VpSiEuHg"
	MassSol    2.97
	RadSol     2.49
	Luminosity 101
	Teff       11600
	RotationPeriod 131.26536
	Age        0.165

	Orbit
	{
		Period          8522.79502037
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "ALF1 CVn B/ALF CVn B/12 CVn B/GC 17556/HD 112412/HIP 63121/HR 4914/SAO 63256"
{
	ParentBody "Cor Caroli"
	Class      "F2V"
	MassSol    1.47
	RadSol     1.5
	Teff       7080

	Orbit
	{
		Period          8522.79502037
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 郎位五(a2***)
Star "郎位五/17 Com A/AI Com/BD+26 2354/GC 17012/HD 108662/HIP 60904/HR 4752/SAO 82330"
{
	ParentBody "ADS 8568"
	Class      "A0SrCrEu"
	MassSol    2.38
	RadSol     2.09
	Luminosity 42.7
	Teff       10212
	Age        0.101

	Orbit
	{
		Period          711647.47036549
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "17 Com B/BD+26 2353/GC 17007/HD 108651/HIP 60891/HR 4751/SAO 82328"
{
  ParentBody "ADS 8568"
	Orbit
	{
		Period          711647.47036549
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 108651 Ba"
{
	ParentBody "HD 108651"
	Class      "A2hA9VmF0"
	MassSol    1.74
	Teff       8068

	Orbit
	{
		PeriodDays      68.29
		Eccentricity    0.296
		Epoch           2448313.4
		ArgOfPericenter 80.7
		MeanAnomaly     0
		//SemiAmplitude   14
	}
}

Star "HD 108651 Bb"
{
	ParentBody "HD 108651"
	Class      "F0?"

	Orbit
	{
		PeriodDays      68.29
		Eccentricity    0.296
		Epoch           2448313.4
		ArgOfPericenter 260.7
		MeanAnomaly     0
	}
}

// 郎位六(a2**)
Star	"HIP 60514 A"
{
	ParentBody     "HIP 60514"
	Class          "A3V"
	MassSol        2.83
	Luminosity     60.93
	Teff           8846
	FeH            0.24
	Age            0.429

	Orbit
	{
		RefPlane        "Equator"
		Period          3.11709895
		Eccentricity    0.851811767
		Inclination     -1.86530781
		AscendingNode   0
		ArgOfPericenter 264.017892
		MeanAnomaly     -165.108293
	}
}

Star	"HIP 60514 B(?)"
{
	ParentBody     "HIP 60514"
	Class          "Q"

	Orbit
	{
		RefPlane        "Equator"
		Period          3.11709895
		Eccentricity    0.851811767
		Inclination     -1.86530781
		AscendingNode   0
		ArgOfPericenter 84.0178916
		MeanAnomaly     -165.108293
	}
}

// 郎位七(SB**)
Star	"HIP 60351 A"
{
	ParentBody     "HIP 60351"
	Class	         "F6III"
	MassSol        2.6
	RadSol         8.9
	Luminosity     56.2
	Teff           5300
	Age            0.67

	Orbit
	{
		PeriodDays      396.54
		Eccentricity    0.566
		Inclination     66
		Epoch           2444502.4
		ArgOfPericenter 275.5
		MeanAnomaly     0
		//SemiAmplitude   22.42
	}
}

Star	"HIP 60351 B"
{
	ParentBody     "HIP 60351"
	Class	         "A3V"
	MassSol        2.05
	RadSol         2.5
	Luminosity     30.2
	Teff           8500

	Orbit
	{
		PeriodDays      396.54
		Eccentricity    0.566
		Inclination     66
		Epoch           2444502.4
		ArgOfPericenter 95.5
		MeanAnomaly     0
		//SemiAmplitude   22.42
	}
}

// 郎位十一(**)
Star	"HIP 61394 A"
{
	ParentBody     "HIP 61394"
	Class	         "A0IV"
	MassSol        2.15
	RadSol         3
	Luminosity     104
	Teff           9675
	Age            0.21

	Orbit
	{
		Period          33.04
		Eccentricity    0.898
		Inclination     109.7
		AscendingNode   24.3
		Epoch           2438622.26440523
		ArgOfPericenter 34.5
		MeanAnomaly     0
	}
}

Star	"HIP 61394 B"
{
	ParentBody     "HIP 61394"
	Class	         "F4 V"

	Orbit
	{
		Period          33.04
		Eccentricity    0.898
		Inclination     109.7
		AscendingNode   24.3
		Epoch           2438622.26440523
		ArgOfPericenter 214.5
		MeanAnomaly     0
	}
}

// 郎位十五(**)
Star	"HIP 58858 A"
{
	ParentBody     "HIP 58858"
	Class	         "F0IV"

	Orbit
	{
		Period          8310.86632108
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 58858 B"
{
	ParentBody     "HIP 58858"
	Class	         "F2.1 V"

	Orbit
	{
		Period          8310.86632108
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 灵台一(PM**)
Remove "CHI Leo A"{ParentBody "CHI Leo"}
Remove "CHI Leo B"{ParentBody "CHI Leo"}
Star "HIP 54182 A"
{
	ParentBody "HIP 54182"
	Class      "F2III"
	MassSol    1.62
	RadSol     1.99
	Luminosity 9.9
	Teff       7022
	FeH        0.03
	Age        1.4

	Orbit
	{
		Period          1018.61319111
		Epoch           2447892.11141029
		ArgOfPericenter 84
		MeanAnomaly     0
	}
}

Star "HIP 54182 B"
{
	ParentBody "HIP 54182"
	Class      "F8.3 V"

	Orbit
	{
		Period          1018.61319111
		Epoch           2447892.11141029
		ArgOfPericenter 264
		MeanAnomaly     0
	}
}

// 灵台三(**)
Star	"HIP 53807 A"
{
	ParentBody     "HIP 53807"
	Class          "K0.5III"
	MassSol        1.89
	Luminosity     182
	Teff           4519
	FeH            -0.16
	Age            1.69

	Orbit
	{
		RefPlane        "Equator"
		Period          7.6935914
		Eccentricity    0.817490518
		Inclination     -2.135921
		AscendingNode   0
		ArgOfPericenter -176.272271
		MeanAnomaly     -147.388367
	}
}

Star	"HIP 53807 B"
{
	ParentBody     "HIP 53807"
	Class          "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          7.6935914
		Eccentricity    0.817490518
		Inclination     -2.135921
		AscendingNode   0
		ArgOfPericenter 3.72772923
		MeanAnomaly     -147.388367
	}
}

// 少微二(**)
Remove "54 Leo A"{ParentBody "54 Leo"}
Remove "54 Leo B"{ParentBody "54 Leo"}
Star "HIP 53417 A/HD 94601/HR 4259/SAO 81583"
{
	ParentBody "HIP 53417"
	Class      "A0 V"
	MassSol    2.4
	RadSol     2.88
	Teff       9000
	Age        0.411

	Orbit
	{
		Period          7942.90217949
		ArgOfPericenter 293
		MeanAnomaly     0
	}
}

Star "HIP 53417 B/HD 94602/HR 4260/SAO 81584"
{
	ParentBody "HIP 53417"
	Class      "A2 V"
	RadSol     2.59

	Orbit
	{
		Period          7942.90217949
		ArgOfPericenter 113
		MeanAnomaly     0
	}
}

// 上台一(****)
Remove "Talitha Borealis A"{ParentBody "Talitha Borealis"}
Remove "Talitha Borealis (BC)"{ParentBody "Talitha Borealis"}
Remove "Talitha Borealis Aa"{ParentBody "Talitha Borealis A"}
Remove "Talitha Borealis Ab"{ParentBody "Talitha Borealis A"}
Remove "Talitha Borealis B"{ParentBody "Talitha Borealis (BC)"}
Remove "Talitha Borealis C"{ParentBody "Talitha Borealis (BC)"}
Barycenter "HIP 44127 AB"
{
	ParentBody "HIP 44127"
	Orbit
	{
		Period          2084
		Eccentricity    0.9
		Inclination     54
		AscendingNode   134
		Epoch           2462136.55716275
		ArgOfPericenter 203
		MeanAnomaly     0
	}
}

Star "HIP 44127 A"
{
	ParentBody "HIP 44127 AB"
	Class      "F0IV" // A-type Star?
	MassSol    1.7
	Luminosity 9.87
	FeH        7260
	Age        0.62

	Orbit
	{
		PeriodDays      4028
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 44127 B"
{
	ParentBody "HIP 44127 AB"
	Class      "WD"
	MassSol    1

	Orbit
	{
		PeriodDays      4028
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 44127 CD"
{
	ParentBody "HIP 44127"
	Orbit
	{
		Period          2084
		Eccentricity    0.9
		Inclination     54
		AscendingNode   134
		Epoch           2462136.55716275
		ArgOfPericenter 23
		MeanAnomaly     0
	}
}

Star "HIP 44127 C"
{
	ParentBody "HIP 44127 CD"
	Class      "M3 V"
	MassSol    0.35

	Orbit
	{
		Period          39.7
		Eccentricity    0.35
		Inclination     111.6
		AscendingNode   24.5
		ArgOfPericenter 354.2
		Epoch           2451215.815419
		MeanAnomaly     0
	}
}

Star "HIP 44127 D"
{
	ParentBody "HIP 44127 CD"
	Class      "M4 V"
	MassSol    0.3

	Orbit
	{
		Period          39.7
		//SemiMajorAxis   10
		Eccentricity    0.35
		Inclination     111.6
		AscendingNode   24.5
		ArgOfPericenter 180
		Epoch           2451215.815419
		MeanAnomaly     0
	}
}

// 上台二(**)
Remove "Talitha Australis A"{ParentBody "Talitha Australis"}
Remove "Talitha Australis B"{ParentBody "Talitha Australis"}
Star "HIP 44471 A"
{
	ParentBody "HIP 44471"
	Class      "A0 IV"
	MassSol    3.79
	RadSol     7.87
	Teff       9060

	Orbit
	{
		PeriodDays      13007.2
		Eccentricity    0.5584
		Inclination     109.41
		AscendingNode   105.641
		Epoch           2450404.5
		ArgOfPericenter 175.63
		MeanAnomaly     0
	}
}

Star "HIP 44471 B"
{
	ParentBody "HIP 44471"
	Class      "A0 V"

	Orbit
	{
		PeriodDays      13007.2
		Eccentricity    0.5584
		Inclination     109.41
		AscendingNode   105.641
		Epoch           2450404.5
		ArgOfPericenter 355.63
		MeanAnomaly     0
	}
}

// 中台二(SB**)
Remove "Tania Australis A"{ParentBody "Tania Australis"}
Remove "Tania Australis B"{ParentBody "Tania Australis"}
Star "HIP 50801 A"
{
	ParentBody "HIP 50801"
	Class      "M0IIIab"
	RadSol     75
	Luminosity 977 //1200
	Teff       3899
	FeH        0

	Orbit
	{
		PeriodDays      230.089
		Eccentricity    0.061
		Inclination     13.6
		Epoch           2425577.03
		ArgOfPericenter 56.4
		MeanAnomaly     0
		//SemiAmplitude   7.4
	}
}

Star "HIP 50801 B"
{
	ParentBody "HIP 50801"
	Class      "A8.6 V"

	Orbit
	{
		PeriodDays      230.089
		Eccentricity    0.061
		Inclination     13.6
		Epoch           2425577.03
		ArgOfPericenter 236.4
		MeanAnomaly     0
	}
}

// 下台一(光学伴星, *)
Remove "Alula Borealis A"{ParentBody "Alula Borealis"}
Remove "Alula Borealis B"{ParentBody "Alula Borealis"}

// 下台二(RS****)
Remove "Alula Australis (AB)"{ParentBody "Alula Australis"}
Remove "Alula Australis A"{ParentBody "Alula Australis (AB)"}
Remove "Alula Australis B"{ParentBody "Alula Australis (AB)"}
Remove "Alula Australis E"{ParentBody "Alula Australis"}
Remove "Alula Australis Aa"{ParentBody "Alula Australis A"}
Remove "Alula Australis Ab"{ParentBody "Alula Australis A"}
Remove "Alula Australis Ba"{ParentBody "Alula Australis B"}
Remove "Alula Australis Bb"{ParentBody "Alula Australis B"}
Barycenter "HIP 55203 A/HD 98231 A/HR 4375 A"
{
	ParentBody "HIP 55203"
	Orbit
	{
		Period          59.878
		Eccentricity    0.398
		Inclination     127.94
		AscendingNode   101.85
		Epoch           2427875.01270610
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "HIP 55203 B/HD 98230 B/HR 4374 B"
{
	ParentBody "HIP 55203"
	Orbit
	{
		Period          59.878
		Eccentricity    0.398
		Inclination     127.94
		AscendingNode   101.85
		Epoch           2427875.01270610
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 55203 Aa"
{
	ParentBody "HIP 55203 A"
	Class      "F8.5V"
  MassSol    0.97
	RadSol     1.21
	Luminosity 1.21
	Teff       6005

	Orbit
	{
		Period          1.834
		Eccentricity    0.61
		Inclination     91
		AscendingNode   318
		ArgOfPericenter 324
		Epoch           2448728.516046
		MeanAnomaly     0
	}
}

Star "HIP 55203 Ab"
{
	ParentBody "HIP 55203 A"
	Class      ""
	MassSol    0.38
	RadSol     0.32
	Teff       3700

	Orbit
	{
		Period          1.834
		Eccentricity    0.61
		Inclination     91
		AscendingNode   318
		ArgOfPericenter 144
		Epoch           2448728.516046
		MeanAnomaly     0
	}
}

Star "HIP 55203 Ba"
{
	ParentBody "HIP 55203 B"
	Class      "G2V"
  MassSol    0.86
	RadSol     0.92
	Luminosity 0.79
	Teff       5692
	FeH        -0.35

	Orbit
	{
		Period          1.832
		Eccentricity    0.53
		Inclination     94.9
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 55203 Bb"
{
	ParentBody "HIP 55203 B"
	Class      ""
	MassSol    0.14

	Orbit
	{
		Period          1.832
		Eccentricity    0.53
		Inclination     94.9
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
