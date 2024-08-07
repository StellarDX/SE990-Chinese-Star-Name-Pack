// Object * pi.02 Cyg  ---  Spectroscopic Binary  ---  OID=@73399   (@@9003,0)  ---  coobox=188 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=107533
Barycenter "PI2 Cyg A"
{
	ParentBody      "PI2 Cyg"
	BinaryOrbit     
	{
		Period          46.576
		Separation      46.0417782917336 // 0.105 asec
	}
}

Star "PI2 Cyg Aa"
{
	DateUpdated     "2024-06-17"
	ParentBody      "PI2 Cyg A"
	Class           "B3III"
	AbsMagn         -3.39
	MassSol         8.4
	RadSol          7.1
	LumBol          8442
	Teff            20815
	FeH             0.04
	Age             0.0332

	BinaryOrbit // SB9_1332 1939MmSAI..12..279T
	{
		PeriodDays      72.0162
		Eccentricity    0.340
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2428410.6
		ArgOfPericenter 58.1
		MeanAnomaly     0
	}
}

Star "PI2 Cyg Ab"
{
	DateUpdated     "2024-06-17"
	ParentBody      "PI2 Cyg A"
	Class           ""
	MassSol         0.77
}

Star "PI2 Cyg B"
{
	DateUpdated     "2024-06-17"
	ParentBody      "PI2 Cyg"
	Class           ""
	MassSol         6.74
}

// Object * pi.01 Cyg  ---  Spectroscopic Binary  ---  OID=@96680   (@@8598,8)  ---  coobox=232 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "PI1 Cyg A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "PI1 Cyg"
	Class           "B3III"
	AbsMagn         -3.91
	MassSol         3.91
	RadSol          5.6
	LumBol          16538
	Teff            18360
	Age             0.0251

	BinaryOrbit     
	{
		PeriodDays      26.33
		Eccentricity    0.00
		Epoch           2431306.5
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "PI1 Cyg B"
{
	ParentBody      "PI1 Cyg"
	Class           "O8.7?"
}

// Object HD 206267  ---  Spectroscopic Binary  ---  OID=@156708   (@@8174,0)  ---  coobox=594 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Variable Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Emission-line Star,Double or Multiple Star,Star,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=106886
// HD 206267本体为三星系统，NoirLab还列出旁边绕着的3颗小星B,C和D，可能只是星团成员恒星，D可能还有一颗伴星Db
Barycenter "HD 206267/Gaia DR3 2178396937123250432/GEN# +4.35370466/IDS 21358+5702 A/CCDM J21390+5729A/** MIU 2/GOS G099.29+03.74 01/WDS J21390+5729A/** STF 2816A/** BU 1143A/PMSC 21359+5702AP/WDS J21390+5729Aa,Ab/HD 206267A/[S78b] 363A/ADS 15184 A/TIC 421632273/Cl* Trumpler 37 MPP 5/SBC9 1321/2E 4506/AG+57 1464/ALS 11937/BD+56 2617/CEL 5359/CGO 622/CSI+56 2617 1/Cl* IC 1396 SBZ 1-10/Cl* IC 1396 SBZ 2-69/FK5 813/GC 30322/GCRV 13605/GSC 03975-01822/HGAM 1020/HIC 106886/HIP 106886/HR 8281/LS III +57 13/MCW 997/N30 4778/PMC 90-93 570/PPM 39704/ROT 3151/SAO 33626/SBC7 867/SKY# 41271/TYC 3975-1822-1/UBV 18613/YZ 57 12397/[HFE83] 1453/[HJ56] 230/[PGH98b] Star 23/2MASS J21385760+5729205/Cl Trumpler 37 466/EM* CDS 1264/1E 2137.4+5715/1E 2137.3+5714/1RXS J213857.9+572924/2E 2137.4+5715/[MMC2009b] 12/UBV 18616/NSV 25719/Gaia DR1 2178396932816048256/WEB 19318/Gaia DR2 2178396937123250432"
{
	ParentBody      "HD 206267 Cluster"
}

Barycenter "HD 206267 Aab"
{
	ParentBody      "HD 206267"
	BinaryOrbit     
	{
		Period          143.621
		Separation      73.5430308315579 // 0.100 asec
	}
}

Star "HD 206267 Aa"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HD 206267 Aab"
	Class           "O6.0V((f))"
	MassSol         35.40

	BinaryOrbit // 2018A&A...614A..60R
	{
		PeriodDays      3.7098
		Eccentricity    0.131
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2455494.503
		ArgOfPericenter 201.3
		MeanAnomaly     0
	}
}

