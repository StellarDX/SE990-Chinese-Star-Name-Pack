// Object * nu. Per  ---  Star  ---  OID=@113482   (@@422,5)  ---  coobox=2787 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "NU Per A" {ParentBody "NU Per"}
Remove "NU Per B" {ParentBody "NU Per"} // 所有伴星均为光学伴星

// Object * eps Per  ---  beta Cep Variable  ---  OID=@688057   (@@23046,0)  ---  coobox=4164 
// Object types: beta Cep Variable,Spectroscopic Binary,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),beta Cep Variable,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=18532
Remove "EPS Per A"{ParentBody "EPS Per"}
Remove "EPS Per Aa"{ParentBody "EPS Per A"}
Remove "EPS Per Ab"{ParentBody "EPS Per A"}
Remove "EPS Per B"{ParentBody "EPS Per"}
Barycenter "EPS Per A"
{
	ParentBody      "HIP 18532"
	BinaryOrbit     
	{
		Period          17216
		Separation      1771.03711388117 // 9.05 asec
	}
}

Barycenter "EPS Per Aab"
{
	ParentBody      "EPS Per A"
	BinaryOrbit // 2006A&A...446..583L Libich+
	{
		PeriodDays      9577
		Eccentricity    0.474
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2435632
		ArgOfPericenter 170.4
		MeanAnomaly     0
	}
}

Star "EPS Per Aa"
{
	DateUpdated     "2024-06-30"
	ParentBody      "EPS Per Aab"
	Class           "B0.5III"
	AbsMagn         -3.57 // 计算的值
	MassSol         13.5
	RadSol          7.66
	LumBol          28330
	Teff            26500
	Age             0.0154

	BinaryOrbit // 2006A&A...446..583L
	{
		PeriodDays      14.0692
		Eccentricity    0.555
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2447767.500
		ArgOfPericenter 105.8
		MeanAnomaly     0
	}
}

Star "EPS Per Ab"
{
	DateUpdated     "2024-06-30"
	ParentBody      "EPS Per Aab"
	Class           ""
	MassSol         0.94
}

Star "EPS Per Ac"
{
	DateUpdated     "2024-06-30"
	ParentBody      "EPS Per A"
	Class           ""
	MassSol         2.29
}

// Object * eps Per B  ---  Star  ---  OID=@688019   (@@56,18)  ---  coobox=4164 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "EPS Per B/Gaia DR3 229898024422024192/TIC 187107880/ADS 2888 B/BD+39 895B/CCDM J03579+4001B/CSI+39 895 2/GCRV 1560 E/GEN# +1.00024760B/HD 24760B/HGAM 308/IDS 03511+3943 B/ROT 3544/WDS J03579+4001B/** STF 471B/PMSC 03511+3943B/TYC 2868-1624-1/UCAC4 651-017866/2MASS J03575136+4000455/WEB 3573"
{
	DateUpdated     "2024-06-30"
	ParentBody      "HIP 18532"
	Class           "A2V"
	MassSol         1.90342968539503 // log(g) = 3.948 cm/s^2
	RadSol          2.425542 // Gaia DR3
	LumBol          50.8746078307276 // 计算的值
	Teff            9898
	FeH             -1.095
}

// Object * ksi Per  ---  Double or Multiple Star  ---  OID=@688290   (@@22660,0)  ---  coobox=4174 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Emission-line Star,Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Menchib A"{ParentBody "Menchib"}
Remove "Menchib B"{ParentBody "Menchib"}
Star "KSI per A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "KSI Per"
	Class           "O7.5III(n)((f))"
	AbsMagn         -5.50
	MassSol         36 // 26
	RadSol          14
	LumBol          263000
	Teff            35000
	Age             0.007

	BinaryOrbit     
	{
		PeriodDays      6.95
	}
}

Star "KSI per B" // 需要引用
{
	ParentBody      "KSI Per"
	Class           "B1.5?"
}

// Object * zet Per  ---  Blue Supergiant  ---  OID=@673752   (@@21875,0)  ---  coobox=4201 
// Object types: Blue Supergiant,Mid-IR Source (3 to 30 µm),Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "ZET Per A"{ParentBody "ZET Per"}
Remove "ZET Per B"{ParentBody "ZET Per"}
Star "ZET Per A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "HIP 18246"
	Class           "B1Ib"
	AbsMagn         -4.55
	MassSol         14.5
	RadSol          26 // 27
	LumBol          47039
	Teff            20800
	Age             0.0126

	BinaryOrbit     
	{
		Separation      4000
	}
}

