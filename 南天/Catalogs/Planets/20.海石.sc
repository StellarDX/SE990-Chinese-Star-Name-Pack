// Object * eps Car A  ---  Star  ---  OID=@9700385   (@@-1,255)  ---  coobox=21081 
// Object types: Double or Multiple Star,Star 
Star "EPS Car A/HD 71129/** HDS 1190A/WDS J08225-5931A/CCDM J08225-5931A/TYC 8579-2692-1/WEB 7952"
{
	DateUpdated     "2024-08-01"
	ParentBody      "EPS Car"
	Class           "K3III"
	AbsMagn         -4.3
	MassSol         10.5
	RadSol          151
	LumBol          8128
	Teff            4460
	Age             0.0312
}

// Object * eps Car B  ---  Star  ---  OID=@9700386   (@@-1,255)  ---  coobox=21081 
// Object types: Double or Multiple Star,Star 
Barycenter "EPS Car B/HD 71130/** HDS 1190B/WDS J08225-5931B/CCDM J08225-5931B/TYC 8579-2692-2"
{
	ParentBody      "EPS Car"
	BinaryOrbit     
	{
		PeriodDays      785
		Separation      4
	}
}

Star "EPS Car Ba"
{
	DateUpdated     "2024-08-01"
	ParentBody      "EPS Car B"
	Class           "B2Vp"
	AbsMagn         -1.8
	MassSol         7.30
	Teff            20417
	Age             0.020

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.408246505
		Eccentricity    0
		Inclination     1.32883263
		AscendingNode   0
		ArgOfPericenter 284.55835
		MeanAnomaly     -160.09777
	}
}

Star "EPS Car Bb"
{
	DateUpdated     "2024-08-01"
	ParentBody      "EPS Car B"
	Class           "F8II"
	AbsMagn         -1.7
	Teff            5888.4365535558896726709894107446 // log(T) = 3.77
}

// Object * ups Car  ---  Star  ---  OID=@3175334   (@@67172,19)  ---  coobox=21265 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source 
Remove "UPS Car A" {ParentBody "UPS Car"}
Remove "UPS Car B" {ParentBody "UPS Car"}
Star "UPS Car A"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HIP 48002"
	Class           "A8Ib"
	AbsMagn         -5.26
	MassSol         13
	Teff            7600
	Age             0.012

	BinaryOrbit     
	{
		Separation      2000
	}
}

// Object * ups Car B  ---  Star  ---  OID=@11607760   (@@-1,255)  ---  coobox=21265 
// Object types: Double or Multiple Star,Star 
Star "UPS Car B/Gaia DR3 5249119024124571136/TYC 8950-2272-2/CCDM J09471-6504B/CPC 21 1958/CPD-64 1084B/CSI-64 1084 42/GC 13507/GCRV 60924/HD 85124/HR 3891/IDS 09446-6436 B/SAO 250696/ALS 19672/WDS J09471-6504B/** RMK 11B/PLX 2328.00B/UCAC4 125-024041/Gaia DR2 5249119024124571136"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HIP 48002"
	Parallax        2.2718
	AppMagn         5.99
	Class           "B7III"
	AbsMagn         -2.23 // 计算的值
	MassSol         8
	Teff            23000
}