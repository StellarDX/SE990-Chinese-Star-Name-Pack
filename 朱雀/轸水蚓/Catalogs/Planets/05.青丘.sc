// Object * bet Hya A  ---  High Proper Motion Star  ---  OID=@14880617   (@@-1,255)  ---  coobox=15316 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Remove "BET Hya A" {ParentBody "BET Hya"}
Remove "BET Hya B" {ParentBody "BET Hya"}
Star "BET Hya A/TYC 7226-1650-1/** HJ 4478A/CCDM J11529-3354A/WDS J11529-3354A"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HIP 57936"
	Class           "kB8hB8HeA0VSi"
	AbsMagn         -0.59
	MassSol         3.36
	RadSol          3.89
	LumBol          257
	Teff            10980
	RotationPeriod  56.55984
	Age             0.178

	BinaryOrbit     
	{
		Epoch           2452276
		Separation      61.7291674657522 // 0.65 asec
		PositionAngle   28.5
	}
}

// Object * bet Hya B  ---  High Proper Motion Star  ---  OID=@11620686   (@@-1,255)  ---  coobox=15316 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "BET Hya B/** HJ 4478B/CCDM J11529-3354B/WDS J11529-3354B/TYC 7226-1650-2"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HIP 57936"
	Class           ""
	MassSol         3
}

// Object * 17 Crt A  ---  High Proper Motion Star  ---  OID=@11633291   (@@-1,255)  ---  coobox=15205 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "17 Crt A/WISE J113216.39-291538.2/Gaia DR3 3482326708703712896/TIC 429149606/TYC 6663-1169-1/WEB 10120/CCDM J11323-2916A/WDS J11323-2916A/ADS 8202 A/CD-28 8928A/CSI-28 8928 21/GC 15831/GCRV 7024/HD 100287/HR 4444/PPM 259116/SAO 179968/SKY# 21886/UBV M 17157/YZ 118 7578/uvby98 100100287 A/2MASS J11321641-2915396/Gaia DR2 3482326708703712896"
{
	DateUpdated     "2024-08-01"
	ParentBody      "17 Crt"
	Parallax        35.6037
	AppMagn         5.58
	Class           "F8V"
	AbsMagn         3.34 // 计算的值
	MassSol         1.20
	Radius          1064831.70595228 // 计算的值
	LumBol          3.2
	Teff            6240
	FeH             0.04
	Age             3.95

	BinaryOrbit     
	{
		Epoch           2457024
		Separation      241.3
		PositionAngle   210
	}
}

// Object * 17 Crt B  ---  High Proper Motion Star  ---  OID=@1835923   (@@38098,11)  ---  coobox=15205 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "17 Crt B/WISE J113216.02-291546.6/Gaia DR3 3482326708703712640/TIC 429149602/ADS 8202 B/CCDM J11323-2916B/CD-28 8928B/CSI-28 8928 22/GC 15830/GCRV 7023/HD 100286/HR 4443/PPM 259117/SAO 179967/YZ 118 7577/uvby98 100100286/WDS J11323-2916B/TYC 6663-1171-1/UCAC3 122-146256/2MASS J11321604-2915480/GEN# +1.00100286/WEB 10119/Gaia DR2 3482326708703712640"
{
	DateUpdated     "2024-08-01"
	ParentBody      "17 Crt"
	Parallax        35.5239
	AppMagn         5.671
	Class           "F8V"
	AbsMagn         3.42 // 计算的值
	MassSol         1.18
	Radius          986864.758198732 // 计算的值
	LumBol          2.8
	Teff            6269
	FeH             -0.06
	Age             3.67
}

// Object * 20 Crt  ---  High Proper Motion Star  ---  OID=@1836244   (@@38107,11)  ---  coobox=15215 
// Object types: High Proper Motion Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Remove "GJ 432 A" {ParentBody "GJ 432"}
Remove "GJ 432 B" {ParentBody "GJ 432"}
Star "20 Crt A"
{
	DateUpdated     "2024-08-01"
	ParentBody      "20 Crt"
	Class           "K0V"
	AbsMagn         6.05
	MassSol         0.81
	RadSol          0.84
	LumBol          0.368
	Teff            5241
	FeH             -0.37
	Age             4.6 // 5.8

	BinaryOrbit     
	{
		Period          1110
		Separation      162.5
	}
}

Star "20 Crt B/GJ 432 B/Gaia DR3 3478127467639543296/CSI-32-11321/LHS 309/NLTT 27855/VB 4/WD 1132-325/Zkh 162/WDS J11345-3250B/** LDS 6245B/CCDM J11345-3250B/HD 100623B/Gaia DR2 3478127467639543296"
{
	DateUpdated     "2024-08-01"
	ParentBody      "20 Crt"
	Class           "DC8"
	AbsMagn         15.1
	Teff            6300
}