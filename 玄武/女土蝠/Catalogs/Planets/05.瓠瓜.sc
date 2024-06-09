// Object * alf Del  ---  Double or Multiple Star  ---  OID=@2775644   (@@62101,1)  ---  coobox=20212 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "Sualocin A"{ParentBody "Sualocin"}
Remove "Sualocin B"{ParentBody "Sualocin"} // BCDEF均为光学伴星
Star "ALF Del Aa"
{
	DateUpdated     "2024-06-09"
	ParentBody      "ALF Del"
	Class           "B9IV"
	AbsMagn         -0.4
	MassSol         3.83
	RadSol          3.92
	LumBol          254.4048591740658 // 计算的值
	Teff            11643
	Age             0.227
}

Barycenter "ALF Del Ab"
{
	ParentBody      "ALF Del"
	BinaryOrbit     
	{
		PeriodDays      6175.3
		Separation      12.7
		Eccentricity    0.4615
		Inclination     161.01
		AscendingNode   120.62
		Epoch           2457988.7
		ArgOfPericenter 91.73
		MeanAnomaly     0
	}
}

Star "ALF Del Ab1"
{
	DateUpdated     "2024-06-09"
	ParentBody      "ALF Del Ab"
	Class           ""
	MassSol         1.82

	BinaryOrbit     
	{
		PeriodDays      29.9873
		Separation      0.281
		Eccentricity    0.0761
		Inclination     22.11
		AscendingNode   359.97
		Epoch           2458762.84
		ArgOfPericenter 346.43
		MeanAnomaly     0
	}
}

Star "ALF Del Ab2"
{
	DateUpdated     "2024-06-09"
	ParentBody      "ALF Del Ab"
	Class           ""
	MassSol         1.49
}

// Object * gam02 Del  ---  High Proper Motion Star  ---  OID=@2775724   (@@62419,0)  ---  coobox=20215 
// Object types: Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source 
Remove "GAM1 Del" {ParentBody "GAM Del"}
Remove "GAM2 Del" {ParentBody "GAM Del"}
Star "GAM2 Del/Gaia DR3 1763000413344449792/PLX 4958/TYC 1634-3056-1/ASCC 900783/12 Del A/ADS 14279 A/BD+15 4255A/BD+15 4255/CCDM J20467+1607A/CSI+15 4255 2/FK5 1541/GC 28966/GCRV 13026/GEN# +1.00197964A/HD 197964/HIC 102532/HIP 102532/HR 7948/IDS 20420+1546 A/IRAS 20443+1556/IRC +20482/JP11 3273/LTT 16076/N30 4594/NLTT 49870/PMC 90-93 1091/PPM 138996/ROT 3034/SAO 106476/SKY# 39381/UBV 17990/UBV M 25155/YZ 15 8383/uvby98 100197964 A/LSPM J2046+1607E/WDS J20467+1607A/WEB 18576/Gaia DR2 1763000413341086464/UCAC4 531-135610"
{
	DateUpdated     "2024-06-09"
	ParentBody      "ADS 14279 AB"
	Parallax        28.1359
	AppMagn         4.25
	Class           "K1IV"
	AbsMagn         1.81
	MassSol         1.99
	RadSol          8.43
	LumBol          33.1
	Teff            4798
	FeH             0.12
	Age             1.81

	BinaryOrbit     
	{
		Period          3249
		PericenterDist  40 // 40 - 600
		Eccentricity    0.88
		Inclination     148.78
		AscendingNode   88.06
		Epoch           2562944
		ArgOfPericenter 151.16
		MeanAnomaly     0
	}
}

