// Object * psi Cas  ---  High Proper Motion Star  ---  OID=@223308   (@@4497,2)  ---  coobox=2339 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "PSI Cas A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "PSI Cas"
	Class           "K0III-IIIbCN0.5"
	AbsMagn         0.869
	MassKg          5.73853156918529e+30 // log(g) = 2.74 cm/s^2
	RadSol          12
	LumBol          50
	Teff            4952
	FeH             -0.13

	BinaryOrbit     
	{
		Separation      184.725673241052 // 3 asec
	}
}

Star "PSI Cas B"
{
	ParentBody      "PSI Cas"
	Class           "K0?"
}

// Object * ome Cas  ---  Spectroscopic Binary  ---  OID=@240978   (@@4109,0)  ---  coobox=2350 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Emission-line Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "OME Cas A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "OME Cas"
	Class           "B5III"
	AbsMagn         0.09
	MassSol         3.5
	RadSol          2.7
	LumBol          178
	Teff            12737
	Age             0.232

	BinaryOrbit     
	{
		PeriodDays      69.92
		Eccentricity    0.30
		Epoch           2420426.02
		ArgOfPericenter 230
		MeanAnomaly     0
	}
}

Star "OME Cas B"
{
	ParentBody      "OME Cas"
	Class           "A2.6?"
}

// Object * gam Cam  ---  Star  ---  OID=@280655   (@@3397,5)  ---  coobox=2506 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "GAM Cam A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "GAM Cam"
	Class           "A2IVn"
	AbsMagn         -0.62
	MassSol         2.98
	RadSol          2.5
	LumBol          185
	Teff            8892

	BinaryOrbit     
	{
		Epoch           2455563
		Separation      12553.5843987083 // 106.01 asec
		PositionAngle   85
	}
}

// Object BD+70 260  ---  Star  ---  OID=@280656   (@@3397,6)  ---  coobox=2506 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+70 260/Gaia DR3 495235125373502720/TIC 85743492/2MASS J03504351+7120047/AG+71 126/BDS 1843 C/CCDM J03504+7120C/GSC 04335-00619/IDS 03398+7101 C/PPM 5392/SAO 5009/TYC 4335-619-1/WDS J03504+7120C/** HJ 2200C/Gaia DR1 495235121076762112/Gaia DR2 495235125373502720"
{
	DateUpdated     "2024-04-30"
	ParentBody      "GAM Cam"
	Parallax        8.5246
	AppMagn         9.02
	Class           "F8"
	AbsMagn         3.67 // 计算的值
	MassKg          1.93878170124621e+30 // log(g) = 4.07 cm/s^2
	RadSol          1.5085 // Gaia DR3
	LumBol          2.94810566676993 // 计算的值
	Teff            6158
	FeH             -0.412
}

// Object * 49 Cas  ---  Star  ---  OID=@266859   (@@4524,10)  ---  coobox=2359 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "49 Cas A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "49 Cas"
	Class           "G8III"
	AbsMagn         -0.44
	MassSol         2.6
	RadSol          16.6
	LumBol          140
	Teff            5087
	FeH             -0.04
	Age             0.647

	BinaryOrbit     
	{
		Epoch           2454467
		Separation      694.417674564172 // 7.7763 asec
		PositionAngle   244
	}
}

Star "49 Cas B"
{
	DateUpdated     "2024-04-30"
	ParentBody      "49 Cas"
	Class           ""
	MassSol         0.81
	RadSol          0.76
	LumBol          0.28
	Teff            4886
	Age             1.6
}

// Object * 48 Cas A  ---  High Proper Motion Star  ---  OID=@254300   (@@4106,7)  ---  coobox=2362 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Barycenter "48 Cas AB"
{
	ParentBody      "48 Cas"
	BinaryOrbit     
	{
		Separation      816.5
	}
}

Star "48 Cas A/ADS 1598 A/BD+70 153A/CSI+70 153 4/UBV 1998/WDS J02020+7054A/** BU 513A/CCDM J02020+7054A/TYC 4315-2126-1/PMSC 01537+7025A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "48 Cas AB"
	Class           "A2V"
	AbsMagn         1.75
	MassSol         1.93
	Radius          1341444.97957057 // 计算的值
	LumBol          17.8
	Teff            8538
	FeH             -0.4
	Age             0.376

	BinaryOrbit     
	{
		Period          61.14
		Separation      21.6501067326622 // 0.614 asec
		Eccentricity    0.355
		Inclination     16.7
		AscendingNode   48.2
		Epoch           2438523.649011557456106
		ArgOfPericenter 199.5
		MeanAnomaly     0
	}
}

// Object * 48 Cas B  ---  High Proper Motion Star  ---  OID=@254301   (@@4106,8)  ---  coobox=2362 
// Object types: High Proper Motion Star,Variable Star,Double or Multiple Star,Star 
Star "48 Cas B"
{
	DateUpdated     "2024-04-30"
	ParentBody      "48 Cas AB"
	Class           "F2V"
	MassSol         1.17
}

// Object UCAC3 322-16229  ---  High Proper Motion Star  ---  OID=@254298   (@@4106,5)  ---  coobox=2362 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC3 322-16229/Gaia DR3 522186113873620224/TIC 379483908/ADS 1598 C/CCDM J02020+7054C/CSI+70 153 2/IDS 01537+7025 C/WDS J02020+7054C/2MASS J02020114+7054392/** BU 513C/PMSC 01537+7025C/Gaia DR2 522186113873620224"
{
	DateUpdated     "2024-04-30"
	ParentBody      "48 Cas"
	Class           "M3?"
	MassSol         0.5
}

// Object * 42 Cas  ---  Eclipsing Binary  ---  OID=@240937   (@@4105,6)  ---  coobox=2349 
// Object types: High Proper Motion Star,Eclipsing Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "42 Cas A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "42 Cas"
	Class           "B9V"
	AbsMagn         0.53
	MassSol         2.68
	RadSol          2.63
	LumBol          66.12
	Teff            10141
	Age             0.067

	BinaryOrbit     
	{
		PeriodDays      16.77 // 食双星周期
	}
}

Star "42 Cas B"
{
	ParentBody      "42 Cas"
	Class           "A4.9?"
}

// Object * 38 Cas  ---  Spectroscopic Binary  ---  OID=@240524   (@@4507,4)  ---  coobox=2342 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "38 Cas A" {ParentBody "38 Cas"}
Remove "38 Cas B" {ParentBody "38 Cas"}
Star "38 Cas A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "HIP 7078"
	Class           "F6V"
	AbsMagn         3.7
	MassSol         1.22
	RadSol          1.3
	LumBol          2.5
	Teff            6365.60822854293 // 计算的值

	BinaryOrbit     
	{
		PeriodDays      134.1301
		Eccentricity    0.2398
		Inclination     85.6
		AscendingNode   163.4 
		Epoch           2454350.29
		ArgOfPericenter 194.45
		MeanAnomaly     0
	}
}

Star "38 Cas B"
{
	DateUpdated     "2024-04-30"
	ParentBody      "HIP 7078"
	Class           ""
	AbsMagn         5.3
	MassSol         0.92
	RadSol          0.82
	LumBol          0.6
	Teff            5609.93031800143 // 计算的值
}