// Object * bet Ret  ---  Spectroscopic Binary  ---  OID=@3138874   (@@72562,0)  ---  coobox=22920 
// Object types: Spectroscopic Binary,Double or Multiple Star,High Proper Motion Star,Red Giant Branch star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "BET Ret A" {ParentBody "BET Ret"}
Remove "BET Ret B" {ParentBody "BET Ret"}
Star "BET Ret A"
{
	DateUpdated     "2024-08-04"
	ParentBody      "GJ 9129"
	Class           "K0IVSB:"
	AbsMagn         1.46
	MassSol         1.2
	RadSol          9.3
	LumBol          34.286368412722204 // 计算的值
	Teff            4580
	Age             5 // 6

	BinaryOrbit     
	{
		PeriodDays      1918.31
		Separation      0.912104188052612 // 27.8 mas
		Eccentricity    0.33461
		Inclination     82.85
		AscendingNode   16
		Epoch           2452806.14
		ArgOfPericenter 222.023
		MeanAnomaly     0
	}
}

Star "BET Ret B"
{
	DateUpdated     "2024-08-04"
	ParentBody      "GJ 9129"
	Class           "M0-M4"
	MassSol         0.4
}