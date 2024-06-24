// ExoPlanets for TAU Cet

Remove "Tau Cet e"{ParentBody "Tau Cet"}
Remove "Tau Cet f"{ParentBody "Tau Cet"}
Remove "Tau Cet g"{ParentBody "Tau Cet"}
Remove "Tau Cet h"{ParentBody "Tau Cet"}

// Object * tau Cet  ---  High Proper Motion Star  ---  OID=@1298185   (@@143489,0)  ---  coobox=11021 
// Object types: Rotating Variable,Double or Multiple Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "TAU Cet A"
{
	DateUpdated     "2024-06-24"
	ParentBody      "TAU Cet"
	Class           "G8V"
	AbsMagn         5.69
	AbsMagnBol      5.52
	MassSol         0.783
	RadSol          0.796
	LumBol          0.488
	Luminosity      0.45
	Teff            5320
	FeH             -0.55
	RotationPeriod  1104 // 34 - 46 days
	Obliquity       7
	Age             0.008 // 0.1
}

// Object * tau Cet b  ---  Extra-solar Planet Candidate  ---  OID=@11432965   (@@-1,255)  ---  coobox=11021
// Object types: Star,Extra-solar Planet Candidate
Planet	"TAU Cet b/HD 10700b"
{
	ParentBody     "TAU Cet A"
	DiscDate       "2012"
	Class	       "Terra"
	Mass           2.0

	Oblateness     0
	Color          (0.970, 0.924, 0.888)

	Surface
	{
		Preset          "tau_cet_b.cfg"
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

	NoClouds        true
	NoOcean         true
	NoLava          true
	NoAtmosphere    true
	NoAurora        true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   0.105
		PeriodDays      13.965
		Eccentricity    0.16
		// 生成
		Inclination     0.362985
		AscendingNode   -58.9509
		ArgOfPericenter 4.89036
		MeanAnomaly     64.0459
	}
}

// Object * tau Cet c  ---  Extra-solar Planet Candidate  ---  OID=@11432966   (@@-1,255)  ---  coobox=11021
// Object types: Star,Extra-solar Planet Candidate
Planet	"TAU Cet c/HD 10700c"
{
	ParentBody     "TAU Cet A"
	DiscDate       "2012"
	Class	       "Terra"
	Mass           3.1

	Oblateness     0
	Color          (0.642 0.638 0.635)

	Surface
	{
		Preset          "tau_cet_c.cfg"
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
		Bright          10
		Opacity         0
		SkyLight        0.170351
		Hue             0.0422146
		Saturation      1

		Composition
		{
			Xe    	100
		}
	}

	NoClouds        true
	NoOcean         true
	NoLava          true
	NoAurora        true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   0.195
		PeriodDays      35.362
		Eccentricity    0.03
		// 生成
		Inclination     -1.28906
		AscendingNode   6.37516
		ArgOfPericenter 8.85485
		MeanAnomaly     308.132
	}
}

