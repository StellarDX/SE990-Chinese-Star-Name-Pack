// Object * bet Her  ---  Spectroscopic Binary  ---  OID=@2779309   (@@50897,0)  ---  coobox=18176 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Kornephoros A" {ParentBody "Kornephoros"}
Remove "BET Her B" {ParentBody "Kornephoros"}
Star "BET Her A"
{
	DateUpdated     "2024-05-14"
	ParentBody      "BET Her"
	Class           "G7IIIaFe-0.5"
	AbsMagn         -0.49
	MassSol         2.9
	RadSol          17
	LumBol          151
	Teff            4887
	FeH             -0.27

	BinaryOrbit     
	{
		PeriodDays      410.6
		Separation      0.520444280199756 // 11.37 mas
		Eccentricity    0.55
		Inclination     53.8
		AscendingNode   341.9
		Epoch           2415500.4
		ArgOfPericenter 24.6
		MeanAnomaly     0
	}
}

Star "BET Her B"
{
	DateUpdated     "2024-05-14"
	ParentBody      "BET Her"
	Class           ""
	MassSol         0.9
}

// Object * gam Her  ---  Double or Multiple Star  ---  OID=@2761392   (@@50903,7)  ---  coobox=17660 
// Object types: Long-Period Variable,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
Remove "GAM Her A" {ParentBody "GAM Her"}
Remove "GAM Her B" {ParentBody "GAM Her"}
Star "GAM Her A"
{
	DateUpdated     "2024-05-14"
	ParentBody      "HIP 80170"
	Class           "A9IIIbn"
	AbsMagn         -0.12
	MassKg          5.20883719844153e+30 // log(g) = 3.3 cm/s^2
	RadSol          6
	LumBol          92
	Teff            7031
	FeH             0.07

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   112.64345
		Eccentricity    0.743565152
		Inclination     1.04488432
		AscendingNode   0
		ArgOfPericenter -110.710397
		MeanAnomaly     -57.5672433
	}
}

Star "GAM Her B"
{
	ParentBody      "HIP 80170"
	Class           "G9.2?"
}

// Object * bet Ser  ---  High Proper Motion Star  ---  OID=@2743279   (@@49585,0)  ---  coobox=17617 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "BET Ser (AB)" {ParentBody "BET Ser"}
Remove "BET Ser C" {ParentBody "BET Ser"}
Remove "BET Ser A" {ParentBody "BET Ser (AB)"}
Remove "BET Ser B" {ParentBody "BET Ser (AB)"}
Star "BET Ser A"
{
	DateUpdated     "2024-05-14"
	ParentBody      "BET Ser"
	Class           "A2IV"
	AbsMagn         0.30
	MassSol         1.94
	Radius          3718461.14991127 // log(g) = 3.27 cm/s^2
	LumBol          163.52828973796983 // 计算的值
	Teff            8928
	Age             0.267

	BinaryOrbit     
	{
		Separation      1408.36590786995 // 30.41 asec
	}
}

// Object * bet Ser B  ---  High Proper Motion Star  ---  OID=@2743237   (@@49573,9)  ---  coobox=17617 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BET Ser B/Gaia DR3 1195823181311716096/TIC 119885025/ADS 9778 B/AG+15 1579/BD+15 2911B/CCDM J15461+1525B/CSI+15 2911 2/GCRV 9095/GEN# +1.00141003B/IDS 15416+1544 B/UBV 13432/2MASS J15460916+1525153/WDS J15462+1525B/** STF 1970B/UCAC3 211-126929/UCAC4 528-059497/WEB 13086/Gaia DR2 1195823181311716096"
{
	DateUpdated     "2024-05-14"
	ParentBody      "BET Ser"
	Class           "K3V"
	AbsMagn         6.59
}

// Object * del Ser  ---  Double or Multiple Star  ---  OID=@2711667   (@@49307,4)  ---  coobox=17513 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source 
Remove "DEL Ser (AB)" {ParentBody "DEL Ser"}
Remove "DEL Ser (CD)" {ParentBody "DEL Ser"}
Remove "DEL Ser A" {ParentBody "DEL Ser (AB)"}
Remove "DEL Ser B" {ParentBody "DEL Ser (AB)"}
Remove "DEL Ser C" {ParentBody "DEL Ser (CD)"}
Remove "DEL Ser D" {ParentBody "DEL Ser (CD)"}
Star "DEL Ser A"
{
	DateUpdated     "2024-05-14"
	ParentBody      "DEL Ser"
	Class           "A9IV"
	AbsMagn         -0.42
	MassSol         2.6
	RadSol          5.2
	LumBol          76
	Teff            7364
	FeH             -0.02

	BinaryOrbit     
	{
		Period          3200
		Separation      279.020963268078 // 3.99 asec
	}
}

// Object * del Ser B  ---  High Proper Motion Star  ---  OID=@11606485   (@@-1,255)  ---  coobox=17513 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "DEL Ser B/Gaia DR3 1165987658411091200/TYC 933-1239-1/13 Ser B/ADS 9701 B/BD+11 2821B/CCDM J15348+1033B/CSI+11 2821 2/GC 20941/GCRV 8986/HD 138917/HR 5788/IDS 15300+1052 B/PPM 131518/ROT 2202/SAO 101623/SKY# 28167/UBV M 20843/WDS J15348+1032B/** STF 1954B/PLX 3517.00B/WEB 12949/Gaia DR2 1165987658411091200"
{
	DateUpdated     "2024-05-14"
	ParentBody      "DEL Ser"
	Class           "F0IV"
	MassSol         1.7
	RadSol          2.6
	LumBol          18.7
	Teff            7492
	FeH             -0.17
}