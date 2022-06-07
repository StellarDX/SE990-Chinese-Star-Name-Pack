////////////////////////////////////////////////////////////////////////////////
//                                                                            //
//                                    紫微                                    //
//                                                                            //
////////////////////////////////////////////////////////////////////////////////

// 北极二
Remove "BET UMi b"{ParentBody "BET UMi"}
Planet	"HD 131873 b"
{
	ParentBody     "HD 131873"
	DiscMethod     "RadVel"
	DiscDate       "2014"
	Mass           1938.753118

	Orbit
	{
		SemiMajorAxis   1.4
		PeriodDays      522.3
		Eccentricity    0.19
	}
}

// 紫微左垣一
Remove "Edasich b"{ParentBody "Edasich"}
Planet	"HR 5744 b"
{
	ParentBody     "HR 5744"
	DiscMethod     "RadVel" // Doppler Spectroscopy
	DiscDate       "2002" // Frink et al., 2002.01.08
	Mass           2803.2463116
	Radius         76537.644

	Orbit
	{
		SemiMajorAxis   1.275
		Eccentricity    0.7124
		PeriodDays      511.098
		Epoch           2452014.59
		Inclination     46
		ArgOfPericen    91.58
		MeanAnomaly     0
	}
}

Planet	"HR 5744 c"
{
	ParentBody     "HR 5744"
	Mass           5403.08246

	Orbit
	{
		SemiMajorAxis   19.4
		Period          68
		Eccentricity    0.455
		Inclination     86
	}
}

// 天柱四
Remove "HD 180777 b"{ParentBody "HD 180777"}
Planet	"HIP 94083 b"
{
	ParentBody     "HIP 94083"
	DiscMethod     "RadVel"
	DiscDate       "2006"
	Mass            7945.7095

	Orbit
	{
		PeriodDays      28.44
		SemiMajorAxis   0.22
		Eccentricity    0.2
	}
}

// 六甲六
Remove "HD 33564 b"{ParentBody "HD 33564"}
Planet	"HIP 25110 b"
{
	ParentBody     "HIP 25110"
	DiscMethod     "RadVel" // Doppler Spectroscopy
	DiscDate       "2005" // Galland et al., Haute-Provence Observatory, 2005.09.03
	Mass           2892.238258

	Orbit
	{
		SemiMajorAxis   1.117
		Eccentricity    0.34
		PeriodDays      388
		ArgOfPericen    205
		MeanAnomaly     0
	}
}

// 内阶一
Remove "OMI UMa A b"{ParentBody "OMI UMa A"}
Planet "HD 7136 Ab"
{
	ParentBody     "HIP 41704 A"
	DiscMethod     "RadVel"
	DiscDate       "2012"
	Mass           1303.096358

	Orbit
	{
		Epoch           2453400
		PeriodDays      1630
		SemiMajorAxis   3.9
		Eccentricity    0.13
	}
}

// 天厨二
Planet "HD 185144 b(?)"
{
	ParentBody     "HD 185144"
	DiscMethod     "RadVel"
	Mass           12

	Orbit
	{
		SemiMajorAxis   0.814
		PeriodDays      308
		Eccentricity    0
	}
}

// 天牢三
Remove "Taphao Thong"{ParentBody "Chalawan"}
Remove "Taphao Kaew"{ParentBody "Chalawan"}
Remove "47 UMa d"{ParentBody "Chalawan"}
Planet	"HD 95128 b"
{
	ParentBody     "HD 95128"
	DiscMethod     "RadVel" // Doppler spectroscopy
	DiscDate       "1996" // Marcy and Butler et al., USA, 1996.01.17
	Mass           804.1058014

	Orbit
	{
		//aphelion distance 2.17
		PericenterDist  2.03
		SemiMajorAxis   2.1
		Eccentricity    0.032
		PeriodDays      1078
		Epoch           2451917
		ArgOfPericen    334
		MeanAnomaly     0
	}
}

