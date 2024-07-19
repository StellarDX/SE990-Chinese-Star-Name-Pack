// Object * eps Mon A  ---  Star  ---  OID=@889885   (@@17930,0)  ---  coobox=5808 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=30419
Remove "EPS Mon A"{ParentBody "EPS Mon"}
Remove "EPS Mon B"{ParentBody "EPS Mon"}
Remove "EPS Mon Aa"{ParentBody "EPS Mon A"}
Remove "EPS Mon Ab"{ParentBody "EPS Mon A"}
Barycenter "EPS Mon A/HIP 30419/Gaia DR3 3131481481815810432/TIC 319614743/PLX 1482/8 Mon A/ADS 5012 A/AG+04 748/BD+04 1236/CCDM J06237+0436A/CEL 1212/CSI+04 1236 1/FK5 244/GC 8240/GCRV 4062/GEN# +1.00044769A/GSC 00141-02452/HD 44769/HIC 30419/HR 2298/JP11 1378/N30 1380/PMC 90-93 176/PPM 150415/ROT 1028/SAO 113810/SKY# 10927/TYC 141-2452-1/UBV 6396/YZ 4 2149/WDS J06238+0436A/2MASS J06234609+0435339/WEB 6051/Gaia DR2 3131481481815810432"
{
	ParentBody      "ADS 5012 AB"
	BinaryOrbit     
	{
		Period          6123
		Separation      511.261460086048 // 12.31 asec
	}
}

// Object * eps Mon A  ---  Star  ---  OID=@889885   (@@17930,0)  ---  coobox=5808 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,UV-emission Source 
Star "EPS Mon Aa"
{
	DateUpdated     "2024-07-19"
	ParentBody      "ADS 5012 A"
	Parallax        24.0777
	AppMagn         4.398
	Class           "A5IV"
	AbsMagn         1.52
	MassSol         2.04
	RadSol          2.5
	LumBol          25
	Teff            7923
	FeH             -0.11

	BinaryOrbit     
	{
		PeriodDays      331
	}
}

Star "EPS Mon Ab"
{
	ParentBody      "ADS 5012 A"
	Class           "F6.4?"
}

// Object * eps Mon B  ---  Star  ---  OID=@889888   (@@17930,3)  ---  coobox=5808 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "EPS Mon B/HIP 30422/Gaia DR3 3131481481815806976/TIC 319614734/8 Mon B/ADS 5012 B/AG+04 749/BD+04 1237/CCDM J06237+0436B/GC 8241/GCRV 4063/GEN# +1.00044770/GSC 00141-02451/HD 44770/HIC 30422/HR 2299/ROT 1029/SAO 113811/SKY# 10928/TYC 141-2451-1/UBV 6397/[VGK85] NGC 2244 +04 18/WDS J06238+0436B/2MASS J06234648+0435449/Gaia DR1 3131481477515089792/WEB 6052/Gaia DR2 3131481481815806976"
{
	DateUpdated     "2024-07-19"
	ParentBody      "ADS 5012 AB"
	Parallax        25.0633
	AppMagn         6.6
	Class           "F5V"
	AbsMagn         3.88
	MassSol         1.16
	RadSol          1.1
	LumBol          2.39
	Teff            7923
}
