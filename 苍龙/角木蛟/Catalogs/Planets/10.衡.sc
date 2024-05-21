// Object * nu. Cen  ---  beta Cep Variable  ---  OID=@3421323   (@@46562,0)  ---  coobox=21765 
// Object types: beta Cep Variable,Near-IR Source (λ < 3 µm),Variable Star,Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Remove "NU Cen A" {ParentBody "NU Cen"}
Remove "NU Cen B" {ParentBody "NU Cen"}
Star "NU Cen A"
{
	DateUpdated     "2024-05-21"
	ParentBody      "HIP 67464"
	Class           "B2IV"
	AbsMagn         -2.4
	MassSol         8.5
	RadSol          6.4
	LumBol          5000
	Teff            22400
	Age             0.0182

	BinaryOrbit     
	{
		PeriodDays      2.622
		Eccentricity    0
		Epoch           2450894.32
	}
}

Star "NU Cen A"
{
	ParentBody      "HIP 67464"
	Class           "B8.6?" // 目前没有关于此伴星的任何信息
}

// Object * mu. Cen  ---  Be Star  ---  OID=@3421428   (@@62905,0)  ---  coobox=21764 
// Object types: Be Star,Emission-line Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "MU Cen A"
{
	DateUpdated     "2024-05-21"
	ParentBody      "MU Cen"
	Class           "B2Vnpe"
	AbsMagn         -2.48
	MassSol         9.1
	DimensionsSol   (8.4, 6.8, 8.4)
	LumBol          2089
	Temperature     (17600, 23000, 17600)
	Teff            22410
	Age             0.0198
	RotationPeriod  11.615
}