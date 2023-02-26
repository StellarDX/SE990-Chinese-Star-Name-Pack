// 天动万象，山海化形。
// 荒地生星，璨若烈阳。

// ExoPlanets for ALF Cen
// Avatar style planets
// Reference: http://www.openexoplanetcatalogue.com/planet/Alpha%20Centauri%20B%20b/

// 南门二A

Planet "Polyphemus/Coeus/Candidate 1/ALF Cen Ab(?)"
{
  DiscDate       "2021" // 2021, K. Wagner, et al.
	DiscMethod     "Imaging" // Direct imaging
	ParentBody     "ALF1 Cen"
	Class          "GasGiant"
	Mass            50 // 20
  Radius          44646.959 // 3.3(21047.8521 Km) - 7 REarth
  Oblateness      0

  Surface
	{
		Preset         "jupiter_frigid_uranus.cfg"
		Randomize      (-0.606, -0.908, -0.274)
		cycloneMagn     10
		cycloneFreq     2
		cycloneDensity  0.2
		cycloneOctaves  3
	}

	Clouds
	{
		Height          484.51
		Velocity        -844.35
		BumpHeight      37.943
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        1.25
		mainOctaves     12
		Coverage        0.6
		stripeZones     2.5
		stripeFluct     0.45
		stripeTwist     1.8
	}

	Atmosphere
	{
		Model          "Neptune"
		Height          1181.5
		Density         3255.7
		Pressure        4.5099e+05
		Bright          8
		Opacity         0.5
		SkyLight        3.3
		Hue             0
		Saturation      1

		Composition
		{
			H2        	88.931
			He        	7.6447
			CH4       	2.531
			C3H8      	0.25783
			C2H2      	0.22513
			C8H18     	0.19891
			C2H4      	0.085032
			C2H6      	0.044819
			N2        	0.043974
			NH3       	0.02772
			O2        	0.0075036
			Ne        	0.0014242
			Ar        	0.00091941
			CO2       	0.0001184
			H2S       	1.8528e-06
			H2O       	1.558e-06
			Kr        	4.6834e-07
			Xe        	4.6072e-08
			CO        	2.3539e-08
			SO2       	9.5595e-09
			Cl2       	3.8027e-10
		}
	}

	Rings
	{
		InnerRadius     67082
		OuterRadius     1.2016e+05
	}

	Orbit
	{
	  PeriodDays      360
		SemiMajorAxis   1.1
    Inclination     70
		MeanAnomaly     0
	}
}

// Home of Na'vis
Moon "Pandora(Avatar)/ALF Cen Ab V"
{
  DiscDate       "2050"
	ParentBody     "Polyphemus"
	Class          "Terra"
	Mass            0.72
  Radius          5723.5
  Oblateness      0

  Life
  {
  	Class   "Organic"
  	Type    "Multicellular"
  	Biome   "Marine/Terrestrial/Aerial"
  }

  Surface
	{
		Preset         "terra_wet_earth_green.cfg"
		SurfStyle       0.11766
		Randomize      (-0.096, 0.344, -0.700)
		colorDistMagn   0.055857
		colorDistFreq   788.51
		detailScale     16384
		seaLevel        0.2
		snowLevel       0.85
		tropicLatitude  0.81344
		icecapLatitude  0.97636
		icecapHeight    0.0049506
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin 0.3125
		climateSteppeMax 0.5625
		climateForestMin 0.5
		climateForestMax 0.6875
		climateGrassMin  0.625
		climateGrassMax  0.8125
		humidity        0.93669
		heightTempGrad  0.625
		beachWidth      0.0014598
		tropicWidth     0.07
		mainFreq        0.47166
		venusFreq       1.3911
		venusMagn       0.41985
		mareFreq        3.1238
		mareDensity     0
		terraceProb     0.11552
		erosion         0.43511
		montesMagn      0.3
		montesFreq      1000
		montesSpiky     0.83721
		montesFraction  0.11766
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1.0465
		stripeTwist     0.21367
		cycloneMagn     1.6894
		cycloneFreq     0.56985
		cycloneDensity  0.39997
		cycloneOctaves  4
	}

  Ocean
	{
		Depth           4
    Composition
    {
      H2O        100
    }
	}

  Clouds
  {
    Height          10.382
    Velocity        110.44
    BumpHeight      2.1909
    mainFreq        0.78909
    mainOctaves     10
    Coverage        0.35
    stripeZones     1.0465
    stripeTwist     0.21367
  }

  Atmosphere
  {
  	Model          "Earth"
  	Height          52.354
  	Density         1.55148 // 1.2 * Earth's
    Pressure        0.9
		Greenhouse      2.9971
		Bright          5
		Opacity         0.5
		SkyLight        3
		Hue             0
		Saturation      1

  	Composition
  	{
  		 N2        	44.5
       O2         30
       CO2        18
       Xe         5.5
       CH4        1
       H2S        1
  	}
  }

	Orbit
	{
		SemiMajorAxisKm 300000 // ?
    Eccentricity    0
		MeanAnomaly     0
	}
}

// 南门二B
Planet "Vulcan/ALF Cen Bb(?)"
{
  DiscDate       "2012"
	DiscMethod     "RadVel"
	ParentBody     "ALF2 Cen"
	Class          "Terra"
	Mass            1.13 // Earth-sized

	Orbit
	{
	  PeriodDays      3.2357
		SemiMajorAxis   0.04
    Eccentricity    0
		MeanAnomaly     0
	}
}

