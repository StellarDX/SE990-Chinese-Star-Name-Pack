// Object * eta Lyr  ---  Spectroscopic Binary  ---  OID=@2924921   (@@58574,0)  ---  coobox=19954 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Barycenter "ETA Lyr A"
{
	ParentBody      "ETA Lyr"
	BinaryOrbit     
	{
		Epoch           2457754
		Separation      9757.1031018101 // 28.40 asec
		PositionAngle   81
	}
}

Star "ETA Lyr Aa"
{
	DateUpdated     "2024-06-07"
	ParentBody      "ETA Lyr A"
	Class           "B2.5IV"
	AbsMagn         -3.71
	MassSol         10.1 // 9.97
	RadSol          4.3
	Luminosity      6605
	LumBol          19095
	Teff            19525 // 17360
	FeH             -0.01
	Age             0.0225

	BinaryOrbit     
	{
		PeriodDays      56.4
		//Separation      0.01231 // 粘一块了
		Eccentricity    0.53
		Epoch           2441868.4
		ArgOfPericenter 157
		MeanAnomaly     0
	}
}

Star "ETA Lyr Ab"
{
	ParentBody      "ETA Lyr A"
	Class           "B6.5?"
}

// Object BD+38 3491  ---  Star  ---  OID=@2924923   (@@58574,2)  ---  coobox=19954 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+38 3491/Gaia DR3 2099678501632598400/TIC 121605725/ADS 12197 B/AG+39 1913/CCDM J19138+3908B/GCRV 11688/GEN# +0.03803491/GEN# +1.20180163/HGAM 741/IDS 19104+3858 B/SAO 68014/UBV 16297/UBV M 2886/2MASS J19134788+3908502/WDS J19138+3909B/** STF 2487B/UCAC3 259-149050/TYC 3121-2284-1/UCAC4 646-067129/WEB 16468/KIC 4046291/Gaia DR2 2099678501632598400"
{
	DateUpdated     "2024-06-07"
	ParentBody      "ETA Lyr"
	Parallax        2.8173
	Class           "A0IVn"
	MassKg          5.60373955966712e+30 // log(g) = 4.108 cm/s^2
	RadSol          2.454821 // Gaia DR3
	LumBol          72.50487279809 // 计算的值
	Teff            10750
	FeH             0.245
}

// Object * tet Lyr  ---  Star  ---  OID=@2924945   (@@58576,0)  ---  coobox=19954 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "TET Lyr A"
{
	DateUpdated     "2024-06-07"
	ParentBody      "TET Lyr"
	Class           "K0II"
	AbsMagn         -2.76
	MassKg          2.00533989722839e+31 // log(g) = 1.93 cm/s^2
	RadSol          57
	LumBol          1200.3100564306146 // 计算的值
	Teff            4500
	FeH             -0.01
}

// Object BD+37 3399  ---  Star  ---  OID=@2924947   (@@58576,2)  ---  coobox=19954 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "BD+37 3399/Gaia DR3 2099384313552842752/TIC 121937437/UCAC4 641-067254/TYC 3121-1358-1/AG+38 1815/BDS 9186 B/CCDM J19164+3808B/IDS 19129+3757 B/PPM 82615/2MASS J19163000+3808351/WDS J19164+3808B/** SHJ 292B/Gaia DR2 2099384313552842752"
{
	ParentBody      "TET Lyr"
	BinaryOrbit     
	{
		Separation      23651.9459706967 // 99.35 asec
	}
}

Star "BD+37 3399 A"
{
	DateUpdated     "2024-06-07"
	ParentBody      "BD+37 3399"
	Parallax        1.1424
	Class           "K2III"

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.60376971
		Eccentricity    0
		Inclination     1.9514432
		AscendingNode   0
		ArgOfPericenter -68.4372383
		MeanAnomaly     116.811395
	}
}

Star "BD+37 3399 B"
{
	ParentBody      "BD+37 3399"
	Class           "B5.5?"
}

// Object * 4 Cyg  ---  alpha2 CVn Variable  ---  OID=@2901718   (@@59101,0)  ---  coobox=19951 
// Object types: alpha2 CVn Variable,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "4 Cyg A"
{
	DateUpdated     "2024-06-07"
	ParentBody      "4 Cyg"
	Class           "B8IIpSi(FeII)"
	AbsMagn         -1.51
	MassSol         4.08
	RadSol          5.03
	LumBol          501
	Teff            12190
	Age             0.145 

	BinaryOrbit     
	{
		PeriodDays      35.0225
		Eccentricity    0.45
		Epoch           2438929.1
		ArgOfPericenter 110
		MeanAnomaly     0
	}
}

Star "4 Cyg B"
{
	ParentBody      "4 Cyg"
	Class           "B9.4?"
}

// Object * 17 Cyg  ---  High Proper Motion Star  ---  OID=@2903439   (@@60066,0)  ---  coobox=20300 
// Object types: Rotating Variable,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=97295
Star "17 Cyg A"
{
	DateUpdated     "2024-06-07"
	ParentBody      "17 Cyg"
	Class           "F7V"
	AbsMagn         3.40
	MassSol         1.24
	RadSol          1.538
	LumBol          3.66
	Teff            6455
	FeH             0.027
	Age             2.8
}

