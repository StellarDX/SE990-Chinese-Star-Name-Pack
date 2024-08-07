// Object * iot UMa A  ---  Spectroscopic Binary  ---  OID=@8263878   (@@-1,255)  ---  coobox=3903 
// Object types: Double or Multiple Star,Spectroscopic Binary,High Proper Motion Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=44127
Remove "Talitha Borealis A" {ParentBody "Talitha Borealis"}
Remove "Talitha Borealis (BC)" {ParentBody "Talitha Borealis"}
Remove "Talitha Borealis Aa" {ParentBody "Talitha Borealis A"}
Remove "Talitha Borealis Ab" {ParentBody "Talitha Borealis A"}
Remove "Talitha Borealis B" {ParentBody "Talitha Borealis (BC)"}
Remove "Talitha Borealis C" {ParentBody "Talitha Borealis (BC)"}
Barycenter "IOT UMa A/GJ 331.0/GJ 331 A/Gaia DR3 1014058103758571520/BD+48 1707A/LHS 2084/LTT 12347/NLTT 20650/SBC7 359/SBC9 543/LFT 620/TYC 3420-2149-1/GCRV 5900/** HJ 2477A/ADS 7114 A/CCDM J08592+4803A/IDS 08524+4826 A/WDS J08592+4803A/PMSC 08524+4826A/PMSC 08524+4826Aab/Gaia DR2 1014058103756663936/LSPM J0859+4802A"
{
	ParentBody      "IOT UMa"
	BinaryOrbit // VB6_Izm2019  HJ_2477A,B Gr.5
	{
		Period          486.0288
		Separation      120.603597746352 // 8.312 asec
		Eccentricity    0.468
		Inclination     75.7
		AscendingNode   165.2
		Epoch           2488547.951041000429541
		ArgOfPericenter 33.3
		MeanAnomaly     0
	}
}

Star "IOT UMa Aa"
{
	DateUpdated     "2024-05-07"
	ParentBody      "IOT UMa A"
	Class           "A7V(n)"
	AbsMagn         2.31
	MassSol         1.7
	Radius          1381530.56964838 // 计算的值
	LumBol          9.87
	Teff            7260
	Age             0.620

	BinaryOrbit // SB9_543 1965ApJS...11..429A
	{
		PeriodDays      4028.0000
		Eccentricity    0.360
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2416342.000
		ArgOfPericenter 213.0
		MeanAnomaly     0
	}
}

Star "IOT UMa Ab"
{
	ParentBody      "IOT UMa A"
	Class           "WD?"
}

// Object NAME * iot UMa BC  ---  Double or Multiple Star  ---  OID=@539624   (@@1596,0)  ---  coobox=3903 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Barycenter "IOT UMa BC"
{
	ParentBody      "IOT UMa"
}

Star "IOT UMa B"
{
	DateUpdated     "2024-05-07"
	ParentBody      "IOT UMa BC"
	Class           "M3V"
	MassSol         0.35 

	BinaryOrbit // VB6_DRs2012 HU_628BC Gr.3
	{
		Period          39.4000
		Separation      10.1567623868547 // 0.700 asec
		Eccentricity    0.350
		Inclination     111.6
		AscendingNode   24.5
		Epoch           2451215.815419197082520
		ArgOfPericenter 354.2
		MeanAnomaly     0
	}
}

Star "IOT UMa C"
{
	DateUpdated     "2024-05-07"
	ParentBody      "IOT UMa BC"
	Class           "M4V"
	MassSol         0.30
}

