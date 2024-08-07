// Object * alf Tuc  ---  Spectroscopic Binary  ---  OID=@3351707   (@@73673,0)  ---  coobox=24139 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "ALF Tuc A" {ParentBody "ALF Tuc"}
Remove "ALF Tuc B" {ParentBody "ALF Tuc"}
Star "ALF Tuc A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "Gaia DR3 6407842789021567872"
	Class           "K3III"
	AbsMagn         -1.05
	AbsMagnBol      -1.97
	MassSol         2.5 // 3
	RadSol          37
	LumBol          424
	Teff            4300

	BinaryOrbit     
	{
		PeriodDays      4197.7
		Eccentricity    0.39
		Epoch           2418666.4
		ArgOfPericenter 228.5
		MeanAnomaly     0
	}
}

Star "ALF Tuc B"
{
	ParentBody      "Gaia DR3 6407842789021567872"
	Class           "A5.1?"
}

// Object * del Tuc  ---  Double or Multiple Star  ---  OID=@8447608   (@@-1,255)  ---  coobox=24085 
// Object types: High Proper Motion Star,Pulsating Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=110838
Remove "DEL Tuc A" {ParentBody "DEL Tuc"} // A本身为双星
Remove "DEL Tuc B" {ParentBody "DEL Tuc"}
Barycenter "DEL Tuc A"
{
	ParentBody      "Gaia DR3 6404338508024243200"
	BinaryOrbit     
	{
		Epoch           2456293
		Separation      603.567994655556 // 7 asec
		PositionAngle   282
	}
}

Star "DEL Tuc Aa"
{
	DateUpdated     "2024-08-05"
	ParentBody      "DEL Tuc A"
	Class           "B9Vn"
	AbsMagn         0.20
	MassSol         2.99
	RadSol          2.7
	LumBol          105.99149203252168 // 计算的值
	Teff            11271
	RotationPeriod  68.484
	Age             0.232
	Oblateness      0.10714285714285714285714285714286 // Vsini = 224 Km/s

	BinaryOrbit // VB6_Tok2018e CHR_188Aa, Gr.2
	{
		Period          3.9750
		Separation      4.5711144991133
		Eccentricity    0.594
		Inclination     43.5
		AscendingNode   274.9
		Epoch           2457286.506005136296153
		ArgOfPericenter 205.7
		MeanAnomaly     0
	}
}

Star "DEL Tuc Ab"
{
	DateUpdated     "2024-08-05"
	ParentBody      "DEL Tuc A"
	Class           ""
	MassSol         2.74
}

// Object * del Tuc C  ---  High Proper Motion Star  ---  OID=@3336911   (@@73407,7)  ---  coobox=24085 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 

Star "DEL Tuc C/Gaia DR3 6404338508023618304/TIC 469906368/CCDM J22273-6458B/CSI-65 4044 41/GC 31345/IDS 22202-6529 B/SAO 255221/WDS J22273-6458B/** HJ 5334B/TYC 9120-1919-1/UCAC4 126-185073/2MASS J22271891-6457576/Gaia DR2 6404338508023618304"
{
	DateUpdated     "2024-08-05"
	ParentBody      "Gaia DR3 6404338508024243200"
	Class           "G0V_Fe-2"
	AbsMagn         4.50
	MassSol         1.17
	RadSol          1.15275 // Gaia DR3
	LumBol          1.67616922282792 // 计算的值
	Teff            6117
	FeH             -0.247
}

// Object HD 224361  ---  Double or Multiple Star  ---  OID=@11588902   (@@-1,255)  ---  coobox=24074 
// Object types: High Proper Motion Star,Eruptive Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source,X-ray Source 
Star "HD 224361 A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "HD 224361"
	Class           "A1IV"
	AbsMagn         1.92

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.11707462
		Eccentricity    0.210271006
		Inclination     1.19249082
		AscendingNode   0
		ArgOfPericenter 3.59450801
		MeanAnomaly     111.389999
	}
}

Star "HD 224361 B"
{
	ParentBody      "HD 224361"
	Class           "F4.6?"
}

