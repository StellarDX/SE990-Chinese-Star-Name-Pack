// Object * phi And A  ---  Star  ---  OID=@24698   (@@3270,5)  ---  coobox=2188 
// Object types: Double or Multiple Star,Star 
Remove "PHI And A" {ParentBody "PHI And"}
Remove "PHI And B" {ParentBody "PHI And"}
Star "PHI And A/ADS 940 A/BD+46 275A/CSI+46 275 2/WDS J01095+4715A/TYC 3268-1358-1/** STT 515A/42 And A/HD 6811A"
{
	DateUpdated     "2024-06-21"
	ParentBody      "HIP 5434"
	Class           "B7Ve"
	AbsMagn         -2.41
	// MassSol         // log(g) = 3.150 cm/s^2
	Radius          3782557.66403931 // 计算的值
	LumBol          882
	Teff            13490
	Age             0.0631
	RotationPeriod  30.106020033510241712980859162775 // Vsini = 75 Km/s
	Obliquity       20

	BinaryOrbit     
	{
		Period          554.3
		Separation      125.933382526044 // 4.55 asec
		Eccentricity    0.385
		Inclination     142.2
		AscendingNode   337.2
		Epoch           2417740
		ArgOfPericenter 292.6
		MeanAnomaly     0
	}
}

// Object * phi And B  ---  Star  ---  OID=@24699   (@@3270,6)  ---  coobox=2188 
// Object types: Double or Multiple Star,Star 
Star "PHI And B/ADS 940 B/BD+46 275B/CSI+46 275 3/IDS 01037+4643 B/WDS J01095+4715B/** STT 515B/TYC 3268-1358-2/42 And B/HD 6811B"
{
	DateUpdated     "2024-06-21"
	ParentBody      "HIP 5434"
	Class           "B9V"
}