Star "HD 206267 Ab"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HD 206267 Aab"
	Class           "O9:V"
	MassSol         22.20
}

Star "HD 206267 Ac"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HD 206267"
	Class           "B0V"
	MassSol         9.98
}

// Object HD 206267B  ---  Star  ---  OID=@3551956   (@@77080,1)  ---  coobox=594 
// Object types: Double or Multiple Star,Star 
Star "HD 206267B/Gaia DR3 2178396937111728768/ADS 15184 B/WDS J21390+5729B/PMSC 21359+5702B/** BU 1143B/BD+56 2617B"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HD 206267 Cluster"
	Class           ""
	MassSol         1.43

	Orbit     
	{
		Period          9962
		SemiMajorAxis   1301.09000152223 // 1.77 asec
		ArgOfPericenter 317
		MeanAnomaly     0
	}
}

// Object LS III +57 14  ---  Young Stellar Object Candidate  ---  OID=@11635099   (@@-1,255)  ---  coobox=594 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,X-ray Source,Young Stellar Object Candidate 
Star "LS III +57 14/Gaia DR3 2178396937123252736/WISE J213858.88+572914.6/UCAC4 738-077450/Gaia DR2 2178396937123252736/PMSC 21359+5702C/** STF 2816C/WDS J21390+5729C/[MMC2009b] 15/2MASS J21385888+5729146/[S78b] 363C/UBV 18614/PPM 39705/IDS 21358+5702 C/HIP 106890/HIC 106890/CSI+56 2617 3/CCDM J21390+5729C/ALS 11938/AG+57 1465/ADS 15184 C/TIC 421632281/TYC 3975-1823-1"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HD 206267 Cluster"
	Class           "B1.5V"
	MassSol         15.52

	Orbit     
	{
		Period          115696
		SemiMajorAxis   8695.97180507646 // 11.83 asec
		ArgOfPericenter 120
		MeanAnomaly     0
	}
}

// Object LS III +57 12  ---  Double or Multiple Star  ---  OID=@156350   (@@8159,7)  ---  coobox=594 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Young Stellar Object Candidate 
Barycenter "LS III +57 12/Gaia DR3 2178397693037492608/Gaia DR2 2178397693037492608/TIC 421632251/ADS 15184 D/AG+57 1463/ALS 11936/CCDM J21390+5729D/CSI+56 2617 2/GEN# +1.40206267/GSC 03975-01821/HIC 106884/HIP 106884/IDS 21358+5702 D/PPM 39703/UBV 18615/[S78b] 363D/2MASS J21385671+5729390/Cl* Trumpler 37 MVA 462/WDS J21390+5729D/** STF 2816D/PMSC 21359+5702D/UCAC4 738-077439"
{
	ParentBody      "HD 206267 Cluster"
	Orbit     
	{
		Period          254641
		SemiMajorAxis   14657.4536392495 // 19.94 asec
		ArgOfPericenter 338.7
		MeanAnomaly     0
	}
}

// Object TYC 3975-1821-1  ---  Star  ---  OID=@11665645   (@@-1,255)  ---  coobox=594 
// Object types: Star 
Star "TYC 3975-1821-1"
{
	DateUpdated     "2024-06-17"
	ParentBody      "LS III +57 12"
	Class           "B1V"
	MassSol         13.24
	
	BinaryOrbit     
	{
		Separation      832.502644578807 // 0.92 asec
	}
}

// Object TYC 3975-1821-2  ---  Star  ---  OID=@11665646   (@@-1,255)  ---  coobox=594 
// Object types: Star 
Star "TYC 3975-1821-2"
{
	ParentBody      "LS III +57 12"
	Class           "B9.6?"
}

// Object * eps Cep  ---  Spectroscopic Binary  ---  OID=@121051   (@@7274,0)  ---  coobox=612 
// Object types: delta Sct Variable,delta Sct Variable,High Proper Motion Star,Spectroscopic Binary,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,UV-emission Source 
Star "EPS Cep Aa"
{
	DateUpdated     "2024-06-17"
	ParentBody      "EPS Cep"
	Class           "F0V(Sr)"
	AbsMagn         2.13
	MassSol         1.64
	RadSol          1.86
	LumBol          11.65
	Teff            7514
	FeH             0.08
	Age             1.097

	BinaryOrbit     
	{
		Separation      8.6
		PositionAngle   90
	}
}

Star "EPS Cep Ab"
{
	DateUpdated     "2024-06-17"
	ParentBody      "EPS Cep"
	Class           "K8-M2"
	MassSol         0.57
}

