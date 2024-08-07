// Object * 1 Peg  ---  High Proper Motion Star  ---  OID=@3539695   (@@76419,38)  ---  coobox=9483 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=105502
Remove "1 Peg A"{ParentBody "1 Peg"}
Remove "1 Peg B"{ParentBody "1 Peg"}
Remove "1 Peg Ba"{ParentBody "1 Peg B"}
Remove "1 Peg Bb"{ParentBody "1 Peg B"}
Star "1 Peg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "Gaia DR3 1790202365373760256"
	Class           "K1III"
	AbsMagn         0.68
	MassSol         1.57
	RadSol          12
	LumBol          71.78
	Teff            4600
	FeH             0.01
}

Barycenter "1 Peg B"
{
	ParentBody      "Gaia DR3 1790202365373760256"
	BinaryOrbit // VB6_PkO2014c STFB_11AB Gr.5 (Profile 1)
	{
		Period          17500 // 13500 - 17500
		Separation      1249.988001664 // 26.06 - 21.97 (asec)
		Eccentricity    0.7 // 0.61 - 0.7
		Inclination     30.0 // 18 - 38
		AscendingNode   212.0 // 85 - 212 (131)
		Epoch           4720429.072225671261549 // 7315 - 9717 (8212)
		ArgOfPericenter 265.0 // 47 - 351 (265)
		MeanAnomaly     0
	}
	/*BinaryOrbit // VB6_PkO2014c STFB_11AB Gr.5 (Profile 2)
	{
		Period          13500
		Separation      1053.80800280825
		Eccentricity    0.7
		Inclination     18.0
		AscendingNode   131.0
		Epoch           4392806.819919114932418
		ArgOfPericenter 351.0
		MeanAnomaly     0
	}*/
	/*BinaryOrbit // VB6_PkO2014c STFB_11AB Gr.5 (Profile 3)
	{
		Period          17500
		Separation      1249.988001664
		Eccentricity    0.610
		Inclination     38.0
		AscendingNode   85.0
		Epoch           5270118.581391077488661
		ArgOfPericenter 47.0
		MeanAnomaly     0
	}*/
}

Star "1 Peg B1"
{
	DateUpdated     "2024-06-13"
	ParentBody      "1 Peg B"
	Class           "K0V"
	MassSol         0.88

	BinaryOrbit // Gaia DR3 (AORB Profile)
	{
		PeriodDays      1116.7980
		Separation      0.709246001479674 // 0.015 asec
		Eccentricity    0.306
		Inclination     77.0
		AscendingNode   134.3
		Epoch           2457577.016
		ArgOfPericenter 262.8
		MeanAnomaly     0
	}
	/*BinaryOrbit // Gaia DR3 (SB1 Profile)
	{
		PeriodDays      1268.0938
		Separation      0.709246001479674 // 0.015 asec
		Eccentricity    0.312
		Inclination     77.0
		AscendingNode   134.3
		Epoch           2457579.523
		ArgOfPericenter 258.5
		MeanAnomaly     0
	}*/
}

Star "1 Peg B2"
{
	DateUpdated     "2024-06-13"
	ParentBody      "1 Peg B"
	Class           ""
	MassSol         0.41
}