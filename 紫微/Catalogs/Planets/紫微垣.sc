// 北极四(SB**)
Star "HIP 69112 A"
{
  ParentBody "HIP 69112"
	Class      "K3IIIb Fe-0.5"
	RadSol     28
	Luminosity 436.72
	Teff       4165
	FeH        -0.19

	Orbit
	{
	  PeriodDays      605.8
		Eccentricity    0.137
		Inclination     136
		AscendingNode   325.5
		Epoch           2438901.7
		ArgOfPericenter 131.8
		//SemiAmplitude 12.65
		MeanAnomaly     0
	}
}

Star "HIP 69112 B"
{
  ParentBody "HIP 69112"
	Class      "B3.2 V"

  Orbit
	{
	  PeriodDays      605.8
		Eccentricity    0.137
		Inclination     136
		AscendingNode   325.5
		Epoch           2438901.7
		ArgOfPericenter 311.8
		//SemiAmplitude 12.65
		MeanAnomaly     0
	}
}

// 北极五(*/B-C为光学伴星?)

// 四辅二(**)
Star	"HIP 51384 A"
{
	ParentBody     "HIP 51384"
	Class          "A9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          243.452842
		Eccentricity    0.829528391
		Inclination     0.826756716
		AscendingNode   0
		ArgOfPericenter 73.1131611
		MeanAnomaly     40.6340717
	}
}

Star	"HIP 51384 B"
{
	ParentBody     "HIP 51384"
	Class          "F6.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          243.452842
		Eccentricity    0.829528391
		Inclination     0.826756716
		AscendingNode   0
		ArgOfPericenter 253.113161
		MeanAnomaly     40.6340717
	}
}

// 四辅三(PM***)
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=90089
Barycenter	"HIP 51502 A"
{
	ParentBody     "HIP 51502"
	BinaryOrbit // GAT_14 Gaia pos.
	{
    Separation 295.1 // 13"
	}
}

Star	"HIP 51502 Aa"
{
	ParentBody     "HIP 51502 A"
	Class          "F4VkF2mF2"
  MassSol        1.29
  RadSol         1.4
  Luminosity     3.36
  Teff           6602
  FeH            -0.26
  Age            1.074

  Orbit
	{
		RefPlane        "Equator"
		Period          0.0173394434
		Eccentricity    0
		Inclination     -1.07912016
		AscendingNode   0
		ArgOfPericenter 82.49294
		MeanAnomaly     -120.767644
	}
}

// DR2-HIP: large dmu(A), WD companion? EDR3: RUWE(A,B) = 9.9, 1.3.
Star	"HIP 51502 Ab(?)"
{
	ParentBody     "HIP 51502 A"
	Class          "WD"

  Orbit
	{
		RefPlane        "Equator"
		Period          0.0173394434
		Eccentricity    0
		Inclination     -1.07912016
		AscendingNode   0
		ArgOfPericenter 262.49294
		MeanAnomaly     -120.767644
	}
}

Star	"HIP 51502 B(?)"
{
	ParentBody     "HIP 51502"
	Class          "M0"
  MassSol        0.26

	/* BinaryOrbit
	{
    Separation 295.1 // 13"
	} */
}

// 紫微左垣二(SB***?)
Remove "TET Dra A"{ParentBody "TET Dra"}
Remove "TET Dra B"{ParentBody "TET Dra"}
Star	"HIP 78527 A"
{
	ParentBody     "HIP 78527"
	Class          "F9V" // F8IV-V
  MassSol        1.53 // 1.2/1.18
  RadSol         2.83
  Luminosity     9.998
  Teff           6105
  FeH            0.19
  Age            2.03

	Orbit
	{
		PeriodDays      3.0708216
		Eccentricity    0.039
		Epoch           2445971.98 // 5971.98 TJD?
		ArgOfPericenter 243
		MeanAnomaly     0
    //SemiAmplitude   25.1
	}
}

Star	"HIP 78527 B"
{
	ParentBody     "HIP 78527"
	Class          ""
  MassSol        0.46 // 0.21?

	Orbit
	{
    PeriodDays      3.0708216
		Eccentricity    0.039
		Epoch           2445971.98 // 5971.98 TJD?
		ArgOfPericenter 63
		MeanAnomaly     0
    //SemiAmplitude   25.1
	}
}

// 紫微左垣三(PM**)
Star	"HIP 80331 A"
{
	ParentBody     "HIP 80331"
	Class          "G8III"
  MassSol        2.55
  RadSol         11
  Luminosity     60
  Teff           5055
  FeH            -0.04
  Age            0.55

	BinaryOrbit
	{
		Period          1000
    Separation      140
	}
}

Star	"HIP 80331 B"
{
	ParentBody     "HIP 80331"
	Class          "K2V"

	/* Orbit
	{
    Period          1000
		ArgOfPericenter 180
		MeanAnomaly     0
	} */
}

// 紫微左垣四(**)
Star	"HIP 83895 A"
{
	ParentBody     "HIP 83895"
	Class          "B6 III"
  MassSol        3.5
  RadSol         2.3
	Luminosity     148
  Teff           13397
  FeH            -0.95

	Orbit
	{
		RefPlane        "Equator"
		Period          12.6081934
		Eccentricity    0.681791306
		Inclination     -0.754740477
		AscendingNode   0
		ArgOfPericenter 80.1189629
		MeanAnomaly     -153.594524
	}
}

Star	"HIP 83895 B"
{
	ParentBody     "HIP 83895"
	Class          "B9.4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          12.6081934
		Eccentricity    0.681791306
		Inclination     -0.754740477
		AscendingNode   0
		ArgOfPericenter 260.118963
		MeanAnomaly     -153.594524
	}
}

// 紫微左垣五(SB**)
Star "HIP 92782 A"
{
  ParentBody "HIP 92782"
	Class      "K0III"
	MassSol    2.05
	RadSol     19
	Luminosity 2.23
  AbsMagn    -0.41
  AbsMagnBol -0.7
	Teff       4561
	FeH        0.01
	Age        1.37

	Orbit
	{
	  PeriodDays      258.48
		Eccentricity    0.21
		Epoch           2441977.5
		ArgOfPericenter 118
		//SemiAmplitude 6
		MeanAnomaly     0
	}
}

Star "HIP 92782 B"
{
  ParentBody "HIP 92782"
	Class      "WD"

	Orbit
	{
	  PeriodDays      258.48
		Eccentricity    0.21
		Epoch           2441977.5
		ArgOfPericenter 298
		MeanAnomaly     0
	}
}

// 紫微左垣七(SB***)
Barycenter "HIP 114222 A"
{
  ParentBody "HIP 114222"
	BinaryOrbit
	{
	  Period          162.8
		Eccentricity    0.5968
		Inclination     30
		AscendingNode   90.3
		Epoch           2427647.83205846 // B1934.573
		ArgOfPericenter 270
		MeanAnomaly     0
	}
}

Star "HIP 114222 Aa"
{
  ParentBody "HIP 114222 A"
	Class      "G7III"
	MassSol    3.63
	Teff       5226
	FeH        0.29
	Age        0.1

	Orbit
	{
	  PeriodDays      556.72
		Eccentricity    0.297
		Inclination     99
		AscendingNode   109.2
		Epoch           2439172.9
		ArgOfPericenter 187.6
		//SemiAmplitude 24.18
		MeanAnomaly     0
	}
}

Star "HIP 114222 Ab"
{
  ParentBody "HIP 114222 A"
	Class      "F5V"
	MassSol    3.27

	Orbit
	{
	  PeriodDays      556.72
		Eccentricity    0.297
		Inclination     99
		AscendingNode   109.2
		Epoch           2439172.9
		ArgOfPericenter 7.6
		MeanAnomaly     0
	}
}

