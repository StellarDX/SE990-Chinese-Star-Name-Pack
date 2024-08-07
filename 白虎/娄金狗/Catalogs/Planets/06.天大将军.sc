// Object * gam01 And  ---  Star  ---  OID=@9999   (@@1658,2)  ---  coobox=2593 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=9640
Remove "GAM2 And"{ParentBody "Almach"}
Remove "GAM2 And B"{ParentBody "GAM2 And"}
Remove "GAM1 And"{ParentBody "Almach"}
Remove "GAM2 And Ba"{ParentBody "GAM2 And B"}
Remove "GAM2 And Bb"{ParentBody "GAM2 And B"}
Remove "GAM2 And C"{ParentBody "GAM2 And"}
Star "GAM1 And/HIP 9640/TIC 292057658/HIC 9640/AG+42 213/GAM And/BD+41 395/IRC +40034/JP11 581/RAFGL 294/IRAS 02008+4205/2MASS J02035397+4219471/Almach/GEN# +1.00012533/PLX 424/GAM And A/57 And A/ADS 1630 A/CCDM J02039+4220A/CSI+41 395 2/FK5 73/GC 2477/GCRV 1133/GEN# +1.00012533A/HD 12533/HR 603/IDS 01578+4151 A/N30 426/PMC 90-93 51/ROT 289/SAO 37734/SKY# 3037/UBV M 8633/WDS J02039+4220A/TYC 2837-2311-1/PMSC 01578+4151A/CSI+41 395 1/WEB 2024/** STF 205A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "ADS 1630"
	Class           "K2IIb"
	AbsMagn         -3.30 // 计算的值
	MassSol         14.52
	RadSol          97
	LumBol          2000
	Teff            4248
	FeH             -0.06
}

// Object * gam02 And  ---  Spectroscopic Binary  ---  OID=@9988   (@@1655,12)  ---  coobox=2593 
// Object types: High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Star,UV-emission Source 
Barycenter "GAM2 And/SBC9 107/Gaia DR3 346231302441905920/GEN# +1.00012534/CEL 192/CSI+41 395 3/GC 2479/GCRV 1134/HD 12534/HGAM 101/HR 604/ROT 3493/SAO 37735/SBC7 73/SKY# 3038/UBV M 8635/TYC 2837-2311-2/Renson 3200/PMSC 01578+4151Bab/CSI+41 395 4/UCAC4 662-008563/ROT 3540/CCDM J02039+4220BC/** STT 38/ADS 1630 BC/IDS 01578+4151 BC/WDS J02039+4220BC/** STF 205BC/WEB 2025/Gaia DR2 346231302441905920"
{
	ParentBody      "ADS 1630"
	BinaryOrbit     
	{
		Period          4748
		Separation      1192.77109217752 // 9.90 asec
	}
}

Barycenter "GAM and B"
{
	ParentBody      "GAM2 And"
	BinaryOrbit // VB6_Doc2007d STT_38BC Gr.2
	{
		Period          63.67
		Separation      25.0153789482579 // 0.302 asec
		Eccentricity    0.927
		Inclination     109.8
		AscendingNode   109.6
		Epoch           2457205.787479205522686
		ArgOfPericenter 3.4
		MeanAnomaly     0
	}
}

Star "GAM and Ba"
{
	DateUpdated     "2024-06-25"
	ParentBody      "GAM And B"
	Parallax        12.0724
	AppMagn         5.82
	Class           "B9.5V"
	AbsMagn         1.23 // 计算的值
	MassKg          5.40487246462696e+30 // log(g) = 4.018 cm/s^2
	RadSol          2.674075 // Gaia DR3
	LumBol          54.9686606056369 // 计算的值
	Teff            9611
	FeH             0.778

	BinaryOrbit     
	{
		PeriodDays      2.67
		Eccentricity    0.29
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2436122.180
		ArgOfPericenter 355.2
		MeanAnomaly     0
	}
}

Star "GAM and Bb"
{
	DateUpdated     "2024-06-25"
	ParentBody      "GAM And B"
	Class           "B9.5V"
	MassSol         1.91
}

Star "GAM and C"
{
	DateUpdated     "2024-06-25"
	ParentBody      "GAM2 And"
	Class           "A0V"
	MassSol         2.02
}

