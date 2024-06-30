// Object * eps Tau b  ---  Extra-solar Planet  ---  OID=@3886617   (@@-1,255)  ---  coobox=4695
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"EPS Tau b/HD 28305b/Amateru/Ain b"
{
	ParentBody     "Ain"
	DiscMethod     "RadVel"
	DiscDate       "2006"
	Class          "GasGiant"
	MassJup        7.6
	Radius         84360.56

	Orbit
	{
		Epoch           2452879
		PeriodDays      645.5
		SemiMajorAxis   1.93
		Eccentricity    0.151
		ArgOfPericen    94.4
	}
}

// Object * eps Tau  ---  Double or Multiple Star  ---  OID=@708367   (@@19950,0)  ---  coobox=4695 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "DEL3 Tau (AB)"{ParentBody "DEL3 Tau"}
Remove "DEL3 Tau A"{ParentBody "DEL3 Tau (AB)"}
Remove "DEL3 Tau B"{ParentBody "DEL3 Tau (AB)"}
Remove "DEL3 Tau C"{ParentBody "DEL3 Tau"}
Star "DEL3 Tau A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "DEL3 Tau"
	Class           "A2IV-Vs"
	AbsMagn         1.14
	MassSol         2.27
	Radius          1091036.82793517 // 计算的值
	LumBol          14.7 // *10
	Teff            9025
}

// Object * del03 Tau B  ---  High Proper Motion Star  ---  OID=@9600430   (@@-1,255)  ---  coobox=4701 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "DEL3 Tau B/Gaia DR3 3314063977537054464/* 68 Tau B/HD 27962B/** KUI 17B/CCDM J04255+1755B/WDS J04255+1756B/TYC 1269-1246-2/Gaia DR2 3314063977537054464"
{
	DateUpdated     "2024-06-30"
	ParentBody      "DEL3 Tau A"
	Class           "A9?"

	Orbit     
	{
		Epoch           2455197
		SemiMajorAxis   85.3626083928239 // 1.80 asec
		ArgOfPericenter 341
		MeanAnomaly     0
	}
}

// Object HG 7-205  ---  High Proper Motion Star  ---  OID=@708569   (@@19612,7)  ---  coobox=4701 
// Object types: High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Star,Star,Star,Star 
Star "HG 7-205/GALAH 151008004001047/AP J04252501+1754552/Gaia DR3 3314063908819076352/TIC 17409889/Cl* Melotte 25 OS 325/Cl* Melotte 25 VA 354/Cl* Melotte 25 HAN 350/Cl* Melotte 25 PELS 37/ADS 3206 C/CCDM J04255+1755C/CSI+17 719 2/CSI+17-04225/GEN# +5.20251354/PLX 974.07/WDS J04255+1756C/2MASS J04252501+1754552/UCAC4 540-009249/** H 6101C/WISEA J042525.10+175454.9/EPIC 210667985/[RSP2011] 311/Gaia DR2 3314063908819076352"
{
	ParentBody      "DEL3 Tau A"
	Class           "K9.2?"

	Orbit     
	{
		SemiMajorAxis   3645.93458143377 // 76.88 asec
		ArgOfPericenter 234
		MeanAnomaly     0
	}
}

// Object * del Tau  ---  Spectroscopic Binary  ---  OID=@708562   (@@19611,0)  ---  coobox=4700 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Hyadum II Aa" {ParentBody "Hyadum II"}
Remove "Hyadum II Ab" {ParentBody "Hyadum II"}
Star "DEL1 Tau Aa"
{
	DateUpdated     "2024-06-30"
	ParentBody      "DEL Tau"
	Class           "G9.5IIICN0.5"
	AbsMagn         0.41
	MassSol         2.8
	RadSol          11.4
	LumBol          69
	Teff            5000
	FeH             0.10
	RotationPeriod  3316.8
	Age             0.620

	BinaryOrbit     
	{
		PeriodDays      529.8
		Eccentricity    0.42
		Epoch           2434356.5
		ArgOfPericenter 155
		MeanAnomaly     0
	}
}

Star "DEL1 Tau Ab"
{
	DateUpdated     "2024-06-30"
	ParentBody      "DEL Tau"
	Class           ""
	MassSol         1.28
}

// Object * alf Tau  ---  Long-Period Variable Candidate  ---  OID=@719377   (@@19667,0)  ---  coobox=4875 
// Object types: Double or Multiple Star,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Star,Star,Infra-Red Source,Long-Period Variable Candidate,UV-emission Source 
Remove "Aldebaran A"{ParentBody "Aldebaran"}
Remove "Aldebaran B"{ParentBody "Aldebaran"}
Remove "Aldebaran A b" {ParentBody "Aldebaran A"}
Star "ALF Tau A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "ALF Tau"
	Class           "K5III"
	AbsMagn         -0.641
	MassSol         1.16
	RadSol          45.1
	LumBol          439
	Teff            3900
	FeH             -0.33
	RotationPeriod  12480
	Age             6.4

	BinaryOrbit     
	{
		Separation      639.967306401565 // 31.32 asec
	}
}