Star "HIP 114222 B"
{
  ParentBody "HIP 114222"
	Class      "A7V" // A9V
	MassSol    1.93

	/* Orbit
	{
	  Period          162.8
		Eccentricity    0.5968
		Inclination     30
		AscendingNode   90.3
		Epoch           2427647.83205846 // B1934.573
		ArgOfPericenter 90
		MeanAnomaly     0
	} */
}

// 紫微右垣一(SB**)
Remove "Thuban A"{ParentBody "Thuban"}
Remove "ALF Dra B"{ParentBody "Thuban"}
Star "HIP 68756 A"
{
	ParentBody "HIP 68756"
	Class      "A0IV"
	MassSol    3.186
	RadSol     4.932
  Luminosity 240
	Teff       10225
	//FeH        -0.2
	//RotationPeriod 628.8
  Age        0.28

	Orbit
	{
		PeriodDays      51.417350
		Eccentricity    0.43
		Inclination     85.4
		AscendingNode   252.6
		ArgOfPericenter 202.4
		Epoch           2453498.8
		MeanAnomaly     0
    //SemiAlplitude   48.512
	}
}

Star "HIP 68756 B"
{
	ParentBody "HIP 68756"
	Class      "A1V"
	MassSol    2.431
  RadSol     2.326
	Luminosity 47.5
  Teff       9930
  Age        0.345

	Orbit
	{
    PeriodDays      51.417350
		Eccentricity    0.43
		Inclination     85.4
		AscendingNode   252.6
		ArgOfPericenter 22.4
		Epoch           2453498.8
		MeanAnomaly     0
    //SemiAlplitude   63.58
	}
}