Planet	"HD 95128 c"
{
	ParentBody     "HD 95128"
	DiscMethod     "RadVel" // Doppler spectroscopy
	DiscDate       "2001" // Fischer, Butler, and Marcy et al., USA, 2001.08.15(Confirmed at 2002.03.19)
	Mass           171.6273252

	Orbit
	{
		SemiMajorAxis   3.6
		Eccentricity    0.098
		PeriodDays      2391
		Epoch           2452441
		ArgOfPericen    295
		MeanAnomaly     0
	}
}

Planet	"HD 95128 d"
{
	ParentBody     "HD 95128"
	DiscMethod     "RadVel" // Doppler spectroscopy (Bayesian Kepler periodogram)
	DiscDate       "2010" // Gregory and Fischer, USA, 2010.03.06
	Mass           521.2385432

	Orbit
	{
		SemiMajorAxis   11.6
		Eccentricity    0.16
		PeriodDays      14002
		Epoch           2451736
		ArgOfPericen    110
		MeanAnomaly     0
	}
}

////////////////////////////////////////////////////////////////////////////////
//                                                                            //
//                                    太微                                    //
//                                                                            //
////////////////////////////////////////////////////////////////////////////////

// 明堂二
Remove "UPS Leo b"{ParentBody "UPS Leo"}
Planet	"HD 100920 b"
{
	ParentBody     "HD 100920"
	DiscMethod     "RadVel"
	DiscDate       "2021"
	Mass           162.0924738

	Orbit
	{
		SemiMajorAxis   1.18
		PeriodDays      385.2
		Eccentricity    0.32
		Epoch           2455279.6
		ArgOfPericen    131
	}
}

////////////////////////////////////////////////////////////////////////////////
//                                                                            //
//                                    天市                                    //
//                                                                            //
////////////////////////////////////////////////////////////////////////////////

// 天市左垣九
Remove "NU Oph b"{ParentBody "NU Oph"}
Remove "NU Oph c"{ParentBody "NU Oph"}
Planet "HD 163917 b"
{
	ParentBody     "HD 163917"
	DiscDate       "2003"
	Class          ""
	Mass           7055.790036

	Orbit
	{
		SemiMajorAxis   1.803
		PeriodDays      530.73
		Eccentricity    0.124
		Inclination     16
	}
}

Planet "HD 163917 c"
{
	ParentBody     "HD 163917"
	DiscDate       "2010"
	Class          ""
	Mass           7850.360986

	Orbit
	{
		SemiMajorAxis   6.022
		PeriodDays      3188.95
		Eccentricity    0.178
		Inclination     16
	}
}

// 宗正一
Planet	"HD 161096 b(?)"
{
	ParentBody     "HD 161096"
	Mass            317.82838

	Orbit
	{
		PeriodDays      142.3
		SemiMajorAxis   0.6
	}
}

// 贯索七
Remove "EPS CrB A b"{ParentBody "EPS CrB A"}
Planet	"EPS CrB b"
{
	ParentBody     "HIP 78159 A"
	DiscMethod     "RadVel"
	DiscDate       "2012"
	Mass           2129.450146

	Orbit
	{
		SemiMajorAxis   1.3
		PeriodDays      417.9
		Eccentricity    0.11
	}
}

// 贯索九
Remove "RHO CrB b"{ParentBody "RHO CrB"}
Remove "RHO CrB c"{ParentBody "RHO CrB"}
Planet	"HIP 78459 b"
{
	ParentBody     "HIP 78459"
	DiscMethod     "RadVel"
	DiscDate       "1997"
	Mass           333.719799

	Orbit
	{
		PeriodDays      39.6
		SemiMajorAxis   0.2196
		Eccentricity    0.0373
		Inclination     0.5
	}
}

Planet	"HIP 78459 c"
{
	ParentBody     "HIP 78459"
	DiscMethod     "RadVel"
	DiscDate       "2016"
	Mass           25

	Orbit
	{
		SemiMajorAxis   0.4123
		PeriodDays      102.54
		Eccentricity    0.052
	}
}

