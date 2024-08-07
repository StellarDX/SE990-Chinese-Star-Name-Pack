// Object * sig Aql  ---  Spectroscopic Binary  ---  OID=@2691602   (@@59820,15)  ---  coobox=19986 
// Object types: Near-IR Source (λ < 3 µm),Eclipsing Binary,Spectroscopic Binary,Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "SIG Aql A" {ParentBody "SIG Aql"}
Remove "SIG Aql B" {ParentBody "SIG Aql"}
Star "SIG Aql A"
{
	DateUpdated     "2024-06-06"
	ParentBody      "HIP 96665"
	Class           "B3V"
	AbsMagn         -1.69
	MassSol         6.8
	RadSol          4.22
	LumBol          1862
	Teff            18493
	Age             0.140

	BinaryOrbit     
	{
		PeriodDays      1.95022
		Eccentricity    0
		Epoch           2420054.331
	}
}

Star "SIG Aql B"
{
	DateUpdated     "2024-06-06"
	ParentBody      "HIP 96665"
	Class           "B3V"
	MassSol         5.4
	RadSol          3.05
	LumBol          524
	Teff            15848
}

// Object * del Aql  ---  Double or Multiple Star  ---  OID=@2674897   (@@59353,6)  ---  coobox=19630 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "DEL Aql A" {ParentBody "DEL Aql"}
Remove "DEL Aql B" {ParentBody "DEL Aql"}
Star "DEL Aql Aa"
{
	DateUpdated     "2024-06-06"
	ParentBody      "DEL Aql"
	Class           "F1IV-V(n)"
	AbsMagn         2.46
	MassSol         1.65
	RadSol          2.04
	LumBol          6.8 // 6.8 - 7.9
	Teff            7016
	FeH             -0.04

	BinaryOrbit     
	{
		Period          3.426
		Separation      0.837460298365296 // 0.0539 asec
		Eccentricity    0.36
		Inclination     150
		AscendingNode   337
		Epoch           2434955.232729467097670
		ArgOfPericenter 11
		MeanAnomaly     0
	}
}

Star "DEL Aql Ab"
{
	DateUpdated     "2024-06-06"
	ParentBody      "DEL Aql"
	Class           "K"
	MassSol         0.67
	RadSol          0.61
}