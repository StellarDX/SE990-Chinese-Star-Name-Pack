// Object * tet Aql  ---  Spectroscopic Binary  ---  OID=@2645736   (@@61429,6)  ---  coobox=19327 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "TET Aql A" {ParentBody "TET Aql"}
Remove "TET Aql B" {ParentBody "TET Aql"}
Star "TET Aql A"
{
	DateUpdated     "2024-06-06"
	ParentBody      "HIP 99473"
	Class           "B9.5III"
	AbsMagn         -1.39
	MassSol         3.564
	RadSol          4.76
	LumBol          229.8
	Teff            10300
	FeH             0.20
	Age             0.0209

	BinaryOrbit     
	{
		PeriodDays      17.124281
		Separation      0.278189169344809 // 3.148 mas
		Eccentricity    0.6040
		Inclination     144.10
		AscendingNode   96.92
		Epoch           2458624.154
		ArgOfPericenter 33.73
		MeanAnomaly     0
	}
}

Star "TET Aql B"
{
	DateUpdated     "2024-06-06"
	ParentBody      "HIP 99473"
	Class           "B9.5III"
	AbsMagn         0.14
	MassSol         2.739
	RadSol          2.34
	LumBol          54.0
	Teff            10230
}

// Object * eta Aql  ---  Classical Cepheid Variable  ---  OID=@2660923   (@@60379,0)  ---  coobox=19978 
// Object types: Classical Cepheid Variable,Classical Cepheid Variable,Mid-IR Source (3 to 30 µm),Classical Cepheid Variable,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// 只看伴星的位置和数据属实分不清谁是谁
Barycenter "ETA Aql A"
{
	ParentBody      "ETA Aql"
	BinaryOrbit // Reference: https://ui.adsabs.harvard.edu/abs/2013AJ....146...93E
	{
		PeriodDays      316227.76601683793319988935444327 // log(P) = 5.5 days
		Separation      199.52623149688796013524553967395 // log(a) = 2.3 AU
	}
}

Star "ETA Aql Aa"
{
	DateUpdated     "2024-06-06"
	ParentBody      "ETA Aql A"
	Class           "F6Iab" // F6Ib - G4Ib
	AbsMagn         -3.70
	MassSol         6.15 // 5.7 - 9
	RadSol          60.4
	LumBol          3008
	Teff            5500
	FeH             -0.19
	Age             0.0264

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.67128992
		Eccentricity    0
		Inclination     0.745372772
		AscendingNode   0
		ArgOfPericenter 117.562861
		MeanAnomaly     -146.896591
	}
}

Star "ETA Aql Ab"
{
	DateUpdated     "2024-06-06"
	ParentBody      "ETA Aql A"
	Class           "B9.8V"
	MassSol         2.3
}

Star "ETA Aql B"
{
	DateUpdated     "2024-06-06"
	ParentBody      "ETA Aql"
	Class           "F1-5V"
}