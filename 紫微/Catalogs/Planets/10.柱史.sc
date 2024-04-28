// Object * phi Dra  ---  alpha2 CVn Variable  ---  OID=@314793   (@@7874,0)  ---  coobox=860 
// Object types: alpha2 CVn Variable,Double or Multiple Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "PHI Dra A"{ParentBody "PHI Dra"}
Remove "PHI Dra Aa"{ParentBody "PHI Dra A"}
Remove "PHI Dra Ab"{ParentBody "PHI Dra A"}
Remove "PHI Dra B"{ParentBody "PHI Dra"}
Barycenter "PHI Dra A"
{
	ParentBody      "HIP 89908"
	BinaryOrbit
	{
		Period          307.8
		Separation      89.60
		Eccentricity    0.752
		Inclination     95.6
	}
}

Star "PHI Dra A1"
{
	DateUpdated     "2024-04-28"
	ParentBody      "PHI Dra A"
	Class           "B8VpSi"
	AbsMagn         -0.48
	MassSol         3.3
	RadSol          2.7
	LumBol          107
	Teff            11429
	RotationPeriod  41.196
	Age             0.245

	BinaryOrbit
	{
		PeriodDays      127.914
		Eccentricity    0.6725
		Inclination     48
	}
}

Star "PHI Dra A2"
{
	ParentBody      "PHI Dra A"
	Class           "A4V"
	MassSol         1.36
}

Star "PHI Dra B"
{
	ParentBody      "HIP 89908"
	Class           "B9V"
	MassSol         2.25
	Age             0.330
}