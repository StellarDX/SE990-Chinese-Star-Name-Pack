// Object * zet Ori A  ---  Spectroscopic Binary  ---  OID=@827500   (@@17048,0)  ---  coobox=6482 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=37742
Remove "Alnitak A"{ParentBody "Alnitak"}
Remove "Alnitak B"{ParentBody "Alnitak"}
Remove "Alnitak Aa"{ParentBody "Alnitak A"}
Remove "Alnitak Ab"{ParentBody "Alnitak A"}
Barycenter "ZET Ori A/50 Ori A/BD-02 1338A/CGO 105/CSI-02 1338 2/GCRV 3517/GOS G206.45-16.59 01/HD 37742/HR 1948/ALS 14793/** STF 774A/ADS 4263 A/PMSC 05357-0200Aab/WDS J05407-0157Aa,Ab/WDS J05407-0157A/** NOI 1/TYC 4771-1188-1/WEB 5270"
{
	ParentBody      "ZET Ori"
	BinaryOrbit // VB6_Hop1967 STF_774AB Gr.5
	{
		Period          1508.6
		Separation      1055.735777828 // 2.728 asec
		Eccentricity    0.07
		Inclination     72
		AscendingNode   155.5
		Epoch           2477330.632632038556039
		ArgOfPericenter 227.3
		MeanAnomaly     0
	}
}

Star "ZET Ori Aa"
{
	DateUpdated     "2024-07-06"
	ParentBody      "ZET Ori A"
	Class           "O9.2IbvarNwk"
	AbsMagn         -6.0
	MassSol         33
	RadSol          20.0
	LumBol          250000
	Teff            29500
	RotationPeriod  160.08
	Age             0.0064

	BinaryOrbit // VB6_Hmm2013 NOI_1Aa, Gr.2
	{
		PeriodDays      2687.3
		Separation      13.8983264458756 // 35.9 mas
		Eccentricity    0.338
		Inclination     139.3
		AscendingNode   83.8
		Epoch           2452734.2
		ArgOfPericenter 24.2
		MeanAnomaly     0
	}
}

Star "ZET Ori Ab"
{
	DateUpdated     "2024-07-06"
	ParentBody      "ZET Ori A"
	Class           "B1IV"
	AbsMagn         -3.9
	MassSol         14
	RadSol          7.3
	LumBol          32000
	Teff            29000
	Age             0.0072
}

// Object * zet Ori B  ---  Star  ---  OID=@827056   (@@17026,0)  ---  coobox=6482 
// Object types: Double or Multiple Star,Star 
Star "ZET Ori B/TIC 712837934/50 Ori B/ADS 4263 B/BD-02 1338B/CGO 106/CSI-02 1338 1/GCRV 3518/HD 37743/HR 1949/ALS 16893/GOS G206.45-16.59 02/TYC 4771-1188-2/** STF 774B/CCDM J05408-0156B/PMSC 05357-0200B/WDS J05407-0157B/WEB 5271"
{
	DateUpdated     "2024-07-06"
	ParentBody      "ZET Ori"
	Class           "O9.5II-III(n)" // B0III
	AbsMagn         -4.1
	MassSol         16.66
	Age             0.007
}

// Object * del Ori  ---  Double or Multiple Star  ---  OID=@799898   (@@17013,0)  ---  coobox=6469 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Spectroscopic Binary,Eclipsing Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=25930
Remove "Mintaka A"{ParentBody "Mintaka"}
Remove "Mintaka C"{ParentBody "Mintaka"}
Remove "Mintaka Aa"{ParentBody "Mintaka A"}
Remove "Mintaka Ab"{ParentBody "Mintaka A"}
Remove "Mintaka Aa1"{ParentBody "Mintaka Aa"}
Remove "Mintaka Aa2"{ParentBody "Mintaka Aa"}
Remove "Mintaka Ca"{ParentBody "Mintaka C"}
Remove "Mintaka Cb"{ParentBody "Mintaka C"}
Barycenter "DEL Ori Aab"
{
	ParentBody      "DEL Ori"
	BinaryOrbit     
	{
		Period          433695
		Separation      19889.199936169 // 52.34 asec
	}
}

