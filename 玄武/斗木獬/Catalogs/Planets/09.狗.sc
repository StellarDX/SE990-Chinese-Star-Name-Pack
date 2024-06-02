// Object * h02 Sgr  ---  High Proper Motion Star  ---  OID=@2505969   (@@59940,13)  ---  coobox=19026 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "52 Sgr A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "52 Sgr"
	Class           "B8/9V"
	AbsMagn         0.77
	MassSol         3.0
	RadSol          2.1
	LumBol          60.5
	Teff            10592
	FeH             0.00
	Age             0.0573

	BinaryOrbit     
	{
		Separation      133.338538476718 // 2.43 asec
	}
}

Star "h2 Sgr B/Gaia DR3 6767903057224910464/52 Sgr B/ADS 12654 B/** BU 654B/CCDM J19367-2453B/HD 184707B/WDS J19367-2453B/Gaia DR2 6767903057224910464"
{
	DateUpdated     "2024-06-01"
	ParentBody      "52 Sgr"
	Class           "K2/4V"
}

// Object * chi01 Sgr  ---  Double or Multiple Star  ---  OID=@2505660   (@@59479,7)  ---  coobox=18683 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Star "CHI1 Sgr A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "CHI1 Sgr"
	Class           "A3IV" // A3/5IV/V
	AbsMagn         0.59
	MassSol         1.64
	Radius          2457928.42902107 // 计算的值
	LumBol          42.9
	Teff            7859
	Age             0.393

	BinaryOrbit     
	{
		Period          5.72
		Separation      7.15762946992785 // 0.069 asec
		Eccentricity    0.710
		Inclination     97.3
		AscendingNode   259.0
		Epoch           2445806.578455250710249
		ArgOfPericenter 190.7
		MeanAnomaly     0
	}
}

Star "CHI1 Sgr B"
{
	ParentBody      "CHI1 Sgr"
	Class           "F3.1?"
}