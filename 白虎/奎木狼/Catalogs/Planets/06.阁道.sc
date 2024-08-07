// Object * iot Cas  ---  alpha2 CVn Variable  ---  OID=@242194   (@@116498,0)  ---  coobox=2444 
// Object types: alpha2 CVn Variable,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "IOT Cas (AB)"{ParentBody "IOT Cas"}
Remove "IOT Cas C"{ParentBody "IOT Cas"}
Remove "IOT Cas A"{ParentBody "IOT Cas (AB)"}
Remove "IOT Cas Aa"{ParentBody "IOT Cas A"}
Remove "IOT Cas Ab"{ParentBody "IOT Cas A"}
Remove "IOT Cas B"{ParentBody "IOT Cas (AB)"}
Remove "IOT Cas Ca"{ParentBody "IOT Cas C"}
Remove "IOT Cas Cb"{ParentBody "IOT Cas C"}
// AB-C目前的距离是7秒，但是A-B的距离已经有6.5秒了
// 出现这种情况可能就是AB-C的真实半长轴远大于7秒，或者轨道面几乎是平行于视线的
// 还有一种可能就是AB-C是非周期轨道
// (翻了之前的数据发现AB-C的离心率出现了一个高到离谱的值，为8.1)
// Jim Kaler认为B或C是光学伴星，和A并没有联系
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=11569
Barycenter "IOT Cas AB"
{
	ParentBody      "HIP 11569"
	BinaryOrbit // VB6
	{
		Separation      315
		Eccentricity    8.1
		Inclination     87.6
		AscendingNode   109.8
		Epoch           2542855.083093349821866
		ArgOfPericenter 8.8
		MeanAnomaly     0
	}
}

// Object * iot Cas A  ---  Double or Multiple Star  ---  OID=@3732497   (@@113870,18)  ---  coobox=2444 
// Object types: Double or Multiple Star,Star 
Barycenter "IOT Cas A/Gaia DR3 517650349234855424/ADS 1860 A/CCDM J02292+6725A/HD 15089A/TYC 4058-1504-1/WDS J02291+6724Aa,Ab/Renson 3760/BD+66 213A/WDS J02291+6724A/** CHR 6/** STF 262A/PMSC 02208+6657Aab/PMSC 02208+6657A/Gaia DR2 517650349234855424"
{
	ParentBody      "IOT Cas AB"
	BinaryOrbit // Tok 2021
	{
		Period          2400
		Separation      294.382770662613 // 6.5 asec
		Eccentricity    0.4
		Inclination     102.9
		AscendingNode   188
		Epoch           2064387.802690240088850
		ArgOfPericenter 293.3
		MeanAnomaly     0
	}
}

Star "IOT Cas A1"
{
	DateUpdated     "2024-06-21"
	ParentBody      "Gaia DR3 517650349234855424"
	Class           "knA2h(eA)VSr((Eu))"
	AbsMagn         1.62
	MassSol         1.98
	RadSol          2.3
	LumBol          24
	Teff            8360
	RotationPeriod  41.76792
	Age             0.100

	BinaryOrbit // Tok 2021
	{
		Period          48.72
		Separation      19.1577229104617 // 0.423 asec
		Eccentricity    0.637
		Inclination     148.2
		AscendingNode   176.6
		Epoch           2449064.538868376985192
		ArgOfPericenter 328.2
		MeanAnomaly     0
	}
}

Star "IOT Cas A2"
{
	DateUpdated     "2024-06-21"
	ParentBody      "Gaia DR3 517650349234855424"
	Class           "G6"
	MassSol         0.98
}

// Object * iot Cas B  ---  Star  ---  OID=@3732498   (@@113870,19)  ---  coobox=2444 
// Object types: Double or Multiple Star,Star 
Star "IOT Cas B/Gaia DR3 517650353531686144/ADS 1860 B/CCDM J02292+6725B/HD 15089B/TYC 4058-1504-2/WDS J02291+6724B/** STF 262B/PMSC 02208+6657B/Gaia DR2 517650353531686144"
{
	DateUpdated     "2024-06-21"
	ParentBody      "IOT Cas AB"
	Parallax        21.0325
	AppMagn         6.87
	Class           "F5V"
	AbsMagn         3.48
	MassSol         1.28
	Teff            6540
}

