// 鬼宿一(PM**)(到底几星???)
Star	"HIP 41822 A"
{
	ParentBody     "HIP 41822"
	Class	         "K5III"
	RadSol          40.02
	Luminosity      353.1
	Teff            3955

	Orbit
	{
		RefPlane        "Equator"
		Period          1753.66
		Eccentricity    0.878021
		Inclination     -92.1436
		AscendingNode   126.84
		ArgOfPericenter 160.163
		MeanAnomaly     -75.3828
	}
}

Star	"HIP 41822 B"
{
	ParentBody     "HIP 41822"
	Class	         "A6.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          1753.66
		Eccentricity    0.878021
		Inclination     -92.1436
		AscendingNode   126.84
		ArgOfPericenter 340.163
		MeanAnomaly     -75.3828
	}
}

// 鬼宿二(单星)
Remove "ETA Cnc A"{ParentBody "ETA Cnc"}
Remove "ETA Cnc B"{ParentBody "ETA Cnc"}

// 鬼宿四(*)(又是个没伴星和轨道数据的三星系统)
Barycenter	"HIP 42911 A"
{
	ParentBody     "HIP 42911"
	BinaryOrbit
	{
		RefPlane        "Equator"
		Period          6.27042
		Eccentricity    0.831836
		Inclination     170.5
		AscendingNode   -16.3315
		ArgOfPericenter 24.2433
		MeanAnomaly     -174.21
	}
}

Star	"HIP 42911 Aa"
{
	ParentBody     "HIP 42911 A"
	Class	         "K0III"
  MassSol        1.71
  RadSol         11
  Luminosity     52
  Teff           4637
  FeH            -0.13
  Age            2.45

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0346386
		Eccentricity    0
		Inclination     -143.771
		AscendingNode   16.2947
		ArgOfPericenter -152.566
		MeanAnomaly     166.372
	}
}

Star	"HIP 42911 Ab"
{
	ParentBody     "HIP 42911 A"
	Class	         "F5.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0346386
		Eccentricity    0
		Inclination     -143.771
		AscendingNode   16.2947
		ArgOfPericenter 27.4336
		MeanAnomaly     166.372
	}
}

Star	"HIP 42911 B"
{
	ParentBody     "HIP 42911"
	Class	         "K9.3 V"

	/* Orbit
	{
		RefPlane        "Equator"
		Period          6.27042
		Eccentricity    0.831836
		Inclination     170.5
		AscendingNode   -16.3315
		ArgOfPericenter -155.757
		MeanAnomaly     -174.21
	} */
}

// 爟二(**)
Star	"HIP 40881 A"
{
	ParentBody     "HIP 40881"
	Class	         "B9.5V"
	MassSol        2.1
	Luminosity     78
	Teff           9500
	Age            0.105

	Orbit
	{
		RefPlane        "Equator"
		Period          2.52412
		Eccentricity    0.72067
		Inclination     92.0351
		AscendingNode   -2.20365
		ArgOfPericenter -56.1395
		MeanAnomaly     145.821
	}
}

Star	"HIP 40881 B"
{
	ParentBody     "HIP 40881"
	Class	         ""
	MassSol        0.8
	Teff           4562
	FeH            -0.15

	Orbit
	{
		RefPlane        "Equator"
		Period          2.52412
		Eccentricity    0.72067
		Inclination     92.0351
		AscendingNode   -2.20365
		ArgOfPericenter 123.86
		MeanAnomaly     145.821
	}
}

// 爟四(a2**)
Star	"HIP 40240 A"
{
	ParentBody     "HIP 40240"
	Class	         "A0:V:spSiSr"
	Luminosity     327.24
	Teff           10080

	Orbit
	{
		PeriodDays      635.73
		Eccentricity    0.55
		Epoch           2422045
		ArgOfPericenter 196
		MeanAnomaly     0
		//SemiAmplitude   9.6
	}
}

Star	"HIP 40240 B"
{
	ParentBody     "HIP 40240"
	Class	         "A5.8 V"

	Orbit
	{
		PeriodDays      635.73
		Eccentricity    0.55
		Epoch           2422045
		ArgOfPericenter 16
		MeanAnomaly     0
	}
}

// 天狗七(PM**)
Star	"HIP 43825 A"
{
	ParentBody     "HIP 43825"
	Class	         "A3IV"
	MassSol        1.84
	RadSol         1.6
	Luminosity     59
	Teff           8609
	Age            0.296

	Orbit
	{
		RefPlane        "Equator"
		Period          2745.85
		Eccentricity    0.359611
		Inclination     -171.889
		AscendingNode   -52.8433
		ArgOfPericenter 72.5936
		MeanAnomaly     100.425
	}
}

Star	"HIP 43825 B"
{
	ParentBody     "HIP 43825"
	Class	         "F3.5 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          2745.85
		Eccentricity    0.359611
		Inclination     -171.889
		AscendingNode   -52.8433
		ArgOfPericenter 252.594
		MeanAnomaly     100.425
	}
}

// 外厨二(***)
Star	"HIP 42835 A"
{
	ParentBody     "HIP 42835"
	Class	         "G1Ib"
	MassSol         5.2
	RadSol          110
	Teff            5370
	FeH             -0.01
	Age             0.089

	Orbit
	{
		RefPlane        "Static"
	}
}

Star	"HD 74394/BD-06 2707"
{
	ParentBody     "HIP 42835"
	Class	         "B9.5V"

	Orbit
	{
		SemiMajorAxis   18880
		ArgOfPericenter 315
		MeanAnomaly     0
	}
}

