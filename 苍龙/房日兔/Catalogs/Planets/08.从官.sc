// Object * psi02 Lup  ---  Spectroscopic Binary  ---  OID=@2325747   (@@49727,3)  ---  coobox=16431 
// Object types: Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=76945
Barycenter "PSI2 Lup A"
{
	ParentBody      "PSI2 Lup"
	BinaryOrbit     
	{
		Period          189.649
		Separation      65.4282947840366
	}
}

Star "PSI2 Lup Aa"
{
	DateUpdated     "2024-05-29"
	ParentBody      "PSI2 Lup A"
	Class           "B5V"
	AbsMagn         -1.44
	MassSol         3.32
	Radius          1503250.73641779 // log(g) = 4.29 cm/s^2
	LumBol          220.72027230672788 // 计算的值
	Teff            15135

	BinaryOrbit     
	{
		PeriodDays      12.2600
		Eccentricity    0.190
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2438252.969
		ArgOfPericenter 262.8
		MeanAnomaly     0
	}
}

Star "PSI2 Lup Ab"
{
	DateUpdated     "2024-05-29"
	ParentBody      "PSI2 Lup A"
	Class           "B5V"
	MassSol         3.32
}

Star "PSI2 Lup B"
{
	DateUpdated     "2024-05-29"
	ParentBody      "PSI2 Lup"
	Class           ""
	MassSol         1.14
}

// Object * chi Lup  ---  Spectroscopic Binary  ---  OID=@2341920   (@@50030,0)  ---  coobox=16530 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "CHI Lup A" {ParentBody "CHI Lup"}
Remove "CHI Lup B" {ParentBody "CHI Lup"}
Star "CHI Lup A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "HIP 77634"
	Class           "B9.5V"
	AbsMagn         -0.05 // 计算的值
	MassSol         2.84
	RadSol          2.85
	LumBol          63
	Teff            10200
	Age             0.280

	BinaryOrbit     
	{
		PeriodDays      15.2565
		Separation      0.21
	}
}

Star "CHI Lup B"
{
	DateUpdated     "2024-05-29"
	ParentBody      "HIP 77634"
	Class           "A2Vm"
	MassSol         1.94
	RadSol          1.75
	LumBol          19.76610440672125 // 计算的值
	Teff            9200
}
