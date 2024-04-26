// 柳宿一(似乎是光学伴星)
Remove "DEL Hya A"{ParentBody "DEL Hya"}
Remove "DEL Hya B"{ParentBody "DEL Hya"}

// 柳宿四(**)
Star	"HIP 43234 A"
{
	ParentBody     "HIP 43234"
	Class	         "A0Vn"
  MassSol        3.24
  RadSol         2
  Luminosity     242
  Teff           9795
  Age            0.35

	BinaryOrbit
	{
		Epoch           2451545
		Separation      1318.9
		PositionAngle   146
	}
}

Star	"HIP 43234 B"
{
	ParentBody     "HIP 43234"
	Class	         "A6.7 V"

	/* BinaryOrbit
	{
		Epoch           2451545
		Separation      1318.9
		PositionAngle   146
	} */
}

// 柳宿五(重制)
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=43109%20
Remove "EPS Hya (ABCD)"{ParentBody "EPS Hya"}
Remove "EPS Hya E"{ParentBody "EPS Hya"}
Remove "EPS Hya (AB)"{ParentBody "EPS Hya (ABCD)"}
Remove "EPS Hya (CD)"{ParentBody "EPS Hya (ABCD)"}
Remove "EPS Hya A"{ParentBody "EPS Hya (AB)"}
Remove "EPS Hya B"{ParentBody "EPS Hya (AB)"}
Remove "EPS Hya C"{ParentBody "EPS Hya (CD)"}
Remove "EPS Hya D"{ParentBody "EPS Hya (CD)"}
Barycenter "HIP 43109 ABC"
{
  ParentBody "HIP 43109"
  BinaryOrbit // STF_1273 AB,D Gaia pos.
  {
    Period          10000 // 7378
  }
}

Star "HIP 43109 D"
{
  ParentBody "HIP 43109"
  Class      "M2"
  MassSol    0.54

  /* BinaryOrbit
  {
    Period          10000 // 7378
  } */
}

Barycenter "HIP 43109 AB"
{
  ParentBody "HIP 43109 ABC"
  Orbit // VB6_Izm2019  STF1273AB, Gr.3
  {
    Period          371.8983
    Epoch           2482926.14311736
    Eccentricity    0.472
    AscendingNode   162.5
    ArgOfPericenter 256.9
    Inclination     46.9
    MeanAnomaly     0
  }
}

Barycenter "HIP 43109 C"
{
  ParentBody "HIP 43109 ABC"
  Orbit
  {
		Period          371.8983
    Epoch           2482926.14311736
    Eccentricity    0.472
    AscendingNode   162.5
    ArgOfPericenter 76.9
    Inclination     46.9
    MeanAnomaly     0
  }
}

Star "HIP 43109 A"
{
  ParentBody "HIP 43109 AB"
  Class      "G5III"
  MassSol    2.47
  Luminosity 67
  Teff       5620
  FeH        -0.08

  Orbit
  {
    PeriodDays      5478.98
    Eccentricity    0.652
    Inclination     49.3
    Epoch           2437060.85
    ArgOfPericenter 254.66
    MeanAnomaly     0
    //SemiAmplitude   8.05
  }
}

Star "HIP 43109 B"
{
  ParentBody "HIP 43109 AB"
  Class      "F0V"
  MassSol    1.9

  Orbit
  {
    PeriodDays      5478.98
    Eccentricity    0.652
    Inclination     49.3
    Epoch           2437060.85
    ArgOfPericenter 74.66
    MeanAnomaly     0
  }
}

Star "HIP 43109 Ca"
{
  ParentBody "HIP 43109 C"
  Class      "F5"
  MassSol    1.21

  Orbit // SB9_533 1926ApJ....64..172S
  {
    PeriodDays      9.9047
    Eccentricity    0.62
    Epoch           2423800.008
    ArgOfPericenter 297.6
    MeanAnomaly     0
  }
}

Star "HIP 43109 Cb"
{
  ParentBody "HIP 43109 C"
  Class      ""
  MassSol    0.38

  Orbit
  {
    PeriodDays      9.9047
    Eccentricity    0.62
    Epoch           2423800.008
    ArgOfPericenter 117.6
    MeanAnomaly     0
  }
}

// 柳宿八(SB**)
Star	"HIP 45336 A"
{
	ParentBody     "HIP 45336"
	Class	         "B9.5V"
  MassSol        2.52
  Luminosity     52
  Teff           10099
  FeH            -0.42

	Orbit
	{
		RefPlane        "Equator"
		Period          1458.72
		Eccentricity    0.419067
		Inclination     -50.7148
		AscendingNode   -85.9262
		ArgOfPericenter 173.04
		MeanAnomaly     75.8373
	}
}

Star	"HIP 45336 B"
{
	ParentBody     "HIP 45336"
	Class	         "DA1.6"
  MassSol        1.21 // 0.68
  Teff           30700

	Orbit
	{
		RefPlane        "Equator"
		Period          1458.72
		Eccentricity    0.419067
		Inclination     -50.7148
		AscendingNode   -85.9262
		ArgOfPericenter 353.04
		MeanAnomaly     75.8373
	}
}

// 酒旗三(SB**)
Star	"HIP 46454 A"
{
	ParentBody     "HIP 46454"
	Class	         "G1V"
  MassSol        1.35
  Luminosity     6
  Teff           5940
  FeH            0.02
  Age            3.68

	Orbit
	{
		PeriodDays      42678.5
		Eccentricity    0.56
		Epoch           2436769
		ArgOfPericenter 304.6
		MeanAnomaly     0
    //SemiAmplitude   2.2
	}
}

Star	"HIP 46454 B"
{
	ParentBody     "HIP 46454"
	Class	         "G4.5 V"

  Orbit
	{
		PeriodDays      42678.5
		Eccentricity    0.56
		Epoch           2436769
		ArgOfPericenter 124.6
		MeanAnomaly     0
	}
}
