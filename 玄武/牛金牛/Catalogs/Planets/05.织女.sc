// Object * alf Lyr  ---  delta Sct Variable  ---  OID=@2900336   (@@133322,0)  ---  coobox=19821 
// Object types: delta Sct Variable,Mid-IR Source (3 to 30 µm),Sub-Millimetric Source,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Vega" {ParentBody "ALF Lyr"}
Star "织女/Vega A" 
{
	DateUpdated     "2024-06-02"
	ParentBody      "ALF Lyr"
	Class           "A0Va"
	AbsMagn         0.582
	MassSol         2.135
	DimensionsSol   (5.636, 4.724, 5.636)
	LumBol          40.12
	Teff            9602 // 8152(赤道) - 10060(极地)
	FeH             -0.5
	RotationPeriod  16.3
	Obliquity       6.2
	Age             0.455
}

Planet "Vega b"
{
	DateUpdated     "2024-06-02"
	ParentBody      "Vega A"
	DiscMethod      "Astrometry" // 光谱分析发现
	DiscDate        "2021"
	Msini           21.9
	Mass            203

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.04555
		PeriodDays      2.42977
		Eccentricity    0.25
		Inclination     0
		AscendingNode   0
	}
}

Planet "Vega c(?)"
{
	DateUpdated     "2024-06-02"
	ParentBody      "Vega A"
	DiscMethod      "Astrometry" // 光谱分析发现
	DiscDate        "2021"
	Msini           80
	Mass            740

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      196.4
		Inclination     0
		AscendingNode   0
	}
}


Remove "EPS1 Lyr"{ParentBody "EPS Lyr"}
Remove "EPS2 Lyr"{ParentBody "EPS Lyr"}
Remove "EPS Lyr A"{ParentBody "EPS1 Lyr"}
Remove "EPS Lyr B"{ParentBody "EPS1 Lyr"}
Remove "EPS Lyr C"{ParentBody "EPS2 Lyr"}
Remove "EPS Lyr D"{ParentBody "EPS2 Lyr"}

// ----------------------------------------------------------------------------------------------------

// Object * eps01 Lyr  ---  Double or Multiple Star  ---  OID=@2923752   (@@56903,0)  ---  coobox=19834 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=91926
Barycenter "织女二/EPS1 Lyr/HIP 91919/GEN# +1.00173582/WISEA J184420.32+394013.9/TIC 336123628/ADS 11635 AB/AG+39 1834/BD+39 3509/CCDM J18443+3938AB/CSI+39 3509 3/HIC 91919/IDS 18410+3934 AB/PPM 81725/UBV 15949/** STF 2382AB/WDS J18443+3940AB/AKARI-IRC-V1 J1844203+394013/IRAS 18426+3937/2MASS J18442032+3940134/WISE J184420.31+394013.8/1RXS J184420.5+394012/** STF 4037AB"
{
	ParentBody      "ADS 11635"
	BinaryOrbit     
	{
		Period          376490
		Separation      10500 // When?
		PositionAngle   172
	}
}

// Object * eps02 Lyr  ---  Double or Multiple Star  ---  OID=@2923757   (@@56903,5)  ---  coobox=19834 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Barycenter "织女增二/EPS2 Lyr/HIP 91926/WISEA J184422.87+393646.6/TIC 336123695/WDS J18443+3940CD/5 Lyr/AAVSO 1841+39/ADS 11635 CD/AG+39 1835/BD+39 3510/CCDM J18443+3938CD/CSI+39 3510 1/HD 173607J/HIC 91926/IDS 18410+3934 CD/N30 4160/PPM 81726/UBV 15950/UBV 15951/** STF 2383CD/2MASS J18442286+3936459/WISE J184422.87+393646.4/AKARI-IRC-V1 J1844228+393646/IRAS 18427+3933/** STF 4037CD/uvby98 100173607 CD/GEN# +1.00173607"
{
	ParentBody      "ADS 11635"
}

// ----------------------------------------------------------------------------------------------------

// Object * eps01 Lyr A  ---  High Proper Motion Star  ---  OID=@2923751   (@@56902,12)  ---  coobox=19834 
// Object types: High Proper Motion Star,Double or Multiple Star,Star,UV-emission Source 
Barycenter "EPS1 Lyr A/Gaia DR3 2098237660364079232/PLX 4326/4 Lyr A/ADS 11635 A/BD+39 3509A/CCDM J18443+3938A/CEL 4646/CSI+39 3509 2/GC 25667/GCRV 11194/HD 173582/HR 7051/IDS 18410+3934 A/ROT 2653/SAO 67310/SKY# 34409/UBV M 23199/WDS J18443+3940A/** STF 2382A/PMSC 18410+3933A/TYC 3122-3438-2/WEB 15825/Gaia DR2 2098237660363229312"
{
	ParentBody      "HIP 91919"
	BinaryOrbit // Circ.202 Docobo,Campo
	{
		Period          2802.8000
		Separation      688.07362232685 // 14.237 asec
		Eccentricity    0.953
		Inclination     258.8
		AscendingNode   149.6
		Epoch           2470350.854213333688676
		ArgOfPericenter 258.8
		MeanAnomaly     0
	}
}

