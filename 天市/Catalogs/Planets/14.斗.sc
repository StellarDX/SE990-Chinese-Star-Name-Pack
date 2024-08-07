// Object * ome Her  ---  alpha2 CVn Variable  ---  OID=@2729071   (@@50919,1)  ---  coobox=17646 
// Object types: alpha2 CVn Variable,High Proper Motion Star,Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "OME Her A"
{
	DateUpdated     "2024-05-17"
	ParentBody      "OME Her"
	Class           "A2VpCrSr"
	AbsMagn         0.29
	MassSol         2.14
	RadSol          3.30
	LumBol          70
	Teff            10052
	FeH             0.47
	RotationPeriod  70.824
	Age             0.149

	BinaryOrbit     
	{
		Epoch           2455197
		Separation      61.0528581596018 // 0.80 asec
		PositionAngle   294
	}
}

Star "OME Her B"
{
	ParentBody      "OME Her"
	Class           "A3.1?"
}

// Object * 49 Ser A  ---  Double or Multiple Star  ---  OID=@2728743   (@@50562,2)  ---  coobox=17638 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Variable Star,Double or Multiple Star,Star,Star 
Barycenter "49 Ser A/GJ 9548 A/GJ 615.1 A/Gaia DR3 4464207428579939840/GEN# +1.00145958/TIC 119985828/HD 145958A/PLX 3681/SPOCS 2921/ASCC 960975/2MASS J16131843+1331379/LSPM J1613+1331S/ADS 9969 A/AG+13 1546/BD+13 3091A/CCDM J16134+1331A/CSI+13 3091 1/CSV 102788/Ci 20 973/GC 21821/GCRV 9334/LTT 14827/NLTT 42273/NSV 7543/PPM 132106/SKY# 29285/SPOCS 693/UBV 13787/USNO-B1.0 1035-00246585/WDS J16133+1332Aa,Ab/PMSC 16086+1348Aab/** CHR 52/WDS J16133+1332A/TYC 958-1468-1/** STF 2021A/Gaia DR2 4464207428579939840"
{
	ParentBody      "49 Ser"
	BinaryOrbit // VB6_Izm2019  STF2021AB Gr.4
	{
		Period          949.6773
		Separation      96.7451083315043 // 3.979 asec
		Eccentricity    0.300
		Inclination     52.4
		AscendingNode   150.4
		Epoch           2346990.666817249730229
		ArgOfPericenter 79.2
		MeanAnomaly     0
	}
}

// Object * 49 Ser  ---  Double or Multiple Star  ---  OID=@2728884   (@@83575,21)  ---  coobox=17638 
// Object types: Double or Multiple Star,Double or Multiple Star,Star,Infra-Red Source 
Star "49 Ser Aa"
{
	DateUpdated     "2024-05-17"
	ParentBody      "49 Ser A"
	Parallax        41.1287
	AppMagn         7.34
	Class           "G9V"
	AbsMagn         5.41 // 计算的值
	MassKg          1.64916975633326e+30 // log(g) = 4.456 cm/s^2
	RadSol          0.8921 // Gaia DR3
	LumBol          0.561067386686065 // 计算的值
	Teff            5289
	FeH             -0.522

	BinaryOrbit     
	{
		Period          11.508
		Separation      4.86234561286017 // 0.200 asec
	}
}

Star "49 Ser Ab"
{
	ParentBody      "49 Ser A"
	Class           "K7.9?"
}

// Object * 49 Ser B  ---  Spectroscopic Binary  ---  OID=@2728744   (@@50562,3)  ---  coobox=17638 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "49 Ser B/GJ 9548 B/GJ 615.1 B/Gaia DR3 4464207428577214464/TIC 119985831/LSPM J1613+1331N/ASCC 960974/2MASS J16131840+1331415/USNO-B1.0 1035-00246575/ADS 9969 B/BD+13 3091B/CCDM J16134+1331B/CSI+13 3091 2/GCRV 9335/HD 145958B/LTT 14828/NLTT 42272/SPOCS 692/WDS J16133+1332B/PMSC 16086+1348B/** STF 2021B/TYC 958-1468-2/WEB 13452/Gaia DR2 4464207428577214464"
{
	DateUpdated     "2024-05-17"
	ParentBody      "49 Ser"
	Parallax        41.1545
	AppMagn         7.39
	Class           "G9V"
	MassSol         0.91
}
