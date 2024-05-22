// Object * eps Cen  ---  beta Cep Variable  ---  OID=@3376211   (@@63966,12)  ---  coobox=21626 
// Object types: beta Cep Variable,Double or Multiple Star,Variable Star,beta Cep Variable,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "EPS Cen A" {ParentBody "EPS Cen"}
Remove "EPS Cen B" {ParentBody "EPS Cen"} // B为光学伴星


// ALF Cen Triple System
// By. StellarDX
// ----------------------------------------------------------------------------------------------------
Remove "Proxima"{ParentBody "Proxima Cen"}

// Object * alf Cen  ---  Double or Multiple Star  ---  OID=@3396059   (@@66419,8)  ---  coobox=21758 
// Object types: Double or Multiple Star,High Proper Motion Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "ALF Cen A" {ParentBody "ALF Cen"}
Remove "ALF Cen B" {ParentBody "ALF Cen"}
Barycenter "ALF Cen Barycenter" // A-B质心
{
	ParentBody      "ALF Cen"
}

// ------------------------------ 南门二 A ------------------------------ //

// Object * alf Cen A  ---  Spectroscopic Binary  ---  OID=@3396054   (@@66414,0)  ---  coobox=21758 
// Object types: Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Star,UV-emission Source 
Star "ALF Cen A/GJ 559 A/HIP 71683/SBC7 520/GALAH 140708001701306/TIC 471011145/2MASS J14393592-6050069/PLX 3309/SBC9 815/CCDM J14396-6050A/CPD-60 5483A/CSI-60 5483 41/GCRV 8517/GEN# +1.00128620A/HD 128620/HIC 71683/HR 5459/IDS 14328-6025 A/LFT 1127/LHS 50/LTT 5806/NLTT 37984/PM 14362-6038A/PPM 360911/SKY# 26645/SPOCS 610/TD1 17606/Zkh 209/WDS J14396-6050A/TYC 9007-5849-1/PMSC 14328-6025A/ALF1 Cen/** RHD 1A/CD-60 5293A/WEB 12354/Rigel Kentaurus/Rigil Kentaurus"
{
	DateUpdated     "2024-05-21"
	ParentBody      "ALF Cen Barycenter"
	Parallax        743
	AppMagn         0.01
	Class           "G2V"
	AbsMagn         4.38
	MassSol         1.0788
	RadSol          1.2175
	LumBol          1.5059
	Teff            5790
	FeH             0.20
	RotationPeriod  679.2
	Age             4.85

	BinaryOrbit     
	{
		Period          79.762
		Separation      17.493
		Eccentricity    0.51947
		Inclination     79.243
		AscendingNode   205.073
		Epoch           2406130.318401670549065
		ArgOfPericenter 51.519
		MeanAnomaly     0
	}
}

// Alpha Centauri A Candidate 1, Apperence from Avatar
Planet "Polyphemus/Coeus/Naranawm/Candidate 1/ALF Cen Ab/Rigil Kentaurus b"
{
	DateUpdated     "2024-05-22"
	ParentBody      "ALF Cen A"
	DiscMethod      "Imaging"
	DiscDate        "2021"
	Class           "GasGiant"
	Mass            34.52 // 8.77 - 34.52
	Radius          44646.959 // 3.3 - 7
	Oblateness      0

	Surface {Preset "Polyphemus.cfg"}

	Clouds
	{
		mainFreq        3
		mainOctaves     10
		Coverage        0.5
		stripeZones     5
		stripeFluct     0.7
		stripeTwist     20
		cycloneMagn     3
		cycloneFreq     0.75
		cycloneDensity  0.3
		cycloneOctaves  4
	}

	Atmosphere
	{
		Model          "Earth"
		Bright          10
		Opacity         0.5
		SkyLight        3
		Hue             0
		Saturation      1
	}

	Orbit
	{
		PeriodDays      360
		SemiMajorAxis   1.1
		Inclination     65
	}
}

// ------------------------------ 南门二 B ------------------------------ //

