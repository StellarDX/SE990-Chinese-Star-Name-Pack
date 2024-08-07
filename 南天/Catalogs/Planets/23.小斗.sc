// Object * eps Cha  ---  Double or Multiple Star  ---  OID=@3271889   (@@68342,10)  ---  coobox=21375 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=58484
Remove "EPS Cha A" {ParentBody "EPS Cha"}
Remove "EPS Cha B" {ParentBody "EPS Cha"}
Barycenter "EPS Cha/Gaia DR3 5224176190526809728/HIP 58484/WISEA J115937.49-781318.5/TIC 357040925/2MASS J11593752-7813188/CCDM J11596-7813AB/CPC 21.3 1419/CPD-77 772/GC 16402/GCRV 7215/GSC 09415-03217/HD 104174/HIC 58484/HR 4583/IDS 11546-7740 AB/JP11 2138/N30 2784/PPM 371327/ROT 1764/SAO 256894/SKY# 22572/UBV 10762/[B10] 3134/[FLG2003] eps Cha 2/[KSP2003] G300.2087-15.6251/[KSP2003] J115937.51-781319.9/WDS J11596-7813AB/** HJ 4486/uvby98 100104174/WEB 10445/GEN# +1.00104174/** FGL 1AB/UCAC4 059-012341/WISE J115937.31-781319.2/Gaia DR2 5224176190525614464"
{
	ParentBody      "WDS J11596-7813"
	BinaryOrbit     
	{
		Period          509353
		Separation      14849.2236854292 // 133.94 asec
		ArgOfPericenter 220
		MeanAnomaly     0
	}
}

Barycenter "** FGL 2"
{
	ParentBody      "WDS J11596-7813"
}

// ----------------------------------------------------------------------------------------------------

