// 海山二(LBV**)
// SpaceEngineer; wiki
Remove "ETA Car A" {ParentBody "ETA Car"}
Remove "ETA Car B" {ParentBody "ETA Car"}
Star	"ETA Car A"
{
	DateUpdated "2019-08-24"
	ParentBody "V* ETA Car"
	Class      "Variable" // LBV
	AbsMagn    -8.6 //(2012)
	MassSol    100 // >90 // 100 - 120
	RadSol     240 // 60 - 881 // 1400??? // 250
	LumBol     4600429.4353008345 // MBol = -11.917
	Teff       35200 // 9400 - 35200 // 20000 - 25000
	Age        0.003
	Oblateness 0

	// powerful star wind imitation
	Corona
	{
		Radius      2E+10
		Brightness  12
		RayDensity  17.244
		RayCurv     45
	}

	Orbit
	{
		PeriodDays      2022.7
		//Separation      2.2 // 15.4 AU mutual
		Eccentricity    0.9
		Inclination     130 // 130 - 145
		AscendingNode   0	// unknown
		Epoch           2454842.67045309
		ArgOfPericenter 0	// unknown
		MeanAnomaly     0	// unknown
	}
}

Star	"ETA Car B"
{
	DateUpdated "2019-08-24"
	ParentBody "V* ETA Car"
	Class      "O" // WR?
	MassSol    30	// 30 - 80 // 30 - 60
	RadSol     23.6	// 14.3 - 23.6
	Teff       37200
	LumBol     1000000
	Age        0.003
	Oblateness 0

	// powerful star wind imitation
	Corona
	{
		Period      0.020234
		Brightness  0.91603
		RayDensity  12.133
		RayCurv     3.0263
	}

	Orbit
	{
		PeriodDays      2022.7
		//Separation      13.2 // 15.4 AU mutual
		Eccentricity    0.9
		Inclination     130 // 130 - 145
		AscendingNode   0	// unknown
		Epoch           2454842.67045309
		ArgOfPericenter 180	// unknown
		MeanAnomaly     0	// unknown
	}
}

// 海山五(没有伴星)
Remove "LAM Cen A" {ParentBody "LAM Cen"}
Remove "LAM Cen B" {ParentBody "LAM Cen"}

// 十字架二(SB******)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=60718
Remove "Acrux A" {ParentBody "Acrux"}
Remove "ALF2 Cru" {ParentBody "Acrux"}
Remove "Acrux Aa" {ParentBody "Acrux A"}
Remove "ALF1 Cru Ab" {ParentBody "Acrux A"}
// 丹霞：除了十字架二本体3星系统之外，还有HR 4729双星和一颗更暗的红矮星也属于这个系统。
/* 所以加起来就是3+2+1=6星系统 */
Barycenter "ALF Cru AB"
{
	ParentBody "HIP 60718"
	BinaryOrbit // DUN_252 AC   C=HR 47
	{
		Period          138727
		Separation      8908.02
	}
}

// CD discovered by Tokovinin et al. in JK-bands (A&A 346, 1999). Crowded sky.
Barycenter "HR 4729/HD 108250/CPD-62 2742/GC 16951/25 G. Cru/WDS J12266-6306C/CCDM J12266-6306C"
{
	ParentBody "HIP 60718"
	/* BinaryOrbit
	{
		Period          138727
		Separation      8908.02
	} */
}

//-----------------------------------------------

Barycenter "ALF1 Cru A/HR 4730/HD 108248/FK5 462/GC 16952/26 G. Cru"
{
	ParentBody "ALF Cru AB"
	Orbit // VB6 Data
	{
		Period          1500
		Epoch           2490260.20646889
		//Separation      430 // Pericenter
		//Eccentricity    1.215 // non-Periodic???
		AscendingNode   102.7
		ArgOfPericenter 358.8
		Inclination     100.5
		MeanAnomaly     0
	}
}

Star "ALF2 Cru B/HR 4731/HD 108249/GC 16953/2MASS J12263615-6305571/27 G. Cru"
{
	ParentBody "ALF Cru AB"
	Class      "B1V"
	MassSol    15.52
	RadSol     5.4
	Luminosity 16000
	Teff       28000
	Age        0.0108

	Orbit
	{
		Period          1500
		Epoch           2490260.20646889
		//Separation      430 // Pericenter
		//Eccentricity    1.215 // non-Periodic???
		AscendingNode   102.7
		ArgOfPericenter 178.8
		Inclination     100.5
		MeanAnomaly     0
	}
}

//-----------------------------------------------

Star "HIP 60718 Aa"
{
	ParentBody "ALF1 Cru A"
	Class      "B0.5IV"
	MassSol    17.8
	RadSol     7.8
	Luminosity 25000
	Teff       24000

	Orbit // SB9_725 1980MNRAS.191..217T
	{
		PeriodDays      75.7794
		Eccentricity    0.46
		Epoch           2417642.3
		ArgOfPericenter 201
		MeanAnomaly     0
		//SemiAmplitude   41.7
	}
}

Star "HIP 60718 Ab"
{
	ParentBody "ALF1 Cru A"
	Class      ""
	MassSol    6.05

	Orbit
	{
		PeriodDays      75.7794
		Eccentricity    0.46
		Epoch           2417642.3
		ArgOfPericenter 21
		MeanAnomaly     0
	}
}

//-----------------------------------------------

Barycenter "HR 4729 AB"
{
	ParentBody "HR 4729"
	BinaryOrbit // TOK_7 CD EDR3 pos. d
	{
		Period          2086
		Separation      280.764
	}
}

Star "HR 4729 D/ALF Cru CP"
{
	ParentBody "HR 4729"
	Class      "M0V"
	MassSol    0.64

	/* BinaryOrbit
	{
		Period          2086
		Separation      280.764
	} */
}

//-----------------------------------------------

Star "HR 4729 A"
{
	ParentBody "HR 4729 AB"
	Class      "B5V"
	MassSol    9.65
	RadSol     5.5
	Age        0.012

	Orbit // RMAA 4 297 1979 Hernandez
	{
		PeriodDays      1.225155
		Eccentricity    0.024
		Epoch           2438903.314
		ArgOfPericenter 134
		MeanAnomaly     0
		//SemiAmplitude   43.1
	}
}

Star "HR 4729 B"
{
	ParentBody "HR 4729 AB"
	Class      ""
	MassSol    0.97

	Orbit
	{
		PeriodDays      1.225155
		Eccentricity    0.024
		Epoch           2438903.314
		ArgOfPericenter 314
		MeanAnomaly     0
	}
}

// 十字架三(bC***)
Barycenter	"HIP 62434 AB"
{
	ParentBody     "HIP 62434"
	BinaryOrbit
	{
		RefPlane        "Equator"
		Period          60.8121
		Eccentricity    0.588915
		Inclination     95.7922
		AscendingNode   151.811
		ArgOfPericenter 94.5184
		MeanAnomaly     45.4881
	}
}

