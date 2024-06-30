// Object * gam Eri  ---  Long-Period Variable Candidate  ---  OID=@693612   (@@14620,9)  ---  coobox=6350 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,Long-Period Variable Candidate,UV-emission Source 
Star "GAM Eri A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "GAM Eri"
	Class           "M0III-IIIb"
	AbsMagn         -1.19
	MassKg          8.27398035770688e+30 // log(g) = 1.52 cm/s^2
	RadSol          58.7
	LumBol          634
	Teff            3379
}

Star "GAM Eri B(?)"
{
	DateUpdated     "2024-06-29"
	ParentBody      "GAM Eri A"
	Class           "M"

	Orbit     
	{
		SemiMajorAxis   50
	}
}

// Object Gaia DR3 5111187420713057280  ---  High Proper Motion Star  ---  OID=@24972432   (@@-1,255)  ---  coobox=6350 
// Object types: High Proper Motion Star,Star 
Star "Gaia DR3 5111187420713057280"
{
	DateUpdated     "2024-06-29"
	ParentBody      "GAM Eri A"
	Class           ""
	MassSol         0.1

	Orbit     
	{
		SemiMajorAxis   1000
		ArgOfPericenter 235.5
		MeanAnomaly     0
	}
}

// Object * eps Eri  ---  BY Dra Variable  ---  OID=@643684   (@@15210,0)  ---  coobox=6289 
// Object types: Rotating Variable,BY Dra Variable,High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source,X-ray Source 
Remove "AEgir" {ParentBody "Ran"}
Star "EPS Eri A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "EPS Eri"
	Class           "K2V"
	AbsMagn         6.19
	MassSol         0.82
	RadSol          0.735
	LumBol          0.34
	Teff            5084
	FeH             -0.13
	RotationPeriod  273.6
	Age             0.400 // 0.8
}

// Object * eps Eri b  ---  Extra-solar Planet  ---  OID=@643750   (@@107862,18)  ---  coobox=6289
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"EPS Eri b/GJ 144 b/18 Eri b/HD 22049b/AEgir"
{
	ParentBody     "EPS Eri A"
	DiscMethod     "RadVel"
	DiscDate       "2000"
	MassJup        0.76
	Oblateness     0

	Surface{Preset "jupiter_temperate_reddish.cfg"}

	Clouds
	{
		Height          81.9
		Velocity        -873
		BumpHeight      33.9
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		RingsWinter     0.958
		ModulateBright  1
		mainFreq        0.78
		mainOctaves     12
		Coverage        0.44
		stripeZones     3.44
		stripeFluct     0.474
		stripeTwist     10.2
	}

	Atmosphere
	{
		Model          "Ethereal"
		Bright          10
		Opacity         1
		SkyLight        3
		Hue             0.4
		Saturation      1
	}

	Rings
	{
		InnerRadius     9.95e+04
		OuterRadius     2.1e+05
		EdgeRadius      1.33e+05
		MeanRadius      1.11e+05
		Thickness       0.554
		RocksMaxSize    0.0222
		RocksSpacing    1
		DustDrawDist    1.66e+03
		ChartRadius     1.33e+05
		RotationPeriod  7.07
		Brightness      1
		FrontBright     2.77
		BackBright      4.31
		Density         0.958
		Opacity         0.958
		SelfShadow      0.958
		PlanetShadow    0.958
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.11
		densityScale    1.44
		densityOffset   -0.481
		densityPower    0.963
		colorContrast   0.0512
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	Orbit
	{
		Epoch           2444411.54
		PeriodDays      2688.60
		SemiMajorAxis   3.53
		Eccentricity    0.26
		Inclination     130.60
		AscendingNode   206.07
		LongOfPericen   372.55
		MeanLongitude   372.55
	}
}

// Object * eps Eri c  ---  Extra-solar Planet  ---  OID=@643772   (@@132312,12)  ---  coobox=6289
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"EPS Eri c/GJ 144 c/HD 22049c/18 Eri c"
{
	ParentBody     "EPS Eri A"
	MassJup        0.1
	Oblateness     0

	Orbit
	{
		PeriodDays      102270.0
		SemiMajorAxis   40.0
		Eccentricity    0.3
	}
}

// Object * zet Eri  ---  Spectroscopic Binary  ---  OID=@634402   (@@15197,12)  ---  coobox=6276 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "ZET Eri A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "ZET Eri"
	Class           "kA4hA9mA9V"
	AbsMagn         1.97
	MassSol         1.85
	Radius          1296368.59702975 // 计算的值
	LumBol          10.3
	Teff            7575
	FeH             0.04
	Age             0.800

	BinaryOrbit     
	{
		PeriodDays      17.9297
		Eccentricity    0.14
		Epoch           2443051.07
		ArgOfPericenter 302
		MeanAnomaly     0
	}
}

Star "ZET Eri B"
{
	ParentBody      "ZET Eri"
	Class           "K4.8?"
}

