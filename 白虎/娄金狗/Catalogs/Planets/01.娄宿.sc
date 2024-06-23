// Object * bet Ari  ---  Spectroscopic Binary  ---  OID=@1485518   (@@31033,0)  ---  coobox=12064 
// Object types: Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "Sheratan A" {ParentBody "Sheratan"}
Remove "Sheratan B" {ParentBody "Sheratan"}
Star "BET Ari A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "BET Ari"
	Class           "A5V"
	AbsMagn         1.55
	MassSol         2.34
	RadSol          2.262
	LumBol          23
	Teff            9000
	FeH             0.16
	Age             0.3

	BinaryOrbit     
	{
		PeriodDays      106.9954
		Separation      0.648693957735737 // 36.1 mas
		Eccentricity    0.903
		Inclination     44.7
		AscendingNode   79.1
		ArgOfPericenter 29.1
		MeanAnomaly     0
	}
}

Star "BET Ari B"
{
	DateUpdated     "2024-06-23"
	ParentBody      "BET Ari"
	Class           ""
	MassSol         1.34
	LumBol          1.3
}

// Object * gam01 Ari  ---  High Proper Motion Star  ---  OID=@1476754   (@@30803,0)  ---  coobox=11893 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Remove "GAM1 Ari" {ParentBody "Mesarthim"}
Remove "GAM2 Ari" {ParentBody "Mesarthim"}
Barycenter "GAM1 Ari/Gaia DR3 93806419367307904/TIC 91329517/5 Ari B/ADS 1507 B/BD+18 243B/CCDM J01536+1918B/CSI+18 243 1/GC 2290/GCRV 1053/HD 11502/HGAM 94/HR 545/ROT 265/SAO 92680/SKY# 2776/WDS J01535+1918B/TYC 1209-1833-1/UCAC4 547-003513/2MASS J01533181+1917456/WISE J015331.86+191744.5/WEB 1859/Gaia DR2 93806419367307904"
{
	ParentBody      "GAM Ari"
	BinaryOrbit     
	{
		Period          3098
		Separation      379.778704642941 // 7.55 asec
	}
}

Star "GAM1 Ari A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "GAM1 Ari"
	Parallax        18.8809
	AppMagn         4.589
	Class           "A0Vnp_lB"
	AbsMagn         0.97 // 计算的值
	MassSol         2.67
	RadSol          2.014
	LumBol          42.0
	Teff            10356
	Age             0.034

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.914192234
		Eccentricity    0.21113227
		Inclination     -2.47793293
		AscendingNode   0
		ArgOfPericenter -151.831384
		MeanAnomaly     12.9055936
	}
}

Star "GAM1 Ari B"
{
	DateUpdated     "2024-06-23"
	ParentBody      "GAM1 Ari"
	Class           ""
	MassSol         0.7
	Teff            4312
	FeH             -0.5
}

// Object * gam02 Ari  ---  High Proper Motion Star  ---  OID=@1476755   (@@30803,1)  ---  coobox=11893 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "GAM2 Ari/Gaia DR3 93806419367308544/TIC 91329512/5 Ari A/ADS 1507 A/BD+18 243A/CCDM J01536+1918A/CSI+18 243 2/GC 2291/GCRV 1054/HD 11503/HGAM 95/HR 546/N30 390/ROT 266/SAO 92681/SKY# 2777/YPAC 282/TYC 1209-1835-1/GSC 01209-01835/WDS J01535+1918A/Renson 2930/** STF 180A/UCAC4 547-003512/2MASS J01533181+1917381/WISE J015331.85+191737.1/uvby98 100011503/WEB 1860/Gaia DR2 93806419367308544"
{
	DateUpdated     "2024-06-23"
	ParentBody      "GAM Ari"
	Parallax        19.6268
	AppMagn         4.52
	Class           "A2IVpSiSrCr"
	AbsMagn         0.98 // 计算的值
	MassSol         2.72
	RadSol          1.941
	LumBol          41.5
	Teff            10512
	FeH             0.43
}

// Object * alf Ari b  ---  Extra-solar Planet  ---  OID=@5755173   (@@-1,255)  ---  coobox=12077
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "ALF Ari b"
{
	ParentBody     "ALF Ari"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	MassJup        1.8

	Orbit
	{
		Epoch           2451213.52
		PeriodDays      380.8
		SemiMajorAxis   1.2
		Eccentricity    0.25
		ArgOfPericen    89.16
	}
}