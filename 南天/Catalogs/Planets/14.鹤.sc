// Object * eps Gru  ---  Spectroscopic Binary  ---  OID=@3356243   (@@74768,13)  ---  coobox=24265 
// Object types: Spectroscopic Binary,High Proper Motion Star,Rotating Variable,Near-IR Source (λ < 3 µm),Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "EPS Gru A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "EPS Gru"
	Class           "A2IVn"
	AbsMagn         0.52
	MassSol         1.85
	Radius          2884351.92024831 // log(g) = 3.47 cm/s^2
	LumBol          88.11005207693351 // 计算的值
	Teff            8685
	FeH             -0.16
	Age             0.249
	Oblateness      0.15254237288135593220338983050847 // Vsini = 235.1 Km/s
}

// Object * gam Tuc  ---  High Proper Motion Star  ---  OID=@3322478   (@@74197,0)  ---  coobox=24120 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HR&number=8848
Barycenter "GAM Tuc A"
{
	ParentBody      "GAM Tuc"
	BinaryOrbit     
	{
		Period          750.252
		Separation      114.108648286581 // 5.03 asec
	}
}

Star "GAM Tuc Aa"
{
	DateUpdated     "2024-08-05"
	ParentBody      "GAM Tuc A"
	Class           "F4V"
	AbsMagn         2.18
	MassSol         1.55
	RadSol          2.2
	LumBol          11.33
	Teff            6679
	FeH             -0.22
	Age             1.414

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.104565465
		Eccentricity    0.174948357
		Inclination     1.85677743
		AscendingNode   0
		ArgOfPericenter 28.7070622
		MeanAnomaly     164.301974
	}
}

Star "GAM Tuc Ab"
{
	ParentBody      "GAM Tuc A"
	Class           "G4.2?"
}

// Object * gam Tuc B  ---  High Proper Motion Star  ---  OID=@15596212   (@@-1,255)  ---  coobox=24120 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "GAM Tuc B/Gaia DR3 6492406743706909568/** GAT 31B/WDS J23174-5814B/Gaia DR2 6492406743706909568"
{
	DateUpdated     "2024-08-05"
	ParentBody      "GAM Tuc"
	Class           ""
	MassSol         0.47
}

// Object * iot Gru  ---  Spectroscopic Binary  ---  OID=@3356820   (@@75606,3)  ---  coobox=24298 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "IOT Gru A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "IOT Gru"
	Class           "K1III"
	AbsMagn         0.13
	LumBol          107

	BinaryOrbit     
	{
		PeriodDays      409.614
		Separation      0.481837775420591 // 7.82 asec
		Eccentricity    0.66
		Inclination     114.3
		Epoch           2416115.569
		ArgOfPericenter 60.8
		MeanAnomaly     0
	}
}

Star "IOT Gru B"
{
	ParentBody      "IOT Gru"
	Class           "F1.8?"
}

// Object * tet Gru  ---  Double or Multiple Star  ---  OID=@1148648   (@@23547,12)  ---  coobox=8744 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=218227
Barycenter "TET Gru AB"
{
	ParentBody      "TET Gru"
	BinaryOrbit     
	{
		Period          212969
		Separation      6441.56878455753 // 159.3 asec
	}
}

// Object * tet Gru A  ---  High Proper Motion Star  ---  OID=@9056705   (@@-1,255)  ---  coobox=8744 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "TET Gru A/Gaia DR3 6541802406664428672/TYC 8012-1248-1/CCDM J23068-4331A/** JC 20A/HD 218227A/CD-44 15149A/WDS J23069-4331A/Gaia DR2 6541802406664428672"
{
	DateUpdated     "2024-08-05"
	ParentBody      "TET Gru AB"
	Class           "kF3VhF5mF5(II-III)"
	AbsMagn         1.25
	MassSol         1.97
	LumBol          27
	RadSol          3.425 // Gaia DR3
	Teff            6700
	FeH             -0.062

	BinaryOrbit     
	{
		Period          241.009
		Separation      56.2071217320363 // 1.39 asec
	}
}

// Object * tet Gru B  ---  Star  ---  OID=@9056707   (@@-1,255)  ---  coobox=8744 
// Object types: Double or Multiple Star,Star 
Star "TET Gru B/TYC 8012-1248-2/CCDM J23068-4331B/** JC 20B/HD 218227B/CD-44 15149B/WDS J23069-4331B/Gaia DR2 6541802402371581568"
{
	DateUpdated     "2024-08-05"
	ParentBody      "TET Gru AB"
	Class           ""
	MassSol         1.19
}

// Object HD 218205  ---  High Proper Motion Star  ---  OID=@1148647   (@@23547,11)  ---  coobox=8744 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 218205/Gaia DR3 6541802578463122688/WISEA J230639.11-433013.6/TIC 139232645/CCDM J23068-4331C/CD-44 15146/CPC 0 20286/CPD-44 10295/GC 32180/GSC 08011-01354/HIC 114112/HIP 114112/PPM 328949/SAO 231443/SKY# 43861/SRS 2757/TYC 8011-1354-1/uvby98 100218205/WDS J23069-4331C/CSI-44 10297 42/PMSC 23012-4404C/UCAC4 233-188277/2MASS J23063915-4330135/WISE J230639.11-433013.5/DENIS J230639.1-433012/GEN# +1.00218205/Gaia DR2 6541802578463122688/Gaia DR1 6541802574167696128"
{
	DateUpdated     "2024-08-05"
	ParentBody      "TET Gru"
	Parallax        24.9071
	AppMagn         7.71
	Class           "G2V"
	AbsMagn         4.69 // 计算的值
	MassSol         0.98
	RadSol          1.07225 // Gaia DR3
	LumBol          1.15450531900128 // 计算的值
	Teff            5778
	FeH             -0.215
}

// Object * mu.01 Gru  ---  Double or Multiple Star  ---  OID=@1145491   (@@23451,3)  ---  coobox=8354 
// Object types: High Proper Motion Star,Red Giant Branch star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "MU1 Gru A" {ParentBody "MU1 Gru"}
Remove "MU1 Gru B" {ParentBody "MU1 Gru"}
Star "MU1 Gru A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "Gaia DR3 6569894104123050752"
	Class           "G8III"
	AbsMagn         0.17
	RadSol          9.3
	LumBol          66.9
	Teff            5422

	BinaryOrbit     
	{
		Period          19.04
		Separation      18.0029449808602 // 0.168 asec
		Eccentricity    0.561
		Inclination     65.69
		AscendingNode   104.2
		Epoch           2450211.399372549261898
		ArgOfPericenter 272.61
		MeanAnomaly     0
	}
}

Star "MU1 Gru B"
{
	DateUpdated     "2024-08-05"
	ParentBody      "Gaia DR3 6569894104123050752"
	Class           "A6" // G
}