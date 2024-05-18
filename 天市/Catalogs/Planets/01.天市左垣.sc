// Object * del Her  ---  Spectroscopic Binary  ---  OID=@2781350   (@@52734,0)  ---  coobox=18305 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "Sarin A" {ParentBody "Sarin"}
Remove "DEL Her B" {ParentBody "Sarin"}
Star "DEL Her Aa"
{
	DateUpdated     "2024-05-10"
	ParentBody      "DEL Her"
	Class           "A1IVn"
	AbsMagn         1.31
	MassSol         2.4
	RadSol          2.2
	LumBol          38
	Teff            9620
	Age             0.370

	BinaryOrbit     
	{
		PeriodDays      335
		Separation      1.45
	}
}

Star "DEL Her Ab"
{
	DateUpdated     "2024-05-10"
	ParentBody      "DEL Her"
	Class           "F0?"
	MassSol         1.6
	RadSol          1.5
	LumBol          6.8
	Teff            7500
}

// Object * mu.01 Her  ---  Double or Multiple Star  ---  OID=@2799583   (@@134593,0)  ---  coobox=18343 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "MU Her A"{ParentBody "MU Her"}
Remove "MU Her BC"{ParentBody "MU Her"}
Remove "MU Her Aa"{ParentBody "MU Her A"}
Remove "MU Her Ab"{ParentBody "MU Her A"}
Remove "MU Her B"{ParentBody "MU Her BC"}
Remove "MU Her C"{ParentBody "MU Her BC"}
Barycenter "MU1 Her/GJ 695 A/HIP 86974/Gaia DR3 4594497769766809216/TIC 460067868/PLX 4060/ASCC 697588/LSPM J1746+2743E/USNO-B1.0 1177-00371509/86 Her/MU Her A/2E 3947/ADS 10786 A/AG+27 1677/BD+27 2888/CCDM J17465+2744A/CSI+27 2888 1/Ci 20 1065/FK5 667/GC 24138/GCRV 10285/GEN# +1.00161797A/GSC 02085-03062/HD 161797/HD 161797A/HIC 86974/HR 6623/IDS 17425+2747 A/IRAS 17444+2744/IRC +30312/JP11 2891/LFT 1374/LHS 3326/LTT 15266/N30 3954/NLTT 45435/PMC 90-93 473/PPM 106324/ROT 2489/SAO 85397/SKY# 32126/SPOCS 764/SRS 30667/TD1 20993/TYC 2085-3062-1/UBV 15136/USNO 873/YZ 27 8419/Zkh 264/uvby98 100161797 A/2MASS J17462752+2743142/1E 1744.4+2744/1RXS J174627.3+274322/2E 1744.5+2744/WDS J17465+2743Aa,Ab/WDS J17465+2743A/** TRN 2/** STF 2220A/** ABT 14A/PMSC 17425+2747A/WEB 14673/Gaia DR2 4594497769763697792"
{
	ParentBody      "ADS 10786"
	BinaryOrbit     
	{
		Period          3384
		Separation      281.926673109438 // 119.9248 asec
	}
}

Star "MU1 Her A"
{
	DateUpdated     "2024-05-10"
	ParentBody      "MU1 Her"
	Class           "G5IV"
	AbsMagn         3.82
	MassSol         1.11
	RadSol          1.73
	LumBol          2.54
	Teff            5560
	FeH             0.28
	RotationPeriod  1248
	Age             7.8

	BinaryOrbit     
	{
		Period          98.9
		Separation      24.1818145674627 // 2.9 asec
		Eccentricity    0.44
		Inclination     62.82
		AscendingNode   80.4
		Epoch           2422726.923914278857410
		ArgOfPericenter 34
		MeanAnomaly     0
	}
}

Star "MU1 Her B"
{
	DateUpdated     "2024-05-10"
	ParentBody      "MU1 Her"
	Class           "M4V"
	MassSol         0.32
}

