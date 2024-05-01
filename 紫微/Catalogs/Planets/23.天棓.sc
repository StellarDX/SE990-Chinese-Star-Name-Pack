// Object * ksi Dra  ---  High Proper Motion Star  ---  OID=@324145   (@@125620,0)  ---  coobox=1152 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "KSI Dra A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "KSI Dra"
	Class           "K2III"
	AbsMagn         1.06
	MassSol         1.45
	RadSol          12
	LumBol          49
	Teff            4445
	FeH             -0.09

	BinaryOrbit     
	{
		Separation      10862.9287789206 // 315.68 asec
	}
}

// Object LP 102-432  ---  High Proper Motion Star  ---  OID=@323836   (@@10078,21)  ---  coobox=1152 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "LP 102-432/AP J17525554+5654101/Gaia DR3 1421595863869136640/TIC 232618367/CCDM J17535+5653B/IDS 17519+5654 B/2MASS J17525554+5654101/WDS J17535+5652B/** LDS 1457B/PM J17529+5654/UCAC4 735-058240/Gaia DR2 1421595863869136640"
{
	DateUpdated     "2024-05-01"
	ParentBody      "KSI Dra"
	Parallax        29.2945
	AppMagn         13.076
	Class           "M5V"
	AbsMagn         10.4 // 计算的值
	MassKg          3.14151634662796e+29 // log(g) = 4.164 cm/s^2
	RadSol          0.5449423 // Gaia DR3
	LumBol          0.0290488419255063 // 计算的值
	Teff            3228
	FeH             -0.786
}

// Object * nu.02 Dra  ---  Spectroscopic Binary  ---  OID=@337566   (@@10409,1)  ---  coobox=1071 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Spectroscopic Binary,Star,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=159541
Remove "Kuma 1" {ParentBody "Kuma"}
Remove "Kuma 2" {ParentBody "Kuma"}
Barycenter "天棓二/NU2 Dra/HIP 85829/Gaia DR3 1420972548150735744/WISEA J173216.21+551023.1/TIC 229686919/PLX 3999/SBC9 976/LSPM J1732+5510/ASCC 199005/2MASS J17321602+5510224/USNO-B1.0 1451-00260073/25 Dra/ADS 10628 A/AG+55 1100/BD+55 1945/CCDM J17322+5511A/FK5 657/GC 23801/GCRV 10143/GEN# +1.00159560/GSC 03892-01621/HD 159560/HIC 85829/HR 6555/IDS 17302+5515 A/JP11 2869/N30 3909/PMC 90-93 466/PPM 36043/ROT 2467/SAO 30450/SBC7 628/SKY# 31655/TYC 3892-1621-1/UBV 14977/UBV M 22279/YZ 55 9330/uvby98 100159560/WDS J17322+5511A/Renson 44910/PMSC 17303+5514A/PMSC 17303+5514Aab/1RXS J173216.1+551023/** STF 4035A/AKARI-IRC-V1 J1732161+551023/WISE J173216.21+551023.2/WEB 14485/Gaia DR2 1420972548150735744"
{
	ParentBody      "NU Dra"
	BinaryOrbit     
	{
		Period          43259
		Separation      2076.63801201247 // 62.14 asec
	}
}

Star "NU2 Dra A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "NU2 Dra"
	Parallax        33.4187
	AppMagn         4.85 // Stellarium
	Class           "kA4hF2VmF3"
	AbsMagn         2.47 // 计算的值
	MassSol         1.61
	RadSol          1.812
	LumBol          8.272286091756982 // 计算的值
	Teff            7272

	BinaryOrbit // SB9_976 1992A&AS...93..545M
	{
		PeriodDays      38.0340
		Eccentricity    0.030
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2443425.000
		ArgOfPericenter 272.0
		MeanAnomaly     0
	}
}

Star "NU2 Dra B"
{
	ParentBody      "NU2 Dra"
	Class           ""
	MassSol         0.24
}

