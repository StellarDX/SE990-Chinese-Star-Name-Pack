// Object * alf UMi  ---  Classical Cepheid Variable  ---  OID=@317713   (@@125261,0)  ---  coobox=2389 
// Object types: Classical Cepheid Variable,Double or Multiple Star,Spectroscopic Binary,Classical Cepheid Variable,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "Polaris A"{ParentBody "Polaris"}
Remove "Polaris Aa"{ParentBody "Polaris A"}
Remove "Polaris Ab"{ParentBody "Polaris A"}
Remove "Polaris B"{ParentBody "Polaris"}
Barycenter "ALF UMi A"
{
	ParentBody      "ALF UMi"
	BinaryOrbit
	{
		Epoch           2453585.506804888136685
		Separation      2416.04774325277 // 18.217 asec
		PositionAngle   230.540
	}
}

Star "ALF UMi Aa"
{
	DateUpdated     "2024-04-29"
	ParentBody      "ALF UMi A"
	Class           "F8Ib"
	AbsMagn         -3.6
	MassSol         5.4
	RadSol          37.5
	LumBol          1260
	Teff            6015
	FeH             1.12
	RotationPeriod  2856
	Age             0.045 // 0.067

	BinaryOrbit
	{
		Period          29.59
		Separation      2.90
		Eccentricity    0.608
		Inclination     146.2
		AscendingNode   191.4
		Epoch           2447037.444665142334998
		ArgOfPericenter 303.01
		MeanAnomaly     0
	}
}

Star "ALF UMi Ab"
{
	DateUpdated     "2024-04-29"
	ParentBody      "ALF UMi A"
	Class           ""
	AbsMagn         3.6
	MassSol         1.26
	RadSol          1.04
	LumBol          3
	Teff            7448.86707675817 // 计算的值
	Age             0.500
}

// Object * alf UMi B  ---  Variable Star  ---  OID=@317445   (@@5218,14)  ---  coobox=2389 
// Object types: Double or Multiple Star,Variable Star,Star 
Star "ALF UMi B/Gaia DR3 576402619921510144/ADS 1477 B/AN 18.1903/BD+88 7/CCDM J02319+8915B/CSV 100114/GC 2226/GCRV 1031/GEN# +0.08800007/IDS 01226+8846 B/NSV 631/ROT 3538/SAO 305/SV* ZI 58/UBV 1539/UBV M 4924/WDS J02318+8916B/** STF 93B/GSC2.3 NA9S000158/Polaris B/WEB 2427/Gaia DR2 576402619921510144"
{
	DateUpdated     "2024-04-29"
	ParentBody      "ALF UMi"
	Parallax        7.2869
	AppMagn         8.2
	Class           "F3V"
	AbsMagn         3.1
	MassSol         1.39
	RadSol          1.38
	LumBol          3.9
	Teff            6900
	Age             1.5
}

// Object * del UMi  ---  High Proper Motion Star  ---  OID=@330341   (@@5887,5)  ---  coobox=1698 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "DEL UMi A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "DEL UMi"
	Class           "A1Van"
	AbsMagn         0.62
	MassSol         2.35
	RadSol          2.8
	LumBol          47.77
	Teff            9911
	RotationPeriod  19
	Age             0.327

	BinaryOrbit
	{
		Separation      237.4
		PositionAngle   67.3
	}
}

Star "DEL UMi B"
{
	ParentBody      "DEL UMi"
	Class           ""
	MassSol         0.16
}

// Object * eps UMi  ---  RS CVn Variable  ---  OID=@330120   (@@6372,3)  ---  coobox=1673 
// Object types: Eclipsing Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Variable Star,RS CVn Variable,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "EPS UMi A"{ParentBody "EPS UMi"}
Remove "EPS UMi Aa"{ParentBody "EPS UMi A"}
Remove "EPS UMi Ab"{ParentBody "EPS UMi A"}
Remove "EPS UMi B"{ParentBody "EPS UMi"}
Star "EPS UMi A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "HIP 82080"
	Class           "G5III"
	AbsMagn         -0.922
	MassKg          5.39266347448207e+30 // log(g) = 2.167 cm/s^2
	RadSol          22.5 // Gaia DR3
	LumBol          282.108510141743 // 计算的值
	Teff            4987
	FeH             -0.681

	BinaryOrbit
	{
		PeriodDays      39.48042
		Eccentricity    0.04
		Epoch           2433083.47
		ArgOfPericenter 143.5
		MeanAnomaly     0
	}
}

Star "EPS UMi B"
{
	ParentBody      "HIP 82080"
	Class           "A8-F0"
}

// Object HD 217382  ---  High Proper Motion Star  ---  OID=@302481   (@@5544,0)  ---  coobox=1016 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "HD 217382 A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "HD 217382"
	Class           "K4III"
	AbsMagn         -0.49
	MassKg          9.05402587258861e+30 // log(g) = 1.96 cm/s^2
	RadSol          37
	LumBol          317.99
	Teff            4105
	FeH             +0.09

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.40014419
		Eccentricity    0.0930575733
		Inclination     2.18876332
		AscendingNode   0
		ArgOfPericenter -62.3867352
		MeanAnomaly     -126.464059
	}
}

Star "HD 217382 B"
{
	ParentBody      "HD 217382"
	Class           "A6.1?"
}