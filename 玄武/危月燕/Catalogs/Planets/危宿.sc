// 坟墓一
Remove "ZET2 Aqr"{ParentBody "ZET Aqr"}
Remove "ZET1 Aqr"{ParentBody "ZET Aqr"}
Remove "ZET2 Aqr A"{ParentBody "ZET2 Aqr"}
Remove "ZET2 Aqr B"{ParentBody "ZET2 Aqr"}
Barycenter "ZET Aqr A/ZET2 Aqr Aab/HD 213052 A/HR 8559/SAO 146108"
{
	ParentBody "ZET Aqr"
	Orbit
	{
		Period          540
		Eccentricity    0.419
		Inclination     142
		AscendingNode   131.3
    //EpochB          1981.5
		ArgOfPericenter 89.3
		MeanAnomaly     0
	}
}

Star "坟墓一/ZET Aqr B/ZET1 Aqr B/HD 213051 B/HR 8558/SAO 146107"
{
	ParentBody "ZET Aqr"
	Class      "F3 V"
	MassSol    1.4

  Orbit
	{
		Period          540
		Eccentricity    0.419
		Inclination     142
		AscendingNode   131.3
    //EpochB          1981.5
		ArgOfPericenter 269.3
		MeanAnomaly     0
	}
}

Star "ZET Aqr Aa"
{
	ParentBody "ZET Aqr A"
	Class      "F6 IV"
	MassSol    1.4
  FeH        -0.13
  Age        1

	Orbit
	{
		Period          25.95
		Eccentricity    0.872
		Inclination     11.8
		AscendingNode   293.7
		//EpochB          2006.52
		ArgOfPericenter 280.9
		MeanAnomaly     0
	}
}

Star "ZET Aqr Ab"
{
	ParentBody "ZET Aqr A"
	Class      ""
	MassSol    0.6

  Orbit
	{
		Period          25.95
		Eccentricity    0.872
		Inclination     11.8
		AscendingNode   293.7
		//EpochB          2006.52
		ArgOfPericenter 100.9
		MeanAnomaly     0
	}
}

// 坟墓二(*)
Remove "Sadachbia A"{ParentBody "Sadachbia"}
Remove "Sadachbia B"{ParentBody "Sadachbia"}
Barycenter "HIP 110395 A"
{
	ParentBody "HIP 110395"
  Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   3.50119
		Period          20.8661
		Eccentricity    0
		Inclination     63.64
		AscendingNode   136.643
		ArgOfPericenter -60.343
		MeanAnomaly     77.4901
	}
}

