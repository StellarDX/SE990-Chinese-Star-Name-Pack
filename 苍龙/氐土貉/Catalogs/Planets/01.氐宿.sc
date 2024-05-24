// Object * alf02 Lib  ---  Spectroscopic Binary  ---  OID=@2309078   (@@48134,0)  ---  coobox=15870 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=72603
Remove "ALF1 Lib" {ParentBody "Zubenelgenubi"}
Remove "ALF1 Lib A" {ParentBody "ALF1 Lib"}
Remove "ALF1 Lib B" {ParentBody "ALF1 Lib"}
Remove "ALF2 Lib" {ParentBody "Zubenelgenubi"}
Remove "ALF2 Lib A" {ParentBody "ALF2 Lib"}
Remove "ALF2 Lib B" {ParentBody "ALF2 Lib"}
Barycenter "氐宿一/ALF2 Lib/GJ 9499/GJ 564.1/HIP 72622/Gaia DR3 6309703507861332736/TIC 386886963/PLX 3351/9 Lib/BD-15 3966/BDS 7018 A/CCDM J14508-1602A/FK5 548/GC 19975/GCRV 8623/GEN# +1.00130841/GSC 06155-01210/HD 130841/HIC 72622/HR 5531/IDS 14453-1537 A/IRAS 14481-1550/IRC -20271/JP11 2543/N30 3351/NSV 6827/PMC 90-93 389/PPM 229372/ROT 2118/SACS 320/SAO 158840/SKY# 26964/TYC 6155-1210-1/UBV 12928/UBV M 20396/uvby98 100130841/2MASS J14505274-1602302/PLX 3351.00/WDS J14509-1603A/Renson 37210/ALF Lib A/Zubenelgenubi/WEB 12484/** AOT 53A/** DSG 17/WDS J14509-1603Aa,Ab/** SHJ 186A/** CAB 1A/** ALP 30A"
{
	ParentBody      "ALF Lib"
	BinaryOrbit     
	{
		Period          166985
		Separation      5400
		PositionAngle   314
	}
}

Star "ALF2 Lib A"
{
	DateUpdated     "2024-05-24"
	ParentBody      "GJ 9499"
	Parallax        43.03
	AppMagn         2.75
	Class           "kA2hA5mA4IV-V"
	AbsMagn         0.92 // 计算的值
	MassSol         1.95
	RadSol          2.8
	LumBol          30.82794111171264 // 计算的值
	Teff            8128
	FeH             -0.24

	BinaryOrbit // 2014MNRAS.437.2303F
	{
		PeriodDays      70.3400
		Eccentricity    0.410
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2455294.300
		ArgOfPericenter 48.0
		MeanAnomaly     0
	}
}

Star "ALF2 Lib B"
{
	DateUpdated     "2024-05-24"
	ParentBody      "GJ 9499"
	Class           ""
	MassSol         1.79
}

// Object * alf01 Lib  ---  Spectroscopic Binary  ---  OID=@2309077   (@@48128,15)  ---  coobox=15870 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter "氐宿增七/ALF1 Lib/GJ 9498/GJ 563.4/HIP 72603/Gaia DR3 6309706875115188224/TIC 386886976/PLX 3350/SBC9 2554/8 Lib/BD-15 3965/BDS 7018 B/CCDM J14508-1602B/FK5 1387/GC 19970/GCRV 8619/GEN# +1.00130819/GSC 06155-01209/HD 130819/HIC 72603/HR 5530/IDS 14453-1537 B/JP11 2542/N30 3350/PMC 90-93 975/PPM 229365/RBS 1437/ROT 2117/SAO 158836/SKY# 26959/TD1 17753/TYC 6155-1209-1/UBV 12927/UBV M 20395/YZ 105 5475/uvby98 100130819/2MASS J14504122-1559498/PLX 3350.00/1RXS J145040.5-155952/WDS J14509-1603Ba,Bb/AKARI-IRC-V1 J1450411-155950/IRAS 14479-1547/** SHJ 186B/** AOT 53B/** BEU 19/WDS J14509-1603B/ALF Lib B/WEB 12481/Gaia DR2 6309706875115188224"
{
	ParentBody      "ALF Lib"
}

Star "ALF1 Lib A"
{
	DateUpdated     "2024-05-24"
	ParentBody      "GJ 9498"
	Parallax        41.7742
	AppMagn         5.16
	Class           "F3V"
	AbsMagn         3.35
	MassSol         1.4 // 1.5
	RadSol          1.409
	LumBol          3.5041747691062697 // 计算的值
	Teff            6653
	FeH             -0.07
	Age             1.1

	BinaryOrbit // Tok 2023, combined
	{
		Period          16.2200
		Separation      8.28226204045347 // 0.346 asec
		Eccentricity    0.244
		Inclination     54.4
		AscendingNode   122.7
		Epoch           2459561.599661342799664
		ArgOfPericenter 4.1
		MeanAnomaly     0
	}
}

