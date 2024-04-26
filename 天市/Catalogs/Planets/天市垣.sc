// 天市左垣一(SB*****?)
Remove "Sarin A"{ParentBody "Sarin"}
Remove "DEL Her B"{ParentBody "Sarin"}
// 注：由于此系统的Wikipedia上无轨道及其伴星相关数据，但此系统可确认为4-5星系统，故此处使用系统生成数据。
Star	"HIP 84379 Aa"
{
	ParentBody     "HIP 84379"
	Class	         "A1IVn"
	MassSol         2.4
	RadSol          2.2
	Luminosity      38
	Teff            9620
	Age             0.37

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00604231
		Eccentricity    0
		Inclination     -113.712
		AscendingNode   24.5055
		ArgOfPericenter -49.1531
		MeanAnomaly     -117.118
	}
}

Star	"HIP 84379 Ab"
{
	ParentBody     "HIP 84379"
	Class	         "G5.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00604231
		Eccentricity    0
		Inclination     -113.712
		AscendingNode   24.5055
		ArgOfPericenter 130.847
		MeanAnomaly     -117.118
	}
}

Star	"HIP 84379 B"
{
	ParentBody     "HIP 84379"
	Class	         "K3.2 V"

	Orbit
	{
		SemiMajorAxis 195.84
	}
}

Star	"HIP 84379 C"
{
	ParentBody     "HIP 84379"
	Class	         "G0.3 V"

	Orbit
	{
		SemiMajorAxis   300 // ?
	}
}

Star	"HIP 84379 D"
{
	ParentBody     "HIP 84379"
	Class	         "G6.7 V"

	Orbit
	{
		SemiMajorAxis   650 // ?
	}
}


// 天市左垣三(****)
Remove "MU Her A"{ParentBody "MU Her"}
Remove "MU Her BC"{ParentBody "MU Her"}
Remove "MU Her Aa"{ParentBody "MU Her A"}
Remove "MU Her Ab"{ParentBody "MU Her A"}
Remove "MU Her B"{ParentBody "MU Her BC"}
Remove "MU Her C"{ParentBody "MU Her BC"}
Barycenter "HIP 86974 Aab"
{
	ParentBody "HIP 86974"
	BinaryOrbit
	{
		Separation      290.85
	}
}

Barycenter "HIP 86974 BC"
{
	ParentBody "HIP 86974"
	/* BinaryOrbit
	{
		Separation      290.85
	} */
}

Star "HIP 86974 Aa"
{
	ParentBody "HIP 86974 Aab"
	Class      "G5IV"
  MassSol    1.11
	RadSol     1.73
	Luminosity 2.54
	Teff       5560
	FeH        0.28
	RotationPeriod 1248
	Age        7.8

	Orbit
	{
		Period          98.9
		Eccentricity    0.44
		Inclination     62.82
		AscendingNode   80.4
		Epoch           2422726.92391428
		ArgOfPericenter 34
		MeanAnomaly     0
		//SemiAmplitude   1.12
	}
}

Star "HIP 86974 Ab"
{
	ParentBody "HIP 86974 Aab"
	Class      "M4 V"
	MassSol    0.32

	Orbit
	{
		Period          98.9
		Eccentricity    0.44
		Inclination     62.82
		AscendingNode   80.4
		Epoch           2422726.92391428
		ArgOfPericenter 214
		MeanAnomaly     0
	}
}

Star "HIP 86974 B"
{
	ParentBody "HIP 86974 BC"
	Class      "M3.5 V"
  MassSol    0.44
	RadSol     0.6
	Luminosity 0.087
	Teff       4050
	FeH        0.21

	Orbit
	{
		Period          43.127
		Eccentricity    0.1796
		Inclination     66.06
		AscendingNode   60.07
		Epoch           2454588.82712494
		ArgOfPericenter 352.85
		MeanAnomaly     0
	}
}

Star "HIP 86974 C"
{
	ParentBody "HIP 86974 BC"
	Class      ""
	MassSol    0.39

	Orbit
	{
		Period          43.127
		Eccentricity    0.1796
		Inclination     66.06
		AscendingNode   60.07
		Epoch           2454588.82712494
		ArgOfPericenter 172.85
		MeanAnomaly     0
	}
}

// 天市左垣四(Be**)
Star	"HIP 88794 A"
{
	ParentBody     "HIP 88794"
	Class	         "B9.5V"
	MassSol         3.49
	Luminosity      355
	Teff            9484
	FeH             -0.06

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00822286
		Eccentricity    0
		Inclination     13.9682
		AscendingNode   -95.5213
		ArgOfPericenter -4.06419
		MeanAnomaly     11.5351
	}
}

Star	"HIP 88794 B(?)"
{
	ParentBody     "HIP 88794" // companion star has not been confirmed
	Class	         "A6.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00822286
		Eccentricity    0
		Inclination     13.9682
		AscendingNode   -95.5213
		ArgOfPericenter 175.936
		MeanAnomaly     11.5351
	}
}

// 天市左垣五(SB**)
Star	"HIP 92614 A"
{
	ParentBody     "HIP 92614"
	Class          "B9VpHg"
	RadSol         2.15
	Luminosity     131.92
	Teff           12136

	Orbit
	{
		RefPlane        "Equator"
		Period          68.7603174
		Eccentricity    0.372210443
		Inclination     1.48079205
		AscendingNode   0
		ArgOfPericenter -36.1371701
		MeanAnomaly     163.535446
	}
}

