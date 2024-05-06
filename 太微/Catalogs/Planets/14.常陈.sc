// Object * alf02 CVn  ---  alpha2 CVn Variable  ---  OID=@1976891   (@@41073,0)  ---  coobox=13409 
// Object types: Chemically Peculiar Star,High Proper Motion Star,Double or Multiple Star,Blue Object,Variable Star,High Proper Motion Star,alpha2 CVn Variable,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,X-ray Source 
Remove "Cor Caroli A" {ParentBody "Cor Caroli"}
Remove "Cor Caroli B" {ParentBody "Cor Caroli"}
Star "ALF2 CVn/HIP 63125/Gaia DR3 1517698716348324992/TIC 17668155/PLX 2969/LSPM J1256+3819/ASCC 494743/USNO-B1.0 1283-00241520/ALF CVn A/12 CVn A/2E 2902/ADS 8706 A/AG+38 1225/BD+39 2580/BD+39 2580A/CCDM J12560+3819A/CSI+39 2580 1/FK5 485/GC 17557/GCRV 7733/GEN# +1.00112413/HD 112413/HGAM 621/HIC 63125/HR 4915/IDS 12514+3851 A/IRAS 12536+3835/IRAS F12536+3835/IRC +40239/JP11 2336/LTT 13717/N30 2983/NLTT 32338/PMC 90-93 344/PPM 76815/ROT 1913/SAO 63257/SBS 74/SKY# 24037/SRS 30485/UBV 11678/UBV M 18844/V* ALF2 CVn/[SS59] I 358/[ZEH2003] RX J1256.0+3818 1/2MASS J12560168+3819059/2E 1253.6+3835/WDS J12560+3819A/TYC 3021-2645-1/Renson 32650/RX J1256.0+3818/1RXS J125600.6+381856/** STF 1692A/Cor Caroli/uvby98 100112413/WEB 11192"
{
	DateUpdated     "2024-05-06"
	ParentBody      "ALF CVn"
	Class           "A0VpSiEu"
	AbsMagn         0.16
	MassSol         2.97
	RadSol          2.49
	LumBol          101
	Teff            11600
	RotationPeriod  131.26536
	Age             0.165

	BinaryOrbit     
	{
		Separation      589.193438758473 // 19.28 asec
	}
}

// Object * alf01 CVn  ---  High Proper Motion Star  ---  OID=@1976768   (@@41064,0)  ---  coobox=13409 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Blue Object,High Proper Motion Star,Star,X-ray Source 
Star "ALF1 CVn/HIP 63121/Gaia DR3 1517698613271954304/TIC 17668162/[ZEH2003] RX J1256.0+3818 2/LSPM J1256+3818/ASCC 494741/2MASS J12560044+3818533/USNO-B1.0 1283-00241516/ALF CVn B/12 CVn B/ADS 8706 B/AG+38 1224/BD+39 2580B/CCDM J12560+3819B/CSI+39 2580 2/GC 17556/GCRV 7732/GEN# +1.00112412/HD 112412/HIC 63121/HR 4914/IDS 12514+3851 B/JP11 2335/LTT 13718/NLTT 32336/PPM 76814/ROT 1912/SAO 63256/SBS 75/SKY# 24035/UBV 11679/UBV M 18843/[SS59] I 357/1E 1253.6+3835/WDS J12560+3819B/TYC 3021-2646-1/** STF 1692B/Renson 32640/uvby98 100112412/WEB 11191/Gaia DR2 1517698613271363840"
{
	DateUpdated     "2024-05-06"
	ParentBody      "ALF CVn"
	Parallax        30.6121
	AppMagn         5.6
	Class           "F2V"
	MassSol         1.47
	RadSol          1.5
	LumBol          5.093416925576051 // 计算的值
	Teff            7080
}

// Object * 2 CVn  ---  Star  ---  OID=@1902240   (@@39369,0)  ---  coobox=13326 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Infra-Red Source 
Star "2 CVn A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "2 CVn"
	Class           "M0.5III"
	AbsMagn         -1.06 // 计算的值
	MassKg          9.25755296586024e+30 // log(g) = 1.731 cm/s^2
	RadSol          48.7 // Gaia DR3
	LumBol          1427.49228001813 // 计算的值
	Teff            5084
	FeH             -0.023

	BinaryOrbit     
	{
		Separation      2557.23928826744 // 11.56 asec
	}
}

// Object * 2 CVn B  ---  Star  ---  OID=@1902241   (@@39369,1)  ---  coobox=13326 
// Object types: Double or Multiple Star,Star,Star,Star 
Star "2 CVn B"
{
	DateUpdated     "2024-05-06"
	ParentBody      "2 CVn"
	Parallax        4.3395
	AppMagn         8.638
	Class           "F7V"
	AbsMagn         1.82 // 计算的值
}
