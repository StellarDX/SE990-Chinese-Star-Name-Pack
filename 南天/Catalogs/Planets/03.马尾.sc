// Object * rho Cen  ---  Pulsating Variable  ---  OID=@3283013   (@@63679,0)  ---  coobox=21539 
// Object types: Pulsating Variable,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,beta Cep Variable Candidate 
Star "RHO Cen A"
{
	DateUpdated     "2024-08-02"
	ParentBody      "RHO Cen"
	Class           "B3V"
	AbsMagn         -1.33
	MassSol         6.6
	RadSol          3.8
	LumBol          810.42
	Teff            19500
	Age             0.0237

	BinaryOrbit
	{
		Epoch           2456293
		SemiMajorAxis   5.68
		PositionAngle   19.72
	}
}

Star "RHO Cen B"
{
	ParentBody      "RHO Cen"
	Class           "A8.3?"
}

// Object * del Cen  ---  Be Star  ---  OID=@3282937   (@@63264,3)  ---  coobox=21537 
// Object types: Be Star,Emission-line Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=105435
Remove "DEL Cen A" {ParentBody "DEL Cen"}
Remove "DEL Cen B" {ParentBody "DEL Cen"}
Barycenter "DEL Cen A"
{
	ParentBody      "HIP 59196"
}

Star "DEL Cen Aa"
{
	DateUpdated     "2024-08-02"
	ParentBody      "DEL Cen A"
	Class           "B2Vne"
	AbsMagn         -2.94
	MassSol         8.7
	RadSol          6.5
	LumBol          5129
	Teff            22360
	Age             0.0215

	BinaryOrbit     
	{
		Period          4.6
		PericenterDist  6.9
	}
}

Star "DEL Cen Ab"
{
	DateUpdated     "2024-08-02"
	ParentBody      "DEL Cen A"
	Class           ""
	MassSol         4 // 7
}

// Object HD 105382  ---  Be Star  ---  OID=@3282920   (@@63263,0)  ---  coobox=21537 
// Object types: Be Star,Emission-line Star,Near-IR Source (λ < 3 µm),Eruptive Variable,Variable Star,Double or Multiple Star,Star,Infra-Red Source 
Barycenter "HD 105382/HIP 59173/Gaia DR3 6126517517699891712/TIC 333670665/[JE82] 620/CCDM J12083-5043B/CD-49 6813/CPC 0 10108/CPD-49 4867/EM* CDS 864/GC 16576/GCRV 7269/GEN# +1.00105382/GSC 08241-03234/HGAM 2005/HIC 59173/HR 4618/IDS 12032-5010 B/IRAS 12054-5022/JP11 2163/N30 2810/PPM 340717/ROT 1781/SAO 239687/SKY# 22774/TYC 8241-3234-1/UBV 10884/UBV M 17776/V* V863 Cen/[B10] 3162/uvby98 100105382/2MASS J12080523-5039406/ALS 14962/PSCz P12054-5022/WDS J12084-5043B/** JC 2B/Renson 30464/WEB 10524/Gaia DR2 6126517517699891712"
{
	ParentBody      "HIP 59196"
	Orbit     
	{
		Period          1.3E6
		SemiMajorAxis   47053.9850155354 // 269.05 asec
		ArgOfPericenter 325
		MeanAnomaly     0
	}
}

Star "HD 105382 A"
{
	DateUpdated     "2024-08-02"
	ParentBody      "HD 105382"
	Class           "B6III"
	AbsMagn         -1.2
	AbsMagnBol      -2.9
	MassSol         5.7
	RadSol          3.0
	LumBol          1000
	Teff            17400
	RotationPeriod  31.08

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   6.02335701
		Eccentricity    0.154366381
		Inclination     -1.44577527
		AscendingNode   0
		ArgOfPericenter 226.28153
		MeanAnomaly     -140.828956
	}
}

Star "HD 105382 B"
{
	ParentBody      "HD 105382"
	Class           "A7.7?"
}

// Object HD 105383  ---  Star  ---  OID=@3282926   (@@63263,6)  ---  coobox=21537 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 105383/Gaia DR3 6126469139186679808/TIC 333670854/CCDM J12083-5043C/CD-50 6688/CPC 0 10107/CPD-50 4853/GC 16575/GCRV 7268/GEN# +1.00105383/GSC 08241-03236/HR 4619/IDS 12032-5010 C/PPM 340716/SAO 239686/SKY# 22773/TYC 8241-3236-1/UBV 10885/UBV M 17777/uvby98 100105383/2MASS J12080486-5045492/WDS J12084-5043C/** JC 2C/Gaia DR1 6126469134882550528/WEB 10525/Gaia DR2 6126469139186679808"
{
	DateUpdated     "2024-08-02"
	ParentBody      "HIP 59196"
	Parallax        8.6331
	AppMagn         6.362
	Class           "B9V"
	AbsMagn         1.04 // 计算的值
	MassSol         3.84

	Orbit     
	{
		Period          945420
		SemiMajorAxis   37891.5318637437 // 216.66 asec
		ArgOfPericenter 226.7
		MeanAnomaly     0
	}
}