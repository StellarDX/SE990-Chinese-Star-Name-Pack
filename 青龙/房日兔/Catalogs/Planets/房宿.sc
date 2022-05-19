// 房宿一(EB***)
Remove "PI Sco (AB)"{ParentBody "PI Sco"}
Remove "PI Sco A"{ParentBody "PI Sco (AB)"}
Remove "PI Sco B"{ParentBody "PI Sco (AB)"}
Remove "PI Sco C"{ParentBody "PI Sco"}
Barycenter "HIP 78265 A"
{
	ParentBody "HIP 78265"
	BinaryOrbit
	{
		Separation      7000
	}
}

Star "Fang/HIP 78265 Aa"
{
	ParentBody "HIP 78265 A"
	Class      "B1V"
	MassSol    12.5
	RadSol     5
	Luminosity 21900
	Teff       25230
	RotationPeriod 2400
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

Star "HIP 78265 Ab"
{
	ParentBody "HIP 78265 A"
	Class      "B2V"
	RadSol     4

	Orbit
	{
		PeriodDays      1.570103
		//SemiMajorAxis   0.07
		Eccentricity    0
		Inclination     42
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   196.1
	}
}

Star "HIP 78265 B"
{
	ParentBody "HIP 78265"
	Class      "B6.7 V"//?

	/*BinaryOrbit
	{
		Separation      7000
	}*/
}

// 房宿二(SB**)
// B是光学伴星?
/*Barycenter "HIP 78104 A"
{
	ParentBody "HIP 78104"
	BinaryOrbit
	{
		Epoch           2451545
		Separation      5568
		PositionAngle   95
	}
}*/

Star "Iklil/HIP 78104 Aa"
{
	ParentBody "HIP 78104"
	Class	     "B2IV"
	MassSol    7.94
	RadSol     5
	LumBol     3432
	Teff       21150

	Orbit
	{
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
	ParentBody     "HIP 78104"
	Class	         "B8.1 V"

	Orbit
	{
		PeriodDays      4.0033
		Eccentricity    0.27
		Epoch           2442178.6060
		ArgOfPericenter 231
		MeanAnomaly     0
	}
}
/*
Star	"HIP 78104 B"
{
	ParentBody     "HIP 78104"
	Class	         "A8.8 V"

	BinaryOrbit
	{
		Epoch           2451545
		Separation      5568
		PositionAngle   95
	}
}*/

// 房宿三(SB**)
Remove "DEL Sco (AB)"{ParentBody "Dschubba"}
Remove "Dschubba A"{ParentBody "DEL Sco (AB)"}
Remove "Dschubba B"{ParentBody "DEL Sco (AB)"}
Remove "DEL Sco C"{ParentBody "Dschubba"}
Star "HIP 78401 A" // 有人说A是一对双星，但已经证实这颗伴星不存在
{
	ParentBody "HIP 78401"
	Class      "B0.3IV"
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
		Epoch           2455716
		ArgOfPericenter 177.7
		MeanAnomaly     0
		//SemiAmplitude   23.9
	}
}

Star "HIP 78401 B"
{
	ParentBody "HIP 78401"
	Class      "B1V" // B3V
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
		Epoch           2455716
		ArgOfPericenter -2.3
		MeanAnomaly     0
	}
}

// 房宿四(******) (基本只是改了个名)
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
Barycenter "房宿四/BET1 Sco A-B/HIP 78820 A/BD-19 4307 A/HD 144217 A/HR 5984 A"
{
	ParentBody "BET Sco"
	BinaryOrbit
	{
		Separation      1620
	}
}

Barycenter "BET2 Sco C-E/BD-19 4308 B/HD 144218 B/HIP 78821 B/HR 5985 B"
{
	ParentBody "BET Sco"
	BinaryOrbit
	{
		Separation      1620
	}
}

// ------------------------------------------------------------ //

Barycenter "BET1 Sco A"
{
	ParentBody "BET1 Sco A-B"
	Orbit
	{
		Epoch           2626860.788813
		Period          610
		Inclination     87.1
		AscendingNode   89.5
		ArgOfPericenter 102.9
		MeanAnomaly     0
	}
}

Star "BET1 Sco B"
{
	ParentBody "BET1 Sco A-B"
	Class      ""
	MassSol    8

	Orbit
	{
		Epoch           2626860.788813
		Period          610
		Inclination     87.1
		AscendingNode   89.5
		ArgOfPericenter 282.9
		MeanAnomaly     0
	}
}

// ------------------------------------------------------------ //

