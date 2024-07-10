// Object * iot Lep  ---  Double or Multiple Star  ---  OID=@772036   (@@15276,11)  ---  coobox=6549 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=24244
Remove "IOT Lep A"{ParentBody "IOT Lep"}
Remove "IOT Lep B"{ParentBody "IOT Lep"}
Remove "IOT Lep Aa"{ParentBody "IOT Lep A"}
Remove "IOT Lep Ab"{ParentBody "IOT Lep A"}
Barycenter "IOT Lep A"
{
	ParentBody      "HIP 24244"
	BinaryOrbit     
	{
		Period          10603
		Separation      828.277127120241 // 11.74 asec
	}
}

Star "IOT Lep A1"
{
	DateUpdated     "2024-07-10"
	ParentBody      "IOT Lep A"
	Class           "B7.5Vn"
	AbsMagn         0.01
	MassSol         3.37
	Radius          1509591.40404855 // 计算的值
	LumBol          153
	Teff            13781
	Age             0.094

	BinaryOrbit     
	{
		Period          64.189
		Separation      26.1749252342295 // 0.371 asec
	}
}

Star "IOT Lep A2"
{
	DateUpdated     "2024-07-10"
	ParentBody      "IOT Lep A"
	Class           "K7.2XR"
	MassSol         1.44
}

// Object V* AM Lep  ---  BY Dra Variable  ---  OID=@772037   (@@15276,12)  ---  coobox=6549 
// Object types: High Proper Motion Star,BY Dra Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source,X-ray Source 
Star "V* AM Lep/Gaia DR3 2989514224061032832/WISEA J051217.61-115158.7/TIC 43900845/2RE J0512-115/2RE J051216-115214/ADS 3778 B/BD-12 1095B/CCDM J05123-1152B/CSI-12 1095 2/HD 33802B/IDS 05076-1159 B/RE J0512-115/RE J051218-115145/2MASS J05121758-1151579/1RXS J051217.7-115154/RX J0512.3-1151/WDS J05123-1152B/NSV 16262/** STF 655B/DENIS J051217.5-115157/WISE J051217.59-115158.3/Gaia DR2 2989514224061032832"
{
	DateUpdated     "2024-07-10"
	ParentBody      "IOT Lep"
	Parallax        14.276
	AppMagn         9.92
	Class           "G8Ve"
	AbsMagn         5.69 // 计算的值
	MassSol         0.88
}

// Object * kap Lep  ---  Pulsating Variable  ---  OID=@15318635   (@@-1,255)  ---  coobox=6551 
// Object types: Pulsating Variable,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "KAP Lep A"
{
	DateUpdated     "2024-07-10"
	ParentBody      "KAP Lep"
	Class           "B7V"
	AbsMagn         -2.34
	MassSol         4.86
	RadSol          2.6
	LumBol          1346
	Teff            11588
	FeH             -0.07

	BinaryOrbit     
	{
		Epoch           2451545
		Separation      312.052369008251 // 2.179 asec
		PositionAngle   357.3
	}
}

// Object * kap Lep B  ---  Star  ---  OID=@7123760   (@@-1,255)  ---  coobox=6551 
// Object types: Double or Multiple Star,Star,Star 
Star "KAP Lep B/Gaia DR3 2988537647281524352/TYC 5338-1447-2/4 Lep B/CCDM J05132-1256B/** STF 661B/HD 33949B/ADS 3800 B/WDS J05132-1256B/Gaia DR2 2988537647281524352"
{
	ParentBody      "KAP Lep"
	Class           "F0.4?"
}

// Object * nu. Lep  ---  Star  ---  OID=@787564   (@@15284,16)  ---  coobox=6592 
// Object types: Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Star "NU Lep A"
{
	DateUpdated     "2024-07-10"
	ParentBody      "NU Lep"
	Class           "B7/8V"
	AbsMagn         0.25
	MassSol         3.28
	RadSol          3.0
	LumBol          138
	Teff            12417

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.198019764
		Eccentricity    0
		Inclination     -2.48266125
		AscendingNode   0
		ArgOfPericenter 133.098071
		MeanAnomaly     -66.5653396
	}
}

Star "NU Lep B"
{
	ParentBody      "NU Lep"
	Class           "G1.7?"
}