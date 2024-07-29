// Object * 10 UMa  ---  Spectroscopic Binary  ---  OID=@577215   (@@935,3)  ---  coobox=4047 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "10 UMa A" {ParentBody "10 UMa"}
Remove "10 UMa B" {ParentBody "10 UMa"}
Star "10 UMa A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "GJ 332"
	Class           "F3V"
	AbsMagn         2.93 // 计算的值
	MassSol         1.44
	Radius          1056162.59939508 // 计算的值
	LumBol          4.285
	Teff            6740

	BinaryOrbit     
	{
		PeriodDays      7691.0
		Separation      10.3753745277744 // 0.64566 asec
		Eccentricity    0.15075
		Inclination     131.366
		AscendingNode   203.74
		Epoch           2449263.1
		ArgOfPericenter 212.30
		MeanAnomaly     0
	}
}

Star "10 UMa B"
{
	DateUpdated     "2024-07-29"
	ParentBody      "GJ 332"
	Class           "K0V"
	MassSol         0.89
	Radius          671686.928601962 // 计算的值
	LumBol          0.638
	Teff            5250
}

// Object * 38 Lyn  ---  High Proper Motion Star  ---  OID=@1612109   (@@654,12)  ---  coobox=12293 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=45688
Remove "38 Lyn A" {ParentBody "38 Lyn"}
Remove "38 Lyn B" {ParentBody "38 Lyn"}
Barycenter "38 Lyn AB"
{
	ParentBody      "38 Lyn"
	BinaryOrbit     
	{
		Period          111051
		Separation      3976.73690325853 // 98.26 asec
	}
}

Star "38 Lyn A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "38 Lyn AB"
	Class           "A1V"
	AbsMagn         0.98
	MassSol         1.90
	RadSol          3.07
	LumBol          32
	Teff            8862
	FeH             -0.36
	Age             0.213
}

// Object * 38 Lyn B  ---  Double or Multiple Star  ---  OID=@1612098   (@@654,0)  ---  coobox=12293 
// Object types: Double or Multiple Star,Star 
Barycenter "38 Lyn B/Gaia DR3 810952158347151488/ADS 7292 B/CCDM J09188+3648B/CSI+37 1965 2/GCRV 3446 E/IDS 09126+3714 B/ROT 3555/WDS J09188+3648B/TYC 2499-1655-2/WDS J09188+3648Ba,Bb/** CHR 173/** STF 1334B/PMSC 09126+3713BP/PMSC 09126+3713B/HD 80081B/BD+37 1965B/WEB 8675/Gaia DR2 810952158347151488"
{
	ParentBody      "38 Lyn AB"
	BinaryOrbit // VB6_Izm2019  STF1334AB Gr.4
	{
		Period          2782.8335
		Separation      260.839324252865 // 6.445 asec
		Eccentricity    0.771
		Inclination     104.3
		AscendingNode   87.3
		Epoch           2285615.002491891849786
		ArgOfPericenter 107.3
		MeanAnomaly     0
	}
}

Star "38 Lyn Ba"
{
	DateUpdated     "2024-07-29"
	ParentBody      "38 Lyn B"
	Parallax        24.3529
	AppMagn         6.09
	Class           "A4V"
	AbsMagn         3.02 // 计算的值
	MassSol         1.30
	RadSol          1.811132 // Gaia DR3
	LumBol          5
	Teff            6431
	FeH             -0.736

	BinaryOrbit     
	{
		Period          19.466
		Separation      9.73165199542188 // 0.237 asec
	}
}

Star "38 Lyn Bb"
{
	DateUpdated     "2024-07-29"
	ParentBody      "38 Lyn B"
	Class           ""
	MassSol         0.90
	Teff            5409
}

// Object UCAC3 254-98853  ---  High Proper Motion Star  ---  OID=@8596091   (@@-1,255)  ---  coobox=12293 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Star 
Star "UCAC3 254-98853/Gaia DR3 810953670175637632/WISEA J091857.15+364907.0/TIC 355176491/2MASS J09185718+3649084/UCAC4 635-045414/WISE J091857.16+364907.2/WDS J09188+3648E/Gaia DR2 810953670175637632"
{
	DateUpdated     "2024-07-29"
	ParentBody      "38 Lyn"
	Class           "M2"
	MassSol         0.31
	Teff            3816
}