// Object * phi Per  ---  Be Star  ---  OID=@11672004   (@@-1,255)  ---  coobox=2236 
// Object types: Be Star,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Emission-line Star,Star,Infra-Red Source,UV-emission Source 
Star "PHI Per A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "PHI Per"
	Class           "B2Vep"
	AbsMagn         -3.11
	MassSol         9.6
	DimensionsSol   (16, 11, 16)
	LumBol          14454
	Teff            29300
	RotationPeriod  22.076828374771910666651121229773 // Maximum, Vsini = 440 Km/s

	BinaryOrbit     
	{
		PeriodDays      126.6731
		Separation      1.11275667737924 // 5.89 mas
		Inclination     77.6
		AscendingNode   295.7
		Epoch           2456110.03
	}
}

Star "PHI Per B"
{
	DateUpdated     "2024-06-25"
	ParentBody      "PHI Per"
	Class           "sdO"
	MassSol         1.14
	RadSol          1.3
	LumBol          6310
	Teff            53000
	Age             0.057
}

// Object * chi And  ---  Spectroscopic Binary  ---  OID=@9330   (@@2245,2)  ---  coobox=2561 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "CHI And A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "CHI And"
	Class           "G8III"
	AbsMagn         0.59
	MassKg          4.66576973762707e+30 // log(g) = 2.9 cm/s^2
	RadSol          9
	LumBol          47
	Teff            5070
	FeH             -0.21

	BinaryOrbit     
	{
		PeriodDays      20.8
		Eccentricity    0.368
		Epoch           2443216
		ArgOfPericenter 324
		MeanAnomaly     0
	}
}

Star "CHI And B"
{
	DateUpdated     "2024-06-25"
	ParentBody      "CHI And"
	Class           "G-K"
}

// Object * ups And  ---  High Proper Motion Star  ---  OID=@1597074   (@@134385,0)  ---  coobox=12119 
// Object types: High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Mid-IR Source (3 to 30 µm),Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "UPS And A"{ParentBody "UPS And"}
Remove "UPS And B"{ParentBody "UPS And"}
Remove "UPS And D"{ParentBody "UPS And"}
Remove "Saffar" {ParentBody "Titawin"}
Remove "Samh" {ParentBody "Titawin"}
Remove "Majriti" {ParentBody "Titawin"}
Remove "UPS And e" {ParentBody "Titawin"}
Star "UPS And A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "GJ 61"
	Class           "F9V"
	AbsMagn         3.44
	MassSol         1.27
	RadSol          1.57
	LumBol          3.1
	Teff            6614
	FeH             0.08
	RotationPeriod  175.2
	Age             3.12
	Obliquity       58

	BinaryOrbit     
	{
		Separation      750
	}
}

// Object * ups And B  ---  High Proper Motion Star  ---  OID=@1597063   (@@101693,12)  ---  coobox=12119 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source
Star "UPS And B/HD 9826B/50 And B/Gaia DR3 348020242217448576/TIC 189576909/2MASS J01365042+4123325/2MASSI J0136504+412332/WDS J01368+4124D/WISEA J013650.24+412328.0/UCAC4 657-006214/** LWR 1B/Gaia DR2 348020242217448576"
{
	DateUpdated     "2024-06-25"
	ParentBody      "GJ 61"
	Class           "M4.5V"
	MassSol         0.5
}

// Object * ups And b  ---  Extra-solar Planet  ---  OID=@1597064   (@@111937,1)  ---  coobox=12119
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "UPS And Ab/50 And Ab/HD 9826Ab/Saffar"
{
	ParentBody     "UPS And A"
	DiscMethod     "RadVel"
	DiscDate       "1996"
	Class          "GasGiant"
	MassJup        1.70
	Radius         128685.6
	Oblateness     0
	TidalLocked    true

	Orbit
	{
		Epoch           2450034.05
		PeriodDays      4.617111
		SemiMajorAxis   0.0594
		PericenterDist  0.0587
		Eccentricity    0.01186
		Inclination     24
		AscendingNode   0
		LongOfPericen   44.11
		MeanLongitude   44.11
	}
}

// Object * ups And c  ---  Extra-solar Planet  ---  OID=@1597052   (@@101693,1)  ---  coobox=12119
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "UPS And Ac/50 And Ac/HD 9826Ac/Samh"
{
	ParentBody     "UPS And A"
	DiscMethod     "RadVel"
	DiscDate       "1999"
	Class          "GasGiant"
	MassJup        13.98
	Oblateness     0

	Orbit
	{
		Epoch           2499922.53
		PeriodDays      241.26
		SemiMajorAxisKm 1.241E8
		Eccentricity    0.260
		Inclination     7.868
		AscendingNode   236.853
		LongOfPericen   484.513
		MeanLongitude   484.513
	}
}

