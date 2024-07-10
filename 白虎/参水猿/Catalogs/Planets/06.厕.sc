// Object * bet Lep  ---  High Proper Motion Star  ---  OID=@816376   (@@14356,0)  ---  coobox=6636 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "BET Lep A" {ParentBody "BET Lep"}
Remove "BET Lep B" {ParentBody "BET Lep"}
Star "BET Lep A"
{
	DateUpdated     "2024-07-10"
	ParentBody      "HIP 25606"
	Class           "G5II-IIIa:"
	AbsMagn         -0.65
	MassSol         2.948
	RadSol          12.573
	LumBol          171
	Teff            5398
	FeH             -0.08
	Age             0.391

	BinaryOrbit     
	{
		Separation      126.499164537868 // 2.64 asec
		PositionAngle   1.4
	}
}

// Object * bet Lep B  ---  Star  ---  OID=@23690391   (@@-1,255)  ---  coobox=6636 
// Object types: Double or Multiple Star,Star 
Star "BET Lep B/Gaia DR3 2968097043227107840/Gaia DR2 2968097043220617344/WDS J05282-2046B/** BU 320B/HD 36079B/9 Lep B"
{
	ParentBody      "HIP 25606"
	Class           "A1.1?"
}

// Object * gam Lep  ---  High Proper Motion Star  ---  OID=@832345   (@@133879,8)  ---  coobox=6651 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "GAM Lep A" {ParentBody "GAM Lep/HD 38393/HR 1983"}
Remove "GAM Lep B" {ParentBody "GAM Lep"}
Star "GAM Lep A"
{
	DateUpdated     "2024-07-10"
	ParentBody      "HIP 27072"
	Class           "F6V"
	AbsMagn         3.84
	MassSol         1.23
	RadSol          1.33
	LumBol          2.291
	Teff            6299
	FeH             -0.12
	RotationPeriod  141.84
	Age             1.3

	BinaryOrbit     
	{
		Separation      865.035256002759 // 97.14 asec
	}
}

// Object V* AK Lep  ---  BY Dra Variable  ---  OID=@832044   (@@14369,3)  ---  coobox=6651 
// Object types: High Proper Motion Star,BY Dra Variable,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),High Proper Motion Star,Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "V* AK Lep/GJ 216 B/Gaia DR3 2964001014514075520/TIC 93279196/2MASS J05442655-2225184/GSC 05930-02196/2RE J054425-222505/2RE J0544-222/ADS 4334 B/BD-22 1210/CCDM J05445-2226B/CD-22 2437/CPD-22 885/Ci 20 349/GC 7196/GCRV 3566/GEN# +1.00038392/HD 38392/HR 1982/IDS 05403-2229 B/LTT 2363/NLTT 15558/PPM 249306/SAO 170757/SKY# 9410/SV* VB 1/TYC 5930-2196-1/UBV 5896/UBV 5898/UBV M 11472/YZ 112 2925/Zkh 75/uvby98 100038392/WDS J05445-2227B/IRAS C05423-2227/WISEA J054426.31-222522.1/* gam Lep B/WEB 5327/Gaia DR2 2964001014514075520"
{
	DateUpdated     "2024-07-10"
	ParentBody      "HIP 27072"
	Parallax        112.4661
	AppMagn         6.15
	Class           "K2V"
	AbsMagn         6.31
	MassSol         0.8
	RadSol          0.8
	LumBol          0.3
	Teff            4869
	FeH             0.01
	Age             0.9
}