// Object * mu. Aqr  ---  Spectroscopic Binary  ---  OID=@2593169   (@@62771,0)  ---  coobox=19389 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "MU Aqr A"
{
	DateUpdated     "2024-06-08"
	ParentBody      "MU Aqr"
	Class           "A3II"
	AbsMagn         1.31
	MassKg          8.88065108213962e+30 // log(g) = 3.99 cm/s^2
	RadSol          3.54
	LumBol          25.6
	Teff            6906

	BinaryOrbit     
	{
		PeriodDays      1566
		Separation      0.4483
		Eccentricity    0.23
		Epoch           2410497
	}
}

Star "MU Aqr B"
{
	ParentBody      "MU Aqr"
	Class           "A1.7?"
}

// Object * 4 Aqr A  ---  High Proper Motion Star  ---  OID=@2619681   (@@62762,2)  ---  coobox=19436 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "4 Aqr A/Gaia DR3 6913299240769679488/ADS 14360 A/BD-06 5604A/CSI-06 5604 4/WDS J20514-0538A/TYC 5190-2008-1/CCDM J20514-0537A/** STF 2729A/HD 198571A/Gaia DR2 6913299240769679488"
{
	DateUpdated     "2024-06-08"
	ParentBody      "4 Aqr"
	Class           "F7IV"
	AbsMagn         2.15
	MassSol         1.618
	Radius          1853530.65067903 // 计算的值
	LumBol          11.0
	Teff            6440
	FeH             0.18
	Age             1.60

	BinaryOrbit     
	{
		Period          200.7
		Separation      49.5446241521704 // 0.816 asec
		Eccentricity    0.535
		Inclination     64.06
		AscendingNode   174.31
		Epoch           2413851.538483900949359
		ArgOfPericenter 225.9
		MeanAnomaly     0
	}
}

// Object * 4 Aqr B  ---  High Proper Motion Star  ---  OID=@2619682   (@@62762,3)  ---  coobox=19436 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "4 Aqr B/ADS 14360 B/BD-06 5604B/CSI-06 5604 5/WDS J20514-0538B/TYC 5190-2008-2/CCDM J20514-0537B/** STF 2729B/HD 198571B/Gaia DR2 6913299245065236096"
{
	DateUpdated     "2024-06-08"
	ParentBody      "4 Aqr"
	Parallax        17.21
	AppMagn         7.42
	Class           "F6:V:"
	AbsMagn         3.6 // 计算的值
	MassSol         1.331
}
