// Object * kap Boo  ---  Composite Object, Blend  ---  OID=@517289   (@@8914,3)  ---  coobox=1471 
// Object types: Double or Multiple Star,Star,X-ray Source,Composite Object, Blend 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=HIP&number=69481
Remove "KAP1 Boo" {ParentBody "KAP Boo"}
Remove "KAP2 Boo" {ParentBody "KAP Boo"}
Barycenter "KAP Boo AB"
{
	ParentBody      "KAP Boo"
	BinaryOrbit
	{
		Period          176767
		Separation      5441.55102057223 // 115.35 asec
	}
}

// Object * kap01 Boo  ---  Spectroscopic Binary  ---  OID=@517288   (@@8914,2)  ---  coobox=1471 
// Object types: Spectroscopic Binary,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star 
Barycenter "KAP1 Boo/HIP 69481/Gaia DR3 1511793067598402688/TIC 310362805/SBC9 807/17 Boo B/ADS 9173 B/AG+52 974/BD+52 1782B/CCDM J14135+5147B/CSI+52 1782 2/GC 19204/GCRV 8325/GEN# +1.00124674/GSC 03471-01251/HD 124674/HIC 69481/HR 5328/PPM 34402/ROT 2038/SAO 29045/TYC 3471-1251-1/UBV 12534/UBV M 20055/YZ 52 4464/WDS J14135+5147B/** STF 1821B/2MASS J14132780+5147162/PMSC 14099+5215B/PMSC 14099+5215Bab/uvby98 100124674/WEB 12107/Gaia DR2 1511793067598402688"
{
	ParentBody      "KAP Boo AB"
	BinaryOrbit // VB6_Izm2019  STF1821AB Gr.5
	{
		Period          10141.5547
		Separation      1426.54967978202 // 30.240 asec
		Eccentricity    0.687
		Inclination     93.3
		AscendingNode   51.2
		Epoch           2781007.606386513449252
		ArgOfPericenter 242.0
		MeanAnomaly     0
	}
}

Star "KAP1 Boo A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "KAP1 Boo"
	Class           "F2V"
	AbsMagn         3.34
	MassSol         1.40
	RadSol          1.43
	LumBol          3.801
	Teff            6699
	FeH             -0.09
	Age             0.900

	BinaryOrbit // VB6_Kiy2017b STF1821B Gr.9
	{
		Period          4.9040
		Separation      1.04088856039951 // 0.022 asec
		Eccentricity    0.530
		Inclination     77.0
		AscendingNode   7.0
		Epoch           2453754.248700724914670
		ArgOfPericenter 49.0
		MeanAnomaly     0
	}
}

Star "KAP1 Boo B"
{
	ParentBody      "KAP1 Boo"
	Class           ""
	MassSol         0.53
}

// Object * kap02 Boo  ---  delta Sct Variable  ---  OID=@517287   (@@8914,1)  ---  coobox=1471 
// Object types: delta Sct Variable,High Proper Motion Star,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Star "KAP2 Boo/** TOK 295A/HIP 69483/WISE J141329.04+514723.8/Gaia DR3 1511793067598402944/TIC 310362802/PLX 3235/17 Boo A/ADS 9173 A/AG+52 975/BD+52 1782/CCDM J14135+5147A/CEL 4308/CSI+52 1782 1/GC 19207/GCRV 8328/GEN# +1.00124675A/HD 124675/HIC 69483/HR 5329/JP11 2481/PPM 34403/ROT 2039/SAO 29046/SKY# 25964/SV* ZI 1052/UBV 12533/UBV M 20056/V* KAP Boo/V* KAP2 Boo/YPAC 178/WDS J14135+5147A/TYC 3471-1250-1/AKARI-IRC-V1 J1413289+514722/IRAS 14116+5201/** STF 1821A/2MASS J14132900+5147238/PMSC 14099+5215A/WEB 12108/Gaia DR2 1511793067598402944"
{
	DateUpdated     "2024-05-04"
	ParentBody      "KAP Boo AB"
	Parallax        20.153
	AppMagn         4.5
	Class           "A7IV"
	AbsMagn         1.02 // 计算的值
	MassSol         2.12
	RadSol          2.78
	LumBol          28
	Teff            7760
	FeH             -0.29
}

