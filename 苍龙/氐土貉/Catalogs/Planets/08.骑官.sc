// Object * gam Lup  ---  Ellipsoidal Variable  ---  OID=@3518079   (@@63879,12)  ---  coobox=21886 
// Object types: Double or Multiple Star,Ellipsoidal Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "GAM Lup A" {ParentBody "GAM Lup"}
Remove "GAM Lup B" {ParentBody "GAM Lup"}
Star "GAM Lup A"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HIP 76297"
	Class           "B2IV"
	AbsMagn         -2.4
	MassSol         9.5
	RadSol          5.5
	LumBol          5000
	Teff            20900
	Age             0.0186

	BinaryOrbit     
	{
		Period          190.0
		Separation      84.5164152501256 // 0.655 asec
		Eccentricity    0.51
		Inclination     95.0
		AscendingNode   94.6
		Epoch           2409541.680538285057992
		ArgOfPericenter 131.5
		MeanAnomaly     0
	}
}

// Object * gam Lup  ---  Ellipsoidal Variable  ---  OID=@3518079   (@@63879,12)  ---  coobox=21886 
// Object types: Double or Multiple Star,Ellipsoidal Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "GAM Lup B"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HIP 76297"
	Class           "B4V"
	MassSol         5.5
	RadSol          3.0
	LumBol          960
	Teff            17000
}

// Object * kap Cen  ---  beta Cep Variable  ---  OID=@3488423   (@@63467,1)  ---  coobox=21860 
// Object types: beta Cep Variable,Pulsating Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=73334
Remove "KAP Cen A" {ParentBody "KAP Cen"}
Remove "KAP Cen Aa" {ParentBody "KAP Cen A"}
Remove "KAP Cen Ab" {ParentBody "KAP Cen A"}
Remove "KAP Cen B" {ParentBody "KAP Cen"} // C为光学伴星
Star "KAP Cen A"
{
	DateUpdated     "2024-05-26"
	ParentBody      "Gaia DR3 5908713025970995584"
	Class           "B2IV"
	AbsMagn         -2.2
	MassSol         7.2
	RadSol          4.4
	LumBol          2500
	Teff            19800
	Age             0.0182

	BinaryOrbit // VB6_Tok2022f HDS2116Aa,Ab Gr.3
	{
		Period          9.8281
		Separation      9.16758890546799 // 0.078 asec
		Eccentricity    0.773
		Inclination     93.9
		AscendingNode   155.0
		Epoch           2457144.061547611374408
		ArgOfPericenter 340.0
		MeanAnomaly     0
	}
}

Star "KAP Cen B"
{
	DateUpdated     "2024-05-26"
	ParentBody      "Gaia DR3 5908713025970995584"
	Class           ""
	MassSol         5
}

// Object * lam Lup  ---  Spectroscopic Binary  ---  OID=@3472518   (@@63907,1)  ---  coobox=21867 
// Object types: Double or Multiple Star,Spectroscopic Binary,Pulsating Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "LAM Lup A" {ParentBody "LAM Lup"}
Remove "LAM Lup B" {ParentBody "LAM Lup"}
Barycenter "LAM Lup A"
{
	ParentBody      "HIP 74117"
	BinaryOrbit     
	{
		Period          70.8
		Separation      73.3491523683899 // 0.2597 asec
		Eccentricity    0.6283
		Inclination     71.59
		AscendingNode   26.64
		Epoch           2450780.081476051360369
		ArgOfPericenter 119.9
		MeanAnomaly     0
	}
}

Star "LAM Lup Aa"
{
	DateUpdated     "2024-05-26"
	ParentBody      "LAM Lup A"
	Class           "B3V"
	AbsMagn         -2.75
	MassSol         8.14
	Age             0.0281

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.327188365
		Eccentricity    0
		Inclination     0.978073597
		AscendingNode   0
		ArgOfPericenter 24.8489881
		MeanAnomaly     40.0561481
	}
}

Star "LAM Lup Ab"
{
	ParentBody      "LAM Lup A"
	Class           "B6.7?"
}

Star "LAM Lup B"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HIP 74117"
	Class           "B3V"
	MassSol         5.84
}

// Object * eps Lup  ---  beta Cep Variable  ---  OID=@3489233   (@@64317,12)  ---  coobox=21957 
// Object types: Spectroscopic Binary,beta Cep Variable,beta Cep Variable,beta Cep Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=75264
Remove "EPS Lup A" {ParentBody "EPS Lup"}
Remove "EPS Lup Aa" {ParentBody "EPS Lup A"}
Remove "EPS Lup Ab" {ParentBody "EPS Lup A"}
Remove "EPS Lup B" {ParentBody "EPS Lup"}
Barycenter "EPS Lup Aab"
{
	ParentBody      "HIP 75264"
	BinaryOrbit // VB6_Tok2022f COP_2AB Gr.3
	{
		Period          250.1243
		Separation      107.5351379963 // 0.685 asec
		Eccentricity    0.639
		Inclination     119.4
		AscendingNode   116.6
		Epoch           2456385.088258544448763
		ArgOfPericenter 30.5
		MeanAnomaly     0
	}
}

