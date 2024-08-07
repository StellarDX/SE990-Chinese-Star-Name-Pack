// Object * iot Aps  ---  Double or Multiple Star  ---  OID=@3383437   (@@69181,0)  ---  coobox=22259 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "IOT Aps A" {ParentBody "IOT Aps"}
Remove "IOT Aps B" {ParentBody "IOT Aps"}
Star "IOT Aps A"
{
	DateUpdated     "2024-08-02"
	ParentBody      "HIP 84979"
	Class           "B9V"
	AbsMagn         -2.09 // 计算的值
	MassSol         3.89
	Oblateness      0

	BinaryOrbit     
	{
		Period          59.32
		Separation      35.9886910641728 // 0.115 asec
		Eccentricity    0.172
		Inclination     69.4
		AscendingNode   119.6
		ArgOfPericenter 90.5
		MeanAnomaly     0
	}
}

Star "IOT Aps B"
{
	DateUpdated     "2024-08-02"
	ParentBody      "HIP 84979"
	Class           "B9.5V"
	MassSol         3.45
}