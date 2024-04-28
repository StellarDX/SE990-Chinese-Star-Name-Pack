// Object HD 91190  ---  Star  ---  OID=@391875   (@@4934,0)  ---  coobox=3147 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "HD 91190 A"
{
	DateUpdated     "2024-04-28"
	ParentBody      "HIP 51808"
	Class           "G8III-IIIb"
	AbsMagn         0.46
	MassSol         2.39
	Radius          7810182.89209071 // 计算的值
	LumBol          69
	Teff            4965
	FeH             -0.03
	Age             2.06

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   27.7524701
		Eccentricity    0.395978035
		Inclination     1.34328532
		AscendingNode   0
		ArgOfPericenter 133.380849
		MeanAnomaly     -24.4491081
	}
}

Star "HD 91190 B"
{
	ParentBody      "HIP 51808"
	Class           "G8?"
}

// Object HD 91114  ---  Star  ---  OID=@409722   (@@4608,14)  ---  coobox=3172 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "阴德二/HIP 51734 A"
{
	DateUpdated     "2024-04-28"
	ParentBody      "HIP 51734"
	Class           "A3"
	AbsMagn         1.51 // 计算的值

	BinaryOrbit
	{
		Separation      143.351580103105 // 23.37 asec
		PositionAngle   70
	}
}

// Object HIP 51727  ---  Star  ---  OID=@409723   (@@4608,15)  ---  coobox=3172 
// Object types: Double or Multiple Star,Star 
Star "HIP 51727 B/Gaia DR3 1078374311302595072/ADS 7824 B/CCDM J10342+7350B/CSI+74 438 2/GSC 04390-00856/HIC 51727/TYC 4390-856-1/WDS J10342+7350B/Gaia DR1 1078374307005998592/Gaia DR2 1078374311302131328"
{
	DateUpdated     "2024-04-28"
	ParentBody      "HIP 51734"
	Parallax        5.9466
	AppMagn         10.36
	Class           ""
	AbsMagn         4.23 // 计算的值
	MassKg          1.95093596071617e+30 // log(g) = 4.365 cm/s^2
	RadSol          1.077463 // Gaia DR3
	LumBol          1.3555121375538752 // 计算的值
	Teff            6000
	FeH             -0.116
}