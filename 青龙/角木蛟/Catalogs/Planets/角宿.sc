// 角宿一(bC**)
Remove "Spica A"{ParentBody "Spica"}
Remove "Spica B"{ParentBody "Spica"}
Star "将/HIP 65474 A"
{
	ParentBody "HIP 65474"
	Class      "B1III"
	MassSol    11.43
	RadSol     7.47
	Luminosity 20512
	Teff       25300
	Age        0.0125

	Orbit
	{
		PeriodDays      4.0145
		Eccentricity    0.133
		Inclination     63.1
		Epoch           2454189.4
		ArgOfPericenter 75.6
		MeanAnomaly     0
	}
}

Star "HIP 65474 B"
{
	ParentBody "HIP 65474"
	Class      "B2V"
	MassSol    7.21
	RadSol     3.74
	Luminosity 2254
	Teff       20900

	Orbit
	{
		PeriodDays      4.0145
		Eccentricity    0.133
		Inclination     63.1
		Epoch           2454189.4
		ArgOfPericenter 255.6
		MeanAnomaly     0
	}
}

// 角宿二(PM**)
Remove "ZET Vir A"{ParentBody "ZET Vir"}
Remove "ZET Vir B"{ParentBody "ZET Vir"}
Star "李/Heze/HIP 66249 A"
{
	ParentBody "HIP 66249"
	Class      "A3V"
	MassSol    2.041
	RadSol     2.079
	Luminosity 17.885
	Teff       8247
	Age        0.51

	Orbit
	{
		Period          124
		Eccentricity    0.16
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 66249 B"
{
	ParentBody "HIP 66249"
	Class      "M"
	MassSol    0.168

	Orbit
	{
		Period          124
		Eccentricity    0.16
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 平道一(***)
// C是光学伴星
Remove "TET Vir (ABC)"{ParentBody "TET Vir"}
Remove "TET Vir A"{ParentBody "TET Vir (ABC)"}
Remove "TET Vir Aa"{ParentBody "TET Vir A"}
Remove "TET Vir Ab"{ParentBody "TET Vir A"}
Remove "TET Vir B"{ParentBody "TET Vir (ABC)"}
Remove "TET Vir C"{ParentBody "TET Vir"}
Barycenter	"HIP 64238 A"
{
	ParentBody     "HIP 64238"
	BinaryOrbit
	{
		Separation      710
	}
}

Star	"HIP 64238 Aa"
{
	ParentBody     "HIP 64238 A"
	Class	         "A1Vs"
	MassSol         3.11
	Luminosity      190
	Teff            9250
	Oblateness      0

	Orbit
	{
		Period          33.04
		Eccentricity    0.9
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 64238 Ab"
{
	ParentBody     "HIP 64238 A"
	Class	         "F4.1 V"

	Orbit
	{
		Period          33.04
		Eccentricity    0.9
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 64238 B"
{
	ParentBody     "HIP 64238"
	Class	         "A9m"

	/*BinaryOrbit
	{
		Separation      710
	}*/
}

// 天田二(*)
// 所有伴星(B, C, D, E)全是光学伴星
Remove "TAU Vir A"{ParentBody "TAU Vir"}
Remove "TAU Vir B"{ParentBody "TAU Vir"}

// 进贤(**)
Star	"HIP 63414 A"
{
	ParentBody     "HIP 63414"
	Class          "A3III"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00506620144
		Eccentricity    0
		Inclination     1.06478918
		AscendingNode   0
		ArgOfPericenter -10.9487122
		MeanAnomaly     -53.9328493
	}
}

Star	"HIP 63414 B"
{
	ParentBody     "HIP 63414"
	Class          "F7.8 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00506620144
		Eccentricity    0
		Inclination     1.06478918
		AscendingNode   0
		ArgOfPericenter 169.051288
		MeanAnomaly     -53.9328493
	}
}

// 库楼一(SB**)
Remove "ZET Cen A"{ParentBody "ZET Cen"}
Remove "ZET Cen B"{ParentBody "ZET Cen"}
Star	"HIP 68002 A"
{
	ParentBody     "HIP 68002"
	Class	         "B2.5 IV"
	MassSol         7.8
	RadSol          5.8
	Teff            23561
	Age             0.0398

	Orbit
	{
		PeriodDays      8.024
		Eccentricity    0.5
		Epoch           2413719.321
		ArgOfPericenter 110
		MeanAnomaly     97.9043
	}
}

Star	"HIP 68002 B"
{
	ParentBody     "HIP 68002"
	Class	         "B7.2 V"

	Orbit
	{
		PeriodDays      8.024
		Eccentricity    0.5
		Epoch           2413719.321
		ArgOfPericenter 290
		MeanAnomaly     97.9043
	}
}

// 库楼五(**)
Star	"HIP 65936 A"
{
	ParentBody     "HIP 65936"
	Class	         "G8III"
	MassSol        7.5
	Teff           4683
	FeH            -0.36
	Age            0.0403

	Orbit
	{
		Period          83.14
		Eccentricity    0.521
		Inclination     145.2
		AscendingNode   146.5
		Epoch           2435517.70571559
		ArgOfPericenter 64.4
		MeanAnomaly     0
	}
}

Star	"HIP 65936 B"
{
	ParentBody     "HIP 65936"
	Class	         "G9III"

	Orbit
	{
		Period          83.14
		Eccentricity    0.521
		Inclination     145.2
		AscendingNode   146.5
		Epoch           2435517.70571559
		ArgOfPericenter 244.4
		MeanAnomaly     0
	}
}

// 库楼六(****?)
Barycenter	"HIP 63945 AC"
{
	ParentBody     "HR 4940"
	BinaryOrbit
	{
		Epoch           2457023.16637981
		Separation      1392
		PositionAngle   78
	}
}

Barycenter	"HIP 63945 A"
{
	ParentBody     "HIP 63945 AC"
	BinaryOrbit
	{
		Separation      186
	}
}

Star	"HIP 63945 Aa"
{
	ParentBody     "HIP 63945 A"
	Class          "B4V"
	MassSol        4.39
	Teff           14769
	Age            0.092

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0041937867
		Eccentricity    0
		Inclination     -0.147105217
		AscendingNode   0
		ArgOfPericenter 16.9073348
		MeanAnomaly     53.7768144
	}
}

Star	"HIP 63945 Ab"
{
	ParentBody     "HIP 63945 A"
	Class          "G8.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.0041937867
		Eccentricity    0
		Inclination     -0.147105217
		AscendingNode   0
		ArgOfPericenter 196.907335
		MeanAnomaly     53.7768144
	}
}

Star	"HIP 63945 C"
{
	ParentBody     "HIP 63945 AC"
	Class          "A5.6 V"

	BinaryOrbit
	{
		Separation      186
	}
}

Star	"HIP 63945 B"
{
	ParentBody     "HR 4940"
	Class          "K0Ve"
	MassSol        0.9
	Teff           5020
	Age            0.05

	/*BinaryOrbit
	{
		Epoch           2457023.16637981
		Separation      1392
		PositionAngle   78
	}*/
}

// 库楼七(**)
Remove "Muhlifain A"{ParentBody "Muhlifain"}
Remove "Muhlifain B"{ParentBody "Muhlifain"}
Star	"HIP 61932 A"
{
	ParentBody     "HIP 61932"
	Class	         "A1IV"
	MassSol        2.91
	Teff           9082

	Orbit
	{
		Period          83.57
		Eccentricity    0.793
		Inclination     113.7
		AscendingNode   2.6
		Epoch           2426434.13223191
		ArgOfPericenter 7.9
		MeanAnomaly     0
	}
}

Star	"HIP 61932 B"
{
	ParentBody     "HIP 61932"
	Class	         "A0IV"

	Orbit
	{
		Period          83.57
		Eccentricity    0.793
		Inclination     113.7
		AscendingNode   2.6
		Epoch           2426434.13223191
		ArgOfPericenter 187.9
		MeanAnomaly     0
	}
}

// 柱一(SB**)
Star	"HIP 68523 A"
{
	ParentBody     "HIP 68523"
	Class	         "F7II"
	MassSol        6.86
	Luminosity     3919
	LumBol         3919
	Teff           6495
	Age            0.0459

	Orbit
	{
		PeriodDays      207.357
		Eccentricity    0.55
		Epoch           2423880.5
		ArgOfPericenter 268
		//SemiAmplitude   12.7
		MeanAnomaly     0
	}
}

Star	"HIP 68523 B"
{
	ParentBody     "HIP 68523"
	Class	         ""
	MassSol        8.669 // ?

	Orbit
	{
		PeriodDays      207.357
		Eccentricity    0.55
		Epoch           2423880.5
		ArgOfPericenter 88
		//SemiAmplitude   12.7
		MeanAnomaly     0
	}
}

// 柱六(PM**)
Remove "PSI Cen A"{ParentBody "PSI Cen"}
Remove "PSI Cen B"{ParentBody "PSI Cen"}
Star "HIP 70090 A"
{
	ParentBody "HIP 70090"
	Class      "B9"
	MassSol    3.114
	RadSol     3.634
	Luminosity 141
	Teff       10450
	RotationPeriod 35.76
	Age        0.269

	Orbit
	{
		PeriodDays      38.81252
		Eccentricity    0.55408
		Inclination     88.955
		ArgOfPericenter 200.095
		//SemiAmplitude   49.01
		MeanAnomaly     0
	}
}

Star "HIP 70090 B"
{
	ParentBody "HIP 70090"
	Class      "A2"
	MassSol    1.909
	RadSol     1.811
	Luminosity 18
	Teff       8800

	Orbit
	{
		PeriodDays      38.81252
		Eccentricity    0.55408
		Inclination     88.955
		ArgOfPericenter 20.095
		//SemiAmplitude   49.92
		MeanAnomaly     0
	}
}

// 柱七(SB****)
Barycenter	"4 Cen A/SAO 204944/GC 18755/CD-31 10729"
{
	ParentBody     "HIP 67786"
	Orbit
	{
		Period          55000
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"4 Cen Aa"
{
	ParentBody     "4 Cen A"
	Class	         "B6IV"

	Orbit
	{
		PeriodDays      6.930137
		Eccentricity    0.25
		Epoch           2418823.406
		ArgOfPericenter 332
		//SemiAmplitude   21
		MeanAnomaly     0
	}
}

Star	"4 Cen Ab"
{
	ParentBody     "4 Cen A"
	Class	         "A2.8 V"

	Orbit
	{
		PeriodDays      6.930137
		Eccentricity    0.25
		Epoch           2418823.406
		ArgOfPericenter 152
		MeanAnomaly     0
	}
}

Barycenter	"4 Cen B/SAO 204943/GC 18754/CD-31 10727"
{
	ParentBody     "HIP 67786"
	Orbit
	{
		Period          55000
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"4 Cen Ba"
{
	ParentBody     "4 Cen B"
	Class	         "Am"

	Orbit
	{
		PeriodDays      4.839
		Eccentricity    0.05
		Epoch           2442916.55
		ArgOfPericenter 231
		//SemiAmplitude   16.9
		MeanAnomaly     0
	}
}

Star	"4 Cen Bb"
{
	ParentBody     "4 Cen B"
	Class	         "F1.4 V"

	Orbit
	{
		PeriodDays      4.839
		Eccentricity    0.05
		Epoch           2442916.55
		ArgOfPericenter 51
		MeanAnomaly     0
	}
}

// 柱八(**)
Remove "3 Cen A"{ParentBody "3 Cen"}
Remove "3 Cen B"{ParentBody "3 Cen"}
Star "HIP 67669 A/GC 18724 A/HD 120709 A/HR 5210 A/SAO 204916 A"
{
	ParentBody "HIP 67669"
	Class      "B5III"
	MassSol    5
	Teff       17500
	Age        0.0474
	AbsMagn    -0.3

	BinaryOrbit
	{
		Epoch           2457753.65077738
		Separation      706.59
		PositionAngle   106
	}
}

Barycenter "HIP 67669 B/GC 18725 B/HD 120710 B/HR 5211 B/SAO 204917 B"
{
	ParentBody "HIP 67669"
	BinaryOrbit
	{
		Epoch           2457753.65077738
		Separation      706.59
		PositionAngle   106
	}
}

Star "HIP 67669 Ba"
{
	ParentBody "HIP 67669 B"
	Class      "B8V"
	MassSol    2.47
	RadSol     2.8
	Luminosity 50.2
	Teff       9368

	Orbit
	{
		PeriodDays      17.428
		Eccentricity    0.21
		Epoch           2443296.44
		ArgOfPericenter 195
		//SemiAmplitude   17
		MeanAnomaly     0
	}
}

Star "HIP 67669 Bb"
{
	ParentBody "HIP 67669 B"
	Class      "F1.4 V"

	Orbit
	{
		PeriodDays      17.428
		Eccentricity    0.21
		Epoch           2443296.44
		ArgOfPericenter 15
		MeanAnomaly     0
	}
}

// 柱九(SB**)
Remove "1 Cen A"{ParentBody "1 Cen"}
Remove "1 Cen B"{ParentBody "1 Cen"}
Star	"HIP 67153 A"
{
	ParentBody     "HIP 67153"
	Class	         "F2V"
	MassSol        1.35
	LumBol         5.857
	Teff           6898
	FeH            -0.09
	RotationPeriod 58.08
	Age            1.193

	Orbit
	{
		PeriodDays      9.9448
		Eccentricity    0.247
		Epoch           2422737.382
		ArgOfPericenter 317.7
		MeanAnomaly     -33.7033
		//SemiAmplitude   6
	}
}

Star	"HIP 67153 B"
{
	ParentBody     "HIP 67153"
	Class	         "K1.8 V"

	Orbit
	{
		PeriodDays      9.9448
		Eccentricity    0.247
		Epoch           2422737.382
		ArgOfPericenter 137.7
		MeanAnomaly     -33.7033
	}
}

// 衡一(SB**)
Remove "NU Cen A"{ParentBody "NU Cen"}
Remove "NU Cen B"{ParentBody "NU Cen"}
Star	"HIP 67464 A"
{
	ParentBody     "HIP 67464"
	Class	         "B2IV"
	MassSol        8.5
	RadSol         6.4
	Luminosity     5000
	Teff           22400
	Age            0.018

	Orbit
	{
		PeriodDays      2.622
		Eccentricity    0
		Epoch           2450894.32
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   22.4
	}
}

Star	"HIP 67464 B"
{
	ParentBody     "HIP 67464"
	Class	         "B5.6 V"

	Orbit
	{
		PeriodDays      2.622
		Eccentricity    0
		Epoch           2450894.32
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 南门一(bC*)
Remove "EPS Cen A"{ParentBody "EPS Cen"}
Remove "EPS Cen B"{ParentBody "EPS Cen"}

// 南门二(***)
Remove "ALF Cen A"{ParentBody	"Toliman"}
Remove "ALF Cen B"{ParentBody	"Toliman"}
Star	"南门二/Rigil Kentaurus/ALF1 Cen/HR 5459/HD 128620 A/GCTP 3309.00/LHS 50/SAO 252838/HIP 71683 A"
{
	ParentBody	"ALF Cen"
	Class	    	"G2V"
	MassSol     1.0788
	RadSol      1.2175
	Luminosity  1.5059
	Teff        5790
	FeH         0.2
	RotationPeriod 528

	RotationModel "IAU"
	{
		Epoch			2451545	// J2000
		PoleRA			283.1	// degrees
		PoleDec			52.9	// degrees
		PrimeMeridian	0	// degrees
		RotationRate	16.36363636	// degrees/day
	}

	Orbit
	{
		Period			  	79.762
		Eccentricity  	0.51947
		Inclination	   	79.243
		AscendingNode	  205.073
		Epoch           2406130.31840167
		ArgOfPericenter 51.519
		MeanAnomaly	  	0
	}
}

Star	"Toliman/ALF2 Cen/HR 5460/HD 128621 B/LHS 51/HIP 71681 B"
{
	ParentBody	"ALF Cen"
	Class	    	"K0V"
	MassSol     0.9092
	RadSol      0.8591
	Luminosity  0.4981
	Teff        5260
	FeH         0.23
	RotationDays 864
	Age         5.3

	RotationModel "IAU"
	{
		Epoch		  	2451545	// J2000
		PoleRA			283.1	// degrees
		PoleDec			52.9	// degrees
		PrimeMeridian	0	// degrees
		RotationRate	10	// degrees/day
	}

	Orbit
	{
		Period			  	79.762
		Eccentricity  	0.51947
		Inclination	   	79.243
		AscendingNode	  205.073
		Epoch           2406130.31840167
		ArgOfPericenter 231.519
		MeanAnomaly	  	0
	}
}
/*
Star "比邻/Proxima/Proxima Cen/ALF Cen C/CCDM J14396-6050C/GCTP 3278.00/GJ 551/HIP 70890/LFT 1110/LHS 49/LPM 526/LTT 5721/NLTT 37460/V645 Cen"
{
	RA      14 29 38.71
	Dec     -62 40 24.3
	AppMagn 10.43

	Class   "M5.5Ve"
	AppMagnU 14.21
	AppMagnB 12.95
	AppMagn  11.13
	AppMagnR 9.45
	AppMagnI 7.41
	AppMagnJ 5.357
	AppMagnH 4.835
	AppMagnK 4.384

	Dist    1.30197
	AbsMagn 15.6

	ParentBody    "ALF Cen"
	Orbit
	{
	  Period          547000
		SemiMajorAxis   8700
		Eccentricity    0.5
		Inclination     107.6
		AscendingNode   126
		Epoch           1824423.67809112
		ArgOfPericenter 72.3
		MeanAnomaly     0
	}

	MassSol 0.1221
	RadSol  0.1542
	LumBol  0.0017
	Luminosity 0.00005
	Teff    3042
	FeH     0.21
	RotationPeriod 1982.4
	Age     4.85
}
*/
