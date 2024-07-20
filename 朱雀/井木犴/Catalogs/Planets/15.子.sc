// Object * lam Col  ---  Ellipsoidal Variable Candidate  ---  OID=@849368   (@@12778,0)  ---  coobox=7124 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Star,Ellipsoidal Variable Candidate,Infra-Red Source,UV-emission Source,X-ray Source 
Star "LAM Col A"
{
	DateUpdated     "2024-07-20"
	ParentBody      "LAM Col"
	Class           "B5V"
	AbsMagn         -0.17
	MassSol         4.0
	RadSol          3.4
	LumBol          213
	Teff            13524
	FeH             -0.06
	Age             0.0566

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.56386894
		Eccentricity    0.291578708
		Inclination     -1.91817045
		AscendingNode   0
		ArgOfPericenter 12.606282
		MeanAnomaly     -115.342138
	}
}

Star "LAM Col B"
{
	ParentBody      "LAM Col"
	Class           "F0.8?"
}