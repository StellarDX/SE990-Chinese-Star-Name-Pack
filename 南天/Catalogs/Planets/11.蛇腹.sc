// Object * eta02 Hyi  ---  High Proper Motion Star  ---  OID=@3212892   (@@72979,1)  ---  coobox=23016 
// Object types: High Proper Motion Star,Red Giant Branch star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "HD 11977 b" {ParentBody "HD 11977"}
Star "ETA2 Hyi A"
{
	DateUpdated     "2024-08-04"
	ParentBody      "ETA2 Hyi"
	Class           "G8IIIb"
	AbsMagn         0.57
	MassSol         1.91
	RadSol          10.09
	LumBol          68.96
	Teff            4970
	FeH             -0.21
	Age             1.30
	RotationPeriod  5520 // 6480
}

Planet "ETA2 Hyi b/HD 11977 b"
{
	ParentBody     "ETA2 Hyi A"
	DiscMethod     "RadVel"
	DiscDate       "2005"
	MassJup        6.29

	Orbit
	{
		Epoch           2451420
		PeriodDays      711
		SemiMajorAxis   1.93
		Eccentricity    0.4
		ArgOfPericen    351.5
	}
}