// Object * del Sct  ---  delta Sct Variable  ---  OID=@2600853   (@@57245,2)  ---  coobox=18795 
// Object types: delta Sct Variable,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,UV-emission Source 
// 所有伴星均为光学伴星
Remove "DEL Sct (AB)" {ParentBody "DEL Sct"}
Remove "DEL Sct A" {ParentBody "DEL Sct (AB)"}
Remove "DEL Sct B" {ParentBody "DEL Sct (AB)"}
Remove "DEL Sct C" {ParentBody "DEL Sct"}

// Object * eps Sct  ---  Star  ---  OID=@2612402   (@@57223,26)  ---  coobox=18798 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// 距离较远的伴星均为光学伴星，主星为双星
Star "EPS Sct A"
{
	DateUpdated     "2024-05-31"
	ParentBody      "EPS Sct"
	Class           "G8IIb"
	AbsMagn         -1.18
	MassKg          7.91042096639841e+29 // log(g) = 1.00 cm/s^2
	Radius          22977493.9138351 // 计算的值
	LumBol          403
	Teff            4500
	FeH             0.05

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.76296634
		Eccentricity    0.595051117
		Inclination     0.337785244
		AscendingNode   0
		ArgOfPericenter 117.89225
		MeanAnomaly     -45.2055254
	}
}

Star "EPS Sct B"
{
	ParentBody      "EPS Sct"
	Class           "B9.2?"
}

// Object * bet Sct  ---  Spectroscopic Binary  ---  OID=@2627917   (@@57181,11)  ---  coobox=18896 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Emission-line Star,Star,Infra-Red Source,UV-emission Source 
Remove "BET Sct A" {ParentBody "BET Sct"}
Remove "BET Sct B" {ParentBody "BET Sct"}
Star "BET Sct A"
{
	DateUpdated     "2024-05-31"
	ParentBody      "HIP 92175"
	Class           "G4IIa"
	AbsMagn         -2.99
	MassKg          1.95087103705678e+30 // log(g) = 0.94 cm/s^2
	Radius          38664922.3574814 // 计算的值
	LumBol          1270
	Teff            4622
	FeH             -0.16

	BinaryOrbit     
	{
		PeriodDays      834
		Separation      0.786837792385469 // 2.8 mas
		Eccentricity    0.350
		Inclination     105.9
		AscendingNode   288.1
		Epoch           2422480.9
		ArgOfPericenter 213.9
		MeanAnomaly     0
	}
}

Star "BET Sct B"
{
	DateUpdated     "2024-05-31"
	ParentBody      "HIP 92175"
	Class           "B9"
}

// Object * g Aql  ---  Double or Multiple Star  ---  OID=@2628802   (@@57785,11)  ---  coobox=18907 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,UV-emission Source 
Star "14 Aql A"
{
	DateUpdated     "2024-05-31"
	ParentBody      "14 Aql"
	Class           "B9IV"
	AbsMagn         -0.52
	MassSol         3.25
	RadSol          2.0
	LumBol          213.9
	Teff            9908

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.26402194
		Eccentricity    0
		Inclination     -1.5567975
		AscendingNode   0
		ArgOfPericenter 91.0047427
		MeanAnomaly     133.035146
	}
}

Star "14 Aql B"
{
	ParentBody      "14 Aql"
	Class           "A3.2?"
}