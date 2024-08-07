// Object * c Dra  ---  Spectroscopic Binary  ---  OID=@285800   (@@10380,10)  ---  coobox=366 
// Object types: Spectroscopic Binary,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=91755
Barycenter "46 Dra Aab"
{
	ParentBody      "46 Dra"
	BinaryOrbit     
	{
		Period          36.0000
		Eccentricity    0.130
		Inclination     0.0
		AscendingNode   0.0
		ArgOfPericenter 146.0
		MeanAnomaly     0
	}
}

Star "46 Dra Aa"
{
	DateUpdated     "2024-06-10"
	ParentBody      "46 Dra Aab"
	Class           "A0IIIpHgMn"
	AbsMagn         -0.205 // 计算的值
	MassKg          5.19190515304526e+30 // log(g) = 3.81 cm/s^2
	RadSol          3.33 // Gaia DR3
	LumBol          165.617553413323 // 计算的值
	Teff            11347
	FeH             -0.882

	BinaryOrbit // SB9_1077 2004A&A...416..661C
	{
		PeriodDays      9.8105
		Eccentricity    0.180
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2452884.309
		ArgOfPericenter 346.0
		MeanAnomaly     0
	}
}

Star "46 Dra Ab"
{
	DateUpdated     "2024-06-10"
	ParentBody      "46 Dra Aab"
	Class           "B9V"
	MassSol         2.69
}

Star "46 Dra Ac"
{
	DateUpdated     "2024-06-10"
	ParentBody      "46 Dra"
	Class           ""
	MassSol         0.15
}

// Object * b Dra A  ---  High Proper Motion Star  ---  OID=@5615850   (@@-1,255)  ---  coobox=467 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "b Dra A/Gaia DR3 2157548616097840000/TIC 389917323/HD 170073A/BD+58 1809A/ADS 11336 A/CCDM J18240+5848A/CSI+58 1809 1/TYC 3916-1982-1/WDS J18239+5848A/** STF 2323A/UCAC3 298-120336/UCAC4 745-054246/2MASS J18235463+5848028/Gaia DR2 2157548616097840000"
{
	DateUpdated     "2024-06-10"
	ParentBody      "39 Dra"
	Parallax        17.1615
	AppMagn         5.05
	Class           "A1V"
	AbsMagn         1.31
	MassSol         2.12
	RadSol          2.3
	LumBol          27.42975763959239 // 计算的值
	Teff            8710

	BinaryOrbit     
	{
		Period          3962.50
		Separation      385.805453732869 // 6.621 asec
		Eccentricity    0.553
		Inclination     107.7
		AscendingNode   179.9
		Epoch           3792494.742002663202584
		ArgOfPericenter 308.0
		MeanAnomaly     0
	}
}

// Object * b Dra B  ---  High Proper Motion Star  ---  OID=@297713   (@@10055,12)  ---  coobox=467 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "b Dra B/Gaia DR3 2157548616097840128/TIC 389917321/ADS 11336 B/BD+58 1809B/CCDM J18240+5848B/CSI+58 1809 8/HD 170073B/IDS 18225+5845 B/ROT 3571/WDS J18239+5848B/** STF 2323B/TYC 3916-1982-2/UCAC4 745-054245/2MASS J18235452+5848064/Gaia DR2 2157548616097840128"
{
	DateUpdated     "2024-06-10"
	ParentBody      "39 Dra"
	Parallax        17.2293
	AppMagn         8.07
	Class           "F5V"
	AbsMagn         4.32
	MassSol         1.18
}

// Object * omi Dra  ---  RS CVn Variable  ---  OID=@286497   (@@9708,6)  ---  coobox=460 
// Object types: Spectroscopic Binary,High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Variable Star,RS CVn Variable,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,X-ray Source 
Star "OMI Dra A"
{
	DateUpdated     "2024-06-10"
	ParentBody      "OMI Dra"
	Class           "G9IIIFe-0.5"
	AbsMagn         -0.344
	MassSol         1.35
	RadSol          25.1
	LumBol          220
	Teff            4400
	FeH             -0.5
	RotationPeriod  1896
	Age             3.0

	BinaryOrbit     
	{
		PeriodDays      138.444
		Separation      0.681421516863482 // 0.00651 asec
		Eccentricity    0.158
		Inclination     89.6
		AscendingNode   22.9
		Epoch           2454983.0
		ArgOfPericenter 113.0
		MeanAnomaly     0
	}
}

Star "OMI Dra B"
{
	DateUpdated     "2024-06-10"
	ParentBody      "OMI Dra"
	Class           ""
	MassSol         0.99
	RadSol          1.0
	LumBol          1.3
	Teff            6000
}