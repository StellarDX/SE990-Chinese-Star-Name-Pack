// Object * del PsA  ---  Star  ---  OID=@1221189   (@@24879,5)  ---  coobox=8800 
// Object types: Near-IR Source (λ < 3 µm),Double or Multiple Star,Star,Infra-Red Source,UV-emission Source 
Remove "DEL PsA A" {ParentBody "DEL PsA"}
Remove "DEL PsA B" {ParentBody "DEL PsA"}
Star "DEL PsA A"
{
	DateUpdated     "2024-06-16"
	ParentBody      "Gaia DR3 6603237069110449792"
	Class           "G8III"
	AbsMagn         0.636
	MassSol         1.42
	Radius          7170382.33010146 // 计算的值
	LumBol          52
	Teff            4828
	FeH             -0.21
	Age             3.74

	BinaryOrbit     
	{
		Separation      258.848332593245 // 4.96 asec
	}
}

// Object * del PsA B  ---  Star  ---  OID=@1221190   (@@24879,6)  ---  coobox=8800 
// Object types: Double or Multiple Star,Star 
Star "DEL PsA B/Gaia DR3 6603237069110537088/CCDM J22559-3232B/CD-33 16303B/CSI-33 16303 22/HD 216763B/IDS 22504-3304 B/Gaia DR2 6603237069110537088/WDS J22559-3232B/** HWE 91B"
{
	DateUpdated     "2024-06-16"
	ParentBody      "Gaia DR3 6603237069110449792"
	Parallax        19.0451
	AppMagn         9.3
	Class           "G8IV"
	AbsMagn         5.7 // 计算的值
}
