// 房宿一
Remove "PI Sco (AB)"{ParentBody "PI Sco"}
Remove "PI Sco A"{ParentBody "PI Sco (AB)"}
Remove "PI Sco B"{ParentBody "PI Sco (AB)"}
Remove "PI Sco C"{ParentBody "PI Sco"}
Barycenter "HIP 78265 AB"
{
	ParentBody "HIP 78265"
	Orbit
	{
		Period          188267
		//SemiMajorAxis   7000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "Fang/HIP 78265 A"
{
	ParentBody "HIP 78265 AB"
	Class      "B1 V"
	MassSol    12.5
	RadSol     5
	Luminosity 21900
	Teff       25230
	RotationDays 100
	Age        0.00154

	Orbit
	{
		PeriodDays      1.570103
		//SemiMajorAxis   0.07
		Eccentricity    0
		Inclination     42
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   124
	}
}

Star "HIP 78265 B"
{
	ParentBody "HIP 78265 AB"
	Class      "B2 V"
	RadSol     4

	Orbit
	{
		PeriodDays      1.570103
		//SemiMajorAxis   0.07
		Eccentricity    0
		Inclination     42
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   124
	}
}

Star "HIP 78265 C"
{
	ParentBody "HIP 78265"
	Class      "B"//?

	Orbit
	{
		Period          188267
		//SemiMajorAxis   7000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 房宿二(*)
Barycenter "HIP 78104 A"
{
	ParentBody "HIP 78104"
	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   206.09
		Period          4852.32
		Eccentricity    0.531078
		Inclination     -17.136
		AscendingNode   129.82
		ArgOfPericenter 173.4
		MeanAnomaly     -98.5593
	}
}

Star "Iklil/HIP 78104 Aa"
{
	ParentBody "HIP 78104 A"
	Class	   "B2IV"
	MassSol    7.94
	RadSol     5
	LumBol     3432
	Teff       21150

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.0033
		Eccentricity    0.27
		Epoch           2442178.6060
		ArgOfPericenter 51
		MeanAnomaly     0
		//SemiAmplitude   16.4
	}
}

Star	"HIP 78104 Ab"
{
	ParentBody     "HIP 78104 A"
	Class	       "A8.8 V"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      4.0033
		Eccentricity    0.27
		Epoch           2442178.6060
		ArgOfPericenter 231
		MeanAnomaly     0
	}
}

Star	"HIP 78104 B"
{
	ParentBody     "HIP 78104"
	Class	       "B8.1 V"

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   374.564
		Period          4852.32
		Eccentricity    0.531078
		Inclination     -17.136
		AscendingNode   129.82
		ArgOfPericenter 353.4
		MeanAnomaly     -98.5593
	}
}

// 房宿三
Remove "DEL Sco (AB)"{ParentBody "Dschubba"}
Remove "Dschubba A"{ParentBody "DEL Sco (AB)"}
Remove "Dschubba B"{ParentBody "DEL Sco (AB)"}
Remove "DEL Sco C"{ParentBody "Dschubba"}
Star "HIP 78401 A"
{
	ParentBody "HIP 78401"
	Class      "B0.3 IV"
	MassSol    13
	RadSol     6.7
	Luminosity 38000
	Teff       27400

	Orbit
	{
		Period          10.8092
		//SemiMajorAxis   13.5
		Eccentricity    0.936
		Inclination     36
		AscendingNode   174
		//Epoch           2011 6 3
		ArgOfPericenter 177.7
		MeanAnomaly     0
		//SemiAmplitude   23.9
	}
}

Star "HIP 78401 B"
{
	ParentBody "HIP 78401"
	Class      "B1 V" // B3V
	MassSol    8.2
	Teff       24000
	Age        0.009

	Orbit
	{
		Period          10.8092
		//SemiMajorAxis   13.5
		Eccentricity    0.936
		Inclination     36
		AscendingNode   174
		//Epoch           2011 6 3
		ArgOfPericenter -2.3
		MeanAnomaly     0
		//SemiAmplitude   23.9
	}
}

