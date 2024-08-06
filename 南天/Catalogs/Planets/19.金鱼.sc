// Object * alf Dor  ---  alpha2 CVn Variable  ---  OID=@3024532   (@@72596,3)  ---  coobox=22728 
// Object types: Double or Multiple Star,alpha2 CVn Variable,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "ALF Dor A" {ParentBody "ALF Dor"}
Remove "ALF Dor B" {ParentBody "ALF Dor"}
Star "ALF Dor A"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 21281"
	Class           "A0IIIp"
	AbsMagn         -0.29 // 计算的值
	MassSol         3.33
	RadSol          3.5
	LumBol          195
	Teff            11588
	RotationPeriod  70.56

	BinaryOrbit     
	{
		Period          12.1
		Separation      9.30791195739812 // 0.18 asec
		Eccentricity    0.80
		Inclination     31
		AscendingNode   140
		Epoch           2446431.142615166027099
		ArgOfPericenter 13
		MeanAnomaly     0
	}
}

Star "ALF Dor B"
{
	DateUpdated     "2024-08-06"
	ParentBody      "HIP 21281"
	Class           "B9IV"
	MassSol         2.7
	RadSol          1.9
	LumBol          70
	Teff            12200
}