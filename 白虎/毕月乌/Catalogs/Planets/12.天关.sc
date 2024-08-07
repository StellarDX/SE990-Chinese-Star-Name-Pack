// Object * zet Tau  ---  Be Star  ---  OID=@823349   (@@20009,0)  ---  coobox=4944 
// Object types: Near-IR Source (λ < 3 µm),Spectroscopic Binary,Emission-line Star,Be Star,Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "ZET Tau A" {ParentBody "ZET Tau"}
Remove "ZET Tau B" {ParentBody "ZET Tau"}
Star "ZET Tau A"
{
	DateUpdated     "2024-07-03"
	ParentBody      "HIP 26451"
	Class           "B1IVe_shell"
	AbsMagn         -2.67
	MassSol         11.2
	RadSol          5.5
	LumBol          4169
	Teff            15500
	Age             0.0225

	BinaryOrbit     
	{
		PeriodDays      132.987
		Separation      1.17
		Eccentricity    0.0
		Inclination     92.8
		AscendingNode   -58.0
		Epoch           2447025.6
		ArgOfPericenter 180.0
		MeanAnomaly     0
	}
}

Star "ZET Tau B"
{
	DateUpdated     "2024-07-03"
	ParentBody      "HIP 26451"
	Class           "G4"
	MassSol         0.94
}