// Object * lam Oph  ---  Double or Multiple Star  ---  OID=@2651709   (@@50955,3)  ---  coobox=17921 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=80883
Remove "Marfik (AB)"{ParentBody "Marfik"}
Remove "Marfik A"{ParentBody "Marfik (AB)"}
Remove "Marfik B"{ParentBody "Marfik (AB)"}
Remove "Marfik C"{ParentBody "Marfik"}
Barycenter "LAM Oph AB"
{
	ParentBody      "LAM Oph"
	BinaryOrbit     
	{
		Period          194248
		Separation      6290.87040068265
	}
}

// Object * lam Oph A  ---  High Proper Motion Star  ---  OID=@2651712   (@@50955,6)  ---  coobox=17921 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "LAM Oph A/Gaia DR3 4432032213656433536/ADS 10087 A/BD+02 3118A/CSI+02 3118 4/WDS J16309+0159A/PMSC 16259+0212A/Gaia DR2 4432032213656433536/TYC 386-2062-1"
{
	DateUpdated     "2024-05-17"
	ParentBody      "LAM Oph AB"
	Parallax        20.3338
	AppMagn         4.15
	Class           "A0V"
	AbsMagn         0.20
	MassSol         2.62
	Radius          2590968.84482228 // 计算的值
	LumBol          76.0
	Teff            8831

	BinaryOrbit // VB6_Izm2019  STF2055AB Gr.2
	{
		Period          129.0034
		Separation      47.6646111245937 // 0.898 asec
		Eccentricity    0.615
		Inclination     23.8
		AscendingNode   61.2
		Epoch           2429443.362707662861794
		ArgOfPericenter 148.8
		MeanAnomaly     0
	}
}

// Object * lam Oph B  ---  High Proper Motion Star  ---  OID=@2651713   (@@50955,7)  ---  coobox=17921 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "LAM Oph B/ADS 10087 B/BD+02 3118B/CSI+02 3118 5/WDS J16309+0159B/PMSC 16259+0212B/Gaia DR2 4432032213656434176/TYC 386-2062-2"
{
	DateUpdated     "2024-05-17"
	ParentBody      "LAM Oph AB"
	Class           "A4V"
	MassSol         1.90
}

// Object UCAC2 32387095  ---  High Proper Motion Star  ---  OID=@2651710   (@@50955,4)  ---  coobox=17921 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "UCAC2 32387095/Gaia DR3 4432031560823390336/TIC 281375759/ADS 10087 C/CCDM J16309+0159C/CSI+02 3118 2/WDS J16309+0159C/PMSC 16259+0212C/UCAC4 460-059225/2MASS J16305628+0157054/** STF 2055C/Gaia DR2 4432031560823390336"
{
	DateUpdated     "2024-05-17"
	ParentBody      "LAM Oph"
	Class           "K6"
	MassSol         0.72
}
