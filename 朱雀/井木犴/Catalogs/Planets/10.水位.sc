// Object * zet01 Cnc  ---  Double or Multiple Star  ---  OID=@8587533   (@@-1,255)  ---  coobox=5911 
// Object types: Double or Multiple Star,Double or Multiple Star,Star 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=40167
Remove "ZET1 CnC"{ParentBody "Tegmine"}
Remove "ZET2 CnC"{ParentBody "ZET CnC"}
Remove "ZET Cnc A"{ParentBody "ZET1 CnC"}
Remove "ZET Cnc B"{ParentBody "ZET1 CnC"}
Remove "ZET2 Cnc Ca"{ParentBody "ZET2 CnC"}
Remove "ZET2 Cnc Cb"{ParentBody "ZET2 CnC"}
Remove "ZET2 Cnc Cb1"{ParentBody "ZET2 CnC Cb"}
Remove "ZET2 Cnc Cb2"{ParentBody "ZET2 CnC Cb"}
Barycenter "ZET1 Cnc/** STF 1196AB/CCDM J08123+1738AB/WDS J08122+1739AB/ADS 6650 AB/SAO 97645/GC 11141/PLX 1941.00/PLX 1941"
{
	ParentBody      "GJ 9257"
	BinaryOrbit // VB6_Izm2019  STF1196AB, ???
	{
		Period          735.1011
		Separation      223.125143315473 // 8.896 asec
		Eccentricity    0.618
		Inclination     119.6
		AscendingNode   157.7
		Epoch           2378720.717594150453806
		ArgOfPericenter 295.2
		MeanAnomaly     0
	}
}

// Object * zet01 Cnc A  ---  High Proper Motion Star  ---  OID=@1042080   (@@84189,4)  ---  coobox=5911 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "ZET1 Cnc A/GJ 9257 A/Gaia DR3 657244586015485440/16 Cnc A/ADS 6650 A/BD+18 1867A/CCDM J08123+1738A/CSI+18 1867 3/GCRV 59435/HD 68257/HR 3208/IDS 08065+1757 A/UBV M 14051/WDS J08122+1739A/** STF 1196A/PMSC 08065+1757A/TYC 1381-1638-1/ZET Cnc A/Gaia DR2 657244586015485440"
{
	DateUpdated     "2024-07-18"
	ParentBody      "ZET1 Cnc"
	Parallax        40.8879
	AppMagn         5.31
	Class           "F7V"
	AbsMagn         3.37 // 计算的值
	MassSol         1.23

	BinaryOrbit // VB6_Tok2022f STF1196AB Gr.1
	{
		Period          60.0046
		Separation      21.2042839856488 // 0.867 asec
		Eccentricity    0.322
		Inclination     171.6
		AscendingNode   2.9
		Epoch           2425585.309361939318478
		ArgOfPericenter 173.9
		MeanAnomaly     0
	}
}

// Object * zet01 Cnc B  ---  High Proper Motion Star  ---  OID=@1041968   (@@20163,8)  ---  coobox=5911 
// Object types: High Proper Motion Star,Blue Object,Double or Multiple Star,Star,Hot Subdwarf Candidate 
Star "ZET1 Cnc B/GJ 9257 B/Gaia DR3 657244521593509376/16 Cnc B/ADS 6650 B/BD+18 1867B/CCDM J08123+1738B/CSI+18 1867 4/GCRV 59433/GEN# +1.00068255/HD 68255/HR 3209/IDS 08065+1757 B/UBV M 14050/WDS J08122+1739B/** STF 1196B/TYC 1381-1638-2/PMSC 08065+1757B/ZET Cnc B/WEB 7835/Gaia DR2 657244521593509376"
{
	DateUpdated     "2024-07-18"
	ParentBody      "ZET1 Cnc"
	Parallax        40.9598
	AppMagn         6.17
	Class           "F9V"
	AbsMagn         4.23 // 计算的值
	MassSol         1.14
}

// Object * zet02 Cnc  ---  Spectroscopic Binary  ---  OID=@6547981   (@@-1,255)  ---  coobox=5911 
// Object types: High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "ZET2 Cnc/GJ 9257 C/Gaia DR3 657244521593508992/TYC 1381-1641-1/WDS J08122+1739Ca,Cb/PMSC 08065+1757Cab/PMSC 08065+1757C/** STF 1196C/16 Cnc C/ADS 6650 C/BD+18 1867C/CCDM J08123+1738C/CSI+18 1867 1/GC 11142/GCRV 5433/HD 68256/HR 3210/IDS 08065+1757 C/SAO 97646/UBV 7813/WDS J08122+1739C/ZET Cnc C/** HUT 1/WEB 7836/Gaia DR2 657244521593508992/SBC9 1653"
{
	ParentBody      "GJ 9257"
}

Star "ZET Cnc Ca"
{
	DateUpdated     "2024-07-18"
	ParentBody      "ZET2 Cnc"
	Parallax        41.1543
	AppMagn         5.79
	Class           "G0IV-V"
	AbsMagn         3.86 // 计算的值
	MassKg          2.26910464884746e+30 // log(g) = 4.182 cm/s^2
	RadSol          1.434525 // Gaia DR3
	LumBol          2.06928959726793 // 计算的值
	Teff            5780
	FeH             -0.87
}

Barycenter "ZET Cnc Cb"
{
	ParentBody      "ZET2 Cnc"
	BinaryOrbit // VB6_Tok2022f HUT_1Ca,Cb Gr.2
	{
		Period          17.2797
		Separation      9.18498322519782 // 0.378 asec
		Eccentricity    0.115
		Inclination     143.8
		AscendingNode   71.9
		Epoch           2451421.081534911878407
		ArgOfPericenter 331.2
		MeanAnomaly     0
	}
}

Star "ZET Cnc Cb1"
{
	DateUpdated     "2024-07-18"
	ParentBody      "ZET Cnc Cb"
	Class           "M2V"
	MassSol         0.46

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.00574315183
		Eccentricity    0
		Inclination     -2.22532701
		AscendingNode   0
		ArgOfPericenter -30.5770664
		MeanAnomaly     -46.4868449
	}
}

Star "ZET Cnc Cb2"
{
	DateUpdated     "2024-07-18"
	ParentBody      "ZET Cnc Cb"
	Class           "M2V"
	MassSol         0.46
}