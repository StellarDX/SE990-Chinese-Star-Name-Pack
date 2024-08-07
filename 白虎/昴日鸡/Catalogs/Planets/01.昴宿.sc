// Object * q Tau  ---  Spectroscopic Binary  ---  OID=@674152   (@@21077,0)  ---  coobox=4298 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "19 Tau A"
{
	DateUpdated     "2024-06-28"
	ParentBody      "19 Tau"
	Class           "B6IV"
	AbsMagn         -0.88 // 计算的值(+0.08消光)
	MassSol         4.5
	LumBol          600

	BinaryOrbit     
	{
		PeriodDays      1313
		Separation      0.115331136932171 // 0.012 asec
	}
}

Star "19 Tau B"
{
	DateUpdated     "2024-06-28"
	ParentBody      "19 Tau"
	Class           ""
	MassSol         3.2
	LumBol          150
}

// Object * eta Tau  ---  Be Star  ---  OID=@676410   (@@21109,0)  ---  coobox=4320 
// Object types: High Proper Motion Star,Double or Multiple Star,Emission-line Star,Be Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 

// SpaceEngineer: B, C and D must be independent stars, separation of >0.1 pc
// is too much for being physically bound. They three are also to close to each
// other to form a stable system.
// Also added third component of Alcyone A and double Alcyone D.

// Uncomment Alcyone A, B, C, D designations, and change ParentBody
// of "Alcyone Aa" and "Alcyone Ab" to "Alcyone A"
// to turn it into a septuple system.

// 丹霞：有些人说，昴宿六周围环绕着3颗星，共同组成了一个距离非常近的系统。
// 也就是这三颗星距离昴宿六很近，应该存在物理关系。
// 但毛子说的也不是没道理，如果把这三颗星算进去后，那就是7星系统，整个系统的稳定性就堪忧了。
// Wikipedia上对于这些小伴星几乎也是一个字都没提，而且也不知道整个系统是怎么运作的。
// 所以两种可能都会有，这三颗星要么是物理伴星，要么是光学伴星。(一头雾水 = = )

Remove "Alcyone Aa"{ParentBody "Alcyone"}
Remove "Alcyone Aaa"{ParentBody "Alcyone Aa"}
Remove "Alcyone Aab"{ParentBody "Alcyone Aa"}
Remove "Alcyone Ab"{ParentBody "Alcyone"}

// 数据来源：Multiple Star Catalog
// https://en.wikipedia.org/wiki/Alcyone_(star)
// http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=17702

// 丹霞(2024)：先前使用月掩法发现有两颗伴星位于距离主星1秒的范围以内，但2021年的一篇论文证实了昴宿六为单星。
// 旁边绕着的几颗小星仅仅只是昴宿星团的成员恒星，与主星无物理关系。

// Object * 27 Tau  ---  Spectroscopic Binary  ---  OID=@675903   (@@20724,0)  ---  coobox=4320 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=17847
Barycenter "27 Tau Aa"
{
	ParentBody      "27 Tau"
	BinaryOrbit     
	{
		Period          259.796
		Separation      96.5705162828935 // 0.784 asec
	}
}

Star "27 Tau Aa1"
{
	DateUpdated     "2024-06-28"
	ParentBody      "27 Tau Aa"
	Class           "B8III"
	AbsMagn         -1.82
	MassSol         4.74
	RadSol          5.98
	LumBol          1070.1166473070143 // 计算的值
	Teff            13500

	BinaryOrbit // VB6_Zwa2004 MKT_12Aa1 Gr.1
	{
		PeriodDays      290.984
		Separation      1.62210766411655 // 13.08 mas
		Eccentricity    0.2385
		Inclination     107.87
		AscendingNode   154.0
		Epoch           2450583.0
		ArgOfPericenter 331.9
		MeanAnomaly     0
	}
}

Star "27 Tau Aa2"
{
	DateUpdated     "2024-06-28"
	ParentBody      "27 Tau Aa"
	Class           ""
	MassSol         3.42
	RadSol          3.2
	LumBol          321.21545461930117 // 计算的值
	Teff            13660
}

Star "27 Tau Ab"
{
	DateUpdated     "2024-06-28"
	ParentBody      "27 Tau"
	Class           ""
	MassSol         2.09
}