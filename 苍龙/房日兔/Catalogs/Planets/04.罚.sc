// 18 Sco b
Planet "18 Sco b"
{
	ParentBody     "18 Sco"
	DiscMethod     "RadVel"
	DiscDate       "2018"
	Class          "Terra"
	Mass           6.77

	Orbit
	{
		PeriodDays      19.8777
		Eccentricity    0.38
	}
}

// Object * 11 Sco  ---  Star  ---  OID=@2559836   (@@50320,2)  ---  coobox=16817 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,UV-emission Source 
Star "11 Sco A"
{
	DateUpdated     "2024-05-28"
	ParentBody      "11 Sco"
	Class           "B9V"
	AbsMagn         0.297 // 计算的值
	MassKg          4.28311203660143e+30 // log(g) = 3.702 cm/s^2
	RadSol          3.425 // Gaia DR3
	LumBol          90.7021919723855 // 计算的值
	Teff            9625
	FeH             -0.887

	BinaryOrbit     
	{
		Separation      415.298882844882
	}
}

// Object * 11 Sco B  ---  High Proper Motion Star  ---  OID=@11608283   (@@-1,255)  ---  coobox=16817 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "11 Sco B/Gaia DR3 4341925483417629952/TYC 5620-1384-2/Gaia DR2 4341925483417629952/** BU 39B/CCDM J16076-1245B/ADS 9924 B/HD 144708B/WDS J16076-1245B/UCAC4 387-068851"
{
	ParentBody      "11 Sco"
	Class           "A5.7?"
}

// Object * 49 Lib  ---  Spectroscopic Binary  ---  OID=@2544579   (@@50325,14)  ---  coobox=16780 
// Object types: Spectroscopic Binary,Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Mid-IR Source (3 to 30 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "49 Lib A"
{
	DateUpdated     "2024-05-28"
	ParentBody      "49 Lib"
	Class           "F8V"
	AbsMagn         2.89
	MassSol         1.4
	RadSol          1.86
	LumBol          4.74
	Teff            6237
	FeH             -0.02
	Age             12

	BinaryOrbit     
	{
		PeriodDays      1142.4
		SemiMajorAxisKm 59.53E6      
		Eccentricity    0.110
		Inclination     143.0
		AscendingNode   163.5
		Epoch           2457025
		ArgOfPericenter 249.4
		MeanAnomaly     0
	}
}

Star "49 Lib B"
{
	DateUpdated     "2024-05-28"
	ParentBody      "49 Lib"
	Class           ""
	MassSol         0.45
}