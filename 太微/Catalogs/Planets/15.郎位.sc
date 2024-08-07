// Object * 17 Com  ---  alpha2 CVn Variable  ---  OID=@1930345   (@@40042,0)  ---  coobox=13491 
// Object types: Chemically Peculiar Star,Double or Multiple Star,Variable Star,alpha2 CVn Variable,Near-IR Source (λ < 3 µm),Star,Star,Optical Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=60904
Star "17 Com A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "17 Com"
	Class           "B9VCrEu"
	AbsMagn         0.98 // 2.61 / 2.75
	MassSol         2.38
	RadSol          2.09
	LumBol          42.7
	Teff            10212 // 9309
	Age             0.101
}

// Object HD 108651  ---  Spectroscopic Binary  ---  OID=@1930006   (@@40025,3)  ---  coobox=13491 
// Object types: Spectroscopic Binary,Chemically Peculiar Star,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Optical Source 
Barycenter "HD 108651/LAMOST J122844.57+255405.8/HIP 60891/AP J12284457+2553575/Gaia DR3 3960724286666918016/WISEA J122844.54+255357.1/TIC 393808110/Cl* Melotte 111 AV 1808/Cl* Melotte 111 BOU 14/SBC9 727/AG+26 1276/BD+26 2353/GC 17007/GCRV 7502/GSC 01989-03208/HIC 60891/HR 4751/JP11 5070/PPM 101925/ROT 3938/SAO 82328/SBC7 464/SKY# 23342/TYC 1989-3208-1/UBV 11212/UBV M 41711/YZ 26 6132/[SS59] I 289/2MASS J12284457+2553575/Cl Melotte 111 145/Renson 31540/WEB 10836/Gaia DR2 3960724286666918016/** BU 1080B/IDS 12239+2628 B/ADS 8568 B/CCDM J12289+2554B/GEN# +5.21110145/WDS J12289+2555B/WISE J122844.56+255357.3/17 Com B"
{
	ParentBody      "17 Com"
	BinaryOrbit     
	{
		Epoch           2458119
		Separation      11169.2345606065 // 145.19 asec
		PositionAngle   251
	}
}

Barycenter "HD 108651 A"
{
	ParentBody      "HD 108651"
	BinaryOrbit     
	{
		Separation      112.341935174147 // 1.57 asec
	}
}

Star "HD 108651 Aa"
{
	DateUpdated     "2024-05-06"
	ParentBody      "HD 108651 A"
	Class           "kA2hA9VmF0"
	AbsMagn         2.46
	MassSol         1.74
	Radius          1088270.8777541 // log(g) = 4.29 cm/s^2
	LumBol          9.340868213514824 // 计算的值
	Teff            8068

	BinaryOrbit     
	{
		PeriodDays      68.290
		Eccentricity    0.296
		Epoch           2448313.4
		ArgOfPericenter 80.7
		MeanAnomaly     0
	}
}

Star "HD 108651 Ab"
{
	ParentBody      "HD 108651 A"
	Class           ""
	MassSol         0.43
}

// Object HD 108651B  ---  Star  ---  OID=@15318955   (@@-1,255)  ---  coobox=13491 
// Object types: Double or Multiple Star,Star 
Star "HD 108651 B"
{
	DateUpdated     "2024-05-06"
	ParentBody      "HD 108651"
	Parallax        13.5493
	Class           ""
	MassSol         0.59
}

// Object * 13 Com  ---  alpha2 CVn Variable  ---  OID=@1929880   (@@39522,0)  ---  coobox=13490 
// Object types: alpha2 CVn Variable,Near-IR Source (λ < 3 µm),Variable Star,Star,UV-emission Source 
Star "13 Com A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "13 Com"
	Class           "A3V"
	AbsMagn         0.38
	MassSol         2.83
	Radius          2312048.19733782 // 计算的值
	LumBol          60.93
	Teff            8846
	FeH             0.24
	Age             0.429

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   108.738032
		Eccentricity    0.623467903
		Inclination     0.1779356
		AscendingNode   0
		ArgOfPericenter 160.561888
		MeanAnomaly     -179.196158
	}
}

Star "13 Com B"
{
	ParentBody      "13 Com"
	Class           "A7.4?"
}

// Object * 12 Com  ---  Spectroscopic Binary  ---  OID=@1931055   (@@108913,7)  ---  coobox=13490 
// Object types: Variable Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Star,Star,UV-emission Source,X-ray Source 
Star "12 Com A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "12 Com"
	Class           "F6III"
	AbsMagn         0.55
	MassSol         2.6
	RadSol          8.9
	LumBol          56.2
	Teff            5300
	Age             0.670

	BinaryOrbit     
	{
		PeriodDays      396.54
		Eccentricity    0.566
		Inclination     66
		Epoch           2444502.4
		ArgOfPericenter 275.5
		MeanAnomaly     0
	}
}

