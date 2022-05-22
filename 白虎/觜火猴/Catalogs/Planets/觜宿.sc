// 觜宿一(****)
Remove "Meissa A"{ParentBody "Meissa"}
Remove "Meissa B"{ParentBody "Meissa"}
Barycenter "HIP 26207 AB"
{
  ParentBody "HIP 26207"
  BinaryOrbit
	{
		RefPlane        "Equator"
		Period          83164.3
		Eccentricity    0
		Inclination     87.7808
		AscendingNode   -161.302
		ArgOfPericenter 140.129
		MeanAnomaly     -172.582
	}
}

Star "HIP 26207 A"
{
	ParentBody "HIP 26207 AB"
	Class      "O8 III((f))"
	MassSol    27.9
  RadSol     10
  Luminosity 165000
  Teff       37689
  FeH        0.03

	Orbit
	{
		Period          8468.67
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 26207 B"
{
	ParentBody "HIP 26207 AB"
	Class      "B0.5 V"
  MassSol    10.3
  RadSol     4.2
  Luminosity 6300
  Teff       25400
  Age        0.0018

	Orbit
	{
		Period          8468.67
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 26207 C"
{
  ParentBody "HIP 26207"
  /* Orbit // Meissa C F8V class but unknown separation
	{
		RefPlane        "Equator"
    Period          83164.3
		Eccentricity    0
		Inclination     87.7808
		AscendingNode   -161.302
		ArgOfPericenter 320.129
		MeanAnomaly     -172.582
	} */
}

Star "HIP 26207 Ca"
{
	ParentBody "HIP 26207 C"
	Class      "F8V"

	Orbit
	{
		Period          10 // Unknown
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 26207 Cb" // Brown Dwarf
{
	ParentBody "HIP 26207 C"
	Class      "L" // ?

	Orbit
	{
		Period          10 // Unknown
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 觜宿二(PM**)
Remove "PHI1 Ori A"{ParentBody "PHI1 Ori"}
Remove "PHI1 Ori B"{ParentBody "PHI1 Ori"}
Star "HIP 26176 A"
{
	ParentBody "HIP 26176"
	Class      "B0 III"
	MassSol    15.5
  RadSol     6.3
  Luminosity 28840
  Teff       30000
  Age        0.0072

	Orbit
	{
		PeriodDays      3068.03
    Eccentricity    0.22
    Epoch           2418051.8
		ArgOfPericenter 285
		MeanAnomaly     0
    //SemiAmplitude   13.3
	}
}

Star "HIP 26176 B"
{
	ParentBody "HIP 26176"
  Class      "B4.3 IV"

	Orbit
	{
    PeriodDays      3068.03
    Eccentricity    0.22
    Epoch           2418051.8
		ArgOfPericenter 105
		MeanAnomaly     0
	}
}

// 司怪二(SB***)(重写的数据)
Remove "1 Gem A"{ParentBody "1 Gem"}
Remove "1 Gem B"{ParentBody "1 Gem"}
Remove "1 Gem Aa"{ParentBody "1 Gem A"}
Remove "1 Gem Ab"{ParentBody "1 Gem A"}
Remove "1 Gem Ba"{ParentBody "1 Gem B"}
Remove "1 Gem Bb"{ParentBody "1 Gem B"}
Star "HIP 28734 A"
{
	ParentBody "HIP 28734"
	Class      "K0III"
  MassSol    1.94
  FeH        -0.01

	/* BinaryOrbit
	{
		PeriodDays      4877.6
		Separation      9.399
    Eccentricity    0.3709
		Inclination     59.33
		AscendingNode   353.67
    Epoch           2445119
		ArgOfPericenter 201.29
		MeanAnomaly     0
    //SemiAmplitude   11.34
	} */
}

Barycenter "HIP 28734 B"
{
	ParentBody "HIP 28734"
	Orbit
	{
    PeriodDays      4877.6
		Separation      9.399
    Eccentricity    0.3709
		Inclination     59.33
		AscendingNode   353.67
    Epoch           2445119
		ArgOfPericenter 21.29
		MeanAnomaly     0
    //SemiAmplitude   8.07
	}
}

Star "HIP 28734 Ba"
{
	ParentBody "HIP 28734 B"
	Class      "F6IV"
	MassSol    1.707

	Orbit
	{
		PeriodDays      9.6
		//SemiMajorAxis   0.1234
    Eccentricity    0.0024
		Inclination     93.2
		AscendingNode   137.5
		ArgOfPericenter 334.3
		MeanAnomaly     0
    //SemiAmplitude   52
	}
}

Star "HIP 28734 Bb"
{
	ParentBody "HIP 28734 B"
	Class      "G2V"
  MassSol    1.012

	Orbit
	{
    PeriodDays      9.6
		//SemiMajorAxis   0.1234
    Eccentricity    0.0024
		Inclination     93.2
		AscendingNode   137.5
		ArgOfPericenter 154.3
		MeanAnomaly     0
    //SemiAmplitude   87.7
	}
}

// 司怪四(RS**)
Remove "CHI1 Ori A"{ParentBody "CHI1 Ori"}
Remove "CHI1 Ori B"{ParentBody "CHI1 Ori"}
Star "HIP 27913 A"
{
	ParentBody "HIP 27913"
	Class      "G0 V"
  MassSol    1.01
	RadSol     0.979
  Luminosity 1.081
  Teff       5955
  FeH        -0.01
  RotationPeriod 124.8
  Age        0.3

	Orbit
	{
		PeriodDays      5156.291
		Eccentricity    0.452
		Inclination     95.937
		AscendingNode   126.36
	  Epoch           2451468.2
		ArgOfPericenter 291.527
		MeanAnomaly     0
    //SemiAmplitude   1.876
	}
}

Star "HIP 27913 B"
{
	ParentBody "HIP 27913"
	Class      "M"
	MassSol    0.15
  Age        0.07

	Orbit
	{
    PeriodDays      5156.291
		Eccentricity    0.452
		Inclination     95.937
		AscendingNode   126.36
	  Epoch           2451468.2
		ArgOfPericenter 111.527
		MeanAnomaly     0
	}
}

// 座旗一(SB**)
Star "HIP 32562 A"
{
	ParentBody "HIP 32562"
	Class      "K0.5III"
  MassSol    2.02
	RadSol     17.72
  Luminosity 123.4
  Teff       4574
  FeH        -0.08
  Age        1.55

	Orbit
	{
		PeriodDays      5996
		Eccentricity    0.044
	  Epoch           2452556
		ArgOfPericenter 42
		MeanAnomaly     0
    //SemiAmplitude   3.24
	}
}

Star "HIP 32562 B"
{
	ParentBody "HIP 32562"
	Class      "A9.9 V"

	Orbit
	{
    PeriodDays      5996
		Eccentricity    0.044
	  Epoch           2452556
		ArgOfPericenter 222
		MeanAnomaly     0
	}
}