// 女床一
Planet	"HIP 84380 b" // Sub-Brown Dwarf?
{
	ParentBody     "HIP 84380"
	DiscMethod     "RadVel"
	Mass           8581.36626

	Orbit
	{
		SemiMajorAxis   3
		PeriodDays      613
		Eccentricity    0.05
	}
}

////////////////////////////////////////////////////////////////////////////////
//                                                                            //
//                                    苍龙                                    //
//                                                                            //
////////////////////////////////////////////////////////////////////////////////

// 周鼎三
Remove "HD 113996 b"{ParentBody "HD 113996"}
Planet	"HIP 64022 b"
{
	ParentBody     "HIP 64022"
	DiscMethod     "RadVel"
	DiscDate       "2017"
	Mass           2002.318794

	Orbit
	{
		SemiMajorAxis   1.6
		PeriodDays      610.2
		Eccentricity    0.28
	}
}

// 右摄提二
Remove "TAU Boo A b"{ParentBody "TAU Boo A"}
Planet	"HIP 67275 Ab"
{
	ParentBody     "HIP 67275 A"
	DiscMethod     "RadVel" // Doppler Spectroscopy
	DiscDate       "1996" // Butler et al., University of California, 1996
	Mass           1906.97028 // 1748.05609
	Teff           1700

	Orbit
	{
		SemiMajorAxis   0.0481
		PeriodDays      3.312463
		Eccentricity    0.023
		Inclination     44.5
		Epoch           2446957.81
		ArgOfPericenter 188
		MeanAnomaly     0
	}
}

// 阳门一
Remove "b Cen b"{ParentBody "HIP 71865"}
Planet	"HIP 71865 ABb"
{
	ParentBody     "HIP 71865"
	DiscMethod     "Imaging"
	DiscDate       "2021"
	Mass           3464.329342

	Orbit
	{
		SemiMajorAxis   556
		PeriodDays      2650
		Eccentricity    0.4
		Inclination     128
	}
}

// 氐宿三
Remove "GAM Lib b"{ParentBody "GAM Lib"}
Remove "GAM Lib c"{ParentBody "GAM Lib"}
Planet	"GAM Lib b"
{
	ParentBody     "HIP 76333 A"
	DiscDate       "2018"
	Class          "GasGiant"
	Mass           324.564

	Orbit
	{
		SemiMajorAxis   1.24
		PeriodDays      415.2
		Eccentricity    0.21
	}
}

Planet	"GAM Lib c"
{
	ParentBody     "HIP 76333 A"
	DiscDate       "2018"
	Class          "GasGiant"
	Mass           1457.356

	Orbit
	{
		SemiMajorAxis   2.17
		PeriodDays      964.6
		Eccentricity    0.057
	}
}

// 罚一
Planet	"18 Sco b"
{
	ParentBody     "18 Sco"
	DiscDate       "2017"

	Orbit
	{
		PeriodDays      2528.81456
	}
}

////////////////////////////////////////////////////////////////////////////////
//                                                                            //
//                                    玄武                                    //
//                                                                            //
////////////////////////////////////////////////////////////////////////////////

// 织女
Planet	"Vega b"
{
	ParentBody     "Vega A"
	DiscDate       "2021"
	Mass           203
	Msini          21.9
	Oblateness     0

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.04555
		PeriodDays      2.42977
		Eccentricity    0.25
	}
}

Planet	"Vega c(?)"
{
	ParentBody     "Vega A"
	DiscDate       "2021"
	Mass           740
	Msini          80
	Oblateness     0

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      196.4
	}
}

// 瓠瓜二
Planet	"GAM Del b"
{
	ParentBody     "HIP 102531 A"
	DiscMethod     "RadVel"
	DiscDate       "1999"
	Mass           222.479866

	Orbit
	{
		PeriodDays      525.6
		SemiMajorAxis   1.5
	}
}

