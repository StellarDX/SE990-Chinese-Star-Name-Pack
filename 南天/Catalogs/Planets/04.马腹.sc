// Object * bet Cen  ---  beta Cep Variable  ---  OID=@3360143   (@@65709,8)  ---  coobox=21735 
// Object types: beta Cep Variable,Mid-IR Source (3 to 30 µm),Variable Star,beta Cep Variable,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=122451
Remove "Agena Aa" {ParentBody "Agena"}
Remove "Agena Ab" {ParentBody "Agena"}
Barycenter "BET Cen A"
{
	ParentBody      "BET Cen"
	BinaryOrbit // Tok 2019
	{
		Period          182
		Separation      94.7118713060869 // 0.788 asec
		Eccentricity    0.596
		Inclination     125.4
		AscendingNode   251.9
		Epoch           2462976.614219945389777
		ArgOfPericenter 171.8
		MeanAnomaly     0
	}
}

Star "BET Cen Aa"
{
	DateUpdated     "2024-08-02"
	ParentBody      "BET Cen A"
	Class           "B1III"
	AbsMagn         -4.9
	MassSol         12.02
	RadSol          9.48
	LumBol          31600
	Teff            25000
	Age             0.0141

	BinaryOrbit // VB6_Dvs2005 RBT_1Aa, Gr.2
	{
		PeriodDays      356.915
		Separation      3.02190788162198 // 0.02515 asec
		Eccentricity    0.8245
		Inclination     67.68
		AscendingNode   108.80
		Epoch           2452000.15202
		ArgOfPericenter 240.87
		MeanAnomaly     0
	}
}

Star "BET Cen Ab"
{
	DateUpdated     "2024-08-02"
	ParentBody      "BET Cen A"
	Class           "B1III"
	MassSol         10.58
	RadSol          9.98
	LumBol          25100
	Teff            23000
}

// Object * bet Cen B  ---  Star  ---  OID=@11608083   (@@-1,255)  ---  coobox=21735 
// Object types: Double or Multiple Star,Star 
Star "BET Cen B/TYC 9005-3919-2/** VOU 31B/CCDM J14038-6022B/WDS J14038-6022B"
{
	DateUpdated     "2024-08-02"
	ParentBody      "BET Cen"
	Class           "B1V"
	MassSol         4.61
}