Star	"HIP 42835 C"
{
	ParentBody     "HIP 42835"
	Class	         ""
	MassSol        3 // ?

	Orbit
	{
		SemiMajorAxis   13452
	}
}

// 天社一(WR****)
// 全天最亮的沃尔夫-拉叶星
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=39953
Remove "Regor A"{ParentBody "Regor"}
Remove "Regor B"{ParentBody "Regor"}
Remove "Regor Aa"{ParentBody "Regor A"}
Remove "Regor Ab"{ParentBody "Regor A"}
Remove "Regor Ba"{ParentBody "Regor B"}
Remove "Regor Bb"{ParentBody "Regor B"}
// NOIRLab又列出了两颗恒星(Ac和C)，不知道是不是也属于这个系统的
Barycenter "GAM2 Vel A/CD-46 3847/HD 68273 A/HR 3207/SAO 219504"
{
	ParentBody "HIP 39953"
	BinaryOrbit
	{
		Period          177895
		Separation      15607.2
	}
}

Star "GAM2 Vel Aa"
{
	ParentBody "GAM2 Vel A"
	Class      "WC8"
	MassSol    9
	RadSol     6
	Luminosity 170000 // 补光
	LumBol     170000
	Teff       57000
	Age        0.0035

	Orbit
	{
		PeriodDays      78.53
		//Separation      1.2
		Eccentricity    0.326
		Inclination     65
		Epoch           2450120.5
		ArgOfPericenter 248
		MeanAnomaly     0
		//SemiAmplitude   122
	}
}

Star "GAM2 Vel Ab"
{
	ParentBody "GAM2 Vel A"
	Class      "O7.5III"
	MassSol    28.5
	RadSol     17
	Luminosity 280000 // 补光
	LumBol     280000
	Teff       35000
	Age        0.0035

	Orbit
	{
		PeriodDays      78.53
		//Separation      1.2
		Eccentricity    0.326
		Inclination     65
		Epoch           2450120.5
		ArgOfPericenter 68
		MeanAnomaly     0
		//SemiAmplitude   38.4
	}
}

Barycenter "GAM1 Vel B/CD-46 3846/HD 68243/HR 3206/SAO 219501"
{
	ParentBody "HIP 39953"
	/* BinaryOrbit
	{
		Period          177895
		Separation      15607.2
	} */
}

Star "GAM1 Vel Ba"
{
	ParentBody "GAM1 Vel B"
	Class      "B2III"
	MassSol    14
	AbsMagn    -3.62
	Oblateness 0
	Age        0.008

	Orbit
	{
		PeriodDays      1.4826
		Epoch           2437663.539
		Eccentricity    0.06
		ArgOfPericenter 17.6
		MeanAnomaly     0
	}
}

Star "GAM1 Vel Bb"
{
	ParentBody "GAM1 Vel B"
	Class      ""
	MassSol    1.44

	Orbit
	{
		PeriodDays      1.4826
		Epoch           2437663.539
		Eccentricity    0.06
		ArgOfPericenter 197.6
		MeanAnomaly     0
	}
}

// 天社二(V**)
Star	"HIP 42570 A"
{
	ParentBody     "HIP 42570"
	Class	         "F0Ia"
	MassSol        12.63
	Luminosity     38000
	Teff           5750
	FeH            0.56

	BinaryOrbit
	{
		Separation      37125
	}
}

Star	"HIP 42570 B"
{
	ParentBody     "HIP 42570"
	Class	         ""
	MassSol        10.7916 // Generated

	/* BinaryOrbit
	{
		Separation      37125
	} */
}

// 天社三(EB***)
Remove "DEL Vel A"{ParentBody "DEL Vel"}
Remove "DEL Vel B"{ParentBody "DEL Vel"}
Remove "DEL Vel Aa"{ParentBody "DEL Vel A"}
Remove "DEL Vel Ab"{ParentBody "DEL Vel A"}
Barycenter "HIP 42913 A"
{
	ParentBody "HIP 42913"
	BinaryOrbit
	{
		Period          143.2
		Eccentricity    0.475
		Inclination     105.1
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 42913 Aa"
{
	ParentBody "HIP 42913 A"
	Class      "A1V(a)n" // A2IV
	MassSol    2.43
	RadSol     2.79 // 2.97
	Luminosity 67
	Teff       9440
	FeH        -0.33
	RotationPeriod 25.2

	Orbit
	{
		PeriodDays      45.1503
		Eccentricity    0.287
		Inclination     89.04
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 42913 Ab"
{
	ParentBody "HIP 42913 A"
	Class      "A4V"
	MassSol    2.27
	RadSol     2.37 // 2.52
	Luminosity 51
	Teff       9830
	Age        0.4

	Orbit
	{
		PeriodDays      45.1503
		Eccentricity    0.287
		Inclination     89.04
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 42913 B"
{
	ParentBody "HIP 42913"
	Class      "F8V"
	MassSol    1.35 // 1.46
	RadSol     1.43
	Luminosity 3.5
	Teff       6600

	/* Orbit
	{
		Period          143.2
		Eccentricity    0.475
		Inclination     105.1
		ArgOfPericenter 180
		MeanAnomaly     0
	} */
}

// 天社五(SB**)
Star	"HIP 45941 A"
{
	ParentBody     "HIP 45941"
	Class	         "B2IV"

	Orbit
	{
		PeriodDays      116.65
		Eccentricity    0.19
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   46.5
	}
}

Star	"HIP 45941 B"
{
	ParentBody     "HIP 45941"
	Class	         "B5.5 V"

	Orbit
	{
		PeriodDays      116.65
		Eccentricity    0.19
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
