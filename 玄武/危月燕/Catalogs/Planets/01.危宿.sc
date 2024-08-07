// Object * tet Peg  ---  High Proper Motion Star  ---  OID=@1410742   (@@29240,2)  ---  coobox=9392 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "TET Peg A"
{
	DateUpdated     "2024-06-12"
	ParentBody      "TET Peg"
	Class           "A1Va"
	AbsMagn         1.24
	MassSol         2.09
	RadSol          2.6225
	LumBol          23.7012
	Teff            7872
	FeH             -0.38
	Age             0.448

	BinaryOrbit     
	{
		Separation      6.55
		Eccentricity    0.54
		Inclination     66.7
	}
}

Star "TET Peg B"
{
	DateUpdated     "2024-06-12"
	ParentBody      "TET Peg"
	Class           ""
	MassSol         0.280
	Radius          108403.024420158 // log(g) = 5.5 cm/s^2
	LumBol          0.0022936776513431795 // 计算的值
	Teff            3200
}