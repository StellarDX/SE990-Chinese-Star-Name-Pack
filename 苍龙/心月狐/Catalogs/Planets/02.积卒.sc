// Object * eta Lup  ---  beta Cep Variable Candidate  ---  OID=@2312565   (@@50406,1)  ---  coobox=16521 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,beta Cep Variable Candidate 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=78384
Remove "ETA Lup (AB)" {ParentBody "ETA Lup"}
Remove "ETA Lup A" {ParentBody "ETA Lup (AB)"}
Remove "ETA Lup B" {ParentBody "ETA Lup (AB)"}
Remove "ETA Lup C" {ParentBody "ETA Lup"}
Barycenter "ETA Lup AB"
{
	ParentBody      "ETA Lup"
	BinaryOrbit     
	{
		Period          556896
		Separation      15160.2536864266 // 115.13 asec
	}
}

Star "ETA Lup A"
{
	DateUpdated     "2024-05-29"
	ParentBody      "ETA Lup AB"
	Class           "B2IV"
	AbsMagn         -2.24
	MassSol         7.0
	RadSol          6.7
	LumBol          1729
	Teff            14668
	Age             0.0398

	BinaryOrbit     
	{
		Period          27171
		Separation      1959.39002072285 // 14.88 asec
	}
}

// Object * eta Lup B  ---  Star  ---  OID=@11633899   (@@-1,255)  ---  coobox=16521 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "ETA Lup B/Gaia DR3 5998066831276471424/TIC 59095500/CCDM J16001-3824B/CD-38 10797B/CPC 18 7915/CSI-38 10797 21/GC 21479/GCRV 65858/GEN# +1.00143118B/HD 143118B/IDS 15535-3807 B/SAO 207209/uvby98 100143118 B/2MASS J16000773-3823341/WDS J16001-3824B/PMSC 15535-3807B/WEB 13248/Gaia DR2 5998066831276471424/TYC 7851-1813-1"
{
	DateUpdated     "2024-05-29"
	ParentBody      "ETA Lup AB"
	Parallax        7.0881
	AppMagn         7.47
	Class           "A5Vp"
	AbsMagn         1.72 // 计算的值
	MassSol         1.68
	RadSol          1.675 // Gaia DR3
	LumBol          11.1246832835912 // 计算的值
	Teff            8145
	FeH             -0.549
}

// Object HD 143099  ---  Star  ---  OID=@11575582   (@@-1,255)  ---  coobox=16521 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Star,X-ray Source 
Star "HD 143099/Gaia DR3 5998065285088239360/TIC 59095543/CCDM J16001-3824C/CD-38 10794/CPC 18 7912/CPD-38 6321/GCRV 65842/GEN# +1.00143099/GSC 07838-01686/IDS 15535-3807 C/PPM 294518/SAO 207202/SKY# 28880/TYC 7838-1686-1/UBV M 21066/[KWS97] Lupus 2 49/2MASS J15595826-3824317/WDS J16001-3824C/PMSC 15535-3807C/Gaia DR1 5998065280771698432/WEB 13246/Gaia DR2 5998065285088239360"
{
	DateUpdated     "2024-05-29"
	ParentBody      "ETA Lup"
	Parallax        7.1035
	AppMagn         9.28
	Class           "F5V"
	AbsMagn         3.54 // 计算的值
	MassSol         1.26
	RadSol          1.597702 // Gaia DR3
	LumBol          3.0628136847925 // 计算的值
	Teff            6041
	FeH             -0.21
}
