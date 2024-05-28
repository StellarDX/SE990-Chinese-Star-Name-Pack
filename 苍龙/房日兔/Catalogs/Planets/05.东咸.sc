// Object * chi Oph  ---  Be Star  ---  OID=@2529806   (@@51019,0)  ---  coobox=16811 
// Object types: Be Star,Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Emission-line Star,Irregular Variable,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "CHI Oph A" {ParentBody "CHI Oph"}
Remove "CHI Oph B" {ParentBody "CHI Oph"}
Star "CHI Oph A"
{
	DateUpdated     "2024-05-28"
	ParentBody      "HIP 80569"
	Class           "B2Vne"
	AbsMagn         -2.27
	MassSol         10.1
	RadSol          4.44
	LumBol          55847
	Teff            30000
	Age             0.0225
	RotationPeriod  81.6
	Obliquity       20

	BinaryOrbit     
	{
		PeriodDays      138.8
		Separation      1.1
		Eccentricity    0.44
	}
}

Star "CHI Oph B"
{
	DateUpdated     "2024-05-28"
	ParentBody      "HIP 80569"
	Class           ""
	MassSol         0.19 // 需要引用
}