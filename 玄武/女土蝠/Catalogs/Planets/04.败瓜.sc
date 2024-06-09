// Object * eta Del  ---  High Proper Motion Star  ---  OID=@2741050   (@@62114,11)  ---  coobox=20175 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "ETA Del A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "ETA Del"
	Class           "A3IVs"
	AbsMagn         1.11
	MassSol         2.12
	RadSol          2.2
	LumBol          35
	Teff            9355
	FeH             0.56
	Age             0.309

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   30.2709238
		Eccentricity    0.756842276
		Inclination     -2.11497927
		AscendingNode   0
		ArgOfPericenter 75.7017289
		MeanAnomaly     5.83582146
	}
}

Star "ETA Del B"
{
	ParentBody      "ETA Del"
	Class           "F7.1?"
}

// Object * iot Del  ---  Spectroscopic Binary  ---  OID=@2741413   (@@62116,11)  ---  coobox=20196 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Star,UV-emission Source 
Remove "IOT Del A" {ParentBody "IOT Del"}
Remove "IOT Del B" {ParentBody "IOT Del"}
Star "IOT Del A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "Gaia DR3 1754631755466911360"
	Class           "A1IV"
	AbsMagn         1.62
	MassSol         2.47
	RadSol          1.9
	LumBol          23
	Teff            9130
	FeH             -0.25
	Age             0.225

	BinaryOrbit     
	{
		PeriodDays      11.039
		Eccentricity    0.23
		Epoch           2422139.862
		ArgOfPericenter 241.8
		MeanAnomaly     0
	}
}

Star "IOT Del B"
{
	ParentBody      "Gaia DR3 1754631755466911360"
	Class           "F2.2?"
}

// Object * kap Del  ---  High Proper Motion Star  ---  OID=@2726113   (@@62125,10)  ---  coobox=20193 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=101916
Remove "KAP Del A" {ParentBody "KAP Del"}
Remove "KAP Del Aa" {ParentBody "KAP Del A"}
Remove "KAP Del Ab" {ParentBody "KAP Del A"}
Remove "KAP Del C" {ParentBody "KAP Del"}
Barycenter "KAP Del A"
{
	ParentBody      "AP J20390779+1005104"
	BinaryOrbit     
	{
		Period          331361
		Separation      6422.01806066179 // 213.99 asec
	}
}

Star "KAP Del A1"
{
	DateUpdated     "2024-06-09"
	ParentBody      "KAP Del A"
	Class           "G2IV"
	AbsMagn         2.7
	MassSol         1.43
	Radius          2096979.13801918 // 计算的值
	LumBol          8.3
	Teff            5643
	FeH             0.01
	Age             3.1

	BinaryOrbit     
	{
		Period          45
		Separation      15.6055817776785 // 0.520 asec
		Eccentricity    0.8
		Inclination     107
		AscendingNode   326
		Epoch           2441025.558073207270354
		ArgOfPericenter 188
		MeanAnomaly     0
	}
}

Star "KAP Del A2"
{
	DateUpdated     "2024-06-09"
	ParentBody      "KAP Del A"
	Class           ""
	MassSol         0.4
}

// Object HD 196794  ---  High Proper Motion Star  ---  OID=@2726118   (@@62129,2)  ---  coobox=20193 
// Object types: High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "HD 196794/Gaia DR3 1754191229260708736/TIC 282254061/PLX 4918/LSPM J2039+1004/TYC 1092-854-1/ASCC 988184/UCAC2 35484195/USNO-B1.0 1000-00556804/AG+09 2824/BD+09 4602/CCDM J20392+1005C/Ci 18 2675/G 144-22/GC 28765/GCRV 12935/GEN# +1.00196794/HIC 101932/HIP 101932/LTT 16030/NLTT 49639/PPM 138781/SAO 126064/UBV 17914/YZ 9 10256/YZC 22 10256/2MASS J20392206+1004326/PLX 4918.00/LAL 39872/WISEA J203922.27+100432.8/ADS 14101 C/BD+09 4600C/CSI+09 4600 3/GEN# +1.00196755C/UBV 17907/WDS J20391+1005C/** STT 533C/Gaia DR1 1754191224963744128/WEB 18420/Gaia DR2 1754191229260708736"
{
	DateUpdated     "2024-06-09"
	ParentBody      "AP J20390779+1005104"
	Parallax        33.4416
	Class           "K2IV"
	MassKg          1.59614028523117e+30 // log(g) = 4.527 cm/s^2
	RadSol          0.8087539 // Gaia DR3
	LumBol          0.355509855644819 // 计算的值
	Teff            4956
	FeH             -0.095
}