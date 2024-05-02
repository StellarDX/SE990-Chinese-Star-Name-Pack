// Object V* RR UMi  ---  Long-Period Variable  ---  OID=@426304   (@@7953,9)  ---  coobox=1626 
// Object types: Long-Period Variable,Spectroscopic Binary,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Long-Period Variable Candidate,X-ray Source 
Remove "RR UMi A" {ParentBody "RR UMi"}
Remove "RR UMi B" {ParentBody "RR UMi"}
Star "RR UMi A"
{
	DateUpdated     "2024-05-02"
	ParentBody      "V* RR UMi"
	Class           "M4.5III"
	AbsMagn         -1.11
	MassSol         1.15
	RadSol          59.8
	LumBol          756.7
	Teff            3464

	BinaryOrbit     
	{
		PeriodDays      748.9
		Eccentricity    0.13
		Inclination     79.6
		AscendingNode   48.0
		Epoch           2444419
		ArgOfPericenter 32
		MeanAnomaly     0
	}
}

Star "RR UMi B"
{
	ParentBody      "V* RR UMi"
	Class           "F0.4?"
}