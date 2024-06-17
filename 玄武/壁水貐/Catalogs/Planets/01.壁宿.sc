// Object * gam Peg  ---  beta Cep Variable  ---  OID=@1450034   (@@30219,0)  ---  coobox=11340 
// Object types: beta Cep Variable,Blue Object,Double or Multiple Star,Variable Star,beta Cep Variable,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Star,Star,Infra-Red Source,UV-emission Source 
Remove "GAM Peg A" {ParentBody "GAM Peg"}
Remove "GAM Peg B" {ParentBody "GAM Peg"} // B似乎也是光学伴星
Star "GAM Peg A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "HD 886"
	Class           "B2IV"
	AbsMagn         -2.64
	MassSol         8.9
	RadSol          4.80
	LumBol          5840
	Teff            21179
	FeH             -0.34
	Age             0.0187
}

// Object * alf And  ---  alpha2 CVn Variable  ---  OID=@1502055   (@@31443,0)  ---  coobox=11538 
// Object types: alpha2 CVn Variable,Spectroscopic Binary,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "Alpheratz A" {ParentBody "Alpheratz"}
Remove "Alpheratz B" {ParentBody "Alpheratz"}
Star "ALF And A"
{
	DateUpdated     "2024-06-17"
	ParentBody      "ALF And"
	Class           "B8IV-VHgMn"
	AbsMagn         -0.193
	MassSol         3.63
	RadSol          2.94
	LumBol          158
	Teff            11950
	RotationPeriod  57.12
	Age             0.200 // 0.06

	BinaryOrbit     
	{
		PeriodDays      96.69
		Separation      0.7146
		Eccentricity    0.526
		Inclination     105.8
		AscendingNode   104.46
		Epoch           2447374.563
		ArgOfPericenter 77.4
		MeanAnomaly     0
	}
}

Star "ALF And B"
{
	DateUpdated     "2024-06-17"
	ParentBody      "ALF And"
	Class           "A7V"
	AbsMagn         1.797
	MassSol         1.875
	RadSol          2.03
	LumBol          14.79
	Teff            7935
	Age             0.447 // 0.07
}