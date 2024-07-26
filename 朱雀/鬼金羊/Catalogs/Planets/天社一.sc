// 天社一 - 全天最亮的沃尔夫-拉叶星
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=68273
Remove "Regor A"{ParentBody "Regor"}
Remove "Regor B"{ParentBody "Regor"}
Remove "Regor Aa"{ParentBody "Regor A"}
Remove "Regor Ab"{ParentBody "Regor A"}
Remove "Regor Ba"{ParentBody "Regor B"}
Remove "Regor Bb"{ParentBody "Regor B"}

// Object * gam02 Vel  ---  Wolf-Rayet  ---  OID=@2994088   (@@66182,0)  ---  coobox=20659 
// Object types: Wolf-Rayet,Variable Star,Centimetric Radio Source,Spectroscopic Binary,Wolf-Rayet,Near-IR Source (λ < 3 µm),HII Region,Emission-line Star,Variable Star,Double or Multiple Star,Star,Star,Infra-Red Source,Radio Source,UV-emission Source,X-ray Source 
Barycenter "GAM2 Vel/HIP 39953/TIC 354825513/2MASS J08093195-4720115/SBC9 500/GAM Vel/2E 0808.0-4711/2E 1936/ALS 980/CCDM J08095-4721A/CD-46 3840/CD-46 3847/CEL 2193/CPC 0 5440/CPD-46 2202/FK5 309/GC 11105/GCRV 5419/GEN# +1.00068273/GOS G262.80-07.69 01/GSC 08140-06533/GUM 12a/HD 68273/HIC 39953/HR 3207/Hen 3-127/IDS 08065-4703 A/IRAS 08079-4711/JP11 1639/LS 980/MOST 0807-471/MR 12/N30 1888/PPM 312662/SACS 178/SAO 219504/SBC7 334/SKY# 15412/TYC 8140-6533-1/UBV 7815/V* GAM2 Vel/WR 11/[ALL76] A/PLX 1940.01/1ES 0807-47.1/1RXS J080933.7-472027/WDS J08095-4720Aa,Ab/WDS J08095-4720A/** DUN 65A/** TOK 2/PMSC 08065-4702AP/PMSC 08065-4702Aab/PMSC 08065-4702A/2XMM J080931.9-472011/AT20G J080931-472011/Regor/UCAC4 214-020008/WEB 7786"
{
	ParentBody      "CCDM J08095-4721"
}

Star "GAM2 Vel A"
{
	DateUpdated     "2024-07-25"
	ParentBody      "GAM2 Vel"
	Class           "WC8"
	AbsMagn         -4.6
	MassSol         9.0
	RadSol          1.9
	LumBol          204000
	Luminosity      5900
	Teff            90000
	Age             0.005
	Oblateness      0

	BinaryOrbit     
	{
		PeriodDays      78.53
		SemiMajorAxisKm 1.796E8
		Eccentricity    0.334
		Inclination     65.5
		AscendingNode   247.7
		Epoch           2450120.4
		ArgOfPericenter 67.4
		MeanAnomaly     0
	}
}

Star "GAM2 Vel B"
{
	DateUpdated     "2024-07-25"
	ParentBody      "GAM2 Vel"
	Class           "O7.5III"
	AbsMagn         -6.0
	MassSol         28.5
	RadSol          16.2
	LumBol          363000
	Luminosity      21500
	Teff            35100
	Age             0.005
	Oblateness      0
}

Star "GAM Vel Ac"
{
	DateUpdated     "2024-07-25"
	ParentBody      "CCDM J08095-4721"
	Class           "K4V"
	MassSol         0.56

	Orbit     
	{
		// 已知
		Period          3518
		SemiMajorAxis   1606.16433614112 // 4.690 asec
		// 生成
		Eccentricity    0.45201452
		Inclination     117.216089
		AscendingNode   194.877885
		ArgOfPericenter 48.6416184
		MeanAnomaly     347.891875
	}
}

// Object * gam01 Vel  ---  Young Stellar Object  ---  OID=@2993900   (@@66170,0)  ---  coobox=20659 
// Object types: Spectroscopic Binary,Young Stellar Object,Spectroscopic Binary,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Barycenter "GAM1 Vel/Gaia DR3 5519266900766220800/TIC 354825493/2MASS J08092932-4720430/SBC9 499/CCDM J08095-4721B/CD-46 3846/CPC 0 5439/CPD-46 2202B/GC 11103/GCRV 5417/GSC 08140-06534/HD 68243/HR 3206/IDS 08065-4703 B/JP11 1638/NSV 3930/PPM 312661/ROT 1309/SAO 219501/SKY# 15406/TYC 8140-6534-1/UBV 7810/UBV M 14049/[ALL76] B/[B10] 2166/uvby98 100068243/ALS 14916/EUVE J0809-47.3/WDS J08095-4720B/** DUN 65B/PMSC 08065-4702B/PMSC 08065-4702Bab/GEN# +1.00068243/WEB 7785/Gaia DR2 5519266900766220800"
{
	ParentBody      "CCDM J08095-4721"
	Orbit     
	{
		// 已知
		Period          177895
		SemiMajorAxis   14102.7397061854 // 41.18 asec
		// 生成
		Eccentricity    0.362760893
		Inclination     247.380554
		AscendingNode   202.062267
		ArgOfPericenter 170.782176
		MeanAnomaly     119.918246
	}
}

