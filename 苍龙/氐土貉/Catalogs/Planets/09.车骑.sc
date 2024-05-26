// Object * zet Lup  ---  High Proper Motion Star  ---  OID=@3440257   (@@64867,13)  ---  coobox=21937 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Remove "ZET Lup A" {ParentBody "ZET Lup"}
Remove "ZET Lup B" {ParentBody "ZET Lup"}
Star "ZET Lup A"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HIP 74395"
	Class           "G8III"
	AbsMagn         0.65
	MassSol         2.29
	RadSol          10
	LumBol          53
	Teff            5335
	FeH             0.00

	BinaryOrbit     
	{
		Epoch           2456293
		Separation      2475.52290785506 // 71.20 asec
		PositionAngle   249
	}
}

// Object HD 134483  ---  High Proper Motion Star  ---  OID=@3440256   (@@64867,12)  ---  coobox=21937 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 134483/GJ 9512 B/Gaia DR3 5888394257280681856/TIC 125802421/CCDM J15122-5206B/CD-51 8827/CPC 19 5776/CPD-51 7639/GC 20414/GCRV 65273/GEN# +1.00134483/GSC 08306-03363/IDS 15051-5143 B/PPM 343504/SAO 242300/SKY# 27541/TYC 8306-3363-1/UBV 13101/UBV 13103/UBV M 20589/uvby98 100134483/2MASS J15120983-5206229/WDS J15123-5206B/** DUN 176B/Gaia DR1 5888394252949116032/WEB 12697/Gaia DR2 5888394257280681856"
{
	DateUpdated     "2024-05-26"
	ParentBody      "HIP 74395"
	Parallax        28.4981
	AppMagn         6.67
	Class           "F6V"
	AbsMagn         3.94 // 计算的值
	MassKg          1.9200708316711e+30 // log(g) = 4.223 cm/s^2
	RadSol          1.25875 // Gaia DR3
	LumBol          2.12842151872423 // 计算的值
	Teff            6214
	FeH             -0.383
}
