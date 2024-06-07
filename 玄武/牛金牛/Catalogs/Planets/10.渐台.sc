// Object * del02 Lyr  ---  Long-Period Variable  ---  OID=@2900492   (@@57473,0)  ---  coobox=19910 
// Object types: Long-Period Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Star "DEL Lyr A"
{
	DateUpdated     "2024-06-07"
	ParentBody      "DEL2 Lyr"
	Class           "M4II"
	AbsMagn         -3.3
	MassSol         7.3
	RadSol          286 // 381
	LumBol          12900 // 23100
	Teff            3550 // 3650
}

// Object UCAC2 44686751  ---  Double or Multiple Star  ---  OID=@2900452   (@@57471,3)  ---  coobox=19910 
// Object types: Double or Multiple Star,Star 
Barycenter "UCAC2 44686751/ADS 11825 BC/CCDM J18545+3654BC/CSI+36 3319 2/WDS J18545+3654BC/** ES 2028BC/UCAC4 635-063391"
{
	ParentBody      "DEL2 Lyr"
	BinaryOrbit     
	{
		PeriodDays      24000
		Separation      24000
	}
}

// Object ** ES 2028B  ---  Star  ---  OID=@15040054   (@@-1,255)  ---  coobox=19910 
// Object types: Double or Multiple Star,Star 
Star "** ES 2028B/Gaia DR3 2093932041545255680/WDS J18545+3654B/Gaia DR2 2093932041545255680"
{
	DateUpdated     "2024-06-07"
	ParentBody      "UCAC2 44686751"
	Parallax        2.8429
	Class           ""
	MassKg          1.98745708354697e+30 // log(g) = 4.367 cm/s^2
	RadSol          1.085 // Gaia DR3
	LumBol          1.128240785594 // 计算的值
	Teff            5711
	FeH             -0.246

	BinaryOrbit     
	{
		Period          10500
		Separation      600
	}
}

// Object ** ES 2028C  ---  Star  ---  OID=@17886327   (@@-1,255)  ---  coobox=19910 
// Object types: Double or Multiple Star,Star 
Star "** ES 2028C/Gaia DR3 2093932041549971072/WDS J18545+3654C/Gaia DR2 2093932041549971072"
{
	ParentBody      "UCAC2 44686751"
	Class           "K9.8?"
}

// Object * bet Lyr  ---  Spectroscopic Binary  ---  OID=@2868583   (@@57485,0)  ---  coobox=19904 
// Object types: Eclipsing Binary,Double or Multiple Star,Spectroscopic Binary,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=92420
Remove "Sheliak A" {ParentBody "Sheliak"}
Remove "Sheliak B" {ParentBody "Sheliak"}
Barycenter "BET Lyr Aa" // B-F均为光学伴星
{
	ParentBody      "BET Lyr"
	BinaryOrbit     
	{
		Period          246.916
		Separation      150.073710548831 // 0.54 asec
	}
}

Star "BET Lyr Aa1"
{
	DateUpdated     "2024-06-07"
	ParentBody      "BET Lyr Aa"
	Class           "B6II" // B6-8II
	AbsMagn         -3.82
	MassSol         2.97
	RadSol          15.2
	LumBol          6500
	Teff            13300
	Age             0.023

	BinaryOrbit // VB6_CIA2008b CIA_3Aa1 Gr.3
	{
		PeriodDays      12.9414
		//Separation      // 0.865 mas
		Eccentricity    0.000
		Inclination     92.2
		AscendingNode   254.4
		Epoch           2454283.119404559955001
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

Star "BET Lyr Aa2"
{
	DateUpdated     "2024-06-07"
	ParentBody      "BET Lyr Aa"
	Class           "B"
	MassSol         13.16
	RadSol          6.0
	LumBol          26300
	Teff            30000

	AccretionDisk
	{
		InnerRadiusKm     4.22e+06
		OuterRadius       0.845
		InnerThicknessKm  2.5e+06
		OuterThickness    0.335
		ThicknessPow      3
		DetailScaleR      6
		DetailScaleV      1
		OctaveDistortionX 0.5
		OctaveDistortionY 0.35
		OctaveDistortionZ 0.2
		OctaveScale       0.5
		DiskNoiseContrast 1
		DiskTempContrast  0.15
		DiskOuterSpin     0.04
		TwistMagn         2.5e+03
		AccretionRate     2e-05
		Temperature       1.69e+04
		Density           1.04e-08
		Luminosity        812
		LuminosityBol     1.91e+03
		Brightness        1
		JetLength         2.51
		JetStartRadiusKm  1.25e+07
		JetEndRadius      0.209
		JetStartTemp      1.69e+04
		JetEndTemp        1.27e+04
		JetVelocity       0.85
		JetDistortion     0.4
		JetThickness      0.3
		JetDensity        1.04e-12
		JetBrightness     1
		LightingBright    1
		ShadowContrast    1
		ShadowLength      0.5
	}
}

Star "BET Lyr Ab"
{
	DateUpdated     "2024-06-07"
	ParentBody      "BET Lyr"
	Class           "B2-B5"
}

// Object * iot Lyr  ---  Be Star  ---  OID=@2900844   (@@58052,5)  ---  coobox=19918 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Be Star,Variable Star,Star,UV-emission Source 
Star "IOT Lyr A"
{
	DateUpdated     "2024-06-07"
	ParentBody      "IOT Lyr"
	Class           "B6IV"
	AbsMagn         -1.94
	MassSol         5.2
	RadSol          6.7
	LumBol          854
	Teff            12059
	FeH             -0.11
	Age             0.168

	BinaryOrbit     
	{
		Period          216.93
		Separation      50.6884789950641 // 0.172 asec
		Eccentricity    0.637
		Inclination     145.5
		AscendingNode   171.4
		Epoch           2450551.074617415666580
		ArgOfPericenter 21.2
		MeanAnomaly     0
	}
}

Star "IOT Lyr B"
{
	ParentBody      "IOT Lyr"
	Class           "A2?"
}