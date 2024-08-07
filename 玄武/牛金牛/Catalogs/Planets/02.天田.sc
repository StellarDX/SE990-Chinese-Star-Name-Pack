// Object * 3 PsA  ---  High Proper Motion Star  ---  OID=@1203448   (@@24815,6)  ---  coobox=8221 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "HD 201901 A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "HD 201901"
	Class           "K3III"
	AbsMagn         0.19
	MassSol         1.58
	RadSol          31.3
	LumBol          184
	Teff            4225
	FeH             -0.17
	Age             2.59

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.895424376
		Eccentricity    0
		Inclination     0.798677325
		AscendingNode   0
		ArgOfPericenter 55.5627981
		MeanAnomaly     -100.682579
	}
}

Star "HD 201901 B"
{
	ParentBody      "HD 201901"
	Class           "A6.9?"
}

// Object * ome Cap  ---  Variable Star  ---  OID=@2376189   (@@62819,9)  ---  coobox=19133 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source 
Star "OME Cap A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "OME Cap"
	Class           "M0IIIBa0.5"
	AbsMagn         -2.7
	MassSol         6.8
	RadSol          172.1
	LumBol          6269
	Teff            3915
	FeH             -0.24
	Age             0.0481

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   17.7405492
		Eccentricity    0.410598643
		Inclination     -2.00217152
		AscendingNode   0
		ArgOfPericenter -15.0835575
		MeanAnomaly     -64.7982218
	}
}

Star "OME Cap B"
{
	ParentBody      "OME Cap"
	Class           "WD"
}
