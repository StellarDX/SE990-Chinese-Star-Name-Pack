// Object * 24 Aqr A  ---  High Proper Motion Star  ---  OID=@7110839   (@@-1,255)  ---  coobox=8575 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=106942
Barycenter "24 Aqr A/TYC 5209-253-1/PMSC 21344-0030Aab/PMSC 21344-0030A/ADS 15176 A/BD-00 4245A/CSI-00 4245 3/WDS J21395-0003A/** BU 1212A/HD 206058A"
{
	ParentBody      "24 Aqr"
	BinaryOrbit // VB6_SOAR2019 BU_1212AB Gr.2
	{
		Period          48.6748
		Separation      17.0627730115922 // 0.428 asec
		Eccentricity    0.867
		Inclination     55.2
		AscendingNode   141.1
		Epoch           2441352.084598917514086
		ArgOfPericenter 293.6
		MeanAnomaly     0
	}
}

Star "24 Aqr Aa"
{
	DateUpdated     "2024-06-11"
	ParentBody      "24 Aqr A"
	Class           "F7V"
	AbsMagn         3.45
	MassSol         1.25
	RadSol          1.42
	LumBol          2.864
	Teff            6231
	FeH             -0.09
	Age             3.5

	BinaryOrbit // Observ. 116 162 1996 Griffin+
	{
		PeriodDays      5.8839
		Eccentricity    0.071
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2446989.000
		ArgOfPericenter 286.0
		MeanAnomaly     0
	}
}

Star "24 Aqr Ab"
{
	DateUpdated     "2024-06-11"
	ParentBody      "24 Aqr A"
	Class           ""
	MassSol         0.15
}

// Object * 24 Aqr B  ---  High Proper Motion Star  ---  OID=@1361947   (@@28159,3)  ---  coobox=8575 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "24 Aqr B/ADS 15176 B/BD-00 4245B/CSI-00 4245 4/WDS J21395-0003B/PMSC 21344-0030B/** BU 1212B/HD 206058B/TYC 5209-253-2"
{
	DateUpdated     "2024-06-11"
	ParentBody      "24 Aqr"
	Class           "F9V"
	MassSol         1.00
}