Star "BET1 Sco Aa/BET1 Sco D"
{
	ParentBody "BET1 Sco A"
	Class      "B0.5IV"
	MassSol    15
	RadSol     6.3
	Luminosity 31600
	Teff       28000
	Orbit
	{
		Epoch           2449788.509
		PeriodDays      6.82
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
	Class      "B1.5V"
	MassSol    10.4
	RadSol     4
	Luminosity 7900
	Teff       26400

	Orbit
	{
		Epoch           2449788.509
		PeriodDays      6.82
		Eccentricity    0.291
		Inclination     111.8
		AscendingNode   294.2
		ArgOfPericenter 234.8
		MeanAnomaly     0
	}
}

// ------------------------------------------------------------ //

Star "BET2 Sco C"
{
	ParentBody "BET2 Sco C-E"
	Class      "B2 V"
	MassSol    8.2
	RadSol     2.9
	Luminosity 3200
	Teff       24000

	Orbit
	{
		Period          39
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
	ParentBody "BET2 Sco C-E"
	Orbit
	{
		Period          39
		Eccentricity    0.025
		Inclination     41.8
		AscendingNode   5.4
		ArgOfPericenter 335.8
		Epoch           2449338.470517
		MeanAnomaly     0
	}
}

// ------------------------------------------------------------ //

Star "BET2 Sco Ea"
{
	ParentBody "BET2 Sco E"
	Class      "B2 V"
	MassSol    3.5
	RadSol     2.4
	Luminosity 126
	Teff       13000
	Age        0.063

	Orbit
	{
		PeriodDays      10.7
		Inclination     41.8
		AscendingNode   5.4
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "BET2 Sco Eb"
{
	ParentBody "BET2 Sco E"
	Class      ""
	MassSol    3.5

	Orbit
	{
		PeriodDays      10.7
		Inclination     41.8
		AscendingNode   5.4
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 键闭(*******) (重制版)
/*
Nu Scorpii AB and Nu Scorpii CD, orbiting each other with a period of 105,000 years. AB contains four stars:

Nu Scorpii Aa, Ab and Ac: Aa and Ab are a binary system (period: 5.5 days) orbited by Ac (period: 8.3 years).
Nu Scorpii B: This star orbits Nu Scorpii A - the three stars above - with a period of 675 years.
Nu Scorpii CD contains three stars:

Nu Scorpii C: C is a single star.
Nu Scorpii Da and Db: Da and Db are a binary system (period: unknown), which together orbit C over 3,100 years.
*/
Remove "NU Sco (AB)"{ParentBody "NU Sco"}
Remove "NU Sco B"{ParentBody "NU Sco (AB)"}
Remove "NU Sco (Aabc)"{ParentBody "NU Sco (AB)"}
Remove "NU Sco Ac"{ParentBody "NU Sco (Aabc)"}
Remove "NU Sco A"{ParentBody "NU Sco (Aabc)"}
Remove "NU Sco Aa"{ParentBody "NU Sco A"}
Remove "NU Sco Ab"{ParentBody "NU Sco A"}
Remove "NU Sco (CD)"{ParentBody "NU Sco"}
Remove "NU Sco C"{ParentBody "NU Sco (CD)"}
Remove "NU Sco D"{ParentBody "NU Sco (CD)"}
Remove "NU Sco Da"{ParentBody "NU Sco D"}
Remove "NU Sco Db"{ParentBody "NU Sco D"}
Barycenter "HIP 79374 A-B"
{
	ParentBody "HIP 79374"
	BinaryOrbit
	{
		Separation      6165
	}
}

Barycenter "HIP 79374 C-D"
{
	ParentBody "HIP 79374"
	BinaryOrbit
	{
		Separation      6165
	}
}

//-----------------------------------

Barycenter "HIP 79374 Aabc"
{
	ParentBody "HIP 79374 A-B"
	Orbit
	{
		Period          452 // 675
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 79374 B"
{
	ParentBody "HIP 79374 A-B"
	Class      ""
	MassSol    3.91 // 3.57
	Luminosity 1300
	Teff       22000

	Orbit
	{
		Period          452 // 675
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
	ParentBody "HIP 79374 C-D"
	Class      "B9III"
	MassSol    2.31 // 2.22
	Luminosity 80
	Teff       12000

	BinaryOrbit
	{
		Separation      300
	}
}

Barycenter "HIP 79374 D"
{
	ParentBody "HIP 79374 C-D"
	BinaryOrbit
	{
		Separation      300
	}
}

// -----------------------------------

Star "HIP 79374 Da"
{
	ParentBody "HIP 79374 D"
	Class      "B9III"
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

// 罚三(SB**)
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
		Epoch           2457025.5
		ArgOfPericenter 249.4
		MeanAnomaly     0
		//SemiAmplitude   3.847
	}
}

Star "HIP 78400 B"
{
	ParentBody "HIP 78400"
	Class      ""
	RadSol     0.4

	Orbit
	{
		PeriodDays      1142.4
		//SemiMajorAxisKm 5.953E+7
		Eccentricity    0.11
		Inclination     143
		AscendingNode   163.5
		Epoch           2457025.5
		ArgOfPericenter 69.4
		MeanAnomaly     0
	}
}

// 东咸二(Be**)
Remove "CHI Oph A"{ParentBody "CHI Oph"}
Remove "CHI Oph B"{ParentBody "CHI Oph"}
Star "HIP 80569 A"
{
	ParentBody "HIP 80569"
	Class      "B2Vne"
	MassSol    10.1
	RadSol     12.61
	/*Luminosity 245
	Teff       6432*/ // 质量这么大的主序星不可能才这点温度
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

// 西咸一(SB*****)
Remove "KSI Sco (ABC)"{ParentBody "KSI Sco"}
Remove "KSI Sco (DE)"{ParentBody "KSI Sco"}
Remove "KSI Sco (AB)"{ParentBody "KSI Sco (ABC)"}
Remove "KSI Sco A"{ParentBody "KSI Sco (AB)"}
Remove "KSI Sco B"{ParentBody "KSI Sco (AB)"}
Remove "KSI Sco C"{ParentBody "KSI Sco (ABC)"}
Remove "KSI Sco D"{ParentBody "KSI Sco (DE)"}
Remove "KSI Sco E"{ParentBody "KSI Sco (DE)"}
Barycenter "西咸一/KSI Sco ABC/BD-10 4237 ABC/GJ 9540 ABC/HIP 78727 ABC/ADS 9909 ABC"
{
  ParentBody "KSI Sco"
	BinaryOrbit
	{
		Separation      7867.8
	}
}

Barycenter "KSI Sco DE"
{
  ParentBody "KSI Sco"
	BinaryOrbit
	{
		Separation      7867.8
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
		Epoch           2534125.79454248
		ArgOfPericenter 239.3
		MeanAnomaly     0
	}
}

Star "KSI Sco C/SAO 159666/ADS 9909 C"
{
	ParentBody "KSI Sco ABC"
	Class      "G1V"

	Orbit
	{
		Period          1514.43
		Eccentricity    0.041
		Inclination     131.5
		AscendingNode   47.4
		Epoch           2534125.79454248
		ArgOfPericenter 59.3
		MeanAnomaly     0
	}
}

Star "KSI Sco A/HD 144070/HR 5978/ADS 9909 A"
{
	ParentBody "KSI Sco AB"
	Class      "F4V"

	Orbit
	{
		Period          45.9
		Eccentricity    0.744
		Inclination     34.5
		AscendingNode   25.3
		Epoch           2450529.16008549
		ArgOfPericenter 343.8
		MeanAnomaly     0
	}
}

Star "KSI Sco B/HD 144069/HR 5977/ADS 9909 B"
{
	ParentBody "KSI Sco AB"
	Class      "F6V"

	Orbit
	{
		Period          45.9
		Eccentricity    0.744
		Inclination     34.5
		AscendingNode   25.3
		Epoch           2450529.16008549
		ArgOfPericenter 163.8
		MeanAnomaly     0
	}
}

Star "KSI Sco D/BD-11 4057/GJ 9541 A/HD 144087/HIP 78738/SAO 159668/ADS 9910 A"
{
	ParentBody "KSI Sco DE"
	Class      "K1V"

	BinaryOrbit
	{
		Separation      332.01
	}
}

Star "KSI Sco E"
{
	ParentBody "KSI Sco DE"
	Class      "K1V"

	BinaryOrbit
	{
		Separation      332.01
	}
}

// 日(PM**)
Star	"HIP 76880 A"
{
	ParentBody     "HIP 76880"
	Class	         "K5III"
	RadSol         38
	Luminosity     296
	Teff           3930

	Orbit
	{
		RefPlane        "Equator"
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
	Class	         "M0.4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.173957
		Eccentricity    0
		Inclination     -161.665
		AscendingNode   107.511
		ArgOfPericenter 202.674
		MeanAnomaly     79.258
	}
}

// 从官一(SB***)
Barycenter "HIP 76945 AB"
{
  ParentBody "HIP 76945"
	BinaryOrbit
	{
		Separation      56.6102
	}
}

Star	"HIP 76945 A"
{
	ParentBody     "HIP 76945 AB"
	Class	         "B5V"
	Teff           15135

	Orbit
	{
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
	Class	         "B5V"

	Orbit
	{
		PeriodDays      12.26
		Eccentricity    0.19
		Epoch           2438252.97
		AscendingNode   107.511
		ArgOfPericenter 82.8
		MeanAnomaly     0
		//SemiAmplitude   66.4
	}
}

Star	"HIP 76945 C"
{
	ParentBody     "HIP 76945"
	Class	         "F2.5 V"

	/*BinaryOrbit
	{
		Separation      56.6102
	}*/
}

// 从官二(SB**)
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
