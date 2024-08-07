// Object * b Cen  ---  Double or Multiple Star  ---  OID=@3501990   (@@62858,8)  ---  coobox=21840 
// Object types: Pulsating Variable,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,beta Cep Variable Candidate 
Remove "b Cen A" {ParentBody "HIP 71865"}
Remove "b Cen B" {ParentBody "HIP 71865"}
Star "HD 129116 A"
{
	DateUpdated     "2024-05-24"
	ParentBody      "HD 129116"
	Class           "B2.5V"
	AbsMagn         -1.07
	MassSol         5 // 6
	RadSol          2.93
	LumBol          637.01
	Teff            18310
	Age             0.015

	BinaryOrbit     
	{
		Separation      1
	}
}

Star "HD 129116 B"
{
	DateUpdated     "2024-05-24"
	ParentBody      "HD 129116"
	Class           ""
	MassSol         4.4
}

Planet	"b Cen b"
{
	ParentBody     "b Cen"
	DiscMethod     "Imaging"
	DiscDate       "2021"
	Class          "GasGiant"
	MassJup        10.9
	Radius         79356.12

	Surface {Preset "neptune_frigid_default.cfg"}

	Orbit
	{
		Period          7170
		SemiMajorAxis   556
		Eccentricity    0.4
		Inclination     157
	}
}