// Object * alf Cen B  ---  High Proper Motion Star  ---  OID=@3396297   (@@133273,0)  ---  coobox=21758 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "ALF Cen B/GJ 559 B/HIP 71681/TIC 471011144/RAVE J143935.1-605014/ALF2 Cen/CCDM J14396-6050B/CPD-60 5483B/CSI-60 5483 42/GCRV 8518/GEN# +1.00128621/HD 128621/HIC 71681/HR 5460/IDS 14328-6025 B/LFT 1128/LHS 51/LTT 5807/NLTT 37985/PM 14362-6038B/SKY# 26644/SPOCS 609/Zkh 210/[AOP94] 7/WDS J14396-6050B/TYC 9007-5848-1/PMSC 14328-6025B/** RHD 1B/CD-60 5293B/Toliman"
{
	DateUpdated     "2024-05-21"
	ParentBody      "ALF Cen Barycenter"
	Parallax        743
	AppMagn         1.33
	Class           "K1V"
	AbsMagn         5.71
	MassSol         0.9092
	RadSol          0.8591
	LumBol          0.4981
	Teff            5260
	FeH             0.23
	RotationPeriod  880.8
	Age             5.3
}

// Object * alf Cen Bb  ---  Not an Object (Error, Artefact, ...)  ---  OID=@7880120   (@@-1,255)  ---  coobox=21758
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate,Not an Object (Error, Artefact, ...)
Planet "ALF Cen Bb/GJ 559 Bb"
{
	ParentBody     "ALF Cen B"
	DiscMethod     "RadVel"
	DiscDate       "2012"
	Class          "Terra"
	Mass           1.13

	Surface
	{
		Preset          "terra_airless_default.cfg"
		lavaCoverTidal  0.05
		lavaCoverSun    0.35
		lavaCoverYoung  0.1
	}

	Atmosphere
	{
		Model           "Venus"
		Bright          10
		Opacity         0.1
		SkyLight        3
		Hue             0
		Saturation      1
	}

	Orbit
	{
		PeriodDays      3.2357
		SemiMajorAxis   0.0400
	}
}

Planet "ALF Cen Bc"
{
	ParentBody     "ALF Cen B"
	DiscMethod     "Transit"
	DiscDate       "2015"
	Class          "Terra"
	Radius         5867.88604

	Orbit
	{
		PeriodDays      20.4
		Eccentricity    0.24
	}
}

// ------------------------------ 比邻星 ------------------------------ //

// Object NAME Proxima Centauri  ---  Eruptive Variable  ---  OID=@3379714   (@@66412,0)  ---  coobox=22096 
// Object types: Rotating Variable,High Proper Motion Star,High Proper Motion Star,Eruptive Variable,Rotating Variable,Mid-IR Source (3 to 30 µm),High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,UV-emission Source,UV-emission Source,X-ray Source 

Star "Proxima Cen/Proxima/GJ 551/HIP 70890/AP J14294291-6240465/Gaia DR3 5853498713190525696/TIC 388857263/PLX 3278/ALF Cen C/2E 1426.0-6227/2E 3278/2RE J142946-624031/2RE J1429-624/CCDM J14396-6050C/CSI-62-14263/CSV 2142/Ci 20 861/GEN# +6.10010551/GEN# +6.00105721/HIC 70890/IRAS 14260-6227/JP11 5156/JP11 5155/JP11 5187/LFT 1110/LHS 49/LPM 526/LTT 5721/NLTT 37460/PM 14263-6228/RE J1429-624/RE J142950-624056/V* V645 Cen/Zkh 211/[AOP94] 6/[FS2003] 0708/[GKL99] 301/[RHG95] 2291/2MASS J14294291-6240465/PLX 3278.00/1E 1425.9-6228/1ES 1426-62.4/1RXS J142947.9-624058/2EUVE J1429-62.6/EUVE J1429-62.6/EUVE J1430-62.6/RX J1429.7-6240/WDS J14396-6050C/PMSC 14328-6025C/Gaia DR2 5853498713160606720/WISEA J142937.35-624038.3/PM J14297-6240"
{
	DateUpdated     "2024-05-21"
	ParentBody      "ALF Cen"
	Parallax        768.0665
	AppMagn         11.13
	Class           "M5.5Ve"
	AbsMagn         15.60
	MassSol         0.1221
	RadSol          0.1542
	LumBol          0.001567
	Luminosity      4.92E-5
	Teff            2992
	FeH             0.21
	RotationPeriod  2155.2
	Age             4.85

	// Orbit Reference: 
	// Kervella, P.; Thévenin, F.; Lovis, C. (2017). 
	// "Proxima's orbit around α Centauri". Astronomy & 
	// Astrophysics. 598: L7. 
	// arXiv:https://arxiv.org/pdf/1611.03495
	Orbit // Heliocentric reference system
	{
		RefPlane        "Ecliptic"
		Time            2457773
		GravParam       2.6384030898148e+20
		Position        (859361206445346, -61096416113529.1, -1.73476793631445e+15) // meters
		Velocity        (-187, -99, -173) // m/s (Best fit in SE)
	}

	/*Orbit // Keplerian elements
	{
		Period          547E3
		SemiMajorAxis   8.7E3
		Eccentricity    0.50
		Inclination     107.6
		AscendingNode   126
		Epoch           105821295 // 2017 + 283000
		ArgOfPericenter 72.3
		MeanAnomaly     0
	}*/
}

