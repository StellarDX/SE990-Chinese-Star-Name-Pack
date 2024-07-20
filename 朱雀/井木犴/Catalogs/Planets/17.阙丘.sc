// Object * 18 Mon  ---  Spectroscopic Binary  ---  OID=@924670   (@@17615,13)  ---  coobox=5864 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "18 Mon A"
{
	DateUpdated     "2024-07-20"
	ParentBody      "18 Mon"
	Class           "K0IIIaBa0.2"
	AbsMagn         -0.78
	//MassSol         // log(g) = 2.59 cm/s^2
	RadSol          26.95
	LumBol          311.2
	Teff            4750
	FeH             -0.03

	BinaryOrbit     
	{
		PeriodDays      1760.9
		Separation      0.786837792385469 // 6.63 mas
		Eccentricity    0.40
		Inclination     96.25
		AscendingNode   47.63
		Epoch           2441942.5
		ArgOfPericenter 352
		MeanAnomaly     0
	}
}

Star "18 Mon B"
{
	ParentBody      "18 Mon"
	Class           "WD" // ?
}