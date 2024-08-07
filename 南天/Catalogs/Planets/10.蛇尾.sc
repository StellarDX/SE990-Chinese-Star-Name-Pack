Planet "BET Hyi b"
{
	ParentBody     "BET Hyi"
	DiscMethod     "RadVel"
	DiscDate       "2002"
	MassJup        4

	Orbit
	{
		Period          20
		SemiMajorAxis   8
	}
}

// Object * nu. Oct  ---  Spectroscopic Binary  ---  OID=@3320298   (@@71766,7)  ---  coobox=23611 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),High Proper Motion Star,Spectroscopic Binary,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "NU Oct A" {ParentBody "NU Oct"}
Remove "NU Oct B" {ParentBody "NU Oct"}
Remove "NU Oct A b" {ParentBody "NU Oct A"}
Star "NU Oct A"
{
	DateUpdated     "2024-08-04"
	ParentBody      "GJ 9744"
	Class           "K1III"
	AbsMagn         2.3
	MassSol         1.61 // 1.04
	RadSol          5.81 // 5.9
	LumBol          17.53
	Teff            4860
	FeH             0.18
	Age             2.5 // 3

	BinaryOrbit     
	{
		PeriodDays      1050.69
		Separation      2.62959
		Eccentricity    0.23680
		Inclination     70.8
		AscendingNode   87
		ArgOfPericenter 254.970
		MeanAnomaly     0
	}
}

Star "NU Oct B"
{
	DateUpdated     "2024-08-04"
	ParentBody      "GJ 9744"
	Class           ""
	MassSol         0.585
}

// Object * nu. Oct b  ---  Extra-solar Planet Candidate  ---  OID=@9699882   (@@-1,255)  ---  coobox=23611
// Object types: Star,Extra-solar Planet Candidate
Planet	"NU Oct Ab/HD 205478b"
{
	ParentBody     "NU Oct A"
	DiscMethod     "RadVel"
	DiscDate       "2016"
	MassJup        2.1059

	Orbit
	{
		PeriodDays      414.8
		SemiMajorAxis   1.276
		Eccentricity    0.086
		Inclination     112.5
		ArgOfPericen    350
	}
}

// Object * alf Oct  ---  Spectroscopic Binary  ---  OID=@3335338   (@@71759,9)  ---  coobox=23612 
// Object types: High Proper Motion Star,Eclipsing Binary,High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "ALF Oct A" {ParentBody "ALF Oct"}
Remove "ALF Oct B" {ParentBody "ALF Oct"}
Star "ALF Oct A"
{
	DateUpdated     "2024-08-04"
	ParentBody      "Gaia DR3 6368303006559319424"
	Class           "F4III"
	AbsMagn         1.93
	MassSol         1.42
	RadSol          3.69
	LumBol          18.959050086911155 // 计算的值
	Teff            6270
	FeH             0.07
	Age             1.5

	BinaryOrbit     
	{
		PeriodDays      9.073
		Eccentricity    0.39
		Epoch           2435302.404
		ArgOfPericenter 96
		MeanAnomaly     0
	}
}

Star "ALF Oct B"
{
	DateUpdated     "2024-08-04"
	ParentBody      "Gaia DR3 6368303006559319424"
	Class           "F5III"
}