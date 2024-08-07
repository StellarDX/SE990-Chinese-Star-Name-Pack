// Object * 14 Cap A  ---  Star  ---  OID=@2557396   (@@62230,9)  ---  coobox=19364 
// Object types: Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=101923
Remove "TAU Cap"
Barycenter "14 Cap A/ADS 14099 A/BD-15 5743A/CSI-15 5743 3/WDS J20393-1457A/TYC 5767-2439-1/CCDM J20392-1457A/** HU 200A/PMSC 20337-1518A/PMSC 20337-1518Aab"
{
	ParentBody      "TAU Cap"
	BinaryOrbit     
	{
		Period          420
		Separation      167.246995449085 // 0.48 asec
		Eccentricity    0.73
		Inclination     75
		AscendingNode   93.0
		Epoch           2420498.946501715108752
		ArgOfPericenter 90
		MeanAnomaly     0
	}
}

Star "14 Cap Aa"
{
	DateUpdated     "2024-06-07"
	ParentBody      "14 Cap A"
	Class           "B6III"
	AbsMagn         -1.96 /// 计算的值
	MassSol         5.01
	Radius          4230699.08717883 // 计算的值
	LumBol          1893
	Teff            15439
	FeH             0.14

	BinaryOrbit     
	{
		Period          18.885
		Separation      18.1143663181686 // 0.052 asec
	}
}

Star "14 Cap Ab"
{
	DateUpdated     "2024-06-07"
	ParentBody      "14 Cap A"
	Class           ""
	MassSol         1.73
}

// Object * 14 Cap B  ---  Star  ---  OID=@2557397   (@@62230,10)  ---  coobox=19364 
// Object types: Double or Multiple Star,Star 
Star "14 Cap B/ADS 14099 B/BD-15 5743B/CSI-15 5743 4/WDS J20393-1457B/TYC 5767-2439-2/CCDM J20392-1457B/** HU 200B/PMSC 20337-1518B"
{
	DateUpdated     "2024-06-07"
	ParentBody      "14 Cap"
	Class           "B6IV"
	MassSol         4.84
}
