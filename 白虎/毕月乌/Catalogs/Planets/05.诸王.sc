// Object * 136 Tau  ---  Spectroscopic Binary  ---  OID=@837857   (@@20872,1)  ---  coobox=4596 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Spectroscopic Binary,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "136 Tau A"
{
	DateUpdated     "2024-07-02"
	ParentBody      "136 Tau"
	Class           "A0V"
	AbsMagn         -1.00
	RadSol          2.1
	LumBol          197.19
	Teff            8732

	BinaryOrbit     
	{
		PeriodDays      5.969
		Eccentricity    0.00
		Epoch           2420147.25
		ArgOfPericenter 180.00
		MeanAnomaly     0
	}
}

Star "136 Tau B"
{
	DateUpdated     "2024-07-02"
	ParentBody      "136 Tau"
	Class           "A0V"
}

// Object * 125 Tau  ---  Spectroscopic Binary  ---  OID=@822411   (@@20849,10)  ---  coobox=4594 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=26640
Barycenter "125 Tau A"
{
	ParentBody      "125 Tau"
	BinaryOrbit     
	{
		Period          436.480
		Separation      114.17013656149 // 0.6 asec
	}
}

Star "125 Tau Aa"
{
	DateUpdated     "2024-07-02"
	ParentBody      "125 Tau A"
	Class           "B3IV"
	AbsMagn         -1.23 // 计算的值
	MassSol         5.85
	RadSol          2.743747 // Gaia DR3
	LumBol          281.319235348754 // 计算的值
	Teff            14271
	FeH             0.636

	BinaryOrbit // SB9_349 1990ApJS...74..551A
	{
		PeriodDays      27.8285
		Eccentricity    0.650
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2425147.500
		ArgOfPericenter 164.0
		MeanAnomaly     0
	}
}

Star "125 Tau Ab"
{
	DateUpdated     "2024-07-02"
	ParentBody      "125 Tau A"
	Class           ""
	MassSol         1.39
}

Star "125 Tau B"
{
	DateUpdated     "2024-07-02"
	ParentBody      "125 Tau"
	Class           ""
	MassSol         1.44
}

// Object * 118 Tau A  ---  Double or Multiple Star  ---  OID=@11632085   (@@-1,255)  ---  coobox=4582 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=25695
Barycenter "118 Tau A/Gaia DR3 3416960501913604352/TIC 286135836/TYC 1852-1198-1/CCDM J05293+2509A/** STF 716A/ADS 4068 A/WDS J05293+2509A/UCAC4 576-016162/2MASS J05291649+2509008/WISE J052916.52+250900.2/Gaia DR2 3416960501913604352/ROT 3500/WEB 4985/GC 6764/SAO 77201/** RBR 1A/WDS J05293+2509Aa,Ab"
{
	ParentBody      "118 Tau"
	BinaryOrbit     
	{
		Period          4433
		Separation      604.954442948856 // 4.64 asec
	}
}

Star "118 Tau Aa"
{
	DateUpdated     "2024-07-02"
	ParentBody      "118 Tau A"
	Parallax        9.2209
	AppMagn         5.84
	Class           "B8.5V"
	AbsMagn         0.664 // 计算的值
	MassKg          4.64783315742768e+30 // log(g) = 4.147 cm/s^2
	RadSol          2.1375 // Gaia DR3
	LumBol          78.0351483964911 // 计算的值
	Teff            11734
	FeH             -0.748

	BinaryOrbit     
	{
		Period          1381
		Separation      194.124221551992 // 1.790 asec
	}
}

Star "118 Tau Ab"
{
	DateUpdated     "2024-07-02"
	ParentBody      "118 Tau A"
	Class           "K6V"
	MassSol         0.77
}

// Object * 118 Tau B  ---  Double or Multiple Star  ---  OID=@11606028   (@@-1,255)  ---  coobox=4582 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Barycenter "118 Tau B/Gaia DR3 3416960501913604736/TIC 286135838/TYC 1852-1862-1/ADS 4068 B/BD+25 839B/CCDM J05293+2509B/CSI+25 839 1/GC 6763/GCRV 2079 E/HD 35943B/IDS 05231+2504 B/ROT 3547/SAO 77200/WDS J05293+2509B/WEB 4988/Gaia DR2 3416960501913604736/** STF 716B/UCAC4 576-016161/2MASS J05291633+2508566/WISE J052916.35+250856.0/** RBR 1B/WDS J05293+2509Ba,Bb"
{
	ParentBody      "118 Tau"
}

Star "118 Tau Ba"
{
	DateUpdated     "2024-07-02"
	ParentBody      "118 Tau B"
	Parallax        9.5604
	AppMagn         6.67
	Class           "A0Vn"
	AbsMagn         1.57 // 计算的值
	MassSol         2.00
	Teff            9218
	FeH             -2.461

	BinaryOrbit     
	{
		Period          622.024
		Separation      101.460132367208 // 0.97 asec
	}
}

Star "118 Tau Bb"
{
	DateUpdated     "2024-07-02"
	ParentBody      "118 Tau B"
	Class           "G5V"
	MassSol         1.00
}

