// Object * ups Lib  ---  Star  ---  OID=@2377014   (@@49703,0)  ---  coobox=16488 
// Object types: Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "UPS Lib A" {ParentBody "UPS Lib"}
Remove "UPS Lib B" {ParentBody "UPS Lib"}
Star "UPS Lib A"
{
	DateUpdated     "2024-05-26"
	ParentBody      "GJ 9525"
	Class           "K3.5III"
	AbsMagn         -0.28
	MassSol         1.67
	RadSol          31.5
	LumBol          309
	Teff            4135
	FeH             -0.02
	Age             3.14

	BinaryOrbit     
	{
		Epoch           2452276
		Separation      128.810297299827 // 2.0 asec
		PositionAngle   151
	}
}

Star "UPS Lib B"
{
	ParentBody      "GJ 9525"
	Class           "A8.8?"
}

// Object * tau Lib  ---  Spectroscopic Binary  ---  OID=@2357347   (@@49711,6)  ---  coobox=16445 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "TAU Lib A" {ParentBody "TAU Lib"}
Remove "TAU Lib B" {ParentBody "TAU Lib"}
Star "TAU Lib A"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HIP 76600"
	Class           "B2.5V"
	AbsMagn         -1.59
	MassSol         7.25
	RadSol          3.2
	LumBol          2705
	Teff            17990
	FeH             0.17
	Age             0.0315

	BinaryOrbit     
	{
		PeriodDays      3.2907
		Eccentricity    0.28
		AscendingNode   114
		Epoch           2439272.312
		MeanAnomaly     0
	}
}

Star "TAU Lib B"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HIP 76600"
	Class           "B5" // 需要引用
}