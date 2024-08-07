// Object * chi Tau  ---  Spectroscopic Binary  ---  OID=@707482   (@@20777,1)  ---  coobox=4340 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=20430
Star "CHI Tau A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "CHI Tau"
	Class           "B9Vnn"
	AbsMagn         0.82
	MassSol         2.60
	RadSol          2.15
	LumBol          46.87264885196055 // 计算的值
	Teff            10300
}

// Object * chi Tau B  ---  Star  ---  OID=@707481   (@@20777,0)  ---  coobox=4340 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "CHI Tau B/Gaia DR3 150461092453290240/TIC 58473044/TYC 1820-1419-1/WDS J04226+2538B/ADS 3161 B/AG+25 421/BD+25 707B/CCDM J04226+2538B/CSI+25 707 1/GCRV 1655 E/GEN# +1.00027638B/HD 27638B/IDS 04165+2524 B/PPM 93460/UBV 4219/2MASS J04223555+2538032/** STF 528B/PPMX J042235.5+253803/PMSC 04165+2523B/PMSC 04165+2523Babc/WEB 3905/Gaia DR2 150461092453290240"
{
	ParentBody      "CHI Tau"
	BinaryOrbit     
	{
		Period          28985
		Separation      1735.2649680564 // 19.44 asec
	}
}

Barycenter "CHI Tau Ba"
{
	ParentBody      "CHI Tau B"
	BinaryOrbit // G.Torres, 2006
	{
		PeriodDays      3450.6
		Separation      7.32330016187668 // 0.082 asec
		Eccentricity    0.352
		Inclination     73.0
		AscendingNode   0.0
		Epoch           2447546.5
		ArgOfPericenter 70.3
		MeanAnomaly     0
	}
}

// Object [ITH2008] HD 27638B-cc1  ---  Star  ---  OID=@5160607   (@@-1,255)  ---  coobox=4340 
// Object types: Star 
Star "[ITH2008] HD 27638B-cc1/Gaia DR3 150461092453291136"
{
	DateUpdated     "2024-06-30"
	ParentBody      "CHI Tau Ba"
	Class           "F8"
	AbsMagn         4.20
	MassSol         1.19
	Radius          706701.257531137 // log(g) = 4.5 cm/s^2
	LumBol          1.356048741970908 // 计算的值
	Teff            6180

	BinaryOrbit
	{
		PeriodDays      17.602309
		Eccentricity    0.2938
		Inclination     53.3
		Epoch           2448891.649
		ArgOfPericenter 69.43
		MeanAnomaly     0
	}
}

// Object [ITH2008] HD 27638B-cc2  ---  Star  ---  OID=@5160608   (@@-1,255)  ---  coobox=4340 
// Object types: Star 
Star "[ITH2008] HD 27638B-cc2"
{
	DateUpdated     "2024-06-30"
	ParentBody      "CHI Tau Ba"
	Class           "G6"
	AbsMagn         5.27
	MassSol         1.02
	Radius          654278.228756865 // log(g) = 4.5 cm/s^2
	LumBol          0.7949134995819941 // 计算的值
	Teff            5620
}

// Object [ITH2008] HD 27638B-cc3  ---  Star  ---  OID=@5160609   (@@-1,255)  ---  coobox=4340 
// Object types: Star 
Barycenter "[ITH2008] HD 27638B-cc3"
{
	ParentBody      "CHI Tau B"
}

Star "[ITH2008] HD 27638B-cc3 A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "[ITH2008] HD 27638B-cc3"
	Class           "K4"
	AbsMagn         7.87
	MassSol         0.70

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0117371229
		Eccentricity    0
		Inclination     -1.90117693
		AscendingNode   0
		ArgOfPericenter 47.3451859
		MeanAnomaly     -169.74726
	}
}

Star "[ITH2008] HD 27638B-cc3 B"
{
	DateUpdated     "2024-06-30"
	ParentBody      "[ITH2008] HD 27638B-cc3"
	Class           "K4"
	AbsMagn         7.87
	MassSol         0.70
}