// Object * 103 Tau  ---  Spectroscopic Binary  ---  OID=@759357   (@@20386,0)  ---  coobox=4540 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Emission-line Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=23900
// NoirLab还列出第四颗恒星位于35.3秒处(UCAC2 40308458?)，为1.15太阳质量的F9型恒星，不过此伴星大概率为光学伴星
Barycenter "103 Tau Aab"
{
	ParentBody      "103 Tau"
	BinaryOrbit     
	{
		Period          192.456
		Separation      175.526564201496 // 0.37 asec
	}
}

Star "103 Tau Aa"
{
	DateUpdated     "2024-07-02"
	ParentBody      "103 Tau Aab"
	Class           "B2V"
	AbsMagn         -2.88 // 计算的值
	MassSol         4.50

	BinaryOrbit // SB9_297 1990ApJS...74..551A
	{
		PeriodDays      58.25
		Eccentricity    0.26
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2444276.602
		ArgOfPericenter 116
		MeanAnomaly     0
	}
}

Star "103 Tau Ab"
{
	DateUpdated     "2024-07-02"
	ParentBody      "103 Tau Aab"
	Class           ""
	MassSol         2.45
}

Star "103 Tau Ac"
{
	DateUpdated     "2024-07-02"
	ParentBody      "103 Tau"
	Class           ""
	MassSol         1.65
}

// Object * 99 Tau  ---  Star  ---  OID=@743251   (@@20280,5)  ---  coobox=4536 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Infra-Red Source 
Star "99 Tau A"
{
	DateUpdated     "2024-07-02"
	ParentBody      "99 Tau"
	Class           "K0III"
	AbsMagn         -0.47 // 计算的值

	BinaryOrbit     
	{
		Separation      1127.48103844159 // 6.26 asec
	}
}

// Object * 99 Tau B  ---  Star  ---  OID=@743252   (@@20280,6)  ---  coobox=4536 
// Object types: Double or Multiple Star,Star,Star,Optical Source 
Star "99 Tau B/LAMOST J045748.70+235700.8/HD 31553B/Gaia DR3 3419439831916377344/ADS 3557 B/CCDM J04578+2357B/CSI+23 777 2/IDS 04518+2348 B/WDS J04578+2357B/** BU 1045B"
{
	ParentBody      "99 Tau"
	Class           "F2.3?"
}

// Object * tau Tau  ---  Spectroscopic Binary  ---  OID=@732646   (@@20260,0)  ---  coobox=4524 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star,Star,Star 
Barycenter "TAU Tau A"
{
	ParentBody      "TAU Tau"
	BinaryOrbit     
	{
		Period          189185
		Separation      7624.83292137084 // 62.76 asec
	}
}

Barycenter "TAU Tau Aab"
{
	ParentBody      "TAU Tau A"
	BinaryOrbit // VB6_Cve2010e MCA_16Aa, Gr.3
	{
		Period          57.8960
		Separation      34.5044296759789 // 0.284 asec
		Eccentricity    0.357
		Inclination     130.7
		AscendingNode   4.1
		Epoch           2465407.666295031551272
		ArgOfPericenter 142.2
		MeanAnomaly     0
	}
}

Star "TAU Tau Aa"
{
	DateUpdated     "2024-07-02"
	ParentBody      "TAU Tau Aab"
	Class           "B3V"
	AbsMagn         -1.15
	MassSol         6.4
	Radius          2542997.04869169 // 计算的值
	LumBol          1472
	Teff            18700
	FeH             -0.51

	BinaryOrbit // SB9_266 1961PDAO...11..385P
	{
		PeriodDays      2.956549
		//Separation      0.01455
		Eccentricity    0.051
		Epoch           2436424.207
		ArgOfPericenter 306.7
		MeanAnomaly     0
	}
}

Star "TAU Tau Ab"
{
	DateUpdated     "2024-07-02"
	ParentBody      "TAU Tau Aab"
	Class           ""
	MassSol         3.28
}

Star "TAU Tau Ac"
{
	DateUpdated     "2024-07-02"
	ParentBody      "TAU Tau A"
	Class           ""
	MassSol         1.98
}

// Object HD 284659  ---  Star  ---  OID=@732643   (@@20258,15)  ---  coobox=4524 
// Object types: Near-IR Source (λ < 3 µm),Star,Star 
Star "HD 284659/Gaia DR3 146483815295124480/TIC 118893807/2MASS J04421220+2256324/PLX 1044/AG+22 455/BD+22 737/BDS 2313 C/CCDM J04422+2257C/GC 5715/GCRV 2758/GEN# +1.00284659/GSC 01830-02131/IDS 04362+2246 C/PPM 93707/SAO 76720/SKY# 7302/TYC 1830-2131-1/UBV 4512/UBV M 1133/YZ 22 1500/PLX 1044.00/** S 455B/WDS J04422+2257B/PMSC 04362+2246C/Gaia DR1 146483811000001920/WEB 4207/Gaia DR2 146483815295124480"
{
	DateUpdated     "2024-07-02"
	ParentBody      "TAU Tau"
	Parallax        8.1702
	AppMagn         7.1
	Class           "A2"
	AbsMagn         1.66 // 计算的值
	MassKg          3.13018472816244e+30 // log(g) = 4.191 cm/s^2
	RadSol          1.6675 // Gaia DR3
	LumBol          26.0578663488219 // 计算的值
	Teff            10099
	FeH             -1.454
}