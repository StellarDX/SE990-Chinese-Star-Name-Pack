// Object * bet01 Cap  ---  Spectroscopic Binary  ---  OID=@2556894   (@@61897,7)  ---  coobox=19335 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=100345
Remove "BET1 Cap"{ParentBody "Dabih"}
Remove "BET2 Cap"{ParentBody "Dabih"}
Remove "BET1 Cap AbAc"{ParentBody "BET1 Cap"}
Remove "Dabih A"{ParentBody "BET1 Cap"}
Remove "BET1 Cap Ab"{ParentBody "BET1 Cap AbAc"}
Remove "BET1 Cap Ac"{ParentBody "BET1 Cap AbAc"}
Remove "BET2 Cap B"{ParentBody "BET2 Cap"}
Remove "BET2 Cap C"{ParentBody "BET2 Cap"}
Barycenter "牛宿一/BET1 Cap/Gaia DR3 6875990375999580544/TIC 114746467/PLX 4845/SBC9 1223/SBC9 1224/HD 193496/9 Cap/BD-15 5629/CCDM J20210-1447A/FK5 762/GC 28295/GCRV 12703/HD 193495/HIC 100345/HIP 100345/HR 7776/IRAS 20182-1456/IRC -10537/JP11 3227/N30 4498/NSV 25105/PMC 90-93 539/PPM 237293/RAFGL 2555/ROT 2964/SAO 163481/SBC7 801/SBC7 802/SKY# 38436/UBV 17611/YZ 104 7653/2MASS J20210066-1446531/WDS J20210-1447Aa,Ab/TYC 5753-2281-1/PMSC 20154-1506Aabc/** BLA 7/WDS J20210-1447A/Dabih Major/WEB 18102/WEB 18103/Gaia DR2 6875990375998568192"
{
	ParentBody      "BET Cap"
	BinaryOrbit     
	{
		Period          700000 // 1.120E6
		Separation      21000
	}
}

Star "BET1 Cap Aa"
{
	DateUpdated     "2024-06-02"
	ParentBody      "Gaia DR3 6875990375999580544"
	Parallax        8.3966
	AppMagn         3.08
	Class           "K0II"
	AbsMagn         -2.03
	MassSol         3.69
}

Barycenter "BET1 Cap Ab"
{
	ParentBody      "Gaia DR3 6875990375999580544"
	BinaryOrbit // VB6_Circ203 BLA_7Aa,Ab Gr.2
	{
		Period          3.7621
		Separation      5.83534524547881 // 0.049
		Eccentricity    0.452
		Inclination     75.1
		AscendingNode   43.6
		Epoch           2457257.651871432550251
		ArgOfPericenter 304.2
		MeanAnomaly     0
	}
}

Star "BET1 Cap Ab1"
{
	DateUpdated     "2024-06-02"
	ParentBody      "BET1 Cap Ab"
	Class           "B8V"
	MassSol         4.22

	BinaryOrbit // SB9_1224 1979ApJ...228..497E
	{
		PeriodDays      8.6777
		Eccentricity    0.340
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2428383.379
		ArgOfPericenter 340.0
		MeanAnomaly     0
	}
}

Star "BET1 Cap Ab2"
{
	DateUpdated     "2024-06-02"
	ParentBody      "BET1 Cap Ab"
	Class           ""
	MassSol         0.94
}

// Object * bet02 Cap  ---  Double or Multiple Star  ---  OID=@2556967   (@@61900,20)  ---  coobox=19335 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "牛宿增十二/BET2 Cap/Gaia DR3 6875990891389558400/GEN# +1.00193452/TIC 114721100/ADS 13717 AB/BD-15 5626/CCDM J20210-1447BC/GC 28286/GCRV 70871/HD 193452/HIC 100325/HIP 100325/HR 7775/PMC 90-93 6268/PPM 237281/SAO 163471/SKY# 38425/UBV 17604/UBV M 24734/YZ 104 7647/2MASS J20204654-1447053/TYC 5753-2282-1/Renson 54010/Dabih Minor/WDS J20210-1447B/WDS J20210-1447Ba,Bb/** BAR 12/** STF 4052B/uvby98 100193452/WEB 18095/Gaia DR2 6875990891389558400"
{
	ParentBody      "BET Cap"
}

