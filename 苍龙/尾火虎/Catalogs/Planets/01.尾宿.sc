// Object * mu.01 Sco  ---  Be Star  ---  OID=@2343679   (@@52108,0)  ---  coobox=16922 
// Object types: Be Star,Eclipsing Binary,Double or Multiple Star,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "MU1 Sco A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "MU1 Sco"
	Class           "B1.5V"
	AbsMagn         -2.9
	MassSol         8.3
	RadSol          3.9
	LumBol          4546.4022625908865 // 计算的值
	Teff            24000

	BinaryOrbit     
	{
		PeriodDays      1.44627
		SemiMajorAxisKm 8974530 // 12.90 RSun
		Eccentricity    0.0
		Inclination     65.4
		Epoch           2412374.434
	}
}

Star "MU1 Sco B"
{
	DateUpdated     "2024-05-29"
	ParentBody      "MU1 Sco"
	Class           "B6.5V"
	MassSol         4.6
	RadSol          4.6
	LumBol          1592.227157665373 // 计算的值
	Teff            17000
}

// Object * tet Sco  ---  Star  ---  OID=@2319253   (@@54002,13)  ---  coobox=17035 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "TET Sco A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "TET Sco"
	Class           "F1III"
	AbsMagn         -2.71
	MassSol         3.10
	RadSol          26.3
	LumBol          1400
	Teff            6294
	RotationPeriod  398.4

	BinaryOrbit     
	{
		Separation      595.764303064707 // 6.47 asec
	}
}

Star "TET Sco B/HD 159532B/CD-42 12312B/** SEE 510B/CCDM J17373-4300B/WDS J17373-4300B/TYC 7892-7679-2/UCAC4 236-132813"
{
	ParentBody      "TET Sco"
	Class           "B5.8?"
}

// Object * iot01 Sco  ---  Yellow Supergiant  ---  OID=@2334783   (@@54511,11)  ---  coobox=17063 
// Object types: Yellow Supergiant,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Emission-line Star,Star,Infra-Red Source,UV-emission Source 
Star "IOT1 Sco A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "IOT1 Sco"
	Class           "F2Ia"
	AbsMagn         -5.85
	MassSol         12.1
	RadSol          122
	LumBol          18249.3
	Teff            6074
	FeH             -0.13 // -0.11
	Age             0.0170

	BinaryOrbit     
	{
		Separation      20000
	}
}

Star "IOT1 Sco B"
{
	ParentBody      "IOT1 Sco"
	Class           "O6.1?"
}

// Object * kap Sco  ---  beta Cep Variable  ---  OID=@2348159   (@@54481,8)  ---  coobox=17072 
// Object types: beta Cep Variable,Variable Star,beta Cep Variable,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "KAP Sco A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "KAP Sco"
	Class           "B1.5III"
	AbsMagn         -3.46
	MassSol         17
	RadSol          6.8
	LumBol          6911
	Teff            23400
	RotationPeriod  45.6
	Age             0.0251

	BinaryOrbit     
	{
		PeriodDays      195.65
		Eccentricity    0.488
		Inclination     92.7 // Wikipedia打错了?
	}
}

Star "KAP Sco B"
{
	DateUpdated     "2024-05-29"
	ParentBody      "KAP Sco"
	Class           ""
	MassSol         12
	RadSol          5.8
	LumBol          3786.003947533177
	Teff            18800
}

// Object * lam Sco  ---  beta Cep Variable  ---  OID=@2347504   (@@53982,0)  ---  coobox=17051 
// Object types: Eclipsing Binary,beta Cep Variable,Double or Multiple Star,White Dwarf,Variable Star,beta Cep Variable,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source,beta Cep Variable Candidate 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=85927
// 除此之外还有两颗伴星B和C，均为光学伴星
Remove "LAM Sco A" {ParentBody "Shaula"}
Remove "LAM Sco Aa" {ParentBody "LAM Sco A"}
Remove "LAM Sco Ab" {ParentBody "LAM Sco A"}
Remove "LAM Sco B" {ParentBody "Shaula"}
Barycenter "LAM Sco A"
{
	ParentBody      "LAM Sco"
	BinaryOrbit // VB6_Tng2006 TNG_1Aa, Gr.2
	{
		Period          2.8825
		Separation      8.58338695804859 // 0.049 asec
		Eccentricity    0.121
		Inclination     77.2
		AscendingNode   271.3
		Epoch           2451561.699781442526728
		ArgOfPericenter 74.8
		MeanAnomaly     0
	}
}

Star "LAM Sco A1"
{
	DateUpdated     "2024-05-29"
	ParentBody      "LAM Sco A"
	Class           "B1.5IV"
	AbsMagn         -3.70
	MassSol         10.4
	RadSol          8.8
	LumBol          36300
	Teff            25000
	RotationPeriod  81.6

	BinaryOrbit     
	{
		PeriodDays      5.9520
		Eccentricity    0.260
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2450659.200
		ArgOfPericenter 64.0
		MeanAnomaly     0
	}
}

Star "LAM Sco A2"
{
	DateUpdated     "2024-05-29"
	ParentBody      "LAM Sco A"
	Class           ""
	MassSol         1.8
}

Star "LAM Sco B"
{
	DateUpdated     "2024-05-29"
	ParentBody      "LAM Sco"
	Class           "B2IV"
	MassSol         8.1
	RadSol          4.7
	LumBol          7774.08757832662 // 计算的值
	Teff            25000
}
