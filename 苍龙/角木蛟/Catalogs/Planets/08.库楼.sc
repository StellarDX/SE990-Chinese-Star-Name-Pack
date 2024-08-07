// Object * zet Cen  ---  Spectroscopic Binary  ---  OID=@3406410   (@@63171,0)  ---  coobox=21793 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "ZET Cen A" {ParentBody "ZET Cen"}
Remove "ZET Cen B" {ParentBody "ZET Cen"}
Star "ZET Cen A"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HIP 68002"
	Class           "B2.5IV"
	AbsMagn         -2.79
	MassSol         7.8
	RadSol          5.80
	LumBol          9339.51969991331 // 计算的值
	Teff            23561
	RotationPeriod  36 // Vsini = 235 km/s
	Age             0.0398

	BinaryOrbit     
	{
		PeriodDays      8.024
		Separation      0.14 // 0.08, 0.0014 asec
		Eccentricity    0.5
		Epoch           2413719.321
		ArgOfPericenter 110
		MeanAnomaly     0
	}
}

Star "ZET Cen B"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HIP 68002"
	Class           ""
	MassSol         3.9 // 可能的值
}

// Object * d Cen  ---  Double or Multiple Star  ---  OID=@2180088   (@@45260,11)  ---  coobox=16290 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 117440 A"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HD 117440"
	Class           "G7III"
	AbsMagn         -3.4
	MassSol         7.5
	Radius          37067476.0064321 // log(g) = 1.86 cm/s^2
	LumBol          1230.0770985238917 // c
	Teff            4683
	FeH             -0.36
	Age             0.0403

	BinaryOrbit     
	{
		Period          83.14
		Separation      44.7184222466435 // 0.161 asec
		Eccentricity    0.521
		Inclination     145.2
		AscendingNode   146.5
		Epoch           2435517.705715589690953
		ArgOfPericenter 64.4
		MeanAnomaly     0
	}
}

Star "HD 117440 B"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HD 117440"
	Class           "G9III"
	AbsMagn         -3.2
}

// Object * f Cen  ---  Pulsating Variable  ---  OID=@3357640   (@@63223,9)  ---  coobox=21582 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Barycenter "HD 113703 AC"
{
	ParentBody      "HD 113703"
}

Barycenter "HD 113703 A"
{
	ParentBody      "HD 113703 AC"
	BinaryOrbit // NACO: AC at 1.55", 267deg, dK=3.2mag, claimed physical (also Shatsky).
	{
		Period          955.335
		Separation      189.969597045708
		PositionAngle   267
	}
}

Star "HD 113703 Aa"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HD 113703 A"
	Class           "B4V"
	AbsMagn         -0.68
	MassSol         4.39
	Radius          2441713.15794332 // log(g) = 3.99 cm/s^2
	LumBol          528.0114259702841 // 计算的值
	Teff            14769
	Age             0.092

	BinaryOrbit     
	{
		Period          2.253
		Separation      3.19615022177926 // 0.026 asec
	}
}

Star "HD 113703 Ab"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HD 113703 A"
	Class           ""
	MassSol         2.37
}

Star "HD 113703 C"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HD 113703 AC"
	Class           ""
	MassSol         0.9
	Radius          643821.936394544 // 计算的值
	LumBol          0.49
	Teff            5020
	Age             0.050
}

// Object V* V1155 Cen  ---  BY Dra Variable  ---  OID=@3357641   (@@63223,10)  ---  coobox=21582 
// Object types: BY Dra Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,X-ray Source,Young Stellar Object Candidate 
Star "V* V1155 Cen/Gaia DR3 6085229408665620864/TIC 244866912/CCDM J13063-4828B/CD-47 8088B/CPD-47 5844B/CSI-47 8088 22/GCRV 4608 E/GEN# +1.00113703B/HD 113703B/IDS 13005-4756 B/[SHH2003] HD 113703 X-ray/2MASS J13061785-4827456/WDS J13063-4828B/NSV 19593/** HJ 4567B/1RXS J130618.4-482744/WEB 11301/Gaia DR2 6085229408665620864"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HD 113703"
	Parallax        7.965
	AppMagn         10.8
	Class           "K0Ve"
	AbsMagn         5.3 // 计算的值
	MassSol         0.95
	Age             0 // 零龄主序

	Orbit     
	{
		Epoch           2457024
		Period          18362
		SemiMajorAxis   1450.09418069703 // 7.965 asec
		ArgOfPericenter 78
		MeanAnomaly     0
	}
}

// Object UCAC4 208-071960  ---  Young Stellar Object Candidate  ---  OID=@15012072   (@@-1,255)  ---  coobox=21582 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Young Stellar Object Candidate 
Star "UCAC4 208-071960/WISE J130618.67-482715.8/2MASS J13061869-4827156/Gaia DR3 6085229412962755200/Gaia DR2 6085229412962755200"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HD 113703"
	Parallax        7.9267
	Class           ""
	MassSol         0.43

	Orbit     
	{
		Period          105776
		SemiMajorAxis   4766.1700209846 // 37.78 asec
		ArgOfPericenter 31.5
		MeanAnomaly     0
	}
}

// Object * gam Cen  ---  Double or Multiple Star  ---  OID=@3323865   (@@63244,0)  ---  coobox=21534 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Remove "Muhlifain A" {ParentBody "Muhlifain"}
Remove "Muhlifain B" {ParentBody "Muhlifain"}
Star "GAM Cen A"
{
	DateUpdated     "2024-05-21"
	ParentBody      "GAM Cen"
	Class           "A1IV"
	AbsMagn         -0.81
	MassSol         2.91
	Radius          3415142.8788322 // log(g) = 3.52 cm/s^2
	LumBol          147.70439484341887 // 计算的值
	Teff            9082
	FeH             -0.29

	BinaryOrbit     
	{
		Period          83.57
		Separation      93
		Eccentricity    0.793
		Inclination     113.7
		AscendingNode   2.6
		Epoch           2426434.132231906056404
		ArgOfPericenter 7.9
		MeanAnomaly     0
	}
}

Star "GAM Cen B"
{
	DateUpdated     "2024-05-21"
	ParentBody      "GAM Cen"
	Class           "A0IV"
}
