// Object * gam Equ  ---  alpha2 CVn Variable  ---  OID=@1427458   (@@29732,1)  ---  coobox=9283 
// Object types: High Proper Motion Star,alpha2 CVn Variable,Variable Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "GAM Equ A" {ParentBody "GAM Equ"}
Remove "GAM Equ B" {ParentBody "GAM Equ"}
Star "GAM Equ A"
{
	DateUpdated     "2024-06-11"
	ParentBody      "Gaia DR3 1744662586614707072"
	Class           "A9VpSrCrEu"
	AbsMagn         1.90
	MassSol         1.78
	RadSol          2.11
	LumBol          11.0
	Teff            7550
	FeH             0.68
	Age             1.0

	BinaryOrbit     
	{
		Separation      44.6122977386433 // 1.26 asec
	}
}

// Object * gam Equ B  ---  High Proper Motion Star  ---  OID=@8447716   (@@-1,255)  ---  coobox=9283 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "GAM Equ B/HD 201601B/BD+09 4732B/** KNT 5B/WDS J21103+1008B/CCDM J21104+1007B/TYC 1108-2583-2"
{
	ParentBody      "Gaia DR3 1744662586614707072"
	Class           "F5.8?"
}

// Object * del Equ  ---  Spectroscopic Binary  ---  OID=@1427706   (@@29738,0)  ---  coobox=9289 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Remove "DEL Equ A" {ParentBody "DEL Equ"}
Remove "DEL Equ B" {ParentBody "DEL Equ"}
Star "DEL Equ A"
{
	DateUpdated     "2024-06-11"
	ParentBody      "GJ 822"
	Class           "F7V"
	AbsMagn         3.14
	MassSol         1.192
	RadSol          1.30
	LumBol          2.25
	Teff            6200
	FeH             -0.07
	Age             3.0

	BinaryOrbit     
	{
		PeriodDays      2084.03
		Separation      4.28831108510936 // 231.9650 mas
		Eccentricity    0.436851
		Inclination     99.4083
		AscendingNode   23.362
		Epoch           2453112.071
		ArgOfPericenter 187.735
		MeanAnomaly     0
	}
}

Star "DEL Equ B"
{
	DateUpdated     "2024-06-11"
	ParentBody      "GJ 822"
	Class           "F7V"
	MassSol         1.187
	RadSol          1.25
	LumBol          2.07
	Teff            6200
}