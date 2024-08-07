// Object * lam Ori A  ---  Emission-line Star  ---  OID=@797715   (@@143957,0)  ---  coobox=5061 
// Object types: Mid-IR Source (3 to 30 µm),Double or Multiple Star,Emission-line Star,Star,UV-emission Source,X-ray Source 
Remove "Meissa A" {ParentBody "Meissa"}
Remove "Meissa B" {ParentBody "Meissa"}
Star "LAM Ori A/Gaia DR3 3337991583943473280/WISEA J053508.30+095603.3/LAM1 Ori/39 Ori A/2E 1341/ADS 4179 A/BD+09 879A/CCDM J05351+0956A/CEL 811/CGO 96/CSI+09 879 4/EM* CDS 515/GCRV 3395/GOS G195.05-12.00 01/GSC 00705-02400/HD 36861/HGAM 428/HR 1879/IDS 05296+0952 A/JP11 1168/MCW 331/ROT 863/SKY# 9007/TD1 4898/TYC 705-2400-1/UBV M 11184/[HJ56] 67/ALS 14783/1RXS J053508.6+095607/2E 0532.3+0954/WDS J05351+0956A/** STF 738A/WISE J053508.19+095601.4/3XMM J053508.2+095602/Gaia DR2 3337991583942617088/lambda Ori X-3/WEB 5112"
{
	DateUpdated     "2024-07-05"
	ParentBody      "LAM Ori"
	Parallax        2.5936
	AppMagn         3.47
	Class           "O8III((f))"
	AbsMagn         -4.25
	MassSol         27.9
	RadSol          13.4
	LumBol          165000
	Teff            35000
	FeH             0.03

	BinaryOrbit     
	{
		Epoch           2428535
		Separation      1484.84860077124 // 4.41 asec
		PositionAngle   43.12
	}
}

// Object * lam Ori B  ---  Young Stellar Object Candidate  ---  OID=@797124   (@@18557,2)  ---  coobox=5061 
// Object types: Mid-IR Source (3 to 30 µm),Double or Multiple Star,Star,Young Stellar Object Candidate 
Star "LAM Ori B/Gaia DR3 3337991583942616704/39 Ori B/ADS 4179 B/BD+09 879B/CCDM J05351+0956B/CSI+09 879 5/GCRV 3396/GEN# +1.00036862/HD 36862/HGAM 429/HR 1880/IDS 05296+0952 B/ROT 864/WDS J05351+0956B/LAM2 Ori/** STF 738B/TYC 705-2400-2/UCAC4 500-013601/WISE J053508.41+095604.8/WEB 5113/Gaia DR2 3337991583942616704"
{
	DateUpdated     "2024-07-05"
	ParentBody      "LAM Ori"
	Class           "B0V"
	AbsMagn         -1.94
	MassSol         10.3
	RadSol          4.2
	LumBol          6300
	Teff            25400
	Age             0.0018
}

// Object * phi01 Ori  ---  Young Stellar Object  ---  OID=@797117   (@@18556,0)  ---  coobox=5063 
// Object types: Spectroscopic Binary,Young Stellar Object,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "PHI1 Ori A" {ParentBody "PHI1 Ori"}
Remove "PHI1 Ori B" {ParentBody "PHI1 Ori"}
Star "PHI1 Ori A"
{
	DateUpdated     "2024-07-05"
	ParentBody      "Gaia DR3 3337904172766584064"
	Class           "B0III"
	AbsMagn         -3.53
	MassSol         15.5
	RadSol          6.3
	LumBol          28840
	Teff            30000
	Age             0.0072

	BinaryOrbit     
	{
		PeriodDays      3068.03
		Eccentricity    0.22
		Epoch           2418051.8
		ArgOfPericenter 285
		MeanAnomaly     0
	}
}

Star "PHI1 Ori B"
{
	ParentBody      "Gaia DR3 3337904172766584064"
	Class           "O9.7?"
}