// Object * alf Hya  ---  Star  ---  OID=@1634852   (@@134482,0)  ---  coobox=14394 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "ALF Hya A"
{
	DateUpdated     "2024-07-26"
	ParentBody      "ALF Hya"
	Class           "K3IIIa"
	AbsMagn         -1.743
	MassSol         3.2
	RadSol          55.9
	LumBol          971
	Luminosity      426
	Teff            4117
	FeH             -0.12
	RotationPeriod  71784
	Age             0.420

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   5.2199111
		Eccentricity    0.169716748
		Inclination     1.36488926
		AscendingNode   0
		ArgOfPericenter -154.566638
		MeanAnomaly     170.638158
	}
}

Star "ALF Hya B(?)"
{
	ParentBody      "ALF Hya"
	Class           "WD"
}

// Object * tau01 Hya  ---  Spectroscopic Binary  ---  OID=@1633935   (@@34133,0)  ---  coobox=14361 
// Object types: High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=81997
Remove "TAU1 Hya A"{ParentBody "TAU1 Hya"}
Remove "TAU1 Hya B"{ParentBody "TAU1 Hya"}
Remove "TAU1 Hya Aa"{ParentBody "TAU1 Hya A"}
Remove "TAU1 Hya Ab"{ParentBody "TAU1 Hya A"}
Barycenter "TAU1 Hya A"
{
	ParentBody      "HIP 46509"
	BinaryOrbit     
	{
		Period          26087
		Separation      1192.30789778531 // 65.48 asec
	}
}

Star "TAU1 Hya A1"
{
	DateUpdated     "2024-07-26"
	ParentBody      "TAU1 Hya A"
	Class           "F5V"
	AbsMagn         3.28
	MassSol         1.20
	RadSol          1.4
	LumBol          3.369
	Teff            6473
	FeH             -0.01
	Age             3.61

	BinaryOrbit // SB9_2549 2012MNRAS.422...14H
	{
		PeriodDays      2815
		Eccentricity    0.427
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2447994
		ArgOfPericenter 152.7
		MeanAnomaly     0
	}
}

Star "TAU1 Hya A2"
{
	DateUpdated     "2024-07-26"
	ParentBody      "TAU1 Hya A"
	Class           ""
	MassSol         0.35
}

// Object * tau01 Hya B  ---  High Proper Motion Star  ---  OID=@1634077   (@@108565,14)  ---  coobox=14361 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "TAU1 Hya B/GJ 348 B/Gaia DR3 3837746380705638656/TIC 77549396/AG-02 518/BD-02 2902/BDS 5109 B/CCDM J09291-0246B/GC 13081/GEN# +1.20081997/GEN# +1.00081997B/GEN# -0.00202902/GSC 04885-01567/IDS 09240-0220 B/PPM 177881/SAO 136896/TYC 4885-1567-1/UBV 9047/uvby98 100081997 B/2MASS J09290922-0245027/WDS J09291-0246B/** HJ 1167B/PMSC 09241-0219B/* 31 Hya B/BD-02 2901B/HD 81997B/Gaia DR1 3837746380705638656/Gaia DR2 3837746380705638656"
{
	DateUpdated     "2024-07-26"
	ParentBody      "HIP 46509"
	Parallax        55.2676
	AppMagn         7.15
	Class           "K0"
	AbsMagn         5.86 // 计算的值
	MassSol         0.86
	RadSol          0.81
	LumBol          0.435
	Teff            5197
}

// Object * tau02 Hya  ---  Star  ---  OID=@1633586   (@@34126,9)  ---  coobox=14355 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "TAU2 Hya A"
{
	DateUpdated     "2024-07-26"
	ParentBody      "TAU2 Hya"
	Class           "A2V"
	AbsMagn         -1.43
	RadSol          4.5
	LumBol          285
	Teff            7918

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   15.4311215
		Eccentricity    0.0484376776
		Inclination     1.72698367
		AscendingNode   0
		ArgOfPericenter 109.296981
		MeanAnomaly     -7.49682683
	}
}

Star "TAU2 Hya B"
{
	ParentBody      "TAU2 Hya"
	Class           "A2.8?"
}

