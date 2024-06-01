// Object * 2 Sgr  ---  Double or Multiple Star  ---  OID=@2532340   (@@53763,18)  ---  coobox=17312 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "HD 160042 A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "HD 160042"
	Class           "G6III/IV"
	AbsMagn         1.24 // 计算的值
	MassKg          3.72744924939914e+30 // log(g) = 3.144 cm/s^2
	RadSol          6.074167 // Gaia DR3
	LumBol          29.6068317956881 // 计算的值
	Teff            5463
	FeH             -0.047

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.91396112
		Eccentricity    0.302225625
		Inclination     -2.47985744
		AscendingNode   0
		ArgOfPericenter -104.609328
		MeanAnomaly     85.2053832
	}
}

Star "HD 160042 B"
{
	ParentBody      "HD 160042"
	Class           "G7.8?"
}

// Object HD 158704  ---  Spectroscopic Binary  ---  OID=@2492641   (@@98645,16)  ---  coobox=17113 
// Object types: Chemically Peculiar Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=85783
Barycenter "HD 158704 A"
{
	ParentBody      "HD 158704"
	BinaryOrbit     
	{
		Period          195.453
		Separation      55.7517747584458 // 0.400 asec
	}
}

Star "HD 158704 Aa"
{
	DateUpdated     "2024-06-01"
	ParentBody      "HD 158704 A"
	Class           "B9VpHgMn"
	AbsMagn         0.33 // 计算的值
	MassSol         3.05

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.211835357
		Eccentricity    0
		Inclination     -0.439498425
		AscendingNode   0
		ArgOfPericenter 168.089467
		MeanAnomaly     -91.7595331
	}
}

Star "HD 158704 Ab"
{
	ParentBody      "HD 158704 A"
	Class           "A6.8?"
}

Star "HD 158704 B"
{
	DateUpdated     "2024-06-01"
	ParentBody      "HD 158704"
	Class           ""
	MassSol         1.49
}

// Object V* X Sgr  ---  Classical Cepheid Variable  ---  OID=@2494342   (@@54324,4)  ---  coobox=17138 
// Object types: Classical Cepheid Variable,Classical Cepheid Variable,Classical Cepheid Variable,Classical Cepheid Variable,Variable Star,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "X Sgr A" {ParentBody "X Sgr"}
Remove "X Sgr B" {ParentBody "X Sgr"}
Star "3 Sgr A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "3 Sgr"
	Class           "F7II"
	AbsMagn         -2.85
	MassSol         6.31
	RadSol          53
	LumBol          2647
	Teff            6305
	FeH             -0.01

	BinaryOrbit     
	{
		PeriodDays      507
	}
}

Star "3 Sgr B"
{
	DateUpdated     "2024-06-01"
	ParentBody      "3 Sgr"
	Class           ""
	MassSol         0.2 // 0.3
}