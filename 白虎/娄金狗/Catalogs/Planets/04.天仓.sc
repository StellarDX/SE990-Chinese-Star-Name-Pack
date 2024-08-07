// Object * iot Cet  ---  Star  ---  OID=@1328032   (@@27339,11)  ---  coobox=10571 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "IOT Cet A"
{
	DateUpdated     "2024-06-23"
	ParentBody      "IOT Cet"
	Class           "K1IIICN0.5"
	AbsMagn         -1.2
	MassSol         2.78
	RadSol          34
	LumBol          398
	Teff            4446
	FeH             -0.09
	Age             2.23

	BinaryOrbit     
	{
		Epoch           2456658
		Separation      9094.32791263122 // 106.4 asec
		PositionAngle   191
	}
}

// Object BD-09 47  ---  High Proper Motion Star  ---  OID=@1328137   (@@27345,26)  ---  coobox=10571 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "BD-09 47/Gaia DR3 2429978322962290816/RAVE J001924.2-085111/TIC 37749221/2MASS J00192423-0851114/CCDM J00194-0850C/PPM 701043/uvby98 -000900047/RAVE J001924.3-085111/TYC 5261-711-1/GSC 05261-00711/UCAC2 28655019/UCAC3 163-902/DENIS J001924.2-085111/CSI-09 48 3/IDS 00143-0923 C/WDS J00194-0849C/Gaia DR2 2429978318666730624"
{
	DateUpdated     "2024-06-23"
	ParentBody      "IOT Cet"
	Parallax        4.1405
	AppMagn         10.3
	Class           "K"
	AbsMagn         3.38 // 计算的值
}

// Object * eta Cet  ---  Horizontal Branch Star  ---  OID=@1335462   (@@27507,0)  ---  coobox=10720 
// Object types: Horizontal Branch Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Remove "ETA Cet b" {ParentBody "ETA Cet"}
Remove "ETA Cet c" {ParentBody "ETA Cet"}
Star "ETA Cet A"
{
	DateUpdated     "2024-06-24"
	ParentBody      "ETA Cet"
	Class           "K2IIIb"
	AbsMagn         0.68
	MassSol         1.84
	RadSol          15.10
	LumBol          74.0
	Teff            4543
	FeH             -0.03
	Age             1.80
}

// Object * eta Cet b  ---  Extra-solar Planet Candidate  ---  OID=@9691936   (@@-1,255)  ---  coobox=10720 
// Object types: Star,Extra-solar Planet Candidate 
Planet "ETA Cet b"
{
	ParentBody     "ETA Cet A"
	DiscMethod     "RadVel"
	DiscDate       "2014"
	MassJup        2.55

	Orbit
	{
		PeriodDays      403.5
		SemiMajorAxis   1.27
		Eccentricity    0.13
		Inclination     70
		ArgOfPericen    250.6
	}
}

// Object * eta Cet c  ---  Extra-solar Planet Candidate  ---  OID=@9691937   (@@-1,255)  ---  coobox=10720
// Object types: Star,Extra-solar Planet Candidate
Planet "ETA Cet c"
{
	ParentBody     "ETA Cet A"
	DiscMethod     "RadVel"
	DiscDate       "2014"
	MassJup        3.32

	Orbit
	{
		PeriodDays      751.9
		SemiMajorAxis   1.93
		Eccentricity    0.1
		Inclination     70
		ArgOfPericen    67.54
	}
}

// Object * zet Cet  ---  Spectroscopic Binary  ---  OID=@1317451   (@@27143,3)  ---  coobox=11039 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "Baten Kaitos A" {ParentBody "Baten Kaitos"}
Remove "Baten Kaitos B" {ParentBody "Baten Kaitos"}
Star "ZET Cet A"
{
	DateUpdated     "2024-06-24"
	ParentBody      "ZET Cet"
	Class           "K0.5III"
	AbsMagn         -0.54
	MassSol         2.34
	RadSol          25
	LumBol          240
	Teff            4581
	FeH             -0.13
	Age             1.24

	BinaryOrbit     
	{
		PeriodDays      1652
		Eccentricity    0.59
		AscendingNode   85
		Epoch           2414377
	}
}

Star "ZET Cet B"
{
	ParentBody      "ZET Cet"
	Class           "WD?"
}