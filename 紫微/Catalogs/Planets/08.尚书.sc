// Object * g Dra  ---  Star  ---  OID=@375622   (@@8835,7)  ---  coobox=1212 
// Object types: Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "HD 151101 A"
{
	DateUpdated     "2024-04-28"
	ParentBody      "HD 151101"
	Class           "K0IIICN-0.5CH-2Ca1"
	AbsMagn         -1.92
	MassSol         3.81
	RadSol          46.83
	LumBol          786.7
	Teff            4471
	FeH             -0.13
	Age             0.280

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   186.844244
		Eccentricity    0.593526197
		Inclination     -2.01426601
		AscendingNode   0
		ArgOfPericenter -83.5297737
		MeanAnomaly     47.73157
	}
}

Star "HD 151101 B"
{
	ParentBody      "HD 151101"
	Class           "A0.1?"
}

// Object * h Dra  ---  Spectroscopic Binary  ---  OID=@362744   (@@8817,0)  ---  coobox=1209 
// Object types: Spectroscopic Binary,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "19 Dra A"
{
	DateUpdated     "2024-04-28"
	ParentBody      "19 Dra"
	Class           "F8V"
	AbsMagn         3.98
	MassSol         1.04
	RadSol          1.2
	LumBol          2.02
	Teff            6298
	FeH             0.013
	Age             4.7

	BinaryOrbit
	{
		PeriodDays      52.1089
		Separation      1.30482286410708 // 20.0 mas
		Eccentricity    0.2221
		Inclination     90.5
		AscendingNode   23.5
		Epoch           2453427.880
		ArgOfPericenter 158.46
		MeanAnomaly     0
	}
}

Star "19 Dra B"
{
	ParentBody      "19 Dra"
	Class           ""
	MassSol         0.37
	RadSol          0.3
	LumBol          0.02
	Teff            3963
}