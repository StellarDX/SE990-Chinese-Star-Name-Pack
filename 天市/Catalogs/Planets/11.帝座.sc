// Object * alf Her A  ---  Long-Period Variable  ---  OID=@2730728   (@@115099,0)  ---  coobox=18030 
// Object types: Long-Period Variable,Double or Multiple Star,Variable Star,Star,Infra-Red Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=84345
Remove "Ras Algethi A"{ParentBody "Ras Algethi"}
Remove "Ras Algethi B"{ParentBody "Ras Algethi"}
Remove "ALF Her Ba"{ParentBody "ALF Her B"}
Remove "ALF Her Bb"{ParentBody "ALF Her B"}
Barycenter "ALF Her A/PLX 3912/ALF1 Her/64 Her A/ADS 10418 A/BD+14 3207A/CCDM J17146+1424A/CSI+14 3207 2/DO 15854/GC 23277/GCRV 9944/HD 156014/HR 6406/IDS 17101+1430 A/IRAS 17123+1426/IRC +10324/N30 3843/RAFGL 1947/ROT 2423/SAO 102680/SKY# 31074/V* ALF Her/YZ 14 6030/WDS J17146+1423A/** STF 2140A/WDS J17146+1423Aa,Ab/PMSC 17101+1430Aab/PMSC 17101+1430A/TYC 990-2133-1/WEB 14238"
{
	ParentBody      "ALF Her"
	BinaryOrbit // VB6_Baz1978 STF2140AB Gr.4
	{
		Period          3600.0000
		Separation      515.986843124158 // 4.680 asec
		Eccentricity    0.000
		Inclination     155.8
		AscendingNode   119.6
		Epoch           2391280
		ArgOfPericenter 0.0
		MeanAnomaly     0
	}
}

Star "ALF Her Aa"
{
	DateUpdated     "2024-05-17"
	ParentBody      "ALF Her A"
	Class           "M5Ib-II"
	AbsMagn         -2.3
	MassSol         2.5
	RadSol          284 // 264 - 303
	LumBol          7244 // 9333
	Teff            3155 // 3365

	BinaryOrbit // VB6_Baz1978 STF2140AB Gr.4
	{
		Period          22.014
		Separation      21.1679840494311 // 0.192 asec
	}
}

Star "ALF Her Ab" // Noirlab说A还有一颗伴星Ab，距离0.192秒，但Wikipedia只字未提
{
	ParentBody      "ALF Her A"
	Class           "B0.2?"
}

// Object * alf Her B  ---  Spectroscopic Binary  ---  OID=@2730579   (@@52766,15)  ---  coobox=18030 
// Object types: Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "ALF Her B/Gaia DR3 4541877995116193408/64 Her B/ALF2 Her/ADS 10418 B/BD+14 3207B/CCDM J17146+1424B/CSI+14 3207 1/GC 23278/GCRV 9945/HD 156015/HR 6407/IDS 17101+1430 B/SAO 102681/SBC7 615/SKY# 31075/WDS J17146+1423B/** STF 2140B/PMSC 17101+1430B/PMSC 17101+1430Bab/GCRV 20001/TYC 990-2134-1/UCAC4 522-062373/WEB 14240/Gaia DR2 4541877995116193408/SBC9 955"
{
	ParentBody      "ALF Her"
}

Star "ALF Her Ba"
{
	DateUpdated     "2024-05-17"
	ParentBody      "Gaia DR3 4541877995116193408"
	Class           "G5III"
	AbsMagn         1.8
	MassSol         2.5
	Radius          10835982.0444816 // 计算的值
	LumBol          126
	Teff            4900

	BinaryOrbit     
	{
		PeriodDays      51.5780
		Eccentricity    0.020
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2434791.027
		ArgOfPericenter 247.5
		MeanAnomaly     0
	}
}

Star "ALF Her Bb"
{
	DateUpdated     "2024-05-17"
	ParentBody      "Gaia DR3 4541877995116193408"
	Class           "F2V:"
	AbsMagn         2.8
	MassSol         2
	Radius          2187696.94350924 // 计算的值
	LumBol          26
	Teff            7350
	Age             0.41 // 1.25
}