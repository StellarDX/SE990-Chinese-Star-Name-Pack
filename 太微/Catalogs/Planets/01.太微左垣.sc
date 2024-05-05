// Object * eta Vir  ---  Spectroscopic Binary  ---  OID=@1915328   (@@39666,2)  ---  coobox=15365 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Remove "ETA Vir A" {ParentBody "ETA Vir"}
Remove "ETA Vir Aa" {ParentBody "ETA Vir A"}
Remove "ETA Vir Ab" {ParentBody "ETA Vir A"}
Remove "ETA Vir B" {ParentBody "ETA Vir"}
Barycenter "ETA Vir A"
{
	ParentBody      "HIP 60129"
	BinaryOrbit     
	{
		PeriodDays      7896.2
		Separation      10.0994546374502 // 0.133 asec
		Eccentricity    0.087
		Inclination     50.6
	}
}

Star "ETA Vir A1"
{
	DateUpdated     "2024-05-04"
	ParentBody      "ETA Vir A"
	Class           "A2IV"
	AbsMagn         -0.66
	MassSol         2.5039
	Radius          5764622.5131618 // log(g) = 3.0 cm/s^2
	LumBol          469.3280183466552 // 计算的值
	Teff            9333
	FeH             0.11

	BinaryOrbit     
	{
		PeriodDays      71.7916
		Separation      0.556378338689618 // 0.00736 asec
		Eccentricity    0.244
		Inclination     45.5
	}
}

Star "ETA Vir A2"
{
	ParentBody      "ETA Vir A"
	Class           ""
	MassSol         1.8907
}

Star "ETA Vir B"
{
	ParentBody      "HIP 60129"
	Class           ""
	MassSol         1.66
}

// Object * gam Vir  ---  High Proper Motion Star  ---  OID=@1965990   (@@40843,0)  ---  coobox=15383 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Porrima A" {ParentBody "Porrima"}
Remove "Porrima B" {ParentBody "Porrima"}
Star "GAM Vir A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "GAM Vir"
	Class           "F1-F2V"
	AbsMagn         2.41
	MassSol         1.56
	Radius          1066656.74164091 // log(g) = 4.26 cm/s^2
	LumBol          4.41483739448649 // 计算的值
	Teff            6757
	FeH             -0.07
	Age             1.14

	BinaryOrbit     
	{
		Period          168.93
		Separation      44.017859826646 // 3.662 asec
		Eccentricity    0.8825
		Inclination     148.82
		AscendingNode   213.79
		Epoch           2453530.720475071109831
	}
}

// Object * gam Vir B  ---  Chemically Peculiar Star  ---  OID=@1965991   (@@40844,0)  ---  coobox=15383 
// Object types: Chemically Peculiar Star,Double or Multiple Star,High Proper Motion Star,Star,UV-emission Source 
Star "GAM Vir B/GJ 482 B/Gaia DR3 3683687763520080256/29 Vir B/ADS 8630 B/BD-00 2601B/CCDM J12417-0127B/CSI-00 2601 2/FAUST 3376/GCRV 7624/HD 110380/HIC 61941/HR 4826/LFT 938/LHS 2605/LTT 4844/N30 2926/NLTT 31565/ROT 1872/uvby98 100110380/TYC 4949-1120-2/IDS 12366-0054 B/GAM Vir S/WDS J12417-0127B/** STF 1670B/Renson 32087/Gaia DR2 3683687763520080256/GEN# +1.00110380/WEB 11014"
{
	DateUpdated     "2024-05-04"
	ParentBody      "GAM Vir"
	Parallax        78.5233
	AppMagn         3.49
	Class           "F0mF2V"
	AbsMagn         2.96 // 计算的值
	MassKg          2.31910288795182e+30 // log(g) = 4.098 cm/s^2
	RadSol          1.5975 // Gaia DR3
	LumBol          4.74476817521419 // 计算的值
	Teff            6740
	FeH             -0.425
}

// Object * del Vir  ---  Red Giant Branch star  ---  OID=@1993272   (@@41459,4)  ---  coobox=14051 
// Object types: Red Giant Branch star,High Proper Motion Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "DEL Vir A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "DEL Vir"
	Class           "M3III"
	AbsMagn         2.4
	MassSol         1.4
	RadSol          65.8
	LumBol          502.57
	Teff            3657
	FeH             -0.06
}

// Object HD 112300b  ---  Extra-solar Planet Candidate  ---  OID=@24053573   (@@-1,255)  ---  coobox=14051 
// Object types: Star,Extra-solar Planet Candidate 
Remove "HD 112300 b" {ParentBody "HD 112300"}
Planet "HD 112300 b"
{
	ParentBody     "DEL Vir A"
	DiscMethod     "RadVel"
	DiscDate       "2023"
	MassKg         3.004731875e+28

	Orbit
	{
		Epoch           2453611.56
		PeriodDays      466.63
		SemiMajorAxis   1.33
		Eccentricity    0.36
		ArgOfPericen    333.3
	}
}

/*Star "DEL Vir B(?)"
{
	ParentBody      "DEL Vir"
	Class           ""

	BinaryOrbit     
	{
		Period          200000
		Separation      4595.9842306537 // 80 asec
	}
}*/

// Object * alf Com A  ---  High Proper Motion Star  ---  OID=@2104799   (@@44344,0)  ---  coobox=13912 
// Object types: Rotating Variable,High Proper Motion Star,Double or Multiple Star,Star 
Remove "Diadem A" {ParentBody "Diadem"}
Remove "Diadem B" {ParentBody "Diadem"}
Star "ALF Com A/GJ 501 A/42 Com A/ADS 8804 A/BD+18 2697A/CCDM J13100+1732A/CSI+18 2697 3/HD 114378/HR 4968/IDS 13051+1803 A/WDS J13100+1732A/** STF 1728A/TYC 1454-1134-1"
{
	DateUpdated     "2024-05-04"
	ParentBody      "ALF Com"
	Class           "F5V"
	AbsMagn         3.82
	MassSol         1.237
	Radius          750313.173717018 // 计算的值
	LumBol          1.72
	Teff            6365
	FeH             -0.23

	BinaryOrbit     
	{
		Period          25.8696
		Separation      10
		Eccentricity    0.51060
		Inclination     90.0501
		AscendingNode   12.2272
		Epoch           2457056.84
		ArgOfPericenter 280.563
		MeanAnomaly     0
	}
}

// Object * alf Com B  ---  High Proper Motion Star  ---  OID=@2104800   (@@44344,1)  ---  coobox=13912 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "ALF Com B/GJ 501 B/42 Com B/ADS 8804 B/BD+18 2697B/CCDM J13100+1732B/CSI+18 2697 4/HD 114379/HR 4969/IDS 13051+1803 B/WDS J13100+1732B/TYC 1454-1134-2"
{
	DateUpdated     "2024-05-04"
	ParentBody      "ALF Com"
	Class           "F6V"
	MassSol         1.087
	Radius          753746.240068483 // 计算的值
	LumBol          1.75
	Teff            6378
}