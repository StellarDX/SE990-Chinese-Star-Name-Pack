// Object * del Aur  ---  Spectroscopic Binary  ---  OID=@321439   (@@1199,0)  ---  coobox=3031 
// Object types: Spectroscopic Binary,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Star "DEL Aur A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "DEL Aur"
	Class           "K0IIIb"
	AbsMagn         0.56
	MassSol         1.63
	RadSol          11
	LumBol          62
	Teff            4786
	FeH             -0.15
	Age             3.26

	BinaryOrbit     
	{
		PeriodDays      1283.4
		Separation      0.2614
		Eccentricity    0.231
		Epoch           2452980
		ArgOfPericenter 20
		MeanAnomaly     0
	}
}

Star "DEL Aur B"
{
	ParentBody      "DEL Aur"
	Class           "K-M"
	MassSol         0.5
}

// Object * 7 Cam  ---  Spectroscopic Binary  ---  OID=@283459   (@@1168,2)  ---  coobox=3010 
// Object types: Double or Multiple Star,Spectroscopic Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=31278
Remove "7 Cam (AB)"{ParentBody "7 Cam"}
Remove "7 Cam A"{ParentBody "7 Cam (AB)"}
Remove "7 Cam Aa"{ParentBody "7 Cam A"}
Remove "7 Cam Ab"{ParentBody "7 Cam A"}
Remove "7 Cam B"{ParentBody "7 Cam (AB)"}
Remove "7 Cam C"{ParentBody "7 Cam"}
Barycenter "7 Cam/Gaia DR3 261179370751370752/HIP 23040/IDS 04493+5336 AB/GEN# +1.00031278/TIC 453039698/2MASS J04571719+5345075/PLX 1096/SBC9 289/ADS 3536 AB/AG+53 428/BD+53 829/CCDM J04573+5345AB/CSI+53 829 1/GC 6017/GCRV 2920/GSC 03734-02320/HD 31278/HIC 23040/HR 1568/JP11 946/PPM 29506/ROT 692/SAO 24929/SBC7 199/SKY# 7742/TD1 3695/TYC 3734-2320-1/UBV 4726/UBV M 10440/PLX 1096.00/WDS J04573+5345AB/** D 5/IRAS 04533+5340/Renson 8023/AKARI-IRC-V1 J0457172+534507/** STF 610AB/WEB 4470/Gaia DR2 261179370751370752"
{
	ParentBody      "ADS 3536"
	BinaryOrbit     
	{
		Epoch           2452641
		Separation      2719.07188796847 // 25.50 asec
		PositionAngle   242
	}
}

Barycenter "7 Cam Aab"
{
	ParentBody      "7 Cam"
	BinaryOrbit // VB6_FMR2013a D_5AB Gr.5
	{
		Period          2733
		Separation      300.697399947362 // 2.820 asec
		Eccentricity    0.436
		Inclination     106.5
		AscendingNode   150.2
		Epoch           2472728.580927398055792
		ArgOfPericenter 299.6
		MeanAnomaly     0
	}
}

