// Object * rho Gem  ---  High Proper Motion Star  ---  OID=@967559   (@@22095,0)  ---  coobox=5247 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),High Proper Motion Star,Double or Multiple Star,Star,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=36366
Remove "RHO Gem (AB)"{ParentBody "RHO Gem"}
Remove "RHO Gem C"{ParentBody "RHO Gem"}
Remove "RHO Gem A"{ParentBody "RHO Gem (AB)"}
Remove "RHO Gem B"{ParentBody "RHO Gem (AB)"}
Barycenter "RHO Gem AB"
{
	ParentBody      "RHO Gem"
	BinaryOrbit     
	{
		Period          992439
		Separation      18600
	}
}

Star "RHO Gem A"
{
	DateUpdated     "2024-07-15"
	ParentBody      "RHO Gem AB"
	Class           "F1V"
	AbsMagn         2.9
	MassSol         1.355
	RadSol          1.655
	LumBol          5.542
	Teff            6899
	FeH             -0.25
	Age             2.1

	BinaryOrbit     
	{
		Period          356.906
		Separation      70
	}
}

Star "RHO Gem B"
{
	DateUpdated     "2024-07-15"
	ParentBody      "RHO Gem AB"
	Class           "M5"
	AbsMagn         10.6
}

// Object V* V376 Gem  ---  BY Dra Variable  ---  OID=@967547   (@@22093,16)  ---  coobox=5247 
// Object types: High Proper Motion Star,BY Dra Variable,High Proper Motion Star,Variable Star,High Proper Motion Star,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Star,X-ray Source 
Star "V* V376 Gem/GJ 9233/GJ 273.1/HIP 36357/Gaia DR3 892215482207937152/MCC 880/TIC 239137106/PLX 1758/LSPM J0729+3159/ASCC 576953/AG+32 771/BD+32 1561/Ci 18 891/G 90-1/GCRV 58796/GEN# +0.03201561/GSC 02456-00932/HIC 36357/LTT 12028/NLTT 17907/PPM 72839/SAO 60116/SKY# 13674/TYC 2456-932-1/UBV 7213/UBV M 2256/VVO 258/[HFE83] 517/uvby98 003201561/2MASS J07290175+3159378/USNO-B1.0 1219-00161543/PLX 1758.00/1RXS J072902.8+315952/WISEA J072901.89+315939.7/Gaia DR1 892215477911193856/WEB 7233/Gaia DR2 892215482207937152/WISE J072901.89+315939.7/** ALC 7A/WDS J07291+3147E"
{
	DateUpdated     "2024-07-15"
	ParentBody      "RHO Gem"
	Parallax        55.1857
	AppMagn         7.714
	Class           "K2.5V"
	AbsMagn         6.5
	MassSol         0.77
	RadSol          0.77
	LumBol          0.29
	Teff            4948
	FeH             -0.06
}

// Object * alf Gem  ---  Double or Multiple Star  ---  OID=@983633   (@@22102,13)  ---  coobox=5418 
// Object types: Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// SolStation: http://www.solstation.com/stars2/castor6.htm
// Wikipedia: https://en.wikipedia.org/wiki/Castor_(star)
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=36850
Remove "Castor (AB)"{ParentBody "Castor"}
Remove "Castor C"{ParentBody "Castor"}
Remove "Castor A"{ParentBody "Castor (AB)"}
Remove "Castor B"{ParentBody "Castor (AB)"}
Remove "Castor Aa"{ParentBody "Castor A"}
Remove "Castor Ab"{ParentBody "Castor A"}
Remove "Castor Ba"{ParentBody "Castor B"}
Remove "Castor Bb"{ParentBody "Castor B"}
Remove "Castor Ca"{ParentBody "Castor C"}
Remove "Castor Cb"{ParentBody "Castor C"}

// ----------------------------------------------------------------------------------------------------

Barycenter "ALF Gem AB"
{
	ParentBody      "ALF Gem"
	BinaryOrbit // VB6_Kiy2015 STF1110AC, Gr.5 (Profile 1)
	{
		Period          13933
		Separation      1076.01941462206 // 71.4 asec
		Eccentricity    0.3
		Inclination     34
		AscendingNode   343
		Epoch           3403365.703421385958791
		ArgOfPericenter 290
		MeanAnomaly     0
	}

	/*BinaryOrbit // VB6_Kiy2015 STF1110AC, Gr.5 (Profile 2)
	{
		Period          13933
		Separation      1077.66686884739 // 69.1 asec
		Eccentricity    0.3
		Inclination     33
		AscendingNode   289
		Epoch           3816089.388043915852904
		ArgOfPericenter 16
		MeanAnomaly     0
	}*/
}

