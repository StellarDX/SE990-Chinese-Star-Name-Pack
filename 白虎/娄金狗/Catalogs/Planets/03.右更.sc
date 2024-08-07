// Object * eta Psc  ---  Double or Multiple Star  ---  OID=@1454376   (@@30288,0)  ---  coobox=11845 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "ETA Psc A" {ParentBody "ETA Psc"}
Remove "ETA Psc B" {ParentBody "ETA Psc"}
Star "ETA Psc A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "HIP 7097"
	Class           "G7IIIa"
	AbsMagn         -1.52
	MassSol         3.78
	RadSol          26.48
	LumBol          457
	Teff            4937
	FeH             -0.13
	Age             0.220

	BinaryOrbit     
	{
		Period          850.5
		Separation      140.608045592863 // 1.228 asec
		Eccentricity    0.469
		Inclination     58.5
		AscendingNode   32.8
		Epoch           2466263.794008974451572
		ArgOfPericenter 266.9
		MeanAnomaly     0
	}
}

Star "ETA Psc B"
{
	ParentBody      "HIP 7097"
	Class           "F3.7?"
}

// Object * omi Psc  ---  High Proper Motion Star  ---  OID=@1425804   (@@29680,9)  ---  coobox=11805 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source 
Star "OMI Psc A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "OMI Psc"
	Class           "G8III"
	AbsMagn         -0.22
	MassSol         3.03
	RadSol          14.57
	LumBol          132
	Teff            5004
	FeH             0.10
	Age             0.390

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.44834654
		Eccentricity    0.377942732
		Inclination     0.130710602
		AscendingNode   0
		ArgOfPericenter -148.015068
		MeanAnomaly     37.7351659
	}
}

Star "OMI Psc B"
{
	ParentBody      "OMI Psc"
	Class           "F8.3?"
}