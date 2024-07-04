// Object * g Ori  ---  Double or Multiple Star  ---  OID=@746107   (@@18861,2)  ---  coobox=4922 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "6 Ori A"
{
	DateUpdated     "2024-07-04"
	ParentBody      "6 Ori"
	Class           "A3V"
	AbsMagn         0.93 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   243.144119
		Eccentricity    0.872934907
		Inclination     -1.18939114
		AscendingNode   0
		ArgOfPericenter -20.338756
		MeanAnomaly     -59.1836502
	}
}

Star "6 Ori B"
{
	ParentBody      "6 Ori"
	Class           "F8.3?"
}

// Object * pi.04 Ori  ---  Spectroscopic Binary  ---  OID=@734747   (@@18200,0)  ---  coobox=5007 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "PI4 Ori Aa" {ParentBody "PI4 Ori"}
Remove "PI4 Ori Ab" {ParentBody "PI4 Ori"}
Star "PI4 Ori A"
{
	DateUpdated     "2024-07-04"
	ParentBody      "PI4 Ori"
	Class           "B2III"
	AbsMagn         -4.25
	MassSol         10.95
	RadSol          9.1
	LumBol          19726
	Teff            21874
	FeH             -0.31
	Age             0.0154

	BinaryOrbit     
	{
		PeriodDays      9.5191
		Eccentricity    0.03
		Epoch           2418275.65
		ArgOfPericenter 345
		MeanAnomaly     0
	}
}

Star "PI4 Ori B"
{
	DateUpdated     "2024-07-04"
	ParentBody      "PI4 Ori"
	Class           "B2IV"
	MassSol         10
	RadSol          7
	LumBol          7274 // Total. 27000
	Teff            21800
}

// Object * pi.05 Ori  ---  Spectroscopic Binary  ---  OID=@747664   (@@17417,0)  ---  coobox=5048 
// Object types: Ellipsoidal Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "PI5 Ori A"
{
	DateUpdated     "2024-07-04"
	ParentBody      "PI5 Ori"
	Class           "B2III"
	AbsMagn         -4.3
	MassSol         12
	RadSol          12
	LumBol          11262
	Teff            14496
	FeH             -0.28
	Age             0.0158

	BinaryOrbit     
	{
		PeriodDays      3.700373
		Separation      25.9
		Eccentricity    0.083
		Inclination     34
		Epoch           2433341.088
	}
}

Star "PI5 Ori B"
{
	DateUpdated     "2024-07-04"
	ParentBody      "PI5 Ori"
	Class           "B6"
	MassSol         5.0
	RadSol          2.8 // 3.8
	LumBol          525 // 741
	Teff            15596 // 16520
}