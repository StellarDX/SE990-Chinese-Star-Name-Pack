// 牛宿一(*****)
Remove "BET1 Cap"{ParentBody "Dabih"}
Remove "BET2 Cap"{ParentBody "Dabih"}
Remove "BET1 Cap AbAc"{ParentBody "BET1 Cap"}
Remove "Dabih A"{ParentBody "BET1 Cap"}
Remove "BET1 Cap Ab"{ParentBody "BET1 Cap AbAc"}
Remove "BET1 Cap Ac"{ParentBody "BET1 Cap AbAc"}
Remove "BET2 Cap B"{ParentBody "BET2 Cap"}
Remove "BET2 Cap C"{ParentBody "BET2 Cap"}
Barycenter "牛宿一/BET1 Cap Aab/Dabih Maior Aab/BD-15 5629/HD 193495 Aab/HIP 100345 Aab/HR 7776/WDS J20210-1447A"
{
	ParentBody "Dabih"
	BinaryOrbit
	{
		Period          700000
		Separation      21000
	}
}

Barycenter "牛宿增十二/BET2 Cap BC/Dabih Minor BC/BD-15 5626/HD 193452 BC/HIP 100325 BC/HR 7775/WDS J20210-1447B"
{
	ParentBody "Dabih"
	/*BinaryOrbit
	{
		Period          700000
		Separation      21000
	}*/
}

