// Object * alf CMa  ---  Spectroscopic Binary  ---  OID=@8399845   (@@-1,255)  ---  coobox=7392 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,High Proper Motion Star,Double or Multiple Star,Spectroscopic Binary,Star,Infra-Red Source,UV-emission Source 
Remove "Sirius A" {ParentBody "Sirius"}
Remove "Sirius B" {ParentBody "Sirius"}
Star "Sirius A/GJ 244 A/** AGC 1A/8pc 379.21A/ADS 5423 A/CCDM J06451-1643A/GEN# +1.00048915A/IDS 06408-1635 A/PM 06430-1639A/uvby98 100048915 A/WDS J06451-1643A/TYC 5949-2777-1/BD-16 1591A/HD 48915A"
{
	DateUpdated     "2024-07-20"
	ParentBody      "ALF CMa"
	Class           "A0mA1Va"
	AbsMagn         1.43
	MassSol         2.063
	RadSol          1.711
	LumBol          25.4
	Teff            9940
	FeH             0.50
	Age             0.242
	Oblateness      0

	BinaryOrbit     
	{
		Period          50.1284
		Separation      19.7666195222099 // 7.4957 asec
		PericenterDist  8.2
		Eccentricity    0.59142
		Inclination     136.336
		AscendingNode   45.400
		Epoch           2449561.816122017335147
		ArgOfPericenter 329.161
		MeanAnomaly     0
	}
}

// Object * alf CMa B  ---  White Dwarf  ---  OID=@930049   (@@14736,2)  ---  coobox=7392 
// Object types: White Dwarf,Double or Multiple Star,Star,UV-emission Source,White Dwarf Candidate,X-ray Source 
Star "ALF CMa B/GJ 244 B/Gaia DR3 2947050466531873024/2RXF J064508.6-164240/2E 1730/2RE J064509-164243/2RE J0645-164/8pc 379.21B/ADS 5423 B/BD-16 1591B/CCDM J06451-1643BC/CSI-16 1591 3/EGGR 49/GEN# +1.00048915B/H 0643-16/HD 48915B/IDS 06408-1635 B/RE J0645-16/RE J0645-164/RE J064509-164243/UBV 6710/WD 0642-163/WD 0643-16/WD 0642-16/WD 0642-166/Zkh 92/[BM83] X0642-166/1E 064255-1639.3/1ES 0642-16.6/2E 0642.9-1638/2EUVE J0645-16.7/EUVE J0645-16.7/WDS J06451-1643BC/** AGC 1BC/Gaia DR2 2947050466531873024/Sirius C/Sirius B/1RXS J064509.3-164241/1E 064255-1639.4/RX J0645.1-1642/Sirius BC"
{
	DateUpdated     "2024-07-20"
	ParentBody      "ALF CMa"
	Class           "DA2" // B5V(5 MSun, 600-1200 LSun) -> RG -> DA2
	AbsMagn         11.18
	MassSol         1.018
	Radius          5843.88
	LumBol          0.056
	Teff            25000
	Age             0.228
}
