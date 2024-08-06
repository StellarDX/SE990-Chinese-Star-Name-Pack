// Object * alf Vol  ---  Double or Multiple Star  ---  OID=@3147905   (@@67646,4)  ---  coobox=21263 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "ALF Vol A" {ParentBody "ALF Vol"}
Remove "ALF Vol B" {ParentBody "ALF Vol"}
Star "ALF Vol A"
{
	DateUpdated     "2024-08-06"
	ParentBody      "GJ 9284"
	Class           "kA3hA5mA5V"
	AbsMagn         1.60
	MassSol         1.87
	RadSol          1.9
	LumBol          14.690363295153379 // 计算的值
	Teff            8198
	FeH             0.19
	Age             0.427

	BinaryOrbit     
	{
		Period          0.652
		Separation      1.2362997109641 // 0.0321 asec
		Eccentricity    0.041
		Inclination     101.9
		AscendingNode   105.3
		Epoch           2457239.755003692116588
		ArgOfPericenter 68.5
		MeanAnomaly     0
	}
}

Star "ALF Vol B"
{
	ParentBody      "GJ 9284"
	Class           "G9.2?"
}

// Object * gam01 Vol  ---  High Proper Motion Star  ---  OID=@3149933   (@@69014,1)  ---  coobox=21390 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Remove "GAM1 Vol" {ParentBody "GAM Vol"}
Remove "GAM2 Vol" {ParentBody "GAM Vol"}
Star "GAM1 Vol/HIP 34473/Gaia DR3 5267405964069463680/TIC 300015238/2MASS J07084235-7029495/CCDM J07087-7030B/CPC 21.1 1094/CPD-70 600B/CSI-70 600 42/GC 9513/GCRV 4737/GSC 09182-01410/HD 55864/HIC 34473/HR 2735/IDS 07096-7020 B/PPM 369421/SAO 256373/SKY# 12843/TYC 9182-1410-1/UBV M 13050/uvby98 100055864/WDS J07087-7030B/** DUN 42B/GEN# +1.00055864/WEB 6905/Gaia DR2 5267405964069463680"
{
	DateUpdated     "2024-08-06"
	ParentBody      "CCDM J07087-7030"
	Parallax        22.7501
	AppMagn         5.623
	Class           "F2V"
	AbsMagn         2.51
	MassSol         1.69
	Radius          6613109.83356579 // log(g) = 2.71 cm/s^2
	LumBol          149.01766002610924 // 计算的值
	Teff            6541
	FeH             0.12
	Age             1.4
	Oblateness      0

	BinaryOrbit     
	{
		Epoch           2452276
		Separation      619.777499919639 // 14.1 asec
		PositionAngle   296
	}
}

// Object * gam02 Vol  ---  High Proper Motion Star  ---  OID=@3149932   (@@69014,0)  ---  coobox=21390 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source 
Star "GAM2 Vol/HIP 34481/Gaia DR3 5267405895350690304/TIC 300015239/2MASS J07084477-7029560/PLX 1692/CCDM J07087-7030A/CPC 21.1 1095/CPD-70 600/CSI-70 600 43/CSI-70 600 41/FK5 1189/GC 9514/GCRV 4738/GSC 09182-01411/HD 55865/HIC 34481/HR 2736/IDS 07096-7020 A/IRAS 07091-7025/JP11 1505/N30 1578/NSV 3448/PPM 369422/SAO 256374/SKY# 12846/TYC 9182-1411-1/UBV 7045/uvby98 100055865 A/WDS J07087-7030A/WEB 6906/Gaia DR2 5267405895348357120/** DUN 42A/GEN# +1.00055865"
{
	DateUpdated     "2024-08-06"
	ParentBody      "CCDM J07087-7030"
	Parallax        24.4775
	AppMagn         3.746
	Class           "K0III"
	AbsMagn         0.69 // 计算的值
	MassKg          4.31725237203262e+30 // log(g) = 2.7 cm/s^2
	Radius          7582398.05975142 // 计算的值
	LumBol          60
	Teff            4866
	FeH             -0.01
}

// Object * kap01 Vol  ---  Spectroscopic Binary  ---  OID=@3176980   (@@68706,6)  ---  coobox=21393 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=71046
Remove "KAP1 Vol" {ParentBody "KAP Vol"}
Remove "KAP2 Vol" {ParentBody "KAP Vol"}
Barycenter "KAP1 Vol/HIP 40817/Gaia DR3 5221286158569529344/TIC 307291318/2MASS J08194895-7130535/CCDM J08199-7130A/CPC 21.1 1311/CPD-71 677/GC 11421/GCRV 5531/GEN# +1.00071046A/GSC 09201-02149/HD 71046/HIC 40817/HR 3301/IDS 08201-7112 A/PPM 369893/ROT 1332/SAO 256497/SKY# 15788/TYC 9201-2149-1/UBV 8036/UBV M 14298/[B10] 2228/uvby98 100071046 A/WDS J08198-7131A/Renson 19636/PMSC 08201-7112A/Gaia DR1 5221286154271358080/WEB 7920/Gaia DR2 5221286158569529344"
{
	ParentBody      "CCDM J08199-7130"
}