// Object * eps01 Lyr B  ---  High Proper Motion Star  ---  OID=@2923750   (@@56902,11)  ---  coobox=19834 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "EPS1 Lyr B/Gaia DR3 2098237656065233792/4 Lyr B/ADS 11635 B/BD+39 3509B/CCDM J18443+3938B/CSI+39 3509 1/GC 25666/GCRV 11193/HD 173583/HR 7052/IDS 18410+3934 B/ROT 2654/SAO 67309/WDS J18443+3940B/** STF 2382B/PMSC 18410+3933B/TYC 3122-3438-1/WEB 15826/Gaia DR2 2098237656065233792"
{
	DateUpdated     "2024-06-02"
	ParentBody      "HIP 91919"
	Parallax        20.4574
	AppMagn         6.062
	Class           "F0V"
	AbsMagn         2.62 // 计算的值
	MassSol         1.61
	Radius          1352714.87041587 // 计算的值
	LumBol          8.4
	Teff            7047
}

// ----------------------------------------------------------------------------------------------------

// Object * eps02 Lyr A  ---  Double or Multiple Star  ---  OID=@2923758   (@@56903,6)  ---  coobox=19834 
// Object types: Double or Multiple Star,Star,UV-emission Source 
Barycenter "EPS2 Lyr A/Gaia DR3 2098202128093842432/ADS 11635 C/CCDM J18443+3938C/CEL 4647/CSI+39 3510 2/GC 25668/GCRV 11195/HD 173607/HR 7053/IDS 18410+3934 C/ROT 2655/SAO 67315/SKY# 34411/TD1 23135/UBV M 23200/WDS J18443+3940C/PMSC 18410+3933C/PMSC 18410+3933CP/WDS J18443+3940Ca,Cb/** CHR 77/TYC 3122-3439-1/** STF 2383C/WEB 15830/5 Lyr A/Gaia DR2 2098202128093842432"
{
	ParentBody      "HIP 91926"
	BinaryOrbit // Circ.202 Docobo,Campo
	{
		Period          724.3000
		Separation      143.56447956227 // 2.920 asec
		Eccentricity    0.353
		Inclination     102.2
		AscendingNode   26.5
		Epoch           2533322.261705165728927
		ArgOfPericenter 73.8
		MeanAnomaly     0
	}
}

// Object * eps02 Lyr B  ---  High Proper Motion Star  ---  OID=@2923759   (@@56903,7)  ---  coobox=19834 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "EPS2 Lyr B/Gaia DR3 2098202128100428288/ADS 11635 D/CCDM J18443+3938D/CSI+39 3510 3/GCRV 11196/HD 173608/HR 7054/IDS 18410+3934 D/ROT 2656/WDS J18443+3940D/PMSC 18410+3933D/** STF 2383D/TYC 3122-3439-2/WEB 15831/5 Lyr B/Gaia DR2 2098202128100428288"
{
	DateUpdated     "2024-06-02"
	ParentBody      "HIP 91926"
	Parallax        20.4544
	AppMagn         5.35
	Class           "A7Vn"
	AbsMagn         1.90 // 计算的值
	MassSol         2.15
	Radius          2126618.42130762 // 计算的值
	LumBol          32
	Teff            7852
}

// ----------------------------------------------------------------------------------------------------

Star "EPS1 Lyr Aa"
{
	DateUpdated     "2024-06-02"
	ParentBody      "EPS1 Lyr A"
	Class           "A3V"
	AbsMagn         1.2
	MassSol         2.03
	Radius          1799747.83572818 // 计算的值
	LumBol          24
	Teff            7943

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.150672332
		Eccentricity    0
		Inclination     -2.47150993
		AscendingNode   0
		ArgOfPericenter 137.184539
		MeanAnomaly     64.31027
	}
}

Star "EPS1 Lyr Ab(?)"
{
	ParentBody      "EPS1 Lyr A"
	Class           "K3.1?"
}

// ----------------------------------------------------------------------------------------------------

Star "EPS2 Lyr Aa"
{
	DateUpdated     "2024-06-02"
	ParentBody      "EPS2 Lyr A"
	Class           "A6Vn"
	AbsMagn         1.2
	MassSol         2.11
	Radius          2043172.62778122 // 计算的值
	LumBol          29
	Teff            7816

	BinaryOrbit     
	{
		Separation      5 // When?
		PositionAngle   225
	}
}

