// Object * alf Cru  ---  Spectroscopic Binary  ---  OID=@3297899   (@@65820,3)  ---  coobox=21668 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=60718
Remove "Acrux A" {ParentBody "Acrux"}
Remove "ALF2 Cru" {ParentBody "Acrux"}
Remove "Acrux Aa" {ParentBody "Acrux A"}
Remove "ALF1 Cru Ab" {ParentBody "Acrux A"}
// 丹霞：除了十字架二本体4星系统之外，还有HR 4729双星和一颗更暗的红矮星也属于这个系统。
// 所以加起来就是2+2+2+1=7星系统，其中A-B可能为非周期轨道，故整个系统并不是稳定的
Barycenter "ALF Cru/HIP 60718/CD-62 652/LLNS 8229/TIC 450568754/SBC9 725/CCDM J12266-6306AB/CEL 4105/CPD-62 2745/CSI-62 2745 43/HIC 60718/IDS 12210-6233 AB/JP11 2217/UBV 11169/AX J1226.6-6305/WDS J12266-6306AB/uvby98 100108248/IRAS 12237-6249/AKARI-IRC-V1 J1226360-630557/GEN# +1.00108248/SBC7 462/EUVE J1226-63.0/2MASS J12263615-6305571/1RXS J122634.8-630554/1ES 1223-62.8/Acrux"
{
	ParentBody      "CCDM J12266-6306"
	BinaryOrbit     
	{
		//Period          138470
		PericenterDist  9400
		Eccentricity    1 // 由于NoirLab说A-B的轨道为非周期，那么AB-CD的轨道也不可能周期
	}
}

// Object HD 108250  ---  Pulsating Variable  ---  OID=@3297896   (@@65820,0)  ---  coobox=21668 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Barycenter "HD 108250/Gaia DR3 6053807844583576064/CD-62 651/LLNS 8230/TIC 450568600/CCDM J12266-6306C/CPC 20.1 3593/CPD-62 2742/GC 16951/GCRV 7470/GEN# +1.00108250/GSC 08979-03466/HR 4729/IDS 12210-6233 C/N30 2872/PPM 359408/ROT 1823/SAO 251903/SKY# 23279/TYC 8979-3466-1/UBV 11170/UBV M 18205/[B10] 3236/uvby98 100108250/2MASS J12263089-6307200/ALS 14967/SSTGLMC G300.1194-00.3867/WDS J12266-6306C/PMSC 12210-6233C/PMSC 12210-6233Ca/WEB 10797/Gaia DR2 6053807844582485248"
{
	ParentBody      "CCDM J12266-6306"
}

// ----------------------------------------------------------------------------------------------------

// Object * alf01 Cru  ---  Star  ---  OID=@11606360   (@@-1,255)  ---  coobox=21668 
// Object types: Double or Multiple Star,Star 
Barycenter "ALF1 Cru/TYC 8979-3464-1/WEB 10799/CCDM J12266-6306A/CPC 20.1 3594/CPD-62 2745A/CSI-62 2745 41/FK5 462/GC 16952/GCRV 7471/HR 4730/IDS 12210-6233 A/N30 2873/PPM 359410/ROT 1822/SAO 251904/SKY# 23285/[B10] 3237/ALS 14968/WDS J12266-6306A/PMSC 12210-6233A/HD 108248"
{
	ParentBody      "ALF Cru"
	BinaryOrbit // VB6
	{
		PericenterDist  430
		Eccentricity    1.215
		Inclination     100.5
		AscendingNode   102.7
		Epoch           2490260.206468885764480
		ArgOfPericenter 358.8
		MeanAnomaly     0
	}
}

// Object * alf02 Cru  ---  Star  ---  OID=@11606361   (@@-1,255)  ---  coobox=21668 
// Object types: Double or Multiple Star,Star 
Barycenter "ALF2 Cru/TYC 8979-3465-1/WEB 10800/CCDM J12266-6306B/CPC 20.1 3595/CPD-62 2745B/CSI-62 2745 42/GC 16953/GCRV 7472/HD 108249/HR 4731/IDS 12210-6233 B/N30 2874/SKY# 23286/[B10] 3238/ALS 14969/WDS J12266-6306B/PMSC 12210-6233B"
{
	ParentBody      "ALF Cru"
}

// ----------------------------------------------------------------------------------------------------

