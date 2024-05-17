// Object * ups Oph  ---  Spectroscopic Binary  ---  OID=@2595520   (@@50985,0)  ---  coobox=16875 
// Object types: Double or Multiple Star,Spectroscopic Binary,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=80628
Remove "UPS Oph A" {ParentBody "UPS Oph"}
Remove "UPS Oph B" {ParentBody "UPS Oph"}
Barycenter "UPS Oph A"
{
	ParentBody      "HIP 80628"
	BinaryOrbit     
	{
		Period          82.8
		Separation      32.3504820276965 // 0.79 asec
		Eccentricity    0.45
		Inclination     31.2
		AscendingNode   86.8
		Epoch           2449389.604425291996449
		ArgOfPericenter 357.9
		MeanAnomaly     0
	}
}

Star "UPS Oph Aa"
{
	DateUpdated     "2024-05-16"
	ParentBody      "UPS Oph A"
	Class           "kA2hA5VmA5"
	AbsMagn         1.75
	MassSol         1.94
	RadSol          1.9
	LumBol          16.56
	Teff            8364
	FeH             0.14

	BinaryOrbit     
	{
		PeriodDays      27.218
		Separation      0.0583
		Eccentricity    0 // 0.744 // 粘一块了
		Epoch           2438914.84
		ArgOfPericenter 153.7
		MeanAnomaly     0
	}
}

Star "UPS Oph Ab"
{
	DateUpdated     "2024-05-16"
	ParentBody      "UPS Oph A"
	Class           ""
	MassSol         1.74
}

Star "UPS Oph B"
{
	DateUpdated     "2024-05-16"
	ParentBody      "HIP 80628"
	Class           ""
	MassSol         0.87
}

// Object * 20 Oph  ---  High Proper Motion Star  ---  OID=@2579954   (@@51666,4)  ---  coobox=17183 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "20 Oph A"
{
	DateUpdated     "2024-05-16"
	ParentBody      "20 Oph"
	Class           "F6IV"
	AbsMagn         2.13
	MassSol         1.70
	RadSol          3.0
	LumBol          12.06
	Teff            6417
	FeH             0.13

	BinaryOrbit     
	{
		Period          35.5
		Separation      21.4503513137841 // 0.460 asec
		Eccentricity    0.8
		Inclination     74
		AscendingNode   118
		Epoch           2444677.980061017442495
		ArgOfPericenter 214
		MeanAnomaly     0
	}
}

Star "20 Oph B"
{
	DateUpdated     "2024-05-16"
	ParentBody      "20 Oph"
	Class           "WD?" // dM?
	MassSol         0.8
}