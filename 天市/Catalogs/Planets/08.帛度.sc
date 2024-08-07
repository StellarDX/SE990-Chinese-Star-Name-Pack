// Object * 95 Her A  ---  Star  ---  OID=@11634233   (@@-1,255)  ---  coobox=19541 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Remove "95 Her A" {ParentBody "95 Her"}
Remove "95 Her B" {ParentBody "95 Her"}
Star "95 Her A/Gaia DR3 4576147844112599424/TIC 424429430/TYC 1566-3674-1/ADS 10993 A/BD+21 3280A/CCDM J18015+2136A/GEN# +1.00164669A/IDS 17573+2136 A/WDS J18015+2136A/2MASS J18013040+2135449/** STF 2264A/Gaia DR2 4576147844112599424/SAO 85648/GC 24539/HR 6730/WEB 14915/GCRV 10461/ROT 2527/UBV 15326"
{
	DateUpdated     "2024-05-17"
	ParentBody      "HIP 88267"
	Parallax        7.5526
	AppMagn         4.83
	Class           "A5III?"
	AbsMagn         -0.78 // 计算的值
	MassSol         2.8
	RadSol          6.8
	LumBol          167
	Teff            8000
	RotationPeriod  36

	BinaryOrbit     
	{
		Period          11000
		Separation      900
	}
}

// Object * 95 Her B  ---  Star  ---  OID=@11606595   (@@-1,255)  ---  coobox=19541 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "95 Her B/Gaia DR3 4576147848417217536/TIC 424429431/TYC 1566-3675-1/ADS 10993 B/BD+21 3280B/CCDM J18015+2136B/CSI+21 3280 1/GC 24538/GCRV 10460/GEN# +1.00164668/HD 164668/HR 6729/IDS 17573+2136 B/IRC +20343/ROT 2526/SAO 85647/UBV 15327/WDS J18015+2136B/** STF 2264B/WEB 14914/Gaia DR2 4576147848417217536/2MASS J18013009+2135436"
{
	DateUpdated     "2024-05-17"
	ParentBody      "HIP 88267"
	Parallax        7.5492
	AppMagn         5.1
	Class           "G8III?"
	AbsMagn         -0.51 // 计算的值
	MassSol         3.2
	RadSol          19.4
	LumBol          194
	Teff            4900
	FeH             -0.22184874961635636749123320202039 // 60% solar
	RotationPeriod  4080
}