// Object HD 46588  ---  High Proper Motion Star  ---  OID=@332513   (@@4181,5)  ---  coobox=3115 
// Object types: High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,High Proper Motion Star,Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Mid-IR Source (3 to 30 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "HD 46588A" {ParentBody "HD 46588"}
Remove "HD 46588B" {ParentBody "HD 46588"}
Star "HD 46588 A"
{
	DateUpdated     "2024-04-29"
	ParentBody      "HD 46588"
	Class           "F7V"
	AbsMagn         4.18
	MassSol         1.13
	RadSol          1.19
	LumBol          1.82
	Teff            6273
	FeH             -0.12
	Age             1.27
}

// Object 2MASS J06462756+7935045  ---  BrownD*  ---  OID=@6242081   (@@-1,255)  ---  coobox=3115 
// Object types: BrownD*,HighPM*,NearIR,MidIR,**,Star 
Star "2MASS J06462756+7935045/TIC 141523122/WISEP J064627.10+793457.8/WISEA J064627.13+793457.5/WISE J064627.13+793457.8/** LOU 1B/WDS J06462+7934B/HD 46588 B"
{
	DateUpdated     "2024-04-29"
	ParentBody      "HD 46588 A"
	Parallax        55.95
	Class           "L9"
	MassKg          1.272503e+29
	Teff            1360

	Orbit
	{
		SemiMajorAxis   1455.45887092309 // 79.96 asec
	}
}

// Object HD 33564b  ---  Extra-solar Planet  ---  OID=@4071855   (@@-1,255)  ---  coobox=2430 
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate 
Planet	"HD 33564 b"
{
	DateUpdated     "2024-04-29"
	ParentBody      "HD 33564"
	DiscMethod      "RadVel"
	DiscDate        "2005"
	MassKg          1.72729375e+28

	Orbit
	{
		Epoch           2452603.0
		PeriodDays      388
		SemiMajorAxis   1.117
		Eccentricity    0.34
		ArgOfPericen    205
	}
}