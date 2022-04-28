// 斗宿三 (六星系统)
Remove "Polis A"{ParentBody "Polis"}
Remove "Polis Ab"{ParentBody "Polis"}
Star "天机/HIP 89341 Aa"
{
	ParentBody "HIP 89341"
	Class      "B8Iap"
	MassSol    14.1 // 30
  RadSol     67.9
  Luminosity 200000
  Teff       12000

	Orbit
	{
		Period          0.49315068
		//SemiMajorAxis   0.65530462
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "善/HIP 89341 Ab"
{
	ParentBody "HIP 89341"
	Class      "B1.5V"
  MassSol    9.8 // 15
  RadSol     12.2
  Teff       23000
  Age        0.01

	Orbit
	{
		Period          0.49315068
		//SemiMajorAxis   1.37018238
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 89341 B"
{
	ParentBody "HIP 89341"
	Class      ""
  Luminosity 603
  Teff       18200

	Orbit
	{
		SemiMajorAxis   42200
		//ArgOfPericenter 0
		//MeanAnomaly     0
	}
}

/*Star "HIP 89341 C" // 光学伴星
{
	ParentBody "HIP 89341"
	Class      ""

	Orbit
	{
		SemiMajorAxis   64500
		//ArgOfPericenter 0
		//MeanAnomaly     0
	}
}*/

Star "HIP 89341 D/HD 314059/BD−21°4907"
{
	ParentBody "HIP 89341"
	Class      "B2IV"
  Luminosity 1660
  Teff       20400

	Orbit
	{
		SemiMajorAxis   121200
		//ArgOfPericenter 0
		//MeanAnomaly     0
	}
}

Star "HIP 89341 E/HD 314057/BD−21°4909/2MASS J18134906-2103528"
{
	ParentBody "HIP 89341"
	Class      "B2.5V"
  Luminosity 2450
  Teff       20900

	Orbit
	{
		SemiMajorAxis   125000
		//ArgOfPericenter 0
		//MeanAnomaly     0
	}
}

// 斗宿四(假双星)
Remove "Nunki A"{ParentBody "Nunki"}
Remove "Nunki B"{ParentBody "Nunki"}

// 斗宿六
Remove "Ascella A"{ParentBody "Ascella"}
Remove "Ascella B"{ParentBody "Ascella"}
Star "七杀/HIP 93506 A"
{
	ParentBody "HIP 93506"
	Class      "A2.5Va"
	MassSol    5.26
  Teff       8799
  Age        0.5

	Orbit
	{
		Period          21
		//SemiMajorAxis   13.4
		Eccentricity    0.211
		Inclination     111.1
		AscendingNode   74
  	//EpochB          2005.99
		ArgOfPericenter 187.2
		MeanAnomaly     0
	}
}

Star "将(D)/HIP 93506 B"
{
	ParentBody "HIP 93506"
	Class      "A4 IV"
  Orbit
	{
		Period          21
		//SemiMajorAxis   13.4
		Eccentricity    0.211
		Inclination     111.1
		AscendingNode   74
  	//EpochB          2005.99
		ArgOfPericenter 7.2
		MeanAnomaly     0
	}
}

Star "HIP 93506 C"
{
	ParentBody "HIP 93506"
	Class      ""
  AppMagn    10
  MassSol    2.5 // Unknown
  Orbit
	{
		SemiMajorAxis   1200 // ?
		//ArgOfPericenter 7.2
		//MeanAnomaly     0
	}
}

// 建三
Star "HIP 94141 B" // Nothing is known about the orbits of these stars.
{
	ParentBody "HIP 94141"
	Class      ""
	MassSol    1.2
  Orbit
	{
		SemiMajorAxis   13
	}
}

Star "HIP 94141 C"
{
	ParentBody "HIP 94141"
	Class      ""
	MassSol    1.1
  Orbit
	{
		SemiMajorAxis   40
	}
}

// 建六
Remove "UPS Sgr A"{ParentBody "UPS Sgr"}
Remove "UPS Sgr B"{ParentBody "UPS Sgr"}
Star "HIP 95176 A"
{
	ParentBody "HIP 95176"
	Class      "A2Ia"
	MassSol    2.5
	RadSol     50
	Luminosity 39000
	Teff       12300
	FeH        -0.2
	Age        52

	Orbit
	{
		PeriodDays      137.9
		//SemiMajorAxis   270.8*RadSol
		Eccentricity    0
		Inclination     50
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   49.6
	}
}

Star "HIP 95176 B"
{
	ParentBody "HIP 95176"
	Class      "B2Vpe"
	MassSol    4
	Orbit
	{
		PeriodDays      137.9
		//SemiMajorAxis   270.8*RadSol
		Eccentricity    0
		Inclination     50
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   29.7
	}
}

// 天弁三 (所有伴星均为光学伴星)

// 天弁四
Remove "BET Sct A"{ParentBody "BET Sct"}
Remove "BET Sct B"{ParentBody "BET Sct"}
Star "HIP 92175 A"
{
	ParentBody "HIP 92175"
	Class      "G4 II"
	Luminosity 1270
	Teff       4622
	FeH        -0.16

	Orbit
	{
		PeriodDays      834
		Eccentricity    0.35
		Inclination     105.9
		AscendingNode   288.1
		Epoch           2422480.9
		ArgOfPericenter 213.9
		MeanAnomaly     0
	}
}

Star "HIP 92175 B"
{
	ParentBody "HIP 92175"
	Class      "B9"

	Orbit
	{
		PeriodDays      834
		Eccentricity    0.35
		Inclination     105.9
		AscendingNode   288.1
		Epoch           2422480.9
		ArgOfPericenter 33.9
		MeanAnomaly     0
	}
}

// 天弁九(*)
Star	"HIP 93526 A"
{
	ParentBody     "HIP 93526"
	Class	       "A1 V"
	MassSol        3.25
	RadSol         3
	Luminosity     213.9
	Teff           9908

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0196305
		Period          0.00777806
		Eccentricity    0
		Inclination     -87.9989
		AscendingNode   124.355
		ArgOfPericenter -86.7705
		MeanAnomaly     -44.0215
	}
}

Star	"HIP 93526 B(?)"
{
	ParentBody     "HIP 93526"
	Class	       "F5.6 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0367191
		Period          0.00777806
		Eccentricity    0
		Inclination     -87.9989
		AscendingNode   124.355
		ArgOfPericenter 93.2295
		MeanAnomaly     -44.0215
	}
}

// 鳖二(*)
Star	"HIP 92308 A"
{
	ParentBody     "HIP 92308"
	Class	       "A3 V"
	RadSol         2.2
	Luminosity     57.72
	Teff           8371

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0468276
		Period          0.0399882
		Eccentricity    0.147932
		Inclination     -101.039
		AscendingNode   89.9453
		ArgOfPericenter 42.2276
		MeanAnomaly     164.017
	}
}

Star	"HIP 92308 B"
{
	ParentBody     "HIP 92308"
	Class	       "G5.6 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.113525
		Period          0.0399882
		Eccentricity    0.147932
		Inclination     -101.039
		AscendingNode   89.9453
		ArgOfPericenter 222.228
		MeanAnomaly     164.017
	}
}

