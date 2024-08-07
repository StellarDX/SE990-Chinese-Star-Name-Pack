// Object * nu. Gem  ---  Be Star  ---  OID=@886516   (@@20083,1)  ---  coobox=5651 
// Object types: Be Star,Mid-IR Source (3 to 30 µm),Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Remove "NU Gem AA"{ParentBody "NU Gem"}
Remove "NU Gem Ab"{ParentBody "NU Gem"}
Remove "NU Gem Aa1"{ParentBody "NU Gem AA"}
Remove "NU Gem Aa2"{ParentBody "NU Gem AA"}
Barycenter "NU Gem A"
{
	ParentBody      "NU Gem"
	BinaryOrbit     
	{
		PeriodDays      6977.3
		Separation      13.8201512294831 // 82.8 mas
		Eccentricity    0.241
		Inclination     75.9
		AscendingNode   121.0
		Epoch           2448810.3
		ArgOfPericenter 226.9
		MeanAnomaly     0
	}
}

Star "NU Gem Aa"
{
	DateUpdated     "2024-07-10"
	ParentBody      "NU Gem A"
	Class           "B6III"
	AbsMagn         -2.2
	MassSol         3.34
	Radius          4330883.30723458 // 计算的值
	LumBol          1380
	Teff            14100

	BinaryOrbit     
	{
		PeriodDays      53.7722
		Separation      0.556378338689618 // 2.82 mas
		Eccentricity    0.056
		Inclination     0.98
		AscendingNode   78.9
		Epoch           2451011.8
		ArgOfPericenter 186.7
		MeanAnomaly     0
	}
}

Star "NU Gem Ab"
{
	DateUpdated     "2024-07-10"
	ParentBody      "NU Gem A"
	Class           ""
	MassSol         3.28
}

Star "NU Gem B"
{
	DateUpdated     "2024-07-10"
	ParentBody      "NU Gem"
	Class           "B8III"
	AbsMagn         -1.2
	MassSol         3.33
}

// Object * gam Gem  ---  Spectroscopic Binary  ---  OID=@902003   (@@19267,0)  ---  coobox=5684 
// Object types: Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "GAM Gem A"{ParentBody "Alhena"}
Remove "GAM Gem B"{ParentBody "Alhena"}
Star "GAM Gem A"
{
	DateUpdated     "2024-07-10"
	ParentBody      "HIP 31681"
	Class           "A1.5IV+"
	AbsMagn         -0.68
	MassSol         2.81
	RadSol          3.3
	LumBol          123
	Teff            9260
	FeH             -0.12

	BinaryOrbit     
	{
		PeriodDays      4614.51
		Eccentricity    0.8933
		Epoch           2443999.13
		ArgOfPericenter 132.60
		MeanAnomaly     0
	}
}

Star "GAM Gem B"
{
	DateUpdated     "2024-07-10"
	ParentBody      "HIP 31681"
	Class           "G"
	MassSol         1.07
}

// Object * zet Gem  ---  Classical Cepheid Variable  ---  OID=@937293   (@@133258,0)  ---  coobox=5701 
// Object types: Classical Cepheid Variable,Double or Multiple Star,Classical Cepheid Variable,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Barycenter "ZET Gem A"
{
	ParentBody      "ZET Gem"
	BinaryOrbit
	{
		Separation      28461.713477767 // 87.46 asec
	}
}

Star "ZET Gem Aa"
{
	DateUpdated     "2024-07-10"
	ParentBody      "ZET Gem A"
	Class           "G1Ib" // F7Ib - G3Ib
	AbsMagn         -3.99
	MassSol         7.7
	RadSol          72
	LumBol          4413
	Teff            5260 // 5780
	FeH             0.16
	Age             0.07

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.83037821
		Eccentricity    0.0525828007
		Inclination     -1.84152412
		AscendingNode   0
		ArgOfPericenter 4.72914638
		MeanAnomaly     73.9570507
	}
}

Star "ZET Gem Ab"
{
	ParentBody      "ZET Gem A"
	Class           "B6.8?"
}

// Object UCAC2 39130002  ---  Star  ---  OID=@937011   (@@20111,0)  ---  coobox=5701 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Barycenter "UCAC2 39130002/Gaia DR3 3366754224008630528/WISEA J070412.72+203421.3/TIC 436949039/ADS 5742 B/CCDM J07041+2035B/CSI+20 1687 2/GEN# +1.00052973B/IDS 06582+2043 B/UBV M 12782/2MASS J07041272+2034213/WDS J07041+2034B/** SHJ 77B/** SHJ 77R/ADS 5742 P/CCDM J07041+2035P/CSI+20 1687 4/UCAC3 222-78064/UCAC4 553-036155/WISE J070412.71+203421.3/Gaia DR2 3366754219714547968"
{
	ParentBody      "ZET Gem"
}

Star "UCAC2 39130002 A"
{
	DateUpdated     "2024-07-10"
	ParentBody      "UCAC2 39130002"
	Parallax        1.1114 // 光学伴星???
	AppMagn         11.46
	Class           "F4"
	AbsMagn         1.69 // 计算的值

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.479161141
		Eccentricity    0.115274833
		Inclination     2.49380604
		AscendingNode   0
		ArgOfPericenter -116.744011
		MeanAnomaly     34.9663948
	}
}

Star "UCAC2 39130002 B"
{
	ParentBody      "UCAC2 39130002"
	Class           "G5.1?"
}

// Object * lam Gem  ---  High Proper Motion Star  ---  OID=@953994   (@@19814,3)  ---  coobox=5723 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Variable Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "LAM Gem A"{ParentBody "LAM Gem"}
Remove "LAM Gem B"{ParentBody "LAM Gem"}
Barycenter "LAM Gem A"
{
	ParentBody      "GJ 9231"
	BinaryOrbit     
	{
		Epoch           2454832
		Separation      284.90988617276 // 9.29 asec
		PositionAngle   35.72
	}
}

Star "LAM Gem Aa"
{
	DateUpdated     "2024-07-10"
	ParentBody      "LAM Gem A"
	Class           "A3V"
	AbsMagn         1.13
	MassSol         2.098
	RadSol          2.7773
	LumBol          27.3901
	Teff            7932
	FeH             -0.04
	Age             0.5 // 0.8

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   3.86896925
		Eccentricity    0.19044599
		Inclination     -1.97178459
		AscendingNode   0
		ArgOfPericenter 44.0650238
		MeanAnomaly     156.438551
	}
}

Star "LAM Gem Ab"
{
	ParentBody      "LAM Gem A"
	Class           "F3.6?"
}

// Object * lam Gem B  ---  High Proper Motion Star  ---  OID=@953995   (@@19814,4)  ---  coobox=5723 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "LAM Gem B/GJ 9231 B/Gaia DR3 3168265196642972288/TIC 440851540/WDS J07181+1632B/ADS 5961 B/BD+16 1443B/CCDM J07181+1632B/CSI+16 1443 2/IDS 07124+1643 B/2MASS J07180597+1632336/** STF 1061B/Gaia DR2 3168265196642972288"
{
	DateUpdated     "2024-07-10"
	ParentBody      "GJ 9231"
	Parallax        32.9178
	AppMagn         10.7
	Class           ""
	AbsMagn         8.29 // 计算的值
	MassKg          1.4169502962544e+30 // log(g) = 4.642 cm/s^2
	RadSol          0.6675106 // Gaia DR3
	LumBol          0.14281352178748 // 计算的值
	Teff            4343
	FeH             0.337
}