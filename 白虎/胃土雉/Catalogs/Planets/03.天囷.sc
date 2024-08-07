// Object * mu. Cet  ---  Spectroscopic Binary  ---  OID=@1438918   (@@29966,0)  ---  coobox=12003 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Spectroscopic Binary,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=12828
Remove "MU Cet A" {ParentBody "MU Cet"}
Remove "MU Cet B" {ParentBody "MU Cet"}
Star "MU Cet A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "GJ 9099"
	Class           "A9IIIp"
	AbsMagn         2.17
	MassSol         1.6
	RadSol          1.7
	LumBol          7.5
	Teff            7141
	Age             3.3

	BinaryOrbit // VB6_Tok2022f TOK_1Aa,Ab Gr.3
	{
		Period          35.9129
		Separation      12.0503604223311 // 0.453 asec
		Eccentricity    0.884
		Inclination     96.2
		AscendingNode   237.5
		Epoch           2458530.520934184081852
		ArgOfPericenter 254.1
		MeanAnomaly     0
	}
}

Star "MU Cet B" // 可能本身是三星系统? (质量: (0.86+0.85)+0.9 MSun)
{
	DateUpdated     "2024-06-26"
	ParentBody      "GJ 9099"
	Class           ""
	MassSol         1.06
}

// Object * ksi01 Cet  ---  Spectroscopic Binary  ---  OID=@1426275   (@@29695,2)  ---  coobox=11839 
// Object types: Spectroscopic Binary,White Dwarf,Double or Multiple Star,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Eclipsing Binary,Star,Infra-Red Source,UV-emission Source 
Remove "KSI1 Cet A" {ParentBody "KSI1 Cet"}
Remove "KSI1 Cet B" {ParentBody "KSI1 Cet"}
Star "KSI1 Cet A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "HIP 10324"
	Class           "G7IIIBa0.4Fe-1"
	AbsMagn         -0.99
	MassSol         3.80
	RadSol          18.2
	LumBol          209.9
	Teff            5184
	FeH             -0.01
	Age             0.100

	BinaryOrbit     
	{
		PeriodDays      1642.1
		Separation      0.896
		Eccentricity    0
		Epoch           2434985
	}
}

Star "KSI1 Cet B"
{
	DateUpdated     "2024-06-26"
	ParentBody      "HIP 10324"
	Class           "DA4"
	MassSol         0.8
	Radius          6501.40733523619 // log(g) = 8.4 cm/s^2
}

// Object * nu. Cet  ---  Star  ---  OID=@1417523   (@@29447,0)  ---  coobox=11931 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=12093
Barycenter "NU Cet A"
{
	ParentBody      "NU Cet"
	BinaryOrbit     
	{
		Period          12068
		Separation      998.714538342659 // 8.08 asec
	}
}

Star "NU Cet Aa"
{
	DateUpdated     "2024-06-26"
	ParentBody      "NU Cet A"
	Class           "G8III"
	AbsMagn         -0.415
	MassSol         2.65
	RadSol          15.87
	LumBol          161.4
	Teff            5164
	Age             0.537

	BinaryOrbit     
	{
		PeriodDays      714.48
		Eccentricity    0.274
		Epoch           2453364.9
		ArgOfPericenter 299.5
		MeanAnomaly     0
	}
}

Star "NU Cet Ab"
{
	DateUpdated     "2024-06-26"
	ParentBody      "NU Cet A"
	Class           ""
	MassSol         0.51
}

// Object * nu. Cet B  ---  Star  ---  OID=@1417524   (@@29447,1)  ---  coobox=11931 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "NU Cet B/Gaia DR3 18118955194078976/TIC 422947704/ADS 1971 B/BD+04 418B/CCDM J02359+0536B/CSI+04 418 2/GEN# +1.00016161B/HD 16161B/2MASS J02355298+0535369/WDS J02359+0536B/** STF 281B/Gaia DR2 18118955194078976"
{
	DateUpdated     "2024-06-26"
	ParentBody      "NU Cet"
	Class           ""
	MassKg          1.92079568942538e+30 // log(g) = 4.357 cm/s^2
	RadSol          1.079 // Gaia DR3
	LumBol          1.43051861327658 // 计算的值
	Teff            6077
	FeH             -0.575
}