Star	"HIP 92614 B"
{
	ParentBody     "HIP 92614"
	Class          "F2.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          68.7603174
		Eccentricity    0.372210443
		Inclination     1.48079205
		AscendingNode   0
		ArgOfPericenter 143.86283
		MeanAnomaly     163.535446
	}
}

// 天市左垣六(PM***...?)
Remove "ZET Aql A"{ParentBody "ZET Aql"}
Remove "ZET Aql B"{ParentBody "ZET Aql"}
Star	"HIP 93747 A/WDS JJ19054+1352A"
{
	ParentBody     "HIP 93747"
	Class	         "A0Vn"
	MassSol         2.37
	RadSol          2.27
	Luminosity      39.4
	Teff            9620
	FeH             -0.52
	Age             0.1

	Orbit
	{
		RefPlane        "Static"
	}
}

Star	"HIP 93747 B/WDS JJ19054+1352B/UGPS J190524.98+135153.8"
{
	ParentBody     "HIP 93747"
	Class	         ""
	MassSol        0.5
  AppMagn        12
	AppMagnG       10.7886
	AppMagnK       12.265

	Orbit
	{
		SemiMajorAxis 185.1
		Epoch         2454831.71318713
		ArgOfPericenter 46
		MeanAnomaly   0
	}
}

Star	"HIP 93747 E/WDS JJ19054+1352E/UCAC3 208-200112"
{
	ParentBody     "HIP 93747"
	Class	         ""
	MassSol        0.14
	AppMagnR       16.20
	AppMagnJ       12.130
	AppMagnH       11.313
	AppMagnK       11.019

	Orbit
	{
		SemiMajorAxis 38000
		ArgOfPericenter 115
		MeanAnomaly   0
	}
}

