// Object * iot Dra  ---  Variable Star  ---  OID=@444249   (@@8880,7)  ---  coobox=1276 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "IOT Dra A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "IOT Dra"
	Class           "K2III"
    AbsMagn         0.99
	MassSol         1.56
	RadSol          11.99
	LumBol          52.8
	Teff            4504
	FeH             +0.03
    RotationPeriod  10416
	Age             2.49
}

// Object * iot Dra b  ---  Extra-solar Planet  ---  OID=@444647   (@@130392,2)  ---  coobox=1276 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Remove "Edasich b"{ParentBody "Edasich"}
Planet "IOT Dra b/HIP 75458 b/HD 137759 b/Hypatia/Edasich b"
{
	ParentBody     "IOT Dra A"
	DiscMethod     "RadVel"
	DiscDate       "2002"
    MassKg         3.112925e+28

    Surface {Preset "jupiter_cold_default.cfg"}

	Orbit
	{
		Epoch           2455590.17
		PeriodDays      510.854
		SemiMajorAxis   1.453
		Eccentricity    0.7010
		Inclination     46
        AscendingNode   87
		ArgOfPericen    89.90
        MeanAnomaly     0
	}
}

// Object * iot Dra c  ---  Extra-solar Planet Candidate  ---  OID=@17857009   (@@-1,255)  ---  coobox=1276 
// Object types: Star,Extra-solar Planet Candidate 
Remove "IOT Dra c" {ParentBody "IOT Dra"}
Planet "IOT Dra c"
{
	ParentBody     "IOT Dra A"
	DiscMethod     "RadVel"
	DiscDate       "2022"
    MassKg         3.2268125e+28

	Orbit
	{
		Epoch           2476000
		Period          68
		SemiMajorAxis   19.4
		Eccentricity    0.455
		Inclination     86
		ArgOfPericen    62
	}
}

// Object * tet Dra  ---  Spectroscopic Binary  ---  OID=@401098   (@@131469,0)  ---  coobox=1253 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "TET Dra A" {ParentBody "TET Dra"}
Remove "TET Dra B" {ParentBody "TET Dra"}
Star "TET Dra A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "GJ 9538"
	Class           "F9V"
	AbsMagn         2.39
	MassSol         1.53
	RadSol          2.83
	LumBol          9.998
	Teff            6105
	FeH             +0.19
	Age             2.03

	BinaryOrbit
	{
		PeriodDays      3.0708216
		Separation      0.048 // 10 RSun
		Eccentricity    0.039
		Epoch           2455971.98
		ArgOfPericenter 243
		MeanAnomaly     0
	}
}

Star "TET Dra B"
{
	DateUpdated     "2024-04-27"
	ParentBody      "GJ 9538"
	Class           ""
	MassSol         0.46
}

// Object * eta Dra  ---  High Proper Motion Star  ---  OID=@387849   (@@9276,4)  ---  coobox=1250 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "ETA Dra A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "ETA Dra"
	Class           "G8IIIab"
	AbsMagn         +0.58
	MassSol         2.55
	RadSol          11
	LumBol          60
	Teff            5055
	FeH             -0.04
	Age             0.550

	BinaryOrbit
	{
		Separation      140 // 5.1 asec
	}
}

Star "ETA Dra B"
{
	DateUpdated     "2024-04-27"
	ParentBody      "ETA Dra"
	Class           "K2V"
}

// Object * zet Dra  ---  Double or Multiple Star  ---  OID=@362863   (@@8824,0)  ---  coobox=1210 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "ZET Dra A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "ZET Dra"
	Class           "B6III"
	AbsMagn         -1.88
	MassSol         3.5
	RadSol          2.3
	LumBol          148
	Teff            13397
	FeH             -0.95

	BinaryOrbit // 未知，程序生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   135.645195
		Eccentricity    0.743862164
		Inclination     1.67536557
		AscendingNode   0
		ArgOfPericenter 314.111709
		MeanAnomaly     -1.3376494
	}
}

Star "ZET Dra B"
{
	DateUpdated     "2024-04-27"
	ParentBody      "ZET Dra"
	Class           "B1.7?"
}

// Object * ups Dra  ---  Spectroscopic Binary  ---  OID=@300118   (@@7861,0)  ---  coobox=858 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "UPS Dra A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "UPS Dra"
	Class           "K0IIICN0.5"
	AbsMagn         -0.70 // Bolometric
	MassSol         2.05
	RadSol          19
	LumBol          170
	Teff            4561
	FeH             +0.01
	Age             1.37

	BinaryOrbit
	{
		PeriodDays      258.48
		Eccentricity    0.21
		Epoch           2441977.5
		ArgOfPericenter 118
		MeanAnomaly     0
	}
}

Star "UPS Dra B"
{
	DateUpdated     "2024-04-27"
	ParentBody      "UPS Dra"
	Class           "WD"
}

// Object * pi. Cep  ---  Spectroscopic Binary  ---  OID=@252419   (@@5828,5)  ---  coobox=947 
// Object types: Double or Multiple Star,Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter	"PI Cep A"
{
	ParentBody     "PI Cep"
	BinaryOrbit
	{
		Period          162.8
		Separation      61.2704935434021 // 0.810"
		Eccentricity    0.5968
		Inclination     30.0
		AscendingNode   90.3
		Epoch           2427647.832058455329388
		ArgOfPericenter 270.0
		MeanAnomaly     0
	}
}

Star "PI Cep Aa"
{
	DateUpdated     "2024-04-27"
	ParentBody      "PI Cep A"
	Class           "G7III"
	AbsMagn         0.24
	MassSol         3.63
	Radius          6552630.75602449 // log(g) = 3.05 cm/s^2
	LumBol          59.6154305727008 // 计算的值
	Teff            5226
	FeH             0.29
	Age             0.100

	BinaryOrbit
	{
		PeriodDays      556.72
		Separation      2.94407743807199 // 39.0 mas
		Eccentricity    0.297
		Inclination     99.0
		AscendingNode   109.2
		Epoch           2439172.9
		ArgOfPericenter 187.6
		MeanAnomaly     0
	}
}

Star "PI Cep Ab"
{
	ParentBody      "PI Cep A"
	Class           "F5V"
	MassSol         3.27
}

Star "PI Cep B"
{
	ParentBody      "PI Cep"
	Class           "A7V" // A9V
	MassSol         1.93
}

// Object * 23 Cas  ---  Spectroscopic Binary  ---  OID=@253511   (@@4828,22)  ---  coobox=2329 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "23 Cas A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "23 Cas"
	Class           "B8III"
	AbsMagn         -1.5 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.44388622
		Eccentricity    0.412586331
		Inclination     -0.482285023
		AscendingNode   0
		ArgOfPericenter 145.282077
		MeanAnomaly     -129.1022
	}
}

Star "23 Cas B"
{
	ParentBody      "23 Cas"
	Class           "B8?"
}
