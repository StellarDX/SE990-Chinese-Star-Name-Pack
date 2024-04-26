// 离宫三(**)
Star	"HIP 112051 A"
{
	ParentBody     "HIP 112051"
	Class	         "A1IV"
  MassSol        2.24
  Luminosity     104.24
  Teff           9956
  FeH            0
  Age            0.184

	Orbit
	{
		RefPlane        "Equator"
		Period          0.344786
		Eccentricity    0.242965
		Inclination     -4.06832
		AscendingNode   -178.208
		ArgOfPericenter 133.014
		MeanAnomaly     -121.777
	}
}

Star	"HIP 112051 B"
{
	ParentBody     "HIP 112051"
	Class	         "A1.6 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.344786
		Eccentricity    0.242965
		Inclination     -4.06832
		AscendingNode   -178.208
		ArgOfPericenter 313.014
		MeanAnomaly     -121.777
	}
}

// 离宫四(SB**)
Remove "Matar A"{ParentBody "Matar"}
Remove "Matar B"{ParentBody "Matar"}
Star "HIP 112158 A"
{
	ParentBody "HIP 112158"
	Class      "G2II"
	MassSol    3.51
  RadSol     24.51
  Luminosity 330.8
  Teff       4970
  FeH        0.39
  RotationPeriod 19632
  Age        0.27

	Orbit
	{
		PeriodDays      813
		Eccentricity    0.183
  	Epoch           2452025
		ArgOfPericenter 164.7
		MeanAnomaly     0
    //SemiAmplitude   14.37
	}
}

Star "HIP 112158 B"
{
	ParentBody "HIP 112158"
	Class      "F0V"

	Orbit
	{
    PeriodDays      813
		Eccentricity    0.183
  	Epoch           2452025
		ArgOfPericenter 344.7
		MeanAnomaly     0
	}
}

// 雷电一(单星)
Remove "Homam A"{ParentBody "Homam"}
Remove "Homam B"{ParentBody "Homam"}

// 雷电二(PM**)
Remove "KSI Peg A"{ParentBody "KSI Peg"}
Remove "KSI Peg B"{ParentBody "KSI Peg"}
Star "HIP 112447 A"
{
	ParentBody "HIP 112447"
	Class      "F6 V"
	MassSol    1.17
  RadSol     1.86
  Luminosity 4.5
  Teff       6178
  FeH        -0.27
  Age        5

	BinaryOrbit
	{
		Separation      192.3
		PositionAngle   96.9
	}
}

Star "HIP 112447 B"
{
	ParentBody "HIP 112447"
	Class      "M3.5 V"
	MassSol    0.32
  Teff       3569
  FeH        -0.25

	/*BinaryOrbit
	{
		Separation      192.3
		PositionAngle   96.9
	}*/
}

// 雷电三(PM**)
Star	"HIP 112935 A"
{
	ParentBody     "HIP 112935"
	Class	         "F7IV"
	MassSol        1.275
	Teff           6250
	FeH            -0.32
	Age            2.71

	BinaryOrbit
	{
		Separation      6770.4
	}
}

Star	"HIP 112935 B"
{
	ParentBody     "HIP 112935"
	Class	         "M4V"

	/*BinaryOrbit
	{
		Separation      6770.4
	}*/
}

// 雷电六(SB**)
Star "HIP 115919 A"
{
	ParentBody "HIP 115919"
	Class      "G8IIIa"
	MassSol    2.49
  RadSol     8.44
  Luminosity 47.9
  Teff       5032
  FeH        0.05
  Age        0.59

	Orbit
	{
		PeriodDays      941.03
		Eccentricity    0.713
		ArgOfPericenter 237
		MeanAnomaly     0
		//SemiAmplitude   3.16
	}
}

Star "HIP 115919 B"
{
	ParentBody "HIP 115919"
	Class      ""
	MassSol    0.4

	Orbit
	{
		PeriodDays      941.03
		Eccentricity    0.713
		ArgOfPericenter 57
		MeanAnomaly     0
	}
}

