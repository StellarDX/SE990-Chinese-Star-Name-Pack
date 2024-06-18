// Object * tet And  ---  Double or Multiple Star  ---  OID=@1544647   (@@32324,9)  ---  coobox=11599 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "TET And A"
{
	DateUpdated     "2024-06-18"
	ParentBody      "TET And"
	Class           "A2V"
	AbsMagn         -0.25
	MassSol         2.83
	Radius          3069010.44597065 // 计算的值
	LumBol          113
	Teff            8960
	FeH             0.14

	BinaryOrbit     
	{
		PeriodDays      1033
		Separation      1
		Eccentricity    0.95
		Inclination     69
		AscendingNode   263
		Epoch           238
		ArgOfPericenter 269
		MeanAnomaly     0
	}
}

Star "TET And B"
{
	ParentBody      "TET And"
	Class           "A"
}