// Object ALS 18058  ---  Star  ---  OID=@673649   (@@21865,16)  ---  coobox=4201 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,X-ray Source 
Star "ALS 18058/Gaia DR3 168726523211215360/TIC 94367281/[GBA2007] 76/XEST 27-076/ADS 2843 B/BD+31 666B/CCDM J03541+3153B/CSI+31 666 2/GCRV 1532 E/GEN# +1.00024398B/HGAM 302/IDS 03478+3135 B/UBV M 9780/2MASS J03540745+3152498/WDS J03541+3153B/** STF 464B/WEB 3523/Gaia DR2 168726523211215360"
{
	DateUpdated     "2024-06-30"
	ParentBody      "HIP 18246"
	Parallax        3.6291
	AppMagn         9.16
	Class           "B9V"
	AbsMagn         1.96 // 计算的值
}

// Object * omi Per  ---  Spectroscopic Binary  ---  OID=@658091   (@@22262,14)  ---  coobox=4151 
// Object types: Ellipsoidal Variable,Mid-IR Source (3 to 30 µm),Variable Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Star,Asymptotic Giant Branch Star Candidate,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=2726
Remove "Atik A"{ParentBody "Atik"}
Remove "Atik B"{ParentBody "Atik"}
Barycenter "OMI Per A"
{
	ParentBody      "OMI Per"
	BinaryOrbit     
	{
		Period          1202
		Separation      400.345048226977 // 1.21 asec
	}
}

Star "OMI Per Aa"
{
	DateUpdated     "2024-06-30"
	ParentBody      "OMI Per A"
	Class           "B1III"
	AbsMagn         -4.4
	MassSol         14
	RadSol          9.6
	LumBol          22046.495960331908 // 计算的值
	Teff            22700

	BinaryOrbit     
	{
		PeriodDays      4.4191447
		SemiMajorAxisKm 22958100 // 33 RSun
		Eccentricity    0.0
		Inclination     39
		AscendingNode   0.0
		Epoch           2445338.266
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "OMI Per Ab"
{
	DateUpdated     "2024-06-30"
	ParentBody      "OMI Per A"
	Class           "B2V"
	MassSol         10
	RadSol          8.9
	LumBol          13878.766543309 // 计算的值
	Teff            21000
	Age             0.015
}

// Object * omi Per B  ---  Star  ---  OID=@658092   (@@22262,15)  ---  coobox=4151 
// Object types: Double or Multiple Star,Star 
Star "OMI Per B/Gaia DR3 216718178537987968/ADS 2726 B/BD+31 642B/CCDM J03443+3217B/CSI+31 642 3/IDS 03380+3158 B/ROT 3542/WDS J03443+3217B/** BU 535B/PMSC 03380+3158B/TYC 2359-1258-2/Gaia DR2 216718178536051456"
{
	DateUpdated     "2024-06-30"
	ParentBody      "OMI Per"
	Class           ""
	MassSol         4.43
}

// Object * o Per  ---  Star  ---  OID=@658073   (@@22260,4)  ---  coobox=4149 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Double or Multiple Star Candidate,Infra-Red Source,UV-emission Source 
Star "40 Per A"
{
	DateUpdated     "2024-06-30"
	ParentBody      "40 Per"
	Class           "B0.5V"
	AbsMagn         -2.26
	MassSol         12.5
	Radius          824306.952074415 // 计算的值
	LumBol          936
	Teff            29330
	FeH             -0.43
	Age             0.0072

	BinaryOrbit     
	{
		Separation      7379.59607251786 // 19.95 asec
	}
}

// Object TYC 2363-2186-1  ---  Star  ---  OID=@658074   (@@22260,5)  ---  coobox=4149 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "TYC 2363-2186-1/Gaia DR3 218170461600295680/WISEA J034221.29+335743.6/TIC 101219431/ADS 2699 B/CCDM J03424+3358B/CSI+33 698 2/GEN# +1.00022951B/HD 22951B/IDS 03360+3338 B/UBV 3506/WDS J03424+3358B/** STF 431B/UCAC3 248-25844/UCAC4 620-011808/2MASS J03422128+3357437/WISE J034221.27+335743.5/Gaia DR2 218170461600295680"
{
	DateUpdated     "2024-06-30"
	ParentBody      "40 Per"
	Class           "A1Vn"
}