// Object * 27 Hya  ---  Star  ---  OID=@1621218   (@@33892,10)  ---  coobox=14469 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=80586
Remove "27 Hya (BC)"{ParentBody "27 Hya"}
Remove "27 Hya A"{ParentBody "27 Hya"}
Remove "27 Hya B"{ParentBody "27 Hya (BC)"}
Remove "27 Hya C"{ParentBody "27 Hya (BC)"}
Star "27 Hya/HIP 45811/Gaia DR3 5742852762061978880/** SH 105A/TIC 60954380/PLX 2228/ADS 7311 A/BD-08 2643/CCDM J09204-0934A/GC 12881/GCRV 6083/GEN# +1.00080586A/GSC 05463-01514/HD 80586/HIC 45811/HR 3709/IDS 09156-0908 A/IRC -10215/JP11 1801/PPM 192278/ROT 1465/SAO 136768/SKY# 18025/TD1 13817/TYC 5463-1514-1/UBV 8911/UBV M 15309/YZ 99 3637/uvby98 100080586 A/WDS J09205-0933A/PMSC 09156-0907A/2MASS J09202901-0933207/WEB 8687/IRAS 09180-0920/AKARI-IRC-V1 J0920290-093319/Gaia DR2 5742852762061629056"
{
	DateUpdated     "2024-07-28"
	ParentBody      "ADS 7311"
	Parallax        14.6304
	AppMagn         4.811
	Class           "K0III"
	AbsMagn         0.64 // 计算的值
	MassSol         2.17
	RadSol          11
	LumBol          57.5
	Teff            4965
	FeH             -0.07
	Age             1.91
}

Barycenter "ADS 7311 BC"
{
	ParentBody      "ADS 7311"
	BinaryOrbit     
	{
		Period          869169
		Separation      15659.1746108226 // 229.1 asec
	}
}

// Object HD 80550  ---  Star  ---  OID=@1621233   (@@33893,10)  ---  coobox=14469 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "HD 80550/HIP 45802/Gaia DR3 5742848123496954112/TIC 60908478/ADS 7311 B/BD-09 2801/CCDM J09204-0934B/CSI-09 2801 1/GC 12877/GCRV 6080/GEN# +1.00080550/GSC 05463-01515/HERZ 1244/HIC 45802/IDS 09156-0908 B/PPM 192276/ROT 1464/SAO 136767/SKY# 18020/TD1 13813/TYC 5463-1515-1/UBV 8912/UBV M 15304/YZ 99 3636/2MASS J09202100-0936365/WDS J09205-0933B/** SHJ 105B/PMSC 09156-0907B/WEB 8685/Gaia DR2 5742848123496954112/Gaia DR1 5742848119201178880"
{
	DateUpdated     "2024-07-28"
	ParentBody      "ADS 7311 BC"
	Parallax        14.8454
	AppMagn         6.95
	Class           "F4V"
	AbsMagn         2.81 // 计算的值
	MassSol         1.48
	RadSol          1.82
	LumBol          5.885
	Teff            6664

	BinaryOrbit     
	{
		Period          10589
		Separation      625.109448245935
	}
}

// Object TYC 5463-1518-1  ---  Star  ---  OID=@11606231   (@@-1,255)  ---  coobox=14469 
// Object types: Double or Multiple Star,Star 
Star "TYC 5463-1518-1/Gaia DR3 5742848123496954496/Gaia DR2 5742848123496954496/ADS 7311 C/CCDM J09204-0934C/CSI-09 2801 2/GEN# +1.00080586C/UBV 8913/WDS J09205-0933C/PMSC 09156-0907C/RAVE J092020.8-093645"
{
	DateUpdated     "2024-07-28"
	ParentBody      "ADS 7311 BC"
	Parallax        14.7346
	AppMagn         12.75
	Class           "K2V"
	AbsMagn         8.59 // 计算的值
	MassSol         0.76
	RadSol          0.72
	LumBol          0.227
	Teff            4685
}

Planet "27 Hya b"
{
	ParentBody     "27 Hya"
	DiscMethod     "RadVel"
	DiscDate       "2009"
	MassJup        10

	Orbit
	{
		PeriodDays      3400
		SemiMajorAxis   5.9
	}
}

// Object * 26 Hya  ---  Double or Multiple Star  ---  OID=@1621480   (@@33899,6)  ---  coobox=14479 
// Object types: Red Giant Branch star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "26 Hya A"
{
	DateUpdated     "2024-07-28"
	ParentBody      "26 Hya"
	Class           "G7III"
	AbsMagn         -0.29
	MassSol         2.72
	RadSol          15.14
	LumBol          138.5
	Teff            5003
	FeH             -0.13
	Age             0.51

	BinaryOrbit     
	{
		Separation      338.574162618602
	}
}

Star "26 Hya B"
{
	ParentBody      "26 Hya"
	Class           "A2.2?"
}