// Object NAME Proxima Centauri b  ---  Extra-solar Planet  ---  OID=@10611670   (@@-1,255)  ---  coobox=22096
// Object types: Extra-solar Planet,Extra-solar Planet Candidate
Planet	"Proxima Cen b/Proxima b/ALF Cen C b"
{
	ParentBody     "Proxima"
	Class          "Terra"
	DiscMethod     "RadVel"
	DiscDate       "2016"
	Mass           1.07
	Radius         8291.5781 // 0.94 - 1.4
	RotationPeriod 402.63048 // 3:2
	Obliquity      0 // unlikely to have any obliquity

	Life
	{
		Class "Organic"
		Type  "Multicellular"
		Biome "Terrestrial"
	}

	Surface
	{
		Preset          "Proxima_b.cfg"
		humidity        0.5
	}

	Ocean {Height 1.5}

	Atmosphere
	{
		Model           "Mars"
		Greenhouse      100
		Bright          10
		Opacity         0.8
		SkyLight        3
		Hue             0
		Saturation      1
	}

	Orbit
	{
		PeriodDays      11.18418
		SemiMajorAxis   0.04857
		Eccentricity    0.0109 // 0.02 by latest data; upper limit is 0.35; 0.15 makes a 3:2 spin-orbital resonance
		//Inclination     152	 // if co-planar with planet c; other solution: 28
		//AscendingNode   135  // if co-planar with planet c; other solution: 295
		ArgOfPericen    310
	}
}

// Object NAME Proxima Centauri c  ---  Extra-solar Planet Candidate  ---  OID=@13299333   (@@-1,255)  ---  coobox=22096
// Object types: Extra-solar Planet Candidate
Planet	"Proxima Cen c/Proxima c/ALF Cen C c"
{
	ParentBody     "Proxima"
	DiscMethod     "RadVel"
	DiscDate       "2019"
	Class          "Terra" // Mini-Neptune?
	Mass           7

	Rings
	{
		OuterRadius     357460	// hypothetical, 5 R_jupiter
		EdgeRadius      357460
	}

	Orbit
	{
		Epoch           2456202
		PeriodDays      1928
		SemiMajorAxis   1.489
		Eccentricity    0.04
		Inclination     133
		AscendingNode   331
		LongofPericen   -4
	}
}

// Object NAME Proxima d  ---  Extra-solar Planet Candidate  ---  OID=@15903315   (@@-1,255)  ---  coobox=22096
// Object types: Extra-solar Planet Candidate
Planet	"Proxima d/Proxima Cen d"
{
	ParentBody     "Proxima"
	DiscMethod     "RadVel"
	DiscDate       "2020"
	Class          "Terra"
	Mass           0.26
	Radius         5166.29097

	Surface{Preset "terra_airless_ganymede.cfg"}

	Clouds
	{
		Height          13
		Coverage        0.5
		stripeTwist     0
	}
	
	Atmosphere
	{
		Model           "Ethereal"
	}

	Orbit
	{
		PeriodDays      5.122
		SemiMajorAxis   0.02885
		Eccentricity    0.04
	}
}
