// Object * mu. Eri  ---  Spectroscopic Binary  ---  OID=@736516   (@@16323,10)  ---  coobox=6412 
// Object types: Near-IR Source (λ < 3 µm),Eclipsing Binary,Variable Star,Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "MU Eri A"
{
	DateUpdated     "2024-07-04"
	ParentBody      "MU Eri"
	Class           "B5IV"
	AbsMagn         -2.06
	MassSol         6.2
	RadSol          6.1
	LumBol          1905
	Teff            15668
	FeH             0

	BinaryOrbit     
	{
		PeriodDays      7.38090
		Eccentricity    0.344
		Epoch           2455143.254
		ArgOfPericenter 340.5
		MeanAnomaly     0
	}
}

Star "MU Eri B"
{
	ParentBody      "MU Eri"
	Class           "B6.2?"
}

// Object * ome Eri  ---  Spectroscopic Binary  ---  OID=@750069   (@@15548,8)  ---  coobox=6448 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "OME Eri A"
{
	DateUpdated     "2024-07-04"
	ParentBody      "OME Eri"
	Class           "A9IVn"
	AbsMagn         0.10
	MassKg          8.1768849735862e+30 // log(g) = 3.4 cm/s^2
	RadSol          6.7
	LumBol          69
	Teff            6878
	FeH             0.18
	Oblateness      0.12280701754385964912280701754386 // Vsini = 186 Km/s

	BinaryOrbit     
	{
		PeriodDays      3057
		Eccentricity    0.46
		Epoch           2419973.0
		ArgOfPericenter 47
		MeanAnomaly     0
	}
}

Star "OME Eri B"
{
	ParentBody      "OME Eri"
	Class           "G0.9?"
}

// Object * 63 Eri  ---  Spectroscopic Binary  ---  OID=@750510   (@@15559,7)  ---  coobox=6459 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),White Dwarf,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "63 Eri A" {ParentBody "63 Eri"}
Remove "63 Eri B" {ParentBody "63 Eri"}
Star "63 Eri A"
{
	DateUpdated     "2024-07-04"
	ParentBody      "HIP 23221"
	Class           "G4IV"
	AbsMagn         1.72 // 计算的值

	BinaryOrbit     
	{
		Period          2.474
		Separation      2.0965
		Eccentricity    0.3
		Inclination     109.5
		AscendingNode   40.9
		ArgOfPericenter 171
		Epoch           2450384
		MeanAnomaly     0
	}
}

Star "63 Eri B"
{
	ParentBody      "HIP 23221"
	Class           "DA"
}