// Object * eps Cha A  ---  Double or Multiple Star  ---  OID=@15319196   (@@-1,255)  ---  coobox=21375 
// Object types: Double or Multiple Star,Star 
Barycenter "EPS Cha A/TYC 9415-3217-1/** HJ 4486A/CCDM J11596-7813A/HD 104174A/WDS J11596-7813A/WDS J11596-7813Aa,Ab"
{
	ParentBody      "HIP 58484"
	BinaryOrbit // 2023AJ....165..165T
	{
		Period          751
		Separation      164.190537718414 // 1.481 asec
		Eccentricity    0.000
		Inclination     83.5
		AscendingNode   181.4
		Epoch           2392156.151876309420913
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

// Object * eps Cha B  ---  Star  ---  OID=@11620776   (@@-1,255)  ---  coobox=21375 
// Object types: Double or Multiple Star,Star 
Star "EPS Cha B/TYC 9415-3217-2/** HJ 4486B/CCDM J11596-7813B/HD 104174B/WDS J11596-7813B"
{
	DateUpdated     "2024-08-07"
	ParentBody      "HIP 58484"
	Class           ""
	MassSol         2.46
}

// ----------------------------------------------------------------------------------------------------

Barycenter "** FGL 2AB" // Component C
{
	ParentBody      "** FGL 2"
	BinaryOrbit     
	{
		Period          17895
		Separation      1203.99115507889 // 10.86 asec
		ArgOfPericenter 296
		MeanAnomaly     0
	}
}

Barycenter "** FGL 2DE" // Component DE (** FGL 2C is background star)
{
	ParentBody      "** FGL 2"
}

// ----------------------------------------------------------------------------------------------------

Star "EPS Cha Aa"
{
	DateUpdated     "2024-08-07"
	ParentBody      "EPS Cha A"
	Class           "B9V(n)"
	AbsMagn         -0.34
	MassSol         2.87
	RadSol          2.3
	LumBol          99.7
	Teff            10617
	Age             0.0028

	BinaryOrbit // 2023AJ....165..165T
	{
		Period          6.43
		Separation      5.99237809792658 // 0.054 asec
		Eccentricity    0.733
		Inclination     111.2
		AscendingNode   21.1
		Epoch           2458327.081029463093728
		ArgOfPericenter 116.2
		MeanAnomaly     0
	}
}

Star "EPS Cha Ab"
{
	DateUpdated     "2024-08-07"
	ParentBody      "EPS Cha A"
	Class           ""
	MassSol         2.37
}

// ----------------------------------------------------------------------------------------------------

// Object V* DX Cha  ---  Herbig Ae/Be Star  ---  OID=@3289715   (@@133320,0)  ---  coobox=22058 
// Object types: Herbig Ae/Be Star,Spectroscopic Binary,Variable Star,Double or Multiple Star,delta Sct Variable,Near-IR Source (λ < 3 µm),Emission-line Star,Herbig-Haro Object,Star,Herbig Ae/Be Star Candidate,Infra-Red Source,X-ray Source 
Barycenter "V* DX Cha/WDS J12001-7812A/** FGL 2A/HD 104237A/[FLG2003] eps Cha 5/HIP 58520/Gaia DR3 5836666564476158336/TIC 357040880/[JE82] 615/2MASS J12000511-7811346/CD-77 528/CPC 21.3 1421/CPD-77 774/GC 16412/GSC 09416-01289/HD 104237/HIC 58520/Hen 3-741/IRAS 11575-7754/PDS 61/PPM 371328/SAO 256895/SKY# 22581/TYC 9416-1289-1/[GWT2004] HD 104237-3/[KSP2003] G300.2265-15.5917/[SGA2004] 7/uvby98 100104237/RX J1200.1-7811/[KSP2003] J120005.28-781134.8/UCAC3 24-27117/HH 669/1RXS J120005.7-781139/AKARI-FIS-V1 J1200066-781135/Gaia DR1 5836666560181202176/GEN# +1.00104237/Gaia DR2 5836666564476158336"
{
	ParentBody      "** FGL 2AB"
	BinaryOrbit
	{
		Period          933.776
		Separation      222.838033389916 // 2.01 asec
		ArgOfPericenter 74
		MeanAnomaly     0
	}
}

// Object [FLG2003] eps Cha 4  ---  Star  ---  OID=@3289687   (@@108956,13)  ---  coobox=22058 
// Object types: Double or Multiple Star,Star 
Star "[FLG2003] EPS Cha 4/Gaia DR3 5836666564482421376/HD 104237B/** FGL 2B/WDS J12001-7812B"
{
	DateUpdated     "2024-08-07"
	ParentBody      "** FGL 2AB"
	Class           "K3V"
	MassSol         0.52
}

// ----------------------------------------------------------------------------------------------------

// Object [FLG2003] eps Cha 6  ---  Young Stellar Object Candidate  ---  OID=@3289689   (@@108956,15)  ---  coobox=22058 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Young Stellar Object Candidate 
Star "[FLG2003] EPS Cha 6/Gaia DR3 5836666560185012352/TIC 357040881/[GWT2004] HD 104237-5/2MASS J12000829-7811395/UCAC3 24-27122/Gaia DR2 5836666560185012352/** FGL 2D/WDS J12001-7812D/UCAC4 060-012406/HD 104237D"
{
	DateUpdated     "2024-08-07"
	ParentBody      "** FGL 2DE"
	Class           "M3.5IV" // Protostar
	MassSol         0.71
	RadSol          1.124929 // Gaia DR3
	LumBol          0.185605014196628 // 计算的值
	Teff            3572
	FeH             0.137

	BinaryOrbit     
	{
		Period          9187
		Separation      485.587621974604 // 4.38 asec
		ArgOfPericenter 133
		MeanAnomaly     0
	}
}

// Object [FLG2003] eps Cha 7  ---  Star  ---  OID=@3289690   (@@108956,16)  ---  coobox=22058 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star 
Star "[FLG2003] EPS Cha 7/HD 104237E/Gaia DR3 5836666564480769280/TIC 357040884/[GWT2004] HD 104237-6/ASAS J120005-7811.6/2MASS J12000931-7811424/UCAC3 24-27125/** FGL 2E/WDS J12001-7812E/Gaia DR2 5836666564480769280"
{
	DateUpdated     "2024-08-07"
	ParentBody      "** FGL 2DE"
	Class           "K3IV"
	MassSol         0.61
}

// ----------------------------------------------------------------------------------------------------

Star "V* DX Cha Ca1"
{
	DateUpdated     "2024-08-07"
	ParentBody      "V* DX Cha"
	Parallax        9.3805
	AppMagn         6.6
	Class           "A4V"
	AbsMagn         1.46 // 计算的值
	MassSol         2.20
	RadSol          2.365 // Gaia DR3
	LumBol          50.9174645297387 // 计算的值
	Teff            10026
	FeH             -0.085

	BinaryOrbit // 2004A&A...427..907B
	{
		PeriodDays      19.8590
		Eccentricity    0.665
		Inclination     17.0
		AscendingNode   235.0
		Epoch           2451647.505
		ArgOfPericenter 216.1
		MeanAnomaly     0
	}
}

Star "V* DX Cha Ca2"
{
	DateUpdated     "2024-08-07"
	ParentBody      "V* DX Cha"
	Class           ""
	MassSol         1.40
}

// ----------------------------------------------------------------------------------------------------

// Object HD 83979  ---  Star  ---  OID=@3242142   (@@68973,1)  ---  coobox=21464 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "HD 83979 A"
{
	DateUpdated     "2024-08-07"
	ParentBody      "HD 83979"
	Class           "B4IV"
	AbsMagn         -1.15
	MassSol         3.12
	RadSol          4.75
	LumBol          522
	Teff            15655
	FeH             -0.31
	Age             0.184

	BinaryOrbit
	{
		PeriodDays      2.7 // EB
	}
}

Star "HD 83979 B"
{
	ParentBody      "HD 83979"
	Class           "A8.5?"
}