// 垒壁阵二(Be****)
Star	"HIP 106723 Aa/BD-20 6251"
{
	ParentBody     "HIP 106723"
	Class	         "B2.5Vpe"
	MassSol        7.6
	DimensionsSol (4.8, 4.4859813084112149532710280373832, 4.8)
	Luminosity     4649
	Teff           18800
	FeH            -0.08
	Age            0.0275

	Orbit
	{
		PeriodDays      129
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 106723 Ab"
{
	ParentBody     "HIP 106723"
	Class	         "A3.5 V"

	Orbit
	{
		PeriodDays      129
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 106723 B/BD-20 6253"
{
	ParentBody     "HIP 106723"
	Class	         "A1.1 V"

	Orbit
	{
		Epoch           2456292.68198225
		SemiMajorAxis   21056
		ArgOfPericenter 46
		MeanAnomaly     0
	}
}

Star	"HIP 106723 C/UCAC2 24494750"
{
	ParentBody     "HIP 106723"
	Class	         "A8.7 V"

	Orbit
	{
		Epoch           2451179.29119932
		SemiMajorAxis   20064
		ArgOfPericenter 164
		MeanAnomaly     0
	}
}

// 垒壁阵四(EB**)
Remove "DEL Cap A"{ParentBody "Deneb Algedi"}
Remove "DEL Cap B"{ParentBody "Deneb Algedi"}
Star "HIP 107556 Aa"
{
	ParentBody "HIP 107556"
	Class      "A7III" // kA5hF0mF2III
	MassSol    2
	RadSol     1.91
	Luminosity 8.5
	Teff       7301
	FeH        -0.13

	Orbit
	{
		PeriodDays      1.0227683
		Eccentricity    0
		Inclination     72.5
		Epoch           2448105.793
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   75.3
	}
}

Star "HIP 107556 B"
{
	ParentBody "HIP 107556"
	Class      "G-K"
	MassSol    0.73
	RadSol     0.9
	Teff       4500

	Orbit
	{
		PeriodDays      1.0227683
		Eccentricity    0
		Inclination     72.5
		Epoch           2448105.793
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 垒壁阵五(SB**)
Star "HIP 109139 Aa"
{
	ParentBody "HIP 109139"
	Class      "B8V"
	MassSol    3.2
	RadSol     2.7
	Luminosity 74
	Teff       11284
	FeH        -0.08
	Age        0.124

	Orbit
	{
		PeriodDays      77
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 109139 B"
{
	ParentBody "HIP 109139"
	Class      ""
	MassSol    1
	Teff       5710

	Orbit
	{
		PeriodDays      77
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 垒壁阵六(**)
Star	"HIP 111123 A"
{
	ParentBody     "HIP 111123"
	Class	         "A0IVs"
	MassSol        2.87
	RadSol         2.87
	Luminosity     105
	Teff           10115
	FeH            0.44
	Age            30

	Orbit
	{
		PeriodDays      654
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 111123 B"
{
	ParentBody     "HIP 111123"
	Class	         "A6.9 V"

	Orbit
	{
		PeriodDays      654
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 垒壁阵八(SB**)
Star	"HIP 114724 A"
{
	ParentBody     "HIP 114724"
	Class	         "M1.5III"
	MassSol        1
	RadSol         34.77
	Luminosity     207.7
	Teff           3715
	Age            10.97

	Orbit
	{
		PeriodDays      2500
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 114724 B"
{
	ParentBody     "HIP 114724"
	Class	         "F1.7 V"

	Orbit
	{
		PeriodDays      2500
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 垒壁阵九(**)
Star	"HIP 118209 A"
{
	ParentBody     "HIP 118209"
	Class	         "G8III"
	MassSol        2.39
	RadSol         9.73
	Luminosity     56
	Teff           5014
	FeH            0.03
	Age            0.71

	Orbit
	{
		Period          695
		Eccentricity    0.766
		Inclination     81
		AscendingNode   81.1
		Epoch           2652427.74272765
		ArgOfPericenter 289.6
		MeanAnomaly     0
	}
}

Star	"HIP 118209 B"
{
	ParentBody     "HIP 118209"
	Class	         "A8.2 V"

	Orbit
	{
		Period          695
		Eccentricity    0.766
		Inclination     81
		AscendingNode   81.1
		Epoch           2652427.74272765
		ArgOfPericenter 109.6
		MeanAnomaly     0
	}
}

// 垒壁阵十一(RS**)
Remove "33 Psc A"{ParentBody "33 Psc"}
Remove "33 Psc B"{ParentBody "33 Psc"}
Star "HIP 443 A"
{
	ParentBody "HIP 443"
	Class      "K0 III"
	MassSol    0.83
	RadSol     7
	Luminosity 24
	Teff       4736
	FeH        -0.12
	Age        0.0048

	Orbit
	{
		PeriodDays      72.93
		Eccentricity    0.272
		Epoch           2422530.330
		ArgOfPericenter 157.71
		MeanAnomaly     0
		//SemiAmplitude   16.43
	}
}

Star "HIP 443 B"
{
	ParentBody "HIP 443"
	Class      ""
	MassSol    0.76

	Orbit
	{
		PeriodDays      72.93
		Eccentricity    0.272
		Epoch           2422530.330
		ArgOfPericenter 337.71
		MeanAnomaly     0
	}
}

// 羽林军一(EB**)
Star "HIP 108797 A"
{
	ParentBody "HIP 108797"
	Class      "A2V"
	RadSol     2 // ?

	Orbit
	{
		PeriodDays      0.945
		Eccentricity    0
		Epoch           2436814.418
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   97.9
	}
}

Star "HIP 108797 B"
{
	ParentBody "HIP 108797"
	Class      "K0III"
	RadSol     5 // ?
	Oblateness 0

	Orbit
	{
		PeriodDays      0.945
		Eccentricity    0
		Epoch           2436814.418
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 羽林军三(**)
Star "HIP 109786 A"
{
	ParentBody "HIP 109786"
	Class      "K0III"
	RadSol     7.88
	Luminosity 33.93
	Teff       4750
	FeH        -0.13

	BinaryOrbit
	{
		Separation      373.745
	}
}

Star "HIP 109786 B"
{
	ParentBody "HIP 109786"
	Class      "F8V"
	RadSol     1.76
	Luminosity 6.319
	Teff       6899

	/*BinaryOrbit
	{
		Separation      373.745
	}*/
}

// 羽林军十一(PM**)
Star	"HIP 111449 A"
{
	ParentBody     "HIP 111449"
	Class	         "F7V"
	MassSol        1.4
	RadSol         1.49
	Luminosity     3.581
	Teff           6514
	FeH            0.08
	Age            0.9 // 0.25

	BinaryOrbit
	{
		Period          1330
		Separation      139
	}
}

Star	"HIP 111449 B"
{
	ParentBody     "HIP 111449"
	Class	         "G8.6 V"

	/*BinaryOrbit
	{
		Period          1330
		Separation      139
	}*/
}

// 羽林军十五()
Remove "53 Aqr A" {ParentBody "53 Aqr"}
Remove "53 Aqr B" {ParentBody "53 Aqr"}
Star "53 Aqr A/BD-17 6521/HD 212698 A/HR 8545/LTT 9026/SAO 165078"
{
	ParentBody "GJ 859"
	Class      "G1V"
	MassSol    1.01
	RadSol     1.11
	Luminosity 1.39
	Teff       5922
	FeH        -0.1
	Age        0.18

	Orbit
	{
		Period          3500
		Eccentricity    0.9
		Inclination     44.13
		AscendingNode   294.55
		Epoch           2459945.10397006
		ArgOfPericenter 331.4
		MeanAnomaly     0
	}
}

Star "53 Aqr B/BD-17 6520/HD 212697 B/HR 8544/LTT 9025/SAO 165077"
{
	ParentBody "GJ 859"
	Class      "G5V"
	MassSol    0.99
	Teff       5811
	FeH        -0.19

	Orbit
	{
		Period          3500
		Eccentricity    0.9
		Inclination     44.13
		AscendingNode   294.55
		Epoch           2459945.10397006
		ArgOfPericenter 151.4
		MeanAnomaly     0
	}
}

// 羽林军十九(PM**)
Star "HIP 111200 A"
{
	ParentBody "HIP 111200"
	Class      "A9"
	MassSol    1.734
	RadSol     2.059
	Luminosity 11.73
	Teff       7477
	FeH        0.014
	Age        1.086

	Orbit
	{
		PeriodDays      829.976
		Eccentricity    0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 111200 B"
{
	ParentBody "HIP 111200"
	Class      "F0" // ?

	Orbit
	{
		PeriodDays      829.976
		Eccentricity    0
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 羽林军廿三(a2***)
Barycenter "HIP 113031 AB"
{
	ParentBody "HIP 113031"
	BinaryOrbit
	{
		Period          9.479
		Eccentricity    0.862
		Inclination     29.8
		AscendingNode   40.9
		Epoch           2455211.19983166
		ArgOfPericenter 250.7
		MeanAnomaly     0
	}
}

Star "HIP 113031 A"
{
	ParentBody "HIP 113031 AB"
	Class      "B8IV"

	Orbit
	{
		PeriodDays      3.429616
		Eccentricity    0.05
		Epoch           2452909.15
		ArgOfPericenter 266.5
		MeanAnomaly     0
		//SemiAmplitude   95
	}
}

Star "HIP 113031 B"
{
	ParentBody "HIP 113031 AB"
	Class      "F1.3 V"

	Orbit
	{
		PeriodDays      3.429616
		Eccentricity    0.05
		Epoch           2452909.15
		ArgOfPericenter 86.5
		MeanAnomaly     0
		//SemiAmplitude   113
	}
}

Star "HIP 113031 C"
{
	ParentBody "HIP 113031"
	Class      "A6.5 V"

	/*BinaryOrbit
	{
		Period          9.479
		Eccentricity    0.862
		Inclination     29.8
		AscendingNode   40.9
		Epoch           2455211.19983166
		ArgOfPericenter 70.7
		MeanAnomaly     0
	}*/
}

// 羽林军廿六(PM**)
Star "HIP 113136 A"
{
	ParentBody "HIP 113136"
	Class      "A3V"
	MassSol    2.51
	RadSol     2.4
	Luminosity 48
	Teff       8650
	FeH        -0.21
	Age        0.3

	Orbit // ?
	{
		PeriodDays      483
		Eccentricity    0.12
		Inclination     41
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

/*Star "HIP 113136 B" // Hipparcos
{
	ParentBody "HIP 113136"
	Class      ""
	MassSol    0.07

	Orbit // ?
	{
		PeriodDays      483
		Eccentricity    0.12
		Inclination     41
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}*/

Star "HIP 113136 B" // Infrared interferometric observations
{
	ParentBody "HIP 113136"
	Class      "G5"

	Orbit // ?
	{
		PeriodDays      483
		Eccentricity    0.12
		Inclination     41
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 羽林军廿九(**)
Star "HIP 114375 A/HD 218640"
{
	ParentBody "HIP 114375"
	Class      "G3II"
	MassSol    2.9
	Teff       5640
	FeH        0.27
	Age        0.32

	Orbit
	{
		Period          201
		Epoch           2455196.95538591
		ArgOfPericenter 315.1
		MeanAnomaly     0
	}
}

Star "HIP 114375 B/HD 218641"
{
	ParentBody "HIP 114375"
	Class      "A2V"
	MassSol    2
	Teff       8912

	Orbit
	{
		Period          201
		ArgOfPericenter 135.1
		MeanAnomaly     0
	}
}

// 羽林军三十(**)
Star	"HIP 114119 A"
{
	ParentBody     "HIP 114119"
	Class	         "G8 III"
	Teff           4900
	FeH            -0.14

	BinaryOrbit
	{
		Separation      16.5001
	}
}

Star	"HIP 114119 B"
{
	ParentBody     "HIP 114119"
	Class	         "F4 V"

	/*BinaryOrbit
	{
		Separation      16.5001
	}*/
}

// 羽林军卅一(*)
Star	"HIP 116247 A"
{
	ParentBody     "HIP 116247"
	Class	         "A0 V"

	BinaryOrbit
	{
		Separation      75.6
	}
}

Star	"HIP 116247 B"
{
	ParentBody     "HIP 116247"
 	Class	         "A8.2 V"

	BinaryOrbit
	{
		Separation      75.6
	}
}

// 羽林军卅五(**)
Star "HIP 115404 A"
{
	ParentBody "HIP 115404"
	Class      "A2V"

	Orbit
	{
		Period          64.62
		Eccentricity    0.14
		Inclination     77.6
		AscendingNode   276.3
		Epoch           2430101.16390767
		ArgOfPericenter 174.6
		MeanAnomaly     0
	}
}

Star "HIP 115404 B"
{
	ParentBody "HIP 115404"
	Class      "A7V"

	Orbit
	{
		Period          64.62
		Eccentricity    0.14
		Inclination     77.6
		AscendingNode   276.3
		Epoch           2430101.16390767
		ArgOfPericenter 354.6
		MeanAnomaly     0
	}
}

// 羽林军卅六(SB***)
Remove "94 Aqr A"{ParentBody "94 Aqr"}
Remove "94 Aqr Aa"{ParentBody "94 Aqr A"}
Remove "94 Aqr Ab"{ParentBody "94 Aqr A"}
Remove "94 Aqr B"{ParentBody "94 Aqr"}
Barycenter "HIP 115126 A"
{
	ParentBody "94 Aqr"
	BinaryOrbit
	{
		Separation      289.9
	}
}

Star "HIP 115126 Aa"
{
	ParentBody "HIP 115126 A"
	Class      "G8.5IV"
	MassSol    1.07
	Teff       5461
	FeH        0.23

	Orbit
	{
		Period          6.321
		//SemiMajorAxis   1.6581
		Eccentricity    0.173
		Inclination     44.5
		AscendingNode   341.9
		Epoch           2456037.37768530
		ArgOfPericenter 208.3
		MeanAnomaly     0
	}
}

Star "HIP 115126 Ab"
{
	ParentBody "HIP 115126 A"
	Class      "KV"
	MassSol    0.8
	Teff       4670

	Orbit
	{
		Period          6.321
		//SemiMajorAxis   1.6581
		Eccentricity    0.173
		Inclination     44.5
		AscendingNode   341.9
		Epoch           2456037.37768530
		ArgOfPericenter 28.3
		MeanAnomaly     0
	}
}

Star "羽林军卅六/HIP 115125 B"
{
	ParentBody "94 Aqr"
	Class      "K2V"
	Teff       5136
	FeH        0.24

	/*BinaryOrbit
	{
		Separation      289.9
	}*/
}

// 羽林军卅七(**)
Remove "PSI3 Aqr A"{ParentBody "PSI3 Aqr"}
Remove "PSI3 Aqr B"{ParentBody "PSI3 Aqr"}
Star	"HIP 115115 A"
{
	ParentBody     "HIP 115115"
	Class	         "A0 V"
	RadSol         2
	Luminosity     70

	BinaryOrbit
	{
		Separation      120
	}
}

Star	"HIP 115115 B"
{
	ParentBody     "HIP 115115"
	Class	         "G0.7 V"

	/*BinaryOrbit
	{
		Separation      120
	}*/
}

// 羽林军卅九(PM***)
Remove "91 Aqr A"{ParentBody "91 Aqr"}
Remove "91 Aqr B"{ParentBody "91 Aqr (BC)"}
Remove "91 Aqr C"{ParentBody "91 Aqr (BC)"}
Remove "91 Aqr (BC)"{ParentBody "91 Aqr"}
Star "羽林军卅九/HIP 114855 A/BD-09 6156/FK5 1608/HD 219449 A/HR 8841/LTT 9437/SAO 146598"
{
	ParentBody "91 Aqr"
	Class      "K1III"
	MassSol    1.38
	RadSol     10.96
	Luminosity 54.3
	Teff       4730
	FeH        -0.14
	Age        2.98

	/*BinaryOrbit
	{
		Separation      2386.8
	}*/
}

Barycenter "HD 219430 BC/BD-09 6155/LTT 9434/SAO 146596"
{
	ParentBody "91 Aqr"
	BinaryOrbit
	{
		Separation      2386.8
	}
}

Star "HD 219430 B"
{
	ParentBody "HD 219430 BC"
	Class      "K3V"
	MassSol    0.7

	BinaryOrbit
	{
		Separation      13.7701
	}
}

Star "HD 219430 C"
{
	ParentBody "HD 219430 BC"
	Class      ""
	MassSol    0.7

	/*BinaryOrbit
	{
		Separation      13.7701
	}*/
}

// 羽林军四二(**)
Star "HIP 113996 A"
{
	ParentBody "HIP 113996"
	Class      "F2Vn"

	Orbit
	{
		Period          21.84
		Eccentricity    0.3878
		Inclination     48.01
		AscendingNode   204.87
		Epoch           2445374.86217629
		ArgOfPericenter 262.83
		MeanAnomaly     0
	}
}

Star "HIP 113996 B"
{
	ParentBody "HIP 113996"
	Class      "F2V"

	Orbit
	{
		Period          21.84
		Eccentricity    0.3878
		Inclination     48.01
		AscendingNode   204.87
		Epoch           2445374.86217629
		ArgOfPericenter 82.83
		MeanAnomaly     0
	}
}

// 羽林军四五(PM***)
Remove "OME2 Aqr A"{ParentBody "OME2 Aqr"}
Remove "OME2 Aqr B"{ParentBody "OME2 Aqr"}
Barycenter	"HIP 116971 AB"
{
	ParentBody     "HIP 116971"
	BinaryOrbit
	{
		Separation      259.35
	}
}

Star	"HIP 116971 A"
{
	ParentBody     "HIP 116971 AB"
	Class	         "B9 V"
	RadSol         1.94
	Luminosity     37
	Teff           10504

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00983162
		Eccentricity    0
		Inclination     117.69
		AscendingNode   163.736
		ArgOfPericenter 179.199
		MeanAnomaly     109.587
	}
}

Star	"HIP 116971 B"
{
	ParentBody     "HIP 116971 AB"
	Class	         "F2.1 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.00983162
		Eccentricity    0
		Inclination     117.69
		AscendingNode   163.736
		ArgOfPericenter 359.199
		MeanAnomaly     109.587
	}
}

Star "HIP 116971 C"
{
	ParentBody "HIP 116971"
	Class      "K"

	/*BinaryOrbit
	{
		Separation      259.35
	}*/
}

// 鈇钺二(可能是双星)
/*Star	"HIP 117089 A"
{
	ParentBody     "HIP 117089"
	Class	         "B9 V"
	MassSol        3
	RadSol         2.7
	Luminosity     151.88
	Teff           11555

	Orbit
	{
		RefPlane        "Equator"
		Period          0.902272
		Eccentricity    0.469324
		Inclination     29.9097
		AscendingNode   173.471
		ArgOfPericenter 33.3213
		MeanAnomaly     -169.644
	}
}

Star	"HIP 117089 B(?)"
{
	ParentBody     "HIP 117089"
	Class	         "F3 V"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.902272
		Eccentricity    0.469324
		Inclination     29.9097
		AscendingNode   173.471
		ArgOfPericenter 213.321
		MeanAnomaly     -169.644
	}
}*/

// 北落师门(***)
Star	"北落师门/Fomalhaut A/ALF PsA A/24 PsA A/CPD-30 6685/FK5 867/Gl 881/HD 216956/HIP 113368/HR 8728/SAO 191524"
{
	ParentBody     "24 PsA"
	Class	         "A3V"
	MassSol        1.92
	RadSol         1.842
	Luminosity     16.63
	Teff           8590
	FeH            -0.03 // -0.34
	Age            0.44

	Orbit
	{
		RefPlane        "Static"
	}
}

Star	"TW PsA/Fomalhaut B/ALF PsA B/24 PsA B/Gl 879/HR 8721/CD -32°17321/HD 216803/LTT 9283/GCTP 5562.00/SAO 214197/CPD-32 6550/HIP 113283"
{
	ParentBody     "24 PsA"
	Class	         "K5Vp"
	MassSol        0.725
	RadSol         0.629
	Luminosity     0.19
	Teff           4711
	RotationPeriod 247.2
	Age            0.44

	Orbit
	{
		SemiMajorAxis   57754.144
		ArgOfPericenter 186
		MeanAnomaly     0
	}
}

Star	"LP 876-10/Fomalhaut C/ALF PsA C/24 PsA C/2MASS J22480446-2422075/NLTT 54872/GSC 06964-01226"
{
	ParentBody     "24 PsA"
	Class	         "M4V"
	MassSol        0.18
	Luminosity     0.004603
	Teff           3132
	RotationPeriod 11.184

	Orbit
	{
		SemiMajorAxis   158823.896
		ArgOfPericenter 338
		MeanAnomaly     0
	}
}

// 天纲(**)
Remove "DEL PsA A"{ParentBody "DEL PsA"}
Remove "DEL PsA B"{ParentBody "DEL PsA"}
Star "HIP 113246 1" // 不冲突
{
  ParentBody "HIP 113246"
  Class      "G8 III"
  MassSol    1.42
	Luminosity 52
	Teff       4828
	FeH        -0.21
	Age        3.74

  BinaryOrbit
  {
		Separation      274.04
  }
}

Star "HIP 113246 2"
{
  ParentBody "HIP 113246"
  Class      "G8IV"

	/*BinaryOrbit
  {
		Separation      274.04
  }*/
}

// 螣蛇三(SB***)
Barycenter	"HIP 107533 A"
{
	ParentBody     "HIP 107533"
	Orbit
	{
		Epoch           2450083.56460298
		Separation      34.0073
		PositionAngle   129
	}
}

Star	"HIP 107533 Aa"
{
	ParentBody     "HIP 107533 A"
	Class	         "B2.5 III"
	MassSol        8.4
	RadSol         7.1
	Luminosity     8442 // = LumBol
	LumBol         8442
	Teff           20815
	FeH            0.04
	Age            0.0332

	Orbit
	{
		PeriodDays      72.0162
		Eccentricity    0.34
		Epoch           2428410.6
		ArgOfPericenter 58.1
		MeanAnomaly     0
		//SemiAmplitude   78
	}
}

Star	"HIP 107533 Ab"
{
	ParentBody     "HIP 107533 A"
	Class	         "B5.9 IV"

	Orbit
	{
		PeriodDays      72.0162
		Eccentricity    0.34
		Epoch           2428410.6
		ArgOfPericenter 238.1
		MeanAnomaly     0
	}
}

Star	"HIP 107533 B"
{
	ParentBody     "HIP 107533"
	Class	         "A2V" // ?

	/*Orbit
	{
		Epoch           2450083.56460298
		Separation      34.0073
		PositionAngle   129
	}*/
}

// 螣蛇四(SB**)
Star	"HIP 107136 A"
{
	ParentBody     "HIP 107136"
	Class	         "B3IV"
	MassSol        10.1
	RadSol         5.6
	Luminosity     16538
	Teff           18360
	Age            0.0251

	Orbit
	{
		PeriodDays      26.33
		Eccentricity    0
		Epoch           2431306.5
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 107136 B"
{
	ParentBody     "HIP 107136"
	Class	         "A0 V"

	Orbit
	{
		PeriodDays      26.33
		Eccentricity    0
		Epoch           2431306.5
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

// 螣蛇七(SB***)
Barycenter	"HIP 106886 A"
{
	ParentBody     "HIP 106886"
	BinaryOrbit
	{
		RefPlane        "Equator"
		Period          4.12489
		Eccentricity    0.774547
		Inclination     -164.321
		AscendingNode   109.764
		ArgOfPericenter 1.99756
		MeanAnomaly     -111.981
	}
}

Star	"HIP 106886 Aa"
{
	ParentBody     "HIP 106886 A"
	Class	         "O6Vf"

	Orbit
	{
		PeriodDays      3.7
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 106886 Ab"
{
	ParentBody     "HIP 106886 A"
	Class	         "O9V"

	Orbit
	{
		PeriodDays      3.7
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star	"HIP 106886 B"
{
	ParentBody     "HIP 106886"
	Class	         "O9.1 V"

	/*BinaryOrbit
	{
		RefPlane        "Equator"
		Period          4.12489
		Eccentricity    0.774547
		Inclination     -164.321
		AscendingNode   109.764
		ArgOfPericenter 181.998
		MeanAnomaly     -111.981
	}*/
}

// 螣蛇九(dS**)
Star	"HIP 109857 Aa"
{
	ParentBody     "HIP 109857"
	Class	         "F0V(SrII)"
	MassSol        1.64
	RadSol         1.86
	Luminosity     11.65
	Teff           7514
	FeH            0.08
	Age            1.097

	BinaryOrbit
	{
		Period          17
		Separation      8.6
		Eccentricity    0.7
		ArgOfPericenter 270
		MeanAnomaly     0
	}
}

Star	"HIP 109857 Ab"
{
	ParentBody     "HIP 109857"
	Class	         "K8"
	MassSol        0.57

	/*BinaryOrbit
	{
		Period          17
		Separation      8.6
		Eccentricity    0.7
		ArgOfPericenter 90
		MeanAnomaly     0
	}*/
}

// 螣蛇十()
Star	"HIP 110538 A"
{
	ParentBody     "HIP 110538"
	Class	         "G8III"
	MassSol        0.97
	RadSol         10.96
	Luminosity     57.7
	Teff           4803
	FeH            -0.33
	Age            6.76

	BinaryOrbit
	{
		Separation      10.4198
	}
}

Star	"HIP 110538 B"
{
	ParentBody     "HIP 110538"
	Class	       "F2.5 V"

	/*BinaryOrbit
	{
		Separation      10.4198
	}*/
}

// 螣蛇十一(**)
Remove "SIG Cas A"{ParentBody "SIG Cas"}
Remove "SIG Cas B"{ParentBody "SIG Cas"}
Star "HIP 118243 A"
{
	ParentBody "HIP 118243"
	Class      "B2IV"
	MassSol    12
	RadSol     11.3
	Luminosity 25000
	Teff       21000
	Age        0.0158

	Orbit
	{
		Separation      4200
	}
}

Star "HIP 118243 B"
{
	ParentBody "HIP 118243"
	Class      "B3 V" // B5?

	/*Orbit
	{
		Separation      4200
	}*/
}

// 螣蛇十四(EB*******)
/*
AR Cassiopeiae is more complicated; it contains three main subsets:
AR Cassiopeiae AB: The contains three stars: Aa and Ab, a binary orbiting each other every 6 days, and B, orbiting A every 545 years.
AR Cassiopeiae CD: These pair of binary stars orbit each other once every 2,200 years, and orbit component AB in 438,000 years.
AR Cassiopeiae FG: This is another binary, with a period of 58,000 years. It orbits AB every 381,000 years.
*/
Barycenter "HIP 115990 AB"
{
	ParentBody "HIP 115990"
	Orbit
	{
		RefPlane "Static"
	}
}

Barycenter "HIP 115990 A"
{
	ParentBody "HIP 115990 AB"
	Orbit
	{
		Period          544.978
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 115990 A1"
{
	ParentBody "HIP 115990 A"
	Class      "B4V"
	AbsMagn    -1.87
	AbsMagnBol -3.56
	MassSol    5.9 // 5.64
	RadSol     5.05
	Teff       17200

	Orbit
	{
		PeriodDays      6.066317
		Eccentricity    0.24
		Inclination     85.34
		Epoch           2436847.9404
		ArgOfPericenter 221.82
		MeanAnomaly     0
	}
}

Star "HIP 115990 A2"
{
	ParentBody "HIP 115990 A"
	Class      "A6V"
	AbsMagn    2.2
	AbsMagnBol 2.18
	MassSol    1.86 // 2.24
	RadSol     1.6
	Teff       8150

	Orbit
	{
		PeriodDays      6.066317
		Eccentricity    0.24
		Inclination     85.34
		Epoch           2436847.9404
		ArgOfPericenter 41.82
		MeanAnomaly     0
	}
}

Star "HIP 115990 B"
{
	ParentBody "HIP 115990 AB"
	Class      ""
	MassSol    1.43

	Orbit
	{
		Period          544.978
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 115990 CD"
{
	ParentBody "HIP 115990"
	Orbit
	{
		Period          438329
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 115990 C"
{
	ParentBody "HIP 115990 CD"
	Class      "B9V"
	MassSol    1.8

	Orbit
	{
		Period          2194
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 115990 D"
{
	ParentBody "HIP 115990 CD"
	Class      ""
	MassSol    1.28

	Orbit
	{
		Period          2194
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Barycenter "HIP 115990 FG"
{
	ParentBody "HIP 115990"
	Orbit
	{
		Period          380636
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

Star "HIP 115990 F"
{
	ParentBody "HIP 115990 FG"
	Class      "F7IV"
	MassSol    1.01

	Orbit
	{
		Period          58104
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star "HIP 115990 G"
{
	ParentBody "HIP 115990 FG"
	Class      "F9V"
	MassSol    1

	Orbit
	{
		Period          58104
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 螣蛇十八(V**)
Barycenter	"HIP 115022 A"
{
	ParentBody     "HIP 115022"
	Orbit
	{
		Epoch           2457023.16637981
		Separation      1287
		PositionAngle   164
	}
}

Star	"HIP 115022 Aa"
{
	ParentBody     "HIP 115022 A"
	Class	         "M2.5IIIBa0.5"
	RadSol         30
	Teff           3616
	FeH            0.04

	Orbit
	{
		RefPlane        "Equator"
		Period          0.441038
		Eccentricity    0
		Inclination     165.867
		AscendingNode   154.667
		ArgOfPericenter 175.836
		MeanAnomaly     17.4734
	}
}

Star	"HIP 115022 Ab(?)"
{
	ParentBody     "HIP 115022 A"
	Class	         "WD"

	Orbit
	{
		RefPlane        "Equator"
		Period          0.441038
		Eccentricity    0
		Inclination     165.867
		AscendingNode   154.667
		ArgOfPericenter 355.836
		MeanAnomaly     17.4734
	}
}

Star	"HIP 115022 B"
{
	ParentBody     "HIP 115022"
	Class	         "A0.6 V"

	/*Orbit
	{
		Epoch           2457023.16637981
		Separation      1287
		PositionAngle   164
	}*/
}

// 螣蛇十九(RS**)
Star	"HIP 116584 A"
{
	ParentBody     "HIP 116584"
	Class	         "G8III"
	MassSol        1.24
	RadSol         7.787
	Luminosity     28.8
	Teff           4800
	FeH            -0.56
	RotationPeriod 1296

	Orbit
	{
		PeriodDays      20.5212
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

Star	"HIP 116584 B"
{
	ParentBody     "HIP 116584"
	Class	         ""
	MassSol        0.15

	Orbit
	{
		PeriodDays      20.5212
		ArgOfPericenter 180
		MeanAnomaly     0
	}
}

// 螣蛇二十(**)
// 具体轨道不知道
Remove "PSI And A"{ParentBody "PSI And"}
Remove "PSI And B"{ParentBody "PSI And"}
Star	"HIP 117221 A"
{
	ParentBody     "HIP 117221"
	Class	         "G5Ib"
	MassSol        5.4
	RadSol         686
	Teff           4990
	FeH            0.1
	Age            0.079

	Orbit
	{
		RefPlane        "Static"
	}
}

Star	"HIP 117221 B"
{
	ParentBody     "HIP 117221 A"
	Class	         "B9V"

	Orbit
	{
		SemiMajorAxis   170.8
	}
}

Star	"HIP 117221 C"
{
	ParentBody     "HIP 117221 A"
	Class	         "A4.1 V"

	Orbit
	{
		SemiMajorAxis   85.4052
	}
}