Star "BET2 Cap Ba"
{
	DateUpdated     "2024-06-02"
	ParentBody      "BET2 Cap"
	Parallax        9.8983
	AppMagn         6.1
	Class           "A0III"
	AbsMagn         1.03
	MassKg          5.16360016182626e+30 // log(g) = 4.068 cm/s^2
	RadSol          2.4675 // Gaia DR3
	LumBol          46.628861041283 // 计算的值
	Teff            9602
	FeH             0.569

	BinaryOrbit // VB6_Circ203 BAR_12Ba,Bb Gr.4
	{
		Period          400.0000
		Separation      69.6073552607968 // 0.689 asec
		Eccentricity    0.458
		Inclination     125.2
		AscendingNode   84.7
		Epoch           2475272.492841907776892
		ArgOfPericenter 137.1
		MeanAnomaly     0
	}
}

Star "BET2 Cap Bb"
{
	DateUpdated     "2024-06-02"
	ParentBody      "BET2 Cap"
	Class           "A1"
	MassSol         1.23
}

// Object * alf02 Cap  ---  High Proper Motion Star  ---  OID=@2577256   (@@61468,14)  ---  coobox=19345 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "ALF2 Cap A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "ALF2 Cap"
	Class           "G9III"
	AbsMagn         0.98
	MassSol         2.05
	RadSol          8.38
	LumBol          40.4
	Teff            5030
	FeH             -0.15
	Age             1.30
}

Barycenter "ALF2 Cap BC" // 光学伴星?
{
	ParentBody      "ALF2 Cap"
	BinaryOrbit     
	{
		Epoch           2455197
		Period          1500
		Separation      220.632468592888 // 6.6 asec
		PositionAngle   196
	}
}

// Object ** HJ 608B  ---  Star  ---  OID=@12474325   (@@-1,255)  ---  coobox=19345 
// Object types: Double or Multiple Star,Star 
Star "** HJ 608B/Gaia DR3 6880093650312745728/CCDM J20181-1233B/Gaia DR2 6880093650312745728/WDS J20181-1233B"
{
	DateUpdated     "2024-06-02"
	ParentBody      "ALF2 Cap BC"
	Class           ""
	MassSol         0.5

	BinaryOrbit     
	{
		Period          244
	}
}

// Object ** HJ 608C  ---  Star  ---  OID=@12474326   (@@-1,255)  ---  coobox=19345 
// Object types: Double or Multiple Star,Star 

Star "** HJ 608C/Gaia DR3 6880093650308076160/CCDM J20181-1233C/WDS J20181-1233C/Gaia DR2 6880093650308076160"
{
	DateUpdated     "2024-06-02"
	ParentBody      "ALF2 Cap BC"
	Class           ""
	MassSol         0.5
}

// Object * ksi Cap  ---  Chemically Peculiar Star  ---  OID=@2577041   (@@61463,14)  ---  coobox=19259 
// Object types: Chemically Peculiar Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "KSI Cap A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "KSI Cap"
	Class           "F7VFe-0.5"
	AbsMagn         3.64
	MassSol         1.20
	Radius          946352.658405994 // log(g) = 4.25 cm/s^2
	LumBol          2.8161695087128344 // 计算的值
	Teff            6411
	FeH             -0.25
	Age             3.04
}

// Object LP 754-50  ---  High Proper Motion Star  ---  OID=@2577087   (@@61466,22)  ---  coobox=19259 
// Object types: High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star 
Star "LP 754-50/HIP 99550/Gaia DR3 6879662263797806976/TIC 14244561/HIC 99550/NLTT 48864/2MASS J20120943-1253350/TYC 5748-175-1/WISEA J201209.59-125337.4/UCAC4 386-143121/PM J20121-1253/Gaia DR2 6879662263797806976/Gaia DR1 6879662259497634304"
{
	DateUpdated     "2024-06-02"
	ParentBody      "KSI Cap A"
	Parallax        35.4329
	AppMagn         10.94
	Class           "M0Vk"
	AbsMagn         8.69 // 计算的值
	MassSol         0.55

	Orbit
	{
		Period          3.7E6
		SemiMajorAxis   28.3E3
		ArgOfPericenter 193.6
		MeanAnomaly     0
	}
}

// Object * pi. Cap  ---  Spectroscopic Binary  ---  OID=@2542604   (@@61907,0)  ---  coobox=19336 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,UV-emission Source 
Barycenter "PI Cap A"
{
	ParentBody      "PI Cap"
	BinaryOrbit     
	{
		Period          5874
		Separation      687.99595582935 // 3.460 asec
	}
}

Star "PI Cap Aa"
{
	DateUpdated     "2024-06-02"
	ParentBody      "PI Cap A"
	Class           "B8II-III"
	AbsMagn         -1.01
	MassSol         5.9
	Radius          3861381.1410532 // 计算的值
	LumBol          238
	Teff            9623
	Age             0.0434

	BinaryOrbit     
	{
		Period          54.990
		Separation      28.4352335536919 // 0.143 asec
	}
}

