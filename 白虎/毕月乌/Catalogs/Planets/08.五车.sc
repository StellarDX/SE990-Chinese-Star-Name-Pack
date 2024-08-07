// Unconfirmed substellar companions of IOT Aur
Planet "IOT Aur b"
{
	ParentBody     "IOT Aur"
	DiscMethod     "RadVel"
	DiscDate       "2007"
	Class          "GasGiant"
	Oblateness     0

	Orbit
	{
		PeriodDays      767
	}
}

Planet "IOT Aur c"
{
	ParentBody     "IOT Aur"
	DiscMethod     "RadVel"
	DiscDate       "2007"
	Class          "GasGiant"
	Oblateness     0

	Orbit
	{
		PeriodDays      1586
	}
}

// Object * alf Aur  ---  Spectroscopic Binary  ---  OID=@284536   (@@143,0)  ---  coobox=3048 
// Object types: Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,High Proper Motion Star,Variable Star,RS CVn Variable,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=24608
Remove "Capella (AB)"{ParentBody "Capella"}
Remove "Capella (HL)"{ParentBody "Capella"}
Remove "Capella A"{ParentBody "Capella (AB)"}
Remove "Capella B"{ParentBody "Capella (AB)"}
Remove "Capella H"{ParentBody "Capella (HL)"}
Remove "Capella L"{ParentBody "Capella (HL)"}
Barycenter "ALF Aur A"
{
	ParentBody      "ALF Aur"
	BinaryOrbit     
	{
		Separation      10000
	}
}

Star "ALF Aur Aa"
{
	DateUpdated     "2024-07-02"
	ParentBody      "ALF Aur A"
	Class           "G5III"
	AbsMagn         0.296
	MassSol         2.5687
	RadSol          11.98
	LumBol          78.7
	Teff            4970
	RotationPeriod  2496
	FeH             -0.04
	Age             0.590 // 0.65

	BinaryOrbit // VB6_Trr2015 ANJ_1Aa, Gr.1
	{
		PeriodDays      104.02128
		Separation      0.74272
		Eccentricity    0.00089
		Inclination     137.156
		AscendingNode   40.522
		Epoch           2448147.6
		ArgOfPericenter 342.6
		MeanAnomaly     0
	}
}

Star "ALF Aur Ab"
{
	DateUpdated     "2024-07-02"
	ParentBody      "ALF Aur A"
	Class           "G0II"
	AbsMagn         0.167
	MassSol         2.4828
	RadSol          8.83
	LumBol          72.7
	Teff            5730
	RotationPeriod  204
}

Barycenter "ALF Aur HL"
{
	ParentBody      "ALF Aur"
}

// Object G 96-29  ---  High Proper Motion Star  ---  OID=@284455   (@@139,0)  ---  coobox=3050 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Star,UV-emission Source,X-ray Source 
Star "G 96-29/GJ 195 A/Gaia DR3 211810233512673792/TIC 368483044/PLX 1193/LSPM J0517+4550/NLTT 14788/ASCC 317074/2MASS J05172386+4550229/1RXS J051725.0+455033/AC +45 217/ADS 3841 H/AG+45 515/CCDM J05168+4559H/CSI+45-05137 2/CSI+45 1077 8/Ci 20 323/Furuhjelm III-1357/GCRV 3130/LTT 11622/PPM 47938/UBV 5010/VVO 237/[RHG95] 895/EUVE J0517+45.8/EXO 051342+4547.5/WDS J05167+4600H/PMSC 05093+4553H/** ST 3H/2XMMi J051724.1+455019/WISEA J051723.96+455018.3/PM J05173+4550/Capella H/PLX 1193.00A/WEB 4770/PPMX J051723.8+455022/Gaia DR2 211810233512673792"
{
	DateUpdated     "2024-07-02"
	ParentBody      "ALF Aur HL"
	Class           "M2.5V"
	AbsMagn         9.53
	MassSol         0.57
	RadSol          0.54
	LumBol          0.05
	Teff            3700
	FeH             0.1

	BinaryOrbit // VB6_Izm2019  ST_3HL Gr.5
	{
		Period          365.6375
		Separation      40
		Eccentricity    0.260
		Inclination     56.2
		AscendingNode   154.0
		Epoch           2416358.195694135036319
		ArgOfPericenter 259.5
		MeanAnomaly     0
	}
}