// 奚仲三
Planet	"TET Cyg b"
{
	ParentBody     "HIP 96441"
	DiscMethod     "RadVel"
	DiscDate       "2009" // Desort et al., ELODIE, 2009
	Mass           731.005274

	Orbit
	{
		PeriodDays      154.5
		SemiMajorAxis   0.635
		Eccentricity    0
	}
}

// 奚仲四
Remove "16 Cyg B b"{ParentBody "16 Cyg B"}
Planet	"16 Cyg Bb"
{
	ParentBody     "16 Cyg B"
	DiscMethod     "RadVel"
	DiscDate       "1996" // William D. Cochran, Artie P. Hatzes, R. Paul Butler, Geoff Marcy, USA, 1996.10.22
	Class          "GasGiant"
	Mass           756.4315444

	Orbit
	{
		SemiMajorAxis   1.681
		Eccentricity    0.689
		PeriodDays      798.5
		Inclination     45
		Epoch           2446549.1
		ArgOfPericenter 83.4
		MeanAnomaly     0
	}
}

// 天钩四
Planet	"ETA Cep b"
{
	ParentBody     "HIP 102422"
	DiscDate       "1998"
	Mass           203.4101632

	Orbit
	{
		PeriodDays      136.57
		SemiMajorAxis   0.638
		Eccentricity    0.17
	}
}

// 羽林军卅九
Remove "91 Aqr A b"{ParentBody "91 Aqr A"}
Planet	"PSI1 Aqr A b"
{
	ParentBody     "HIP 114855 A"
	DiscMethod     "RadVel"
	DiscDate       "2013" // Mitchell et al., USA, 2013.11.16
	Mass           1017.050816

	Orbit
	{
		SemiMajorAxis   0.7
		Eccentricity    0.027
		PeriodDays      181.4
		Epoch           2453472.1
		ArgOfPericen    177.3
	}
}

// 北落师门
Remove "Dagon"{ParentBody "Fomalhaut"}
Planet	"Dagon/Fomalhaut b"
{
	ParentBody     "Fomalhaut A"
	DiscDate       "2008"
	DiscMethod     "Imaging"
	Mass            10 // 100 // 0.5Mj // <2Mj // Uncertained
	//Radius          85790.4

	Orbit
	{
		SemiMajorAxis   177
		Eccentricity    0.8
		Period          1700
		Inclination    -55
		AscendingNode   152
		ArgOfPericen    26
		MeanAnomaly     0
	}
}

Planet	"Fomalhaut Bb"
{
	ParentBody     "TW PsA"
	DiscMethod     "Astrometry"
	DiscDate       "2019"
	Mass            381.6

	Orbit
	{
		PeriodDays      30000
	}
}

// 螣蛇廿一
Remove "KAP And b"{ParentBody "KAP And"}
Planet	"19 And b"
{
	ParentBody     "19 And"
	Class          "GasGiant" // super-Jupiter
	DiscMethod     "Imaging" // SEEDS, Subaru Telescope, 2012.07
	DiscDate       "2012"
	Radius         112242.44
	Mass           4131.76894

	Orbit
	{
		SemiMajorAxis   57 // 133
		Eccentricity    0.69 // 0.85
		Period          242 // 900
		Inclination     114.9 // 140
		AscendingNode   60.3 // 90.5
		Epoch           2465569.83383129 // 2469039.63471971
		ArgOfPericenter 96.6 // 155.4
		MeanAnomaly     0
	}
}

// 霹雳二
Remove "GAM Psc b"{ParentBody "GAM Psc"}
Planet	"GAM Psc b"
{
	ParentBody     "GC 32415"
	DiscMethod     "RadVel"
	DiscDate       "2021"
	Class          "GasGiant"
	Mass           425.8900292

	Orbit
	{
		SemiMajorAxis   1.32
		PeriodDays      555.1
		Eccentricity    0.204
	}
}

////////////////////////////////////////////////////////////////////////////////
//                                                                            //
//                                    白虎                                    //
//                                                                            //
////////////////////////////////////////////////////////////////////////////////

