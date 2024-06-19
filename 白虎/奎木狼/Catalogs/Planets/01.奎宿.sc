// Object * eta And  ---  Spectroscopic Binary  ---  OID=@1484291   (@@30996,0)  ---  coobox=11657 
// Object types: Spectroscopic Binary,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "ETA And A" {ParentBody "ETA And"}
Remove "ETA And B" {ParentBody "ETA And"}
Star "ETA and A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "HD 5516"
	Class           "G8III-IV"
	AbsMagn         0.52
	MassSol         2.6
	Radius          7782868.31813766 // 计算的值
	LumBol          65
	Teff            4900
	Age             0.8

	BinaryOrbit     
	{
		PeriodDays      115.72
		Separation      0.834567508034427 // 10.37 mas
		Eccentricity    0.006
		Inclination     30.5
		AscendingNode   69.4
		Epoch           2448013
		ArgOfPericenter 35
		MeanAnomaly     0
	}
}

Star "ETA and B"
{
	DateUpdated     "2024-06-19"
	ParentBody      "HD 5516"
	Class           "G8III-IV"
	AbsMagn         1.07
	MassSol         2.3
	Radius          6028583.8763745 // 计算的值
	LumBol          39
	Teff            4900
}

// Object * zet And  ---  Ellipsoidal Variable  ---  OID=@1484053   (@@30992,0)  ---  coobox=11649 
// Object types: Ellipsoidal Variable,High Proper Motion Star,Spectroscopic Binary,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "ZET And A" {ParentBody "ZET And"}
Remove "ZET And B" {ParentBody "ZET And"}
Star "ZET And Aa"
{
	DateUpdated     "2024-06-19"
	ParentBody      "ZET And"
	Class           "K1III"
	AbsMagn         0.14
	MassSol         2.6
	DimensionsSol   (31.8, 30, 31.8) // 直接测量
	LumBol          95.5
	Teff            4665
	FeH             -0.30
	RotationPeriod  426.48
	Obliquity       70.0
	EqAscendNode    126

	BinaryOrbit     
	{
		PeriodDays      17.769426
		SemiMajorAxisKm 29866401 // 2.77 RStar
		Eccentricity    0.0
		Inclination     65
	}
}

Star "ZET And Ab"
{
	DateUpdated     "2024-06-19"
	ParentBody      "ZET And"
	Class           "K"
	MassSol         0.75
}

// Object * 65 Psc A  ---  High Proper Motion Star  ---  OID=@1503409   (@@31231,7)  ---  coobox=11664 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "65 Psc A/Gaia DR3 2809005372903102080/WISE J004953.23+274237.2/TIC 13863427/ADS 683 A/AG+27 96/BD+26 131A/CSI+26 131 2/GC 993/GCRV 463/HD 4758/HR 231/ROT 6605/SAO 74296/WDS J00499+2743B/Renson 1240/TYC 1745-2184-1/UCAC3 236-4692/2MASS J00495313+2742371/GSC 01745-02184/uvby98 100004758/GEN# +1.00004758/PLX 164/PLX 164.00A/WEB 692"
{
	DateUpdated     "2024-06-19"
	ParentBody      "65 Psc"
	Parallax        11.2529
	AppMagn         6.29
	Class           "F5III"
	AbsMagn         1.55 // 计算的值
	MassKg          3.71931585814859e+30 // log(g) = 3.758 cm/s^2
	RadSol          2.99235 // Gaia DR3
	LumBol          18.1800613594216 // 计算的值
	Teff            6890
	FeH             -0.436

	BinaryOrbit     
	{
		Separation      381.753798367241 // 4.31 asec
	}
}

// Object * 65 Psc B  ---  High Proper Motion Star  ---  OID=@1503408   (@@31231,6)  ---  coobox=11664 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "65 Psc B/WISE J004952.92+274239.2/Gaia DR3 2809005372903101824/TIC 13863424/ADS 683 B/BD+26 131B/CCDM J00499+2743B/CSI+26 131 1/GC 992/GCRV 462/HD 4757/HR 230/ROT 6604/SAO 74295/SKY# 1286/WDS J00499+2743A/TYC 1745-2183-1/GSC 01745-02183/UCAC3 236-4691/2MASS J00495286+2742389/uvby98 100004757/GEN# +1.00004757/PLX 164.00B/WEB 691/Gaia DR2 2809005372903101824"
{
	DateUpdated     "2024-06-19"
	ParentBody      "65 Psc"
	Parallax        11.3099
	AppMagn         6.28
	Class           "F4III"
	AbsMagn         1.55 // 计算的值
	MassKg          3.4021233599535e+30 // log(g) = 3.631 cm/s^2
	RadSol          3.3125 // Gaia DR3
	LumBol          21.3490536279734 // 计算的值
	Teff            6817
	FeH             -0.303
}