Star "EPS2 Lyr Ab"
{
	ParentBody      "EPS2 Lyr A"
	Class           "F9.9?"
}

// ----------------------------------------------------------------------------------------------------

// Object * zet Lyr  ---  Double or Multiple Star  ---  OID=@2900048   (@@56914,2)  ---  coobox=19823 
// Object types: Double or Multiple Star,Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=91971
Remove "ZET1 Lyr"{ParentBody "ZET Lyr"}
Remove "ZET2 Lyr"{ParentBody "ZET Lyr"}
Remove "ZET Lyr Aa"{ParentBody "ZET1 Lyr"}
Remove "ZET Lyr Ab"{ParentBody "ZET1 Lyr"}

// Object * zet01 Lyr  ---  Spectroscopic Binary  ---  OID=@2900021   (@@56912,1)  ---  coobox=19823 
// Object types: Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter "织女三/ZET1 Lyr/HIP 91971/Gaia DR3 2096875399817444736/TIC 336130142/PLX 4327/SBC9 1079/6 Lyr/AG+37 1687/BD+37 3222/CCDM J18448+3736A/CEL 4648/CSI+37 3222 1/CSV 101763/GC 25676/GCRV 11203/GEN# +1.00173648/GSC 03118-02080/HD 173648/HIC 91971/HR 7056/IDS 18413+3730 A/IRAS 18430+3733/JP11 3014/PPM 81740/ROT 2658/SAO 67321/SBC7 701/2E 1843.0+3733/2E 4127/1RXS J184446.1+373620/2MASS J18444635+3736182/Gaia DR2 2096875399811529472/SKY# 34429/TD1 23146/TYC 3118-2080-1/UBV 15954/UBV M 23202/uvby98 100173648/WDS J18448+3736A/ADS 11639 A/Renson 48650/PMSC 18413+3730A/PMSC 18413+3730Aab/WEB 15841"
{
	ParentBody      "ADS 11639 AD"
	BinaryOrbit     
	{
		Epoch           2458850
		Period          43556
		Separation      902.981839186045 // 43.7 asec
	}
}

Barycenter "ZET1 Lyr Aa"
{
	ParentBody      "HIP 91971"
	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   25.9741041
		Eccentricity    0.378608926
		Inclination     -0.750593662
		AscendingNode   0
		ArgOfPericenter -111.034732
		MeanAnomaly     -58.2653886
	}
}

Star "ZET1 Lyr Aa1"
{
	DateUpdated     "2024-06-02"
	ParentBody      "ZET1 Lyr Aa"
	Parallax        20.6632
	AppMagn         4.36
	Class           "kA5hF0VmF3"
	AbsMagn         0.94
	MassSol         2.36
	RadSol          2.5
	LumBol          31
	Teff            7914
	FeH             0.38
	Age             0.500

	BinaryOrbit     
	{
		PeriodDays      4.3
		Eccentricity    0.010
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2440000.723
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "ZET1 Lyr Aa2"
{
	DateUpdated     "2024-06-02"
	ParentBody      "ZET1 Lyr Aa"
	Class           ""
	MassSol         0.86
}

Star "ZET1 Lyr Ab(?)"
{
	ParentBody      "HIP 91971"
	Class           "G4.7?"
}

// Object * zet02 Lyr  ---  Star  ---  OID=@2900025   (@@56912,5)  ---  coobox=19823 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "织女增一/ZET2 Lyr/HIP 91973/Gaia DR3 2096869455581362560/TIC 336130128/7 Lyr/AG+37 1688/BD+37 3223/CCDM J18448+3736D/GC 25678/GCRV 11205/GEN# +1.00173649/GSC 03118-02081/HD 173649/HIC 91973/HR 7057/IDS 18413+3730 D/PPM 81741/ROT 2659/SAO 67324/SKY# 34430/TYC 3118-2081-1/UBV 15955/UBV M 23203/uvby98 100173649/2MASS J18444820+3735404/WDS J18448+3736D/ADS 11639 D/** STF 4038D/PMSC 18413+3730D/WEB 15842/Gaia DR2 2096869455581362560"
{
	ParentBody      "ADS 11639 AD"
}

Star "ZET2 Lyr Da"
{
	DateUpdated     "2024-06-02"
	ParentBody      "HIP 91973"
	Parallax        20.6386
	AppMagn         5.585
	Class           "F1Vnn"
	AbsMagn         2.34
	MassSol         1.74
	RadSol          2.03
	LumBol          9.5
	Teff            7257
	FeH             -0.36
	Age             1.223

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.904759316
		Eccentricity    0
		Inclination     -1.90390015
		AscendingNode   0
		ArgOfPericenter -109.188679
		MeanAnomaly     6.73001957
	}
}

Star "ZET2 Lyr Db(?)"
{
	ParentBody      "HIP 91973"
	Class           "K0.7?"
}