Star "12 Com B"
{
	DateUpdated     "2024-05-06"
	ParentBody      "12 Com"
	Class           "A3V"
	AbsMagn         1.05
	MassSol         2.05
	RadSol          2.5
	LumBol          30.2
	Teff            8500
}

// Object * 21 Com  ---  alpha2 CVn Variable  ---  OID=@1931413   (@@40067,0)  ---  coobox=13497 
// Object types: delta Sct Variable,alpha2 CVn Variable,Eclipsing Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,UV-emission Source 
Star "21 Com A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "21 Com"
	Class           "A2Vp"
	AbsMagn         0.66
	MassSol         2.29
	RadSol          2.6
	LumBol          38.2
	Teff            8900
	RotationPeriod  49.25256
	Age             0.400 // 0.800

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.950053416
		Eccentricity    0.280115242
		Inclination     -1.9105444
		AscendingNode   0
		ArgOfPericenter 119.571042
		MeanAnomaly     -69.9535576
	}
}

Star "21 Com B(?)" // 存疑
{
	ParentBody      "21 Com"
	Class           "A7.6?"
}

// Object * 18 Com  ---  Star  ---  OID=@1931354   (@@40061,4)  ---  coobox=13497 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "18 Com A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "18 Com"
	Class           "F5IV"
	AbsMagn         1.56 // 计算的值
	MassKg          2.75942600366735e+30 // log(g) = 3.506 cm/s^2
	RadSol          3.445008 // Gaia DR3
	LumBol          18.3458690606147 // 计算的值
	Teff            6436
	FeH             -0.67

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   214.602937
		Eccentricity    0.232789563
		Inclination     2.48103946
		AscendingNode   0
		ArgOfPericenter 11.3741843
		MeanAnomaly     110.43319
	}
}

Star "18 Com B"
{
	ParentBody      "18 Com"
	Class           "G9.3?"
}

// Object * 23 Com  ---  Double or Multiple Star  ---  OID=@1958021   (@@40064,0)  ---  coobox=13502 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=61394 
// (NoirLab说这个系统还有第三个成员位于距主星169.870秒处，质量为0.71太阳质量，但是Simbad和Wikipedia均未提及)
Star "23 Com A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "23 Com"
	Class           "A0IV"
	AbsMagn         -0.08
	MassSol         2.15
	RadSol          3.0
	LumBol          104.00
	Teff            9675
	Age             0.210

	BinaryOrbit     
	{
		Period          33.04
		Separation      24.0275578450668 // 0.219 asec
		Eccentricity    0.898
		Inclination     109.7
		AscendingNode   24.3
		Epoch           2438622.264405228197575
		ArgOfPericenter 34.5
		MeanAnomaly     0
	}
}

Star "23 Com B"
{
	ParentBody      "23 Com"
	Class           ""
	MassSol         1.78
}

// Object * 26 Com  ---  Spectroscopic Binary  ---  OID=@1959343   (@@40720,2)  ---  coobox=13844 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source 
Star "26 Com A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "26 Com"
	Class           "G9IIIb"
	AbsMagn         0.878 // 计算的值
	MassKg          3.87461313886362e+30 // log(g) = 2.717 cm/s^2
	RadSol          10.125 // Gaia DR3
	LumBol          56.989635154903 // 计算的值
	Teff            4984
	FeH             -0.088

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.608616343
		Eccentricity    0.58059598
		Inclination     -1.27454257
		AscendingNode   0
		ArgOfPericenter 15.0288401
		MeanAnomaly     -74.3321668
	}
}

Star "26 Com B"
{
	ParentBody      "26 Com"
	Class           "F7.1?"
}

// Object * 2 Com A  ---  Star  ---  OID=@5475388   (@@-1,255)  ---  coobox=13824 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "2 Com A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "2 Com"
	Parallax        9.6109
	AppMagn         6.15
	Class           "F0IV-V"
	AbsMagn         1.06 // 计算的值
	MassKg          3.30502793109547e+30 // log(g) = 3.633 cm/s^2
	RadSol          3.25738 // Gaia DR3
	LumBol          29.84525660893 // 计算的值
	Teff            7475
	FeH             -0.669

	BinaryOrbit     
	{
		Separation      387.060617896955 // 3.72 asec
	}
}

// Object * 2 Com B  ---  Star  ---  OID=@11606348   (@@-1,255)  ---  coobox=13824 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "2 Com B"
{
	ParentBody      "2 Com"
	Class           "A8.3?"
}