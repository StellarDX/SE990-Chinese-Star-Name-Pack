// Object * 59 Dra b  ---  Extra-solar Planet Candidate  ---  OID=@3996380   (@@-1,255)  ---  coobox=889 
// Object types: Star,Extra-solar Planet Candidate 
Remove "HD 180777 b" {ParentBody "HD 180777"}
Planet "59 Dra b/HD 180777b"
{
	ParentBody     "59 Dra"
	DiscMethod     "RadVel"
	DiscDate       "2006"
	MassJup        25.0

	Orbit
	{
		Epoch           2453244.3
		PeriodDays      28.44
		SemiMajorAxis   0.22
		Eccentricity    0.2
		ArgOfPericen    56.0
	}
}

// Object * 40 Dra  ---  Spectroscopic Binary  ---  OID=@316081   (@@6676,14)  ---  coobox=981 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=166865
Barycenter "天柱五/40 Dra/1RXS J180004.5+800000/HIP 88127/Gaia DR3 2294405721759384064/TIC 288468223/SBC9 1032/ADS 11061 B/AG+79 490/BD+79 570/CCDM J18002+8000B/GC 24667/GCRV 10549/GEN# +1.00166865/GSC 04578-01434/HD 166865/HIC 88127/HR 6809/IDS 18076+7959 B/N30 4019/PPM 3146/ROT 2570/SAO 8994/SBC7 666/SKY# 32639/TYC 4578-1434-1/UBV 15475/UBV M 22731/uvby98 100166865/[B10] 4602/WDS J18002+8000B/** STF 2308B/2MASS J18000352+8000029/PMSC 18075+7959Bab/PMSC 18075+7959B/Gaia DR1 2294405717462880000/WEB 14885/Gaia DR2 2294405721759384064"
{
	DateUpdated     "2024-04-29"
	ParentBody      "ADS 11061"
	// Coordinate System: ICRS, Epoch: J2000, Equinox: 2000 
	RA              18 0 3.5284407912
	Dec             80 0 3.04820298
	Parallax        22.4338
	AppMagn         5.939
	Class           "F7"

	BinaryOrbit // VB6_Kis1996 STF2308AB Gr.5
	{
		Period          18000.0000
		Separation      1102.80023704014 // 24.740 asec
		Eccentricity    0.840
		Inclination     162.0
		AscendingNode   233.0
		Epoch           2955944.009914660826325
		ArgOfPericenter 138.0
		MeanAnomaly     0
	}
}

Star "40 Dra A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "40 Dra"
	Class           "F7V"
	AbsMagn         2.69 // 计算的值
	MassKg          2.36572560840644e+30 // log(g) = 3.814 cm/s^2
	RadSol          2.2375 // Gaia DR3
	LumBol          6.27792148359045 // 计算的值
	Teff            6108
	FeH             -0.321

	BinaryOrbit // SB9_1032 1995AstL...21..247T
	{
		PeriodDays      10.5279
		Eccentricity    0.374
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2448000.008
		ArgOfPericenter 246.2
		MeanAnomaly     0
	}
}

Star "40 Dra B"
{
	ParentBody      "40 Dra"
	Class           "F8V"
	MassSol         1.30
}

// Object * 41 Dra  ---  Spectroscopic Binary  ---  OID=@316082   (@@6677,0)  ---  coobox=981 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star,Infra-Red Source 
Barycenter "天柱增五/41 Dra/HIP 88136/Gaia DR3 2294405824838599808/TIC 288468229/2MASS J18000921+8000144/PLX 4176/SBC9 1501/ADS 11061 A/AG+79 491/BD+79 571/CCDM J18002+8000A/CSI+79 571 1/GC 24669/GCRV 10550/GEN# +1.00166866/GSC 04578-01433/HD 166866/HIC 88136/HR 6810/IDS 18076+7959 A/IRAS 18038+7959/N30 4020/PPM 3147/ROT 2571/SAO 8996/SKY# 32644/TYC 4578-1433-1/UBV 15474/UBV M 22732/uvby98 100166866/WDS J18002+8000Aa,Ab/** BAG 6/WDS J18002+8000A/PMSC 18075+7959A/PMSC 18075+7959Aab/** STF 2308A/WEB 14887/Gaia DR2 2294405824838599808"
{
	DateUpdated     "2024-04-29"
	ParentBody      "ADS 11061"
	// Coordinate System: ICRS, Epoch: J2000, Equinox: 2000 
	RA              18 0 9.1817075904
	Dec             80 0 14.807356056
	Parallax        21.3102
	AppMagn         5.642
	Class           "K2Vv"
}

Star "41 Dra A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "41 Dra"
	Class           "F7V"
	AbsMagn         2.28 // 计算的值

	BinaryOrbit // 2004A&A.409.245 Tok. et al.
	{
		PeriodDays      1246.6810
		Separation      3.1657389667071 // 0.071 asec
		Eccentricity    0.975
		Inclination     49.7
		AscendingNode   1.9
		Epoch           2449571.000
		ArgOfPericenter 127.3
		MeanAnomaly     0
	}
}

Star "41 Dra B"
{
	ParentBody      "41 Dra"
	Class           "F7V"
	MassSol         1.30
}