// Object * kap Leo  ---  Double or Multiple Star  ---  OID=@1629359   (@@33784,7)  ---  coobox=12434 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "Al Minliar al Asad A" {ParentBody "Al Minliar al Asad"}
Remove "Al Minliar al Asad B" {ParentBody "Al Minliar al Asad"}
Star "KAP Leo A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "KAP Leo"
	Class           "K2IIIb"
	AbsMagn         0.66
	MassSol         1.44
	RadSol          17
	LumBol          89
	Teff            4403
	FeH             0.01
	Age             4.33

	BinaryOrbit     
	{
		Separation      188.203762647333 // 3.07 asec
	}
}

Star "KAP Leo B"
{
	ParentBody      "KAP Leo"
	Class           "A7.1?"
}

// Object * mu. Leo b  ---  Extra-solar Planet  ---  OID=@15302270   (@@-1,255)  ---  coobox=12489
// Object types: Extra-solar Planet,Star
Planet "MU Leo b"
{
	ParentBody     "MU Leo"
	DiscMethod     "RadVel"
	DiscDate       "2014"
	MassJup        2.4

	Surface{Preset "jupiter_temperate_reddish2.cfg"}

	Clouds
	{
		mainFreq        1.32
		mainOctaves     12
		Coverage        0.587
		stripeZones     7.6
		stripeFluct     0.94
		stripeTwist     6.62
		cycloneMagn     13
		cycloneFreq     0.509
		cycloneDensity  0.538
		cycloneOctaves  1
		cycloneMagn2     0.441
		cycloneFreq2     0.275
		cycloneLatitude2 1
		cycloneOctaves2  0
	}

	Atmosphere
	{
		Model          "Jupiter"
		Bright          10
		Opacity         0.5
		SkyLight        3.33
		Hue             -0.2
		Saturation      1
	}

	Orbit
	{
		Epoch           2452921
		PeriodDays      357.8
		SemiMajorAxis   1.1
		Eccentricity    0.09
		ArgOfPericen    227.1
	}
}

// Object * gam01 Leo  ---  High Proper Motion Star  ---  OID=@1710354   (@@35241,0)  ---  coobox=12884
// Object types: High Proper Motion Star,Double or Multiple Star,Variable Star,High Proper Motion Star,Star,Infra-Red Source
Remove "Algieba A" {ParentBody "GAM Leo"}
Remove "Algieba B" {ParentBody "GAM Leo"}
Remove "GAM 1 Leo b" {ParentBody "GAM1 Leo"}
Star "GAM1 Leo/PLX 2423/ASCC 863632/USNO-B1.0 1098-00182798/LSPM J1019+1950N/GAM Leo A/41 Leo A/ADS 7724 A/BD+20 2467A/CCDM J10199+1951A/CSI+20 2467 2/GC 14177/GCRV 6502/GPM 154.992225+19.841924/HD 89484/HR 4057/IDS 10145+2021 A/IRAS 10172+2005/IRC +20219/JP11 1932/LTT 12764/N30 2453/NLTT 24029/NSV 4823/PPM 127320/RAFGL 1410/ROT 1557/SAO 81298/SKY# 19846/TYC 1423-1349-1/UBV M 16128/YPAC 487/WDS J10200+1950A/** STF 1424A/WEB 9279"
{
	DateUpdated     "2024-07-29"
	ParentBody      "HIP 50583"
	Class           "K1IIIFe-1"
	AbsMagn         -0.27
	MassSol         1.66
	RadSol          26.08
	LumBol          250
	Teff            4457
	FeH             -0.41
	Age             1.75

	BinaryOrbit     
	{
		Period          554
		Separation      123.653755840891 // 3.1 asec
		Eccentricity    0.93
		Inclination     41
		AscendingNode   143.4
		Epoch           2331489.422658785246313
	}
}

// Object * gam02 Leo  ---  High Proper Motion Star  ---  OID=@1710353   (@@35235,6)  ---  coobox=12884 
// Object types: Double or Multiple Star,High Proper Motion Star,Star 
Star "GAM2 Leo/TYC 1423-1349-2/ASCC 863633/LSPM J1019+1950S/41 Leo B/GAM Leo B/ADS 7724 B/BD+20 2467B/CCDM J10199+1951B/CSI+20 2467 1/GC 14178/GCRV 6503/HD 89485/HR 4058/IDS 10145+2021 B/LTT 12765/NLTT 24030/SAO 81299/SKY# 19847/WDS J10200+1950B/** STF 1424B/WEB 9280"
{
	DateUpdated     "2024-07-29"
	ParentBody      "HIP 50583"
	Class           "G7IIIbFe-1.5"
	AbsMagn         0.98
	MassSol         1.55
	RadSol          10.55
	LumBol          63.1
	Teff            4969
	FeH             -0.38
	Age             2.12
}

