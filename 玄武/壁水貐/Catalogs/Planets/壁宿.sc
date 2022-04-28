// 壁宿一
Remove "GAM Peg A"{ParentBody "GAM Peg"}
Remove "GAM Peg B"{ParentBody "GAM Peg"}

// 壁宿二
Remove "Alpheratz A"{ParentBody "Alpheratz"}
Remove "Alpheratz B"{ParentBody "Alpheratz"}
Star "HIP 677 A"
{
	ParentBody "HIP 677"
	Class      "B8IVpMnHg"
	MassSol    3.6
  RadSol     2.7
  LumBol     240
  Teff       13800
  FeH        0.2
  RotationDays 2.38195
  Age        0.06

	Orbit
	{
		PeriodDays      96.7015
		//SemiMajorAxis   0.236
		Eccentricity    0.535
		Inclination     105.6
		AscendingNode   284.4
    Epoch           2447374.563
		ArgOfPericenter 77.4
		MeanAnomaly     0
	}
}

Star "HIP 677 B"
{
	ParentBody "HIP 677"
	Class      "A3 V"
	MassSol    1.85
	RadSol     1.65
  LumBol     13
  Teff       8500
  FeH        0.2
  Age        0.07

  Orbit
	{
		PeriodDays      96.7015
		//SemiMajorAxis   0.236
		Eccentricity    0.535
		Inclination     105.6
		AscendingNode   284.4
    Epoch           2447374.563
		ArgOfPericenter 257.4
		MeanAnomaly     0
	}
}

// 霹雳五(*)
Star	"HIP 118268 A"
{
	ParentBody     "HIP 118268"
	Class	       "F4 IV"
  MassSol        1.22
  Luminosity     21
  Teff           6641
  FeH            -0.09
  Age            1.337

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0742325
		Eccentricity    0
		Inclination     169.952
		AscendingNode   2.0521
		ArgOfPericenter -86.5458
		MeanAnomaly     176.473
	}
}

Star	"HIP 118268 B"
{
	ParentBody     "HIP 118268"
	Class	       "F2.7 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0742325
		Eccentricity    0
		Inclination     169.952
		AscendingNode   2.0521
		ArgOfPericenter 93.4542
		MeanAnomaly     176.473
	}
}

// 天厩一
Star "HIP 1366 A"
{
	ParentBody "HIP 1366"
	Class      "A2V"
  Luminosity 113
  Teff       8960
  FeH        0.14

	Orbit
	{
		PeriodDays      1033
		//SemiMajorAxis   1
		Eccentricity    0.95
		Inclination     69
		AscendingNode   263
    //Epoch           238
		ArgOfPericenter 269
		MeanAnomaly     0
	}
}

Star "HIP 1366 B"
{
	ParentBody "HIP 1366"
	Class      "A"

	Orbit
	{
		PeriodDays      1033
		//SemiMajorAxis   1
		Eccentricity    0.95
		Inclination     69
		AscendingNode   263
    //Epoch           238
		ArgOfPericenter 89
		MeanAnomaly     0
	}
}
