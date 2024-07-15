// Object * eps CMi  ---  Star  ---  OID=@971180   (@@18716,13)  ---  coobox=5845 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "EPS CMi A"
{
	DateUpdated     "2024-07-11"
	ParentBody      "EPS CMi"
	Class           "G6IIb"
	AbsMagn         -2.62
	MassSol         4.63
	RadSol          45.51
	LumBol          1086.5
	Teff            4916
	FeH             -0.12
	Age             0.140

	BinaryOrbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.491889036
		Eccentricity    0.217529366
		Inclination     0.359587193
		AscendingNode   0
		ArgOfPericenter 315.284054
		MeanAnomaly     114.478095
	}
}

Star "EPS CMi B"
{
	ParentBody      "EPS CMi"
	Class           "WD"
}

// Object * bet CMi  ---  Be Star  ---  OID=@971213   (@@18719,0)  ---  coobox=5847 
// Object types: Be Star,Be Star,High Proper Motion Star,Emission-line Star,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,Optical Source,UV-emission Source 
Star "BET CMi A"
{
	DateUpdated     "2024-07-11"
	ParentBody      "BET CMi"
	Class           "B8Ve"
	AbsMagn         -0.59
	MassSol         3.5
	RadSol          3.5
	LumBol          195
	Teff            11772
	Age             0.160

	BinaryOrbit     
	{
		PeriodDays      170.36
		Eccentricity    0 // fixed
		Inclination     43
		Epoch           2452001.2
		MeanAnomaly     0
	}
}

Star "BET CMi B"
{
	DateUpdated     "2024-07-11"
	ParentBody      "BET CMi"
	Class           "sdO"
	MassSol         0.42
}

// Object * alf CMi  ---  Spectroscopic Binary  ---  OID=@988145   (@@133252,0)  ---  coobox=6027 
// Object types: Rotating Variable,Double or Multiple Star,High Proper Motion Star,Spectroscopic Binary,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Star,Star,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source 
Remove "Procyon A" {ParentBody "Procyon"}
Remove "Procyon B" {ParentBody "Procyon"}
Star "ALF CMi A/Procyon A"
{
	DateUpdated     "2024-07-11"
	ParentBody      "ALF CMi"
	Class           "F5IV-V"
	AbsMagn         2.66
	MassSol         1.499
	RadSol          2.048
	LumBol          6.93
	Teff            6530
	FeH             -0.05
	RotationPeriod  552
	Age             1.87

	BinaryOrbit     
	{
		Period          40.840
		Separation      15.1374039396886 // 4.3075 asec
		Eccentricity    0.39785
		Inclination     31.408
		AscendingNode   100.683
		Epoch           2439884.541444215457886
		ArgOfPericenter 269.23
		MeanAnomaly     0
	}
}

// Object * alf CMi B  ---  White Dwarf  ---  OID=@988144   (@@127381,2)  ---  coobox=6027 
// Object types: Variable Star,White Dwarf,Double or Multiple Star,Star,X-ray Source 
Star "ALF CMi B/GJ 280 B/8pc 285.93B/ADS 6251 B/BD+05 1739B/CCDM J07393+0514B/CSI+05 1739 2/EGGR 53/IDS 07341+0529 B/Procyon B/UBV 7350/WD 0736+05/WD 0736+053/WD 0736+052/Zkh 107/WDS J07393+0514B/2XMMi J073917.7+051324/2RXP J073918.2+051334/** SHB 1B"
{
	DateUpdated     "2024-07-11"
	ParentBody      "ALF CMi"
	Class           "DQZ"
	AbsMagn         13.0
	MassSol         0.602
	RadSol          0.01234
	LumBol          0.00049
	Teff            7740
	Age             1.37
}