Star	"HIP 62434 A"
{
	ParentBody     "HIP 62434 AB"
	Class	         "B0.5III"
	MassSol        16
	RadSol         8.4
	Luminosity     34000
	Teff           27000
	FeH            -0.08
	RotationPeriod 86.4
	Age            0.008 // 0.011

	Orbit
	{
		PeriodDays      1828
		//SemiMajorAxis   8.7
		Eccentricity    0.38
		Epoch           2449879
		ArgOfPericenter 113
		MeanAnomaly     0
	}
}

Star	"HIP 62434 B"
{
	ParentBody     "HIP 62434 AB"
	Class	         "B2V"
	MassSol        10

	Orbit
	{
		PeriodDays      1828
		//SemiMajorAxis   8.7
		Eccentricity    0.38
		Epoch           2449879
		ArgOfPericenter 293
		MeanAnomaly     0
	}
}

Star	"HIP 62434 C(?)"
{
	ParentBody     "HIP 62434"
	Class	         "" // Protostar
	MassSol        2 // ?

	/* Orbit
	{
		RefPlane        "Equator"
		Period          60.8121
		Eccentricity    0.588915
		Inclination     95.7922
		AscendingNode   151.811
		ArgOfPericenter -85.4816
		MeanAnomaly     45.4881
	} */
}

// 马尾二(**)
Star	"HIP 59449 A"
{
	ParentBody     "HIP 59449"
	Class	         "B3V"
	MassSol        6.6
	RadSol         3.8
	Luminosity     810.42
	Teff           19500
	Age            0.0237

	BinaryOrbit
	{
		Epoch           2456292.68198225
		Separation      5.68
		PositionAngle   19.72
	}
}

Star	"HIP 59449 B"
{
	ParentBody     "HIP 59449"
	Class	         "B9.5 V"

	/* BinaryOrbit
	{
		Epoch           2456292.68198225
		Separation      5.68
		PositionAngle   19.72
	} */
}

