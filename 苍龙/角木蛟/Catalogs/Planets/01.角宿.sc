// Object * alf Vir  ---  beta Cep Variable  ---  OID=@2140887   (@@143525,0)  ---  coobox=15573 
// Object types: beta Cep Variable,beta Cep Variable,Spectroscopic Binary,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Spica A" {ParentBody "Spica"}
Remove "Spica B" {ParentBody "Spica"}
Star "ALF Vir A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "ALF Vir"
	Class           "B1III-IV"
	AbsMagn         -3.5
	MassSol         11.43
	RadSol          7.47
	LumBol          20512
	Teff            25300
	Age             0.0125

	BinaryOrbit     
	{
		PeriodDays      4.0145
		SemiMajorAxisKm 19618740 // 28.20 RSun
		Eccentricity    0.133
		Inclination     63.1
		Epoch           2454189.4
		ArgOfPericenter 75.6
		MeanAnomaly     0
	}
}

Star "ALF Vir B"
{
	DateUpdated     "2024-05-19"
	ParentBody      "ALF Vir"
	Class           "B2V"
	AbsMagn         -1.5
	MassSol         7.21
	RadSol          3.74
	LumBol          2254
	Teff            20900
}

// Object * zet Vir  ---  High Proper Motion Star  ---  OID=@2168382   (@@45894,13)  ---  coobox=15616 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "ZET Vir A" {ParentBody "ZET Vir"}
Remove "ZET Vir B" {ParentBody "ZET Vir"}
Star "ZET Vir A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "GJ 3792"
	Class           "A2Van"
	AbsMagn         1.64
	MassSol         2.041
	RadSol          2.079
	LumBol          17.885
	Teff            8247
	Age             0.51

	BinaryOrbit     
	{
		Period          124
		Separation      24.9
		Eccentricity    0.16
	}
}

Star "ZET Vir B"
{
	DateUpdated     "2024-05-19"
	ParentBody      "GJ 3792"
	Class           "M"
	MassSol         0.168
}