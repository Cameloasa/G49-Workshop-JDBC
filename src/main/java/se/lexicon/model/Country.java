package se.lexicon.model;

public class Country {
    private String code; //code char(3) PK
    private String countryName;// char(52)
    private Continent continent; //Continent enum('Asia','Europe','North America','Africa','Oceania','Antarctica','South America')
    private String Region; //char(26)
    private float SurfaceArea;// float(10,2)
    private int IndepYear;// smallint
    private int Population ;//int
    private float LifeExpectancy; // float(3,1)
    private float  GNP;//float(10,2)
    private float GNPOld; //float(10,2)
    private String LocalName; // char(45)
    private String GovernmentForm;// char(45)
    private String HeadOfState; //char(60)
    private int Capital;// int
    private String Code2; //Code2 char

    //default constructor
    public Country() {

    }

    //constructor

    public Country(String code, String countryName, Continent continent, String region, float surfaceArea, int indepYear, int population, float lifeExpectancy, float GNP, float GNPOld, String localName, String governmentForm, String headOfState, int capital, String code2) {
        this.code = code;
        this.countryName = countryName;
        this.continent = continent;
        Region = region;
        SurfaceArea = surfaceArea;
        IndepYear = indepYear;
        Population = population;
        LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        LocalName = localName;
        GovernmentForm = governmentForm;
        HeadOfState = headOfState;
        Capital = capital;
        Code2 = code2;
    }

    //getters


    public String getCode() {
        return code;
    }

    public String getCountryName() {
        return countryName;
    }

    public Continent getContinent() {
        return continent;
    }

    public String getRegion() {
        return Region;
    }

    public float getSurfaceArea() {
        return SurfaceArea;
    }

    public int getIndepYear() {
        return IndepYear;
    }

    public int getPopulation() {
        return Population;
    }

    public float getLifeExpectancy() {
        return LifeExpectancy;
    }

    public float getGNP() {
        return GNP;
    }

    public float getGNPOld() {
        return GNPOld;
    }

    public String getLocalName() {
        return LocalName;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public int getCapital() {
        return Capital;
    }

    public String getCode2() {
        return Code2;
    }

    //toString

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", countryName='" + countryName + '\'' +
                ", continent=" + continent +
                ", Region='" + Region + '\'' +
                ", SurfaceArea=" + SurfaceArea +
                ", IndepYear=" + IndepYear +
                ", Population=" + Population +
                ", LifeExpectancy=" + LifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", LocalName='" + LocalName + '\'' +
                ", GovernmentForm='" + GovernmentForm + '\'' +
                ", HeadOfState='" + HeadOfState + '\'' +
                ", Capital=" + Capital +
                ", Code2='" + Code2 + '\'' +
                '}';
    }
}