// 马尾三(Be*****)
Remove "DEL Cen A" {ParentBody "DEL Cen"}
Remove "DEL Cen B" {ParentBody "DEL Cen"}
// 本体双星+HD 105382+HD 105383=4星系统
// 其中HD 105382可能本身还有一颗伴星，这样就是5星系统
Star "HIP 59196 A"
{
	ParentBody "DEL Cen"
	Class      "B2IVne"
	MassSol    8.7
	RadSol     6.5
	Luminosity 5129
	Teff       22360
	Age        0.0215

	Orbit
	{
		Period          4.6
		//SemiMajorAxis   6.9
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 59196 B"
{
	ParentBody "DEL Cen"
	Class      ""
	MassSol    4 // 7

	Orbit
	{
		Period          4.6
		//SemiMajorAxis   6.9
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter	"HD 105382/V863 Cen/CD-49 6813/HD 105382/HIP 59173/HR 4618/SAO 239687"
{
	ParentBody     "DEL Cen"
	Orbit
	{
		SemiMajorAxis   34169.3
		ArgOfPericenter -36
		MeanAnomaly     0
	}
}

Star "HD 105382 A"
{
	ParentBody "HIP 59173"
	Class      "B6III"
	MassSol    5.7
	RadSol     3
	Luminosity 1000
	Teff       17400
	RotationPeriod 31.08

	Orbit
	{
		RefPlane        "Equator"
		Period          24.3991
		Eccentricity    0.350926
		Inclination     -117.665
		AscendingNode   18.9895
		ArgOfPericenter -166.501
		MeanAnomaly     67.774
	}
}

Star	"HD 105382 B(?)"
{
	ParentBody     "HIP 59173"
	Class	         "B9.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          24.3991
		Eccentricity    0.350926
		Inclination     -117.665
		AscendingNode   18.9895
		ArgOfPericenter 13.4986
		MeanAnomaly     67.774
	}
}

Star "HD 105383"
{
	ParentBody "DEL Cen"
	Class      "B9V"
	MassSol    3.84

	Orbit
	{
		SemiMajorAxis   27515.8
		ArgOfPericenter -140
		MeanAnomaly     0
	}
}

// 马腹一(***)(三星系统修复)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=68702
Remove "Agena Aa" {ParentBody "Agena"}
Remove "Agena Ab" {ParentBody "Agena"}
Barycenter	"HIP 68702 A"
{
	ParentBody     "HIP 68702"
	Luminosity     66100
	Age            0.0141
	BinaryOrbit // Tok 2019
	{
		Period          288.267
		Epoch           2462976.61421994
		Eccentricity    0.596
		AscendingNode   251.9
		ArgOfPericenter 171.8
		Inclination     125.4
		MeanAnomaly     0
	}
}

Star "HIP 68702 Aa"
{
	ParentBody "HIP 68702 A"
	Class      "B1III"
	MassSol    12.02
	RadSol     9
	Luminosity 31600
	Teff       25000

	Orbit
	{
		PeriodDays      356.915
		Eccentricity    0.8245
		Inclination     67.68
		AscendingNode   108.8
		Epoch           2452000.15202
		ArgOfPericenter 240.87
		MeanAnomaly     0
		//SemiAmplitude   62.9
	}
}

Star "HIP 68702 Ab"
{
	ParentBody "HIP 68702 A"
	Class      "B1III"
	MassSol    10.58
	RadSol     9
	Luminosity 25100
	Teff       23000

	Orbit
	{
		PeriodDays      356.915
		Eccentricity    0.8245
		Inclination     67.68
		AscendingNode   108.8
		Epoch           2452000.15202
		ArgOfPericenter 60.87
		MeanAnomaly     0
		//SemiAmplitude  72.35
	}
}

Star "HIP 68702 B"
{
	ParentBody "HIP 68702"
	Class      "B1V"
	MassSol    4.61
	Luminosity 9400 // 66100-31600-25100=9400
	Oblateness 0

	/* Orbit
	{
		Period          288.267
		Epoch           2462976.61421994
		Eccentricity    0.596
		AscendingNode   251.9
		ArgOfPericenter 171.8
		Inclination     305.4
		MeanAnomaly     0
	} */
}

// 蜜蜂一(**)
Remove "BET Mus A"{ParentBody "BET Mus"}
Remove "BET Mus B"{ParentBody "BET Mus"}
Star "HD 110879 1"
{
  ParentBody "HD 110879"
  Class      "B2V"
  MassSol    7.35
	Luminosity 1892
	Age        0.0151

  Orbit
  {
    Period          194.28
    Eccentricity    0.598
    Inclination     37.1
    AscendingNode   349.4
		Epoch           2399497.52007181
    ArgOfPericenter 29
    MeanAnomaly     0
  }
}

Star "HD 110879 2"
{
  ParentBody "HD 110879"
  Class      "B3V"
  MassSol    6.4

  Orbit
  {
		Period          194.28
    Eccentricity    0.598
    Inclination     37.1
    AscendingNode   349.4
		Epoch           2399497.52007181
    ArgOfPericenter 209
    MeanAnomaly     0
  }
}

// 三角形三(**)(补全数据)
Remove "Atria A" {ParentBody "Atria"}
Remove "Atria B" {ParentBody "Atria"}
Star "HIP 82273 1"
{
  ParentBody "HIP 82273"
  Class      "K2IIb"
  MassSol    7
	Luminosity 5500
	Teff       4150
	FeH        -0.06
	Age        0.048

  BinaryOrbit
  {
    Period          130
		Separation      50
  }
}

Star "HIP 82273 2"
{
  ParentBody "HIP 82273"
  Class      "G0V"

	/* BinaryOrbit
  {
    Period          130
		Separation      50
  } */
}

// 异雀二(**)
Remove "IOT Aps A" {ParentBody "IOT Aps"}
Remove "IOT Aps B" {ParentBody "IOT Aps"}
Star "HD 156190 A"
{
  ParentBody "HD 156190"
  Class      "B9V"
  MassSol    3.89
	AbsMagn    -1.88
	Oblateness 0

  Orbit
  {
    Period          59.32
    Eccentricity    0.172
    Inclination     69.4
    AscendingNode   119.6
    ArgOfPericenter 270.5
    Epoch           2454667.35
    MeanAnomaly     0
  }
}

Star "HD 156190 B"
{
  ParentBody "HD 156190"
  Class      "B9.5V"
  MassSol    3.45

  Orbit
  {
    Period          59.32
    SemiMajorAxis   24.304
    Eccentricity    0.172
  	Inclination     69.4
    AscendingNode   119.6
    ArgOfPericenter 90.5
    Epoch           2454667.35
    MeanAnomaly     0
  }
}

// 孔雀二(PM**)
Star	"HIP 88866 A"
{
	ParentBody     "HIP 88866"
	Class	         "kA4hF0mF2III"
	MassSol        2.15
	RadSol         2.84
	Luminosity     24.69
	Teff           7632
	FeH            0.27
	Age            0.63

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0172966
		Eccentricity    0
		Inclination     -5.67343
		AscendingNode   -31.0753
		ArgOfPericenter 40.1035
		MeanAnomaly     137.724
	}
}

Star	"HIP 88866 B"
{
	ParentBody     "HIP 88866"
	Class	         "F3.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0172966
		Eccentricity    0
		Inclination     -5.67343
		AscendingNode   -31.0753
		ArgOfPericenter 220.103
		MeanAnomaly     137.724
	}
}

// 孔雀三(SB***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=90797
Barycenter	"HIP 90797 A"
{
	ParentBody     "HIP 90797"
	BinaryOrbit
	{
		Period          3197
		Separation      416.475
	}
}

Star "HIP 90797 Aa"
{
	ParentBody "HIP 90797 A"
	Class      "B7III"
	MassSol    4.39
	Oblateness 0
	Luminosity 659
	Teff       12764

	Orbit
	{
		PeriodDays      1.711529
		Eccentricity    0
		Epoch           2450276.5502
		ArgOfPericenter 307
		MeanAnomaly     0
		//SemiAmplitude   43.8
	}
}

Star "HIP 90797 Ab"
{
	ParentBody "HIP 90797 A"
	Class      ""
	MassSol    0.8

	Orbit
	{
		PeriodDays      1.711529
		Eccentricity    0
		Epoch           2450276.5502
		ArgOfPericenter 127
		MeanAnomaly     0
	}
}

Star "HIP 90797 B"
{
	ParentBody "HIP 90797"
	Class      "" // ProtoStar
	MassSol    0.15
	Teff       3192

	/* BinaryOrbit
	{
		Period          3197
		Separation      416.475
	} */
}

// 孔雀四(*)
// 双星？单星？还是脉动变星？
Star	"HIP 92609 A"
{
	ParentBody     "HIP 92609"
	Class	         "B2Ve" // B2II-IIIe
	MassSol        12.5
	DimensionsSol  (19.8, 18, 19.8)
	Luminosity     8450
	Teff           20300

	Orbit
	{
		RefPlane "Static"
	}

	/*Orbit
	{
		RefPlane        "Equator"
		Period          1307.35
		Eccentricity    0.488563
		Inclination     160.222
		AscendingNode   84.1564
		ArgOfPericenter -142.691
		MeanAnomaly     -158.389
	}*/
}

/*Star	"HIP 92609 B"
{
	ParentBody     "HIP 92609"
	Class	         "B4.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1307.35
		Eccentricity    0.488563
		Inclination     160.222
		AscendingNode   84.1564
		ArgOfPericenter 37.3093
		MeanAnomaly     -158.389
	}
}*/

// 孔雀十一(SB**)
Remove "ALF Pav A" {ParentBody "ALF Pav"}
Remove "ALF Pav B" {ParentBody "ALF Pav"}
Star "HIP 100751 1"
{
  ParentBody "HIP 100751"
  Class      "B2 IV"
  MassSol    5.91
	RadSol     4.83
	Luminosity 2200
	Teff       17711
	Age        0.048

  Orbit
  {
    PeriodDays      11.753
    ArgOfPericenter 0
    MeanAnomaly     0
  }
}

Star "HIP 100751 B"
{
  ParentBody "HIP 100751"
  Class      ""
  MassSol    0.26 // ??

  Orbit
  {
    PeriodDays      11.753
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}

// 波斯二
Star "HIP 101772 B(?)"
{
  ParentBody "HIP 101772"
  Class      "M"

  Orbit
  {
    SemiMajorAxis   2000
    ArgOfPericenter 0 // ?
    MeanAnomaly     0
  }
}

Star "HIP 101772 C(?)"
{
  ParentBody "HIP 101772"
  Class      "M"

  Orbit
  {
    SemiMajorAxis   2000
    ArgOfPericenter 60 // ?
    MeanAnomaly     0
  }
}

// 蛇首二(SB**)
Remove "BET Ret A" {ParentBody "BET Ret"}
Remove "BET Ret B" {ParentBody "BET Ret"}
Star "HIP 17440 1"
{
  ParentBody "HIP 17440"
  Class      "K0IVSB"
  MassSol    1.2
	RadSol     9.3
	Teff       4580
	Age        5 // 6

  Orbit
  {
    PeriodDays      1918.31
    Eccentricity    0.33461
    Inclination     82.85
    AscendingNode   16
		Epoch           2452806.14
    ArgOfPericenter 222.023
    MeanAnomaly     0
		//SemiAmplitude   5.1235
  }
}

Star "HIP 17440 2"
{
  ParentBody "HIP 17440"
  Class      "M0" // between M0V and M4V
  MassSol    0.4

  Orbit
  {
		PeriodDays      1918.31
    Eccentricity    0.33461
    Inclination     82.85
    AscendingNode   16
		Epoch           2452806.14
    ArgOfPericenter 42.023
    MeanAnomaly     0
  }
}

// 蛇尾三(SB**)
Remove "NU Oct A" {ParentBody "NU Oct"}
Remove "NU Oct B" {ParentBody "NU Oct"}
Star "HIP 107089 1"
{
  ParentBody "HIP 107089"
  Class      "K1III"
  MassSol    1.04 // 1.61
	RadSol     5.9 // 5.81
	Luminosity 17.53
	Teff       4860
	FeH        0.18
	Age        2.5 // 3

  Orbit
  {
    PeriodDays      1050.69
    //SemiMajorAxis   2.62959
    Eccentricity    0.2368
    Inclination     70.8
    AscendingNode   87
    ArgOfPericenter 254.97
    MeanAnomaly     0
		//SemiAmplitude   7.032
  }
}

Star "HIP 107089 2"
{
	ParentBody "HIP 107089"
  Class      ""
  MassSol    0.585

  Orbit
  {
		PeriodDays      1050.69
    //SemiMajorAxis   2.62959
    Eccentricity    0.2368
    Inclination     70.8
    AscendingNode   87
    ArgOfPericenter 74.97
    MeanAnomaly     0
  }
}

// 蛇尾四(EB**)
Remove "ALF Oct A" {ParentBody "ALF Oct"}
Remove "ALF Oct B" {ParentBody "ALF Oct"}
Star "HIP 104043 1"
{
  ParentBody "HIP 104043"
  Class      "F4III"
  MassSol    1.42
	RadSol     3.69
	Teff       6270
	FeH        0.07
	Age        1.5

  Orbit
  {
    PeriodDays      9.073
    Eccentricity    0.39
		Epoch           2435302.404
    ArgOfPericenter 96
    MeanAnomaly     0
		//SemiAmplitude   47
  }
}

Star "HIP 104043 2"
{
	ParentBody "HIP 104043"
  Class      "F5 III"
  MassSol    1.42 // 半振幅相同，推测是两颗质量相等都恒星

  Orbit
  {
		PeriodDays      9.073
    Eccentricity    0.39
		Epoch           2435302.404
    ArgOfPericenter 276
    MeanAnomaly     0
		//SemiAmplitude   47
  }
}

// 鸟喙一(SB**)
Remove "ALF Tuc A" {ParentBody "ALF Tuc"}
Remove "ALF Tuc B" {ParentBody "ALF Tuc"}
Star "HIP 110130 1"
{
  ParentBody "HIP 110130"
  Class      "K3III"
  MassSol    2.5
	RadSol     37
	Luminosity 424
	Teff       4300

  Orbit
  {
    PeriodDays      4197.7
    Eccentricity    0.39
    Epoch           2418666.4
    ArgOfPericenter 228.5
    MeanAnomaly     0
		//SemiAmplitude   7.2
  }
}

Star "HIP 110130 2"
{
  ParentBody "HIP 110130"
  Class      "K"	//unknown

  Orbit
  {
		PeriodDays      4197.7
    Eccentricity    0.39
    Epoch           2418666.4
    ArgOfPericenter 48.5
    MeanAnomaly     0
  }
}

// 鸟喙二(**)
Remove "DEL Tuc A" {ParentBody "DEL Tuc"}
Remove "DEL Tuc B" {ParentBody "DEL Tuc"}
Star "HIP 110838 1"
{
  ParentBody "HIP 110838"
  Class      "B9Vn"
  MassSol    2.99
	RadSol     2.7
	Teff       11271
	RotationPeriod 68.484
	Age        0.232

  BinaryOrbit
  {
		Epoch           2456292.68198225
		Separation      539
		PositionAngle   282
  }
}

Star "HIP 110838 2"
{
  ParentBody "HIP 110838"
  Class      "G0V Fe-2"

	/* BinaryOrbit
  {
		Epoch           2456292.68198225
		Separation      539
		PositionAngle   282
  } */
}

// 鸟喙三(**)
Star	"HD 224361 A"
{
	ParentBody     "HD 224361"
	Class          "A1IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          34.8650844
		Eccentricity    0.859202683
		Inclination     -1.38448381
		AscendingNode   0
		ArgOfPericenter 175.80427
		MeanAnomaly     -51.7189163
	}
}

Star	"HD 224361 B"
{
	ParentBody     "HD 224361"
	Class          "F5.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          34.8650844
		Eccentricity    0.859202683
		Inclination     -1.38448381
		AscendingNode   0
		ArgOfPericenter 355.80427
		MeanAnomaly     -51.7189163
	}
}

