// Object * alf Equ  ---  Spectroscopic Binary  ---  OID=@1409539   (@@29202,0)  ---  coobox=9240 
// Object types: High Proper Motion Star,Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Kitalpha A" {ParentBody "Kitalpha"}
Remove "Kitalpha B" {ParentBody "Kitalpha"}
Star "ALF Equ A"
{
	DateUpdated     "2024-06-11"
	ParentBody      "ALF Equ"
	Class           "G7III"
	AbsMagn         0.71
	MassSol         2.3
	RadSol          9.2
	LumBol          52.5
	Teff            5100

	BinaryOrbit     
	{
		PeriodDays      98.8098
		Eccentricity    0
	}
}

Star "ALF Equ B"
{
	DateUpdated     "2024-06-11"
	ParentBody      "ALF Equ"
	Class           "kA3hA4mA9"
	AbsMagn         1.18
	MassSol         2.0
	RadSol          2.6
	LumBol          26.3
	Teff            8150
	Age             0.740
}