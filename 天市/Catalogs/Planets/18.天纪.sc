// Object * ksi CrB  ---  Double or Multiple Star  ---  OID=@2834199   (@@50846,6)  ---  coobox=17853 
// Object types: Double or Multiple Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "KSI CrB A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "KSI CrB"
	Class           "G9IIIFe-0.5"
	AbsMagn         1.04
	MassSol         2.36
	RadSol          8
	LumBol          36
	Teff            4853
	FeH             -0.08
	Age             0.676

	BinaryOrbit     
	{
		RefPlane        "Equator"
		SemiMajorAxis   52.4558083
		Eccentricity    0.854705531
		Inclination     1.88124442
		AscendingNode   0
		ArgOfPericenter 125.661309
		MeanAnomaly     -46.8029494
	}
}

Star "KSI CrB B"
{
	ParentBody      "KSI CrB"
	Class           "A9.9?"
}

// Object * zet Her  ---  Spectroscopic Binary  ---  OID=@2835800   (@@51525,0)  ---  coobox=18205 
// Object types: Spectroscopic Binary,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "ZET Her A" {ParentBody "ZET Her"}
Remove "ZET Her B" {ParentBody "ZET Her"}
Star "ZET Her A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "HIP 81693"
	Class           "F9IV"
	AbsMagn         2.65
	MassSol         1.45
	RadSol          2.56 // 2.61
	LumBol          6.55
	Teff            5820
	FeH             0.04
	Age             6.2

	BinaryOrbit     
	{
		Period          34.45
		Separation      14.2520203498377 // 1.33 asec
		Eccentricity    0.46
		Inclination     131
		AscendingNode   50
		Epoch           2439747.210377473849803
		ArgOfPericenter 291
		MeanAnomaly     0
	}
}

Star "ZET Her B"
{
	DateUpdated     "2024-05-19"
	ParentBody      "HIP 81693"
	Class           "G7V"
	MassSol         0.98
	RadSol          0.915 // 0.920
	LumBol          0.62
	Teff            5300
}

// Object * eps Her  ---  Spectroscopic Binary  ---  OID=@2836946   (@@52288,0)  ---  coobox=18230 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Remove "EPS Her A" {ParentBody "EPS Her"}
Remove "EPS Her B" {ParentBody "EPS Her"}
Star "EPS Her A" // 这个系统里面有多少颗恒星目前还有争议
{
	DateUpdated     "2024-05-19"
	ParentBody      "HIP 83207"
	Class           "A0V"
	AbsMagn         0.54
	MassSol         2.6
	RadSol          2.72
	LumBol          64
	Teff            10197
	FeH             -0.25
	Age             0.400

	BinaryOrbit     
	{
		PeriodDays      4.0235
		Eccentricity    0.02
		Epoch           2417947.2420
		ArgOfPericenter 318
		MeanAnomaly     0
	}
}

Star "EPS Her B"
{
	ParentBody      "HIP 83207"
	Class           "A2V"
}

// Object * u Her  ---  Spectroscopic Binary  ---  OID=@2838803   (@@53154,0)  ---  coobox=18325 
// Object types: Eclipsing Binary,Near-IR Source (λ < 3 µm),Eclipsing Binary,Spectroscopic Binary,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=84573
Remove "68 Her A" {ParentBody "68 Her"}
Remove "68 Her Aa" {ParentBody "68 Her A"}
Remove "68 Her Ab" {ParentBody "68 Her A"}
Remove "68 Her B" {ParentBody "68 Her"}
Barycenter "68 Her A"
{
	ParentBody      "HIP 84573"
	BinaryOrbit     
	{
		Period          14094
		Separation      1278.37921386774
	}
}

Star "68 Her A1"
{
	DateUpdated     "2024-05-19"
	ParentBody      "68 Her A"
	Class           "B2IV"
	AbsMagn         -2.35
	MassSol         7.88
	RadSol          4.93
	LumBol          4786
	Teff            21600

	BinaryOrbit     
	{
		PeriodDays      2.05102685
		SemiMajorAxisKm 10400715 // 14.95 RSun
		Eccentricity    0.0
		Inclination     78.9
		AscendingNode   0.0
		Epoch           2450344.99
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "68 Her A2"
{
	DateUpdated     "2024-05-19"
	ParentBody      "68 Her A"
	Class           "B8III"
	AbsMagn         -1.15
	MassSol         2.79
	RadSol          4.26
	LumBol          426.5
	Teff            12600
}

Star "68 Her B"
{
	DateUpdated     "2024-05-19"
	ParentBody      "HIP 84573"
	Class           ""
	MassSol         1.53
}