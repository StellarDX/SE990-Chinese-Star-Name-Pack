// 轸宿一(PM**)
Star "HIP 59803 A"
{
  ParentBody "HIP 59803"
  Class      "B8III"
  MassSol    4.2
  Luminosity 331
  Age        0.16

  BinaryOrbit
  {
    Period          158
    Separation      50
  }
}

Star "HIP 59803 B"
{
  ParentBody "HIP 59803"
  Class      "K5" // M5V
  MassSol    0.8

  /* Orbit
  {
    Period          158
    //SemiMajorAxis   50
  } */
}

// 轸宿三
// Although the two stars share a common proper motion/the significant differences in their estimated ages suggests that they may not be physically connected.
Remove "Algorab A"{ParentBody "Algorab"}
Remove "Algorab B"{ParentBody "Algorab"}

// 长沙(Be***)
Star "长沙/HD 107348/HIP 60189/HR 4696/SAO 180700" // Itself binary?
{
  ParentBody "5 Crv"
  Class      "B8V"
  MassSol    3.39
  RadSol     4.57
  Luminosity 200
  Teff       11561

  Orbit
  {
    RefPlane "Static"
  }
}

Barycenter	"HIP 60157/SAO 180695/HD 107295/HR 4691"
{
	ParentBody     "5 Crv"
	Orbit
	{
		SemiMajorAxis   50000
    ArgOfPericenter -60
    MeanAnomaly     0
	}
}

Star	"HIP 60157 A"
{
	ParentBody     "HIP 60157"
	Class	         "K0 III" // G3III

	Orbit
	{
		RefPlane        "Equator"
		Period          2.02217
		Eccentricity    0.296359
		Inclination     -146.499
		AscendingNode   28.2034
		ArgOfPericenter -62.2437
		MeanAnomaly     167.227
	}
}

Star	"HIP 60157 B"
{
	ParentBody     "HIP 60157"
	Class	         "F"

	Orbit
	{
		RefPlane        "Equator"
		Period          2.02217
		Eccentricity    0.296359
		Inclination     -146.499
		AscendingNode   28.2034
		ArgOfPericenter 117.756
		MeanAnomaly     167.227
	}
}

// 右辖(PM**)
Star "HIP 59199 A"
{
  ParentBody "HIP 59199"
  Class      "F1V"
  MassSol    1.39
	Luminosity 4.91
	Teff       7041
	FeH        -0.19

  BinaryOrbit
  {
    Separation      46.314
  }
}

Star "HIP 59199 B"
{
  ParentBody "HIP 59199"
  Class      "M4V"

  /* Orbit
  {
    //SemiMajorAxis   46.314
  } */
}

// 青丘一(**)
Remove "BET Hya A"{ParentBody "BET Hya"}
Remove "BET Hya B"{ParentBody "BET Hya"}
Star "HIP 57936 1"
{
  ParentBody "HIP 57936"
  Class      "B9IIIpSi" // kB8hB8HeA0VSi
  MassSol    3.36
  RadSol     3.89
  Luminosity 257
  Teff       10980
  RotationPeriod 56.55984
  Age        0.178

  BinaryOrbit
  {
    Epoch           2452275.01779566
    Separation      61.7503
    PositionAngle   28.5
  }
}

Star "HIP 57936 2"
{
  ParentBody "HIP 57936"
  Class      ""
  MassSol    3

  /* BinaryOrbit
  {
    Epoch           2452275.01779566
    Separation      61.7503
    PositionAngle   28.5
  } */
}

// 青丘三(**)
Star "17 Crt A/HD 100287/HR 4444/SAO 179968"
{
  ParentBody "HIP 56280"
  Class      "F8V"
  MassSol    1.2
  Luminosity 3.2
  Teff       6240
  FeH        0.04
  Age        3.95

  BinaryOrbit
  {
    Separation      241.3
  }
}

Star "17 Crt B/HD 100286/HR 4443/SAO 179967"
{
  ParentBody "HIP 56280"
  Class      "F8V"
  MassSol    1.18
  Luminosity 2.8
  Teff       6269
  Age        3.67

  /* BinaryOrbit
  {
    Separation      241.3
  } */
}

// 青丘六(PM**)
Remove "GJ 432 A"{ParentBody "GJ 432"}
Remove "GJ 432 B"{ParentBody "GJ 432"}
Star "HIP 56452 1"
{
  ParentBody "HIP 56452"
  Class      "K0V"
  RadSol     0.84
  LumBol     0.368
  Teff       5241
  FeH        -0.37
  Age        4.6 // 5.8

  BinaryOrbit
  {
    Period          1110
    Separation      162.5
  }
}

Star "WD 1132-325 B/VB 04"
{
  ParentBody "HIP 56452"
  Class      "DC8"

  /* Orbit
  {
    Period          1110
    Separation      162.5
  } */
}
