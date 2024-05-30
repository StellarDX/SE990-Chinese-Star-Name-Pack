// Object * del Sgr  ---  Star  ---  OID=@2473749   (@@56232,1)  ---  coobox=18510 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Star,Infra-Red Source,UV-emission Source 
Star "DEL Sgr A"
{
	DateUpdated     "2024-05-30"
	ParentBody      "DEL Sgr"
	Class           "K2.5IIIaCN0.5"
	AbsMagn         -1.99
	MassSol         3.21
	RadSol          76.84
	LumBol          1660
	Teff            4203
	FeH             -0.32
	Age             0.260

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   140.025944
		Eccentricity    0.518606911
		Inclination     -1.19135427
		AscendingNode   0
		ArgOfPericenter -1.86561082
		MeanAnomaly     42.279469
	}
}

Star "DEL Sgr B"
{
	DateUpdated     "2024-05-30"
	ParentBody      "DEL Sgr"
	Class           "WD?"
}

// Object * eps Sgr  ---  High Proper Motion Star  ---  OID=@2371233   (@@56266,0)  ---  coobox=18485 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Kaus Australis A" {ParentBody "Kaus Australis"}
Remove "Kaus Australis B" {ParentBody "Kaus Australis"}
Star "EPS Sgr A"
{
	DateUpdated     "2024-05-30"
	ParentBody      "EPS Sgr"
	Class           "B9III"
	AbsMagn         -1.41
	MassSol         3.515
	RadSol          6.8
	LumBol          363
	Teff            9960
	Age             0.232

	BinaryOrbit     
	{
		Epoch           2451910
		Separation      106
		PositionAngle   142.3
	}
}

Star "EPS Sgr B"
{
	DateUpdated     "2024-05-30"
	ParentBody      "EPS Sgr"
	Class           "B9III"
	MassSol         0.95
	Radius          648435.100247185 // 计算的值
	LumBol          0.89
	Teff            5807
}

// Object * eta Sgr  ---  Long-Period Variable Candidate  ---  OID=@2350972   (@@56272,6)  ---  coobox=18459 
// Object types: High Proper Motion Star,High Proper Motion Star,Variable Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,Long-Period Variable Candidate,UV-emission Source 
Remove "ETA Sgr A" {ParentBody "ETA Sgr"}
Remove "ETA Sgr B" {ParentBody "ETA Sgr"}
Star "ETA Sgr A"
{
	DateUpdated     "2024-05-30"
	ParentBody      "HIP 89642"
	Class           "M2III"
	AbsMagn         -4.90
	MassSol         2.1
	RadSol          66
	LumBol          525
	Teff            3638

	BinaryOrbit     
	{
		Period          1270
		Separation      165
		PositionAngle   108
	}
}

Star "ETA Sgr B"
{
	DateUpdated     "2024-05-30"
	ParentBody      "HIP 89642"
	Class           "F7V"
}