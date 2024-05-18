// Object * tet CrB A  ---  Star  ---  OID=@7863357   (@@-1,255)  ---  coobox=17766 
// Object types: Double or Multiple Star,Star 
Remove "TET CrB A" {ParentBody "TET CrB"}
Remove "TET CrB B" {ParentBody "TET CrB"}
Star "TET CrB A/TYC 2564-1629-1/** COU 610A/WDS J15329+3122A/CCDM J15329+3122A/HD 138749A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "HIP 76127"
	Class           "B6Vnne"
	AbsMagn         -1.16
	MassSol         4.2
	RadSol          3.3
	LumBol          538
	Teff            14000
	RotationPeriod  10 // 最大值，线速度为393Km/s
	Age             0.085

	BinaryOrbit     
	{
		Period          300
		Separation      86
	}
}

// Object * tet CrB B  ---  Star  ---  OID=@7863358   (@@-1,255)  ---  coobox=17766 
// Object types: Double or Multiple Star,Star 
Star "TET CrB B/TYC 2564-1629-2/** COU 610B/WDS J15329+3122B/CCDM J15329+3122B/HD 138749B"
{
	DateUpdated     "2024-05-18"
	ParentBody      "HIP 76127"
	Class           "A2?"
	MassSol         2.5
}

// Object * bet CrB  ---  alpha2 CVn Variable  ---  OID=@2855814   (@@49230,0)  ---  coobox=17761 
// Object types: alpha2 CVn Variable,High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "Nusakan A" {ParentBody "Nusakan"}
Remove "Nusakan B" {ParentBody "Nusakan"}
Star "BET CrB A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "BET CrB"
	Class           "F2VpSrCrEuSi"
	AbsMagn         0.91 // 计算的值
	MassSol         2.09
	RadSol          2.63
	LumBol          25.3
	Teff            7980

	BinaryOrbit     
	{
		Period          10.27
		Separation      7.34177005290521 // 0.205 asec
		Eccentricity    0.524
		Inclination     111.1
		AscendingNode   148.2
		Epoch           2444424.501975063234568
		ArgOfPericenter 1.3
		MeanAnomaly     0
	}
}

Star "BET CrB B"
{
	DateUpdated     "2024-05-18"
	ParentBody      "BET CrB"
	Class           "F2"
	MassSol         1.40
	RadSol          1.56
	LumBol          4.5
	Teff            6750
	FeH             0.28
	Age             0.530
}

// Object * alf CrB  ---  Spectroscopic Binary  ---  OID=@2831152   (@@49274,0)  ---  coobox=17724 
// Object types: Eclipsing Binary,Eclipsing Binary,Spectroscopic Binary,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Alphecca A" {ParentBody "Alphecca"}
Remove "Alphecca B" {ParentBody "Alphecca"}
Star "ALF CrB A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "ALF CrB"
	Class           "A0V"
	AbsMagn         0.16
	MassSol         2.58
	RadSol          2.89 // 3.04
	LumBol          74
	Teff            9700
	Age             0.314

	BinaryOrbit     
	{
		PeriodDays      17.3599
		Separation      0.2
		Eccentricity    0.370
		Inclination     88.2
		ArgOfPericenter 311
		MeanAnomaly     0
	}
}

Star "ALF CrB B"
{
	DateUpdated     "2024-05-18"
	ParentBody      "ALF CrB"
	Class           "G5V"
	AbsMagn         5.05
	MassSol         0.92
	RadSol          0.90
	LumBol          0.81
	Teff            5800
}

// Object * gam CrB  ---  Double or Multiple Star  ---  OID=@2812057   (@@49541,0)  ---  coobox=17723 
// Object types: delta Sct Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,UV-emission Source 
Remove "GAM CrB A" {ParentBody "GAM CrB"}
Remove "GAM CrB B" {ParentBody "GAM CrB"}
Star "GAM CrB A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "HIP 76952"
	Class           "B9V"
	AbsMagn         0.56
	MassSol         2.51
	Radius          3042929.20333768 // 计算的值
	LumBol          59
	Teff            7649
	Age             0.400

	BinaryOrbit     
	{
		Period          91.2
		Separation      32.6466576297188 // 0.729 asec
		Eccentricity    0.48
		Inclination     94.45
		AscendingNode   111.75
		Epoch           2426561.967001479584724
		ArgOfPericenter 283.8
		MeanAnomaly     0
	}
}

Star "GAM CrB B"
{
	ParentBody      "HIP 76952"
	Class           "F3V"
}

// Object * eps CrB  ---  High Proper Motion Star  ---  OID=@2812760   (@@49851,0)  ---  coobox=17817 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "EPS CrB A" {ParentBody "EPS CrB"}
Remove "EPS CrB B" {ParentBody "EPS CrB"}
Star "EPS CrB A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "HIP 78159"
	Class           "K2IIIab"
	AbsMagn         -0.02
	MassSol         1.44
	RadSol          21
	LumBol          151
	Teff            4365
	FeH             -0.22
	Age             4.13

	BinaryOrbit     
	{
		Period          900
		Separation      135
	}
}

