// Object * 15 Lac  ---  High Proper Motion Star  ---  OID=@1586277   (@@33235,5)  ---  coobox=10079 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "15 Lac A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "15 Lac"
	Class           "M1III"
	AbsMagn         -0.04
	MassKg          2.26911207382667e+30 // log(g) = 1.352 cm/s^2
	RadSol          37.30
	LumBol          294.5
	Teff            3915

	BinaryOrbit     
	{
		Epoch           2456658
		Separation      2537.30700348678 // 23.6 asec
		PositionAngle   159
	}
}

// Object BD+42 4521B  ---  Star  ---  OID=@1586278   (@@33235,6)  ---  coobox=10079 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+42 4521B/Gaia DR3 1934658088521259392/TIC 154432135/ADS 16325 B/CCDM J22520+4319B/CSI+42 4521 2/2MASS J22520298+4318232/WDS J22520+4319B/** BU 451B/Gaia DR2 1934658088521259392"
{
	DateUpdated     "2024-06-13"
	ParentBody      "15 Lac"
	Parallax        0.4663
	AppMagn         12.2
	Class           "" // 光学伴星?
	AbsMagn         0.543 // 计算的值
	MassKg          5.48026775294847e+30 // log(g) = 2.711 cm/s^2
	RadSol          12.125 // Gaia DR3
	LumBol          96.6202240245837 // 计算的值
	Teff            5197
	FeH             -0.16
}

// Object * 2 Lac  ---  Spectroscopic Binary  ---  OID=@17245   (@@8076,2)  ---  coobox=517 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "2 Lac A" {ParentBody "2 Lac"}
Remove "2 Lac B" {ParentBody "2 Lac"}
Star "2 Lac A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "Gaia DR3 1986461686244859008"
	Class           "B6IV"
	AbsMagn         -1.19
	MassSol         6.99
	Radius          9631656.18124889 // log(g) = 3.0 cm/s^2
	LumBol          8742.117720555772 // 计算的值
	Teff            15000

	BinaryOrbit     
	{
		Period          2.616430
		Eccentricity    0.040
		Epoch           2427770
		ArgOfPericenter 277.4
		MeanAnomaly     0
	}
}

Star "2 Lac B"
{
	DateUpdated     "2024-06-13"
	ParentBody      "Gaia DR3 1986461686244859008"
	Class           "B6V"
	MassSol         5.55
}

// Object * f01 Cyg  ---  Be Star  ---  OID=@94120   (@@9959,0)  ---  coobox=192 
// Object types: Be Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Emission-line Star,Irregular Variable,Near-IR Source (λ < 3 µm),Variable Star,Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=103632
Remove "59 Cyg (AB)"{ParentBody "59 Cyg"}
Remove "59 Cyg A"{ParentBody "59 Cyg (AB)"}
Remove "59 Cyg Aa"{ParentBody "59 Cyg A"}
Remove "59 Cyg Ab"{ParentBody "59 Cyg A"}
Remove "59 Cyg B"{ParentBody "59 Cyg (AB)"}
Remove "59 Cyg C"{ParentBody "59 Cyg"}
Barycenter "59 Cyg Aab"
{
	ParentBody      "59 Cyg"
}

Barycenter "59 Cyg Aa"
{
	ParentBody      "59 Cyg Aab"
	BinaryOrbit // VB6_Msn2011f MCA_65Aa, Gr.4
	{
		Period          161.5000
		Separation      141.683248771759 // 0.208 asec
		Eccentricity    0.261
		Inclination     145.8
		AscendingNode   205.2
		Epoch           2460419.918828478083014
		ArgOfPericenter 265.5
		MeanAnomaly     0
	}
}

Star "59 Cyg Aa1"
{
	DateUpdated     "2024-06-13"
	ParentBody      "59 Cyg Aa"
	Class           "B1.5Vnne"
	AbsMagn         -3.37
	MassSol         6.3 // 9.4
	RadSol          5.5 /// 7
	LumBol          7943
	Teff            21800

	BinaryOrbit
	{
		PeriodDays      28.1871
		Eccentricity    0.141
		Epoch           2445677.6
		ArgOfPericenter 77
		MeanAnomaly     0
	}
}

