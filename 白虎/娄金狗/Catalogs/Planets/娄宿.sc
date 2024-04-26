// 娄宿一(SB**)
Remove "Sheratan A"{ParentBody "Sheratan"}
Remove "Sheratan B"{ParentBody "Sheratan"}
Star "HIP 8903 A"
{
	ParentBody "HIP 8903"
	Class      "A5V" // kA4 hA5 mA5
	MassSol    2.34
	Luminosity 23
	Teff       9000
	FeH        0.16
	Age        0.3

	Orbit
	{
		PeriodDays      106.9954
		Eccentricity    0.903
		Inclination     44.7
		AscendingNode   79.1
		ArgOfPericenter 29.1
		MeanAnomaly     0
	}
}

Star "HIP 8903 B"
{
	ParentBody "HIP 8903"
	Class      "F5III" //F5 III–V or G0 V/if it's in the main sequence
	MassSol    1.34
	Luminosity 1.3

	Orbit
	{
		PeriodDays      106.9954
		Eccentricity    0.903
		Inclination     44.7
		AscendingNode   79.1
		ArgOfPericenter 209.1
		MeanAnomaly     0
	}
}

// 娄宿二(a2**)
Remove "GAM1 Ari"{ParentBody "Mesarthim"}
Remove "GAM2 Ari"{ParentBody "Mesarthim"}
Star "GAM1 Ari A/HIP 8832 A/HD 11502 A/HR 545/SAO 92680/WDS J01535+1918B"
{
	ParentBody "HIP 8832"
	Class      "B9V"
	RadSol     1.9

	Orbit
	{
		Period          5000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "GAM2 Ari B/HIP 8832 B/HD 11503 B/HR 546/SAO 92681/WDS J01535+1918A"
{
	ParentBody "HIP 8832"
	Class      "A1VpSi"
	Teff       10970
	FeH        0.43

	Orbit
	{
		Period          5000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 左更一(**)
Star "HIP 12332 A"
{
	ParentBody "HIP 12332"
	Class      "A7V"
	MassSol    2.43
	RadSol     1.8
	Luminosity 63.5
	Teff       8000
	Age        0.621

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0074272501
		Eccentricity    0
		Inclination     2.19326392
		AscendingNode   0
		ArgOfPericenter -126.777797
		MeanAnomaly     22.1653314
	}
}

Star "HIP 12332 B"
{
	ParentBody "HIP 12332"
	Class      ""
	MassSol    1
	Teff       5551
	FeH        0

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0074272501
		Eccentricity    0
		Inclination     2.19326392
		AscendingNode   0
		ArgOfPericenter 53.222203
		MeanAnomaly     22.1653314
	}
}

// 左更二(****)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=12640
Barycenter "HIP 12640 Aabc"
{
	ParentBody "HIP 12640"
	BinaryOrbit // BU_522 AB Gaia pos.
	{
		Separation      1986.4
		Period          55053
	}
}

Star "HIP 12640 B"
{
	ParentBody "HIP 12640"
	Class      "" // K3?
	MassSol    0.79

	/*BinaryOrbit
	{
		Separation      1986.4
		Period          55053
	}*/
}

Barycenter "HIP 12640 Aab"
{
	ParentBody "HIP 12640 Aabc"
	Orbit
	{
		Period          8.845
		Eccentricity    0.337
		Inclination     71.2
		AscendingNode   101
		Epoch           2444641.09059894
		ArgOfPericenter 272.3
		MeanAnomaly     0
	}
}

Star "HIP 12640 Ac"
{
	ParentBody "HIP 12640 Aabc"
	Class      "A1V"
	MassSol    2.37

	Orbit
	{
		Period          8.845
		Eccentricity    0.337
		Inclination     71.2
		AscendingNode   101
		Epoch           2444641.09059894
		ArgOfPericenter 92.3
		MeanAnomaly     0
	}
}

Star "HIP 12640 Aa"
{
	ParentBody "HIP 12640 Aab"
	Class      "A0Vp"
	MassSol    3.4
	Luminosity 71.7

	BinaryOrbit
	{
		Separation      4.1554
	}
}

Star "HIP 12640 Ab"
{
	ParentBody "HIP 12640 Aab"
	Class      "F2V"
	MassSol    2.1

	/*BinaryOrbit
	{
		Separation      4.1554
	}*/
}

// 左更四(**)
Star	"HD 17769 A"
{
	ParentBody     "HD 17769"
	Class          "B7V"
	MassSol        3.84
	RadSol         3
	Luminosity     301
	Teff           13121
	Age            0.036

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0068363373
		Eccentricity    0
		Inclination     -0.808975697
		AscendingNode   0
		ArgOfPericenter -18.0788963
		MeanAnomaly     -88.4216116
	}
}

Star	"HD 17769 B"
{
	ParentBody     "HD 17769"
	Class          ""
	MassSol        1 // 1.2
	Teff           5524
	FeH            -0.5

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0068363373
		Eccentricity    0
		Inclination     -0.808975697
		AscendingNode   0
		ArgOfPericenter 161.921104
		MeanAnomaly     -88.4216116
	}
}