// Object * mu.02 Her  ---  Double or Multiple Star  ---  OID=@5545921   (@@-1,255)  ---  coobox=18343 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Double or Multiple Star,Star 
Barycenter "MU2 Her/TIC 460067872/IDS 17425+2747 BC/ADS 10786 BC/WDS J17465+2743BC/CCDM J17465+2744BC/ADS 1078 BC/LHS 3325/GCRV 10286/LFT 1375/UBV 15137/AG+27 1676/NLTT 45430/ASCC 697584/LTT 15267/PPM 106321/2MASS J17462507+2743014/PPMX J174625.0+274301/** AC 7/** STF 2220BC/CSI+27 2888 5/Zkh 266/[RHG95] 2825/Zkh 265/LSPM J1746+2743W/CSI+27 2888 4/CSI+27 2888 2/[RHG95] 2824/Gaia DR2 4594497834189213184/PM J17464+2743W/WEB 14671/Karmn J17464+277AB"
{
	ParentBody      "ADS 10786"
}

Star "MU2 Her A"
{
	DateUpdated     "2024-05-10"
	ParentBody      "MU2 Her"
	Class           "M3.5V"
	AbsMagn         10.26
	MassSol         0.44
	RadSol          0.60
	LumBol          0.087
	Teff            4050
	FeH             0.21

	BinaryOrbit     
	{
		Period          43.127
		Separation      11.548934661429 // 1.385 asec
		Eccentricity    0.1796
		Inclination     66.06
		AscendingNode   60.07
		Epoch           2454588.827124939765781
		ArgOfPericenter 352.85
		MeanAnomaly     0
	}
}

Star "MU2 Her B"
{
	DateUpdated     "2024-05-10"
	ParentBody      "MU2 Her"
	Class           ""
	MassSol         0.39
}

// Object * 112 Her  ---  Spectroscopic Binary  ---  OID=@2768715   (@@57559,0)  ---  coobox=19671 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star,UV-emission Source 
Star "112 Her A"
{
	DateUpdated     "2024-05-10"
	ParentBody      "112 Her"
	Class           "B6.5V"
	AbsMagn         -0.04
	MassSol         5.0
	RadSol          2.888
	LumBol          203
	Teff            12853
	RotationPeriod  298.056

	BinaryOrbit     
	{
		PeriodDays      6.36246
		Eccentricity    0.11
		Epoch           2452540.11
		ArgOfPericenter 18
		MeanAnomaly     0
	}
}

Star "112 Her B"
{
	DateUpdated     "2024-05-10"
	ParentBody      "112 Her"
	Class           "A2V"
	MassSol         2.5
	Radius          1446879.58108313 // log(g) = 4.2 cm/s^2
}

// Object * zet Aql  ---  High Proper Motion Star  ---  OID=@2735885   (@@58189,0)  ---  coobox=19662 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "ZET Aql A" {ParentBody "ZET Aql"}
Remove "ZET Aql B" {ParentBody "ZET Aql"}
Star "ZET Aql A"
{
	DateUpdated     "2024-05-10"
	ParentBody      "GJ 4095"
	Class           "A0IV-Vnn"
	AbsMagn         0.96
	MassSol         2.37
	RadSol          2.27
	LumBol          39.4
	Teff            9620
	FeH             -0.52
	Age             0.100
}

// Object * zet Aql B  ---  High Proper Motion Star  ---  OID=@2735717   (@@58180,11)  ---  coobox=19662 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "ZET Aql B/Gaia DR3 4314399312966563968/ADS 12026 B/CCDM J19055+1352B/CSI+13 3899 2/IDS 19008+1343 B/WDS J19054+1352B/** BU 287B/UGPS J190524.98+135153.8/Gaia DR2 4314399312966563968"
{
	DateUpdated     "2024-05-10"
	ParentBody      "ZET Aql A"
	Class           ""
	MassSol         0.50

	Orbit     
	{
		Epoch           2454832
		SemiMajorAxis   185.1
		ArgOfPericenter 46
		MeanAnomaly     0
	}
}

