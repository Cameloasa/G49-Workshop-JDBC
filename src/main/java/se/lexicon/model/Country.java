package se.lexicon.model;

public class Country {
    private String code; //code char(3) PK
    private String countryName;// char(52)
    private Continent continent; //Continent enum('Asia','Europe','North America','Africa','Oceania','Antarctica','South America')
    private String region; //char(26)
    private float surfaceArea;// float(10,2)
    private int indepYear;// smallint
    private int population ;//int
    private float lifeExpectancy; // float(3,1)
    private float  gnp;//float(10,2)
    private float gnpOld; //float(10,2)
    private String localName; // char(45)
    private String governmentForm;// char(45)
    private String headOfState; //char(60)
    private int capital;// int
    private String code2; //Code2 char

    //default constructor
    public Country() {

    }

    //constructor

    public Country(String code, String countryName, Continent continent, String region, float surfaceArea, int indepYear, int population, float lifeExpectancy, float gnp, float gnpOld, String localName, String governmentForm, String headOfState, int capital, String code2) {
        this.code = code;
        this.countryName = countryName;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.indepYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.gnp = gnp;
        this.gnpOld = gnpOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.code2 = code2;
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
        return region;
    }

    public float getSurfaceArea() {
        return surfaceArea;
    }

    public int getIndepYear() {
        return indepYear;
    }

    public int getPopulation() {
        return population;
    }

    public float getLifeExpectancy() {
        return lifeExpectancy;
    }

    public float getGnp() {
        return gnp;
    }

    public float getGnpOld() {
        return gnpOld;
    }

    public String getLocalName() {
        return localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public int getCapital() {
        return capital;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setSurfaceArea(float surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setIndepYear(int indepYear) {
        this.indepYear = indepYear;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public void setLifeExpectancy(float lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public void setGnp(float gnp) {
        this.gnp = gnp;
    }

    public void setGnpOld(float gnpOld) {
        this.gnpOld = gnpOld;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    //toString

    @Override
    public String toString() {
        return "Country{" +
                "code='" + code + '\'' +
                ", countryName='" + countryName + '\'' +
                ", continent=" + continent +
                ", region='" + region + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", indepYear=" + indepYear +
                ", population=" + population +
                ", lifeExpectancy=" + lifeExpectancy +
                ", gnp=" + gnp +
                ", gnpOld=" + gnpOld +
                ", localName='" + localName + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", capital=" + capital +
                ", code2='" + code2 + '\'' +
                '}';
    }
}
