// Object * tet Cnc  ---  High Proper Motion Star  ---  OID=@1091867   (@@20178,13)  ---  coobox=5956 
// Object types: High Proper Motion Star,Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Star "TET Cnc A"
{
	DateUpdated     "2024-07-22"
	ParentBody      "TET Cnc"
	Class           "K5III"
	AbsMagn         -0.19
	RadSol          40.02
	LumBol          353.1
	Teff            3955

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   11.6054196
		Eccentricity    0.494982423
		Inclination     -2.3678689
		AscendingNode   0
		ArgOfPericenter -43.0923408
		MeanAnomaly     -122.366013
	}
}

Star "TET Cnc B"
{
	ParentBody      "TET Cnc"
	Class           "A5.3?"
}

// Object * eta Cnc  ---  High Proper Motion Star  ---  OID=@1090181   (@@21005,0)  ---  coobox=5607 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Remove "ETA Cnc A" {ParentBody "ETA Cnc"}
Remove "ETA Cnc B" {ParentBody "ETA Cnc"} // 褐矮星和主星似乎没什么关系

// Object * del Cnc  ---  Double or Multiple Star  ---  OID=@1110026   (@@20627,0)  ---  coobox=5627 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "DEL Cnc Aa"
{
	DateUpdated     "2024-07-22"
	ParentBody      "DEL Cnc"
	Class           "K0IIIb"
	AbsMagn         0.843
	MassSol         1.71
	RadSol          11.7
	LumBol          59.5
	Teff            4684
	FeH             -0.03
	Age             2.45

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.27276096
		Eccentricity    0.608749224
		Inclination     1.46667564
		AscendingNode   0
		ArgOfPericenter 66.362761
		MeanAnomaly     134.723829
	}
}

Star "DEL Cnc Ab"
{
	ParentBody      "DEL Cnc"
	Class           "M3.8?"
}