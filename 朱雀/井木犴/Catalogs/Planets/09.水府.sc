// Object * nu. Ori  ---  Spectroscopic Binary  ---  OID=@858059   (@@19231,0)  ---  coobox=5667 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "NU Ori A"
{
	DateUpdated     "2024-07-18"
	ParentBody      "NU Ori"
	Class           "B3IV"
	AbsMagn         -1.94
	MassSol         6.7
	RadSol          4.3
	LumBol          1965
	Teff            17880
	FeH             -0.05
	Age             0.0263

	BinaryOrbit     
	{
		PeriodDays      131.211
		Eccentricity    0.64
		Epoch           2436475.852
		ArgOfPericenter 186.6
		MeanAnomaly     0
	}
}

Star "NU Ori B"
{
	ParentBody      "NU Ori"
	Class           "B9.3?"
}

// Object * ksi Ori  ---  Spectroscopic Binary  ---  OID=@871560   (@@19236,0)  ---  coobox=5670 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "KSI Ori A"
{
	DateUpdated     "2024-07-18"
	ParentBody      "KSI Ori"
	Class           "B3IV"
	AbsMagn         -2.24
	MassSol         6.7
	Radius          3607988.31421123 // 计算的值
	LumBol          1390
	Teff            15476
	Age             0.0321

	BinaryOrbit     
	{
		PeriodDays      45.1
		Eccentricity    0.26
		Epoch           2441962.3
		ArgOfPericenter 25
		MeanAnomaly     0
	}
}

Star "KSI Ori B"
{
	ParentBody      "KSI Ori"
	Class           "A1.1?"
}