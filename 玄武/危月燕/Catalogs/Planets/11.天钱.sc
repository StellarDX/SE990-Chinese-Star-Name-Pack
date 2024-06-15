// Object * tet PsA  ---  Double or Multiple Star  ---  OID=@1204161   (@@24512,14)  ---  coobox=8340 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Star "TET PsA A"
{
	DateUpdated     "2024-06-15"
	ParentBody      "TET PsA"
	Class           "A1V"
	AbsMagn         0.06
	MassSol         2.32
	Radius          2276928.41843774 // 计算的值
	LumBol          86
	Teff            9716
	Age             0.281

	BinaryOrbit     
	{
		Period          19.957
		Separation      13.4857203278421 // 0.137 asec
		Eccentricity    0.256
		Inclination     103
		AscendingNode   29.1
		Epoch           2453735.986590785905719
		ArgOfPericenter 19
		MeanAnomaly     0
	}
}

Star "TET PsA B"
{
	DateUpdated     "2024-06-15"
	ParentBody      "TET PsA"
	Class           "A1V"
	MassSol         2.32
}