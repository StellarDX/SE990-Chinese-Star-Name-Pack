// 张宿二(SB**)
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
  Class      "G3.7 V"	//unknown, spectroscopic binary

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
		PeriodDays      1200
		Eccentricity    0.1
		Epoch           2420760
		ArgOfPericenter 90
		MeanAnomaly     0
    //SemiAmplitude   4
	}
}

Star	"HIP 52085 B"
{
	ParentBody     "HIP 52085"
	Class	         "G8.1 V"

	Orbit
	{
    PeriodDays      1200
		Eccentricity    0.1
		Epoch           2420760
		ArgOfPericenter 270
		MeanAnomaly     0
	}
}
