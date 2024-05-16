// Object * tau Oph  ---  Double or Multiple Star  ---  OID=@2610025   (@@55303,0)  ---  coobox=18756 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=88404
Barycenter "TAU Oph A"
{
	ParentBody      "TAU Oph"
	BinaryOrbit // Tok 2023 minor corr.
	{
		Period          290.2024
		Separation      71.2012122567514 // 1.387 asec
		Eccentricity    0.628
		Inclination     56.8
		AscendingNode   71.4
		Epoch           2386258.220850393641740
		ArgOfPericenter 34.7
		MeanAnomaly     0
	}
}

Star "TAU Oph Aa"
{
	DateUpdated     "2024-05-16"
	ParentBody      "TAU Oph A"
	Class           "F2V"
	AbsMagn         1.24 // 计算的值
	MassSol         1.54
	Radius          1162044.45810445 // log(g) = 4.18 cm/s^2
	LumBol          5.4156266285032855 // 计算的值
	Teff            6813

	BinaryOrbit // SB9_2558 1991A&A...248..485D
	{
		PeriodDays      184.0850
		Eccentricity    0.600
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2446741.200
		ArgOfPericenter 48.1
		MeanAnomaly     0
	}
}

Star "TAU Oph Ab"
{
	DateUpdated     "2024-05-16"
	ParentBody      "TAU Oph A"
	Class           ""
	MassSol         0.29 // 0.34
}

Star "TAU Oph B"
{
	DateUpdated     "2024-05-16"
	ParentBody      "TAU Oph"
	Class           "F5V"
	MassSol         1.29
}