// 鸟喙四(******)(合并)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HR&number=126
Remove "BET1 Tuc" {ParentBody "BET Tuc"}
Remove "BET2 Tuc" {ParentBody "BET Tuc"}
Remove "BET Tuc A" {ParentBody "BET Tuc (AB)"}
Remove "BET Tuc B" {ParentBody "BET Tuc (AB)"}
Remove "BET Tuc C" {ParentBody "BET Tuc (CD)"}
Remove "BET Tuc D" {ParentBody "BET Tuc (CD)"}
Remove "BET3 Tuc A" {ParentBody "BET3 Tuc"}
Remove "BET3 Tuc B" {ParentBody "BET3 Tuc"}

//-------------------------------------------------------

// PG = B_8 is unresolved at SOAR
Barycenter "BET Tuc ABCD/HR 126/CP-63 50/GC 625/CCDM 00316-6258"
{
  ParentBody "BET Tuc"
  BinaryOrbit
  {
    Period          1175000
    Separation      23000
  }
}

Barycenter "BET3 Tuc PQ/HR 136/HD 3003/CP-63 52/HIP 2578/SAO 248208/GC 651/CCDM 00327-6302"
{
  ParentBody "BET Tuc"
	/* BinaryOrbit
  {
    Period          1175000
    Separation      23000
  } */
}

//-------------------------------------------------------

Barycenter "鸟喙四/BET1 Tuc AB/HD 2884/HIP 2484/SAO 248201"
{
  ParentBody "BET Tuc ABCD"
  BinaryOrbit
  {
    Period          15930
		Separation      1100
  }
}

Barycenter "BET2 Tuc CD/HD 2885/HIP 2487/SAO 248202"
{
	ParentBody "BET Tuc ABCD"
	/* BinaryOrbit
  {
    Period          15930
		Separation      1100
  } */
}

//-------------------------------------------------------

Star "BET1 Tuc A"
{
  ParentBody "BET1 Tuc AB"
  Class      "B9V"
  MassSol    3.84

  BinaryOrbit
  {
    Period          635.973
		Separation      100
  }
}

Star "BET1 Tuc B"
{
  ParentBody "BET1 Tuc AB"
  Class      "M3"
	MassSol    0.4

	/* BinaryOrbit
  {
    Period          635.973
		Separation      100
  } */
}

//-------------------------------------------------------

Star "BET2 Tuc C"
{
  ParentBody "BET2 Tuc CD"
  Class      "A2V"
  MassSol    2.76

  Orbit
  {
    Period          44.73
		Epoch           2455788.64774794
		Eccentricity    0.81
		AscendingNode   241.6
    ArgOfPericenter 112.2
		Inclination     124.7
    MeanAnomaly     0
  }
}