// Object * pi. Cet  ---  Spectroscopic Binary  ---  OID=@1299245   (@@26666,0)  ---  coobox=11175 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Blue Object,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "PI Cet A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "PI Cet"
	Class           "B7IV"
	AbsMagn         -1.16
	MassSol         4.4
	RadSol          4.3
	LumBol          468
	Teff            12900
	FeH             0.28
	Age             0.0003

	BinaryOrbit     
	{
		PeriodDays      2722
		Eccentricity    0.0
		Epoch           2444852
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "PI Cet B"
{
	ParentBody      "PI Cet"
	Class           "A4?"
}

// Object * tau01 Eri  ---  High Proper Motion Star  ---  OID=@1280968   (@@26171,7)  ---  coobox=10998 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "TAU1 Eri A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "TAU1 Eri"
	Class           "F7V"
	AbsMagn         3.68
	MassSol         1.15
	Radius          835240.036332946 // log(g) = 4.34 cm/s^2
	LumBol          1.957506819738977 // 计算的值
	Teff            6231
	FeH             -0.08
	RotationPeriod  92.328

	BinaryOrbit     
	{
		PeriodDays      958
		Eccentricity    0.45
		Epoch           2439391.9
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "TAU1 Eri B"
{
	ParentBody      "TAU1 Eri"
	Class           "M0.6?"
}

// Object * tau03 Eri  ---  High Proper Motion Star  ---  OID=@628096   (@@12676,16)  ---  coobox=6696 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "TAU3 Eri A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "TAU3 Eri"
	Class           "A3IV-V"
	AbsMagn         1.91
	MassSol         1.78
	RadSol          1.9
	LumBol          13.7
	Teff            8251
	FeH             -0.21
	Age             0.476
	Oblateness      0.0654205607476635514018691588785 // Vsini = 133 Km/s
}

// Object * tau04 Eri  ---  Long-Period Variable  ---  OID=@635592   (@@13566,10)  ---  coobox=6671 
// Object types: Long-Period Variable,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "TAU4 Eri A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "TAU4 Eri"
	Class           "M3III-IIIaCa-1"
	AbsMagn         -0.79
	MassSol         1.95
	RadSol          103
	LumBol          1537
	Teff            3770

	BinaryOrbit     
	{
		Epoch           2456293
		Separation      536.96073178686 // 5.7 asec
		PositionAngle   291
	}
}

// Object * tau04 Eri B  ---  High Proper Motion Star  ---  OID=@23690392   (@@-1,255)  ---  coobox=6671 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "TAU4 Eri B/Gaia DR3 5099455184967336832/WDS J03195-2145B/** JC 1B/16 Eri B"
{
	ParentBody      "TAU4 Eri"
	Class           "B9.8?"
}

// Object * tau05 Eri  ---  Spectroscopic Binary  ---  OID=@666801   (@@13573,0)  ---  coobox=6684 
// Object types: Spectroscopic Binary,High Proper Motion Star,Spectroscopic Binary,Blue Object,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Star "TAU5 Eri A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "TAU5 Eri"
	Class           "B0V"
	AbsMagn         -0.51
	MassSol         3.30
	RadSol          3.2
	LumBol          188
	Teff            12514
	Age             0.157

	BinaryOrbit     
	{
		PeriodDays      6.2236
		Eccentricity    0.2
		Epoch           2424446.548
		ArgOfPericenter 133
		MeanAnomaly     0
	}
}

Star "TAU5 Eri B"
{
	DateUpdated     "2024-06-29"
	ParentBody      "TAU5 Eri"
	Class           "B9V"
	RadSol          2.6
}

// Object * tau08 Eri  ---  Spectroscopic Binary  ---  OID=@685407   (@@13275,12)  ---  coobox=6753 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Rotating Variable,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "TAU8 Eri A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "TAU8 Eri"
	Class           "B6V"
	AbsMagn         -0.67
	MassSol         5.0
	Radius          2637377.24522359 // 计算的值
	LumBol          256
	Teff            11858
	Age             0.0328

	BinaryOrbit     
	{
		PeriodDays      459
		Eccentricity    0.18
		Epoch           2450954
		ArgOfPericenter 296
		MeanAnomaly     0
	}
}

Star "TAU8 Eri B"
{
	ParentBody      "TAU8 Eri"
	Class           "M4.4?"
}

// Object * tau09 Eri  ---  alpha2 CVn Variable  ---  OID=@694547   (@@13600,11)  ---  coobox=6734 
// Object types: alpha2 CVn Variable,Rotating Variable,Pulsating Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "TAU9 Eri A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "TAU9 Eri"
	Class           "B9.5VpSi"
	AbsMagn         -0.44
	MassSol         3.6
	RadSol          3.06
	LumBol          209
	Teff            12580
	Age             0.140

	BinaryOrbit     
	{
		PeriodDays      5.95382
		Eccentricity    0.129
		Epoch           246991.65
		ArgOfPericenter 3.2
		MeanAnomaly     0
	}
}

Star "TAU9 Eri B"
{
	DateUpdated     "2024-06-30"
	ParentBody      "TAU9 Eri"
	Class           ""
	MassSol         1.6
	RadSol          1.5
	LumBol          6.3
	Teff            7530
}