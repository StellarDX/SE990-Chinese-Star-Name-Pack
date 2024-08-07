// Object * c Pup  ---  Star  ---  OID=@1016740   (@@12325,1)  ---  coobox=8102 
// Object types: Near-IR Source (λ < 3 µm),Variable Star,Star,Infra-Red Source,X-ray Source 
Star "HD 63032 A"
{
	DateUpdated     "2024-07-21"
	ParentBody      "HD 63032"
	Class           "K2.5Ib-IIa" // K5IIa
	AbsMagn         -4.04
	MassSol         12.1
	RadSol          274 // 301
	LumBol          15152
	Teff            3781
	Age             0.0158

	BinaryOrbit // 系统生成
	{
		RefPlane        "Equator"
		SemiMajorAxis   99.0223297
		Eccentricity    0.526699584
		Inclination     2.42748192
		AscendingNode   0
		ArgOfPericenter 130.515708
		MeanAnomaly     -172.727844
	}
}

Star "HD 63032 B"
{
	DateUpdated     "2024-07-21"
	ParentBody      "HD 63032"
	Class           "B9V"
	RadSol          2.0
	LumBol          39.008060422198945 // 计算的值
	Teff            10200
}

// Object * omi Pup  ---  Be Star  ---  OID=@1013709   (@@13464,0)  ---  coobox=7973 
// Object types: Near-IR Source (λ < 3 µm),Emission-line Star,Double or Multiple Star,Be Star,Variable Star,Star,Infra-Red Source,UV-emission Source 
Star "OMI Pup A"
{
	DateUpdated     "2024-07-21"
	ParentBody      "OMI Pup"
	Class           "B1IVe"
	AbsMagn         -3.77
	MassSol         15.5
	Radius          9635957.29567785 // 计算的值
	LumBol          59279
	Teff            24200
	Age             0.0111

	BinaryOrbit     
	{
		PeriodDays      28.903
		Eccentricity    0
		Epoch           2456012.93
	}
}

Star "OMI Pup B"
{
	ParentBody      "OMI Pup"
	Class           "O9.9?"
}

// Object * eps CMa  ---  Star  ---  OID=@948520   (@@13414,0)  ---  coobox=7782 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source,X-ray Source 
Remove "Adhara A" {ParentBody "Adhara"}
Remove "Adhara B" {ParentBody "Adhara"}
Star "EPS CMa A"
{
	DateUpdated     "2024-07-21"
	ParentBody      "EPS CMa"
	Class           "B2II"
	AbsMagn         -4.8
	MassSol         12.6
	RadSol          13.9
	LumBol          38700
	Teff            22900
	Age             0.0225
	RotationPeriod  336

	BinaryOrbit     
	{
		Period          7500
		Separation      900
	}
}

// Object * eps CMa B  ---  Star  ---  OID=@18696749   (@@-1,255)  ---  coobox=7782 
// Object types: Double or Multiple Star,Star 
Star "EPS CMa B/Gaia DR3 5608832155887268480/** CPO 7B/Gaia DR2 5608832155887268480/WDS J06586-2858B/21 CMa B"
{
	DateUpdated     "2024-07-21"
	ParentBody      "EPS CMa"
	Class           ""
	MassSol         1.26975094492667 // log(g) = 4.15 cm/s^2
	RadSol          1.57 // Gaia DR3
	LumBol          6.35843600911815 // 计算的值
	Teff            7315
	FeH             -1.876
}
