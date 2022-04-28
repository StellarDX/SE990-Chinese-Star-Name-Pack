// 张宿二
Remove "LAM Hya A"{ParentBody "LAM Hya"}
Remove "LAM Hya B"{ParentBody "LAM Hya"}
Star "HIP 49841 1"
{
  ParentBody "HIP 49841"
  Class      "K0IIIbCN0.5"
  MassSol    2
  RadSol     9.7
  Luminosity 39.8
  Teff       4656
  FeH        0.25

  Orbit
  {
    PeriodDays      1585.8
    Eccentricity    0.138
    Inclination     79.49
    AscendingNode   249.62
    Epoch           2448664.3906
    ArgOfPericenter 58.9
    MeanAnomaly     0
  }
}

Star "HIP 49841 B"
{
  ParentBody "HIP 49841"
  Class      ""	//unknown, spectroscopic binary
  MassSol    1

  Orbit
  {
    PeriodDays      1585.8
    Eccentricity    0.138
    Inclination     79.49
    AscendingNode   249.62
    Epoch           2448664.3906
    ArgOfPericenter 238.9
    MeanAnomaly     0
  }
}

// 张宿六(*)
Star	"HIP 52085 A"
{
	ParentBody     "HIP 52085"
	Class	         "G8III"
  MassSol        2.04
  RadSol         9
  Luminosity     48
  Teff           4952
  FeH            -0.22
  Age            1.17

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0312973
		Eccentricity    0
		Inclination     51.1718
		AscendingNode   -136.278
		ArgOfPericenter 13.4422
		MeanAnomaly     -44.6813
	}
}

Star	"HIP 52085 B"
{
	ParentBody     "HIP 52085"
	Class	         "G8.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0312973
		Eccentricity    0
		Inclination     51.1718
		AscendingNode   -136.278
		ArgOfPericenter 193.442
		MeanAnomaly     -44.6813
	}
}
