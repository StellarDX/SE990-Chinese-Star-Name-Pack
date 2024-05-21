// Object * gam Hya  ---  Spectroscopic Binary  ---  OID=@2141636   (@@44501,15)  ---  coobox=15958 
// Object types: High Proper Motion Star,Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "GAM Hya A"
{
	DateUpdated     "2024-05-21"
	ParentBody      "GAM Hya"
	Class           "G8IIIa"
	AbsMagn         -0.15
	MassSol         2.94
	RadSol          16
	LumBol          115
	Teff            5087
	FeH             -0.06
	Age             0.372

	BinaryOrbit // 双谱分光双星，但是伴星和轨道数据均未知，且Wikipedia页面只字未提
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.54733877
		Eccentricity    0
		Inclination     0.998682499
		AscendingNode   0
		ArgOfPericenter 103.366109
		MeanAnomaly     21.3234997
	}
}

Star "GAM Hya B"
{
	ParentBody      "GAM Hya"
	Class           "F1.9?"
}