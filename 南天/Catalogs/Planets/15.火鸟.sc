// Object * iot Phe  ---  alpha2 CVn Variable  ---  OID=@1150019   (@@23593,0)  ---  coobox=8843 
// Object types: alpha2 CVn Variable,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source 
Remove "IOT Phe A" {ParentBody "IOT Phe"}
Remove "IOT Phe B" {ParentBody "IOT Phe"}
Star "IOT Phe A"
{
	DateUpdated     "2024-08-06"
	ParentBody      "Gaia DR3 6535342432254576000"
	Class           "A2VpSrCrEu"
	AbsMagn         0.28
	MassSol         2.23
	RadSol          5.07
	LumBol          68.2
	Teff            7370
	FeH             -0.01
	Age             0.573
	RotationPeriod  143.52 // Estimated

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   61.7631605
		Eccentricity    0.540403698
		Inclination     -1.32330322
		AscendingNode   0
		ArgOfPericenter -58.8406507
		MeanAnomaly     -165.521902
	}
}

Star "IOT Phe B"
{
	ParentBody      "Gaia DR3 6535342432254576000"
	Class           "G0.6?"
}

// Object * alf Phe  ---  Spectroscopic Binary  ---  OID=@1152728   (@@23677,12)  ---  coobox=10273 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Remove "Ankaa A" {ParentBody "Ankaa"}
Remove "Ankaa B" {ParentBody "Ankaa"}
Star "ALF Phe A"
{
	DateUpdated     "2024-08-06"
	ParentBody      "ALF Phe"
	Class           "K0.5IIIb"
	AbsMagn         0.52
	MassSol         1.57
	RadSol          15
	LumBol          83
	Teff            4436
	FeH             -0.73

	BinaryOrbit     
	{
		PeriodDays      3848.8
		Separation      7
		Eccentricity    0.34
		Inclination     128.0
		AscendingNode   242.8
		Epoch           2416201.8
		ArgOfPericenter 19.8
		MeanAnomaly     0
	}
}

Star "ALF Phe B"
{
	ParentBody      "ALF Phe"
	Class           "G4.8?"
}

// Object * mu. Phe  ---  Star  ---  OID=@3214546   (@@75703,6)  ---  coobox=23529 
// Object types: Red Giant Branch star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "MU Phe A"
{
	DateUpdated     "2024-08-06"
	ParentBody      "MU Phe"
	Class           "G8III"
	AbsMagn         0.21
	MassSol         2.50
	RadSol          13.15
	LumBol          96.6
	Teff            4900
	Age             1.4

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.41707075
		Eccentricity    0.16330308
		Inclination     1.60378242
		AscendingNode   0
		ArgOfPericenter -51.1456625
		MeanAnomaly     102.734957
	}
}

Star "MU Phe B"
{
	ParentBody      "MU Phe"
	Class           "A5.5?"
}

// Object * bet Phe A  ---  Star  ---  OID=@6222762   (@@-1,255)  ---  coobox=23475 
// Object types: Double or Multiple Star,Star 
Remove "BET Phe A" {ParentBody "BET Phe"}
Remove "BET Phe B" {ParentBody "BET Phe"}
Star "BET Phe A/WDS J01061-4643A/CCDM J01061-4643A/TYC 8032-1228-1/** SLR 1A/HD 6595A/CD-47 324A"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 5165"
	Class           "G8III"
	AbsMagn         0.29
	MassSol         2.7
	RadSol          14
	LumBol          100
	Teff            5090

	BinaryOrbit     
	{
		Period          170.7
		Separation      53.6584290681232 // 0.946 asec
		Eccentricity    0.718
		Inclination     144.0
		AscendingNode   126.4
		Epoch           2452790.009295943193138
		ArgOfPericenter 113.5
		MeanAnomaly     0
	}
}

// Object * bet Phe B  ---  Star  ---  OID=@6222778   (@@-1,255)  ---  coobox=23475 
// Object types: Double or Multiple Star,Star 
Star "BET Phe B/WDS J01061-4643B/CCDM J01061-4643B/TYC 8032-1228-2/** SLR 1B/HD 6595B/CD-47 324B" // 几乎相同的恒星
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 5165"
	Class           "G8III"
	AbsMagn         0.29
	MassSol         2.7
	RadSol          14
	LumBol          100
	Teff            5090
}

// Object * gam Phe  ---  Spectroscopic Binary  ---  OID=@3141296   (@@75788,0)  ---  coobox=23466 
// Object types: High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Long-Period Variable Candidate 
Remove "GAM Phe A" {ParentBody "GAM Phe"}
Remove "GAM Phe B" {ParentBody "GAM Phe"}
Star "GAM Phe A"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 6867"
	Class           "M0III"
	AbsMagn         -0.86
	MassSol         1.3
	RadSol          50 // 55
	LumBol          562
	Teff            3802

	BinaryOrbit     
	{
		PeriodDays      193.9
		Separation      0.30 // Photocentric
		Eccentricity    0.0301
		Inclination     46.3
		AscendingNode   46.3
		Epoch           2453670.987
		ArgOfPericenter 316.8
		MeanAnomaly     0
	}
}

Star "GAM Phe B"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 6867"
	Class           ""
	MassSol         0.6
}