Star "KAP1 Vol Aa"
{
	DateUpdated     "2024-08-06"
	ParentBody      "KAP1 Vol"
	Parallax        7.3981
	AppMagn         5.318
	Class           "B9III/IV"
	AbsMagn         -0.29
	MassSol         2.7
	RadSol          3.83
	LumBol          129
	Teff            9884
	FeH             -0.20

	BinaryOrbit     
	{
		Period          1090
		Separation      181.127427880541 // 1.34 asec
	}
}

Star "KAP1 Vol Ab"
{
	DateUpdated     "2024-08-06"
	ParentBody      "KAP1 Vol"
	Class           ""
	MassSol         1.12
}

// Object * kap02 Vol  ---  Star  ---  OID=@3176981   (@@68706,7)  ---  coobox=21393 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "KAP2 Vol/HIP 40834/Gaia DR3 5221286296008492416/TIC 307291308/2MASS J08200051-7130192/CCDM J08199-7130B/CPC 21.1 1313/CPD-71 678/GC 11430/GCRV 59630/GSC 09201-02148/HD 71066/HIC 40834/HR 3302/IDS 08201-7112 B/PPM 369896/SAO 256499/SKY# 15795/TYC 9201-2148-1/UBV 8037/UBV M 14300/uvby98 100071066/WDS J08198-7131B/Renson 19650/PMSC 08201-7112B/GEN# +1.00071066/Gaia DR2 5221286296008492416"
{
	DateUpdated     "2024-08-06"
	ParentBody      "CCDM J08199-7130"
	Parallax        7.9037
	AppMagn         5.608
	Class           "B9IV"
	AbsMagn         0.09
	MassSol         3.03
	RadSol          3.01
	LumBol          124
	Teff            11682
	FeH             0.69
	RotationPeriod  31.11384
	Age             0.120

	Orbit     
	{
		Period          285041
		SemiMajorAxis   8763.06074815025 // 64.83 asec
		ArgOfPericenter 58
		MeanAnomaly     0
	}
}

// Object CD-71 464  ---  Star  ---  OID=@3176982   (@@68706,8)  ---  coobox=21393 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "CD-71 464/Gaia DR3 5221286296008497664/TIC 307291298/2MASS J08200454-7129468/CCDM J08199-7130C/CPC 21.1 1315/CPD-71 679/GC 11431/GSC 09201-02147/HD 71046C/IDS 08201-7112 C/PPM 369897/SAO 256500/TYC 9201-2147-1/WDS J08198-7131C/PMSC 08201-7112C/Gaia DR1 5221286291710310144/Gaia DR2 5221286296008497664"
{
	DateUpdated     "2024-08-06"
	ParentBody      "CCDM J08199-7130"
	Parallax        2.9846
	AppMagn         7.9
	Class           "K2III"
	AbsMagn         0.274 // 计算的值
	MassSol         1.67
	RadSol          12.375 // Gaia DR3
	LumBol          89.0944976052594 // 计算的值
	Teff            5041
	FeH             -0.167

	Orbit     
	{
		Period          547229
		SemiMajorAxis   13479.1364036911 // 99.72 asec
		ArgOfPericenter 48
		MeanAnomaly     0
	}
}

// Object * zet Vol  ---  Star  ---  OID=@3177300   (@@69007,13)  ---  coobox=21400 
// Object types: High Proper Motion Star,Red Giant Branch star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "ZET Vol A" {ParentBody "ZET Vol"}
Remove "ZET Vol B" {ParentBody "ZET Vol"}
Star "ZET Vol A"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 37504"
	Class           "G9IIIb"
	AbsMagn         0.75
	MassSol         1.224
	RadSol          10.677
	LumBol          60
	Teff            4788
	FeH             -0.17
	Age             5.1

	BinaryOrbit     
	{
		Separation      747.40280939951 // 16.77 asec
	}
}

// Object * zet Vol B  ---  Star  ---  OID=@3177301   (@@69007,14)  ---  coobox=21400 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "ZET Vol B/Gaia DR3 5263150888430032384/TIC 272086940/2MASS J07415253-7236294/CCDM J07418-7236B/CPC 21.2 1073/CPD-72 627B/CSI-72 627 42/GC 10446/IDS 07430-7222 B/PPM 369661/SAO 256439/WDS J07418-7236B/TYC 9188-1865-1/UCAC4 087-013265/DENIS J074152.5-723629/PPMX J074152.5-723629/HD 63295B/Gaia DR2 5263150888430032384"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 37504"
	Class           ""
	MassKg          1.64181728825397e+30 // log(g) = 4.461 cm/s^2
	RadSol          0.885 // Gaia DR3
	LumBol          0.557620990154741 // 计算的值
	Teff            5302
	FeH             -0.48
}
