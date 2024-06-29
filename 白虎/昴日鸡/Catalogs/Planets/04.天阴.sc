// Object * 63 Ari  ---  High Proper Motion Star  ---  OID=@640353   (@@20674,5)  ---  coobox=4274 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "63 Ari A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "63 Ari"
	Class           "K3III"
	AbsMagn         0.17
	MassKg          3.29568340346543e+30 // log(g) = 2.1 cm/s^2
	RadSol          19
	LumBol          120
	Teff            4406
	FeH             0.02

	BinaryOrbit     
	{
		Separation      39.9431600477804 // 0.39 asec
	}
}

// Object * 63 Ari B  ---  Star  ---  OID=@11611680   (@@-1,255)  ---  coobox=4274 
// Object types: Double or Multiple Star,Star 
Star "63 Ari B/WDS J03228+2045B/** HDS 423B/TYC 1245-1185-2"
{
	ParentBody      "63 Ari"
	Class           "K4.4?"
}

// // Object * 66 Ari  ---  Double or Multiple Star  ---  OID=@640376   (@@20677,16)  ---  coobox=4273 
// // Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "66 Ari A"
{
	DateUpdated     "2024-06-29"
	ParentBody      "66 Ari"
	Class           "G9IV"
	AbsMagn         1.78 // 计算的值
	MassKg          2.61060270590174e+30 // log(g) = 3.0 cm/s^2
	RadSol          6
	LumBol          18
	Teff            4864

	BinaryOrbit     
	{
		Separation      57.1913903241213 // 0.810 asec
		PositionAngle   65
	}
}

Star "66 Ari B"
{
	ParentBody      "66 Ari"
	Class           "K0.5?"
}