Star "EPS CrB B"
{
	ParentBody      "HIP 78159"
	Class           "K3V-K9V"
}

// Object * eps CrB b  ---  Extra-solar Planet  ---  OID=@7893706   (@@-1,255)  ---  coobox=17817 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Remove "EPS CrB A b" {ParentBody "EPS CrB A"}
Planet	"EPS CrB Ab"
{
	ParentBody     "EPS CrB A"
	DiscMethod     "RadVel"
	DiscDate       "2012"
	MassJup        6.7

	Orbit
	{
		Epoch           2451235.3
		PeriodDays      417.9
		SemiMajorAxis   1.3
		Eccentricity    0.11
		ArgOfPericen    133.1
	}
}

// Object * iot CrB  ---  Spectroscopic Binary  ---  OID=@2832443   (@@50149,0)  ---  coobox=17821 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "IOT CrB A" {ParentBody "IOT CrB"}
Remove "IOT CrB B" {ParentBody "IOT CrB"}
Star "IOT CrB A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "HIP 78493"
	Class           "A0IIIspHgMnEu"
	AbsMagn         0.08
	MassSol         1.90350906139727 // log(g) = 3.84 cm/s^2
	Radius          1910908.34802122 // 计算的值
	LumBol          90
	Teff            10727
	FeH             -0.01

	BinaryOrbit     
	{
		PeriodDays      35.474
		Eccentricity    0.56
		Epoch           2441566.96
		ArgOfPericenter 336
		MeanAnomaly     0
	}
}

Star "IOT CrB B"
{
	ParentBody      "HIP 78493"
	Class           "A"
}

// Object * rho CrB  ---  High Proper Motion Star  ---  OID=@2883111   (@@145110,0)  ---  coobox=17868 
// Object types: Rotating Variable,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "RHO CrB b" {ParentBody "RHO CrB"}
Remove "RHO CrB c" {ParentBody "RHO CrB"}
Remove "RHO CrB d" {ParentBody "RHO CrB"}
Remove "RHO CrB e" {ParentBody "RHO CrB"}
Star "RHO CrB A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "RHO CrB"
	Class           "G0+VaFe-1"
	AbsMagn         4.21
	MassSol         0.95
	RadSol          1.304
	LumBol          1.749
	Teff            5817
	FeH             -0.24
	RotationPeriod  487.2
	Age             10.2
}

// Object * rho CrB b  ---  Extra-solar Planet  ---  OID=@2882997   (@@126502,0)  ---  coobox=17868
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "RHO CrB b/HD 143761b"
{
	DateUpdated    "2023-11-22"
	ParentBody     "RHO CrB A"
	DiscMethod     "RadVel"
	DiscDate       "1997"
	Class          "GasGiant"
	MassJup        1.093

	Orbit
	{
		Epoch           2455498.7
		PeriodDays      39.8438
		SemiMajorAxis   0.2245
		Eccentricity    0.038
		ArgOfPericen    -90.36
	}
}

// Object * rho CrB c  ---  Extra-solar Planet  ---  OID=@10619867   (@@-1,255)  ---  coobox=17868
// Object types: Extra-solar Planet,Extra-solar Planet,Star
Planet "RHO CrB c/HD 143761c"
{
	DateUpdated    "2023-11-22"
	ParentBody     "RHO CrB A"
	DiscMethod     "RadVel"
	DiscDate       "2016"
	Class          "IceGiant"
	Mass           28.2

	Orbit
	{
		Epoch           2455609
		PeriodDays      102.19
		SemiMajorAxis   0.4206
		Eccentricity    0.096
		ArgOfPericen    9.7
	}
}

// Object * rho CrB d  ---  Extra-solar Planet  ---  OID=@23916483   (@@-1,255)  ---  coobox=17868
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"RHO CrB d"
{
	DateUpdated    "2023-11-22"
	ParentBody     "RHO CrB A"
	DiscMethod     "RadVel"
	DiscDate       "2023"
	Class          "IceGiant"
	Mass           21.6

	Orbit
	{
		Epoch           2455512
		PeriodDays      282.2
		SemiMajorAxis   0.827
		Eccentricity    0.0
		ArgOfPericen    0
	}
}

// Object * rho CrB e  ---  Extra-solar Planet Candidate  ---  OID=@24129326   (@@-1,255)  ---  coobox=17868
// Object types: Star,Extra-solar Planet Candidate
Planet	"RHO CrB e"
{
	DateUpdated    "2023-11-22"
	ParentBody     "RHO CrB A"
	DiscMethod     "RadVel"
	DiscDate       "2023"
	Class          "Terra" // ?
	Mass           3.79

	Orbit
	{
		Epoch           2455496.2
		PeriodDays      12.949
		SemiMajorAxis   0.1061
		Eccentricity    0.126
		ArgOfPericen    -0.6
	}
}