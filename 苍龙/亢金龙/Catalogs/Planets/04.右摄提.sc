// Object * eta Boo  ---  Spectroscopic Binary  ---  OID=@2215890   (@@46318,0)  ---  coobox=14098 
// Object types: Spectroscopic Binary,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Muphrid A" {ParentBody "Muphrid"}
Remove "Muphrid B" {ParentBody "Muphrid"}
Star "ETA Boo A"
{
	DateUpdated     "2024-05-23"
	ParentBody      "ETA Boo"
	Class           "G0IV"
	AbsMagn         2.41
	MassSol         1.71
	RadSol          2.672
	LumBol          8.89
	Teff            6100
	FeH             0.29
	Age             2.7

	BinaryOrbit // 未修改
	{
		PeriodDays      494
		Separation      0.4089
		Eccentricity    0.26
		Inclination     115.7
		AscendingNode   75.2
		ArgOfPericenter 326.3
		Epoch           2428136.2
		MeanAnomaly     0
	}
}

Star "ETA Boo B"
{
	DateUpdated     "2024-05-23"
	ParentBody      "ETA Boo"
	Class           "M7"
}

// Object * tau Boo  ---  Rotating Variable  ---  OID=@2196682   (@@134382,0)  ---  coobox=14093 
// Object types: Rotating Variable,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Mid-IR Source (3 to 30 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source,X-ray Source 
// Object * tau Boo  ---  Rotating Variable  ---  OID=@2196682   (@@134382,0)  ---  coobox=14093 
// Object types: Rotating Variable,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Mid-IR Source (3 to 30 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source,X-ray Source 
Remove "TAU Boo A" {ParentBody "TAU Boo"}
Remove "TAU Boo B" {ParentBody "TAU Boo"}
Remove "TAU Boo A b" {ParentBody "TAU Boo A"}
Star "TAU Boo A"
{
	DateUpdated     "2024-05-23"
	ParentBody      "GJ 527"
	Class           "F7IV-V"
	AbsMagn         3.38
	MassSol         1.35
	RadSol          1.42
	LumBol          3.06
	Teff            6387
	FeH             0.25
	RotationPeriod  76.8
	Age             1.3

	BinaryOrbit     
	{
		Period          2420
		Separation      220.150825158198 // 14.1 asec
		Eccentricity    0.87
		Inclination     47.2
		AscendingNode   191.8
		ArgOfPericenter 110.7
		MeanAnomaly     0
	}
}

// Object * tau Boo B  ---  Star  ---  OID=@2196405   (@@46327,24)  ---  coobox=14093 
// Object types: Double or Multiple Star,Star,Optical Source 
Star "TAU Boo B/GJ 527 B/SDSS J134715.56+172725.4/** STT 270B/ADS 9025 B/BD+18 2782B/CCDM J13473+1727B/CSI+18 2782 2/HD 120136B/IDS 13425+1757 B/[RHG95] 2181/WDS J13473+1727B/Gaia DR2 1244571953470337280"
{
	DateUpdated     "2024-05-23"
	ParentBody      "GJ 527"
	Class           "M3V"
	MassSol         0.49
	RadSol          0.48
	LumBol          0.03409637898263065 // 计算的值
	Teff            3580
	FeH             0.21
}

// Object * tau Boo b  ---  Extra-solar Planet  ---  OID=@2196501   (@@96438,2)  ---  coobox=14093
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"TAU Boo Ab/HD 120136 b/BD+18 2782 b/4 Boo b"
{
	ParentBody     "TAU Boo A"
	DiscMethod     "RadVel"
	DiscDate       "1996"
	MassJup        5.5 // 6
	Radius         75781.52

	Orbit
	{
		Epoch           2446957.81 
		PeriodDays      3.312463
		SemiMajorAxis   0.0481
		Eccentricity    0.023
		Inclination     44
		ArgOfPericen    188
	}
}