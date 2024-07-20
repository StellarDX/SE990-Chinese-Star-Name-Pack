// Object * eps Col  ---  Star  ---  OID=@818207   (@@12764,1)  ---  coobox=7110 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "EPS Col A"
{
	DateUpdated     "2024-07-20"
	ParentBody      "EPS Col"
	Class           "K1II/III"
	AbsMagn         -0.67
	MassSol         2.47
	RadSol          25.2
	LumBol          251.2
	Teff            4575
	FeH             -0.03
	Age             1.53

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   239.39859
		Eccentricity    0.198876466
		Inclination     1.36509931
		AscendingNode   0
		ArgOfPericenter -81.4190199
		MeanAnomaly     30.1981368
	}
}

Star "EPS Col B"
{
	ParentBody      "EPS Col"
	Class           "B8.4?"
}