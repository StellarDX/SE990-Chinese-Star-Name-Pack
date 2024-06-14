// Object * del Cep  ---  Classical Cepheid Variable  ---  OID=@122671   (@@6904,0)  ---  coobox=620 
// Object types: Classical Cepheid Variable,Classical Cepheid Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Classical Cepheid Variable,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=110991
Remove "DEL Cep A"{ParentBody "DEL Cep"}
Remove "DEL Cep B"{ParentBody "DEL Cep"}
Barycenter "DEL Cep A"
{
	ParentBody      "Gaia DR3 2200153454733285248"
	BinaryOrbit     
	{
		Period          292270
		Separation      11459.5932384873 // 40.74 asec
	}
}

Star "DEL Cep Aa"
{
	DateUpdated     "2024-06-14"
	ParentBody      "DEL Cep A"
	Class           "F5Iab"
	AbsMagn         -3.94
	MassSol         4.5
	RadSol          46.1
	LumBol          2000
	Teff            5864
	FeH             0.08

	BinaryOrbit     
	{
		Period          6.03
		PericenterDist  2
		Eccentricity    0.647
	}
}

Star "DEL Cep Ab"
{
	DateUpdated     "2024-06-14"
	ParentBody      "DEL Cep A"
	Class           ""
	MassSol         0.2 // 1.2
}

// Object * del Cep B  ---  Variable Star Candidate  ---  OID=@122308   (@@6875,7)  ---  coobox=620 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Variable Star Candidate 
Barycenter "DEL Cep B/AP J22290927+5824149/Gaia DR3 2200153214212849024/TIC 415752999/ADS 15987 C/AG+58 1459/BD+57 2547/CCDM J22292+5825C/GC 31419/GCRV 14136/GEN# +1.00213307/GSC 03995-01480/HD 213307/HIC 110988/HIP 110988/IDS 22254+5754 C/PPM 40730/ROT 3273/SAO 34506/SKY# 42786/TYC 3995-1480-1/UBV 19226/UBV M 26437/[BMF2002b] DC 2/uvby98 100213307/2MASS J22290927+5824149/ALS 18063/WDS J22292+5825C/NSV 25915/** STF 4058C/WEB 19874/Gaia DR2 2200153214212849024"
{
	ParentBody      "Gaia DR3 2200153454733285248"
}

Star "DEL Cep Ba"
{
	DateUpdated     "2024-06-14"
	ParentBody      "DEL Cep B"
	Parallax        3.4544
	AppMagn         6.3
	Class           "B7IV"
	AbsMagn         -3.05
	MassSol         4.78
	Radius          6692599.27584056 // 计算的值
	LumBol          500
	Teff            8800

	BinaryOrbit // VB6_AST2002b STFA_58C Gr.9
	{
		Period          1.0678
		Eccentricity    0.350
		Inclination     36.0
		AscendingNode   100.0
		Epoch           2452384.590455296449363
		ArgOfPericenter 259.0
		MeanAnomaly     0
	}
}

Star "DEL Cep Bb"
{
	DateUpdated     "2024-06-14"
	ParentBody      "DEL Cep B"
	Class           ""
	MassSol         1.99
}

// Object * zet Cep  ---  Red Supergiant  ---  OID=@120956   (@@7267,3)  ---  coobox=613 
// Object types: Red Supergiant,Variable Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Eclipsing Binary Candidate,Infra-Red Source 
Star "ZET Cep A"
{
	DateUpdated     "2024-06-14"
	ParentBody      "ZET Cep"
	Class           "K1.5Ib"
	AbsMagn         -4.7
	MassSol         10.1
	RadSol          172.7
	LumBol          10024
	Teff            4393
	FeH             0.04

	BinaryOrbit     
	{
		PeriodDays      533 // 食双星?
	}
}

Star "ZET Cep B"
{
	ParentBody      "ZET Cep"
	Class           "F0.4?"
}