Barycenter "HD 108250 C"
{
	ParentBody      "HD 108250"
	BinaryOrbit     
	{
		Period          2086
		Separation      220
	}
}

Star "HD 108250 D"
{
	DateUpdated     "2026-05-04"
	ParentBody      "HD 108250"
	Class           "M0V"
	MassSol         0.5
	RadSol          0.55
	Age             0.012
}

// ----------------------------------------------------------------------------------------------------

Star "ALF1 Cru Aa"
{
	DateUpdated     "2026-05-04"
	ParentBody      "ALF1 Cru"
	Class           "B0.5IV"
	AbsMagn         -3.77 // -2.2?
	MassSol         17.2
	RadSol          6.8
	LumBol          31110
	Teff            28950
	Age             0.0071

	BinaryOrbit // SB9_725 1980MNRAS.191..217T
	{
		PeriodDays      75.7469
		Separation      1.01
		Eccentricity    0.369
		Inclination     66.2
		AscendingNode   225.0
		Epoch           2458183.1
		ArgOfPericenter 229.5
		MeanAnomaly     0
	}
}

Star "ALF1 Cru Ab"
{
	DateUpdated     "2026-05-04"
	ParentBody      "ALF1 Cru"
	Class           ""
	MassSol         6.8
	RadSol          3.2
	Luminosity      1400
	Teff            19750
	Age             0.0071
}

// ----------------------------------------------------------------------------------------------------

Star "ALF2 Cru Ba"
{
	DateUpdated     "2026-05-04"
	ParentBody      "ALF2 Cru"
	Class           "B1V"
	MassSol         12.4
	RadSol          5.4
	LumBol          14000
	Teff            26950
	Age             0.0071

	BinaryOrbit // SB9_725 1980MNRAS.191..217T
	{
		PeriodDays      405.4
		Separation      3.0
		Eccentricity    0.36
		Inclination     94.4
		AscendingNode   86.0
		Epoch           2458099
		ArgOfPericenter 105.2
		MeanAnomaly     0
	}
}

Star "ALF2 Cru Bb"
{
	DateUpdated     "2026-05-04"
	ParentBody      "ALF2 Cru"
	Class           ""
	MassSol         9.8
	RadSol          4.4
	Luminosity      6100
	Teff            24350
}

// ----------------------------------------------------------------------------------------------------

Star "HD 108250 Ca"
{
	DateUpdated     "2026-05-04"
	ParentBody      "HD 108250 C"
	Class           "B5V"
	AbsMagn         -0.98
	MassSol         4.5
	RadSol          2.5
	LumBol          380
	Teff            15900
	FeH             -0.645 // Gaia DR3

	BinaryOrbit
	{
		PeriodDays      1.225155
		//SemiMajorAxisKm 726310.8
		Eccentricity    0.024
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2438903.314
		ArgOfPericenter 314
		MeanAnomaly     0
	}
}

Star "HD 108250 Cb"
{
	DateUpdated     "2026-05-04"
	ParentBody      "HD 108250 C"
	Class           ""
	MassSol         0.64
	RadSol          0.66
}

// ----------------------------------------------------------------------------------------------------

// Object * bet Cru  ---  beta Cep Variable  ---  OID=@3312681   (@@64977,0)  ---  coobox=21656 
// Object types: beta Cep Variable,Double or Multiple Star,Spectroscopic Binary,Variable Star,beta Cep Variable,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source,X-ray Source,beta Cep Variable Candidate 
// 2007年又在此系统中发现了疑似第三个物体，为低质量的前主序星，但不知道确切位置
Star "BET Cru A"
{
	DateUpdated     "2024-08-01"
	ParentBody      "BET Cru"
	Class           "B0.5III"
	AbsMagn         -3.92
	MassSol         16
	RadSol          8.4
	LumBol          34000
	Teff            27000
	FeH             -0.08
	RotationPeriod  86.4
	Age             0.008 // 0.011

	BinaryOrbit     
	{
		PeriodDays      1828.0
		Separation      8.7
		Eccentricity    0.38
		Epoch           2449879
		ArgOfPericenter 113
		MeanAnomaly     0
	}
}

Star "BET Cru B"
{
	DateUpdated     "2024-08-01"
	ParentBody      "BET Cru"
	Class           "B2V"
	MassSol         10
}