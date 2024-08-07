// Object * del01 Vel  ---  Double or Multiple Star  ---  OID=@5613427   (@@-1,255)  ---  coobox=20728 
// Object types: Double or Multiple Star,Eclipsing Binary,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=74956
Remove "DEL Vel A"{ParentBody "DEL Vel"}
Remove "DEL Vel B"{ParentBody "DEL Vel"}
Remove "DEL Vel Aa"{ParentBody "DEL Vel A"}
Remove "DEL Vel Ab"{ParentBody "DEL Vel A"}
Barycenter "DEL1 Vel/GJ 9278 A/GJ 321.3 A/HIP 42913/** SHY 49A/** HJ 4136A/GEN# +1.00074956/WEB 8293/PMSC 08419-5420/WDS J08447-5443AB/2E 0843.3-5431/2MASS J08444223-5442313/UBV M 14708/UBV 8508/TD1 13061/SKY# 16780/SAO 236232/PPM 337198/N30 2047/JP11 1716/IRAS 08433-5431/HR 3485/HIC 42913/HD 74956/GSC 08573-03571/GCRV 5781/GC 12069/CSI-54 1788 44/CSI-54 1788 41/CPD-54 1788/CPC 19 3104/CEL 2852/CD-54 2351/AAVSO 0842-54/2E 2046/1RXS J084443.0-544226/1C 32.25/PLX 2098/V* DEL Vel/TIC 45696212/TYC 8573-3571-1/CCDM J08448-5442A/IDS 08419-5420 A/WDS J08447-5443A/PMSC 08419-5420A/** I 10A/** KEL 1/DEL Vel A/HD 74956A/CD-54 2351A/WDS J08447-5443Aa,Ab/Alsephina"
{
	ParentBody      "IDS 08419-5420"
	BinaryOrbit // VB6_Msn2011b I_10AB Gr.4
	{
		Period          146.97
		Separation      49.444260961614 // 2.002 asec
		Eccentricity    0.482
		Inclination     105.6
		AscendingNode   344.7
		Epoch           2451829.422313149087131
		ArgOfPericenter 8.5
		MeanAnomaly     0
	}
}

Star "DEL1 Vel Aa"
{
	DateUpdated     "2024-07-26"
	ParentBody      "DEL1 Vel"
	Class           "A2IV"
	AbsMagn         0.02
	MassSol         2.43
	DimensionsSol   (5.94, 5.58, 5.94)
	LumBol          67
	Teff            9440 // (9700, 10100, 9700)
	FeH             -0.33
	RotationPeriod  25.2

	BinaryOrbit // VB6_Mrd2011 KEL_1Aa, Gr.2 comb
	{
		Period          0.1236
		SemiMajorAxisKm 63037377 // 90.61 RSun
		Eccentricity    0.287
		Inclination     89.0
		AscendingNode   65.0
		Epoch           2452528.495881616137922
		ArgOfPericenter 109.8
		MeanAnomaly     0
	}
}

Star "DEL1 Vel Ab"
{
	DateUpdated     "2024-07-26"
	ParentBody      "DEL1 Vel"
	Class           "A4V"
	MassSol         2.27
	DimensionsSol   (5.04, 4.74, 5.04)
	LumBol          51
	Teff            9830 // (9650, 10120, 9650)
	FeH             -0.33
	Age             0.400
}

// Object * del02 Vel  ---  High Proper Motion Star  ---  OID=@3047150   (@@66696,3)  ---  coobox=20728 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "DEL2 Vel/GJ 9278 B/GJ 321.3 B/CCDM J08448-5442B/CPD-54 1788B/CSI-54 1788 45/IDS 08419-5420 B/WDS J08447-5443B/** I 10B/PMSC 08419-5420B/DEL Vel B/HD 74956B/CD-54 2351B/TYC 8573-3571-2"
{
	DateUpdated     "2024-07-26"
	ParentBody      "IDS 08419-5420"
	Class           "F8V"
	AbsMagn         3.60
	MassSol         1.35 // 1.46
	RadSol          1.43
	LumBol          3.5
	Teff            6600
}

// Object * kap Vel  ---  Spectroscopic Binary  ---  OID=@3062624   (@@65396,2)  ---  coobox=20702 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "KAP Vel A"
{
	DateUpdated     "2024-07-26"
	ParentBody      "KAP Vel"
	Class           "B2IV"
	AbsMagn         -3.74
	MassSol         10 // 11
	RadSol          9.1
	Age             0.016 // 0.02

	BinaryOrbit     
	{
		PeriodDays      116.65
		Eccentricity    0.19
	}
}

Star "KAP Vel B"
{
	ParentBody      "KAP Vel"
	Class           "B5.5?"
}