// Object * bet UMi b  ---  Planet  ---  OID=@15302269   (@@-1,255)  ---  coobox=1728
Planet	"BET UMi b"
{
	DateUpdated    "2014-05-12"
	ParentBody     "BET UMi"
	DiscMethod     "RadVel"
	DiscDate       "2014"
	MassKg         1.15785625e+28 // 6.1 MJ

	Orbit
	{
		Epoch           2453175.3
		PeriodDays      522.3
		SemiMajorAxis   1.4
		Eccentricity    0.19
		ArgOfPericen    307.4
	}
}

// Object * 5 UMi  ---  Variable Star  ---  OID=@390390   (@@6405,16)  ---  coobox=1730 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source 
Star "5 UMi A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "5 UMi"
	Class           "K4III"
	AbsMagn         -0.96
	MassSol         1.86
	RadSol          16
	LumBol          447
	Teff            4095
	FeH             -0.16
	Age             2

	BinaryOrbit // 未知，程序生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   61.1861398
		Eccentricity    0.280974119
		Inclination     -2.49006319
		AscendingNode   0
		ArgOfPericenter -85.8429324
		MeanAnomaly     89.3646351
	}
}

// Primary star is a mild barium star, which may indicate it is a binary with a white dwarf companion, and is very lithium-weak
Star "5 UMi B"
{
	ParentBody      "5 UMi"
	Class           "WD"
}

// Object * 4 UMi  ---  Spectroscopic Binary  ---  OID=@378185   (@@6396,6)  ---  coobox=1695 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "4 UMi A"
{
	DateUpdated     "2024-04-27"
	ParentBody      "4 UMi"
	Class           "K3IIIbFe-0.5"
	AbsMagn         -1.06
	MassKg          3.05319361676504e+30 // log(g) = 1.73 cm/s^2
	RadSol          28
	LumBol          436.72
	Teff            4165
	FeH             -0.19

	BinaryOrbit
	{
		PeriodDays      605.8
		Separation      1.29927004367762 // 6.5 ms, Hipparcos Photocentric Orbit
		Eccentricity    0.137
		Inclination     136.0
		AscendingNode   325.5
		Epoch           2438901.7
		ArgOfPericenter 131.8
		MeanAnomaly     0
	}
}

Star "4 UMi B"
{
	ParentBody      "4 UMi"
	Class           "K3?" // 未知
}