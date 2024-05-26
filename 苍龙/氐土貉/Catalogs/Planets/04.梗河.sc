// Object * eps Boo  ---  High Proper Motion Star  ---  OID=@2285332   (@@47953,16)  ---  coobox=13691 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Remove "Izar A" {ParentBody "Izar"}
Remove "Izar B" {ParentBody "Izar"}
Star "EPS Boo A"
{
	DateUpdated     "2024-05-26"
	ParentBody      "EPS Boo"
	Class           "K0II-III"
	AbsMagn         -1.61
	MassSol         4.6
	RadSol          33
	LumBol          501
	Teff            4550
	FeH             -0.20 // -0.13
	Age             0.0374

	BinaryOrbit     
	{
		Period          1000
		Separation      185
		PositionAngle   342.9
	}
}

Star "EPS Boo B"
{
	DateUpdated     "2024-05-26"
	ParentBody      "EPS Boo"
	Class           "A2V"
	MassSol         2.27
	RadSol          2.7
	LumBol          44.8
	Teff            9009
}