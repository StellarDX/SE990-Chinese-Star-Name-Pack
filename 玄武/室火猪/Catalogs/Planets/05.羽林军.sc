// Object * 29 Aqr A  ---  Star  ---  OID=@9700384   (@@-1,255)  ---  coobox=8590 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=108797
Barycenter "29 Aqr B/SV* BV 600/V* DX Aqr/SBC9 1346/SBC7 889/Gaia DR3 6826564991861746688/Gaia DR2 6826564991861746688/TIC 102178051/WDS J22024-1658B/ADS 15562 B/BD-17 6422B/CCDM J22024-1658B/CSI-17 6422 2/GC 30822/IDS 21570-1727 B/SAO 164829/** S 802B/PMSC 21570-1726B/HD 209278B/TYC 6376-1658-1/2MASS J22022628-1657531"
{
	ParentBody      "29 Aqr"
	BinaryOrbit     
	{
		Period          7177
		Separation      678.337465366249 // 3.84 asec
	}
}

Star "29 Aqr Ba"
{
	DateUpdated     "2024-06-16"
	ParentBody      "29 Aqr B"
	Parallax        5.6609
	AppMagn         7.11
	Class           "A2V"
	AbsMagn         0.874 // 计算的值
	MassKg          4.15635857230945e+30 // log(g) = 3.93 cm/s^2
	RadSol          2.595 // Gaia DR3
	LumBol          63.2827842066877 // 计算的值
	Teff            10106
	FeH             -0.792

	BinaryOrbit     
	{
		PeriodDays      0.945
		Eccentricity    0.00
		Epoch           2436814.418
	}
}

// NoirLab说系统中还有第三颗恒星，质量为1.23太阳质量，与A是一对，但是Simbad又说B是双星。
// Gaia给的物理数据也明显是反的，查询A给的是B的数据，查询B给的是A的数据。
// 此处以NoirLab给的系统结构为准。
Star "29 Aqr Bb"
{
	DateUpdated     "2024-06-16"
	ParentBody      "29 Aqr B"
	Class           ""
	MassSol         1.23
}

// Object * 29 Aqr B  ---  Spectroscopic Binary  ---  OID=@1292251   (@@26217,8)  ---  coobox=8590 
// Object types: Eclipsing Binary,Eclipsing Binary,Variable Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Variable Star Candidate 
Star "29 Aqr A/Gaia DR3 6826564991861746432/TIC 102178050/BD-17 6422A/CCDM J22024-1658A/HD 209278A/WDS J22024-1658A/** S 802A/TYC 6376-1148-1/2MASS J22022650-1657519/Gaia DR2 6826564991861746432"
{
	DateUpdated     "2024-06-16"
	ParentBody      "29 Aqr"
	Parallax        5.7102
	AppMagn         7.14
	Class           "K0III"
	AbsMagn         0.923 // 计算的值
	MassKg          3.01233867070094e+30 // log(g) = 2.662 cm/s^2
	RadSol          9.511144 // Gaia DR3
	LumBol          45.0575868751417 // 计算的值
	Teff            4849
	FeH             -0.264
}

// Object * 41 Aqr A  ---  High Proper Motion Star  ---  OID=@5620526   (@@-1,255)  ---  coobox=8439 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "41 Aqr A/Gaia DR3 6819552169260987520/ADS 15753 A/CCDM J22143-2104A/CSI-21 6180 1/WDS J22143-2104A/HD 210960A/BD-21 6180A/TYC 6384-1570-2/UCAC3 138-450544/UCAC4 345-202586/** HN 56A/Gaia DR2 6819552169260987520"
{
	DateUpdated     "2024-06-16"
	ParentBody      "41 Aqr"
	Parallax        13.5114
	AppMagn         5.526
	Class           "K0III"
	AbsMagn         1.18 // 计算的值
	MassKg          3.18779744373367e+30 // log(g) = 2.85 cm/s^2
	RadSol          7.88
	LumBol          33.93
	Teff            4750
	FeH             -0.13

	BinaryOrbit     
	{
		Separation      369.362939289898 // 5.16 asec
	}
}

