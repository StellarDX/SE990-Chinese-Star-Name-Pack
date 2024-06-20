// Object * 18 Cet  ---  High Proper Motion Star  ---  OID=@1315635   (@@27092,0)  ---  coobox=10644 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=3559
Star "18 Cet A"
{
	DateUpdated     "2024-06-20"
	ParentBody      "18 Cet"
	Class           "G0V"
	AbsMagn         3.6 // 计算的值
	MassSil         1.28
	RadSol          1.805159 // Gaia DR3
	LumBol          3.1471396465391 // 计算的值
	Teff            5722
	FeH             -0.372
}

Barycenter "18 Cet B"
{
	ParentBody      "18 Cet"
	BinaryOrbit     
	{
		Period          1150
		Separation      128.782582422795 // 3.977 asec
	}
}

Star "18 Cet Ba" // 双星凌日
{
	DateUpdated     "2024-06-20"
	ParentBody      "18 Cet B"
	Class           ""
	MassSol         0.33

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.0386179809
		Eccentricity    0
		Inclination     -1.25366926
		AscendingNode   0
		ArgOfPericenter 116.036815
		MeanAnomaly     -1.90560607
	}
}

Star "18 Cet Bb"
{
	ParentBody      "18 Cet B"
	Class           "M4.1?"
}