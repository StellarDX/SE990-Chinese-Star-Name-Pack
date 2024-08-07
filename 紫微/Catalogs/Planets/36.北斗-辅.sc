// Object * g UMa  ---  Double or Multiple Star  ---  OID=@529551   (@@7115,0)  ---  coobox=1847 
// Object types: Double or Multiple Star,High Proper Motion Star,Double or Multiple Star,Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Alcor A" {ParentBody "Alcor"}
Remove "Alcor B" {ParentBody "Alcor"}
Star "Alcor A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "g UMa"
	Class           "A5V"
	AbsMagn         2.00
	MassSol         1.84
	RadSol          1.846
	LumBol          14.03
	Teff            8221

	BinaryOrbit     
	{
		Period          108.420
		Separation      27.8124830659377 // 1.110 asec
	}
}

Star "Alcor B"
{
	DateUpdated     "2024-05-04"
	ParentBody      "g UMa"
	Class           "M3-4V"
	MassSol         0.25
	Age             0.5
}

// Object * alf UMa  ---  Spectroscopic Binary  ---  OID=@486427   (@@4646,1)  ---  coobox=3367 
// Object types: Double or Multiple Star,Spectroscopic Binary,Double or Multiple Star,Variable Star,High Proper Motion Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source 
Remove "Dubhe A" {ParentBody "Dubhe"}
Remove "Dubhe B" {ParentBody "Dubhe"}
Star "Dubhe A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "ALF UMa"
	Class           "G9III"
	AbsMagn         -1.10
	MassSol         3.44
	RadSol          17.03
	LumBol          165.1
	Teff            5012
	FeH             -0.20
	Age             0.280

	BinaryOrbit     
	{
		Period          44.45
		Separation      22.2307786689009 // 0.590 asec
		Eccentricity    0.439
		Inclination     159.9
		AscendingNode   9.3
		Epoch           2452337.108969454653561
		ArgOfPericenter 52.8
		MeanAnomaly     0
	}
}

Star "Dubhe B"
{
	DateUpdated     "2024-05-04"
	ParentBody      "ALF UMa"
	Class           "A7.5"
	MassSol         1.6
}

// Object * gam UMa  ---  Emission-line Star  ---  OID=@550487   (@@5344,0)  ---  coobox=3393 
// Object types: High Proper Motion Star,Double or Multiple Star,Emission-line Star,Variable Star,Near-IR Source (λ < 3 µm),Star,Infra-Red Source,UV-emission Source,X-ray Source 
Star "GAM UMa A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "GAM UMa"
	Class           "A0Ve"
	AbsMagn         0.4
	MassSol         2.94
	RadSol          3.04
	LumBol          65.255
	Teff            9355
	Age             0.3

	BinaryOrbit     
	{
		Period          20.5
		Separation      11.7318675833659 // 0.460 asec
		Eccentricity    0.3
		Inclination     51
		AscendingNode   6
		Epoch           2445700.658217603806406
		ArgOfPericenter 5
		MeanAnomaly     0
	}
}

Star "GAM UMa B"
{
	DateUpdated     "2024-05-04"
	ParentBody      "GAM UMa"
	Class           "K2V"
	MassSol         0.79
	Radius          639167.412068988 // 计算的值
	LumBol          0.397
	Teff            4780
}