// Object * del And  ---  Spectroscopic Binary  ---  OID=@1512653   (@@31477,0)  ---  coobox=11580 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=3092
Remove "DEL And A" {ParentBody "DEL And"}
Remove "DEL And Aa" {ParentBody "DEL And A"}
Remove "DEL And Ab" {ParentBody "DEL And A"}
Remove "DEL And B" {ParentBody "DEL And"}
Barycenter "DEL And A"
{
	ParentBody      "HIP 3092"
	BinaryOrbit     
	{
		PeriodDays      14603
		Separation      900
	}
}

Star "DEL And A1"
{
	DateUpdated     "2024-06-19"
	ParentBody      "DEL And A"
	Class           "K3III-IIIbCN0.5"
	AbsMagn         0.8
	MassSol         1.3
	RadSol          13.6
	LumBol          68
	Teff            4315
	FeH             0.04
	Age             3.2

	BinaryOrbit // VB6_Gon2002b BTM_1Aa, Gr.9
	{
		Period          52.8
		Separation      11.55
		Eccentricity    0.5
		Inclination     137
		AscendingNode   290
		Epoch           2436386.982148688286543
		ArgOfPericenter 231
		MeanAnomaly     0
	}
}

Star "DEL And A2"
{
	DateUpdated     "2024-06-19"
	ParentBody      "DEL And A"
	Class           "K4"
	MassSol         0.6 // 0.8
}

// Object * del And B  ---  High Proper Motion Star  ---  OID=@1512643   (@@31461,8)  ---  coobox=11580 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "DEL And B/Gaia DR3 2858629802997575936/TIC 267688614/ADS 548 B/BD+30 91B/CCDM J00393+3052B/CSI+30 91 2/GEN# +1.00003627B/HD 3627B/IDS 00340+3019 B/UBV 507/WDS J00393+3052B/** BU 491B/PMSC 00340+3018B/2MASS J00391769+3051537/Gaia DR2 2858629802997575936"
{
	DateUpdated     "2024-06-19"
	ParentBody      "HIP 3092"
	Parallax        30.9199
	AppMagn         12.44
	Class           "M3"
	AbsMagn         9.89 // 计算的值
	MassSol         0.51
}

// Object * pi. And  ---  Spectroscopic Binary  ---  OID=@1531388   (@@31714,3)  ---  coobox=11624 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=2912
Remove "PI And (AC)"{ParentBody "PI And"}
Remove "PI And B"{ParentBody "PI And"}
Remove "PI And A"{ParentBody "PI And (AC)"}
Remove "PI And C"{ParentBody "PI And (AC)"}
Remove "PI And Aa"{ParentBody "PI And A"}
Remove "PI And Ab"{ParentBody "PI And A"}
Barycenter "PI And A"
{
	ParentBody      "PI And"
	BinaryOrbit     
	{
		Separation      6348.67314802486 // 35.91 asec
	}
}

Star "PI And A1"
{
	DateUpdated     "2024-06-19"
	ParentBody      "PI And A"
	Class           "B5V"
	AbsMagn         -1.88 // 计算的值
	MassSol         6.57
	Radius          3347688.42364227 // 计算的值
	LumBol          1136
	Teff            15276
	FeH             -0.20

	BinaryOrbit // VB6_MkT1995 MKT_1Aa, Gr.1
	{
		Period          0.3930
		Separation      1.24409978651839 // 0.007 asec
		Eccentricity    0.542
		Inclination     103.0
		AscendingNode   94.7
		Epoch           2447717.525639272760600
		ArgOfPericenter 170.7
		MeanAnomaly     0
	}
}

Star "PI And A2"
{
	DateUpdated     "2024-06-19"
	ParentBody      "PI And A"
	Class           "B5V"
	MassSol         2.66
}

