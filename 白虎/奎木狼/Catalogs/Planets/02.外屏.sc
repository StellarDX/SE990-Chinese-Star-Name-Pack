// Object * eps Psc b  ---  Extra-solar Planet Candidate  ---  OID=@18700907   (@@-1,255)  ---  coobox=11419
// Object types: Star,Extra-solar Planet Candidate
Planet "EPS Psc b"
{
	ParentBody     "EPS Psc"
	DiscMethod     "RadVel"
	DiscDate       "2021"
	Class          "GasGiant"
	MassJup        0.77

	Orbit
	{
		PeriodDays      255.3
		SemiMajorAxis   0.88
		Eccentricity    0.278
	}
}

// Object * zet Psc A  ---  High Proper Motion Star  ---  OID=@1415584   (@@29382,19)  ---  coobox=11443 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=5737
Remove "ZET Psc A"{ParentBody "ZET Psc"}
Remove "ZET Psc BC"{ParentBody "ZET Psc"}
Remove "ZET Psc Aa"{ParentBody "ZET Psc A"}
Remove "ZET Psc Ab"{ParentBody "ZET Psc A"}
Remove "ZET Psc B"{ParentBody "ZET Psc BC"}
Remove "ZET Psc C"{ParentBody "ZET Psc BC"}
Remove "ZET Psc Ba"{ParentBody "ZET Psc B"}
Remove "ZET Psc Bb"{ParentBody "ZET Psc B"}
Barycenter "ZET Psc A/HIP 5737/Gaia DR3 2577061092921353984/TIC 376904850/PLX 251/LSPM J0113+0734/ASCC 1002603/2MASS J01134390+0734311/USNO-B1.0 0975-00014982/* 86 Psc A/ADS 996 A/AG+07 134/BD+06 174/CCDM J01137+0735A/CSI+06 174 1/FK5 1033/GC 1476/GCRV 708/GEN# +1.00007344A/GSC 00613-01249/HD 7344/HIC 5737/HR 361/IDS 01085+0703 A/N30 252/PMC 90-93 674/PPM 144380/ROT 188/SAO 109739/SKY# 1864/SRS 31033/TYC 613-1249-1/UBV 1300/YZ 7 432/uvby98 100007344 A/WDS J01137+0735A/UBV 21311/[ZEH2003] RX J0113.7+0734 1/AKARI-IRC-V1 J0113439+073430/WISE J011343.99+073430.9/PMSC 01085+0703Aab/PMSC 01085+0703A/Revati/WEB 1305/Gaia DR2 2577061092921353984"
{
	ParentBody      "RX J0113.7+0734"
	BinaryOrbit     
	{
		Period          12997
		Separation      934.197337987998 // 22.85 asec
	}
}

Star "ZET Psc Aa"
{
	DateUpdated     "2024-06-20"
	ParentBody      "HIP 5737"
	Class           "A7IV"
	AbsMagn         1.97
	MassSol         2.07
	Radius          2248882.91655993 // 计算的值
	LumBol          27.4
	Teff            7345

	BinaryOrbit     
	{
		Period          8.836
		Separation      6.13279365177134 // 0.150 asec
	}
}

Star "ZET Psc Ab"
{
	DateUpdated     "2024-06-20"
	ParentBody      "HIP 5737"
	Class           "A7IV"
	MassSol         1.37
}

Barycenter "** BU 1029BC"
{
	ParentBody      "RX J0113.7+0734"
}

// Object * zet Psc B  ---  Spectroscopic Binary  ---  OID=@1415586   (@@29385,1)  ---  coobox=11443 
// Object types: Spectroscopic Binary,High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Mid-IR Source (3 to 30 µm),Variable Star,Star,UV-emission Source 
Barycenter "ZET Psc B/HIP 5743/Gaia DR3 2577061260424130304/WISEA J011345.45+073441.1/TIC 376904847/2MASS J01134528+0734417/SBC9 65/* 86 Psc B/AG+07 135/AGKR 1050/BD+06 175/CSV 100094/GC 1477/GCRV 709/GSC 00613-01248/HD 7345/HIC 5743/HR 362/NSV 442/PPM 144381/ROT 189/SAO 109740/SBC7 45/SKY# 1868/SV* ZI 59/UBV 1301/UBV M 8036/YZ 7 433/2EUVE J0113+07.5/EUVE J0113+07.5/[ZEH2003] RX J0113.7+0734 2/** STF 100B/AKARI-IRC-V1 J0113453+073441/WISE J011345.38+073441.3/TYC 613-1248-1/Gaia DR1 2577061260424130304/WEB 1306/Gaia DR2 2577061260424130304/GEN# +1.00007345/** BU 1029B/CCDM J01137+0735B/WDS J01137+0735B/ADS 996 B/PMSC 01085+0703B"
{
	ParentBody      "** BU 1029BC"
	BinaryOrbit     
	{
		PeriodDays      
		Separation      78.980619410024 // 1.95 asec
	}
}