// 鳖七(增加数据)
Remove "GAM CrA A"{ParentBody "GAM CrA"}
Remove "GAM CrA B"{ParentBody "GAM CrA"}
Star "HIP 93825 1/HR 7226 A/HD 177474 A"
{
    ParentBody "HIP 93825"
    Class      "F8 V"
    MassSol    1.15
		RadSol     1.47
		Teff       6090
		FeH        -0.07
		Age        5

    Orbit
    {
        Period          121.76
        //SemiMajorAxis   16.401
        Eccentricity    0.32
        Inclination     149.6
        AscendingNode   50.3
				Epoch           2451778.29
        ArgOfPericenter 349
        MeanAnomaly     0
    }
}

Star "HIP 93825 2/HR 7227 B/HD 177475 B"
{
    ParentBody "HIP 93825"
    Class      "F8 V"
    MassSol    1.14
		RadSol     1.42
		Teff       6100
		Age        5

    Orbit
    {
        Period          121.76
        //SemiMajorAxis   16.401
        Eccentricity    0.32
        Inclination     149.6
        AscendingNode   50.3
        ArgOfPericenter 169
        Epoch           2451778.29
        MeanAnomaly     0
    }
}

// 鳖八
Remove "EPS CrA A"{ParentBody "EPS CrA"}
Remove "EPS CrA B"{ParentBody "EPS CrA"}
Star "HIP 93174 1" // 不冲突
{
    ParentBody "EPS CrA"
    Class      "F2 V"
    MassSol    1.9
		RadSol     2.167
		Teff       6481

    Orbit
    {
        PeriodDays      0.59143357
        //SemiMajorAxis   3.795*RadSol
				Eccentricity    0
				Inclination     73.05
				AscendingNode   2.0113
				Epoch           2442296.95907
        ArgOfPericenter 0
        MeanAnomaly     0
    }
}

Star "HIP 93174 2"
{
    ParentBody "EPS CrA"
    Class      "F2 V"
    MassSol    0.24
		RadSol     0.869
		Teff       5939

		Orbit
    {
        PeriodDays      0.59143357
        //SemiMajorAxis   3.795*RadSol
				Eccentricity    0
				Inclination     73.05
				AscendingNode   2.0113
				Epoch           2442296.95907
        ArgOfPericenter 180
        MeanAnomaly     0
    }
}

