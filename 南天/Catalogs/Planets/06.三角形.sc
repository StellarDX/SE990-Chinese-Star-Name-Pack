// Object * alf TrA  ---  Star  ---  OID=@3400251   (@@68905,0)  ---  coobox=22238 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Atria A" {ParentBody "Atria"}
Remove "Atria B" {ParentBody "Atria"}
Star "ALF TrA A"
{
	DateUpdated     "2024-08-02"
	ParentBody      "ALF TrA"
	Class           "K2III_Ba1"
	AbsMagn         -3.68
	MassSol         7
	RadSol          167 // 143
	LumBol          5500
	Teff            4150
	FeH             -0.06
	Age             0.048

	BinaryOrbit     
	{
		Period          130
		Separation      50
	}
}

Star "ALF TrA B"
{
	DateUpdated     "2024-08-02"
	ParentBody      "ALF TrA"
	Class           "G0V"
}