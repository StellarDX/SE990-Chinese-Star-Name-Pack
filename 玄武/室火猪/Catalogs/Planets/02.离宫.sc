// Object * omi Peg  ---  Star  ---  OID=@1499708   (@@31378,0)  ---  coobox=10009 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "OMI Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "OMI Peg"
	Class           "A1IV"
	AbsMagn         -0.01
	MassSol         2.24
	Radius          2387385.70828598 // 计算的值
	LumBol          104.24
	Teff            9956
	FeH             0.0
	Age             0.184

	BinaryOrbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.730117344
		Eccentricity    0.740950067
		Inclination     1.33581579
		AscendingNode   0
		ArgOfPericenter 145.857814
		MeanAnomaly     92.9701271
	}
}

Star "OMI Peg B"
{
	ParentBody      "OMI Peg"
	Class           "F4.8?"
}

// Object * eta Peg  ---  Spectroscopic Binary  ---  OID=@1509474   (@@31644,0)  ---  coobox=10012 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "Matar A" {ParentBody "Matar"}
Remove "Matar B" {ParentBody "Matar"}
Star "ETA Peg A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "ETA Peg"
	Class           "G2II"
	AbsMagn         -1.18
	MassSol         3.51
	RadSol          24.51
	LumBol          330.8
	Teff            4970
	FeH             0.39
	RotationPeriod  19632
	Age             0.27

	BinaryOrbit     
	{
		PeriodDays      813
		Eccentricity    0.183
		Epoch           2452025
		ArgOfPericenter 164.7
		MeanAnomaly     0
	}
}

Star "ETA Peg B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "ETA Peg"
	Class           "F0V"
}