Star "ALF1 Lib B"
{
	DateUpdated     "2024-05-24"
	ParentBody      "GJ 9498"
	Class           ""
	MassSol         0.5 // 0.6
}

// Object * iot Lib  ---  Spectroscopic Binary  ---  OID=@2480898   (@@48726,0)  ---  coobox=16473 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "IOT1 Lib A" {ParentBody "IOT1 Lib"}
Remove "IOT1 Lib BC" {ParentBody "IOT1 Lib"}
Remove "IOT1 Lib Aa" {ParentBody "IOT1 Lib A"}
Remove "IOT1 Lib Ab" {ParentBody "IOT1 Lib A"}
Remove "IOT1 Lib B" {ParentBody "IOT1 Lib BC"}
Remove "IOT1 Lib C" {ParentBody "IOT1 Lib BC"}
Barycenter "IOT Lib A"
{
	ParentBody      "IOT Lib"
	BinaryOrbit     
	{
		Period          195132
		Separation      6728.75434674286 // 57.8 asec
	}
}

Star "IOT Lib Aa"
{
	DateUpdated     "2024-05-24"
	ParentBody      "IOT Lib A"
	Class           "B9IVpSi"
	AbsMagn         -0.79
	MassSol         3.61
	LumBol          277

	BinaryOrbit // VB6_Jte2018  B_2351Aa, Gr.2
	{
		Period          23.4720
		Separation      15.0170626096903 // 0.129 asec
		Eccentricity    0.249
		Inclination     154.9
		AscendingNode   173.0
		Epoch           2440994.512486310675740
		ArgOfPericenter 339.7
		MeanAnomaly     0
	}
}

Star "IOT Lib Ab"
{
	DateUpdated     "2024-05-24"
	ParentBody      "IOT Lib A"
	Class           "B9"
	MassSol         3.12
}

Barycenter "IOT Lib BC"
{
	ParentBody      "IOT Lib"
}

Star "IOT Lib B"
{
	DateUpdated     "2024-05-24"
	ParentBody      "IOT Lib BC"
	Class           "G5IV"
	MassSol         0.98

	BinaryOrbit     
	{
		Period          2805
		Separation      239.581125392995
	}
}

Star "IOT Lib C"
{
	DateUpdated     "2024-05-24"
	ParentBody      "IOT Lib BC"
	Class           ""
	MassSol         0.91
}

// Object * gam Lib  ---  Double or Multiple Star  ---  OID=@2544098   (@@49387,5)  ---  coobox=16685 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "GAM Lib b" {ParentBody "GAM Lib"}
Remove "GAM Lib c" {ParentBody "GAM Lib"}
Star "GAM Lib A"
{
	DateUpdated     "2024-05-24"
	ParentBody      "GAM Lib"
	Class           "G8.5III"
	AbsMagn         -1.59
	MassSol         1.15
	RadSol          11.14
	LumBol          72
	Teff            4826
	FeH             -0.26
	Age             4.31

	BinaryOrbit     
	{
		Epoch           2429630
		Separation      5.0035398179523 // 0.1 asec
		PositionAngle   191
	}
}

Star "GAM Lib B"
{
	ParentBody      "GAM Lib"
	Class           "A5.5?"
}

// Object * gam Lib b  ---  Extra-solar Planet  ---  OID=@13310862   (@@-1,255)  ---  coobox=16685
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet "GAM Lib b"
{
	ParentBody     "GAM Lib A"
	DiscMethod     "RadVel"
	DiscDate       "2018"
	Class          "GasGiant"
	MassJup        1.029

	Orbit
	{
		Epoch           2450047
		PeriodDays      415.2
		SemiMajorAxis   1.2397
		Eccentricity    0.25
		ArgOfPericen    219.1
	}
}

// Object * gam Lib c  ---  Extra-solar Planet  ---  OID=@13310863   (@@-1,255)  ---  coobox=16685
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"GAM Lib c"
{
	ParentBody     "GAM Lib A"
	DiscMethod     "RadVel"
	DiscDate       "2018"
	Class          "GasGiant"
	MassJup        4.63

	Orbit
	{
		Epoch           2450716
		PeriodDays      964.6
		SemiMajorAxis   2.1761
		Eccentricity    0.054
		ArgOfPericen    154.3
	}
}