// 狗国一
Star "HIP 98066 A"
{
    ParentBody "HIP 98066"
    Class      "G5IV"
    MassSol    1.52
		RadSol     2.87
		Luminosity 7.1
		Teff       5499
		FeH        0.06
		Age        3

    Orbit
    {
        PeriodDays      1712.74
        //SemiMajorAxis   1.1044
				Eccentricity    0.82
				Epoch           2457549.31
        ArgOfPericenter 321.17
        MeanAnomaly     0
				//SemiAmplitude   12.255
    }
}

Star "HIP 98066 B"
{
    ParentBody "HIP 98066"
    Class      ""
		MassSol    1.5 // ?

		Orbit
    {
        PeriodDays      1712.74
        //SemiMajorAxis   1.1044
				Eccentricity    0.82
				Epoch           2457549.31
        ArgOfPericenter 141.17
        MeanAnomaly     0
				//SemiAmplitude   12.255
    }
}

// 狗国二
Star "HIP 98353 B(?)"
{
    ParentBody "HIP 98353"
    Class      "WD"

		Orbit
		{
			RefPlane        "Equator"
			Period          0.0542853
			Eccentricity    0
			Inclination     -179.515
			AscendingNode   -114.828
			ArgOfPericenter 171.389
			MeanAnomaly     35.7751
		}
}

// 天渊一(*)
Star	"HIP 95294 A"
{
	ParentBody     "HIP 95294"
	Class	       "F2 III"
	MassSol        1.43
	Luminosity     20
	Teff           7035
	FeH            -0.54
	Age            0.933

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0295349
		Period          0.0138795
		Eccentricity    0
		Inclination     154.012
		AscendingNode   22.8708
		ArgOfPericenter 68.8068
		MeanAnomaly     -85.8894
	}
}

Star	"HIP 95294 B"
{
	ParentBody     "HIP 95294"
	Class	       "F8.3 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0455461
		Period          0.0138795
		Eccentricity    0
		Inclination     154.012
		AscendingNode   22.8708
		ArgOfPericenter 248.807
		MeanAnomaly     -85.8894
	}
}

// 天渊二
Remove "Arkab Prior A"{ParentBody "Arkab Prior"}
Remove "Arkab Prior B"{ParentBody "Arkab Prior"}
Star "HIP 95241 A"
{
	ParentBody "HIP 95241"
	Class      "B9 V"
	MassSol    3.67
	RadSol     2.73
	Luminosity 324
	Teff       11960
	FeH        -0.35
	Age        0.224

	Orbit
	{
		Period          82000
		//SemiMajorAxis   3290
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 95241 B"
{
	ParentBody "HIP 95241"
	Class      "A5 V"
	RadSol     1.89

	Orbit
	{
		Period          82000
		//SemiMajorAxis   3290
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天渊三
Star	"HIP 95347 A"
{
	ParentBody     "HIP 95347"
	Class	       "B8 V"
	MassSol        2.95
	RadSol         2.49
	Luminosity     117
	Teff           12387
	FeH            -0.02
	Age            0.0337766

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0653753
		Period          0.029831
		Eccentricity    0.033539
		Inclination     -169.07
		AscendingNode   112.824
		ArgOfPericenter 28.2907
		MeanAnomaly     171.578
	}
}

Star	"HIP 95347 B"
{
	ParentBody     "HIP 95347"
	Class	       "Ae" // ProtoStar

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0888386
		Period          0.029831
		Eccentricity    0.033539
		Inclination     -169.07
		AscendingNode   112.824
		ArgOfPericenter 208.291
		MeanAnomaly     171.578
	}
}

// 狗一
Star	"HIP 96465 A"
{
	ParentBody     "HIP 96465"
	Class	       "B8 V"
	MassSol        3
	RadSol         2.1
	Luminosity     60.5
	Teff           10592
	FeH            0
	Age            0.0573

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      25 // Unknown
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 96465 B"
{
	ParentBody     "HIP 96465"
	Class	       "K2V"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      25
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 狗二
Star	"HIP 95477 A"
{
	ParentBody     "HIP 95477"
	Class	       "A3IV"
	MassSol        1.64
	Luminosity     42.9
	Teff           7859
	Age            0.393

	Orbit
	{
		Period          5.72
		Eccentricity    0.71
		Inclination     97.3
		AscendingNode   259
		//EpochB          1984.29
		ArgOfPericenter 190.7
		MeanAnomaly     0
	}
}

Star	"HIP 95477 B"
{
	ParentBody     "HIP 95477"
	Class	       "A5V"

	Orbit
	{
		Period          5.72
		Eccentricity    0.71
		Inclination     97.3
		AscendingNode   259
		//EpochB          1984.29
		ArgOfPericenter 10.7
		MeanAnomaly     0
	}
}
