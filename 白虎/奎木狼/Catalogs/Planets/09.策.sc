// GAM Cas和旁边的HR 266拥有相似的移动方向，这表明它们可能存在物理关系，但是两颗恒星相距1275.5秒，近1个秒差距。
// 两个子系统均为四星系统，如果它们之间的物理关系被证实，则这个系统将会成为已知的第一个八星系统。

// Object * gam Cas  ---  High Mass X-ray Binary  ---  OID=@132509   (@@4449,0)  ---  coobox=2151 
// Object types: High Mass X-ray Binary,Near-IR Source (λ < 3 µm),Emission-line Star,Be Star,Variable Star,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source,Gamma-ray Source 
Barycenter "GAM Cas/HIP 4427/WISE J005642.67+604300.3/UCAC4 754-011026/Gaia DR3 426558460884582016/AT 0037+611/TIC 51962733/2MASS J00564251+6043002/[KRL2007b] 9/PLX 185/[JE82] 20/27 Cas/1H 0053+604/1M 0050+592/1M 0050+60/1RXS J005642.0+604300/1XRS 00537+604/2S 0053+604/3A 0053+604/4U 0054+60/AAVSO 0050+60/AG+60 106/ALS 6407/BD+59 144/BSD 8-901/CSI+59 144 1/EM* MWC 9/FK5 32/GC 1117/GCRV 526/HD 5394/HR 264/INTREF 57/IRAS 00536+6026/IRC +60031/JP11 439/LS I +60 133/MCW 46/N30 187/PMC 90-93 23/PPM 12597/RAFGL 133/SAO 11482/SKY# 1444/TD1 521/UBV 833/V* GAM Cas/VDB 5/[BM83] X0053+604/[FS2003] 0031/[HFE83] 40/[KW97] 4-31/PLX 185.00/1ES 0053+60.4/EUVE J0056+60.7/PBC J0056.5+6043/SWIFT J0056.7+6043/** BU 499A/SWIFT J0056.5+6042/HIC 4427/WEB 791/TYC 4017-2319-1/Gaia DR2 426558460877467776/** BU 1028A/PMSC 00507+6010A/GEN# +1.00005394/ADS 782 A/CCDM J00567+6043A/uvby98 100005394 A/WDS J00567+6043A"
{
	ParentBody      "GAM Cas Octuple System"
	BinaryOrbit     
	{
		Separation      214730.297598862 // 1275.5 asec
	}
}

// Object HD 5408  ---  Double or Multiple Star  ---  OID=@132271   (@@4433,7)  ---  coobox=2151 
// Object types: Double or Multiple Star,Double or Multiple Star,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Barycenter "HD 5408/Gaia DR3 426512590631144704/HIP 4440/IDS 00508+5959 AB/GEN# +1.00005408/TIC 51961599/2MASS J00564697+6021463/SBC9 49/SBC9 1726/ADS 784 AB/AG+60 107/BD+59 146/BSD 8-378/CCDM J00568+6022AB/CSI+59 146 1/GC 1120/GCRV 529/GSC 04017-01864/Glazar Cas1 6/HIC 4440/HR 266/PPM 12601/ROT 150/SAO 11484/SBC7 36/SKY# 1448/TD1 524/TYC 4017-1864-1/UBV 835/YZ 60 783/WDS J00568+6022AB/** BU 1099AB/** BU 1353AB/PMSC 00508+5949/uvby98 100005408/WEB 796/CSI+59 146 3/Gaia DR2 426512590631144704/CSI+59 146 4"
{
	ParentBody      "GAM Cas Octuple System"
}

// ---------------------------------------- GAM Cas ----------------------------------------
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=4427

Barycenter "GAM Cas A"
{
	ParentBody      "GAM Cas"
	BinaryOrbit     
	{
		Period          1694
		Separation      294.613231787455 // 1.75 asec
	}
}

Barycenter "GAM Cas Aab"
{
	ParentBody      "GAM Cas A"
	BinaryOrbit // VB6_Gon2000 BU_1028A Gr.7
	{
		Period          60
		Separation      25.252467659059 // 0.15 asec
	}
}

Star "GAM Cas Aa"
{
	DateUpdated     "2024-06-21"
	ParentBody      "GAM Cas Aab"
	Class           "B0.5IVpe"
	AbsMagn         -3.98
	MassSol         13
	RadSol          10
	LumBol          34000
	Teff            25000
	Age             0.008

	BinaryOrbit // 2001A&A.364.L85 Harmanec+
	{
		PeriodDays      203.59
		Eccentricity    0.26
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2450576
		ArgOfPericenter 23
		MeanAnomaly     0
	}
}

Star "GAM Cas Ab"
{
	DateUpdated     "2024-06-21"
	ParentBody      "GAM Cas Aab"
	Class           ""
	MassSol         0.98
}

Star "GAM Cas Ac"
{
	ParentBody      "GAM Cas A"
	Class           "B3.6?"
}

// Object * gam Cas B  ---  Star  ---  OID=@12660870   (@@-1,255)  ---  coobox=2151 
// Object types: Double or Multiple Star,Star 
Star "GAM Cas B/** BU 1028B/CCDM J00567+6043B/WDS J00567+6043B/Gaia DR2 426558460877466240"
{
	DateUpdated     "2024-06-21"
	ParentBody      "GAM Cas"
	Class           ""
	MassSol         1.02
}

// ---------------------------------------- HR 266 ----------------------------------------
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HR&number=266

Barycenter "HR 266 A"
{
	ParentBody      "HD 5408"
	BinaryOrbit // Tok 2021
	{
		Period          84.1
		Separation      39.1090836548886 // 0.237 asec
		Eccentricity    0.225
		Inclination     53.6
		AscendingNode   171.5
		Epoch           2434593.642952673602849
		ArgOfPericenter 343.5
		MeanAnomaly     0
	}
}

Star "HR 266 Aa"
{
	DateUpdated     "2024-06-21"
	ParentBody      "HR 266 A"
	Parallax        6.06
	AppMagn         5.566
	Class           "B7Vn"
	AbsMagn         -0.52 // 计算的值
	MassSol         3.39
}

Barycenter "HR 266 Ab"
{
	ParentBody      "HR 266 A"
	BinaryOrbit // Tok 2021
	{
		Period          4.899
		Separation      5.12955482862369 // 0.031 asec
		Eccentricity    0.26
		Inclination     47.3
		AscendingNode   146.8
		Epoch           2452846.621836754493415
		ArgOfPericenter 279.2
		MeanAnomaly     0
	}
}

Star "HR 266 Ab1"
{
	DateUpdated     "2024-06-21"
	ParentBody      "HR 266 Ab"
	Class           "B9VHgMn"
	MassSol         2.44

	BinaryOrbit // SB9_49 1992AJ....103.1357C
	{
		PeriodDays      4.2411
		Eccentricity    0.415
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2445971.574
		ArgOfPericenter 252.8
		MeanAnomaly     0
	}
}

Star "HR 266 Ab2"
{
	DateUpdated     "2024-06-21"
	ParentBody      "HR 266 Ab"
	Class           "A1V"
	MassSol         1.64
}

Star "HR 266 B"
{
	DateUpdated     "2024-06-21"
	ParentBody      "HD 5408"
	Class           ""
	MassSol         3.39
}