// Object V* YY Gem  ---  BY Dra Variable  ---  OID=@983676   (@@22108,0)  ---  coobox=5418 
// Object types: Eclipsing Binary,Variable Star,High Proper Motion Star,Spectroscopic Binary,Eclipsing Binary,Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,BY Dra Variable,Variable Star,Eruptive Variable,Star,UV-emission Source,X-ray Source 
Barycenter "V* YY Gem/GJ 278 D/GJ 278 C/Gaia DR3 892348454394856064/TIC 239187696/CABS 71/SBC9 463/LSPM J0734+3152/ASCC 577315/UCAC2 42919502/USNO-B1.0 1218-00159939/1AXG J073438+3152/2E 1827/2RE J0734+315/2RE J073437+315249/ADS 6175 C/AG+31 790/BD+32 1582/CCABS 58/CCDM J07346+3153C/GC 10121/GCRV 5044/GEN# +0.03201582/GEN# +1.00060179C/HD 60179C/JP11 130/LTT 12039/Castor C/NLTT 18088/PPM 72940/RE J0734+315/RE J073436+315228/SAO 60199/SBC7 314/UBV 7278/[FS2003] 0431/[GKL99] 170/[RHG95] 1196/2MASS J07343745+3152102/1E 0731.4+3158/1ES 0731+31.9/1RXS J073437.2+315223/2E 0731.4+3158/2EUVE J0734+31.8/EUVE J0734+31.8/RX J0734.6+3151/WDS J07346+3153C/TYC 2453-1918-1/** STF 1110C/PMSC 07282+3206C/PMSC 07282+3206Ca/2XMM J073437.4+315209/UCAC4 610-041023/PM J07346+3152/WEB 7321/Gaia DR2 892348454394856064"
{
	ParentBody      "ALF Gem"
}

// ----------------------------------------------------------------------------------------------------

// Object * alf Gem A  ---  Spectroscopic Binary  ---  OID=@983635   (@@22104,1)  ---  coobox=5418 
// Object types: Double or Multiple Star,High Proper Motion Star,Spectroscopic Binary,Star 
Barycenter "ALF Gem A/GJ 278 A/ASCC 577313/LSPM J0734+3153W/66 Gem A/ALF2 Gem/ADS 6175 A/BD+32 1581A/CCDM J07346+3153A/CSI+32 1581 3/GCRV 5042/HD 60179/HGAM 574/HR 2891/Castor A/ROT 1218/SBC7 313/WDS J07346+3153A/TYC 2457-2407-1/** STF 1110A/Renson 16450/PMSC 07282+3206A/PMSC 07282+3206Aab/SBC9 462/WEB 7320"
{
	ParentBody      "ALF Gem AB"
	BinaryOrbit // 2022ApJ...941....8T
	{
		Period          459.1
		Separation      101.302560711358 // 6.722 asec
		Eccentricity    0.3382
		Inclination     115.107
		AscendingNode   41.304
		Epoch           2436785.096145359799266
		ArgOfPericenter 71.84
		MeanAnomaly     0
	}
}

// Object * alf Gem B  ---  Spectroscopic Binary  ---  OID=@983636   (@@22105,0)  ---  coobox=5418 
// Object types: High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "ALF Gem B/GJ 278 B/ASCC 577314/LSPM J0734+3153E/66 Gem B/ALF1 Gem/ADS 6175 B/BD+32 1581B/CCDM J07346+3153B/CSI+32 1581 4/GCRV 5043/HD 60178/HR 2890/Castor B/ROT 1217/SBC7 312/SKY# 13893/WDS J07346+3153B/TYC 2457-2407-2/** STF 1110B/Renson 16440/PMSC 07282+3206Bab/PMSC 07282+3206B/SBC9 461/WEB 7319"
{
	ParentBody      "ALF Gem AB"
}

// ----------------------------------------------------------------------------------------------------

