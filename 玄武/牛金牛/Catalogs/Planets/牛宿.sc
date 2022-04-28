// 牛宿一
Remove "BET1 Cap"{ParentBody "Dabih"}
Remove "BET2 Cap"{ParentBody "Dabih"}
Remove "BET1 Cap AbAc"{ParentBody "BET1 Cap"}
Remove "Dabih A"{ParentBody "BET1 Cap"}
Remove "BET1 Cap Ab"{ParentBody "BET1 Cap AbAc"}
Remove "BET1 Cap Ac"{ParentBody "BET1 Cap AbAc"}
Remove "BET2 Cap B"{ParentBody "BET2 Cap"}
Remove "BET2 Cap C"{ParentBody "BET2 Cap"}
Barycenter "BET1 Cap Aabc/Dabih Maior Aabc/BD−15° 5629/HD 193495 Aabc/HIP 100345 Aabc/HR 7776/WDS J20210-1447A"
{
	ParentBody "Dabih"
	Orbit
	{
		Period          700000
		//SemiMajorAxis   21000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "BET2 Cap BC/Dabih Minor BC/BD−15° 5626/HD 193452 BC/HIP 100325 BC/HR 7775/WDS J20210-1447B"
{
	ParentBody "Dabih"
	Orbit
	{
		Period          700000
		//SemiMajorAxis   21000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 100345 Abc"
{
	ParentBody "HIP 100345 Aabc"
	Orbit
	{
		Period          3.77
		//SemiMajorAxis   5
		Eccentricity    0.432
		Inclination     92.62
		AscendingNode   211
		ArgOfPericenter 245.58
		MeanAnomaly     0
		Epoch           2421225.778477
	}
}

Star "HIP 100345 Aa"
{
	ParentBody "HIP 100345 Aabc"
	Class      "K0II"
  Teff       4900
  RadSol     35
  Luminosity 600

	Orbit
	{
    Period          3.77
		//SemiMajorAxis   5
		Eccentricity    0.432
		Inclination     92.62
		AscendingNode   211
		ArgOfPericenter 65.58
		MeanAnomaly     0
		Epoch           2421225.778477
	}
}

Star "HIP 100345 Ab"
{
	ParentBody "HIP 100345 Abc"
	Class      "B8VpSi"

	Orbit
	{
		PeriodDays      8.7
		//SemiMajorAxis   0.006
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 100345 Ac"
{
	ParentBody "HIP 100345 Abc"
	Class      "A"
	Orbit
	{
		PeriodDays      8.7
		//SemiMajorAxis   0.094
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 100325 B"
{
	ParentBody "HIP 100325 BC"
	Class      "B9 III"
	Luminosity 40
	Orbit
	{
		Period          80.801
		//SemiMajorAxis   9.6117
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 100325 C"
{
	ParentBody "HIP 100325 BC"
	Class      "A0III"
	Orbit
	{
		Period          80.801
		//SemiMajorAxis   20.3883
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 牛宿二
Star "HIP 100064 A"
{
	ParentBody "HIP 100064"
	Class      "G8.5III"
  MassSol    2.05
  RadSol     8.38
  Luminosity 40.4
  Teff       5030
  FeH        -0.15
  Age        1.3

	Orbit
	{
    Period          1500
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "HIP 100064 BC"
{
	ParentBody "HIP 100064"
  Orbit
	{
    Period          1500
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 100064 B"
{
	ParentBody "HIP 100064 BC"
	Class      ""
  MassSol    0.5

  Orbit
	{
    Period          244
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 100064 C"
{
	ParentBody "HIP 100064 BC"
	Class      ""
  MassSol    0.5

  Orbit
	{
    Period          244
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 牛宿三
/*Star "HIP 99572 B/LP 754–50"
{
	ParentBody "HIP 99572"
	Class      "M0Vk"
  MassSol    0.55

  Orbit
	{
    Period          3700000
    SemiMajorAxis   28300
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}*/

// 牛宿四(*)
Barycenter	"HIP 100881 AB"
{
	ParentBody     "HIP 100881"
	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   312.715
		Period          9785.86
		Eccentricity    0.55535
		Inclination     55.6381
		AscendingNode   117.092
		ArgOfPericenter -64.6684
		MeanAnomaly     103.376
	}
}

Star	"HIP 100881 A"
{
	ParentBody     "HIP 100881 AB"
	Class	       "B8II"
  MassSol        5.9
  Luminosity     238
  Teff           9623
  Age            0.0434

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0359234
		Period          0.0183452
		Eccentricity    0
		Inclination     91.1534
		AscendingNode   19.2916
		ArgOfPericenter -174.42
		MeanAnomaly     -74.32
	}
}

Star	"HIP 100881 B"
{
	ParentBody     "HIP 100881 AB"
	Class	       "B3V"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0684812
		Period          0.0183452
		Eccentricity    0
		Inclination     91.1534
		AscendingNode   19.2916
		ArgOfPericenter 5.57961
		MeanAnomaly     -74.32
	}
}

Star	"HIP 100881 C"
{
	ParentBody     "HIP 100881"
	Class	       "B5V"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   410.246
		Period          9785.86
		Eccentricity    0.55535
		Inclination     55.6381
		AscendingNode   117.092
		ArgOfPericenter 115.332
		MeanAnomaly     103.376
	}
}

// 牛宿五
Star	"牛宿五/OMI1 Cap/BD−19° 5831/GC 28503/HD 195094/HIP 101123/HR 7830/SAO 163626"
{
	ParentBody     "12 Cap"
	Class	       "A1V"
  MassSol        2.05
  Luminosity     18.6
  Teff           10492
  Age            0.118

	Orbit
	{
    Period          95000 // Unknown
		//SemiMajorAxis   2100
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"OMI2 Cap/BD−19° 5830/GC 28502/HD 195093/HIP 101120/HR 7829/SAO 163625"
{
	ParentBody     "12 Cap"
	Class	       "A7V"
  MassSol        1.34
  Teff           7762

  Orbit
	{
    Period          95000 // Unknown
		//SemiMajorAxis   2100
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 牛宿六
Star	"HIP 101027 A"
{
	ParentBody     "HIP 101027"
	Class	       "F2IV"
  MassSol        1.52
  RadSol         1.3
  Luminosity     9
  Teff           6911
  FeH            -0.2
  Age            1.74

	Orbit
	{
    Period          278
    Eccentricity    0.91
    Inclination     113.3
    AscendingNode   162
    //EpochB          1965
		ArgOfPericenter 324.5
		MeanAnomaly     0
	}
}

Star	"HIP 101027 B"
{
	ParentBody     "HIP 101027"
	Class	       "G1"

  Orbit
	{
    Period          278
    Eccentricity    0.91
    Inclination     113.3
    AscendingNode   162
    //EpochB          1965
		ArgOfPericenter 144.5
		MeanAnomaly     0
	}
}

// 天田一(*)
Star	"HIP 104750 A"
{
	ParentBody     "HIP 104750"
	Class	       "K3 III"
  RadSol         20
  Luminosity     173.8
  Teff           4050
  FeH            -0.17

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.206207
		//Period          0.327602
		Eccentricity    0.207704
		Inclination     75.965
		AscendingNode   42.4798
		ArgOfPericenter 114.052
		MeanAnomaly     121.573
	}
}

Star	"HIP 104750 B"
{
	ParentBody     "HIP 104750"
	Class	       "F3.2 V"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.612588
		//Period          0.327602
		Eccentricity    0.207704
		Inclination     75.965
		AscendingNode   42.4798
		ArgOfPericenter 294.052
		MeanAnomaly     121.573
	}
}

// 天田二
Star	"HIP 102978 B(?)"
{
	ParentBody     "HIP 102978"
	Class	       "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          91.4154
		Eccentricity    0.246233
		Inclination     164.767
		AscendingNode   29.4045
		ArgOfPericenter 293.771
		MeanAnomaly     107.576
	}
}

// 河鼓一
Remove "Alshain A"{ParentBody "Alshain"}
Remove "Alshain B"{ParentBody "Alshain"}
Star "HIP 98036 A"
{
	ParentBody "HIP 98036"
	Class      "G9.5 IV"
	MassSol    1.26
	RadSol     3.28
	Luminosity 6
	Teff       5100
	FeH        -0.3
	Age        9.6

	Orbit
	{
		Period          1865.6332
		//SemiMajorAxis   36.0877
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 98036 B"
{
	ParentBody "HIP 98036"
	Class      "M"
	MassSol    0.333333
	Luminosity 0.025
	Oblateness 0
	Orbit
	{
		Period          1865.6332
		//SemiMajorAxis   142.1638
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 河鼓二
Remove "Altair"{ParentBody "ALF Aql"}
Star "牛郎/Altair A"
{
	ParentBody "Altair"
	Class      "A7V"
	MassSol    1.79
	RadSol     2.03 // 1.63
	Oblateness (0 0.19704433 0)
	Luminosity 10.6
	Teff       8500 // 6900
	FeH        -0.2
	RotationPeriod 8.9
	Obliquity  60
	Age        1.2

	/*RotationModel "IAU"
	{
		Epoch			2451545
		PoleRA			0
		PoleRARate	0
		PoleDec			60
		PoleDecRate	0
		PrimeMeridian	0
		RotationRate	970.785617
	}*/

	Orbit
	{
		RefPlane "Static"
	}
}

// 河鼓二的三颗伴星均为光学伴星，无轨道关系。

// 织女一
Remove "Vega"{ParentBody "ALF Lyr"}
Star "织女/Vega A"
{
	ParentBody "Vega"
	Class      "A0Va"
	MassSol    2.135
	RadSol     2.818 // 2.362
	Oblateness (0 0.16181689141235 0)
	Luminosity 40.12
	LumBol     40
	Teff       9602 // 8152 // 10060
	FeH        -0.5
	Age        0.455

	RotationModel "IAU"
	{
		Epoch			2451545
		PoleRA			105
		//PoleRARate		-0.641
		PoleDec			-45
		//PoleDecRate		-0.557
		PrimeMeridian	190.147
		RotationRate	691.2
	}

	Orbit
	{
		RefPlane "Static"
	}
}

// 织女二
Remove "EPS1 Lyr"{ParentBody "EPS Lyr"}
Remove "EPS2 Lyr"{ParentBody "EPS Lyr"}
Remove "EPS Lyr A"{ParentBody "EPS1 Lyr"}
Remove "EPS Lyr B"{ParentBody "EPS1 Lyr"}
Remove "EPS Lyr C"{ParentBody "EPS2 Lyr"}
Remove "EPS Lyr D"{ParentBody "EPS2 Lyr"}
Barycenter "织女二/EPS1 Lyr A/4 Lyr/HIP 91919/BD+39°3509"
{
	ParentBody "EPS Lyr"
	Orbit
	{
		Period          382882.803
		//SemiMajorAxis   10500
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "织女增二/EPS2 Lyr B/5 Lyr/HIP 91926/BD+39°3510"
{
	ParentBody "EPS Lyr"
	Orbit
	{
		Period          382882.803
		//SemiMajorAxis   10500
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HD 173582/HR 7051/SAO 67310"
{
	ParentBody "EPS1 Lyr A"
	Class      "A3V"
	MassSol    2.03
	Luminosity 24
	Teff       7943

	Orbit
	{
		Period          1804.41
		//SemiMajorAxis   116
		Inclination     92.1
		AscendingNode   253.22
		ArgOfPericenter 0
		Epoch           2454283.043
		MeanAnomaly     0
	}
}

Star "HD 173583/HR 7052/SAO 67309"
{
	ParentBody "EPS1 Lyr A"
	Class      "F0V"
	MassSol    1.61
	Luminosity 8.4
	Teff       7047

	Orbit
	{
		Period          1804.41
		//SemiMajorAxis   116
		Inclination     92.1
		AscendingNode   253.22
		ArgOfPericenter 180
		Epoch           2454283.043
		MeanAnomaly     0
	}
}

Star "HD 173607/HR 7053/SAO 67315"
{
	ParentBody "EPS2 Lyr B"
	Class      "A6Vn"
	MassSol    2.11
	Luminosity 29
	Teff       7816

	Orbit
	{
		Period          724.307
		//SemiMajorAxis   121
		Eccentricity    0.353
		Inclination     126.14
		AscendingNode   26.23
		ArgOfPericenter 73.78
		Epoch           2533334.67994
		MeanAnomaly     0
	}
}

Star "HD 173608/HR 7054"
{
	ParentBody "EPS2 Lyr B"
	Class      "A7Vn"
	MassSol    2.15
	Luminosity 32
	Teff       7852

	Orbit
	{
		Period          724.307
		//SemiMajorAxis   121
		Eccentricity    0.353
		Inclination     126.14
		AscendingNode   26.23
		ArgOfPericenter 253.78
		Epoch           2533334.67994
		MeanAnomaly     0
	}
}

// 织女三
Remove "ZET1 Lyr"{ParentBody "ZET Lyr"}
Remove "ZET2 Lyr"{ParentBody "ZET Lyr"}
Remove "ZET Lyr Aa"{ParentBody "ZET1 Lyr"}
Remove "ZET Lyr Ab"{ParentBody "ZET1 Lyr"}
Barycenter "织女三/ZET1 Lyr A/6 Lyr A/BD+37° 3222/HD 173648 A/HIP 91971 A/HR 7056 A/SAO 67321"
{
	ParentBody "ZET Lyr"
	Orbit
	{
		Period          41292.02
		//SemiMajorAxis   723.4043
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 91971 Aa"
{
	ParentBody "ZET1 Lyr A"
	Class      "kA5hF0mF2"
	MassSol    2.36
	RadSol     2.5
	Luminosity 31
	Teff       7914
	FeH        0.38
	Age        0.5

	Orbit
	{
		PeriodDays      4.3
		Eccentricity    0.01
		Epoch           2440000.723
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   51.6
	}
}

Star "HIP 91971 Ab"
{
	ParentBody "ZET1 Lyr A"
	Class      ""
	MassSol    0.8

	Orbit
	{
		PeriodDays      4.3
		Eccentricity    0.01
		Epoch           2440000.723
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "织女增一/ZET2 Lyr B/7 Lyr B/BD+37° 3223/GC 25678/HD 173649 B/HIP 91973 B/HR 7057 B/SAO 67324/WDS J18448+3736D"
{
	ParentBody "ZET Lyr"
	Class      "F0IVn"
	MassSol    1.74
	Luminosity 9
	Teff       7000
	Age        1.223

	Orbit
	{
		Period          41292.02
		//SemiMajorAxis   1276.5957
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 左旗三
Remove "DEL Sge A"{ParentBody "DEL Sge"}
Remove "DEL Sge B"{ParentBody "DEL Sge"}
Star "HIP 97365 A"
{
	ParentBody "HIP 97365"
	Class      "M2 II"
	MassSol    3.35
	RadSol     129
	Luminosity 2500
	Teff       3600

	Orbit
	{
		Period          10.11
		//SemiMajorAxis   3.809
		Eccentricity    0.44
		Inclination     140
		AscendingNode   170.2
		//EpochB          1979.93
		ArgOfPericenter 77.7
		MeanAnomaly     0
	}
}

Star "HIP 97365 B"
{
	ParentBody "HIP 97365"
	Class      "B9.5V"
	MassSol    2.9
	RadSol     2.6
	Luminosity 63
	Teff       10000

	Orbit
	{
		Period          10.11
		//SemiMajorAxis   3.809
		Eccentricity    0.44
		Inclination     140
		AscendingNode   170.2
		//EpochB          1979.93
		ArgOfPericenter 257.7
		MeanAnomaly     0
	}
}

// 左旗四
Remove "ZET Sge (AB)"{ParentBody "ZET Sge"}
Remove "ZET Sge A"{ParentBody "ZET Sge (AB)"}
Remove "ZET Sge B"{ParentBody "ZET Sge (AB)"}
Remove "ZET Sge C"{ParentBody "ZET Sge"}
Barycenter "HIP 97496 AB"
{
	ParentBody "HIP 97496"
	Orbit
	{
		Period          7832.91
		//SemiMajorAxis   187.5
		Inclination     132.33
		AscendingNode   340.97
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 97496 A"
{
	ParentBody "HIP 97496 AB"
	Class      "A1 V"
	MassSol    1.8
	RadSol     1.7
	Luminosity 46
	Teff       8422
	Age        0.347

	Orbit
	{
		PeriodDays      8487.9
		//SemiMajorAxis   5.1912
		Eccentricity    0.7948
		Inclination     132.33
		AscendingNode   340.97
		Epoch           2444199.6
		ArgOfPericenter 175.3
		MeanAnomaly     0
	}
}

Star "HIP 97496 B"
{
	ParentBody "HIP 97496 AB"
	Class      "A3 V"
	Orbit
	{
		PeriodDays      8487.9
		//SemiMajorAxis   5.1912
		Eccentricity    0.7948
		Inclination     132.33
		AscendingNode   340.97
		Epoch           2444199.6
		ArgOfPericenter 355.3
		MeanAnomaly     0
	}
}

Star "HIP 97496 C"
{
	ParentBody "HIP 97496"
	Class      "A3Vn"
	Orbit
	{
		Period          7832.91
		//SemiMajorAxis   512.5
		Inclination     132.33
		AscendingNode   340.97
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 左旗六
Remove "VZ Sge A"{ParentBody "VZ Sge"}
Remove "VZ Sge B"{ParentBody "VZ Sge"}
Star "HIP 98438 A/HD 189577 A"
{
	ParentBody "HIP 98438"
	Class      "M4 III"
	RadSol     60
	Luminosity 2173.57
	Teff       3844

	Orbit
	{
		Period          313234.2442
		//SemiMajorAxis   1829.3328
		Eccentricity    0.03
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 98438 B"
{
	ParentBody "HIP 98438"
	Class      "F0 V"

	Orbit
	{
		Period          313234.2442
		//SemiMajorAxis   5487.9985
		Eccentricity    0.03
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 左旗八(*)
Star	"HIP 98754 A"
{
	ParentBody     "HIP 98754"
	Class	       "B9VpHgMn"
	Luminosity     291.53
	Teff           13200

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      61.541
		Eccentricity    0.49
		Epoch           2440799.01
		ArgOfPericenter 165
		MeanAnomaly     0
		//SemiAmplitude   4.2
	}
}

Star	"HIP 98754 B"
{
	ParentBody     "HIP 98754"
	Class	       "A8.4 V"
	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      61.541
		Eccentricity    0.49
		Epoch           2440799.01
		ArgOfPericenter 345
		MeanAnomaly     0
		//SemiAmplitude   4.2
	}
}

// 右旗二
Remove "SIG Aql A"{ParentBody "SIG Aql"}
Remove "SIG Aql B"{ParentBody "SIG Aql"}
Star "HIP 96665 A"
{
	ParentBody "HIP 96665"
	Class      "B3 V"
	MassSol    6.8
	RadSol     4.22
	Luminosity 1862
	Teff       18493
	Age        0.14

	Orbit
	{
		PeriodDays      1.95022
		Eccentricity    0
		Epoch           2420054.331
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   163.52
	}
}

Star "HIP 96665 B"
{
	ParentBody "HIP 96665"
	Class      "B3 V"
	MassSol    5.4
	RadSol     3.05
	Luminosity 524
	Teff       15848

	Orbit
	{
		PeriodDays      1.95022
		Eccentricity    0
		Epoch           2420054.331
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   199
	}
}

// 右旗三
Remove "DEL Aql A"{ParentBody "DEL Aql"}
Remove "DEL Aql B"{ParentBody "DEL Aql"}
Star "HIP 95501 A"
{
	ParentBody "HIP 95501"
	Class      "F0 IV"
	MassSol    1.65
	RadSol     2.04
	Luminosity 6.8
	Teff       7016
	FeH        -0.04

	Orbit
	{
		Period          3.426
		//SemiMajorAxis   0.2496
		Eccentricity    0.36
		Inclination     150
		AscendingNode   337
		Epoch           2434955.5
		ArgOfPericenter 11
		MeanAnomaly     0
	}
}

Star "HIP 95501 B"
{
	ParentBody "HIP 95501"
	Class      "K"
	MassSol    0.67
	RadSol     0.61

	Orbit
	{
		Period          3.4282
		//SemiMajorAxis   0.6148
		Eccentricity    0.36
		Inclination     150
		AscendingNode   337
		Epoch           2434955.5
		ArgOfPericenter 191
		MeanAnomaly     0
	}
}

// 右旗四(*)
Star	"HIP 95585 A"
{
	ParentBody     "HIP 95585"
	Class	       "F2 Ib"
	MassSol        12.5
	RadSol         104
	Luminosity     21000
	Teff           6700
	FeH            -0.03
	Age            0.015

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   42.3278
		Period          189.583
		Eccentricity    0.857866
		Inclination     128.641
		AscendingNode   86.6879
		ArgOfPericenter 58.2512
		MeanAnomaly     5.73286
	}
}

Star	"HIP 95585 B"
{
	ParentBody     "HIP 95585"
	Class	       "A1IV"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   70.8701
		Period          189.583
		Eccentricity    0.857866
		Inclination     128.641
		AscendingNode   86.6879
		ArgOfPericenter 238.251
		MeanAnomaly     5.73286
	}
}

// 天桴一
Remove "TET Aql A"{ParentBody "TET Aql"}
Remove "TET Aql B"{ParentBody "TET Aql"}
Star "HIP 99473 A"
{
	ParentBody "HIP 99473"
	Class      "B9.5III"
	MassSol    3.6
	RadSol     4.8
	Luminosity 278
	Teff       10286
	FeH        0.2
	Age        0.0209

	Orbit
	{
		PeriodDays      17.122
		//SemiMajorAxis   0.1253
		Eccentricity    0.6
		Inclination     143.5
		AscendingNode   99
		Epoch           2447801.7
		ArgOfPericenter 35
		MeanAnomaly     0
	}
}

Star "HIP 99473 B"
{
	ParentBody "HIP 99473"
	Class      "B9.5III"
	MassSol    2.9
	RadSol     2.4
	Luminosity 68

	Orbit
	{
		PeriodDays      17.122
		//SemiMajorAxis   0.1253
		Eccentricity    0.6
		Inclination     143.5
		AscendingNode   99
		Epoch           2447801.7
		ArgOfPericenter 215
		MeanAnomaly     0
	}
}

// 天桴四(*)
Barycenter	"HIP 97804 AB"
{
	ParentBody     "HIP 97804"
	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   21.383
		Period          77.3014
		Eccentricity    0.10617
		Inclination     91.3425
		AscendingNode   -178.775
		ArgOfPericenter -150.293
		MeanAnomaly     -168.55
	}
}

Star	"HIP 97804 A"
{
	ParentBody     "HIP 97804 AB"
	Class	       "F6 Iab"
	MassSol        5.7
	RadSol         66
	Luminosity     2630
	Teff           6000
	FeH            0.1

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.276375
		Period          0.413478
		Eccentricity    0.494566
		Inclination     -169.206
		AscendingNode   164.382
		ArgOfPericenter 49.729
		MeanAnomaly     41.4293
	}
}

Star	"HIP 97804 B"
{
	ParentBody     "HIP 97804 AB"
	Class	       "B9.8V"
	MassSol        2.3
	Age            0.0264

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.893627
		Period          0.413478
		Eccentricity    0.494566
		Inclination     -169.206
		AscendingNode   164.382
		ArgOfPericenter 229.729
		MeanAnomaly     41.4293
	}
}

Star	"HIP 97804 C"
{
	ParentBody     "HIP 97804"
	Class	       "F1V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   17.5071
		Period          77.3014
		Eccentricity    0.10617
		Inclination     91.3425
		AscendingNode   -178.775
		ArgOfPericenter 29.707
		MeanAnomaly     -168.55
	}
}

// 罗堰一(*)
Barycenter	"HIP 101923 A"
{
	ParentBody     "HIP 101923"
	Orbit
	{
		RefPlane        "Equator"
		Period          420
		Eccentricity    0.73
		Inclination     75
		AscendingNode   93
		//EpochB          1915
		ArgOfPericenter 90
		MeanAnomaly     0
	}
}

Star	"HIP 101923 Aa"
{
	ParentBody     "HIP 101923 A"
	Class	       "B6III"
	MassSol        5.01
	LumBol         1893
	Teff           15439
	FeH            0.14

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0134341
		Period          0.0171624
		Eccentricity    0
		Inclination     125.148
		AscendingNode   -161.087
		ArgOfPericenter -125.577
		MeanAnomaly     -111.426
	}
}

Star	"HIP 101923 Ab"
{
	ParentBody     "HIP 101923 A"
	Class	       "A8.8 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.132456
		Period          0.0171624
		Eccentricity    0
		Inclination     125.148
		AscendingNode   -161.087
		ArgOfPericenter 54.4231
		MeanAnomaly     -111.426
	}
}

Star	"HIP 101923 B"
{
	ParentBody     "HIP 101923"
	Class	       "B6IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          420
		Eccentricity    0.73
		Inclination     75
		AscendingNode   93
		//EpochB          1915
		ArgOfPericenter 270
		MeanAnomaly     0
	}
}

// 渐台一(*)
Star	"HIP 92791 A"
{
	ParentBody     "HIP 92791"
	Class	       "M4 II"
	MassSol        7.3
	RadSol         286 // 381
	Luminosity     12900 // 23100
	Teff           3550 // 3650

	Orbit
	{
		Period          24000
		//SemiMajorAxis   24000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter	"UCAC2 44686751/ADS 11825 BC/HIP 92791 BC"
{
	ParentBody     "HIP 92791"
	Orbit
	{
		Period          24000
		//SemiMajorAxis   24000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 92791 B"
{
	ParentBody     "HIP 92791 BC"
	Class	       "B7.1 V"

	Orbit
	{
		Period          10500
		//SemiMajorAxis   600
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 92791 C"
{
	ParentBody     "HIP 92791 BC"
	Class	       "A1.6 V"

	Orbit
	{
		Period          10500
		//SemiMajorAxis   600
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 渐台二(*)
Remove "Sheliak A"{ParentBody "Sheliak"}
Remove "Sheliak B"{ParentBody "Sheliak"}
Star "HIP 92420 Aa1/10 Lyr/AAVSO 1846+33/BD+33 3223/FK5 705/HD 174638/HR 7106/SAO 67451"
{
	ParentBody "HIP 92420"
	Class      "B6II"
	MassSol    13.16
	RadSol     6
	Luminosity 26300
	Teff       30000

	Orbit
	{
		PeriodDays      12.9414
		Eccentricity    0
		Inclination     92.25
		AscendingNode   254.39
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 92420 Aa2/SAO 67452"
{
	ParentBody "HIP 92420"
	Class      "B"
	MassSol    2.97
	RadSol     15.2
	Luminosity 6500
	Teff       13300
	Age        0.023

	Orbit
	{
		PeriodDays      12.9414
		Eccentricity    0
		Inclination     92.25
		AscendingNode   254.39
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 92420 Ab(?)"
{
	ParentBody "HIP 92420"
	Class      ""
	MassSol    2.47

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   246.916
		//Period          0.347257
		Eccentricity    0.0483856
		Inclination     -7.24176
		AscendingNode   -100.503
		ArgOfPericenter 22.7044
		MeanAnomaly     9.89814
	}
}

Star "HIP 92420 B/HD 174664/BD+33 3224/SAO 67453"
{
	ParentBody "HIP 92420"
	Class      "B7V"

	Orbit
	{
		RefPlane        "Extrasolar"
		Period          207140
		Eccentricity    0.488549618
		Inclination     0
		AscendingNode   4
		ArgOfPericenter -35
		MeanAnomaly     178.625954
	}
}

Star "HIP 92420 Bb(?)"
{
	ParentBody "HIP 92420 B"
	Class      "F"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.576307
		//Period          0.133924
		Eccentricity    0.0886553
		Inclination     5.22834
		AscendingNode   -143.614
		ArgOfPericenter 241.235
		MeanAnomaly     310.644
	}
}

Star "HIP 92420 C"
{
	ParentBody "HIP 92420"
	Class      "B2"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   15793.3145
		Eccentricity    0.0197462
		Inclination     -28
		AscendingNode   327.022901
		ArgOfPericenter 27
		MeanAnomaly     128
	}
}

Star "HIP 92420 D"
{
	ParentBody "HIP 92420"
	Class      "K3V"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   22446.3142
		Eccentricity    0.00365072
		Inclination     8.24427481
		AscendingNode   -178.625954
		ArgOfPericenter -8.24427481
		MeanAnomaly     135.97
	}
}

Star "HIP 92420 E"
{
	ParentBody "HIP 92420"
	Class      "G5"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   21818.665
		Eccentricity    0.0997858
		Inclination     -30.2290076
		AscendingNode   -169.767
		ArgOfPericenter 59.1849
		MeanAnomaly     173
	}
}

Star "HIP 92420 F"
{
	ParentBody "HIP 92420"
	Class      "G5"

	Orbit
	{
		RefPlane        "Extrasolar"
		Period          491693
		Eccentricity    0.425
		Inclination     0
		AscendingNode   45
		ArgOfPericenter 151.145038
		MeanAnomaly     184.122137
	}
}

// 渐台四(*)
Star	"HIP 93903 A"
{
	ParentBody     "HIP 93903"
	Class	       "B6 IV"
	MassSol        5.02
	Luminosity     1349
	Teff           13428

	Orbit
	{
		RefPlane        "Equator"
		Period          216.93
		Eccentricity    0.637
		Inclination     145.5
		AscendingNode   171.4
		//EpochB          1997.28
		ArgOfPericenter 21.2
		MeanAnomaly     0
	}
}

Star	"HIP 93903 B"
{
	ParentBody     "HIP 93903"
	Class	       "B9.5 IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          216.93
		Eccentricity    0.637
		Inclination     145.5
		AscendingNode   171.4
		//EpochB          1997.28
		ArgOfPericenter 201.2
		MeanAnomaly     0
	}
}

// 辇道二(*)
Star	"HIP 94481 A"
{
	ParentBody     "HIP 94481"
	Class	       "B2.5 IV"
	Luminosity     6605
	Teff           17360
	FeH            -0.01

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      56.4
		Eccentricity    0.53
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   2.9
	}
}

Star	"HIP 94481 B"
{
	ParentBody     "HIP 94481"
	Class	       "B7.3 V"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      56.4
		Eccentricity    0.53
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"BD+38 3491/HIP 94481 C"
{
	ParentBody     "HIP 94481"
	Class	       "A0IVn"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      1650 // guess
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 辇道三(*)
Star	"HIP 94713 A"
{
	ParentBody     "HIP 94713"
	Class	       "K0 II"
	RadSol         57
	Teff           4500
	FeH            -0.01

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.188181
		Period          0.227782
		Eccentricity    0
		Inclination     155.474
		AscendingNode   141.045
		ArgOfPericenter 80.011
		MeanAnomaly     -66.5161
	}
}

Barycenter	"BD+37 3399/HIP 94713 B"
{
	ParentBody     "HIP 94713"
	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   75.8428
		Period          478.564
		Eccentricity    0.395705
		Inclination     72.8162
		AscendingNode   -50.8612
		ArgOfPericenter 274.601
		MeanAnomaly     -131.489
	}
}

Star	"HIP 94713 Ba"
{
	ParentBody     "HIP 94713 B"
	Class	       "K2III"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   1.03461
		Period          2.46265
		Eccentricity    0.474976
		Inclination     -47.8872
		AscendingNode   72.732
		ArgOfPericenter -79.9182
		MeanAnomaly     160.523
	}
}

Star	"HIP 94713 Bb"
{
	ParentBody     "HIP 94713 B"
	Class	       "A7.7 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   1.93774
		Period          2.46265
		Eccentricity    0.474976
		Inclination     -47.8872
		AscendingNode   72.732
		ArgOfPericenter 100.082
		MeanAnomaly     160.523
	}
}

// 辇道四(*)
Star	"HIP 95556 A"
{
	ParentBody     "HIP 95556"
	Class	       "B8VpSi(Fe II)"
	MassSol        4.08
	RadSol         5.03
	Luminosity     501
	Teff           12190
	Age            0.145

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      35.0225
		Eccentricity    0.45
		Epoch           2438929.1
		ArgOfPericenter 110
		MeanAnomaly     0
		//SemiAmplitude   5.7
	}
}

Star	"HIP 95556 B"
{
	ParentBody     "HIP 95556"
	Class	       "B5.9 V"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      35.0225
		Eccentricity    0.45
		Epoch           2438929.1
		ArgOfPericenter 290
		MeanAnomaly     0
	}
}

// 辇道五
Star	"HIP 97295 A"
{
	ParentBody     "HIP 97295"
	Class	       "F7 V"
	MassSol        1.24
	RadSol         0.95
	Luminosity     3.66
	Teff           6455
	FeH            0.027
	Age            2.8

	Orbit
	{
		Period          1000000 // guess
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 97295 B"
{
	ParentBody     "HIP 97295"
	Class	       "M0.4"

	Orbit
	{
		Period          1000000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
