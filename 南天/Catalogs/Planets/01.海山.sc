// Object * eta Car  ---  Emission-line Star  ---  OID=@3201912   (@@65242,0)  ---  coobox=20938 
// Object types: Double or Multiple Star,Double or Multiple Star,Sub-Millimetric Source,Emission-line Star,Classical Nova,Variable Star,Near-IR Source (λ < 3 µm),Star,Star,Infra-Red Source,Radio Source,Radio Source,UV-emission Source,X-ray Source,Gamma-ray Source 
Remove "ETA Car A" {ParentBody "ETA Car"}
Remove "ETA Car B" {ParentBody "ETA Car"}
Star "ETA Car A"
{
	DateUpdated     "2024-08-01"
	ParentBody      "V* ETA Car"
	Class           "BIa+" // LBV
	AbsMagn         -8.6 // 2012
	MassSol         100
	RadSol          240 // 60 - 742
	LumBol          4E6 // 2.96E6 - 4.1E6
	Teff            9470 // 35200
	Age             0.003
	RotationPeriod  730.88635479226474985597391421962 // V = 398713.33297748599337530554683227 m/s (90% Critical velocity)
	Oblateness      0

	BinaryOrbit     
	{
		PeriodDays      2022.7
		Separation      15.4
		Eccentricity    0.9
		Inclination     130 // 145
		Epoch           2454842.670453092548996
	}
}

Star "ETA Car B"
{
	DateUpdated     "2024-08-01"
	ParentBody      "V* ETA Car"
	Class           "O" // WR?
	MassSol         80 // 30
	RadSol          23.6 // 14.3
	LumBol          1E6
	Teff            37200
	Age             0.003
	RotationPeriod  25.197415782735308665356803012474 // V = 894661.99330449661638112967124907 - 1137248.4971291454546316893168494 m/s (90% Critical velocity)
	Oblateness      0
}

// Object * lam Cen  ---  Star  ---  OID=@3237346   (@@65934,1)  ---  coobox=20977 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "LAM Cen A" {ParentBody "LAM Cen"}
Remove "LAM Cen B" {ParentBody "LAM Cen"}
Star "LAM Cen A"
{
	DateUpdated     "2024-08-01"
	ParentBody      "HD 100841"
	Class           "B9III"
	AbsMagn         -2.35
	MassSol         4.5
	RadSol          5.5
	LumBol          739
	Teff            9880
	FeH             0.41

	BinaryOrbit     
	{
		Separation      88.1960581410141 // 0.73 asec
		PositionAngle   135
	}
}

Star "LAM Cen B"
{
	ParentBody      "HD 100841"
	Class           "B4.4?"
}