Star "59 Cyg Aa2"
{
	DateUpdated     "2024-06-13"
	ParentBody      "59 Cyg Aa"
	Class           "sdO"
	MassSol         0.62 // 0.91
	RadSol          0.34 /// 0.43
	LumBol          1000
	Teff            52100
}

Star "59 Cyg Ab"
{
	DateUpdated     "2024-06-13"
	ParentBody      "59 Cyg Aab"
	Class           "A3V"
	MassSol         3.29
}

// Object BD+46 3134  ---  Star  ---  OID=@93816   (@@9944,8)  ---  coobox=192 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "BD+46 3134/Gaia DR3 2163949423055031424/WISEA J205949.27+473135.1/TIC 329947624/ADS 14526 B/AG+47 1679/CCDM J20598+4731B/GEN# +1.00200120B/IDS 20564+4708 B/SAO 50334/UBV 18194/[S78b] 348B/2MASS J20594928+4731354/WDS J20598+4731B/** STF 2743B/PMSC 20564+4707B/TYC 3579-4464-1/UCAC3 276-201449/UCAC4 688-091789/WISE J205949.27+473135.8/Gaia DR2 2163949423055031424"
{
	DateUpdated     "2024-06-13"
	ParentBody      "59 Cyg"
	Parallax        2.6291
	AppMagn         11.07
	Class           "A8III?" // A3V
	AbsMagn         3.17 // 计算的值
	MassSol         2.54

	Orbit     
	{
		Epoch           2454467
		SemiMajorAxis   13759.280726998 // 20.2 asec
		ArgOfPericenter 352
		MeanAnomaly     0
	}
}

// Object UCAC3 276-201468  ---  Star  ---  OID=@93814   (@@9944,6)  ---  coobox=192 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC3 276-201468/Gaia DR3 2163946429452212480/TIC 329947687/ADS 14526 C/CCDM J20598+4731C/CSI+46 3133 2/GEN# +1.00200120C/IDS 20564+4708 C/UBV 21486/[S78b] 348C/2MASS J20595122+4730548/WDS J20598+4731C/** STF 2743C/PMSC 20564+4707C/UCAC4 688-091801/Gaia DR2 2163946429452212480"
{
	DateUpdated     "2024-06-13"
	ParentBody      "59 Cyg"
	Parallax        2.5976
	AppMagn         11.26
	Class           "F2"
	AbsMagn         3.33 // 计算的值
	MassKg          1.93970138104192e+30 // log(g) = 4.138 cm/s^2
	RadSol          1.395238 // Gaia DR3
	LumBol          2.67101479733989 // 计算的值
	Teff            6247
	FeH             -0.425

	Orbit     
	{
		SemiMajorAxis   18186.7720397068
		ArgOfPericenter 141
		MeanAnomaly     0
	}
}

// Object * ksi Cyg  ---  Spectroscopic Binary  ---  OID=@32161   (@@10241,6)  ---  coobox=57 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "KSI Cyg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "KSI Cyg"
	Class           "K4Ib-"
	AbsMagn         -4.3
	MassSol         8
	RadSol          220.09
	LumBol          9889
	Teff            3878 // 4031
	FeH             -0.26

	BinaryOrbit     
	{
		PeriodDays      6750
		SemiMajorAxisKm 532906200 // 766 RSun
		Eccentricity    0.25
		Inclination     50
	}
}

Star "KSI Cyg B"
{
	DateUpdated     "2024-06-13"
	ParentBody      "KSI Cyg"
	Class           "A1.5V"
	AbsMagn         1.3
	MassSol         2.5
}

// Object * 74 Cyg  ---  Star  ---  OID=@1923   (@@10224,10)  ---  coobox=42 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "74 Cyg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "74 Cyg"
	Class           "A3Vn"
	AbsMagn         0.95
	MassSol         1.68
	RadSol          1.6
	LumBol          35.64
	Teff            7859
	Age             0.606

	BinaryOrbit     
	{
		PeriodDays      574.632
		Separation      0.556378338689618 // 8.56 mas
		Eccentricity    0.5349
		Inclination     102.1
		AscendingNode   18.92
		Epoch           2458579.5387
		ArgOfPericenter 126.56
		MeanAnomaly     0
	}
}

Star "74 Cyg B"
{
	ParentBody      "74 Cyg"
	Class           "F8.7?"
}