Remove "c Ori"
StarBarycenter "伐一/c Ori/BD-04 1185/CCDM J05354-0450AB/GC 6934/HIP 26237/HR 1892/HD 37018/NSV 2318/SAO 132320/WDS J05354-0450AB"
{
  CenterOf "NGC 1977"
  RA      5 35 21.89
  Dec     -4 50 22.2
  AppMagn 4.55

  Class   "B1V"

  Dist    240.963841 // 270
  AbsMagn -2.61
}

Remove "IOT Ori"
StarBarycenter "伐三/Hatysa/IOT Ori/Na’ir al Saif/BD-06 1241/FK5 209/SAO 132323/ADS 4193/WDS J05354-0555"
{
  RA      5 35 24.72
  Dec     -5 54 39.9
  AppMagn 2.75

  Class   "O9IIIvar"

  Dist    412
  AbsMagn -6.52
}

// ----------Theta2 Orionis sextuple system(Or septuple?)---------- //

Remove "TET2 Ori"
StarBarycenter "伐二/TET2 Ori A/STF 4016/WDS J05354-0525/ADS 4188/43 Ori/HR 1897/BD-05 1319/HD 37041/SAO 132321/HIP 26235/CCDM 05353-0524E"
{
  RA      5 35 21.62
  Dec     -5 25 1.9
  AppMagn 5

  Class   "O9.5IVp"

  Dist    429.221409 // 470
  AbsMagn -3.82
}

// Wider companions B,C,D at >52" are ignored/just cluster members?

Star "TET2 Ori B/BD-05 1320/HD 37042/SAO 132322/CCDM 05353-0524F"
{
  RA      5 35 26.41
  Dec     -5 25 0.7
  AppMagn 6.38

  Class   "B2" // B4

  Dist    429.221409 // 470

  MassSol 14.8
  RadSol  4.3
  Luminosity 12300
  Teff    29300
  Age     0.002
}

StarBarycenter "TET2 Ori C/V361 Ori/BD-05 1326/HD 37062/SAO 132329/S 490A/CCDM 05353-0524G"
{
  RA      5 35 31.44
  Dec     -5 25 16.4
  AppMagn 8.18

  Class   "B4V"

  Dist    429.221409 // 470
}
