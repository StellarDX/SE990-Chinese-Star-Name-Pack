// Object * 14 Aur  ---  delta Sct Variable  ---  OID=@779729   (@@21537,0)  ---  coobox=4544 
// Object types: delta Sct Variable,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=24504
Remove "14 Aur A"{ParentBody "14 Aur"}
Remove "14 Aur C"{ParentBody "14 Aur"}
Remove "14 Aur Aa"{ParentBody "14 Aur A"}
Remove "14 Aur Ab"{ParentBody "14 Aur A"}
Remove "14 Aur (Ca)"{ParentBody "14 Aur C"}
Remove "14 Aur Cb"{ParentBody "14 Aur C"}
Remove "14 Aur Caa"{ParentBody "14 Aur (Ca)"}
Remove "14 Aur Cab"{ParentBody "14 Aur (Ca)"}
Barycenter "14 Aur A"
{
	ParentBody      "HIP 24504"
	BinaryOrbit     
	{
		Period          17604
		Separation      1186.25443075877 // 14.25 asec
	}
}

Star "14 Aur A1"
{
	DateUpdated     "2024-07-03"
	ParentBody      "14 Aur A"
	Class           "A8III"
	AbsMagn         0.31
	MassSol         1.64
	Radius          3248068.38814021 // 计算的值
	LumBol          62.07
	Teff            7498
	FeH             0.02
	Age             0.609

	BinaryOrbit // SB9_305 1998ApJ...502..763V
	{
		PeriodDays      3.7881
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2450012.285
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "14 Aur A2"
{
	DateUpdated     "2024-07-03"
	ParentBody      "14 Aur A"
	Class           ""
	MassSol         0.27
}

// Object * 14 Aur C  ---  X-ray Binary  ---  OID=@779715   (@@21535,3)  ---  coobox=4544 
// Object types: Near-IR Source (λ < 3 µm),X-ray Binary,Double or Multiple Star,White Dwarf,Spectroscopic Binary,Star,UV-emission Source,X-ray Source 
Barycenter "14 Aur C/HIP 24502/Gaia DR3 180702438220219904/TIC 1840658/2RXF J051523.5+324109/2MASS J05152360+3241052/2RE J051523+324045/2RE J0515+324/ADS 3824 C/AG+32 491/BD+32 922C/CCDM J05154+3242C/CSI+32 922 2/GC 6409/GCRV 55940/GEN# +1.30033959/GEN# +1.00033959C/GSC 02394-02029/HD 33959C/HIC 24502/IDS 05089+3234/PPM 70095/RE J051523+324044/RE J0515+324/SAO 57798/TYC 2394-2029-1/UBV 5005/WD 0512+326/[HFE83] 363/2EUVE J0515+32.6/EUVE J0515+32.6/WDS J05154+3241C/PMSC 05089+3234C/PMSC 05089+3234Ca/UBV 5006/CSI+32 922 4/WDS J05154+3241Ca,Cb/** STF 653C/** BAS 5/RX J0515.3+3241/[FS2003] 0253/1RXS J051523.8+324107/Gaia DR1 180702433923874176/Gaia DR2 180702438220219904/SBC9 1484"
{
	ParentBody      "HIP 24504"
}

Barycenter "14 Aur Ca"
{
	ParentBody      "HIP 24502"
	BinaryOrbit     
	{
		Period          1518
		Separation      164.973683197953 // 2.022 asec
	}
}

Star "14 Aur Ca1"
{
	DateUpdated     "2024-07-03"
	ParentBody      "14 Aur Ca"
	Parallax        12.2565
	AppMagn         7.88
	Class           "F2V"
	AbsMagn         3.32 // 计算的值
	MassKg          2.21462490655691e+30 // log(g) = 4.168 cm/s^2
	RadSol          1.440227 // Gaia DR3
	LumBol          3.49039336207989 // 计算的值
	Teff            6574
	FeH             -0.385

	BinaryOrbit // SB9_1484 1998ApJ...502..763V
	{
		PeriodDays      2.9931
		Eccentricity    0.000
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2450013.191
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "14 Aur Ca2"
{
	DateUpdated     "2024-07-03"
	ParentBody      "14 Aur Ca"
	Class           "M3V:"
	MassSol         0.27
}

Star "14 Aur D"
{
	DateUpdated     "2024-07-03"
	ParentBody      "HIP 24502"
	Class           "DA1.3"
	MassSol         0.5
}

// Object * mu. Aur  ---  Double or Multiple Star  ---  OID=@755548   (@@22358,18)  ---  coobox=4405 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "MU Aur A"
{
	DateUpdated     "2024-07-03"
	ParentBody      "MU Aur"
	Class           "A4m" // kA3hA8VmA8
	AbsMagn         1.47
	MassSol         2.09
	RadSol          3.15
	LumBol          22.95
	Teff            7500
	FeH             -0.3
	Age             0.560

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.381077395
		Eccentricity    0.619104238
		Inclination     1.48995388
		AscendingNode   0
		ArgOfPericenter 21.4374122
		MeanAnomaly     -148.826712
	}
}

Star "MU Aur B"
{
	ParentBody      "MU Aur"
	Class           "F0.9?"
}