// Object * zet01 UMa  ---  Spectroscopic Binary  ---  OID=@529550   (@@7109,9)  ---  coobox=1847 
// Object types: Near-IR Source (λ < 3 µm),Mid-IR Source (3 to 30 µm),Spectroscopic Binary,Double or Multiple Star,Variable Star,Star,UV-emission Source 
Remove "Mizar A" {ParentBody "Mizar"}
Remove "Mizar B" {ParentBody "Mizar"}
Remove "Mizar Aa" {ParentBody "Mizar A"}
Remove "Mizar Ab" {ParentBody "Mizar A"}
Remove "Mizar Ba" {ParentBody "Mizar B"}
Remove "Mizar Bb" {ParentBody "Mizar B"}
Barycenter "ZET1 UMa/GJ 3783/Gaia DR3 1563590579347125632/2MASS J13235563+5455292/UCAC4 725-051078/PLX 3062/SBC9 764/ZET UMa A/79 UMa A/ADS 8891 A/AG+55 884/CCDM J13240+5456AB/CEL 4252/CSI+55 1598 1/CSV 101381/FK5 497/GC 18133/GCRV 7958/HD 116656/HGAM 622/HR 5054/N30 3065/NSV 6224/PMC 90-93 353/PPM 34007/ROT 3516/SAO 28737/SBC7 485/SKY# 24722/SV* ZI 1000/TYC 3850-1385-1/UBV 12100/[HFE83] 949/WDS J13239+5456Aa,Ab/** STF 1744A/Renson 33650/BD+55 1598A/** PEA 1/WDS J13239+5456A/WISE J132355.98+545527.5/PMSC 13199+5527A/PMSC 13199+5527Aab/Mizar A/WEB 11538/GEN# +1.00116656"
{
	ParentBody      "HIP 65378"
	BinaryOrbit     
	{
		Period          2777
		Separation      380
	}
}

Star "ZET1 UMa A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "ZET1 UMa"
	Class           "A2Vp"
	AbsMagn         0.32
	MassSol         2.2224
	RadSol          2.4
	LumBol          33.3
	Teff            9000
	Age             0.370

	BinaryOrbit     
	{
		PeriodDays      20.5386
		Separation      0.260222140099878 // 9.83 mas
		Eccentricity    0.5415
		Inclination     60.5
		AscendingNode   106.0
		Epoch           2454536.9904
		ArgOfPericenter 285.27
		MeanAnomaly     0
	}
}

Star "ZET1 UMa B"
{
	DateUpdated     "2024-05-04"
	ParentBody      "ZET1 UMa"
	Class           "A2Vp"
	MassSol         2.2381
	RadSol          2.4
	LumBol          33.3
	Teff            9000
}

// Object * zet02 UMa  ---  Spectroscopic Binary  ---  OID=@529536   (@@7101,5)  ---  coobox=1847 
// Object types: High Proper Motion Star,Mid-IR Source (3 to 30 µm),Double or Multiple Star,Near-IR Source (λ < 3 µm),Spectroscopic Binary,Variable Star,Star 
Barycenter "ZET2 UMa/GJ 3784/Gaia DR3 1563590510627624064/TIC 159190005/ZET UMa B/79 UMa B/ADS 8891 B/BD+55 1598B/CCDM J13240+5456C/CSI+55 1598 2/CSV 101382/GC 18134/GCRV 7959/HD 116657/HR 5055/ROT 3563/SAO 28738/SBC7 486/SKY# 24723/UBV 12101/2MASS J13235629+5455183/WDS J13239+5456B/Renson 33660/TYC 3850-1386-1/WISE J132356.60+545515.1/SBC9 765/PMSC 13199+5527B/PMSC 13199+5527Bab/Mizar B/uvby98 100116657/GEN# +1.00116657/WEB 11539/Gaia DR2 1563590510625852544"
{
	ParentBody      "HIP 65378"
}

Star "ZET2 UMa A"
{
	DateUpdated     "2024-05-04"
	ParentBody      "ZET2 UMa"
	Class           "kA1h(eA)mA7IV-V"
	AbsMagn         1.96
	Teff            8425

	BinaryOrbit     
	{
		PeriodDays      175.55
		Separation      0.786837792385469 // 29.849 mas
		Eccentricity    0.46
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2437294.398
		ArgOfPericenter 184.3
		MeanAnomaly     0
	}
}

Star "ZET2 UMa B"
{
	ParentBody      "ZET2 UMa"
	Class           ""
	MassSol         0.25
}