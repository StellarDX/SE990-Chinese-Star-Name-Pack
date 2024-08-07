// Object * tet Cep  ---  Spectroscopic Binary  ---  OID=@236496   (@@8229,0)  ---  coobox=773 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "TET Cep A"
{
	DateUpdated     "2024-06-14"
	ParentBody      "TET Cep"
	Class           "A7III"
	AbsMagn         1.12
	MassSol         2.75
	RadSol          3.09
	LumBol          46.5
	Teff            7375
	FeH             0.27
	Age             0.055

	BinaryOrbit     
	{
		PeriodDays      914.3
		Separation      4.16
		Eccentricity    0.377
		Epoch           2456991.3
		ArgOfPericenter 48.8
		MeanAnomaly     0
	}
}

Star "TET Cep B"
{
	DateUpdated     "2024-06-14"
	ParentBody      "TET Cep"
	Class           "K7V"
	MassSol         0.62
	RadSol          0.654
	LumBol          0.10573695800221733 // 计算的值
	Teff            4070
}

Planet "ETA Cep b"
{
	DateUpdated     "2024-06-14"
	ParentBody      "ETA Cep"
	DiscDate        "1998"
	Class           "GasGiant"
	MassJup         0.64

	Orbit     
	{
		PeriodDays      163.57
		SemiMajorAxis   0.638
		Eccentricity    0.17
	}
}

Planet "ETA Cep c(?)"
{
	DateUpdated     "2024-06-14"
	ParentBody      "ETA Cep"
	DiscDate        "1998"
	Class           "GasGiant"
	MassJup         1.2

	Orbit     
	{
		Period          10
	}
}

// Object * alf Cep  ---  High Proper Motion Star  ---  OID=@219505   (@@7808,0)  ---  coobox=776 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "ALF Cep A"
{
	DateUpdated     "2024-06-14"
	ParentBody      "ALF Cep"
	Class           "A8Vn"
	AbsMagn         1.57
	MassSol         2.00
	DimensionsSol   (5.646, 4.35, 5.646)
	LumBol          17
	Teff            7700
	FeH             0.09
	RotationPeriod  12.11
	Age             0.82
}

// Object * ksi Cep A  ---  Spectroscopic Binary  ---  OID=@3552160   (@@77093,13)  ---  coobox=637 
// Object types: Double or Multiple Star,Spectroscopic Binary,Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=108917
Remove "Kurhah A"{ParentBody "Kurhah"}
Remove "Kurhah B"{ParentBody "Kurhah"}
Remove "Kurhah Aa"{ParentBody "Kurhah A"}
Remove "Kurhah Ab"{ParentBody "Kurhah A"}
Barycenter "KSI Cep A/Gaia DR3 2218144110660778368/TYC 4271-2620-1/UCAC4 774-050548/** MCA 69/** STF 2863A/WDS J22038+6438A/WDS J22038+6438Aa,Ab/CCDM J22038+6437A/PMSC 22009+6408Aab/Renson 58390/IDS 22009+6408 A/BD+63 1802A/ADS 15600 A/GCRV 13869/LSPM J2203+6437E/NLTT 52854/SBC9 1350/ASCC 147353/CSI+63 1802 2/LTT 16451/ROT 3208/GC 30877/HD 209790/SAO 19827/WEB 19590/Gaia DR2 2218144110659419264/SBC7 893"
{
	ParentBody      "KSI Cep"
	BinaryOrbit // VB6_Izm2019  STF2863AB Gr.4
	{
		Period          2501.3052
		Separation      276.205966091695 // 9.333 asec
		Eccentricity    0.749
		Inclination     116.2
		AscendingNode   112.0
		Epoch           2335350.032699900213629
		ArgOfPericenter 76.3
		MeanAnomaly     0
	}
}

