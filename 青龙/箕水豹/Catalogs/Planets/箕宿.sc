//箕宿三
Remove "Kaus Australis A"{ParentBody "Kaus Australis"}
Remove "Kaus Australis B"{ParentBody "Kaus Australis"}
Star "HIP 90185 A"
{
	ParentBody "HIP 90185"
	Class      "B9.5 III"
	MassSol    3.515
  RadSol     6.8
  Luminosity 363
  Teff       9960
  Age        0.232

	Orbit
	{
		Period          509.07
		//SemiMajorAxis   22.32
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 90185 B"
{
	ParentBody "HIP 90185"
	Class      ""
	MassSol    0.95
  Luminosity 0.89
  Teff       5807

	Orbit
	{
		Period          509.07
		//SemiMajorAxis   82.6
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}
