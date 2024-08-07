// Object * alf Eri  ---  Be Star  ---  OID=@11684864   (@@-1,255)  ---  coobox=23347 
// Object types: Be Star,High Velocity Star,Rotating Variable,Variable Star,Emission-line Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// Reference: 
// https://www.aanda.org/articles/aa/full_html/2014/09/aa24144-14/aa24144-14.html
// https://www.aanda.org/articles/aa/full_html/2022/11/aa44009-22/aa44009-22.html
Remove "ALF Eri A" {ParentBody "ALF Eri"}
Remove "ALF Eri B" {ParentBody "ALF Eri"}
Star "ALF Eri A"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 7588"
	Class           "B6Vpe"
	AbsMagn         -2.74
	MassSol         5.99
	DimensionsSol   (18.32, 13.56, 18.32)
	LumBol          3493
	Teff            15539
	Temperature     (12673, 17124, 12673)
	Age             0.063
	RotationPeriod  37.25
	Obliquity       60.6
	EqAscendNode    306.9 // 216.9 + 90

	BinaryOrbit
	{
		PeriodDays      2570.94
		Separation      7.35
		Eccentricity    0.7258
		Inclination     30.32
		AscendingNode   310.91
		Epoch           2454743.44
		ArgOfPericenter 352.05
		MeanAnomaly     0
	}
}

Star "ALF Eri B"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 7588"
	Class           "A2V" // A3V
	MassSol         2.02
	RadSol          1.70
	LumBol          17.5
	Teff            9064
	Age             0.063 // log(Age) = 7.8
}

// Object * zet Phe  ---  Double or Multiple Star  ---  OID=@3564141   (@@77512,0)  ---  coobox=23359 
// Object types: Eclipsing Binary,Eclipsing Binary,Double or Multiple Star,Spectroscopic Binary,Variable Star,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=6882
Remove "ZET Phe (AB)" {ParentBody "ZET Phe"}
Remove "ZET Phe C" {ParentBody "ZET Phe"}
Remove "ZET Phe A" {ParentBody "ZET Phe (AB)"}
Remove "ZET Phe B" {ParentBody "ZET Phe (AB)"}
Remove "ZET Phe Aa" {ParentBody "ZET Phe A"}
Remove "ZET Phe Ab" {ParentBody "ZET Phe A"}
Barycenter "ZET Phe AB"
{
	ParentBody      "HIP 5348"
}

Barycenter "ZET Phe A"
{
	ParentBody      "ZET Phe AB"
	BinaryOrbit // IAU #197 Ling 2019
	{
		Period          289.6
		Separation      106.531197575029 // 1.194 asec
		Eccentricity    0.597
		Inclination     70.4
		AscendingNode   24.9
		Epoch           2422653.875474522821605
		ArgOfPericenter 292.2
		MeanAnomaly     0
	}
}

Star "ZET Phe A1"
{
	DateUpdated     "2024-08-06"
	ParentBody      "ZET Phe A"
	Class           "B6V"
	AbsMagn         -1.49
	MassSol         3.908
	RadSol          2.835
	LumBol          309
	Teff            14400

	BinaryOrbit     
	{
		PeriodDays      1.6697739
		SemiMajorAxisKm 7668005.4 // 11.022 RSun
		Eccentricity    0.0116
		Inclination     89.14
		Epoch           2441643.688
		ArgOfPericenter 127
		MeanAnomaly     0
	}
}

Star "ZET Phe A2"
{
	DateUpdated     "2024-08-06"
	ParentBody      "ZET Phe A"
	Class           "B8V"
	AbsMagn         0.19
	MassSol         2.536
	RadSol          1.885
	LumBol          66
	Teff            12000
}

Star "ZET Phe B"
{
	DateUpdated     "2024-08-06"
	ParentBody      "ZET Phe AB"
	Class           "A7V"
	MassSol         1.69
}

// Object * zet Phe C  ---  Star  ---  OID=@3196975   (@@74233,10)  ---  coobox=23359 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "ZET Phe C/Gaia DR3 4913847589156809088/TIC 358232449/CCDM J01084-5515C/CPD-55 241C/CSI-55 241 42/IDS 01042-5547 C/WDS J01084-5515C/2MASS J01082239-5514479/TYC 8476-1304-1/** RMK 2C/PMSC 01042-5546C/HD 6882C/Gaia DR2 4913847589156809088"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 5348"
	Class           "F7V"
	MassSol         1.35
	RadSol          1.49 // Gaia DR3
	LumBol          3.28911027169905 // 计算的值
	Teff            6368
	FeH             -0.999

	Orbit     
	{
		Period          4938
		SemiMajorAxis   593.326240328827 // 6.65 asec
		ArgOfPericenter 241
		MeanAnomaly     0
	}
}

Star "ZET Phe D"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 5348"
	Class           ""
	MassSol         0.23

	Orbit     
	{
		Period          702506
		SemiMajorAxis   16550.6775276661 // 185.5 asec
	}
}

// Object * eta Phe  ---  delta Sct Variable  ---  OID=@3231484   (@@74226,8)  ---  coobox=23405 
// Object types: delta Sct Variable,Near-IR Source (λ < 3 µm),Star,UV-emission Source 
Remove "Eta Phe A" {ParentBody "Eta Phe"}
Remove "Eta Phe B" {ParentBody "Eta Phe"}
Remove "Eta Phe Aa" {ParentBody "Eta Phe A"}
Remove "Eta Phe Ab" {ParentBody "Eta Phe A"}
Barycenter "ETA Phe A"
{
	ParentBody      "HIP 3405"
	BinaryOrbit
	{
		Separation      1595.32635797622 // 19.88 asec
	}
}

Star "ETA Phe A1"
{
	DateUpdated     "2024-08-06"
	ParentBody      "ETA Phe A"
	Class           "A0IV"
	AbsMagn         -0.03
	MassSol         2.93
	Radius          2631879.05355693 // 计算的值
	LumBol          120
	Teff            9822
	FeH             0.00

	BinaryOrbit
	{
		Period          10
		Separation      6.8
	}
}

Star "ETA Phe A2"
{
	DateUpdated     "2024-08-06"
	ParentBody      "ETA Phe A"
	Class           "G5V"
}

// Object GJ 31.1 B  ---  Star  ---  OID=@3231485   (@@74226,9)  ---  coobox=23405 
// Object types: Near-IR Source (λ < 3 µm),Star 
Star "GJ 31.1 B/GJ 9023 B/Gaia DR3 4908022136034354304/TIC 281703961/CCDM J00434-5728B/CPD-58 42B/CSI-58 42 42/IDS 00389-5801 B/PLX 137.00B/WDS J00434-5728B/** HJ 3391B/2MASS J00431972-5728029/UCAC3 66-1437/DENIS J004319.6-572802/Gaia DR2 4908022136034354304"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 3405"
	Parallax        12.982
	AppMagn         11.5
	Class           ""
	AbsMagn         7.07 // 计算的值
	MassKg          1.54838025352021e+30 // log(g) = 4.633 cm/s^2
	RadSol          0.7050496 // Gaia DR3
	LumBol          0.234583630481763 // 计算的值
	Teff            4784
	FeH             0.096
}
