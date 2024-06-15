// Object * 51 Aqr  ---  Double or Multiple Star  ---  OID=@1352396   (@@27917,0)  ---  coobox=8696 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source,X-ray Source 
Star "51 Aqr A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "51 Aqr"
	Class           "A0V"
	AbsMagn         0.31 // 计算的值
	MassSol         2.80
	Radius          2040689.82125684 // 计算的值
	LumBol          88.2
	Teff            10328

	BinaryOrbit     
	{
		Period          145.07
		Separation      50.0013594372195 // 0.402 asec
		Eccentricity    0.702
		Inclination     161.4
		AscendingNode   113.5
		Epoch           2447037.444665142334998
		ArgOfPericenter 116.9
		MeanAnomaly     0
	}
}

Star "51 Aqr B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "51 Aqr"
	Class           "A0V"
}

// Object * kap Aqr  ---  High Proper Motion Star  ---  OID=@1352658   (@@27925,0)  ---  coobox=9042 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "KAP Aqr A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "KAP Aqr"
	Class           "K1.5IIIbCN0.5"
	AbsMagn         0.96
	MassKg          3.87547542827707e+30 // log(g) = 2.5 cm/s^2
	RadSol          13
	LumBol          60
	Teff            4581
	FeH             0.14

	BinaryOrbit     
	{
		Separation      6680.30357529695 // 98.3 asec
	}
}

Star "KAP Aqr B"
{
	ParentBody      "KAP Aqr"
	Class           "A9.1?"
}