// Object * gam Cet  ---  Double or Multiple Star  ---  OID=@1408792   (@@29176,9)  ---  coobox=11943 
// Object types: Double or Multiple Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=12706
Remove "GAM Cet (AB)"{ParentBody "GAM Cet"}
Remove "GAM Cet A"{ParentBody "GAM Cet (AB)"}
Remove "GAM Cet B"{ParentBody "GAM Cet (AB)"}
Remove "GAM Cet C"{ParentBody "GAM Cet"}
Barycenter "GAM Cet AB"
{
	ParentBody      "GAM Cet"
	BinaryOrbit     
	{
		Period          1.412E6
		Separation      20000
	}
}

// Object * gam Cet A  ---  High Proper Motion Star  ---  OID=@5547531   (@@-1,255)  ---  coobox=11943 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "GAM Cet A/GJ 9098 A/GJ 106.1 A/Gaia DR3 2502847975056102400/ADS 2080 A/BD+02 422A/CCDM J02433+0314A/CSI+02 422 1/WDS J02433+0314A/PMSC 02381+0248A/LSPM J0243+0314E/ASCC 1098565/LTT 10892/NLTT 8785/86 Cet A/HD 16970A/TYC 50-1721-1/Gaia DR2 2502847975056346752"
{
	DateUpdated     "2024-06-26"
	ParentBody      "GAM Cet AB"
	Parallax        43.5957
	AppMagn         3.54
	Class           "A3V"
	AbsMagn         1.53
	MassSol         1.88
	RadSol          1.9
	LumBol          21
	Teff            8551
	FeH             0.00
	Age             0.647

	BinaryOrbit     
	{
		Period          166.411
		Separation      58.7213946071019 // 2.56 asec
	}
}

// Object * gam Cet B  ---  High Proper Motion Star  ---  OID=@1408712   (@@29171,6)  ---  coobox=11943 
// Object types: Double or Multiple Star,High Proper Motion Star,Star 
Star "GAM Cet B/GJ 9098 B/GJ 106.1 B/TYC 50-1721-2/ASCC 1098564/LSPM J0243+0314W/ADS 2080 B/BD+02 422B/CCDM J02433+0314B/CSI+02 422 2/GCRV 1536/LTT 10893/NLTT 8786/WDS J02433+0314B/** STF 299B/PMSC 02381+0248B/86 Cet B/HD 16970B/WEB 2584"
{
	DateUpdated     "2024-06-26"
	ParentBody      "GAM Cet AB"
	Class           "F3V"
	MassSol         1.17
	Teff            6051
}

// Object BD+02 418  ---  High Proper Motion Star  ---  OID=@1408709   (@@29171,3)  ---  coobox=11941 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Star 
Star "BD+02 418/GJ 9097/GJ 106.1 C/Gaia DR3 2502865532882650496/StKM 2-229/MCC 399/TIC 318802674/2MASS J02423253+0322259/PLX 548/LSPM J0242+0322/ASCC 1098543/UCAC2 32812452/USNO-B1.0 0933-00043670/DO 474/GEN# +0.00200418/GSC 00050-00027/LTT 10888/NLTT 8754/TYC 50-27-1/UBV M 174/[R78b] 163/[RHG95] 487/PLX 548.00/UCAC4 467-003591/Gaia DR2 2502865532882650496"
{
	DateUpdated     "2024-06-26"
	ParentBody      "GAM Cet"
	Class           "K5V"
	MassKg          1.11263254007606e+30 // log(g) = 4.512 cm/s^2
	RadSol          0.687 // Gaia DR3
	LumBol          0.0995869741228871 // 计算的值
	Teff            3912
	FeH             -0.589
}

