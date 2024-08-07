// Object * 93 Leo  ---  RS CVn Variable  ---  OID=@1843859   (@@38284,0)  ---  coobox=13139 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Variable Star,RS CVn Variable,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "93 Leo A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "93 Leo"
	Class           "F8III"
	AbsMagn         0.48 // Bolometric
	MassSol         2.25
	RadSol          9.1
	LumBol          49.4
	Teff            5100

	BinaryOrbit     
	{
		PeriodDays      71.69
		Separation      0.556378338689618 // 7.5 mas
		Eccentricity    0
		Inclination     50.1
		AscendingNode   138
		Epoch           2447642.6
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "93 Leo B"
{
	DateUpdated     "2024-05-05"
	ParentBody      "93 Leo"
	Class           "A6III"
	AbsMagn         1.27 // Bolometric
	MassSol         1.97
	RadSol          2.7
	LumBol          23.9
	Teff            7800
}
