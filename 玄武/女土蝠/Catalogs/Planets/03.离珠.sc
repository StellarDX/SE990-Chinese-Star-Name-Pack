// Object * l Aql  ---  Spectroscopic Binary  ---  OID=@2646582   (@@62185,4)  ---  coobox=19444 
// Object types: Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "71 Aql A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "71 Aql"
	Class           "G7.5IIIa"
	AbsMagn         -1.03
	Teff            5060
	FeH             -0.13

	BinaryOrbit     
	{
		PeriodDays      205.2
		Separation      0.393418896192734 // 3.82 asec
		Eccentricity    0.000
		Inclination     147.70
		AscendingNode   314.00
		Epoch           2423358.0
		ArgOfPericenter 180.00
		MeanAnomaly     0
	}
}

Star "71 Aql B"
{
	ParentBody      "71 Aql"
	Class           "A4.2?"
}

// Object * 1 Aqr  ---  High Proper Motion Star  ---  OID=@2662623   (@@62177,18)  ---  coobox=20128 
// Object types: High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "1 Aqr A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "1 Aqr"
	Class           "K0III"
	AbsMagn         0.77
	MassSol         1.50
	RadSol          11
	LumBol          53.7
	Teff            4715
	FeH             -0.12
	Age             1.26

	BinaryOrbit     
	{
		PeriodDays      1966.7
		Eccentricity    0.368
		Epoch           2454740
		ArgOfPericenter 330.7
		MeanAnomaly     0
	}
}

Star "1 Aqr B"
{
	DateUpdated     "2024-06-09"
	ParentBody      "1 Aqr"
	Class           "M5"
}