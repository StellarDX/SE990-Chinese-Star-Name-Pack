// Object * eta Per  ---  Star  ---  OID=@178570   (@@2306,0)  ---  coobox=2643 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Barycenter "ETA Per A"
{
	ParentBody      "ETA Per"
	BinaryOrbit     
	{
		Separation      8690.3267358727 // 28.38 asec
	}
}

Star "ETA Per Aa"
{
	DateUpdated     "2024-06-27"
	ParentBody      "ETA Per A"
	Class           "K3Ib-IIa"
	AbsMagn         -4.29
	MassKg          3.95396134127386e+30 // log(g) = 0.26 cm/s^2
	RadSol          173.1
	LumBol          7508
	Teff            4082

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.68344428
		Eccentricity    0
		Inclination     -0.560666084
		AscendingNode   0
		ArgOfPericenter -27.950667
		MeanAnomaly     -111.363946
	}
}

Star "ETA Per Ab"
{
	ParentBody      "ETA Per A"
	Class           "B4.8?"
}

// Object * eta Per B  ---  Star  ---  OID=@11681989   (@@-1,255)  ---  coobox=2643 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "ETA Per B/Gaia DR3 454491450699845248/TIC 251120858/TYC 3704-1331-1/2MASS J02503893+5553583/ADS 2157 B/AG+55 298/BD+55 712/CCDM J02506+5553B/GEN# +1.00017506B/GEN# +1.00237009/HD 237009/IDS 02434+5529 B/PPM 28038/SAO 23649/UBV 2751/UBV M 27914/YZ 55 2550/WDS J02507+5554B/** STF 307B/Gaia DR2 454491450699845248"
{
	DateUpdated     "2024-06-27"
	ParentBody      "ETA Per"
	Parallax        3.6714
	AppMagn         8.51
	Class           "B9V"
	AbsMagn         1.33 // 计算的值
}

// Object * gam Per  ---  Spectroscopic Binary  ---  OID=@179137   (@@1991,0)  ---  coobox=2650 
// Object types: Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Eclipsing Binary,Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "GAM Per A" {ParentBody "GAM Per"}
Remove "GAM Per B" {ParentBody "GAM Per"}
Star "GAM Per A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "HIP 14328"
	Class           "G8III"
	AbsMagn         -1.23
	MassSol         2.7
	RadSol          29.4
	LumBol          556.3530989633624 // 计算的值
	Teff            5170
	FeH             -0.19
	RotationPeriod  128400

	BinaryOrbit     
	{
		Period          14.6
		Separation      10.1947885864511 // 0.144 asec
		Eccentricity    0.785
		Inclination     90.9
		AscendingNode   244.1
		Epoch           2448286.572984973434359
		ArgOfPericenter 350.0
		MeanAnomaly     0
	}
}

Star "GAM Per B"
{
	DateUpdated     "2024-06-27"
	ParentBody      "HIP 14328"
	Class           "A2V"
	AbsMagn         0.01
	MassSol         1.65
	Teff            7895
}

// Unconfirmed exoplanet of ALF Per
Planet	"ALF Per b"
{
	ParentBody     "ALF Per"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	MassJup        6.6

	Orbit
	{
		PeriodDays      128
		SemiMajorAxis   0.97
		Eccentricity    0.1
	}
}

// Object * psi Per  ---  Be Star  ---  OID=@187064   (@@1112,0)  ---  coobox=2770 
// Object types: Be Star,Pulsating Variable,Mid-IR Source (3 to 30 µm),Variable Star,Emission-line Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source 
Star "PSI Per A"
{
	DateUpdated     "2024-06-27"
	ParentBody      "PSI Per"
	Class           "B5Ve"
	AbsMagn         -2.03
	MassSol         4.8
	DimensionsSol   (14.52, 11, 14.52)
	LumBol          2042
	Teff            15654
	Age             0.0631
	RotationPeriod  21.833087873883543786024202184961 // Vsini = 390 Km/s
	Obliquity       75
}

// Object * del Per  ---  Be Star  ---  OID=@193490   (@@739,0)  ---  coobox=2776 
// Object types: Be Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Barycenter "DEL Per A"
{
	ParentBody      "DEL Per"
	BinaryOrbit     
	{
		Separation      52.8559421755137 // 0.330 asec
		PositionAngle   221
	}
}

Star "DEL Per Aa"
{
	DateUpdated     "2024-06-28"
	ParentBody      "DEL Per A"
	Class           "B5III"
	AbsMagn         -3.01 // 计算的值
	MassSol         7.0
	RadSol          10.5
	LumBol          2860
	Teff            14890
	Age             0.0501

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.93928818
		Eccentricity    0.573359207
		Inclination     -0.823019505
		AscendingNode   0
		ArgOfPericenter 47.9367999
		MeanAnomaly     95.8314252
	}
}

Star "DEL Per Ab"
{
	ParentBody      "DEL Per A"
	Class           "B5.4?"
}

Star "DEL Per B"
{
	ParentBody      "DEL Per"
	Class           "B8.3?"
}

// Object * mu. Per  ---  Spectroscopic Binary  ---  OID=@229981   (@@756,0)  ---  coobox=2954 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "MU Per A" {ParentBody "MU Per"}
Remove "MU Per B" {ParentBody "MU Per"}
Star "MU Per A"
{
	DateUpdated     "2024-06-28"
	ParentBody      "Gaia DR3 246265388874592768"
	Class           "G0Ib"
	AbsMagn         -3.08
	MassKg          1.11941216512788e+31 // log(g) = 1.74 cm/s^2
	RadSol          53
	LumBol          2030
	Teff            5418
	FeH             0.09

	BinaryOrbit     
	{
		PeriodDays      284
		Separation      4.72102675431281 // 18.8 mas
		Eccentricity    0.062
		Inclination     74
		AscendingNode   296
		Epoch           2420062
		ArgOfPericenter 122
		MeanAnomaly     0
	}
}

// Object * mu. Per B  ---  Star  ---  OID=@229897   (@@750,14)  ---  coobox=2954 
// Object types: Double or Multiple Star,Star 
Star "MU Per B/Gaia DR3 246265595032050048/ADS 3071 B/BD+48 1063B/CCDM J04149+4824B/CSI+48 1063 2/WDS J04149+4825B/** STT 73B/PMSC 04076+4809B/Gaia DR2 246265595032050048"
{
	DateUpdated     "2024-06-28"
	ParentBody      "Gaia DR3 246265388874592768"
	Class           "B9.5"
}