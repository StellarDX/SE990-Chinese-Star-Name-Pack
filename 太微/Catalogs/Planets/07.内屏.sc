// Object * pi. Vir  ---  Spectroscopic Binary  ---  OID=@1885851   (@@38740,10)  ---  coobox=13962 
// Object types: Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "PI Vir A" {ParentBody "PI Vir"}
Remove "PI Vir B" {ParentBody "PI Vir"}
Star "PI Vir A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "HIP 58590"
	Class           "A5V"
	AbsMagn         -0.70
	MassSol         2.2
	RadSol          1.5
	LumBol          8.303021153098998 // 计算的值
	Teff            8000

	BinaryOrbit     
	{
		PeriodDays      282.69
		Separation      0.393418896192734 // 3.55 mas
		Eccentricity    0.265
		Inclination     62.71
		AscendingNode   149.34
		Epoch           2448281.3906
		ArgOfPericenter 132
		MeanAnomaly     0
	}
}

Star "PI Vir B"
{
	ParentBody      "HIP 58590"
	Class           "B9.9?"
}

// Object * omi Vir  ---  Spectroscopic Binary  ---  OID=@1885389   (@@39167,0)  ---  coobox=13954 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),High Proper Motion Star,Chemically Peculiar Star,Star,Infra-Red Source,UV-emission Source 
Star "OMI Vir A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "OMI Vir"
	Class           "G8IIICN0.5CH1Ba1"
	AbsMagn         0.52
	MassSol         2.17
	RadSol          9.62
	LumBol          57
	Teff            5107
	FeH             -0.30
	Age             0.88

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.460568434
		Eccentricity    0
		Inclination     -2.12329054
		AscendingNode   0
		ArgOfPericenter 17.1718913
		MeanAnomaly     169.065488
	}
}

Star "OMI Vir B"
{
	ParentBody      "OMI Vir"
	Class           "WD"
}