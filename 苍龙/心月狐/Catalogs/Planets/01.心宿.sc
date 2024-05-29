// Object * sig Sco  ---  beta Cep Variable  ---  OID=@2482758   (@@50687,0)  ---  coobox=16632 
// Object types: HII Region,beta Cep Variable,Reflection Nebula,Double or Multiple Star,Spectroscopic Binary,Variable Star,HII Region,Near-IR Source (λ < 3 µm),beta Cep Variable,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,Interstellar Medium Object,Radio Source,Radio Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=80112
Remove "SIG Sco (ACB)"{ParentBody "Al Niyat"}
Remove "SIG Sco (AC)"{ParentBody "SIG Sco (ACB)"}
Remove "Al Niyat Aa"{ParentBody "SIG Sco (AC)"}
Remove "SIG Sco Ab"{ParentBody "SIG Sco (AC)"}
Remove "SIG Sco C"{ParentBody "SIG Sco (ACB)"}
Remove "SIG Sco B"{ParentBody "Al Niyat"}
Barycenter "SIG Sco AP"
{
	ParentBody      "SIG Sco"
	BinaryOrbit     
	{
		Period          31676
		Separation      4500
	}
}

Barycenter "SIG Sco A"
{
	ParentBody      "SIG Sco AP"
	BinaryOrbit     
	{
		Period          102.804
		Separation      120
	}
}

Star "SIG Sco Aa"
{
	DateUpdated     "2024-05-29"
	ParentBody      "SIG Sco A"
	Class           "B1III"
	AbsMagn         -4.12
	MassSol         17.2 // 18
	RadSol          12.7
	LumBol          95500 // 29000
	Teff            27700 // 26150
	FeH             -0.20
	Age             8 // 10

	BinaryOrbit     
	{
		PeriodDays      33.010
		Separation      0.786837792385469 // 3.62 mas
		Eccentricity    0.3220
		Inclination     158.2
		AscendingNode   104
		Epoch           2434889.0
		ArgOfPericenter 103
		MeanAnomaly     0
	}
}

Star "SIG Sco Ab"
{
	DateUpdated     "2024-05-29"
	ParentBody      "SIG Sco A"
	Class           "B1:V"
	AbsMagn         -3.32
	MassSol         11.9
	RadSol          11
	LumBol          16000
	Teff            19573.1278784472 // 计算的值
}

Star "SIG Sco P"
{
	DateUpdated     "2024-05-29"
	ParentBody      "SIG Sco AP"
	Class           ""
	MassSol         3.73
}

// Object * sig Sco B  ---  Rotating Variable  ---  OID=@2482699   (@@50683,1)  ---  coobox=16632 
// Object types: Rotating Variable,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "SIG Sco B/Gaia DR3 6048602103662751488/TIC 322928422/ADS 10009 B/CCDM J16212-2536B/CD-25 11485B/CSI-25 11485 22/GEN# +1.00147165B/IDS 16151-2521 B/UBV 13859/WDS J16212-2536B/** H 121B/2MASS J16210983-2535333/TYC 6798-542-1/UCAC4 323-086168/WISE J162109.78-253533.2/DENIS J162109.8-253533/PPMX J162109.8-253533/EPIC 203598787/WEB 13561/Gaia DR2 6048602103662751488"
{
	DateUpdated     "2024-05-29"
	ParentBody      "SIG Sco"
	Parallax        7.2334
	AppMagn         8.26
	Class           "B9.5V"
	AbsMagn         2.56 // 计算的值
	MassSol         1.46
}

// Object * alf Sco  ---  Red Supergiant  ---  OID=@2401703   (@@51210,0)  ---  coobox=16623 
// Object types: Red Supergiant,Long-Period Variable,Mid-IR Source (3 to 30 µm),HII Region,Reflection Nebula,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Red Supergiant,Star,Infra-Red Source,Interstellar Medium Object,UV-emission Source 
Remove "Antares A" {ParentBody "Antares"}
Remove "Antares B" {ParentBody "Antares"}
Star "Antares A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "ALF Sco"
	Class           "M1.5Iab-Ib"
	AbsMagn         -5.28
	MassSol         16 // 11
	RadSol          680
	LumBol          75900
	Teff            3660
	Age             0.015
	Oblateness      0

	Surface // 汝可识得此阵?
	{
		SurfStyle       0.96468
		Randomize      (0.180, 0.362, -0.767)
		colorDistMagn   1
		colorDistFreq   0.05783
		detailScale     32768
		tropicLatitude  1
		icecapLatitude  1.2
		mareFreq        0
		mareDensity     0
		erosion         0.0125
		montesMagn      0.1
		montesFreq      0
		dunesMagn       5
		hillsMagn       1
		hillsFreq       0.25966
		canyonsMagn     5
		cracksOctaves   15
		BumpHeight      4.7308e+07
		BumpOffset      4.7308e+07
		SpecBrightWater 0
		SpecBrightIce   0
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		TempMapMaxTemp  55000
	}

	BinaryOrbit // Ref: https://iopscience.iop.org/article/10.1088/0004-6256/145/2/38/pdf
	{
		PeriodDays      2167
		Separation      493.2565 // 需要引用
		Eccentricity    0.30
		Inclination     80.75 // 需要引用
		AscendingNode   90.99 // 需要引用
		Epoch           2433626
		ArgOfPericenter 249
		MeanAnomaly     0
	}
}

Star "Antares B"
{
	DateUpdated     "2024-05-29"
	ParentBody      "ALF Sco"
	Class           "B2.5V"
	MassSol         7.2
	RadSol          5.2
	LumBol          2754
	Teff            18500
}
