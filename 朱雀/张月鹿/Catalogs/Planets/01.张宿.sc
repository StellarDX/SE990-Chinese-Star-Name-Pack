Planet "UPS1 Hya b"
{
	ParentBody     "UPS1 Hya"
	DiscMethod     "RadVel"
	DiscDate       "2005"
	MassJup        55 // 49

	Orbit
	{
		PeriodDays      1500
		SemiMajorAxis   3.9
		Eccentricity    0.57
		ArgOfPericen    346
	}
}

// Object * lam Hya  ---  Spectroscopic Binary  ---  OID=@1701229   (@@35373,4)  ---  coobox=14546 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "LAM Hya A" {ParentBody "LAM Hya"}
Remove "LAM Hya B" {ParentBody "LAM Hya"}
Star "LAM Hya A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "HIP 49841"
	Class           "K0IIIbCN0.5"
	AbsMagn         0.92
	MassSol         1 // 2
	RadSol          9.7
	LumBol          39.8
	Teff            4656
	FeH             0.25

	BinaryOrbit     
	{
		PeriodDays      1585.8
		Separation      0.556378338689618 // 16.79 mas
		Eccentricity    0.138
		Inclination     79.49
		AscendingNode   249.62
		Epoch           2448664.3906
		ArgOfPericenter 58.9
		MeanAnomaly     0
	}
}

Star "LAM Hya B"
{
	ParentBody      "HIP 49841"
	Class           "F0.5?"
}

// Object HD 87344  ---  Star  ---  OID=@1679944   (@@34743,16)  ---  coobox=14573 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 87344/HIP 49321/Gaia DR3 5672652758559220224/GEN# +1.00087344/TIC 281285820/ADS 7627 A/BD-17 3047/CCDM J10040-1806A/CSI-17 3047 1/GC 13839/GSC 06050-01449/HIC 49321/HR 3963/IDS 09593-1737 A/PPM 222396/ROT 1528/SAO 155704/SKY# 19388/SRS 9440/TYC 6050-1449-1/UBV 9395/UBV M 15920/YZ 107 4061/2MASS J10040281-1806050/WDS J10040-1806A/Gaia DR1 5672652754263995392/Gaia DR2 5672652758559220224"
{
	DateUpdated     "2024-07-31"
	ParentBody      "ADS 7627"
	Class           "B8V"
	AbsMagn         -0.933 // 计算的值
	MassKg          7.49423521731623e+30 // log(g) = 3.426 cm/s^2
	RadSol          6.225074 // Gaia DR3
	LumBol          431.687080624723 // 计算的值
	Teff            10545
	FeH             0.079
	Oblateness      0
}

// Object HD 87330  ---  Spectroscopic Binary  ---  OID=@1679943   (@@34743,15)  ---  coobox=14573 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "HD 87330/HIP 49319/Gaia DR3 5672652724199483136/TIC 281285819/ADS 7627 C/BD-17 3046/CCDM J10040-1806C/GC 13838/HIC 49319/IDS 09593-1737 C/PPM 222395/ROT 1527/SAO 155702/YZ 107 4060/uvby98 100087330/2MASS J10040133-1806036/WDS J10040-1806C/TYC 6050-1947-1/** SHJ 110C/Gaia DR1 5672652719904256896/GEN# +1.00087330/Gaia DR2 5672652724199483136"
{
	ParentBody      "ADS 7627"
	BinaryOrbit     
	{
		Separation      5742.33865091531 // 21.23 asec
	}
}

Star "HD 87330 A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "HD 87330"
	Parallax        3.9643
	AppMagn         6.98
	Class           "B9III/IV"
	AbsMagn         -0.0292 // 计算的值
	MassKg          4.60632297015595e+30 // log(g) = 3.816 cm/s^2
	RadSol          3.115 // Gaia DR3
	LumBol          108.421031012829 // 计算的值
	Teff            10553
	FeH             -0.908

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		Period          8.47049545
		SemiMajorAxis   6.45692483
		Eccentricity    0.536705961
		Inclination     -0.0981066227
		AscendingNode   0
		ArgOfPericenter 348.19996
		MeanAnomaly     -97.1258208
	}
}

Star "HD 87330 B"
{
	ParentBody      "HD 87330"
	Class           "B5.1?"
}

// Object * phi Hya  ---  Spectroscopic Binary  ---  OID=@1738617   (@@36123,9)  ---  coobox=14753 
// Object types: Spectroscopic Binary,High Proper Motion Star,Red Giant Branch star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "PHI3 Hya A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "PHI Hya"
	Class           "G8IIIb"
	AbsMagn         0.89
	MassSol         2.04
	RadSol          9
	LumBol          48
	Teff            4952
	FeH             -0.22
	Age             1.17

	BinaryOrbit     
	{
		PeriodDays      1200
		Eccentricity    0.1
		Epoch           2420760
		ArgOfPericenter 90
		MeanAnomaly     0
	}
}

Star "PHI3 Hya B"
{
	ParentBody      "PHI Hya"
	Class           "A4.7?"
}