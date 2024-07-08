// Object * c Ori  ---  Young Stellar Object  ---  OID=@800588   (@@16380,0)  ---  coobox=6479 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Young Stellar Object,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Asymptotic Giant Branch Star Candidate,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=37018
Barycenter "42 Ori A"
{
	ParentBody      "42 Ori"
	BinaryOrbit     
	{
		Period          1454
		Separation      224.054047464841 // 1.46 asec
	}
}

Star "42 Ori Aa"
{
	DateUpdated     "2024-07-08"
	ParentBody      "42 Ori A"
	Class           "B1V"
	AbsMagn         -1.34 // 计算的值
	MassSol         12.0
	RadSol          15.6
	LumBol          10737
	Teff            25400
	Oblateness      0

	BinaryOrbit     
	{
		Period          80.7
		Separation      25.0122850914718
	}
}

Star "42 Ori Ab"
{
	DateUpdated     "2024-07-08"
	ParentBody      "42 Ori A"
	Class           ""
	MassSol         4.55
}

// Object * c Ori B  ---  Star  ---  OID=@11613064   (@@-1,255)  ---  coobox=6479 
// Object types: Double or Multiple Star,Star 

Star "42 Ori B/Gaia DR3 3209572852064587776/* 42 Ori B/TYC 4774-928-2/** DA 4B/CCDM J05354-0450B/ADS 4187 B/WDS J05354-0450B"
{
	DateUpdated     "2024-07-08"
	ParentBody      "42 Ori"
	Class           ""
	MassSol         3.04
}

// Object * tet02 Ori A  ---  Spectroscopic Binary  ---  OID=@804750   (@@16540,0)  ---  coobox=6479 
// Object types: Spectroscopic Binary,Variable Star,Spectroscopic Binary,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,Radio Source,Radio Source,X-ray Source 
Barycenter "TET2 Ori Aa"
{
	ParentBody      "TET2 Ori"
	BinaryOrbit     
	{
		Period          355.620
		Separation      128.834927740939 // 0.383 asec
	}
}

Star "TET2 Ori Aa1"
{
	DateUpdated     "2024-07-08"
	ParentBody      "TET2 Ori Aa"
	Class           "O9.5IVp"
	AbsMagn         -4.3
	MassSol         39
	Radius          6224668.09128108 // 计算的值
	LumBol          107000
	Teff            34900

	BinaryOrbit     
	{
		PeriodDays      20.9643
		Separation      0.47
		Eccentricity    0.231
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2443997.465
		ArgOfPericenter 356
		MeanAnomaly     0
	}
}

Star "TET2 Ori Aa2"
{
	DateUpdated     "2024-07-08"
	ParentBody      "TET2 Ori Aa"
	Class           ""
	MassSol         12.6
}

Star "TET2 Ori Ab"
{
	DateUpdated     "2024-07-08"
	ParentBody      "TET2 Ori"
	Class           ""
	MassSol         3.26
}

// Object * tet02 Ori C  ---  Orion Variable  ---  OID=@800723   (@@16396,3)  ---  coobox=6479 
// Object types: Young Stellar Object,Far-IR source (λ >= 30 µm),Orion Variable,Young Stellar Object,Young Stellar Object,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,Radio Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=37062
Barycenter "TET2 Ori Ca"
{
	ParentBody      "TET2 Ori C"
	BinaryOrbit     
	{
		Period          26.016
		Separation      15.4989070605673 // 38 mas
	}
}

Star "TET2 Ori Ca1"
{
	DateUpdated     "2024-07-08"
	ParentBody      "TET2 Ori Ca"
	Class           "B4V"
	AbsMagn         -0.6
	MassSol         4.86
	Radius          3020698.27453804 // 计算的值
	LumBol          616
	Teff            13800
	Age             0.001

	BinaryOrbit     
	{
		PeriodDays      13
	}
}

Star "TET2 Ori Ca2"
{
	ParentBody      "TET2 Ori Ca"
	Class           "B9?"
}

Star "TET2 Ori Cb"
{
	DateUpdated     "2024-07-08"
	ParentBody      "TET2 Ori C"
	Class           ""
	MassSol         1.7
}