// 外屏二
Planet	"HIP 4906 b"
{
	ParentBody     "HIP 4906"
	DiscMethod     "RadVel"
	DiscDate       "2021"
	Class          "GasGiant"
	Mass           244.7278526

	Orbit
	{
		SemiMajorAxis   0.88
		PeriodDays      255.3
		Eccentricity    0.278
	}
}

// 娄宿三
Remove "ALF Ari b"{ParentBody "ALF Ari"}
Planet	"HIP 9884 b"
{
	ParentBody     "HIP 9884"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	Mass           572.091084

	Orbit
	{
		SemiMajorAxis   1.2
		PeriodDays      380.8
		Eccentricity    0.25
	}
}

// 天仓二
Remove "ETA Cet b"{ParentBody "ETA Cet"}
Remove "ETA Cet c"{ParentBody "ETA Cet"}
Planet	"HD 6805 b"
{
	ParentBody     "HD 6805"
	DiscMethod     "RadVel"
	DiscDate       "2014"
	Mass           810.462369

	Orbit
	{
		SemiMajorAxis   1.27
		PeriodDays      403.5
		Eccentricity    0.13
	}
}

Planet	"HD 6805 c"
{
	ParentBody     "HD 6805"
	DiscMethod     "RadVel"
	DiscDate       "2014"
	Mass           1055.1902216

	Orbit
	{
		SemiMajorAxis   1.93
		PeriodDays      751.9
		Eccentricity    0.1
	}
}

// 天大将军六
Remove "Saffar"{ParentBody "Titawin"}
Remove "Samh"{ParentBody "Titawin"}
Remove "Majriti"{ParentBody "Titawin"}
Remove "UPS And A e"{ParentBody "Titawin"}
Planet	"Saffar/UPS And b"
{
	ParentBody     "Titawin A"
	DiscMethod     "RadVel"
	DiscDate       "1996" // Marcy et al., California and Carnegie Planet Search, 1996.07.23
	Class          "GasGiant"
	Mass           540.308246
	Radius         92939.6 // 128685.6
	TidalLocked    true

	Interior // similar to Jupiter
	{
		Composition // mass fraction, values in percent
		{
			Hydrogen    87.42
			Helium      9.44
			Ices		3.0 // total mass of the rocky/water core: 10 Mearth = 3.14%
			Silicates	0.1
			Metals      0.04
		}
	}

	Orbit
	{
		//aphelion distance 0.0601
		PericenterDist  0.0587
		SemiMajorAxis   0.0594
		Eccentricity    0.012
		PeriodDays      4.617111
		Inclination     24
		Epoch           2450034.05
		LongOfPericen   44.11
		MeanLongitude   44.11
	}
}

Planet	"Samh/UPS And c"
{
	ParentBody     "Titawin A"
	DiscMethod     "RadVel"
	DiscDate       "1999" // Marcy et al., California and Carnegie Planet Search, 1999.04.15
	Class          "GasGiant"
	Mass           4443.2407524

	Orbit
	{
		PericenterDistKm 91600000
		SemiMajorAxisKm 124100000
		Eccentricity    0.26
		PeriodDays      241.26
		Inclination     7.868
		AscendingNode   236.853
		Epoch           2499922.53
		LongOfPericen   484.513
		MeanLongitude   484.513
	}
}

Planet	"Majriti/UPS And d"
{
	ParentBody     "Titawin A"
	DiscMethod     "RadVel"
	DiscDate       "1999" // Marcy et al., California and Carnegie Planet Search, 1999.04.15
	Class          "GasGiant" // super-Jupiter
	Mass           3257.740895
	Radius         72921.84
	Teff           218

	Orbit
	{
		//aphelion distance Km 478000000
		PericenterDistKm 282000000
		SemiMajorAxisKm 380000000
		Eccentricity    0.299
		PeriodDays      1276.46
		Inclination     23.758
		AscendingNode   4.073
		Epoch           2450059
		LongOfPericen   257.064
		MeanLongitude   257.064
	}
}