// 左更五(****)
Barycenter "HIP 13165 A-B"
{
	ParentBody "HIP 13165"
	BinaryOrbit
	{
		Separation      6048
	}
}

Star "HIP 13165 C"
{
	ParentBody "HIP 13165"
	Class      "F8V"

	/*BinaryOrbit
	{
		Separation      6048
	}*/
}

Barycenter "HIP 13165 A"
{
	ParentBody "HIP 13165 A-B"
	BinaryOrbit
	{
		Separation      787.2
	}
}

Star "HIP 13165 B"
{
	ParentBody "HIP 13165 A-B"
	Class      "A0V"

	/*BinaryOrbit
	{
		Separation      787.2
	}*/
}

Star "HIP 13165 Aa"
{
	ParentBody "HIP 13165 A"
	Class      "B6V"
	MassSol    6.88
	Luminosity 538

	Orbit
	{
		PeriodDays      3.854
		Eccentricity    0.04
		ArgOfPericenter 78.3
		MeanAnomaly     0
	}
}

Star "HIP 13165 Ab"
{
	ParentBody "HIP 13165 A"
	Class      ""
	MassSol    1

	Orbit
	{
		PeriodDays      3.854
		Eccentricity    0.04
		ArgOfPericenter 258.3
		MeanAnomaly     0
	}
}

// 右更二(**)
Remove "ETA Psc A"{ParentBody "ETA Psc"}
Remove "ETA Psc B"{ParentBody "ETA Psc"}
Star "HIP 7097 A"
{
	ParentBody "HIP 7097"
	Class      "G7IIIa"
	MassSol    3.78
	RadSol     26.48
	Luminosity 457
	Teff       4937
	FeH        -0.13
	Age        0.22

	Orbit
	{
		Period          850.5
		//SemiMajorAxis   1228
		Eccentricity    0.469
		Inclination     58.5
		AscendingNode   32.8
		Epoch           2466263.79400897
		ArgOfPericenter 266.9
		MeanAnomaly     0
	}
}

Star "HIP 7097 B"
{
	ParentBody "HIP 7097"
	Class      "A5.4 V"

	Orbit
	{
		Period          850.5
		//SemiMajorAxis   1228
		Eccentricity    0.469
		Inclination     58.5
		AscendingNode   32.8
		Epoch           2466263.79400897
		ArgOfPericenter 86.9
		MeanAnomaly     0
	}
}

// 右更四(PM**)
Star "HIP 8198 A"
{
	ParentBody "HIP 8198"
	Class      "K0III"
	MassSol    3.03
	RadSol     14.57
	Luminosity 132
	Teff       5004
	FeH        0.1
	Age        0.39

	Orbit
	{
		RefPlane        "Equator"
		Period          377.313
		Eccentricity    0.38606
		Inclination     -139.304
		AscendingNode   47.2397
		ArgOfPericenter 107.534
		MeanAnomaly     -123.051
	}
}

Star "HIP 8198 B"
{
	ParentBody "HIP 8198"
	Class      "A9.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          377.313
		Eccentricity    0.38606
		Inclination     -139.304
		AscendingNode   47.2397
		ArgOfPericenter 287.534
		MeanAnomaly     -123.051
	}
}

// 天仓一(**)
Star "HIP 1562 A"
{
	ParentBody "HIP 1562"
	Class      "K1II"
	MassSol    2.78
	RadSol     34
	Luminosity 398
	Teff       4446
	FeH        -0.09
	Age        2.23

	BinaryOrbit
	{
		Epoch           2456657.92418103
		Separation      8937.6
		PositionAngle   191
	}
}

Star "HIP 1562 B(?)"
{
	ParentBody "HIP 1562"
	Class      "K"

	/*BinaryOrbit
	{
		Epoch           2456657.92418103
		Separation      8937.6
		PositionAngle   191
	}*/
}