// Object * tau Cet d  ---  Extra-solar Planet Candidate  ---  OID=@11432967   (@@-1,255)  ---  coobox=11021
// Object types: Star,Extra-solar Planet Candidate
Planet	"TAU Cet d/HD 10700d"
{
	ParentBody     "TAU Cet A"
	DiscDate       "2012"
	Class	       "Terra"
	Mass           3.6

	Oblateness     0
	Color          (0.517 0.511 0.507)

	Surface
	{
		Preset          "tau_cet_d.cfg"
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

	Aurora
	{
		Height      53.4293
		NorthLat    69.352
		NorthLon    179.733
		NorthRadius 1329.65
		NorthWidth  397.681
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -83.7304
		SouthLon    358.661
		SouthRadius 955.886
		SouthWidth  182.447
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoOcean         true
	NoLava          true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   0.374
		PeriodDays      94.11
		Eccentricity    0.08
		// 生成
		Inclination     -1.71527
		AscendingNode   -13.146
		ArgOfPericenter 263.905
		MeanAnomaly     235.747
	}
}

// Object * tau Cet e  ---  Extra-solar Planet  ---  OID=@10611654   (@@-1,255)  ---  coobox=11021
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"TAU Cet e/HD 10700e"
{
	ParentBody     "TAU Cet A"
	DiscDate       "2012"
	Class	       "Terra"
	Mass            3.93
	Radius          11544.42797 // Estimate
	RotationPeriod  30

	Oblateness      0
	Color          (0.510 0.504 0.496)

	Life
	{
		Class "Organic"
		Type  "Multicellular"
		Biome "Marine"
	}

	Surface
	{
		Preset          "tau_cet_e.cfg"
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
		DiffMapAlpha   "Water"
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

	Ocean
	{
		Height          60

		Composition
		{
			H2O      100
		}
	}

	Atmosphere
	{
		Model          "Neptune"
		Height          106.086
		Density         4.80007
		Pressure        7.7726
		Greenhouse      0 // 97.5462
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0343814
		Saturation      0.685551

		Composition
		{
			N2   	62.5452
			O2   	29.3848
			H2O   	8.02451
			CO2    	0.0434562
			Ar    	0.0017202
			He    	0.000314199
			Ne    	8.75619e-005
		}
	}

	NoAurora        true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   0.538
		PeriodDays      168.87
		Eccentricity    0.18
		// 生成
		Inclination     0.272661
		AscendingNode   124.163
		ArgOfPericenter 82.6293
		MeanAnomaly     358.393
	}
}

// Object * tau Cet f  ---  Extra-solar Planet  ---  OID=@11432968   (@@-1,255)  ---  coobox=11021
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"TAU Cet f/HD 10700f"
{
	ParentBody     "TAU Cet A"
	DiscDate       "2012"
	Class	       "Aquaria" // super-Earth or mini-Neptune
	Mass            3.93
	Radius          11544.42797 // Estimate

	// 生成
	RotationPeriod  36
	Obliquity       31.3168
	EqAscendNode    162.122
	Oblateness      0
	Color          (0.611 0.609 0.603)

	Life
	{
		Class "Organic"
		Type  "Multicellular"
		Biome "Marine"
	}

	Surface
	{
		SurfStyle       0.750234
		OceanStyle      0.944421
		Randomize      (0.589, 0.500, -0.182)
		colorDistMagn   0.0524235
		colorDistFreq   1076.48
		detailScale     22357.1
		colorConversion true
		drivenDarkening 0
		seaLevel        0.216438
		snowLevel       2
		tropicLatitude  0.534723
		icecapLatitude  1
		icecapHeight    0.216438
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.76018
		venusFreq       0.747451
		venusMagn       0
		mareFreq        1.62565
		mareDensity     0.0780525
		terraceProb     0.301657
		erosion         0
		montesMagn      0.176207
		montesFreq      338.898
		montesSpiky     0.75748
		montesFraction  0.510828
		dunesMagn       0.0293738
		dunesFreq       11555.8
		dunesFraction   0.581376
		hillsMagn       0.104508
		hillsFreq       1182.62
		hillsFraction   0.814373
		hills2Fraction  0.00838704
		riversMagn      56.4569
		riversFreq      3.49446
		riversSin       4.45519
		riversOctaves   0
		canyonsMagn     0.4401
		canyonsFreq     2.74943
		canyonFraction  0
		cracksMagn      0.0541835
		cracksFreq      3.80001
		cracksOctaves   3
		craterMagn      0.658751
		craterFreq      24.9672
		craterDensity   0.88874
		craterOctaves   14
		craterRayedFactor 0
		volcanoMagn     0.564453
		volcanoFreq     0.587501
		volcanoDensity  0.209626
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.215828
		volcanoRadius   0.621252
		volcanoTemp     1418.45
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Water"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.993533
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	Ocean
	{
		Height          84.4
		Hapke           0
		SpotBright      2
		SpotWidth       0.05
		DayAmbient      0.07
		ModulateBright  1

		Composition
		{
			H2O      100
		}
	}

	Clouds
	{
		Height          6.34
		Velocity        59.8
		BumpHeight      3.17
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.977
		mainOctaves     10
		Coverage        0.223
		stripeZones     1.85
	}

	Clouds
	{
		Height          12.7
		Velocity        43.7
		BumpHeight      3.17
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.977
		mainOctaves     10
		Coverage        0.223
		stripeZones     1.85
		stripeTwist     0.126
	}

	Clouds
	{
		Height          19.6
		Velocity        59.8
		BumpHeight      9.78
		Hapke           0
		SpotBright      2
		SpotWidth       0.03
		DayAmbient      0.07
		ModulateBright  1
		mainFreq        0.977
		mainOctaves     10
		Coverage        0.223
		stripeZones     1.85
		stripeTwist     0.126
		TidalLocked     true
	}

	Atmosphere
	{
		Model          "Neptune"
		Height          75.4579
		Density         1
		Pressure        3
		Greenhouse      96 // 0.468539
		Bright          10 // 3.64875
		Opacity         0
		SkyLight        1.21625
		Hue             0.0358306
		Saturation      0.5 // 1

		Composition
		{
			CO2   	88.5627
			He    	11.4069
			Ar    	0.016149
			O2    	0.00907305
			H2O  	0.00317541
			N2    	0.00149555
			Ne    	0.000506197
			Kr    	1.69681e-005
		}
	}

	Aurora
	{
		Height      172.304
		NorthLat    45.5983
		NorthLon    -0.035202
		NorthRadius 2091.75
		NorthWidth  677.016
		NorthRings  2
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -42.0399
		SouthLon    189.813
		SouthRadius 1345.61
		SouthWidth  315.393
		SouthRings  5
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	Rings
	{
		InnerRadius     17442
		OuterRadius     40206
		EdgeRadius      40206
		MeanRadius      1.6e+04
		Thickness       0.08
		RocksMaxSize    0.0032
		RocksSpacing    1
		DustDrawDist    240
		ChartRadius     40206
		RotationPeriod  3
		Brightness      1
		FrontBright     2.6
		BackBright      4.84
		Density         0.992
		Opacity         0.992
		SelfShadow      0.992
		PlanetShadow    0.992
		Hapke           1
		SpotBright      1
		SpotWidth       0.02
		SpotBrightCB    0
		SpotWidthCB     0.001
		frequency       7.05
		densityScale    1.59
		densityOffset   -0.015
		densityPower    0.975
		colorContrast   0.0887
		FrontColor      (0.700 0.700 0.700)
		BackThickColor  (0.800 0.600 0.400)
		BackIceColor    (0.300 0.700 1.000)
		BackDustColor   (1.000 0.980 0.880)
	}

	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   1.334
		PeriodDays      636.13
		Eccentricity    0.16
		// 生成
		Inclination     -1.01806
		AscendingNode   171.96
		ArgOfPericenter 352.179
		MeanAnomaly     94.0676
	}
}

// Object * tau Cet g  ---  Extra-solar Planet  ---  OID=@11602919   (@@-1,255)  ---  coobox=11021
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"TAU Cet g/HD 10700g"
{
	ParentBody     "TAU Cet A"
	Class	       "Terra"
	DiscMethod     "RadVel"
	DiscDate       "2017"
	Mass            1.75
	Radius          7526.20166 // Estimate

	// 生成
	RotationPeriod  30.8822
	Obliquity       12.9082
	EqAscendNode    56.9685
	Oblateness      0
	Color          (0.750 0.746 0.740)

	Surface
	{
		Preset          "tau_cet_g.cfg"
		SurfStyle       0.203851
		OceanStyle      0.20354
		Randomize      (0.169, -0.681, -0.579)
		colorDistMagn   0.0672069
		colorDistFreq   397.016
		detailScale     8444.99
		colorConversion true
		drivenDarkening 0
		seaLevel        0.203309
		snowLevel       2
		tropicLatitude  0.204256
		icecapLatitude  0.970068
		icecapHeight    0.204551
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.6598
		venusFreq       1.20493
		venusMagn       0
		mareFreq        1.91121
		mareDensity     0.00984651
		terraceProb     0.181608
		erosion         0
		montesMagn      0.248924
		montesFreq      184.062
		montesSpiky     0.986176
		montesFraction  0.609699
		dunesMagn       0.0272449
		dunesFreq       4399.38
		dunesFraction   0.264297
		hillsMagn       0.146211
		hillsFreq       355.296
		hillsFraction   0.0982872
		hills2Fraction  0.239244
		riversMagn      60.4681
		riversFreq      2.87744
		riversSin       5.36096
		riversOctaves   0
		canyonsMagn     0.512636
		canyonsFreq     1.18864
		canyonFraction  0
		cracksMagn      0.0543005
		cracksFreq      1.85315
		cracksOctaves   3
		craterMagn      0.588322
		craterFreq      7.75691
		craterDensity   0.772626
		craterOctaves   11.5556
		craterRayedFactor 0.112618
		volcanoMagn     0.623165
		volcanoFreq     0.670367
		volcanoDensity  0.239438
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.103908
		volcanoRadius   0.541258
		volcanoTemp     1513.8
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           0.959711
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	Atmosphere
	{
		Model          "Earth"
		Height          52.405
		Density         0.00402886
		Pressure        0.00129155
		Greenhouse      0.139512
		Bright          5.26061
		Opacity         1
		SkyLight        1.75354
		Hue             0.157133
		Saturation      1

		Composition
		{
			CO2   	99.8769
			SO2   	0.0766063
			C3H8  	0.0464842
			Kr    	1.46821e-005
		}
	}

	NoClouds        true
	NoOcean         true
	NoLava          true
	NoAurora        true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   0.133
		PeriodDays      20
		Eccentricity    0.06
		// 生成
		Inclination     -2.30888
		AscendingNode   56.4054
		ArgOfPericenter 344.792
		MeanAnomaly     350.534
	}
}

// Object * tau Cet h  ---  Extra-solar Planet  ---  OID=@11602920   (@@-1,255)  ---  coobox=11021
// Object types: Extra-solar Planet,Star,Extra-solar Planet Candidate
Planet	"TAU Cet h/HD 10700h"
{
	ParentBody     "TAU Cet A"
	DiscMethod     "RadVel"
	DiscDate       "2017"
	Class	       "Terra"
	Mass            1.83
	Radius          7589.98303 // Estimate

	// 生成
	RotationPeriod  12010.1
	Obliquity       2.03622
	EqAscendNode    -94.7532
	Oblateness      0
	Color          (0.443 0.441 0.437)

	Surface
	{
		Preset          "tau_cet_h.cfg"
		SurfStyle       0.278896
		OceanStyle      0.953146
		Randomize      (-0.171, -0.619, -0.345)
		colorDistMagn   0.0453744
		colorDistFreq   107.812
		detailScale     2222.17
		colorConversion true
		drivenDarkening 0
		seaLevel        0.155956
		snowLevel       2
		tropicLatitude  0.0481084
		icecapLatitude  10
		icecapHeight    0.196337
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71106
		venusFreq       1.78816
		venusMagn       0
		mareFreq        0.214339
		mareDensity     0.0021384
		terraceProb     0.44441
		erosion         0
		montesMagn      0.07517
		montesFreq      32.4785
		montesSpiky     0.997926
		montesFraction  0.266014
		dunesMagn       0.0392063
		dunesFreq       1143.92
		dunesFraction   0.474936
		hillsMagn       0.136584
		hillsFreq       81.895
		hillsFraction   0.607883
		hills2Fraction  0
		riversMagn      49.7927
		riversFreq      2.12136
		riversSin       7.11633
		riversOctaves   0
		canyonsMagn     0.420095
		canyonsFreq     0.301792
		canyonFraction  0.896001
		cracksMagn      0.0596128
		cracksFreq      0.261905
		cracksOctaves   0
		craterMagn      0.542791
		craterFreq      2.3701
		craterDensity   0.778219
		craterOctaves   10
		craterRayedFactor 0.19635
		volcanoMagn     0.181077
		volcanoFreq     0.678113
		volcanoDensity  0.152748
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.426503
		volcanoRadius   0.134532
		volcanoTemp     1356.61
		lavaCoverTidal  0
		lavaCoverSun    0
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

	NoClouds        true
	NoOcean         true
	NoLava          true
	NoAtmosphere    true
	NoAurora        true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   0.243
		PeriodDays      49.41
		Eccentricity    0.23
		// 生成
		Inclination     -3.56071
		AscendingNode   -96.3468
		ArgOfPericenter 270.588
		MeanAnomaly     108.267
	}
}

Planet	"TAU Cet i"
{
	ParentBody     "TAU Cet A"
	DiscDate       "2019"
	Class	       "GasGiant"
	MassJup         5

	Oblateness      0
	Color          (0.510 0.491 0.577)

	Surface
	{
		Preset          "tau_cet_i.cfg"
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

	NoOcean         true
	NoLava          true
	NoAurora        true
	NoRings         true
	NoAccretionDisk true
	NoCometTail     true

	Orbit
	{
		// 已知
		SemiMajorAxis   3
		// 生成
		Eccentricity    0.0187074
		Inclination     -1.06682
		AscendingNode   20.8486
		ArgOfPericenter 75.1371
		MeanAnomaly     10.8699
	}
}