// Object * eps Aur  ---  Spectroscopic Binary  ---  OID=@741050   (@@23112,0)  ---  coobox=4369 
// Object types: Eclipsing Binary,Spectroscopic Binary,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "Almaaz A"{ParentBody "Almaaz"}
Remove "Almaaz B"{ParentBody "Almaaz"}
Star "EPS Aur A"
{
	DateUpdated     "2024-07-03"
	ParentBody      "EPS Aur"
	Class           "F0Iab"
	AbsMagn         -9.1
	MassSol         2.2 // 15
	RadSol          143 // 358
	LumBol          37875
	Teff            7750

	BinaryOrbit     
	{
		PeriodDays      9896
		Separation      18.1
		Eccentricity    0.227
		Inclination     89
		AscendingNode   264
		Epoch           2434723
		ArgOfPericenter 219.2
		MeanAnomaly     0
	}
}

Star "EPS Aur B"
{
	DateUpdated     "2024-07-03"
	ParentBody      "EPS Aur"
	Class           "B5V"
	MassSol         6 // 14
	RadSol          3.9
	LumBol          693.7259311814706 // 计算的值
	Teff            15000

	AccretionDisk
	{
		InnerRadiusKm     2.74e+06
		OuterRadius       3.8
		InnerThicknessKm  8.14e+05
		OuterThickness    0.475
		ThicknessPow      3
		DetailScaleR      6
		DetailScaleV      6
		OctaveDistortionX 0.5
		OctaveDistortionY 0.35
		OctaveDistortionZ 0.2
		OctaveScale       0.5
		DiskNoiseContrast 1
		DiskTempContrast  0.15
		DiskOuterSpin     0.04
		TwistMagn         2.5e+03
		AccretionRate     2.83e-12
		Temperature       550
		Density           8e-06
		Luminosity        0.179
		LuminosityBol     0.217
		Brightness        0.1
		JetLength         1.63
		JetStartRadiusKm  8.14e+06
		JetEndRadius      0.136
		JetStartTemp      550
		JetEndTemp        413
		JetVelocity       0.1
		JetDistortion     0.4
		JetThickness      0.3
		JetDensity        0
		JetBrightness     1
		LightingBright    1
		ShadowContrast    1
		ShadowLength      0.5
	}
}

// Object * zet Aur  ---  Spectroscopic Binary  ---  OID=@741515   (@@22729,0)  ---  coobox=4377 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "Haedus A"{ParentBody "Haedus"}
Remove "Haedus B"{ParentBody "Haedus"}
Star "ZET Aur A"
{
	DateUpdated     "2024-07-03"
	ParentBody      "ZET Aur"
	Class           "K5II"
	AbsMagn         -3.21
	MassSol         4.94
	RadSol          148
	LumBol          4786
	Teff            3960
	FeH             -0.26

	BinaryOrbit     
	{
		PeriodDays      972.162
		SemiMajorAxisKm 629608500 // 905 RSun
		Eccentricity    0.3973
		Inclination     87.0
		Epoch           2453039.9
		ArgOfPericenter 148.9
		MeanAnomaly     0
	}
}

Star "ZET Aur B"
{
	DateUpdated     "2024-07-03"
	ParentBody      "ZET Aur"
	Class           "B7V"
	MassSol         4.8
}

// Object * nu. Aur  ---  Star  ---  OID=@835995   (@@22405,4)  ---  coobox=4468 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "NU Aur A"
{
	DateUpdated     "2024-07-03"
	ParentBody      "NU Aur"
	Class           "K0.5IIICN0.5"
	AbsMagn         -0.27
	MassSol         2.12
	RadSol          17.85
	LumBol          126
	Teff            4576
	FeH             -0.14
	Age             1.11

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   189.898883
		Eccentricity    0.802319804
		Inclination     0.937804103
		AscendingNode   0
		ArgOfPericenter -148.609591
		MeanAnomaly     -117.45527
	}
}

Star "NU Aur B"
{
	DateUpdated     "2024-07-03"
	ParentBody      "NU Aur"
	Class           "WD"
}

// Object * chi Aur  ---  Blue Supergiant  ---  OID=@793927   (@@21595,4)  ---  coobox=4549 
// Object types: Blue Supergiant,Blue Supergiant,Blue Supergiant,Blue Supergiant,Spectroscopic Binary,Blue Supergiant,Blue Supergiant,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "CHI Aur A"
{
	DateUpdated     "2024-07-03"
	ParentBody      "CHI Aur"
	Class           "B4Iab"
	AbsMagn         -6.4
	MassSol         21.1
	RadSol          68
	LumBol          190500
	Teff            14600
	Age             0.0087

	BinaryOrbit     
	{
		PeriodDays      676.85
		Eccentricity    0.116
		AscendingNode   181.7
		Epoch           2422754.2
	}
}

Star "CHI Aur B"
{
	ParentBody      "CHI Aur"
	Class           "O8.5?"
}

// Object * 26 Aur  ---  Double or Multiple Star  ---  OID=@821826   (@@21249,0)  ---  coobox=4568 
// Object types: Double or Multiple Star,Eclipsing Binary,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "26 Aur A"
{
	DateUpdated     "2024-07-03"
	ParentBody      "26 Aur"
	Class           "G8III"
	AbsMagn         -0.29
	MassSol         2.1

	BinaryOrbit     
	{
		Period          52.735
		Separation      21.1
		Eccentricity    0.653
		Inclination     124.22
		AscendingNode   127.08
		Epoch           2442386.815748063847423
		ArgOfPericenter 129.07
		MeanAnomaly     0
	}
}

Star "26 Aur B"
{
	DateUpdated     "2024-07-03"
	ParentBody      "26 Aur"
	Class           "A1IV"
	MassSol         3.0
}