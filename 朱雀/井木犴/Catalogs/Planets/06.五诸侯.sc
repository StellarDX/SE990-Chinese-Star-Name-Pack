// Object * tet Gem  ---  High Proper Motion Star  ---  OID=@918815   (@@22065,0)  ---  coobox=5227 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "TET Gem A"
{
	DateUpdated     "2024-07-16"
	ParentBody      "TET Gem"
	Class           "A2IV"
	AbsMagn         -0.18
	MassSol         1.80
	RadSol          5.1
	LumBol          93
	Teff            8502
	Age             0.252
	Oblateness      0.0990990990990990990990990990991 // Vsini = 133 Km/s
}

// Object * tau Gem  ---  High Proper Motion Star  ---  OID=@952198   (@@21702,6)  ---  coobox=5330 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "TAU Gem A"
{
	DateUpdated     "2024-07-16"
	ParentBody      "TAU Gem"
	Class           "K2III"
	AbsMagn         -0.56
	MassSol         2.3
	RadSol          30.27
	LumBol          364
	Teff            4583
	FeH             0.14
	Age             1.22

	BinaryOrbit     
	{
		Separation      187
	}
}

// Object * tau Gem B  ---  Star  ---  OID=@17922890   (@@-1,255)  ---  coobox=5330 
// Object types: Double or Multiple Star,Star 
Star "TAU Gem B/Gaia DR2 886479673641474304/WDS J07111+3015B/** BU 1009B/46 Gem B"
{
	DateUpdated     "2024-07-16"
	ParentBody      "TAU Gem"
	Class           "K0"
}

// Object * tau Gem b  ---  Extra-solar Planet  ---  OID=@5499605   (@@-1,255)  ---  coobox=5330
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Remove "TAU Gem b" {ParentBody "TAU Gem"}
Planet "TAU Gem Ab"
{
	ParentBody     "TAU Gem A"
	DiscMethod     "RadVel"
	DiscDate       "2004"
	MassJup        20.6

	Orbit
	{
		Epoch           2453270.7
		PeriodDays      305.5
		SemiMajorAxis   1.17
		Eccentricity    0.031
		ArgOfPericen    137.4
	}
}

// Object * phi Gem  ---  Star  ---  OID=@1022086   (@@20982,5)  ---  coobox=5528 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Remove "PHI Gem A" {ParentBody "PHI Gem"}
Remove "PHI Gem B" {ParentBody "PHI Gem"}
Star "PHI Gem A"
{
	DateUpdated     "2024-07-16"
	ParentBody      "HIP 38538"
	Class           "A5IV"
	AbsMagn         0.81
	MassSol         1.9
	Radius          1915083.80466247 // 计算的值
	LumBol          36.5
	Teff            8551
	Age             0.637

	BinaryOrbit
	{
		Period          581.751
	}
}

Star "PHI Gem A"
{
	ParentBody      "HIP 38538"
	Class           "F2.8?"
}