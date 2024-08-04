// Object * pi. Pav  ---  High Proper Motion Star  ---  OID=@3432022   (@@69699,7)  ---  coobox=23812 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "PI Pav A"
{
	DateUpdated     "2024-08-04"
	ParentBody      "PI Pav"
	Class           "kA4hF0mF2III"
	AbsMagn         1.33
	MassSol         2.15
	RadSol          2.84
	LumBol          24.69
	Teff            7632
	FeH             0.27
	Age             0.630

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   126.311387
		Eccentricity    0.673290281
		Inclination     -1.21405363
		AscendingNode   0
		ArgOfPericenter 69.5955455
		MeanAnomaly     154.479305
	}
}

Star "PI Pav B"
{
	ParentBody      "PI Pav"
	Class           "F7.1?"
}

// Object * nu. Pav  ---  Spectroscopic Binary  ---  OID=@3432331   (@@70215,0)  ---  coobox=23821 
// Object types: Pulsating Variable,Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=169978
Barycenter "NU Pav A"
{
	ParentBody      "NU Pav"
	BinaryOrbit     
	{
		Period          3342
		Separation      418.657231807505 // 3.085 asec
	}
}

Star "NU Pav Aa"
{
	DateUpdated     "2024-08-04"
	ParentBody      "NU Pav A"
	Class           "B7III"
	AbsMagn         -1.01
	MassSol         4.39
	Radius          3652113.62147986 // 计算的值
	LumBol          659
	Teff            12764

	BinaryOrbit // SB9_2021 2000A&A...355.1015D
	{
		PeriodDays      1.711529
		Eccentricity    0.0
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2450276.5502
		ArgOfPericenter 307
		MeanAnomaly     0
	}
}

Star "NU Pav Ab"
{
	DateUpdated     "2024-08-04"
	ParentBody      "NU Pav A"
	Class           ""
	MassSol         0.80
}

Star "NU Pav B"
{
	DateUpdated     "2024-08-04"
	ParentBody      "NU Pav"
	Class           ""
	MassSol         0.15
	Teff            3192
}

// Object * lam Pav  ---  Be Star  ---  OID=@3433486   (@@71188,0)  ---  coobox=23845 
// Object types: Be Star,Be Star,Double or Multiple Star,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,Variable Star Candidate 
Star "LAM Pav A"
{
	DateUpdated     "2024-08-04"
	ParentBody      "LAM Pav"
	Class           "B2Ve"
	AbsMagn         -3.97
	MassSol         12.5
	DimensionsSol   (19.8, 18, 19.8) // Vsini = 190 Km/s
	LumBol          8450
	Teff            20300
}

Planet "DEL Pav b"
{
	ParentBody     "DEL Pav"
	DiscMethod     "Astrometry"
	DiscDate       "2021"
	Mass           69

	Orbit
	{
		PeriodDays      13500
		SemiMajorAxis   11.1
	}
}

// Object * alf Pav  ---  Spectroscopic Binary  ---  OID=@3435139   (@@73130,1)  ---  coobox=23983 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "ALF Pav A" {ParentBody "ALF Pav"}
Remove "ALF Pav B" {ParentBody "ALF Pav"}
Star "ALF Pav A"
{
	DateUpdated     "2024-08-04"
	ParentBody      "TIC 219974785"
	Class           "B2IV"
	AbsMagn         -1.762
	MassSol         5.91
	RadSol          4.83
	LumBol          2200
	Teff            17711
	Age             0.048

	BinaryOrbit     
	{
		PeriodDays      11.753
	}
}

Star "ALF Pav B"
{
	DateUpdated     "2024-08-04"
	ParentBody      "TIC 219974785"
	Class           ""
	MassSol         0.26
}