// Object * bet01 Tuc  ---  Double or Multiple Star  ---  OID=@3261639   (@@73717,0)  ---  coobox=23387 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
// NoidLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HR&number=126
Remove "BET1 Tuc" {ParentBody "BET Tuc"}
Remove "BET2 Tuc" {ParentBody "BET Tuc"}
Remove "BET Tuc A" {ParentBody "BET Tuc (AB)"}
Remove "BET Tuc B" {ParentBody "BET Tuc (AB)"}
Remove "BET Tuc C" {ParentBody "BET Tuc (CD)"}
Remove "BET Tuc D" {ParentBody "BET Tuc (CD)"}
Remove "BET3 Tuc A" {ParentBody "BET3 Tuc"}
Remove "BET3 Tuc B" {ParentBody "BET3 Tuc"}
Barycenter "PMSC 00270-6331 ABCD"
{
	ParentBody      "PMSC 00270-6331"
	BinaryOrbit     
	{
		Period          1.266E6
		Separation      23000
	}
}

// Object * bet03 Tuc  ---  Double or Multiple Star  ---  OID=@3261644   (@@73717,5)  ---  coobox=23387 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Barycenter "BET3 Tuc/GJ 9015/HIP 2578/Gaia DR3 4900916679578514048/WISEA J003244.03-630153.8/TIC 469974193/2MASS J00324391-6301533/PLX 93/CCDM J00327-6302AB/CPC 20.1 111/CPD-63 52/GC 651/GCRV 306/GSC 08844-01521/HD 3003/HIC 2578/HR 136/IDS 00282-6335 AB/IRAS 00304-6318/N30 102/PPM 351888/ROT 105/SAO 248208/SKY# 879/TD1 292/TYC 8844-1521-1/UBV 418/** B 8/WISE J003244.02-630154.0/AKARI-IRC-V1 J0032440-630153/PMSC 00270-6331PQ/WDS J00315-6257E/WDS J00315-6257Ea,Eb/** SHY 116E/uvby98 100003003/WEB 473/GEN# +1.00003003/Gaia DR2 4900916679578514048"
{
	ParentBody      "PMSC 00270-6331"
}

// ----------------------------------------------------------------------------------------------------

// Object * bet01 Tuc  ---  Double or Multiple Star  ---  OID=@3261639   (@@73717,0)  ---  coobox=23387 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "BET1 Tuc/HIP 2484/Gaia DR3 4900927434176620160/TIC 271503441/PLX 90/CPC 20.1 104/CPD-63 50/CSI-63 50 41/GC 625/GCRV 287/GEN# +1.00002884/GSC 08844-01519/HD 2884/HR 126/JP11 391/N30 97/PPM 351869/ROT 100/SAO 248201/SKY# 850/TYC 8844-1519-1/UBV 398/UBV M 7448/2MASS J00313267-6257297/CCDM J00316-6258AB/CSI-63 50 43/PMSC 00270-6331AB/WDS J00315-6257AB/** B 7/HIC 2484/** LCL 119AB/** SHY 114AB/uvby98 100002884/WEB 454/Gaia DR2 4900927434176620160"
{
	ParentBody      "PMSC 00270-6331 ABCD"
	BinaryOrbit     
	{
		Period          15930
		Separation      1100
	}
}

// Object * bet02 Tuc  ---  Double or Multiple Star  ---  OID=@3261640   (@@73717,1)  ---  coobox=23387 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Barycenter "BET2 Tuc/HIP 2487/Gaia DR3 4900926678262376704/TIC 271503437/CPC 20.1 105/CSI-63 50 42/GC 626/GCRV 288/GSC 08844-01520/HD 2885/HR 127/JP11 392/PPM 351870/ROT 101/SAO 248202/SKY# 851/UBV 399/2MASS J00313347-6257560/** LCL 119CD/** I 260/WDS J00315-6257CD/CCDM J00316-6258CD/HIC 2487/IRAS 00292-6314/WEB 455/Gaia DR2 4900926678262376704/GEN# +1.00002885"
{
	ParentBody      "PMSC 00270-6331 ABCD"
}

