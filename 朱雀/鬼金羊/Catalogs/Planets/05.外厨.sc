// Object * 2 Hya  ---  Eclipsing Binary  ---  OID=@1095453   (@@16803,7)  ---  coobox=7502 
// Object types: Pulsating Variable,High Proper Motion Star,Eclipsing Binary,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=41375
Barycenter "2 Hya A"
{
	ParentBody      "2 Hya"
	BinaryOrbit     
	{
		Period          8025
		Separation      496.133361988002 // 10.637 asec
	}
}

Star "2 Hya Aa"
{
	DateUpdated     "2024-07-24"
	ParentBody      "2 Hya A"
	Class           "F0VmA6"
	AbsMagn         2.25 // 计算的值
	MassSol         1.69

	BinaryOrbit     
	{
		PeriodDays      8.796304 // Gaia DR3 EB
		Epoch           2457462.0059
	}
}

Star "2 Hya Ab"
{
	ParentBody      "2 Hya A"
	Class           "G2.6?"
}

Star "2 Hya B"
{
	DateUpdated     "2024-07-24"
	ParentBody      "2 Hya"
	Class           ""
	MassSol         0.21
}

// Object * F Hya  ---  Star  ---  OID=@1116810   (@@15781,0)  ---  coobox=7545 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source 
Star "HD 74395 A"
{
	DateUpdated     "2024-07-24"
	ParentBody      "HD 74395"
	Class           "G1Ib"
	AbsMagn         -2.77
	MassSol         5.2
	RadSol          110
	LumBol          9065.17497853632 // 计算的值
	Teff            5370
	FeH             -0.01
	Age             0.089
}

Star "HD 74395 C"
{
	ParentBody      "HD 74395 A"
	Class           "F2.1?"

	Orbit     
	{
		SemiMajorAxis   16308.5461851518 // 57 asec
	}
}

// Object HD 74394  ---  Star  ---  OID=@1116809   (@@15780,25)  ---  coobox=7545 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 74394/Gaia DR3 5754144742183016704/TIC 54926442/BD-06 2707/BDS 4746 B/CCDM J08437-0714B/GC 12004/GSC 04875-01588/IDS 08388-0652 B/PPM 191643/SAO 136219/SRS 8575/TYC 4875-1588-1/YZ 97 3396/uvby98 100074394/2MASS J08433629-0713110/WDS J08437-0714B/** S 579B/GEN# +1.00074394/Gaia DR2 5754144742183016704"
{
	DateUpdated     "2024-07-24"
	ParentBody      "HD 74395 A"
	Parallax        3.3088
	AppMagn         8.19
	Class           "B9.5V"
	AbsMagn         0.788 // 计算的值
	MassKg          5.62468639977873e+30 // log(g) = 4.195 cm/s^2
	RadSol          2.225 // Gaia DR3
	LumBol          62.2919163716167 // 计算的值
	Teff            10871
	FeH             0.127

	Orbit     
	{
		SemiMajorAxis   22542.9886035105 // 78.79 asec
		ArgOfPericenter 309.7
		MeanAnomaly     0
	}
}
