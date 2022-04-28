// 昴宿二
Star "Taygeta Aa"
{
	ParentBody "Taygeta"
	Class      "B6IV"
	MassSol    4.5
	Luminosity 600

	Orbit
	{
		PeriodDays      1313
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "Taygeta Ab"
{
	ParentBody "Taygeta"
	Class      ""
	MassSol    3.2
  Luminosity 150

	Orbit
	{
		PeriodDays      1313
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 昴宿六

// SpaceEngineer: B, C and D must be independent stars, separation of >0.1 pc
// is too much for being physically bound. They three are also to close to each
// other to form a stable system.
// Also added third component of Alcyone A and double Alcyone D.

// Uncomment Alcyone A, B, C, D designations, and change ParentBody
// of "Alcyone Aa" and "Alcyone Ab" to "Alcyone A"
// to turn it into a septuple system.

// 丹霞：有些人说，昴宿六周围环绕着3颗星，共同组成了一个距离非常近的系统。
// 也就是这三颗星距离昴宿六很近，应该存在物理关系。
// 但毛子说的也不是没道理，如果把这三颗星算进去后，那就是7星系统，整个系统的稳定性就堪忧了。
// Wikipedia上对于这些小伴星几乎也是一个字都没提，而且也不知道整个系统是怎么运作的。
// 所以两种可能都会有，这三颗星要么是物理伴星，要么是光学伴星。(一头雾水 = = )

Remove "Alcyone Aa"{ParentBody "Alcyone"}
Remove "Alcyone Aaa"{ParentBody "Alcyone Aa"}
Remove "Alcyone Aab"{ParentBody "Alcyone Aa"}
Remove "Alcyone Ab"{ParentBody "Alcyone"}

// 数据来源：Multiple Star Catalog
// https://en.wikipedia.org/wiki/Alcyone_(star)
// http://www.ctio.noao.edu/~atokovin/stars/stars.php?cat=HIP&number=17702
Barycenter "昴宿六/Alcyone A"
{
	ParentBody "Alcyone"
	Orbit
	{
		Period          541410
		ArgOfPericenter 109.4
		MeanAnomaly     0
	}
}

Barycenter "Alcyone Aa"
{
	ParentBody "Alcyone A"
	Orbit
	{
		PeriodDays      830
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "Alcyone Aa1"
{
	ParentBody "Alcyone Aa"
	Class      "B7 III"
	MassSol    5.9 // 6.1
  RadSol     9.3
  Luminosity 2030
	Teff       12258

	Orbit
	{
		PeriodDays      4.1349
    Eccentricity    0
    Inclination     0
    AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "Alcyone Aa2"
{
	ParentBody "Alcyone Aa"
	Class      ""
	MassSol    0.38
  Orbit
	{
		PeriodDays      4.1349
    Eccentricity    0
    Inclination     0
    AscendingNode   0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "Alcyone Ab"
{
	ParentBody "Alcyone A"
	Class      ""
	MassSol    3.21 // 9.49-Aa1-Aa2=3.21
  // 丹霞：这质量有点不正常......Aa1+Aa2=6.28，为何总质量给了个5.45???
  // 我觉得那个9.49的还算正常一点(头疼 >_<)

  Orbit
	{
		PeriodDays      830
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "Alcyone B/24 Tau/SAO 76192"
{
	ParentBody "Alcyone"
	Class      "A0V"
	MassSol    2.36

	Orbit
	{
		// Orbital parameters are derived to fit the coordinates:
		RA   03 47 21.036
		Dec +24 06 58.58
		Period          541410
		ArgOfPericenter -70.6
		MeanAnomaly     0
	}
}

Star "Alcyone C/V* V647 Tau/HD 23608/SAO 76188"
{
	ParentBody "Alcyone"
	Class      "A7Vs"
	MassSol    1.9

	Orbit
	{
		// Orbital parameters are derived to fit the coordinates:
		RA   03 47 16.566
		Dec +24 07 42.29
		SemiMajorAxis   21699.5974
		ArgOfPericenter 295.4
		MeanAnomaly     0
	}
}

Remove "Alcyone Da"{ParentBody "Alcyone D"}
Remove "Alcyone Db"{ParentBody "Alcyone D"}

Barycenter "Alcyone Dab/HD 23607/SAO 76191"
{
	ParentBody "Alcyone"
	Orbit
	{
		// Orbital parameters are derived to fit the coordinates:
		RA   03 47 19.357
		Dec +24 08 20.63
		SemiMajorAxis   20500
		ArgOfPericenter -48.1
		MeanAnomaly     0
	}
}

Star "Alcyone Da"
{
	ParentBody "Alcyone Dab"
	Class      "F3V"
	MassSol    1.32

	Orbit
	{
		SemiMajorAxis   17
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "Alcyone Db"
{
	ParentBody "Alcyone Dab"
	Class      "F3V"
	MassSol    1.32

	Orbit
	{
		SemiMajorAxis   17
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 昴宿七
Star "Atlas A"
{
	ParentBody "27 Tau"
	Class      "B8III"
	MassSol    4.74
  RadSol     2
	AbsMagn    -1.75
  Teff       13446

	Orbit
	{
		PeriodDays      290.984
    Eccentricity    0.2385
    Inclination     107.87
    AscendingNode   154
    Epoch           2450583
		ArgOfPericenter 331.9
		MeanAnomaly     0
	}
}

Star "Atlas B"
{
	ParentBody "27 Tau"
	Class      ""
	MassSol    3.42

  Orbit
	{
		PeriodDays      290.984
    Eccentricity    0.2385
    Inclination     107.87
    AscendingNode   154
    Epoch           2450583
		ArgOfPericenter 151.9
		MeanAnomaly     0
	}
}

// 天阴三(*)
Star	"HIP 15737 A"
{
	ParentBody     "HIP 15737"
	Class	         "K3 III"
  RadSol         19
  Luminosity     120
  Teff           4406
  FeH            0.02

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.14653
		Period          0.163087
		Eccentricity    0.204806
		Inclination     -152.243
		AscendingNode   -147.447
		ArgOfPericenter -25.9762
		MeanAnomaly     120.885
	}
}

Star	"HIP 15737 B"
{
	ParentBody     "HIP 15737"
	Class	         "F2.9 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.163087
		Eccentricity    0.204806
		Inclination     -152.243
		AscendingNode   -147.447
		ArgOfPericenter 154.024
		MeanAnomaly     120.885
	}
}

// 刍蒿六
Star "HIP 12390 A"
{
	ParentBody "HIP 12390"
	Class      "F2V"
	MassSol    1.37
  Luminosity 7.17
  Teff       6537
  FeH        -0.16
  Age        1.8

	Orbit
	{
		Period          2.6512
    //SemiMajorAxis   0.11
    Eccentricity    0.23
    Inclination     24.2
    AscendingNode   90.2
    //EpochB          2012.3109
		ArgOfPericenter 220.8
		MeanAnomaly     0
	}
}

Star "HIP 12390 B"
{
	ParentBody "HIP 12390"
	Class      "F7" // G4V?
	MassSol    1.03

  Orbit
	{
		Period          2.6512
    //SemiMajorAxis   0.11
    Eccentricity    0.23
    Inclination     24.2
    AscendingNode   90.2
    //EpochB          2012.3109
		ArgOfPericenter 40.8
		MeanAnomaly     0
	}
}

// 天苑五
Star "HIP 15197 A"
{
	ParentBody "HIP 15197"
	Class      "kA4hA9mA9V"
	MassSol    1.85
	RadSol     10.3
  Luminosity 10.3
  Teff       7575
  FeH        0.04
  Age        0.8

	Orbit
	{
		PeriodDays      17.9297
    Eccentricity    0.14
    Epoch           2443051.07
		ArgOfPericenter 302
		MeanAnomaly     0
		//SemiAmplitude   21.5
	}
}

Star "HIP 15197 B"
{
	ParentBody "HIP 15197"
	Class      ""
	MassSol    1.7 // ???

	Orbit
	{
		PeriodDays      17.9297
    Eccentricity    0.14
    Epoch           2443051.07
		ArgOfPericenter 122
		MeanAnomaly     0
	}
}

// 天苑七
Star "HIP 12770 A"
{
	ParentBody "HIP 12770"
	Class      "B7V" // B7IV
	MassSol    4.4
	RadSol     4.3
  Luminosity 468
  Teff       12900
  FeH        0.28
  Age        0.0003

	Orbit
	{
		PeriodDays      2722
    Eccentricity    0
    Epoch           2444852
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   4.33
	}
}

Star "HIP 12770 B"
{
	ParentBody "HIP 12770"
	Class      "DX"

	Orbit
	{
		PeriodDays      2722
    Eccentricity    0
    Epoch           2444852
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 天苑八
Star "HIP 12843 A"
{
	ParentBody "HIP 12843"
	Class      "F7V"
	MassSol    1.15
  Teff       6231

	Orbit
	{
		PeriodDays      958
    Eccentricity    0.45
    Epoch           2439391.9
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 12843 B"
{
	ParentBody "HIP 12843"
	Class      ""
	MassSol    1.1 // Unknown

	Orbit
	{
		PeriodDays      958
    Eccentricity    0.45
    Epoch           2439391.9
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 天苑十二
Star "HIP 16611 A"
{
	ParentBody "HIP 16611"
	Class      "B0V"
	MassSol    3.3
	RadSol     3.2
	Luminosity 188
  Teff       12514
	Age        0.157

	Orbit
	{
		PeriodDays      6.2236
    Eccentricity    0.2
    Epoch           2424446.548
		ArgOfPericenter 133
		MeanAnomaly     0
		//SemiAmplitude   107
	}
}

Star "HIP 16611 B"
{
	ParentBody "HIP 16611"
	Class      "B9V"
	RadSol     2.6

	Orbit
	{
		PeriodDays      6.2236
    Eccentricity    0.2
    Epoch           2424446.548
		ArgOfPericenter 313
		MeanAnomaly     0
		//SemiAmplitude   103
	}
}

// 天苑十五
Star "HIP 18216 A"
{
	ParentBody "HIP 18216"
	Class      "B6V"
	MassSol    5
	Luminosity 256
  Teff       11858
	Age        0.0328

	Orbit
	{
		PeriodDays      459
    Eccentricity    0.18
    Epoch           2450954
		ArgOfPericenter 286
		MeanAnomaly     0
		//SemiAmplitude   21.7
	}
}

Star "HIP 18216 B"
{
	ParentBody "HIP 18216"
	Class      ""
	MassSol    4 // Unknown

	Orbit
	{
		PeriodDays      459
		Eccentricity    0.18
		Epoch           2450954
		ArgOfPericenter 106
		MeanAnomaly     0
	}
}

// 天苑十六
Star "HIP 18673 A"
{
	ParentBody "HIP 18673"
	Class      "B9.5V Si"
	MassSol    3.26
	RadSol     3.26
	Luminosity 166
  Teff       10866

	Orbit
	{
		PeriodDays      5.9537
    Eccentricity    0.1
    Epoch           2417600.95
		ArgOfPericenter 331
		MeanAnomaly     0
		//SemiAmplitude   37.6
	}
}

Star "HIP 18673 B"
{
	ParentBody "HIP 18673"
	Class      ""
	MassSol    3 // Unknown

	Orbit
	{
		PeriodDays      5.9537
		Eccentricity    0.1
		Epoch           2417600.95
		ArgOfPericenter 151
		MeanAnomaly     0
	}
}

// 卷舌一(光学双星)
Remove "NU Per A"{ParentBody "NU Per"}
Remove "NU Per B"{ParentBody "NU Per"}

// 卷舌二
// 卷舌一(光学双星)
Remove "EPS Per A"{ParentBody "EPS Per"}
Remove "EPS Per Aa"{ParentBody "EPS Per A"}
Remove "EPS Per Ab"{ParentBody "EPS Per A"}
Remove "EPS Per B"{ParentBody "EPS Per"}
Barycenter "HIP 18532 A"
{
	ParentBody "HIP 18532"
	Orbit
	{
		PeriodDays      9428
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 18532 Aa"
{
	ParentBody "HIP 18532 A"
	Class      "B0.5 V+"
	MassSol    13.5
	RadSol     7.66
	Luminosity 28330
	Teff       26500
	Age        0.0154

	Orbit
	{
		PeriodDays      14.06916
		Eccentricity    0.5549
		Epoch           2447767.543
		ArgOfPericenter 285.8
		MeanAnomaly     0
		//SemiAmplitude   15.23
	}
}

Star "HIP 18532 Ab"
{
	ParentBody "HIP 18532 A"
	Class      ""
	MassSol    0.85 // 1.77
	RadSol     1.4

	Orbit
	{
		PeriodDays      14.06916
		Eccentricity    0.5549
		Epoch           2447767.543
		ArgOfPericenter 105.8
		MeanAnomaly     0
	}
}

Star "HIP 18532 B"
{
	ParentBody "HIP 18532"
	Class      ""
	MassSol    6.885 // 51–139% of the primary's mass

	Orbit
	{
		PeriodDays      9428
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 卷舌三(Wikipedia没说有伴星)
Remove "Menchib A"{ParentBody "Menchib"}
Remove "Menchib B"{ParentBody "Menchib"}

// 卷舌四
Remove "ZET Per A"{ParentBody "ZET Per"}
Remove "ZET Per B"{ParentBody "ZET Per"}
Star "HIP 18246 A"
{
	ParentBody "HIP 18246"
	Class      "B1 Ib"
	MassSol    14.5
	RadSol     26
	Luminosity 47039
	Teff       20800
	RotationDays 2.9 // 17.3
	Age        0.0126

	Orbit
	{
		Period          34189.772
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 18246 B"
{
	ParentBody "HIP 18246"
	Class      ""
	MassSol    3.4

	Orbit
	{
		Period          34189.772
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 卷舌五
Remove "Atik A"{ParentBody "Atik"}
Remove "Atik B"{ParentBody "Atik"}
Barycenter "HIP 17448 A"
{
	ParentBody "HIP 17448"
	Orbit
	{
		Period          809.057
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 17448 Aa"
{
	ParentBody "HIP 17448 A"
	Class      "B1III"
	MassSol    15.5
	RadSol     10 // 限制半径
	Luminosity 61869
	Teff       22840

	Orbit
	{
		PeriodDays      4.4191
		Epoch           2445338.266
		Eccentricity    0
		AscendingNode   0
		ArgOfPericenter 180
		Inclination     0
		MeanAnomaly     0
	}
}

Star "HIP 17448 Ab"
{
	ParentBody "HIP 17448 A"
	Class      "B2V"

	Orbit
	{
		PeriodDays      4.4191
		Epoch           2445338.266
		Eccentricity    0
		AscendingNode   0
		ArgOfPericenter 0
		Inclination     0
		MeanAnomaly     0
	}
}

Star "HIP 17448 B"
{
	ParentBody "HIP 17448"
	Class      ""
	MassSol    3.36

	Orbit
	{
		Period          809.057
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 卷舌六
Star "HIP 17313 A"
{
	ParentBody "HIP 17313"
	Class      "B0.5V"
	MassSol    12.5
	Luminosity 936
	Teff       29330
	FeH        -0.43
	Age        0.0072

	Orbit
	{
		Period          30000 // unknown
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 17313 B"
{
	ParentBody "HIP 17313"
	Class      "A1Vn"

	Orbit
	{
		Period          30000 // unknown
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 天谗
Star "HIP 17886 A"
{
	ParentBody "HIP 17886"
	Class      "A3V"
	MassSol    2
	RadSol     3.48
	Luminosity 59
	Teff       8892
	FeH        0

	Orbit
	{
		PeriodDays      1.7653511
		//SemiMajorAxis   8.207*RadSol
		Eccentricity    0.056
		Inclination     65.3
		ArgOfPericenter 77
		MeanAnomaly     0
		//SemiAmplitude   34.34
	}
}

Star "HIP 17886 B"
{
	ParentBody "HIP 17886"
	Class      "M"
	MassSol    0.38
	Teff       3500

	Orbit
	{
		PeriodDays      1.7653511
		//SemiMajorAxis   8.207*RadSol
		Eccentricity    0.056
		Inclination     65.3
		ArgOfPericenter 257
		MeanAnomaly     0
	}
}

// 砺石三
Star "HIP 20430 A"
{
	ParentBody "HIP 20430"
	Class      "B9V"

	Age        0.2

	MassSol    2.6
	RadSol     2.15
	Teff       10300

	Orbit
	{
		Period          28985
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "HIP 20430 B"
{
	ParentBody "HIP 20430"
	Orbit
	{
		Period          28985
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 20430 Bab"
{
	ParentBody "HIP 20430 B"
	Orbit
	{
		PeriodDays      3450.6
		Eccentricity    0.356
		Inclination     73
		Epoch           2447546.5
		ArgOfPericenter 70.3
		MeanAnomaly     0
		//SemiAmplitude   8.625
	}
}

Barycenter "HIP 20430 Bc" // G.Torres, 2005: Bc is itself a close pair of K4 dwarfs (IR flux fit).
{
	ParentBody "HIP 20430 B"
	Orbit
	{
		PeriodDays      3450.6
		Eccentricity    0.356
		Inclination     73
		Epoch           2447546.5
		ArgOfPericenter 250.3
		MeanAnomaly     0
	}
}

Star "HIP 20430 Ba"
{
	ParentBody "HIP 20430 Bab"
	Class      "F8"
	MassSol    1.19
	Teff       6180

	Orbit
	{
		PeriodDays      17.602309
		Eccentricity    0.2938
		Inclination     53.3
		Epoch           2448891.649
		ArgOfPericenter 69.43
		MeanAnomaly     0
		//SemiAmplitude   41.287
	}
}

Star "HIP 20430 Bb"
{
	ParentBody "HIP 20430 Bab"
	Class      "G6"
	MassSol    1.02
	Teff       5620

	Orbit
	{
		PeriodDays      17.602309
		Eccentricity    0.2938
		Inclination     53.3
		Epoch           2448891.649
		ArgOfPericenter 249.43
		MeanAnomaly     0
		//SemiAmplitude   48.133
	}
}

Star "HIP 20430 Bc1"
{
	ParentBody "HIP 20430 Bc"
	Class      "K4"
	MassSol    0.7

	Orbit
	{
		PeriodDays      10 // Bc1,Bc2 period of 10 days is adopted provisionally.
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 20430 Bc2"
{
	ParentBody "HIP 20430 Bc"
	Class      "K4"
	MassSol    0.7

	Orbit
	{
		PeriodDays      10 // Bc1,Bc2 period of 10 days is adopted provisionally.
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