// Object * kap UMa  ---  Double or Multiple Star  ---  OID=@539658   (@@1598,13)  ---  coobox=3903 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "Talitha Australis A" {ParentBody "Talitha Australis"}
Remove "Talitha Australis B" {ParentBody "Talitha Australis"}
Star "KAP UMa A"
{
	DateUpdated     "2024-05-07"
	ParentBody      "KAP UMa"
	Class           "A0IV-V"
	AbsMagn         -1.63
	MassSol         3.79
	RadSol          7.87
	LumBol          375.9723731646358 // 计算的值
	Teff            9060

	BinaryOrbit     
	{
		PeriodDays      13007.2
		Separation      19.9948163086821 // 0.18194 asec
		Eccentricity    0.5584
		Inclination     109.410
		AscendingNode   105.641
		Epoch           2450404
		ArgOfPericenter 175.63
		MeanAnomaly     0
	}
}

Star "kap UMa B"
{
	DateUpdated     "2024-05-07"
	ParentBody      "KAP UMa"
	Class           "A0V"
}

// Object * mu. UMa  ---  Spectroscopic Binary  ---  OID=@1705278   (@@35137,7)  ---  coobox=12372 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "Tania Australis A" {ParentBody "Tania Australis"}
Remove "Tania Australis B" {ParentBody "Tania Australis"}
Star "MU UMa A"
{
	DateUpdated     "2024-05-07"
	ParentBody      "MU UMa"
	Class           "M0III"
	AbsMagn         -1.11
	MassSol         6.3
	RadSol          75
	LumBol          977 // 1200
	Teff            3899
	FeH             0.00

	BinaryOrbit     
	{
		PeriodDays      230.089
		//Separation      0.2 // 粘一块了
		Eccentricity    0.061
		Inclination     13.6
		Epoch           2425577.030
		ArgOfPericenter 56.4
		MeanAnomaly     0
	}
}

Star "MU UMa B"
{
	ParentBody      "MU UMa"
	Class           ""
	MassSol         2.7 // 官方星表说双星总质量是9太阳质量，存疑
}

// Object * nu. UMa  ---  Star  ---  OID=@1800838   (@@37379,1)  ---  coobox=12736 
// Object types: Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "Alula Borealis A" {ParentBody "Alula Borealis"}
Remove "Alula Borealis B" {ParentBody "Alula Borealis"} // B为光学伴星

// Object * ksi UMa  ---  RS CVn Variable  ---  OID=@1800872   (@@37403,0)  ---  coobox=12738 
// Object types: Double or Multiple Star,RS CVn Variable,High Proper Motion Star,High Proper Motion Star,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=55203
Remove "Alula Australis (AB)"{ParentBody "Alula Australis"}
Remove "Alula Australis A"{ParentBody "Alula Australis (AB)"}
Remove "Alula Australis B"{ParentBody "Alula Australis (AB)"}
Remove "Alula Australis E"{ParentBody "Alula Australis"}
Remove "Alula Australis Aa"{ParentBody "Alula Australis A"}
Remove "Alula Australis Ab"{ParentBody "Alula Australis A"}
Remove "Alula Australis Ba"{ParentBody "Alula Australis B"}
Remove "Alula Australis Bb"{ParentBody "Alula Australis B"}
Barycenter "** WTE 1 AB"
{
	ParentBody      "KSI UMa"
}

// Object * ksi UMa A  ---  Spectroscopic Binary  ---  OID=@1800870   (@@37402,0)  ---  coobox=12738 
// Object types: Double or Multiple Star,Spectroscopic Binary,High Proper Motion Star,Star 
Barycenter "KSI UMa A/GJ 423 C/GJ 423 A/Gaia DR3 756853643638639104/WDS J11182+3132A/53 UMa A/ADS 8119 A/BD+32 2132A/CCDM J11182+3132A/CSI+32 2132 1/GCRV 6920/HD 98231/HR 4375/IDS 11128+3206 A/LFT 790/LHS 2390/LTT 13045/NLTT 26920/ROT 1680/SBC7 428/TYC 2520-2634-1/Zkh 153/SBC9 668/** STF 1523A/PMSC 11128+3205A/PMSC 11128+3205Aab/Gaia DR2 756853643637996672/WEB 9947/LSPM J1118+3131A"
{
	ParentBody      "** WTE 1 AB"
	BinaryOrbit // VB6_Msn1995 STF1523AB Gr.1
	{
		Period          59.8780
		Separation      22.402838893828 // 2.536 asec
		Eccentricity    0.398
		Inclination     122.1
		AscendingNode   101.8
		Epoch           2427875.012706097215414
		ArgOfPericenter 127.9
		MeanAnomaly     0
	}
}

