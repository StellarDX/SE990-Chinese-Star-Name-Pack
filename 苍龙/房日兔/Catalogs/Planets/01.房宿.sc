// Object * pi. Sco  ---  Spectroscopic Binary  ---  OID=@2400278   (@@50006,3)  ---  coobox=16588 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Eclipsing Binary,Double or Multiple Star,Variable Star,Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Remove "PI Sco (AB)" {ParentBody "PI Sco"}
Remove "PI Sco A" {ParentBody "PI Sco (AB)"}
Remove "PI Sco B" {ParentBody "PI Sco (AB)"}
Remove "PI Sco C" {ParentBody "PI Sco"}
Barycenter "PI Sco A"
{
	ParentBody      "PI Sco"
	BinaryOrbit     
	{
		Separation      7000
	}
}

Star "PI Sco Aa"
{
	DateUpdated     "2024-05-27"
	ParentBody      "PI Sco A"
	Class           "B1V"
	AbsMagn         -3.35
	MassSol         12.5
	RadSol          5
	LumBol          21900
	Teff            25230
	RotationPeriod  100
	Age             0.0154 // 0.012 - 0.014

	BinaryOrbit     
	{
		PeriodDays      1.570103
		Separation      0.07
		Eccentricity    0.0
		Inclination     42
		AscendingNode   0.0
		Epoch           2425027.887
		ArgOfPericenter 25.0
		MeanAnomaly     0
	}
}

Star "PI Sco Ab"
{
	DateUpdated     "2024-05-27"
	ParentBody      "PI Sco A"
	Class           "B2:V:"
	MassSol         9
	RadSol          4
	LumBol          3000
	Teff            21000
}

// Object UCAC2 21111372  ---  Double or Multiple Star  ---  OID=@2400243   (@@49998,10)  ---  coobox=16588 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Star 
Star "UCAC2 21111372/GALAH 150427004802134/Gaia DR3 6235405865047769472/WISEA J155854.02-260721.4/TIC 66744670/ADS 9862 B/CCDM J15589-2607B/CSI-25 11228 22/ROT 3566/2MASS J15585402-2607214/WDS J15589-2607Ba,Bb/** BU 622B/HD 143018B/WDS J15589-2607B/** KOH 61/UCAC3 128-174971/UCAC4 320-083465/WISE J155854.02-260721.4/IDS 15528-2550 B/Gaia DR2 6235405865047769472"
{
	DateUpdated     "2024-05-27"
	ParentBody      "PI Sco" // 这里似乎还有一颗伴星Bb
	Parallax        1.6102
	AppMagn         12.2
	Class           "F4V"
	AbsMagn         3.23 // 计算的值
	MassKg          3.380345164052e+30 // log(g) = 3.864 cm/s^2
	RadSol          2.525 // Gaia DR3
	LumBol          12.9222094228033 // 计算的值
	Teff            6887
	FeH             -0.411
}

// Object * rho Sco  ---  Spectroscopic Binary  ---  OID=@2377579   (@@50012,1)  ---  coobox=16584 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Barycenter "RHO Sco A"
{
	ParentBody      "RHO Sco"
	BinaryOrbit     
	{
		PeriodDays      114000
		Separation      4900
	}
}

Star "RHO Sco Aa"
{
	DateUpdated     "2024-05-27"
	ParentBody      "RHO Sco A"
	Class           "B2IV-V"
	AbsMagn         -1.93
	MassSol         7.94
	RadSol          5.0
	LumBol          3432
	Teff            21150
	RotationPeriod  33.6
	Age             0.033

	BinaryOrbit     
	{
		PeriodDays      4.0033
		Eccentricity    0.27
		Epoch           2442178.6060
		ArgOfPericenter 51
		MeanAnomaly     0
	}
}

Star "RHO Sco Ab"
{
	ParentBody      "RHO Sco A"
	Class           "B5.5?"
}

Star "RHO Sco B"
{
	ParentBody      "RHO Sco"
	Class           "B9.4?"
}

