// Object HD 102660  ---  Spectroscopic Binary  ---  OID=@1863921   (@@38311,7)  ---  coobox=13172 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source,X-ray Source 
Star "HD 102660 A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "HD 102660"
	Class           "A2.5hF1mF3"
	AbsMagn         2.07 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.03568999
		Eccentricity    0.429498592
		Inclination     0.640784979
		AscendingNode   0
		ArgOfPericenter 35.0614471
		MeanAnomaly     -70.0370916
	}
}

Star "HD 102660 B"
{
	ParentBody      "HD 102660"
	Class           "F5.8?"
}

// Object HD 102103  ---  High Proper Motion Star  ---  OID=@1845203   (@@38317,5)  ---  coobox=13171 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "HD 102103 A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "HD 102103"
	Class           "K3III_CN+2"
	AbsMagn         0.112 // 计算的值
	MassKg          2.89044041237192e+30 // log(g) = 2.078 cm/s^2
	RadSol          18.25 // Gaia DR3
	LumBol          122.391621396937 // 计算的值
	Teff            4494
	FeH             -0.293

	BinaryOrbit     
	{
		Separation      23237.9379025491 // 121.23 asec
	}
}

// Object UCAC2 36827134  ---  High Proper Motion Star  ---  OID=@8584427   (@@-1,255)  ---  coobox=13171 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "UCAC2 36827134/Gaia DR3 3923928167970730240/WISEA J114515.24+141735.4/TIC 82597227/UCAC3 209-113235/UCAC4 522-051591/2MASS J11451529+1417354/WISE J114515.25+141735.6/** GWP 1662B/WDS J11452+1416B/Gaia DR2 3923928167970730240"
{
	DateUpdated     "2024-05-05"
	ParentBody      "HD 102103"
	Parallax        5.0469
	AppMagn         11.98
	Class           ""
	AbsMagn         5.5 // 计算的值
	MassKg          1.63773178545624e+30 // log(g) = 4.442 cm/s^2
	RadSol          0.9034461 // Gaia DR3
	LumBol          0.65641225808084 // 计算的值
	Teff            5466
	FeH             -0.08
}

// Object * o Leo  ---  Spectroscopic Binary  ---  OID=@1863983   (@@38721,8)  ---  coobox=13173 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "95 Leo A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "95 Leo"
	Class           "A3V"
	AbsMagn         -0.03 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.32924311
		Eccentricity    0.511006513
		Inclination     -2.23499584
		AscendingNode   0
		ArgOfPericenter -154.823358
		MeanAnomaly     -76.9940012
	}
}

Star "95 Leo B"
{
	ParentBody      "95 Leo"
	Class           "A5.5?"
}

// Object HD 102910  ---  High Proper Motion Star  ---  OID=@1864309   (@@38322,7)  ---  coobox=13182 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 102910 A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "HD 102910"
	Class           "A5m"
	AbsMagn         2.64 // 计算的值
	MassKg          2.59191090395052e+30 // log(g) = 4.131 cm/s^2
	RadSol          1.625889 // Gaia DR3
	LumBol          6.86030021320626 // 计算的值
	Teff            7326
	FeH             -0.518

	BinaryOrbit     
	{
		Separation      820.432496741286 // 14.77 asec
	}
}

// Object HD 102910B  ---  High Proper Motion Star  ---  OID=@1864310   (@@38322,8)  ---  coobox=13182 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 102910 B/WISE J115055.09+121630.2/2MASS J11505520+1216299/UCAC4 512-051062/Gaia DR3 3919663883921160192/ADS 8320 B/CCDM J11509+1217B/CSI+13 2465 2/GEN# +1.00102910B/IDS 11458+1250 B/UBV 10661/WDS J11509+1217B/** HJ 1201B"
{
	ParentBody      "HD 102910"
	Parallax        18.0466
	Class           "M0.8?"
}