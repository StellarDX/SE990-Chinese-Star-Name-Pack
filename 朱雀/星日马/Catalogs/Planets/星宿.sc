// 星宿二(SB**)
Remove "TAU1 Hya A"{ParentBody "TAU1 Hya"}
Remove "TAU1 Hya B"{ParentBody "TAU1 Hya"}
Remove "TAU1 Hya Aa"{ParentBody "TAU1 Hya A"}
Remove "TAU1 Hya Ab"{ParentBody "TAU1 Hya A"}
Barycenter "HIP 46509 A"
{
  ParentBody "HIP 46509"
  BinaryOrbit
  {
    Epoch           2455927.43978347
    Separation      1120
    PositionAngle   4
  }
}

Star "HIP 46509 Aa"
{
  ParentBody "HIP 46509 A"
  Class      "F6V"
  MassSol    1.2
  RadSol     1.4
  LumBol     3.369
  Teff       6473
  FeH        -0.01
  Age        3.61

  Orbit
  {
    PeriodDays      2807
    Eccentricity    0.33
    Epoch           2445260
    ArgOfPericenter 0
    MeanAnomaly     0
    //SemiAmplitude   2.98
  }
}

Star "HIP 46509 Ab"
{
  ParentBody "HIP 46509 A"
  Class      ""
  MassSol    0.35 // Resolved Aa,Ab at 0.342"/96.7deg in 2015/dH=4.7mag mass(Ab)~0.35 Msun.

  Orbit
  {
    PeriodDays      2807
    Eccentricity    0.33
    Epoch           2445260
    ArgOfPericenter 180
    MeanAnomaly     0
  }
}

Star "HIP 46509 B"
{
  ParentBody "HIP 46509"
  Class      "K0"
  MassSol    0.86
  RadSol     0.81
  Luminosity 0.435
  Teff       5197

  /* BinaryOrbit
  {
    Epoch           2455927.43978347
    Separation      1120
    PositionAngle   4
  } */
}

// 星宿三(**)
Star	"HIP 46776 A"
{
	ParentBody     "HIP 46776"
	Class	         "A3V"
  RadSol         4.5
  Luminosity     285
  Teff           7918

	Orbit
	{
		RefPlane        "Equator"
		Period          4.25627
		Eccentricity    0.401114
		Inclination     142.741
		AscendingNode   -72.6105
		ArgOfPericenter -26.0261
		MeanAnomaly     65.1545
	}
}

Star	"HIP 46776 B"
{
	ParentBody     "HIP 46776"
	Class	         "B9.4 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          4.25627
		Eccentricity    0.401114
		Inclination     142.741
		AscendingNode   -72.6105
		ArgOfPericenter 153.974
		MeanAnomaly     65.1545
	}
}

// 星宿五(***)
Remove "27 Hya (BC)"{ParentBody "27 Hya"}
Remove "27 Hya A"{ParentBody "27 Hya"}
Remove "27 Hya B"{ParentBody "27 Hya (BC)"}
Remove "27 Hya C"{ParentBody "27 Hya (BC)"}
Star "星宿五/27 Hya/BD-08 2643/HD 80586/HIP 45811/HR 3709/SAO 136768"
{
  ParentBody "CCDM J09204-0934"
  Class      "K0III"
  MassSol    2.17
  RadSol     11
  Luminosity 57.5
  Teff       4965
  FeH        -0.07
  Age        1.91

  /* BinaryOrbit
  {
    Separation      15578.8
  } */
}

Barycenter "CCDM J09204-0934 BC"
{
  ParentBody "CCDM J09204-0934"
  BinaryOrbit
  {
    Separation      15578.8
  }
}

Star "BD-09 2801/HD 80550/HIP 45802/SAO 136767"
{
  ParentBody "CCDM J09204-0934 BC"
  Class      "F4V"
  MassSol    1.48
  RadSol     1.82
  Luminosity 5.885
  Teff       6664

  BinaryOrbit
  {
    Separation      625.6
  }
}