Star "KSI UMa Aa"
{
	DateUpdated     "2024-05-07"
	ParentBody      "KSI UMa A"
	Class           "F8.5:V"
	AbsMagn         4.06 // 计算的值
	MassSol         0.97
	RadSol          1.02
	LumBol          1.21
	Teff            6005

	BinaryOrbit // VB6_Hei1996b STF1523A Gr.9
	{
		Period          1.8340
		Separation      0.476792214650121 // 0.054 asec
		Eccentricity    0.610
		Inclination     91.0
		AscendingNode   318.0
		Epoch           2448728.516045498661697
		ArgOfPericenter 324.0
		MeanAnomaly     0
	}
}

Star "KSI UMa Ab"
{
	DateUpdated     "2024-05-07"
	ParentBody      "KSI UMa A"
	Class           "M"
	MassSol         0.38
	RadSol          0.32
	LumBol          0.017290220474792405 // 计算的值
	Teff            3700
}

// Object * ksi UMa B  ---  Spectroscopic Binary  ---  OID=@1800871   (@@37402,1)  ---  coobox=12738 
// Object types: Double or Multiple Star,Spectroscopic Binary,High Proper Motion Star,Star 
Barycenter "KSI UMa B/GJ 423 D/GJ 423 B/Gaia DR3 756853643637996160/CABS 92/53 UMa B/ADS 8119 B/BD+32 2132B/CCABS 76/CCDM J11182+3132B/CSI+32 2132 2/GCRV 6921/HD 98230/HR 4374/IDS 11128+3206 B/LFT 791/LHS 2391/LTT 13046/NLTT 26921/ROT 1679/SBC7 427/TYC 2520-2634-2/UBV M 16961/Zkh 154/WDS J11182+3132B/WDS J11182+3132Ba,Bb/SBC9 667/** CHR 178/** STF 1523B/PMSC 11128+3205B/PMSC 11128+3205Bab/Gaia DR2 756853643637996160/WEB 9945/WEB 9946/LSPM J1118+3131B"
{
	ParentBody      "** WTE 1 AB"
}

Star "KSI UMa Ba"
{
	DateUpdated     "2024-05-07"
	ParentBody      "KSI UMa B"
	Parallax        114.4867
	AppMagn         4.77
	Class           "G2V"
	AbsMagn         5.06 // 计算的值
	MassSol         0.86
	RadSol          0.92
	LumBol          0.79
	Teff            5692
	FeH             -0.35

	BinaryOrbit // SB 667
	{
		PeriodDays      3.9805
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2425000.000
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

// Object * ksi UMa Bb  ---  Brown Dwarf Candidate  ---  OID=@1801453   (@@115218,21)  ---  coobox=12738 
// Object types: Double or Multiple Star,Star,Brown Dwarf Candidate,Extra-solar Planet Candidate 
Star "KSI UMa Bb/HD 98230b/WDS J11182+3132Bb"
{
	DateUpdated     "2024-05-07"
	ParentBody      "KSI UMa B"
	Class           "WD?" // BD?
	MassSol         0.14
}

// Object WISE J111838.70+312537.9  ---  Brown Dwarf  ---  OID=@8011436   (@@-1,255)  ---  coobox=12738 
// Object types: Brown Dwarf,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star 
Star "WISE J111838.70+312537.9/** WTE 1D/WDS J11182+3132D/WISEA J111838.69+312537.7"
{
	DateUpdated     "2024-05-07"
	ParentBody      "KSI UMa"
	Class           "T8.5"

	Orbit     
	{
		SemiMajorAxis   4000
	}
}