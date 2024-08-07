// Object * alf Oph  ---  Double or Multiple Star  ---  OID=@2715185   (@@53645,0)  ---  coobox=18122 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Variable Star,High Proper Motion Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Rasalhague A" {ParentBody "Rasalhague"}
Remove "Rasalhague B" {ParentBody "Rasalhague"}
Star "ALF Oph A"
{
	DateUpdated     "2024-05-17"
	ParentBody      "GJ 681"
	Class           "A5IVnn"
	AbsMagn         1.248
	MassSol         2.40
	DimensionsSol   (5.716, 4.776, 5.716)
	LumBol          25.1 // 25.6
	Teff            7880 // 8050
	Age             0.77

	RotationPeriod  14.447754152155139511678171008989 // Vsini = 240 Km/s
	Obilquity       87.7

	BinaryOrbit     
	{
		PeriodDays      3148.4
		Separation      6.36082136311034 // 427 mas
		Eccentricity    0.92
		Inclination     125
		AscendingNode   232
		Epoch           2452888
		ArgOfPericenter 342
		MeanAnomaly     0
	}
}

Star "ALF Oph B"
{
	DateUpdated     "2024-05-17"
	ParentBody      "GJ 681"
	Class           "K5-7V"
	MassSol         0.85
}