// Object * ups And d  ---  Extra-solar Planet  ---  OID=@1597050   (@@86268,26)  ---  coobox=12119 
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet "UPS And Ad/50 And Ad/HD 9826Ad/Majriti"
{
	ParentBody     "UPS And A"
	DiscMethod     "RadVel"
	DiscDate       "1999"
	Class          "GasGiant"
	MassJup        10.25
	Radius         72921.84
	Oblateness     0

	Surface{Preset "jupiter_temperate_light.cfg"}

	Orbit
	{
		Epoch           2450059
		PeriodDays      1276.46
		SemiMajorAxisKm 3.8E8
		Eccentricity    0.299
		Inclination     23.758
		AscendingNode   4.073
		LongOfPericen   257.064
		MeanLongitude   257.064
	}
}

// Object * ups And e  ---  Extra-solar Planet  ---  OID=@3748605   (@@132967,28)  ---  coobox=12119
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"UPS And Ae/50 And Ae/HD 9826Ae"
{
	ParentBody     "UPS And A"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	Class          "GasGiant"
	MassJup        1.059
	Oblateness     0

	Orbit
	{
		Epoch           2449535.95
		PeriodDays      3848.86
		SemiMajorAxis   5.2456
		Eccentricity    0.0055
		AscendingNode   0
		LongOfPericen   7.3
		MeanLongitude   7.3
	}
}

// Object * tau And  ---  Variable Star  ---  OID=@1596905   (@@33394,13)  ---  coobox=12118 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "TAU And A" {ParentBody "TAU And"}
Remove "TAU And B" {ParentBody "TAU And"} // B为光学伴星

// Object * 56 And  ---  High Proper Motion Star  ---  OID=@1579237   (@@33103,16)  ---  coobox=12145 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source 
Star "56 And A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "56 And"
	Class           "K0III"
	AbsMagn         0.76
	MassSol         1.34
	RadSol          11
	LumBol          56.2
	Teff            4765
	FeH             -0.15
	Age             3.16

	BinaryOrbit     
	{
		Epoch           2451910
		Separation      1857.28052463346 // 18.50 asec
		PositionAngle   77
	}
}

// Object * 56 And B  ---  High Proper Motion Star  ---  OID=@1579238   (@@33103,17)  ---  coobox=12145 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "56 And B/** BU 1368B/Gaia DR3 342474335632994176/ADS 1534 P/CCDM J01560+3716P/CSI+36 355 2/IDS 01502+3646 P/UBV 1925/WDS J01562+3715C"
{
	DateUpdated     "2024-06-25"
	ParentBody      "56 And"
	Class           ""
	MassKg          1.40988638677764e+30 // log(g) = 4.538 cm/s^2
	RadSol          0.7505384 // Gaia DR3
	LumBol          0.223892188447833 // 计算的值
	Teff            4583
	FeH             -0.255
}

// Object * bet Tri  ---  Spectroscopic Binary  ---  OID=@1580047   (@@32399,9)  ---  coobox=12154 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Remove "BET Tri A" {ParentBody "BET Tri"}
Remove "BET Tri B" {ParentBody "BET Tri"}
Star "BET Tri A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "HIP 10064"
	Class           "A5III"
	AbsMagn         0.05
	MassSol         3.5
	Radius          3044362.79347888 // log(g) = 3.70 cm/s^2
	LumBol          74
	Teff            8186
	Age             0.73

	BinaryOrbit     
	{
		PeriodDays      31.3884
		Eccentricity    0.53
		Epoch           2432004.255
		ArgOfPericenter 138.4
		MeanAnomaly     0
	}
}

Star "BET Tri B"
{
	ParentBody      "HIP 10064"
	Class           "A6.2?"
}

// Object * del Tri  ---  Spectroscopic Binary  ---  OID=@1580494   (@@32409,2)  ---  coobox=12240 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "DEL Tri A" {ParentBody "DEL Tri"}
Remove "DEL Tri B" {ParentBody "DEL Tri"}
Star "DEL Tri A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "GJ 92"
	Class           "G0V"
	AbsMagn         4.69
	MassSol         1.0
	RadSol          0.98
	LumBol          1.290952793301733 // 计算的值
	Teff            6215
	FeH             -0.39 // -0.3
	Age             8.5 // 9

	BinaryOrbit     
	{
		PeriodDays      10.02
		Eccentricity    0.020
		Inclination     167
		AscendingNode   15
	}
}

Star "DEL Tri B"
{
	DateUpdated     "2024-06-25"
	ParentBody      "GJ 92"
	Class           "G9V" // K4V
	MassSol         0.8
	Teff            4493
}