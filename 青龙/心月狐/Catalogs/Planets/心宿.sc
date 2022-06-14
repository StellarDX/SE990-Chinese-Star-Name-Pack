// 心宿一(bC****)
Remove "SIG Sco (ACB)"{ParentBody "Al Niyat"}
Remove "SIG Sco (AC)"{ParentBody "SIG Sco (ACB)"}
Remove "Al Niyat Aa"{ParentBody "SIG Sco (AC)"}
Remove "SIG Sco Ab"{ParentBody "SIG Sco (AC)"}
Remove "SIG Sco C"{ParentBody "SIG Sco (ACB)"}
Remove "SIG Sco B"{ParentBody "Al Niyat"}
Barycenter "HIP 80112 Aab"
{
	ParentBody "HIP 80112"

	BinaryOrbit
	{
		Separation      4500
	}
}

Barycenter "HIP 80112 Aa"
{
	ParentBody "HIP 80112 Aab"
	Orbit
	{
		Period          100
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 80112 Aa1"
{
	ParentBody "HIP 80112 Aa"
	Class      "B1III"
	MassSol    18.4 // 17.2 // 18
	RadSol     12.7
	Luminosity 2.9E+4 // 95500
	Teff       26150 // 27700
	FeH        -0.2
	Age        0.008

	Orbit
	{
		PeriodDays      33.01
		Eccentricity    0.322
		Inclination     158.2
		AscendingNode   104
		Epoch           2434889.5
		ArgOfPericenter 103
		MeanAnomaly     0
	}
}

Star "HIP 80112 Aa2"
{
	ParentBody "HIP 80112 Aa"
	Class      "B1V"
	MassSol    11.9
	RadSol     11
	Luminosity 1.6E+4

	Orbit
	{
		PeriodDays      33.01
		Eccentricity    0.322
		Inclination     158.2
		AscendingNode   104
		Epoch           2434889.5
		ArgOfPericenter 283
		MeanAnomaly     0
	}
}

Star "HIP 80112 Ab"
{
	ParentBody "HIP 80112 Aab"
	Class      "B"

	Orbit
	{
		Period          100
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 80112 B"
{
	ParentBody "HIP 80112"
	Class      "B9"
	MassSol    2.9

	/*BinaryOrbit
	{
		Separation      4500
	}*/
}

// 心宿二(RSG**)
Remove "Antares A"{ParentBody "Antares"}
Remove "Antares B"{ParentBody "Antares"}
Star "HIP 80763 A"
{
	ParentBody "HIP 80763"
	Class      "M1.5Iab"
	MassSol    11 // 14.3
	RadSol     680 // 800
	Luminosity 75900
	Teff       3660
	Age        0.015
	Oblateness 0

	Surface // 汝可识得此阵?
	{
		SurfStyle       0.96468
		Randomize      (0.180, 0.362, -0.767)
		colorDistMagn   1
		colorDistFreq   0.05783
		detailScale     32768
		tropicLatitude  1
		icecapLatitude  1.2
		mareFreq        0
		mareDensity     0
		erosion         0.0125
		montesMagn      0.1
		montesFreq      0
		dunesMagn       5
		hillsMagn       1
		hillsFreq       0.25966
		canyonsMagn     5
		cracksOctaves   15
		BumpHeight      4.7308e+07
		BumpOffset      4.7308e+07
		SpecBrightWater 0
		SpecBrightIce   0
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Orbit
	{
		Period          1218 // 880 // 2562
		//SemiMajorAxis   529 // +220?
		Eccentricity    0.0786
		Inclination     80.75
		AscendingNode   90.99
		ArgOfPericenter 0.01
		Epoch           2186258.167158
		MeanAnomaly     0
	}
}

Star "HIP 80763 B"
{
	ParentBody "HIP 80763"
	Class      "B2 V"
	MassSol    7.2
	RadSol     5.2
	Luminosity 2754
	Teff       18500

	Orbit
	{
		Period          1218 // 880 // 2562
		//SemiMajorAxis   529 // +220?
		Eccentricity    0.0786
		Inclination     80.75
		AscendingNode   90.99
		ArgOfPericenter 180.01
		Epoch           2186258.167158
		MeanAnomaly     0
	}
}

// 积卒二(***)
Remove "ETA Lup (AB)"{ParentBody "ETA Lup"}
Remove "ETA Lup A"{ParentBody "ETA Lup (AB)"}
Remove "ETA Lup B"{ParentBody "ETA Lup (AB)"}
Remove "ETA Lup C"{ParentBody "ETA Lup"}
Barycenter "HIP 78384 AB"
{
  ParentBody "HIP 78384"
  BinaryOrbit
  {
    Period          500000
		Epoch           2454101.22878957
    ArgOfPericenter 68
    MeanAnomaly     0
  }
}

Star "HIP 78384 A"
{
  ParentBody "HIP 78384 AB"
  Class      "B2IV"
  MassSol    7
	RadSol     6.7
	Luminosity 1729
	Teff       14668
	Age        0.0398

  Orbit
  {
    Period          27000
		Epoch           2456292.68198225
    ArgOfPericenter 199
    MeanAnomaly     0
  }
}

Star "HIP 78384 B"
{
  ParentBody "HIP 78384 AB"
  Class      "A5Vp"
  MassSol    2.1

  Orbit
  {
    Period          27000
		Epoch           2456292.68198225
    ArgOfPericenter 19
    MeanAnomaly     0
  }
}

Star "HIP 78384 C"
{
  ParentBody "HIP 78384"
  Class      "F5V"
	MassSol    1.29

  /* Orbit
  {
    Period          500000
		Epoch           2454101.22878957
    ArgOfPericenter 248
    MeanAnomaly     0
  } */
}
