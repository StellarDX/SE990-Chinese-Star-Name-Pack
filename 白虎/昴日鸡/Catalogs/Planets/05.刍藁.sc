// Object * eps Cet  ---  Spectroscopic Binary  ---  OID=@1309108   (@@26655,16)  ---  coobox=11185 
// Object types: Double or Multiple Star,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "EPS Cet A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "EPS Cet"
	Class           "F5V"
	AbsMagn         2.68
	MassSol         1.37
	Radius          1452371.68056879 // 计算的值
	LumBol          7.17
	Teff            6537
	FeH             -0.16
	Age             1.8

	BinaryOrbit     
	{
		Period          2.6512
		Separation      2.50176990897615 // 0.1063 asec
		Eccentricity    0.230
		Inclination     24.2
		AscendingNode   90.2
		Epoch           2456040.993583072908223
		ArgOfPericenter 220.8
		MeanAnomaly     0
	}
}

Star "EPS Cet B"
{
	DateUpdated     "2024-06-29"
	ParentBody      "EPS Cet"
	Class           "F7/G4V"
	MassSol         1.03
}