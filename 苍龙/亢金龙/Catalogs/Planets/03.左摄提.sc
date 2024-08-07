// Object * pi.01 Boo  ---  Star  ---  OID=@2287108   (@@47985,5)  ---  coobox=14162 
// Object types: Double or Multiple Star,Star,Infra-Red Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=71762
Remove "PI1 Boo" {ParentBody "PI Boo"}
Remove "PI2 Boo" {ParentBody "PI Boo"}
Barycenter "PI1 Boo/HIP 71762/Gaia DR3 1234645287617291520/PLX 3316/AG+16 1437/BD+17 2768/GC 19769/GCRV 8533/HD 129174/HIC 71762/HR 5475/PPM 130766/ROT 2100/SAO 101138/SKY# 26678/UBV 12795/ALS 17416/PI Boo/CSI+17 2768 4/IRAS 14383+1637/JP11 2526/UBV 12796/UBV M 20301/uvby98 100129174/** STF 1864A/IDS 14360+1651 A/TYC 1477-1336-1/UCAC4 533-056212/29 Boo A/ADS 9338 A/BD+17 2768A/CCDM J14407+1625A/CSI+17 2768 1/GEN# +1.00129174A/uvby98 100129174 A/WDS J14407+1625A/Renson 36820/WEB 12364/Gaia DR2 1234645287617291520"
{
	ParentBody      "ADS 9338"
	BinaryOrbit     
	{
		Epoch           2455197
		Separation      538.6
		PositionAngle   110.5
	}
}

Star "PI1 Boo A"
{
	DateUpdated     "2024-05-23"
	ParentBody      "PI1 Boo"
	Class           "B9IIIpHgMnSi"
	AbsMagn         -0.39
	MassSol         3.49
	RadSol          3.2
	LumBol          214
	Teff            12052
	FeH             0.18

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.259630829
		Eccentricity    0.645157374
		Inclination     1.13508117
		AscendingNode   0
		ArgOfPericenter 118.758645
		MeanAnomaly     -163.423683
	}
}

Star "PI1 Boo B"
{
	ParentBody      "PI1 Boo"
	Class           "F5.4?"
}

// Object * pi.02 Boo  ---  Star  ---  OID=@2287109   (@@47985,6)  ---  coobox=14162 
// Object types: Double or Multiple Star,Variable Star,Star 
Star "PI2 Boo/Gaia DR3 1234645287617291392/29 Boo B/ADS 9338 B/BD+17 2768B/CCDM J14407+1625B/CSI+17 2768 2/CSV 101461/GC 19770/GCRV 8534/GEN# +1.00129175/HD 129175/HR 5476/NSV 6763/ROT 2101/SAO 101139/SKY# 26679/SV* ZI 1080/WDS J14407+1625B/Renson 36830/TYC 1477-1337-1/UCAC4 533-056213/WEB 12365/Gaia DR2 1234645287617291392"
{
	DateUpdated     "2024-05-23"
	ParentBody      "ADS 9338"
	Parallax        10.5019
	AppMagn         5.761
	Class           "A6V"
	AbsMagn         0.87 // 计算的值
	MassSol         2.46
}

// Object * zet Boo  ---  Double or Multiple Star  ---  OID=@2287397   (@@47998,4)  ---  coobox=14170 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "ZET Boo A" {ParentBody "ZET Boo"}
Remove "ZET Boo B" {ParentBody "ZET Boo"}
Star "ZET Boo A"
{
	DateUpdated     "2024-05-23"
	ParentBody      "HIP 71795"
	Class           "A2III"
	AbsMagn         0.13
	LumBol          81

	BinaryOrbit     
	{
		PeriodDays      45460
		Separation      123.922424778329 // 2.3 asec
		Eccentricity    0.9977
		Inclination     102.3
		AscendingNode   8.2
		Epoch           2460183.5
		ArgOfPericenter 82.9
		MeanAnomaly     0
	}
}

Star "ZET Boo B"
{
	DateUpdated     "2024-05-23"
	ParentBody      "HIP 71795"
	Class           "A2III"
}
