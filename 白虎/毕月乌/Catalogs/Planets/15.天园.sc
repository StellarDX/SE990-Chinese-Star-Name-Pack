// Object * chi Eri  ---  High Proper Motion Star  ---  OID=@3140391   (@@74501,12)  ---  coobox=23425 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "CHI Eri A"
{
	DateUpdated     "2024-07-04"
	ParentBody      "CHI Eri"
	Class           "G8IIIbCNIV"
	AbsMagn         2.39
	MassSol         1.58
	RadSol          3.993
	LumBol          9.84
	Teff            5115
	FeH             -0.18

	BinaryOrbit     
	{
		Separation      128
	}
}

Star "CHI Eri B"
{
	DateUpdated     "2024-07-04"
	ParentBody      "CHI Eri"
	Class           "K-M?"
	AbsMagn         9.4
}

// Object * phi Eri  ---  High Proper Motion Star  ---  OID=@3094669   (@@74267,8)  ---  coobox=23166 
// Object types: High Proper Motion Star,Rotating Variable,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Spectroscopic Binary Candidate,UV-emission Source 
Star "PHI Eri A"
{
	DateUpdated     "2024-07-04"
	ParentBody      "PHI Eri"
	Class           "B8IV"
	AbsMagn         0.183
	MassSol         3.55
	RadSol          3.4
	LumBol          255
	Teff            13716
	RotationPeriod  8.24892
	Age             0.044
	Oblateness      0.14529914529914529914529914529915

	BinaryOrbit     
	{
		PeriodDays      
		Separation      
		Eccentricity    
		Inclination     
		AscendingNode   
		Epoch           
		ArgOfPericenter 
		MeanAnomaly     0
	}
}

// Object CD-52 465  ---  Star  ---  OID=@3094623   (@@74265,8)  ---  coobox=23166 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Spectroscopic Binary Candidate 
Star "CD-52 465/Gaia DR3 4936685716976087552/TIC 354671854/2MASS J02162396-5131478/CCDM J02165-5131B/CPD-52 284/PPM 765777/WDS J02165-5131B/** DUN 6B/TYC 8055-1271-1/Gaia DR1 4936685712679390976/Gaia DR2 4936685716976087552"
{
	DateUpdated     "2024-07-04"
	ParentBody      "PHI Eri"
	Class           "G2V" // 光学伴星?
}

// Object * s Eri  ---  Spectroscopic Binary  ---  OID=@3015395   (@@75313,12)  ---  coobox=23221 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=12413
Barycenter "HD 16754 AB"
{
	ParentBody      "HD 16754"
}

Barycenter "HD 16754 A"
{
	ParentBody      "HD 16754 AB"
	BinaryOrbit     
	{
		Period          18085
		Separation      1140.33221219309 // 25.73 asec
	}
}

Star "HD 16754 A1"
{
	DateUpdated     "2024-07-04"
	ParentBody      "HD 16754 A"
	Class           "A1Vb"
	AbsMagn         1.76
	MassSol         1.95
	RadSol          1.93
	LumBol          17.44
	Teff            9099
	FeH             -0.06
	Age             0.212 // 0.03

	BinaryOrbit     
	{
		Period          50 // DR2-HIP: dmu(A)=(+24.7, +15.8) mas/yr
	}
}

Star "HD 16754 A2"
{
	DateUpdated     "2024-07-04"
	ParentBody      "HD 16754 A"
	Class           ""
	MassSol         0.6
}

// Object UCAC4 236-002415  ---  High Proper Motion Star  ---  OID=@3015396   (@@75313,13)  ---  coobox=23221 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Barycenter "UCAC4 236-002415/Gaia DR3 4946915641880235904/WISEA J023948.42-425305.4/TIC 142268256/CCDM J02398-4254B/CSI-43 814 22/IDS 02360-4319 B/WDS J02398-4254B/** B 2075B/2MASS J02394829-4253049/WISE J023948.40-425305.2/Gaia DR2 4946915641880235904"
{
	ParentBody      "HD 16754 AB"
}