// Object * 41 Aqr B  ---  High Proper Motion Star  ---  OID=@1273566   (@@25975,3)  ---  coobox=8439 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "41 Aqr B/Gaia DR3 6819552164966109696/ADS 15753 B/BD-21 6180B/CCDM J22143-2104B/CSI-21 6180 2/WDS J22143-2104B/HD 210960B/TYC 6384-1570-1/UCAC4 345-202587/** HN 56B/Gaia DR2 6819552164966109696"
{
	DateUpdated     "2024-06-16"
	ParentBody      "41 Aqr"
	Parallax        13.6395
	AppMagn         6.661
	Class           "F2V"
	AbsMagn         2.33 // 计算的值
	RadSol          1.76
	LumBol          6.319
	Teff            6899
}

// Object * ups Aqr  ---  High Proper Motion Star  ---  OID=@1284242   (@@26260,0)  ---  coobox=8960 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),High Proper Motion Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "UPS Aqr A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "UPS Aqr"
	Class           "F7V"
	AbsMagn         3.44
	MassSol         1.4
	RadSol          1.49
	LumBol          3.581
	Teff            6514
	FeH             0.08
	Age             0.250

	BinaryOrbit     
	{
		Period          1330
		Separation      139
	}
}

// Object * ups Aqr B  ---  High Proper Motion Star  ---  OID=@15596220   (@@-1,255)  ---  coobox=8960 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UPS Aqr B/Gaia DR3 6628926642897199744/TIC 69889260/59 Aqr B/HD 213845B/** LAF 69B/WDS J22347-2042B/Gaia DR2 6628926642897199744/2MASS J22344192-2042327"
{
	ParentBody      "UPS Aqr"
	Class           "G6.6?"
}

// Object * 53 Aqr A  ---  High Proper Motion Star  ---  OID=@1292947   (@@26487,17)  ---  coobox=8623 
// Object types: Double or Multiple Star,High Proper Motion Star,Star,UV-emission Source 
Remove "53 Aqr A" {ParentBody "53 Aqr"}
Remove "53 Aqr B" {ParentBody "53 Aqr"}
Star "53 Aqr A/GJ 859 A/PLX 5421/BD-17 6521/GC 31349/GCRV 14103/HD 212698/HIC 110778/HR 8545/LTT 9026/PPM 240280/SAO 165078/SKY# 42710/TD1 29073/uvby98 100212698/ADS 15934 A/CCDM J22266-1644A/WDS J22266-1645A/TYC 6385-1461-1/** SHJ 345A/WEB 19845"
{
	DateUpdated     "2024-06-16"
	ParentBody      "Gaia DR3 2595463996992115840"
	Parallax        49.5
	AppMagn         6.22
	Class           "G1V"
	AbsMagn         4.94
	MassSol         1.01
	RadSol          1.11
	LumBol          1.39
	Teff            5922
	FeH             -0.10
	Age             0.18 // 0.37

	BinaryOrbit     
	{
		Period          3500
		Separation      288.887724182788 // 14.88 asec
		Eccentricity    0.90
		Inclination     44.13
		AscendingNode   294.55
		Epoch           2459945.103970062918961
		ArgOfPericenter 331.40
		MeanAnomaly     0
	}
}

