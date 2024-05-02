// Object * ome UMa  ---  Spectroscopic Binary  ---  OID=@1761863   (@@36204,3)  ---  coobox=12560 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "OME UMa A"
{
	DateUpdated     "2024-05-02"
	ParentBody      "OME UMa"
	Class           "A1VsSi:"
	AbsMagn         0.86
	MassKg          3.43809838542981e+30 // log(g) = 3.88 cm/s^2
	RadSol          2.5
	LumBol          76
	Teff            9647
	Age             0.325

	BinaryOrbit     
	{
		PeriodDays      15.8307
		Eccentricity    0.31
		Epoch           2435185.246
		ArgOfPericenter 207.3
		MeanAnomaly     0
	}
}

Star "OME UMa B"
{
	ParentBody      "OME UMa"
	Class           "K0.3?"
}

// Object * 57 UMa A  ---  High Proper Motion Star  ---  OID=@5610166   (@@-1,255)  ---  coobox=12622 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "57 UMa A/Gaia DR3 767158369693232384/WISEA J112904.05+392014.6/TIC 18020103/ADS 8175 A/CCDM J11290+3920A/CSI+40 2433 1/IDS 11237+3953 A/TYC 3013-2482-1/WDS J11291+3920A/** STF 1543A/BD+40 2433A/HD 99787A/UCAC4 647-048863/2MASS J11290413+3920131/WISE J112904.07+392013.4/Gaia DR2 767158369693232384"
{
	DateUpdated     "2024-05-02"
	ParentBody      "57 UMa"
	Parallax        15.2369
	AppMagn         5.35
	Class           "A2V"
	AbsMagn         1.26 // 计算的值
	MassKg          3.28976703105902e+30 // log(g) = 3.99 cm/s^2
	RadSol          2.154584 // Gaia DR3
	LumBol          33.0865525740505 // 计算的值
	Teff            9431
	FeH             -1.247

	BinaryOrbit     
	{
		Separation      357.468969281521 // 5.48 asec
	}
}

// Object * 57 UMa B  ---  High Proper Motion Star  ---  OID=@1819510   (@@37778,6)  ---  coobox=12622 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star 
Star "57 UMa B/Gaia DR3 767158369693232256/TIC 18020102/ADS 8175 B/BD+40 2433B/CCDM J11290+3920B/CSI+40 2433 2/GCRV 6992/IDS 11237+3953 B/WDS J11291+3920B/** STF 1543B/HD 99787B/TYC 3013-2482-2/UCAC4 647-048862/2MASS J11290409+3920186/WISE J112904.03+392018.8/WEB 10062/Gaia DR2 767158369693232256"
{
	DateUpdated     "2024-05-02"
	ParentBody      "57 UMa"
	Parallax        15.0703
	AppMagn         12.38
	Class           "G5V"
	AbsMagn         8.27 // 计算的值
	MassKg          2.16243946537647e+30 // log(g) = 4.288 cm/s^2
	RadSol          1.239518 // Gaia DR3
	LumBol          1.10545035401584 // 计算的值
	Teff            5316
	FeH             -0.376
}

// Object * 47 UMa b  ---  Extra-solar Planet  ---  OID=@1762637   (@@36600,7)  ---  coobox=12569 
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet	"47 UMa b/HD 95128b/Taphao Thong"
{
	ParentBody     "Chalawan"
	DiscMethod     "RadVel"
	DiscDate       "1996"
	MassKg         4.80225625e+27

	Surface {Preset "jupiter_Class_II.cfg"}

	Clouds
	{
		mainFreq        3
		mainOctaves     12
		stripeZones     6
		stripeFluct     0.6
		stripeTwist     0
		cycloneMagn     10
		cycloneFreq     0.8
		cycloneDensity  0.4
		cycloneOctaves  5
		cycloneMagn2     0.5
		cycloneFreq2     0.9
		cycloneLatitude2 0.9
		cycloneOctaves2  3
	}

	Atmosphere
	{
		Model          "Jupiter"
		Bright          10
		Opacity         1
		SkyLight        3
		Hue             0
		Saturation      1
	}

	Orbit
	{
		Epoch           2451917
		PeriodDays      1078
		SemiMajorAxis   2.10
		PericenterDist  2.03
		Eccentricity    0.032
		ArgOfPericen    334
	}
}

// Object * 47 UMa c  ---  Extra-solar Planet  ---  OID=@1763121   (@@124768,1)  ---  coobox=12569 
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet	"47 UMa c/HD 95128c/Taphao Kaew"
{
	ParentBody     "Chalawan"
	DiscMethod     "RadVel"
	DiscDate       "2001"
	MassKg         1.0249875e+27

	Surface{Preset "jupiter_temperate_default.cfg"}

	Clouds
	{
		mainFreq        2.5
		mainOctaves     12
		Coverage        0.4
		stripeZones     5
		stripeFluct     1.35
		stripeTwist     15
		cycloneMagn     10
		cycloneFreq     0.9
		cycloneDensity  0.4
		cycloneOctaves  5
		cycloneMagn2     0
		cycloneFreq2     0.8
		cycloneLatitude2 1
		cycloneOctaves2  0
	}

	Atmosphere
	{
		Model          "Earth"
		Bright          10
		Opacity         0.5
		SkyLight        3
		Hue             0.48
		Saturation      2
	}

	Orbit
	{
		Epoch           2452441
		PeriodDays      2391
		SemiMajorAxis   3.6
		Eccentricity    0.098
		ArgOfPericen    295
	}
}

// Object * 47 UMa d  ---  Extra-solar Planet  ---  OID=@5451806   (@@-1,255)  ---  coobox=12569 
// Object types: Extra-solar Planet,Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet	"47 UMa d/HD 95128d"
{
	ParentBody     "Chalawan"
	DiscMethod     "RadVel"
	DiscDate       "2009"
	MassKg         3.112925e+27

	Surface{Preset "jupiter_Class_I_a.cfg"}

	Clouds
	{
		mainFreq        1
		mainOctaves     12
		stripeZones     6
		stripeFluct     1
		stripeTwist     10
		cycloneMagn     10
		cycloneFreq     0.6
		cycloneDensity  0.35
		cycloneOctaves  5
		cycloneMagn2     0.4
		cycloneFreq2     0.5
		cycloneLatitude2 0.9
		cycloneOctaves2  3
	}

	Atmosphere
	{
		Model          "Jupiter"
		Bright          10
		Opacity         0.5
		SkyLight        3
		Hue             0
		Saturation      1
	}

	Orbit
	{
		Epoch           2451736
		PeriodDays      14002
		SemiMajorAxis   11.6
		Eccentricity    0.16
		ArgOfPericen    110
	}
}

// Object * 56 UMa  ---  Spectroscopic Binary  ---  OID=@1797878   (@@37322,2)  ---  coobox=12609 
// Object types: Chemically Peculiar Star,Spectroscopic Binary,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "56 UMa A"
{
	DateUpdated     "2024-05-02"
	ParentBody      "56 UMa"
	Class           "G8IIIa"
	AbsMagn         -1.12 // 计算的值
	MassSol         4.3
	Radius          16912063.9123945 // log(g) = 2.3 cm/s^2
	LumBol          311.2029657432895 // 计算的值
	Teff            4917

	BinaryOrbit     
	{
		PeriodDays      16911
		Separation      22.9
		Eccentricity    0.562
		Inclination     68
		AscendingNode   60
		Epoch           2468401
		ArgOfPericenter 106
		MeanAnomaly     0
	}
}

Star "56 UMa B"
{
	ParentBody      "56 UMa"
	Class           "Neutron"
	MassSol         1.31
}