Star "GAM1 Vel A"
{
	DateUpdated     "2024-07-25"
	ParentBody      "GAM1 Vel"
	Parallax        2.6052
	AppMagn         4.173
	Class           "B2III"
	AbsMagn         -3.62
	MassSol         14
	Age             0.008
	Oblateness      0

	BinaryOrbit // SB9_499 1980PASP...92..819H
	{
		PeriodDays      1.4826
		Separation      0.09327498848456932289267618608936 // 0.243 mas
		Eccentricity    0.060
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2437663.539
		ArgOfPericenter 17.6
		MeanAnomaly     0
	}
}

Star "GAM1 Vel B"
{
	DateUpdated     "2024-07-25"
	ParentBody      "GAM1 Vel"
	Class           ""
	MassSol         1.44
}

// Object CD-46 3848  ---  Young Stellar Object  ---  OID=@2993901   (@@66170,1)  ---  coobox=20659 
// Object types: Young Stellar Object,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Young Stellar Object Candidate 
Star "CD-46 3848/Gaia DR3 5519219999721187968/TIC 354825478/2MASS J08093482-4721069/CCDM J08095-4721C/CPC 0 5441/CPD-46 2202C/GC 11106/GSC 08140-06535/IDS 08065-4703 C/PPM 312663/SAO 219505/TYC 8140-6535-1/[ALL76] C/uvby98 -004603848/WDS J08095-4720C/[HHC2008] 277/** DUN 65C/PMSC 08065-4702C/Gaia DR2 5519219999721187968"
{
	DateUpdated     "2024-07-25"
	ParentBody      "CCDM J08095-4721"
	Parallax        2.9193
	AppMagn         7.29
	Class           "B6V"
	AbsMagn         -0.384 // 计算的值
	MassKg          6.45781881179149e+30 // log(g) = 4.095 cm/s^2
	RadSol          2.675 // Gaia DR3
	LumBol          276.813921506525 // 计算的值
	Teff            14395
	FeH             -0.709
	Oblateness      0

	Orbit     
	{
		// 已知
		Period          165353
		SemiMajorAxis   21410.9588006842 // 62.52 asec
		// 生成
		Eccentricity    0.217244947
		Inclination     76.4555843
		AscendingNode   324.45166
		ArgOfPericenter 349.85108
		MeanAnomaly     238.336099
	}
}

// Object CD-46 3849  ---  Young Stellar Object  ---  OID=@17887101   (@@-1,255)  ---  coobox=20659 
// Object types: Young Stellar Object,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Young Stellar Object Candidate,Young Stellar Object Candidate 
Barycenter "CD-46 3849/Gaia DR3 5519219931001716736/WISE J080937.63-472125.7/UCAC4 214-020041/CCDM J08095-4721D/** I 1175D/WDS J08095-4720D/IDS 08065-4703 D/[HHC2008] 285/[ALL76] D/SAO 219506/PPM 312668/GC 11109/CPC 0 5442/2MASS J08093763-4721256/TYC 8140-6542-1/TIC 354825462/Gaia DR2 5519219931001716736"
{
	ParentBody      "CCDM J08095-4721"
	Orbit     
	{
		// 已知
		SemiMajorAxis   32047.9449342696 // 93.58 asec
		// 生成
		Eccentricity    0.458763952
		Inclination     8.48289714
		AscendingNode   225.181398
		ArgOfPericenter 35.1181867
		MeanAnomaly     294.956645
	}
}

Star "CD-46 3849A"
{
	DateUpdated     "2024-07-25"
	ParentBody      "CD-46 3849"
	Parallax        2.9817
	AppMagn         9.22
	Class           "F0"
	AbsMagn         1.59 // 计算的值
	MassKg          4.7578621938443e+30 // log(g) = 4.216 cm/s^2
	RadSol          1.9975 // Gaia DR3
	LumBol          33.5236330679951 // 计算的值
	Teff            9827
	FeH             -0.011
	Oblateness      0

	BinaryOrbit
	{
		// 已知
		Separation      544.520177809584 // 1.59 asec
		// 生成
		Eccentricity    0.459462654
		Inclination     -0.956948042
		AscendingNode   0
		ArgOfPericenter 62.5679233
		MeanAnomaly     -140.130369
	}
}

// Object CD-46 3849B  ---  Star  ---  OID=@17887099   (@@-1,255)  ---  coobox=20659 
// Object types: Double or Multiple Star,Star 
Star "CD-46 3849B/Gaia DR3 5519219931004461184/WDS J08095-4720E/CCDM J08095-4721E/** I 1175E/Gaia DR2 5519219930995392896"
{
	ParentBody      "CD-46 3849"
	Class           "G3.9?"
}