// Object * iot Cas C  ---  Double or Multiple Star  ---  OID=@242042   (@@3375,13)  ---  coobox=2444 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Barycenter "IOT Cas C/Gaia DR3 517650143080142592/TIC 279509401/2MASS J02290508+6724055/ADS 1860 C/CCDM J02292+6725C/CSI+66 213 2/GCRV 1389/GEN# +1.00015089C/HD 15089C/TYC 4058-1505-1/UBV 2493/WDS J02291+6724C/** STF 262C/** CTU 2/WDS J02291+6724Ca,Cb/PMSC 02208+6657C/WEB 2411/Gaia DR2 517650143080142592"
{
	ParentBody      "HIP 11569"
}

Star "IOT Cas Ca"
{
	DateUpdated     "2024-06-21"
	ParentBody      "Gaia DR3 517650143080142592"
	Parallax        22.1168
	AppMagn         8.4
	Class           "G4V"
	AbsMagn         5.12 // 计算的值
	MassSol         0.96
	Teff            4520

	BinaryOrbit     
	{
		Period          61.144
		Separation      18.3119486676129 // 0.405 asec, 0.22 asec and PA. 100.8 deg in 2018
	}
}

Star "IOT Cas Cb"
{
	DateUpdated     "2024-06-21"
	ParentBody      "Gaia DR3 517650143080142592"
	Class           "M2"
	MassSol         0.70
	Teff            3590
}

// Object * del Cas  ---  Eclipsing Binary  ---  OID=@168281   (@@3602,0)  ---  coobox=2256 
// Object types: High Proper Motion Star,Eclipsing Binary,High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "Ksora A" {ParentBody "Ksora"}
Remove "Ksora B" {ParentBody "Ksora"}
Star "DEL Cas A"
{
	DateUpdated     "2024-06-21"
	ParentBody      "DEL Cas"
	Class           "A5IV"
	AbsMagn         0.28
	MassSol         2.49
	RadSol          3.90
	LumBol          72.88
	Teff            7980
	Age             0.6

	BinaryOrbit     
	{
		PeriodDays      759
	}
}

Star "DEL Cas A"
{
	ParentBody      "DEL Cas"
	Class           "M7.6?"
}

// Object * omi Cas  ---  Be Star  ---  OID=@23062   (@@3995,8)  ---  coobox=2092 
// Object types: Be Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Double or Multiple Star,Variable Star,Emission-line Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=3504
Remove "OMI Cas A"{ParentBody "OMI Cas"}
Remove "OMI Cas B"{ParentBody "OMI Cas"}
Remove "OMI Cas Aa"{ParentBody "OMI Cas A"}
Remove "OMI Cas Ab"{ParentBody "OMI Cas A"}
Barycenter "OMI Cas A"
{
	ParentBody      "Gaia DR3 390548351252549760"
	BinaryOrbit     
	{
		Period          184122
		Separation      7123.1999896463 // 33.92 asec
	}
}

Star "OMI Cas A1"
{
	DateUpdated     "2024-06-21"
	ParentBody      "OMI Cas A"
	Class           "B5IIIe"
	AbsMagn         -2.55
	MassSol         6.2
	RadSol          8.0
	LumBol          2215.0615320656325
	Teff            14000
}

Barycenter "OMI Cas A2"
{
	ParentBody      "OMI Cas A"
	BinaryOrbit // VB6_Doc2019b NOI_3Aa, Gr.3
	{
		Period          2.8350
		Separation      3.60574374325836 // 0.017 asec
		Eccentricity    0.019
		Inclination     113.4
		AscendingNode   88.6
		Epoch           2454088.810554808471352
		ArgOfPericenter 272.9
		MeanAnomaly     0
	}
}

Star "OMI Cas Ab1"
{
	DateUpdated     "2024-06-21"
	ParentBody      "OMI Cas A2"
	Class           "A"
	AbsMagn         0.35
	MassSol         2.03

	BinaryOrbit     
	{
		PeriodDays      1.2578
	}
}

Star "OMI Cas Ab2"
{
	DateUpdated     "2024-06-21"
	ParentBody      "OMI Cas A2"
	Class           "A"
	MassSol         2.03
}

// Object BD+47 183B  ---  Star  ---  OID=@23063   (@@3996,0)  ---  coobox=2092 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD+47 183B/Gaia DR3 390548351254724480/TIC 240757318/ADS 622 B/CCDM J00447+4817B/CSI+47 183 2/HD 4180B/IDS 00392+4744 B/2MASS J00444065+4817219/WDS J00447+4817B/** BU 231B/Gaia DR2 390548351254724480"
{
	DateUpdated     "2024-06-21"
	ParentBody      "Gaia DR3 390548351252549760"
	Parallax        2.4924
	AppMagn         11.2
	Class           "F8"
	AbsMagn         3.18 // 计算的值
	MassSol         1.06
}