Star "TYC 5463-1518-1"
{
  ParentBody "CCDM J09204-0934 BC"
  Class      "K2V"
  MassSol    0.76
  RadSol     0.72
  Luminosity 0.227
  Teff       4685

  /* BinaryOrbit
  {
    Separation      625.6
  } */
}

// 星宿六(**)
Star	"HIP 45751 A"
{
	ParentBody     "HIP 45751"
	Class	         "G7III"
  MassSol        2.72
  RadSol         15.14
  Luminosity     138.5
  Teff           5003
  FeH            -0.13
  Age            0.51

	BinaryOrbit
	{
    Separation      326.4
	}
}

Star	"HIP 45751 B"
{
	ParentBody     "HIP 45751"
	Class	         "A4 V"

  /* BinaryOrbit
	{
    Separation      326.4
	} */
}

// 轩辕一(SB**)
Remove "10 UMa A"{ParentBody "10 UMa"}
Remove "10 UMa B"{ParentBody "10 UMa"}
Star "HIP 44248 A"
{
	ParentBody "HIP 44248"
	Class      "F3V"
	MassSol    1.44
  Luminosity 4.285
  Teff       6740

	Orbit
	{
		PeriodDays      7691
		Eccentricity    0.15075
		Inclination     131.366
		AscendingNode   203.74
    Epoch           2449263.1
		ArgOfPericenter 212.3
		MeanAnomaly     0
	}
}

Star "HIP 44248 B"
{
	ParentBody "HIP 44248"
	Class      "K0V"
	MassSol    0.89
  Luminosity 0.638
  Teff       5250

	Orbit
	{
    PeriodDays      7691
		Eccentricity    0.15075
		Inclination     131.366
		AscendingNode   203.74
    Epoch           2449263.1
		ArgOfPericenter 32.3
		MeanAnomaly     0
	}
}

// 轩辕三(PM**)
Remove "38 Lyn A"{ParentBody "38 Lyn"}
Remove "38 Lyn B"{ParentBody "38 Lyn"}
Barycenter "HIP 45688 AB"
{
  ParentBody "HIP 45688"
  BinaryOrbit
  {
    Separation      3537.36
  }
}