/*Barycenter "EPS Lup Aab"
{
	ParentBody      "EPS Lup A"
	BinaryOrbit
	{
		Period          3.278
		Separation      7.68930162308234 // 0.049 asec
	}
}*/

Star "eps Lup Aa"
{
	DateUpdated     "2024-05-26"
	ParentBody      "EPS Lup Aab"
	Class           "B3IV"
	AbsMagn         -2.55
	MassSol         13.24
	RadSol          4.7
	LumBol          3200
	Teff            19275

	BinaryOrbit // 2019MNRAS.488...64P 9.0+7.6 Mo
	{
		PeriodDays      4.5596
		SemiMajorAxisKm 20314440 // 29.2 RSun
		Eccentricity    0.282
		Inclination     20.2
		AscendingNode   0.0
		Epoch           2439379.883
		ArgOfPericenter 154.0
		MeanAnomaly     0
	}
}

Star "eps Lup Ab"
{
	DateUpdated     "2024-05-26"
	ParentBody      "EPS Lup Aab"
	Class           "B3V"
	MassSol         11.46
	RadSol          3.8
}

/*Star "eps Lup Ac(Retracted)" // Pablo+ Magn. heartbeat binary, SB orb., PIONIER: SB resolved, no Ab!
{
	DateUpdated     "2024-05-26"
	ParentBody      "EPS Lup A"
	Class           ""
	MassSol         3.70
}*/

// Object * eps Lup C  ---  Star  ---  OID=@3489234   (@@64317,13)  ---  coobox=21957 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "EPS Lup C/Gaia DR3 6000130236647036288/TIC 147229903/CD-44 10066C/CCDM J15227-4441C/CPC 0 13263/CPD-44 7342C/CSI-44 10066 22/GCRV 5263 E/IDS 15159-4420 C/WDS J15227-4441C/2MASS J15224135-4441482/PPMX J152241.3-444148/** DUN 182C/DENIS J152241.2-444147/WEB 12840/Gaia DR2 6000130236647036288"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HIP 75264"
	Parallax        3.8676
	Class           "A5V"
	MassSol         7.64
}

// Object * mu. Lup  ---  Be Star  ---  OID=@3473211   (@@64330,5)  ---  coobox=21960 
// Object types: Be Star,Be Star,Be Star,Pulsating Variable,Double or Multiple Star,Emission-line Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=74911
Remove "MU Lup (AB)" {ParentBody "MU Lup"}
Remove "MU Lup A" {ParentBody "MU Lup (AB)"}
Remove "MU Lup B" {ParentBody "MU Lup (AB)"}
Remove "MU Lup C" {ParentBody "MU Lup"}
Barycenter "MU Lup ABD"
{
	ParentBody      "MU Lup"
	BinaryOrbit     
	{
		Period          33450
		Separation      2331.27573089284 // 22.66 asec
	}
}

Barycenter "MU Lup AB"
{
	ParentBody      "MU Lup ABD"
}

// Object * mu.01 Lup  ---  Star  ---  OID=@8399692   (@@-1,255)  ---  coobox=21960 
// Object types: Double or Multiple Star,Star 
Star "MU1 Lup/TYC 8298-4182-1/** HJ 4753B/WDS J15185-4753B/MU Lup A"
{
	DateUpdated     "2024-05-26"
	ParentBody      "MU Lup AB"
	Class           "B7V"
	AbsMagn         -0.57
	MassSol         4.42
	Radius          3136885.22637442 // 计算的值
	LumBol          603
	Teff            13470
	Age             0.112

	BinaryOrbit // VB6_Zir2015a HJ_4753AB Gr.5
	{
		Period          772.0000
		Separation      170.472997394322 // 1.657 asec
		Eccentricity    0.430
		Inclination     114.6
		AscendingNode   137.4
		Epoch           2469076.158939587883651
		ArgOfPericenter 80.9
		MeanAnomaly     0
	}
}

// Object * mu.02 Lup  ---  Star  ---  OID=@3473224   (@@64330,18)  ---  coobox=21960 
// Object types: Double or Multiple Star,Star 
Star "MU2 Lup/TYC 8298-4182-2/** HJ 4753A/WDS J15185-4753A/MU Lup B"
{
	DateUpdated     "2024-05-26"
	ParentBody      "MU Lup AB"
	Class           ""
	MassSol         3.07
}

Star "MU Lup D" // D位于距离AB 6.1秒 处，，但是Gaia没看到，可能太暗了
{
	DateUpdated     "2024-05-26"
	ParentBody      "MU Lup ABD"
	Class           ""
	MassSol         0.05

	Orbit     
	{
		SemiMajorAxis   632.716054470139 // 6.15 asec
	}
}