// Object * 53 Aqr B  ---  High Proper Motion Star  ---  OID=@1293012   (@@26491,2)  ---  coobox=8623 
// Object types: Double or Multiple Star,High Proper Motion Star,Star 
Star "53 Aqr B/GJ 859 B/WDS J22266-1645B/ADS 15934 B/BD-17 6520/CCDM J22266-1644B/GC 31348/GCRV 14102/HD 212697/HR 8544/LTT 9025/SAO 165077/SKY# 42709/uvby98 100212697/TYC 6385-683-1/** SHJ 345B/WEB 19844"
{
	DateUpdated     "2024-06-16"
	ParentBody      "Gaia DR3 2595463996992115840"
	Parallax        49.8
	AppMagn         6.32
	Class           "G5VFe-0.8CH-1"
	AbsMagn         4.87
	MassSol         0.99
	Radius          690684.930708635 // log(g) = 4.44 cm/s^2
	LumBol          1.0125422052979034 // 计算的值
	Teff            5811
	FeH             -0.19
}

// Object * 74 Aqr  ---  alpha2 CVn Variable  ---  OID=@1312382   (@@26751,16)  ---  coobox=9013 
// Object types: Variable Star,Double or Multiple Star,Spectroscopic Binary,Variable Star,alpha2 CVn Variable,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=113031
Barycenter "74 Aqr A"
{
	ParentBody      "74 Aqr"
	BinaryOrbit // VB6_Tok2022f MCA_73 Gr.2
	{
		Period          9.4718
		Separation      9.27668075887703 // 0.051 asec
		Eccentricity    0.885
		Inclination     37.3
		AscendingNode   198.2
		Epoch           2455141.803813894279301
		ArgOfPericenter 269.9
		MeanAnomaly     0
	}
}

Star "74 Aqr Aa"
{
	DateUpdated     "2024-06-16"
	ParentBody      "74 Aqr A"
	Class           "B8IV/V"
	AbsMagn         -1.19
	MassSol         2.72

	BinaryOrbit // SB9_1403 2004A&A...416..661C
	{
		PeriodDays      3.429616
		Eccentricity    0.05
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2452909.150
		ArgOfPericenter 266.5
		MeanAnomaly     0
	}
}

Star "74 Aqr Ab"
{
	DateUpdated     "2024-06-16"
	ParentBody      "74 Aqr A"
	Class           ""
	MassSol         2.53
}

Star "74 Aqr B"
{
	DateUpdated     "2024-06-16"
	ParentBody      "74 Aqr"
	Class           ""
	MassSol         3.11
}

// Object * del Aqr  ---  High Proper Motion Star  ---  OID=@1302503   (@@26748,10)  ---  coobox=9008 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
// Hipparcos最先发现有一颗伴星在周期为483天的轨道运行，后来的红外干涉测量又显示有一颗G5型伴星位于距离主星2天文单位处，
// 但是这两次发现的是不是同一颗恒星还有待确认，不过根据开普勒定律估算，是同一颗恒星的可能性较大。
Star "DEL Aqr A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "DEL Aqr"
	Class           "A3Vp"
	AbsMagn         -0.17
	MassSol         2.51
	RadSol          2.4
	LumBol          48
	Teff            8650
	FeH             -0.21
	Age             0.3

	BinaryOrbit // Hipparcos Profile (a ~= 1.83 AU)
	{
		PeriodDays      483
		Eccentricity    0.12
		Inclination     41
	}
}

Star "DEL Aqr B(?)"
{
	DateUpdated     "2024-06-16"
	ParentBody      "DEL Aqr"
	Class           "G5"
}

// Object * 89 Aqr  ---  Double or Multiple Star  ---  OID=@1274959   (@@26012,12)  ---  coobox=8831 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "89 Aqr A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "89 Aqr"
	Class           "G2III"
	AbsMagn         0.1
	MassSol         2.9
	Radius          3038514.98413519 // log(g) = 3.62 cm/s^2
	LumBol          17.389570364097874 // 计算的值
	Teff            5640
	FeH             0.27
	Age             0.320

	BinaryOrbit     
	{
		Period          201
		Separation      76.6652204090776 // 0.45 asec, 0.1843 asec in 2010
	}
}

