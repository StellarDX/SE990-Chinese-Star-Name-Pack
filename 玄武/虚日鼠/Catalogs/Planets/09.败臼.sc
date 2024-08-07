// Object * gam PsA  ---  Star  ---  OID=@1206571   (@@24878,0)  ---  coobox=8757 
// Object types: Rotating Variable,Near-IR Source (λ < 3 µm),Variable Star,High Proper Motion Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "GAM PsA A"{ParentBody "GAM PsA"}
Remove "GAM PsA B"{ParentBody "GAM PsA"}
Star "GAM PsA A"
{
	DateUpdated     "2024-06-12"
	ParentBody      "Gaia DR3 6602839458218253824"
	Class           "A0VpSrCrEu"
	AbsMagn         -0.20
	MassSol         2.63
	Radius          2048520.23241938 // log(g) = 3.92 cm/s^2
	LumBol          105.33204542172277 // 计算的值
	Teff            10776
	Age             0.214

	BinaryOrbit     
	{
		Separation      279.48612404598 // 4.09 asec
	}
}

// Object * gam PsA B  ---  Star  ---  OID=@1206572   (@@24878,1)  ---  coobox=8757 
// Object types: Star 
Star "GAM PsA B/GJ 9800 B/Gaia DR3 6602839458218256896/CCDM J22525-3253B/CD-33 16270B/CSI-33 16270 22/IDS 22470-3324 B/WDS J22525-3253B/** HJ 5367B/TYC 7508-1315-1/Gaia DR2 6602839458218256896"
{
	DateUpdated     "2024-06-12"
	ParentBody      "Gaia DR3 6602839458218253824"
	Parallax        14.4163
	AppMagn         5.023
	Class           "F5V"
	AbsMagn         3.50
}
