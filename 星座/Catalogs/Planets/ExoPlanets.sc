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
	DiscMethod     "Astrometry" // Doppler Spectroscopy
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
	DiscMethod     "Astrometry" // Doppler Spectroscopy
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
	DiscMethod     "Astrometry" // Doppler spectroscopy
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
	DiscMethod     "Astrometry" // Doppler spectroscopy
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
	DiscMethod     "Astrometry" // Doppler spectroscopy (Bayesian Kepler periodogram)
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
	DiscMethod     "Astrometry" // Doppler Spectroscopy
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

Remove "GAM Lib b"{ParentBody "GAM Lib"}
Remove "GAM Lib c"{ParentBody "GAM Lib"}
Planet	"GAM Lib b"
{
	ParentBody     "HIP 76333 A"
	Mass           324.564
	DiscMethod     "RadVel"
	DiscDate       "2018"
	Orbit
	{
		Epoch           2450041
		PeriodDays      415.2
		SemiMajorAxis   1.24
		Eccentricity    0.21
		ArgOfPericen    187
	}
}

Planet	"GAM Lib c"
{
	ParentBody     "HIP 76333 A"
	Mass           1457.356
	DiscMethod     "RadVel"
	DiscDate       "2018"
	Orbit
	{
		Epoch           2450725
		PeriodDays      964.6
		SemiMajorAxis   2.17
		Eccentricity    0.057
		ArgOfPericen    146
	}
}

Planet	"GAM Del b"
{
	ParentBody     "HIP 102531 A"
	Mass           222.479866

	Orbit
	{
		PeriodDays      525.6
		SemiMajorAxis   1.5
	}
}

Planet	"TET Cyg b"
{
	ParentBody     "HIP 96441"
	Mass           731

	Orbit
	{
		PeriodDays      154.5
		SemiMajorAxis   0.635
		Eccentricity    0
	}
}

Planet	"ETA Cep b"
{
	ParentBody     "HIP 102422"
	Mass           203.41

	Orbit
	{
		PeriodDays      136.57
		SemiMajorAxis   0.638
		Eccentricity    0.17
	}
}

Remove "91 Aqr A b"{ParentBody "91 Aqr A"}
Planet	"PSI1 Aqr A b"
{
	ParentBody     "HIP 114855 A"
	DiscMethod     "RadVel"
	DiscDate       "2003"
	Mass           1017

	Orbit
	{
		Epoch           2453472.1
		PeriodDays      181.4
		SemiMajorAxis   0.7
		Eccentricity    0.027
		ArgOfPericen    177.3
	}
}

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
	DiscDate       "2019"
	Mass            381.6

	Orbit
	{
		Period        80
	}
}

Remove "KAP And b"{ParentBody "KAP And"}
Planet	"19 And b"
{
	ParentBody     "19 And"
	Class          "GasGiant"
	DiscMethod     "Imaging"
	DiscDate       "2013"

	Radius         85790.4
	Mass           4452

	Orbit
	{
		SemiMajorAxis   40 // 236
		Eccentricity    0.02 // 0.85
		Inclination     59 // 159
		AscendingNode   26 // 127
		TimeOfPericen   2015.35 // 2858.45
		ArgOfPericen    3 // 177
		MeanAnomaly     0
	}
}

Remove "ALF Ari b"{ParentBody "ALF Ari"}
Planet	"HIP 9884 b"
{
	ParentBody     "HIP 9884"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	Mass           572

	Orbit
	{
		PeriodDays      380.8
		SemiMajorAxis   1.2
		Eccentricity    0.25
	}
}

Remove "Saffar"{ParentBody "Titawin"}
Planet	"Saffar/UPS And b"
{
	ParentBody     "HIP 7513 A"
	DiscMethod     "RadVel"
	DiscDate       "1996"
	Mass           540.3
	Radius         92939.6

	Orbit
	{
		SemiMajorAxisKm 8910000
		Eccentricity    0.022
		PeriodDays      4.62
		Inclination     24
		Epoch           2450034.053
		ArgOfPericen    44.106
		SemiAmplitude   70.51
	}
}

Remove "Samh"{ParentBody "Titawin"}
Planet	"Samh/UPS And c"
{
	ParentBody     "HIP 7513 A"
	DiscMethod     "RadVel"
	DiscDate       "1999"
	Mass           4443.24

	Orbit
	{
		SemiMajorAxisKm 124100000
		Eccentricity    0.26
		PeriodDays      241.26
		Inclination     7.868
		AscendingNode   236.853
		Epoch           2499922.53
		ArgOfPericen    247.66
		SemiAmplitude   56.26
	}
}

Remove "Majriti"{ParentBody "Titawin"}
Planet	"Majriti/UPS And d"
{
	ParentBody     "HIP 7513 A"
	Class          "GasGiant"
	DiscMethod     "RadVel"
	DiscDate       "1999"
	Radius         72921.84
	Mass           3257.74
	Teff           218

	Orbit
	{
		SemiMajorAxisKm 380000000
		Eccentricity    0.299
		PeriodDays      1276.46
		Inclination     23.758
		AscendingNode   4.073
		Epoch           2450059
		ArgOfPericen    252.991
		SemiAmplitude   68.14
	}
}

Remove "UPS And A e"{ParentBody "Titawin"}
Planet	"UPS And e"
{
	ParentBody     "HIP 7513 A"
	DiscMethod     "RadVel"
	DiscDate       "2010"
	Mass           336.58

	Orbit
	{
		SemiMajorAxis   5.2456
		Eccentricity    0.0055
		PeriodDays      3848.86
		ArgOfPericen    367.3
	}
}

