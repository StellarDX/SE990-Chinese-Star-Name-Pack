// Object * iot Vir  ---  High Proper Motion Star  ---  OID=@2261229   (@@47130,0)  ---  coobox=15714 
// Object types: Rotating Variable,High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "IOT Vir A"
{
	DateUpdated     "2024-05-23"
	ParentBody      "IOT Vir"
	Class           "F7III"
	AbsMagn         2.4
	MassSol         1.5
	RadSol          2.5
	LumBol          8.7
	Teff            6282
	FeH             -0.11

	BinaryOrbit     
	{
		Period          55
		Separation      18.281415624317 // 0.830 asec
		Eccentricity    0.1
		Inclination     60
		AscendingNode   3
		Epoch           2433538.092998196836561
		ArgOfPericenter 156
		MeanAnomaly     0
	}
}

Star "IOT Vir B"
{
	DateUpdated     "2024-05-23"
	ParentBody      "IOT Vir"
	Class           ""
	MassSol         0.6
}

// Object * phi Vir  ---  High Proper Motion Star  ---  OID=@2275734   (@@47437,12)  ---  coobox=15686 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "PHI Vir A"
{
	DateUpdated     "2024-05-23"
	ParentBody      "PHI Vir"
	Class           "G2IV"
	AbsMagn         1.68
	MassSol         1.80
	RadSol          4
	LumBol          12.6
	Teff            5534
	FeH             -0.06
	Age             1.5

	BinaryOrbit     
	{
		Separation      193.458166854656 // 5.20 asec
	}
}

// Object * phi Vir B  ---  High Proper Motion Star  ---  OID=@2275735   (@@47444,0)  ---  coobox=15686 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "PHI Vir B/GJ 550.2 B/Gaia DR3 3649422995468596224/WDS J14282-0214B/** STF 1846B/ADS 9273 B/BD-01 2957B/CCDM J14282-0214B/CSI-01 2957 2/GCRV 8443/IDS 14230-0147 B/105 Vir B/HD 126868B/TYC 4977-1460-1/UCAC4 439-057449/WEB 12258/Gaia DR2 3649422995468596224"
{
	DateUpdated     "2024-05-23"
	ParentBody      "PHI Vir"
	Parallax        26.9843
	Class           "K0V"
}

// Object * lam Vir  ---  Spectroscopic Binary  ---  OID=@2262676   (@@47494,16)  ---  coobox=15818 
// Object types: Double or Multiple Star,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "LAM Vir A" {ParentBody "LAM Vir"}
Remove "LAM Vir B" {ParentBody "LAM Vir"}
Star "LAM Vir A"
{
	DateUpdated     "2024-05-23"
	ParentBody      "HIP 69974"
	Class           "A1V"
	AbsMagn         0.73
	MassSol         1.897
	RadSol          2.35
	LumBol          20.84
	Teff            8280
	FeH             0.0097
	Age             0.935

	BinaryOrbit     
	{
		PeriodDays      206.7321
		Separation      1.05931279711941 // 19.759 mas
		Eccentricity    0.0610
		Inclination     109.86
		AscendingNode   196.40
		Epoch           2453070.30
		ArgOfPericenter 92.28
		MeanAnomaly     0
	}
}

Star "LAM Vir B"
{
	DateUpdated     "2024-05-23"
	ParentBody      "HIP 69974"
	Class           "A1V"
	MassSol         1.721
	RadSol          1.84
	LumBol          12.58
	Teff            8280
}