Planet	"UPS And e"
{
	ParentBody     "Titawin A"
	DiscMethod     "RadVel" // Doppler spectroscopy
	DiscDate       "2010" // Curiel et al., Baja California, 2010.111.22
	Mass           336.58025442

	Orbit
	{
		//aphelion distance 5.2738
		PericenterDist  5.2175
		SemiMajorAxis   5.2456
		Eccentricity    0.0055
		PeriodDays      3848.86
		LongOfPericen   367.3
		MeanLongitude   367.3
	}
}

// 天囷十
Remove "75 Cet b" {ParentBody "75 Cet"}
Planet	"HIP 11791 b"
{
	ParentBody     "HIP 11791"
	DiscMethod     "RadVel"
	DiscDate       "2012"
	Mass           953.48514

	Orbit
	{
		SemiMajorAxis   2.1
		PeriodDays      691.9
		Eccentricity    0.117
	}
}

// 天船三
Planet	"Mirfak b"
{
	ParentBody     "HIP 15863"
	DiscDate       "2010"
	Mass           2097.66731

	Orbit
	{
		SemiMajorAxis   0.97
		PeriodDays      128
		Eccentricity    0.1
	}
}

// 天苑四
Remove "AEgir" {ParentBody "Ran"}
Planet	"AEgir/HIP 16537 b"
{
	ParentBody     "GJ 144"
	DiscMethod     "RadVel" // Doppler spectroscopy
	DiscDate       "2000" // Hatzes et al., 2000.08.07
	Mass           378.2157722
	Teff           150

	Rings{}

	Orbit
	{
		SemiMajorAxis   3.48
		Eccentricity    0.07
	  Period          7.37
		Inclination     34
		AscendingNode   180
		ArgOfPericen    177
		MeanAnomaly     0
	}
}

Planet	"HIP 16537 c"
{
	ParentBody     "GJ 144"
	Mass           31.782838

	Orbit
	{
		SemiMajorAxis   40
	  PeriodDays      102270
		Eccentricity    0.3
	}
}

// 毕宿一
Remove "Amateru"{ParentBody "Ain"}
Planet	"Amateru/HIP 20889 b"
{
	ParentBody     "GC 5430"
	DiscMethod     "RadVel" // Doppler spectroscopy
	DiscDate       "2007" // Sato et al., 2007.02.07
	Radius         84630.56
	Mass           2415.495688
	Teff           541

	Orbit
	{
		SemiMajorAxis   1.93
		Eccentricity    0.151
		PeriodDays      645.5
		Epoch           2452879
		ArgOfPericen    94.4
		MeanAnomaly     0
		//SemiAmplitude   98.5
	}
}

// 毕宿五
Remove "Aldebaran A b"{ParentBody "Aldebaran A"}
Planet	"Aldebaran Ab"
{
	ParentBody     "HIP 21421 A"
	DiscMethod     "RadVel"
	DiscDate       "2015"
	Mass           1843.404604
	Teff           1500

	Orbit
	{
		//aphelion distance 1.606
		PericenterDist  1.314
		SemiMajorAxis   1.46
		Eccentricity    0.1
		PeriodDays      628.96
		Epoch           2451296.5
		ArgOfPericenter 287
		MeanAnomaly     0
	}
}

////////////////////////////////////////////////////////////////////////////////
//                                                                            //
//                                    朱雀                                    //
//                                                                            //
////////////////////////////////////////////////////////////////////////////////

// 北河三
Remove "Pollux b"{ParentBody "Pollux"}
Planet	"Thestias/Pollux b/HD 62509 b"
{
	ParentBody     "Pollux Gem"
	DiscMethod     "RadVel"
	DiscDate       "2006" // Hatzes et al., United States, 2006.06.16
	Mass           731.005274

	Orbit
	{
		SemiMajorAxis   1.64
		Eccentricity    0.02
		PeriodDays      589.64
		Epoch           2447739.02
		ArgOfPericen    354.58
		MeanAnomaly     0
	}
}

