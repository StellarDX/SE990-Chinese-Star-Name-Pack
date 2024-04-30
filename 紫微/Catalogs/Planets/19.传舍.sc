// Object * 55 Cas  ---  Double or Multiple Star  ---  OID=@224065   (@@3677,10)  ---  coobox=2435 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "55 Cas A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "55 Cas"
	Class           "F9II"
	AbsMagn         -1.51 // 计算的值
	//MassSol          // log(g) = 1.982 cm/s^2
	Teff            5665
	FeH             -1.279

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.60511036
		Eccentricity    0.0657629016
		Inclination     -0.953189373
		AscendingNode   0
		ArgOfPericenter 84.1672912
		MeanAnomaly     46.4240544
	}
}

Star "55 Cas B"
{
	ParentBody      "55 Cas"
	Class           "A2Vn"
}

// Object HD 21291  ---  Blue Supergiant  ---  OID=@243229   (@@2351,0)  ---  coobox=2822 
// Object types: Blue Supergiant,Pulsating Variable,Double or Multiple Star,Near-IR Source (λ < 3 µm),Emission-line Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "CS Cam A" {ParentBody "CS Cam"}
Remove "CS Cam B" {ParentBody "CS Cam"}
Star "HD 21291 A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "HD 21291"
	Class           "B9Ia"
	AbsMagn         -5.67
	MassSol         19
	RadSol          85.7
	LumBol          75900
	Teff            10800
	Age             0.0165

	BinaryOrbit     
	{
		Separation      2279.85133560826 // 2.4 asec
	}
}

Star "HD 21291 B"
{
	ParentBody      "HD 21291"
	Class           "B2III"
}

// Object HD 21447  ---  Star  ---  OID=@212282   (@@1718,0)  ---  coobox=2677 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "HD 21447 A"
{
	DateUpdated     "2024-04-30"
	ParentBody      "HD 21447"
	Class           "A1Va"
	AbsMagn         1.17
	MassSol         2.32
	RadSol          1.9
	LumBol          32.16
	Teff            10049
	Age             0.146

	BinaryOrbit     
	{
		Separation      872.796363153695 // 14.61 asec
	}
}

Star "HD 21447 B/Gaia DR3 448233167950718080/TIC 316449921/ADS 2565 B/AG+55 345/BD+54 684B/CCDM J03300+5527B/CSI+54 684 1/GEN# +1.00021447B/IDS 03224+5506 B/PPM 28514/UBV 3321/WDS J03300+5527B/** STF 390B/2MASS J03300078+5526528/Gaia DR2 448233167950718080"
{
	DateUpdated     "2024-04-30"
	ParentBody      "HD 21447"
	Parallax        18.0814
	AppMagn         10.02
	Class           ""
	AbsMagn         6.31 // 计算的值
	MassKg          1.72423604737673e+30 // log(g) = 4.423 cm/s^2
	RadSol          0.9475 // Gaia DR3
	LumBol          0.378800845570069 // 计算的值
	Teff            4652
	FeH             -0.227
}