Star "89 Aqr B"
{
	DateUpdated     "2024-06-16"
	ParentBody      "89 Aqr"
	Class           "A2V"
	AbsMagn         1.5
	MassSol         2.0
	Teff            8912
}

// Object * c01 Aqr  ---  Double or Multiple Star  ---  OID=@1274976   (@@26014,15)  ---  coobox=8828 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "86 Aqr A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "86 Aqr"
	Class           "G6IIIb"
	AbsMagn         0.66 // 计算的值
	Teff            4900
	FeH             -0.14

	BinaryOrbit     
	{
		Separation      14.4604860246092 // 0.25 asec
	}
}

Star "86 Aqr B"
{
	ParentBody      "86 Aqr"
	Class           "A7.5?"
}

// Object * b03 Aqr  ---  Star  ---  OID=@1285850   (@@26299,0)  ---  coobox=9099 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "101 Aqr A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "101 Aqr"
	Class           "A0V"
	AbsMagn         0.34 // 计算的值
	MassKg          3.84757286371085e+30 // log(g) = 3.705 cm/s^2
	RadSol          3.235 // Gaia DR3
	LumBol          60.1463503932855 // 计算的值
	Teff            8937
	FeH             -1.03

	BinaryOrbit     
	{
		Separation      64.2430290339773 // 0.840 asec
	}
}

Star "101 Aqr B"
{
	ParentBody      "101 Aqr"
	Class           "G9.5?"
}

// Object * 97 Aqr  ---  Double or Multiple Star  ---  OID=@1303054   (@@26769,12)  ---  coobox=9107 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "97 Aqr A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "97 Aqr"
	Class           "A2V"
	AbsMagn         1.14 // 计算的值

	BinaryOrbit     
	{
		Period          64.62
		Separation      26.6670112105124 // 0.408 asec
		Eccentricity    0.140
		Inclination     77.6
		AscendingNode   276.3
		Epoch           2430101.163907667621970
		ArgOfPericenter 174.6
		MeanAnomaly     0
	}
}

Star "97 Aqr B"
{
	DateUpdated     "2024-06-16"
	ParentBody      "97 Aqr"
	Class           "A7V"
}

// Object * 94 Aqr  ---  Spectroscopic Binary  ---  OID=@1312988   (@@27025,2)  ---  coobox=9108 
// Object types: Rotating Variable,Double or Multiple Star,Double or Multiple Star,Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=115126
Remove "94 Aqr A" {ParentBody "94 Aqr"}
Remove "94 Aqr Aa" {ParentBody "94 Aqr A"}
Remove "94 Aqr Ab" {ParentBody "94 Aqr A"}
Remove "94 Aqr B" {ParentBody "94 Aqr"}
Barycenter "94 Aqr A"
{
	ParentBody      "Gaia DR3 2411855072801158656"
	BinaryOrbit     
	{
		Period          2695
		Separation      333.232656160329 // 13.13 asec
	}
}

Star "94 Aqr A1"
{
	DateUpdated     "2024-06-16"
	ParentBody      "94 Aqr A"
	Class           "G8.5IV"
	AbsMagn         3.52
	MassSol         1.22
	RadSol          2.06
	LumBol          3.30
	Teff            5461
	FeH             0.23
	Age             6.2

	BinaryOrbit // VB6_Doc2018f MCA_74Aa, Gr.2
	{
		Period          6.321
		Separation      4.79624267983693 // 0.189 asec
		Eccentricity    0.173
		Inclination     44.5
		AscendingNode   341.9
		Epoch           2456037.377685305196792
		ArgOfPericenter 208.3
		MeanAnomaly     0
	}
}

Star "94 Aqr A2"
{
	DateUpdated     "2024-06-16"
	ParentBody      "94 Aqr A"
	Class           "K5V"
	AbsMagn         6.52
	MassSol         0.81
	RadSol          0.85
	LumBol          0.309598645496933 // 计算的值
	Teff            4670
}

