// Object * bet Aql  ---  High Proper Motion Star  ---  OID=@2692199   (@@60895,0)  ---  coobox=20017 
// Object types: Rotating Variable,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=98036
Remove "Alshain A" {ParentBody "Alshain"}
Remove "Alshain B" {ParentBody "Alshain"}
Star "BET Aql A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "BET Aql"
	Class           "G8IV"
	AbsMagn         3.03
	MassSol         1.26
	RadSol          3.064
	LumBol          5.60
	Teff            5071
	FeH             -0.19
	RotationPeriod  122.08728
	Age             9.6 // 11.4
}

// Object * bet Aql B  ---  High Proper Motion Star  ---  OID=@2692200   (@@60896,0)  ---  coobox=20017 
// Object types: Double or Multiple Star,High Proper Motion Star,Star 
Barycenter "BET Aql B/GJ 771 B/Gaia DR3 4296708789289490816/ADS 13110 B/BD+06 4357B/CCDM J19553+0625B/CSI+06 4357 2/IDS 19504+0609 B/[RHG95] 3124/WDS J19553+0624B/** STT 532B/HD 188512B/Gaia DR2 4296708789289490816"
{
	ParentBody      "BET Aql"
	BinaryOrbit     
	{
		Period          1858
		Separation      180.469468113723 // 13.269 asec
	}
}

Star "BET Aql Ba"
{
	DateUpdated     "2024-06-02"
	ParentBody      "BET Aql B"
	Parallax        73.3889
	AppMagn         11.4
	Class           "M2.5V"
	AbsMagn         10.7 // 计算的值
	MassSol         0.44
	RadSol          0.5475 // Gaia DR3
	LumBol          0.0240517549678865 // 计算的值
	Teff            3072
	FeH             -0.926

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   2.45609917
		Eccentricity    0.590858185
		Inclination     -2.2982893
		AscendingNode   0
		ArgOfPericenter 123.791514
		MeanAnomaly     -22.5579797
	}
}

Star "BET Aql Bb"
{
	ParentBody      "BET Aql B"
	Class           "M6?"
}

// Object * alf Aql  ---  delta Sct Variable  ---  OID=@2708379   (@@60341,0)  ---  coobox=19999 
// Object types: delta Sct Variable,Variable Star,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,UV-emission Source,X-ray Source,X-ray Source 
Remove "Altair" {ParentBody "ALF Aql"}
Star "牛郎/Altair A"
{
	DateUpdated     "2024-06-02"
	ParentBody      "ALF Aql"
	Class           "A7Vn"
	AbsMagn         2.22
	MassSol         1.86
	DimensionsSol   (4.02, 3.14, 4.02)
	LumBol          10.6
	Teff            8621 // 6860(赤道) - 8621(极地)
	FeH             -0.2
	Age             0.100
	RotationPeriod  7.77
	Obliquity       60
}