// Object * bet Lac  ---  Double or Multiple Star  ---  OID=@75118   (@@7658,0)  ---  coobox=542 
// Object types: High Proper Motion Star,Red Giant Branch star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "BET Lac A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "BET Lac"
	Class           "G9IIIbCa1"
	AbsMagn         0.67
	MassSol         0.97
	RadSol          10.96
	LumBol          57.7
	Teff            4803
	FeH             -0.33
	Age             6.76

	BinaryOrbit     
	{
		Separation      10.3623131752904 // 0.2 asec
	}
}

Star "BET Lac B"
{
	ParentBody      "BET Lac"
	Class           "A9.3?"
}

// Object * sig Cas A  ---  Star  ---  OID=@5616087   (@@-1,255)  ---  coobox=703 
// Object types: Double or Multiple Star,Star 
Remove "SIG Cas A" {ParentBody "SIG Cas"}
Remove "SIG Cas B" {ParentBody "SIG Cas"}
Star "SIG Cas A/Gaia DR3 1993966437221117568/ADS 17140 A/BD+54 3082A/CCDM J23591+5546A/CSI+54 3082 1/TYC 4005-2471-1/WDS J23590+5545A/8 Cas A/** STF 3049A/UCAC4 729-105709/Gaia DR2 1993966437220412288"
{
	DateUpdated     "2024-06-17"
	ParentBody      "TIC 417031206"
	Parallax        2.7419
	AppMagn         5.01
	Class           "B2IV"
	AbsMagn         -3.90
	MassSol         12
	RadSol          11.3
	LumBol          25000
	Teff            21000
	Age             0.0158

	BinaryOrbit     
	{
		Separation      1148.8381464271 // 3.15 asec
	}
}

// Object * sig Cas B  ---  Star  ---  OID=@80184   (@@5414,8)  ---  coobox=703 
// Object types: Double or Multiple Star,Star 
Star "SIG Cas B/TIC 2044661543/Gaia DR3 1993966432915818112/ADS 17140 B/BD+54 3082B/CCDM J23591+5546B/CSI+54 3082 4/GCRV 15005/HD 224572B/IDS 23539+5512 B/WDS J23590+5545B/** STF 3049B/TYC 4005-2470-1/WEB 20783/Gaia DR2 1993966432915818112/8 Cas B/UCAC4 729-105706"
{
	DateUpdated     "2024-06-17"
	ParentBody      "TIC 417031206"
	Parallax        2.3572
	AppMagn         7.25
	Class           "B3V"
	AbsMagn         -1.7
}

// Object V* AR Cas  ---  Spectroscopic Binary  ---  OID=@103781   (@@5748,0)  ---  coobox=737 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Eclipsing Binary,Spectroscopic Binary,Variable Star,Star,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=16795
Barycenter "V* AR Cas/** STT 496A/CCDM J23300+5833A/uvby98 100221253/ADS 16795 A/WDS J23300+5833A/Gaia DR3 2011150635728091648/GEN# +1.00221253/TIC 427312571/SBC9 1445/AG+58 1562/BD+57 2748/CEL 5623/CSI+57 2748 1/GC 32683/GCRV 14737/GSC 04011-01296/HD 221253/HGAM 1141/HIC 115990/HIP 115990/HR 8926/JP11 3633/N30 5162/PMC 90-93 4688/PPM 41873/ROT 3414/SAO 35478/SBC7 959/SKY# 44482/TD1 29892/TYC 4011-1296-1/UBV 21550/UBV M 27055/2MASS J23300196+5832561/ALS 17329/WEB 20511/Gaia DR2 2011150635728091648"
{
	ParentBody      "ADS 16795"
}

Barycenter "AR Cas A"
{
	ParentBody      "V* AR Cas"
	BinaryOrbit     
	{
		Period          544.978
		Separation      163.743572408379 // 0.8 asec
	}
}

Star "AR Cas Aa"
{
	DateUpdated     "2024-06-17"
	ParentBody      "AR Cas A"
	Class           "B3V"
	AbsMagn         -1.87
	AbsMagnBol      -3.56
	MassSol         5.90
	RadSol          5.05
	LumBol          2089.288306457656 // 计算的值
	Teff            17200

	BinaryOrbit     
	{
		PeriodDays      6.0663
		Eccentricity    0.250
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2440087.191
		ArgOfPericenter 211.4
		MeanAnomaly     0
	}
}

