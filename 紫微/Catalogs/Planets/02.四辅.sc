// Object HD 90089  ---  High Proper Motion Star  ---  OID=@366853   (@@4921,0)  ---  coobox=3096 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Variable Star,Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
// NoirLab: http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=90089
Barycenter	"HD 90089 A"
{
	ParentBody      "HD 90089"
	BinaryOrbit // GAT_14 Gaia pos.
	{
		Separation      317.243253384917 // 13.78"
		PositionAngle   272
	}
}

Star "HD 90089 Aa"
{
	DateUpdated     "2024-04-27"
	ParentBody      "HD 90089 A"
	Class           "F4VkF2mF2"
	AbsMagn         3.60
	MassSol         1.29
	RadSol          1.40
	LumBol          3.36
	Teff            6602
	FeH             -0.26
	Age             1.074

	BinaryOrbit // DR3 AORB
	{
		PeriodDays      2886.7200
		Separation      0.71256552267978 // 0.031 s
		Eccentricity    0.607
		Inclination     63.5
		AscendingNode   103.0
		Epoch           2457417.106
		ArgOfPericenter 192.5
		MeanAnomaly     0
	}
}

Star "HD 90089 Ab"
{
	ParentBody      "HD 90089 A"
	Class           "WD" // DR2-HIP: large dmu(A), WD companion? DR3: RUWE(A,B) = 9.9, 1.3.
	MassSol         0.24
}

// Object HD 90089B  ---  High Proper Motion Star  ---  OID=@15596224   (@@-1,255)  ---  coobox=3096 
// Object types: High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Star 
Star "HD 90089 B/Gaia DR3 1146337324038513536/TIC 367631380/Gaia DR2 1146337324038513536/2MASS J10311162+8233321/** GAT 14B/WDS J10311+8234B"
{
	ParentBody      "HD 90089"
	Class           "M0"
	MassSol         0.285660845598725 // log(g) = 4.898 cm/s^2
	RadSol          0.31475 // Gaia DR3
	LumBol          0.008922213642489732 // 计算的值
	Teff            3162
	FeH             -0.001
}