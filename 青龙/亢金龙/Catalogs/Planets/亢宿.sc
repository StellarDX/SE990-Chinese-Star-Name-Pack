// 亢宿二(PM**)
Star "HIP 69701 A"
{
	ParentBody "HIP 69701"
	Class      "F7IV"
	MassSol    1.5
	RadSol     2.5
	Luminosity 8.7
	Teff       6282
	FeH        -0.11

	Orbit
	{
		Period          55
		Eccentricity    0.1
		Inclination     60
		AscendingNode   3
		Epoch           2433538.09299820
		ArgOfPericenter 156
		MeanAnomaly     0
	}
}

Star "HIP 69701 B"
{
	ParentBody "HIP 69701"
	Class      ""
	MassSol    0.6

	Orbit
	{
		Period          55
		Eccentricity    0.1
		Inclination     60
		AscendingNode   3
		Epoch           2433538.09299820
		ArgOfPericenter 336
		MeanAnomaly     0
	}
}

// 亢宿三(PM**)
Star	"HIP 70755 A"
{
	ParentBody     "HIP 70755"
	Class	         "G2IV"
	MassSol         1.8
	RadSol          4
	Luminosity      12.6
	Teff            5534
	FeH             -0.06
	Age             1.5

	BinaryOrbit
	{
		Separation      185.76
	}
}

Star	"HIP 70755 B"
{
	ParentBody     "HIP 70755"
	Class	         "K2.7 V"

	BinaryOrbit
	{
		Separation      185.76
	}
}

// 亢宿四(SB**)
Remove "LAM Vir A"{ParentBody "LAM Vir"}
Remove "LAM Vir B"{ParentBody "LAM Vir"}
Star "HIP 69974 A"
{
	ParentBody "HIP 69974"
	Class      "A1V"
	MassSol    1.897
	RadSol     2.35
	Luminosity 20.84
	Teff       8280
	FeH        0.0097
	Age        0.935

	Orbit
	{
		PeriodDays      206.7321
		Eccentricity    0.061
		Inclination     109.86
		AscendingNode   196.4
		Epoch           2453070.8
		ArgOfPericenter 92.28
		MeanAnomaly     0
		//SemiAmplitude   24.78
	}
}

Star "HIP 69974 B"
{
	ParentBody "HIP 69974"
	Class      "A1V"
	MassSol    1.721
	RadSol     1.84
	Luminosity 12.58
	Teff       8280

	Orbit
	{
		PeriodDays      206.7321
		Eccentricity    0.061
		Inclination     109.86
		AscendingNode   196.4
		ArgOfPericenter 272.28
		Epoch           2453070.8
		MeanAnomaly     0
		//SemiAmplitude   27.308
	}
}

// 左摄提二(***)
Remove "PI1 Boo"{ParentBody "PI Boo"}
Remove "PI2 Boo"{ParentBody "PI Boo"}
Barycenter	"PI1 Boo AB/HIP 71762 A"
{
	ParentBody     "HIP 71762"
	BinaryOrbit
	{
		Epoch           2455196.95538591
		Separation      538.6
		PositionAngle   110.5
	}
}

Star "PI1 Boo A/HD 129174 A/HR 5475 A/SAO 101138"
{
	ParentBody "HIP 71762 A"
	Class      "B9IIIpMnHgSi"
	MassSol    3.49
	RadSol     3.2
	Luminosity 214
	Teff       12052
	FeH        0.18

	Orbit
	{
		RefPlane        "Equator"
		Period          0.108626
		Eccentricity    0.108083
		Inclination     83.5616
		AscendingNode   -133.751
		ArgOfPericenter -91.8551
		MeanAnomaly     34.8507
	}
}

Star "PI1 Boo B(?)"
{
	ParentBody     "HIP 71762 A"
	Class	         "B4.3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.108626
		Eccentricity    0.108083
		Inclination     83.5616
		AscendingNode   -133.751
		ArgOfPericenter 88.1449
		MeanAnomaly     34.8507
	}
}

Star	"PI2 Boo B/HD 129175 B/HR 5476 B/SAO 101139"
{
	ParentBody     "HIP 71762"
	Class	         "A6V"

	/*BinaryOrbit
	{
		Epoch           2455196.95538591
		Separation      538.6
		PositionAngle   110.5
	}*/
}

