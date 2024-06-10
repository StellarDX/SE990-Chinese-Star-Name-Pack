// Object * gam Cyg  ---  Variable Star  ---  OID=@52992   (@@11378,0)  ---  coobox=21 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "GAM Cyg A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "GAM Cyg"
	Class           "F8Iab"
	AbsMagn         -4.54
	MassSol         12.11
	RadSol          174
	LumBol          32073.7
	Teff            5863
	FeH             0.02
	Age             0.012
}

Barycenter "CCDM J20222+4015BC"
{
	ParentBody      "GAM Cyg"
	BinaryOrbit     
	{
		Separation      22471.9100358227 // 40 asec
	}
}

Star "CCDM J20222+4015B"
{
	ParentBody      "CCDM J20222+4015BC"
	Class           "O8.6?"

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.198691067
		Eccentricity    0
		Inclination     0.15187192
		AscendingNode   0
		ArgOfPericenter -33.4254077
		MeanAnomaly     66.2664013
	}
}

Star "CCDM J20222+4015C"
{
	ParentBody      "CCDM J20222+4015BC"
	Class           "B5.1?"
}

// Object * del Cyg  ---  High Proper Motion Star  ---  OID=@194918   (@@11034,0)  ---  coobox=93 
// Object types: High Proper Motion Star,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "DEL Cyg A" {ParentBody "DEL Cyg"}
Remove "DEL Cyg B" {ParentBody "DEL Cyg"}
Star "DEL Cyg A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "HIP 97165"
	Class           "B9III"
	AbsMagn         -0.74
	MassSol         2.93
	RadSol          4.81
	LumBol          155
	Teff            10400

	BinaryOrbit     
	{
		Period          780.27
		Separation      151.745115865279 // 3.0 asec
		Eccentricity    0.4670
	}
}

// Object * del Cyg B  ---  Star  ---  OID=@11627049   (@@-1,255)  ---  coobox=93 
// Object types: Double or Multiple Star,Variable Star,Star 
Star "DEL Cyg B/ADS 12880 B/CSI+44 3234 4/IDS 19418+4453 B/NSV 12380/WDS J19450+4508B/Gaia DR2 2079784487997851392/TYC 3557-2486-2"
{
	DateUpdated     "2024-06-09"
	ParentBody      "HIP 97165"
	Class           "F1V"
}

// Object * nu. Cyg  ---  Double or Multiple Star  ---  OID=@31842   (@@10897,0)  ---  coobox=48 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "NU Cyg A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "NU Cyg"
	Class           "A0IIIn"
	AbsMagn         -1.36
	MassSol         3.62
	RadSol          1.90
	LumBol          412
	Teff            9462

	BinaryOrbit     
	{
		Separation      30.1626855417006 // 0.24 asec
	}
}

Star "NU Cyg B"
{
	ParentBody      "NU Cyg"
	Class           "B8.7?"
}

// Object * tau Cyg  ---  delta Sct Variable  ---  OID=@747   (@@10876,0)  ---  coobox=10 
// Object types: High Proper Motion Star,delta Sct Variable,High Proper Motion Star,High Proper Motion Star,delta Sct Variable,Variable Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=202444
Remove "TAU Cyg (ABC)"{ParentBody "TAU Cyg"}
Remove "TAU Cyg (AB)"{ParentBody "TAU Cyg (ABC)"}
Remove "TAU Cyg A"{ParentBody "TAU Cyg (AB)"}
Remove "TAU Cyg B"{ParentBody "TAU Cyg (AB)"}
Remove "TAU Cyg F"{ParentBody "TAU Cyg (ABC)"}
Remove "TAU Cyg I"{ParentBody "TAU Cyg"}
// A旁边可能还有一个物体Ab，可能是行星，不过目前还未证实。I(LSR J2115+3804，距离534.07秒，usdK7型次矮星)为光学伴星。
Barycenter "TAU Cyg AB"
{
	ParentBody      "TAU Cyg"
	BinaryOrbit // VB6_Mut2010e AGC_13AB Gr.1
	{
		Period          42110
		Separation      1813.66963612683 // 89.16 asec
	}
}

