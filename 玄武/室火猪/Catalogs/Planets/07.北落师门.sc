Remove "Fomalhaut b" {ParentBody "Fomalhaut"}

// Object * alf PsA  ---  High Proper Motion Star  ---  OID=@1235748   (@@131479,0)  ---  coobox=8804 
// Object types: Near-IR Source (λ < 3 µm),Sub-Millimetric Source,High Proper Motion Star,Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "Fomalhaut A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "ALF PsA"
	Class           "A3V"
	AbsMagn         1.72
	MassSol         1.92
	RadSol          1.842
	LumBol          16.63
	Teff            8590
	FeH             -0.34 // -0.03
	Age             0.44
	Oblateness      0
}

// Object * alf PsA b  ---  Extra-solar Planet  ---  OID=@4550738   (@@-1,255)  ---  coobox=8804
// Object types: Extra-solar Planet,Star,Neutron Star Candidate,Extra-solar Planet Candidate
Planet "ALF PsA Ab/GJ 881 b/HD 216956b/Fomalhaut b/Dagon"
{
	ParentBody      "Fomalhaut A"
	DiscMethod      "Imaging"
	DiscDate        "2008"
	Class           "GasGiant"
	MassJup         0.208
	Oblateness      0

	Surface{Preset "jupiter_cold_default.cfg"}

	Atmosphere
	{
		Model          "Venus"
		Bright          10
		Opacity         1
		SkyLight        3.3
		Hue             0
		Saturation      1
	}

	Rings
	{
		OuterRadius     6e+05
		EdgeRadius      6e+05
		MeanRadius      7.53e+04
		Thickness       100
		RocksMaxSize    0.0151
		RocksSpacing    1
		DustDrawDist    1.13e+03
		ChartRadius     9.55e+04
		RotationPeriod  7.75
		Brightness      5
		FrontBright     2.98
		BackBright      4.61
		Density         0.8
		Opacity         0.5
		SelfShadow      0.962
		PlanetShadow    0.962
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       2.17
		densityScale    0
		densityOffset   10
		densityPower    10
		colorContrast   0.115
		FrontColor      (1.000 0.250 0.000)
		BackThickColor  (1.000 0.376 0.175)
		BackIceColor    (1.000 0.995 0.250)
		BackDustColor   (1.000 0.806 0.000)
	}

	Orbit
	{
		Epoch           2423055.5
		PeriodDays      1700
		SemiMajorAxis   177
		Eccentricity    0.78 // Parabolic?
		Inclination     -55
		AscendingNode   152
		LongOfPericen   178
		MeanLongitude   178
	}
}

// Object V* TW PsA  ---  BY Dra Variable  ---  OID=@1221244   (@@25162,11)  ---  coobox=8800 
// Object types: BY Dra Variable,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Eruptive Variable,High Proper Motion Star,Star,Infra-Red Source,X-ray Source 
Star "V* TW PsA/GJ 879/Gaia DR3 6604147121141267712/TIC 206686962/PLX 5562/2E 4651/8pc 130.94/CD-32 17321/CPC 17 12405/CPD-32 6550/GC 31978/GCRV 14398/GEN# +1.00216803/HD 216803/HIC 113283/HIP 113283/HR 8721/IRAS 22536-3150/JP11 3550/LTT 9283/NLTT 55315/PPM 303193/RBS 1916/SAO 214197/SKY# 43572/UBV 19657/UBV M 26716/UGP 584/Zkh 342/[GKL99] 437/2MASS J22562403-3133559/PLX 5562.00/Ci 18 2996/1RXS J225624.2-313357/2E 2253.6-3149/WDS J22577-2937B/** SHY 106B/TYC 7505-100-1/ALF PsA B/uvby98 100216803/WEB 20154/Fomalhaut B/Gaia DR2 6604147121141267712"
{
	DateUpdated     "2024-06-16"
	ParentBody      "Fomalhaut A"
	Parallax        131.5525
	AppMagn         6.48
	Class           "K5Vp"
	AbsMagn         7.08
	MassSol         0.725
	RadSol          0.629
	LumBol          0.19
	Teff            4711
	RotationPeriod  247.2
	Age             0.440

	Orbit     
	{
		SemiMajorAxis   53684.3844530194 // 7062.66 asec
		ArgOfPericenter 187.8
		MeanAnomaly     0
	}
}

Planet "Fomalhaut Bb"
{
	ParentBody      "Fomalhaut B"
	DiscMethod      "Astrometry"
	DiscDate        "2019"
	MassJup         1.2
	Oblateness      0

	Orbit
	{
		Period          25
	}
}

// Object * alf PsA C  ---  Double or Multiple Star  ---  OID=@1254390   (@@97412,19)  ---  coobox=8795 
// Object types: High Proper Motion Star,High Proper Motion Star,Eruptive Variable,Rotating Variable,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Star 
// 北落师门的希尔球半径为6.2光年，此伴星也包含在内
Star "ALF PsA C/Gaia DR3 6623351805412369024/TIC 47423224/LP 876-10/NLTT 54872/WT 2282/2MASS J22480446-2422075/Fomalhaut C/GSC 06964-01226/PM J22480-2422/** MAM 1C/WDS J22577-2937Ca,Cb/WDS J22577-2937C/** WSI 138/WISEA J224804.74-242209.6/UCAC4 329-202449/Gaia DR2 6623351805412369024"
{
	DateUpdated     "2024-06-16"
	ParentBody      "Fomalhaut A"
	Parallax        130.2707
	AppMagn         12.624
	Class           "M4Ve"
	AbsMagn         13.21
	MassSol         0.18
	RadSol          0.23
	LumBol          0.004603
	Teff            3132
	FeH             -0.1
	RotationPeriod  11.184
	Oblateness      0

	Orbit     
	{
		SemiMajorAxis   157166.45514048 // 20410.1032453309 asec
		ArgOfPericenter 337.35
		MeanAnomaly     0
	}
}