Barycenter "HIP 100345 Ab"
{
	ParentBody "HIP 100345 Aab"
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
	ParentBody "HIP 100345 Aab"
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

Star "HIP 100345 Ab1"
{
	ParentBody "HIP 100345 Ab"
	Class      "B8VpSi"

	Orbit
	{
		PeriodDays      8.7
		//SemiMajorAxis   0.006
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 100345 Ab2"
{
	ParentBody "HIP 100345 Ab"
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

// 牛宿二(PM***)
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

	/*BinaryOrbit
	{
    Period          1500
		Epoch           2455196.95538591
		Separation      206.58
		PositionAngle   196
	}*/
}

Barycenter "HIP 100064 BC"
{
	ParentBody "HIP 100064"
	BinaryOrbit
	{
    Period          1500
		Epoch           2455196.95538591
		Separation      206.58
		PositionAngle   196
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

// 牛宿三(**?)
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

// 牛宿四(***)
Barycenter	"HIP 100881 A"
{
	ParentBody     "HIP 100881"
	BinaryOrbit
	{
		Separation      680
	}
}

Star	"HIP 100881 Aa"
{
	ParentBody     "HIP 100881 A"
	Class	         "B8II"
  MassSol        5.9
  Luminosity     238
  Teff           9623
  Age            0.0434

	BinaryOrbit
	{
		Separation      20.0043
	}
}

Star	"HIP 100881 Ab"
{
	ParentBody     "HIP 100881 A"
	Class	         "B3 V"

	BinaryOrbit
	{
		Separation      20.0043
	}
}

Star	"HIP 100881 B"
{
	ParentBody     "HIP 100881"
	Class	         "B5V"

	/*BinaryOrbit
	{
		Separation      680
	}*/
}

// 牛宿五(**)
Star	"牛宿五/OMI1 Cap/BD-19 5831/GC 28503/HD 195094/HIP 101123/HR 7830/SAO 163626"
{
	ParentBody     "12 Cap"
	Class	         "A1V"
  MassSol        2.05
  Luminosity     18.6
  Teff           10492
  Age            0.118

	BinaryOrbit
	{
		Separation      2100
	}
}

Star	"OMI2 Cap/BD-19 5830/GC 28502/HD 195093/HIP 101120/HR 7829/SAO 163625"
{
	ParentBody     "12 Cap"
	Class	         "A7V"
  MassSol        1.34
  Teff           7762

	BinaryOrbit
	{
		Separation      2100
	}
}

// 牛宿六(**)
Star	"HIP 101027 A"
{
	ParentBody     "HIP 101027"
	Class	         "F2IV"
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
    Epoch           2438761.05644077
		ArgOfPericenter 324.5
		MeanAnomaly     0
	}
}

Star	"HIP 101027 B"
{
	ParentBody     "HIP 101027"
	Class	         "G1"

  Orbit
	{
    Period          278
    Eccentricity    0.91
    Inclination     113.3
    AscendingNode   162
    Epoch           2438761.05644077
		ArgOfPericenter 144.5
		MeanAnomaly     0
	}
}

// 天田一(PM**)
Star	"HIP 104750 A"
{
	ParentBody     "HIP 104750"
	Class	         "K3 III"
  RadSol         20
  Luminosity     173.8
  Teff           4050
  FeH            -0.17

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.206207
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
	Class	         "F3.2 V"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.612588
		Eccentricity    0.207704
		Inclination     75.965
		AscendingNode   42.4798
		ArgOfPericenter 294.052
		MeanAnomaly     121.573
	}
}

// 天田二
Star	"HIP 102978 A"
{
	ParentBody     "HIP 102978"
	Class          "K4 III"
	MassSol        6.8
	RadSol         172.1
	Luminosity     6269
	Teff           3915
	FeH            -0.24
	Age            0.0481

	Orbit
	{
		RefPlane        "Equator"
		Period          5969.64787
		Eccentricity    0.79950583
		Inclination     2.48912022
		AscendingNode   0
		ArgOfPericenter 100.038194
		MeanAnomaly     -144.422598
	}
}

Star	"HIP 102978 B(?)"
{
	ParentBody     "HIP 102978"
	Class          "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          5969.64787
		Eccentricity    0.79950583
		Inclination     2.48912022
		AscendingNode   0
		ArgOfPericenter 280.038194
		MeanAnomaly     -144.422598
	}
}

// 河鼓一(PM***)
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=98036
Remove "Alshain A"{ParentBody "Alshain"}
Remove "Alshain B"{ParentBody "Alshain"}
Star "HIP 98036 A"
{
	ParentBody "HIP 98036"
	Class      "G9.5 IV"
	MassSol    1.26
	RadSol     3.064
	Luminosity 5.6
	Teff       5071
	FeH        -0.19
	RotationPeriod 122.08728
	Age        9.6

	/*BinaryOrbit // EDR3: RUWE(A,B)= 2.9, 1.1
	{
		Separation      178.1
		Period          1858
	}*/
}

// Tok2015: RV(B)=-32.9 km/s. SOAR: B unresolved by speckle.
// Luhn+: long-term linear RV trend.
Barycenter	"HIP 98036 B"
{
	ParentBody     "HIP 98036"
	BinaryOrbit
	{
		Separation      178.1
		Period          1858
	}
}

Star "HIP 98036 Ba"
{
	ParentBody "HIP 98036 B"
	Class      "M2.5V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00524340899
		Eccentricity    0
		Inclination     -1.33418751
		AscendingNode   0
		ArgOfPericenter -63.6848171
		MeanAnomaly     -150.374665
	}
}

Star	"HIP 98036 Bb"
{
	ParentBody     "HIP 98036 B"
	Class          "M4.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00524340899
		Eccentricity    0
		Inclination     -1.33418751
		AscendingNode   0
		ArgOfPericenter 116.315183
		MeanAnomaly     -150.374665
	}
}

// 河鼓二(*)
Remove "Altair"{ParentBody "ALF Aql"}
Star "牛郎/Altair A"
{
	ParentBody "Altair"
	Class      "A7V"
	MassSol    1.86
	DimensionsSol (4.02, 3.14, 4.02)
	Luminosity 10.6
	Temperature (6860, 8621, 6860)
	Teff       8500 // 6900
	FeH        -0.2
	RotationPeriod 7.77
	Obliquity  60
	Age        0.1

	Orbit{RefPlane "Static"}
}

// 河鼓二的三颗伴星均为光学伴星，无轨道关系。

// 织女一(dS*)
Remove "Vega"{ParentBody "ALF Lyr"}
Star "织女/Vega A"
{
	ParentBody "Vega"
	Class      "A0Va"
	MassSol    2.135
	DimensionsSol (5.636, 4.724, 5.636)
	Luminosity 40.12
	//LumBol     40
	Temperature (8152, 10060, 8152)
	Teff       9602
	FeH        -0.5
	Age        0.455

	RotationPeriod 12.5

	Orbit
	{
		RefPlane "Static"
		Inclination   5
	}
}

