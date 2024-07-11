// Object * eta Gem  ---  Red Giant Branch star  ---  OID=@869696   (@@20465,0)  ---  coobox=5294 
// Object types: Red Giant Branch star,Double or Multiple Star,Eclipsing Binary,Near-IR Source (λ < 3 µm),Variable Star,Spectroscopic Binary,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=29655
Remove "Tejat Prior A"{ParentBody "Tejat Prior"}
Remove "ETA Gem B"{ParentBody "Tejat Prior"}
Remove "Tejat Prior Aa"{ParentBody "Tejat Prior A"}
Remove "ETA Gem Ab"{ParentBody "Tejat Prior A"}
Barycenter "ETA Gem A"
{
	ParentBody      "ETA Gem"
	BinaryOrbit // VB6_Izm2019  BU_1008 Gr.5
	{
		Period          1031.1632
		Separation      1080.0640671059// 5.11 asec
		Eccentricity    0.85
		Inclination     96.6
		AscendingNode   65
		Epoch           2480081.636873257346451
		ArgOfPericenter 253.6
		MeanAnomaly     0
	}
}

Star "ETA Gem Aa"
{
	DateUpdated     "2024-07-11"
	ParentBody      "ETA Gem A"
	Class           "M2IIIa"
	AbsMagn         -1.87
	MassSol         5.1
	RadSol          275
	LumBol          10276
	Teff            3502
	FeH             0.04
	Age             0.81

	BinaryOrbit // SB9_387 1944ApJ...100...63M (Combined)
	{
		Period          8.161
		Separation      16.2782268239862 // 0.077 asec
		Eccentricity    0.5507
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2444489.1
		ArgOfPericenter 174.2
		MeanAnomaly     0
	}
}

Star "ETA Gem Ab"
{
	DateUpdated     "2024-07-11"
	ParentBody      "ETA Gem A"
	Class           "A"
	MassSol         2
	RadSol          1.65
	LumBol          16
	Teff            9000
}

// Object * eta Gem B  ---  Star  ---  OID=@6611317   (@@-1,255)  ---  coobox=5294 
// Object types: Double or Multiple Star,Star 

Star "ETA Gem B/TYC 1877-1716-2/BD+22 1241B/* 7 Gem B/** BU 1008B/CCDM J06149+2230B/HD 42995B/WDS J06149+2230B"
{
	DateUpdated     "2024-07-11"
	ParentBody      "ETA Gem"
	Class           "G0III"
	MassSol         1.32
}
