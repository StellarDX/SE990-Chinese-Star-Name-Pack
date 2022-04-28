Remove "EPS Tau"
Star "毕宿一/EPS Tau/74 Tau/Ain/Oculus Boreus/BD+18°640/CCDM J04286+1911/FK5 164/GC 5430/HD 28305/HIP 20889/HR 1409/SAO 93954"
{
  RA       4 28 37.16
  Dec      19 10 48.8
  AppMagn  3.53

  Class    "K0III"

  Dist     47.5285166 // 45
  AbsMagn  0.145

  MassSol  2.7
  RadSol   12.692
  Luminosity 97
  Teff     4901
  FeH      0.17
  Age      0.625
}

Remove "DEL3 Tau"
StarBarycenter "毕宿二/Cleeia/DEL3 Tau/68 Tau/BD+17°719/HD 27962/HIP 20648/HR 1389/SAO 93923/ADS 3206"
{
  RA       4 25 29.55
  Dec      17 55 39.8
  AppMagn  4.3

  Class    "A1V"

  Dist     45.3988 // 46
  AbsMagn  1.02
}

Remove "DEL1 Tau"
StarBarycenter "毕宿三/Secunda Hyadum/DEL1 Tau/61 Tau/BD+17°712/FK5 162/HD 27697/HIP 20455/HR 1373/SAO 93897"
{
  RA       4 22 56.25
  Dec      17 32 32.5
  AppMagn  3.75

  Class    "G9.5III CN0.5"

  Dist     46.9325 // 48
  AbsMagn  0.36
}

Remove "GAM Tau"
Star "毕宿四/Prima Hyadum/GAM Tau/54 Tau/BD+15°612/FK5 159/HD 27371/HIP 20205/HR 1346/SAO 93868/GC 5226/WDS 04198+1538"
{
  RA       4 19 47.77
  Dec      15 37 39
  AppMagn  3.654

  Class    "G9IIIb CN0.5"

  Dist     47.2366547 // 47
  AbsMagn  0.22

  MassSol  2.7
  RadSol   13.4
  Luminosity 85
  Teff     4844
  FeH      0.11
  RotationDays 253
  Age      0.43
}

Remove "ALF Tau"
StarBarycenter "毕宿五/Aldebaran/87 Tau/ALF Tau/BD+16°629/GJ 171.1/GJ 9159/HD 29139/HIP 21421/HR 1457/SAO 94027"
{
  RA       4 35 55.33
  Dec      16 30 29.4
  AppMagn  0.85

  Class    "K5III"

  Dist     20
  AbsMagn  -0.7
}

Remove "TET1 Tau"
Remove "TET2 Tau"
/*StarBarycenter "TET Tau"
{
  RA       4 28 34.66
  Dec      15 57 43.3
  AppMagn  3.8

  Class    "G9III Fe-0.5"

  Dist     46.55 // Average
  AbsMagn  0.42
}*/
StarBarycenter "毕宿六/TET1 Tau/77 Tau/BD+15 631/HD 28307/HIP 20885/HR 1411/SAO 93955"
{
  RA      4 28 34.66
  Dec     15 57 43.3
	Dist    47.2393

	ParentBody "TET Tau"
	Orbit
	{
		PeriodDays      5997
		Eccentricity    0.64
		ArgOfPericenter 0
		MeanAnomaly     0
		//SemiAmplitude   8.39
	}
}
StarBarycenter "毕宿增十三/TET2 Tau/Chamukuy/78 Tau/BD+15 632/HD 28319/HIP 20894/HR 1412/SAO 93957"
{
	RA      04 28 39.9
	Dec     +15 52 14.6
	Dist    46.0123

	ParentBody "TET Tau"
	Orbit
	{
		PeriodDays      5997
		Eccentricity    0.64
		ArgOfPericenter 180
		MeanAnomaly     0
		//SemiAmplitude   8.39
	}
}

Remove "71 Tau"
StarBarycenter "毕宿七/Polyxo/71 Tau/V777 Tau/BD+15°625/GC 5375/HD 28052/HIP 20713/HR 1394/SAO 93932"
{
  RA       4 26 20.9
  Dec      15 37 5.3
  AppMagn  4.45

  Class    "A6Vn"

  Dist     48 // 44.6
  AbsMagn  0.99
}

Remove "LAM Tau"
StarBarycenter "毕宿八/LAM Tau/35 Tau/BD+12 539/FK5 150/HD 25204/HIP 18724/HR 1239/SAO 93719"
{
  RA       4 0 40.81
  Dec      12 29 25
  AppMagn  3.4

  Class    "B4IV"

  Dist     148
  AbsMagn  -2.46
}
