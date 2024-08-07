// Object * tet Car  ---  Spectroscopic Binary  ---  OID=@3206745   (@@66620,0)  ---  coobox=20969 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=52419
Barycenter "TET Car Aa"
{
	ParentBody      "TET Car"
	BinaryOrbit // VB6_HIP1997d the_Car Gr.9
	{
		Period          2.2416
		Separation      3.97333608494348 // 0.003 asec
		Eccentricity    0.000
		Inclination     25.8
		AscendingNode   147.3
		Epoch           2448122.579237720929086
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

Star "TET Car Aa1"
{
	DateUpdated     "2024-08-07"
	ParentBody      "TET Car Aa"
	Class           "B0Vp"
	AbsMagn         -3.10
	MassSol         14.9
	RadSol          5.1
	LumBol          25673
	Teff            31000
	Age             0.004

	BinaryOrbit // SB9_631 1995PASP..107.1030L (Combined)
	{
		PeriodDays      2.20288
		Eccentricity    0.129
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2443023.660
		ArgOfPericenter 261.8
		MeanAnomaly     0
	}
}

Star "TET Car Aa2"
{
	DateUpdated     "2024-08-07"
	ParentBody      "TET Car Aa"
	Class           ""
	MassSol         0.41
}

Star "TET Car Ab"
{
	DateUpdated     "2024-08-07"
	ParentBody      "TET Car"
	Class           "F III"
	MassSol         1.58
	LumBol          256.73 // 0.01 Primary
}