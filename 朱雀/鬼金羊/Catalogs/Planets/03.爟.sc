// Object * lam Cnc  ---  Star  ---  OID=@1062639   (@@21409,15)  ---  coobox=5578 
// Object types: Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "LAM Cnc A"
{
	DateUpdated     "2024-07-23"
	ParentBody      "LAM Cnc"
	Class           "B9.5V"
	AbsMagn         0.19
	MassSol         2.1
	Radius          2268168.18800821 // 计算的值
	LumBol          78
	Teff            9500
	Age             0.105

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.286636053
		Eccentricity    0.0565704655
		Inclination     0.390018225
		AscendingNode   0
		ArgOfPericenter 169.227538
		MeanAnomaly     -43.2717537
	}
}

Star "LAM Cnc B"
{
	DateUpdated     "2024-07-23"
	ParentBody      "LAM Cnc"
	Class           ""
	MassSol         0.8
	Teff            4562
	FeH             -0.5
}

// Object * 15 Cnc  ---  alpha2 CVn Variable  ---  OID=@1038867   (@@22152,9)  ---  coobox=5439 
// Object types: Chemically Peculiar Star,alpha2 CVn Variable,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,UV-emission Source 
Star "15 Cnc A"
{
	DateUpdated     "2024-07-23"
	ParentBody      "15 Cnc"
	Class           "B8VpSi"
	AbsMagn         -0.97
	MassKg          4.2341755531289e+30 // log(g) = 3.22 cm/s^2
	Radius          4126551.71337452 // 计算的值
	LumBol          327.24
	Teff            10080

	BinaryOrbit     
	{
		PeriodDays      635.73
		Eccentricity    0.55
		Epoch           2422045
		ArgOfPericenter 196
		MeanAnomaly     0
	}
}

Star "15 Cnc B"
{
	DateUpdated     "2024-07-23"
	ParentBody      "15 Cnc"
	Class           "A0.1?"
}