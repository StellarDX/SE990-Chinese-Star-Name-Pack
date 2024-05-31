// Object * pi. Sgr  ---  Double or Multiple Star  ---  OID=@2540508   (@@58436,12)  ---  coobox=18848 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "PI Sgr A" // 轨道和伴星数据均未知
{
	DateUpdated     "2024-05-31"
	ParentBody      "PI Sgr"
	Class           "F2II-III"
	AbsMagn         -3.08
	MassSol         5.9
	Radius          21972951.1015933 // log(g) = 2.21 cm/s^2
	LumBol          1694.9937783236987 // 计算的值
	Teff            6590
	Age             0.067
}

Star "PI Sgr B"
{
	ParentBody      "PI Sgr A"
	Class           "B6.2?"    

	Orbit     
	{
		SemiMajorAxis   13
	}
}

Star "PI Sgr C"
{
	ParentBody      "PI Sgr A"
	Class           "B5.5?"    

	Orbit     
	{
		SemiMajorAxis   40
	}
}

// Object * ups Sgr  ---  Be Star  ---  OID=@2555605   (@@59452,4)  ---  coobox=18861 
// Object types: Be Star,Variable Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Emission-line Star,Star,Infra-Red Source,UV-emission Source 
Remove "UPS Sgr A" {ParentBody "UPS Sgr"}
Remove "UPS Sgr B" {ParentBody "UPS Sgr"}
Star "UPS Sgr A"
{
	DateUpdated     "2024-05-31"
	ParentBody      "HIP 95176"
	Class           "A2Ia"
	AbsMagn         -4.73
	MassSol         5.45 // 2.5?
	RadSol          23
	LumBol          4700
	Teff            12300
	FeH             -0.2
	Age             0.052

	BinaryOrbit     
	{
		PeriodDays      137.939
		SemiMajorAxisKm 188395560 // 270.8 RSun
		Eccentricity    0
		Inclination     50
	}
}

Star "UPS Sgr B"
{
	DateUpdated     "2024-05-31"
	ParentBody      "HIP 95176"
	Class           "B2Vpe"
	AbsMagn         -1.14
	MassSol         8.56 // 6.2
	RadSol          2.2
	LumBol          1300
	Teff            23000

	AccretionDisk // https://www.aanda.org/articles/aa/full_html/2009/21/aa11192-08/aa11192-08.html
	{
		InnerRadiusKm     1.55e+06
		OuterRadius       0.214
		InnerThicknessKm  9.18e+05
		OuterThickness    0.123
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
		AccretionRate     2.57e-07
		Temperature       2.83e+04
		Density           4.13e-08
		Luminosity        648
		LuminosityBol     4.74e+03
		Brightness        1
		JetLength         0.921
		JetStartRadiusKm  4.59e+06
		JetEndRadiusKm    1.15e+07
		JetStartTemp      2.83e+04
		JetEndTemp        2.13e+04
		JetVelocity       0.85
		JetDistortion     0.4
		JetThickness      0.3
		JetDensity        4.13e-12
		JetBrightness     1
		LightingBright    1
		ShadowContrast    1
		ShadowLength      0.5
	}
}