// Object * f Tau  ---  Spectroscopic Binary  ---  OID=@641146   (@@19084,18)  ---  coobox=4657 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "5 Tau A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "5 Tau"
	Class           "K0III"
	AbsMagn         -0.96
	MassSol         4.0
	RadSol          8.5
	LumBol          329.38
	Teff            4644
	FeH             0.05

	BinaryOrbit     
	{
		PeriodDays      960
		Separation      0.393418896192734 // 4.25 mas
		Eccentricity    0.397
		Inclination     36.95
		AscendingNode   207.61
		Epoch           2414889.565
		ArgOfPericenter 146.32
		MeanAnomaly     0
	}
}

Star "5 Tau B"
{
	DateUpdated     "2024-06-26"
	ParentBody      "5 Tau"
	Class           ""
	MassSol         1.13
}


// Object * ksi Tau  ---  High Proper Motion Star  ---  OID=@641314   (@@18795,9)  ---  coobox=4666 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Eclipsing Binary Candidate,Infra-Red Source,UV-emission Source,X-ray Source 
// NOIRLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=16083
Remove "KSI Tau (ABC)"{ParentBody "KSI Tau"}
Remove "KSI Tau (AB)"{ParentBody "KSI Tau (ABC)"}
Remove "KSI Tau A"{ParentBody "KSI Tau (AB)"}
Remove "KSI Tau B"{ParentBody "KSI Tau (AB)"}
Remove "KSI Tau C"{ParentBody "KSI Tau (ABC)"}
Remove "KSI Tau D"{ParentBody "KSI Tau"}
Barycenter "KSI Tau A"
{
	ParentBody      "KSI Tau"
	BinaryOrbit // 2016A&A...594A..55N
	{
		PeriodDays      51.0010
		Separation      26.3230759414349 // 0.442 asec
		Eccentricity    0.573
		Inclination     25.4
		AscendingNode   106.4
		Epoch           2465615.000
		ArgOfPericenter 10.6
		MeanAnomaly     0
	}
}

Barycenter "KSI Tau Aab"
{
	ParentBody      "KSI Tau A"
	BinaryOrbit // 2016A&A...594A..55N
	{
		PeriodDays      145.4710
		Separation      0.943385372114005 // 0.016 asec
		Eccentricity    0.212
		Inclination     86.7
		AscendingNode   148.4
		Epoch           2455609.360
		ArgOfPericenter 8.4
		MeanAnomaly     0
	}
}

Star "KSI Tau Aa"
{
	DateUpdated     "2024-06-26"
	ParentBody      "KSI Tau Aab"
	Class           "B9Vn"
	AbsMagn         -0.12 // 计算的值
	MassSol         2.29
	RadSol          2.0
	LumBol          28.136176780121712 // 计算的值
	Teff            9400

	BinaryOrbit // 2016A&A...594A..55N
	{
		PeriodDays      7.1466
		Eccentricity    0.000
		Inclination     86.8
		AscendingNode   148.4
		Epoch           2456224.725
		ArgOfPericenter 90.0
		MeanAnomaly     0
	}
}

Star "KSI Tau Ab"
{
	DateUpdated     "2024-06-26"
	ParentBody      "KSI Tau Aab"
	Class           "B9V"
	MassSol         2.20
	RadSol          1.5
	LumBol          14.522035890652353 // 计算的值
	Teff            9200
}

Star "KSI Tau Ac"
{
	DateUpdated     "2024-06-26"
	ParentBody      "KSI Tau A"
	Class           "B5V"
	MassSol         3.08
	Radius          1431323.30200665 // log(g) = 4.3 cm/s^2
	LumBol          14.522035890652353 // 计算的值
	Teff            15100
}

Star "KSI Tau B"
{
	DateUpdated     "2024-06-26"
	ParentBody      "KSI Tau"
	Class           "F5V"
	MassSol         1.32
}

// Object * omi Tau  ---  Spectroscopic Binary  ---  OID=@641294   (@@18793,0)  ---  coobox=4666 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Remove "OMI Tau Aa"{ParentBody "OMI Tau"}
Remove "OMI Tau Ab"{ParentBody "OMI Tau"}
Star "OMI Tau A"
{
	DateUpdated     "2024-06-26"
	ParentBody      "OMI Tau"
	Class           "G6III"
	AbsMagn         -0.45
	MassSol         3.01
	RadSol          18.10
	LumBol          149.4
	Teff            5180
	FeH             -0.12
	Age             0.380

	BinaryOrbit     
	{
		PeriodDays      1654.9
		Eccentricity    0.26
		Epoch           2429974.34
		ArgOfPericenter 335.6
		MeanAnomaly     0
	}
}

Star "OMI Tau B"
{
	ParentBody      "OMI Tau"
	Class           "F6.9?"
}