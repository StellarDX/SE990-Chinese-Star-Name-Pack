// Object * tau Dra  ---  High Proper Motion Star  ---  OID=@300625   (@@7396,1)  ---  coobox=880 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Star "TAU Dra A"
{
	DateUpdated     "2024-04-28"
	ParentBody      "TAU Dra"
	Class           "K2IIIbCN1"
	AbsMagn         +1.19
	MassSol         1.25
	Radius          8245707.5570747 // 计算的值
	LumBol          48
	Teff            4413
	FeH             0.17
	Age             6.48

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.505776842
		Eccentricity    0
		Inclination     -1.23908615
		AscendingNode   0
		ArgOfPericenter -162.987509
		MeanAnomaly     20.8412562
	}
}

Star "TAU Dra B"
{
	ParentBody      "TAU Dra"
	Class           "F2.1?"
}

// Object * 50 Dra  ---  Spectroscopic Binary  ---  OID=@300636   (@@7396,14)  ---  coobox=883 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=92112
Barycenter "50 Dra A"
{
	ParentBody      "50 Dra"
	BinaryOrbit
	{
		Period          71.725
		Separation      30.0482937792945 // 0.343 asec
	}
}

Star "50 Dra Aa"
{
	DateUpdated     "2024-04-28"
	ParentBody      "50 Dra A"
	Class           "A1Vn"
	AbsMagn         0.64 // 计算的值
	MassKg          5.13089703879497e+30 // log(g) = 3.934 cm/s^2
	RadSol          2.869971 // Gaia DR3
	LumBol          62.29589859950227 // 计算的值
	Teff            9572
	FeH             0.214

	BinaryOrbit // SB9_1097 1919JRASC..13..236H
	{
		PeriodDays      4.1175
		Eccentricity    0.010
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2420293.520
		ArgOfPericenter 107.6
		MeanAnomaly     0
	}
}

Star "50 Dra Ab"
{
	ParentBody      "50 Dra A"
	Class           ""
	MassSol         2.03
}

Star "50 Dra B"
{
	ParentBody      "50 Dra"
	Class           ""
	MassSol         1.06
}

// Object * 29 Dra  ---  RS CVn Variable  ---  OID=@328567   (@@7432,0)  ---  coobox=1569 
// Object types: Spectroscopic Binary,High Proper Motion Star,Spectroscopic Binary,White Dwarf,Variable Star,RS CVn Variable,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "29 Dra A" {ParentBody "29 Dra"}
Remove "29 Dra B" {ParentBody "29 Dra"}
Star "29 Dra A"
{
	DateUpdated     "2024-04-28"
	ParentBody      "HIP 85852"
	Class           "K0III"
	AbsMagn         1.96 // 计算的值
	MassKg          3.56022533128872e+30 // log(g) = 2.893 cm/s^2
	RadSol          7.925371 // Gaia DR3
	LumBol          36.65874250630594 // 计算的值
	Teff            5045
	FeH             -0.053

	BinaryOrbit // 未修改
	{
		Period          2.4762
		Separation      2.2084
		Eccentricity    0.072
		Inclination     156.2
		AscendingNode   349.8
		ArgOfPericenter 297.5
		Epoch           2447479.67
		MeanAnomaly     0
	}
}

Star "29 Dra B"
{
	ParentBody      "HIP 85852"
	Class           "DA1.5"
	Teff            28795
}

// Object * chi Dra  ---  Spectroscopic Binary  ---  OID=@314897   (@@7878,2)  ---  coobox=862 
// Object types: Spectroscopic Binary,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "CHI Dra A" {ParentBody "CHI Dra"}
Remove "CHI Dra B" {ParentBody "CHI Dra"}
Star "CHI Dra A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "GJ 713"
	Class           "F7V"
	AbsMagn         4.04
	MassSol         1.029
	RadSol          1.20
	LumBol          1.86
	Teff            6150
	FeH             -0.41
	Age             5.3

	BinaryOrbit
	{
		Period          0.7680599
		Separation      15.4388723337401 // 0.1244 asec
		Eccentricity    0.428
		Inclination     74.42
		AscendingNode   230.30
		Epoch           2446004.685823869425803
		ArgOfPericenter 299.3
		MeanAnomaly     0
	}
}

Star "CHI Dra B"
{
	ParentBody      "GJ 713"
	Class           "K0V"
	MassSol         0.748
	RadSol          0.73
	LumBol          0.29
	Teff            4940
}