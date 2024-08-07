// Object * nu. Ari  ---  Star  ---  OID=@1496430   (@@31300,0)  ---  coobox=12197 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Star "NU Ari A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "NU Ari"
	Class           "A7V"
	AbsMagn         0.40
	MassSol         2.43
	RadSol          1.8
	LumBol          63.5
	Teff            8000
	Age             0.621

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.538055485
		Eccentricity    0
		Inclination     -1.78313828
		AscendingNode   0
		ArgOfPericenter -40.2810314
		MeanAnomaly     -162.607113
	}
}

Star "NU Ari B"
{
	DateUpdated     "2024-06-23"
	ParentBody      "NU Ari"
	Class           ""
	MassSol         1.0
	Teff            5551
	FeH             0.0
}

// Object * mu. Ari  ---  Double or Multiple Star  ---  OID=@1496417   (@@31052,6)  ---  coobox=12196 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=12640
Barycenter "MU Ari A"
{
	ParentBody      "MU Ari"
	BinaryOrbit     
	{
		Period          51715
		Separation      2503.23635929744 // 18.95 asec
	}
}

Barycenter "MU Ari Aab"
{
	ParentBody      "MU Ari A"
	BinaryOrbit     
	{
		Period          8.845
		Separation      7.4438348437872 // 0.0563 asec
		Eccentricity    0.337
		Inclination     71.2
		AscendingNode   101.0
		Epoch           2444641.090598940383643
		ArgOfPericenter 272.3
		MeanAnomaly     0
	}
}

Star "MU Ari Aa"
{
	DateUpdated     "2024-06-23"
	ParentBody      "MU Ari Aab"
	Class           "A0Vp"
	AbsMagn         0.41
	MassSol         3.4
	LumBol          71.7

	BinaryOrbit     
	{
		Separation      0.556378338689618 // 0.04 asec (?????) (/10)
	}
}

Star "MU Ari Ab"
{
	DateUpdated     "2024-06-23"
	ParentBody      "MU Ari Aab"
	Class           "F2V"
	MassSol         2.1
}

Star "MU Ari Ac"
{
	DateUpdated     "2024-06-23"
	ParentBody      "MU Ari A"
	Class           "A1V"
	MassSol         2.30
}

// Object UCAC4 551-005131  ---  High Proper Motion Star  ---  OID=@1496418   (@@31052,7)  ---  coobox=12196 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC4 551-005131/Gaia DR3 84945111561997056/TIC 301798380/ADS 2062 B/CCDM J02424+2001B/CSI+19 403 2/IDS 02367+1935 B/WDS J02424+2001B/** BU 522B/PMSC 02367+1935B/2MASS J02422059+2000396/Gaia DR2 84945107268953472"
{
	DateUpdated     "2024-06-23"
	ParentBody      "MU Ari"
	Class           ""
	MassKg          1.32539760095286e+30 // log(g) = 4.429 cm/s^2
	RadSol          0.825 // Gaia DR3
	LumBol          0.243936310174459 // 计算的值
	Teff            4466
	FeH             -0.975
}

// Object * sig Ari  ---  Star  ---  OID=@1477876   (@@30841,0)  ---  coobox=12028 
// Object types: Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "SIG Ari A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "SIG Ari"
	Class           "B7V"
	AbsMagn         -0.38
	MassSol         3.84
	RadSol          3
	LumBol          301
	Teff            13121
	Age             0.036

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   253.137534
		Eccentricity    0.773899289
		Inclination     0.580688953
		AscendingNode   0
		ArgOfPericenter -130.024946
		MeanAnomaly     70.2618615
	}
}

Star "SIG Ari B"
{
	DateUpdated     "2024-06-23"
	ParentBody      "SIG Ari"
	Class           ""
	MassSol         1.0
	Teff            5524
	FeH             -0.5
}

// Object * pi. Ari  ---  Double or Multiple Star  ---  OID=@1486409   (@@31061,0)  ---  coobox=12200 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=13165
Barycenter "PI Ari AB"
{
	ParentBody      "PI Ari"
	BinaryOrbit     
	{
		Period          137279
		Separation      5983.25359280108 // 25.01 asec
	}
}

// Object * pi. Ari A  ---  Spectroscopic Binary  ---  OID=@1486411   (@@31061,2)  ---  coobox=12200 
// Object types: Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "PI Ari A/Gaia DR3 83369717557815296/ADS 2151 A/BD+16 355A/CSI+16 355 3/UBV 2755/WDS J02493+1728A/PMSC 02437+1702A/PMSC 02437+1702Aab/SBC7 102/SBC9 146/TYC 1223-1987-1/Gaia DR2 83369717557815296"
{
	ParentBody      "PI Ari AB"
	BinaryOrbit     
	{
		Period          6628
		Separation      609.48599641445 // 3.30 asec
	}
}

Star "PI Ari A1"
{
	DateUpdated     "2024-06-23"
	ParentBody      "PI Ari A"
	Class           "B6"
	AbsMagn         -1.56
	MassSol         6.88
	LumBol          538

	BinaryOrbit // SB9_146 1917PDO.....4...69Y
	{
		PeriodDays      3.8540
		Eccentricity    0.040
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2420370.260
		ArgOfPericenter 258.3
		MeanAnomaly     0
	}
}

Star "PI Ari A2"
{
	DateUpdated     "2024-06-23"
	ParentBody      "PI Ari A"
	Class           ""
	MassSol         1
}

// Object * pi. Ari B  ---  Star  ---  OID=@11605937   (@@-1,255)  ---  coobox=12200 
// Object types: Double or Multiple Star,Star 
Star "PI Ari B/Gaia DR3 83369713262776960/TYC 1223-1990-1/ADS 2151 B/BD+16 355B/CSI+16 355 4/HD 17543B/IDS 02437+1703 B/WDS J02493+1728B/** STF 311B/PMSC 02437+1702B/Gaia DR2 83369713262776960"
{
	DateUpdated     "2024-06-23"
	ParentBody      "PI Ari AB"
	Parallax        4.9642
	AppMagn         7.92
	Class           "A0Vp"
	AbsMagn         1.4 // 计算的值
	MassSol         2.34
}

// Object UCAC2 37832261  ---  Star  ---  OID=@1486410   (@@31061,1)  ---  coobox=12200 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC2 37832261/Gaia DR3 83369713262751744/TIC 218293139/ADS 2151 C/CCDM J02493+1728C/CSI+16 355 2/HD 17543C/IDS 02437+1703 C/UBV 2757/WDS J02493+1728C/** STF 311C/PMSC 02437+1702C/UCAC4 538-005069/2MASS J02491920+1727430/Gaia DR2 83369713262751744"
{
	DateUpdated     "2024-06-23"
	ParentBody      "PI Ari"
	Class           "F8V"
	MassSol         1.14
}