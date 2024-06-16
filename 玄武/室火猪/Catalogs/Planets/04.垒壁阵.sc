// Object * del Cap  ---  Spectroscopic Binary  ---  OID=@1292016   (@@26458,0)  ---  coobox=8580 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Eclipsing Binary,Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Deneb Algedi A" {ParentBody "Deneb Algedi"}
Remove "DEL Cap B" {ParentBody "Deneb Algedi"}
Star "DEL Cap A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "DEL Cap"
	Class           "kA5hF0mF2III"
	AbsMagn         2.48
	MassSol         2.0
	RadSol          1.91
	LumBol          8.5
	Teff            7301
	FeH             -0.13

	BinaryOrbit     
	{
		PeriodDays      1.0227683
		Eccentricity    0
		Inclination     72.5
		Epoch           2448105.793
	}
}

Star "DEL Cap B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "DEL Cap"
	Class           "G-K"
	MassSol         0.73
	RadSol          0.9
	LumBol          0.2992462744563859 // 计算的值
	Teff            4500
}

// Object * iot Aqr  ---  Spectroscopic Binary  ---  OID=@1301037   (@@26718,8)  ---  coobox=8602 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "IOT Aqr A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "IOT Aqr"
	Class           "B8V"
	AbsMagn         0.64
	MassSol         3.20
	RadSol          2.7
	LumBol          74
	Teff            11284
	FeH             -0.08
	Age             0.124

	BinaryOrbit     
	{
		PeriodDays      77 // Wikipedia只提到轨道周期很短，但具体不知道多长
	}
}

Star "IOT Aqr B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "IOT Aqr"
	Class           ""
	MassSol         1.00
	Teff            5710
	FeH             -0.5
}

// Object * phi Aqr  ---  Spectroscopic Binary  ---  OID=@1343310   (@@27680,10)  ---  coobox=9071 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source 
Star "PHI Aqr A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "PHI Aqr"
	Class           "M1.5III"
	AbsMagn         0.30
	MassSol         1.00
	RadSol          34.77
	LumBol          207.7
	Teff            3715
	Age             10.97

	BinaryOrbit     
	{
		PeriodDays      2500
	}
}

Star "PHI Aqr B"
{
	ParentBody      "PHI Aqr"
	Class           "F2.9?"
}

// Object * 27 Psc  ---  High Proper Motion Star  ---  OID=@1354746   (@@27983,0)  ---  coobox=9211 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,X-ray Source 
Star "27 Psc A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "27 Psc"
	Class           "G8III"
	AbsMagn         0.60
	MassSol         2.39
	RadSol          9.73
	LumBol          56
	Teff            5014
	FeH             0.03
	Age             0.710

	BinaryOrbit     
	{
		Period          695
		Separation      276.703427236895 // 3.67 asec
		Eccentricity    0.766
		Inclination     81.0
		AscendingNode   81.1
		Epoch           2652427.742727649863809
		ArgOfPericenter 289.6
		MeanAnomaly     0
	}
}

Star "27 Psc B"
{
	ParentBody      "27 Psc"
	Class           "A8.5?"
}

// A可能还有一颗73木星质量的伴星在距离4天文单位的位置
Star "27 Psc Ab(?)"
{
	DateUpdated     "2024-06-16"
	ParentBody      "27 Psc A"
	Class           ""
	MassJup         73

	Orbit     
	{
		SemiMajorAxis   4
	}
}

// Object * 33 Psc  ---  RS CVn Variable  ---  OID=@1344629   (@@27720,0)  ---  coobox=10565 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,RS CVn Variable,Star,Infra-Red Source,UV-emission Source 
Remove "33 Psc A" {ParentBody "33 Psc"}
Remove "33 Psc B" {ParentBody "33 Psc"}
Star "33 Psc A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "HIP 443"
	Class           "K0III-IV"
	AbsMagn         1.63
	MassSol         0.83
	RadSol          7
	LumBol          24
	Teff            4736
	FeH             -0.12
	Age             0.0048

	BinaryOrbit     
	{
		PeriodDays      72.93
		Eccentricity    0.272
		Epoch           2422530.330
		ArgOfPericenter 157.71
		MeanAnomaly     0
	}
}

Star "33 Psc B"
{
	DateUpdated     "2024-06-16"
	ParentBody      "HIP 443"
	Class           ""
	MassSol         0.76
}