// 织女二(*****+)
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=91926
Remove "EPS1 Lyr"{ParentBody "EPS Lyr"}
Remove "EPS2 Lyr"{ParentBody "EPS Lyr"}
Remove "EPS Lyr A"{ParentBody "EPS1 Lyr"}
Remove "EPS Lyr B"{ParentBody "EPS1 Lyr"}
Remove "EPS Lyr C"{ParentBody "EPS2 Lyr"}
Remove "EPS Lyr D"{ParentBody "EPS2 Lyr"}
Barycenter "织女二/EPS1 Lyr A/4 Lyr/HIP 91919/BD+39 3509"
{
	ParentBody "EPS Lyr"
	BinaryOrbit
	{
		Separation      10500
		PositionAngle   172 // When?
	}
}

Barycenter "织女增二/EPS2 Lyr B/5 Lyr/HIP 91926/BD+39 3510"
{
	ParentBody "EPS Lyr"
	/*BinaryOrbit
	{
		Separation      10500
		PositionAngle   172 // When?
	}*/
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

Barycenter "HD 173607/HR 7053/SAO 67315"
{
	ParentBody "EPS2 Lyr B"
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

Star "HD 173607 A"
{
	ParentBody "HD 173607"
	Class      "A6Vn"
	MassSol    2.11
	Luminosity 29
	Teff       7816

	BinaryOrbit
	{
		Separation      5
		PositionAngle   225 // When?
	}
}

Star "HD 173607 B"
{
	ParentBody "HD 173607"
	Class      "A6" // ?

	/* BinaryOrbit
	{
		Separation      5
		PositionAngle   225 // When?
	} */
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

// 织女三(***?)
Remove "ZET1 Lyr"{ParentBody "ZET Lyr"}
Remove "ZET2 Lyr"{ParentBody "ZET Lyr"}
Remove "ZET Lyr Aa"{ParentBody "ZET1 Lyr"}
Remove "ZET Lyr Ab"{ParentBody "ZET1 Lyr"}
Barycenter "织女三/ZET1 Lyr A/6 Lyr A/BD+37° 3222/HD 173648 A/HIP 91971 A/HR 7056 A/SAO 67321"
{
	ParentBody "ZET Lyr"
	BinaryOrbit
	{
		Separation      2093.23
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

Star "织女增一/ZET2 Lyr B/7 Lyr B/BD+37 3223/GC 25678/HD 173649 B/HIP 91973 B/HR 7057 B/SAO 67324/WDS J18448+3736D"
{
	ParentBody "ZET Lyr"
	Class      "F0IVn"
	MassSol    1.74
	Luminosity 9
	Teff       7000
	Age        1.223

	/*BinaryOrbit
	{
		Separation      2093.23
	}*/
}

// 左旗三(SB**)
Remove "DEL Sge A"{ParentBody "DEL Sge"}
Remove "DEL Sge B"{ParentBody "DEL Sge"}
Star "HIP 97365 A"
{
	ParentBody "HIP 97365"
	Class      "M2 II"
	MassSol    3.35
	RadSol     108
	Luminosity 1888 // 1923
	Teff       3660

	Orbit
	{
		Period          10.11
		Eccentricity    0.44
		Inclination     140
		AscendingNode   170.2
		Epoch           2444214.12246857
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
		Eccentricity    0.44
		Inclination     140
		AscendingNode   170.2
		Epoch           2444214.12246857
		ArgOfPericenter 257.7
		MeanAnomaly     0
	}
}

// 左旗四(***)
Remove "ZET Sge (AB)"{ParentBody "ZET Sge"}
Remove "ZET Sge A"{ParentBody "ZET Sge (AB)"}
Remove "ZET Sge B"{ParentBody "ZET Sge (AB)"}
Remove "ZET Sge C"{ParentBody "ZET Sge"}
Barycenter "HIP 97496 AB"
{
	ParentBody "HIP 97496"
	BinaryOrbit
	{
		Period          8000
		Separation      700
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
		Eccentricity    0.7948
		Inclination     132.33
		AscendingNode   340.97
		Epoch           2444200.1
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
		Eccentricity    0.7948
		Inclination     132.33
		AscendingNode   340.97
		Epoch           2444200.1
		ArgOfPericenter 355.3
		MeanAnomaly     0
	}
}

Star "HIP 97496 C"
{
	ParentBody "HIP 97496"
	Class      "A3Vn"
	/*BinaryOrbit
	{
		Period          8000
		Separation      700
	}*/
}

// 左旗六(LP*)
Remove "VZ Sge A"{ParentBody "VZ Sge"}
Remove "VZ Sge B"{ParentBody "VZ Sge"}
/*Star "HIP 98438 A/HD 189577 A"
{
	ParentBody "HIP 98438"
	Class      "M4 III"
	RadSol     60
	Luminosity 2173.57
	Teff       3844

	BinaryOrbit
	{
		Epoch           2456292.68198225
		Separation      19142
		Eccentricity    0.03
		PositionAngle   297
	}
}

Star "HIP 98438 B/HD 351107"
{
	ParentBody "HIP 98438"
	Class      "F0"

	BinaryOrbit
	{
		Epoch           2456292.68198225
		Separation      19142
		Eccentricity    0.03
		PositionAngle   297
	}
}*/

// 左旗八(SB**)
Star	"HIP 98754 A"
{
	ParentBody     "HIP 98754"
	Class	         "B9VpHgMn"
	Luminosity     291.53
	Teff           13200

	Orbit
	{
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
	Class	         "A8.4 V"
	Orbit
	{
		PeriodDays      61.541
		Eccentricity    0.49
		Epoch           2440799.01
		ArgOfPericenter 345
		MeanAnomaly     0
		//SemiAmplitude   4.2
	}
}

// 右旗二(EB**)
Remove "SIG Aql A"{ParentBody "SIG Aql"}
Remove "SIG Aql B"{ParentBody "SIG Aql"}
Star "HIP 96665 A"
{
	ParentBody "HIP 96665"
	Class      "B3V"
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
	Class      "B3V"
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
	Class      "F0IV"
	MassSol    1.65
	RadSol     2.04
	Luminosity 6.8
	Teff       7016
	FeH        -0.04

	Orbit
	{
		Period          3.426
		Eccentricity    0.36
		Inclination     150
		AscendingNode   337
		Epoch           2434955.23272947
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
		Eccentricity    0.36
		Inclination     150
		AscendingNode   337
		Epoch           2434955.23272947
		ArgOfPericenter 191
		MeanAnomaly     0
	}
}

// 右旗四(**)
/*Star	"HIP 95585 A"
{
	ParentBody     "HIP 95585"
	Class	         "F2Ib"
	MassSol        12.5
	RadSol         71.2
	Luminosity     7645
	Teff           6396
	FeH            -0.03
	Age            0.015

	BinaryOrbit
	{
		Separation      221100 // 这么远，难道不是物理双星？
	}
}

Star	"HIP 95585 B"
{
	ParentBody     "HIP 95585"
	Class	         "A1IV"

	BinaryOrbit
	{
		Separation      221100
	}
}*/

// 天桴一(SB**)
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

// 天桴四(**)
Barycenter	"HIP 97804 AB"
{
	ParentBody     "HIP 97804"
	Orbit
	{
		Period          1000
		SemiMajorAxis   72.0793459
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 97804 A"
{
	ParentBody     "HIP 97804 AB"
	Class	         "F6Iab"
	MassSol        5.7
	RadSol         66
	Luminosity     2630
	Teff           6000
	FeH            0.1

	Orbit
	{
		RefPlane        "Equator"
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
	Class	         "B9.8V"
	MassSol        2.3
	Age            0.0264

	Orbit
	{
		RefPlane        "Equator"
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
	Class	         "F1V"

	Orbit
	{
		Period          1000
		SemiMajorAxis   122.515896
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 罗堰一(***)
Barycenter	"HIP 101923 A"
{
	ParentBody     "HIP 101923"
	BinaryOrbit
	{
		Period          420
		Separation      168
		Eccentricity    0.73
		Inclination     75
		AscendingNode   93
		Epoch           2420498.94650171
		ArgOfPericenter 90
		MeanAnomaly     0
	}
}

Star	"HIP 101923 Aa"
{
	ParentBody     "HIP 101923 A"
	Class	         "B6III"
	MassSol        5.01
	LumBol         1893
	Teff           15439
	FeH            0.14

	BinaryOrbit
	{
		Separation      18.1927
	}
}

Star	"HIP 101923 Ab"
{
	ParentBody     "HIP 101923 A"
	Class	       "A8.8 V"

	/*BinaryOrbit
	{
		Separation      18.1927
	}*/
}

Star	"HIP 101923 B"
{
	ParentBody     "HIP 101923"
	Class	         "B6IV"

	/*Orbit
	{
		Period          420
		Eccentricity    0.73
		Inclination     75
		AscendingNode   93
		Epoch           2420498.94650171
		ArgOfPericenter 270
		MeanAnomaly     0
	}*/
}

// 渐台一(***)
Star	"HIP 92791 A"
{
	ParentBody     "HIP 92791"
	Class	         "M4 II"
	MassSol        7.3
	RadSol         286 // 381
	Luminosity     12900 // 23100
	Teff           3550 // 3650

	/*BinaryOrbit
	{
		Period          24000
		Separation      24000
	}*/
}

Barycenter	"ES 2028 BC/ADS 11825 BC/HIP 92791 BC"
{
	ParentBody     "HIP 92791"
	BinaryOrbit
	{
		Period          24000
		Separation      24000
	}
}

Star	"HIP 92791 B"
{
	ParentBody     "HIP 92791 BC"
	Class	         "B7.1 V"

	BinaryOrbit
	{
		Period          10500
		Separation      600
	}
}

Star	"HIP 92791 C"
{
	ParentBody     "HIP 92791 BC"
	Class	         "A1.6 V"

	/*BinaryOrbit
	{
		Period          10500
		Separation      600
	}*/
}

// 渐台二(******?)
// 注释掉的都是光学伴星
Remove "Sheliak A"{ParentBody "Sheliak"}
Remove "Sheliak B"{ParentBody "Sheliak"}
/*Barycenter "HIP 92420 Aa"
{
	ParentBody "HIP 92420"
	BinaryOrbit
	{
		Separation      156.6
	}
}*/

Star "HIP 92420 Aa1"
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
	Class      "B2"
	MassSol    2.47

	/*BinaryOrbit
	{
		Separation      156.6
	}*/
	Orbit
	{
		SemiMajorAxis   156.6
	}
}

Barycenter "HIP 92420 B/HD 174664/BD+33 3224/SAO 67453"
{
	ParentBody "HIP 92420"
	Orbit
	{
		SemiMajorAxis   13253
		ArgOfPericenter 145
		MeanAnomaly     0
	}
}

Star "HIP 92420 Ba"
{
	ParentBody "HIP 92420 B"
	Class      "B7V"

	Orbit
	{
		PeriodDays      4.348
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 92420 Bb(?)"
{
	ParentBody "HIP 92420 B"
	Class      "F"

	Orbit
	{
		PeriodDays      4.348
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

/*Star "HIP 92420 C"
{
	ParentBody "HIP 92420"
	Class      "B2"

	Orbit
	{
		SemiMajorAxis   13630
		ArgOfPericenter 245
		MeanAnomaly     0
	}
}*/

/*Star "HIP 92420 D/UCAC3 247-141831"
{
	ParentBody "HIP 92420"
	Class      "K3V"

	Orbit
	{
		SemiMajorAxis   18560
		ArgOfPericenter 64
		MeanAnomaly     0
	}
}*/

/*Star "HIP 92420 E/BD+33 3222"
{
	ParentBody "HIP 92420"
	Class      "G5"

	Orbit
	{
		SemiMajorAxis   19430
		ArgOfPericenter 320
		MeanAnomaly     0
	}
}*/

Star "HIP 92420 F/BD+33 3225"
{
	ParentBody "HIP 92420"
	Class      "G5"

	Orbit
	{
		SemiMajorAxis   24940
		ArgOfPericenter 15
		MeanAnomaly     0
	}
}

// 渐台四(*)
Star	"HIP 93903 A"
{
	ParentBody     "HIP 93903"
	Class	         "B6IV"
	MassSol        5.02
	Luminosity     1349
	Teff           13428

	Orbit
	{
		Period          216.93
		Eccentricity    0.637
		Inclination     145.5
		AscendingNode   171.4
		Epoch           2450551.07461742
		ArgOfPericenter 21.2
		MeanAnomaly     0
	}
}

Star	"HIP 93903 B"
{
	ParentBody     "HIP 93903"
	Class	         "B9.5 IV"

	Orbit
	{
		Period          216.93
		Eccentricity    0.637
		Inclination     145.5
		AscendingNode   171.4
		Epoch           2450551.07461742
		ArgOfPericenter 201.2
		MeanAnomaly     0
	}
}

// 辇道二(**)
// BD+38 3491可能是光学伴星
Star	"HIP 94481 A"
{
	ParentBody     "HIP 94481"
	Class	         "B2.5IV"
	MassSol        9.97 // 10.1
	RadSol         4.3
	Luminosity     6605
	LumBol         19095
	Teff           17360 // 19525
	FeH            -0.01
	Age            0.0225

	Orbit
	{
		PeriodDays      56.4
		Eccentricity    0.53
		Epoch           2441868.4
		ArgOfPericenter 157
		MeanAnomaly     0
		//SemiAmplitude   2.8
	}
}

Star	"HIP 94481 B"
{
	ParentBody     "HIP 94481"
	Class	         "B7.3 V"

	Orbit
	{
		PeriodDays      56.4
		Eccentricity    0.53
		Epoch           2441868.4
		ArgOfPericenter 337
		MeanAnomaly     0
	}
}

// 辇道三(***)
Star	"HIP 94713 A"
{
	ParentBody     "HIP 94713"
	Class	         "K0II"
	RadSol         57
	Teff           4500
	FeH            -0.01

	/*BinaryOrbit
	{
		Separation      23844
	}*/
}

Barycenter	"BD+37 3399/HIP 94713 B"
{
	ParentBody     "HIP 94713"
	BinaryOrbit
	{
		Separation      23844
	}
}

Star	"HIP 94713 Ba"
{
	ParentBody     "HIP 94713 B"
	Class	         "K2III"

	Orbit
	{
		RefPlane        "Equator"
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
	Class	         "A7.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          2.46265
		Eccentricity    0.474976
		Inclination     -47.8872
		AscendingNode   72.732
		ArgOfPericenter 100.082
		MeanAnomaly     160.523
	}
}

// 辇道四(a2**)
Star	"HIP 95556 A"
{
	ParentBody     "HIP 95556"
	Class	         "B8VpSi(FeII)"
	MassSol        4.08
	RadSol         5.03
	Luminosity     501
	Teff           12190
	Age            0.145

	Orbit
	{
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
	Class	         "B5.9 V"

	Orbit
	{
		PeriodDays      35.0225
		Eccentricity    0.45
		Epoch           2438929.1
		ArgOfPericenter 290
		MeanAnomaly     0
	}
}

// 辇道五(*****)
Barycenter "HIP 97295 AB"
{
	ParentBody     "HIP 97295"
	BinaryOrbit
	{
		Period          3700000
		Separation      16792
	}
}

Star	"HIP 97295 A"
{
	ParentBody     "HIP 97295 AB"
	Class	         "F7V"
	MassSol        1.24
	RadSol         1.538
	Luminosity     3.66
	Teff           6455
	FeH            0.027
	Age            2.8

	BinaryOrbit
	{
		Period          6200
		Separation      545.74
	}
}

Star	"HIP 97295 B"
{
	ParentBody     "HIP 97295 AB"
	Class	         "K6V"
	MassSol        0.65

	/*BinaryOrbit
	{
		Period          6200
		Separation      545.74
	}*/
}

Barycenter "HIP 97295 FG"
{
	ParentBody     "HIP 97295"
	/*BinaryOrbit
	{
		Period          3700000
		Separation      16792
	}*/
}

Star	"HIP 97295 F"
{
	ParentBody     "HIP 97295 FG"
	Class	         "K3V"

	BinaryOrbit
	{
		Period          238
		Separation      54.574
	}
}

Star	"HIP 97295 G"
{
	ParentBody     "HIP 97295 FG"
	Class	         "K3V"

	/*BinaryOrbit
	{
		Period          238
		Separation      54.574
	}*/
}
