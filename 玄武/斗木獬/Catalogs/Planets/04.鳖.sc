// Object * eta01 CrA  ---  Star  ---  OID=@2321956   (@@58027,2)  ---  coobox=18560 
// Object types: Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "ETA1 CrA A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "ETA1 CrA"
	Class           "A3V"
	AbsMagn         0.84
	MassSol         1.93537265917712 // log(g) = 4.04 cm/s^2
	RadSol          2.2
	LumBol          57.72
	Teff            8371

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.2788942
		Eccentricity    0.615845974
		Inclination     -0.914874554
		AscendingNode   0
		ArgOfPericenter 46.834732
		MeanAnomaly     -73.8565526
	}
}

Star "ETA1 CrA B"
{
	ParentBody      "ETA1 CrA"
	Class           "A9.8?"
}

// Object * gam CrA A  ---  High Proper Motion Star  ---  OID=@2353493   (@@58527,6)  ---  coobox=18586 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Remove "GAM CrA A" {ParentBody "GAM CrA"}
Remove "GAM CrA B" {ParentBody "GAM CrA"}
Star "GAM CrA A/GJ 9642 A/GJ 743.1 A/Gaia DR3 6719152945032456832/PLX 4431/CCDM J19064-3704A/CD-37 13048A/CPD-37 8464A/CSI-37 13048 22/GCRV 11543/HD 177474/HR 7226/IDS 18597-3712 A/ROT 2716/SKY# 35340/WDS J19064-3704A/** HJ 5084A/TYC 7422-1737-1/PLX 4431.00A/WEB 16313/Gaia DR2 6719152945032456832"
{
	DateUpdated     "2024-06-01"
	ParentBody      "HIP 93825"
	Parallax        58.6956
	AppMagn         4.53
	Class           "F8V"
	AbsMagn         3.73
	MassSol         1.15
	RadSol          1.47
	LumBol          2.677919503705433 // 计算的值
	Teff            6090
	FeH             -0.07
	Age             5

	BinaryOrbit     
	{
		Period          121.76
		Separation      32.8084882774293 // 1.896 asec
		Eccentricity    0.320
		Inclination     149.6
		AscendingNode   50.3
		Epoch           2451778.288405319675803
		ArgOfPericenter 169.0
		MeanAnomaly     0
	}
}

// Object * gam CrA B  ---  High Proper Motion Star  ---  OID=@2353494   (@@58527,7)  ---  coobox=18586 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "GAM CrA B/GJ 9642 B/GJ 743.1 B/GJ 743.1/Gaia DR3 6719152945029845376/CCDM J19064-3704B/CD-37 13048B/CPD-37 8464B/CSI-37 13048 23/HD 177475/HR 7227/IDS 18597-3712 B/WDS J19064-3704B/** HJ 5084B/TYC 7422-1737-2/PLX 4431.00B/WEB 16314/Gaia DR2 6719152945029845376"
{
	DateUpdated     "2024-06-01"
	ParentBody      "HIP 93825"
	Parallax        57.8583
	AppMagn         6.42
	Class           "F8/G1"
	AbsMagn         3.80
	MassSol         1.14
	RadSol          1.42
	LumBol          2.5152995150440542 // 计算的值
	Teff            6100
	FeH             -0.07
	Age             5
}

// Object * eps CrA  ---  Spectroscopic Binary  ---  OID=@2353328   (@@58009,0)  ---  coobox=18584 
// Object types: Eclipsing Binary,High Proper Motion Star,Spectroscopic Binary,Variable Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source,Young Stellar Object Candidate 
Remove "EPS CrA A" {ParentBody "EPS CrA"}
Remove "EPS CrA B" {ParentBody "EPS CrA"}
Star "EPS CrA A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "HIP 93174"
	Class           "F4VFe-0.8+"
	AbsMagn         2.21
	MassSol         1.9
	RadSol          2.167
	LumBol          7.464136736746516 // 计算的值
	Teff            6481

	BinaryOrbit     
	{
		PeriodDays      0.59143357
		SemiMajorAxisKm 2640181.5// 3.795 RSun
		Eccentricity    0
		Inclination     73.05
		AscendingNode   2.0113
		Epoch           2442296.95907
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "EPS CrA B"
{
	DateUpdated     "2024-06-01"
	ParentBody      "HIP 93174"
	Class           ""
	MassSol         0.24
	RadSol          0.869
	LumBol          0.8464211996787722 // 计算的值
	Teff            5939
}

// Object * kap02 CrA  ---  Star  ---  OID=@2351842   (@@56861,2)  ---  coobox=18482 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "KAP2 CrA/HIP 90968/Gaia DR3 6726876327040339712/TIC 313942295/CCDM J18334-3843A/CD-38 12895/CPC 18 9550/CPD-38 7537/GC 25314/GCRV 11003/GSC 07902-00891/HIC 90968/HR 6953/IDS 18265-3848 A/N30 4116/PPM 297869/SAO 210294/SAO 210295/SKY# 33961/TYC 7902-891-1/[B10] 4690/uvby98 100170867/2MASS J18332313-3843334/WDS J18334-3844A/** DUN 222A/GEN# +1.00170867/WEB 15603/Gaia DR2 6726876327040339712/HD 170867"
{
	DateUpdated     "2024-06-01"
	ParentBody      "KAP CrA"
	Parallax        4.6115
	AppMagn         5.59
	Class           "B9V"
	AbsMagn         -1.09 // 计算的值
	MassSol         3.12
	RadSol          5.28
	LumBol          460
	Teff            12600
	FeH             -0.10
	Oblateness      0

	BinaryOrbit     
	{
		Separation      4445.4081932056 // 20.5 asec
		PositionAngle   359
	}
}

// Object * kap01 CrA  ---  Star  ---  OID=@2351885   (@@56864,23)  ---  coobox=18482 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "KAP1 CrA/HIP 90969/Gaia DR3 6726876327040344576/TIC 313942325/CCDM J18334-3843B/CD-38 12896/CPC 18 9549/CPD-38 7538/GC 25315/GCRV 11002/GSC 07902-01905/HIC 90969/HR 6952/IDS 18265-3848 B/PPM 297868/SAO 210293/SAO 210296/SKY# 33963/TYC 7902-1905-1/[B10] 4691/2MASS J18332308-3843121/WDS J18334-3844B/** DUN 222B/uvby98 100170868/GEN# +1.00170868/WEB 15602/Gaia DR2 6726876327040344576/HD 170868"
{
	DateUpdated     "2024-06-01"
	ParentBody      "KAP CrA"
	Parallax        4.4833
	AppMagn         6.169
	Class           "A0IV"
	AbsMagn         -0.78
	MassSol         2.82
	RadSol          3.79
	LumBol          179
	Teff            11079
	FeH             -0.2
	Age             0.0041
}
