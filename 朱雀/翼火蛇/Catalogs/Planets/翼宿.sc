// 翼宿二(PM**)
Remove "GAM Crt A"{ParentBody "GAM Crt"}
Remove "GAM Crt B"{ParentBody "GAM Crt"}
Star "HIP 55705 1"
{
  ParentBody "HIP 55705"
  Class      "A9V"
  MassSol    1.81
  RadSol     1.3
  Luminosity 18.8
  Teff       8020
  FeH        -0.01
  Age        0.757

  BinaryOrbit
  {
    Epoch           2455196.95538591
    Separation      125.6
    PositionAngle   93.1
  }
}

Star "HIP 55705 2"
{
  ParentBody "HIP 55705"
  Class      ""
  MassSol    0.75

  /* BinaryOrbit
  {
    Epoch           2455196.95538591
    Separation      125.6
    PositionAngle   93.1
  } */
}

// 翼宿三(**)
Star	"HIP 57283 A"
{
	ParentBody     "HIP 57283"
	Class	         "G8III"
  RadSol         13
  Luminosity     157
  Teff           4992
  FeH            0.03
  Age            0.251

  BinaryOrbit
  {
    Epoch           2448257.35360907
    Separation      19.9996
    PositionAngle   22
  }
}

Star	"HIP 57283 B"
{
	ParentBody     "HIP 57283"
	Class	         "B9.3 V"

  /* BinaryOrbit
  {
    Epoch           2448257.35360907
    Separation      19.9996
    PositionAngle   22
  } */
}

// 翼宿四(SB**)
Star	"HIP 55598 A"
{
	ParentBody     "HIP 55598"
	Class	         "F5III"
  MassSol        1.78
  RadSol         2.8
  Luminosity     14.4
  Teff           6582
  FeH            -0.15

	Orbit
	{
		PeriodDays      1940
		Eccentricity    0.54
    Epoch           2432722
		ArgOfPericenter 320.7
		MeanAnomaly     0
    //SemiAmplitude   2.5
	}
}

Star	"HIP 55598 B"
{
	ParentBody     "HIP 55598"
	Class	         "K4.6 V"

  Orbit
	{
		PeriodDays      1940
		Eccentricity    0.54
    Epoch           2432722
		ArgOfPericenter 140.7
		MeanAnomaly     0
	}
}

// 翼宿八(PM**)
Star	"HIP 56802 A"
{
	ParentBody     "HIP 56802"
	Class	         "F6.5V"
  MassSol        1.19
  Teff           6230
  FeH            -0.15
  Age            4.45

  BinaryOrbit
  {
    Epoch           2456657.92418103
    Separation      25
    PositionAngle   248
  }
}

Star	"HIP 56802 B"
{
	ParentBody     "HIP 56802"
	Class	         "M3"
  MassSol        0.57

  Orbit
	{
    Epoch           2456657.92418103
    Separation      25
    PositionAngle   248
	}
}

// 翼宿十六(SB**)
Star	"HIP 54682 A"
{
	ParentBody     "HIP 54682"
	Class	         "A2III"
  Luminosity     147
  Teff           8830

	Orbit
	{
		Period          6
    //SemiMajorAxis   9.3
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 54682 B"
{
	ParentBody     "HIP 54682"
	Class	         "DA1.4"
  MassSol        0.43
  RadSol         0.027
  Teff           36885

  Orbit
	{
		Period          6
    //SemiMajorAxis   9.3
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 翼宿廿(**)
Star	"HIP 54204 A"
{
	ParentBody     "HIP 54204"
	Class	         "F4V"
  MassSol        1.93
  RadSol         3.19
  Luminosity     17.798
  Teff           6637
  FeH            -0.1
  Age            1.3

	Orbit
	{
		Period          7.5535
    Eccentricity    0.349
    Inclination     96.5
    AscendingNode   224
    Epoch           2445501.60121927
		ArgOfPericenter 163
		MeanAnomaly     0
	}
}

Star	"HIP 54204 B"
{
	ParentBody     "HIP 54204"
	Class	         "F7V"
  MassSol        1.93

  Orbit
	{
    Period          7.5535
    Eccentricity    0.349
    Inclination     96.5
    AscendingNode   224
    Epoch           2445501.60121927
		ArgOfPericenter 343
		MeanAnomaly     0
	}
}

// 东瓯一(*)
Remove "ETA Ant A"{ParentBody "ETA Ant"}
Remove "ETA Ant B"{ParentBody "ETA Ant"}
Star	"HIP 48926 A"
{
	ParentBody     "HIP 48926"
	Class	         "F1V"
  MassSol        1.55
  RadSol         1.72
  Luminosity     6.6
  Teff           7132
  FeH            -0.2
  Age            0.9

	BinaryOrbit
	{
    Separation      1032.3
	}
}

Star	"HIP 48926 B"
{
	ParentBody     "HIP 48926"
	Class	         "G1.1 V"

  BinaryOrbit
	{
    Separation      1032.3
	}
}
