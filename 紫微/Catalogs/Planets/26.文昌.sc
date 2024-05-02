// Object * ups UMa  ---  delta Sct Variable  ---  OID=@488939   (@@3207,0)  ---  coobox=3493 
// Object types: delta Sct Variable,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "UPS UMa A" {ParentBody "UPS UMa"}
Remove "UPS UMa B" {ParentBody "UPS UMa"}
Star "UPS UMa A"
{
	DateUpdated     "2024-05-02"
	ParentBody      "HIP 48319"
	Class           "F0"
	AbsMagn         1.11
	MassSol         1.57
	RadSol          2.79
	LumBol          29.5
	Teff            7211
	RotationPeriod  28.8
	Age             1.168

	BinaryOrbit     
	{
		Epoch           2454467
		Separation      419.8
		PositionAngle   295.4
	}
}

// Object * ups UMa B  ---  High Proper Motion Star  ---  OID=@11668926   (@@-1,255)  ---  coobox=3493 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UPS UMa B/Gaia DR3 1049765602862192768/TIC 331900369/2MASS J09505798+5902244/** STT 521B/WDS J09510+5902B/CCDM J09510+5902B/Gaia DR2 1049765602862192768"
{
	DateUpdated     "2024-05-02"
	ParentBody      "HIP 48319"
	Parallax        28.6474
	Class           "M0"
	MassKg          1.10485046189888e+30 // log(g) = 4.678 cm/s^2
	RadSol          0.5655 // Gaia DR3
	LumBol          0.0572184343192469 // 计算的值
	Teff            3754
	FeH             0.012
}

// Object * phi UMa  ---  Double or Multiple Star  ---  OID=@537435   (@@2859,2)  ---  coobox=3516 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "PHI UMa A" {ParentBody "PHI UMa"}
Remove "PHI UMa B" {ParentBody "PHI UMa"}
Star "PHI UMa A"
{
	DateUpdated     "2024-05-02"
	ParentBody      "HIP 48402"
	Class           "A3IV"
	AbsMagn         -1.39
	MassSol         3.5
	Radius          5614870.72253064 // 计算的值
	LumBol          347
	Teff            8769
	FeH             -0.23

	BinaryOrbit     
	{
		Period          104.6
		Separation      51.3257132687242 // 0.329 asec
		Eccentricity    0.436
		Inclination     19.4
		AscendingNode   132.5
		Epoch           2446986.310757312923670
		ArgOfPericenter 213.3
		MeanAnomaly     0
	}
}

Star "PHI UMa B"
{
	ParentBody      "HIP 48402"
	Class           "A3IV"
}

// Object * tet UMa  ---  High Proper Motion Star  ---  OID=@538597   (@@2170,4)  ---  coobox=3868 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Variable Star,Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "Al Haud A" {ParentBody "Al Haud"}
Remove "Al Haud Aa" {ParentBody "Al Haud A"}
Remove "Al Haud Ab" {ParentBody "Al Haud A"}
Remove "Al Haud B" {ParentBody "Al Haud A"}
Barycenter "TET UMa A"
{
	ParentBody      "TET UMa"
	BinaryOrbit     
	{
		Separation      55.5341770443375 // 4.1 asec
	}
}

Star "TET UMa Aa"
{
	DateUpdated     "2024-05-02"
	ParentBody      "TET UMa A"
	Class           "F7V"
	AbsMagn         2.43
	MassSol         1.41
	RadSol          2.365
	LumBol          7.871
	Teff            6300
	FeH             -0.18
	Age             2.2

	BinaryOrbit     
	{
		PeriodDays      371
	}
}

Star "TET UMa Ab"
{
	ParentBody      "TET UMa A"
	Class           "F9.9?"
}

Star "TET UMa B"
{
	ParentBody      "TET UMa"
	Class           "F9.1?"
}
