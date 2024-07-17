// Object * kap Gem  ---  Double or Multiple Star  ---  OID=@1004126   (@@20971,0)  ---  coobox=5540 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "KAP Gem A" {ParentBody "KAP Gem"}
Remove "KAP Gem B" {ParentBody "KAP Gem"}
Star "KAP Gem A"
{
	DateUpdated     "2024-07-17"
	ParentBody      "Gaia DR3 867815979158660352"
	Class           "G8III-IIIb"
	AbsMagn         0.35
	MassSol         2.07
	RadSol          11
	LumBol          67.6
	Teff            4932
	FeH             -0.16
	Age             2.07
	RotationPeriod  2760

	BinaryOrbit     
	{
		Epoch           2456658
		Period          2900
		Separation      310
		PositionAngle   241
	}
}

Star "KAP Gem B"
{
	DateUpdated     "2024-07-17"
	ParentBody      "Gaia DR3 867815979158660352"
	Class           "G4V"
}