Remove "75 Cet b" {ParentBody "75 Cet"}
Planet	"HIP 11791 b"
{
	ParentBody     "HIP 11791"
	DiscMethod     "RadVel"
	DiscDate       "2012"
	Mass           953.48514
	Msini          127 // 318

	Orbit
	{
		PeriodDays      691.9
		SemiMajorAxis   2.1
		Eccentricity    0.117
		ArgOfPericen    165
	}
}

Planet	"HIP 15863 b"
{
	ParentBody     "HIP 15863"
	Mass           2097.66731

	Orbit
	{
		SemiMajorAxis   0.97
		PeriodDays      128
		Eccentricity    0.1
	}
}

Remove "AEgir" {ParentBody "Ran"}
Planet	"HIP 16537 b"
{
	ParentBody     "HIP 16537"
	DiscMethod     "RadVel"
	DiscDate       "2000"
	Mass           247.9
	Teff           150

	Orbit
	{
		SemiMajorAxis   3.48
		Eccentricity    0.07
	  Period          7.37
		Inclination     89
		AscendingNode   180
		ArgOfPericen    179
		SemiAmplitude   11.48
	}
}

Planet	"HIP 16537 c"
{
	ParentBody     "HIP 16537"
	Mass           31.8

	Orbit
	{
		SemiMajorAxis   40
	  PeriodDays      102270
		Eccentricity    0.3
	}
}

Remove "Amateru"{ParentBody "Ain"}
Planet	"HIP 20889 b"
{
	ParentBody     "HIP 20889"
	DiscMethod     "RadVel"
	DiscDate       "2006"
	Radius         84630.56
	Mass           2415.5
	Teff           541

	Orbit
	{
		SemiMajorAxis   1.93
		Eccentricity    0.151
		PeriodDays      645.5
		Epoch           2452879
		ArgOfPericen    94.4
		SemiAmplitude   98.5
	}
}

Remove "Aldebaran A b"{ParentBody "Aldebaran A"}
Planet	"Aldebaran Ab"
{
	ParentBody     "HIP 21421 A"
	DiscMethod     "RadVel"
	DiscDate       "2015"
	Mass           1843.4
	Teff           1500

	Orbit
	{
		PericenterDist  1.314
		SemiMajorAxis   1.46
		Eccentricity    0.1
		PeriodDays      628.96
		ArgOfPericenter 287.29
	}
}

Remove "Pollux b"{ParentBody "Pollux"}
Planet	"Thestias/Pollux b/HD 62509 b"
{
	ParentBody     "Pollux Gem"
	DiscMethod     "RadVel"
	DiscDate       "2006"
	Mass           731

	Orbit
	{
		Epoch           2447739.02
		PeriodDays      589.64
		SemiMajorAxis   1.64
		Eccentricity    0.02
		ArgOfPericen    354.58
	}
}

Remove "TAU Gem b"{ParentBody "TAU Gem"}
Planet	"HIP 34693 b"
{
	ParentBody     "HIP 34693"
	DiscMethod     "RadVel"
	DiscDate       "2004"
	Mass           5752.7

	Orbit
	{
		Epoch           2453270.7
		PeriodDays      305
		//SemiMajorAxis   0.88
		Eccentricity    0.031
		ArgOfPericen    137.4
	}
}

Remove "7 CMa b"{ParentBody "7 CMa"}
Remove "7 CMa c"{ParentBody "7 CMa"}
Planet	"NU2 CMa b"
{
	ParentBody     "7 CMa"
	DiscMethod     "RadVel"
	DiscDate       "2011"
	Mass           602.28478

	Orbit
	{
		Epoch           2454093
		PeriodDays      736.9
		SemiMajorAxis   1.761
		Eccentricity    0.055
		ArgOfPericen    116.4
	}
}

Planet	"NU2 CMa c"
{
	ParentBody     "7 CMa"
	DiscMethod     "RadVel"
	DiscDate       "2019"
	Mass           193.61838342‬

	Orbit
	{
		PeriodDays      988.9
		SemiMajorAxis   2.143
		Eccentricity    0.046
		ArgOfPericen    226.6
	}
}

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

Remove "MU Leo b"{ParentBody "MU Leo"}
Planet	"HIP 48455 b"
{
	ParentBody     "HIP 48455"
	DiscMethod     "RadVel"
	DiscDate       "2014"
	Mass           762.788112‬

	Orbit
	{
		Epoch           2452921
		PeriodDays      357.8
		SemiMajorAxis   1.1
		Eccentricity    0.09
		ArgOfPericen    227.1
	}
}

Planet	"GAM Leo b"
{
	ParentBody     "GAM1 Leo A"
	DiscMethod     "RadVel"
	DiscDate       "2009"
	Mass           2790.5331764‬

	Orbit
	{
		Epoch           2451236
		PeriodDays      429
		SemiMajorAxis   1.19
		PericenterDist  1.02
		//aphelion distance 1.36
		Eccentricity    0.14
		Inclination     172.1
		ArgOfPericen    206.7
	}
}

Planet	"GAM Leo c"
{
	ParentBody     "GAM1 Leo A"
	Mass           680.1527332‬

	Orbit
	{
		PeriodDays      1340
		SemiMajorAxis   2.6
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