// Object * gam01 Leo b  ---  Extra-solar Planet  ---  OID=@5164259   (@@-1,255)  ---  coobox=12884
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "GAM1 Leo b/HD 89484b"
{
	ParentBody     "GAM1 Leo"
	DiscMethod     "RadVel"
	DiscDate       "2009"
	MassJup        10.7

	Orbit
	{
		Epoch           2451236
		PeriodDays      428.5
		SemiMajorAxis   1.19
		Eccentricity    0.144
		Inclination     172.1
		ArgOfPericen    206.7
	}
}

Planet "GAM1 Leo c"
{
	ParentBody     "GAM1 Leo"
	DiscMethod     "RadVel"
	DiscDate       "2009"
	MassJup        2.14

	Orbit
	{
		PeriodDays      1340
		SemiMajorAxis   2.6
		Eccentricity    0.13
	}
}

// Object * eta Leo  ---  Star  ---  OID=@1671384   (@@34938,0)  ---  coobox=12877 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "ETA Leo A" {ParentBody "ETA Leo"}
Remove "ETA Leo B" {ParentBody "ETA Leo"}
Star "ETA Leo A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "HIP 49583"
	Class           "A0Ib"
	AbsMagn         -5.54
	MassSol         10
	RadSol          47
	LumBol          19000
	Teff            9600
	FeH             -0.04
	Age             0.025

	BinaryOrbit     
	{
		Period          120
		Separation      60
	}
}

Star "ETA Leo B"
{
	DateUpdated     "2024-07-29"
	ParentBody      "HIP 49583"
	Class           "B"
	MassSol         9
}

// Object * alf Leo  ---  High Proper Motion Star  ---  OID=@1689590   (@@34955,0)  ---  coobox=12920 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=87901
Remove "Regulus (AB)"{ParentBody "Regulus"}
Remove "ALF Leo (CD)"{ParentBody "Regulus"}
Remove "Regulus A"{ParentBody "Regulus (AB)"}
Remove "ALF Leo B"{ParentBody "Regulus (AB)"}
Remove "ALF Leo C"{ParentBody "ALF Leo (CD)"}
Remove "ALF Leo D"{ParentBody "ALF Leo (CD)"}
Barycenter "ALF Leo A"
{
	ParentBody      "ALF Leo"
	BinaryOrbit     
	{
		Period          124155
		Separation      5000
	}
}

Star "ALF Leo Aa"
{
	DateUpdated     "2024-07-29"
	ParentBody      "ALF Leo A"
	Class           "B8IVn"
	AbsMagn         -0.57
	MassSol         3.44
	DimensionsSol   (8.32, 6.28, 8.32)
	LumBol          314
	Teff            10314 // (10314, 15400, 10314)
	FeH             0.21
	RotationPeriod  15.9
	Age             1

	BinaryOrbit
	{
		PeriodDays      40.102
		SemiMajorAxisKm 4174200 // 6 RSun, Projected
		Eccentricity    0 // Assumed
		Epoch           2444526.3
	}
}

Star "ALF Leo Ab"
{
	DateUpdated     "2024-07-29"
	ParentBody      "ALF Leo A"
	Class           "WD"
	MassSol         0.30
}

// Object HD 87884  ---  High Proper Motion Star  ---  OID=@1689552   (@@34948,0)  ---  coobox=12920 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,X-ray Source 
Barycenter "HD 87884/GJ 9316 B/Gaia DR3 3880785530720066176/WISEA J100812.63+115949.3/TIC 357348155/UCAC2 35936293/LSPM J1008+1159/ASCC 949704/USNO-B1.0 1019-00203253/AG+12 1198/BD+12 2147/GC 13922/GCRV 6416/GEN# +1.00087884/LTT 12714/NLTT 23485/PPM 127133/ROT 1534/SAO 98966/TYC 833-134-1/UBV 9450/UBV M 15957/YZ 12 3953/2MASS J10081279+1159491/[ZEH2003] RX J1008.2+1200 1/RX J1008.2+1200/1RXS J100813.4+120005/** STFB 6B/Gaia DR1 3880785526425032832/WEB 9158/Gaia DR2 3880785530720066176/CCDM J10083+1159B/ADS 7654 B/WDS J10084+1158B/** HDO 127B/WISE J100812.64+115949.2"
{
	ParentBody      "ALF Leo"
}

Star "HD 87884 A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "HD 87884"
	Class           "K2V"
	AbsMagn         6.20
	MassSol         0.8
	RadSol          0.83
	LumBol          0.50
	Teff            4885
	FeH             -0.21

	BinaryOrbit     
	{
		Period          315.192
		Separation      39.007166122918 // 1.61 asec
	}
}