Barycenter "DEL Ori Aa"
{
	ParentBody      "DEL Ori Aab"
	BinaryOrbit
	{
		PeriodDays      53839
		SemiMajorAxisKm 13940436600 // 20038 RSun
		Eccentricity    0.5886
		Inclination     104.7
		AscendingNode   122.4
		Epoch           2458773.2
		ArgOfPericenter 79
		MeanAnomaly     0
	}
}

Star "DEL Ori A/CCDM J05320-0018A/WDS J05320-0018Aa/TYC 4766-2445-1/34 Ori A/DEL Ori Aa1/GOS G203.86-17.74 01/** HEI 42A"
{
	DateUpdated     "2024-07-06"
	ParentBody      "DEL Ori Aa"
	Class           "O9.5IINwk"
	AbsMagn         -5.4
	MassSol         24
	RadSol          16.5
	LumBol          190000
	Teff            29500

	BinaryOrbit     
	{
		PeriodDays      5.732436
		SemiMajorAxisKm 29984670 // 43.1 RSun
		Eccentricity    0.1133
		Inclination     76.5
		Epoch           2456295.674
		ArgOfPericenter 321.3
		MeanAnomaly     0
	}
}

Star "DEL Ori B/CCDM J05320-0018D/WDS J05320-0018Ab/34 Ori B/DEL Ori Aa2/TYC 4766-2445-2/** HEI 42B"
{
	DateUpdated     "2024-07-06"
	ParentBody      "DEL Ori Aa"
	Class           "B1V"
	AbsMagn         -2.9
	MassSol         8.4
	RadSol          6.5
	LumBol          16000
	Teff            25600
}

Star "DEL Ori Ab"
{
	DateUpdated     "2024-07-06"
	ParentBody      "DEL Ori Aab"
	Class           "B0IV"
	AbsMagn         -4.2
	MassSol         22.5
	RadSol          10.4
	LumBol          63000
	Teff            28400
}

// The Gaia DR3 parallax for component B is 3.5002ms ± 0.0119ms, strongly suggesting it is 
// considerably closer than the other members of the system and merely a chance alignment.

// Object * del02 Ori  ---  Spectroscopic Binary  ---  OID=@799395   (@@16973,3)  ---  coobox=6469 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Star,Star,Infra-Red Source 
Barycenter "DEL2 Ori/AP J05320041-0017041/Gaia DR3 3220757015623151616/TIC 50743458/2MASS J05320041-0017041/PLX 1261/SBC9 1917/34 Ori C/DEL Ori C/ADS 4134 C/BD-00 982/CCDM J05320-0018C/GC 6848/GCRV 3362/GEN# +1.00036485/GSC 04766-02444/HD 36485/HGAM 418/HR 1851/IDS 05269-0022 C/IRC +00076/MCW 323/ROT 838/SAO 132221/SKY# 8881/TYC 4766-2444-1/UBV 5331/UBV M 11107/WH 140/uvby98 100036485/ALS 14778/WDS J05320-0018C/** STF 4014C/Renson 9440/PMSC 05269-0022C/PMSC 05269-0022Cab/WEB 5040/Gaia DR2 3220757015623151616"
{
	ParentBody      "DEL Ori"
}

Star "HD 36485 A"
{
	DateUpdated     "2024-07-06"
	ParentBody      "DEL2 Ori"
	Parallax        2.6245
	AppMagn         6.83
	Class           "B3V"
	AbsMagn         -1.07 // 计算的值
	MassSol         6 // 11
	RadSol          5.7
	LumBol          3300
	Teff            18400

	BinaryOrbit // 2010MNRAS.401.2739L
	{
		PeriodDays      29.96
		Eccentricity    0.32
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2453774.88
		ArgOfPericenter 175
		MeanAnomaly     0
	}
}

Star "HD 36485 B"
{
	DateUpdated     "2024-07-06"
	ParentBody      "DEL2 Ori"
	Class           "A0V"
	MassSol         3
}

