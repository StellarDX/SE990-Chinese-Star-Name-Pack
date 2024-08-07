// Object * phi Her  ---  alpha2 CVn Variable  ---  OID=@454518   (@@11182,3)  ---  coobox=1289 
// Object types: alpha2 CVn Variable,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "PHI Her A" {ParentBody "PHI Her"}
Remove "PHI Her B" {ParentBody "PHI Her"}
Star "PHI Her A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "HIP 79101"
	Class           "B9VspHgMn"
	AbsMagn         0.100
	MassSol         3.05
	Radius          1480674.32009371 // 计算的值
	LumBol          72
	Teff            11525
	FeH             -0.03
	Age             0.210

	BinaryOrbit     
	{
		PeriodDays      564.834
		Separation      2.36051337715641 // 32.027 mas
		Eccentricity    0.52614
		Inclination     9.1
		AscendingNode   190.4
		Epoch           2450121.43
		ArgOfPericenter 170.3
		MeanAnomaly     0
	}
}

Star "PHI Her B"
{
	DateUpdated     "2024-05-18"
	ParentBody      "HIP 79101"
	Class           "A8V"
	AbsMagn         2.670
	MassSol         1.614
	Radius          1036129.76192369 // log(g) = 4.30 cm/s^2
	LumBol          8.185362485821388 // 计算的值
	Teff            8000
}

// Object * chi Her  ---  High Proper Motion Star  ---  OID=@496214   (@@134452,0)  ---  coobox=1299 
// Object types: Rotating Variable,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "CHI Her A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "CHI Her"
	Class           "F8VFe-2Hdel-1"
	AbsMagn         3.59
	MassSol         1.054
	RadSol          1.71
	LumBol          3.24
	Teff            5837
	FeH             -0.45
	Age             7.4

	BinaryOrbit     
	{
		PeriodDays      51.2865
		Separation      15.2617092176876 // 0.96 asec
		Eccentricity    0.0000
		Inclination     131.68
		AscendingNode   51.69
		Epoch           2448349.0039
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "CHI Her B(?)" // 存疑
{
	ParentBody      "CHI Her"
	Class           "G8.6?"
}

// Object * nu.01 Boo  ---  Star  ---  OID=@542766   (@@11621,0)  ---  coobox=1346 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "NU1 Boo A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "NU1 Boo"
	Class           "K4.5IIIbBa0.5"
	AbsMagn         -2.22
	MassKg          1.47912703928996e+30 // log(g) = 1.15 cm/s^2
	RadSol          38
	LumBol          1626
	Teff            3917
	FeH             0.00

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.337258387
		Eccentricity    0
		Inclination     -0.868796349
		AscendingNode   0
		ArgOfPericenter -11.9173829
		MeanAnomaly     -19.0846379
	}
}

Star "NU1 Boo B"
{
	ParentBody      "NU1 Boo"
	Class           "WD?"
}

// Object * mu.01 Boo  ---  Double or Multiple Star  ---  OID=@2936980   (@@49143,0)  ---  coobox=17781 
// Object types: High Proper Motion Star,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=75411
Remove "MU 1 Boo"{ParentBody "Alkalurops"}
Remove "MU1 Boo A"{ParentBody "MU 1 Boo"}
Remove "MU1 Boo B"{ParentBody "MU 1 Boo"}
Remove "MU2 Boo"{ParentBody "Alkalurops"}
Remove "MU2 Boo A"{ParentBody "MU2 Boo"}
Remove "MU2 Boo B"{ParentBody "MU2 Boo"}
Barycenter "MU1 Boo/GJ 3903/HIP 75411/Gaia DR3 1387349379494809600/TIC 233466081/PLX 3483/LSPM J1524+3722/ASCC 498542/FK5 568/ADS 9626 A/AG+37 1409/BD+37 2636/CCDM J15245+3722A/GC 20724/GCRV 8919/GEN# +1.00137391/GSC 02570-01521/HD 137391/HIC 75411/HR 5733/IRAS 15225+3733/JP11 2601/N30 3470/NSV 7063/PMC 90-93 402/PPM 78563/ROT 2182/SAO 64686/SKY# 27889/SRS 30568/TD1 18226/TYC 2570-1521-1/UBV 13255/UBV M 20764/[HFE83] 1101/uvby98 100137391/2MASS J15242944+3722380/USNO-B1.0 1273-00289313/WDS J15245+3723Aa,Ab/Renson 39052/** CHR 181/51 Boo/WDS J15245+3723A/** STFA 28A/MU Boo/Alkalurops/WEB 12864/Gaia DR2 1387349379494192896"
{
	ParentBody      "** STFA 28"
	BinaryOrbit     
	{
		Period          113512
		Separation      4095.43980504766 // 108.84 asec
	}
}