// Object BD+32 102  ---  Star  ---  OID=@1531391   (@@31714,6)  ---  coobox=11624 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+32 102/AP J00365317+3342340/Gaia DR3 364936224316342912/TIC 267624959/ADS 513 B/AG+33 66/CCDM J00369+3343B/GCRV 200 E/GEN# +1.20003369/GEN# +0.03200102/GEN# +1.00003369B/HD 3369B/IDS 00315+3310 B/PPM 65481/SAO 54034/UBV 472/UBV M 2243/WDS J00369+3343B/CSI+32 101 4/** H 17B/Renson 920/TYC 2279-1666-1/GSC 02279-01666/UCAC2 43558160/UCAC3 248-4098/2MASS J00365317+3342340/PMSC 00315+3310B/Gaia DR1 364936224316342912/WEB 528/Gaia DR2 364936224316342912"
{
	DateUpdated     "2024-06-19"
	ParentBody      "PI And"
	Parallax        5.739
	AppMagn         7.005
	Class           "A6V"
	AbsMagn         0.799 // 计算的值
	MassKg          2.71814583331476e+30 // log(g) = 4.152 cm/s^2
	RadSol          1.625239 // Gaia DR3
	LumBol          9.2690775147887 // 计算的值
	Teff            7900
	FeH             -0.623
}

// Object * nu. And  ---  Spectroscopic Binary  ---  OID=@1576362   (@@33031,15)  ---  coobox=11729 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Remove "NU And A" {ParentBody "NU And"}
Remove "NU And B" {ParentBody "NU And"}
Star "NU And A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "Gaia DR3 375010813139050368"
	Class           "B5V"
	AbsMagn         -1.85
	MassSol         5.9
	RadSol          3.4
	LumBol          1104
	Teff            14851
	FeH             0.14
	Age             0.0631

	BinaryOrbit     
	{
		PeriodDays      4.2827
		Eccentricity    0.03
		AscendingNode   25
		Epoch           2418155.67
	}
}

Star "NU And B"
{
	DateUpdated     "2024-06-19"
	ParentBody      "Gaia DR3 375010813139050368"
	Class           "F8V"
}

// Object * mu. And  ---  High Proper Motion Star  ---  OID=@1545741   (@@32351,0)  ---  coobox=11725 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "MU And A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "MU And"
	Class           "A6V"
	AbsMagn         0.86
	MassSol         2.0
	RadSol          2.4
	LumBol          21
	Teff            7959
	FeH             0.03
	Age             0.600

	BinaryOrbit     
	{
		PeriodDays      550.7
		Separation      1.74285015052202 // 46.66 mas
		Eccentricity    0.8405
		Inclination     52.5
		AscendingNode   -17.6
		Epoch           2455765.45
		ArgOfPericenter 348.9
		MeanAnomaly     0
	}
}

Star "MU And B"
{
	ParentBody      "MU And"
	Class           "F0.8?"
}

// Object * bet And  ---  High Proper Motion Star  ---  OID=@1546016   (@@32113,0)  ---  coobox=11748 
// Object types: High Proper Motion Star,Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
// 原版这颗恒星右Bug，原因是ExoPlanetSuns2.sc中再次声明了此恒星，与stars-bin.sc中的双星冲突了。
// 这颗恒星可能很早以前被认为是双星，后来证实了伴星为光学伴星，但是SE的星表还未更新
Remove "Mirach A" {ParentBody "Mirach"}
Remove "Mirach B" {ParentBody "Mirach"}
Remove "HD 6860 b" {ParentBody "HD 6860"}
Star "BET And A"
{
	DateUpdated     "2024-06-19"
	ParentBody      "BET And"
	Class           "M0IIIa"
	AbsMagn         -1.76
	MassSol         2.49
	RadSol          86.4
	LumBol          1675
	Teff            3802
	FeH             -0.03
	RotationPeriod  189600
}

Planet "HD 6860 b"
{
	ParentBody     "BET And A"
	DiscMethod     "RadVel"
	DiscDate       "2023"
	MassJup        28.26

	Orbit
	{
		Epoch           2453272.89
		PeriodDays      663.87
		SemiMajorAxis   2.03
		Eccentricity    0.28
		ArgOfPericen    7.54
	}
}

// Object * phi Psc  ---  Spectroscopic Binary  ---  OID=@1494513   (@@31259,0)  ---  coobox=11686 
// Object types: Spectroscopic Binary,Variable Star,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,Variable Star Candidate,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=5742
Barycenter "PHI Psc A"
{
	ParentBody      "PHI Psc"
	BinaryOrbit     
	{
		Period          9900
		Separation      929.027131859423 // 7.60 asec
	}
}

