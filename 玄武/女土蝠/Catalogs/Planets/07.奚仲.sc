// Object * tet Cyg  ---  High Proper Motion Star  ---  OID=@233451   (@@10668,0)  ---  coobox=294 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab显示E可能还有一颗伴星Eb，Wikipedia也说B可能为两颗红矮星组成的双星。
Barycenter "TET Cyg AB"
{
	ParentBody      "TET Cyg"
	BinaryOrbit     
	{
		Period          68490
		Separation      2149.98283444135 // 116.68 asec
	}
}

Star "TET Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "TET Cyg AB"
	Class           "F3V"
	AbsMagn         3.14
	MassSol         1.4
	RadSol          1.462
	LumBol          4.232
	Teff            6853
	FeH             -0.02
	Age             1.0 // 1.6

	BinaryOrbit     
	{
		Period          208.530
		Separation      46
	}
}

Star "TET Cyg B"
{
	DateUpdated     "2024-06-10"
	ParentBody      "TET Cyg AB"
	Class           "M3V"
	MassSol         0.35
	RadSol          0.36
	LumBol          0.01
	Teff            3000 // 3500
}

// Object UCAC3 281-150921  ---  Eruptive Variable  ---  OID=@233784   (@@114731,6)  ---  coobox=294 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Eruptive Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star 
Barycenter "UCAC3 281-150921/AP J19361440+5013096/Gaia DR3 2135110259540829824/TIC 27014175/2MASS J19361440+5013096/USNO-A2.0 1350-10782004/USNO-B1.0 1402-00339351/WISEA J193614.38+501312.9/UCAC4 702-066496/** SKF 1976E/WDS J19364+5013E/Gaia DR2 2135110259540829824/KIC 11918550"
{
	ParentBody      "TET Cyg"
}

Star "KIC 11918550 A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "UCAC3 281-150921"
	Parallax        54.6659
	AppMagn         12.88
	Class           "K8V"
	AbsMagn         11.57 // 计算的值
	MassSol         0.35
	RadSol          0.28
	LumBol          0.013
	Teff            3700

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.305623782
		Eccentricity    0.233275246
		Inclination     2.44730594
		AscendingNode   0
		ArgOfPericenter 84.5186571
		MeanAnomaly     -137.341452
	}
}

Star "KIC 11918550 B(?)"
{
	ParentBody      "UCAC3 281-150921"
	Class           "M6.3?"
}

Planet "TET Cyg b"
{
	ParentBody      "TET Cyg A"
	DiscMethod      "RadVel"
	DiscDate        "2009"
	MassJup         2.3

	Orbit     
	{
		SemiMajorAxis   0.635
		PeriodDays      154.5
		Eccentricity    0
	}
}

// Object * 16 Cyg A  ---  Double or Multiple Star  ---  OID=@233459   (@@10671,0)  ---  coobox=294 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=96895
Remove "16 Cyg (AC)"{ParentBody "16 Cyg"}
Remove "16 Cyg B"{ParentBody "16 Cyg"}
Remove "16 Cyg A"{ParentBody "16 Cyg (AC)"}
Remove "16 Cyg C"{ParentBody "16 Cyg (AC)"}
Remove "16 Cyg B b"{ParentBody "16 Cyg B"}
Barycenter "16 Cyg AC"
{
	ParentBody      "IDS 19392+5017 AB"
	BinaryOrbit // VB6_Mrc1999 STFA_46AB Gr.4 (Combined)
	{
		Period          18200 // 18200 - 1.3E6
		Separation      877 // 877 - 15180, 35.242 asec
		Eccentricity    0.863
		Inclination     135.4 // 100 - 160
		AscendingNode   313.4
		Epoch           1777033.502799288136885
		ArgOfPericenter 26.6
		MeanAnomaly     0
	}
}