// Object UCAC4 709-052554  ---  Double or Multiple Star  ---  OID=@21381588   (@@-1,255)  ---  coobox=1471 
// Object types: Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Star,Star,Optical Source 
Barycenter "UCAC4 709-052554/** TOK 295C/WDS J14135+5147C/WISE J141340.28+514755.6/TIC 310362799/LAMOST J141340.26+514755.7/AP J14134022+5147557/2MASS J14134022+5147557"
{
	ParentBody      "KAP Boo"
}

// Object Gaia DR3 1511792930160292224  ---  High Proper Motion Star  ---  OID=@24127587   (@@-1,255)  ---  coobox=1471 
// Object types: High Proper Motion Star,Star 
Star "Gaia DR3 1511792930160292224"
{
	DateUpdated     "2024-05-04"
	ParentBody      "UCAC4 709-052554"
	Parallax        20.2531
	Class           "M4.8"
	MassSol         0.35

	BinaryOrbit
	{
		Period          233.865
		Separation      50.3626130408388 // 1.02 asec
	}
}

// Object Gaia DR3 1511792930159449600  ---  Star  ---  OID=@24127588   (@@-1,255)  ---  coobox=1471 
// Object types: Star 
Star "Gaia DR3 1511792930159449600"
{
	DateUpdated     "2024-05-04"
	ParentBody      "UCAC4 709-052554"
	Class           ""
	MassSol         0.33
}

// Object * iot Boo  ---  delta Sct Variable  ---  OID=@517312   (@@8916,0)  ---  coobox=1469 
// Object types: delta Sct Variable,High Proper Motion Star,Double or Multiple Star,Variable Star,Near-IR Source (λ < 3 µm),High Proper Motion Star,Star,Infra-Red Source,UV-emission Source 
Remove "Asellus Secondus A" {ParentBody "Asellus Secondus"}
Remove "Asellus Secondus B" {ParentBody "Asellus Secondus"}
Star "IOT Boo A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "HIP 69713"
	Class           "A7V"
	AbsMagn         2.38
	MassSol         1.81
	RadSol          1.7
	LumBol          8.8
	Teff            7764
	FeH             0.19
	Age             0.785

	BinaryOrbit     
	{
		Separation      1100
	}
}

// Object HD 234121  ---  High Proper Motion Star  ---  OID=@517314   (@@8916,2)  ---  coobox=1469 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Star 
Star "HD 234121/GJ 9474 B/Gaia DR3 1511727371779512704/TIC 310381208/LSPM J1416+5122N/ASCC 259623/USNO-B1.0 1413-00248009/ADS 9198 B/AG+51 976/BD+52 1785/CCDM J14162+5122B/GC 19271/GEN# +1.00234121/GEN# +1.00125161B/GEN# +1.20125161/GSC 03478-00418/IDS 14126+5150 B/NLTT 36814/PPM 34433/SAO 29073/TYC 3478-418-1/UBV 12564/UBV M 27793/YZ 51 4481/2MASS J14161217+5122346/[ZEH2003] RX J1416.1+5122 2/WDS J14162+5122B/** STF 4026B/Gaia DR1 1511727367481993984/uvby98 100234121/Gaia DR2 1511727371778725504"
{
	DateUpdated     "2024-05-04"
	ParentBody      "HIP 69713"
	Parallax        34.0298
	Class           "K1V"
	MassSol         0.8
	RadSol          0.8
	LumBol          0.4
	Teff            5090
}

// Object * tet Boo  ---  High Proper Motion Star  ---  OID=@517441   (@@8922,7)  ---  coobox=1468 
// Object types: High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Asellus Primus A" {ParentBody "Asellus Primus"}
Remove "TET Boo B" {ParentBody "Asellus Primus"}
Star "TET Boo A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "TET Boo"
	Class           "F7V"
	AbsMagn         3.25
	MassSol         1.24
	RadSol          1.733
	LumBol          4.131
	Teff            6294
	FeH             0.03
	Age             3.83

	BinaryOrbit     
	{
		Separation      1000 
	}
}

// Object * tet Boo B  ---  High Proper Motion Star  ---  OID=@4012079   (@@-1,255)  ---  coobox=1469 
// Object types: High Proper Motion Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Double or Multiple Star,High Proper Motion Star,Mid-IR Source (3 to 30 µm),Star,Star 
Star "TET Boo B"
{
	DateUpdated     "2024-05-04"
	ParentBody      "TET Boo"
	Parallax        68.8121
	AppMagn         11.458
	Class           "M2.5V"
	AbsMagn         10.64 // 计算的值
	MassSol         0.21
}