Star "7 Cam Aa"
{
	DateUpdated     "2024-05-01"
	ParentBody      "7 Cam Aab"
	Class           "A1V"
	AbsMagn         -0.84
	MassSol         3.16
	Radius          4053527.66796398 // 计算的值
	LumBol          221.6
	Teff            9226

	BinaryOrbit     
	{
		PeriodDays      3.8845
		Eccentricity    0
		Inclination     0
		AscendingNode   0
		Epoch           2457726.05
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "7 Cam Ab"
{
	ParentBody      "7 Cam Aab"
	Class           ""
	MassSol         0.79
}

Star "7 Cam B"
{
	ParentBody      "7 Cam"
	Class           ""
	MassSol         1.53
}

// Object UCAC3 288-80042  ---  Star  ---  OID=@283460   (@@1168,3)  ---  coobox=3010 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "UCAC3 288-80042/Gaia DR3 261155903050067840/WISEA J045714.66+534454.9/TIC 453039705/ADS 3536 C/CCDM J04573+5345C/CSI+53 829 2/2MASS J04571467+5344546/WDS J04573+5345C/** STF 610C/PMSC 04493+5335C/UCAC4 719-036472/WISE J045714.64+534454.8/Gaia DR2 261155903050067840"
{
	DateUpdated     "2024-05-01"
	ParentBody      "ADS 3536"
	Parallax        9.4387
	AppMagn         11.3
	Class           ""
	AbsMagn         6.17 // 计算的值
	MassKg          1.55834306824197e+30 // log(g) = 4.465 cm/s^2
	RadSol          0.8582472 // Gaia DR3
	LumBol          0.628730137573192 // 计算的值
	Teff            5548
	FeH             -0.292
}

// Object * 9 Aur  ---  gamma Dor Variable  ---  OID=@283830   (@@787,0)  ---  coobox=3016 
// Object types: High Proper Motion Star,Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),gamma Dor Variable,Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=32537
Remove "V398 Aur A"{ParentBody "V398 Aur"}
Remove "V398 Aur B"{ParentBody "V398 Aur"}
Barycenter "9 Aur AB"
{
	ParentBody      "9 Aur"
	BinaryOrbit     
	{
		Period          68789
		Separation      2442.30886599546 // 90.500 asec
	}
}

Barycenter "9 Aur Aab/GJ 9174 A/GJ 9174/GJ 187.2 A/GJ 187.2/HIP 23783/Gaia DR3 265722999474087424/TIC 327701133/2MASS J05064067+5135519/SBC9 295/LSPM J0506+5135/ASCC 245210/USNO-B1.0 1415-00153328/AAVSO 0458+51/AG+51 459/BD+51 1024/CSI+51 1024 1/GC 6219/GCRV 3015/GSC 03357-02332/HD 32537/HIC 23783/HR 1637/IRAS 05027+5131/JP11 972/PLX 1137/PPM 29613/ROT 714/SAO 25019/SBC7 204/SKY# 8025/TD1 3940/UBV 4871/V* V398 Aur/YPAC 366/YZ 51 2081/PLX 1137.00/1RXS J050639.1+513607/uvby98 100032537/WEB 4640/HD 32537A/CCDM J05067+5136A/IDS 04588+5128 A/ADS 3675 A/TYC 3357-758-1/WDS J05067+5136A/** BU 1046A/PMSC 04588+5127Aab/PMSC 04588+5127A/TYC 3357-2332-1/Gaia DR2 265722999473092608/** H 635A/GEN# +1.00032537A"
{
	ParentBody      "9 Aur AB"
	BinaryOrbit     
	{
		Period          936.116
		Separation      121.170904424326 // 4.490 asec
	}
}

Star "9 Aur Aa"
{
	DateUpdated     "2024-05-01"
	ParentBody      "9 Aur Aab"
	Class           "F2V"
	AbsMagn         2.79 // 计算的值
	MassSol         1.97
	RadSol          1.56
	LumBol          6.042
	Teff            7023
	FeH             -0.12

	BinaryOrbit     
	{
		PeriodDays      391.7000
		Eccentricity    0.370
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2418619.000
		ArgOfPericenter 264.0
		MeanAnomaly     0
	}
}

Star "9 Aur Ab"
{
	ParentBody      "9 Aur Aab"
	Class           ""
	MassSol         0.29
}

// Object * 9 Aur B  ---  High Proper Motion Star  ---  OID=@283831   (@@787,1)  ---  coobox=3016 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "9 Aur B/GJ 9174 B/GJ 187.2 B/Gaia DR3 265722999470245632/ADS 3675 B/BD+51 1024B/CCDM J05067+5136B/CSI+51 1024 2/IDS 04588+5128 B/WDS J05067+5136B/HD 32537B/** BU 1046B/PMSC 04588+5127B/Gaia DR2 265722999470245632"
{
	DateUpdated     "2024-05-01"
	ParentBody      "9 Aur AB"
	Parallax        37.0796
	Class           ""
	MassSol         0.49
	Teff            4947
}

// Object * 9 Aur C  ---  High Proper Motion Star  ---  OID=@283834   (@@787,4)  ---  coobox=3016 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,High Proper Motion Star,Star 
Barycenter "9 Aur C/GJ 9174 C/Gaia DR3 265724476942021248/WDS J05067+5136Ca/** KPP 3180Ca/TIC 327701104/2MASS J05064917+5136347/WDS J05067+5136C/LSPM J0506+5136/ASCC 245221/USNO-B1.0 1416-00156028/ADS 3675 C/AG+51 461/BD+51 1026/CCDM J05067+5136C/GEN# +1.00032537C/HD 32537C/IDS 04588+5128 C/PPM 29620/UBV 4872/** BU 1046C/PMSC 04588+5127C/** H 635C/WISEA J050649.12+513632.7/UCAC4 709-035228/Gaia DR2 265724476942021248/Karmn J05068+516"
{
	ParentBody      "9 Aur"
}

Star "9 Aur Ca"
{
	DateUpdated     "2024-05-01"
	ParentBody      "9 Aur C"
	Parallax        37.2115
	AppMagn         9.49
	Class           "K5Ve"
	AbsMagn         7.34
	MassSol         0.751
	RadSol          0.756
	LumBol          0.162
	Teff            4633

	BinaryOrbit     
	{
		Period          477.264
		Separation      61.7819565673457 // 2.299 asec
	}
}

Star "9 Aur Cb"
{
	ParentBody      "9 Aur C"
	Class           ""
	MassSol         0.33
}

// Object * 31 Cam  ---  Eclipsing Binary  ---  OID=@320931   (@@1782,0)  ---  coobox=2935 
// Object types: Near-IR Source (λ < 3 µm),Eclipsing Binary,Spectroscopic Binary,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "31 Cam A"{ParentBody "31 Cam"}
Remove "31 Cam B"{ParentBody "31 Cam"}
Star "31 Cam A"
{
	DateUpdated     "2024-05-01"
	ParentBody      "HIP 27971"
	Class           "A0IV"
	AbsMagn         -0.51
	MassSol         3.03
	Radius          3685537.54092675 // 计算的值
	LumBol          179.8
	Teff            9183

	BinaryOrbit     
	{
		PeriodDays      2.9333
		Eccentricity    0.00
		AscendingNode   0.00
		Epoch           2423443.05
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "31 Cam B"
{
	ParentBody      "HIP 27971"
	Class           "F0"
}