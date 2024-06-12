// Object * ksi Aqr  ---  Spectroscopic Binary  ---  OID=@1321088   (@@27218,8)  ---  coobox=8553 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "KSI Aqr A" {ParentBody "KSI Aqr"}
Remove "KSI Aqr B" {ParentBody "KSI Aqr"}
Star "KSI Aqr A"
{
	DateUpdated     "2024-06-12"
	ParentBody      "Gaia DR3 2667335258168556928"
	Class           "A7V"
	AbsMagn         1.9
	MassSol         1.9
	Radius          2093337.16471172 // log(g) = 3.76 cm/s^2
	LumBol          28.540349346452963 // 计算的值
	Teff            7691
	FeH             -0.03

	BinaryOrbit // 未修改
	{
		PeriodDays      8016 
		Separation      15.3742
		Eccentricity    0.54
		Inclination     95
		AscendingNode   300
		ArgOfPericenter 270
		Epoch           2440733.364314
		MeanAnomaly     0
	}
}

Star "KSI Aqr B"
{
	DateUpdated     "2024-06-12"
	ParentBody      "Gaia DR3 2667335258168556928"
	Class           ""
	MassSol         0.9
}

// Object * 17 Aqr  ---  Star  ---  OID=@1310173   (@@26686,22)  ---  coobox=8501 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "17 Aqr A"
{
	DateUpdated     "2024-06-12"
	ParentBody      "17 Aqr"
	Class           "K4/5III"
	AbsMagn         -0.73
	MassKg          8.99342431940922e+30 // log(g) = 1.74 cm/s^2
	Radius          33049538.8494427 // 计算的值
	LumBol          495.46
	Teff            3951
	FeH             
	Age             

	BinaryOrbit     
	{
		PeriodDays      7290
		Eccentricity    0.4
	}
}

Star "17 Aqr B"
{
	ParentBody      "17 Aqr"
	Class           "A5?"
}