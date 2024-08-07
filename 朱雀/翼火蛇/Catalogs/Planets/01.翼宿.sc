// Object * gam Crt  ---  High Proper Motion Star  ---  OID=@1813780   (@@37614,3)  ---  coobox=14817 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "GAM Crt A" {ParentBody "GAM Crt"}
Remove "GAM Crt B" {ParentBody "GAM Crt"}
Star "GAM Crt A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "HIP 55705"
	Class           "A9V"
	AbsMagn         2.05
	MassSol         1.81
	RadSol          1.3
	LumBol          18.8
	Teff            8020
	FeH             -0.01
	Age             0.757

	BinaryOrbit     
	{
		Epoch           2455197
		Separation      125.6
		PositionAngle   93.1
	}
}

Star "GAM Crt B"
{
	DateUpdated     "2024-07-31"
	ParentBody      "HIP 55705"
	Class           ""
	MassSol         0.75
}

// Object * zet Crt  ---  Double or Multiple Star  ---  OID=@1854471   (@@38480,10)  ---  coobox=14835 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "ZET Crt A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "ZET Crt"
	Class           "G8.5III"
	AbsMagn         -0.66
	MassKg          4.87893449944189e+30 // log(g) = 2.60 cm/s^2
	RadSol          13
	LumBol          157
	Teff            4992
	FeH             0.03
	Age             0.251

	BinaryOrbit     
	{
		Epoch           2448258
		Separation      21.0285988229714 // 0.20 asec
		PositionAngle   22
	}
}

Star "ZET Crt B"
{
	ParentBody      "ZET Crt"
	Class           "B9.6?"
}

// Object * lam Crt  ---  Spectroscopic Binary  ---  OID=@1813794   (@@37615,2)  ---  coobox=14819 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "LAM Crt A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "LAM Crt"
	Class           "F5III"
	AbsMagn         1.92
	MassSol         1.78
	RadSol          2.8
	LumBol          14.4
	Teff            6582
	FeH             -0.15

	BinaryOrbit     
	{
		PeriodDays      1940
		Eccentricity    0.54
		Epoch           2432722
		ArgOfPericenter 320.7
		MeanAnomaly     0
	}
}

Star "LAM Crt B"
{
	ParentBody      "LAM Crt"
	Class           "F4.8?"
}

// Object * iot Crt  ---  High Proper Motion Star  ---  OID=@1853197   (@@38034,11)  ---  coobox=14802 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=101198
Barycenter "IOT Crt AB"
{
	ParentBody      "IOT Crt"
	BinaryOrbit     
	{
		Period          84629
		Separation      2472.00964445232 // 92.07 asec
	}
}

Star "IOT Crt A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "IOT Crt AB"
	Class           "F6.5V"
	AbsMagn         3.33
	MassSol         1.19
	Radius          920949.601105041 // log(g) = 4.27 cm/s^2
	LumBol          2.378338063190061 // 计算的值
	Teff            6230
	FeH             -0.15
	Age             4.45

	BinaryOrbit     
	{
		Epoch           2456658
		Period          114.326
		Separation      25
		PositionAngle   248
	}
}

Star "IOT Crt B"
{
	DateUpdated     "2024-07-31"
	ParentBody      "IOT Crt AB"
	Class           "M3"
	MassSol         0.57
}

// Object UCAC4 384-059519  ---  White Dwarf  ---  OID=@15318953   (@@-1,255)  ---  coobox=14802 
// Object types: High Proper Motion Star,White Dwarf,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,White Dwarf Candidate,White Dwarf Candidate 
Star "UCAC4 384-059519/Gaia DR3 3585097235918075776/WISEA J113840.65-131336.8/TIC 40535158/** UC 2181C/WDS J11387-1312C/2MASS J11384066-1313387/WISE J113840.67-131337.0/Gaia DR2 3585097235918075776"
{
	DateUpdated     "2024-07-31"
	ParentBody      "IOT Crt"
	Class           "DC"
	MassSol         0.15
}

// Object HD 96220  ---  Double or Multiple Star  ---  OID=@1794272   (@@36841,0)  ---  coobox=14740 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "HD 96220 A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "HD 96220"
	Class           "F0V"
	AbsMagn         2.26 // 计算的值
	MassKg          2.69547398088741e+30 // log(g) = 3.927 cm/s^2
	RadSol          2.097 // Gaia DR3
	LumBol          9.80917224263904 // 计算的值
	Teff            7054
	FeH             -0.581

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   12.2353247
		Eccentricity    0.883755204
		Inclination     1.43781447
		AscendingNode   0
		ArgOfPericenter -169.900897
		MeanAnomaly     115.080894
	}
}

Star "HD 96220 B"
{
	ParentBody      "HD 96220"
	Class           "F5.6?"
}

// Object * bet Crt  ---  Spectroscopic Binary  ---  OID=@1795734   (@@37263,3)  ---  coobox=15125 
// Object types: Spectroscopic Binary,High Proper Motion Star,White Dwarf,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "BET Crt A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "BET Crt"
	Class           "A2III"
	AbsMagn         -0.62
	MassKg          6.15487341271654e+30 // log(g) = 3.5 cm/s^2
	Radius          3604229.39601081 // 计算的值
	LumBol          147
	Teff            8830

	BinaryOrbit     
	{
		Period          6.0
		Separation      9.3
	}
}

Star "BET Crt B"
{
	DateUpdated     "2024-07-31"
	ParentBody      "BET Crt"
	Class           "DA1.4"
	AbsMagn         8.19
	MassSol         0.43
	Radius          18783.9
	LumBol          1.2156830396397513
	Teff            36885
}

// Object HD 100219  ---  Double or Multiple Star  ---  OID=@1835119   (@@38079,3)  ---  coobox=14828 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 100219 A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "HD 100219"
	Class           "F8V"
	AbsMagn         3.26 // 计算的值
	MassKg          2.13964834872615e+30 // log(g) = 3.95 cm/s^2
	RadSol          1.8195 // Gaia DR3
	LumBol          4.06507777257101 // 计算的值
	Teff            6076
	FeH             -0.272

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.520706824
		Eccentricity    0.105384267
		Inclination     1.65106249
		AscendingNode   0
		ArgOfPericenter -123.858569
		MeanAnomaly     -99.3385193
	}
}

Star "HD 100219 B"
{
	ParentBody      "HD 100219"
	Class           "M0.2?"
}

// Object * chi01 Hya  ---  Double or Multiple Star  ---  OID=@1795931   (@@36894,10)  ---  coobox=15134 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "CHI1 Hya A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "CHI1 Hya"
	Class           "F4V"
	AbsMagn         1.74
	MassSol         1.93
	RadSol          3.19
	LumBol          17.798
	Teff            6637
	FeH             -0.10
	Age             1.3

	BinaryOrbit     
	{
		Period          7.5535
		Separation      6.15955048152501 // 0.1388 asec
		Eccentricity    0.349
		Inclination     96.50
		AscendingNode   224.00
		Epoch           2445501.601219268515706
		ArgOfPericenter 163.0
		MeanAnomaly     0
	}
}

Star "CHI1 Hya B"
{
	DateUpdated     "2024-07-31"
	ParentBody      "CHI1 Hya"
	Class           "F7V"
	MassSol         1.93
}