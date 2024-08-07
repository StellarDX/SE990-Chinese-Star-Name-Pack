// 键闭七星系统 (重制版)
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=79374

/*
	Nu Scorpii AB and Nu Scorpii CD, orbiting each other with a period of 105,000 years. AB contains four stars:
	Nu Scorpii Aa, Ab and Ac: Aa and Ab are a binary system (period: 5.5 days) orbited by Ac (period: 8.3 years).
	Nu Scorpii B: This star orbits Nu Scorpii A - the three stars above - with a period of 675 years.

	Nu Scorpii CD contains three stars:
	Nu Scorpii C: C is a single star.
	Nu Scorpii Da and Db: Da and Db are a binary system (period: unknown), which together orbit C over 3,100 years.
*/

Remove "NU Sco (AB)"{ParentBody "NU Sco"}
Remove "NU Sco B"{ParentBody "NU Sco (AB)"}
Remove "NU Sco (Aabc)"{ParentBody "NU Sco (AB)"}
Remove "NU Sco Ac"{ParentBody "NU Sco (Aabc)"}
Remove "NU Sco A"{ParentBody "NU Sco (Aabc)"}
Remove "NU Sco Aa"{ParentBody "NU Sco A"}
Remove "NU Sco Ab"{ParentBody "NU Sco A"}
Remove "NU Sco (CD)"{ParentBody "NU Sco"}
Remove "NU Sco C"{ParentBody "NU Sco (CD)"}
Remove "NU Sco D"{ParentBody "NU Sco (CD)"}
Remove "NU Sco Da"{ParentBody "NU Sco D"}
Remove "NU Sco Db"{ParentBody "NU Sco D"}

// ----------------------------------------------------------------------------------------------------

// Object * nu. Sco  ---  Double or Multiple Star  ---  OID=@2529348   (@@50657,0)  ---  coobox=16800 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Barycenter "NU1 Sco"
{
	ParentBody      "HIP 79374"
	BinaryOrbit     
	{
		Period          101906
		Separation      5973.83720209006 // 41.100 asec
	}
}

// Object * nu.02 Sco  ---  Double or Multiple Star  ---  OID=@2529345   (@@50655,8)  ---  coobox=16800 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Barycenter "NU2 Sco/TIC 49202243/ADS 9951 CD/BD-19 4332/CCDM J16120-1928CD/CSI-19 4332 1/GC 21771/GCRV 66039/HD 145501/HR 6026/PPM 231334/ROT 2291/SAO 159763/SKY# 29241/UBV 13763/UBV M 21233/VDB 100b/2MASS J16115858-1927003/ALS 16443/IDS 16062-1912 CD/WDS J16120-1928CD/** MTL 2/** H 56CD/Renson 41240/uvby98 100145501/WEB 13418/UCAC4 353-079070/GEN# +1.00145501/WISEA J161158.58-192700.6"
{
	ParentBody      "HIP 79374"
}

// ----------------------------------------------------------------------------------------------------

// Object * nu. Sco A  ---  Spectroscopic Binary  ---  OID=@2529349   (@@50657,1)  ---  coobox=16800 
// Object types: Double or Multiple Star,Spectroscopic Binary,Double or Multiple Star,Star 
Barycenter "NU1 Sco A/Gaia DR3 6245697981070158080/ADS 9951 A/BD-19 4333A/CSI-19 4333 2/HGAM 651/HD 145502A/CCDM J16120-1928A/WDS J16120-1928Aa,Ab/PMSC 16062-1912AP/TYC 6209-1537-1/** BU 120A/** CHR 146/WDS J16120-1928A/SBC9 889/SBC7 566/Gaia DR2 6245697981070158080"
{
	ParentBody      "NU1 Sco"
	BinaryOrbit // Tok 2020, Gr. 4
	{
		Period          500.0000
		Separation      159.562284754077 // 1.126 asec
		Eccentricity    0.500
		Inclination     91.2
		AscendingNode   0.9
		Epoch           2331745.092197931837291
		ArgOfPericenter 125.0
		MeanAnomaly     0
	}
}

// Object * nu. Sco B  ---  Star  ---  OID=@2529350   (@@50657,2)  ---  coobox=16800 
// Object types: Double or Multiple Star,Star 
Star "NU1 Sco B/Gaia DR3 6245697981073442176/ADS 9951 B/BD-19 4333B/CSI-19 4333 3/IDS 16062-1912 B/HD 145502B/CCDM J16120-1928B/WDS J16120-1928B/PMSC 16062-1912B/** BU 120B/TYC 6209-1537-2/Gaia DR2 6245697981073442176"
{
	DateUpdated     "2024-05-28"
	ParentBody      "NU1 Sco"
	Parallax        7.4647
	AppMagn         6.6
	Class           ""
	AbsMagn         0.97 // 计算的值
	MassSol         3.79
}

