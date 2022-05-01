// 氐宿一 - 氐宿增七(SB**)
Remove "ALF1 Lib"{ParentBody "Zubenelgenubi"}
Remove "ALF2 Lib"{ParentBody "Zubenelgenubi"}
Remove "ALF1 Lib A"{ParentBody "ALF1 Lib"}
Remove "ALF1 Lib B"{ParentBody "ALF1 Lib"}
Remove "ALF2 Lib A"{ParentBody "ALF2 Lib"}
Remove "ALF2 Lib B"{ParentBody "ALF2 Lib"}
Barycenter "氐宿增七/ALF1 Lib AB/8 Lib A/BD-15 3965/FK5 1387/HD 130819 A/HIP 72603 A/HR 5530/SAO 158836"
{
	ParentBody "ALF Lib"
	BinaryOrbit
	{
		Separation      5400
		PositionAngle   314
	}
}

Star "ALF1 Lib A"
{
	ParentBody "ALF1 Lib AB"
	Class      "F3V"
	MassSol    1.97
	Teff       6653
	FeH        -0.07
	Age        1.1

	Orbit
	{
		PeriodDays      5870
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "ALF1 Lib B"
{
	ParentBody "ALF1 Lib AB"
	Class      ""
	MassSol    1.6

	Orbit
	{
		PeriodDays      5870
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "氐宿一/ALF2 Lib AB/9 Lib B/BD-15 3966/FK5 548/HD 130841 B/HIP 72622 B/HR 5531/SAO 158840"
{
	ParentBody "ALF Lib"
	BinaryOrbit
	{
		Separation      5400
		PositionAngle   314
	}
}

Star "ALF2 Lib A"
{
	ParentBody "ALF2 Lib AB"
	Class      "A2hA5mA4IV"
	MassSol    1.4
	Teff       8128

	Orbit
	{
		PeriodDays      70.34
		Eccentricity    0.41
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "ALF2 Lib B"
{
	ParentBody "ALF2 Lib AB"
	Class      ""
	MassSol    0.5

	Orbit
	{
		PeriodDays      70.34
		Eccentricity    0.41
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   43.1
	}
}

// 氐宿二(SB**)
Remove "IOT1 Lib A"{ParentBody "IOT1 Lib"}
Remove "IOT1 Lib BC"{ParentBody "IOT1 Lib"}
Remove "IOT1 Lib Aa"{ParentBody "IOT1 Lib A"}
Remove "IOT1 Lib Ab"{ParentBody "IOT1 Lib A"}
Remove "IOT1 Lib B"{ParentBody "IOT1 Lib BC"}
Remove "IOT1 Lib C"{ParentBody "IOT1 Lib BC"}
Barycenter "HIP 74392 A"
{
	ParentBody "HIP 74392"
	BinaryOrbit
	{
		Separation      6612
	}
}

Barycenter "HIP 74392 BC"
{
	ParentBody "HIP 74392"
	BinaryOrbit
	{
		Separation      6612
	}
}

Star "HIP 74392 Aa"
{
	ParentBody "HIP 74392 A"
	Class      "B9IVpSi"
	Luminosity 277

	Orbit
	{
		Period          22.35
		Eccentricity    0.35
		Epoch           2433155
		ArgOfPericenter 187.6
		MeanAnomaly     0
		//SemiAmplitude   3.4
	}
}

Star "HIP 74392 Ab"
{
	ParentBody "HIP 74392 A"
	Class      "B9V"

	Orbit
	{
		Period          22.35
		Eccentricity    0.35
		Epoch           2433155
		ArgOfPericenter 7.6
		MeanAnomaly     0
	}
}

Star "HIP 74392 B"
{
	ParentBody "HIP 74392 BC"
	Class      ""
	MassSol    0.85

	BinaryOrbit
	{
		Separation      220.4
	}
}

Star "HIP 74392 C"
{
	ParentBody "HIP 74392 BC"
	Class      ""
	MassSol    0.85

	BinaryOrbit
	{
		Separation      220.4
	}
}

// 氐宿三(**)
Star	"HIP 76333 A"
{
	ParentBody     "HIP 76333"
	Class	         "G8.5III"
	MassSol         1.15
	RadSol          11.14
	Luminosity      72
	Teff            4786
	FeH             -0.3
	Age             4.31

	BinaryOrbit
	{
		Separation      2125
	}
}

Star	"HIP 76333 B"
{
	ParentBody     "HIP 76333"
	Class	         "M0.9 V"

	BinaryOrbit
	{
		Separation      2125
	}
}

// 天乳(**)
Star	"HIP 77516 A"
{
	ParentBody     "HIP 77516"
	Class	         "A0V"
	MassSol         2.4
	Luminosity      92
	Teff            9487

	Orbit
	{
		Period          36
		Eccentricity    0.4
		Inclination     103
		AscendingNode   296
		Epoch           2447490.34499163
		ArgOfPericenter 128
		MeanAnomaly     0
	}
}

Star	"HIP 77516 B"
{
	ParentBody     "HIP 77516"
	Class	         "A" // F?
  MassSol        2.3

	Orbit
	{
		Period          36
		Eccentricity    0.4
		Inclination     103
		AscendingNode   296
		Epoch           2447490.34499163
		ArgOfPericenter 308
		MeanAnomaly     0
	}
}

// 招摇(dS**)
// B为光学伴星
Star	"HIP 71075 Aa"
{
	ParentBody     "HIP 71075"
	Class	         "A7IV+"
	Luminosity     34
	Teff           7800
	FeH            -0.2

	BinaryOrbit
	{
		Separation      1.83614
	}
}

Star	"HIP 71075 Ab"
{
	ParentBody     "HIP 71075"
	Class	         "A6.7 V"

	BinaryOrbit
	{
		Separation      1.83614
	}
}

// 梗河一(**) (补全)
Remove "Izar A"{ParentBody "Izar"}
Remove "Izar B"{ParentBody "Izar"}
Star "HIP 72105 A/HD 129989 A/HR 5506 A/SAO 83500 A"
{
	ParentBody "HIP 72105"
	Class      "K0II"
	MassSol    4.6
	RadSol     33
	Luminosity 501
	Teff       4550
	FeH        -0.2
	Age        0.0374

	Orbit
	{
		Period          1000
		//SemiMajorAxis   185
		ArgOfPericenter 162.9
		MeanAnomaly     0
	}
}

Star "HIP 72105 B/HD 129988 B/HR 5505 B"
{
	ParentBody "HIP 72105"
	Class      "A2V"
	MassSol    2.27
	RadSol     2.7
	Luminosity 44.8
	Teff       9009

	Orbit
	{
		Period          1000
		//SemiMajorAxis   185
		ArgOfPericenter 342.9
		MeanAnomaly     0
	}
}

// 帝席一(SB**)
Remove "12 Boo A"{ParentBody "12 Boo"}
Remove "12 Boo B"{ParentBody "12 Boo"}
Star "HIP 69226 Aa"
{
	ParentBody "HIP 69226"
	Class      "F9IVe"
	MassSol    1.4109
	RadSol     2.9
	Teff       6130
	FeH        0

	Orbit
	{
		PeriodDays      9.604560136
		Eccentricity    0.1921415
		Inclination     107.9512
		AscendingNode   80.4910
		Epoch           2454100.4357270
		ArgOfPericenter 106.83229
		MeanAnomaly     0
		//SemiAmplitude   67.189
	}
}

Star "HIP 69226 Ab"
{
	ParentBody "HIP 69226"
	Class      ""
	MassSol    1.3677
	Teff       6230

	Orbit
	{
		PeriodDays      9.604560136
		Eccentricity    0.1921415
		Inclination     107.9512
		AscendingNode   80.4910
		Epoch           2454100.4357270
		ArgOfPericenter 286.83229
		MeanAnomaly     0
		//SemiAmplitude   69.311
	}
}

/*Star "HIP 69226 B(?)"
{
	ParentBody "HIP 69226"
	Class      ""

	BinaryOrbit
	{
		Separation      35.8201
	}
}*/

// 亢池三(**)
Star	"HIP 69536 A"
{
	ParentBody     "HIP 69536"
	Class	         "F8 V"
	MassSol        1.46
	RadSol         2.12
	Luminosity     5.879
	Teff           6169
	FeH            0.07
	RotationPeriod 624
	Age            2.6

	BinaryOrbit
	{
		Separation      6.71986
	}
}

Star	"HIP 69536 B(?)"
{
	ParentBody     "HIP 69536"
	Class	         "K1.9 V"

	BinaryOrbit
	{
		Separation      6.71986
	}
}

// 骑官一(El***)
Remove "GAM Lup A"{ParentBody "GAM Lup"}
Remove "GAM Lup B"{ParentBody "GAM Lup"}
Barycenter	"HIP 76297 A"
{
	ParentBody     "HIP 76297"
	Orbit
	{
		Period          190
		Eccentricity    0.51
		Inclination     95
		AscendingNode   94.6
		Epoch           2409541.68053829
		ArgOfPericenter 131.5
		MeanAnomaly     0
	}
}

Star	"HIP 76297 Aa"
{
	ParentBody     "HIP 76297 A"
	Class	         "B2IV"
	MassSol        9.5
	RadSol         5
	Luminosity     5000
	Teff           20900
	Age            0.0186

	Orbit
	{
		PeriodDays      2.8081
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 76297 Ab"
{
	ParentBody     "HIP 76297 A"
	Class	         "A6.3 V"

	Orbit
	{
		PeriodDays      2.8081
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 76297 B"
{
	ParentBody     "HIP 76297"
	Class	         "B4"//(?)

	Orbit
	{
		Period          190
		Eccentricity    0.51
		Inclination     95
		AscendingNode   94.6
		Epoch           2409541.68053829
		ArgOfPericenter 311.5
		MeanAnomaly     0
	}
}

// 骑官三(**)
Remove "KAP Cen A"{ParentBody "KAP Cen"}
Remove "KAP Cen B"{ParentBody "KAP Cen"}
Remove "KAP Cen Aa"{ParentBody "KAP Cen A"}
Remove "KAP Cen Ab"{ParentBody "KAP Cen B"}
Star "HIP 73334 A"
{
	ParentBody "HIP 73334"
	Class      "B2IV"
	MassSol    7.2
	RadSol     4.4
	Luminosity 2500
	Teff       19800
	Age        0.0182

	BinaryOrbit
	{
		Epoch           2454101.22878957
		Separation      15.1026
		PositionAngle   156
	}
}

Star "HIP 73334 B"
{
	ParentBody "HIP 73334"
	Class      ""
	MassSol    5

	BinaryOrbit
	{
		Epoch           2454101.22878957
		Separation      15.1026
		PositionAngle   156
	}
}

// 骑官五
Remove "LAM Lup A"{ParentBody "LAM Lup"}
Remove "LAM Lup B"{ParentBody "LAM Lup"}
Barycenter	"HIP 74117 Aab"
{
	ParentBody     "HIP 74117"
	Orbit
	{
			Period          70.8
			Eccentricity    0.6283
			Inclination     71.59
			AscendingNode   26.64
			Epoch           2450780.08147605
			ArgOfPericenter 119.9
			MeanAnomaly     0
	}
}

Star "HIP 74117 Aa"
{
  ParentBody "HIP 74117 Aab"
  Class      "B3 V"
  MassSol    8.14
	Age        0.028

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00967431209
		Eccentricity    0
		Inclination     -2.17080975
		AscendingNode   0
		ArgOfPericenter -144.366568
		MeanAnomaly     -24.1229116
	}
}

Star	"HIP 74117 Ab"
{
	ParentBody     "HIP 74117 Aab"
	Class          "B6.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00967431209
		Eccentricity    0
		Inclination     -2.17080975
		AscendingNode   0
		ArgOfPericenter 35.6334319
		MeanAnomaly     -24.1229116
	}
}

Star "HIP 74117 B"
{
  ParentBody "HIP 74117"
  Class      "B3 V"
  MassSol    5.84

  Orbit
  {
    Period          70.8
    Eccentricity    0.6283
    Inclination     71.59
    AscendingNode   26.64
		Epoch           2450780.08147605
    ArgOfPericenter 299.9
    MeanAnomaly     0
  }
}

// 骑官六(SB***)
Remove "EPS Lup A"{ParentBody "EPS Lup"}
Remove "EPS Lup B"{ParentBody "EPS Lup"}
Remove "EPS Lup Aa"{ParentBody "EPS Lup A"}
Remove "EPS Lup Ab"{ParentBody "EPS Lup A"}
Barycenter "HIP 75264 A"
{
  ParentBody "HIP 75264"
  Orbit
  {
    Period          64
    Eccentricity    0.635
    ArgOfPericenter 21.3
    Epoch           2456760.19
    MeanAnomaly     0
  }
}

Star "HIP 75264 A1"
{
  ParentBody "HIP 75264 A"
  Class      "B3IV"
  MassSol    13.24
	RadSol     4.7
	LumBol     3200
	Teff       19275

  Orbit
  {
    PeriodDays      4.55970
    //SemiMajorAxis   29.2RadSol
    Eccentricity    0.277
    Inclination     20.5
		Epoch           2452790.33
    ArgOfPericenter 197
    MeanAnomaly     0
		//SemiAmplitude   53.8
    }
}

Star "HIP 75264 A2"
{
  ParentBody "HIP 75264 A"
  Class      "B3V"
  MassSol    11.46
	RadSol     3.8

  Orbit
  {
    PeriodDays      4.55970
    //SemiMajorAxis   29.2RadSol
    Eccentricity    0.277
    Inclination     20.5
		Epoch           2452790.33
    ArgOfPericenter 17
    MeanAnomaly     0
		//SemiAmplitude   64.7
  }
}

Star "HIP 75264 B"
{
  ParentBody "HIP 75264"
  Class      "A5V"
  MassSol    7.64

  Orbit
  {
    Period          64
    Eccentricity    0.635
    ArgOfPericenter 201.3
    Epoch           2456760.19
    MeanAnomaly     0
  }
}

// 骑官七(Be***)
Remove "MU Lup (AB)"{ParentBody "MU Lup"}
Remove "MU Lup C"{ParentBody "MU Lup"}
Remove "MU Lup A"{ParentBody "MU Lup (AB)"}
Remove "MU Lup B"{ParentBody "MU Lup (AB)"}
Barycenter "HIP 74911 AB"
{
  ParentBody "HIP 74911"
  BinaryOrbit
  {
    Separation      2327.8
  }
}

Star "HIP 74911 A"
{
  ParentBody "HIP 74911 AB"
  Class      "B8V"
  MassSol    4.42
	Luminosity 603
	Teff       13470
	Age        0.112

	BinaryOrbit
	{
		Separation      113.3
	}
}

Star "HIP 74911 B"
{
  ParentBody "HIP 74911 AB"
  Class      "A8.1 V"

	BinaryOrbit
	{
	  Separation      113.3
	}
}

Star "HIP 74911 C"
{
  ParentBody "HIP 74911"
  Class      "F4.9 V"

	BinaryOrbit
	{
		Separation      2327.8
	}
}

// 骑官八(****)
Remove "PI Lup A"{ParentBody "PI Lup"}
Remove "PI Lup B"{ParentBody "PI Lup"}
Barycenter	"HIP 73807 A/HD 133242 A/HR 5605 A"
{
	ParentBody     "HIP 73807"
	Orbit
	{
		Period          517
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 73807 Aa"
{
	ParentBody     "HIP 73807 A"
	Class	         "B5V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00658977
		Eccentricity    0
		Inclination     -87.5492
		AscendingNode   -131.86
		ArgOfPericenter -21.7945
		MeanAnomaly     -163.227
	}
}

Star	"HIP 73807 Ab"
{
	ParentBody     "HIP 73807 A"
	Class	         "A6.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00658977
		Eccentricity    0
		Inclination     -87.5492
		AscendingNode   -131.86
		ArgOfPericenter 158.206
		MeanAnomaly     -163.227
	}
}

Barycenter	"HIP 73807 B/HD 133243 B/HR 5606 B"
{
	ParentBody     "HIP 73807"
	Orbit
	{
		Period          517
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 73807 Ba"
{
	ParentBody     "HIP 73807 B"
	Class	         "B5 IV"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00820279
		Eccentricity    0
		Inclination     -33.1559
		AscendingNode   117.205
		ArgOfPericenter -105.921
		MeanAnomaly     104.172
	}
}

Star	"HIP 73807 Bb"
{
	ParentBody     "HIP 73807 B"
	Class	         "A6.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00820279
		Eccentricity    0
		Inclination     -33.1559
		AscendingNode   117.205
		ArgOfPericenter 74.079
		MeanAnomaly     104.172
	}
}

// 骑官九(**)
Star	"HIP 72683 A"
{
	ParentBody     "HIP 72683"
	Class	         "B5 IV"
	MassSol        5.7
	RadSol         3.5
	Luminosity     1260
	Teff           18000

	Orbit
	{
		Period          27
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 72683 B"
{
	ParentBody     "HIP 72683"
	Class	         "B9.8 V"

	Orbit
	{
		Period          27
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 车骑一(PM**)
Remove "ZET Lup A"{ParentBody "ZET Lup"}
Remove "ZET Lup B"{ParentBody "ZET Lup"}
Star "HIP 74395 1"
{
  ParentBody "HIP 74395"
  Class      "G7III"
  MassSol    2.29
	RadSol     10
	Luminosity 53
	Teff       5335
	FeH        0

	BinaryOrbit
	{
		Epoch           2456292.68198225
		Separation      2563.2
		PositionAngle   249
	}
}

Star "HIP 74395 2"
{
  ParentBody "HIP 74395"
  Class      "F8 V"

	BinaryOrbit
	{
		Epoch           2456292.68198225
		Separation      2563.2
		PositionAngle   249
	}
}

// 天辐一(**)
Remove "UPS Lib A"{ParentBody "UPS Lib"}
Remove "UPS Lib B"{ParentBody "UPS Lib"}
Star "HD 139063 A"
{
	ParentBody "HD 139063"
	Class      "K3III"
	MassSol    1.67
	RadSol     31.5
	Luminosity 309
	Teff       4135
	FeH        -0.02
	Age        3.14

	BinaryOrbit
	{
		Epoch           2452275.01779566
		Separation      137.2
		PositionAngle   151
	}
}

Star "HD 139063 B"
{
	ParentBody "HD 139063"
	Class      "F0.9 V"

	BinaryOrbit
	{
		Epoch           2452275.01779566
		Separation      137.2
		PositionAngle   151
	}
}

// 天辐二(SB**)
Remove "TAU Lib A"{ParentBody "TAU Lib"}
Remove "TAU Lib B"{ParentBody "TAU Lib"}
Star "HIP 76600 A"
{
	ParentBody "HIP 76600"
	Class      "B2.5 V"
	MassSol    7.25
	RadSol     3.2
	LumBol     2705
	Teff       17990
	FeH        0.17
	Age        0.0315

	Orbit
	{
		PeriodDays      3.2907
		Eccentricity    0.28
		AscendingNode   114
		Epoch           2439272.312
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   75
	}
}

Star "HIP 76600 B"
{
	ParentBody "HIP 76600"
	Class      "B5.4 V"

	Orbit
	{
		PeriodDays      3.2907
		Eccentricity    0.28
		AscendingNode   114
		Epoch           2439272.312
		ArgOfPericenter 0
		MeanAnomaly     180
		//SemiAmplitude   167
	}
}
