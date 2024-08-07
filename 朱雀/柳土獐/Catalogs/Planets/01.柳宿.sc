// Object * del Hya  ---  Double or Multiple Star  ---  OID=@1113830   (@@18433,4)  ---  coobox=6104 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "DEL Hya A" {ParentBody "DEL Hya"}
Remove "DEL Hya B" {ParentBody "DEL Hya"}
Star "DEL Hya A"
{
	DateUpdated     "2024-07-26"
	ParentBody      "HIP 42313"
	Class           "A0Vnn"
	AbsMagn         0.68
	MassSol         2.88
	RadSol          2.7
	LumBol          42.7
	Teff            11055
	Age             0.244

	BinaryOrbit     
	{
		Period          820
		Separation      130
	}
}

Star "DEL Hya B"
{
	DateUpdated     "2024-07-26"
	ParentBody      "HIP 42313"
	Class           "K5"
}

// Object * rho Hya  ---  Star  ---  OID=@1113873   (@@18439,10)  ---  coobox=6105 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "RHO Hya A"
{
	DateUpdated     "2024-07-26"
	ParentBody      "RHO Hya"
	Class           "A0Vn"
	AbsMagn         -0.83
	MassSol         3.24
	RadSol          2.0
	LumBol          242
	Teff            9795
	Age             0.350

	BinaryOrbit     
	{
		Epoch           2451545
		Separation      1158.65979389491 // 12.1 asec
		PositionAngle   146
	}
}

Star "RHO Hya B"
{
	ParentBody      "RHO Hya"
	Class           "B9.8?"
}

// Object * eps Hya  ---  Double or Multiple Star  ---  OID=@1113500   (@@18779,8)  ---  coobox=6099 
// Object types: Rotating Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Variable Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=74874
Remove "EPS Hya (ABCD)"{ParentBody "EPS Hya"}
Remove "EPS Hya E"{ParentBody "EPS Hya"}
Remove "EPS Hya (AB)"{ParentBody "EPS Hya (ABCD)"}
Remove "EPS Hya (CD)"{ParentBody "EPS Hya (ABCD)"}
Remove "EPS Hya A"{ParentBody "EPS Hya (AB)"}
Remove "EPS Hya B"{ParentBody "EPS Hya (AB)"}
Remove "EPS Hya C"{ParentBody "EPS Hya (CD)"}
Remove "EPS Hya D"{ParentBody "EPS Hya (CD)"}
Barycenter "EPS Hya ABC"
{
	ParentBody      "EPS Hya"
	BinaryOrbit     
	{
		Period          7112
		Separation      724.137923226997 // 18.27 asec
	}
}

Barycenter "EPS Hya AB"
{
	ParentBody      "EPS Hya ABC"
	BinaryOrbit // VB6_Izm2019  STF1273AB, Gr.3?
	{
		Period          371.8983
		Separation      122.711068378213 // 3.096 asec
		Eccentricity    0.472
		Inclination     46.9
		AscendingNode   162.5
		Epoch           2482926.143117363564670
		ArgOfPericenter 256.9
		MeanAnomaly     0
	}
}

Star "EPS Hya A"
{
	DateUpdated     "2024-07-26"
	ParentBody      "EPS Hya AB"
	Class           "G1III"
	AbsMagn         0.39
	MassSol         2.5
	Radius          6006755.21956069 // 计算的值
	LumBol          67
	Teff            5620
	FeH             -0.08

	BinaryOrbit // VB6_Hrt1996a SP_1AB Gr.1
	{
		Period          15.0507
		Separation      10.066835434009 // 0.254 asec
		Eccentricity    0.656
		Inclination     50.0
		AscendingNode   108.0
		Epoch           2448347.568432169966400
		ArgOfPericenter 266.1
		MeanAnomaly     0
	}
}

Star "EPS Hya B"
{
	DateUpdated     "2024-07-26"
	ParentBody      "EPS Hya AB"
	Class           "A8V"
	MassSol         2.5
}

// Object * eps Hya C  ---  Spectroscopic Binary  ---  OID=@1113450   (@@18776,10)  ---  coobox=6099 
// Object types: High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "EPS Hya C/SBC9 533/Gaia DR3 583151353574583424/ADS 6993 C/BD+06 2036C/CCDM J08468+0625C/CSI+06 2036 5/GCRV 5789/IDS 08415+0647 C/SBC7 355/WDS J08468+0625C/TYC 224-1333-2/** STF 1273C/PMSC 08415+0647C/PMSC 08415+0647Ca/WEB 8323/Gaia DR2 583151353573007104"
{
	ParentBody      "EPS Hya ABC"
}

Star "EPS Hya Ca"
{
	DateUpdated     "2024-07-26"
	ParentBody      "EPS Hya C"
	Class           "F7V"
	MassSol         1.20

	BinaryOrbit // SB9_533 1926ApJ....64..172S
	{
		PeriodDays      9.9047
		Eccentricity    0.620
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2423800.008
		ArgOfPericenter 297.6
		MeanAnomaly     0
	}
}

Star "EPS Hya Cb"
{
	DateUpdated     "2024-07-26"
	ParentBody      "EPS Hya C"
	Class           ""
	MassSol         0.38
}

// Object * eps Hya D  ---  High Proper Motion Star  ---  OID=@1113447   (@@18776,7)  ---  coobox=6099 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "EPS Hya D/Gaia DR3 583151353573508480/TIC 444007693/ADS 6993 D/BD+06 2036D/CCDM J08468+0625D/CSI+06 2036 2/IDS 08415+0647 D/UBV 21312/WDS J08468+0625D/2MASS J08464613+0624503/** STF 1273D/PMSC 08415+0647D/Gaia DR2 583151353573508480"
{
	DateUpdated     "2024-07-26"
	ParentBody      "EPS Hya"
	Class           "M2"
	MassSol         0.56
}

// Object * tet Hya  ---  Spectroscopic Binary  ---  OID=@1619085   (@@33858,11)  ---  coobox=12966 
// Object types: Spectroscopic Binary,High Proper Motion Star,White Dwarf,Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "TET Hya A"
{
	DateUpdated     "2024-07-26"
	ParentBody      "TET Hya"
	Class           "B9.5V"
	AbsMagn         0.92
	MassSol         2.52
	Radius          1638777.87383481 // 计算的值
	LumBol          52
	Teff            10099
	FeH             -0.42

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.04584177
		Eccentricity    0.717271467
		Inclination     -1.63955593
		AscendingNode   0
		ArgOfPericenter -78.3213588
		MeanAnomaly     -11.8780813
	}
}

Star "TET Hya B"
{
	DateUpdated     "2024-07-26"
	ParentBody      "TET Hya"
	Class           "DA1.6"
	MassSol         1.21
	Radius          4176 // 4176-11832
	LumBol          0.028835278708205958 // 计算的值
	Teff            30700
}