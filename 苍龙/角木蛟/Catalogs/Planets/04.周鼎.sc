// Object * 37 Com  ---  RS CVn Variable  ---  OID=@2010259   (@@41808,5)  ---  coobox=13510 
// Object types: RS CVn Variable,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Barycenter "37 Com A"
{
	ParentBody      "37 Com"
	BinaryOrbit     
	{
		Separation      1014.7776572838 // 5.37 asec
	}
}

Star "37 Com Aa"
{
	DateUpdated     "2024-05-20"
	ParentBody      "37 Com A"
	Class           "G9IIICH-2CN-1"
	AbsMagn         -1.62
	MassSol         5.25
	RadSol          38.2
	LumBol          590
	Teff            4625
	FeH             -0.05
	RotationPeriiod 2664

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.37951895
		Eccentricity    0.265616697
		Inclination     2.37199335
		AscendingNode   0
		ArgOfPericenter 18.2909342
		MeanAnomaly     11.5422798
	}
}

Star "37 Com Ab"
{
	ParentBody      "37 Com A"
	Class           "A8.4?"
}

// Object * 37 Com B  ---  Star  ---  OID=@12550578   (@@-1,255)  ---  coobox=13510 
// Object types: Double or Multiple Star,Star 
Star "37 Com B/Gaia DR3 1464753314463416832/** BU 1081B/CCDM J13003+3047B/WDS J13003+3047B/HD 112989B/Gaia DR2 1464753314462962176"
{
	ParentBody      "37 Com"
	Class           "F6.3?"
}

// Object * 41 Com b  ---  Extra-solar Planet  ---  OID=@11953780   (@@-1,255)  ---  coobox=13519
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"41 Com b/HD 113996 b"
{
	ParentBody     "HD 113996"
	DiscMethod     "RadVel"
	DiscDate       "2017"
	MassJup        6.3

	Orbit
	{
		Epoch           2453309.94
		PeriodDays      610.2
		SemiMajorAxis   1.6
		Eccentricity    0.28
		ArgOfPericen    92.06
	}
}