Star "BET2 Tuc D"
{
  ParentBody "BET2 Tuc CD"
  Class      "A7V"
	MassSol    1.94

  Orbit
  {
		Period          44.73
		Epoch           2455788.64774794
		Eccentricity    0.81
		AscendingNode   241.6
	  ArgOfPericenter 292.2
		Inclination     124.7
	  MeanAnomaly     0
  }
}

//-------------------------------------------------------

Star "BET3 Tuc P"
{
  ParentBody "BET3 Tuc PQ"
  Class      "A0V"
  MassSol    1.55

  BinaryOrbit
  {
    Period          5.057
		Separation      4
  }
}

Star "BET3 Tuc Q"
{
  ParentBody "BET3 Tuc PQ"
  Class      "A2V"
	MassSol    1.55

	/* BinaryOrbit
  {
    Period          5.057
		Separation      4
  } */
}

// 鸟喙五(SB**)
Remove "RHO Tuc A" {ParentBody "RHO Tuc"}
Remove "RHO Tuc B" {ParentBody "RHO Tuc"}
Star "HIP 3330 1"
{
  ParentBody "HIP 3330"
  Class      "F6V"
  MassSol    1.66
	Luminosity 9.7
	Teff       6034
	FeH        -0.26
	Age        2.64

  Orbit
  {
    PeriodDays      4.8202
		Eccentricity    0.02
		Epoch           2419299.11
    ArgOfPericenter 0
    MeanAnomaly     0
		//SemiAmplitude   26.1
  }
}

Star "HIP 3330 2"
{
  ParentBody "HIP 3330"
  Class      ""	//unknown subclass
  MassSol    0.33

  Orbit
  {
		PeriodDays      4.8202
		Eccentricity    0.02
		Epoch           2419299.11
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}

// 鸟喙七(Be*)
Star "HIP 118322 A"
{
  ParentBody "HIP 118322"
  Class      "B8V" // B9IV
  MassSol    4
	Oblateness 0.26470588235294117647058823529412
	Luminosity 389
	Teff       13000
	RotationPeriod 19.03632//192
	Age        0.123

  Orbit
  {
		RefPlane        "Static"
  }
}

// 鹤三(SB**)
// Wikipedia: Epsilon Gruis is suspected of having a moderately active close companion,
// which is most likely the source of the weak X-ray emission from these coordinates with a luminosity of 1.3×1028 erg s−1.
Star	"HIP 112623 A"
{
	ParentBody     "HIP 112623"
	Class	         "A2IVn"
	MassSol        1.85
	Teff           8685
	FeH            -0.16
	Age            0.249

	Orbit
	{
		RefPlane        "Equator"
		Period          132.015
		Eccentricity    0.260552
		Inclination     55.1306
		AscendingNode   63.8647
		ArgOfPericenter 50.7272
		MeanAnomaly     -89.4466
	}
}

Star	"HIP 112623 B"
{
	ParentBody     "EPS Gru"
	Class	         "M" // ?

	Orbit
	{
		RefPlane        "Equator"
		Period          132.015
		Eccentricity    0.260552
		Inclination     55.1306
		AscendingNode   63.8647
		ArgOfPericenter -129.273
		MeanAnomaly     -89.4466
	}
}

// 鹤五(PM**)
Star	"HIP 114996 A"
{
	ParentBody     "HIP 114996"
	Class	         "F1III" // F3IV // F4V
	MassSol        1.55
	RadSol         2.2
	Luminosity     11.33
	Teff           6679
	FeH            -0.22
	Age            1.414

	Orbit
	{
		RefPlane        "Equator"
		Period          4.1013
		Eccentricity    0.794526
		Inclination     129.513
		AscendingNode   -118.632
		ArgOfPericenter -67.42
		MeanAnomaly     76.194
	}
}

Star	"HIP 114996 B"
{
	ParentBody     "HIP 114996"
	Class	         "F6.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          4.1013
		Eccentricity    0.794526
		Inclination     129.513
		AscendingNode   -118.632
		ArgOfPericenter 112.58
		MeanAnomaly     76.194
	}
}

// 鹤七(SB**)
Star	"HIP 114421 A"
{
	ParentBody     "HIP 114421"
	Class	         "K1III"
	Luminosity     107

	Orbit
	{
		PeriodDays      409.614
		Eccentricity    0.66
		Inclination     114.3
		Epoch           2416115.569
		ArgOfPericenter 60.8
		MeanAnomaly     0
		//SemiAmplitude   13.6
	}
}

Star	"HIP 114421 B"
{
	ParentBody     "HIP 114421"
	Class	         "F1.1 V"

	Orbit
	{
		PeriodDays      409.614
		Eccentricity    0.66
		Inclination     114.3
		Epoch           2416115.569
		ArgOfPericenter 240.8
		MeanAnomaly     0
	}
}

// 鹤八(***)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=218227
Barycenter	"鹤八/HIP 114131 AB/HD 218227"
{
	ParentBody     "TET Gru"
	BinaryOrbit // JC_20 AC
	{
		Period          212969
		Separation      6435.72
	}
}

Star "HIP 114131 A"
{
	ParentBody "HIP 114131 AB"
	Class      "kF3VhF5mF5(II-III)"
	MassSol    1.97
	Luminosity 27
	Teff       6440 // ?

	BinaryOrbit // JC_20 AB Gaia pos.
	{
		Period          241.009
		Separation      56.1561
	}
}

Star "HIP 114131 B"
{
	ParentBody "HIP 114131 AB"
	Class      ""
	MassSol    1.19

	/* Orbit
	{
		Period          241.009
		Separation      56.1561
	} */
}

// Tok2015: RV(C,AB) = 15.9, 14.2 km/s.
Star "HIP 114112 C/HD 218205"
{
	ParentBody "TET Gru"
	Class      "G2V"
	MassSol    0.98

	/* BinaryOrbit
	{
		Period          212969
		Separation      6435.72
	} */
}

// 鹤十二(**)
Remove "MU1 Gru A" {ParentBody "MU1 Gru"}
Remove "MU1 Gru B" {ParentBody "MU1 Gru"}
Star "HIP 109908 1"
{
  ParentBody "HIP 109908"
  Class      "G8III"
  RadSol     9.3
	Luminosity 66.9
	Teff       5422

  Orbit
  {
    Period          19.04
		Eccentricity    0.561
		Inclination     65.69
		AscendingNode   104.2
		Epoch           2450211.39937255
    ArgOfPericenter 272.61
    MeanAnomaly     0
	}
}

Star "HIP 109908 2"
{
  ParentBody "HIP 109908"
  Class      "G" // A6?

  Orbit
  {
		Period          19.04
		Eccentricity    0.561
		Inclination     65.69
		AscendingNode   104.2
		Epoch           2450211.39937255
    ArgOfPericenter 92.61
    MeanAnomaly     0
  }
}