Star "PI Cap Ab"
{
	DateUpdated     "2024-06-02"
	ParentBody      "PI Cap A"
	Class           ""
	MassSol         1.71
}

Star "PI Cap B"
{
	DateUpdated     "2024-06-02"
	ParentBody      "PI Cap"
	Class           ""
	MassSol         1.84
}

// Object * omi Cap A  ---  High Proper Motion Star  ---  OID=@2527117   (@@62242,7)  ---  coobox=19165 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Remove "OMI Cap A" {ParentBody "OMI Cap"}
Remove "OMI Cap B" {ParentBody "OMI Cap"}
Star "OMI Cap A/Gaia DR3 6860821651019024896/TIC 72429235/12 Cap A/ADS 13902 A/BD-19 5831/CCDM J20299-1835A/GC 28503/GSC 06333-02130/HD 195094/HIC 101123/HIP 101123/HR 7830/IDS 20242-1855 A/PPM 237509/ROT 2984/SAO 163626/SKY# 38780/TYC 6333-2130-1/UBV 17760/UBV M 24874/YZ 108 8789/uvby98 100195094 A/2MASS J20295391-1834593/WDS J20299-1835A/Gaia DR2 6860821651019024896/Gaia DR1 6860821646719117952"
{
	DateUpdated     "2024-06-02"
	ParentBody      "ADS 13902"
	Class           "A1V"
	AbsMagn         1.63 // 计算的值
	MassSol         2.05
	Radius          908061.101998194 // 计算的值
	LumBol          18.6
	Teff            10492
	Age             0.118

	BinaryOrbit     
	{
		Separation      2100
	}
}

// Object * omi Cap B  ---  High Proper Motion Star  ---  OID=@2527116   (@@62242,6)  ---  coobox=19165 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "OMI Cap B/Gaia DR3 6860821651019025664/TIC 72429238/12 Cap B/ADS 13902 B/BD-19 5830/CCDM J20299-1835B/GC 28502/GEN# +1.00195093/HD 195093/HIC 101120/HIP 101120/HR 7829/IDS 20242-1855 B/PPM 237508/ROT 2983/SAO 163625/SKY# 38779/UBV 17761/UBV M 24873/YZ 108 8788/uvby98 100195093/2MASS J20295259-1835108/WDS J20299-1835B/** SHJ 324B/TYC 6333-2131-1/Gaia DR2 6860821651019025664"
{
	DateUpdated     "2024-06-02"
	ParentBody      "ADS 13902"
	Parallax        14.0435
	AppMagn         6.74
	Class           "A7/8V"
	AbsMagn         2.48 // 计算的值
	MassSol         1.34
	Teff            7762
}

// Object * rho Cap A  ---  Star  ---  OID=@5615854   (@@-1,255)  ---  coobox=19336 
// Object types: Double or Multiple Star,Star 
Star "RHO Cap A/GJ 9696 A/GJ 791.1 A/Gaia DR3 6860945174279114880/ADS 13887 A/CCDM J20289-1750A/CSI-18 5689 1/TYC 6333-2128-1/WDS J20289-1749A/** SHJ 323A/HD 194943A/BD-18 5689A/Gaia DR2 6860945174279114880"
{
	DateUpdated     "2024-06-02"
	ParentBody      "RHO Cap"
	Parallax        33.2297
	AppMagn         4.93
	Class           "F2IV"
	AbsMagn         2.52
	MassSol         1.52
	RadSol          1.3
	LumBol          9
	Teff            6911
	FeH             -0.20
	Age             1.74

	BinaryOrbit     
	{
		Period          278
		Separation      56.48558984071 // 1.877 asec
		Eccentricity    0.91
		Inclination     113.3
		AscendingNode   162.0
		Epoch           2438761.056440765038133
		ArgOfPericenter 324.5
		MeanAnomaly     0
	}
}

// Object * rho Cap B  ---  Star  ---  OID=@2542602   (@@61905,14)  ---  coobox=19336 
// Object types: Double or Multiple Star,Star 
Star "RHO Cap B/GJ 9696 B/GJ 791.1 B/Gaia DR3 6860945174275852416/ADS 13887 B/BD-18 5689B/CCDM J20289-1750B/CSI-18 5689 5/[RHG95] 3197/WDS J20289-1749B/** SHJ 323B/HD 194943B/TYC 6333-2128-2/Gaia DR2 6860945174275852416"
{
	DateUpdated     "2024-06-02"
	ParentBody      "RHO Cap"
	Class           "G1"
	AbsMagn         4.56
}
