// Object * d Boo  ---  Spectroscopic Binary  ---  OID=@2233096   (@@47025,0)  ---  coobox=13727 
// Object types: Spectroscopic Binary,High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "12 Boo A" {ParentBody "12 Boo"}
Remove "12 Boo B" {ParentBody "12 Boo"}
Star "12 Boo A"
{
	DateUpdated     "2024-05-26"
	ParentBody      "GJ 9470"
	Class           "F9IVw"
	AbsMagn         2.00
	MassSol         1.4109
	RadSol          2.450
	LumBol          7.531
	Teff            6115
	FeH             -0.065

	BinaryOrbit     
	{
		PeriodDays      9.6045601
		Separation      0.139094584672404 // 3.4706 mas
		Eccentricity    0.19214
		Inclination     107.95
		AscendingNode   80.49
		Epoch           2454100.43572
		ArgOfPericenter 106.832
		MeanAnomaly     0
	}
}

Star "12 Boo B"
{
	DateUpdated     "2024-05-26"
	ParentBody      "GJ 9470"
	Class           ""
	MassSol         1.3677
	RadSol          1.901
	LumBol          4.692
	Teff            6200
	FeH             -0.065
}