Star "PHI Psc Aa"
{
	DateUpdated     "2024-06-19"
	ParentBody      "PHI Psc A"
	Class           "K0III"
	AbsMagn         -0.67
	MassSol         4.43
	RadSol          23.63
	LumBol          249.6
	Teff            4720
	FeH             -0.08

	BinaryOrbit // 1991Obs...111..201G Griffin
	{
		PeriodDays      7473
		Eccentricity    0.816
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2438165
		ArgOfPericenter 71.9
		MeanAnomaly     0
	}
}

Star "PHI Psc Ab"
{
	DateUpdated     "2024-06-19"
	ParentBody      "PHI Psc A"
	Class           ""
	MassSol         1.56
}

// Object * phi Psc B  ---  Spectroscopic Binary  ---  OID=@13247301   (@@-1,255)  ---  coobox=11686 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Star 
Barycenter "PHI Psc B/Gaia DR3 294090502544836992/CCDM J01137+2435B/HD 7318B/WDS J01137+2435B/PMSC 01083+2403B/Gaia DR2 294090502544836992/SBC9 3649"
{
	ParentBody      "PHI Psc"
}

Star "PHI Psc Ba"
{
	DateUpdated     "2024-06-19"
	ParentBody      "PHI Psc B"
	Class           ""
	MassSol         1.08
	RadSol          1.157 // Gaia DR3
	LumBol          1.47232685483359 // 计算的值
	Teff            5911
	FeH             -0.439

	BinaryOrbit // 1991Obs...111..201G Griffin
	{
		PeriodDays      1.9946
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2446808.257
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

Star "PHI Psc Bb"
{
	DateUpdated     "2024-06-19"
	ParentBody      "PHI Psc B"
	Class           ""
	MassSol         1.08
}

// Object * 74 Psc A  ---  Double or Multiple Star  ---  OID=@1475558   (@@30769,9)  ---  coobox=11487 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=5131
Barycenter "74 Psc A/HIP 5131/Gaia DR3 2790497534190737152/TIC 243172434/PSI1 Psc A/ADS 899 A/AG+21 94/BD+20 156/CCDM J01057+2128A/CSI+20 156 1/GC 1309/GCRV 620/GEN# +1.00006456/GSC 01202-02124/HD 6456/HIC 5131/HR 310/IDS 01003+2056 A/NSV 397/PPM 90461/ROT 165/SAO 74482/SKY# 1669/TYC 1202-2124-1/UBV 1079/ALS 17437/2MASS J01054094+2128232/WDS J01057+2128Aa,Ab/** YR 6/** STF 88A/WDS J01057+2128A/WEB 1055/Gaia DR2 2790497534190737152"
{
	ParentBody      "74 Psc"
	BinaryOrbit     
	{
		Period          54274
		Separation      2788.38700503001 // 29.86 asec
	}
}

Star "74 Psc Aa"
{
	DateUpdated     "2024-06-19"
	ParentBody      "74 Psc A"
	Class           "A1V"
	AbsMagn         0.71
	MassSol         2.2

	BinaryOrbit     
	{
		Period          14.44
		Separation      10.6731871023041 // 114.3 mas
		Eccentricity    0.519
		Inclination     77.43
		AscendingNode   134.8
		Epoch           2454288.232795342803001
		ArgOfPericenter 125.4
		MeanAnomaly     0
	}
}

Star "74 Psc Ab"
{
	DateUpdated     "2024-06-19"
	ParentBody      "74 Psc A"
	Class           "A4V"
	MassSol         2.2
}

// Object * 74 Psc B  ---  High Proper Motion Star  ---  OID=@1475561   (@@30769,12)  ---  coobox=11487 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "74 Psc B/HIP 5132/Gaia DR3 2790497465471261568/TIC 243172438/* psi01 Psc B/ADS 899 B/AG+21 95/BD+20 157/CCDM J01057+2128B/GC 1310/GCRV 621/GEN# +1.00006457/GSC 01202-02125/HD 6457/HIC 5132/HR 311/IDS 01003+2056 B/PPM 90462/ROT 166/SAO 74483/SKY# 1670/TYC 1202-2125-1/UBV 1080/UBV M 7917/uvby98 100006457/2MASS J01054169+2127555/WDS J01057+2128B/WEB 1056/Gaia DR2 2790497465471261568"
{
	DateUpdated     "2024-06-19"
	ParentBody      "74 Psc"
	Parallax        11.3778
	AppMagn         5.455
	Class           "A0Vn"
	AbsMagn         0.89
	MassSol         2.6
	RadSol          2.2
	LumBol          57
	Teff            10694
	Age             0.210
}