Star "HIP 110395 Aa"
{
	ParentBody "HIP 110395 A"
	Class      "A0 V"
  Teff       10500
  FeH        0.3

	Orbit
	{
		PeriodDays      58.1
		//SemiMajorAxis   0.032
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 110395 Ab"
{
	ParentBody "HIP 110395 A"
	Class      "K1.6 V"
	Orbit
	{
		PeriodDays      58.1
		//SemiMajorAxis   0.368
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"UCAC2 31430071/HIP 110395 B"
{
	ParentBody     "HIP 110395"
	Class	       "F7.1 V"

  Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   3.50119
		Period          20.8661
		Eccentricity    0
		Inclination     63.64
		AscendingNode   136.643
		ArgOfPericenter 120.343
		MeanAnomaly     77.4901
	}
}

// 坟墓四
Remove "Seat A"{ParentBody "Seat"}
Remove "Seat B"{ParentBody "Seat"}
Star "HIP 110672 A"
{
	ParentBody "HIP 110672"
	Class      "B1III"
	MassSol    10.7
	RadSol     6.2
	Luminosity 7302
	Teff       27094
	FeH        -0.02
	Age        0.001

	Orbit
	{
		PeriodDays      84.1
		//SemiMajorAxis   0.17045455
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 110672 B"
{
	ParentBody "HIP 110672"
	Class      "Be"

	Orbit
	{
		PeriodDays      84.1
		//SemiMajorAxis   0.72954545
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 人二
Remove "1 Peg A"{ParentBody "1 Peg"}
Remove "1 Peg B"{ParentBody "1 Peg"}
Remove "1 Peg Ba"{ParentBody "1 Peg B"}
Remove "1 Peg Bb"{ParentBody "1 Peg B"}
Star "HIP 105502 A"
{
	ParentBody "HIP 105502"
	Class      "K1 III"
	MassSol    1.57
	RadSol     12
	Luminosity 71.78
	Teff       4600
	FeH        0.01

	Orbit
	{
		Period          36707.25
		//SemiMajorAxis   811.2182
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 105502 B"
{
	ParentBody "HIP 105502"
	Orbit
	{
		Period          36707.25
		//SemiMajorAxis   911.4812
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 105502 Ba"
{
	ParentBody "HIP 105502 B"
	Class      "K0 V"

	Orbit
	{
		Period          3.042
		//SemiMajorAxis   1.2732 //unknown
		Eccentricity    0.29
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 105502 Bb"
{
	ParentBody "HIP 105502 B"
	Class      "K" //(?)

	Orbit
	{
		Period          3.042
		//SemiMajorAxis   1.2732 //unknown
		Eccentricity    0.29
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 臼一
Star "臼一/MU1 Cyg/HD 206826/HR 8309/SAO 89940"
{
	ParentBody "HIP 107310"
	Class      "F6V"
	MassSol    1.31
	RadSol     1.88
	Luminosity 6
	Teff       6534
	FeH        -0.16
	Age        3.46

	Orbit
	{
		Period          789
		Eccentricity    0.66
		Inclination     75.5
		AscendingNode   110.1
		//EpochB          1958
		ArgOfPericenter 325.7
		MeanAnomaly     0
	}
}

Star "MU2 Cyg/HD 206827/HR 8310/SAO 89939"
{
	ParentBody "HIP 107310"
	Class      "G2V"
	MassSol    0.99
	RadSol     1.08
	Luminosity 1.4
	Teff       5998
	FeH        -0.24
	Age        7.11

	Orbit
	{
		Period          789
		Eccentricity    0.66
		Inclination     75.5
		AscendingNode   110.1
		//EpochB          1958
		ArgOfPericenter 145.7
		MeanAnomaly     0
	}
}

// 臼二
Remove "KAP Peg A"{ParentBody "KAP Peg"}
Remove "KAP Peg B"{ParentBody "KAP Peg"}
Remove "KAP Peg Ba"{ParentBody "KAP Peg B"}
Remove "KAP Peg Bb"{ParentBody "KAP Peg B"}
Star "HIP 107354 A"
{
	ParentBody "HIP 107354"
	Class      "F5IV"
	MassSol    1.549
	Teff       6579
	FeH        -0.37

	Orbit
	{
		PeriodDays      4227.05
		//SemiMajorAxis   8.139
		Eccentricity    0.318
		Inclination     107.872
		AscendingNode   109.14
		Epoch          	2452398
		ArgOfPericenter 124.14
		MeanAnomaly     0
	}
}

Barycenter "HIP 107354 B"
{
	ParentBody "HIP 107354"
	Orbit
	{
		PeriodDays      4227.05
		//SemiMajorAxis   8.139
		Eccentricity    0.318
		Inclination     107.872
		AscendingNode   109.14
		Epoch          	2452398
		ArgOfPericenter 304.14
		MeanAnomaly     0
	}
}

Star "HIP 107354 Ba"
{
	ParentBody "HIP 107354 B"
	Class      ""
	MassSol    1.662

	Orbit
	{
		PeriodDays      5.9714971
		//SemiMajorAxis   0.08715
		Eccentricity    0.0073
		Inclination     124.9
		AscendingNode   359.1
		Epoch          	2452402.225
		ArgOfPericenter 139.1
		MeanAnomaly     0
	}
}

Star "HIP 107354 Bb"
{
	ParentBody "HIP 107354 B"
	Class      ""
	MassSol    0.814

	Orbit
	{
		PeriodDays      5.9714971
		//SemiMajorAxis   0.08715
		Eccentricity    0.0073
		Inclination     124.9
		AscendingNode   359.1
		Epoch          	2452402.225
		ArgOfPericenter 359.1
		MeanAnomaly     0
	}
}

// 臼三
Remove "IOT Peg A"{ParentBody "IOT Peg"}
Remove "IOT Peg B"{ParentBody "IOT Peg"}
Star "HIP 109176 Aa"
{
	ParentBody "HIP 109176"
	Class      "F5V"
	MassSol    1.33
	RadSol     1.526
	Teff       6580
	Age        0.004

	Orbit
	{
		PeriodDays      10.213025316
		Eccentricity    0.00176463
		Inclination     95.8312
		AscendingNode   176.26275
		Epoch           2452997.37852
		ArgOfPericenter 92.818
		MeanAnomaly     0
		//SemiAmplitude   48.475739
	}
}

Star "HIP 109176 Ab"
{
	ParentBody "HIP 109176"
	Class      "G8V"
	MassSol    0.82
	RadSol     0.73
	Teff       5060

	Orbit
	{
		PeriodDays      10.213025316
		Eccentricity    0.00176463
		Inclination     95.8312
		AscendingNode   176.26275
		Epoch           2452997.37852
		ArgOfPericenter 272.818
		MeanAnomaly     0
		//SemiAmplitude   77.77716
	}
}

// 臼四(*)
Star	"HIP 110371 A"
{
	ParentBody     "HIP 110371"
	Class	       "B9 III"
	Luminosity     541
	Teff           11403

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0405649
		Period          0.0215932
		Eccentricity    0.0158386
		Inclination     -144.325
		AscendingNode   -145.321
		ArgOfPericenter -133.478
		MeanAnomaly     49.8493
	}
}

Star	"HIP 110371 B"
{
	ParentBody     "HIP 110371"
	Class	       "A5.3 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.102227
		Period          0.0215932
		Eccentricity    0.0158386
		Inclination     -144.325
		AscendingNode   -145.321
		ArgOfPericenter 46.5224
		MeanAnomaly     49.8493
	}
}

// 车府三
Remove "2 Lac A"{ParentBody "2 Lac"}
Remove "2 Lac B"{ParentBody "2 Lac"}
Star	"HIP 110351 A"
{
	ParentBody     "HIP 110351"
	Class	       "B6V"
	MassSol        5.01
	Luminosity     1084
	Teff           13996

	Orbit
	{
		Period          2.61643
		Eccentricity    0.04
		Epoch           2427770
		ArgOfPericenter 277.4
		MeanAnomaly     0
		//SemiAmplitude   79.5
	}
}

Star	"HIP 110351 B"
{
	ParentBody     "HIP 110351"
	Class	       "B6V"

	Orbit
	{
		Period          2.61643
		Eccentricity    0.04
		Epoch           2427770
		ArgOfPericenter 97.4
		MeanAnomaly     0
		//SemiAmplitude   100
	}
}

// 车府五(*)
Remove "59 Cyg (AB)"{ParentBody "59 Cyg"}
Remove "59 Cyg A"{ParentBody "59 Cyg"}
Remove "59 Cyg Aa"{ParentBody "59 Cyg A"}
Remove "59 Cyg Ab"{ParentBody "59 Cyg A"}
Remove "59 Cyg B"{ParentBody "59 Cyg (AB)"}
Remove "59 Cyg C"{ParentBody "59 Cyg"}
Star	"HIP 103632 Aa"
{
	ParentBody     "HIP 103632"
	Class	       "B1.5 V"
	MassSol        6.3 // 9.4
	RadSol         5.5 // 7
	Luminosity     7943
	Teff           21800

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      28.1871
		Eccentricity    0.141
		Epoch           2445677.6
		ArgOfPericenter 77
		MeanAnomaly     0
		SemiAmplitude   11.7
	}
}

Star	"HIP 103632 Ab"
{
	ParentBody     "HIP 103632"
	Class	       "sdO"
	MassSol        0.62 // 0.91
	RadSol         0.34 // 0.43
	Luminosity     1000
	Teff           52100

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      28.1871
		Eccentricity    0.141
		Epoch           2445677.6
		ArgOfPericenter 257
		MeanAnomaly     0
		SemiAmplitude   11.7
	}
}

Star	"HIP 103632 Ac"
{
	ParentBody     "HIP 103632"
	Class	       "A3V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   53.9902
		Period          88.8824
		Eccentricity    0.0444235
		Inclination     -90.4231
		AscendingNode   -7.53683
		ArgOfPericenter 64.12
		MeanAnomaly     196.718
	}
}

Star	"HIP 103632 B"
{
	ParentBody     "HIP 103632"
	Class	       "A8III"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   118.304
		Period          288.298
		Eccentricity    0.0659792
		Inclination     -91.6212
		AscendingNode   -6.96919
		ArgOfPericenter 169.791
		MeanAnomaly     279.784
	}
}

Star	"HIP 103632 C"
{
	ParentBody     "HIP 103632"
	Class	       "B6.9V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   255.196
		Period          913.33
		Eccentricity    0.0394727
		Inclination     -91.7294
		AscendingNode   -6.95202
		ArgOfPericenter 285.913
		MeanAnomaly     176.006
	}
}

// 车府六
Star	"HIP 104060 A"
{
	ParentBody     "HIP 104060"
	Class	       "K4Ib"
	MassSol        8
	RadSol         200
	Luminosity     5303
	Teff           3920
	FeH            -0.41

	Orbit
	{
		PeriodDays      6750
		//SemiMajorAxis   766*RadSol
		Eccentricity    0.25
		Inclination     50
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 104060 B"
{
	ParentBody     "HIP 104060"
	Class	       "A1.5V"
	MassSol        2.5
	Orbit
	{
		PeriodDays      6750
		//SemiMajorAxis   766*RadSol
		Eccentricity    0.25
		Inclination     50
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 车府七(*)
Star	"HIP 106711 A"
{
	ParentBody     "HIP 106711"
	Class	       "A3Vn"
	MassSol        1.68
	RadSol         1.6
	Luminosity     35.64
	Teff           7859
	Age            0.606

	Orbit
	{
		PeriodDays      574.632
		Eccentricity    0.5349
		Inclination     102.1
		AscendingNode   18.92
		Epoch           2448579.5387 // ?
		ArgOfPericenter 126.56
		MeanAnomaly     0
	}
}

Star	"HIP 106711 B"
{
	ParentBody     "HIP 106711"
	Class	       "F3.8"

	Orbit
	{
		PeriodDays      574.632
		Eccentricity    0.5349
		Inclination     102.1
		AscendingNode   18.92
		Epoch           2448579.5387 // ?
		ArgOfPericenter 306.56
		MeanAnomaly     0
	}
}

// 天钩三(*)
Star	"HIP 101093 A"
{
	ParentBody     "HIP 101093"
	Class	       "A7III"
	Luminosity     28
	Teff           7816
	FeH            0.27

	Orbit
	{
		PeriodDays      840.6
		Eccentricity    0.03
		Epoch           2416214.5
		ArgOfPericenter 263.7
		MeanAnomaly     0
		//SemiAmplitude   13.9
	}
}

Star	"HIP 101093 B"
{
	ParentBody     "HIP 101093"
	Class	       "M0.1V"

	Orbit
	{
		PeriodDays      840.6
		Eccentricity    0.03
		Epoch           2416214.5
		ArgOfPericenter 83.7
		MeanAnomaly     0
	}
}

// 天钩六(*)
Remove "Kurhah A"{ParentBody "Kurhah"}
Remove "Kurhah B"{ParentBody "Kurhah"}
Remove "Kurhah Aa"{ParentBody "Kurhah A"}
Remove "Kurhah Ab"{ParentBody "Kurhah A"}
Barycenter "HIP 108917 A"
{
	ParentBody "HIP 108917"
	Orbit
	{
		Period          3800
		/*SemiMajorAxis   105.312
		Eccentricity    0.24
		Inclination     109
		AscendingNode   85*/
		ArgOfPericenter 114
		Epoch           2360233.983703
		MeanAnomaly     0
	}
}

Star "HIP 108917 Aa"
{
	ParentBody "HIP 108917 A"
	Class      "kA2.5hF2mF2IV"
	MassSol    1.045
	AbsMagn    1.79
	Teff       9000

	Orbit
	{
		PeriodDays      810.9
		Eccentricity    0.46
		/*Inclination     70.9
		AscendingNode   89.8*/
		Epoch           2438529.8
		ArgOfPericenter 286
		MeanAnomaly     0
	}
}

Star "HIP 108917 Ab"
{
	ParentBody "HIP 108917 A"
	Class      ""
	MassSol    0.408

	Orbit
	{
		PeriodDays      810.9
		Eccentricity    0.46
		/*Inclination     70.9
		AscendingNode   89.8*/
		Epoch           2438529.8
		ArgOfPericenter 106
		MeanAnomaly     0
	}
}

Barycenter "HIP 108917 B"
{
	ParentBody "HIP 108917"
	Orbit
	{
		Period          3800
		/*SemiMajorAxis   254.504
		Eccentricity    0.24
		Inclination     109
		AscendingNode   85*/
		ArgOfPericenter 294
		Epoch           2360233.983703
		MeanAnomaly     0
	}
}

Star "HIP 108917 Ba"
{
	ParentBody "HIP 108917 B"
	Class      "F8V"

	Orbit
	{
		PeriodDays      810.9
		Eccentricity    0.46
		/*Inclination     70.9
		AscendingNode   89.8*/
		Epoch           2438529.8
		ArgOfPericenter 286
		MeanAnomaly     0
	}
}

Star "HIP 108917 Bb"
{
	ParentBody "HIP 108917 B"
	Class      ""
	MassSol    0.35

	Orbit
	{
		PeriodDays      810.9
		Eccentricity    0.46
		/*Inclination     70.9
		AscendingNode   89.8*/
		Epoch           2438529.8
		ArgOfPericenter 106
		MeanAnomaly     0
	}
}

Star "HIP 108917 C"
{
	ParentBody "HIP 108917"
	Class      ""
	MassSol    0.2

	Orbit
	{
		Period          12000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 天钩九
Star	"HIP 115088 A"
{
	ParentBody     "HIP 115088"
	Class	       "G8III"
	MassSol        2.35
	Luminosity     51
	FeH            0.05

	Orbit
	{
		Period          1505
		Eccentricity    0.439
		Inclination     16
		AscendingNode   4.5
		//EpochB          1692
		ArgOfPericenter 273
		MeanAnomaly     0
	}
}

Star	"HIP 115088 B"
{
	ParentBody     "HIP 115088"
	Class	       "F6V"
	MassSol        1.29

	Orbit
	{
		Period          1505
		Eccentricity    0.439
		Inclination     16
		AscendingNode   4.5
		//EpochB          1692
		ArgOfPericenter 93
		MeanAnomaly     0
	}
}

// 造父一(*)
Remove "DEL Cep A"{ParentBody "DEL Cep"}
Remove "DEL Cep B"{ParentBody "DEL Cep"}
Barycenter	"HIP 110991 AB"
{
	ParentBody     "HIP 110991"
	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   63.5217
		Period          5421.6
		Eccentricity    0.364746
		Inclination     99.9502
		AscendingNode   -38.0511
		ArgOfPericenter -98.2069
		MeanAnomaly     -55.9971
	}
}

Star	"HIP 110991 A"
{
	ParentBody     "HIP 110991 AB"
	Class	       "F5 Ib" // G1Ib
	MassSol        4.5
	RadSol         44.5
	Luminosity     2000
	Teff           6800 // 5600
	FeH            0.08
	Age            0.1

	Orbit
	{
		RefPlane        "Equator"
		Period          6.03
		Eccentricity    0.647
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   1.509
	}
}

Star	"HIP 110991 B"
{
	ParentBody     "HIP 110991 AB"
	Class	       ""
	MassSol        1.2 // 0.2

	Orbit
	{
		RefPlane        "Equator"
		Period          6.03
		Eccentricity    0.647
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter	"HD 213317/HIP 110991 C"
{
	ParentBody     "HIP 110991"
	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   66.2309
		Period          5421.6
		Eccentricity    0.364746
		Inclination     99.9502
		AscendingNode   -38.0511
		ArgOfPericenter 81.7931
		MeanAnomaly     -55.9971
	}
}

Star	"HD 213317 A"
{
	ParentBody     "HD 213317"
	Class	       "B7III"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0274325
		Period          0.0759538
		Eccentricity    0
		Inclination     132.129
		AscendingNode   138.393
		ArgOfPericenter 23.8613
		MeanAnomaly     -103.202
	}
}

Star	"HD 213317 B"
{
	ParentBody     "HD 213317"
	Class	       "B8IV"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0456148
		Period          0.0759538
		Eccentricity    0
		Inclination     132.129
		AscendingNode   138.393
		ArgOfPericenter 203.861
		MeanAnomaly     -103.202
	}
}

// 造父二(*)
Star	"HIP 109492 A"
{
	ParentBody     "HIP 109492"
	Class	       "K1.5Ib"
	RadSol         230
	Luminosity     5660
	Teff           4000
	FeH            0.22

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   9.11219
		Period          20.6936
		Eccentricity    0.762505
		Inclination     77.3551
		AscendingNode   -82.451
		ArgOfPericenter -111.936
		MeanAnomaly     167.206
	}
}

Star	"HIP 109492 B"
{
	ParentBody     "HIP 109492"
	Class	       ""
	MassSol        1.5 //(?)

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   6.96817
		Period          20.6936
		Eccentricity    0.762505
		Inclination     77.3551
		AscendingNode   -82.451
		ArgOfPericenter 68.0638
		MeanAnomaly     167.206
	}
}

// 造父四(One of the largest stars)
Star	"The Garnet Star"
{
	ParentBody     "MU Cep"
	Class	       "M2Iae"
	MassSol        19.2
	RadSol         1260 // 1650
	Luminosity     283000 // 340000
	LumBol         283000
	Teff           3750 // 3540 // 3789
	Age            0.01

	Orbit
	{
		RefPlane        "Static"
	}
}

/*Star	"HIP 107259 B"
{
	ParentBody     "HIP 107259"
	Class	       "M0"

	Orbit
	{
		SemiMajorAxis  85
	}
}

Star	"HIP 107259 C"
{
	ParentBody     "HIP 107259"
	Class	       "A"

	Orbit
	{
		SemiMajorAxis  150
	}
}*/

// 盖屋二
Star	"HIP 108991 A"
{
	ParentBody     "HIP 108991"
	Class	       "A5IV"
	MassSol        1.69
	RadSol         2.97
	Luminosity     29.4
	Teff           7946
	FeH            0.26
	Age            0.465

	Orbit
	{
		PeriodDays      7.83238
		Asini           0.00519
		Eccentricity    0
		Epoch           2453420.2304
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   7.2150
	}
}

Star	"HIP 108991 B"
{
	ParentBody     "HIP 108991"
	Class	       "Am"

	Orbit
	{
		PeriodDays      7.83238
		Asini           0.00519
		Eccentricity    0
		Epoch           2453420.2304
		ArgOfPericenter 180
		MeanAnomaly     180
	}
}

// 虚梁二
Star	"HIP 110578 A"
{
	ParentBody     "HIP 110578"
	Class	       "A0V"
	MassSol        2.8
	Luminosity     88.2
	Teff           10328

	Orbit
	{
		Period          145.07
		Eccentricity    0.702
		Inclination     161.4
		AscendingNode   113.5
		//EpochB          1987.66
		ArgOfPericenter 116.9
		MeanAnomaly     0
	}
}

Star	"HIP 110578 B"
{
	ParentBody     "HIP 110578"
	Class	       "A0V"

	Orbit
	{
		Period          145.07
		Eccentricity    0.702
		Inclination     161.4
		AscendingNode   113.5
		//EpochB          1987.66
		ArgOfPericenter 296.9
		MeanAnomaly     0
	}
}

// 虚梁三(*)
Star	"HIP 111710 A"
{
	ParentBody     "HIP 111710"
	Class	       "K2 III"
	RadSol         13
	Luminosity     60
	Teff           4581
	FeH            0.14

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   1.21098
		Period          7.47585
		Eccentricity    0.877713
		Inclination     2.03824
		AscendingNode   165.243
		ArgOfPericenter -79.3491
		MeanAnomaly     15.156
	}
}

Star	"HIP 111710 B"
{
	ParentBody     "HIP 111710"
	Class	       "K0.3 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   4.4197
		Period          7.47585
		Eccentricity    0.877713
		Inclination     2.03824
		AscendingNode   165.243
		ArgOfPericenter 100.651
		MeanAnomaly     15.156
	}
}

// 天钱二
Star	"HIP 107608 A"
{
	ParentBody     "HIP 107608"
	Class	       "A1V"
	MassSol        2.32
	Luminosity     86
	Teff           9716
	Age            0.281

	Orbit
	{
		Period          19.957
		Eccentricity    0.256
		Inclination     103
		AscendingNode   29.1
		//EpochB          2006
		ArgOfPericenter 19
		MeanAnomaly     0
	}
}

Star	"HIP 107608 B"
{
	ParentBody     "HIP 107608"
	Class	       "A1V"
	MassSol        2.32

	Orbit
	{
		Period          19.957
		Eccentricity    0.256
		Inclination     103
		AscendingNode   29.1
		//EpochB          2006
		ArgOfPericenter 199
		MeanAnomaly     0
	}
}
