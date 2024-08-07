// Object * rho Tau  ---  delta Sct Variable  ---  OID=@720052   (@@19157,1)  ---  coobox=4896 
// Object types: delta Sct Variable,delta Sct Variable,High Proper Motion Star,Double or Multiple Star,Variable Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Star,Star,Infra-Red Source,UV-emission Source 
Remove "RHO Tau A" {ParentBody "RHO Tau"}
Remove "RHO Tau B" {ParentBody "RHO Tau"}
Star "RHO Tau A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "HIP 21273"
	Class           "A8V"
	AbsMagn         1.26
	MassSol         2.09 // 1.88
	Radius          1967380.88312638 // 计算的值
	LumBol          24.547089156850303560827217406745 // log(L) = 1.39
	Teff            7640
	FeH             0.12
	RotationPeriod  11724 // 单位错了?, VSini = 117 Km/s

	BinaryOrbit // 未修改
	{
		Period          0.2887
		Separation      0.1168
		Eccentricity    0.09
		Inclination     96.21
		AscendingNode   60.82
		ArgOfPericenter 0
		Epoch           2448375.8672
		MeanAnomaly     0
	}
}

Star "RHO Tau B"
{
	ParentBody      "HIP 21273"
	Class           "K2.3?"
}

// Object * h Tau  ---  delta Sct Variable  ---  OID=@709129   (@@19116,0)  ---  coobox=4726 
// Object types: delta Sct Variable,delta Sct Variable,High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "57 Tau A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "57 Tau"
	Class           "F0IV"
	AbsMagn         5.56
	MassSol         1.6
	RadSol          2.0
	LumBol          9.8
	Teff            7258
	FeH             0.051
	RotationPeriod  21.72
	Age             1.2

	BinaryOrbit     
	{
		PeriodDays      2.4860
		Eccentricity    0.028
		AscendingNode   140.5
		Epoch           2451164.968
	}
}

Star "57 Tau B"
{
	ParentBody      "57 Tau"
	Class           "M0.5?"
}

// Object * c Tau  ---  Blue Straggler Candidate  ---  OID=@720239   (@@18850,0)  ---  coobox=4905 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Blue Straggler Candidate,Infra-Red Source,UV-emission Source,X-ray Source 
Star "90 Tau A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "90 Tau"
	Class           "A6V"
	AbsMagn         1.18
	MassSol         2.09
	RadSol          2.8
	LumBol          30.858294774509407 // 计算的值
	Teff            8130

	BinaryOrbit     
	{
		PeriodDays      84
	}
}

Star "90 Tau B"
{
	DateUpdated     "2024-07-01"
	ParentBody      "90 Tau"
	Class           "K4V"
}

// Object * 88 Tau  ---  Spectroscopic Binary  ---  OID=@720488   (@@18503,5)  ---  coobox=4993 
// Object types: Double or Multiple Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HR&number=1458
Remove "88 Tau A"{ParentBody "88 Tau"}
Remove "88 Tau B"{ParentBody "88 Tau"}
Remove "88 Tau Aa"{ParentBody "88 Tau A"}
Remove "88 Tau (AB)"{ParentBody "88 Tau A"}
Remove "88 Tau Aa1"{ParentBody "88 Tau Aa"}
Remove "88 Tau Aa2"{ParentBody "88 Tau Aa"}
Remove "88 Tau Ab1"{ParentBody "88 Tau (AB)"}
Remove "88 Tau Ab2"{ParentBody "88 Tau (AB)"}
Remove "88 Tau Ba"{ParentBody "88 Tau B"}
Remove "88 Tau Bb"{ParentBody "88 Tau B"}

// ----------------------------------------------------------------------------------------------------

Barycenter "88 Tau A"
{
	ParentBody      "HIP 21402"
	BinaryOrbit     
	{
		Period          70000
		Separation      3578.88043426341 // 69.81 asec
	}
}