// 紫微右垣二(Be**)
Star "HIP 61281 A"
{
	ParentBody "HIP 61281"
	Class      "B6IIIe"
	MassSol    4.8
	RadSol     6.4
  Luminosity 1115
	Teff       14000
	FeH        -0.65

	Orbit
	{
		PeriodDays      61.555
    Eccentricity    0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 61281 B"
{
	ParentBody "HIP 61281"
	Class      "A8.3 V"

	Orbit
	{
    PeriodDays      61.555
    Eccentricity    0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 紫微右垣七(**?)
Remove "BK Cam A"{ParentBody "BK Cam"}
Remove "BK Cam B"{ParentBody "BK Cam"}

// 阴德一(**?)
Star	"HIP 51808 A"
{
	ParentBody     "HIP 51808"
	Class          "G8 III"
  MassSol        2.39
  Luminosity     69
  Teff           4965
  FeH            -0.03
  Age            2.06

	Orbit
	{
		RefPlane        "Equator"
		Period          0.176587684
		Eccentricity    0.0155693227
		Inclination     -2.20979309
		AscendingNode   0
		ArgOfPericenter 27.6322136
		MeanAnomaly     -132.493184
	}
}

Star	"HIP 51808 B"
{
	ParentBody     "HIP 51808"
	Class          "A7.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.176587684
		Eccentricity    0.0155693227
		Inclination     -2.20979309
		AscendingNode   0
		ArgOfPericenter 207.632214
		MeanAnomaly     -132.493184
	}
}

// 尚书三(*?)
Star	"HIP 81660 A"
{
	ParentBody     "HIP 81660"
	Class          "K0III CN-0.5 CH-2 Ca1" // Barium star
  MassSol        3.81
  RadSol         46.83
  Luminosity     786.7
  Teff           4471
  FeH            -0.13
  Age            0.28

	Orbit
	{
		RefPlane        "Equator"
		Period          1331.5614
		Eccentricity    0.745031774
		Inclination     -2.04819012
		AscendingNode   0
		ArgOfPericenter -6.9749211
		MeanAnomaly     -144.335719
	}
}

Star "HIP 81660 B(?)"
{
  ParentBody "HIP 81660"
	Class      "WD"

  Orbit
	{
		RefPlane        "Equator"
		Period          1331.5614
		Eccentricity    0.745031774
		Inclination     -2.04819012
		AscendingNode   0
		ArgOfPericenter 173.025079
		MeanAnomaly     -144.335719
	}
}

// 尚书五(SB**)
Star "HIP 82860 A"
{
  ParentBody "HIP 82860"
	Class      "F8V"
	MassSol    1.04
	RadSol     1.2
	Luminosity 2.02
	Teff       6298
	FeH        0.013
	Age        4.7

	Orbit
	{
	  PeriodDays      52.1089
		Eccentricity    0.2221
		Inclination     90.5
		AscendingNode   23.5
		Epoch           2453427.88
		ArgOfPericenter 158.46
		//SemiAmplitude 17.465
		MeanAnomaly     0
	}
}

Star "HIP 82860 B"
{
  ParentBody "HIP 82860"
	Class      ""
	MassSol    0.37
	RadSol     0.3
	Luminosity 0.02
	Teff       3963

	Orbit
	{
	  PeriodDays      52.1089
		Eccentricity    0.2221
		Inclination     90.5
		AscendingNode   23.5
		Epoch           2453427.88
		ArgOfPericenter 338.46
		//SemiAmplitude 17.465
		MeanAnomaly     0
	}
}

// 柱史(a2***)
Remove "PHI Dra A"{ParentBody "PHI Dra"}
Remove "PHI Dra Aa"{ParentBody "PHI Dra A"}
Remove "PHI Dra Ab"{ParentBody "PHI Dra A"}
Remove "PHI Dra B"{ParentBody "PHI Dra"}
Barycenter "HIP 89908 A"
{
	ParentBody "HIP 89908"
	BinaryOrbit
	{
		Period          307.8
		Eccentricity    0.752
		Inclination     95.6
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 89908 Aa"
{
	ParentBody "HIP 89908 A"
	Class      "B8VpSi"
	MassSol    3.3
	RadSol     2.7
	Luminosity 107
	Teff       11429
	RotationPeriod 41.19576
	Age        0.245

	Orbit
	{
		PeriodDays      127.914 // 127.9902
		Eccentricity    0.6725 // 0.707
		Inclination     48 // 50
		//SemiAmplitude 29
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 89908 Ab"
{
	ParentBody "HIP 89908 A"
	Class      "A4V"
  MassSol    1.36

	Orbit
	{
    PeriodDays      127.914 // 127.9902
		Eccentricity    0.6725 // 0.707
		Inclination     48 // 50
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 89908 B"
{
	ParentBody "HIP 89908"
	Class      "B9V"
	MassSol    2.25
	Age        0.33

	/* Orbit
	{
    Period          307.8
		Eccentricity    0.752
		Inclination     95.6
		ArgOfPericenter 180
		MeanAnomaly     0
	} */
}

// 大理一(SB**)
Star "HIP 59504 A"
{
  ParentBody "HIP 59504"
	Class      "kA6hF0mF0 (III)"
	Luminosity 8.02
	Teff       7122

	Orbit
	{
	  PeriodDays      1.271
		Eccentricity    0.01
		Epoch           2436763.91
		ArgOfPericenter 343
		//SemiAmplitude 64
		MeanAnomaly     0
	}
}

Star "HIP 59504 B" // almost no information is known about the companion star.
{
  ParentBody "HIP 59504"
	Class      "F7.6 V"

	Orbit
	{
	  PeriodDays      1.271
		Eccentricity    0.01
		Epoch           2436763.91
		ArgOfPericenter 163
		//SemiAmplitude 64
		MeanAnomaly     0
	}
}

// 御女二(SB**)
Star	"HD 175286 A"
{
	ParentBody     "HD 175286"
	Class          "A1 V"
	Luminosity      47.62

	Orbit
	{
		RefPlane        "Equator"
		Period          10.594902
		Eccentricity    0.651604295
		Inclination     -0.0615200996
		AscendingNode   0
		ArgOfPericenter 11.2016451
		MeanAnomaly     158.092841
	}
}

Star	"HD 175286 B"
{
	ParentBody     "HD 175286"
	Class          "F1.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          10.594902
		Eccentricity    0.651604295
		Inclination     -0.0615200996
		AscendingNode   0
		ArgOfPericenter 191.201645
		MeanAnomaly     158.092841
	}
}

// 御女三(未修改/RS**)
Remove "29 Dra A"{ParentBody "29 Dra"}
Remove "29 Dra B"{ParentBody "29 Dra"}
Star "HIP 85852 A"
{
	ParentBody "HIP 85852"
	Class      "K0 III"
	Radius     2923200
	MassSol    1.2

	Orbit
	{
		Period          2.4762
		Eccentricity    0.072
		Inclination     156.2
		AscendingNode   349.8
		ArgOfPericenter 297.5
		Epoch           2447479.67
		MeanAnomaly     0
	}
}

Star "HIP 85852 B"
{
	ParentBody "HIP 85852"
	Class      "DA1.5"
	Radius     8352
	MassSol    0.55
  Teff       28795

	Orbit
	{
		Period          2.4762
		Eccentricity    0.072
		Inclination     156.2
		AscendingNode   349.8
		ArgOfPericenter 117.5
		Epoch           2447479.67
		MeanAnomaly     0
	}
}

// 御女四(SB**)
Remove "CHI Dra A"{ParentBody "CHI Dra"}
Remove "CHI Dra B"{ParentBody "CHI Dra"}
Star "HIP 89937 A"
{
	ParentBody "HIP 89937"
	Class      "F7 V"
	MassSol    1.029
  RadSol     1.2
  Luminosity 1.86
  Teff       6150
  FeH        -0.41
  Age        5.3

	Orbit
	{
		Period          0.7680599
		Eccentricity    0.428
		Inclination     74.42
		AscendingNode   230.3
    Epoch           2446004.68582387
		ArgOfPericenter 299.3
		MeanAnomaly     0
	}
}

Star "HIP 89937 B"
{
	ParentBody "HIP 89937"
	Class      "K0 V"
	MassSol    0.748
  RadSol     0.73
  Luminosity 0.29
  Teff       4940

	Orbit
	{
    Period          0.7680599
		Eccentricity    0.428
		Inclination     74.42
		AscendingNode   230.3
    Epoch           2446004.68582387
		ArgOfPericenter 119.3
		MeanAnomaly     0
	}
}

// 天柱五-天柱增五(SB**)
Star	"天柱五/40 Dra/ADS 11061 B/2MASS J18000352+8000029/AG+79 490/BD+79 570/CCDM J18002+8000B/GC 24667/GCRV 10549/GSC 04578-01434/HD 166865/HIC 88127/HIP 88127/HR 6809/IDS 18076+7959 B/N30 4019/PPM 3146/ROT 2570/SAO 8994/TYC 4578-1434-1/UBV 15475/UBV M 22731/uvby98 100166865/WDS J18002+8000B/SBC9 1032/SBC7 666/PMSC 18075+7959B/Gaia DR1 2294405717462880000/WEB 14885/Gaia DR2 2294405721759384064"
{
	ParentBody	"ADS 11061"
	Class	    	"F7" // F5
  Teff        6255

	BinaryOrbit // Unknown orbit
	{
    Separation      840.373
	}
}

Star	"天柱增五/41 Dra/ADS 11061 A/2MASS J18000921+8000144/AG+79 491/BD+79 571/CCDM J18002+8000A/CSI+79 571 1/GC 24669/GCRV 10550/GSC 04578-01433/HD 166866/HIC 88136/HIP 88136/HR 6810/IDS 18076+7959 A/IRAS 18038+7959/N30 4020/PLX 4176/PPM 3147/ROT 2571/SAO 8996/TYC 4578-1433-1/UBV 15474/UBV M 22732/uvby98 100166866/WDS J18002+8000A/SBC9 1501/PMSC 18075+7959A/WEB 14887/Gaia DR2 2294405824838599808"
{
	ParentBody	"ADS 11061"
	Class	    	"Am" // K2Vvar F5?
  Teff        6253
  Oblateness  0

  /* Orbit // Unknown orbit
	{
    Separation      840.373
	} */
}

// 勾陈一(cC***)
Remove "Polaris A"{ParentBody	"Polaris"}
Remove "Polaris Aa"{ParentBody	"Polaris A"}
Remove "Polaris Ab"{ParentBody	"Polaris A"}
Remove "Polaris B"{ParentBody	"Polaris"}
Barycenter	"HIP 11767 A"
{
	ParentBody	"HIP 11767"
	BinaryOrbit // Position relative to ALF UMi Aa
	{
    Epoch           2453585.50680489 // B2005.5880
		Separation      1803.48 // 18.217"
		PositionAngle   50.540 // Position Angle
	}
}

Star	"HIP 11767 Aa"
{
	ParentBody	"HIP 11767 A"
	Class	    	"F7Ib"
  MassSol     5.4
  RadSol      37.5
  LumBol      1260
	Teff        6015
  FeH         0.05 // 112% solar
  RotationPeriod 2856
  Age         0.07

	Orbit
	{
		Period		    	29.59
		Eccentricity  	0.608
		Inclination		  146.2
		AscendingNode	  191.4
    Epoch           2447037.44466514
		ArgOfPericenter 303.01
		MeanAnomaly     0
    //SemiAmplitude   3.72
	}
}

Star	"HIP 11767 Ab"
{
	ParentBody	"HIP 11767 A"
	Class	    	"F6V"
  MassSol     1.26
  RadSol      1.04
  LumBol      3
	Age         0.07

	Orbit
	{
    Period		    	29.59
		Eccentricity  	0.608
		Inclination		  146.2
		AscendingNode	  191.4
    Epoch           2447037.44466514
		ArgOfPericenter 123.01
		MeanAnomaly     0
	}
}

Star	"HIP 11767 B"
{
	ParentBody	"HIP 11767"
	Class	    	"F3V"
	MassSol     1.39
  RadSol      1.38
  LumBol      3.9
	Teff        6900

  /*BinaryOrbit // Position relative to ALF UMi Aa
	{
    Epoch           2453585.50680489 // B2005.5880
		Separation      1803.48 // 18.217"
		PositionAngle   50.540 // Position Angle
	}*/
}

// 勾陈三(RS**/C为光学伴星)
Remove "EPS UMi A"{ParentBody "EPS UMi"}
Remove "EPS UMi Aa"{ParentBody "EPS UMi A"}
Remove "EPS UMi Ab"{ParentBody "EPS UMi A"}
Remove "EPS UMi B"{ParentBody "EPS UMi"}
Star "HIP 82080 A"
{
  ParentBody "HIP 82080"
	Class      "G5III"
	Teff       5215
	FeH        -0.25

	Orbit
	{
	  PeriodDays      39.48042
		Eccentricity    0.04
		Epoch           2433083.47
		ArgOfPericenter 143.5
		//SemiAmplitude 31.8
		MeanAnomaly     0
	}
}

Star "HIP 82080 B"
{
  ParentBody "HIP 82080"
	Class      "A8V" // F0V

	Orbit
	{
	  PeriodDays      39.48042
		Eccentricity    0.04
		Epoch           2433083.47
		ArgOfPericenter 323.5
		//SemiAmplitude 31.8
		MeanAnomaly     0
	}
}

// 勾陈六(**?)
Star	"HIP 113116 A"
{
	ParentBody     "HIP 113116"
	Class          "K4 III"
  RadSol         37
  Luminosity     317.99
  Teff           4105
  FeH            0.09

	Orbit
	{
		RefPlane        "Equator"
		Period          1830.40971
		Eccentricity    0.221341923
		Inclination     1.98394495
		AscendingNode   0
		ArgOfPericenter 118.17629
		MeanAnomaly     -16.0919222
	}
}

Star	"HIP 113116 B(?)"
{
	ParentBody     "HIP 113116"
	Class          "A9.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1830.40971
		Eccentricity    0.221341923
		Inclination     1.98394495
		AscendingNode   0
		ArgOfPericenter 298.17629
		MeanAnomaly     -16.0919222
	}
}

// 六甲一(PM**)
// Ref: https://www.researchgate.net/figure/Properties-of-HD-46588-A-and-B_tbl1_51915886
Star	"HIP 32439 B"
{
	ParentBody     "HIP 32439"
	Class          "L9"
  MassSol        0.064
  Luminosity     2.0892961308540394831222337357993e-5 // pow(10/-4.68)
  Teff           1360

	Orbit
	{
		SemiMajorAxis   1420
		ArgOfPericenter 27.46
		MeanAnomaly     0
	}
}

// 五帝内座五(**)
Star	"HD 25007 A"
{
	ParentBody     "HIP 19461"
	Class          "G8III"

	BinaryOrbit
	{
    Separation      80.5603 // 0.79"
	}
}

Star	"HD 25008 B"
{
	ParentBody     "HIP 19461"
	Class          "A3.5IV"

  /* BinaryOrbit
	{
    Separation      80.5603 // 0.79"
	} */
}

// 华盖五(PM**)
Star "HIP 6692 A"
{
  ParentBody "HIP 6692"
	Class      "K0III-IIIbCN0.5"
	RadSol     12
	Luminosity 50
	Teff       4952
	FeH        -0.13

  Orbit
	{
		RefPlane        "Equator"
		Period          0.0345250654
		Eccentricity    0.0207273234
		Inclination     0.793190598
		AscendingNode   0
		ArgOfPericenter 155.171092
		MeanAnomaly     60.2018655
	}
}

Star "HIP 6692 B"
{
  ParentBody "HIP 6692"
	Class      "F1.8 V"

  Orbit
	{
		RefPlane        "Equator"
		Period          0.0345250654
		Eccentricity    0.0207273234
		Inclination     0.793190598
		AscendingNode   0
		ArgOfPericenter 335.171092
		MeanAnomaly     60.2018655
	}
}

// 华盖七(SB**)
Star "HIP 9009 A"
{
  ParentBody "HIP 9009"
	Class      "B5III"
	MassSol    3.5
  RadSol     2.7
	Luminosity 178
	Teff       12737
  Age        0.232

	Orbit
	{
	  PeriodDays      69.92
		Eccentricity    0.3
		Epoch           2420426.02
		ArgOfPericenter 230
		//SemiAmplitude 29.6
		MeanAnomaly     0
	}
}

Star "HIP 9009 B"
{
  ParentBody "HIP 9009"
	Class      "A1.4 V"

	Orbit
	{
    PeriodDays      69.92
		Eccentricity    0.3
		Epoch           2420426.02
		ArgOfPericenter 50
		MeanAnomaly     0
	}
}

// 杠一(**?)
Star "HIP 17959 A"
{
  ParentBody "HIP 17959"
	Class      "A2IVn"
	MassSol    2.98
	RadSol     2.5
	Luminosity 185
	Teff       8892

	BinaryOrbit
	{
    Epoch           2455562.19758469
	  Separation      11660 // 106"
		PositionAngle   85
	}
}

Star "HIP 17959 B/BD+70 260"
{
  ParentBody "HIP 17959"
	Class      "F8"

	/* BinaryOrbit
	{
    Epoch           2455562.19758469
	  Separation      11660 // 106"
		PositionAngle   85
	} */
}

// 杠三(**)
Star "HIP 9763 A"
{
  ParentBody "HIP 9763"
	Class      "G8III"
	MassSol    3.19
	RadSol     16.14
	Luminosity 141.604
	Teff       4956.5
	FeH        -0.03
	Age        0.302

	BinaryOrbit
	{
    Epoch           2454466.47098835
	  Separation      680.4 // 5.4"
		PositionAngle   244
	}
}

Star "HIP 9763 B"
{
  ParentBody "HIP 9763"
	Class      ""
	RadSol     0.66
	Luminosity 0.281
	Teff       5163

  /* BinaryOrbit
	{
    Epoch           2454466.47098835
	  Separation      680.4 // 5.4"
		PositionAngle   244
	} */
}

// 杠七(SB***)
Barycenter "HIP 9480 AB"
{
  ParentBody "HIP 9480"
	BinaryOrbit
	{
	  Separation      816.5
	}
}

Star "HIP 9480 A"
{
  ParentBody "HIP 9480 AB"
	Class      "A2 V"
	MassSol    1.93
	Luminosity 17.8
	Teff       8538
	FeH        -0.4
	Age        0.376

	Orbit
	{
	  Period          61.14
		Eccentricity    0.355
		Inclination     16.7
		AscendingNode   48.2
		Epoch           2438523.64901156
		ArgOfPericenter 199.5
		MeanAnomaly     0
	}
}

Star "HIP 9480 B"
{
  ParentBody "HIP 9480 AB"
	Class      "F2 V"
	MassSol    1.17

	Orbit
	{
    Period          61.14
		Eccentricity    0.355
		Inclination     16.7
		AscendingNode   48.2
		Epoch           2438523.64901156
		ArgOfPericenter 19.5
		MeanAnomaly     0
	}
}

Star "HIP 9480 C"
{
  ParentBody "HIP 9480"
	Class      "M3"
	MassSol    0.5

  /*BinaryOrbit
	{
	  Separation      816.5
	}*/
}

// 杠八(EB**)
Star "HIP 8016 A"
{
  ParentBody "HIP 8016"
	Class      "B9V"
	MassSol    2.68
	RadSol     2.63
	Luminosity 66.12
	Teff       10141
	Age        0.067

	Orbit
	{
	  PeriodDays      16.77
    Inclination     90 // Eclipsing Binary
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 8016 B"
{
  ParentBody "HIP 8016"
	Class      "M3 V"

	Orbit
	{
	  PeriodDays      16.77
    Inclination     90 // Eclipsing Binary
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 杠九(SB**)
Remove "38 Cas A"{ParentBody "38 Cas"}
Remove "38 Cas B"{ParentBody "38 Cas"}
Star "HIP 7078 A"
{
	ParentBody "HIP 7078"
	Class      "F6 V"

	Orbit
	{
		Period          0.3674
		Eccentricity    0.31
		Inclination     85.6
		AscendingNode   160.5
		ArgOfPericenter 188.2
		Epoch           2429000.4
		MeanAnomaly     0
	}
}

Star "HIP 7078 B"
{
	ParentBody "HIP 7078"
	Class      "K5.4 V"

	Orbit
	{
		Period          0.3674
		Eccentricity    0.31
		Inclination     85.6
		AscendingNode   160.5
		ArgOfPericenter 8.2
		Epoch           2429000.4
		MeanAnomaly     0
	}
}

// 传舍二(**?)
Star	"HIP 2707 A"
{
	ParentBody     "HIP 2707"
	Class          "B8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          40.4686243
		Eccentricity    0.34334287
		Inclination     -0.911153793
		AscendingNode   0
		ArgOfPericenter -39.6769137
		MeanAnomaly     -173.973599
	}
}

Star	"HIP 2707 B"
{
	ParentBody     "HIP 2707"
	Class          "A5.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          40.4686243
		Eccentricity    0.34334287
		Inclination     -0.911153793
		AscendingNode   0
		ArgOfPericenter 140.323086
		MeanAnomaly     -173.973599
	}
}

// 传舍五(**)
Star "HIP 10438 A"
{
  ParentBody "HIP 10438"
	Class      "F9II"

  Orbit
	{
		RefPlane        "Equator"
		Period          186.974808
		Eccentricity    0.28572309
		Inclination     2.2405439
		AscendingNode   0
		ArgOfPericenter -7.42750447
		MeanAnomaly     155.902367
	}
}

Star "HIP 10438 B"
{
  ParentBody "HIP 10438"
	Class      "A2Vn"

  Orbit
	{
		RefPlane        "Equator"
		Period          186.974808
		Eccentricity    0.28572309
		Inclination     2.2405439
		AscendingNode   0
		ArgOfPericenter 172.572496
		MeanAnomaly     155.902367
	}
}

// 传舍七(s**b)
Remove "CS Cam A"{ParentBody "CS Cam"}
Remove "CS Cam B"{ParentBody "CS Cam"}
Star "HIP 16228 A"
{
	ParentBody "CS Cam"
	Class      "B9Ia"
	MassSol    19
	RadSol     85.7
	Luminosity 75900
	Teff       10800

	BinaryOrbit
	{
		Separation      2340 // 2.4"
	}
}

Star "HIP 16228 B"
{
	ParentBody "CS Cam"
	Class      "O6.9 V"

  /* BinaryOrbit
	{
		Separation      2340 // 2.4"
	} */
}

// 传舍九(**)
Star "HIP 16292 A"
{
	ParentBody "HIP 16292"
	Class      "A1Va"
	MassSol    2.32
	RadSol     1.9
	Luminosity 32.16
	Teff       10049
  Age        0.146

	BinaryOrbit
	{
		Separation      902.8 // 14.8"
	}
}

Star "HIP 16292 B"
{
	ParentBody "HIP 16292"
	Class      "F9.1 V"

  /* BinaryOrbit
	{
		Separation      902.8 // 14.8"
	} */
}

// 内阶一(PM**)
Remove "OMI UMa A"{ParentBody "Muscida"}
Remove "OMI UMa B"{ParentBody "Muscida"}
Star "HIP 41704 A"
{
	ParentBody "HIP 41704"
	Class      "G4II"
	MassSol    3.09
	RadSol     14
  Luminosity 138
	Teff       5242
	FeH        -0.09
  Age        0.36

	BinaryOrbit
	{
		Separation      396.18 // 7.1"
	}
}

Star "HIP 41704 B"
{
	ParentBody "HIP 41704"
	Class      "A9.9 V"

  /* BinaryOrbit
	{
		Separation      396.18 // 7.1"
	} */
}

// 内阶二(SB**)
Remove "16 UMa A"{ParentBody "16 UMa"}
Remove "16 UMa B"{ParentBody "16 UMa"}
Star "HIP 45333 A"
{
	ParentBody "HIP 45333"
	Class      "G0 V"
	MassSol    1.213
	RadSol     2.6
	Teff       5871
	FeH        -0.13
	Age        5.41

	Orbit
	{
		PeriodDays      16.239631
		Eccentricity    0.10635
		Inclination     106
		AscendingNode   107
		Epoch           2454358.214
		ArgOfPericenter 317.18
		MeanAnomaly     0
    //SemiAmplitude   35.344
	}
}

Star "HIP 45333 B"
{
	ParentBody "HIP 45333"
	Class      "K"
	MassSol    0.59
	RadSol     0.5
	Luminosity 0.08

	Orbit
	{
		PeriodDays      16.239631
		Eccentricity    0.10635
		Inclination     106
		AscendingNode   107
		Epoch           2454358.214
		ArgOfPericenter 137.18
		MeanAnomaly     0
    //SemiAmplitude   64.97
	}
}

// 内阶三(SB**)
Star	"HIP 43903 A"
{
	ParentBody     "HIP 43903"
	Class          "G7IIIb"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0665657484
		Eccentricity    0
		Inclination     -2.3039856
		AscendingNode   0
		ArgOfPericenter -9.34986237
		MeanAnomaly     0.61222611
	}
}

Star	"HIP 43903 B"
{
	ParentBody     "HIP 43903"
	Class          "G0.2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0665657484
		Eccentricity    0
		Inclination     -2.3039856
		AscendingNode   0
		ArgOfPericenter 170.650138
		MeanAnomaly     0.61222611
	}
}

// 内阶四(PM**)
Remove "23 UMa A"{ParentBody "23 UMa"}
Remove "23 UMa B"{ParentBody "23 UMa"}
Star "HIP 46733 A"
{
	ParentBody "HIP 46733"
	Class      "F0IV"
	MassSol    1.862
	RadSol     2.9
	Luminosity 14.8
	Teff       6651
	FeH        0.17
	Age        1.3

	BinaryOrbit
	{
		Separation      540.714 // 22.7"
	}
}

Star "HIP 46733 B"
{
	ParentBody "HIP 46733"
	Class      "F9.8 V"

  /* BinaryOrbit
	{
		Separation      540.714 // 22.7"
	} */
}

// 天厨三(PM**)
Star "HIP 97433 A"
{
	ParentBody "HIP 97433"
	Class      "G8III"
	MassSol    2.7
	RadSol     11.15
	Luminosity 69.6
	Teff       4993
	FeH        -0.31
	Age        0.5

	BinaryOrbit
	{
		Separation    130
	}
}

Star "HIP 97433 B"
{
	ParentBody "HIP 97433"
	Class      "F5III"

  /* BinaryOrbit
	{
		Separation    130
	} */
}

// 八谷一(SB**)
Star "HIP 28358 A"
{
	ParentBody "HIP 28358"
	Class      "K0III"
  MassSol    1.63
	RadSol     11
	Luminosity 62
	Teff       4786
	FeH        -0.15

	Orbit
	{
		PeriodDays      1283.4
		Eccentricity    0.231
    Epoch           2452980.5
		ArgOfPericenter 20
		MeanAnomaly     0
    //SemiAmplitude   2.28
	}
}

Star "HIP 28358 B"
{
	ParentBody "HIP 28358"
	Class      "K-earlyM"

	Orbit
	{
    PeriodDays      1283.4
		Eccentricity    0.231
    Epoch           2452980.5
		ArgOfPericenter 200
		MeanAnomaly     0
	}
}

// 八谷五(SB***?) B为光学伴星?
Remove "7 Cam (AB)"{ParentBody "7 Cam"}
Remove "7 Cam A"{ParentBody "7 Cam (AB)"}
Remove "7 Cam Aa"{ParentBody "7 Cam A"}
Remove "7 Cam Ab"{ParentBody "7 Cam A"}
Remove "7 Cam B"{ParentBody "7 Cam (AB)"}
Remove "7 Cam C"{ParentBody "7 Cam"}
Barycenter "HIP 23040 A"
{
	ParentBody "HIP 23040"
	BinaryOrbit
	{
    Epoch           2452640.25999444
		Separation      2907
		PositionAngle   242
	}
}

Star "HIP 23040 Aa"
{
	ParentBody "HIP 23040 A"
	Class      "A1 V"
	MassSol    3.16
	Luminosity 221.6
	Teff       9226

	Orbit
	{
		PeriodDays      3.884494
		Eccentricity    0.045
		Epoch           2418686.714
		ArgOfPericenter 85
		MeanAnomaly     0
    //SemiAmplitude   35.8
	}
}

Star "HIP 23040 Ab"
{
	ParentBody "HIP 23040 A"
	Class      "F5.7 V"

	Orbit
	{
		PeriodDays      3.884494
		Eccentricity    0.045
		Epoch           2418686.714
		ArgOfPericenter 265
		MeanAnomaly     0
	}
}

Star "HIP 23040 C"
{
	ParentBody "HIP 23040"
	Class      "A2.6 V"

  /*BinaryOrbit
	{
    Epoch           2452640.25999444
		Separation      2907
		PositionAngle   242
	}*/
}

// 八谷六(gD*****?)
Remove "V398 Aur A"{ParentBody "V398 Aur"}
Remove "V398 Aur B"{ParentBody "V398 Aur"}
Barycenter "HIP 23783 A"
{
	ParentBody "HIP 23783"
	Orbit
	{
		RefPlane "Static"
	}
}

Star "HIP 23783 Aa"
{
  ParentBody "HIP 23783 A"
	Class      "F2V"
	MassSol    1.97
	RadSol     1.56
	Luminosity 6.042
	Teff       7023
	FeH        -0.12

	Orbit
	{
	  PeriodDays      391.7
		Eccentricity    0.37
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 23783 Ab"
{
  ParentBody "HIP 23783 A"
	Class      "K6.1 V"

	Orbit
	{
	  PeriodDays      391.7
		Eccentricity    0.37
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 23783 B"
{
  ParentBody "HIP 23783"
	Class      "MV"
	MassSol    0.49
	Teff       4947

	Orbit
	{
	  SemiMajorAxis   131.5 // 5"
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 23783 C"
{
	ParentBody "HIP 23783"
	Orbit
	{
    SemiMajorAxis   2367 // 90"
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 23783 Ca"
{
  ParentBody "HIP 23783 C"
	Class      "K5Ve"
	MassSol    0.751
	RadSol     0.756
	Luminosity 0.162
	Teff       4633

	Orbit
	{
	  Period          507.85729695
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 23783 Cb" // D和Cb是同一颗星?
{
  ParentBody "HIP 23783 C"
	Class      "M"//?

	Orbit
	{
	  Period          507.85729695
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 八谷八(EB**)
Remove "31 Cam A"{ParentBody "31 Cam"}
Remove "31 Cam B"{ParentBody "31 Cam"}
Star "HIP 27971 A"
{
	ParentBody "31 Cam"
	Class      "A0IV"
  MassSol    3.03
	Luminosity 179.8
	Teff       9183

	Orbit
	{
		PeriodDays      2.9333
		Eccentricity    0
		AscendingNode   0
		Epoch           2423443.05
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude 78
	}
}

Star "HIP 27971 B"
{
	ParentBody "31 Cam"
	Class      "F0"

	Orbit
	{
		PeriodDays      2.9333
		Eccentricity    0
		AscendingNode   0
		Epoch           2423443.05
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天棓一(PM**)
Star "HIP 87585 A"
{
	ParentBody "HIP 87585"
	Class      "K2III"
	MassSol    1.45
	RadSol     12
	Luminosity 49
	Teff       4445
	FeH        -0.09

	BinaryOrbit
	{
		Separation      10902
	}
}

Star "HIP 87585 B"
{
	ParentBody "HIP 87585"
	Class      "F5.1 V"

  /* BinaryOrbit
	{
		Separation      10902
	} */
}

// 天棓二-天棓增一
Remove "Kuma 1"{ParentBody "Kuma"}
Remove "Kuma 2"{ParentBody "Kuma"}
Star "天棓增一/天棓增六/Kuma A/NU1 Dra A/24 Dra A/BD+55 1944/FK5 655/HD 159541 A/HIP 85819 A/HR 6554/SAO 30447"
{
	ParentBody "Kuma AB"
	Class      "A8Vm" //kA3hF0mF0
	MassSol    1.85
	Teff       7533
	FeH        0.03
	Age        0.013

	Orbit
	{
		PeriodDays      38.034
    Eccentricity    0.03
		ArgOfPericenter 0
		MeanAnomaly     0
    //SemiAmplitude   10
	}
}

Star "天棓二/天棓增五/Kuma B/NU2 Dra B/25 Dra B/BD+55 1945/FK5 657/HD 159560 B/HIP 85829 B/HR 6555/SAO 30450"
{
	ParentBody "Kuma AB"
	Class      "A4IVm" //kA3hF1mF0
	MassSol    1.61
	RadSol     1.812
	Teff       7272

	Orbit
	{
    PeriodDays      38.034
    Eccentricity    0.03
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天棓三(**)
Star "HIP 85670 A"
{
	ParentBody "HIP 85670"
	Class      "G2Ib"
	MassSol    6
	RadSol     40
	Luminosity 996
	Teff       5160
  FeH        0.02
	Age        0.065

	Orbit
	{
		Period          4000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 85670 B"
{
	ParentBody "HIP 85670"
	Class      "G9.4 V" // Dwarf star

	Orbit
	{
		Period          4000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天棓四(**?)
Star "HIP 87833 B"
{
	ParentBody "HIP 87833"
	Class      "M"

	Orbit
	{
		SemiMajorAxis   1000
	}
}

// 天棓五(bC****)
Remove "IOT Her A"{ParentBody "IOT Her"}
Remove "IOT Her B"{ParentBody "IOT Her"}
Barycenter "HIP 86414 AB"
{
  ParentBody "HIP 86414"
  Orbit
	{
		Period          60
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 86414 A"
{
	ParentBody "HIP 86414 AB"
	Class      "B3IV"
  MassSol    6.7
	RadSol     5.29
	Luminosity 2489
	Teff       18070
	FeH        -0.4
	Age        0.0378

	Orbit
	{
		PeriodDays      113.8
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 86414 B"
{
	ParentBody "HIP 86414 AB"
	Class      "B7 V"

  Orbit
	{
		PeriodDays      113.8
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 86414 C"
{
	ParentBody "HIP 86414"
	Class      "A4.5 V"

  Orbit
	{
		Period          60
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 86414 D"
{
	ParentBody "HIP 86414"
	Class      "F2.4 V"

  Orbit
	{
		SemiMajorAxis   18000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 天床五(LP**)
Remove "RR UMi A"{ParentBody "RR UMi"}
Remove "RR UMi B"{ParentBody "RR UMi"}
Star "HIP 73199 A"
{
	ParentBody "HIP 73199"
	Class      "M4.5 III"
	MassSol    1.15
	RadSol     59.8
	Luminosity 756.7
	Teff       3464

	Orbit
	{
		PeriodDays      748.9
		Eccentricity    0.13
		Inclination     79.6
		AscendingNode   48
		Epoch           2444419
		ArgOfPericenter 32
		//SemiAmplitude   8.3
		MeanAnomaly     0
	}
}

Star "HIP 73199 B"
{
	ParentBody "HIP 73199"
  Class      "A6.8 V"

	Orbit
	{
		PeriodDays      748.9
		Eccentricity    0.13
		Inclination     79.6
		AscendingNode   48
		Epoch           2444419
		ArgOfPericenter 212
		//SemiAmplitude   8.3
		MeanAnomaly     0
	}
}

// 文昌二(dS**)
Remove "UPS UMa A"{ParentBody "UPS UMa"}
Remove "UPS UMa B"{ParentBody "UPS UMa"}
Star "HIP 48319 A"
{
	ParentBody "HIP 48319"
	Class      "F2 IV"
	MassSol    1.57
	RadSol     2.79
	Luminosity 29.5
	Teff       7211
	RotationPeriod 28.8
	Age        1.168

	BinaryOrbit
	{
		Separation      419.8
	}
}

Star "HIP 48319 B"
{
	ParentBody "HIP 48319"
	Class      ""
	MassSol    0.44

  /* BinaryOrbit
	{
		Separation      419.8
	} */
}

// 文昌三(**)
Remove "PHI UMa A"{ParentBody "PHI UMa"}
Remove "PHI UMa B"{ParentBody "PHI UMa"}
Star "HIP 48402 A"
{
	ParentBody "HIP 48402"
	Class      "A3 IV"
	MassSol    3.5
	Luminosity 347
	Teff       8769
	FeH        -0.23

	Orbit
	{
		Period          104.6
		Eccentricity    0.436
		Inclination     19.4
		AscendingNode   132.5
    Epoch           2446986.31075731
		ArgOfPericenter 213.3
		MeanAnomaly     0
	}
}

Star "HIP 48402 B"
{
	ParentBody "HIP 48402"
	Class      "A3IV"

	Orbit
	{
    Period          104.6
		Eccentricity    0.436
		Inclination     19.4
		AscendingNode   132.5
    Epoch           2446986.31075731
		ArgOfPericenter 33.3
		MeanAnomaly     0
	}
}

// 文昌四(PM***)
Remove "Al Haud A"{ParentBody "Al Haud"}
Remove "Al Haud Aa"{ParentBody "Al Haud A"}
Remove "Al Haud Ab"{ParentBody "Al Haud A"}
Remove "Al Haud B"{ParentBody "Al Haud"}
Barycenter "HIP 46853 A"
{
	ParentBody "HIP 46853"
	BinaryOrbit
	{
		Separation      55.268
	}
}

Star "HIP 46853 Aa"
{
	ParentBody "HIP 46853 A"
	Class      "F6IV"
	MassSol    1.41
	RadSol     2.365
	Luminosity 7.871
	Teff       6300
	FeH        -0.18
	Vsini      6.8
	Age        2.2

	Orbit
	{
		Period          1.01643836 // ?
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 46853 Ab"
{
	ParentBody "HIP 46853 A"
	Class      "G5.7 V" // ?

	Orbit
	{
		Period          1.01643836 // ?
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 46853 B"
{
	ParentBody "HIP 46853"
	Class      "M6V"
	MassSol    0.15

  /*BinaryOrbit
	{
		Separation      55.268
	}*/
}

// 文昌五(PM**?)
Star "HIP 44901 A"
{
	ParentBody "HIP 44901"
	Class      "kA3VmF5IIISr" //F5Ib?
	MassSol    1.86
	RadSol     1.3
	Luminosity 11.31
	Teff       7519
	FeH        0.55
	Age        0.22

	Orbit
	{
		PeriodDays      4.9
		Eccentricity    0.2
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 44901 B(?)" // 这颗伴星可能不存在
{
	ParentBody "HIP 44901"
	Class      "F5.6 V"

	Orbit
	{
		PeriodDays      4.9
		Eccentricity    0.2
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天牢一(SB**)
Star "HIP 53295 A"
{
	ParentBody "HIP 53295"
	Class      "A1VsSi:"
	RadSol     2.5
	Luminosity 76
	Teff       9647
	Age        0.325

	Orbit
	{
		PeriodDays      15.8307
		Eccentricity    0.31
		Epoch           2435185.246
		ArgOfPericenter 207.3
		MeanAnomaly     0
	}
}

Star "HIP 53295 B"
{
	ParentBody "HIP 53295"
	Class      "A7.2 V"

	Orbit
	{
		PeriodDays      15.8307
		Eccentricity    0.31
		Epoch           2435185.246
		ArgOfPericenter 27.3
		MeanAnomaly     0
	}
}

// 天牢二(**)
Star	"HIP 56034 A"
{
	ParentBody     "HIP 56034"
	Class          "A2 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          7524.07524
		Eccentricity    0.657954991
		Inclination     0.909617066
		AscendingNode   0
		ArgOfPericenter 16.1879419
		MeanAnomaly     -127.474462
	}
}

Star	"HIP 56034 B"
{
	ParentBody     "HIP 56034"
	Class          "K4.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          7524.07524
		Eccentricity    0.657954991
		Inclination     0.909617066
		AscendingNode   0
		ArgOfPericenter 196.187942
		MeanAnomaly     -127.474462
	}
}

// 天牢六(SB**)
Star "HIP 55560 A"
{
	ParentBody "HIP 55560"
	Class      "G7IIIBa0.3"

	Orbit
	{
		PeriodDays      16460
		Eccentricity    0.555
		Epoch           2451521
		ArgOfPericenter 106.8
		//SemiAmplitude 3.84
		MeanAnomaly     0
	}
}

Star "HIP 55560 B"
{
	ParentBody "HIP 55560"
	Class      "WD" // Main star is barium star.

	Orbit
	{
		PeriodDays      16460
		Eccentricity    0.555
		Epoch           2451521
		ArgOfPericenter 286.8
		//SemiAmplitude 3.84
		MeanAnomaly     0
	}
}

// 相(**?)
Star "HIP 60485 A"
{
	ParentBody "HIP 60485"
	Class      "G7III"
	MassSol    2.96
	RadSol     12
	Luminosity 174
	Teff       5098
  FeH        0.01
	Age        0.53

  Orbit
	{
		RefPlane        "Equator"
		Period          2.96171
		Eccentricity    0.600345
		Inclination     173.651
		AscendingNode   -65.4262
		ArgOfPericenter 70.877
		MeanAnomaly     172.365
	}
}

Star "HIP 60485 B"
{
	ParentBody "HIP 60485"
	Class      "WD"

  Orbit
	{
		RefPlane        "Equator"
		Period          2.96171
		Eccentricity    0.600345
		Inclination     173.651
		AscendingNode   -65.4262
		ArgOfPericenter 250.877
		MeanAnomaly     172.365
	}
}

// 辅(**)
Remove "Alcor A"{ParentBody  "Alcor"}
Remove "Alcor B"{ParentBody  "Alcor"}
Star	"HIP 65477 A"
{
	ParentBody  "HIP 65477"
	Class       "A5Vn"
	MassSol      1.84
	RadSol       1.846
	Luminosity   14.03
	Teff         8221

	BinaryOrbit
	{
		Separation           25.06
	}
}

Star	"HIP 65477 B"
{
	ParentBody  "HIP 65477"
	Class       "M3"
	MassSol      0.25
	Age          0.5

  /* BinaryOrbit
	{
		Separation           25.06
	} */
}

// 北斗一(SB****)
Remove "Dubhe A"{ParentBody "Dubhe"}
Remove "Dubhe B"{ParentBody "Dubhe"}
Barycenter "HIP 54061 AB"
{
	ParentBody "HIP 54061"
	BinaryOrbit
	{
		Separation      16060.2 // 7.1'
	}
}

Star "HIP 54061 A"
{
	ParentBody "HIP 54061 AB"
	Class      "K0III"
	MassSol    3.44
  RadSol     17.03
	Luminosity 165.1
	Teff       5012
	FeH        -0.2
  Age        0.28

	Orbit
	{
		Period          44.45
		Eccentricity    0.439
		Inclination     159.9
		AscendingNode   9.3
    Epoch           2452337.10896945
		ArgOfPericenter 52.8
		MeanAnomaly     0
	}
}

Star "HIP 54061 B"
{
	ParentBody "HIP 54061 AB"
	Class      "F0 V"
	MassSol    1.6

	Orbit
	{
    Period          44.45
		Eccentricity    0.439
		Inclination     159.9
		AscendingNode   9.3
    Epoch           2452337.10896945
		ArgOfPericenter 232.8
		MeanAnomaly     0
	}
}

Barycenter "HD 95638"
{
	ParentBody "HIP 54061"
  /* BinaryOrbit
	{
		Separation      16060.2 // 7.1'
	} */
}

Star "HD 95638 A"
{
	ParentBody "HD 95638"
	Class      "F8"

	Orbit
	{
		PeriodDays      6.035
		Eccentricity    0.087
    Epoch           2436615.54
		ArgOfPericenter 330.5
		MeanAnomaly     0
	}
}

Star "HD 95638 B"
{
	ParentBody "HD 95638"
	Class      "G0 V" // ???

  Orbit
	{
		PeriodDays      6.035
		Eccentricity    0.087
    Epoch           2436615.54
		ArgOfPericenter 150.5
		MeanAnomaly     0
	}
}

// 北斗三(Em**)
Star "HIP 58001 A"
{
	ParentBody "HIP 58001"
	Class      "A0Ve"
	MassSol    2.94
	RadSol     3.04
	Luminosity 65.255
	Teff       9355
	Age        0.3

	Orbit
	{
		Period          20.5
		Eccentricity    0.3
		Inclination     51
		AscendingNode   6
    Epoch           2445700.65821760
		ArgOfPericenter 5
		MeanAnomaly     0
	}
}

Star "HIP 58001 B"
{
	ParentBody "HIP 58001"
	Class      "K2V"
	MassSol    0.79
	Luminosity 0.397
	Teff       4780

	Orbit
	{
		Period          20.5
		Eccentricity    0.3
		Inclination     51
		AscendingNode   6
    Epoch           2445700.65821760
		ArgOfPericenter 185
		MeanAnomaly     0
	}
}

// 北斗五(a2**?)
Star "HIP 62956 A"
{
	ParentBody "HIP 62956"
	Class      "A1III-IVp kB9"
	MassSol    2.91
	RadSol     4.14
	Luminosity 102
	Teff       9020
	Age        0.3

	Orbit
	{
		PeriodDays      5.1
		Eccentricity    0.5
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 62956 B(?)" // 这颗伴星可能不存在
{
	ParentBody "HIP 62956"
	Class      "F8.5 V"

	Orbit
	{
		PeriodDays      5.1
		Eccentricity    0.5
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 北斗六(****)
Remove "Mizar A"{ParentBody  "Mizar"}
Remove "Mizar Aa"{ParentBody  "Mizar A"}
Remove "Mizar Ab"{ParentBody  "Mizar A"}
Remove "Mizar B"{ParentBody  "Mizar"}
Remove "Mizar Ba"{ParentBody  "Mizar B"}
Remove "Mizar Bb"{ParentBody  "Mizar B"}
Barycenter	"HIP 65378 A/ZET1 UMa A"
{
	ParentBody  "HIP 65378"
	BinaryOrbit
	{
		Period              2777	// approximate
	}
}

Star	"HIP 65378 Aa"
{
	ParentBody  "HIP 65378 A"
	Class       "A2Vp"
	MassSol      2.2224
	RadSol       2.4
	Luminosity   33.3
	Teff         9000
	Age          0.37

	Orbit
	{
		PeriodDays         20.5386
		//SemiMajorAxis      0.122 // 0.25 * mass ratio 1.051
		Eccentricity       0.5415
		Inclination        60.5
		AscendingNode      106
		Epoch              2454537.4904
		ArgOfPericenter    285.27
		MeanAnomaly        104.896
		//SemiAmplitude      66.478
	}
}

Star	"HIP 65378 Ab"
{
	ParentBody  "HIP 65378 A"
	Class       "A2Vp"
	MassSol      2.2381
	RadSol       2.4
	Luminosity   33.3
	Teff         9000

	Orbit
	{
		PeriodDays         20.5386
		//SemiMajorAxis      0.128 // 0.25 * mass ratio 1.051
		Eccentricity       0.5415
		Inclination        60.5
		AscendingNode      106
		Epoch              2454537.4904
		ArgOfPericenter    285.27
		MeanAnomaly        104.896
		//SemiAmplitude      66.019
	}
}

Barycenter	"HIP 65378 B/ZET2 UMa B"
{
	ParentBody  "HIP 65378"
	/* Orbit
	{
		Period               2777	// approximate
		ArgOfPericenter      180
		MeanAnomaly          0
	} */
}

Star	"HIP 65378 Ba"
{
	ParentBody  "HIP 65378 B"
	Class       "A1h(eA)mA7IV-V"
	Teff        8425

	Orbit
	{
		PeriodDays           175.55
		Eccentricity         0.46
		ArgOfPericenter      0
		MeanAnomaly          0
	}
}


Star	"HIP 65378 Bb"
{
	ParentBody  "HIP 65378 B"
	Class       "A7 V" // ?

	Orbit
	{
		PeriodDays           175.55
		Eccentricity         0.46
		ArgOfPericenter      180
		MeanAnomaly          0
	}
}

// 天枪一(***)
Remove "KAP1 Boo"{ParentBody "KAP Boo"}
Remove "KAP2 Boo"{ParentBody "KAP Boo"}
Barycenter "天枪一/KAP1 Boo Bab/HR 5328/HD 124674 B/HIP 69481 B/SAO 29045"
{
  ParentBody "KAP Boo"
	BinaryOrbit
	{
		Period          6675
		Eccentricity    0.5
		Inclination     99.5
		AscendingNode   53.2
		ArgOfPericenter 25.1
		Epoch           2400068.7
		MeanAnomaly     0
	}
}

Star "KAP1 Boo Ba/KAP Boo Ba/HIP 69481 Ba/HD 124674 Ba"
{
	ParentBody "HIP 69481 B"
	Class      "F2V"
	MassSol    1.4
	RadSol     1.43
	Luminosity 3.801
	Teff       6699
	FeH        -0.09
	Age        0.9

  Orbit
	{
		RefPlane        "Equator"
		Period          38.2605317
		Eccentricity    0.750511467
		Inclination     -0.731406689
		AscendingNode   0
		ArgOfPericenter -61.0956952
		MeanAnomaly     167.030915
	}
}

Star "KAP1 Boo Bb/KAP Boo Bb/HIP 69481 Bb/HD 124674 Bb"
{
	ParentBody "HIP 69481 B"
	Class      ""
	MassSol    0.7

	Orbit
	{
    RefPlane        "Equator"
		Period          38.2605317
		Eccentricity    0.750511467
		Inclination     -0.731406689
		AscendingNode   0
		ArgOfPericenter 118.904305
		MeanAnomaly     167.030915
	}
}

Star "KAP2 Boo A/HR 5329/HD 124675 A/HIP 69483 A/SAO 29046"
{
	ParentBody "KAP Boo"
	Class      "A8 IV"    // itself binary? strange mass for companion (StellarDX: I don't think so/because everything is possible in the universe.)
	MassSol    2.12
	RadSol     2.78
	Luminosity 28
	Teff       7760
	FeH        -0.29

	/* Orbit
	{
		Period          6675
		Eccentricity    0.5
		Inclination     99.5
		AscendingNode   53.2
		ArgOfPericenter 205.1
		Epoch           2400068.7
		MeanAnomaly     0
	} */
}

// 天枪二(dS**)
Remove "Asellus Secondus A"{ParentBody "Asellus Secondus"}
Remove "Asellus Secondus B"{ParentBody "Asellus Secondus"}
Star "HIP 69713 A"
{
	ParentBody "HIP 69713"
	Class      "A7 V"
	MassSol    1.81
	RadSol     1.6
	Luminosity 9.6
	Teff       8000
	FeH        0.19

	BinaryOrbit
	{
		Separation       1100
	}
}

Star "HIP 69713 B/HD 234121"
{
	ParentBody "HIP 69713"
	Class      "K0V"

  /* BinaryOrbit
	{
		Separation       1100
	} */
}

// 天枪三(PM**)
Remove "Asellus Primus A"{ParentBody "Asellus Primus"}
Remove "TET Boo B"{ParentBody "Asellus Primus"}
Star "HIP 70497 A"
{
	ParentBody "HIP 70497"
	Class      "F7V"
	MassSol    1.41 // 1.24
	RadSol     1.733
	Luminosity 4.131
	Teff       6265
	FeH        0.03
  Age        3.1 // 3.83

	BinaryOrbit
	{
		Separation      1000
	}
}

Star "HIP 70497 B"
{
	ParentBody "HIP 70497"
	Class      "M2.5 V"
  MassSol    0.21

  /* BinaryOrbit
	{
		Separation      1000
	} */
}
