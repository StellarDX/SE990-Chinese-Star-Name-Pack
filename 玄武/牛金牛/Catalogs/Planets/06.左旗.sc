// Object * del Sge  ---  Spectroscopic Binary  ---  OID=@2772282   (@@60238,3)  ---  coobox=20062 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,Infra-Red Source,Long-Period Variable Candidate,UV-emission Source 
Remove "DEL Sge A" {ParentBody "DEL Sge"}
Remove "DEL Sge B" {ParentBody "DEL Sge"}
Star "DEL Sge A"
{
	DateUpdated     "2024-06-05"
	ParentBody      "HIP 97365"
	Class           "M2II"
	AbsMagn         -2.58
	MassSol         3.35
	RadSol          108
	LumBol          1888 // 1923
	Teff            3660

	BinaryOrbit     
	{
		Period          10.11
		Separation      8.54724622086392 // 0.051 asec
		Eccentricity    0.44
		Inclination     140.0
		AscendingNode   170.2
		Epoch           2444214.122468565590680
		ArgOfPericenter 77.7
		MeanAnomaly     0
	}
}

Star "DEL Sge B"
{
	DateUpdated     "2024-06-05"
	ParentBody      "HIP 97365"
	Class           "B9.5V"
	MassSol         2.9
	RadSol          2.6
	LumBol          63
	Teff            10000
}

// Object * zet Sge  ---  Double or Multiple Star  ---  OID=@2772292   (@@60240,0)  ---  coobox=20063 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=97496
Remove "ZET Sge (AB)" {ParentBody "ZET Sge"}
Remove "ZET Sge A" {ParentBody "ZET Sge (AB)"}
Remove "ZET Sge B" {ParentBody "ZET Sge (AB)"}
Remove "ZET Sge C" {ParentBody "ZET Sge"}
Barycenter "ZET Sge AB"
{
	ParentBody      "HIP 97496"
	BinaryOrbit     
	{
		Period          9976
		Separation      655.199397416739 // 8.38 asec
	}
}

Star "ZET Sge A" // A可能还有伴星Ab
{
	DateUpdated     "2024-06-05"
	ParentBody      "ZET Sge AB"
	Class           "A3V"
	AbsMagn         0.55
	MassSol         1.80
	RadSol          1.7
	LumBol          46
	Teff            8422
	Age             0.347
	Oblateness      0.12280701754385964912280701754386 // Vsini = 240 Km/s

	BinaryOrbit     
	{
		PeriodDays      8487.9
		Separation      10.6368712872434 // 0.13605 asec
		Eccentricity    0.7948
		Inclination     132.33
		AscendingNode   340.97
		Epoch           2444199.6
		ArgOfPericenter 175.3
		MeanAnomaly     0
	}
}

Star "ZET Sge B"
{
	DateUpdated     "2024-06-05"
	ParentBody      "ZET Sge AB"
	Class           ""
	MassSol         2.39
}

// Object * zet Sge C  ---  Star  ---  OID=@2772293   (@@60240,1)  ---  coobox=20063 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "ZET Sge C/Gaia DR3 1824681293384501632/TIC 391472372/WDS J19490+1909C/ADS 12973 C/BD+18 4254C/CCDM J19490+1909C/CSI+18 4254 2/GEN# +1.00187362C/UBV 16867/** STF 2585C/PMSC 19445+1853C/TYC 1623-2648-1/UCAC4 546-105363/2MASS J19485821+1908368/WISE J194858.20+190836.2/Gaia DR2 1824681293384501632"
{
	DateUpdated     "2024-06-05"
	ParentBody      "HIP 97496"
	Parallax        9.9456
	Class           "F5"
	MassKg          2.1938926664856e+30 // log(g) = 4.288 cm/s^2
	RadSol          1.2485 // Gaia DR3
	LumBol          2.15934991923095 // 计算的值
	Teff            6262
	FeH             -0.245
}

// Object * 13 Sge  ---  Long-Period Variable  ---  OID=@2773568   (@@60809,17)  ---  coobox=20086 
// Object types: Long-Period Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,Long-Period Variable Candidate 
Remove "13 Sge A" {ParentBody "13 Sge"}
Remove "13 Sge B" {ParentBody "13 Sge"} // B为光学伴星

// Object * 14 Sge  ---  Spectroscopic Binary  ---  OID=@2755549   (@@60831,0)  ---  coobox=20083 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source 
Star "14 Sge A"
{
	DateUpdated     "2024-06-05"
	ParentBody      "14 Sge"
	Class           "B9VpHgMn"
	AbsMagn         -0.867 // 计算的值
	MassKg          7.95427404135742e+30 // log(g) = 3.747 cm/s^2
	RadSol          4.43181 // Gaia DR3
	LumBol          372.3393462089 // 计算的值
	Teff            12044
	FeH             0.798

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.126996354
		Eccentricity    0.37220296
		Inclination     1.31163192
		AscendingNode   0
		ArgOfPericenter 66.1236333
		MeanAnomaly     163.829213
	}
}

Star "14 Sge B"
{
	ParentBody      "14 Sge"
	Class           "B8.4?"
}