// Object * zet02 Aqr  ---  Double or Multiple Star  ---  OID=@1363537   (@@28202,9)  ---  coobox=8703 
// Object types: Double or Multiple Star,Double or Multiple Star,High Proper Motion Star,Star,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=110960
Remove "ZET2 Aqr"{ParentBody "ZET Aqr"}
Remove "ZET1 Aqr"{ParentBody "ZET Aqr"}
Remove "ZET2 Aqr A"{ParentBody "ZET2 Aqr"}
Remove "ZET2 Aqr B"{ParentBody "ZET2 Aqr"}
Barycenter "ZET2 Aqr/Gaia DR3 2678143182592080768/PLX 5435/WDS J22288-0001A/55 Aqr A/ZET Aqr A/ADS 15971 A/BD-00 4365A/CCDM J22288-0001A/CSI-00 4365 1/GC 31399/GCRV 14121/HD 213052/HR 8559/IDS 22237-0032 A/NLTT 53956/RBS 1865/ROT 3270/SAO 146108/SKY# 42776/WDS J22288-0001Aa,Ab/WDS J22288-0001Aa,Ac/TYC 5226-1605-1/** EBE 1/** STF 2909A/** TOK 201/PMSC 22237-0032A/PLX 5435.00A/WEB 19864/Gaia DR2 2678143182592080768"
{
	ParentBody      "TIC 176070741"
	BinaryOrbit     
	{
		Period          540
		Separation      98.4788677173745 // 3.496 asec
		Eccentricity    0.419
		Inclination     142.0
		AscendingNode   131.3
		Epoch           2444787.552720651496202
		ArgOfPericenter 89.3
		MeanAnomaly     0
	}
}

Star "ZET2 Aqr Aa"
{
	DateUpdated     "2024-06-12"
	ParentBody      "ZET2 Aqr"
	Class           "F3V"
	AbsMagn         1.15
	MassSol         1.4
	FeH             -0.13
	Age             1.0

	BinaryOrbit     
	{
		Period          25.95
		Separation      11.1570852207781 // 0.385 asec
		Eccentricity    0.872
		Inclination     11.8
		AscendingNode   293.7
		Epoch           2453925.912534152157605
		ArgOfPericenter 280.9
		MeanAnomaly     0
	}
}

Star "ZET2 Aqr Ab"
{
	DateUpdated     "2024-06-12"
	ParentBody      "ZET2 Aqr"
	Class           ""
	MassSol         0.6
}

// Object * zet01 Aqr  ---  High Proper Motion Star  ---  OID=@1363538   (@@28202,10)  ---  coobox=8703 
// Object types: Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source 
Star "ZET1 Aqr/Gaia DR3 2678143182591522048/55 Aqr B/ZET Aqr B/ADS 15971 B/BD-00 4365B/CCDM J22288-0001B/CSI-00 4365 2/GC 31398/GCRV 14120/HD 213051/HR 8558/IDS 22237-0032 B/IRC +00518/NLTT 53957/ROT 3269/SKY# 42775/WDS J22288-0001B/TYC 5226-1605-2/** STF 2909B/PMSC 22237-0032B/PMSC 22237-0032Bab/PLX 5435.00B/WEB 19863/Gaia DR2 2678143182591522048"
{
	DateUpdated     "2024-06-12"
	ParentBody      "TIC 176070741"
	Parallax        34.4525
	AppMagn         4.49
	Class           "F6IV"
	AbsMagn         2.18 // 计算的值
	MassSol         1.4
}

// Object * gam Aqr  ---  High Proper Motion Star  ---  OID=@1363564   (@@28205,11)  ---  coobox=8700 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Sadachbia A"{ParentBody "Sadachbia"}
Remove "Sadachbia B"{ParentBody "Sadachbia"}
Star "GAM Aqr Aa"
{
	DateUpdated     "2024-06-12"
	ParentBody      "GAM Aqr"
	Class           "A0V"
	AbsMagn         0.10
	MassSol         2.49
	Radius          1838916.70056061 // log(g) = 3.99 cm/s^2
	LumBol          80.58429716355127 // 计算的值
	Teff            10637
	FeH             0.30
	Age             0.158

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   51.0455967
		Eccentricity    0.341216863
		Inclination     0.808411121
		AscendingNode   0
		ArgOfPericenter -84.9478706
		MeanAnomaly     -95.8055962
	}
}

Star "GAM Aqr Ab"
{
	ParentBody      "GAM Aqr"
	Class           "F3.5?"
}

// Object * pi. Aqr  ---  Be Star  ---  OID=@1382994   (@@111325,0)  ---  coobox=9387 
// Object types: Be Star,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Blue Object,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Seat A" {ParentBody "Seat"}
Remove "Seat B" {ParentBody "Seat"}
Star "PI Aqr A"
{
	DateUpdated     "2024-06-12"
	ParentBody      "PI Aqr"
	Class           "B1III-IVe"
	AbsMagn         -2.09
	MassSol         10.7
	RadSol          6.2
	LumBol          7302
	Teff            27094
	FeH             -0.02
	Age             0.010

	BinaryOrbit     
	{
		PeriodDays      84.07
		Separation      0.96
		Eccentricity    0.0
		Epoch           2450318.5
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "PI Aqr B"
{
	DateUpdated     "2024-06-12"
	ParentBody      "PI Aqr"
	Class           "A-F/WD?"
}