// ----------------------------------------------------------------------------------------------------

// Object * nu.02 Sco A  ---  Star  ---  OID=@2529346   (@@50655,9)  ---  coobox=16800 
// Object types: Double or Multiple Star,Star 
Star "NU2 Sco C/Gaia DR3 6245698187231874816/ADS 9951 C/CSI-19 4332 2/GCRV 5511 E/HGAM 2052/WDS J16120-1928C/CCDM J16120-1928C/PMSC 16062-1912C/TYC 6209-1536-1/** MTL 2C/HD 145501A/BD-19 4332A/Gaia DR1 6245698182933533952/Gaia DR2 6245698187231874816/NU Sco C"
{
	DateUpdated     "2024-05-28"
	ParentBody      "NU2 Sco"
	Parallax        7.2608
	AppMagn         6.6
	Class           "B9III"
	AbsMagn         0.905 // 计算的值
	MassKg          7.28625055953286e+30 // log(g) = 4.248 cm/s^2
	RadSol          2.3825 // Gaia DR3
	LumBol          157.719432496055 // 计算的值
	Teff            13252
	FeH             0.397
}

// Object * nu.02 Sco B  ---  Star  ---  OID=@2529347   (@@50655,10)  ---  coobox=16800 
// Object types: Double or Multiple Star,Star 
Barycenter "NU2 Sco D/Gaia DR3 6245698565188996992/ADS 9951 D/CCDM J16120-1928D/CSI-19 4332 3/HGAM 2053/IDS 16062-1912 D/WDS J16120-1928D/PMSC 16062-1912Da/PMSC 16062-1912D/TYC 6209-1536-2/** MTL 2D/HD 145501B/BD-19 4332B/WEB 13421/Gaia DR2 6245698565188996992/NU Sco D/HD 145501D"
{
	ParentBody      "NU2 Sco"
	BinaryOrbit     
	{
		Period          2978
		Separation      330.128858318649
	}
}

// ----------------------------------------------------------------------------------------------------

Barycenter "NU1 Sco Aab"
{
	ParentBody      "NU1 Sco A"
	BinaryOrbit // Tok 2023
	{
		Period          10.0300
		Separation      14.0202925579147 // 0.099 asec
		Eccentricity    0.920
		Inclination     90.1
		AscendingNode   344.9
		Epoch           2456705.405666875652969
		ArgOfPericenter 108.4
		MeanAnomaly     0
	}
}

Star "NU1 Sco Ac"
{
	DateUpdated     "2024-05-28"
	ParentBody      "NU1 Sco A"
	Class           ""
	MassSol         2.46
}

// ----------------------------------------------------------------------------------------------------

Star "NU2 Sco Da"
{
	DateUpdated     "2024-05-28"
	ParentBody      "NU2 Sco D"
	Parallax        7.1732
	AppMagn         7.23
	Class           "B9III"
	AbsMagn         1.51 // 计算的值
	MassSol         1.96

	BinaryOrbit     
	{
		Epoch           2442048.5
		Period          10 // ?
	}
}

Star "NU2 Sco Db"
{
	DateUpdated     "2024-05-28"
	ParentBody      "NU2 Sco D"
	Class           ""
	MassSol         1.7 // ?
}

// ----------------------------------------------------------------------------------------------------

Star "NU1 Sco Aa"
{
	DateUpdated     "2024-05-28"
	ParentBody      "NU1 Sco Aab"
	Parallax        7.0568
	AppMagn         4.349
	Class           "B3V"
	AbsMagn         -1.41 // 计算的值
	MassKg          1.03948787052156e+31 // log(g) = 3.485 cm/s^2
	RadSol          6.85 // Gaia DR3
	LumBol          1365.4370455706 // 计算的值
	Teff            13406
	FeH             0.574

	BinaryOrbit // SB9_889 1987ApJS...64..487L
	{
		PeriodDays      5.5521
		Eccentricity    0.110
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2442185.555
		ArgOfPericenter 87.0
		MeanAnomaly     0
	}
}

Star "NU1 Sco Ab"
{
	DateUpdated     "2024-05-28"
	ParentBody      "NU1 Sco Aab"
	Class           ""
	MassSol         2.28
}

// ----------------------------------------------------------------------------------------------------