// Object * 1 Gem  ---  Double or Multiple Star  ---  OID=@855312   (@@113853,16)  ---  coobox=5290 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "1 Gem A"{ParentBody "1 Gem"}
Remove "1 Gem B"{ParentBody "1 Gem"}
Remove "1 Gem Aa"{ParentBody "1 Gem A"}
Remove "1 Gem Ab"{ParentBody "1 Gem A"}
Remove "1 Gem Ba"{ParentBody "1 Gem B"}
Remove "1 Gem Bb"{ParentBody "1 Gem B"}
Star "1 Gem A"
{
	DateUpdated     "2024-07-05"
	ParentBody      "Gaia DR3 3424609014036545920"
	Class           "K0III"
	AbsMagn         0.84
	MassSol         1.94
	Radius          4522340.39446948 // log(g) = 3.1 cm/s^2
	FeH             -0.01
}

Barycenter "1 Gem B"
{
	ParentBody      "Gaia DR3 3424609014036545920"
	BinaryOrbit     
	{
		PeriodDays      4877.6
		Separation      9.399
		Eccentricity    0.3709
		Inclination     59.33
		AscendingNode   353.67
		Epoch           2445119
		ArgOfPericenter 21.29
		MeanAnomaly     0
	}
}

Star "1 Gem B1"
{
	DateUpdated     "2024-07-05"
	ParentBody      "1 Gem B"
	Class           "F6IV"
	MassSol         1.707

	BinaryOrbit     
	{
		PeriodDays      9.60
		Separation      0.1234
		Eccentricity    0.0024
		Inclination     93.2
		AscendingNode   137.5
		ArgOfPericenter 334.3
		MeanAnomaly     0
	}
}

Star "1 Gem B2"
{
	DateUpdated     "2024-07-05"
	ParentBody      "1 Gem B"
	Class           "G2V"
	MassSol         1.012
}

// Object * chi01 Ori  ---  RS CVn Variable  ---  OID=@839757   (@@20040,0)  ---  coobox=4951 
// Object types: Rotating Variable,RS CVn Variable,Spectroscopic Binary,High Proper Motion Star,Variable Star,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source,X-ray Source 
Remove "CHI1 Ori A" {ParentBody "CHI1 Ori"}
Remove "CHI1 Ori B" {ParentBody "CHI1 Ori"}
Star "CHI1 Ori A"
{
	DateUpdated     "2024-07-05"
	ParentBody      "GJ 222"
	Class           "G0V"
	AbsMagn         4.82
	MassSol         1.01
	RadSol          0.983
	LumBol          1.042
	Teff            5883
	FeH             -0.03
	RotationPeriod  124.8
	Age             0.300 // 0.4

	BinaryOrbit     
	{
		PeriodDays      5156.291
		Separation      0.776784415036967 // 89.662 mas
		Eccentricity    0.452
		Inclination     95.937
		AscendingNode   126.360
		Epoch           2451468.2
		ArgOfPericenter 291.527
		MeanAnomaly     0
	}
}

Star "CHI1 Ori B"
{
	DateUpdated     "2024-07-05"
	ParentBody      "GJ 222"
	Class           "M"
	MassSol         0.15
	Age             0.07 // 0.13
}