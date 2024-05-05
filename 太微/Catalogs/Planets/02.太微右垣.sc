// Object * sig Leo  ---  High Proper Motion Star  ---  OID=@1805652   (@@37499,4)  ---  coobox=13259 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "SIG Leo A"
{
	DateUpdated     "2024-05-05"
	ParentBody      "SIG Leo"
	Class           "B9.5Vs"
	AbsMagn         -0.10
	MassSol         2.76
	RadSol          3.3
	LumBol          133
	Teff            10250
	FeH             0.0
	Age             0.293

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   10.7498659
		Eccentricity    0.67152301
		Inclination     0.259807587
		AscendingNode   0
		ArgOfPericenter 86.3085891
		MeanAnomaly     -135.512821
	}
}

Star "SIG Leo B"
{
	ParentBody      "SIG Leo"
	Class           "A0.5?"
}

// Object * iot Leo  ---  Spectroscopic Binary  ---  OID=@1805243   (@@37491,0)  ---  coobox=13249 
// Object types: Spectroscopic Binary,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "IOT Leo A" {ParentBody "IOT Leo"}
Remove "IOT Leo B" {ParentBody "IOT Leo"}
Barycenter "IOT Leo A"
{
	ParentBody      "HIP 55642"
	BinaryOrbit     
	{
		Period          186
		Separation      45.2178289314068 // 1.91 asec
		Eccentricity    0.53
		Inclination     128
		AscendingNode   235
		Epoch           2432844.132820512633771
		ArgOfPericenter 145
		MeanAnomaly     0
	}
}

// Object * iot Leo  ---  Spectroscopic Binary  ---  OID=@1805243   (@@37491,0)  ---  coobox=13249 
// Object types: Spectroscopic Binary,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "IOT Leo Aa"
{
	DateUpdated     "2024-05-05"
	ParentBody      "IOT Leo A"
	Class           "F3V"
	AbsMagn         2.13
	MassSol         1.62
	RadSol          2.1
	LumBol          11.5
	Teff            6739
	FeH             0.06
	Age             1.7

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0930483447
		Eccentricity    0.244288406
		Inclination     0.187761307
		AscendingNode   0
		ArgOfPericenter 40.1242441
		MeanAnomaly     8.25530115
	}
}

Star "IOT Leo Ab"
{
	ParentBody      "IOT Leo A"
	Class           "G2?"
}

Star "IOT Leo B"
{
	ParentBody      "HIP 55642"
	Class           ""
	MassSol         1.08
}