Star "AR Cas Ab"
{
	DateUpdated     "2024-06-17"
	ParentBody      "AR Cas A"
	Class           "A6"
	AbsMagn         2.20
	AbsMagnBol      2.18
	MassSol         1.86
	RadSol          1.60
	LumBol          10.568135514410017 // 计算的值
	Teff            8150
}

Star "AR Cas B"
{
	DateUpdated     "2024-06-17"
	ParentBody      "V* AR Cas"
	Class           ""
	MassSol         1.43
}

// Object HD 221237  ---  Double or Multiple Star  ---  OID=@103766   (@@5736,19)  ---  coobox=737 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Barycenter "HD 221237/WISE J232952.28+583254.3/GEN# +1.00221237/TIC 427312569/ADS 16795 CD/AG+58 1561/BD+57 2747/CCDM J23300+5833CD/CSI+57 2747 1/GC 32679/GCRV 14735/GSC 04011-01297/PPM 41870/SAO 35476/SKY# 44478/UBV 20193/UBV 20197/UBV M 27054/YZ 58 14102/2MASS J23295227+5832542/WDS J23300+5833CD/** DA 2CD/uvby98 100221237/Gaia DR1 2011151352982939264/WEB 20510/UCAC4 743-089678/IDS 23254+5800 CD"
{
	ParentBody      "ADS 16795"
	Orbit     
	{
		Period          438329
		SemiMajorAxis   15475.7761561051 // 75.61 asec
		ArgOfPericenter 268.41
		MeanAnomaly     0
	}
}

// Object HD 221237A  ---  Star  ---  OID=@13686784   (@@-1,255)  ---  coobox=737 
// Object types: Double or Multiple Star,Star 
Star "HD 221237A/Gaia DR3 2011151357277942400/TYC 4011-1297-1/** DA 2C/CCDM J23300+5833C/WDS J23300+5833C/Gaia DR2 2011151357277942400"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HD 221237"
	Parallax        4.7329
	AppMagn         7.23
	Class           "A1V"
	AbsMagn         0.606 // 计算的值
	MassKg          4.42697865334599e+30 // log(g) = 4.01 cm/s^2
	RadSol          2.4425 // Gaia DR3
	LumBol          114.605560489415 // 计算的值
	Teff            12084
	FeH             -1.491

	BinaryOrbit     
	{
		Separation      285.237110640398 // 1.35 asec
		ArgOfPericenter 32
		MeanAnomaly     0
	}
}

// Object HD 221237B  ---  Star  ---  OID=@11630798   (@@-1,255)  ---  coobox=737 
// Object types: Double or Multiple Star,Star 
Star "HD 221237B/Gaia DR3 2011151357284012416/TYC 4011-1297-2/CCDM J23300+5833D/Gaia DR2 2011151357282592256/GEN# +1.00221237D/ADS 16795 D/WDS J23300+5833D/** DA 2D/PMSC 23254+5800D"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HD 221237"
	Parallax        4.6458
	AppMagn         9.02
	Class           ""
	AbsMagn         2.35 // 计算的值
	MassSol         1.28
}

Barycenter "CCDM J23300+5833FG"
{
	ParentBody      "ADS 16795"
	Orbit     
	{
		Period          380636
		SemiMajorAxis   14151.9206047057 // 66.94 asec
		ArgOfPericenter 342.75
		MeanAnomaly     0
	}
}

// Object TYC 4011-779-1  ---  Star  ---  OID=@11606894   (@@-1,255)  ---  coobox=737 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "TYC 4011-779-1/Gaia DR3 2011151391642324608/TIC 427312626/ADS 16795 F/CCDM J23300+5833F/CSI+57 2747 2/GEN# +1.00221253F/UBV 20195/WDS J23300+5833F/** HJ 1888F/PMSC 23254+5800F/Gaia DR2 2011151391642324608/UCAC4 743-089692/2MASS J23295879+5833583"
{
	DateUpdated     "2024-06-17"
	ParentBody      "CCDM J23300+5833FG"
	Parallax        4.7301
	Class           "F7IV"
	MassKg          1.87043952634517e+30 // log(g) = 4.292 cm/s^2
	RadSol          1.1475 // Gaia DR3
	LumBol          1.68935580301451 // 计算的值
	Teff            6143
	FeH             -0.349

	BinaryOrbit     
	{
		Separation      2276.9075026639 // 10.77 asec
		ArgOfPericenter 73
		MeanAnomaly     0
	}
}

