// Object HD 18438  ---  Star  ---  OID=@291494   (@@4542,0)  ---  coobox=2406 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Remove "HD 18438 b" {ParentBody "HD 18438"}
Planet "HD 18438 b"
{
	ParentBody     "HIP 14417"
	DiscMethod     "RadVel"
	DiscDate       "2023"
	MassJup        21
	Radius         77211.360

	Orbit
	{
		Epoch           2455367.0
		PeriodDays      803.0
		SemiMajorAxis   2.1
		Eccentricity    0.1
		ArgOfPericen    167.0
	}
}

// Object * 47 Cas  ---  Double or Multiple Star  ---  OID=@279531   (@@4523,2)  ---  coobox=2400 
// Object types: High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source,X-ray Source 
Star "47 Cas A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "47 Cas"
	Class           "F0V"
	AbsMagn         2.67
	RadSol          2.19
	LumBol          9.512
	Teff            6849
	FeH             0.04
	Age             1.300

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.4690035
		Eccentricity    0.280337078
		Inclination     2.1909748
		AscendingNode   0
		ArgOfPericenter 88.7327611
		MeanAnomaly     78.5819881
	}
}

Star "47 Cas B"
{
	ParentBody      "47 Cas"
	Class           "F8.9?" // 仅无线电波下可见
}

// Object HD 16458  ---  Spectroscopic Binary  ---  OID=@291425   (@@4538,0)  ---  coobox=2405 
// Object types: Chemically Peculiar Star,Spectroscopic Binary,High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "HD 16458 A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "HD 16458"
	Class           "K1Ba5"
	AbsMagn         -0.12 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   37.272249
		Eccentricity    0.378681186
		Inclination     -2.0384841
		AscendingNode   0
		ArgOfPericenter 179.666411
		MeanAnomaly     91.111455
	}
}

Star "HD 16458 B"
{
	ParentBody      "HD 16458"
	Class           "WD?" // 主星光谱显示此恒星为钡星，而一般来说钡星旁边必有白矮星
}

// Object HD 25007  ---  Star  ---  OID=@7812022   (@@-1,255)  ---  coobox=2418 
// Object types: Double or Multiple Star,Star 
Star "HD 25007/TYC 4522-1564-1/** STF 460A/WDS J04100+8042A/CCDM J04100+8042A/WEB 3733"
{
	DateUpdated     "2024-04-29"
	ParentBody      "HIP 19461"
	Class           "G8III"
	AbsMagn         0.92 // 计算的值

	BinaryOrbit     
	{
		Separation      88.4755276339584 // 0.76 asec
		PositionAngle   135
	}
}

// Object HD 25008  ---  Star  ---  OID=@7812023   (@@-1,255)  ---  coobox=2418 
// Object types: Double or Multiple Star,Star 
Star "HD 25008/TYC 4522-1564-2/** STF 460B/WDS J04100+8042B/CCDM J04100+8042B"
{
	DateUpdated     "2024-04-29"
	ParentBody      "HIP 19461"
	Class           "A3.5IV:"
}