// Object * mu.01 Cyg  ---  High Proper Motion Star  ---  OID=@1507612   (@@31581,12)  ---  coobox=9535 
// Object types: Double or Multiple Star,High Proper Motion Star,Star 
Star "MU1 Cyg/GJ 9750 A/GJ 836.6 A/PLX 5245/TYC 2201-2078-1/ASCC 730277/78 Cyg A/MU Cyg A/ADS 15270 A/BD+28 4169A/CCDM J21442+2845A/CSI+28 4169 2/GC 30438/GCRV 13656/HD 206826/HR 8309/IDS 21397+2817 A/LTT 16353/NLTT 51972/SAO 89940/SKY# 41433/WDS J21441+2845A/** STF 2822A/PLX 5245.00/WEB 19377/LSPM J2144+2844A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "MU Cyg"
	Parallax        42.1
	AppMagn         4.7
	Class           "F6V"
	AbsMagn         2.77
	AbsMagnBol      2.91
	MassSol         1.31
	RadSol          1.88
	LumBol          6.0
	Teff            6354
	FeH             -0.16
	Age             3.46

	BinaryOrbit     
	{
		Period          789
		Separation      117.813811151687 // 5.32 asec
		Eccentricity    0.66
		Inclination     75.5
		AscendingNode   110.1
		Epoch           2436204.361049298197031
		ArgOfPericenter 325.7
		MeanAnomaly     0
	}
}

// Object * mu.02 Cyg  ---  High Proper Motion Star  ---  OID=@1507611   (@@31581,11)  ---  coobox=9535 
// Object types: Double or Multiple Star,High Proper Motion Star,Star 
Star "MU2 Cyg/GJ 9750 B/GJ 836.6 B/TYC 2201-2078-2/78 Cyg B/ADS 15270 B/BD+28 4169B/CCDM J21442+2845B/CSI+28 4169 1/GC 30437/GCRV 13655/HD 206827/HR 8310/IDS 21397+2817 B/LTT 16354/NLTT 51973/SAO 89939/SKY# 41432/WDS J21441+2845B/** STF 2822B/uvby98 100206827/GEN# +1.00206827/WEB 19378/LSPM J2144+2844B"
{
	DateUpdated     "2024-06-13"
	ParentBody      "MU Cyg"
	Class           "G2V"
	AbsMagn         4.38
	AbsMagnBol      4.32
	MassSol         0.99
	RadSol          1.08
	LumBol          1.4
	Teff            5998
	FeH             -0.24
	Age             7.11
}

// Object * kap Peg  ---  Spectroscopic Binary  ---  OID=@1498140   (@@31339,0)  ---  coobox=9531 
// Object types: Double or Multiple Star,Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=107354
Remove "KAP Peg A"{ParentBody "KAP Peg"}
Remove "KAP Peg B"{ParentBody "KAP Peg"}
Remove "KAP Peg Ba"{ParentBody "KAP Peg B"}
Remove "KAP Peg Bb"{ParentBody "KAP Peg B"}
Star "KAP Peg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "IDS 21401+2511 AB"
	Class           "F5IV"
	AbsMagn         1.46 // 计算的值
	MassSol         1.549
	Radius          4534068.65874669 // log(g) = 3.00 cm/s^2
	LumBol          71.69112602597171 // 计算的值
	Teff            6579
	FeH             -0.37
}

Barycenter "KAP Peg B"
{
	ParentBody      "IDS 21401+2511 AB"
	BinaryOrbit // 2021AJ....161...40G CHARA+RV
	{
		PeriodDays      42222.4200
		Separation      8.07707294457938 // 0.236 asec
		Eccentricity    0.313
		Inclination     107.9
		AscendingNode   289.1
		Epoch           2452938.170
		ArgOfPericenter 124.5
		MeanAnomaly     0
	}
}

Star "KAP Peg B1"
{
	DateUpdated     "2024-06-13"
	ParentBody      "KAP Peg B"
	Class           "F6IV"
	MassSol         1.662

	BinaryOrbit // 2021AJ....161...40G CHARA+RV
	{
		PeriodDays      5.9715
		Eccentricity    0.007
		Inclination     125.7
		AscendingNode   244.1
		Epoch           2452402.240
		ArgOfPericenter 179.0
		MeanAnomaly     0
	}
}

Star "KAP Peg B2"
{
	DateUpdated     "2024-06-13"
	ParentBody      "KAP Peg B"
	Class           "K0V:"
	MassSol         0.814
}

// Object * iot Peg  ---  Spectroscopic Binary  ---  OID=@1498723   (@@31355,0)  ---  coobox=9626 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "IOT Peg A" {ParentBody "IOT Peg"}
Remove "IOT Peg B" {ParentBody "IOT Peg"}
Star "IOT Peg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "GJ 848"
	Class           "F5V"
	AbsMagn         3.49
	MassSol         1.33
	RadSol          1.526
	LumBol          3.9328403769675924 // 计算的值
	Teff            6580
	Age             0.004 // 0.663

	BinaryOrbit     
	{
		PeriodDays      10.2130253
		Separation      0.120459443855148 // 10.329 mas
		Eccentricity    0.001764
		Inclination     95.83
		AscendingNode   176.262
		Epoch           2452997.378
		ArgOfPericenter 92.8
		MeanAnomaly     0
	}
}

Star "IOT Peg B"
{
	DateUpdated     "2024-06-13"
	ParentBody      "GJ 848"
	Class           "G8V"
	AbsMagn         6.33
	MassSol         0.82
	RadSol          0.73
	LumBol          0.3147324089762483 // 计算的值
	Teff            5060
}

// Object * 32 Peg  ---  Double or Multiple Star  ---  OID=@1499164   (@@31368,0)  ---  coobox=9657 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "32 Peg A"
{
	DateUpdated     "2024-06-13"
	ParentBody      "32 Peg"
	Class           "B9III"
	AbsMagn         -1.82
	Radius          4146059.66971746 // 计算的值
	LumBol          541
	Teff            11403

	BinaryOrbit     
	{
		Epoch           2453371
		Separation      110.617193033455 // 0.50 asec
		PositionAngle   288
	}
}

Star "32 Peg B"
{
	ParentBody      "32 Peg"
	Class           "B5.2?"
}