// 房宿四(基本只是改了个名)
Remove "BET1 Sco"{ParentBody "BET Sco"}
Remove "BET Sco A"{ParentBody "BET1 Sco"}
Remove "BET Sco Aa"{ParentBody "BET Sco A"}
Remove "BET Sco Ab"{ParentBody "BET Sco A"}
Remove "BET Sco B"{ParentBody "BET1 Sco"}
Remove "BET2 Sco"{ParentBody "BET Sco"}
Remove "BET Sco C"{ParentBody "BET2 Sco"}
Remove "BET Sco E"{ParentBody "BET2 Sco"}
Remove "BET Sco Ea"{ParentBody "BET Sco E"}
Remove "BET Sco Eb"{ParentBody "BET Sco E"}
Barycenter "房宿四/BET 1 Sco/HIP 78820 A/BD–19 4307 A/HD 144217 A/HR 5984 A"
{
	ParentBody "BET Sco"
	Orbit
	{
		Period          10852.8017
		//SemiMajorAxis   517  // 1654 * mass ratio
		//Eccentricity    0.2  // guess
		//Inclination     84   // guess; coplanar with A-B pair
		//AscendingNode   89   // guess; coplanar with A-B pair
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "BET 2 Sco/BD–19 4308 B/HD 144218 B/HIP 78821 B/HR 5985 B"
{
	ParentBody "BET Sco"
	Orbit
	{
		Period          10852.8017
		//SemiMajorAxis   1137 // 1654 * mass ratio
		//Eccentricity    0.2  // guess
		//Inclination     84   // guess; coplanar with A-B pair
		//AscendingNode   89   // guess; coplanar with A-B pair
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "BET1 Sco B"
{
	ParentBody "BET 1 Sco"
	Class      ""
	MassSol    8
	Orbit
	{
		Epoch           2626860.788813
		Period          610
		//SemiMajorAxis   365 // 480 * mass ratio
		//Eccentricity    0.3 // guess
		Inclination     87.1
		AscendingNode   89.5
		ArgOfPericenter 282.9
		MeanAnomaly     0
	}
}

Barycenter "BET1 Sco A"
{
	ParentBody "BET 1 Sco"
	Orbit
	{
		Epoch           2626860.788813
		Period          610
		//SemiMajorAxis   115 // 480 * mass ratio
		//Eccentricity    0.3 // guess
		Inclination     87.1
		AscendingNode   89.5
		ArgOfPericenter 102.9
		MeanAnomaly     0
	}
}

Star "BET1 Sco Aa/BET1 Sco D"
{
	ParentBody "BET1 Sco A"
	Class      "B0.5 IV"
	MassSol    15
	RadiusSol  6.3
	Luminosity 31600
	Teff       28000
	Orbit
	{
		Epoch           2449788.509
		PeriodDays      6.82
		//SemiMajorAxis   0.123
		Eccentricity    0.291
		Inclination     111.8
		AscendingNode   294.2
		ArgOfPericenter 54.8
		MeanAnomaly     0
	}
}

Star "BET1 Sco Ab"
{
	ParentBody "BET1 Sco A"
	Class      "B1.5 V"
	MassSol    10.4
	RadiusSol  4
	Luminosity 7900
	Teff       26400
	Orbit
	{
		Epoch           2449788.509
		PeriodDays      6.82
		//SemiMajorAxis   0.177
		Eccentricity    0.291
		Inclination     111.8
		AscendingNode   294.2
		ArgOfPericenter 234.8
		MeanAnomaly     0
	}
}

Star "BET2 Sco C"
{
	ParentBody "BET 2 Sco"
	Class      "B2 V"
	MassSol    8.2
	RadiusSol  2.9
	Luminosity 3200
	Teff       24000
	Orbit
	{
		Period          39
		//SemiMajorAxis   5.0653
		Eccentricity    0.025
		Inclination     41.8
		AscendingNode   5.4
		ArgOfPericenter 155.8
		Epoch           2449338.470517
		MeanAnomaly     0
	}
}

Barycenter "BET2 Sco E"
{
	ParentBody "BET 2 Sco"
	MassSol    7
	Orbit
	{
		Period          39
		//SemiMajorAxis   10.1306
		Eccentricity    0.025
		Inclination     41.8
		AscendingNode   5.4
		ArgOfPericenter 335.8
		Epoch           2449338.470517
		MeanAnomaly     0
	}
}

Star "BET2 Sco Ea"
{
	ParentBody "BET2 Sco E"
	Class      "B2 V"
	MassSol    3.5
	RadiusSol  2.4
	Luminosity 126
	Teff       13000
	Age        0.063
	Orbit
	{
		Period          0.029315068
		Inclination     41.8
		AscendingNode   5.4
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "BET2 Sco Eb"
{
	ParentBody "BET2 Sco E"
	Class      "" // unknown/treat the same as Ea
	MassSol    3.5    // unknown/treat the same as Ea
	//RadiusSol  2.4    // unknown/treat the same as Ea
	//Luminosity 63     // half of 126
	//Teff       13000
	Orbit
	{
		Period          0.029315068
		Inclination     41.8
		AscendingNode   5.4
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 键闭(重制版)
/*
Nu Scorpii AB and Nu Scorpii CD, orbiting each other with a period of 105,000 years. AB contains four stars:

Nu Scorpii Aa, Ab and Ac: Aa and Ab are a binary system (period: 5.5 days) orbited by Ac (period: 8.3 years).
Nu Scorpii B: This star orbits Nu Scorpii A - the three stars above - with a period of 675 years.
Nu Scorpii CD contains three stars:

Nu Scorpii C: C is a single star.
Nu Scorpii Da and Db: Da and Db are a binary system (period: unknown), which together orbit C over 3,100 years.
*/
//Remove "NU Sco (AB)"{ParentBody "NU Sco"}
Remove "NU Sco B"{ParentBody "NU Sco (AB)"}
Remove "NU Sco (Aabc)"{ParentBody "NU Sco (AB)"}
Remove "NU Sco Ac"{ParentBody "NU Sco (Aabc)"}
Remove "NU Sco A"{ParentBody "NU Sco (Aabc)"}
Remove "NU Sco Aa"{ParentBody "NU Sco A"}
Remove "NU Sco Ab"{ParentBody "NU Sco A"}
//Remove "NU Sco (CD)"{ParentBody "NU Sco"}
Remove "NU Sco C"{ParentBody "NU Sco (CD)"}
Remove "NU Sco D"{ParentBody "NU Sco (CD)"}
Remove "NU Sco Da"{ParentBody "NU Sco D"}
Remove "NU Sco Db"{ParentBody "NU Sco D"}
/* "HIP 79374 AB"
{
	ParentBody "HIP 79374"
	Orbit
	{
		Epoch           2386166.5
		Period          97945 // 105000
		//SemiMajorAxis   41.1 Arcsec
		ArgOfPericenter 157
		MeanAnomaly     0
	}
}

Barycenter "HIP 79374 CD"
{
	ParentBody "HIP 79374"
	Orbit
	{
		Epoch           2386166.5
		Period          97945 // 105000
		//SemiMajorAxis   41.1 Arcsec
		ArgOfPericenter 337
		MeanAnomaly     0
	}
}*/
//-----------------------------------
Barycenter "HIP 79374 Aabc"
{
	ParentBody "NU Sco (AB)"
	Orbit
	{
		Period          630.486 // 675
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 79374 B"
{
	ParentBody "NU Sco (AB)"
	Class      ""
	//AppMagn    6.6 // 5.40
	MassSol    3.91 // 3.57
	Luminosity 1300
	Teff       22000

	Orbit
	{
		Period          630.486 // 675
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
// -----------------------------------
Barycenter "HIP 79374 Aab"
{
	ParentBody "HIP 79374 Aabc"
	Orbit
	{
		Period          5.7 // 7.743 // 8.3
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 79374 Ac"
{
	ParentBody "HIP 79374 Aabc"
	Class      ""
	AppMagn    6.62
	MassSol    2.5 // 2.4

	Orbit
	{
		Period          5.7 // 7.743 // 8.3
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
//--------------------------------------
Star "HIP 79374 Aa"
{
	ParentBody "HIP 79374 Aab"
	Class      "B3V"
	//AppMagn    4.37
	MassSol    6.27 // 5.86
	Luminosity 2900
	Teff       22000

	Orbit
	{
		Epoch           2442185.555
		PeriodDays      5.55206 // 5.5
		Eccentricity    0.11
		Inclination     90
		ArgOfPericenter 87
		MeanAnomaly     0
		//SemiAmplitude   26.5
	}
}

Star "HIP 79374 Ab"
{
	ParentBody "HIP 79374 Aab"
	Class      ""
	AppMagn    6.90
	MassSol    2.31 // 2.22

	Orbit
	{
		Epoch           2442185.555
		PeriodDays      5.55206 // 5.5
		Eccentricity    0.11
		Inclination     90
		ArgOfPericenter 267
		MeanAnomaly     0
	}
}
//-------------------------------------
Star "HIP 79374 C"
{
	ParentBody "NU Sco (CD)"
	Class      "B9III"
	//AppMagn    6.90
	MassSol    2.31 // 2.22
	Luminosity 80
	Teff       12000

	Orbit
	{
		Epoch           2442048.5
		Period          2892 // 3100
		ArgOfPericenter 337
		MeanAnomaly     0
	}
}

Barycenter "HIP 79374 D"
{
	ParentBody "NU Sco (CD)"
	Orbit
	{
		Epoch           2442048.5
		Period          2892 // 3100
		ArgOfPericenter 157
		MeanAnomaly     0
	}
}
// -----------------------------------
Star "HIP 79374 Da"
{
	ParentBody "HIP 79374 D"
	Class      "B9III"
	//AppMagn    7.39
	MassSol    1.99 // 1.92
	Luminosity 40
	Teff       10600

	Orbit
	{
		Epoch           2442048.5
		Period          10 //?
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 79374 Db"
{
	ParentBody "HIP 79374 D"
	Class      ""
	MassSol    1.7//(?)

	Orbit
	{
		Epoch           2442048.5
		Period          10 //?
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 罚三
Star "HIP 78400 A"
{
	ParentBody "HIP 78400"
	Class      "F8V"
	MassSol    1.4
	RadSol     1.86
	Luminosity 4.74
	Teff       6237
	FeH        -0.02
	Age        12

	Orbit
	{
		PeriodDays      1142.4
		//SemiMajorAxisKm 5.953E+7
		Eccentricity    0.11
		Inclination     143
		AscendingNode   163.5
		Epoch           2457025
		ArgOfPericenter 249.4
		MeanAnomaly     0
		//SemiAmplitude   3.847
	}
}

Star "HIP 78400 B"
{
	ParentBody "HIP 78400"
	Class      ""
	RadSol     0.45

	Orbit
	{
		PeriodDays      1142.4
		//SemiMajorAxisKm 5.953E+7
		Eccentricity    0.11
		Inclination     143
		AscendingNode   163.5
		Epoch           2457025
		ArgOfPericenter 69.4
		MeanAnomaly     0
		//SemiAmplitude   3.847
	}
}

// 东咸二
Remove "CHI Oph A"{ParentBody "CHI Oph"}
Remove "CHI Oph B"{ParentBody "CHI Oph"}
Star "HIP 80569 A"
{
	ParentBody "HIP 80569"
	Class      "B2Vne"
	MassSol    10.1
	RadSol     12.61
	Luminosity 245
	Teff       6432
	Age        0.0225

	Orbit
	{
		PeriodDays      138.8
		Eccentricity    0.44
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 80569 B"
{
	ParentBody "HIP 80569"
	Class      ""
	MassSol    0.19
	Orbit
	{
		PeriodDays      138.8
		Eccentricity    0.44
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 西咸一
Remove "KSI Sco (ABC)"{ParentBody "KSI Sco"}
Remove "KSI Sco (DE)"{ParentBody "KSI Sco"}
Remove "KSI Sco (AB)"{ParentBody "KSI Sco (ABC)"}
Remove "KSI Sco A"{ParentBody "KSI Sco (AB)"}
Remove "KSI Sco B"{ParentBody "KSI Sco (AB)"}
Remove "KSI Sco C"{ParentBody "KSI Sco (ABC)"}
Remove "KSI Sco D"{ParentBody "KSI Sco (DE)"}
Remove "KSI Sco E"{ParentBody "KSI Sco (DE)"}
Barycenter "西咸一/KSI Sco ABC/BD−10° 4237 ABC/GJ 9540 ABC/HIP 78727 ABC/ADS 9909 ABC"
{
    ParentBody "KSI Sco"
	Orbit
	{
		Period          307341.75
		//SemiMajorAxis   2666.6667
		Eccentricity    0.5
		ArgOfPericenter 166
		MeanAnomaly     180
	}
}

Barycenter "KSI Sco DE"
{
    ParentBody "KSI Sco"
	Orbit
	{
		Period          307341.75
		//SemiMajorAxis   5333.3333
		Eccentricity    0.5
		ArgOfPericenter 346
		MeanAnomaly     180
	}
}

Barycenter "KSI Sco AB/SAO 159665 AB"
{
	ParentBody "KSI Sco ABC"
	Orbit
	{
		Period          1514.43
		Eccentricity    0.041
		Inclination     131.5
		AscendingNode   47.4
		//EpochB          2226.10
		ArgOfPericenter 239.3
		MeanAnomaly     0
	}
}

Star "KSI Sco A/HD 144070/HR 5978/ADS 9909 A"
{
	ParentBody "KSI Sco AB"
	Class      "F4V"
	AppMagn    5.16
	Orbit
	{
		Period          45.9
		Eccentricity    0.744
		Inclination     34.5
		AscendingNode   25.3
		ArgOfPericenter 343.8
		//EpochB          1997.22
		MeanAnomaly     0
	}
}

Star "KSI Sco B/HD 144069/HR 5977/ADS 9909 B"
{
	ParentBody "KSI Sco AB"
	Class      "F6V"
	AppMagn    4.87
	Orbit
	{
		Period          45.9
		//SemiMajorAxis   10.2362
		Eccentricity    0.744
		Inclination     34.5
		AscendingNode   25.3
		ArgOfPericenter 163.8
		//EpochB          1997.22
		MeanAnomaly     0
	}
}

Star "KSI Sco C/SAO 159666/ADS 9909 C"
{
	ParentBody "KSI Sco ABC"
	Class      "G1 V"
	AppMagn    7.3
	Orbit
	{
		Period          1514.43
		Eccentricity    0.041
		Inclination     131.5
		AscendingNode   47.4
		//EpochB          2226.10
		ArgOfPericenter 59.3
		MeanAnomaly     0
	}
}

Star "KSI Sco D/BD−11° 4057/GJ 9541 A/HD 144087/HIP 78738/SAO 159668/ADS 9910 A"
{
	ParentBody "KSI Sco DE"
	Class      "K1V"
	AppMagn    7.81
	Orbit
	{
		Period          4376.97
		//SemiMajorAxis   155.7078
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "KSI Sco E"
{
	ParentBody "KSI Sco DE"
	Class      "K1V"
	AppMagn    7.81
	Orbit
	{
		Period          4376.97
		//SemiMajorAxis   170.1922
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 日(*)
Star	"HIP 76880 A"
{
	ParentBody     "HIP 76880"
	Class	       "K5 III"
	RadSol         38
	Luminosity     296
	Teff           3930

	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.0777993
		Period          0.173957
		Eccentricity    0
		Inclination     -161.665
		AscendingNode   107.511
		ArgOfPericenter 22.6737
		MeanAnomaly     79.258
	}
}

Star	"HIP 76880 B"
{
	ParentBody     "HIP 76880"
	Class	       "M0.4 V"
	Orbit
	{
		RefPlane        "Equator"
		//SemiMajorAxis   0.458852
		Period          0.173957
		Eccentricity    0
		Inclination     -161.665
		AscendingNode   107.511
		ArgOfPericenter 202.674
		MeanAnomaly     79.258
	}
}

// 从官一
Barycenter "HIP 76945 AB"
{
    ParentBody "HIP 76945"
	Orbit
	{
	    Period  65000 //Unknown
		ArgOfPericenter 0
		MeanAnomaly 0
	}
}

Star	"HIP 76945 A"
{
	ParentBody     "HIP 76945 AB"
	Class	       "B5V"
	Teff           15135

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      12.26
		Eccentricity    0.19
		Epoch           2438252.97
		AscendingNode   107.511
		ArgOfPericenter 262.8
		MeanAnomaly     0
		//SemiAmplitude   63.3
	}
}

Star	"HIP 76945 B"
{
	ParentBody     "HIP 76945 AB"
	Class	       "B5V"

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      12.26
		Eccentricity    0.19
		Epoch           2438252.97
		AscendingNode   107.511
		ArgOfPericenter 82.8
		MeanAnomaly     0
		//SemiAmplitude   63.3
	}
}

Star	"HIP 76945 C"
{
	ParentBody     "HIP 76945"
	Class	       "B5V"

	Orbit
	{
	    Period  65000 //Unknown
		ArgOfPericenter 180
		MeanAnomaly 0
	}
}

// 从官二
Remove "CHI Lup A"{ParentBody "CHI Lup"}
Remove "CHI Lup B"{ParentBody "CHI Lup"}
Star "HIP 77634 1" //不冲突
{
    ParentBody "HIP 77634"
    Class      "B9.5V"
    MassSol    2.84
	RadSol     2.85
	Luminosity 63
	Teff       10200
	Age        0.28

    Orbit
    {
        Period          0.042209
        //SemiMajorAxis   0.088846
        ArgOfPericenter 0
        MeanAnomaly     0
    }
}

Star "HIP 77634 2"
{
    ParentBody "HIP 77634"
    Class      "A2Vm"
    MassSol    1.94
	RadSol     1.75
	Teff       9200

    Orbit
    {
        Period          0.042209
        //SemiMajorAxis   0.121154
        ArgOfPericenter 180
        MeanAnomaly     0
    }
}
