// Stars of Theta2 Orionis sextuple system
// Wikipedia: https://en.wikipedia.org/wiki/Theta2_Orionis
// NOIRLab:
// [A]http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=26235
// [C]http://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HD&number=37062
// Aab = CHARA 249, cf. 2000AJ.119.3084: 0.379" PA=112d.

// ----------A's components---------- //

Barycenter "HIP 26235 A"
{
	ParentBody "HIP 26235"
	BinaryOrbit
	{
		Period          355.62
		Separation      164.393
	}
}

// VLTI/Gravity resolves Aa1,Aa2 at 1.3 mas, flux ratio 0.52 in K.
Star "HIP 26235 Aa"
{
	ParentBody "HIP 26235 A"
	Class      "O9.5IVp"
	MassSol    39
	Luminosity 107000
  Teff       34900

	Orbit // SB9_342 2001Obs...121....1S
	{
		PeriodDays      20.9643
		Epoch           2443997.465
		Eccentricity    0.231
		ArgOfPericenter 356
		MeanAnomaly     0
	}
}

Star "HIP 26235 Ab"
{
	ParentBody "HIP 26235 A"
	Class      "B0.7V"
	MassSol    12.6

	Orbit
	{
		PeriodDays      20.9643
		Epoch           2443997.465
		Eccentricity    0.231
		ArgOfPericenter 176
		MeanAnomaly     0
	}
}

Star "HIP 26235 Ac"
{
	ParentBody "HIP 26235"
	Class      "B5V"
  MassSol    3.26

	/* BinaryOrbit
	{
		Period          355.62
		Separation      164.393
	} */
}

// ----------C's components---------- //
// NOIRLab说Ca还有一颗伴星Ca2，轨道周期大概13天，但不知道这颗恒星的数据，存疑。
Star "HD 37062 Ca"
{
	ParentBody "HD 37062"
	Class      "B4V"
  MassSol    4.86
  Oblateness 0
  Luminosity 616
  Teff       13800
  Age        0.001

	BinaryOrbit
	{
		Period          26.016
		//Separation      16.3182
	}
}

Star "HD 37062 Cb"
{
	ParentBody "HD 37062"
	Class      ""
	MassSol    1.7

  /* BinaryOrbit
	{
		Period          26.016
		//Separation      16.3182
	} */
}