// 火鸟二(a2**)
Remove "IOT Phe A" {ParentBody "IOT Phe"}
Remove "IOT Phe B" {ParentBody "IOT Phe"}
Star "HIP 116389 1"
{
  ParentBody "HIP 116389"
  Class      "A2VpSrCrEu"
  MassSol    2.23
	RadSol     5.07
	Luminosity 68.2
	Teff       7370
	FeH        -0.01
	Age        0.573
	RotationPeriod 143.52

  BinaryOrbit
  {
		Separation      522.6
	}
}

Star "HIP 116389 2"
{
  ParentBody "HIP 116389"
  Class      "A3.7 V"

	/* BinaryOrbit
  {
		Separation      522.6
	} */
}

// 火鸟六(SB**)
Remove "Ankaa A" {ParentBody "Ankaa"}
Remove "Ankaa B" {ParentBody "Ankaa"}
Star "HIP 2081 1"
{
  ParentBody "HIP 2081"
  Class      "K0.5IIIb"
  RadSol     15
	Teff       4436
	FeH        -0.73

  Orbit
  {
    PeriodDays      3848.8
    Eccentricity    0.34
    Inclination     128
    AscendingNode   242.8
    Epoch           2416201.8
    ArgOfPericenter 199.8
    MeanAnomaly     0
  }
}

Star "HIP 2081 2"
{
  ParentBody "HIP 2081"
  Class      ""				//unknown/low mass star/it could be a WD
  MassSol    0.15					//unknown

	Orbit
  {
    PeriodDays      3848.8
    Eccentricity    0.34
    Inclination     128
    AscendingNode   242.8
    Epoch           2416201.8
    ArgOfPericenter 19.8
    MeanAnomaly     0
  }
}

// 火鸟七(**)
Star	"HIP 3245 A"
{
	ParentBody     "HIP 3245"
	Class	         "G8III"
	MassSol        2.5
	RadSol         13.15
	Luminosity     96.6
	Teff           4900
	Age            1.4

	Orbit
	{
		RefPlane        "Equator"
		Period          61.4816
		Eccentricity    0.289062
		Inclination     -80.228
		AscendingNode   179.89
		ArgOfPericenter 254.712
		MeanAnomaly     108.561
	}
}

Star	"HIP 3245 B"
{
	ParentBody   "HIP 3245"
	Class	       ""
	MassSol      2.3 // ?

	Orbit
	{
		RefPlane        "Equator"
		Period          61.4816
		Eccentricity    0.289062
		Inclination     -80.228
		AscendingNode   179.89
		ArgOfPericenter 74.7122
		MeanAnomaly     108.561
	}
}

// 火鸟八(PM**)
Star	"HIP 2472 A"
{
	ParentBody     "HIP 2472"
	Class	         "A0Va"
	MassSol        2.26
	RadSol         2.24
	Luminosity     33.68
	Teff           9931
	FeH            0
	Age            0.224

	BinaryOrbit
  {
		Separation      1683
	}
}

Star	"HIP 2472 B"
{
	ParentBody     "HIP 2472"
	Class	         "A0 V"

	/* BinaryOrbit
  {
		Separation      1683
	} */
}

// 火鸟九
Remove "BET Phe A" {ParentBody "BET Phe"}
Remove "BET Phe B" {ParentBody "BET Phe"}
Star "HIP 5165 1"
{
  ParentBody "HIP 5165"
  Class      "G8III"
	MassSol    2.7 // 3
	Luminosity 100
	Teff       5090

  Orbit
  {
    Period          170.7
    Eccentricity    0.718
    Inclination     144
    AscendingNode   126.4
		Epoch           2452790.00929594
    ArgOfPericenter 113.5
    MeanAnomaly     0
  }
}

Star "HIP 5165 2"
{
  ParentBody "HIP 5165"
  Class      "G8III"
	MassSol    2.7 // 3
	Luminosity 100
	Teff       4950

  Orbit
  {
		Period          170.7
    Eccentricity    0.718
    Inclination     144
    AscendingNode   126.4
		Epoch           2452790.00929594
    ArgOfPericenter 293.5
    MeanAnomaly     0
  }
}

// 火鸟十(SB**)
Remove "GAM Phe A" {ParentBody "GAM Phe"}
Remove "GAM Phe B" {ParentBody "GAM Phe"}
Star "HIP 6867 1"
{
  ParentBody "HIP 6867"
  Class      "M0III"
  MassSol    1.3
	RadSol     50 // 55
	Luminosity 562
	Teff       3802

  Orbit
  {
    PeriodDays      193.8
    Inclination     46.3
    AscendingNode   340.2
    Epoch           2419544.9
    ArgOfPericenter 0
    MeanAnomaly     0
	}
}