// Object * del Sco  ---  Spectroscopic Binary  ---  OID=@2482381   (@@134899,0)  ---  coobox=16601 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Spectroscopic Binary,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "DEL Sco (AB)" {ParentBody "Dschubba"}
Remove "Dschubba A" {ParentBody "DEL Sco (AB)"}
Remove "Dschubba B" {ParentBody "DEL Sco (AB)"}
Remove "DEL Sco C" {ParentBody "Dschubba"}
/*Barycenter "DEL Sco A"
{
	ParentBody      "DEL Sco"
	BinaryOrbit     
	{
		Period          10.8092
		Separation      13.5
		Eccentricity    0.936
		Inclination     36
		AscendingNode   174.0
		Epoch           2455745.29
		ArgOfPericenter 177.7
		MeanAnomaly     0
	}
}*/

Star "DEL Sco A"
{
	DateUpdated     "2024-05-27"
	ParentBody      "DEL Sco"
	Class           "B0.3IV"
	AbsMagn         -3.8
	MassSol         13
	RadSol          6.7
	LumBol          38000
	Teff            27400

	/*BinaryOrbit // 存疑，需要引用
	{
		PeriodDays      20
		Separation      0.39
	}*/
	BinaryOrbit     
	{
		Period          10.8092
		Separation      13.5
		Eccentricity    0.936
		Inclination     36
		AscendingNode   174.0
		Epoch           2455745.29
		ArgOfPericenter 177.7
		MeanAnomaly     0
	}
}

/*Star "DEL Sco Ab(Retracted)"
{
	DateUpdated     "2024-05-27"
	ParentBody      "DEL Sco A"
	Class           ""
	MassKg          1.3490092763609e+31 // 开普勒第三定律得到系统总质量 3.9340202763609e+31 Kg
}*/

Star "DEL Sco B"
{
	DateUpdated     "2024-05-27"
	ParentBody      "DEL Sco"
	Class           "B1-3V"
	MassSol         8.2
	Teff            20000 // 24000
	Age             0.009 // 0.01
}

// Object * bet Sco  ---  Double or Multiple Star  ---  OID=@2529096   (@@50338,3)  ---  coobox=16778 
// Object types: Double or Multiple Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=78820
Remove "BET1 Sco"{ParentBody "BET Sco"}
Remove "BET Sco A"{ParentBody "BET1 Sco"}
Remove "BET Sco Aa"{ParentBody "BET Sco A"}
Remove "BET Sco Ab"{ParentBody "BET Sco A"}
Remove "BET Sco B"{ParentBody "BET1 Sco"}
Remove "BET2 Sco"{ParentBody "BET Sco"}
Remove "BET Sco C"{ParentBody "BET2 Sco"}
Remove "BET Sco E"{ParentBody "BET2 Sco"}
Remove "BET Sco Ea"{ParentBody "BET Sco E"}
Remove "BET Sco Eb"{ParentBody "BET Sco E"}

// ----------------------------------------------------------------------------------------------------
// Object * bet01 Sco  ---  beta Cep Variable  ---  OID=@2529161   (@@50342,0)  ---  coobox=16778 
// Object types: Spectroscopic Binary,beta Cep Variable,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,UV-emission Source,X-ray Source 
Barycenter "BET1 Sco/HIP 78820/Gaia DR3 6247207266946218112/GEN# +1.00144217/TIC 9921163/2E 1602.5-1940/PLX 3640/SBC9 881/2E 3578/ADS 9913 AB/BD-19 4307/CCDM J16054-1948AB/CEL 4412/CPD-19 5945/CSI-19 4307 1/CSV 101548/FK5 597/GC 21609/GCRV 9245/HD 144217/HGAM 648/HIC 78820/HR 5984/JP11 2705/MCW 557/N30 3609/NSV 7424/PMC 90-93 426/PPM 231174/ROT 2274/SACS 352/SAO 159682/SBC7 561/SKY# 29046/SV* ZI 1189/UBV 13614/UBV M 21133/UBV M 21134/[B10] 4086/[HFE83] 1165/ALS 14816/PLX 3640.00/1RXS J160525.4-194828/EUVE J1605-19.8/2MASS J16052624-1948185/WDS J16054-1948AB/TYC 6208-1623-1/CSI-19 4307 3/PMSC 15596-1932AB/** BU 947/CSI-19 4307 4/8 Sco A/BET Sco A/uvby98 100144217/WEB 13322/Gaia DR2 6247207266936828288/WISEA J160526.25-194818.3"
{
	ParentBody      "ADS 9913 ABC"
	BinaryOrbit     
	{
		Period          11502
		Separation      1690.2106829953 // 13.64 asec
	}
}