// Object * gam01 Del  ---  High Proper Motion Star  ---  OID=@2775723   (@@62418,9)  ---  coobox=20215 
// Object types: Double or Multiple Star,High Proper Motion Star,Star 
Star "GAM1 Del/Gaia DR3 1763000482062205056/TYC 1634-3057-1/ASCC 900781/USNO-B1.0 1061-00567469/12 Del B/ADS 14279 B/BD+15 4255B/CCDM J20467+1607B/CSI+15 4255 1/GC 28965/GCRV 13025/GEN# +1.00197963/HD 197963/HIC 102531/HIP 102531/HR 7947/IDS 20420+1546 B/LTT 16077/NLTT 49868/ROT 3033/SAO 106475/SKY# 39380/UBV 17991/UBV M 25154/YZ 15 8382/LSPM J2046+1607W/WDS J20467+1607B/** STF 2727B/uvby98 100197963/WEB 18573/Gaia DR2 1763000482062205056/UCAC4 531-135608"
{
	DateUpdated     "2024-06-09"
	ParentBody      "ADS 14279 AB"
	Parallax        27.8884
	AppMagn         4.96
	Class           "F7V"
	AbsMagn         2.24
	MassSol         1.61
	RadSol          2.60
	LumBol          10.2
	Teff            6295
	FeH             0.06
	Age             1.85
}

Planet "GAM2 Del b"
{
	ParentBody     "GAM2 Del"
	DiscMethod     "RadVel"
	DiscDate       "1999"
	MassJup        0.7

	Orbit
	{
		Period          1.44
		SemiMajorAxis   1.5
	}
}

// Object * del Del  ---  delta Sct Variable  ---  OID=@2757464   (@@62425,0)  ---  coobox=20211 
// Object types: delta Sct Variable,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "DEL Del A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "DEL Del"
	Class           "kA7hF1VmF1pSrEuCr:"
	AbsMagn         0.25
	MassSol         1.78
	RadSol          3.43
	LumBol          32.4
	Teff            7440
	FeH             -0.5
	Age             0.945

	BinaryOrbit     
	{
		PeriodDays      40.60505
		Separation      0.393418896192734 // 5.4676 mas
		Eccentricity    0.64008
		Inclination     13.92
		AscendingNode   63.73
		Epoch           2456823.5019
		ArgOfPericenter 245.07
		MeanAnomaly     0
	}
}

Star "DEL Del B"
{
	DateUpdated     "2024-06-09"
	ParentBody      "DEL Del"
	Class           ""
	MassSol         1.62
	RadSol          3.48
	LumBol          28.8
	Teff            7110
}

// Object * bet Del  ---  Spectroscopic Binary  ---  OID=@2757402   (@@62107,0)  ---  coobox=20209 
// Object types: Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Rotanev A" {ParentBody "Rotanev"}
Remove "Rotanev B" {ParentBody "Rotanev"}
Star "BET Del A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "BET Del"
	Class           "F5III"
	AbsMagn         1.58
	MassSol         1.75
	Radius          2617010.45824161 // 计算的值
	LumBol          24
	Teff            6587
	FeH             -0.05
	Age             1.79

	BinaryOrbit     
	{
		Period          26.660
		Separation      13.6096072652907 // 0.440 asec
		Eccentricity    0.36
		Inclination     61
		AscendingNode   177
		Epoch           2447709.490310899447650
		ArgOfPericenter 169
		MeanAnomaly     0
	}
}

Star "BET Del B"
{
	DateUpdated     "2024-06-09"
	ParentBody      "BET Del"
	Class           "F5IV"
	AbsMagn         2.79
	MassSol         1.47
	LumBol          8
}

// Object * zet Del  ---  Star  ---  OID=@2757111   (@@62106,0)  ---  coobox=20187 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "ZET Del A" {ParentBody "ZET Del"}
Remove "ZET Del B" {ParentBody "ZET Del"}
Star "ZET Del A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "Gaia DR3 1804510069668710400"
	Class           "A3Va"
	AbsMagn         0.523 // Bolometric
	MassSol         2.5
	Radius          2326011.65804279 // 计算的值
	LumBol          48.63
	Teff            8336
	FeH             -0.05
	Age             0.525
}

// Object * zet Del B  ---  Brown Dwarf  ---  OID=@10114052   (@@-1,255)  ---  coobox=20187 
// Object types: Brown Dwarf,Double or Multiple Star,Star 

Star "ZET Del B/4 Del B/** DRS 32B/WDS J20353+1440B"
{
	DateUpdated     "2024-06-09"
	ParentBody      "ZET Del A"
	Class           "L5"
	AbsMagn         14.59 // Bolometric
	MassJup         55
	Radius          105682.332728809 // 计算的值
	LumBol          0.00012
	Teff            1550
	Age             0.525

	Orbit     
	{
		SemiMajorAxis   910
	}
}