// Object * 94 Aqr B  ---  High Proper Motion Star  ---  OID=@1313328   (@@102248,31)  ---  coobox=9108 
// Object types: Rotating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "94 Aqr B/GJ 894.2 B/Gaia DR3 2411855072801159040/TIC 214664575/WDS J23191-1328B/ADS 16672 B/BD-14 6448B/CCDM J23191-1328B/CSI-14 6448 2/GC 32461/GCRV 14622/GEN# +1.00219834B/HD 219834B/HIC 115125/HIP 115125/LTT 9481/NLTT 56465/SAO 165624/SPOCS 1015/UBV 19971/2MASS J23190655-1327189/TYC 5827-1270-1/DENIS J231906.6-132719/** STF 2998B/PMSC 23139-1400B/WEB 20395/Gaia DR2 2411855072801159040"
{
	DateUpdated     "2024-06-16"
	ParentBody      "Gaia DR3 2411855072801158656"
	Parallax        44.5698
	Class           "K2V"
	AbsMagn         5.92
	Teff            5136
	FeH             0.24
}

// Object * psi03 Aqr  ---  Star  ---  OID=@1325142   (@@27287,4)  ---  coobox=9153 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "PSI3 Aqr A" {ParentBody "PSI3 Aqr"}
Remove "PSI3 Aqr B" {ParentBody "PSI3 Aqr"}
Star "95 Aqr A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "PSI3 Aqr"
	Class           "B9V"
	AbsMagn         0.47
	RadSol          2
	LumBol          70
	Teff            11805.5464035086 // 计算的值

	BinaryOrbit     
	{
		Separation      106.28355471133 // 1.5 asec
	}
}

Star "95 Aqr B"
{
	ParentBody      "PSI3 Aqr"
	Class           "A9.4?"
}

// Object * psi01 Aqr  ---  High Proper Motion Star  ---  OID=@1325078   (@@27033,7)  ---  coobox=9153 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=114855
Remove "91 Aqr A" {ParentBody "91 Aqr"}
Remove "91 Aqr (BC)" {ParentBody "91 Aqr"}
Remove "91 Aqr B" {ParentBody "91 Aqr (BC)"}
Remove "91 Aqr C" {ParentBody "91 Aqr (BC)"}
Star "PSI1 Aqr A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "PSI1 Aqr"
	Class           "K0III"
	AbsMagn         0.919
	MassSol         1.38
	RadSol          10.96
	LumBol          54.3
	Teff            4730
	FeH             -0.14
	Age             2.98
}

// Object HD 219430  ---  Double or Multiple Star  ---  OID=@1325074   (@@27033,3)  ---  coobox=9153 
// Object types: High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Mid-IR Source (3 to 30 µm),Star,Star 
Barycenter "HD 219430/GJ 9815 C/GJ 9815 B/GJ 893.2 C/GJ 893.2 B/Gaia DR3 2630155616073070592/GEN# +1.00219430/MCC 859/TYC 5821-1486-1/TIC 4610435/WDS J23159-0905BC/ADS 16633 BC/BD-09 6155/CCDM J23159-0905BC/CSI-09 6155 1/G 157-37/GC 32373/GCRV 14584/HERZ 16644/JP11 3606/LTT 9434/NLTT 56278/PPM 207343/ROT 7818/SAO 146596/UBV 19891/YZ 0 4843/YZ 99 8259/2MASS J23155097-0904426/** BU 1220BC/WISEA J231551.26-090443.0/UCAC2 28652808/UCAC3 162-298472/UCAC4 405-135930/CSI-09 6155 3/CSI-09 6155 4/[RHG95] 3658/WEB 20354/Gaia DR2 2630155616073070592"
{
	ParentBody      "PSI1 Aqr"
	BinaryOrbit     
	{
		Period          52853
		Separation      2246.92654155729 // 49.64 asec
	}
}