// 五诸侯二
Remove "TAU Gem b"{ParentBody "TAU Gem"}
Planet	"HIP 34693 b"
{
	ParentBody     "HIP 34693"
	DiscMethod     "RadVel"
	DiscDate       "2004"
	Class          "GasGiant" // Super-Jupiter or Brown Dwarf
	Mass           6547.264628

	Orbit
	{
		PeriodDays      305.5
		SemiMajorAxis   1.17
		Eccentricity    0.031
	}
}

// 野鸡
Remove "7 CMa b"{ParentBody "7 CMa"}
Remove "7 CMa c"{ParentBody "7 CMa"}
Planet	"NU2 CMa b"
{
	ParentBody     "7 CMa"
	DiscMethod     "RadVel"
	DiscDate       "2011" // Wittenmyer, Robert A, 2011.12
	Mass           602.2847801
	Teff           232

	Orbit
	{
		SemiMajorAxis   1.761
		Eccentricity    0.055
		PeriodDays      736.9
		Epoch           2455520
		ArgOfPericenter 12
		MeanAnomaly     0
	}
}

Planet	"NU2 CMa c"
{
	ParentBody     "7 CMa"
	DiscMethod     "RadVel"
	DiscDate       "2019"
	Mass           193.55748342

	Orbit
	{
		SemiMajorAxis   2.143
		PeriodDays      988.9
		Eccentricity    0.046
	}
}

// 星宿五
Planet	"27 Hya Ab"
{
	ParentBody     "27 Hya"
	Mass           3178.2838

	Orbit
	{
		PeriodDays      3400
		SemiMajorAxis   5.9
	}
}

// 轩辕十
Remove "MU Leo b"{ParentBody "MU Leo"}
Planet	"HIP 48455 b"
{
	ParentBody     "HIP 48455"
	DiscMethod     "RadVel"
	DiscDate       "2014"
	Mass           762.788112‬

	Orbit
	{
		SemiMajorAxis   1.1
		PeriodDays      357.8
		Eccentricity    0.09
	}
}

// 轩辕十二
Remove "GAM 1 Leo b"{ParentBody "GAM1 Leo"}
Planet	"GAM Leo b"
{
	ParentBody     "GAM1 Leo A"
	DiscMethod     "RadVel"
	DiscDate       "2009" // Inwoo Han et al., South Korea, 2009.11.06
	Mass           2790.5331764‬

	Orbit
	{
		PericenterDist  1.02
		//aphelion distance 1.36
		SemiMajorAxis   1.19
		Eccentricity    0.14
		PeriodDays      429
	}
}

Planet	"GAM Leo c"
{
	ParentBody     "GAM1 Leo A"
	Mass           680.1527332‬

	Orbit
	{
		SemiMajorAxis   2.6
		PeriodDays      1340
		Eccentricity    0.13
	}
}

Planet	"UPS1 Hya b"
{
	ParentBody     "UPS1 Hya"
	DiscDate       "2005"
	Mass           15573.59062‬

	Orbit
	{
		PeriodDays      1500
		SemiMajorAxis   3.9
		Eccentricity    0.57
	}
}

Remove "HD 11977 b"{ParentBody "HD 11977"}
Planet	"ETA2 Hyi b"
{
	ParentBody     "ETA2 Hyi"
	DiscMethod     "RadVel"
	DiscDate       "2005"
	Mass           2078.5976052‬
	Orbit
	{
		SemiMajorAxis   1.93
		Eccentricity    0.4
		PeriodDays      711
		Epoch           2451420
		ArgOfPericen    351.5
		SemiAlplitude   105
	}
}

Planet	"NU Oct b"
{
	ParentBody     "HIP 107089 1" // ?
	Mass           669.314785442

	Orbit
	{
		SemiMajorAxis   1.276
		PeriodDays      414.8
		Eccentricity    0.086
		Inclination     112.5
	}
}