// Object * alf Tau B  ---  High Proper Motion Star  ---  OID=@719242   (@@19658,9)  ---  coobox=4875 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "ALF Tau B/GJ 9159 B/GJ 171.1 B/Gaia DR3 3313069881590622848/ADS 3321 B/BD+16 629B/CCDM J04359+1631B/CSI+16 629 2/IDS 04302+1619 B/[RHG95] 796/WDS J04359+1631B/** BU 550B/HD 29139B/Gaia DR2 3313069881589149824"
{
	DateUpdated     "2024-06-30"
	ParentBody      "ALF Tau"
	Parallax        47.2526
	AppMagn         13.6
	Class           "M2.5"
	AbsMagn         11.97 // 计算的值
}

// Object * alf Tau b  ---  Extra-solar Planet  ---  OID=@12725716   (@@-1,255)  ---  coobox=4875
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "ALF Tau Ab/Aldebaran Ab"
{
	ParentBody     "ALF Tau A"
	DiscMethod     "RadVel"
	DiscDate       "2015"
	MassJup        5.8

	Orbit
	{
		Epoch           2451297
		PeriodDays      628.96
		SemiMajorAxis   1.46
		Eccentricity    0.1
		ArgOfPericen    287
	}
}

// Object * tet01 Tau  ---  Spectroscopic Binary  ---  OID=@708680   (@@19626,0)  ---  coobox=4703 
// Object types: Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "TET1 Tau A" {ParentBody "TET1 Tau"}
Remove "TET1 Tau B" {ParentBody "TET1 Tau"}
Star "TET1 Tau Ba"
{
	DateUpdated     "2024-06-30"
	ParentBody      "TET1 Tau"
	Class           "G9IIIFe-0.5"
	AbsMagn         0.416
	MassSol         2.67
	RadSol          10.55
	LumBol          71
	Teff            5080
	FeH             0.14
	Age             0.510

	BinaryOrbit     
	{
		PeriodDays      5997
		Eccentricity    0.64
	}
}

Star "TET1 Tau Bb"
{
	DateUpdated     "2024-06-30"
	ParentBody      "TET1 Tau"
	Class           ""
	MassSol         1.31
}

// Object * 71 Tau  ---  delta Sct Variable  ---  OID=@708948   (@@19645,0)  ---  coobox=4703 
// Object types: delta Sct Variable,delta Sct Variable,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// 所有伴星及轨道均为系统生成
Barycenter "71 Tau A"
{
	ParentBody      "71 Tau"
	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   9.11913937
		Eccentricity    0.576301015
		Inclination     -1.9261446
		AscendingNode   0
		ArgOfPericenter 89.6079625
		MeanAnomaly     -105.103711
	}
}

Star "71 Tau Aa"
{
	DateUpdated     "2024-06-30"
	ParentBody      "71 Tau A"
	Class           "F0V"
	AbsMagn         1.10
	MassSol         1.94
	RadSol          3.34
	LumBol          32.53591634499396 // 计算的值
	Teff            7543
	RotationPeriod  340.8
	Age             0.966

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0421609277
		Eccentricity    0
		Inclination     -1.91331673
		AscendingNode   0
		ArgOfPericenter -165.658567
		MeanAnomaly     -66.0626729
	}
}

Star "71 Tau Ab"
{
	ParentBody     "71 Tau A"
	Class          "F6.5?"
}

Star "71 Tau B"
{
	ParentBody     "71 Tau"
	Class          "F0.7?"
}

// Object * lam Tau  ---  Spectroscopic Binary  ---  OID=@691373   (@@117446,2)  ---  coobox=4710 
// Object types: Near-IR Source (λ < 3 µm),Eclipsing Binary,Double or Multiple Star,Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=18724
Remove "LAM Tau (AB)"{ParentBody "LAM Tau"}
Remove "LAM Tau A"{ParentBody "LAM Tau (AB)"}
Remove "LAM Tau B"{ParentBody "LAM Tau (AB)"}
Remove "LAM Tau C"{ParentBody "LAM Tau"}
Barycenter "LAM Tau AB"
{
	ParentBody      "Gaia DR3 3305012316783533056"
	BinaryOrbit // SB9_212 1982ApJ...263..289F
	{
		PeriodDays      33.07
		Eccentricity    0.15
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2444667.398
		ArgOfPericenter 61
		MeanAnomaly     0
	}
}

Star "LAM Tau A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "LAM Tau AB"
	Class           "B3V"
	AbsMagn         -2.45
	MassSol         7.18
	RadSol          6.40
	LumBol          5801
	Teff            18700
	Age             0.0332

	BinaryOrbit // SB9_211 1982ApJ...263..289F
	{
		PeriodDays      3.9529552
		SemiMajorAxisKm 15242787 // 21.91 RSun
		Eccentricity    0.025
		Inclination     76
		Epoch           2444658.398
	}
}

Star "LAM Tau B"
{
	DateUpdated     "2024-06-30"
	ParentBody      "LAM Tau AB"
	Class           "A4IV"
	MassSol         1.89
	RadSol          5.30
	LumBol          128
	Teff            8405
}

Star "LAM Tau C"
{
	DateUpdated     "2024-06-30"
	ParentBody      "Gaia DR3 3305012316783533056"
	Class           ""
	MassSol         0.7
}