// Object UCAC3 208-200112  ---  High Proper Motion Star  ---  OID=@8596093   (@@-1,255)  ---  coobox=19662 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Star 
Star "UCAC3 208-200112/WISEA J190656.10+134032.3/TIC 394199737/2MASS J19065609+1340323/WDS J19054+1352E/UCAC4 519-091401/WISE J190656.11+134032.4"
{
	DateUpdated     "2024-05-10"
	ParentBody      "ZET Aql A"
	Class           ""
	MassSol         0.14

	Orbit     
	{
		SemiMajorAxis   38000
		ArgOfPericenter 117
		MeanAnomaly     0
	}
}

// Object * tet01 Ser  ---  High Proper Motion Star  ---  OID=@2672674   (@@57660,0)  ---  coobox=19591 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Remove "TET1 Ser" {ParentBody "TET Ser"}
Remove "TET2 Ser" {ParentBody "TET Ser"}
Star "TET1 Ser/HIP 92946/Gaia DR3 4281199284413726208/WISEA J185613.26+041212.9/TIC 227271980/PLX 4387/63 Ser A/ADS 11853 A/AG+04 2420/BD+04 3916/CCDM J18563+0413A/CSI+04 3916 1/FK5 709/GC 25991/GCRV 11384/GEN# +1.00175638A/HD 175638/HIC 92946/HR 7141/IDS 18512+0404 A/N30 4197/PMC 90-93 503/PPM 166832/ROT 2686/SAO 124068/SKY# 34895/UBV 16083/YZ 4 6429/[GS83] 24/uvby98 100175638 A/2MASS J18561318+0412130/SSTGLMC G037.2178+00.8541/WDS J18562+0412A/TYC 457-687-1/AKARI-IRC-V1 J1856131+041213/WISE J185613.23+041213.1/WEB 16096/Gaia DR2 4281199284413726208"
{
	DateUpdated     "2024-05-10"
	ParentBody      "ADS 11853 AB"
	Parallax        24.2696
	AppMagn         4.57
	Class           "A5V"
	AbsMagn         1.5 // 计算的值

	BinaryOrbit     
	{
		Period          14000
		Separation      900
	}
}

// Object * tet02 Ser  ---  High Proper Motion Star  ---  OID=@2672313   (@@57639,1)  ---  coobox=19591 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "TET2 Ser/HIP 92951/Gaia DR3 4281199318773462016/WISEA J185614.65+041207.6/TIC 227271997/63 Ser B/ADS 11853 B/AG+04 2421/BD+04 3917/CCDM J18563+0413B/GC 25993/GCRV 11385/GEN# +1.00175639/HD 175639/HIC 92951/HR 7142/IDS 18512+0404 B/JP11 3045/PPM 166833/ROT 2687/SAO 124070/SKY# 34897/UBV 16084/UBV M 23327/YZ 4 6430/uvby98 100175639/2MASS J18561464+0412078/WDS J18562+0412B/TYC 457-688-1/** STF 2417B/AKARI-IRC-V1 J1856145+041207/WISE J185614.66+041208.2/WEB 16097/Gaia DR2 4281199318773462016"
{
	DateUpdated     "2024-05-10"
	ParentBody      "ADS 11853 AB"
	Parallax        24.531
	AppMagn         4.98
	Class           "A5Vn"
	AbsMagn         1.93 // 计算的值
	MassKg          3.2148162272841e+30 // log(g) = 3.992 cm/s^2
	RadSol          2.125 // Gaia DR3
	LumBol          13.7161249386884 // 计算的值
	Teff            7620
	FeH             -0.51
}

