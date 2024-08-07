// Object * ksi Sco  ---  Spectroscopic Binary  ---  OID=@8535037   (@@-1,255)  ---  coobox=16798 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=78738
Remove "KSI Sco (ABC)"{ParentBody "KSI Sco"}
Remove "KSI Sco (DE)"{ParentBody "KSI Sco"}
Remove "KSI Sco (AB)"{ParentBody "KSI Sco (ABC)"}
Remove "KSI Sco A"{ParentBody "KSI Sco (AB)"}
Remove "KSI Sco B"{ParentBody "KSI Sco (AB)"}
Remove "KSI Sco C"{ParentBody "KSI Sco (ABC)"}
Remove "KSI Sco D"{ParentBody "KSI Sco (DE)"}
Remove "KSI Sco E"{ParentBody "KSI Sco (DE)"}
Barycenter "KSI Sco ABC"
{
	ParentBody      "KSI Sco"
	BinaryOrbit     
	{
		Period          287032
		Separation      7880.50733296368 // 281.000 asec
	}
}

Barycenter "KSI Sco AB"
{
	ParentBody      "KSI Sco ABC"
	BinaryOrbit // VB6_Zir2008 STF1998AC Gr.5
	{
		Period          1514.4301
		Separation      217.485203063689 // 7.755 asec
		Eccentricity    0.041
		Inclination     131.5
		AscendingNode   47.4
		Epoch           2534125.794542483985424
		ArgOfPericenter 59.3
		MeanAnomaly     0
	}
}

// Object * ksi Sco A  ---  High Proper Motion Star  ---  OID=@2579130   (@@50315,0)  ---  coobox=16798 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "KSI Sco A/GJ 9540 A/Gaia DR3 4343066192373820800/ADS 9909 A/BD-10 4237A/CCDM J16044-1123A/CSI-10 4237 2/HD 144070/HR 5978/IDS 15589-1106 A/JP11 2701/ROT 2271/WDS J16044-1122A/** STF 1998A/PMSC 15589-1105B/UCAC4 394-061369/TYC 5619-1257-1/Gaia DR2 4343066192367555200"
{
	DateUpdated     "2024-05-28"
	ParentBody      "KSI Sco AB"
	Parallax        35.6576
	AppMagn         5.16
	Class           "F4(V)"
	AbsMagn         2.92 // 计算的值
	MassSol         1.53

	BinaryOrbit // Tok 2020
	{
		Period          45.8640
		Separation      18.7057653460472 // 0.667 asec
		Eccentricity    0.737
		Inclination     34.4
		AscendingNode   23.9
		Epoch           2450527.333874494768679
		ArgOfPericenter 165.6
		MeanAnomaly     0
	}
}

// Object * ksi Sco B  ---  High Proper Motion Star  ---  OID=@2579131   (@@50315,1)  ---  coobox=16798 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "KSI Sco B/GJ 9540 B/Gaia DR3 4343066192373234048/ADS 9909 B/BD-10 4237B/CCDM J16044-1123B/CSI-10 4237 3/GCRV 9238/HD 144069/HR 5977/IDS 15589-1106 B/SKY# 29017/WDS J16044-1122B/** STF 1998B/PMSC 15589-1105A/TYC 5619-1257-2/WEB 13311/Gaia DR2 4343066192373234048/51 Lib"
{
	DateUpdated     "2024-05-28"
	ParentBody      "KSI Sco AB"
	Parallax        36.117
	AppMagn         4.87
	Class           "F5V"
	AbsMagn         2.66 // 计算的值
	MassSol         1.53
}

