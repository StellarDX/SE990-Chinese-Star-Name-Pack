// PI Her b, not confirmed
Planet "PI Her b"
{
	ParentBody     "PI Her"
	DiscMethod     "RadVel"
	MassJup        27

	Orbit
	{
		PeriodDays      613
		SemiMajorAxis   3
		Eccentricity    0.05
	}
}

// Object * e Her  ---  High Proper Motion Star  ---  OID=@2896858   (@@53107,9)  ---  coobox=18372 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "69 Her A"
{
	DateUpdated     "2024-05-19"
	ParentBody      "69 Her"
	Class           "A2V"
	AbsMagn         0.99
	MassSol         2.12
	RadSol          2.2
	LumBol          36.64
	Teff            9141
	FeH             0.29
	Age             0.155

	BinaryOrbit     
	{
		Separation      47.173370102913 // 0.88
	}
}

// Object * e Her B  ---  High Proper Motion Star  ---  OID=@11608390   (@@-1,255)  ---  coobox=18372 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "e Her B/WDS J17177+3717B/** HDS 2446B/HD 156729B/69 Her B/TYC 2604-1775-2"
{
	ParentBody      "69 Her"
	Class           "A8.7?"
}

// Object * rho Her A  ---  Double or Multiple Star  ---  OID=@2896863   (@@53108,2)  ---  coobox=18374 
// Object types: Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=85112
Remove "RHO Her (AB)" {ParentBody "RHO Her"}
Remove "RHO Her A" {ParentBody "RHO Her (AB)"}
Remove "RHO Her B" {ParentBody "RHO Her (AB)"}
Remove "RHO Her C" {ParentBody "RHO Her"}
Barycenter "RHO Her A/Gaia DR3 1337345927125084416/PLX 3953/75 Her A/ADS 10526 A/BD+37 2878A/CCDM J17236+3708A/CSI+37 2878 1/GC 23544/GCRV 10054/HD 157779/HR 6485/IDS 17202+3714 A/N30 3878/ROT 2445/SAO 66001/ALS 16445/WDS J17237+3709Aa,Ab/Renson 44340/TYC 2604-1777-1/PMSC 17202+3714AP/** MCA 48/UCAC4 636-055263/** STF 2161A/WEB 14371/Gaia DR2 1337345927125084416"
{
	ParentBody      "RHO Her"
	/*BinaryOrbit // B为光学伴星
	{
		Period          2862
		Separation      407.072035678059 // 4.05 asec
	}*/
}

Star "RHO Her Aa"
{
	DateUpdated     "2024-05-19"
	ParentBody      "RHO Her A"
	Parallax        9.9491
	AppMagn         4.51
	Class           "B9.5III"
	AbsMagn         -0.5 // 计算的值
	MassSol         4.00
	Teff            9118
	FeH             0.0

	BinaryOrbit     
	{
		Period          65.783
		Separation      28.746513292213 // 0.286 asec
	}
}

Star "RHO Her Ab"
{
	DateUpdated     "2024-05-19"
	ParentBody      "RHO Her A"
	Class           ""
	MassSol         2.93
}

// Object * rho Her B  ---  Star  ---  OID=@2896864   (@@53108,3)  ---  coobox=18374 
// Object types: Double or Multiple Star,Star 
/*Star "RHO Her B/Gaia DR3 1337345922829546752/75 Her B/ADS 10526 B/BD+37 2878B/CCDM J17236+3708B/CSI+37 2878 2/GC 23543/GCRV 10053/HD 157778/HR 6484/IDS 17202+3714 B/ROT 2444/SAO 66000/SKY# 31384/UBV M 22173/WDS J17237+3709B/** STF 2161B/PMSC 17202+3714B/TYC 2604-1776-1/UCAC4 636-055262/WEB 14370/Gaia DR2 1337345922829546752"
{
	DateUpdated     "2024-05-19"
	ParentBody      "RHO Her"
	Parallax        8.9108
	AppMagn         5.398
	Class           "A0Vn"
	AbsMagn         0.15 // 计算的值
	MassSol         3.27
	Radius          3301689.73685296 // log(g) = 3.6 cm/s^2
	LumBol          119.21936182180526 // 计算的值
	Teff            8755
}*/
