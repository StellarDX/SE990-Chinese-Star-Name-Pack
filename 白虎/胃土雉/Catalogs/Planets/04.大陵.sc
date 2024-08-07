// Object * tau Per  ---  Spectroscopic Binary  ---  OID=@138467   (@@1980,0)  ---  coobox=2639 
// Object types: Near-IR Source (λ < 3 µm),Eclipsing Binary,Double or Multiple Star,Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "TAU Per A" {ParentBody "TAU Per"}
Remove "TAU Per B" {ParentBody "TAU Per"}
Star "TAU Per A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "HIP 13531"
	Class           "G8IIIa"
	AbsMagn         -0.45
	MassSol         2.99
	RadSol          16.08
	LumBol          191
	Teff            5507
	FeH             -0.20
	Age             0.39

	BinaryOrbit     
	{
		Period          4.149
		Separation      4.44232479169325 // 0.055 asec
		Eccentricity    0.728
		Inclination     94.5
		AscendingNode   100.6
		Epoch           2456617.017054770607501
		ArgOfPericenter 234.1
		MeanAnomaly     0
	}
}

Star "TAU Per B"
{
	DateUpdated     "2024-06-27"
	ParentBody      "HIP 13531"
	Class           "A3-4V"
	AbsMagn         1.26
	MassSol         1.8
	RadSol          2.2
	LumBol          28.22986570265075 // 计算的值
	Teff            8970
}

// Object * kap Per  ---  High Proper Motion Star  ---  OID=@86941   (@@1070,9)  ---  coobox=2711 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter "KAP Per A"
{
	ParentBody      "KAP Per"
	BinaryOrbit     
	{
		Epoch           2454832
		Separation      1534.90605702333 // 44.10 asec, 疑似为Gaia DR3 433103166397513600
		PositionAngle   319
	}
}

Star "KAP Per Aa"
{
	DateUpdated     "2024-06-27"
	ParentBody      "KAP Per A"
	Class           "G9.5IIIb"
	AbsMagn         1.20
	MassSol         1.50
	RadSol          9
	LumBol          39.8
	Teff            4857
	FeH             0.04
	Age             4.58

	BinaryOrbit // 计算的值
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.201964618
		Eccentricity    0.437865736
		Inclination     2.20612869
		AscendingNode   0
		ArgOfPericenter -49.9663884
		MeanAnomaly     -71.542437
	}
}

Star "KAP Per Ab"
{
	ParentBody      "KAP Per A"
	Class           "G8.5?"
}

// Object Gaia DR3 433103166397513600  ---  High Proper Motion Star  ---  OID=@23190035   (@@-1,255)  ---  coobox=2711 
// Object types: High Proper Motion Star,Star 
Star "Gaia DR3 433103166397513600"
{
	ParentBody      "KAP Per"
	Class           "M3.2?"
}

// Object * bet Per  ---  Spectroscopic Binary  ---  OID=@51431   (@@399,0)  ---  coobox=2736 
// Object types: Double or Multiple Star,Eclipsing Binary,Eclipsing Binary,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// 轨道数据由CHARA提供
Remove "Algol (AB)"{ParentBody "Algol"}
Remove "Algol A"{ParentBody "Algol (AB)"}
Remove "Algol B"{ParentBody "Algol (AB)"}
Remove "Algol C"{ParentBody "Algol"}
Barycenter "BET Per A"
{
	ParentBody      "BET Per"
	BinaryOrbit     
	{
		PeriodDays      680.168
		Separation      2.69 // 0.09343 asec
		Eccentricity    0.227
		Inclination     83.66
		AscendingNode   132.66
		Epoch           2446927.22
		ArgOfPericenter 310.02
		MeanAnomaly     0
	}
}

Star "Algol A/BET Per Aa"
{
	DateUpdated     "2024-06-27"
	ParentBody      "BET Per A"
	Class           "B8V"
	AbsMagn         -0.07
	MassSol         3.17
	RadSol          2.73
	LumBol          182
	Teff            13000
	Age             0.570

	BinaryOrbit     
	{
		PeriodDays      2.867328
		Separation      0.062 // 0.00215 asec
		Eccentricity    0
		Inclination     98.70
		AscendingNode   43.43
		Epoch           2441771.382643118035048
		ArgOfPericenter 270.0
		MeanAnomaly     0
	}
}

Star "Algol B/BET Per Ab"
{
	DateUpdated     "2024-06-27"
	ParentBody      "BET Per A"
	Class           "K0IV"
	AbsMagn         2.9
	MassSol         0.70
	RadSol          3.48
	LumBol          6.92
	Teff            4500
}

Star "BET Per B"
{
	DateUpdated     "2024-06-27"
	ParentBody      "BET Per"
	Class           "F1V" // kA4hA9.5mF0:
	AbsMagn         2.3
	MassSol         1.76
	RadSol          1.73
	LumBol          10.0
	Teff            7500
}

// Object * 12 Per  ---  Spectroscopic Binary  ---  OID=@28700   (@@673,6)  ---  coobox=2700 
// Object types: High Proper Motion Star,Spectroscopic Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),High Proper Motion Star,Variable Star,Double or Multiple Star,Star,Star,Infra-Red Source,X-ray Source 
Remove "12 Per A" {ParentBody "12 Per"}
Remove "12 Per B" {ParentBody "12 Per"}
Star "12 Per A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "GJ 9095"
	Class           "F9V"
	AbsMagn         3.02 // 计算的值
	MassSol         1.382
	RadSol          1.55
	LumBol          3.02
	Teff            6195
	FeH             0.35
	Age             1.12

	BinaryOrbit     
	{
		PeriodDays      330.98
		Separation      1.27
		Eccentricity    0.663
		Inclination     127.17
	}
}

Star "12 Per B"
{
	DateUpdated     "2024-06-27"
	ParentBody      "GJ 9095"
	Class           ""
	MassSol         1.240
	RadSol          1.31
	LumBol          1.86
	Teff            6000
}