// Object HD 135748  ---  Star  ---  OID=@3473212   (@@64330,6)  ---  coobox=21960 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,X-ray Source 
Star "HD 135748/HIP 74915/Gaia DR3 5902970620350884736/TIC 144028102/CCDM J15185-4753C/CD-47 9861/CPC 0 13166/CPD-47 7019C/GC 20557/GSC 08298-04183/HIC 74915/IDS 15116-4730 C/N30 3442/PPM 320445/SAO 225639/SKY# 27723/TYC 8298-4183-1/uvby98 100135748/2MASS J15183377-4752451/1RXS J151834.0-475254/WDS J15185-4753C/** DUN 180C/PMSC 15116-4730C/Gaia DR1 5902970616032544896/GEN# +1.00135748/Gaia DR2 5902970620350884736"
{
	DateUpdated     "2024-05-26"
	ParentBody      "MU Lup"
	Parallax        5.171
	AppMagn         6.76
	Class           "A2/3(V)"
	AbsMagn         0.328 // 计算的值
	MassKg          3.52143234068007e+30 // log(g) = 4.213 cm/s^2
	RadSol          1.72441 // Gaia DR3
	LumBol          31.3045106677769 // 计算的值
	Teff            10397
	FeH             -0.96
}

Star "HD 135748 B"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HD 135748"
	Class           ""
	MassSol         0.04

	Orbit // 2014A&A...567A..35V
	{
		PeriodDays      12.3530
		Eccentricity    0.400
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2455177.700
		ArgOfPericenter 324.0
		MeanAnomaly     0
	}
}

// Object * pi. Lup A  ---  Star  ---  OID=@11633757   (@@-1,255)  ---  coobox=21952 
// Object types: Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=73807
Remove "PI Lup A" {ParentBody "PI Lup"}
Remove "PI Lup B" {ParentBody "PI Lup"}
// o DR3 astrometry for A,B. Ecl. binary P=15.5d, possibly quadruple
Barycenter "PI Lup A/TYC 8297-4705-1/CCDM J15051-4703A/CD-46 9773A/CPD-46 7178A/CSI-46 9773 21/GCRV 8724/HD 133242/HR 5605/IDS 14583-4640 A/ALS 17476/WDS J15051-4703A"
{
	ParentBody      "HIP 73807"
	BinaryOrbit     
	{
		Period          992.241
		Separation      239.066650049342 // 1.640 asec
	}
}

// Reference: https://ui.adsabs.harvard.edu/abs/2023A%26A...678A..93G/abstract
Star "PI Lup Aa"
{
	DateUpdated     "2024-05-26"
	ParentBody      "PI Lup A"
	Class           "B5V"
	AbsMagn         -1.93 // 计算的值
	MassSol         4.7
	RadSol          3.33 // TESS
	LumBol          654.7297512149296 // 计算的值
	Teff            16000
	Age             0.0217

	BinaryOrbit     
	{
		PeriodDays      15.500
		Separation      0.245
		Eccentricity    0.32 // 0.35
		Inclination     84.5
	}
}

Star "PI Lup Ab"
{
	DateUpdated     "2024-05-26"
	ParentBody      "PI Lup A"
	Class           ""
	MassSol         3.48
	RadSol          2.49 // TESS
	LumBol          307.722983071016912 // 47% Primary
	Teff            15320.2866186736 // 计算的值
}

// Object * pi. Lup B  ---  Star  ---  OID=@11622926   (@@-1,255)  ---  coobox=21952 
// Object types: Double or Multiple Star,Star 
Star "PI Lup B/TYC 8297-4705-2/CCDM J15051-4703B/CD-46 9773B/CPD-46 7178B/CSI-46 9773 22/GCRV 5170 E/HD 133243/HR 5606/IDS 14583-4640 B/ALS 15006/WDS J15051-4703B"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HIP 73807"
	Class           "B5IV"
	MassSol         4.7
	Teff            14000
	Age             0.014
}

// Object * omi Lup  ---  Double or Multiple Star  ---  OID=@3472135   (@@63481,1)  ---  coobox=21859 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// 系统结构和两颗伴星的数据均未知，只能先这样摆
Star "OMI Lup A"
{
	DateUpdated     "2024-05-26"
	ParentBody      "OMI Lup"
	Class           "B5IV"
	AbsMagn         -1.2
	MassSol         5.7
	RadSol          3.5
	LumBol          1260
	Teff            18000
}

Star "OMI Lup B" // B在距离A 0.1秒 处
{
	ParentBody      "OMI Lup A"
	Class           "B9.4?"

	Orbit     
	{
		SemiMajorAxis   12.3911339456265
	}
}

Star "OMI Lup C" // C在距离A 17天文单位 处
{
	ParentBody      "OMI Lup A"
	Class           "A3.1?"

	Orbit     
	{
		Period          27
		SemiMajorAxis   17
	}
}
