// Object * zet Crv  ---  Be Star  ---  OID=@1920840   (@@39766,10)  ---  coobox=15535 
// Object types: Be Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Emission-line Star,Star 
Star "ZET Crv A"
{
	DateUpdated     "2024-08-01"
	ParentBody      "ZET Crv"
	Class           "B8V"
	AbsMagn         -0.32
	MassSol         3.39
	RadSol          4.57
	LumBol          200
	Teff            11561
	RotationPeriod  17.04 // Vsini = 259 Km/s
}

// Object HD 107295  ---  Double or Multiple Star  ---  OID=@1920839   (@@39766,9)  ---  coobox=15535 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Barycenter "HD 107295/Gaia DR3 3514103900415435776/HIP 60157/GEN# +1.00107295/TIC 415822569/ADS 8515 AB/BD-21 3511/CCDM J12202-2211AB/CPD-21 5272/GC 16822/GCRV 7394/HIC 60157/HR 4691/IDS 12150-2137 AB/IRAS 12176-2153/PPM 260181/SAO 180695/SKY# 23112/UBV 11073/UBV M 18070/2MASS J12201078-2210324/TYC 6108-1476-1/uvby98 100107295/** BU 605/WDS J12206-2213CD/** BU 1245CD/WEB 10693/Gaia DR2 3514103900415435776"
{
	ParentBody      "ZET Crv"
	BinaryOrbit     
	{
		Period          3.5E6
		Separation      50000
	}
}

Star "HR 4691 A"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HD 107295"
	Parallax        8.9586
	AppMagn         5.97
	Class           "K0III"
	AbsMagn         0.731 // 计算的值
	MassSol         2 // Kaler, James B. et. al.
	RadSol          9.051186 // Gaia DR3
	LumBol          48.537728223602 // 计算的值
	Teff            5064
	FeH             -0.815

	BinaryOrbit     
	{
		Period          700
		Separation      120
	}
}

Star "HR 4691 B"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HD 107295"
	Class           "F/G"
	MassSol         1.5
	LumBol          10
}