// Object * nu. Oph b  ---  Extra-solar Planet  ---  OID=@5499603   (@@-1,255)  ---  coobox=17387
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Remove "NU Oph b" {ParentBody "NU Oph"}
Planet "NU Oph b"
{
	ParentBody     "WISE J175901.62-094626.8"
	DiscMethod     "RadVel"
	DiscDate       "2004"
	MassJup        22.2 // 22.2-81.7

	Orbit
	{
		Epoch           2452034.2
		PeriodDays      530.73
		SemiMajorAxis   1.803
		Eccentricity    0.124
		Inclination     16 // 90
		ArgOfPericen    9.93
	}
}

// Object * nu. Oph c  ---  Extra-solar Planet  ---  OID=@7894072   (@@-1,255)  ---  coobox=17387
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Remove "NU Oph c" {ParentBody "NU Oph"}
Planet "NU Oph c"
{
	ParentBody     "WISE J175901.62-094626.8"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	MassJup        24.7 // 24.7 - 92.0 MJup

	Orbit
	{
		Epoch           2453038
		PeriodDays      3188.95
		SemiMajorAxis   6.022
		Eccentricity    0.178
		Inclination     16 // 90
		ArgOfPericen    8.27
	}
}

// Object * ksi Ser  ---  Spectroscopic Binary  ---  OID=@2562034   (@@53748,5)  ---  coobox=17328 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "KSI Ser A"{ParentBody "KSI Ser"}
Remove "KSI Ser Aa"{ParentBody "KSI Ser A"}
Remove "KSI Ser Ab"{ParentBody "KSI Ser A"}
Remove "KSI Ser B"{ParentBody "KSI Ser"}
Barycenter "KSI Ser A"
{
	ParentBody      "HIP 86263"
	BinaryOrbit     
	{
		Epoch           2455928
		PeriodDays      14763
		Separation      729.864853836218 // 24 asec
		PositionAngle   78
	}
}

Star "KSI Ser A1"
{
	DateUpdated     "2024-05-11"
	ParentBody      "KSI Ser A"
	Class           "A9IIIpSr:"
	AbsMagn         1.00
	MassSol         2.06
	Radius          2461628.24758213 // 计算的值
	LumBol          30.6
	Teff            7217
	FeH             0.07
	Age             1.03

	BinaryOrbit     
	{
		PeriodDays      2.2923
		Eccentricity    0.00
		Epoch           2419210.191
	}
}

Star "KSI Ser A2"
{
	ParentBody      "KSI Ser A"
	Class           ""
	MassSol         0.18
}

Star "KSI Ser B/Gaia DR3 4125171197128705280/WISEA J173736.81-152350.6/TIC 416343372/CCDM J17376-1524B/CSI-15 4621 2/IDS 17319-1520 B/WDS J17376-1524B/** RST 5090B/2MASS J17373685-1523498/WISE J173736.82-152350.4/DENIS J173736.8-152349/Gaia DR2 4125171197128705280"
{
	DateUpdated     "2024-05-11"
	ParentBody      "HIP 86263"
	Parallax        31.7768
	AppMagn         13
	Class           "M1?"
	MassSol         0.27
}

// Object * eta Oph  ---  Double or Multiple Star  ---  OID=@2561035   (@@52843,2)  ---  coobox=17210 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "Sabik A" {ParentBody "Sabik"}
Remove "Sabik B" {ParentBody "Sabik"}
Star "ETA Oph A"
{
	DateUpdated     "2024-05-11"
	ParentBody      "ETA Oph"
	Class           "A1IV"
	AbsMagn         0.26 // 计算的值
	MassSol         2.966
	FeH             -0.01

	BinaryOrbit     
	{
		Period          87.58
		Separation      37.8217077586985 // 1.396 asec
		Eccentricity    0.950
		Inclination     95.2
		AscendingNode   38.9
		Epoch           2460558.710864014923573
		ArgOfPericenter 94.8
		MeanAnomaly     0
	}
}

Star "ETA Oph B"
{
	ParentBody      "ETA Oph"
	Class           "A1IV"
	MassSol         3.478
}