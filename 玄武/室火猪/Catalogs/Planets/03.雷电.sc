// Object * 42 Peg  ---  High Proper Motion Star  ---  OID=@1429947   (@@29525,3)  ---  coobox=9800 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "Homam A" {ParentBody "Homam"}
Remove "Homam B" {ParentBody "Homam"} // 两颗伴星均为光学伴星

// Object * ksi Peg  ---  High Proper Motion Star  ---  OID=@1430030   (@@29799,7)  ---  coobox=9801 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "KSI Peg A" {ParentBody "KSI Peg"}
Remove "KSI Peg B" {ParentBody "KSI Peg"}
Star "KSI Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "Gaia DR3 2719475542667772416"
	Class           "F6V"
	AbsMagn         3.25
	MassSol         1.17
	RadSol          1.86
	LumBol          4.5
	Teff            6178
	FeH             -0.27
	Age             5.0

	BinaryOrbit     
	{
		Separation      192.3
		PsoitionAngle   96.9
	}
}

// Object * ksi Peg B  ---  High Proper Motion Star  ---  OID=@1430031   (@@29799,8)  ---  coobox=9801 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Star 
Star "KSI Peg B/GJ 872 B/Gaia DR3 2719475542667351552/TIC 60716321/LSPM J2246+1210E/ADS 16261 B/BD+11 4875B/CCDM J22467+1211B/CSI+11 4875 2/LFT 1736/LHS 3852/LTT 16694/NLTT 54820/[RHG95] 3583/2MASS J22464232+1210214/WDS J22467+1210B/** HJ 301B/HD 215648B/Gaia DR2 2719475542667351552/PM J22467+1210"
{
	DateUpdated     "2024-06-15"
	ParentBody      "Gaia DR3 2719475542667772416"
	Parallax        61.0806
	AppMagn         11.7
	Class           "M3.5"
	AbsMagn         10.63 // 计算的值
	MassSol         0.32
	Teff            3569
	FeH             -0.25
}

// Object * sig Peg  ---  High Proper Motion Star  ---  OID=@1420306   (@@124776,0)  ---  coobox=9759 
// Object types: Rotating Variable,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=112935
Star "SIG Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "SIG Peg"
	Class           "F6IV" // F6-F7IV-V
	AbsMagn         3.01
	MassSol         1.275
	Radius          1858734.99579967 // log(g) = 3.69 cm/s^2
	LumBol          9.813065384051104 // 计算的值
	Teff            6250
	FeH             -0.32
	Age             2.71
}

// Object G 28-21  ---  High Proper Motion Star  ---  OID=@1420301   (@@83893,20)  ---  coobox=9759 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Barycenter "G 28-21/GJ 9801 B/Gaia DR3 2717948767692845568/TIC 318705111/LSPM J2252+0954/2MASS J22522976+0954042/USNO-B1.0 0999-00612345/CSI+09 5122 2/G 67-28/GEN# +1.00216385B/LFT 1744/LHS 3865/LTT 16722/NLTT 55097/PM 22500+0938/UBV 19595/[R78b] 344/[RHG95] 3603/WDS J22524+0950B/WISEA J225230.11+095404.8/UCAC4 500-147489/PM J22524+0954/Karmn J22524+099AB"
{
	ParentBody      "SIG Peg"
	BinaryOrbit     
	{
		Period          390154
		Separation      6850.46500240186 // 250.44 asec
	}
}

Star "G 28-21 A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "G 28-21"
	Parallax        37.25
	AppMagn         13.65
	Class           "M3.0V"
	AbsMagn         11.51 // 计算的值
	MassSol         0.30

	BinaryOrbit     
	{
		Period          21.897
		Separation      6.4966254742704 // 0.242 asec
	}
}

Star "G 28-21 B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "G 28-21"
	Class           ""
	MassSol         0.28
}

// Object * 66 Peg  ---  Star  ---  OID=@1433108   (@@29826,12)  ---  coobox=9922 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "66 Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "66 Peg"
	Class           "K3III"
	AbsMagn         -0.03 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   19.701216
		Eccentricity    0.809312728
		Inclination     -0.691353798
		AscendingNode   0
		ArgOfPericenter 57.0564605
		MeanAnomaly     29.8647194
	}
}

Star "66 Peg B"
{
	ParentBody      "66 Peg"
	Class           "A3.4?"
}

// Object * 70 Peg  ---  Spectroscopic Binary  ---  OID=@1433668   (@@29834,14)  ---  coobox=9929 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "70 Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "70 Peg"
	Class           "G8IIIa"
	AbsMagn         0.90
	MassSol         2.49
	RadSol          8.44
	LumBol          47.9
	Teff            5032
	FeH             0.05
	Age             0.590

	BinaryOrbit     
	{
		PeriodDays      941.03
		Eccentricity    0.713
		ArgOfPericenter 237.0
		MeanAnomaly     0
	}
}

Star "70 Peg B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "70 Peg"
	Class           ""
	MassSol         0.4 // 最大值
}