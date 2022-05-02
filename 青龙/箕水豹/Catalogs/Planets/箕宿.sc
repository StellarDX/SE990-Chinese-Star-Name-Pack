// 箕宿二(**)
Star	"HIP 89931 A"
{
	ParentBody     "HIP 89931"
	Class          "K3III" // Barium star
	MassSol        3.21
	RadSol         16
	Teff           4203
	FeH            -0.32
	Age            0.26

	Orbit
	{
		RefPlane        "Equator"
		Period          0.333591357
		Eccentricity    0
		Inclination     2.03774697
		AscendingNode   0
		ArgOfPericenter -81.3818179
		MeanAnomaly     -8.39060174
	}
}

Star	"HIP 89931 B"
{
	ParentBody     "HIP 89931"
	Class          "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.333591357
		Eccentricity    0
		Inclination     2.03774697
		AscendingNode   0
		ArgOfPericenter 98.6181821
		MeanAnomaly     -8.39060174
	}
}

// 箕宿三(PM**)
Remove "Kaus Australis A"{ParentBody "Kaus Australis"}
Remove "Kaus Australis B"{ParentBody "Kaus Australis"}
Star "HIP 90185 A"
{
	ParentBody "HIP 90185"
	Class      "B9.5III"
	MassSol    3.515
  RadSol     6.8
  Luminosity 363
  Teff       9960
  Age        0.232

	BinaryOrbit
	{
		Separation      106
	}
}

Star "HIP 90185 B"
{
	ParentBody "HIP 90185"
	Class      ""
	MassSol    0.95
  Luminosity 0.89
  Teff       5807

	BinaryOrbit
	{
		Separation      106
	}
}

// 箕宿四(LP**)
Remove "ETA Sgr A"{ParentBody "ETA Sgr"}
Remove "ETA Sgr B"{ParentBody "ETA Sgr"}
Star "HIP 89642 A"
{
	ParentBody "HIP 89642"
	Class      "M2III"
	RadSol     57

	Orbit
	{
		Period          1270
		ArgOfPericenter 288
		MeanAnomaly     0
	}
}

Star "HIP 89642 B"
{
	ParentBody "HIP 89642"
	Class      "F7 V"

	Orbit
	{
		Period          1270
		ArgOfPericenter 108
		MeanAnomaly     0
	}
}