Planet "Hermes/ALF Cen Bc"
{
  DiscDate       "2015"
	DiscMethod     "Transit"
	ParentBody     "ALF2 Cen"
	Radius          5867.88604 // 0.92 REarth

	Orbit
	{
	  PeriodDays      12.4 // 20.4
		Eccentricity    0.24
		MeanAnomaly     0
	}
}

// 比邻星

Remove "Proxima b"{ParentBody "Proxima"}
Remove "Proxima c"{ParentBody "Proxima"}
Remove "Proxima d"{ParentBody "Proxima"}

Planet	"Proxima Cen b"
{
  DiscDate       "2016" // 2016.08.24, Anglada-Escudé et al., ESO
  DiscMethod     "RadVel" // Doppler spectroscopy
	ParentBody     "ALF Cen C"
	Class          "Terra"
	Mass            1.07
	Radius          8291.5781 // 1.3 REarth

  Life // The three body
  {
  	Class   "Organic"
  	Type    "Multicellular"
  	Biome   "Terrestrial"
  }

  Surface
	{
		Preset         "terra_wet_earth2mars_black.cfg"
		SurfStyle       0.1961
		Randomize      (0.975, 0.541, 0.654)
		colorDistMagn   0.070877
		colorDistFreq   1125.9
		detailScale     32768
		seaLevel        0.43276
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  0.56608
		icecapHeight    0.061182
		humidity        0.95
		heightTempGrad  0.625
		beachWidth      0.0006568
		tropicWidth     0.07
		mainFreq        1.1647
		venusFreq       0.57641
		venusMagn       0.55288
		mareFreq        5.3483
		mareDensity     0
		terraceProb     0.18415
		erosion         0.11916
		montesMagn      0.26126
		montesFreq      272.72
		montesSpiky     0.9021
		montesFraction  0.80057
		dunesMagn       0.050501
		dunesFreq       76.387
		dunesFraction   0.48264
		hillsMagn       0.12222
		hillsFreq       1101.8
		hillsFraction   0.38476
		hills2Fraction  0.86212
		riversMagn      56.792
		riversFreq      3.0733
		riversSin       6.1354
		riftsMagn       0
		riftsFreq       3.9985
		riftsSin        6.9204
		canyonsMagn     0.034479
		canyonsFreq     219.05
		canyonsFraction 0.029899
		cracksMagn      0.11172
		cracksFreq      0.84331
		cracksOctaves   0
		craterMagn      0.6176
		craterFreq      22.721
		craterDensity   0.032232
		craterOctaves   6
		volcanoMagn     0.67447
		volcanoFreq     0.62841
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.45659
		volcanoRadius   0.48266
		volcanoTemp     321.21
		lavaCoverTidal  0.39185
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		BumpOffset      8.6553
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecPowerWater  55
		SpecPowerIce    180
		SpecularScale   1
		RoughnessBias   0.5
		Hapke           0.7
		SpotBright      2.1406
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Ocean
	{
		Height          8.6553
    Composition
    {
      H2O         100
    }
	}

  Clouds
	{
		Height          9
		Velocity        134.36
		BumpHeight      6.6835
		mainFreq        0.7591
		mainOctaves     10
		Coverage        0.1
		stripeZones     1
		stripeTwist     3.5
	}

  Atmosphere
	{
		Model          "Thin"
		Height          47.36
		Density         0.095698
		Pressure        0.048119
		Greenhouse      0.92026
		Bright          8.639
		Opacity         1
		SkyLight        2.8797
		Hue             0
		Saturation      1

		Composition
		{
			N2        	77.773
			O2        	20.862
			Ar        	0.9303
			H2O       	0.4
			CO2       	0.0398
			Ne        	0.00182
			He        	0.00046
			CH4       	0.00017
			Kr        	0.000114
			H2        	5e-05
			Xe        	8.7e-06
		}
	}

	Orbit
	{
		PeriodDays      11.1868
		SemiMajorAxis   0.04857
    Eccentricity    0.109
		ArgOfPericenter 310
		MeanAnomaly     0
	}
}

Planet	"Proxima Cen c"
{
  DiscDate       "2020" // 2020.01, Damasso et al., HARPS
  DiscMethod     "RadVel" // Radial velocity
	ParentBody     "ALF Cen C"
	Class          "IceGiant" // super-Earth or mini-Neptune
	Mass            7

	Orbit
	{
		PeriodDays      1928
		SemiMajorAxis   1.489
    Eccentricity    0.04
    Inclination     133
    AscendingNode   331
		LongOfPericen   -4
    Epoch           2456202
		MeanAnomaly     0
	}
}

Planet	"Proxima Cen d"
{
  DiscDate       "2020" // 2020, VLT-ESPRESSO
  DiscMethod     "RadVel" // Radial velocity
	ParentBody     "ALF Cen C"
	Class          "Terra" // sub-Earth
	Mass            0.26
  Radius          5166.29097 // 0.81 REarth

	Orbit
	{
		PeriodDays      5.122
		SemiMajorAxis   0.02885
    Eccentricity    0.04
		MeanAnomaly     0
	}
}
