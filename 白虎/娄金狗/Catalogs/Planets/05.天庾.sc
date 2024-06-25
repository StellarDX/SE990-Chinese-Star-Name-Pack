// Object * pi. For  ---  High Proper Motion Star  ---  OID=@1213488   (@@25052,1)  ---  coobox=10807 
// Object types: High Proper Motion Star,Red Giant Branch star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "PI For A" {ParentBody "PI For"}
Remove "PI For B" {ParentBody "PI For"}
Star "PI For A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "HIP 9440"
	Class           "G8III"
	AbsMagn         0.68
	MassSol         1.04
	RadSol          9.62
	LumBol          57.5
	Teff            5048
	FeH             -0.56
	Age             5.18

	BinaryOrbit     
	{
		Epoch           2454467
		Separation      1.04088856039951 // 12 mas
		//Period          11.4
		PositionAngle   120
	}
}

Star "PI For B"
{
	DateUpdated     "2024-06-25"
	ParentBody      "HIP 9440"
	Class           ""
	MassSol         0.5
}

// Object * ome For  ---  Star  ---  OID=@1214982   (@@25071,0)  ---  coobox=10911 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Blue Object,Double or Multiple Star,Star,UV-emission Source 
Remove "OME For A" {ParentBody "OME For"}
Remove "OME For B" {ParentBody "OME For"}
Star "OME For A"
{
	DateUpdated     "2024-06-25"
	ParentBody      "HIP 11918"
	Class           "B9Va"
	AbsMagn         -0.87
	MassSol         3.42
	RadSol          2.81
	LumBol          268
	Teff            10910

	BinaryOrbit     
	{
		Epoch           2456293
		Separation      1520
		PositionAngle   246
	}
}

// Object * ome For B  ---  Star  ---  OID=@1214983   (@@25071,1)  ---  coobox=10911 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "OME For B/Gaia DR3 5069213736122001664/TIC 65291437/ADS 1954 B/CCDM J02338-2814B/CD-28 819B/CSI-28 819 22/GC 3082/GEN# +1.00016046B/HD 16046B/SAO 167881/2MASS J02334996-2814011/WDS J02338-2814B/** HJ 3506B/TYC 6436-2247-1/Renson 4006/Gaia DR2 5069213736122001664"
{
	DateUpdated     "2024-06-25"
	ParentBody      "HIP 11918"
	Parallax        7.5225
	AppMagn         7.69
	Class           "A5V"
	AbsMagn         2.07 // 计算的值
	RadSol          2.2
}