// Object * 39 Com A  ---  Double or Multiple Star  ---  OID=@8453672   (@@-1,255)  ---  coobox=13893 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=63948
Barycenter "39 Com A/Gaia DR3 3943394845252502144/** COU 11A/WDS J13064+2109A/WDS J13064+2109Aa,Ab/HD 113848A/BD+21 2487A/** CHR 150/TYC 1456-847-1/CCDM J13064+2109AP/Gaia DR2 3943394845252502144"
{
	ParentBody      "39 Com"
	BinaryOrbit     
	{
		Period          430.941
		Separation      81.8141057041129 // 1.66 asec
	}
}

Star "39 Com Aa"
{
	DateUpdated     "2024-05-05"
	ParentBody      "39 Com A"
	Parallax        20.2899
	AppMagn         6.057
	Class           "F4V"
	AbsMagn         2.59 // 计算的值
	MassKg          2.58018235953681e+30 // log(g) = 3.913 cm/s^2
	RadSol          2.085 // Gaia DR3
	LumBol          7.44510772398509 // 计算的值
	Teff            6603
	FeH             -0.445

	BinaryOrbit     
	{
		Period          12.715
		Separation      7.54195413977404 // 0.153 asec
	}
}

Star "39 Com Ab"
{
	ParentBody      "39 Com A"
	Class           ""
	MassSol         1.35
}

// Object * 39 Com B  ---  High Proper Motion Star  ---  OID=@6555662   (@@-1,255)  ---  coobox=13893 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "39 Com B/Gaia DR3 3943394849541966848/TYC 1456-847-2/** COU 11B/CCDM J13064+2109B/WDS J13064+2109B/HD 113848B/BD+21 2487B/Gaia DR2 3943394849541966848"
{
	ParentBody      "39 Com"
	Class           ""
	MassSol         0.94
}
