// Object * bet Mus  ---  Double or Multiple Star  ---  OID=@3300133   (@@67087,4)  ---  coobox=22021 
// Object types: Spectroscopic Binary,Pulsating Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,beta Cep Variable Candidate 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=62322
Remove "BET Mus A" {ParentBody "BET Mus"}
Remove "BET Mus B" {ParentBody "BET Mus"}
Barycenter "BET Mus AB"
{
	ParentBody      "BET Mus"
}

// Object * bet Mus A  ---  Double or Multiple Star  ---  OID=@3300134   (@@67087,5)  ---  coobox=22021 
// Object types: Double or Multiple Star,Star 
Barycenter "BET Mus A/Gaia DR3 5855802671046171648/CPD-67 2064A/CSI-67 2064 42/IDS 12402-6733 A/CCDM J12463-6806A/WDS J12463-6806Aa,Ab/** R 207A/** RIZ 5/TYC 9228-3047-1/WDS J12463-6806A"
{
	ParentBody      "BET Mus AB"
	BinaryOrbit // VB6_SOAR2019 R_207AB Gr.5
	{
		Period          188.0427
		Separation      121.465814453899 // 1.160 asec
		Eccentricity    0.788
		Inclination     53.3
		AscendingNode   138.6
		Epoch           2405600.351971239317209
		ArgOfPericenter 72.5
		MeanAnomaly     0
	}
}

Star "BET Mus A1"
{
	DateUpdated     "2024-08-02"
	ParentBody      "BET Mus A"
	Class           "B2V"
	AbsMagn         -2.06
	MassSol         7.35
	LumBol          1892
	Age             0.0151

	BinaryOrbit     
	{
		Period          0.795
		Separation      1.88677074422801 // 0.018 asec
	}
}

Star "BET Mus A2"
{
	DateUpdated     "2024-08-02"
	ParentBody      "BET Mus A"
	Class           ""
	MassSol         2
}

// Object * bet Mus B  ---  Star  ---  OID=@11621343   (@@-1,255)  ---  coobox=22021 
// Object types: Double or Multiple Star,Star 
Star "BET Mus B/Gaia DR3 5855802671045627648/CPD-67 2064B/CSI-67 2064 43/IDS 12402-6733 B/WDS J12463-6806B/** R 207B/TYC 9228-3047-2"
{
	DateUpdated     "2024-08-02"
	ParentBody      "BET Mus AB"
	Parallax        10.4285
	AppMagn         4
	Class           "B3V"
	AbsMagn         -0.9
	MassSol         6.40
}

Star "BET Mus C"
{
	DateUpdated     "2024-08-02"
	ParentBody      "BET Mus"
	Class           "M4"
	MassSol         0.42

	Orbit     
	{
		Period          242052
		SemiMajorAxis   9926.70148649111 // 94.8 asec
	}
}

// Object 1RXS J124634.5-680446  ---  Rotating Variable  ---  OID=@3300397   (@@67100,2)  ---  coobox=22021 
// Object types: Rotating Variable,Variable Star,Near-IR Source (λ < 3 µm),Star,Star,X-ray Source,Young Stellar Object Candidate 
Star "1RXS J124634.5-680446/Gaia DR3 5855802808484620288/TIC 329162367/2MASS J12463447-6804457/ASAS J124634-6804.7/Gaia DR2 5855802808484620288"
{
	DateUpdated     "2024-08-02"
	ParentBody      "BET Mus"
	Parallax        9.703
	AppMagn         11.392
	Class           "K7"
	AbsMagn         6.33
	AbsMagn         6.33 // 计算的值
	MassKg          1.71640585726621e+30 // log(g) = 4.136 cm/s^2
	RadSol          1.3155 // Gaia DR3
	LumBol          0.646750416687034 // 计算的值
	Teff            4513
	FeH             -0.413

	Orbit     
	{
		Period          443097
		SemiMajorAxis   14984.2928899147 // 143.10 asec
		ArgOfPericenter 43.7
		MeanAnomaly     0
	}
}

// Object * gam Mus  ---  Spectroscopic Binary  ---  OID=@3288568   (@@67578,0)  ---  coobox=22027 
// Object types: Spectroscopic Binary,Pulsating Variable,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Pulsating Variable,Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "GAM Mus A"
{
	DateUpdated     "2024-08-02"
	ParentBody      "GAM Mus"
	Class           "B5V"
	AbsMagn         -1.1
	MassSol         5.09
	RadSol          4.17
	LumBol          790
	Teff            15490
	Age             0.0677
	Oblateness      0

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0407836498
		Eccentricity    0
		Inclination     2.42598739
		AscendingNode   0
		ArgOfPericenter 8.26349127
		MeanAnomaly     -54.1685807
	}
}

Star "GAM Mus B"
{
	DateUpdated     "2024-08-02"
	ParentBody      "GAM Mus"
	Class           "A:"
}

// Object * del Mus  ---  Spectroscopic Binary  ---  OID=@3300893   (@@67568,4)  ---  coobox=22031 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source 
Remove "DEL Mus A" {ParentBody "DEL Mus"}
Remove "DEL Mus B" {ParentBody "DEL Mus"}
Star "DEL Mus A"
{
	DateUpdated     "2024-08-02"
	ParentBody      "HD 112985"
	Class           "K2III"
	AbsMagn         1.38
	LumBol          42

	BinaryOrbit     
	{
		PeriodDays      422.0266
		Separation      312.127225248901 // 11.67 asec
		Eccentricity    0.4918
		Inclination     120.07
		AscendingNode   59.27
		Epoch           2447947.6680
		ArgOfPericenter 136.39
		MeanAnomaly     0
	}
}

Star "DEL Mus B"
{
	ParentBody      "HD 112985"
	Class           "F3.2?"
}