Star "KSI Cep Aa"
{
	DateUpdated     "2024-06-14"
	ParentBody      "KSI Cep A"
	Parallax        32.12
	AppMagn         4.45
	Class           "kA2.5hF2mF2(IV)"
	AbsMagn         1.79
	MassSol         1.045
	RadSol          2.325 // Gaia DR3
	LumBol          11.6531169388908 // 计算的值
	Teff            6994
	FeH             -0.111

	BinaryOrbit // VB6_CIA2014a MCA_69Aa, Gr.2
	{
		Period          2.2449
		Separation      2.30452485486364 // 0.074 asec
		Eccentricity    0.481
		Inclination     71.0
		AscendingNode   89.6
		Epoch           2440948.491969264578074
		ArgOfPericenter 273.0
		MeanAnomaly     0
	}
}

Star "KSI Cep Ab"
{
	DateUpdated     "2024-06-14"
	ParentBody      "KSI Cep A"
	Class           "F2III" // RR Lyr?
	MassSol         0.408
}

// Object * ksi Cep B  ---  High Proper Motion Star  ---  OID=@200379   (@@6923,3)  ---  coobox=637 
// Object types: High Proper Motion Star,Double or Multiple Star,High Proper Motion Star,Star,X-ray Source 
Star "KSI Cep B/Gaia DR3 2218144866573662848/TYC 4271-2619-1/ASCC 147350/1RXS J220346.0+643741/ADS 15600 B/BD+63 1802B/CCDM J22038+6437B/CSI+63 1802 1/GC 30876/GCRV 13868/HD 209791/IDS 22009+6408 B/LTT 16452/NLTT 52851/ROT 3209/SAO 19826/SKY# 42033/LSPM J2203+6437W/1E 2202.3+6423/WDS J22038+6438B/PMSC 22009+6408B/** STF 2863B/WEB 19589/Gaia DR2 2218144866573662848"
{
	DateUpdated     "2024-06-14"
	ParentBody      "KSI Cep"
	Parallax        32.1835
	AppMagn         6.342
	Class           "F8V" // 双星?
	AbsMagn         3.88 // 计算的值
	MassKg          2.19995353452995e+30 // log(g) = 4.264 cm/s^2
	RadSol          1.28525 // Gaia DR3
	LumBol          2.091827851537 // 计算的值
	Teff            6123
	FeH             -0.275
}

// Object * omi Cep A  ---  High Proper Motion Star  ---  OID=@11467972   (@@-1,255)  ---  coobox=930 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "OMI Cep A/Gaia DR3 2213911506286166400/CCDM J23186+6807A/** STF 3001A/ADS 16666 A/BD+67 1514A/HD 219916A/WDS J23186+6807A/IDS 23145+6734 A/TYC 4478-1361-1/Gaia DR2 2213911506281421824"
{
	DateUpdated     "2024-06-14"
	ParentBody      "OMI Cep"
	Parallax        16.3251
	AppMagn         4.87
	Class           "G8III"
	AbsMagn         0.78
	MassSol         2.35
	LumBol          51
	FeH             0.05

	BinaryOrbit     
	{
		Period          1505
		Separation      194.89409855385 // 3.13 asec
		Eccentricity    0.439
		Inclination     16.0
		AscendingNode   4.5
		Epoch           2339049.936173552181572
		ArgOfPericenter 273.0
		MeanAnomaly     0
	}
}

// Object * omi Cep B  ---  Star  ---  OID=@11467973   (@@-1,255)  ---  coobox=930 
// Object types: Double or Multiple Star,Star 

Star "OMI Cep B/Gaia DR3 2213911506281422208/CCDM J23186+6807B/** STF 3001B/ADS 16666 B/BD+67 1514B/HD 219916B/WDS J23186+6807B/IDS 23145+6734 B/TYC 4478-1361-2/Gaia DR2 2213911506281422208"
{
	DateUpdated     "2024-06-14"
	ParentBody      "OMI Cep"
	Class           "F6V"
	MassSol         1.29
}