// ----------------------------------------------------------------------------------------------------

Star "BET3 Tuc P"
{
	DateUpdated     "2024-08-05"
	ParentBody      "BET3 Tuc"
	Parallax        21.6794
	AppMagn         5.09
	Class           "A0V"
	AbsMagn         1.77 // 计算的值
	MassSol         1.82
	RadSol          1.685 // Gaia DR3
	LumBol          18.9299367047678 // 计算的值
	Teff            9275
	FeH             -1.476

	BinaryOrbit     
	{
		Period          5.057
		Separation      4
	}
}

Star "BET3 Tuc Q"
{
	DateUpdated     "2024-08-05"
	ParentBody      "BET3 Tuc"
	Class           "A2V"
	MassSol         1.55
}

// ----------------------------------------------------------------------------------------------------

Star "BET1 Tuc A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "BET1 Tuc"
	Parallax        22.8384
	AppMagn         4.289
	Class           "B9.5Va"
	AbsMagn         1.08 // 计算的值
	MassSol         3.84
	RadSol          1.9025 // Gaia DR3
	LumBol          40.6583583095712 // 计算的值
	Teff            10567
	FeH             -0.154

	BinaryOrbit     
	{
		Period          635.973
		Separation      100
	}
}

Star "BET1 Tuc B"
{
	DateUpdated     "2024-08-05"
	ParentBody      "BET1 Tuc"
	Class           "M3"
	MassSol         0.40
}

// ----------------------------------------------------------------------------------------------------

Star "BET2 Tuc C/CCDM J00316-6258C/** I 260C/WDS J00315-6257C/TYC 8844-1520-1"
{
	DateUpdated     "2024-08-05"
	ParentBody      "BET2 Tuc"
	Parallax        19.5923
	AppMagn         4.514
	Class           "A2V"
	AbsMagn         0.974 // 计算的值
	MassSol         2.76

	BinaryOrbit // VB6_Tok2015c I_260CD Gr.2
	{
		Period          44.73
		Separation      16
		Eccentricity    0.81
		Inclination     124.7
		AscendingNode   241.6
		Epoch           2455788.647747935261577
		ArgOfPericenter 112.2
		MeanAnomaly     0
	}
}

Star "BET2 Tuc D/CCDM J00316-6258D/CSI-63 50 44/WDS J00315-6257D/TYC 8844-1520-2/** I 260D/PMSC 00270-6331D"
{
	DateUpdated     "2024-08-05"
	ParentBody      "BET2 Tuc"
	Class           "A7V"
	MassSol         1.94
}

// ----------------------------------------------------------------------------------------------------

// Object * rho Tuc  ---  Spectroscopic Binary  ---  OID=@3261594   (@@101077,18)  ---  coobox=23378 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source 
Remove "RHO Tuc A" {ParentBody "RHO Tuc"}
Remove "RHO Tuc B" {ParentBody "RHO Tuc"}
Star "RHO Tuc A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "HIP 3330"
	Class           "F6V"
	AbsMagn         2.75
	MassSol         1.66
	Radius          1982669.92876162 // 计算的值
	LumBol          9.7
	Teff            6034
	FeH             -0.26
	Age             2.64

	BinaryOrbit     
	{
		PeriodDays      4.8202
		Eccentricity    0.02
		Epoch           2419299.11
	}
}

Star "RHO Tuc A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "HIP 3330"
	Class           ""
	MassSol         0.33
}

// Object * eps Tuc  ---  Be Star  ---  OID=@3292977   (@@73432,11)  ---  coobox=24066 
// Object types: Be Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "EPS Tuc A"
{
	DateUpdated     "2024-08-05"
	ParentBody      "EPS Tuc"
	Class           "B8V"
	AbsMagn         -0.80
	MassSol         4.00
	Radius          2704975.02902143 // 计算的值
	LumBol          389
	Teff            13000
	RotationPeriod  19.03632
	Age             0.123
	Oblateness      0.26470588235294117647058823529412 // Vsini = 300 Km/s
}