Star "HIP 45688 A"
{
	ParentBody "HIP 45688 AB"
	Class      "A1V"
	MassSol    1.9
  RadSol     3.07
  Luminosity 32
  Teff       8862
  FeH        -0.36
  Age        0.213
  Oblateness 0

	Orbit
	{
		Period          429
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Barycenter "HIP 45688 B"
{
  ParentBody "HIP 45688 AB"
  Orbit
  {
    Period          429
		ArgOfPericenter 180
		MeanAnomaly     0
  }
}

Star "HIP 45688 Ba"
{
	ParentBody "HIP 45688 B"
	Class      "A4V"
	MassSol    1.3
  RadSol     2.55
  Luminosity 5
  Oblateness 0

	Orbit
	{
    Period          2.1
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 45688 Bb"
{
	ParentBody "HIP 45688 B"
	Class      ""
	MassSol    0.9
  Teff       5409 // A型恒星不可能才这点温度

	Orbit
	{
    Period          2.1
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 45688 E"
{
	ParentBody "HIP 45688"
	Class      "M2"
	MassSol    0.31
  Teff       3816

  /* BinaryOrbit
  {
    Separation      3537.36
  } */
}

// 轩辕七(**)
Remove "KAP Leo A"{ParentBody "Al Minliar al Asad"}
Remove "KAP Leo B"{ParentBody "Al Minliar al Asad"}
Star "HIP 46146 A"
{
	ParentBody "HIP 46146"
	Class      "K2III"
	MassSol    1.44
  RadSol     17
  Luminosity 89
  Teff       4403
  FeH        0.01
  Age        4.33

	BinaryOrbit
	{
    Separation      129.57
	}
}

Star "HIP 46146 B"
{
	ParentBody "HIP 46146"
	Class      "M2.5 V"

  /* BinaryOrbit
	{
    Separation      129.57
	} */
}

// 轩辕十二(未作修改)
Remove "Algieba A"{ParentBody "GAM Leo"}
Remove "Algieba B"{ParentBody "GAM Leo"}
Star	"GAM1 Leo A/HD 89484 A/HR 4057 A/SAO 81298 A/LTT 12764"
{
	ParentBody "HIP 50583"
	Class      "K1III"
	MassSol    1.23
	RadSol     31.88
	Luminosity 320
	Teff       4470
	FeH        -0.49

	Orbit
	{
		Period          510.3
		Eccentricity    0.845
		Inclination     76
		AscendingNode   143.4
		Epoch           2331489.42265879
    ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"GAM2 Leo B/HD 89485 B/HR 4058 B/SAO 81299 B/LTT 12765"
{
	ParentBody "HIP 50583"
	Class      "G7IIIb"
	RadSol     10
	Luminosity 40
	Teff       4980
	FeH        -0.52

	Orbit
	{
    Period          510.3
		Eccentricity    0.845
		Inclination     76
		AscendingNode   143.4
		Epoch           2331489.42265879
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 轩辕十三(*)
// [Wikipedia]Eta Leonis is apparently a multiple star system, but the number of components and their separation is uncertain.
// 这就意味着轩辕十三有很多的伴星，但是具体不知道是几星系统，也没有准确的数据
// 所有伴星均为系统生成
Remove "ETA Leo A"{ParentBody "ETA Leo"}
Remove "ETA Leo B"{ParentBody "ETA Leo"}
Barycenter	"HIP 49583 A"
{
	ParentBody     "HIP 49583"
	BinaryOrbit
	{
		RefPlane        "Equator"
		Period          17.1814
		Eccentricity    0.417712
		Inclination     -170.092
		AscendingNode   80.5229
		ArgOfPericenter -98.3178
		MeanAnomaly     41.6529
	}
}

Star	"HIP 49583 Aa"
{
	ParentBody     "HIP 49583 A"
	Class	         "A0Ib"
	MassSol         10
	RadSol          47
  Luminosity      19000
	Teff            9600
  FeH             0.04
  Age             0.025

	Orbit
	{
		RefPlane        "Equator"
		Period          0.105267
		Eccentricity    0
		Inclination     -98.9807
		AscendingNode   179.719
		ArgOfPericenter -126.772
		MeanAnomaly     -153.929
	}
}

Star	"HIP 49583 Ab"
{
	ParentBody     "HIP 49583 A"
	Class	         ""
	MassSol         8.1072

	Orbit
	{
		RefPlane        "Equator"
		Period          0.105267
		Eccentricity    0
		Inclination     -98.9807
		AscendingNode   179.719
		ArgOfPericenter 53.2283
		MeanAnomaly     -153.929
	}
}

Star	"HIP 49583 B"
{
	ParentBody     "HIP 49583"
	Class	         ""
	MassSol        11.3779

	/* Orbit
	{
		RefPlane        "Equator"
		Period          17.1814
		Eccentricity    0.417712
		Inclination     -170.092
		AscendingNode   80.5229
		ArgOfPericenter 81.6822
		MeanAnomaly     41.6529
	} */
}

// 轩辕十四(PM****)
Remove "Regulus (AB)"{ParentBody "Regulus"}
Remove "ALF Leo (CD)"{ParentBody "Regulus"}
Remove "Regulus A"{ParentBody "Regulus (AB)"}
Remove "ALF Leo B"{ParentBody "Regulus (AB)"}
Remove "ALF Leo C"{ParentBody "ALF Leo (CD)"}
Remove "ALF Leo D"{ParentBody "ALF Leo (CD)"}
Barycenter "ALF Leo A/BD+12 2149/HD 87901/LTT 12716/SAO 98967/FK5 380/GCTP 2384.00"
{
	ParentBody "HIP 49669"
	BinaryOrbit
	{
    Separation      5000
	}
}

Star "HD 87901 A"
{
	ParentBody "HD 87901"
	Class      "B8IVn"
	MassSol    3.8
  RadSol     4.35
  Luminosity 316.2
  Teff       11668
  FeH        0.21
  RotationPeriod 15.9
  Age        1

	Orbit
	{
		PeriodDays      40.102
		//SemiMajorAxis   6*RadSol
    Eccentricity    0
		ArgOfPericenter 0
		MeanAnomaly     0
    //SemiAmplitude   7.58
	}
}

Star "HD 87901 B"
{
	ParentBody "HD 87901"
	Class      "WD" // Gies et al.: Ab is lilkely WD because Regulus was UR by occultations.
	MassSol    0.3

	Orbit
	{
    PeriodDays      40.102
		//SemiMajorAxis   6*RadSol
    Eccentricity    0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 49669 BC/BD+12°2147/HD 87884 B/LTT 12714/SAO 98966"
{
	ParentBody "HIP 49669"
  /* BinaryOrbit
	{
    Separation      5000
	} */
}

Star "HIP 49669 B"
{
	ParentBody "HIP 49669 BC"
	Class      "K2V"
	MassSol    0.8
  RadSol     0.83
  Luminosity 0.5
  Teff       4885
  FeH        -0.21

	Orbit
	{
		Period          600
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 49669 C"
{
	ParentBody "HIP 49669 BC"
	Class      "M4V"
	MassSol    0.3
  RadSol     0.37
  Teff       3242

	Orbit
	{
		Period          600
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 轩辕十五(SB**) (B是光学伴星)
Remove "Subra A"{ParentBody "Subra"}
Remove "Subra B"{ParentBody "Subra"}
Star "HD 83808"
{
	ParentBody "HIP 47508"
	Class      "F8III" // G0III
	MassSol    2.12
  RadSol     5.9
  Luminosity 39.4
  Teff       6000
  Age        0.8

	Orbit
	{
		PeriodDays      14.498064
    Eccentricity    0
		Inclination     57.6
		AscendingNode   191.4
    Epoch           2450629.831
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 83809"
{
	ParentBody "HIP 47508"
	Class      "A7m"
	MassSol    1.87
  RadSol     2.2
  Luminosity 15.4
  Teff       7600

	Orbit
	{
    PeriodDays      14.498064
    Eccentricity    0
		Inclination     57.6
		AscendingNode   191.4
    Epoch           2450629.831
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 轩辕十六(BSG**)
Remove "RHO Leo A"{ParentBody "RHO Leo"}
Remove "RHO Leo B"{ParentBody "RHO Leo"}
Star "HIP 51624 A"
{
	ParentBody "HIP 51624"
	Class      "B1Iab"
	MassSol    27.1
  RadSol     37.4
  Luminosity 295000
  Teff       24200
  FeH        -0.89
  RotationPeriod 168 // 7 Days
  Age        0.0045
  Oblateness 0

  BinaryOrbit
	{
    Separation      17.3294
	}
}

Star "HIP 51624 B(?)"
{
	ParentBody     "HIP 51624"
	Class          ""
	MassSol        14.9376

  /* BinaryOrbit
	{
    Separation      17.3294
	} */
}

// 御女(PM**)
Star	"HIP 49637 A"
{
	ParentBody     "HIP 49637"
	Class	         "K3.5IIIbFe-1:"
  RadSol         30.4
  LumBol         227
  Teff           4074
  FeH            -0.02

	BinaryOrbit
	{
    Separation      387.1
	}
}

Star	"HIP 49637 B"
{
	ParentBody     "HIP 49637"
	Class	         "F7 V"

  /* BinaryOrbit
	{
    Separation      387.1
	} */
}