// Object * alf Ori  ---  Red Supergiant  ---  OID=@843879   (@@18269,0)  ---  coobox=5085 
// Object types: Red Supergiant,Long-Period Variable,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Sub-Millimetric Source,Star,Infra-Red Source,UV-emission Source 
Star "ALF Ori A"
{
	DateUpdated     "2024-07-06"
	ParentBody      "ALF Ori"
	Class           "M1Ia" // M1-M2Ia-Iab
	AbsMagn         -5.85
	MassSol         14 // 19
	RadSol          640 // 764
	LumBol          65000 // 87000
	Teff            3800 // 3600
	FeH             0.05
	RotationPeriod  315576
	Age             0.014 // 0.008
}

// Object * gam Ori  ---  Variable Star  ---  OID=@784400   (@@18229,0)  ---  coobox=5067 
// Object types: Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
/*Star "GAM Ori A"
{
	DateUpdated     "2024-07-06"
	ParentBody      "GAM Ori"
	Class           "B2III"
	AbsMagn         -2.78
	MassSol         7.7
	RadSol          5.75
	LumBol          9211
	Teff            21800
	FeH             -0.07
	Age             0.0252

	BinaryOrbit     
	{
		Separation      100
	}
}*/

// Wikipedia:
// Some researchers suspected that Bellatrix was a member of 32 Orionis group. The 32 Ori group should be termed the Bellatrix 
// Cluster on the basis that the sky position and distance of Bellatrix are similar to those of the 32 Ori group. The proper motion 
// of Bellatrix deviates significantly from the mean motion of the group, leaving its membership in question. However, it may be 
// possible to reconcile membership if the divergent velocity is the result of an unseen companion. For example, a face-on orbit 
// with a black hole companion orbiting ~100 AU from the star with a period measured in centuries could account for the discrepancy.
/*Star "GAM Ori B(?)"
{
	ParentBody      "GAM Ori"
	Class           "Blackhole"
}*/

// Object * bet Ori  ---  Blue Supergiant  ---  OID=@771345   (@@15569,0)  ---  coobox=6455 
// Object types: Blue Supergiant,Pulsating Variable,Reflection Nebula,Near-IR Source (λ < 3 µm),Double or Multiple Star,Emission-line Star,Variable Star,Star,Infra-Red Source,Interstellar Medium Object,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=24436
Remove "Rigel A"{ParentBody "Rigel"}
Remove "Rigel B"{ParentBody "Rigel"}
Remove "Rigel Ba"{ParentBody "Rigel B"}
Remove "Rigel Bb"{ParentBody "Rigel B"}
Star "BET Ori A"
{
	DateUpdated     "2024-07-06"
	ParentBody      "BET Ori"
	Class           "B8Iae"
	AbsMagn         -7.84
	MassSol         21
	RadSol          74.1
	LumBol          120000
	Teff            12100
	FeH             -0.06
	Age             0.008
}

Barycenter "BET Ori BC/Gaia DR3 3206991473643150464/ADS 3823 BC/CSI-08 1063 2/GCRV 3111/SBC7 215/WDS J05145-0812BC/PMSC 05097-0819Bab/PMSC 05097-0819B/** STF 668B/CSI-08 1063 4/CSI-08 1063 5/CCDM J05145-0812BC/** BU 555BC/DENIS J051432.0-081214/WEB 4733/SBC9 307/Gaia DR2 3206991473643150464"
{
	ParentBody      "BET Ori"
	BinaryOrbit     
	{
		Period          23984
		Separation      2200
	}
}

Barycenter "BET Ori B"
{
	ParentBody      "BET Ori BC"
	BinaryOrbit     
	{
		Period          63.258
		Separation      31.7477105058678 // 0.12 asec
	}
}

Star "BET Ori Ba"
{
	DateUpdated     "2024-07-06"
	ParentBody      "BET Ori B"
	Class           "B9V"
	MassSol         3.84

	BinaryOrbit // SB9_307 1942ApJ....95..421S
	{
		PeriodDays      9.86
		Eccentricity    0.1
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2429633.195
		ArgOfPericenter 190
		MeanAnomaly     0
	}
}

Star "BET Ori Bb"
{
	DateUpdated     "2024-07-06"
	ParentBody      "BET Ori B"
	Class           ""
	MassSol         2.94
}

Star "BET Ori C"
{
	DateUpdated     "2024-07-06"
	ParentBody      "BET Ori BC"
	Class           "B9V"
	MassSol         3.84
}