Star "UCAC4 236-002415 Ba"
{
	DateUpdated     "2024-07-04"
	ParentBody      "UCAC4 236-002415"
	Parallax        25.3069
	AppMagn         14.5
	Class           "M5"
	AbsMagn         11.52 // 计算的值
	MassSol         0.35

	BinaryOrbit     
	{
		Period          4.642
		Separation      2.36869542379444 // 0.06 asec
	}
}

Star "UCAC4 236-002415 Bb"
{
	DateUpdated     "2024-07-04"
	ParentBody      "UCAC4 236-002415"
	Class           ""
	MassSol         0.31
}

// Object 2MASS J02404759-4253377  ---  Low-mass Star  ---  OID=@10122399   (@@-1,255)  ---  coobox=23221 
// Object types: Low-mass Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Star 
Star "2MASS J02404759-4253377/Gaia DR3 4946903890849721856/TIC 142273981/Gaia DR2 4946903890849721856"
{
	DateUpdated     "2024-07-04"
	ParentBody      "HD 16754"
	Class           "M6"
	MassSol         0.12

	Orbit     
	{
		Period          2.323E6
		SemiMajorAxis   26491.8806594254 // 655.42 asec
		ArgOfPericenter 90.7
		MeanAnomaly     0
	}
}

// Object * tet01 Eri  ---  High Proper Motion Star  ---  OID=@11631733   (@@-1,255)  ---  coobox=23205 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Remove "TET1 Eri" {ParentBody "TET Eri"}
Remove "TET2 Eri" {ParentBody "TET Eri"}
Star "TET1 Eri/Gaia DR3 5044368071870093312/TYC 7563-1016-1/PLX 624/CCDM J02583-4018A/CD-40 771A/CPC 0 1403/CPD-40 253A/CSI-40 253 42/CSI-40 771 22/FK5 106/GC 3584/GCRV 1661/HD 18622/HR 897/IDS 02545-4042 A/N30 613/PPM 307195/ROT 404/SACS 63/SAO 216113/SKY# 4464/WDS J02583-4018A/PMSC 02545-4042Aab/PMSC 02545-4042A/PLX 624.00A/WEB 2738/Gaia DR2 5044368071869592832"
{
	DateUpdated     "2024-07-05"
	ParentBody      "HIP 13847"
	Class           "A3IV-V"
	AbsMagn         -0.59
	MassSol         2.6
	RadSol          4.85
	LumBol          145
	Teff            8200

	BinaryOrbit     
	{
		Separation      411.270393274277 // 8.32 asec
	}
}

// Object * tet02 Eri  ---  High Proper Motion Star  ---  OID=@11631734   (@@-1,255)  ---  coobox=23205 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "TET2 Eri/Gaia DR3 5044368071868204160/TYC 7563-1017-1/CCDM J02583-4018B/CD-40 771B/CPD-40 253B/CSI-40 771 21/GC 3586/GCRV 1662/HD 18623/HR 898/IDS 02545-4042 B/PPM 307196/ROT 405/SAO 216114/SKY# 4465/uvby98 100018623/WDS J02583-4018B/PMSC 02545-4042B/GEN# +1.00018623/PLX 624.00B/WEB 2739/Gaia DR2 5044368071868204160"
{
	DateUpdated     "2024-07-05"
	ParentBody      "HIP 13847"
	Class           "A1V"
	MassSol         1.95
	RadSol          2.7
	LumBol          37
	Teff            8293
	FeH             -0.197
}

// Object * h Eri  ---  Horizontal Branch Star  ---  OID=@671153   (@@11746,15)  ---  coobox=6845 
// Object types: Horizontal Branch Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 23319 A"
{
	DateUpdated     "2024-07-05"
	ParentBody      "HD 23319"
	Class           "K1.5IIIbCN0.5"
	AbsMagn         0.83
	MassSol         1.18
	RadSol          11.01
	LumBol          63.1
	Teff            4581
	FeH             0.03
	Age             4.57

	BinaryOrbit     
	{
		Separation      284.821899396175 // 5.28 asec
	}
}