// 左摄提三(**)
Remove "ZET Boo A"{ParentBody "ZET Boo"}
Remove "ZET Boo B"{ParentBody "ZET Boo"}
Star "HIP 71795 A/HD 129247 A/HR 5478"
{
	ParentBody "HIP 71795"
	Class      "A2III"
	Luminosity 81

	Orbit
	{
		PeriodDays      45460
		Eccentricity    0.9977
		Inclination     102.3
		AscendingNode   8.2
		Epoch           2460183.5
		ArgOfPericenter 82.9
		MeanAnomaly     0
	}
}

Star "HIP 71795 B/HD 129246 B/HR 5477"
{
	ParentBody "HIP 71795"
	Class      "A2III"

	Orbit
	{
		Period          124.5479
		Eccentricity    0.9977
		Inclination     102.3
		AscendingNode   8.2
		Epoch           2460183.5
		ArgOfPericenter 262.9
		MeanAnomaly     0
	}
}

// 右摄提一(*)
Remove "Muphrid A"{ParentBody "Muphrid"}
Remove "Muphrid B"{ParentBody "Muphrid"}
Star "HIP 67927 A"
{
	ParentBody "HIP 67927"
	Class      "G0IV"
	MassSol    1.71
	RadSol     2.672
	Luminosity 8.89
	Teff       6100
	FeH        0.29
	Age        2.7

	Orbit
	{
		PeriodDays      494
		Eccentricity    0.26
		Inclination     115.7
		AscendingNode   75.2
		ArgOfPericenter 326.3
		Epoch           2428136.2
		MeanAnomaly     0
	}
}

Star "HIP 67927 B"
{
	ParentBody     "HIP 67927"
	Class	         "M7"

	Orbit
	{
		PeriodDays      494
		Eccentricity    0.26
		Inclination     115.7
		AscendingNode   75.2
		ArgOfPericenter 146.3
		Epoch           2428136.2
		MeanAnomaly     0
	}
}

// 右摄提二(Ro**)
Remove "TAU Boo A"{ParentBody "TAU Boo"}
Remove "TAU Boo B"{ParentBody "TAU Boo"}
Star "HIP 67275 A"
{
	ParentBody "HIP 67275"
	Class      "F7IV"
	MassSol    1.39
	RadSol     1.42
	Luminosity 3.06
	Teff       6399
	FeH        0.26
	RotationPeriod 79.44
	Age        1.6

	Orbit
	{
		Period          2420
		Eccentricity    0.87
		Inclination     47.2
		AscendingNode   191.8
		ArgOfPericenter 110.7
		MeanAnomaly     0
	}
}

Star "HIP 67275 B"
{
	ParentBody "HIP 67275"
	Class      "M3V"
	MassSol    0.49
	RadSol     0.48

	Orbit
	{
		Period          2420
		Eccentricity    0.87
		Inclination     47.2
		AscendingNode   191.8
		ArgOfPericenter 290.7
		MeanAnomaly     0
	}
}

// 阳门一(**)
Remove "b Cen A"{ParentBody "HIP 71865"}
Remove "b Cen B"{ParentBody "HIP 71865"}
Star "HIP 71865 A"
{
	ParentBody "HIP 71865"
	Class      "B2.5V"
	MassSol    5
	RadSol     2.93
	Luminosity 637.01
  Teff       18310
  Age        0.015

	BinaryOrbit
	{
		Separation  1
	}
}

Star "HIP 71865 B"
{
	ParentBody "HIP 71865"
	MassSol    4.4

	BinaryOrbit
	{
		Separation  1
	}
}

// 折威七(LP**)
Star	"HIP 73714 A"
{
	ParentBody     "HIP 73714"
	Class	         "M2.5III"
	MassSol         2.2
	RadSol          108
	Luminosity      1820
	Teff            3596
	FeH             0

	BinaryOrbit
	{
		Separation       5280
	}
}

Star	"HIP 73714 B"
{
	ParentBody     "HIP 73714"
	Class	         "A0.7 V"

	BinaryOrbit
	{
		Separation       5280
	}
}