Star "ZET Psc Ba"
{
	DateUpdated     "2024-06-20"
	ParentBody      "HIP 5743"
	Parallax        24.6896
	AppMagn         6.1
	Class           "F7V"
	AbsMagn         3.06 // 计算的值
	MassSol         1.31
	FeH             0.18

	BinaryOrbit     
	{
		PeriodDays      9.0753
		Eccentricity    0.040
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2444947.090
		ArgOfPericenter 307.0
		MeanAnomaly     0
	}
}

Star "ZET Psc Bb"
{
	DateUpdated     "2024-06-20"
	ParentBody      "HIP 5743"
	Class           "G7V"
	MassSol         0.98
}

// Object ** BU 1029C  ---  High Proper Motion Star  ---  OID=@15318678   (@@-1,255)  ---  coobox=11443 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "** BU 1029C/Gaia DR3 2577061264719259264/Gaia DR2 2577061264719259264/CCDM J01137+0735C/ADS 996 C/WDS J01137+0735C"
{
	DateUpdated     "2024-06-20"
	ParentBody      "** BU 1029BC"
	Class           ""
	MassSol         0.78
}

// Object * nu. Psc  ---  Star  ---  OID=@1416512   (@@29409,0)  ---  coobox=11800 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "NU Psc A"
{
	DateUpdated     "2024-06-20"
	ParentBody      "NU Psc"
	Class           "K3III"
	AbsMagn         -0.78
	MassSol         1.66
	RadSol          34
	LumBol          380
	Teff            4154
	FeH             -0.16
	Age             3.41

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.830409921
		Eccentricity    0.271981468
		Inclination     1.95803982
		AscendingNode   0
		ArgOfPericenter -156.126379
		MeanAnomaly     137.527955
	}
}

Star "NU Psc B"
{
	ParentBody      "NU Psc"
	Class           "WD"
}

// Object * ksi Psc  ---  Spectroscopic Binary  ---  OID=@1407604   (@@29128,16)  ---  coobox=11812 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,X-ray Source 
Star "KSI Psc A"
{
	DateUpdated     "2024-06-20"
	ParentBody      "KSI Psc"
	Class           "K0III"
	AbsMagn         0.78
	MassSol         2.00
	RadSol          9
	LumBol          45.7
	Teff            4947
	FeH             -0.11
	Age             1.22

	BinaryOrbit     
	{
		PeriodDays      1672.4
		Eccentricity    0.18
		Epoch           2437651
		ArgOfPericenter 251
		MeanAnomaly     0
	}
}

Star "KSI Psc B"
{
	ParentBody      "KSI Psc"
	Class           "A7.8?"
}

// Object * alf Psc A  ---  Star  ---  OID=@6373490   (@@-1,255)  ---  coobox=11814 
// Object types: Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=12446
Remove "Alrischa A" {ParentBody "Alrischa"}
Remove "Alrischa B" {ParentBody "Alrischa"}
Star "ALF Psc A/Gaia DR3 2517584007848935808/TYC 40-1338-1/PLX 420/113 Psc A/ADS 1615 A/AG+02 204/BD+02 317A/CCDM J02020+0246A/CSI+02 317 1/GC 2452/GCRV 1119/HD 12447/HR 596/N30 421/PPM 145227/ROT 285/SAO 110291/SKY# 2983/YPAC 285/WDS J02020+0246A/Renson 3180/PMSC 01569+0217A/WEB 1988/Gaia DR2 2517584007848935808"
{
	DateUpdated     "2024-06-20"
	ParentBody      "ALF Psc"
	Parallax        19.7995
	AppMagn         4.11
	Class           "kA0hA7Sr"
	AbsMagn         0.50
	MassSol         2.55
	RadSol          2.45
	LumBol          55
	Teff            10233
}

// Object * alf Psc B  ---  Star  ---  OID=@1407662   (@@29140,3)  ---  coobox=11814 
// Object types: Double or Multiple Star,Variable Star,Star 
Barycenter "ALF Psc B/113 Psc B/ADS 1615 B/BD+02 317B/CCDM J02020+0246B/CSI+02 317 2/CSV 100159/GCRV 1120/HD 12446/HR 595/WDS J02020+0246B/TYC 40-1338-2/Renson 3170/PMSC 01569+0217B/PMSC 01569+0217Bab/WEB 1992/Gaia DR2 2517584003554093696"
{
	ParentBody      "ALF Psc"
	BinaryOrbit // VB6_Izm2019  STF_202AB Gr.4?
	{
		Period          1946.9984
		Separation      382.686995261038 // 8.289 asec
		Eccentricity    0.785
		Inclination     105.2
		AscendingNode   18.7
		Epoch           2517261.831740367691964
		ArgOfPericenter 227.1
		MeanAnomaly     0
	}
}

Star "ALF Psc Ba"
{
	DateUpdated     "2024-06-20"
	ParentBody      "ALF Psc B"
	Class           "kA2hF2mF2(IV)"
	AbsMagn         1.81 // 计算的值
	MassSol         2.64
	RadSol          2.66
	LumBol          63
	Teff            10000
	Age             0.331

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.403539519
		Eccentricity    0
		Inclination     1.38665783
		AscendingNode   0
		ArgOfPericenter -166.147455
		MeanAnomaly     -76.169124
	}
}

Star "ALF Psc Bb"
{
	ParentBody      "ALF Psc B"
	Class           "A7.9?"
}