// Object * 75 Cet b  ---  Extra-solar Planet  ---  OID=@7880119   (@@-1,255)  ---  coobox=11231
// Object types: Extra-solar Planet,Star,Extra-solar Planet 
Planet	"75 Cet b"
{
	DateUpdated    "2024-06-26"
	ParentBody     "75 Cet"
	DiscMethod     "RadVel"
	DiscDate       "2012"
	MassJup        2.479

	Orbit
	{
		Epoch           2455056.9
		PeriodDays      696.62
		SemiMajorAxis   1.912
		Eccentricity    0.093
		ArgOfPericen   -157.6
	}
}

// Object * 75 Cet c  ---  Extra-solar Planet Candidate  ---  OID=@24207344   (@@-1,255)  ---  coobox=11231
// Object types: Star,Extra-solar Planet Candidate
Planet	"75 Cet c"
{
	ParentBody     "75 Cet"
	DiscMethod     "RadVel"
	DiscDate       "2023"
	MassJup        0.912

	Orbit
	{
		Epoch           2454284.9
		PeriodDays      2051.62
		SemiMajorAxis   3.929
		Eccentricity    0.023
		ArgOfPericen    123
	}
}

// Object * 66 Cet  ---  Spectroscopic Binary  ---  OID=@1358417   (@@28097,1)  ---  coobox=11131 
// Object types: Spectroscopic Binary,High Proper Motion Star,Mid-IR Source (3 to 30 µm),High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=10305
Barycenter "66 Cet A"
{
	ParentBody      "66 Cet"
	BinaryOrbit     
	{
		Period          8466
		Separation      626.64622074761 // 16.63 asec
	}
}

Star "66 Cet Aa"
{
	DateUpdated     "2024-06-26"
	ParentBody      "66 Cet A"
	Class           "F8V"
	AbsMagn         2.78 // 计算的值
	MassKg          3.33381519841426e+30 // log(g) = 3.925 cm/s^2
	RadSol          2.3375 // Gaia DR3
	LumBol          6.32461290607727 // 计算的值
	Teff            5987
	FeH             -0.222

	BinaryOrbit // VB6_SOAR2019 TOK_39Aa,Ab Gr.5
	{
		PeriodDays      94.7878
		Separation      0.53871100998386 // 0.014 asec
		Eccentricity    0.689
		Inclination     30.0
		AscendingNode   241.0
		Epoch           2447731.383
		ArgOfPericenter 254.3
		MeanAnomaly     0
	}
}

Star "66 Cet Ab"
{
	DateUpdated     "2024-06-26"
	ParentBody      "66 Cet A"
	Class           ""
	MassSol         1.14
}

// Object * 66 Cet B  ---  High Proper Motion Star  ---  OID=@1358730   (@@133797,4)  ---  coobox=11131 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "66 Cet B/GJ 9075 B/GJ 87.1 B/HIP 10303/Gaia DR3 2494066897240089984/TIC 332746279/2MASS J02124661-0223469/ADS 1703 B/BD-03 335/CCDM J02128-0223B/GC 2650/GCRV 1211/GEN# +1.00013612B/HD 13612B/HIC 10303/LTT 1138/NLTT 7321/PPM 184344/SAO 129751/SPOCS 117/UBV 2225/YZ 92 526/uvby98 100013612 B/WDS J02128-0224B/TYC 4690-1111-1/** STF 231B/PMSC 02077-0251B/WEB 2151/Gaia DR2 2494066897240089984"
{
	DateUpdated     "2024-06-26"
	ParentBody      "66 Cet"
	Parallax        26.1678
	AppMagn         7.74
	Class           "G1V"
	AbsMagn         4.83 // 计算的值
	MassKg          1.74015629806403e+30 // log(g) = 4.332 cm/s^2
	RadSol          1.057 // Gaia DR3
	LumBol          1.00198529605949 // 计算的值
	Teff            5617
	FeH             -0.028
}