Star "TAU Cyg A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "TAU Cyg AB"
	Class           "F2IV"
	AbsMagn         2.19 // 计算的值
	MassSol         1.65
	RadSol          2.48
	LumBol          10.514116433441163 // 计算的值
	Teff            6600
	FeH             0.05

	BinaryOrbit     
	{
		Period          49.6257
		Separation      18.5719920769979 // 0.913 asec
		Eccentricity    0.239
		Inclination     134.4
		AscendingNode   339.8
		Epoch           2447552.436165423598140
		ArgOfPericenter 298.8
		MeanAnomaly     0
	}
}

Planet "TAU Cyg Ab(?)"
{
	DateUpdated     "2024-06-09"
	ParentBody      "TAU Cyg A"

	Orbit     
	{
		Period          2.2177
		Eccentricity    0.430
		Inclination     92.6
		AscendingNode   78.7
		Epoch           2453138.450353580527008
		ArgOfPericenter 90.0
		MeanAnomaly     0
	}
}

// Object * tau Cyg B  ---  High Proper Motion Star  ---  OID=@751   (@@10876,4)  ---  coobox=10 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "TAU Cyg B/GJ 9728 B/GJ 822.1 B/ADS 14787 B/BD+37 4240B/CCDM J21148+3803B/CSI+37 4240 6/IDS 21108+3737 B/UBV 21457/WDS J21148+3803B/** AGC 13B/PMSC 21108+3737B/TYC 3169-3876-2/Gaia DR2 1964791583375277312"
{
	DateUpdated     "2024-06-09"
	ParentBody      "TAU Cyg AB"
	Class           "G0V"
	MassSol         1.03
	RadSol          0.93
	LumBol          0.8053632551398009 // 计算的值
	Teff            5670
}

// Object G 211-14  ---  Double or Multiple Star  ---  OID=@848   (@@10880,12)  ---  coobox=10 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Barycenter "G 211-14/GJ 9728 C/GJ 822.1 C/Gaia DR3 1964791549008457856/TIC 167092174/LSPM J2114+3801/ASCC 532849/2MASS J21144685+3801137/ADS 14787 QR/CCDM J21148+3803Q/CSI+37 4240 4/G 212-31/LHS 6374/LTT 16231/NLTT 50859/UBV 18374/UBV 21455/[RHG95] 3320/WDS J21148+3803F/PMSC 21108+3737Q/UCAC3 257-235487/** AGC 13F/UCAC4 641-107841/** JOD 20/WDS J21148+3803Fa,Fb/WISEA J211447.01+380118.9/PM J21147+3801/Gaia DR2 1964791549008457856"
{
	ParentBody      "TAU Cyg"
}

Star "G 211-14 A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "G 211-14"
	Parallax        49.1048
	AppMagn         11.946
	Class           "M2.5V"
	AbsMagn         10.4 // 计算的值
	MassSol         0.44

	BinaryOrbit     
	{
		Period          27.369
		Separation      8.14594464309241 // 0.400 asec
		PositionAngle   349
	}
}

Star "G 211-14 B"
{
	DateUpdated     "2024-06-09"
	ParentBody      "G 211-14"
	Class           "M4V"
	MassSol         0.28
}

// Object * ups Cyg  ---  Be Star  ---  OID=@1582625   (@@33177,3)  ---  coobox=9566 
// Object types: Be Star,Near-IR Source (λ < 3 µm),Emission-line Star,Variable Star,Double or Multiple Star,Star,UV-emission Source 
Star "UPS Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "UPS Cyg"
	Class           "B2Vne"
	AbsMagn         -2.03
	MassSol         9.25
	RadSol          4.7
	LumBol          7305
	Teff            22000
	FeH             -0.36
	Age             0.017
	Oblateness      0.15254237288135593220338983050847 // Vsini = 230 Km/s

	BinaryOrbit     
	{
		Period          11.4 // 径向速度测量值
	}
}