Star "HIP 6867 B"
{
  ParentBody "HIP 6867"
  Class      ""
  MassSol    0.6

  Orbit
  {
		PeriodDays      193.8
    Inclination     46.3
    AscendingNode   340.2
    Epoch           2419544.9
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}

// 水委一(Be**)(已知最扁的天体)
Remove "ALF Eri A" {ParentBody "ALF Eri"}
Remove "ALF Eri B" {ParentBody "ALF Eri"}
Star	"HIP 7588 A"
{
	ParentBody	  "HIP 7588"
  Class         "B6Vep"
	MassSol        6.1
	//DimensionsSol  (22.8, 14.6, 22.8)
	DimensionsSol  (18.32, 13.56, 18.32) // 啊这......
	Luminosity     3020
	Temperature    (12673, 17124, 12673)
	Teff           15000
	Age		         0.0373
	RotationPeriod 48
	Obliquity      60.6

	Corona
	{
		Radius      8.9082e+07
		Period      0.02501
		Brightness  1
		RayDensity  10
		RayCurv     500
	}

	Orbit
	{
		Period        14 // 15
		ArgOfPericen  0
		MeanAnomaly   0
	}
}

Star	"HIP 7588 B"
{
	ParentBody	  "HIP 7588"
  Class         "A0V" // A3V
	MassSol       2

	Orbit
	{
		Period        14 // 15
		ArgOfPericen  180
		MeanAnomaly   0
	}
}

// 水委二(EB****)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=5348
Remove "ZET Phe (AB)" {ParentBody "ZET Phe"}
Remove "ZET Phe C" {ParentBody "ZET Phe"}
Remove "ZET Phe A" {ParentBody "ZET Phe (AB)"}
Remove "ZET Phe B" {ParentBody "ZET Phe (AB)"}
Remove "ZET Phe Aa" {ParentBody "ZET Phe A"}
Remove "ZET Phe Ab" {ParentBody "ZET Phe A"}
Barycenter "HIP 5348 AB"
{
  ParentBody "HIP 5348"
  BinaryOrbit
  {
    Period          5000
  }
}

Barycenter "HIP 5348 A"
{
  ParentBody "HIP 5348 AB"
  Orbit // VB6_Lin2004a RST1205AB Gr.5
  {
    Period          210.37
    Epoch           2496399.92783039
    Eccentricity    0.348
		AscendingNode   33.5
    ArgOfPericenter 91.7
    Inclination     61.9
    MeanAnomaly     0
  }

	/* Orbit // IAU #197 Ling
  {
    Period          289.6
    Epoch           2422653.87547452
    Eccentricity    0.597
		AscendingNode   24.9
    ArgOfPericenter 292.2
    Inclination     70.4
    MeanAnomaly     0
  } */
}

Star "HIP 5348 A1"
{
  ParentBody "HIP 5348 A"
  Class      "B6V"
  MassSol    3.908
	RadSol     2.835
	Luminosity 309
	Teff       14400

  /* Orbit // SB9_60 1983A&A...118..255A
  {
    PeriodDays      1.66977
		Epoch           2441643.688
    ArgOfPericenter 180
    MeanAnomaly     0
  } */

	Orbit // Southworth, John (2020) 2020Obs...140..247S
  {
    PeriodDays      1.6697739
		Eccentricity    0.0116
		Inclination     89.14
    ArgOfPericenter 127
    MeanAnomaly     0
		//SemiAmplitude   131.4
  }
}

Star "HIP 5348 A2"
{
  ParentBody "HIP 5348 A"
  Class      "B8V"
  MassSol    2.536
	RadSol     1.885
	Luminosity 66
	Teff       12000

  /* Orbit
  {
		PeriodDays      1.66977
		Epoch           2441643.688
    ArgOfPericenter 0
    MeanAnomaly     0
  } */

	Orbit
	{
		PeriodDays      1.6697739
		Eccentricity    0.0116
		Inclination     89.14
		ArgOfPericenter 307
		MeanAnomaly     0
		//SemiAmplitude   202.5
	}
}

Star "HIP 5348 B"
{
  ParentBody "HIP 5348 AB"
  Class      "A"
  MassSol    1.65

  Orbit
  {
		Period          210.37
    Epoch           2496399.92783039
    Eccentricity    0.348
		AscendingNode   33.5
    ArgOfPericenter 271.7
    Inclination     61.9
    MeanAnomaly     0
  }

	/* Orbit
	{
		Period          289.6
		Epoch           2422653.87547452
		Eccentricity    0.597
		AscendingNode   24.9
		ArgOfPericenter 292.2
		Inclination     70.4
		MeanAnomaly     0
	} */
}

Star "HIP 5348 C"
{
  ParentBody "HIP 5348"
  Class      "F"
  MassSol    1.65

	/* BinaryOrbit
  {
    Period          5000
  } */
}

// 水委三(dS***)
Remove "Eta Phe A" {ParentBody "Eta Phe"}
Remove "Eta Phe B" {ParentBody "Eta Phe"}
Remove "Eta Phe Aa" {ParentBody "Eta Phe A"}
Remove "Eta Phe Ab" {ParentBody "Eta Phe A"}
Barycenter "HIP 3405 A"
{
  ParentBody "Eta Phe"
  BinaryOrbit
  {
		Separation      1520
  }
}

Star "HIP 3405 Aa"
{
  ParentBody "HIP 3405 A"
  Class      "A0IV"
  MassSol    2.93
	Luminosity 120
	Teff       9822
	FeH        0

  BinaryOrbit
  {
    Period          10
		Separation      6.8
  }
}

Star "HIP 3405 Ab"
{
  ParentBody "HIP 3405 A"
  Class      "G5V"

	/* BinaryOrbit
  {
    Period          10
		Separation      6.8
  } */
}

Star "HIP 3405 B"
{
  ParentBody "HIP 3405"
  Class      "A6.5 V"

	/* BinaryOrbit
  {
		Separation      1520
  } */
}

// 夹白二(PM**)
Remove "ALF Ret A" {ParentBody "ALF Ret"}
Remove "ALF Ret B" {ParentBody "ALF Ret"}
Star "HIP 19780 1"
{
  ParentBody "HIP 19780"
  Class      "G8II"
  MassSol    3.11
	RadSol     12.8
	Luminosity 240
	Teff       5196
	FeH        0.07
	Age        0.33

  Orbit
  {
    Period          60000
    ArgOfPericenter 0
    MeanAnomaly     0
  }
}

Star "HIP 19780 2/CCDM J04144-6228B"
{
  ParentBody "HIP 19780"
  Class      ""
  MassSol    0.64

  Orbit
  {
  	Period          60000
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}

// 金鱼二(a2**)
Remove "ALF Dor A" {ParentBody "ALF Dor"}
Remove "ALF Dor B" {ParentBody "ALF Dor"}
Star "HIP 21281 1"
{
  ParentBody "HIP 21281"
  Class      "A0IIIp"
  MassSol    3.33
	RadSol     3.5
	Luminosity 195
	LumBol     195
	Teff       11588
	RotationPeriod 70.56

  Orbit
  {
    Period          12.1
    Eccentricity    0.8
    Inclination     31
    AscendingNode   140
		Epoch           2446431.14261517
    ArgOfPericenter 13
    MeanAnomaly     0
  }
}

Star "HIP 21281 B"
{
  ParentBody "HIP 21281"
  Class      "B9IV"
  MassSol    2.7
	RadSol     1.9
	Luminosity 70
	LumBol     70
	Teff       12200

  Orbit
  {
		Period          12.1
    Eccentricity    0.8
    Inclination     31
    AscendingNode   140
		Epoch           2446431.14261517
    ArgOfPericenter 193
    MeanAnomaly     0
  }
}

// 海石一(***)
Star "EPS Car A/HD 71129"
{
	ParentBody "HIP 41037"
	Class      "K3III"
	MassSol    10.5
	AbsMagn    -4.3
	Teff       3253
	Age        0.0312

	/* BinaryOrbit
	{
		PeriodDays      785
	} */
}

Barycenter "EPS Car B/HD 71130"
{
	ParentBody "HIP 41037"
	BinaryOrbit
	{
		PeriodDays      785
	}
}

Star "HD 71130 A"
{
	ParentBody "HD 71130"
	Class      "B2Vp"
	MassSol    7.3
	AbsMagn    -1.8
	Teff       20417
	Age        0.02

	Orbit
	{
		RefPlane        "Equator"
		Period          0.031564
		Eccentricity    0
		Inclination     -165.26
		AscendingNode   -68.1059
		ArgOfPericenter -13.2925
		MeanAnomaly     -144.658
	}
}

Star "HD 71130 B(?)"
{
	ParentBody "HD 71130"
	Class      "F8"
	AbsMagn    -1.7

	Orbit
	{
		RefPlane        "Equator"
		Period          0.031564
		Eccentricity    0
		Inclination     -165.26
		AscendingNode   -68.1059
		ArgOfPericenter 166.707
		MeanAnomaly     -144.658
	}
}

// 海石五(**)
Remove "UPS Car A" {ParentBody "UPS Car"}
Remove "UPS Car B" {ParentBody "UPS Car"}
Star "UPS Car A/HD 85124 A/HR 3891 A/SAO 250696 A"
{
	ParentBody "HIP 48002"
	Class      "A8Ib"
	MassSol    13
	AbsMagn    -5.26 // 光度增强
	Teff       7600
	Age        0.012

	BinaryOrbit
	{
		Period          19500
		Separation      2000
	}
}

Star "UPS Car B/HD 85123 B/HR 3890 B/SAO 250695 B"
{
	ParentBody "HIP 48002"
	Class      "B7III"
	MassSol    8
	AbsMagn    -2 // 光度增强
	Teff       23000

	/* BinaryOrbit
	{
		Period          19500
		Separation      2000
	} */
}

// 飞鱼一(**)
Remove "ALF Vol A" {ParentBody "ALF Vol"}
Remove "ALF Vol B" {ParentBody "ALF Vol"}
Star "HIP 44382 1"
{
  ParentBody "HIP 44382"
  Class      "kA3hA5mA5V"
  MassSol    1.87
	RadSol     1.9
	AbsMagn    1.6
	Teff       8198
	FeH        0.19
	Age        0.427

  Orbit
  {
    Period          0.652
		Eccentricity    0.041
		Inclination     101.9
		AscendingNode   105.3
		Epoch           2457239.75500369
    ArgOfPericenter 68.5
    MeanAnomaly     0
  }
}

Star "HIP 44382 2"
{
  ParentBody "HIP 44382"
  Class      "F2.7 V"

  Orbit
  {
		Period          0.652
		Eccentricity    0.041
		Inclination     101.9
		AscendingNode   105.3
		Epoch           2457239.75500369
    ArgOfPericenter 248.5
    MeanAnomaly     0
  }
}

// 飞鱼二
Remove "GAM1 Vol" {ParentBody "GAM Vol"}
Remove "GAM2 Vol" {ParentBody "GAM Vol"}
Star "GAM1 Vol A/HD 55864 A/HIP 34473 A/HR 2735 A/SAO 256373 A"
{
  ParentBody "GAM Vol"
  Class      "F2V"
  MassSol    1.69
	Teff       6541
	FeH        0.12
	Age        1.4

  BinaryOrbit
  {
		Epoch           2452275.01779566
    Separation      620.4
    PositionAngle   296
  }
}

Star "飞鱼二/GAM2 Vol B/HD 55865 B/HIP 34481 B/HR 2736 B/SAO 256374 B"
{
  ParentBody "GAM Vol"
  Class      "K0III"
  Luminosity 60
	Teff       4866
	FeH        -0.01

	/* BinaryOrbit
  {
		Epoch           2452275.01779566
    Separation      620.4
    PositionAngle   296
  } */
}

// 飞鱼四(****)(补全系统)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=71046
Remove "KAP1 Vol" {ParentBody "KAP Vol"}
Remove "KAP2 Vol" {ParentBody "KAP Vol"}
/* Barycenter "KAP Vol AB"
{
  ParentBody "KAP Vol"
  BinaryOrbit
  {
    Period          547229
		Separation      13233.5
  }
} */

Barycenter "飞鱼四/KAP1 Vol/CPD-71 677/HD 71046/HIP 40817/HR 3301/SAO 256497"
{
  ParentBody "WDS J08198-7131"
  /* BinaryOrbit
  {
    Period          250035
    Separation      8622.39
  } */
	Orbit
	{
		RefPlane        "Static"
	}
}

Star "KAP1 Vol A"
{
  ParentBody "KAP1 Vol"
  Class      "B9III"
	MassSol    2.7
	RadSol     3.83
	Luminosity 129
	Teff       9884
	FeH        -0.2

  Orbit
  {
    Period          973.382
    ArgOfPericenter 0
    MeanAnomaly     0
  }
}

Star "KAP1 Vol B"
{
  ParentBody "KAP1 Vol"
  Class      ""
  MassSol    1.09

  Orbit
  {
		Period          973.382
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}

Star "KAP2 Vol/CPD-71 678/HD 71066/HIP 40834/HR 3302/SAO 256499"
{
  ParentBody "WDS J08198-7131"
  Class      "B9IV" // A0IV
	MassSol    3.03
	RadSol     3.01
  Luminosity 124
	Teff       11682
	FeH        0.69
	RotationPeriod 31.11384
	Age        0.12

	Orbit
  {
    Period          547229
		SemiMajorAxis   8622.39
		ArgOfPericenter 50
		MeanAnomaly     0
  }
}

Star "KAP Vol C"
{
  ParentBody "WDS J08198-7131"
  Class      "K2III" // Gaia plx and V-K color place C above MS, a K2 giant?
  MassSol    1.67

	Orbit
  {
    Period          250035
		SemiMajorAxis   13262.8
		ArgOfPericenter 45
		MeanAnomaly     0
  }
}

// 飞鱼六(**)
Remove "ZET Vol A" {ParentBody "ZET Vol"}
Remove "ZET Vol B" {ParentBody "ZET Vol"}
Star "HIP 37504 1"
{
  ParentBody "HIP 37504"
  Class      "K0III"
  MassSol    1.74
	RadSol     11
	Luminosity 53
	Teff       4721
	FeH        -0.18
	Age        5.27

  BinaryOrbit
  {
		Separation      721.44
  }
}

Star "HIP 37504 2"
{
  ParentBody "HIP 37504"
  Class      ""
  MassSol    0.85 // ?

	/* BinaryOrbit
  {
		Separation      721.44
  } */
}

// 南船三(SB**)
Star "HIP 52419 A"
{
  ParentBody "HIP 52419"
  Class      "B0.5Vp"
  MassSol    14.9
	RadSol     5.1
	Luminosity 25673
	Teff       31000
	Age        0.004

  Orbit
  {
    PeriodDays      2.20288
		Eccentricity    0.129
    ArgOfPericenter 261.8
    MeanAnomaly     0
		//SemiAmplitude   18.93
  }
}

Star "HIP 52419 B"
{
  ParentBody "HIP 52419"
  Class      "F" // ?
	//Luminosity 256.73 // 1% of the primary

  Orbit
  {
		PeriodDays      2.20288
		Eccentricity    0.129
    ArgOfPericenter 81.8
    MeanAnomaly     0
  }
}

// 小斗二
Remove "EPS Cha A" {ParentBody "EPS Cha"}
Remove "EPS Cha B" {ParentBody "EPS Cha"}
Star "HIP 58484 1/HJ 4486 A"
{
  ParentBody "HIP 58484"
  Class      "B9Vn"
  MassSol    2.87
	LumBol     99.7
	Teff       10500
	Age        0.0027

  BinaryOrbit // no formal orbit has yet been determined
  {
		Epoch           2450481.86122075
		Separation      40.4036
		PositionAngle   211
  }
}

Star "HIP 58484 2/HJ 4486 B"
{
  ParentBody "HIP 58484"
  Class      "A"
	Teff       9600
  MassSol    3

	/* BinaryOrbit // no formal orbit has yet been determined
  {
		Epoch           2450481.86122075
		Separation      40.4036
		PositionAngle   211
  } */
}
