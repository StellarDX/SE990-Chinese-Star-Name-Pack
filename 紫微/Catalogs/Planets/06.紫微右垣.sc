// Object * alf Dra  ---  Spectroscopic Binary  ---  OID=@446254   (@@7081,0)  ---  coobox=1661 
// Object types: Spectroscopic Binary,High Proper Motion Star,Eclipsing Binary,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Thuban A" {ParentBody "Thuban"}
Remove "ALF Dra B" {ParentBody "Thuban"}
Star "ALF Dra A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "ALF Dra"
	Class           "A0IV"
	AbsMagn         -1.20
	MassSol         3.186
	RadSol          4.932
	LumBol          240
	Teff            10225
	Age             0.280

	BinaryOrbit
	{
		PeriodDays      51.417350
		Separation      0.393418896192734 // 5.52 mas
		Eccentricity    0.43
		Inclination     85.4
		AscendingNode   252.6
		Epoch           2453498.8
		ArgOfPericenter 202.4
		MeanAnomaly     0
	}
}

Star "ALF Dra B"
{
	DateUpdated     "2024-04-27"
	ParentBody      "ALF Dra"
	Class           "A1V"
	MassSol         2.431
	RadSol          2.326
	LumBol          47.5
	Teff            9930
	Age             0.345
}

// Object * kap Dra  ---  Be Star  ---  OID=@447421   (@@96294,0)  ---  coobox=1782 
// Object types: High Proper Motion Star,Pulsating Variable,Rotating Variable,Emission-line Star,Be Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "KAP Dra A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "KAP Dra"
	Class           "B6IIIe"
	AbsMagn         -1.95
	MassSol         3.65
	RadSol          5.85
	LumBol          1178
	Teff            13982
	FeH             -0.65

	BinaryOrbit
	{
		PeriodDays      61.555
		Epoch           2449980.22
	}
}

Star "KAP Dra B"
{
	ParentBody      "KAP Dra"
	Class           "sdB"
	MassSol         0.426
	RadSol          0.69
	LumBol          33
	Teff            16700
}

// Object HD 20336  ---  Be Star  ---  OID=@255637   (@@3087,0)  ---  coobox=2482 
// Object types: Be Star,Double or Multiple Star,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "BK Cam A" {ParentBody "BK Cam"}
Remove "BK Cam B" {ParentBody "BK Cam"}
Star "BK Cam A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "HD 20336"
	Class           "B2.5Vn(e)"
	AbsMagn         -2.07
	MassSol         7.5
	RadSol          4.0
	LumBol          1080.69
	Teff            18720
	Age             0.0316

	BinaryOrbit
	{
		Separation      32.0292275897913 // 0.13 asec
	}
}

Star "BK Cam B"
{
	ParentBody      "HD 20336"
	Class           "B8.8?"
}