// Object * nu.01 Dra  ---  High Proper Motion Star  ---  OID=@337565   (@@10409,0)  ---  coobox=1071 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "天棓增一/NU1 Dra/HIP 85819/Gaia DR3 1420972823029057408/WISEA J173210.76+551103.5/TIC 229686929/LSPM J1732+5511/ASCC 199001/USNO-B1.0 1451-00260067/24 Dra/ADS 10628 B/AG+55 1099/BD+55 1944/CCDM J17322+5511B/FK5 655/GC 23797/GCRV 10141/GEN# +1.00159541/GSC 03892-01620/HD 159541/HIC 85819/HR 6554/IDS 17302+5515 B/JP11 2867/N30 3908/PMC 90-93 464/PPM 36040/ROT 2466/SAO 30447/SKY# 31651/TYC 3892-1620-1/UBV 14976/UBV M 22277/YZ 55 9329/uvby98 100159541/2MASS J17321055+5511033/WDS J17322+5511B/** STF 4035B/Renson 44890/PMSC 17303+5514B/AKARI-IRC-V1 J1732107+551103/WISE J173210.72+551103.6/WEB 14483/Gaia DR2 1420972823028539008"
{
	DateUpdated     "2024-05-01"
	ParentBody      "NU Dra"
	Parallax        33.2097
	AppMagn         4.85 // Stellarium
	Class           "kA3hF0mF0(IV-V)"
	AbsMagn         2.46 // 计算的值
	MassSol         1.85
	Radius          1244652.87787194 // log(g) = 4.2 cm/s^2
	LumBol          9.285772440458253 // 计算的值
	Teff            7533
	FeH             0.03
	Age             0.013
}

// Object * bet Dra  ---  Star  ---  OID=@352495   (@@135149,0)  ---  coobox=1074 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "BET Dra A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "BET Dra"
	Class           "G2Ib-IIa"
	AbsMagn         -2.457
	MassSol         6.0
	RadSol          40
	LumBol          996
	Teff            5160
	FeH             0.02
	Age             0.065

	BinaryOrbit     
	{
		Period          4000
		Separation      489.51050313718 // 4.2 asec
	}
}

Star "BET Dra B"
{
	ParentBody      "BET Dra"
	Class           "M9?"
}

// Object * gam Dra  ---  Star  ---  OID=@323363   (@@131459,0)  ---  coobox=1056 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "GAM Dra A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "GAM Dra"
	Class           "K5III"
	AbsMagn         -1.93
	MassSol         1.72
	RadSol          48.15
	LumBol          471
	Teff            3930
	FeH             -0.14

	BinaryOrbit     
	{
		Separation      1000
	}
}

Star "GAM Dra B"
{
	ParentBody      "GAM Dra"
	Class           "M"
}

// Object * gam Dra b  ---  Extra-solar Planet Candidate  ---  OID=@12725715   (@@-1,255)  ---  coobox=1056 
// Object types: Star,Extra-solar Planet Candidate 
// 2018年的一篇文献《Aldebaran b's Temperate Past Uncovered in Planet Search Data》提到天棓四可能有一颗行星，但是只给了个周期，而且那部分说了跟没说一样，故此天体存疑。
Planet "GAM Dra Ab(?)"
{
	ParentBody      "GAM Dra A"
	DiscMethod      "RadVel"
	DiscDate        "2018"

	Orbit     
	{
		PeriodDays      702
	}
}

// Object * iot Her  ---  beta Cep Variable  ---  OID=@336561   (@@11521,0)  ---  coobox=1029 
// Object types: beta Cep Variable,Spectroscopic Binary,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),beta Cep Variable,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// http://stars.astro.illinois.edu/sow/iotaher.html
Remove "IOT Her A" {ParentBody "IOT Her"}
Remove "IOT Her B" {ParentBody "IOT Her"}
Barycenter "IOT Her AB"
{
	ParentBody      "IOT Her"
	BinaryOrbit     
	{
		PeriodDays      60
		Separation      30
	}
}

Star "IOT Her A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "IOT Her AB"
	Class           "B3IV"
	AbsMagn         -1.97
	MassSol         6.7
	RadSol          5.29
	LumBol          2489
	Teff            18070
	FeH             -0.40
	Age             0.0378

	BinaryOrbit     
	{
		PeriodDays      113.804
		Separation      1
	}
}

Star "IOT Her B"
{
	ParentBody      "IOT Her AB"
	Class           "B5.9?"
}

Star "IOT Her C"
{
	ParentBody      "IOT Her"
	Class           "B8.9?"
}