Star "UPS Cyg B(?)" // 未经证实的伴星，目前所有已知伴星均为光学伴星
{
	ParentBody      "UPS Cyg"
	Class           "B9.1?"
}

// Object * zet Cyg  ---  Spectroscopic Binary  ---  OID=@1539166   (@@32208,0)  ---  coobox=9549 
// Object types: Spectroscopic Binary,Spectroscopic Binary,White Dwarf,Double or Multiple Star,Near-IR Source (λ < 3 µm),Chemically Peculiar Star,Star,Infra-Red Source,UV-emission Source 
Remove "ZET Cyg A" {ParentBody "ZET Cyg"}
Remove "ZET Cyg B" {ParentBody "ZET Cyg"}
Star "ZET Cyg A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "Gaia DR3 1851924859353116928"
	Class           "G8III-IIIaBa0.5"
	AbsMagn         -0.01
	MassSol         3.05
	RadSol          15
	LumBol          112
	Teff            4910
	FeH             -0.04
	Age             0.2

	BinaryOrbit     
	{
		Period          6489
		Separation      8.7109198290944 // 0.19 asec
		Eccentricity    0.22
		Epoch           2440712
		ArgOfPericenter 221
		MeanAnomaly     0
	}
}

Star "ZET Cyg B"
{
	DateUpdated     "2024-06-10"
	ParentBody      "Gaia DR3 1851924859353116928"
	Class           "DA4.2"
	MassSol         0.6
	Teff            12000
}

// Object * eps Cyg  ---  Double or Multiple Star  ---  OID=@2933504   (@@62317,0)  ---  coobox=20467 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=102488
// NoirLab还列出了一颗小星，质量0.35太阳质量，与A的距离93.4秒，可能是M4型红矮星，但是又有文献说其色温相当于A4型恒星，所以也可能是白矮星。
// 由于这颗小星目前无法确认是不是有物理联系，故此处不添加
Remove "EPS Cyg A" {ParentBody "EPS Cyg"}
Remove "EPS Cyg B" {ParentBody "EPS Cyg"}
Barycenter "EPS Cyg A"
{
	ParentBody      "GJ 9707"
	BinaryOrbit     
	{
		Period          34202
		Separation      1811.38524385626
	}
}

Star "EPS Cyg Aa"
{
	DateUpdated     "2024-06-10"
	ParentBody      "EPS Cyg A"
	Class           "K0III"
	AbsMagn         0.74
	MassSol         2
	RadSol          10.82
	LumBol          62
	Teff            4710
	FeH             -0.27
	RotationPeriod  244.7175
	Age             1.5

	BinaryOrbit     
	{
		Period          55.1
		Eccentricity    0.9
		Epoch           2457388.408578596077859
		ArgOfPericenter 300
		MeanAnomaly     0
	}
}

Star "EPS Cyg Ab"
{
	DateUpdated     "2024-06-10"
	ParentBody      "EPS Cyg A"
	Class           ""
	MassSol         0.62
}

// Object * eps Cyg C  ---  High Proper Motion Star  ---  OID=@9608257   (@@-1,255)  ---  coobox=20467 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Double or Multiple Star,Star 
Star "EPS Cyg C/GJ 9707 C/Gaia DR3 1869302674999983104/TIC 232834397/UCAC3 248-240422/** STT 594B/WDS J20462+3358B/** BU 676B/CCDM J20462+3358B/2MASS J20460525+3358120/NLTT 49859/LSPM J2046+3358W/** LEP 96D/Gaia DR2 1869302674999983104"
{
	DateUpdated     "2024-06-10"
	ParentBody      "GJ 9707"
	Parallax        45.5839
	AppMagn         14.29
	Class           "M3"
	AbsMagn         12.6 // 计算的值
	MassSol         0.31
	RadSol          0.3383028 // Gaia DR3
	LumBol          0.0110161228863241 // 计算的值
	Teff            3215
	FeH             -1.114
}
