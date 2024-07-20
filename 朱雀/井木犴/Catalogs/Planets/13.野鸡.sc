// Object * nu.02 CMa b  ---  Extra-solar Planet  ---  OID=@6269834   (@@-1,255)  ---  coobox=7350
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "NU2 CMa b/7 CMa b/HD 47205b"
{
	ParentBody     "7 CMa"
	DiscMethod     "RadVel"
	DiscDate       "2011"
	MassJup        1.895
	Oblateness     0

	Surface{Preset "jupiter_temperate_reddish.cfg"}

	Clouds
	{
		Height          111
		Velocity        2.35e+03
		BumpHeight      50.7
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        3
		mainOctaves     12
		Coverage        0.125
		stripeZones     10
		stripeFluct     0.75
		stripeTwist     20
	}

	Atmosphere
	{
		Model          "Venus"
		Bright          10
		Opacity         1
		SkyLight        3.33
		Hue             0
		Saturation      0
	}

	Orbit
	{
		Epoch           2454093
		PeriodDays      736.9
		SemiMajorAxis   1.761
		Eccentricity    0.055
		ArgOfPericen    116.4
	}
}

// Object * nu.02 CMa c  ---  Extra-solar Planet  ---  OID=@14954830   (@@-1,255)  ---  coobox=7350
// Object types: Extra-solar Planet,Star
Planet	"NU2 CMa c/7 CMa c"
{
	ParentBody     "7 CMa"
	DiscMethod     "RadVel"
	DiscDate       "2019"
	MassJup        0.906
	Oblateness     0

	Orbit
	{
		PeriodDays      988.9
		SemiMajorAxis   2.143
		Eccentricity    0.046
		ArgOfPericen    226.6
	}
}