Star "16 Cyg A/GJ 765.1 A/HIP 96895/WDS J19418+5032Aa/** TRN 4Aa/Gaia DR3 2135550755683405952/TIC 27533341/PLX 4634/TYC 3565-1524-1/ASCC 271116/2MASS J19414896+5031305/USNO-B1.0 1405-00322518/ADS 12815 A/AG+50 1407/BD+50 2847/CCDM J19418+5031A/GC 27284/GCRV 12083/GEN# +1.00186408/HD 186408/HIC 96895/HR 7503/IDS 19392+5017 A/JP11 3128/LTT 15750/NLTT 48136/PPM 37671/ROT 2839/SAO 31898/SKY# 36804/SPOCS 854/UBV 16779/UBV M 24079/USNO 889/YZ 50 6149/uvby98 100186408/LSPM J1941+5031W/AKARI-IRC-V1 J1941488+503129/WDS J19418+5032A/** STF 4046A/Gaia DR1 2135550751385079552/WEB 17003/Gaia DR2 2135550755683405952/KIC 12069424"
{
	DateUpdated     "2024-06-10"
	ParentBody      "16 Cyg AC"
	Parallax        47.3239
	AppMagn         5.95
	Class           "G1.5Vb"
	AbsMagn         4.29
	MassSol         1.08
	RadSol          1.229
	LumBol          1.55
	Teff            5830
	FeH             0.101
	RotationPeriod  571.2
	Age             7.07

	BinaryOrbit     
	{
		Period          486.960
		Separation      73
	}
}

// Object * 16 Cyg C  ---  High Proper Motion Star  ---  OID=@19651187   (@@-1,255)  ---  coobox=294 
// Object types: High Proper Motion Star,Star 
Star "16 Cyg C/Gaia DR2 2135550755684554112/Gaia DR3 2135550755684554112"
{
	DateUpdated     "2024-06-10"
	ParentBody      "16 Cyg AC"
	Parallax        47.3292
	Class           "M?V"
	MassSol         0.26
}

// Object * 16 Cyg B  ---  High Proper Motion Star  ---  OID=@233452   (@@10669,0)  ---  coobox=294 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Star 
Star "16 Cyg B/GJ 765.1 B/HIP 96901/Gaia DR3 2135550755683407232/TIC 27533327/TYC 3565-1525-1/ASCC 271120/2MASS J19415198+5031032/USNO-B1.0 1405-00322540/ADS 12815 B/AG+50 1408/BD+50 2848/CCDM J19418+5031B/GC 27285/GCRV 12084/GEN# +1.00186427/HD 186427/HIC 96901/HR 7504/IDS 19392+5017 B/LTT 15751/NLTT 48138/PPM 37673/ROT 2840/SAO 31899/SKY# 36807/SPOCS 855/UBV 16780/UBV M 24082/USNO 890/YZ 50 6150/Gaia DR2 2135550755683407232/LSPM J1941+5031E/WDS J19418+5032B/AKARI-IRC-V1 J1941518+503102/** STF 4046B/WISEA J194151.82+503102.2/Gaia DR1 2135550854464294784/WEB 17005/KIC 12069449"
{
	DateUpdated     "2024-06-10"
	ParentBody      "IDS 19392+5017 AB"
	Parallax        47.3302
	AppMagn         6.2
	Class           "G2.5Vb"
	AbsMagn         4.53
	MassSol         1.04
	RadSol          1.116
	LumBol          1.25
	Teff            5751
	FeH             0.054
	RotationPeriod  556.8
	Age             6.74
}

// Object * 16 Cyg Bb  ---  Extra-solar Planet  ---  OID=@233453   (@@10669,1)  ---  coobox=294
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"16 Cyg Bb/HD 186427b"
{
	ParentBody     "16 Cyg B"
	DiscMethod     "RadVel"
	DiscDate       "1996"
	MassJup        2.38

	Surface {Preset "neptune_temperate_default.cfg"}
	Rings {}

	Orbit
	{
		SemiMajorAxis   1.693
		PericenterDist  0.54
		Eccentricity    0.689
		PeriodDays      799.5
		Inclination     45 // 135
		Epoch           2446549.1
		ArgOfPericen    83.4
	}
}