// Object * h Eri B  ---  High Proper Motion Star  ---  OID=@23690343   (@@-1,255)  ---  coobox=6845 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "h Eri B/Gaia DR3 4856903813234975616/WDS J03428-3719B/** B 1034B/HD 23319B"
{
	DateUpdated     "2024-07-05"
	ParentBody      "HD 23319"
	Class           "F6.1?"
}

// Object * f Eri A  ---  High Proper Motion Star  ---  OID=@7426150   (@@-1,255)  ---  coobox=6888 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Variable Star Candidate 
Star "f Eri A/Gaia DR3 4856719713756945664/TIC 140072112/TYC 7570-1585-1/** DUN 16A/PLX 841/CD-38 1297A/CPC 18 1286/CPD-38 340/CSI-38 1297 21/CSV 100352/GC 4602/GCRV 2186/HD 24072/HR 1190/IDS 03449-3756 A/NSV 1359/PPM 279479/ROT 569/SAO 194551/SV* ZI 258/CCDM J03486-3737A/WDS J03486-3737A/2MASS J03483587-3737126/PLX 841.00A/WEB 3416/Gaia DR2 4856719713756945664"
{
	DateUpdated     "2024-07-05"
	ParentBody      "HIP 17797"
	Parallax        18.8093
	AppMagn         4.72
	Class           "B9.5Van"
	AbsMagn         1.194
	MassSol         2.6
	RadSol          2.0
	LumBol          35
	Teff            10046
	Age             0.045
}

// Object * f Eri B  ---  High Proper Motion Star  ---  OID=@687096   (@@11775,0)  ---  coobox=6888 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star 
Barycenter "f Eri B/Gaia DR3 4856719713756946176/TIC 140072113/CCDM J03486-3737B/CD-38 1297B/CPC 18 1285/CSI-38 1297 22/GC 4601/GCRV 2185/HD 24071/HR 1189/IDS 03449-3756 B/ROT 568/SAO 194550/SKY# 5804/WDS J03486-3737B/TYC 7570-1586-1/** DUN 16B/2MASS J03483548-3737190/PLX 841.00B/WEB 3415/Gaia DR2 4856719713756946176"
{
	ParentBody      "HIP 17797"
	BinaryOrbit     
	{
		Epoch           2454832
		Separation      426.179633480459 // 8.40 asec
		PositionAngle   216
	}
}

Star "HD 24071 A"
{
	DateUpdated     "2024-07-05"
	ParentBody      "HD 24071"
	Parallax        18.7976
	AppMagn         5.25
	Class           "A1Va"
	AbsMagn         1.719
	MassSol         2.1
	RadSol          1.7
	LumBol          20
	Teff            9503
	FeH             -1.47
	Age             0.045

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.301135788
		Eccentricity    0
		Inclination     -0.548459291
		AscendingNode   0
		ArgOfPericenter -117.001672
		MeanAnomaly     -122.066729
	}
}

Star "HD 24071 B"
{
	DateUpdated     "2024-07-05"
	ParentBody      "HD 24071"
	Class           "G2-5V"
}

// Object * ups04 Eri  ---  Spectroscopic Binary  ---  OID=@704346   (@@12450,14)  ---  coobox=6873 
// Object types: Spectroscopic Binary,High Proper Motion Star,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,Spectroscopic Binary Candidate,UV-emission Source,X-ray Source 
Star "UPS4 Eri A"
{
	DateUpdated     "2024-07-05"
	ParentBody      "UPS4 Eri"
	Class           "B8V"
	AbsMagn         -0.20
	MassSol         3.17
	RadSol          2.32
	LumBol          100.6
	Teff            12930
	Age             0.146

	BinaryOrbit     
	{
		PeriodDays      5.0103250
		Eccentricity    0
		Inclination     146.2
		Epoch           2454407.7214
	}
}

Star "UPS4 Eri B"
{
	DateUpdated     "2024-07-05"
	ParentBody      "UPS4 Eri"
	Class           "B9.5V"
	MassSol         3.07
	RadSol          2.32
	LumBol          87.4
	Teff            12250
}