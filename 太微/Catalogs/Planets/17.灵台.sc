// Object * chi Leo  ---  High Proper Motion Star  ---  OID=@1787414   (@@36751,6)  ---  coobox=13212 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "CHI Leo A" {ParentBody "CHI Leo"}
Remove "CHI Leo B" {ParentBody "CHI Leo"}
Star "CHI Leo A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "HIP 54182"
	Class           "F2III"
	AbsMagn         2.31
	MassSol         1.62
	RadSol          1.99
	LumBol          9.9
	Teff            7022
	FeH             0.03
	Age             1.40

	BinaryOrbit     
	{
		Epoch           2447893
		Separation      118.494708521182 // 4.1 asec
		PositionAngle   264
	}
}

// Object * chi Leo B  ---  High Proper Motion Star  ---  OID=@15318951   (@@-1,255)  ---  coobox=13212 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "CHI Leo B/Gaia DR3 3818309974360006016/Gaia DR2 3818309974359047936/* 63 Leo B/** KUI 54B/CCDM J11050+0721B/HD 96097B/WDS J11050+0720B"
{
	DateUpdated     "2024-05-06"
	ParentBody      "HIP 54182"
	Parallax        34.4743
	Class           "F8.9?"
}

// Object * 58 Leo  ---  Double or Multiple Star  ---  OID=@1769573   (@@36768,1)  ---  coobox=13235 
// Object types: Chemically Peculiar Star,Near-IR Source (λ < 3 µm),Chemically Peculiar Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "58 Leo A"
{
	DateUpdated     "2024-05-06"
	ParentBody      "58 Leo"
	Class           "K0.5IIIFe-0.5"
	AbsMagn         -1.04
	MassSol         1.89
	Radius          15311797.4530373 // 计算的值
	LumBol          182
	Teff            4519
	FeH             -0.16
	Age             1.69

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   86.8249793
		Eccentricity    0.247568802
		Inclination     -0.829782963
		AscendingNode   0
		ArgOfPericenter 177.348534
		MeanAnomaly     167.543853
	}
}

Star "58 Leo B"
{
	ParentBody      "58 Leo"
	Class           "WD?"
}