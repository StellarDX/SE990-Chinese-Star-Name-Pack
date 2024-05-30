// Object * gam Ara  ---  Be Star  ---  OID=@3463894   (@@68854,0)  ---  coobox=22431 
// Object types: Be Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "GAM Ara A" {ParentBody "GAM Ara"}
Remove "GAM Ara B" {ParentBody "GAM Ara"}
Star "GAM Ara A"
{
	DateUpdated     "2024-05-30"
	ParentBody      "HIP 85267"
	Class           "B1Ib"
	AbsMagn         -5.8
	MassSol         12.5 // 25
	RadSol          23
	LumBol          120000
	Teff            21500
	RotationPeriod  115.2 // Vsini = 269 Km/s
	Age             0.0157

	BinaryOrbit     
	{
		Period          135000
		Separation      6200
	}
}

// Object CPD-56 8225B  ---  Star  ---  OID=@3463799   (@@68849,1)  ---  coobox=22431 
// Object types: Near-IR Source (λ < 3 µm),Star 
Star "CPD-56 8225B/Gaia DR3 5922299416284639232/TIC 325709808/CCDM J17254-5623B/CSI-56 8225 42/HD 157246B/IDS 17170-5617 B/WDS J17254-5623B/** HJ 4942B/2MASS J17252246-5622249/PPMX J172522.4-562224/DENIS J172522.4-562224/Gaia DR2 5922299416284639232"
{
	DateUpdated     "2024-05-30"
	ParentBody      "HIP 85267"
	Parallax        2.9352
	AppMagn         10.5
	Class           "A7V"
	AbsMagn         2.84 // 计算的值
	MassKg          2.65565538108803e+30 // log(g) = 4.033 cm/s^2
	RadSol          1.842327 // Gaia DR3
	LumBol          12.8860723868578 // 计算的值
	Teff            8057
	FeH             -0.821
}

// Object * del Ara  ---  High Proper Motion Star  ---  OID=@3447076   (@@69152,19)  ---  coobox=22450 
// Object types: High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "DEL Ara A" // B为光学伴星
{
	DateUpdated     "2024-05-30"
	ParentBody      "DEL Ara"
	Class           "B8Vn"
	AbsMagn         -0.31
	MassSol         3.56
	RadSol          3.12
	LumBol          214
	Teff            11962
	Age             0.125
	Oblateness      0.11504424778761061946902654867257 // Vsini = 255 Km/s
}