// Object UCAC4 743-089698  ---  Star  ---  OID=@103770   (@@5736,23)  ---  coobox=737 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC4 743-089698/Gaia DR3 2011151391642325120/TIC 427312627/ADS 16795 G/CCDM J23300+5833G/CSI+57 2748 3/GEN# +1.00221253G/UBV 20196/2MASS J23300011+5834015/WDS J23300+5833G/** HJ 1888G/PMSC 23254+5800G/Gaia DR2 2011151391642325120"
{
	DateUpdated     "2024-06-17"
	ParentBody      "CCDM J23300+5833FG"
	Parallax        4.7539
	Class           "F9V"
	MassKg          2.04042272210742e+30 // log(g) = 4.326 cm/s^2
	RadSol          1.1525 // Gaia DR3
	LumBol          1.48276709492042 // 计算的值
	Teff            5933
	FeH             -0.318
}

// Object * 8 And  ---  Variable Star  ---  OID=@19882   (@@6491,0)  ---  coobox=647 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source 
Barycenter "8 And A"
{
	ParentBody      "8 And"
	BinaryOrbit     
	{
		Epoch           2457024
		Separation      1369.30982676589 // 7.8 asec
		PositionAngle   164
	}
}

Star "8 And Aa"
{
	DateUpdated     "2024-06-17"
	ParentBody      "8 And A"
	Class           "M2.5IIIBa0.5"
	AbsMagn         -1.727
	//MassKg          // log(g) = 1.00 asec
	RadSol          30
	LumBol          138.62765438361276 // 计算的值
	Teff            3616
	FeH             0.04

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.251745846
		Eccentricity    0
		Inclination     0.147591114
		AscendingNode   0
		ArgOfPericenter -141.179658
		MeanAnomaly     93.0666309
	}
}

Star "8 And Ab"
{
	ParentBody      "8 And A"
	Class           "WD"
}

Star "8 And B"
{
	ParentBody      "8 And"
	Class           "A3.1?"
}

// Object * lam And  ---  RS CVn Variable  ---  OID=@6222   (@@6156,0)  ---  coobox=673 
// Object types: High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,High Proper Motion Star,RS CVn Variable,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source,X-ray Source 
Star "LAM And A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "LAM And"
	Class           "G8IVk"
	AbsMagn         1.91
	MassSol         1.24
	RadSol          7.787
	LumBol          28.8
	Teff            4800
	FeH             -0.56
	RotationPeriod  1296

	BinaryOrbit     
	{
		PeriodDays      20.5212
	}
}

Star "LAM And B"
{
	DateUpdated     "2024-06-17"
	ParentBody      "LAM And"
	Class           ""
	MassSol         0.15
}

// Object * psi And  ---  Double or Multiple Star  ---  OID=@6118   (@@5713,5)  ---  coobox=675 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// 系统结构未知
Remove "PSI And A" {ParentBody "PSI And"}
Remove "PSI And B" {ParentBody "PSI And"}
Star "PSI And A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "Gaia DR3 1938979585834537728"
	Class           "G3Ib-II"
	AbsMagn         -3.039
	MassSol         5.4
	RadSol          47.58
	LumBol          1049
	Teff            4990
	FeH             0.10
	Age             0.079
}

Star "PSI And B"
{
	DateUpdated     "2024-06-17"
	ParentBody      "PSI And A"
	Class           "B9"

	Orbit     
	{
		SemiMajorAxis   171.234416452631 // 0.28 asec
	}
}

Star "PSI And C"
{
	ParentBody      "PSI And A"
	Class           "B3.4?"

	Orbit     
	{
		SemiMajorAxis   85.6172082263157 // 0.28 asec
	}
}

// Object * kap And B  ---  Brown Dwarf  ---  OID=@7893579   (@@-1,255)  ---  coobox=10229
// Object types: Brown Dwarf,Double or Multiple Star,Star
Remove "KAP And b" {ParentBody "KAP And"}
Planet "KAP And b/** CSN 1Ab/WDS J23404+4420Ab"
{
	ParentBody     "TIC 176945734"
	DiscMethod     "Imaging"
	DiscDate       "2013"
	DateUpdated    "2024-06-17"
	Class          "GasGiant" // L1P
	MassJup        13
	Radius         112242.44
	EndogenousHeating 2000 // 1700 - 2000
	CtoO           0.70

	Orbit
	{
		Epoch           2465569.833831290248781 // 2038.4 - 2047.9
		SemiMajorAxis   57 // 133
		Eccentricity    0.69 // 0.85
		Period          242 // 900
		Inclination     114.9 // 140
		AscendingNode   60.3 // 90.5
		LongOfPericen   156.9 // 245.9
		MeanLongitude   156.9
	}
}
