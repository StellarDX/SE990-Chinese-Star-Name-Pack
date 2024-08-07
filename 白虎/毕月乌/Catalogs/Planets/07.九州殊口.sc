// Object * 39 Eri  ---  High Proper Motion Star  ---  OID=@702100   (@@15234,0)  ---  coobox=6353 
// Object types: High Proper Motion Star,Red Giant Branch star,Double or Multiple Star,Mid-IR Source (3 to 30 µm),Near-IR Source (λ < 3 µm),Star,Infra-Red Source 
Star "39 Eri A"
{
	DateUpdated     "2024-07-02"
	ParentBody      "39 Eri"
	Class           "K2III"
	AbsMagn         0.52
	MassSol         1.77
	RadSol          12
	LumBol          81.3
	Teff            4641
	FeH             0.18
	Age             1.12

	BinaryOrbit     
	{
		Epoch           2457024
		Separation      451.645663902222 // 6.4 asec
		PositionAngle   143
	}
}

// Object * 39 Eri B  ---  High Proper Motion Star  ---  OID=@11605977   (@@-1,255)  ---  coobox=6353 
// Object types: High Proper Motion Star,Double or Multiple Star,Star 
Star "39 Eri B/Gaia DR3 3191969567824442368/TYC 5315-2291-1/ADS 3079 B/BD-10 867B/CCDM J04144-1016B/CSI-10 867 2/WDS J04144-1015B/** STF 516B/Gaia DR2 3191969567824442368"
{
	DateUpdated     "2024-07-02"
	ParentBody      "39 Eri"
	Parallax        14.3254
	AppMagn         8.44
	Class           "G2V"
	AbsMagn         4.22 // 计算的值
	RadSol          1.15
	LumBol          1.369
	Teff            5816
}

// Object * 55 Eri A  ---  Spectroscopic Binary  ---  OID=@11631971   (@@-1,255)  ---  coobox=6444 
// Object types: Spectroscopic Binary,Near-IR Source (λ < 3 µm),Double or Multiple Star,Spectroscopic Binary,Star 
// NoirLab: https://www.ctio.noirlab.edu/~atokovin/stars/stars.php?cat=ADS&number=3409
Barycenter "55 Eri A/Gaia DR3 3185880919107361024/** STF 590A/TIC 56129375/TYC 5321-2147-1/ADS 3409 A/CCDM J04436-0848A/GEN# +1.00030021A/uvby98 100030021 A/WDS J04436-0848A/PMSC 04388-0858Aab/PMSC 04388-0858A/2MASS J04433516-0847462/SBC9 269/HD 30021/HR 1506/GCRV 2774/SAO 131443/GC 5760/ROT 675/SKY# 7340/WEB 4226/Gaia DR2 3185880919107361024"
{
	ParentBody      "55 Eri"
	BinaryOrbit     
	{
		Period          19917
		Separation      649.196553046272 // 9.30 asec
		PositionAngle   318
	}
}

Star "55 Eri Aa" // Simbad似乎把A和B标反了
{
	DateUpdated     "2024-07-02"
	ParentBody      "55 Eri A"
	Parallax        7.0017
	AppMagn         6.73
	Class           "F4III" // F2VpSrSi
	AbsMagn         0.956 // 计算的值
	MassKg          3.88159777980823e+30 // log(g) = 3.547 cm/s^2
	RadSol          3.8975 // Gaia DR3
	LumBol          31.9488389432632 // 计算的值
	Teff            6951
	FeH             -0.039

	BinaryOrbit // DR3 SB1 Coordinates match A
	{
		PeriodDays      42.3359
		Eccentricity    0.003
		Inclination     0.0
		AscendingNode   0.0
		Epoch           2457395.547
		ArgOfPericenter 244
		MeanAnomaly     0
	}
}

Star "55 Eri Ab"
{
	DateUpdated     "2024-07-02"
	ParentBody      "55 Eri A"
	Class           ""
	MassSol         0.98
}

// Object * 55 Eri B  ---  alpha2 CVn Variable  ---  OID=@737105   (@@15253,17)  ---  coobox=6444 
// Object types: alpha2 CVn Variable,Near-IR Source (λ < 3 µm),Double or Multiple Star,Variable Star,Star 
Star "55 Eri B/Gaia DR3 3185880919107441920/Gaia DR2 3185880919107441920/TIC 56129374/ADS 3409 B/BD-09 969/CCDM J04436-0848B/CSI-09 969 1/CSV 6130/GC 5759/GCRV 2773/GEN# +1.00030020/HD 30020/HERZ 626/HR 1505/PPM 187260/ROT 674/SAO 131442/SKY# 7339/UBV 4540/UBV M 10298/V* DW Eri/YZ 98 1203/WDS J04436-0848B/** STF 590B/TYC 5321-2146-1/Renson 7710/PMSC 04388-0858B/PMSC 04388-0858Bab/2MASS J04433474-0847395/uvby98 100030020/WEB 4225"
{
	DateUpdated     "2024-07-02"
	ParentBody      "55 Eri"
	Class           "G8III"
	AbsMagn         0.831 // 计算的值
	MassKg          2.26057175185611e+30 // log(g) = 2.595 cm/s^2
	RadSol          8.9 // Gaia DR3
	LumBol          44.8522317174709 // 计算的值
	Teff            5007
	FeH             -0.55
}
