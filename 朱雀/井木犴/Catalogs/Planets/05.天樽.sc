// Object * del Gem  ---  Spectroscopic Binary  ---  OID=@969524   (@@20522,0)  ---  coobox=5374 
// Object types: Double or Multiple Star,Spectroscopic Binary,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=35550
Remove "Wasat A"{ParentBody "Wasat"}
Remove "DEL Gem B"{ParentBody "Wasat"}
Remove "DEL Gem Aa"{ParentBody "Wasat A"}
Remove "DEL Gem Ab"{ParentBody "Wasat A"}
Barycenter "DEL Gem A"
{
	ParentBody      "DEL Gem"
	BinaryOrbit // VB6_Izm2019  STF1066 Gr.5
	{
		Period          1418.4375
		Separation      144.339134793413 // 7.761 asec
		Eccentricity    0.709
		Inclination     51.0
		AscendingNode   70.8
		Epoch           2506689.896296651568264
		ArgOfPericenter 268.4
		MeanAnomaly     0
	}
}

Star "DEL Gem Aa"
{
	DateUpdated     "2024-07-15"
	ParentBody      "DEL Gem A"
	Class           "F2VkF0mF0"
	AbsMagn         1.95
	MassSol         1.57
	Teff            6900
	FeH             -0.26
	Age             1.6

	BinaryOrbit // VB6_HIP1997d STF1066A Gr.9
	{
		Period          6.1291
		Separation      0.260222140099878 // 0.014 asec
		Eccentricity    0.353
		Inclination     92.4
		AscendingNode   70.0
		Epoch           2415466.639486910309643
		ArgOfPericenter 214.6
		MeanAnomaly     0
	}
}

Star "DEL Gem Ab"
{
	DateUpdated     "2024-07-15"
	ParentBody      "DEL Gem A"
	Class           ""
	MassSol         1.07
}

// Object * del Gem B  ---  Star  ---  OID=@969525   (@@20522,1)  ---  coobox=5374 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "DEL Gem B/GJ 271 B/Gaia DR3 866177431955017600/TIC 184842717/WDS J07201+2159B/ADS 5983 B/BD+22 1645B/CCDM J07201+2159B/CSI+22 1645 2/GCRV 4855/** STF 1066B/PMSC 07142+2210B/2MASS J07200710+2158526/WEB 7087/Gaia DR2 866177431955017600"
{
	DateUpdated     "2024-07-15"
	ParentBody      "DEL Gem"
	Parallax        53.9507
	AppMagn         8.18
	Class           "K6V"
	AbsMagn         6.84 // 计算的值
	MassSol         0.74
}
