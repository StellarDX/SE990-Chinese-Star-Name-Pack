// Object * phi Sgr  ---  High Proper Motion Star  ---  OID=@2503301   (@@57340,0)  ---  coobox=18640 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "PHI Sgr A"
{
	DateUpdated     "2024-05-31"
	ParentBody      "PHI Sgr"
	Class           "B8III"
	AbsMagn         -1.16
	MassSol         3.41
	RadSol          4.8
	LumBol          475
	Teff            12487
	Age             0.152

	BinaryOrbit
	{
		Separation      1.3
	}
}

Star "PHI Sgr B"
{
	DateUpdated     "2024-05-31"
	ParentBody      "PHI Sgr"
	Class           ""
	MassSol         1.6
}

// Object * mu. Sgr  ---  Blue Supergiant  ---  OID=@2536242   (@@55463,0)  ---  coobox=18697 
// Object types: Blue Supergiant,Spectroscopic Binary,Emission-line Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Star,Infra-Red Source,UV-emission Source 
Remove "Polis A" {ParentBody "Polis"}
Remove "Polis Ab" {ParentBody "Polis"}
Barycenter "MU Sgr A"
{
	ParentBody      "MU Sgr"
}

Star "MU Sgr Aa"
{
	DateUpdated     "2024-05-31"
	ParentBody      "MU Sgr A"
	Class           "B8Iap"
	AbsMagn         -7.1
	MassSol         14.1 // 30
	RadSol          67.9
	LumBol          200000
	Teff            12000

	BinaryOrbit // https://ui.adsabs.harvard.edu/abs/1907ApJ....26..157I/abstract
	{
		PeriodDays      181
		Separation      0.965 // 0.965 - 1.93
		Eccentricity    0.441
		Inclination     90 // 30 - 90 (Eclipsing)
		AscendingNode   96.683 // 96°41'?
		Epoch           2414968.4
		ArgOfPericenter 74.7167 // 74°43'
		MeanAnomaly     0
	}
}

Star "MU Sgr Ab"
{
	DateUpdated     "2024-05-31"
	ParentBody      "MU Sgr A"
	Class           "B1.5V"
	MassSol         9.8 // 15
	RadSol          12.2
	LumBol          37525.34413133151 // 计算的值
	Teff            23000
	Age             0.010
}

// Object * mu. Sgr B  ---  Star  ---  OID=@2535957   (@@55417,13)  ---  coobox=18696 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star 
Star "MU Sgr B/Gaia DR3 4093933487675888768/TIC 117866835/ALS 4790/ADS 11169 B/BD-21 4908B/CCDM J18138-2104B/CSI-21 4908 2/GEN# +1.00166937B/LS 4790/WDS J18138-2104B/2MASS J18134463-2103353/DENIS J181344.6-210335/HD 166937B/Gaia DR2 4093933487627510528"
{
	DateUpdated     "2024-05-31"
	ParentBody      "MU Sgr"
	Parallax        0.8349
	AppMagn         10.5
	Class           "B9III"
	AbsMagn         -1.2
	Radius          1718268.56258326 // 计算的值
	LumBol          603
	Teff            18200

	Orbit
	{
		SemiMajorAxis   24517.6264270366 // 42200
		ArgOfPericenter 258.35
		MeanAnomaly     0
	}
}

// Object * mu. Sgr C  ---  Star  ---  OID=@2535958   (@@55417,14)  ---  coobox=18696 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "MU Sgr C/TIC 117866820/ADS 11169 C/BD-21 4908C/CCDM J18138-2104C/CSI-21 4908 3/GEN# +1.00166937C/IDS 18078-2105 C/WDS J18138-2104C/** BU 292C/Renson 46974/2MASS J18134445-2103384/HD 166937C"
{
	DateUpdated     "2024-05-31"
	ParentBody      "MU Sgr"
	Class           "A3V"

	Orbit
	{
		SemiMajorAxis   29072.9725637974 // 64500
		ArgOfPericenter 250.8
		MeanAnomaly     0
	}
}

// Object HD 314059  ---  Star  ---  OID=@2535956   (@@55417,12)  ---  coobox=18697 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 314059/AP J18134321-2102595/Gaia DR3 4093934243590140800/TIC 117866933/ADS 11169 D/BD-21 4907/CCDM J18138-2104D/GEN# +1.00166937D/GSC 06276-01838/IDS 18078-2105 D/TYC 6276-1838-1/YZ 111 7549/WDS J18138-2104D/** HJ 2822D/HD 314058/2MASS J18134321-2102595/UCAC4 345-134025/Gaia DR2 4093934243581713152"
{
	DateUpdated     "2024-05-31"
	ParentBody      "MU Sgr"
	Parallax        0.6455
	AppMagn         9.66
	Class           "B2IV"
	AbsMagn         -3.3
	Radius          2269179.61464032 // 计算的值
	LumBol          1660
	Teff            20400

	Orbit
	{
		SemiMajorAxis   70317.7135553099 // 121200
		ArgOfPericenter 311.7
		MeanAnomaly     0
	}
}

// Object HD 314057  ---  Star  ---  OID=@4478718   (@@-1,255)  ---  coobox=18696 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 314057/Gaia DR3 4093933448976732160/TIC 117866771/TYC 6276-1101-1/GSC 06276-01101/UCAC2 23447851/2MASS J18134906-2103528/WDS J18138-2104E/ADS 11169 E/BD-21 4908E/BD-21 4909/CCDM J18138-2104E/CSI-21 4908 4/GEN# +1.00166937E/** HJ 2822E/DENIS J181349.0-210353/Gaia DR2 4093933448976732160"
{
	DateUpdated     "2024-05-31"
	ParentBody      "MU Sgr"
	Parallax        0.6437
	AppMagn         10.69
	Class           "B2.5V"
	AbsMagn         -2.1
	Radius          2626428.81328129 // 计算的值
	LumBol          2450
	Teff            20900

	Orbit
	{
		SemiMajorAxis   72885.5358660387 // 125000
		ArgOfPericenter 115
		MeanAnomaly     0
	}
}

// Object * sig Sgr  ---  Double or Multiple Star  ---  OID=@2503532   (@@57945,0)  ---  coobox=18642 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "Nunki A" {ParentBody "Nunki"}
Remove "Nunki B" {ParentBody "Nunki"} // B为光学伴星

// Object * zet Sgr  ---  Double or Multiple Star  ---  OID=@2477592   (@@58491,10)  ---  coobox=18638 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "Ascella A" {ParentBody "Ascella"}
Remove "Ascella B" {ParentBody "Ascella"} // C为光学伴星
Star "ZET Sgr A"
{
	DateUpdated     "2024-05-31"
	ParentBody      "ZET Sgr"
	Class           "A2III"
	AbsMagn         1.11
	MassSol         5.26
	Radius          2964525.94452926 // log(g) = 3.90 cm/s^2
	LumBol          98.06035323759234 // 计算的值
	Teff            8799
	Age             0.500 // 0.71

	BinaryOrbit     
	{
		Period          21.00
		Separation      13.4
		Eccentricity    0.211
		Inclination     111.1
		AscendingNode   74.0
		Epoch           2453732.334168798290193
		ArgOfPericenter 187.2
		MeanAnomaly     0
	}
}

Star "ZET Sgr B"
{
	DateUpdated     "2024-05-31"
	ParentBody      "ZET Sgr"
	Class           "A4IV"
	AbsMagn         1.32
}