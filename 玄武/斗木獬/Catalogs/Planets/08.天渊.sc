// Object * bet02 Sgr  ---  High Proper Motion Star  ---  OID=@3528939   (@@72659,13)  ---  coobox=24054 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "BET2 Sgr A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "BET2 Sgr"
	Class           "F2/3V"
	AbsMagn         1.20
	MassSol         1.43
	Radius          2094411.23318767 // 计算的值
	LumBol          20
	Teff            7035
	FeH             -0.54
	Age             0.933

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   28.5245616
		Eccentricity    0.210187398
		Inclination     1.13645649
		AscendingNode   0
		ArgOfPericenter -58.574861
		MeanAnomaly     101.366129
	}
}

Star "BET2 Sgr B"
{
	ParentBody      "BET2 Sgr"
	Class           "G0.6?"
}

// Object * bet01 Sgr  ---  Pulsating Variable  ---  OID=@3529058   (@@72660,14)  ---  coobox=24061 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source 
Remove "Arkab Prior A" {ParentBody "Arkab Prior"}
Remove "Arkab Prior B" {ParentBody "Arkab Prior"}
Star "BET1 Sgr A"
{
	DateUpdated     "2024-06-01"
	ParentBody      "BET1 Sgr"
	Class           "B9V"
	AbsMagn         -1.32
	MassSol         3.67
	RadSol          2.73
	LumBol          324
	Teff            11960
	FeH             -0.35
	Age             0.224

	BinaryOrbit     
	{
		Separation      3290
	}
}

Star "BET1 Sgr B"
{
	DateUpdated     "2024-06-01"
	ParentBody      "BET1 Sgr"
	Class           "A5V"
	RadSol          1.89
}