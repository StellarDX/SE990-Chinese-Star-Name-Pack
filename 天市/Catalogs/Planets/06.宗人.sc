// Object * 66 Oph  ---  Be Star  ---  OID=@2669974   (@@54669,0)  ---  coobox=19461 
// Object types: Be Star,Double or Multiple Star,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "66 Oph A"
{
	DateUpdated     "2024-05-16"
	ParentBody      "66 Oph"
	Class           "B2Ve"
	AbsMagn         -2.8
	MassSol         9.6
	DimensionsSol   (10.22, 9, 10.22)
	LumBol          1524.63
	Teff            22000
	FeH             0.00
	Age             0.014

	BinaryOrbit     
	{
		PeriodDays      23421.1
		Separation      36.3651878562399 // 178.36 mas
		Eccentricity    0.142
		Inclination     75.90
		AscendingNode   338.87
		Epoch           2452658.5
		ArgOfPericenter 295.24
		MeanAnomaly     0
	}
}

Star "66 Oph B"
{
	DateUpdated     "2024-05-16"
	ParentBody      "66 Oph"
	Class           "B8"
	AbsMagn         -0.2
	MassSol         3.8
}

// Object * 67 Oph  ---  Blue Supergiant  ---  OID=@2669976   (@@54674,0)  ---  coobox=19460 
// Object types: Blue Supergiant,Blue Supergiant,Blue Supergiant,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "67 Oph A"
{
	DateUpdated     "2024-05-16"
	ParentBody      "67 Oph"
	Class           "B5Ib"
	AbsMagn         -3.50
	MassSol         8.4
	Radius          4739474.0846554 // 计算的值
	LumBol          2364
	Teff            15420
	FeH             -0.01
}

// Object BD+02 3459  ---  Star  ---  OID=@2669952   (@@54665,6)  ---  coobox=19460 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+02 3459/AP J18004093+0255105/Gaia DR3 4469314110339624448/TIC 404616560/TYC 434-5199-1/ADS 10966 C/AG+02 2187/CCDM J18007+0256C/GEN# +0.00203459/GEN# +1.00164353C/IDS 17556+0256 C/PPM 164988/ROT 4/SAO 123014/UBV 15302/UBV 15303/UBV M 196/YZ 2 6026/2MASS J18004093+0255105/ALS 17939/WDS J18006+0256C/** H 2C/WEB 14905/Gaia DR2 4469314110339624448"
{
	DateUpdated     "2024-05-16"
	ParentBody      "67 Oph"
	Parallax        1.5393
	AppMagn         8.12
	Class           "B2V"
	AbsMagn         -0.943 // 计算的值
	MassKg          1.32201157980272e+31 // log(g) = 3.485 cm/s^2
	RadSol          7.725 // Gaia DR3
	LumBol          5089.88592142897 // 计算的值
	Teff            17541
	FeH             -0.664

	BinaryOrbit // 只有这颗伴星有确切数据
	{
		SemiMajorAxis   39560.1193077397 // 54.32 asec
	}
}

// Object * 68 Oph  ---  Double or Multiple Star  ---  OID=@2654355   (@@54690,10)  ---  coobox=19456 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "68 Oph A"
{
	DateUpdated     "2024-05-16"
	ParentBody      "68 Oph"
	Class           "A0.5Van"
	AbsMagn         -0.34
	MassSol         3.07
	RadSol          4.5
	LumBol          160
	Teff            9594
	FeH             -0.14

	BinaryOrbit     
	{
		Period          175.74
		Separation      90.2324056593029 // 1.090 asec
		Eccentricity    0.831
		Inclination     69.5
		AscendingNode   160.2
		Epoch           2458801.895887878257781
		ArgOfPericenter 258.9
		MeanAnomaly     0
	}
}

Star "68 Oph B"
{
	ParentBody      "68 Oph"
	Class           "A6.7?"
}

// Object * 70 Oph A  ---  Spectroscopic Binary  ---  OID=@2654408   (@@55262,9)  ---  coobox=19457 
// Object types: Rotating Variable,High Proper Motion Star,Spectroscopic Binary,Double or Multiple Star,High Proper Motion Star,Star 
Remove "70 Oph A" {ParentBody "70 Oph"}
Remove "70 Oph B" {ParentBody "70 Oph"}
Star "70 Oph A/GJ 702 A/TIC 1674663309/Gaia DR3 4468557611984384512/SPOCS 2969/WDS J18055+0230A/ASCC 1153899/USNO-B1.0 0924-00457807/8pc 196.62A/ADS 11046 A/BD+02 3482A/CCDM J18055+0230A/CSI+02 3482 10/GCRV 10531/IDS 18004+0232 A/LFT 1390/LHS 458/LTT 15337/NLTT 45899/ROT 3523/TYC 434-5213-1/UBV 15377/USNO 877/Zkh 271/HD 165341A/** STF 2272A/Gaia DR2 4468557611977678336/LSPM J1805+0229A"
{
	DateUpdated     "2024-05-16"
	ParentBody      "GJ 702"
	Class           "K0V"
	AbsMagn         5.49
	MassSol         0.90
	RadSol          0.91
	LumBol          0.59
	Teff            5300
	FeH             0.04
	RotationPeriod  472.8
	Age             1.9

	BinaryOrbit     
	{
		Period          88.38
		Separation      23.1496588088672 // 4.554 asec
		Eccentricity    0.4992
		Inclination     121.16
		AscendingNode   302.12
		Epoch           2413537.430192949250340
		ArgOfPericenter 194.0
		MeanAnomaly     0
	}
}

// Object * 70 Oph B  ---  High Proper Motion Star  ---  OID=@2654409   (@@55262,10)  ---  coobox=19457 
// Object types: Rotating Variable,High Proper Motion Star,Variable Star,Double or Multiple Star,High Proper Motion Star,Star,X-ray Source 
Star "70 Oph B/GJ 702 B/Gaia DR3 4468557611977674496/TYC 434-5212-1/ASCC 1153898/8pc 196.62B/ADS 11046 B/BD+02 3482B/CCDM J18055+0230B/CSI+02 3482 11/GCRV 10532/HD 165341B/IDS 18004+0232 B/LFT 1391/LHS 459/LTT 15338/NLTT 45900/ROT 3570/UBV 15378/Zkh 272/1E 1802.9+0229/WDS J18055+0230B/** STF 2272B/2XMM J180527.3+022955/Gaia DR2 4468557611977674496/UCAC4 463-073987/LSPM J1805+0229B/TIC 1674663308"
{
	DateUpdated     "2024-05-16"
	ParentBody      "GJ 702"
	Parallax        195.8563
	AppMagn         6.07
	Class           "K4V"
	AbsMagn         7.53 // 计算的值
	MassSol         0.70
	Radius          441639.923994228 // 计算的值
	LumBol          0.13
	Teff            4350
}
