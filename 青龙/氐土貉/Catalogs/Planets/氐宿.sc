// 氐宿一 - 氐宿增七
Remove "ALF1 Lib"{ParentBody "Zubenelgenubi"}
Remove "ALF2 Lib"{ParentBody "Zubenelgenubi"}
Remove "ALF1 Lib A"{ParentBody "ALF1 Lib"}
Remove "ALF1 Lib B"{ParentBody "ALF1 Lib"}
Remove "ALF2 Lib A"{ParentBody "ALF2 Lib"}
Remove "ALF2 Lib B"{ParentBody "ALF2 Lib"}
Barycenter "氐宿增七/ALF 1 Lib/8 Lib A/BD–15 3965/FK5 1387/HD 130819 A/HIP 72603 A/HR 5530/SAO 158836"
{
	ParentBody "ALF Lib"
	Orbit
	{
		Period          292784.82
		//SemiMajorAxis   3613.0198915
		Eccentricity    0.3	// unknown; typical value
		AscendingNode   314	// current position angle
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 72603 AA"
{
	ParentBody "HIP 72603 A"
	Class      "F3 V"
	MassSol    1.97
	Teff       6653
	FeH        -0.07
	Age        1.1

	Orbit
	{
		PeriodDays      5870
		//SemiMajorAxis   10
		Eccentricity    0	// unknown; typical value
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 72603 AB"
{
	ParentBody "HIP 72603 A"
	Class      ""
	MassSol    1.6

	Orbit
	{
		PeriodDays      5870
		//SemiMajorAxis   10
		Eccentricity    0	// unknown; typical value
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "氐宿一/ALF 2 Lib/9 Lib B/BD–15 3966/FK5 548/HD 130841 B/HIP 72622 B/HR 5531/SAO 158840"
{
	ParentBody "ALF Lib"
	Orbit
	{
		Period          292784.82
		//SemiMajorAxis   1786.9801085
		Eccentricity    0.3	// unknown; typical value
		AscendingNode   314	// current position angle
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 72622 BA"
{
	ParentBody "HIP 72622 B"
	Class      "kA2hA5mA4IV"
	MassSol    1.4
	Teff       8128

	Orbit
	{
		PeriodDays      70.34
		//SemiMajorAxis   0.51
		Eccentricity    0.41
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 72622 BB"
{
	ParentBody "HIP 72622 B"
	Class      ""
	MassSol    0.5

	Orbit
	{
		PeriodDays      70.34
		//SemiMajorAxis   0.51
		Eccentricity    0.41
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   43.1
	}
}

// 氐宿二
Remove "IOT1 Lib A"{ParentBody "IOT1 Lib"}
Remove "IOT1 Lib BC"{ParentBody "IOT1 Lib"}
Remove "IOT1 Lib Aa"{ParentBody "IOT1 Lib A"}
Remove "IOT1 Lib Ab"{ParentBody "IOT1 Lib A"}
Remove "IOT1 Lib B"{ParentBody "IOT1 Lib BC"}
Remove "IOT1 Lib C"{ParentBody "IOT1 Lib BC"}
Barycenter "HIP 74392 A"
{
	ParentBody "HIP 74392"
	Orbit
	{
		Period          192865.2593
		//SemiMajorAxis   1457.14285714
		Inclination     154.2    //unknown IN and AN/just aligned
		AscendingNode   174.5
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "HIP 74392 BC"
{
	ParentBody "HIP 74392"
	Orbit
	{
		Period          192865.2593
		//SemiMajorAxis   5142.85714286
		Inclination     154.2   //unknown IN and AN/just aligned
		AscendingNode   174.5
		ArgOfPericenter 180
		MeanAnomaly     0
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
	Class      "B9 V"

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
	MassSol    0.85  //unknown Mass distribution BC

	Orbit
	{
		Period          2700
		//SemiMajorAxis   115
		Inclination     154.2   //unknown IN and AN/just aligned
		AscendingNode   174.5
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 74392 C"
{
	ParentBody "HIP 74392 BC"
	Class      ""
	MassSol    0.85

	Orbit
	{
		Period          2700
		//SemiMajorAxis   115
		Inclination     154.2   //unknown IN and AN/just aligned
		AscendingNode   174.5
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 氐宿三
Star	"HIP 76333 A"
{
	ParentBody     "HIP 76333"
	Class	       "G8.5 III"
	Luminosity      72
	MassSol         1.15
	RadSol          11.14
	Teff            4786
	DeH            -0.3
	Age             4.31

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   41.1237
		Period          2760.34
		Eccentricity    0.401204
		Inclination     -107.498
		AscendingNode   48.5606
		ArgOfPericenter 83.0462
		MeanAnomaly     39.1634
	}
}

Star	"HIP 76333 B"
{
	ParentBody     "HIP 76333"
	Class	       "M0.9 V"
    AppMagn        11.2
	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   231.284
		Period          2760.34
		Eccentricity    0.401204
		Inclination     -107.498
		AscendingNode   48.5606
		ArgOfPericenter 263.046
		MeanAnomaly     39.1634
	}
}

// 天乳
Star	"HIP 77516 A"
{
	ParentBody     "HIP 77516"
	Class	       "A0V"
	Luminosity      92
	MassSol         2.4
	Teff            9487

	Orbit
	{
		RefPlane        "Equator"
		Period          36
		Eccentricity    0.4
		Inclination     103
		AscendingNode   296
		//EpochB          1988.9
		ArgOfPericenter 128
		MeanAnomaly     0
	}
}

Star	"HIP 77516 B"
{
	ParentBody     "HIP 77516"
	Class	       ""
    MassSol        2.3
	Orbit
	{
		RefPlane        "Equator"
		Period          36
		Eccentricity    0.4
		Inclination     103
		AscendingNode   296
		//EpochB          1988.9
		ArgOfPericenter 308
		MeanAnomaly     0
	}
}

// 招摇(*)
Barycenter	"HIP 71075 A"
{
	ParentBody     "HIP 71075"
	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   178.868
		Period          2235.95
		Eccentricity    0.812114
		Inclination     -77.0705
		AscendingNode   174.915
		ArgOfPericenter -59.9582
		MeanAnomaly     -44.2313
	}
}

Star	"HIP 71075 Aa"
{
	ParentBody     "HIP 71075 A"
	Class	       "A7 III"
	Luminosity     34
	Teff           7800
	FeH           -0.2

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.125255
		Period          0.0709857
		Eccentricity    0
		Inclination     -143.496
		AscendingNode   104.352
		ArgOfPericenter 113.671
		MeanAnomaly     -111.969
	}
}

Star	"HIP 71075 Ab"
{
	ParentBody     "HIP 71075 A"
	Class	       "A6.7 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.238001
		Period          0.0709857
		Eccentricity    0
		Inclination     -143.496
		AscendingNode   104.352
		ArgOfPericenter 293.671
		MeanAnomaly     -111.969
	}
}

Star	"UCAC2 45176266/HIP 71075 B"
{
	ParentBody     "HIP 71075"
	Class	       "F2.3 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   187.287
		Period          2235.95
		Eccentricity    0.812114
		Inclination     -77.0705
		AscendingNode   174.915
		ArgOfPericenter 120.042
		MeanAnomaly     -44.2313
	}
}

// 梗河一 (补全)
Remove "Izar A"{ParentBody "Izar"}
Remove "Izar B"{ParentBody "Izar"}
Star "HIP 72105 A/HD 129989 A/HR 5506 A/SAO 83500 A"
{
	ParentBody "HIP 72105"
	Class      "K0 III"
	MassSol    4.6
	RadSol     33
	Luminosity 501
	Teff       4550
	FeH       -0.13
	Age        0.0374

	Orbit
	{
		Period          1000
		//SemiMajorAxis   185
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 72105 B/HD 129988 B/HR 5505 B"
{
	ParentBody "HIP 72105"
	Class      "A2 V"

	Orbit
	{
		Period          1000
		//SemiMajorAxis   185
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 帝席一
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

	Orbit
	{

	}
}*/

// 亢池三(*)
Star	"HIP 69536 A"
{
	ParentBody     "HIP 69536"
	Class	       "F8 V"
	MassSol        1.46
	RadSol         2.12
	Luminosity     5.879
	Teff           6169
	FeH            0.07
	RotationDays   26
	Age            2.6

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0122478
		Period          0.0050107
		Eccentricity    0
		Inclination     -150.732
		AscendingNode   68.335
		ArgOfPericenter 80.5516
		MeanAnomaly     91.7531
	}
}

Star	"HIP 69536 B(?)"
{
	ParentBody     "HIP 69536"
	Class	       "K1.9 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0203214
		Period          0.0050107
		Eccentricity    0
		Inclination     -150.732
		AscendingNode   68.335
		ArgOfPericenter 260.552
		MeanAnomaly     91.7531
	}
}

// 骑官一(*)
Remove "GAM Lup A"{ParentBody "GAM Lup"}
Remove "GAM Lup B"{ParentBody "GAM Lup"}
Barycenter	"HIP 76297 A"
{
	ParentBody     "HIP 76297"
	Orbit
	{
		RefPlane        "Equator"
		Period          190
		Eccentricity    0.51
		Inclination     95
		AscendingNode   94.6
		//EpochB          1885
		ArgOfPericenter 131.5
		MeanAnomaly     0
	}
}

Star	"HIP 76297 Aa"
{
	ParentBody     "HIP 76297 A"
	Class	       "B2IV"
	MassSol        9.5
	RadSol         5
	Luminosity     5000
	Teff           20900
	Age            0.0186

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.8081
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 76297 Ab"
{
	ParentBody     "HIP 76297 A"
	Class	       "A6.3 V"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      2.8081
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 76297 B"
{
	ParentBody     "HIP 76297"
	Class	       "B4"//(?)

	Orbit
	{
		RefPlane        "Equator"
		Period          190
		Eccentricity    0.51
		Inclination     95
		AscendingNode   94.6
		//EpochB          1885
		ArgOfPericenter 311.5
		MeanAnomaly     0
	}
}

// 骑官五
Remove "LAM Lup A"{ParentBody "LAM Lup"}
Remove "LAM Lup B"{ParentBody "LAM Lup"}
Star "HIP 74117 1"
{
    ParentBody "HIP 74117"
    Class      "B3 V"
    MassSol    8.14
	Age        0.028
    Orbit
    {
        Period          70.8
        Eccentricity    0.6283
        Inclination     71.59
        AscendingNode   26.64
        //EpochB          1997.907
        ArgOfPericenter 119.9
        MeanAnomaly     0
    }
}

Star "HIP 74117 2"
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
        //EpochB          1997.907
        ArgOfPericenter 299.9
        MeanAnomaly     0
    }
}

// 骑官六
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
        //SemiMajorAxis   27.9401
        Eccentricity    0.635
        Inclination     119.8		//unknown, just aligned
        AscendingNode   117.6		//unknown, just aligned
        ArgOfPericenter 21.3
        Epoch           2456760.19
        MeanAnomaly     0
    }
}

Star "HIP 75264 A1"
{
    ParentBody "HIP 75264 A"
    Class      "B3 IV"
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
    Class      "B3 V"
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
    Class      "A5 V"
    MassSol    7.64

    Orbit
    {
        Period          64
        //SemiMajorAxis   27.9401
        Eccentricity    0.635
        Inclination     119.8		//unknown, just aligned
        AscendingNode   117.6		//unknown, just aligned
        ArgOfPericenter 201.3
        Epoch           2456760.19
        MeanAnomaly     0
    }
}

// 骑官八(*)
// 此系统中至少有三颗恒星
Remove "PI Lup A"{ParentBody "PI Lup"}
Remove "PI Lup B"{ParentBody "PI Lup"}
Barycenter	"HIP 73807 A"
{
	ParentBody     "HIP 73807"
	Orbit
	{
		RefPlane        "Equator"
		Period          517
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 73807 Aa"
{
	ParentBody     "HIP 73807 A"
	Class	       "B5 V"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0201954
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
	Class	       "A6.9 V"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0385844
		Period          0.00658977
		Eccentricity    0
		Inclination     -87.5492
		AscendingNode   -131.86
		ArgOfPericenter 158.206
		MeanAnomaly     -163.227
	}
}

Barycenter	"HIP 73807 B"
{
	ParentBody     "HIP 73807"
	Orbit
	{
		RefPlane        "Equator"
		Period          517
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 73807 Ba"
{
	ParentBody     "HIP 73807 B"
	Class	       "B5 IV"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0272487
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
	Class	       "A6.5 V"

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0326944
		Period          0.00820279
		Eccentricity    0
		Inclination     -33.1559
		AscendingNode   117.205
		ArgOfPericenter 74.079
		MeanAnomaly     104.172
	}
}

// 骑官九(*)
Star	"HIP 72683 A"
{
	ParentBody     "HIP 72683"
	Class	       "B5 IV"
	MassSol        5.7
	RadSol         3.5
	Luminosity     1260
	Teff           18000

	Orbit
	{
		RefPlane        "Equator"
		Period          27
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 72683 B"
{
	ParentBody     "HIP 72683"
	Class	       "B9.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          27
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天辐二
Remove "TAU Lib A"{ParentBody "TAU Lib"}
Remove "TAU Lib B"{ParentBody "TAU Lib"}
Star "HIP 76600 A"
{
	ParentBody "HIP 76600"
	Class      "B2.5 V"
	MassSol    7.25
	RadSol     3.2
	LumBol     2705
	Teff       17900
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
	Class      ""
	MassSol    4.6
	Orbit
	{
		PeriodDays      3.2907
		Eccentricity    0.28
		AscendingNode   114
		Epoch           2439272.312
		ArgOfPericenter 0
		MeanAnomaly     180
		//SemiAmplitude   75
	}
}
