// Object * ome Sgr  ---  Spectroscopic Binary  ---  OID=@2479411   (@@61005,15)  ---  coobox=19045 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "OME Sgr A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "OME Sgr"
	Class           "G5IV"
	AbsMagn         2.64
	MassSol         1.52
	RadSol          2.87
	LumBol          7.1
	Teff            5499
	FeH             0.06
	Age             3.00

	BinaryOrbit     
	{
		PeriodDays      1712.74
		Separation      1.1044
		Eccentricity    0.8200
		Epoch           2457549.31
		ArgOfPericenter 321.17
		MeanAnomaly     0
	}
}

Star "OME Sgr B"
{
	ParentBody      "OME Sgr"
	Class           "G7.8?"
}

// Object * 60 Sgr  ---  Star  ---  OID=@2479416   (@@61007,2)  ---  coobox=19046 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "60 Sgr A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "60 Sgr"
	Class           "G6III"
	AbsMagn         -0.07
	MassKg          1.32597270543799e+31 // log(g) = 2.78 cm/s^2
	RadSol          17.42
	LumBol          170.3
	Teff            4997
	FeH             -0.38

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.708478872
		Eccentricity    0
		Inclination     1.60409278
		AscendingNode   0
		ArgOfPericenter -139.967921
		MeanAnomaly     -62.6095643
	}
}

Star "60 Sgr B"
{
	ParentBody      "60 Sgr"
	Class           "A3.7?"
}