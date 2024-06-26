// Object * 35 Ari  ---  Spectroscopic Binary  ---  OID=@1538029   (@@32197,0)  ---  coobox=12258 
// Object types: Spectroscopic Binary,Pulsating Variable,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "35 Ari A" {ParentBody "35 Ari"}
Remove "35 Ari B" {ParentBody "35 Ari"}
Star "35 Ari A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "HIP 12719"
	Class           "B3V"
	AbsMagn         -1.71 // 计算的值
	MassSol         5.7
	RadSol          2.2 // 3.9
	LumBol          870
	Teff            17520
	Age             0.0055

	BinaryOrbit     
	{
		PeriodDays      490
		Eccentricity    0.14
	}
}

Star "35 Ari B"
{
	ParentBody      "HIP 12719"
	Class           "A0.2?"
}

// Object * 41 Ari  ---  Double or Multiple Star  ---  OID=@1538201   (@@32200,0)  ---  coobox=12264 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "41 Ari A" {ParentBody "Bharani"}
Remove "41 Ari B" {ParentBody "Bharani"}
Barycenter "41 Ari A"
{
	ParentBody      "41 Ari"
	BinaryOrbit     
	{
		Separation      6227.01869806726 // 122.61 asec
	}
}

Star "41 Ari Aa"
{
	DateUpdated     "2024-06-26"
	ParentBody      "41 Ari A"
	Class           "B8Vn"
	AbsMagn         0.07 // 计算的值
	MassSol         3.1
	Radius          2070337.90137817 // 计算的值
	LumBol          160
	Teff            11900
	Age             0.130
	Oblateness      0.10714285714285714285714285714286 // Vsini = 175 Km/s

	BinaryOrbit     
	{
		Separation      15.2357785234393 // 0.3 asec
	}
}

Star "41 Ari Ab"
{
	ParentBody      "41 Ari A"
	Class           "F1.2?"
}

// Object BD+26 470  ---  Star  ---  OID=@1538188   (@@32196,4)  ---  coobox=12264 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+26 470/Gaia DR3 116339535789426176/TIC 436872014/2MASS J02495136+2714303/AG+27 300/CCDM J02499+2715D/IDS 02441+2651 D/PPM 92009/SAO 75595/YZ 27 1468/WDS J02500+2716D/ADS 2159 D/BD+26 471D/CSI+26 471 4/GEN# +1.00017573D/HD 17573D/** H 5D/TYC 1789-927-1/Gaia DR1 116339531493439232/Gaia DR2 116339535789426176"
{
	DateUpdated     "2024-06-26"
	ParentBody      "41 Ari"
	Parallax        2.9505 // 这颗可能也是光学伴星
	AppMagn         8.68
	Class           "K0III"
	AbsMagn         1.03 // 计算的值
}
