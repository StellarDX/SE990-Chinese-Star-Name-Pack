// Object HD 93549  ---  Spectroscopic Binary  ---  OID=@3206362   (@@66600,6)  ---  coobox=20969 
// Object types: Spectroscopic Binary,Pulsating Variable,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Star,UV-emission Source,X-ray Source 
Barycenter "HR 4220 AB"
{
	ParentBody      "HR 4220"
	BinaryOrbit     
	{
		Period          410.731
		Separation      111.811283763515 // 0.748 asec
	}
}

Barycenter "HR 4220 A"
{
	ParentBody      "HR 4220 AB"
	BinaryOrbit // VB6_Tok2022f FIN_364AB Gr.1
	{
		Period          13.2077
		Separation      12.403618718512 // 0.083 asec
		Eccentricity    0.011
		Inclination     116.4
		AscendingNode   135.9
		Epoch           2461093.425443030428141
		ArgOfPericenter 348.9
		MeanAnomaly     0
	}
}

Star "HR 4220 A1"
{
	DateUpdated     "2024-08-07"
	ParentBody      "HR 4220 A"
	Class           "B6-7V"
	AbsMagn         -0.64 // 计算的值
	MassSol         3.23

	BinaryOrbit // SB9_1783 1988Ap&SS.148..163G
	{
		PeriodDays      5.4999
		Eccentricity    0.380
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2446165.262
		ArgOfPericenter 308.0
		MeanAnomaly     0
	}
}

Star "HR 4220 A2"
{
	DateUpdated     "2024-08-07"
	ParentBody      "HR 4220 A"
	Class           ""
	MassSol         0.56
}

Star "HR 4220 B"
{
	DateUpdated     "2024-08-07"
	ParentBody      "HR 4220 AB"
	Class           ""
	MassSol         3.16
}

Star "HR 4220 C"
{
	DateUpdated     "2024-08-07"
	ParentBody      "HR 4220"
	Class           ""
	MassSol         1.33
}

// Object HD 93738  ---  Double or Multiple Star  ---  OID=@3206364   (@@66601,0)  ---  coobox=20969 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,UV-emission Source,X-ray Source 
Star "HD 93738 A"
{
	DateUpdated     "2024-08-07"
	ParentBody      "HD 93738"
	Class           "B9.5V"
	AbsMagn         0.831 // 计算的值
	MassKg          3.61761723849463e+30 // log(g) = 4.043 cm/s^2
	RadSol          2.125652 // Gaia DR3
	LumBol          60.4062923104144 // 计算的值
	Teff            11037
	FeH             -1.479

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   105.729254
		Eccentricity    0.146173611
		Inclination     0.211394072
		AscendingNode   0
		ArgOfPericenter -83.8304909
		MeanAnomaly     139.540464
	}
}

Star "HD 93738 B"
{
	ParentBody      "HD 93738"
	Class           "A9.3?"
}

// Object CPD-63 1435  ---  Star  ---  OID=@3206829   (@@82199,30)  ---  coobox=20970 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Remove "TOI-837 b" {ParentBody "TOI-837"}
Star "CPD-63 1435/PATHOS-30/Gaia DR3 5251470948229949568/WDS J10281-6430A/** TOI 837A/GSC 08964-00017/TYC 8964-17-1/2MASS J10280898-6430189/Gaia DR1 5251470943909316096/Gaia DR2 5251470948229949568/TIC 460205581/TOI-837"
{
	DateUpdated     "2024-08-07"
	ParentBody      "** TOI 837"
	Class           ""
	AbsMagn         4.87 // 计算的值
	MassKg          1.97581531003632e+30 // log(g) = 4.395 cm/s^2
	RadSol          1.0475 // Gaia DR3
	LumBol          1.0942152126563 // 计算的值
	Teff            5768
	FeH             -0.173

	BinaryOrbit     
	{
		Separation      329.491555103691 // 2.31 asec
	}
}

// Object CPD-63 1435B  ---  Star  ---  OID=@14745245   (@@-1,255)  ---  coobox=20970 
// Object types: Double or Multiple Star,Star 
Star "CPD-63 1435B/Gaia DR3 5251470948231619200/WDS J10281-6430B/** TOI 837B/Gaia DR2 5251470948222139904/TIC 847769574"
{
	ParentBody      "** TOI 837"
	Class           "K8.9?"
}

Planet	"CPD-63 1435b/TOI-837.01/PATHOS-30b/TOI-837 b"
{
	ParentBody     "CPD-63 1435"
	DiscMethod     "Transit"
	DiscDate       "2020"
	MassJup        0.395
	MsiniJup       1.2
	Radius         58408.964

	Orbit
	{
		Epoch           2459356.81402 // Primary Transit
		PeriodDays      8.3249114
		SemiMajorAxis   0.0883
		Inclination     87.1
	}
}