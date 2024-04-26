// 皎月落枝，南天龙吟。
// 灿阳一瞬，不动岩心。

// ExoPlanets for TAU Cet

Remove "Tau Cet e"{ParentBody "Tau Cet"}
Remove "Tau Cet f"{ParentBody "Tau Cet"}
Remove "Tau Cet g"{ParentBody "Tau Cet"}
Remove "Tau Cet h"{ParentBody "Tau Cet"}

// MC GalaxySpace Mod style planets(Realistic planets with procedural data)
Planet	"TAU Cet b"
{
	ParentBody     "TAU Cet A"
  DiscDate       "2012"
	Class	         "Terra"
	Mass            2

	Surface
	{
		SurfStyle       0.0276218
		OceanStyle      0.350838
		Randomize      (0.596, -0.132, 0.072)
		colorDistMagn   0.0512828
		colorDistFreq   201.979
		detailScale     3799.74
		colorConversion true
		drivenDarkening 0
		seaLevel        0.218352
		snowLevel       2
		tropicLatitude  0.0297198
		icecapLatitude  10
		icecapHeight    0.109571
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.68584
		venusFreq       0.823212
		venusMagn       0
		mareFreq        0.700187
		mareDensity     0.00624404
		terraceProb     0.262555
		erosion         0
		montesMagn      0.0651357
		montesFreq      67.1928
		montesSpiky     0.980007
		montesFraction  0.274676
		dunesMagn       0.0221397
		dunesFreq       1937.93
		dunesFraction   0.914589
		hillsMagn       0.1115
		hillsFreq       181.309
		hillsFraction   0.246524
		hills2Fraction  0
		riversMagn      64.0589
		riversFreq      1.97291
		riversSin       6.43119
		riversOctaves   0
		canyonsMagn     0.639804
		canyonsFreq     0.635571
		canyonFraction  0.960931
		cracksMagn      0.0778663
		cracksFreq      0.578253
		cracksOctaves   0
		craterMagn      0.583064
		craterFreq      3.88302
		craterDensity   0.72358
		craterOctaves   9.20058
		craterRayedFactor 0.14951
		volcanoMagn     0.185144
		volcanoFreq     0.77131
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.322005
		volcanoRadius   0.145766
		volcanoTemp     1599.27
		lavaCoverTidal  0.0847807
		lavaCoverSun    0.0969788
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Orbit
	{
		SemiMajorAxis   0.105
		PeriodDays      13.965
		Eccentricity    0.16
	}
}

Planet	"TAU Cet g"
{
	ParentBody     "TAU Cet A"
	Class	         "Terra"
  DiscMethod     "RadVel"
  DiscDate       "2017"
	Mass            1.75

  Orbit
	{
		SemiMajorAxis   0.133
		PeriodDays      20
		Eccentricity    0.06
	}
}

Planet	"TAU Cet c"
{
	ParentBody     "TAU Cet A"
  DiscDate       "2012"
	Class	         "Terra"
	Mass            3.1

	Surface
	{
		SurfStyle       0.36193
		OceanStyle      0.985014
		Randomize      (-0.843, 0.315, 0.108)
		colorDistMagn   0.0522219
		colorDistFreq   393.329
		detailScale     7424.68
		colorConversion true
		drivenDarkening 0
		seaLevel        0.187387
		snowLevel       2
		tropicLatitude  0.0449119
		icecapLatitude  10
		icecapHeight    0.210508
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.90041
		venusFreq       1.03093
		venusMagn       0
		mareFreq        1.71358
		mareDensity     0.0114228
		terraceProb     0.360977
		erosion         0
		montesMagn      0.153387
		montesFreq      134.332
		montesSpiky     0.970866
		montesFraction  0.0911883
		dunesMagn       0.0363885
		dunesFreq       3839.1
		dunesFraction   0.519303
		hillsMagn       0.11454
		hillsFreq       281.342
		hillsFraction   0.705978
		hills2Fraction  0
		riversMagn      55.1206
		riversFreq      3.26608
		riversSin       6.08589
		riversOctaves   0
		canyonsMagn     0.417484
		canyonsFreq     0.978166
		canyonFraction  0.479015
		cracksMagn      0.053195
		cracksFreq      0.762351
		cracksOctaves   0
		craterMagn      0.629796
		craterFreq      7.69154
		craterDensity   0.98673
		craterOctaves   11.9412
		craterRayedFactor 0.114392
		volcanoMagn     0.636537
		volcanoFreq     0.690032
		volcanoDensity  0.196358
		volcanoOctaves  3
		volcanoActivity 0.148395
		volcanoFlows    0.44053
		volcanoRadius   0.472394
		volcanoTemp     1326.7
		lavaCoverTidal  0
		lavaCoverSun    0.00544462
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		SpecularPower   55
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Atmosphere
	{
		Model          "Ethereal"
		Height          142.843
		Density         3.48597e-008
		Pressure        1.93578e-008
    Greenhouse      0
		Bright          0.511052
		Opacity         0
		SkyLight        0.170351
		Hue             0.0422146
		Saturation      1

		Composition
		{
			Xe    	100
		}
	}

	Orbit
	{
		SemiMajorAxis   0.195
		PeriodDays      35.362
		Eccentricity    0.03
	}
}

Planet	"TAU Cet h"
{
	ParentBody     "TAU Cet A"
  DiscMethod     "RadVel"
  DiscDate       "2017"
	Class	         "Terra"
	Mass            1.83

  Orbit
	{
		SemiMajorAxis   0.243
		PeriodDays      49.41
		Eccentricity    0.23
	}
}

Planet	"TAU Cet d"
{
	ParentBody     "TAU Cet A"
  DiscDate       "2012"
	Class	         "Terra"
	Mass            3.6

	Surface
	{
		SurfStyle       0.920244
		OceanStyle      0.992484
		Randomize      (0.892, 0.381, -0.645)
		colorDistMagn   0.0742595
		colorDistFreq   509.013
		detailScale     9610.23
		colorConversion true
		seaLevel        0.0969561
		snowLevel       2
		tropicLatitude  0.0594459
		icecapLatitude  10
		icecapHeight    0.192243
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.686157
		venusFreq       1.44203
		venusMagn       0.409941
		mareFreq        2.10322
		mareDensity     0.143826
		terraceProb     0.433831
		erosion         0
		montesMagn      0.175233
		montesFreq      233.093
		montesSpiky     0.967875
		montesFraction  0.274671
		dunesMagn       0.0555229
		dunesFreq       41.1545
		dunesFraction   0.201636
		hillsMagn       0.150798
		hillsFreq       292.116
		hillsFraction   0
		hills2Fraction  0
		riversMagn      58.0695
		riversFreq      3.58992
		riversSin       4.91241
		riversOctaves   0
		canyonsMagn     0.0421134
		canyonsFreq     98.6111
		canyonFraction  0
		cracksMagn      0.0953002
		cracksFreq      0.32141
		cracksOctaves   0
		craterMagn      0.583981
		craterFreq      14.0443
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.649683
		volcanoFreq     0.613293
		volcanoDensity  0.268705
		volcanoOctaves  3
		volcanoActivity 0.336671
		volcanoFlows    0.740262
		volcanoRadius   0.501543
		volcanoTemp     1494.19
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     1
		stripeTwist     3.5
		cycloneMagn     0.985302
		cycloneDensity  0.398214
		cycloneOctaves  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          15.0723
		Velocity        121.86
		BumpHeight      5.07219
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.959209
		mainOctaves     10
		Coverage        0.230392
		stripeZones     1
		stripeTwist     3.5
    TidalLocked     true
	}

	Clouds
	{
		Height          20.1443
		Velocity        165.21
		BumpHeight      5.07219
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.959209
		mainOctaves     10
		Coverage        0.230392
		stripeZones     1
		stripeTwist     3.5
	}

	Atmosphere
	{
		Model          "Neptune"
		Height          141.951
		Density         1.81968
		Pressure        2.40569
		Greenhouse      11.5934
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0460834
		Saturation      0.996495

		Composition
		{
			CO2   	98.401
			SO2   	1.59423
			N2    	0.00349989
			CO    	0.00123331
			Ar    	3.32114e-005
		}
	}

  Aurora{}

	Orbit
	{
		SemiMajorAxis   0.374
		PeriodDays      94.11
		Eccentricity    0.08
	}
}

Planet	"TAU Cet e"
{
	ParentBody     "TAU Cet A"
  DiscDate       "2012"
	Class	         "Aquaria"
	Mass            3.93
  RotationPeriod  30

  Life
  {
    Class "Organic"
    Type  "Multicellular"
    Biome "Marine"
  }

	Surface
	{
		SurfStyle       0.288629
		OceanStyle      0.865505
		Randomize      (-0.659, 0.294, 0.173)
		colorDistMagn   0.0556637
		colorDistFreq   655.253
		detailScale     15435.8
		colorConversion true
		seaLevel        0.0989251
		snowLevel       2
		tropicLatitude  0.00682717
		icecapLatitude  10
		icecapHeight    0.215329
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.40547
		venusFreq       1.18422
		venusMagn       0
		mareFreq        2.2237
		mareDensity     0.206233
		terraceProb     0.170947
		erosion         0
		montesMagn      0.192422
		montesFreq      325.504
		montesSpiky     0.937332
		montesFraction  0.35646
		dunesMagn       0.0470833
		dunesFreq       60.3132
		dunesFraction   0.701174
		hillsMagn       0.146628
		hillsFreq       679.669
		hillsFraction   0
		hills2Fraction  0
		riversMagn      64.4205
		riversFreq      3.43946
		riversSin       5.82369
		riversOctaves   0
		canyonsMagn     0.0427203
		canyonsFreq     154.3
		canyonFraction  0
		cracksMagn      0.10604
		cracksFreq      0.350342
		cracksOctaves   0
		craterMagn      0.780705
		craterFreq      10.8861
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.699078
		volcanoFreq     0.620918
		volcanoDensity  0.4
		volcanoOctaves  3
		volcanoActivity 2
		volcanoFlows    0.846981
		volcanoRadius   0.50459
		volcanoTemp     1622.08
		lavaCoverTidal  0.298578
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.14058
		stripeTwist     0
		cycloneMagn     2.26671
		cycloneFreq     1.11478
		cycloneDensity  0.355038
		cycloneOctaves  4
		BumpHeight      16.278
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

  Ocean
  {
    Height          60
    Composition
    {
      H2O      100
    }
  }

	Clouds
	{
		Height          13.5869
		Velocity        79.1085
		BumpHeight      5.44784
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.946484
		mainOctaves     10
		Coverage        0.308491
		stripeZones     2.14058
		stripeTwist     0
	}

	Clouds
	{
		Height          19.0347
		Velocity        118.876
		BumpHeight      5.44784
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.946484
		mainOctaves     10
		Coverage        0.308491
		stripeZones     2.14058
		stripeTwist     0
	}

	Clouds
	{
		Height          24.4824
		Velocity        77.1549
		BumpHeight      5.44784
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.946484
		mainOctaves     10
		Coverage        0.308491
		stripeZones     2.14058
		stripeTwist     0
	}

	Atmosphere
	{
		Model          "Neptune"
		Height          106.086
		Density         4.80007
		Pressure        7.7726
		Greenhouse      17.5462
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0343814
		Saturation      0.685551

		Composition
		{
			N2    	62.5452
			O2    	29.3848
			H2O   	8.02451
			CO2    	0.0434562
			Xe    	0.0017202
			Ar    	0.000314199
			Ne    	8.75619e-005
		}
	}

  Orbit
	{
		SemiMajorAxis   0.538
		PeriodDays      168.87
		Eccentricity    0.18
	}
}

Planet	"TAU Cet f"
{
	ParentBody     "TAU Cet A"
  DiscDate       "2012"
	Class	         "IceGiant" // super-Earth or mini-Neptune
	Mass            3.93
  Oblateness      0

	Surface
	{
		SurfStyle       0.30595
		Randomize      (-0.301, -0.749, 0.931)
		detailScale     200215
		colorConversion true
		tropicLatitude  0.0366166
		icecapLatitude  0.936617
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     5.87369
		stripeFluct     0.373163
		stripeTwist     9.95162
		cycloneMagn     13.4665
		cycloneFreq     0.795295
		cycloneDensity  0.363539
		cycloneOctaves  5
		BumpHeight      6.62037
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
		ModulateColor  (0.000 0.000 0.000 0.000)
	}

	Clouds
	{
		Height          27.9531
		Velocity        -868.032
		BumpHeight      21.3292
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.01531
		mainOctaves     12
		Coverage        0.0521033
		stripeZones     5.87369
		stripeFluct     0.373163
		stripeTwist     9.95162
	}

	Atmosphere
	{
		Model          "Neptune"
		Height          113.266
		Density         5387.86
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.00917884
		Saturation      0.636603

		Composition
		{
			H2    	92.7975
			He    	6.83199
			CH4   	0.2886
			N2    	0.0354411
			NH3   	0.0300322
			O2    	0.00883535
			C2H2  	0.00346318
			C2H4  	0.00121823
			Ne    	0.00103676
			Ar    	0.000857074
			C2H6  	0.000689805
			C3H8  	0.000341959
		}
	}

	Orbit
	{
		SemiMajorAxis   1.334
		PeriodDays      636.13
		Eccentricity    0.16
	}
}

Planet	"TAU Cet i"
{
	ParentBody     "TAU Cet A"
  DiscDate       "2019"
	Class	         "GasGiant"
	Mass            1589.1419
  Oblateness      0

  Orbit
	{
		SemiMajorAxis   3 // 20
	}
}
