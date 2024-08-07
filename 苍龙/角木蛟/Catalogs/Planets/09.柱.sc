// Object * ups02 Cen  ---  Spectroscopic Binary  ---  OID=@3421651   (@@63156,0)  ---  coobox=21774 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "UPS2 Cen A"
{
	DateUpdated     "2024-05-21"
	ParentBody      "UPS2 Cen"
	Class           "F7II/III"
	AbsMagn         -3.51
	MassSol         6.86
	Radius          34395726.3554677 // 计算的值
	LumBol          3919
	Teff            6495
	Age             0.0459

	BinaryOrbit     
	{
		PeriodDays      207.357
		Eccentricity    0.55
		Epoch           2423880.5
		ArgOfPericenter 268
		MeanAnomaly     0
	}
}

Star "UPS2 Cen B"
{
	ParentBody      "UPS2 Cen"
	Class           "B7.2?"
}

// Object * psi Cen  ---  High Proper Motion Star  ---  OID=@2265863   (@@47581,10)  ---  coobox=16360 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "PSI Cen A" {ParentBody "PSI Cen"}
Remove "PSI Cen B" {ParentBody "PSI Cen"}
Star "PSI Cen A"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HIP 70090"
	Class           "B9IV"
	AbsMagn         -0.35
	MassSol         3.114
	RadSol          3.634
	LumBol          141
	Teff            10450
	RotationPeriod  35.76
	Age             0.269

	BinaryOrbit     
	{
		PeriodDays      38.81252
		Eccentricity    0.55408
		Inclination     88.955
		ArgOfPericenter 200.095
		MeanAnomaly     0
	}
}

Star "PSI Cen B"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HIP 70090"
	Class           "A2"
	MassSol         1.909
	RadSol          1.811
	LumBol          18
	Teff            8800
}

// Object * h Cen  ---  Spectroscopic Binary  ---  OID=@2227856   (@@46528,0)  ---  coobox=16274 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=67786
Barycenter "4 Cen A"
{
	ParentBody      "4 Cen"
	BinaryOrbit     
	{
		PeriodDays      52240 // ~55000
		Separation      3064.80047068911 // 14.78 asec
	}
}

Star "4 Cen Aa"
{
	DateUpdated     "2024-05-21"
	ParentBody      "4 Cen A"
	Class           "B5IVp"
	AbsMagn         -1.66
	MassSol         7.68

	BinaryOrbit     
	{
		PeriodDays      6.930137
		Eccentricity    0.25
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2418823.406
		ArgOfPericenter 332
		MeanAnomaly     0
	}
}

Star "4 Cen Ab"
{
	DateUpdated     "2024-05-21"
	ParentBody      "4 Cen A"
	Class           ""
	MassSol         0.75
}

// Object * h Cen B  ---  Spectroscopic Binary  ---  OID=@2227855   (@@46508,23)  ---  coobox=16274 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Star 
Barycenter "h Cen B/Gaia DR3 6171681881946274304/TIC 111880738/SBC9 791/4 Cen B/CCDM J13532-3156B/CD-31 10727/CPD-31 3699/GC 18754/GCRV 64435/IDS 13475-3126 B/SAO 204943/2MASS J13531243-3155543/WDS J13532-3156B/GEN# +1.00120955B/HD 120955B/uvby98 100120955 B/** H 51B/Renson 34780/TYC 7283-2102-1/PMSC 13475-3126Bab/PMSC 13475-3126B/WEB 11916/Gaia DR2 6171681881946274304"
{
	ParentBody      "4 Cen"
}

Star "4 Cen Ba"
{
	DateUpdated     "2024-05-21"
	ParentBody      "4 Cen B"
	Parallax        4.1269
	AppMagn         8.42
	Class           "A3Vm"
	AbsMagn         1.5 // 计算的值
	MassSol         1.90

	BinaryOrbit     
	{
		PeriodDays      4.8390
		Eccentricity    0.05
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2442916.55
		ArgOfPericenter 51
		MeanAnomaly     0
	}
}

Star "4 Cen Bb"
{
	DateUpdated     "2024-05-21"
	ParentBody      "4 Cen B"
	Class           ""
	MassSol         0.22
}

// Object * 3 Cen A  ---  High Proper Motion Star  ---  OID=@5620366   (@@-1,255)  ---  coobox=16263 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=67669
Remove "3 Cen A" {ParentBody "3 Cen"}
Remove "3 Cen B" {ParentBody "3 Cen"}
Star "3 Cen A/Gaia DR3 6170485544575679104/TIC 111835484/CCDM J13518-3300A/CD-32 9676A/IDS 13461-3230 A/WDS J13518-3300A/TYC 7283-2100-1/Renson 34750/PMSC 13461-3230A/UCAC4 286-071684/2MASS J13514960-3259387/Gaia DR2 6170485544575679104"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HIP 67669"
	Parallax        9.9104
	AppMagn         4.52
	Class           "B5III"
	AbsMagn         -0.5 // 计算的值
	MassSol         5.0
	Radius          3243003.26256476 // log(g) = 3.80 cm/s^2
	LumBol          1836.1012973819054 // 计算的值
	Teff            17500
	Age             0.0474
}

// Object * 3 Cen B  ---  Spectroscopic Binary  ---  OID=@11606409   (@@-1,255)  ---  coobox=16263 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "3 Cen B/Gaia DR3 6170485544575678592/TIC 111835485/TYC 7283-2101-1/[B10] 3578/uvby98 100120710/ALS 19678/CCDM J13518-3300B/CD-32 9676B/CSI-32 9676 21/GC 18725/GCRV 8179/GEN# +1.00120710/HD 120710/HR 5211/IDS 13461-3230 B/ROT 2006/SAO 204917/UBV M 19771/2MASS J13515019-3259408/WDS J13518-3300B/PMSC 13461-3230B/PMSC 13461-3230Bab/WEB 11902/SBC9 786/Gaia DR2 6170485544575678592"
{
	ParentBody      "HIP 67669"
	BinaryOrbit     
	{
		Period          8523
		Separation      791.088121251085 // 7.84 asec
	}
}

Star "3 Cen Ba"
{
	DateUpdated     "2024-05-21"
	ParentBody      "3 Cen B"
	Parallax        9.49
	Class           "B9IV"
	MassSol         2.47
	RadSol          2.8
	LumBol          50.2
	Teff            9638

	BinaryOrbit     
	{
		PeriodDays      17.4280
		Eccentricity    0.210
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2443296.441
		ArgOfPericenter 195.0
		MeanAnomaly     0
	}
}

Star "3 Cen Bb"
{
	DateUpdated     "2024-05-21"
	ParentBody      "3 Cen B"
	Class           ""
	MassSol         0.38
}

// Object * i Cen  ---  Spectroscopic Binary  ---  OID=@2208548   (@@46529,1)  ---  coobox=16262 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "1 Cen A" {ParentBody "1 Cen"}
Remove "1 Cen B" {ParentBody "1 Cen"}
Star "1 Cen A"
{
	DateUpdated     "2024-05-21"
	ParentBody      "GJ 9459"
	Class           "F2V"
	AbsMagn         2.81
	MassSol         1.35
	Radius          1178871.3037575 // 计算的值
	LumBol          5.857
	Teff            6898
	FeH             -0.09
	RotationPeriod  58.08
	Age             1.193

	BinaryOrbit     
	{
		PeriodDays      9.94480
		Eccentricity    0.247
		Epoch           2422737.382
		ArgOfPericenter 317.7
		MeanAnomaly     0
	}
}

Star "1 Cen B"
{
	ParentBody      "GJ 9459"
	Class           "F9.5?"
}