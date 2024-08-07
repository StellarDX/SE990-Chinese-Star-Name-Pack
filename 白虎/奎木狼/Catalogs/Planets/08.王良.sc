// Object * bet Cas  ---  delta Sct Variable  ---  OID=@129059   (@@5085,0)  ---  coobox=2116 
// Object types: delta Sct Variable,Double or Multiple Star,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,UV-emission Source,X-ray Source,X-ray Source 
Star "BET Cas A"
{
	DateUpdated     "2024-06-21"
	ParentBody      "BET Cas"
	Class           "F2III"
	AbsMagn         1.3
	MassSol         1.91
	RadSol          3.43 // 3.69
	LumBol          27.3
	Teff            7079
	FeH             0.03
	Age             1.09 // 1.18
	RotationPeriod  21.428571428571428571428571428571 // 1.12 Rotation/day
	Oblateness      0.19354838709677419354838709677419
}

// Object * eta Cas  ---  High Proper Motion Star  ---  OID=@106647   (@@4423,0)  ---  coobox=2147 
// Object types: High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,High Proper Motion Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "ETA1 Cas" {ParentBody "Achird"}
Remove "ETA2 Cas" {ParentBody "Achird"}
Star "ETA Cas A"
{
	DateUpdated     "2024-06-21"
	ParentBody      "ETA Cas"
	Class           "G0V"
	AbsMagn         4.57
	MassSol         0.97
	RadSol          1.00
	LumBol          1.2321
	Teff            6010
	FeH             -0.238
	Age             5.4

	BinaryOrbit     
	{
		Period          480
		Separation      71.0403591393655 // 11.9939 asec
		Eccentricity    0.497
		Inclination     34.76
		AscendingNode   98.42
		Epoch           2411221.794652677606791
		ArgOfPericenter 268.59
		MeanAnomaly     0
	}
}

// Object * eta Cas B  ---  High Proper Motion Star  ---  OID=@106493   (@@4411,3)  ---  coobox=2147 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Star 
Star "ETA Cas B/GJ 34 B/AP J00490516+5749037/Gaia DR3 425040000962497792/TIC 445258198/2MASS J00490516+5749037/LSPM J0049+5749/NLTT 2689/ASCC 159210/USNO-B1.0 1478-00036287/8pc 167.99B/ADS 671 B/BD+57 150B/CCDM J00491+5749B/CSI+57 150 9/GCRV 448/GEN# +1.00004614B/HD 4614B/LFT 75/LHS 122/LTT 10288/ROT 3535/TYC 3663-2669-2/Zkh 16/[RHG95] 156/WDS J00491+5749B/** STF 60B/WEB 678/Gaia DR2 425040000959067008/Karmn J00490+578"
{
	DateUpdated     "2024-06-21"
	ParentBody      "ETA Cas"
	Parallax        168.7186
	AppMagn         7.51
	Class           "K7Ve"
	AbsMagn         8.64 // 计算的值
	MassSol         0.57
	RadSol          0.66
	LumBol          0.06
	Teff            4036
}

// Object * lam Cas A  ---  Star  ---  OID=@82011   (@@4405,16)  ---  coobox=2078 
// Object types: Double or Multiple Star,Star 
Remove "LAM Cas A" {ParentBody "LAM Cas"}
Remove "LAM Cas B" {ParentBody "LAM Cas"}
Star "LAM Cas A/ADS 434 A/BD+53 82A/CSI+53 82 2/WDS J00318+5431A/TYC 3658-2414-1/** STT 12A/CCDM J00318+5431A"
{
	DateUpdated     "2024-06-21"
	ParentBody      "HIP 2505"
	Class           "B8Vnn"
	AbsMagn         -0.57
	MassSol         2.9
	RadSol          3.50
	LumBol          255
	Teff            12000
	Age             0.058

	BinaryOrbit     
	{
		Period          245.70
		Separation      51.8507598044794 // 8.64
		Eccentricity    0.689
		Inclination     53.6
		AscendingNode   17.6
		Epoch           2460872.819154966622591
		ArgOfPericenter 121.0
		MeanAnomaly     0
	}
}

// Object * lam Cas B  ---  Star  ---  OID=@11609865   (@@-1,255)  ---  coobox=2078 
// Object types: Double or Multiple Star,Star 
Star "LAM Cas B/ADS 434 B/CSI+53 82 3/IDS 00262+5358 B/WDS J00318+5431B/** STT 12B/CCDM J00318+5431B/TYC 3658-2414-2"
{
	DateUpdated     "2024-06-21"
	ParentBody      "HIP 2505"
	Class           "B8.5V"
}
