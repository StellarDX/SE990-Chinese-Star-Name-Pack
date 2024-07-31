// Object * gam Crv  ---  High Proper Motion Star  ---  OID=@1920557   (@@39754,10)  ---  coobox=15524 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "GAM Crv A"
{
	DateUpdated     "2024-07-31"
	ParentBody      "GAM Crv"
	Class           "B8III"
	AbsMagn         -0.79
	MassSol         4.2
	RadSol          4.026
	LumBol          331
	Teff            12000
	Age             0.160

	BinaryOrbit     
	{
		Period          158
		Separation      50
	}
}

Star "GAM Crv B"
{
	DateUpdated     "2024-07-31"
	ParentBody      "GAM Crv"
	Class           "K5-M5V"
	MassSol         0.8
}

// Object * del Crv  ---  High Proper Motion Star  ---  OID=@1946342   (@@40361,0)  ---  coobox=15515 
// Object types: Near-IR Source (λ < 3 µm),High Proper Motion Star,Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Algorab A" {ParentBody "Algorab"}
Remove "Algorab B" {ParentBody "Algorab"} // 尽管两颗恒星有相同的移动方向，但是年龄对不上，所以此处认为是光学伴星