// Object * bet02 Sco  ---  Spectroscopic Binary  ---  OID=@2529099   (@@50338,6)  ---  coobox=16778 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "BET2 Sco/HIP 78821/Gaia DR3 6247207266944651648/TIC 9921160/ADS 9913 C/BD-19 4308/CCDM J16054-1948C/GC 21610/GCRV 9246/GEN# +1.00144218/HD 144218/HGAM 649/HIC 78821/HR 5985/PPM 231175/ROT 2275/SAO 159683/SKY# 29047/UBV 13615/UBV M 21135/[B10] 4087/2MASS J16052655-1948066/ALS 15975/TYC 6208-1622-1/GSC 06208-01622/WDS J16054-1948CE/8 Sco C/** MCA 42CE/** H 37C/WEB 13323/Gaia DR2 6247207266944651648"
{
	ParentBody      "ADS 9913 ABC"
}

// ----------------------------------------------------------------------------------------------------

Barycenter "BET1 Sco A"
{
	ParentBody      "BET1 Sco"
	BinaryOrbit // Tok 2023, fixed P
	{
		Period          220.0000
		Separation      105.452410733823 // 0.851 asec
		Eccentricity    0.685
		Inclination     75.7
		AscendingNode   80.2
		Epoch           2471450.233231664635241
		ArgOfPericenter 242.2
		MeanAnomaly     0
	}
}

Star "BET1 Sco B"
{
	DateUpdated     "2024-05-27"
	ParentBody      "BET1 Sco"
	Class           ""
	MassSol         8
}

// ----------------------------------------------------------------------------------------------------

Star "BET2 Sco C"
{
	DateUpdated     "2024-05-27"
	ParentBody      "BET2 Sco"
	Class           "B2V"
	AbsMagn         -1.83
	MassSol         8.2
	RadSol          2.9
	LumBol          3200
	Teff            24000 
}

Barycenter "BET2 Sco E"
{
	ParentBody      "BET2 Sco"
	BinaryOrbit // Tok 2023, Circ.210
	{
		Period          18.9534
		Separation      12.7482292603948 // 0.105 asec
		Eccentricity    0.610
		Inclination     45.4
		AscendingNode   108.0
		Epoch           2453737.082317382097244
		ArgOfPericenter 80.8
		MeanAnomaly     0
	}
}

// ----------------------------------------------------------------------------------------------------

Star "BET1 Sco Aa"
{
	DateUpdated     "2024-05-27"
	ParentBody      "BET1 Sco A"
	Parallax        8.07
	AppMagn         2.62
	Class           "B0.5IV-V"
	AbsMagn         -3.92
	MassSol         15.0
	RadSol          6.3
	LumBol          31600
	Teff            28000

	BinaryOrbit // VB6_Hol1997 bet_Sco Gr.9
	{
		Period          0.0187
		Eccentricity    0.291
		Inclination     111.8
		AscendingNode   294.2
		Epoch           2449788.448906361125410
		ArgOfPericenter 54.8
		MeanAnomaly     0
	}
}

Star "BET1 Sco Ab"
{
	DateUpdated     "2024-05-27"
	ParentBody      "BET1 Sco A"
	Class           "B1.5V"
	AbsMagn         -2.60
	MassSol         10.4
	RadSol          4.0
	LumBol          7900
	Teff            26400
}

// ----------------------------------------------------------------------------------------------------

Star "BET2 Sco Ea"
{
	DateUpdated     "2024-05-27"
	ParentBody      "BET2 Sco E"
	Parallax        8.2368
	AppMagn         4.89
	Class           "B2V"
	AbsMagn         0.24
	MassSol         3.5
	RadSol          2.4
	LumBol          126
	Teff            13000
	Age             0.0063

	BinaryOrbit // 2014A&A...563A.138V Veramendi
	{
		PeriodDays      11.0767
		Eccentricity    0.078
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2455449.170
		ArgOfPericenter 91.7
		MeanAnomaly     0
	}
}

Star "BET2 Sco Eb"
{
	DateUpdated     "2024-05-27"
	ParentBody      "BET2 Sco E"
	Class           ""
	MassSol         1.32
}

// ----------------------------------------------------------------------------------------------------