Star "MU1 Boo A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "GJ 3903"
	Class           "F0IV"
	AbsMagn         1.47
	MassSol         1.6
	RadSol          1.9
	LumBol          20
	Teff            7000

	BinaryOrbit     
	{
		Period          3.75
		Separation      3.72451561936318 // 0.099 asec
		Eccentricity    0.270
		Inclination     129.7
		AscendingNode   129.4
		Epoch           2088614.317735383752733
		ArgOfPericenter 233.5
		MeanAnomaly     0
	}
}

Star "MU1 Boo B"
{
	DateUpdated     "2024-05-18"
	ParentBody      "GJ 3903"
	Class           "F0IV"
	MassSol         1.5
	Radius          2236186.4570836 // log(g) = 3.6 cm/s^2
	LumBol          22.34898775211196
	Teff            7000
}

// Object * mu.02 Boo  ---  Double or Multiple Star  ---  OID=@2936981   (@@49143,1)  ---  coobox=17781 
// Object types: Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,X-ray Source 
Barycenter "MU2 Boo/GJ 3904/WISE J152430.77+372052.5/HIP 75415/GEN# +1.00137392/TIC 233466076/LSPM J1524+3720/ASCC 498543/USNO-B1.0 1273-00289333/51 Boo B/ADS 9626 BC/AG+37 1410/BD+37 2637/CCDM J15245+3722BC/GC 20725/GCRV 8920/HD 137392/HIC 75415/HR 5734/IDS 15207+3742/IRAS 15226+3731/PPM 78564/ROT 2183/SAO 64687/SKY# 27891/UBV 13256/UBV M 20765/2MASS J15243088+3720511/[ZEH2003] RX J1524.5+3720 1/RX J1524.5+3720/1RXS J152431.4+372057/WDS J15245+3723Ba,Bb/** STFA 28B/WDS J15245+3723B/** STF 1938/UCAC4 637-050515/WEB 12865"
{
	ParentBody      "** STFA 28"
}

// Object * mu.02 Boo  ---  Double or Multiple Star  ---  OID=@2936981   (@@49143,1)  ---  coobox=17781 
// Object types: Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,X-ray Source 
Star "MU2 Boo A"
{
	DateUpdated     "2024-05-18"
	ParentBody      "GJ 3904"
	Parallax        27.73
	Class           "F9V"
	MassSol         1.24
	RadSol          1.23
	LumBol          1.75
	Teff            6000
	Age             5.6

	BinaryOrbit     
	{
		Period          265
		Separation      52.6505616623207 // 1.46 asec
		Eccentricity    0.585
		Inclination     135.5
		AscendingNode   174
		Epoch           2402200.312342787161469
		ArgOfPericenter 158
		MeanAnomaly     0
	}
}

Star "MU2 Boo B"
{
	DateUpdated     "2024-05-18"
	ParentBody      "GJ 3904"
	Class           "G0V"
	MassSol         1.05
	RadSol          1.09
	LumBol          1.06
	Teff            5900
	Age             11.3
}

// Object * del Boo  ---  High Proper Motion Star  ---  OID=@2909772   (@@48786,7)  ---  coobox=17753 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "DEL Boo A" {ParentBody "DEL Boo"}
Remove "DEL Boo B" {ParentBody "DEL Boo"}
Star "DEL Boo A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "HIP 74666"
	Class           "G8IIIFe-1"
	AbsMagn         0.700
	MassKg          2.90279844122388e+30 // log(g) = 2.56 cm/s^2
	RadSol          10.5
	LumBol          53.7
	Teff            4847
	FeH             -0.44

	BinaryOrbit // 未修改，需要引用
	{
		Period          76000
		Separation      2910.6278
		Eccentricity    0.73
		Inclination     86
		AscendingNode   75
		ArgOfPericenter 218
		Epoch           16247838.107953
		MeanAnomaly     0
	}
}

// Object BD+33 2562  ---  High Proper Motion Star  ---  OID=@2909773   (@@48787,0)  ---  coobox=17753 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+33 2562/HIP 74674/Gaia DR3 1278392381386793856/TIC 16271552/ADS 9559 B/AG+33 1352/CCDM J15156+3319B/GCRV 5233 E/GEN# +0.03302562/GSC 02566-00246/HIC 74674/IDS 15115+3341 B/PPM 78455/SAO 64591/SKY# 27638/TYC 2566-246-1/UBV 13166/UBV M 2429/2MASS J15153834+3319156/WDS J15155+3319B/** STF 4027B/WEB 12741/Gaia DR2 1278392381386793856"
{
	DateUpdated     "2024-05-19"
	ParentBody      "HIP 74666"
	Parallax        27.1573
	AppMagn         7.81
	Class           "G0Vv"
	MassSol         0.98
	RadSol          0.91
	LumBol          0.87
	Teff            5812
	Age             3.09
}
