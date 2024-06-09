// Object * eta Cap  ---  Double or Multiple Star  ---  OID=@1251437   (@@25667,3)  ---  coobox=8273 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "ETA Cap A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "ETA Cap"
	Class           "A5V"
	AbsMagn         1.35
	MassSol         2.03
	LumBol          24
	FeH             -0.01

	BinaryOrbit     
	{
		Period          27.85
		Separation      4.39910676286221 // 0.265 asec
		Eccentricity    0.410
		Inclination     162.6
		AscendingNode   171.1
		Epoch           2452443.029207101091743
		ArgOfPericenter 58.2
		MeanAnomaly     0
	}
}

Star "ETA Cap B"
{
	DateUpdated     "2024-06-09"
	ParentBody      "ETA Cap"
	Class           "F2V"
	MassSol         1.21
}

// Object HD 203387b  ---  Extra-solar Planet  ---  OID=@23935906   (@@-1,255)  ---  coobox=8458
// Object types: Extra-solar Planet,Star
Planet	"HD 203387 b"
{
	ParentBody     "HD 203387"
	DiscMethod     "RadVel"
	DiscDate       "2022"
	MassJup        3.480

	Orbit
	{
		Epoch           2453040.709
		Period          1.403
		SemiMajorAxis   1.771
		Eccentricity    0.732
		ArgOfPericen    350.068
	}
}

// Object HD 203387c  ---  Extra-solar Planet  ---  OID=@23935907   (@@-1,255)  ---  coobox=8458
// Object types: Extra-solar Planet,Star
Planet	"HD 203387 c"
{
	ParentBody     "HD 203387"
	DiscMethod     "RadVel"
	DiscDate       "2022"
	MassJup        7.485

	Orbit
	{
		Epoch           2452929.006
		Period          6.793
		SemiMajorAxis   5.067
		Eccentricity    0.202
		Inclination     158.462
		ArgOfPericen    86.3479
	}
}

// Object * zet Cap  ---  Spectroscopic Binary  ---  OID=@1251888   (@@25350,0)  ---  coobox=8304 
// Object types: Spectroscopic Binary,Chemically Peculiar Star,White Dwarf,Spectroscopic Binary,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Chemically Peculiar Star,Star,Infra-Red Source,UV-emission Source 
Remove "ZET Cap A" {ParentBody "ZET Cap"}
Remove "ZET Cap B" {ParentBody "ZET Cap"}
Star "ZET Cap A"
{
	DateUpdated     "2024-06-09"
	ParentBody      "Gaia DR3 6828125061423674752"
	Class           "G4Ib:Ba2"
	AbsMagn         -1.59
	MassSol         4.5
	RadSol          29
	LumBol          561
	Teff            5269
	FeH             -0.09

	BinaryOrbit     
	{
		PeriodDays      2378.2
		Separation      1.00
		Eccentricity    0.2821
		Inclination     111.7
		AscendingNode   190.7
		Epoch           2445996
		ArgOfPericenter 53.8
		MeanAnomaly     0
	}
}

Star "ZET Cap B"
{
	DateUpdated     "2024-06-09"
	ParentBody      "Gaia DR3 6828125061423674752"
	Class           "DA2.2"
	MassSol         1.03
	Teff            23000
}