// 天市左垣七(***)
// C是光学伴星
Remove "TET1 Ser"{ParentBody "TET Ser"}
Remove "TET2 Ser"{ParentBody "TET Ser"}
Star "徐/天市左垣七/Alya/TET1 Ser A/TET Ser A/HR 7141 A/HD 175638 A/SAO 124068 A/HIP 92946 A/WDS 18562+0412A"
{
	ParentBody "TET Ser"
	Class      "A5V"

	Orbit
	{
		Period          14000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "TET2 Ser B/HIP 92946 B/HD 175638 B/HR 7141 B"
{
	ParentBody "TET Ser"
	Class      "A5Vn"

	Orbit
	{
		Period          14000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天市左垣十(SB***)
Remove "KSI Ser A"{ParentBody "KSI Ser"}
Remove "KSI Ser Aa"{ParentBody "KSI Ser A"}
Remove "KSI Ser Ab"{ParentBody "KSI Ser A"}
Remove "KSI Ser B"{ParentBody "KSI Ser"}
Barycenter "HIP 86263 A"
{
	ParentBody "HIP 86263"
	BinaryOrbit
	{
		Period          14763
		Epoch           2455927.43978347
		ArgOfPericenter 258
		MeanAnomaly     0
	}
}

Star "HIP 86263 Aa"
{
	ParentBody "HIP 86263 A"
	Class      "A9IIIpSr"
	MassSol    2.06
	Luminosity 30.6
	Teff       7217
	FeH        0.07
	Age        1.03

	Orbit
	{
		PeriodDays      2.2923
		Eccentricity    0
		Epoch           2419210.191
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   19.4
	}
}

Star "HIP 86263 Ab"
{
	ParentBody "HIP 86263 A"
	Class      ""
	MassSol    0.18

	Orbit
	{
		PeriodDays      2.2923
		Eccentricity    0
		Epoch           2419210.191
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 86263 B"
{
	ParentBody "HIP 86263"
	Class      ""
	MassSol    0.27

	/* Orbit
	{
		Period          14763
		Epoch           2455927.43978347
		ArgOfPericenter 78
		MeanAnomaly     0
	} */
}

// 天市左垣十一(**)
Remove "Sabik A"{ParentBody "Sabik"}
Remove "Sabik B"{ParentBody "Sabik"}
Star "HIP 84012 A"
{
	ParentBody "HIP 84012"
	Class      "A1 IV"
	MassSol    2.966
	FeH        -0.01

	Orbit
	{
		Period          87.58
		Eccentricity    0.95
		Inclination     95.2
		AscendingNode   38.9
		Epoch           2460558.71086401
		ArgOfPericenter 94.8
		MeanAnomaly     0
	}
}

Star "HIP 84012 B"
{
	ParentBody "HIP 84012"
	Class      "A1 IV"
	MassSol    3.478

	Orbit
	{
		Period          87.58
		Eccentricity    0.95
		Inclination     95.2
		AscendingNode   38.9
		Epoch           2460558.71086401
		ArgOfPericenter 274.8
		MeanAnomaly     0
	}
}

// 天市右垣一(SB**)
Remove "Kornephoros A"{ParentBody "Kornephoros"}
Remove "BET Her B"{ParentBody "Kornephoros"}
Star "HIP 80816 A"
{
	ParentBody "HIP 80816"
	Class      "G7IIIa"
	MassSol    2.9
	RadSol     17
	Luminosity 151
	Teff       4887
	FeH        -0.27

	Orbit
	{
		PeriodDays      410.6
		Eccentricity    0.54
		Inclination     53.8
		AscendingNode   341.9
		Epoch           2415500.9
		ArgOfPericenter 24.6
		MeanAnomaly     0
	}
}

Star "HIP 80816 B"
{
	ParentBody "HIP 80816"
	Class      "G"
	MassSol    0.9

	Orbit
	{
		PeriodDays      410.6
		Eccentricity    0.54
		Inclination     53.8
		AscendingNode   341.9
		Epoch           2415500.9
		ArgOfPericenter 204.6
		MeanAnomaly     0
	}
}

// 天市右垣二(**)
Remove "GAM Her A"{ParentBody "GAM Her"}
Remove "GAM Her B"{ParentBody "GAM Her"}
Star	"HIP 80170 A"
{
	ParentBody     "HIP 80170"
	Class	         "A9III"
  RadSol         6
	Luminosity     92
	Teff           7031
	FeH            0.07

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      183.6
		Eccentricity    0.774512
		Inclination     -99.0526
		AscendingNode   -6.39653
		ArgOfPericenter -87.4871
		MeanAnomaly     -179.196
	}
}

Star	"HIP 80170 B"
{
	ParentBody     "HIP 80170"
	Class	         "A1.3 V"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      183.6
		Eccentricity    0.774512
		Inclination     -99.0526
		AscendingNode   -6.39653
		ArgOfPericenter 92.5129
		MeanAnomaly     -179.196
	}
}

// 天市右垣五(PM**?)
Remove "BET Ser (AB)" {ParentBody "BET Ser"}
Remove "BET Ser C" {ParentBody "BET Ser"}
Remove "BET Ser A" {ParentBody "BET Ser (AB)"}
Remove "BET Ser B" {ParentBody "BET Ser (AB)"}
Star "HIP 77233 A"
{
	ParentBody "HIP 77233"
	Class      "A2 IV"
  MassSol    1.94
	Teff       8928
	Age        0.267

	BinaryOrbit
	{
		Separation      1456.56
	}
}

Star "HIP 77233 B"
{
	ParentBody "HIP 77233"
	Class      "K3 V"
	MassSol    0.8

	/* BinaryOrbit
	{
		Separation      1456.56
	} */
}

// 天市右垣六(**)
Remove "DEL Ser (AB)" {ParentBody "DEL Ser"}
Remove "DEL Ser (CD)" {ParentBody "DEL Ser"}
Remove "DEL Ser A" {ParentBody "DEL Ser (AB)"}
Remove "DEL Ser B" {ParentBody "DEL Ser (AB)"}
Remove "DEL Ser C" {ParentBody "DEL Ser (CD)"}
Remove "DEL Ser D" {ParentBody "DEL Ser (CD)"}
Star "HIP 76276 A"
{
	ParentBody "HIP 76276"
	Class      "A9IV"
	MassSol    1.58
	RadSol     3
	Luminosity 24.5
	Teff       7649
	Age        0.433

	Orbit
	{
		Period          3200
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 76276 B"
{
	ParentBody "HIP 76276"
	Class      "F0IV"

	Orbit
	{
		Period          3200
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 市楼三(***)
Barycenter "HIP 88404 A"
{
	ParentBody "HIP 88404"
	BinaryOrbit
	{
		Period          257
		Eccentricity    0.77
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 88404 Aa"
{
	ParentBody     "HIP 88404 A"
	Class	         "F2V"
	MassSol        1.54
	Teff           6813

	Orbit
	{
		PeriodDays      186
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 88404 Ab"
{
	ParentBody     "HIP 88404 A"
	Class	         ""
	MassSol        0.29

	Orbit
	{
		PeriodDays      186
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 88404 B"
{
	ParentBody     "HIP 88404"
	Class	         "F5V"
	MassSol        1.29

	/* Orbit
	{
		Period          257
		Eccentricity    0.77
		ArgOfPericenter 180
		MeanAnomaly     0
	} */
}

// 车肆一(SB***)
Remove "UPS Oph A"{ParentBody "UPS Oph"}
Remove "UPS Oph B"{ParentBody "UPS Oph"}
Barycenter "HIP 80628 AB"
{
	ParentBody "HIP 80628"
	BinaryOrbit
	{
		Period          82.8
		Eccentricity    0.45
		Inclination     31.2
		AscendingNode   86.8
		Epoch           2449389.60442529
		ArgOfPericenter 357.9
		MeanAnomaly     0
	}
}

Star	"HIP 80628 A"
{
	ParentBody     "HIP 80628 AB"
	Class	         "kA2hA5VmA5"
	MassSol        1.94
	RadSol         1.9
	Luminosity     16.56
	Teff           8364
	FeH            0.14

	Orbit
	{
		PeriodDays      27.218
		Eccentricity    0.744
		Epoch           2438914.84
		ArgOfPericenter 153.7
		MeanAnomaly     0
		//SemiAmplitude   34.9
	}
}

Star	"HIP 80628 B"
{
	ParentBody     "HIP 80628 AB"
	Class	         "Am"

	Orbit
	{
		PeriodDays      27.218
		Eccentricity    0.744
		Epoch           2438914.84
		ArgOfPericenter 333.7
		MeanAnomaly     0
		//SemiAmplitude   41.1
	}
}

Star	"HIP 80628 C"
{
	ParentBody     "HIP 80628"
	Class	         "Am"

	/* Orbit
	{
		Period          82.8
		Eccentricity    0.45
		Inclination     31.2
		AscendingNode   86.8
		Epoch           2449389.60442529
		ArgOfPericenter 177.9
		MeanAnomaly     0
	} */
}

// 车肆二(PM**)
Star	"HIP 82369 A"
{
	ParentBody     "HIP 82369"
	Class	         "F6IV"
	MassSol        1.7
	RadSol         3
	Luminosity     12.06
	Teff           6417
	FeH            0.13

	Orbit
	{
		Period          35.5
		Eccentricity    0.8
		Inclination     74
		AscendingNode   118
		Epoch           2444677.98006102
		ArgOfPericenter 214
		MeanAnomaly     0
	}
}

Star	"HIP 82369 B"
{
	ParentBody     "HIP 82369"
	Class	         "" // WD? dM?
	MassSol        0.8

	Orbit
	{
		Period          35.5
		Eccentricity    0.8
		Inclination     74
		AscendingNode   118
		Epoch           2444677.98006102
		ArgOfPericenter 34
		MeanAnomaly     0
	}
}

// 宗人一(Be**)
Star	"HIP 88149 A"
{
	ParentBody     "HIP 88149"
	Class	         "B2Ve"
	MassSol        9.6
	Luminosity     1524.63
	Teff           22000
	FeH            0
	Age            0.014

	Orbit
	{
		PeriodDays      23421.1
		Eccentricity    0.142
		Inclination     75.9
		AscendingNode   338.87
		Epoch           2452658.5
		ArgOfPericenter 295.24
		MeanAnomaly     0
	}
}

Star	"HIP 88149 B"
{
	ParentBody     "HIP 88149"
	Class	         "B8"
	MassSol        3.8

	Orbit
	{
		PeriodDays      23421.1
		Eccentricity    0.142
		Inclination     75.9
		AscendingNode   338.87
		Epoch           2452658.5
		ArgOfPericenter 115.24
		MeanAnomaly     0
	}
}

// 宗人三(**)
Star	"HIP 88290 A"
{
	ParentBody     "HIP 88290"
	Class	         "A2Vn"
	MassSol        3.07
	RadSol         4.5
	Luminosity     160
	Teff           9594
	FeH            -0.14
	Oblateness     0

	Orbit
	{
		Period          175.74
		Eccentricity    0.831
		Inclination     69.5
		AscendingNode   160.2
		Epoch           2458801.89588788
		ArgOfPericenter 258.9
		MeanAnomaly     0
	}
}

Star	"HIP 88290 B"
{
	ParentBody     "HIP 88290"
	Class	         "F6.1 V"

	Orbit
	{
		Period          175.74
		Eccentricity    0.831
		Inclination     69.5
		AscendingNode   160.2
		Epoch           2458801.89588788
		ArgOfPericenter 78.9
		MeanAnomaly     0
	}
}

// 宗人四(**)
Remove "70 Oph A"{ParentBody "70 Oph"}
Remove "70 Oph B"{ParentBody "70 Oph"}
Star	"HIP 88601 A/LHS 458"
{
	ParentBody     "HIP 88601"
	Class	         "K0V"
	MassSol         0.9
	RadSol          0.91
	LumBol          0.59
	Teff            5300
	FeH             0.04
	RotationPeriod  472.8
	Age             1.9

	Orbit
	{
		Period          88.38
		Eccentricity    0.4992
		Inclination     121.16
		AscendingNode   302.12
		Epoch           2413537.43019295
		ArgOfPericenter 194
		MeanAnomaly     0
	}
}

Star	"HIP 88601 B/LHS 459"
{
	ParentBody     "HIP 88601"
	Class	         "K4V"
	MassSol         0.7
	LumBol          0.13
	Teff            4350

	Orbit
	{
		Period          88.38
		Eccentricity    0.4992
		Inclination     121.16
		AscendingNode   302.12
		Epoch           2413537.43019295
		ArgOfPericenter 14
		MeanAnomaly     75.3581
	}
}

// 宗二(**)
Star	"HIP 92161 A"
{
	ParentBody     "HIP 92161"
	Class	         "A5III"
	MassSol        2.4
	RadSol         1.6
	Luminosity     12.84
	Teff           8873
	FeH            0.33
	Age            0.559

	Orbit
	{
		RefPlane        "Equator"
		Period          0.195035
		Eccentricity    0.708646
		Inclination     115.86
		AscendingNode   165.48
		ArgOfPericenter -95.9625
		MeanAnomaly     115.912
	}
}

Star	"HIP 92161 B"
{
	ParentBody     "HIP 92161"
	Class	         "F6.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.195035
		Eccentricity    0.708646
		Inclination     115.86
		AscendingNode   165.48
		ArgOfPericenter 84.0375
		MeanAnomaly     115.912
	}
}

// 帛度一(**)
Remove "95 Her A"{ParentBody "95 Her"}
Remove "95 Her B"{ParentBody "95 Her"}
Star "HIP 88267 A/HD 164669 A/HR 6730"
{
	ParentBody "HIP 88267"
	Class      "A5III"
	MassSol    2.8
	RadSol     6.8
	LumBol     167
	Teff       8000
	RotationPeriod 36

	Orbit
	{
		Period          11000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 88267 B/HD 164668 B/HR 6729"
{
	ParentBody "HIP 88267"
	Class      "G8III"
	MassSol    3.2
	RadSol     19.4
	LumBol     194
	Teff       4900
	FeH        -0.22184874961635636749123320202039
	RotationPeriod 4080

	Orbit
	{
		Period          11000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 候(**)
Remove "Rasalhague A"{ParentBody "Rasalhague"}
Remove "Rasalhague B"{ParentBody "Rasalhague"}
Star	"HIP 86032 A"
{
	ParentBody     "HIP 86032"
	Class	         "A5III"
	MassSol        2.4
	DimensionsSol  (5.716, 4.776, 5.716)
	Luminosity     25.1
	Temperature    (7569, 9384, 7569)
	Teff           8336
	Age            0.77

	Orbit
	{
		PeriodDays      3148.4
		Eccentricity    0.92
		Inclination     125
		AscendingNode   232
		Epoch           2452888
		ArgOfPericenter 342
		MeanAnomaly     0
	}
}

Star	"HIP 86032 B"
{
	ParentBody     "HIP 86032"
	Class	         "K5V"
	MassSol        0.85

	Orbit
	{
		PeriodDays      3148.4
		Eccentricity    0.92
		Inclination     125
		AscendingNode   232
		Epoch           2452888
		ArgOfPericenter 162
		MeanAnomaly     0
	}
}

// 帝座(***)
Remove "Ras Algethi A"{ParentBody "Ras Algethi"}
Remove "Ras Algethi B"{ParentBody "Ras Algethi"}
Remove "ALF Her Ba"{ParentBody "ALF Her B"}
Remove "ALF Her Bb"{ParentBody "ALF Her B"}
Star "HIP 84345 A/HD 156014 A/HR 6406/SAO 102680"
{
	ParentBody "HIP 84345"
	Class      "M5II"
	MassSol    2.175
	RadSol     284
	Luminosity 7244
	Teff       3155

	/* Orbit
	{
		Period          3600
		ArgOfPericenter 0
		MeanAnomaly     0
	} */
}

Barycenter "HIP 84345 B/HD 156015 B/HR 6407/SAO 102681"
{
	ParentBody "HIP 84345"
	BinaryOrbit
	{
		Period          3600
	}
}

Star "HIP 84345 Ba"
{
	ParentBody "HIP 84345 B"
	Class      "G8III"
	MassSol    2.5
	Luminosity 126
	Teff       4900

	Orbit
	{
		PeriodDays      51.578
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 84345 Bb"
{
	ParentBody "HIP 84345 B"
	Class      "A9IV"
	MassSol    2
	Luminosity 26
	Teff       7350
	Age        0.41

	Orbit
	{
		PeriodDays      51.578
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 列肆二(***)
Remove "Marfik (AB)"{ParentBody "Marfik"}
Remove "Marfik A"{ParentBody "Marfik (AB)"}
Remove "Marfik B"{ParentBody "Marfik (AB)"}
Remove "Marfik C"{ParentBody "Marfik"}
Barycenter "HIP 80883 AB"
{
	ParentBody "HIP 80883"
	BinaryOrbit
	{
		Separation      6307
	}
}

Star "HIP 80883 A"
{
	ParentBody "HIP 80883 AB"
	Class      "A0V"
  MassSol    2.62
	Luminosity 76
	Teff       8831

	Orbit
	{
		Period          192
		Eccentricity    0.611
		Inclination     23
		AscendingNode   53.3
		ArgOfPericenter 337.5
		Epoch           2429520.42881161
		MeanAnomaly     0
	}
}

Star "HIP 80883 B"
{
	ParentBody "HIP 80883 AB"
	Class      "A4V"
	MassSol    1.9

	Orbit
	{
		Period          192
		Eccentricity    0.611
		Inclination     23
		AscendingNode   53.3
		ArgOfPericenter 157.5
		Epoch           2429520.42881161
		MeanAnomaly     0
	}
}

Star "HIP 80883 C"
{
	ParentBody "HIP 80883"
	Class      "K6"
	MassSol    0.72
	RadSol     0.58
	Teff       4157
	Luminosity 0.07

	/*BinaryOrbit
	{
		Separation      6307
	}*/
}

// 斗一(a2**)
Star "HIP 80463 A"
{
	ParentBody "HIP 80463"
	Class      "A2VpCrSr"
  MassSol    2.14
	RadSol     3.3
	Luminosity 70
	Teff       10052
	FeH        0.47
	RotationPeriod 70.824
	Age        0.149

	Orbit
	{
		Epoch           2455196.95538591
		Separation      61.6
		PositionAngle   294
	}
}

Star "HIP 80463 B"
{
	ParentBody "HIP 80463"
	Class      "A7.7 V"

	Orbit
	{
		Epoch           2455196.95538591
		Separation      61.6
		PositionAngle   294
	}
}

// 斗二(**+?)
Star "HIP 79492 A"
{
	ParentBody "HIP 79492"
	Class      "G9V"

	BinaryOrbit
	{
		Separation      100.85
	}
}

Star "HIP 79492 B"
{
	ParentBody "HIP 79492"
	Class      "G9V"

	/* BinaryOrbit
	{
		Separation      100.85
	} */
}

// 贯索二(Be**)
Remove "TET CrB A"{ParentBody "TET CrB"}
Remove "TET CrB B"{ParentBody "TET CrB"}
Star "HIP 76127 A"
{
	ParentBody "HIP 76127"
	Class      "B6Vnne"
	MassSol    6
	RadSol     4
	Luminosity 538
	Teff       14910

	Orbit
	{
		Period          300
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 76127 B"
{
	ParentBody "HIP 76127"
	Class      "A2V"
	MassSol    2.5

	Orbit
	{
		Period          300
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 贯索三(a2**)
Remove "Nusakan A"{ParentBody "Nusakan"}
Remove "Nusakan B"{ParentBody "Nusakan"}
Star "HIP 75695 A"
{
	ParentBody "HIP 75695"
	Class      "A9SrEuCr"
	MassSol    2.09
	RadSol     2.63
	Luminosity 25.3
	Teff       7980

	Orbit
	{
		Period          10.27
		Eccentricity    0.524
		Inclination     111.1
		AscendingNode   148.2
		Epoch           2444424.50197506
		ArgOfPericenter 1.3
		MeanAnomaly     0
	}
}

Star "HIP 75695 B"
{
	ParentBody "HIP 75695"
	Class      "F2"
  MassSol    1.4
	RadSol     1.56
	Luminosity 4.5
	Teff       6750
	Age        0.53

	Orbit
	{
		Period          10.27
		Eccentricity    0.524
		Inclination     111.1
		AscendingNode   148.2
		Epoch           2444424.50197506
		ArgOfPericenter 181.3
		MeanAnomaly     0
	}
}

// 贯索四(EB**) (本来不想修复的，但看它信息不全，这里还是修一下吧。)
Remove "Alphecca A"{ParentBody "Alphecca"}
Remove "Alphecca B"{ParentBody "Alphecca"}
Star "HIP 76267 A"
{
	ParentBody "HIP 76267"
	Class      "A0V"
	MassSol    2.58
	RadSol     2.89 //3.04
	Luminosity 74
	Teff       9700
	Age        0.314

	Orbit
	{
		PeriodDays      17.3599
		Eccentricity    0.37
		Inclination     88.2
		ArgOfPericenter 311
		MeanAnomaly     0
	}
}

Star "HIP 76267 B"
{
	ParentBody "HIP 76267"
	Class      "G5V"
	MassSol    0.92
	RadSol     0.9
	Luminosity 0.81
	Teff       5800

	Orbit
	{
		PeriodDays      17.3599
		Eccentricity    0.37
		Inclination     88.2
		ArgOfPericenter 131
		MeanAnomaly     0
	}
}

// 贯索五(dS**)
Remove "GAM CrB A"{ParentBody "GAM CrB"}
Remove "GAM CrB B"{ParentBody "GAM CrB"}
Star "HIP 76952 A"
{
	ParentBody "HIP 76952"
	Class      "B9V"
	MassSol    2.51
	Luminosity 59
	Teff       7649
	Age        0.4

	Orbit
	{
		Period          91.2
		Eccentricity    0.48
		Inclination     94.45
		AscendingNode   111.75
		Epoch           2426561.96700148
		ArgOfPericenter 103.8
		MeanAnomaly     0
	}
}

Star "HIP 76952 B"
{
	ParentBody "HIP 76952"
	Class      "A3V"

	Orbit
	{
		Period          91.2
		Eccentricity    0.48
		Inclination     94.45
		AscendingNode   111.75
		Epoch           2426561.96700148
		ArgOfPericenter 283.8
		MeanAnomaly     0
	}
}

// 贯索七(PM**)
Remove "EPS CrB A"{ParentBody "EPS CrB"}
Remove "EPS CrB B"{ParentBody "EPS CrB"}
Star "HIP 78159 A"
{
	ParentBody "HIP 78159"
	Class      "K2 III"
	MassSol    1.44
	RadSol     21
	LumBol     151
	Teff       4365
	FeH        -0.22
	Age        4.13

	Orbit
	{
		Period          900
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 78159 B"
{
	ParentBody "HIP 78159"
	Class      "K3V" // K9V

	Orbit
	{
		Period          900
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 贯索八(SB**)
Remove "IOT CrB A"{ParentBody "IOT CrB"}
Remove "IOT CrB B"{ParentBody "IOT CrB"}
Star "HIP 78493 A"
{
	ParentBody "HIP 78493"
	Class      "A0IIIp(HgMnEu)s"
	Luminosity 90
	Teff       10727
	FeH        -0.01

	Orbit
	{
		PeriodDays      35.474
		Eccentricity    0.56
		Epoch           2441566.96
		ArgOfPericenter 336
		MeanAnomaly     0
		//SemiAmplitude   2.3
	}
}

Star "HIP 78493 B"
{
	ParentBody "HIP 78493"
	Class      "A"

	Orbit
	{
		PeriodDays      35.474
		Eccentricity    0.56
		Epoch           2441566.96
		ArgOfPericenter 156
		MeanAnomaly     0
	}
}

// 七公三(a2**)
Remove "PHI Her A"{ParentBody "PHI Her"}
Remove "PHI Her B"{ParentBody "PHI Her"}
Star "HIP 79101 A"
{
	ParentBody "HIP 79101"
	Class      "B9VspHgMn"
	MassSol    3.05
	Luminosity 72
	Teff       11525
	FeH        -0.03
	Age        0.21

	Orbit
	{
		PeriodDays      564.834
		Eccentricity    0.52624
		Inclination     9.1
		AscendingNode   190.4
		Epoch           2450121.43
		ArgOfPericenter 170.3
		MeanAnomaly     0
		//SemiAmplitude   2.772
	}
}

Star "HIP 79101 B"
{
	ParentBody "HIP 79101"
	Class      "A8V"
	MassSol    1.614
	Teff       8000

	Orbit
	{
		PeriodDays      564.834
		Eccentricity    0.52624
		Inclination     9.1
		AscendingNode   190.4
		Epoch           2450121.43
		ArgOfPericenter 350.3
		MeanAnomaly     0
		//SemiAmplitude   8.1
	}
}

// 七公四(PM**)
Star "HIP 77760 A"
{
	ParentBody "HIP 77760"
	Class      "G0VFe-0.8CH-0.5"
	MassSol    1.054
	RadSol     1.71
	Luminosity 3.24
	Teff       5837
	FeH        -0.45
	Age        7.4

	Orbit
	{
		PeriodDays      51.2865
		Eccentricity    0
		Inclination     131.68
		AscendingNode   51.69
		Epoch           2448349.5039
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 77760 B"
{
	ParentBody "HIP 77760"
	Class      "K0.6 V"

	Orbit
	{
		PeriodDays      51.2865
		Eccentricity    0
		Inclination     131.68
		AscendingNode   51.69
		Epoch           2448349.5039
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 七公五(**?)
Star "HIP 75973 A"
{
	ParentBody "HIP 75973"
	Class      "K4.5IIIbBa0.5"
	RadSol     38
	Luminosity 1626
	Teff       3917
	FeH        0

	Orbit
	{
		RefPlane        "Equator"
		Period          0.317043
		Eccentricity    0
		Inclination     -66.7824
		AscendingNode   53.3792
		ArgOfPericenter 337.767
		MeanAnomaly     85.6296
	}
}

Star "HIP 75973 B(?)"
{
	ParentBody "HIP 75973"
	Class      "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.317043
		Eccentricity    0
		Inclination     -66.7824
		AscendingNode   53.3792
		ArgOfPericenter 157.767
		MeanAnomaly     85.6296
	}
}

// 七公六(****)
Remove "MU 1 Boo"{ParentBody "Alkalurops"}
Remove "MU1 Boo A"{ParentBody "MU 1 Boo"}
Remove "MU1 Boo B"{ParentBody "MU 1 Boo"}
Remove "MU2 Boo"{ParentBody "Alkalurops"}
Remove "MU2 Boo A"{ParentBody "MU2 Boo"}
Remove "MU2 Boo B"{ParentBody "MU2 Boo"}
Barycenter "七公六/MU1 Boo A/BD+37 2636/GC 20724/GJ 3903/HD 137391/HIP 75411 A/HR 5733/SAO 64686"
{
	ParentBody "Alkalurops"
	BinaryOrbit
	{
		Separation      4006.8
	}
}

Star "HIP 75411 A1"
{
	ParentBody "HIP 75411 A"
	Class      "F0V"
	MassSol    1.93
	RadSol     1.9
	Luminosity 20
	Teff       7190

	Orbit
	{
		Period          3.67862145
		Eccentricity    0.27194
		Inclination     130.016
		AscendingNode   130.04
		ArgOfPericenter 44.204
		Epoch           2453855.92
		MeanAnomaly     0
	}
}

Star "HIP 75411 A2"
{
	ParentBody "HIP 75411 A"
	Class      ""
	MassSol    1.7

	Orbit
	{
		Period          3.67862145
		Eccentricity    0.27194
		Inclination     130.016
		AscendingNode   130.04
		ArgOfPericenter 224.204
		Epoch           2453855.92
		MeanAnomaly     0
	}
}

Barycenter "MU2 Boo B/BD+37 2637/GC 20725/GJ 3904/HD 137392/HIP 75415 B/HR 5734/SAO 64687"
{
	ParentBody "Alkalurops"
	/* BinaryOrbit
	{
		Separation      4006.8
	} */
}

Star "HIP 75415 B1"
{
	ParentBody "HIP 75415 B"
	Class      "G1V"
	MassSol    1.07

	Orbit
	{
		Period          260.1
		Eccentricity    0.59
		Inclination     135.4
		AscendingNode   174.9
		Epoch           2402236.83656266
		ArgOfPericenter 338.7
		MeanAnomaly     0
	}
}

Star "HIP 75415 B2"
{
	ParentBody "HIP 75415 B"
	Class      "G5V"
	MassSol    0.96

	Orbit
	{
		Period          260.1
		Eccentricity    0.59
		Inclination     135.4
		AscendingNode   174.9
		Epoch           2402236.83656266
		ArgOfPericenter 158.7
		MeanAnomaly     0
	}
}

// 七公七(PM**)
Remove "DEL Boo A"{ParentBody "DEL Boo"}
Remove "DEL Boo B"{ParentBody "DEL Boo"}
Star "七公七/DEL Boo/49 Boo/BD+33 2561/FK5 563/HD 135722/HIP 74666/HR 5681/SAO 64589"
{
	ParentBody "STF 4027"
	Class      "G8III"
	RadSol     10.5
	Luminosity 53.7
	Teff       4847
	FeH        -0.44

	Orbit
	{
		Period          120000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "BD+33 2562/HIP 74674/SAO 64591"
{
	ParentBody "STF 4027"
	Class      "G0V"
	MassSol    0.98
	RadSol     0.91
	Luminosity 0.87
	Teff       5812
	Age        3.09

	Orbit
	{
		Period          120000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天纪一(**)
Star "HIP 80181 A"
{
	ParentBody "HIP 80181"
	Class      "K0 III"
	MassSol    2.36
	RadSol     8
	Luminosity 36
	Teff       4853
	FeH        -0.08
	Age        0.676

	Orbit
	{
		Period          7.53112690
		Epoch           2454831.71318713
		ArgOfPericenter 319.4
		MeanAnomaly     0
	}
}

Star	"HIP 80181 B"
{
	ParentBody     "HIP 80181"
	Class	         "G3.7 V"

	Orbit
	{
		Period          7.53112690
		Epoch           2454831.71318713
		ArgOfPericenter 139.4
		MeanAnomaly     0
	}
}

// 天纪二(SB**)
// 补全数据
Remove "ZET Her A"{ParentBody "ZET Her"}
Remove "ZET Her B"{ParentBody "ZET Her"}
Star "HIP 81693 A"
{
	ParentBody "HIP 81693"
	Class      "F9 IV"
	MassSol    1.45
	RadSol     2.56
	Luminosity 6.55
	Teff       5820
	FeH        0.04
	Age        6.2

	Orbit
	{
		Period          34.45
		Eccentricity    0.46
		Inclination     131
		AscendingNode   50
		Epoch           2439747.21037747
		ArgOfPericenter 291
		MeanAnomaly     0
	}
}

Star "HIP 81693 B"
{
	ParentBody "HIP 81693"
	Class      "G7 V"
	MassSol    0.98
	RadSol     0.915
	Luminosity 0.62
	Teff       5300

	Orbit
	{
		Period          34.45
		Eccentricity    0.46
		Inclination     131
		AscendingNode   50
		Epoch           2439747.21037747
		ArgOfPericenter 111
		MeanAnomaly     0
	}
}

// 天纪三(2*-3*?)
// 本系统目前仍有争议: (来源:Wikipedia)
// Petrie (1939) classified two components as class A0 and A2 with a visual magnitude difference of 1.5.
// Batten et al. (1989) catalogued it as a double-lined spectroscopic binary system with an orbital period of four days and an eccentricity of 0.02.
// However/Hipparcos was not able to detect the duplicity.
// Tokovinin (1997) and Faraggiana et al. (2001) catalogued it as a triple star system.
// Cowley et al. (1969) gave it a combined stellar classification of A0 V/whereas Gray & Garrison (1987) classified it as an A0 IV+.
// Wolff & Preston (1978) listed a magnesium overabundance.
Remove "EPS Her A"{ParentBody "EPS Her"}
Remove "EPS Her B"{ParentBody "EPS Her"}
Star "HIP 83207 A"
{
	ParentBody "HIP 83207"
	Class      "A0"
	MassSol    2.6
	RadSol     2.72
	Luminosity 64
	Teff       10197
	FeH        -0.25
	Age        0.4

	Orbit
	{
		PeriodDays      4.0235
		Eccentricity    0.02
		Epoch           2417947.2420
		ArgOfPericenter 318
		//SemiAmplitude   70.7
		MeanAnomaly     0
	}
}

Star "HIP 83207 B"
{
	ParentBody "HIP 83207"
	Class      "A2"

	Orbit
	{
		PeriodDays      4.0235
		Eccentricity    0.02
		Epoch           2417947.2420
		ArgOfPericenter 138
		//SemiAmplitude   112
		MeanAnomaly     0
	}
}

// 天纪六(EB***)
Remove "68 Her A"{ParentBody "68 Her"}
Remove "68 Her B"{ParentBody "68 Her"}
Remove "68 Her Aa"{ParentBody "68 Her A"}
Remove "68 Her Ab"{ParentBody "68 Her A"}
Barycenter "HIP 84573 AB"
{
	ParentBody "HIP 84573"
	BinaryOrbit
	{
		Separation      3060
	}
}

Star "HIP 84573 A"
{
	ParentBody "HIP 84573 AB"
	Class      "B2V"
	MassSol    7.88
	RadSol     4.93
	Luminosity 4786
	Teff       21600

	Orbit
	{
		PeriodDays      2.05102685
		Eccentricity    0
		Inclination     78.9
		Epoch           2450345.4
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   101
	}
}

Star "HIP 84573 B"
{
	ParentBody "HIP 84573 AB"
	Class      "B8V"
	MassSol    2.79
	RadSol     4.26
	Luminosity 426.5
	Teff       12600

	Orbit
	{
		PeriodDays      2.05102685
		Eccentricity    0
		Inclination     78.9
		Epoch           2450345.4
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   101
	}
}

Star "HIP 84573 C"
{
	ParentBody "HIP 84573"
	Class      "B8 V"

	/*BinaryOrbit
	{
		Separation      3060
	}*/
}

// 女床二(PM**)
Star	"HIP 84606 A"
{
	ParentBody     "HIP 84606"
	Class	         "A2V"
	MassSol         2.12
	RadSol          2.2
	Luminosity      36.64
	Teff            9141
	FeH             0.29
	Age             0.155

	Orbit
	{
		Separation      45.192
	}
}

Star	"HIP 84606 B"
{
	ParentBody     "HIP 84606"
	Class	         "F4.1 V" // X-Ray object

	Orbit
	{
		Separation      45.192
	}
}

// 女床三(***)
Remove "RHO Her (AB)"{ParentBody "RHO Her"}
Remove "RHO Her C"{ParentBody "RHO Her"}
Remove "RHO Her A"{ParentBody "RHO Her (AB)"}
Remove "RHO Her B"{ParentBody "RHO Her (AB)"}
Barycenter "RHO1 Her/HIP 85112 A/HD 157779/HR 6485/SAO 66001"
{
	ParentBody "HIP 85112"
	BinaryOrbit
	{
		Separation      480
	}
}

Star "RHO1 Her A/HIP 85112 A1"
{
	ParentBody "HIP 85112 A"
	Class      "A0IIIpHgMn"
	MassSol    4
	Teff       9118
	FeH        0

	BinaryOrbit
	{
		Separation      30.2396
	}
}

Star "RHO1 Her B/HIP 85112 A2"
{
	ParentBody "HIP 85112 A"
	Class      ""
	MassSol    2.93

	/* BinaryOrbit
	{
		Separation      30.2396
	} */
}

Star "RHO2 Her/HIP 85112 B/HD 157778/HR 6484/SAO 66000"
{
	ParentBody "HIP 85112"
	Class      "B9.5IVn"
	MassSol    3.27
	Teff       8755

	/*BinaryOrbit
	{
		Separation      480
	}*/
}