// Object * ksi Sco C  ---  High Proper Motion Star  ---  OID=@2579129   (@@49958,19)  ---  coobox=16798 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "KSI Sco C/GJ 9540 C/Gaia DR3 4343066192373826176/ADS 9909 C/BD-10 4237C/CCDM J16044-1123C/CSI-10 4237 1/GC 21594/GCRV 9239/GEN# +1.00144070C/SAO 159666/UBV 13607/WDS J16044-1122C/PMSC 15589-1105C/** STF 1998C/UCAC4 394-061370/WISE J160422.40-112219.4/WEB 13313/Gaia DR2 4343066192373234688/DENIS J160422.6-112217"
{
	DateUpdated     "2024-05-28"
	ParentBody      "KSI Sco ABC"
	Parallax        35.8528
	AppMagn         7.30
	Class           "G1V"
	AbsMagn         5.07 // 计算的值
	MassKg          1.76307969290497e+30 // log(g) = 4.399 cm/s^2
	RadSol          0.984956 // Gaia DR3
	LumBol          0.816796180508421 // 计算的值
	Teff            5529
	FeH             0.063
}

Barycenter "** STF 1999/ADS 9910/CCDM J16044-1123DE/PMSC 15589-1105DE/WDS J16044-1127"
{
	ParentBody      "KSI Sco"
}

// Object HD 144087  ---  High Proper Motion Star  ---  OID=@2579142   (@@50316,1)  ---  coobox=16798 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 144087/GJ 9541 A/HIP 78738/Gaia DR3 4343064577465522816/TIC 49777149/PLX 3637/ADS 9910 A/BD-11 4057/CCDM J16044-1123D/CSI-11 4057 1/GC 21595/GCRV 9240/GEN# +1.00144087A/GSC 05619-01260/HIC 78738/PPM 231153/SAO 159668/SKY# 29019/TYC 5619-1260-1/UBV 13608/UGP 391/YZC 11 5564/uvby98 100144087 A/WDS J16044-1127A/PMSC 15589-1105D/** STF 1999A/2MASS J16042591-1126577/Gaia DR1 4343064573164480256/WEB 13312/Gaia DR2 4343064577465522816"
{
	DateUpdated     "2024-05-28"
	ParentBody      "ADS 9910"
	Parallax        35.8898
	AppMagn         7.43
	Class           "K1(V)"
	AbsMagn         4.47
	MassSol         0.89
	RadSol          0.94
	LumBol          0.71
	Teff            5529
	Age             2.3

	BinaryOrbit     
	{
		Period          4426
		Separation      330.539587190107 // 11.863 asec
	}
}

// Object HD 144088  ---  High Proper Motion Star  ---  OID=@2579145   (@@50316,4)  ---  coobox=16798 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 144088/GJ 9541 B/HIP 78739/Gaia DR3 4343064508746082304/TIC 49777150/ADS 9910 B/BD-11 4058/CCDM J16044-1123E/GC 21596/GEN# +1.00144088/GSC 05619-01261/HIC 78739/PPM 231154/SAO 159670/SKY# 29020/TYC 5619-1261-1/UBV 13609/UBV M 21126/UGP 392/YZC 11 5565/uvby98 100144088/2MASS J16042671-1126595/WDS J16044-1127B/ADS 9910 P/CSI-11 4057 3/PMSC 15589-1105E/** STF 1999B/Gaia DR1 4343064504445003648/Gaia DR2 4343064508746082304"
{
	DateUpdated     "2024-05-28"
	ParentBody      "ADS 9910"
	Parallax        35.8718
	AppMagn         7.97
	Class           "K1(V)"
	AbsMagn         5.18
	MassSol         0.88
	RadSol          0.77
	LumBol          0.44
	Teff            5217
	Age             2.3
}

// Object * 48 Lib  ---  Be Star  ---  OID=@2559645   (@@49965,0)  ---  coobox=16792 
// Object types: Be Star,Mid-IR Source (3 to 30 µm),Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "48 Lib A"
{
	DateUpdated     "2024-05-28"
	ParentBody      "48 Lib"
	Class           "B5IIIp_sh"
	AbsMagn         -0.83
	MassSol         6.07
	RadSol          4.12
	LumBol          1100
	Teff            7612
	RotationPeriod  10 // Vsini = 400 Km/s
	Oblateness      0.3
}