// Object G 96-29B  ---  High Proper Motion Star  ---  OID=@284461   (@@139,6)  ---  coobox=3050 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "G 96-29B/GJ 195 B/Gaia DR3 211810233512673920/TIC 368483043/ADS 3841 L/CCDM J05168+4559L/IDS 05103+4544 L/Capella L/VVO 238/[RHG95] 896/WDS J05167+4600L/** ST 3L/PMSC 05093+4553L/2MASS J05172394+4550198/PLX 1193.00B/Gaia DR2 211810233512673920"
{
	DateUpdated     "2024-07-02"
	ParentBody      "ALF Aur HL"
	Class           "M4:"
	AbsMagn         13.1
	MassSol         0.53
}

// Object * bet Aur  ---  Spectroscopic Binary  ---  OID=@835414   (@@23161,0)  ---  coobox=4437 
// Object types: Eclipsing Binary,Near-IR Source (λ < 3 µm),Eclipsing Binary,Double or Multiple Star,Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "Menkalinan (AB)"{ParentBody "Menkalinan"}
Remove "Menkalinan C"{ParentBody "Menkalinan"}
Remove "Menkalinan A"{ParentBody "Menkalinan (AB)"}
Remove "Menkalinan B"{ParentBody "Menkalinan (AB)"}
Barycenter "BET Aur A"
{
	ParentBody      "BET Aur"
	BinaryOrbit     
	{
		Separation      345.685150616202 // 13.9 asec
		PositionAngle   155
	}
}

Star "BET Aur Aa"
{
	DateUpdated     "2024-07-02"
	ParentBody      "BET Aur A"
	Class           "A1IV"
	AbsMagn         0.55
	MassSol         2.389
	RadSol          2.77
	LumBol          55
	Teff            9350
	Age             0.570

	BinaryOrbit     
	{
		PeriodDays      3.96004
		Eccentricity    0.0
		Inclination     76.0
		Epoch           2454539.0162
	}
}

Star "BET Aur Ab"
{
	DateUpdated     "2024-07-02"
	ParentBody      "BET Aur A"
	Class           "A1IV"
	AbsMagn         0.76
	MassSol         2.327
	RadSol          2.63
	LumBol          47
	Teff            9200
}

Star "BET Aur B(?)"
{
	ParentBody      "BET Aur"
	Class           ""
	MassSol         0.15 // ?
}

// Object * tet Aur  ---  alpha2 CVn Variable  ---  OID=@836292   (@@96435,0)  ---  coobox=4471 
// Object types: alpha2 CVn Variable,Chemically Peculiar Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "TET Aur A"{ParentBody "TET Aur"}
Remove "TET Aur B"{ParentBody "TET Aur"}
Star "TET Aur A"
{
	DateUpdated     "2024-07-02"
	ParentBody      "HIP 28380"
	Class           "A0VpSi"
	AbsMagn         -1.05
	MassSol         3.24
	RadSol          4.68
	LumBol          214
	Teff            10220
	RotationPeriod  86.8488
	Age             0.288

	BinaryOrbit     
	{
		Epoch           2452276
		Separation      198.47720122125 // 3.91 asec
		PositionAngle   304.9
	}
}

// Object * tet Aur B  ---  High Proper Motion Star  ---  OID=@16488878   (@@-1,255)  ---  coobox=4471 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "TET Aur B/Gaia DR3 3456842228196516480/Gaia DR2 3456842228196516480/WDS J05597+3713B/** STT 545B/CCDM J05597+3713B"
{
	DateUpdated     "2024-07-02"
	ParentBody      "HIP 28380"
	Class           "F2-5V"
}

// Object * bet Tau  ---  High Proper Motion Star  ---  OID=@794302   (@@21243,0)  ---  coobox=4558 
// Object types: High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "BET Tau A"
{
	DateUpdated     "2024-07-02"
	ParentBody      "BET Tau"
	Class           "B7III"
	AbsMagn         -1.42
	MassSol         5.0
	RadSol          5.47 // 4.82
	LumBol          564
	Teff            13600
	FeH             0.2
	Age             0.100

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.061275042
		Eccentricity    0.185759182
		Inclination     -2.21261597
		AscendingNode   0
		ArgOfPericenter -40.3423844
		MeanAnomaly     122.559646
	}
}

Star "BET Tau B"
{
	ParentBody      "BET Tau"
	Class           "A1.8?"
}