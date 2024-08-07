// Object * omi UMa  ---  High Proper Motion Star  ---  OID=@437634   (@@2474,9)  ---  coobox=3667 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "OMI UMa A" {ParentBody "Muscida"}
Remove "OMI UMa B" {ParentBody "Muscida"}
Star "OMI UMa A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "OMI UMa"
	Class           "G5III:"
	AbsMagn         -0.40
	MassSol         3.09
	RadSol          14
	LumBol          138
	Teff            5242
	FeH             -0.09
	Age             0.360

	BinaryOrbit     
	{
		Separation      395.907123006779 // 7.1 asec
	}
}

Star "OMI UMa B"
{
	ParentBody      "OMI UMa"
	Class           "M1?" // 存疑，需要引用
}

// Object * omi UMa b  ---  Extra-solar Planet  ---  OID=@7880254   (@@-1,255)  ---  coobox=3667 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Remove "OMI UMa A b" {ParentBody "OMI UMa A"}
Planet	"OMI UMa Ab"
{
	ParentBody     "OMI UMa A"
	DiscMethod     "RadVel"
	DiscDate       "2012"
	MassJup        4.1

	Orbit
	{
		Epoch           2453400
		PeriodDays      1630
		SemiMajorAxis   3.9
		Eccentricity    0.13
		ArgOfPericen    58
	}
}

// Object * c UMa  ---  Spectroscopic Binary  ---  OID=@450705   (@@2830,3)  ---  coobox=3325 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "16 UMa A" {ParentBody "16 UMa"}
Remove "16 UMa B" {ParentBody "16 UMa"}
Star "HR 3648 A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "HR 3648"
	Class           "G0V"
	AbsMagn         3.75
	MassSol         1.213
	RadSol          2.6
	LumBol          7.235835678357305 // 计算的值
	Teff            5871
	FeH             -0.13
	Age             5.41

	BinaryOrbit     
	{
		PeriodDays      16.239631
		Separation      0.0695472923362022 // 2.9 mas
		Eccentricity    0.10635
		Inclination     106.0
		AscendingNode   107.0
		Epoch           2454358.214
		ArgOfPericenter 317.18
		MeanAnomaly     0
	}
}

Star "HR 3648 B"
{
	DateUpdated     "2024-04-30"
	ParentBody      "HR 3648"
	Class           ""
	AbsMagn         8.2
	MassSol         0.59
	RadSol          0.50
	LumBol          0.08
	Teff            4341.24278975493 // 计算的值
}

// Object * 6 UMa  ---  Spectroscopic Binary  ---  OID=@436913   (@@3181,14)  ---  coobox=3315 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "6 UMa A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "6 UMa"
	Class           "G7IIIb"
	AbsMagn         0.706 // 计算的值
	MassKg          1.64101568637069e+30 // log(g) = 2.329 cm/s^2
	RadSol          10.3 // Gaia DR3
	LumBol          57.8955302435627 // 计算的值
	Teff            4961
	FeH             -0.77

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.6063996
		Eccentricity    0.361552369
		Inclination     -2.06934786
		AscendingNode   0
		ArgOfPericenter -159.015948
		MeanAnomaly     -139.236193
	}
}

Star "6 UMa B"
{
	ParentBody      "6 UMa"
	Class           "F1.2?"
}

// Object * h UMa  ---  High Proper Motion Star  ---  OID=@450292   (@@3189,0)  ---  coobox=3317 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "23 UMa A" {ParentBody "23 UMa"}
Remove "23 UMa B" {ParentBody "23 UMa"}
Star "23 UMa A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "GJ 3559"
	Class           "F0V"
	AbsMagn         1.79 // 计算的值
	MassSol         1.862
	RadSol          2.90
	LumBol          14.8
	Teff            6651
	FeH             0.17
	Age             1.3

	BinaryOrbit     
	{
		Separation      540.265713218237 // 22.74 asec
	}
}

// Object AG+63 543  ---  High Proper Motion Star  ---  OID=@450291   (@@3188,14)  ---  coobox=3317 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "AG+63 543/Gaia DR3 1064092479891020800/TIC 86336881/ADS 7402 B/CCDM J09315+6303B/CSI+63 845 1/GEN# +1.00081937B/IDS 09236+6330 B/PPM 17083/UBV 9041/2MASS J09312835+6303420/WDS J09315+6304B/** STF 1351B/UCAC4 766-042561/Gaia DR2 1064092479891020800"
{
	ParentBody      "GJ 3559"
	Class           "G1.9?"
}