// 天仓四(SB**)
Remove "Baten Kaitos A"{ParentBody "Baten Kaitos"}
Remove "Baten Kaitos B"{ParentBody "Baten Kaitos"}
Star "HIP 8645 A"
{
	ParentBody "HIP 8645"
	Class      "K0 III"
	MassSol    2.34
	RadSol     25
	Luminosity 240
	Teff       4581
	FeH        -0.13
	Age        1.24

	Orbit
	{
		PeriodDays      1652
		Eccentricity    0.59
		AscendingNode   85
		Epoch           2414377
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   3.3
	}
}

Star "HIP 8645 B"
{
	ParentBody "HIP 8645"
	Class      "F0.2 V"

	Orbit
	{
		PeriodDays      1652
		Eccentricity    0.59
		AscendingNode   85
		Epoch           2414377
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天仓五(*8Pl)
Star "TAU Cet A"
{
	ParentBody "TAU Cet"
	Class      "G8V"
	MassSol    0.783
	RadSol     0.793
	LumBol     0.52
	Luminosity 0.45
	Teff       5344
	FeH        -0.55
	RotationPeriod 816
	Age        5.8

	Orbit
	{
		RefPlane        "Static"
	}
}

// 天大将军一(SB****)
Remove "GAM2 And"{ParentBody "Almach"}
Remove "GAM2 And B"{ParentBody "GAM2 And"}
Remove "GAM1 And"{ParentBody "Almach"}
Remove "GAM2 And Ba"{ParentBody "GAM2 And B"}
Remove "GAM2 And Bb"{ParentBody "GAM2 And B"}
Remove "GAM2 And C"{ParentBody "GAM2 And"}
Star "GAM1 And A/57 And 1/STF 205A/ADS 1630A/BD+41 395/CCDM J02039+4220A/FK5 73/GC 2477/HD 12533/HIP 9640 A/HR 603/IDS 01578+4151 A/PPM 44721/SAO 37734/WDS 02039+4220A"
{
	ParentBody "HIP 9640"
	Class      "K2IIb"
	MassSol    23.7
	RadSol     80
	Luminosity 2000
	Teff       4250
	FeH        -0.06
	Age        0.0065

	/*BinaryOrbit
	{
		Period          4748
	}*/
}

Barycenter "GAM2 And BC/57 And BC/HD 12534 BC/HIP 9640 BC/HR 604/SAO 37735/WDS 02039+4220BC"
{
	ParentBody "HIP 9640"
	BinaryOrbit
	{
		Period          4748
	}
}

Barycenter "HIP 9640 B"
{
	ParentBody "HIP 9640 BC"
	Orbit
	{
		Period          63.67
		Eccentricity    0.927
		Inclination     109.8
		AscendingNode   109.6
		Epoch           2457205.78747921 // 2015.5 MJD?
		ArgOfPericenter 3.4
		MeanAnomaly     0
	}
}

Star "HIP 9640 C"
{
	ParentBody "HIP 9640 bc"
	Class      "A0V"

	Orbit
	{
		Period          63.67
		Eccentricity    0.927
		Inclination     109.8
		AscendingNode   109.6
		Epoch           2457205.78747921 // 2015.5 MJD?
		ArgOfPericenter 183.4
		MeanAnomaly     0
	}
}

Star "HIP 9640 Ba"
{
	ParentBody "HIP 9640 B"
	Class      "B9.5V"

	Orbit
	{
		PeriodDays      2.67
		Inclination     109.8 // 共面的轨道
		AscendingNode   109.6
		ArgOfPericenter 175.2
		MeanAnomaly     0
	}
}

Star "HIP 9640 Bb"
{
	ParentBody "HIP 9640 B"
	Class      "B9.5 V"

	Orbit
	{
		PeriodDays      2.67
		Inclination     109.8
		AscendingNode   109.6
		ArgOfPericenter 355.2
		MeanAnomaly     0
	}
}

// 天大将军二(Be**)
Star "HIP 8068 A"
{
	ParentBody "HIP 8068"
	Class      "B2Vep"
	MassSol    10.1
	DimensionsSol (16, 11, 16) // 自转线速度高达440Km/s
	Luminosity 41783
	Teff       32090
	RotationPeriod 21 // 粗略的计算

	Orbit
	{
		PeriodDays      126.6731
		Inclination     77.6
		AscendingNode   295.7
		Epoch           2456110.03
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   9.97
	}
}

Star "HIP 8068 B"
{
	ParentBody "HIP 8068"
	Class      "sdO"
	MassSol    1.14
	RadSol     1.3
	Teff       53000
	Age        0.0215

	Orbit
	{
		PeriodDays      126.6731
		Inclination     77.6
		AscendingNode   295.7
		Epoch           2456110.03
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   81.3
	}
}

// 天大将军五(SB**)
Star "HIP 7719 A"
{
	ParentBody "HIP 7719"
	Class      "G8III"
	RadSol     9
	Luminosity 47
	Teff       5070
	FeH        -0.21

	Orbit
	{
		Period          21.5
		Eccentricity    0.368
		Epoch           2443216.5
		ArgOfPericenter 324.3
		MeanAnomaly     0
		//SemiAmplitude   3.01
	}
}

Star "HIP 7719 B"
{
	ParentBody "HIP 7719"
	Class      "G" // ?

	Orbit
	{
		Period          21.5
		Eccentricity    0.368
		Epoch           2443216.5
		ArgOfPericenter 144.3
		MeanAnomaly     0
	}
}

// 天大将军六(PM**4Pl)
Remove "UPS And A"{ParentBody "UPS And"}
Remove "UPS And B"{ParentBody "UPS And"}
Star "Titawin A"
{
	ParentBody "HIP 7513"
	Class      "F9V"
	MassSol    1.27
	RadSol     1.48
	Luminosity 3.57
	Teff       6213
	FeH        0.09
	RotationPeriod 175.2
	Age        3.12

	Orbit
	{
		RefPlane        "Static"
	}
}

Star "HIP 7513 D"
{
	ParentBody "HIP 7513"
	Class      "M4.5V"
	MassSol    0.2

	Orbit
	{
		SemiMajorAxis   750
	}
}

// 天大将军七
Remove "TAU And A"{ParentBody "TAU And"}
Remove "TAU And B"{ParentBody "TAU And"} // Wikipedia没说它有伴星

// 天大将军八(PM**)
Star	"HIP 9021 A"
{
	ParentBody     "HIP 9021"
	Class	         "K0III"
	MassSol        1.34
	RadSol         11
	Luminosity     56.2
	Teff           4765
	FeH            -0.15
	Age            3.16

	BinaryOrbit
	{
		Epoch           2451909.77559688
		Separation      1868.5
		PositionAngle   77
	}
}

Star	"HIP 9021 B(?)"
{
	ParentBody     "HIP 9021"
	Class	         "A2.6 V"

	/*BinaryOrbit
	{
		Epoch           2451909.77559688
		Separation      1868.5
		PositionAngle   77
	}*/
}

// 天大将军九(SB**)
Remove "BET Tri A"{ParentBody "BET Tri"}
Remove "BET Tri B"{ParentBody "BET Tri"}
Star "HIP 10064 A"
{
	ParentBody "HIP 10064"
	Class      "A5IV"
	MassSol    3.5
	Luminosity 74
	Teff       8186
	Age        0.73

	Orbit
	{
		PeriodDays      31.3884
		Eccentricity    0.53
		Epoch           2432004.255
		ArgOfPericenter 138.4
		MeanAnomaly     0
		//SemiAmplitude   33.3
	}
}

Star "HIP 10064 B"
{
	ParentBody "HIP 10064"
	Class      "A9.3 V"

	Orbit
	{
		PeriodDays      31.3884
		Eccentricity    0.53
		Epoch           2432004.255
		ArgOfPericenter 318.4
		MeanAnomaly     0
		//SemiAmplitude   69.2
	}
}

// 天大将军十一(SB**)
Remove "DEL Tri A"{ParentBody "DEL Tri"}
Remove "DEL Tri B"{ParentBody "DEL Tri"}
Star	"HIP 10644 A"
{
	ParentBody	"HIP 10644"
	Class	    	"G0V"
	MassSol	  	1
	RadSol	  	0.98
	Teff        6215
	FeH         -0.39
	Age  		  	8.5     // Wikipedia estimate

	Orbit
	{
		PeriodDays		10.02
		Eccentricity	0.02
		Inclination		167
		AscendingNode	15
		ArgOfPericenter	0
		MeanAnomaly		0
	}
}

Star	"HIP 10644 B"
{
	ParentBody	"HIP 10644"
	Class		    "K4V"
	MassSol     0.8
	Teff        4493

	Orbit
	{
		PeriodDays		10.02
		Eccentricity	0.02
		Inclination		167
		AscendingNode	15
		ArgOfPericenter	180
		MeanAnomaly		0
	}
}