// Object * 17 Cyg B  ---  High Proper Motion Star  ---  OID=@2903440   (@@60066,1)  ---  coobox=20300 
// Object types: High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star 
Star "17 Cyg B/GJ 9670 B/GJ 767.1 B/Gaia DR3 2035035258143206016/TIC 58445708/GSC 02660-04231/ASCC 616420/UCAC2 43666124/2MASS J19462754+3343496/LSPM J1946+3343E/USNO-B1.0 1237-00383697/ADS 12913 B/AG+33 1832/BD+33 3589/CCDM J19465+3343B/CSV 8290/GC 27371/GCRV 12151/GEN# +1.00225732/HD 225732/LTT 15775/NLTT 48228/NSV 12398/PPM 83518/SAO 68830/UBV 16840/UBV M 27459/uvby98 100225732/WDS J19464+3344B/** STF 2580B/PMSC 19426+3329B/WISEA J194627.54+334344.1/TYC 2660-4231-1/UCAC4 619-083792/WEB 17097/Gaia DR2 2035035258143206016"
{
	DateUpdated     "2024-06-07"
	ParentBody      "17 Cyg A"
	Parallax        47.7379
	Class           "K6V"
	MassSol         0.65

	Orbit     
	{
		Period          8976
		SemiMajorAxis   547.515717836694 // 26.09 asec
		ArgOfPericenter 68.7
		MeanAnomaly     0
	}
}

// Object HD 186858  ---  Double or Multiple Star  ---  OID=@2903435   (@@60065,5)  ---  coobox=20300 
// Object types: Variable Star,High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,X-ray Source 
Barycenter "HD 186858/GJ 765.4/1RXS J194535.0+333558/HIP 97222/GEN# +1.00186858/TIC 57864885/PLX 4648/LSPM J1945+3336/NLTT 48207/ASCC 616187/USNO-B1.0 1236-00380319/ADS 12889 AB/BD+33 3582/CCDM J19456+3336AB/CSI+33 3582 1/CSV 102960/Ci 18 2579/Ci 20 1164/G 125-29/GC 27350/GCRV 12132/HIC 97222/IDS 19418+3322 AB/LTT 15766/NSV 12386/SAO 68799/SKY# 36937/UBV 16828/2MASS J19453355+3336068/IDS 19418+3322/WDS J19464+3344FG/** STF 2576AB/AKARI-IRC-V1 J1945335+333602/IRAS 19436+3328/WISEA J194533.56+333601.3/WEB 17069"
{
	ParentBody      "17 Cyg A"
	Orbit     
	{
		Period          1.132E6
		SemiMajorAxis   16618.1096477083 // 791.88 asec
		ArgOfPericenter 235.3
		MeanAnomaly     0
	}
}

// Object HD 186858A  ---  High Proper Motion Star  ---  OID=@2871474   (@@59584,14)  ---  coobox=20300 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "HD 186858A/GJ 9669 A/GJ 765.4 A/Gaia DR3 2035020964491479552/ADS 12889 A/BD+33 3582A/CCDM J19456+3336A/CSI+33 3582 5/IDS 19418+3322 A/** STF 2576A/TYC 2660-31-1/WDS J19464+3344F/Gaia DR2 2035020964491479552"
{
	DateUpdated     "2024-06-07"
	ParentBody      "HD 186858"
	Parallax        47.6711
	AppMagn         8.36
	Class           "K3V"
	AbsMagn         6.75 // 计算的值
	MassKg          1.40763178277852e+30 // log(g) = 4.542 cm/s^2
	RadSol          0.7464924 // Gaia DR3
	LumBol          0.237970650197224 // 计算的值
	Teff            4666
	FeH             -0.263

	BinaryOrbit // Sod1999
	{
		Period          232.0000
		Separation      43.7262250422576 // 2.070 asec
		Eccentricity    0.770
		Inclination     156.0
		AscendingNode   91.0
		Epoch           2431565.785124779213220
		ArgOfPericenter 128.0
		MeanAnomaly     0
	}
}

// Object HD 186858B  ---  High Proper Motion Star  ---  OID=@8047855   (@@-1,255)  ---  coobox=20300 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "HD 186858B/GJ 9669 B/GJ 765.4 B/Gaia DR3 2035021028896869888/TYC 2660-31-2/GSC 02660-00031/** STF 2576B/ADS 12889 B/BD+33 3582B/CCDM J19456+3336B/CSI+33 3582 6/IDS 19418+3322 B/WDS J19464+3344G/Gaia DR2 2035021028896869888"
{
	DateUpdated     "2024-06-07"
	ParentBody      "HD 186858"
	Parallax        47.6711
	AppMagn         8.36
	Class           "K3V"
	AbsMagn         6.85 // 计算的值
	MassKg          1.49903521484347e+30 // log(g) = 4.619 cm/s^2
	RadSol          0.7049962 // Gaia DR3
	LumBol          0.210797359881272 // 计算的值
	Teff            4658
	FeH             0.188
}

Star "17 Cyg Proper Motion Companion"
{
	DateUpdated     "2024-06-07"
	ParentBody      "17 Cyg A"
	Class           "M0.4"

	Orbit     
	{
		SemiMajorAxis   16320
	}
}