// Object HD 87884B  ---  High Proper Motion Star  ---  OID=@15596632   (@@-1,255)  ---  coobox=12920 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "HD 87884B/GJ 9316 C/Gaia DR3 3880785530720066304/CCDM J10083+1159C/ADS 7654 C/WDS J10084+1158C/** HDO 127C/Gaia DR2 3880785530720066304"
{
	DateUpdated     "2024-07-29"
	ParentBody      "HD 87884"
	Class           "M4V"
	AbsMagn         11.56
	MassSol         0.3
	RadSol          0.37
	LumBol          0.013625397106211745 // 计算的值
	Teff            3242
}

// Object * omi Leo  ---  Spectroscopic Binary  ---  OID=@1644140   (@@34371,3)  ---  coobox=12863 
// Object types: Double or Multiple Star,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
/// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=47508
Remove "Subra A" {ParentBody "Subra"}
Remove "Subra B" {ParentBody "Subra"}
Barycenter "OMI Leo A"
{
	ParentBody      "OMI Leo"
	BinaryOrbit     
	{
		Period          2809
		Separation      151.337337145543 // 3.662 asec
	}
}

Star "OMI Leo Aa"
{
	DateUpdated     "2024-07-29"
	ParentBody      "OMI Leo A"
	Class           "F8III"
	AbsMagn         0.51
	MassSol         2.12
	RadSol          5.9
	LumBol          39.4
	Teff            6000
	Age             0.800 // estimate

	BinaryOrbit     
	{
		PeriodDays      14.498064
		Separation      0.196709448096367 // 4.46 mas
		Eccentricity    0
		Inclination     57.6
		AscendingNode   191.4
		Epoch           2460629.831
	}
}

Star "OMI Leo Ab"
{
	DateUpdated     "2024-07-29"
	ParentBody      "OMI Leo A"
	Class           "A7m"
	MassSol         1.87
	RadSol          2.2
	LumBol          15.4
	Teff            7600
}

// B(GSC 00821-00737)为光学伴星，以下恒星为NoirLab列出的另一颗恒星，距离3.662秒，0.88太阳质量
Star "OMI Leo B"
{
	DateUpdated     "2024-07-29"
	ParentBody      "OMI Leo"
	Class           ""
	MassSol         0.88
}

// Object * rho Leo  ---  Blue Supergiant  ---  OID=@1730603   (@@36001,0)  ---  coobox=13184 
// Object types: Blue Supergiant,Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Remove "RHO Leo A" {ParentBody "RHO Leo"}
Remove "RHO Leo B" {ParentBody "RHO Leo"}
Star "RHO Leo A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "Gaia DR3 3870025847369674624"
	Class           "B1IbNstr"
	AbsMagn         -6.02
	MassSol         27.1
	RadSol          37.4
	LumBol          45604
	Teff            22000
	FeH             -0.06
	RotationPeriod  643.2
	Age             0.0045

	BinaryOrbit     
	{
		Separation      6.29470233908375 // 0.01 asec
	}
}

Star "RHO Leo B"
{
	ParentBody      "Gaia DR3 3870025847369674624"
	Class           "O9.1?"
}

// Object * 31 Leo  ---  High Proper Motion Star  ---  OID=@1689563   (@@34948,11)  ---  coobox=12922 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "31 Leo A"
{
	DateUpdated     "2024-07-29"
	ParentBody      "31 Leo"
	Class           "K3.5IIIbFe-1:"
	AbsMagn         -0.39
	MassKg          2.19198551263334e+30 // log(g) = 1.42 cm/s^2
	RadSol          33.9
	LumBol          283
	Teff            4066
	FeH             -0.02

	BinaryOrbit     
	{
		Separation      740.411331505251 // 8.16 asec
	}
}

// Object * 31 Leo B  ---  High Proper Motion Star  ---  OID=@15323913   (@@-1,255)  ---  coobox=12922 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "31 Leo B/Gaia DR3 3879879808016012544/ADS 7649 B/CCDM J10079+1000B/HD 87837B/WDS J10079+1000B/Gaia DR2 3879879808016012544"
{
	DateUpdated     "2024-07-29"
	ParentBody      "31 Leo"
	Class           ""
	MassKg          1.57765835314636e+30 // log(g) = 4.605 cm/s^2
	RadSol          0.735 // Gaia DR3
	LumBol          0.186772957081797 // 计算的值
	Teff            4426
	FeH             0.47
}
