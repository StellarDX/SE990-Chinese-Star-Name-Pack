// Object * alf Ret  ---  High Proper Motion Star  ---  OID=@3092860   (@@72149,12)  ---  coobox=22742 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "ALF Ret A" {ParentBody "ALF Ret"}
Remove "ALF Ret B" {ParentBody "ALF Ret"}
Star "ALF Ret A"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 19780"
	Class           "G8IIIa:"
	AbsMagn         -0.104
	MassSol         3.12
	RadSol          12.09
	LumBol          103
	Teff            5288
	FeH             0.191
	Age             0.330

	BinaryOrbit     
	{
		Period          60000
		Separation      2376.72724393094 // 48.35 asec
	}
}

// Object * alf Ret B  ---  High Proper Motion Star  ---  OID=@3092861   (@@72149,13)  ---  coobox=22742 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "ALF Ret B/Gaia DR3 4676528243502157696/WISEA J041424.87-622737.2/TIC 38574306/CCDM J04144-6228B/CPD-62 332B/CSI-62 332 42/IDS 04131-6243 B/WDS J04144-6228B/2MASS J04142488-6227375/WISE J041424.90-622737.4/DENIS J041424.7-622737/PPMX J041424.8-622737/HD 27256B/Gaia DR2 4676528243502157696"
{
	ParentBody      "HIP 19780"
	Class           "A5.4?"
}