// Object * 88 Tau B  ---  Spectroscopic Binary  ---  OID=@720487   (@@18503,4)  ---  coobox=4992 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "88 Tau B/Gaia DR3 3293714491209540352/TIC 373139872/2MASS J04353517+1010136/ADS 3317 B/AG+10 462/BD+09 606/CCDM J04356+1010B/GC 5596/GEN# +1.00286909/GSC 00673-01487/HD 286909/HD 29140B/IDS 04302+0957 B/PPM 120051/SAO 94024/SKY# 7119/TYC 673-1487-1/UBV 4428/UBV M 373/YZ 10 1689/uvby98 100286909/WDS J04357+1010B/** SHJ 45B/PMSC 04302+0957Bab/PMSC 04302+0957B/Gaia DR1 3293714486913217280/Gaia DR2 3293714491209540352/SBC9 1527"
{
	ParentBody      "HIP 21402"
}

// ----------------------------------------------------------------------------------------------------

Barycenter "88 Tau A1"
{
	ParentBody      "88 Tau A"
	BinaryOrbit // VB6_Lne2007 CHR_18Aa, Gr.2
	{
		PeriodDays      6585
		Separation      12.17
		Eccentricity    0.0715
		Inclination     69.923
		AscendingNode   146.734
		Epoch           2455261
		ArgOfPericenter 25.7
		MeanAnomaly     0
	}
}

Barycenter "88 Tau A2"
{
	ParentBody      "88 Tau A"
}

// ----------------------------------------------------------------------------------------------------

Star "88 Tau Ba"
{
	DateUpdated     "2024-07-01"
	ParentBody      "Gaia DR3 3293714491209540352"
	Parallax        18.3901
	AppMagn         7.8
	Class           "F8V"
	AbsMagn         4.12 // 计算的值
	MassSol         1.2

	BinaryOrbit // Gaia DR3 AORB
	{
		PeriodDays      1129.437
		Separation      0.278189169344809 // 0.005 asec
		Eccentricity    0.629
		Inclination     88.5
		AscendingNode   145.9
		Epoch           2457215.772
		ArgOfPericenter 40.2
		MeanAnomaly     0
	}
}

Star "88 Tau Bb"
{
	DateUpdated     "2024-07-01"
	ParentBody      "Gaia DR3 3293714491209540352"
	Class           "M"
	MassSol         0.15
}

// ----------------------------------------------------------------------------------------------------

Star "88 Tau Aa1"
{
	DateUpdated     "2024-07-01"
	ParentBody      "88 Tau A1"
	Class           "A5m"
	AbsMagn         0.7 // 计算的值
	MassSol         2.06

	BinaryOrbit // VB6_Lne2007 CHR_18Aa Gr.9
	{
		PeriodDays      3.571096
		Separation      0.0689
		Eccentricity    0
		Inclination     110.6
		AscendingNode   287.5
		Epoch           2453389.3824
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "88 Tau Aa2"
{
	DateUpdated     "2024-07-01"
	ParentBody      "88 Tau A1"
	Class           "F5"
	MassSol         1.361
}

// ----------------------------------------------------------------------------------------------------

Star "88 Tau Ab1"
{
	DateUpdated     "2024-07-01"
	ParentBody      "88 Tau A2"
	Class           "G2-3:"
	MassSol         1.069

	BinaryOrbit // VB6_Lne2007 CHR_18Ab Gr.9
	{
		PeriodDays      7.886969
		Separation      0.0997
		Eccentricity    0
		Inclination     27.23
		AscendingNode   34.0
		Epoch           2452507.31
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "88 Tau Ab2"
{
	DateUpdated     "2024-07-01"
	ParentBody      "88 Tau A2"
	Class           "G2-3:"
	MassSol         1.057
}

// ----------------------------------------------------------------------------------------------------

// Object * r Tau  ---  Double or Multiple Star  ---  OID=@709981   (@@18495,8)  ---  coobox=4820 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "66 Tau A"
{
	DateUpdated     "2024-07-01"
	ParentBody      "66 Tau"
	Class           "A3V"
	AbsMagn         -0.32
	MassSol         2.89

	BinaryOrbit     
	{
		Period          54.77
		Separation      22.8149041848857 // 0.188 asec
		Eccentricity    0.720
		Inclination     34.2
		AscendingNode   239.8
		Epoch           2428621.933002604637295
		ArgOfPericenter 152.0
		MeanAnomaly     0
	}
}

Star "66 Tau B"
{
	DateUpdated     "2024-07-01"
	ParentBody      "66 Tau"
	Class           "A4V"
	MassSol         2.76
}