Star "HD 60179 Aa"
{
	DateUpdated     "2024-07-15"
	ParentBody      "ALF Gem A"
	Class           "A1V"
	AbsMagn         0.986
	MassSol         2.371
	RadSol          2.089
	LumBol          44.010534008390714 // 计算的值
	Teff            10286
	Age             0.290

	BinaryOrbit // 2022ApJ...941....8T
	{
		PeriodDays      9.2127496
		Separation      0.120459443855148 // 8.002 mas
		Eccentricity    0.48769
		Inclination     35
		AscendingNode   95.1
		Epoch           2455817.7868
		ArgOfPericenter 264.968
		MeanAnomaly     0
	}
}

Star "HD 60179 Ab"
{
	DateUpdated     "2024-07-15"
	ParentBody      "ALF Gem A"
	Class           "M1Ve"
	MassSol         0.3859
}

// ----------------------------------------------------------------------------------------------------

Star "HD 60178 Ba"
{
	DateUpdated     "2024-07-15"
	ParentBody      "ALF Gem B"
	Class           "A2Vm"
	AbsMagn         1.886
	MassSol         1.789
	RadSol          1.648
	LumBol          14.955816752167031
	Teff            8842

	BinaryOrbit // 2022ApJ...941....8T    
	{
		PeriodDays      2.92835083
		Separation      0.0491773620240918 // 3.4442 mas
		Eccentricity    0
		Inclination     110.50
		AscendingNode   106.47
		Epoch           2456705.4942
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HD 60178 Bb"
{
	DateUpdated     "2024-07-15"
	ParentBody      "ALF Gem B"
	Class           "M1Ve"
	MassSol         0.3865
}

// ----------------------------------------------------------------------------------------------------

Star "YY Gem Ca"
{
	DateUpdated     "2024-07-15"
	ParentBody      "V* YY Gem"
	Class           "M0.5VeFe-2"
	AbsMagn         8.950
	MassSol         0.5992
	RadSol          0.6191
	LumBol          0.0733
	Teff            3820
	FeH             0.0
	Age             0.370

	BinaryOrbit // SB 463
	{
		PeriodDays      0.8143
		Eccentricity    0
		Inclination     86.29
		AscendingNode   7.315
		Epoch           2424989.1
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "YY Gem Cb" // 两颗恒星相同
{
	DateUpdated     "2024-07-15"
	ParentBody      "V* YY Gem"
	Class           "M0.5VeFe-2"
	AbsMagn         8.950
	MassSol         0.5992
	RadSol          0.6191
	LumBol          0.0733
	Teff            3820
	FeH             0.0
	Age             0.370
}

// 2018年的一篇论文中提到C旁边还有一颗0.047太阳质量(49木星质量)的行星
// https://exoplanet.eu/catalog/yy_gem_ab_b--10098/
Planet "YY Gem Cc"
{
	DateUpdated     "2024-07-15"
	DiscMethod      "ETV"
	DiscDate        "2002"
	ParentBody      "V* YY Gem"
	Class           "GasGiant" // ?
	MassJup         49 // 47

	Orbit // 2018A&A...620A..72W A=0.0034d
	{
		Epoch           2454805
		SemiMajorAxis   15.41
		PeriodDays      19785
		Eccentricity    0.11
		ArgOfPericen    37.6
	}
}

// ----------------------------------------------------------------------------------------------------

// Object * bet Gem  ---  High Proper Motion Star  ---  OID=@1003999   (@@131419,0)  ---  coobox=5516 
// Object types: High Proper Motion Star,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "Pollux"
{
	DateUpdated     "2024-07-15"
	ParentBody      "BET Gem"
	Class           "K0IIIb"
	AbsMagn         1.08
	MassSol         1.91
	RadSol          9.06
	LumBol          32.7
	Teff            4586
	FeH             -0.07 // 0.19
	RotationPeriod  15840
	Age             0.9 // 1.7 // 1.19
}

// Object * bet Gem b  ---  Extra-solar Planet  ---  OID=@3917325   (@@-1,255)  ---  coobox=5516
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"Thestias/HD 62509 b/BET Gem b/Pollux b"
{
	ParentBody     "Pollux"
	DiscMethod     "RadVel"
	DiscDate       "2006"
	MassJup        2.30

	Orbit
	{
		Epoch           2447739.02
		PeriodDays      589.64
		SemiMajorAxis   1.64
		Eccentricity    0.02
		ArgOfPericen    354.58
	}
}