Star "HD 219430 A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "HD 219430"
	Class           "K3V"
	MassSol         0.80

	BinaryOrbit // VB6_Zir2007 BU_1220BC Gr.4
	{
		Period          83.6100
		Separation      21.2291329871002 // 0.469 asec
		Eccentricity    0.448
		Inclination     87.0
		AscendingNode   104.1
		Epoch           2433640.360813855193555
		ArgOfPericenter 145.0
		MeanAnomaly     0
	}
}

Star "HD 219430 B"
{
	DateUpdated     "2024-06-16"
	ParentBody      "HD 219430"
	Class           ""
	MassSol         0.75
}

// Object * psi01 Aqr b  ---  Extra-solar Planet  ---  OID=@1325596   (@@144782,7)  ---  coobox=9153
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Remove "91 Aqr A b" {ParentBody "91 Aqr A"}
Planet "PSI1 Aqr b/91 Aqr b/HD 219449b"
{
	ParentBody     "PSI1 Aqr A"
	DiscMethod     "RadVel"
	DiscDate       "2003"
	MassJup        3.2

	Orbit
	{
		Epoch           2453472.1
		PeriodDays      181.4
		SemiMajorAxis   0.7
		Eccentricity    0.027
		ArgOfPericen    177.3
	}
}

// Object * 83 Aqr  ---  Double or Multiple Star  ---  OID=@1343257   (@@27673,9)  ---  coobox=9068 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "83 Aqr A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "83 Aqr"
	Class           "F2Vn"
	AbsMagn         1.43 // 计算的值

	BinaryOrbit     
	{
		Period          21.840
		Separation      13.0125939036908 // 0.2026 asec
		Eccentricity    0.3878
		Inclination     48.01
		AscendingNode   204.87
		Epoch           2445374.862176291178912
		ArgOfPericenter 262.83
		MeanAnomaly     0
	}
}

Star "83 Aqr B"
{
	DateUpdated     "2024-06-16"
	ParentBody      "83 Aqr"
	Class           "F2V"
}

// Object * ome02 Aqr  ---  Eruptive Variable  ---  OID=@1303562   (@@26782,10)  ---  coobox=9137 
// Object types: High Proper Motion Star,Pulsating Variable,Eruptive Variable,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "OME2 Aqr A" {ParentBody "OME2 Aqr"}
Remove "OME2 Aqr B" {ParentBody "OME2 Aqr"}
Barycenter "OME2 Aqr A"
{
	ParentBody      "Gaia DR3 2419885149815948416"
	BinaryOrbit     
	{
		Separation      263.223409371503 // 5.50 asec
	}
}

Star "OME2 Aqr Aa"
{
	DateUpdated     "2024-06-16"
	ParentBody      "OME2 Aqr A"
	Class           "B9V"
	AbsMagn         1.20
	MassKg          4.52941112980619e+30 // log(g) = 4.22 cm/s^2
	RadSol          1.94
	LumBol          37
	Teff            10504

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.82620452
		Eccentricity    0.279276532
		Inclination     1.95579004
		AscendingNode   0
		ArgOfPericenter 24.5626357
		MeanAnomaly     54.5322777
	}
}

Star "OME2 Aqr Ab"
{
	ParentBody      "OME2 Aqr A"
	Class           "F2.7?"
}

// Object * ome02 Aqr B  ---  High Proper Motion Star  ---  OID=@1303563   (@@26782,11)  ---  coobox=9137 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "OME2 Aqr B/GJ 9836 B/Gaia DR3 2419886558565222400/ADS 16944 B/BD-15 6476B/CCDM J23427-1433B/CSI-15 6476 2/HD 222661B/IDS 23375-1505 B/[RHG95] 3746/WDS J23427-1433B/** BU 279B/Gaia DR2 2419886558565222400"
{
	DateUpdated     "2024-06-16"
	ParentBody      "Gaia DR3 2419885149815948416"
	Class           "K"
}
