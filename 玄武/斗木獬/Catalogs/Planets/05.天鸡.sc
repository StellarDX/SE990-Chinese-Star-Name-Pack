// Object * e02 Sgr  ---  Double or Multiple Star  ---  OID=@2556122   (@@59913,9)  ---  coobox=19213 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "55 Sgr A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "55 Sgr"
	Class           "F3IV/V"
	AbsMagn         1.38 // 计算的值
	MassKg          3.42140632794153e+30 // log(g) = 3.646 cm/s^2
	RadSol          3.265 // Gaia DR3
	LumBol          22.138199399206 // 计算的值
	Teff            6929
	FeH             -0.326

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.162021134
		Eccentricity    0
		Inclination     -1.65521431
		AscendingNode   0
		ArgOfPericenter -65.8922807
		MeanAnomaly     -33.9896793
	}
}

Star "55 Sgr B"
{
	ParentBody      "55 Sgr"
	Class           "G1.4?"
}