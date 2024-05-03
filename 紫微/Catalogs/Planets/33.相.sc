// Object * 5 CVn  ---  Star  ---  OID=@568305   (@@6121,0)  ---  coobox=2021 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "5 CVn A"
{
	DateUpdated     "2024-05-03"
	ParentBody      "5 CVn"
	Class           "G7IIIBa0.3"
	AbsMagn         -0.68
	MassSol         2.96
	RadSol          12
	LumBol          174
	Teff            5098
	FeH             0.01
	Age             0.530

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.531107392
		Eccentricity    0.607724238
		Inclination     -0.992876291
		AscendingNode   0
		ArgOfPericenter 97.3338523
		MeanAnomaly     97.9302157
	}
}

Star "5 CVn B"
{
	ParentBody      "5 CVn"
	Class           "WD"
}