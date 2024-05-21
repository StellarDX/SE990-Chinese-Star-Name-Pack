// Object * tet Vir  ---  Double or Multiple Star  ---  OID=@2112996   (@@43381,0)  ---  coobox=15472 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=64238
Remove "TET Vir (ABC)"{ParentBody "TET Vir"}
Remove "TET Vir A"{ParentBody "TET Vir (ABC)"}
Remove "TET Vir Aa"{ParentBody "TET Vir A"}
Remove "TET Vir Ab"{ParentBody "TET Vir A"}
Remove "TET Vir B"{ParentBody "TET Vir (ABC)"}
Remove "TET Vir C"{ParentBody "TET Vir"}
Barycenter "TET Vir Aab"
{
	ParentBody      "TET Vir"
	BinaryOrbit     
	{
		Period          8117
		Separation      626.553652567412 // 7.007 asec
	}
}

Barycenter "TET Vir Aa"
{
	ParentBody      "TET Vir Aab"
	BinaryOrbit     
	{
		Period          695.0000
		Separation      111.146582638193 // 1.243 asec
		Eccentricity    0.720
		Inclination     74.7
		AscendingNode   126.8
		Epoch           2427913.363136969506741
		ArgOfPericenter 124.8
		MeanAnomaly     0
	}
}

Star "TET Vir Aa1"
{
	DateUpdated     "2024-05-20"
	ParentBody      "TET Vir Aa"
	Class           "A1IVs"
	AbsMagn         -0.52
	MassSol         3.11
	Radius          3733950.00904364 // 计算的值
	LumBol          190
	Teff            9250

	BinaryOrbit     
	{
		Period          17.8400
		Eccentricity    0.330
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2440477.694775035604835
		ArgOfPericenter 301.8
		MeanAnomaly     0
	}
}

Star "TET Vir Aa2"
{
	DateUpdated     "2024-05-20"
	ParentBody      "TET Vir Aa"
	Class           ""
	MassSol         0.69
}

Star "TET Vir Ab"
{
	DateUpdated     "2024-05-20"
	ParentBody      "TET Vir Aab"
	Class           "A9m"
	MassSol         2.01
}

Star "TET Vir B"
{
	DateUpdated     "2024-05-20"
	ParentBody      "TET Vir"
	Class           ""
	MassSol         1.53
}