// Object * iot Ori  ---  Spectroscopic Binary  ---  OID=@812745   (@@15982,0)  ---  coobox=6501 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Spectroscopic Binary,Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=37043
Remove "Hatsya A"{ParentBody "Hatsya"}
Remove "Hatsya B"{ParentBody "Hatsya"}
Remove "Hatsya Aa"{ParentBody "Hatsya A"}
Remove "Hatsya Ab"{ParentBody "Hatsya A"}
Barycenter "IOT Ori A"
{
	ParentBody      "IOT Ori"
}

Barycenter "IOT Ori Aa"
{
	ParentBody      "IOT Ori A"
	BinaryOrbit     
	{
		Period          80.105
		Separation      70.1125015208896 // 0.14 asec
	}
}

Star "IOT Ori Aa1"
{
	DateUpdated     "2024-07-08"
	ParentBody      "IOT Ori Aa"
	Class           "O9IIIvar"
	AbsMagn         -5.73 // 计算的值
	MassSol         23.1
	RadSol          8.3
	LumBol          68000
	Teff            32500
	FeH             0.10
	Age             0.004 // 0.0055

	BinaryOrbit // SB9_343 2000MNRAS.317..333M
	{
		PeriodDays      29.1338
		SemiMajorAxisKm 91832400 // 132 RSun
		Eccentricity    0.764
		Inclination     60
		AscendingNode   0.0
		Epoch           2450072.80
		ArgOfPericenter 310
		MeanAnomaly     0
	}
}

Star "IOT Ori Aa2"
{
	DateUpdated     "2024-07-08"
	ParentBody      "IOT Ori Aa"
	Class           "B0.8III/IV"
	MassSol         13.1
	RadSol          5.4
	LumBol          8630
	Teff            27000
	Age             0.0094
}

Star "IOT Ori Ab"
{
	DateUpdated     "2024-07-08"
	ParentBody      "IOT Ori A"
	Class           "B2IV:"
	MassSol         7.77
}

// Object * iot Ori B  ---  Orion Variable  ---  OID=@814861   (@@108084,20)  ---  coobox=6501 
// Object types: Orion Variable,Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Young Stellar Object,Star 
Star "IOT Ori B/Gaia DR3 3017190477921606400/TIC 427395778/ALS 19593/2MASS J05352645-0554445/ADS 4193 B/BD-06 1241B/CCDM J05355-0555B/CSI-06 1241 2/CSV 100603/GCRV 3426/HGAM 445/IDS 05305-0559 B/NSV 2334/Parenago 2051/ROT 3549/[CHS2001] 10193/WDS J05354-0555B/V* V2451 Ori/Brun 724/** STF 752B/Renson 9840/TYC 4778-1402-1/PMSC 05305-0559B/ISOY J053526.45-055444.4/HD 37043B/WEB 5140/Gaia DR2 3017190477921606400"
{
	DateUpdated     "2024-07-08"
	ParentBody      "IOT Ori"
	Parallax        2.787
	AppMagn         7
	Class           "B8III"
	AbsMagn         -0.77 // 计算的值
	MassSol         5.12
	Radius          2606737.88562487 // log(g) = 4.0 cm/s^2
	LumBol          1327.8053671439752 // 计算的值
	Teff            18000
	Age             0.003

	Orbit     
	{
		Period          55452
		SemiMajorAxis   5653.7632637454
		ArgOfPericenter 142
		MeanAnomaly     0
	}
}

// Object Brun 731  ---  Young Stellar Object  ---  OID=@811409   (@@15913,1)  ---  coobox=6501 
// Object types: Young Stellar Object,Double or Multiple Star,Young Stellar Object,Near-IR Source (λ < 3 µm),Star,Star,X-ray Source 
Star "Brun 731/Gaia DR3 3017190477921396096/TIC 427395781/ADS 4193 C/CCDM J05355-0555C/CSI-06 1241 3/IDS 05305-0559 C/WDS J05354-0555C/** STF 752C/GEN# +9.00010749/Parenago 2080/[TVZ96] 239/Brun 749/ISOY J053529.20-055447.2/2MASS J05352920-0554471/SOXS 274/Gaia DR2 3017190477921396096"
{
	DateUpdated     "2024-07-08"
	ParentBody      "IOT Ori"
	Parallax        2.6058
	AppMagn         9.76
	Class           "A0"
	AbsMagn         1.84

	Orbit     
	{
		SemiMajorAxis   24728.3288438543 // 49.38 asec
		ArgOfPericenter 103.8
		MeanAnomaly     0
	}
}