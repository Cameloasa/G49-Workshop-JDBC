package se.lexicon.model;

public class City {
    private int cityId;
    private String cityName;
    private String cityCode;
    private String cityDistrict;
    private int cityPopulation;

    //Default constructor
    public City() {

    }
    //Constructor when you want to create a new City
    public City(String cityName, String cityCode, String cityDistrict, int cityPopulation) {
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.cityDistrict = cityDistrict;
        this.cityPopulation = cityPopulation;
    }

    //Constructor when you want to fetch data City table
    public City(int cityId, String cityName, String cityCode, String cityDistrict, int cityPopulation) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.cityDistrict = cityDistrict;
        this.cityPopulation = cityPopulation;
    }

    //Getters

    public int getCityId() {
        return cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String getCityDistrict() {
        return cityDistrict;
    }

    public int getCityPopulation() {
        return cityPopulation;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    //toString

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", cityName='" + cityName + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", cityDistrict='" + cityDistrict + '\'' +
                ", cityPopulation=" + cityPopulation +
                '}';
    }
}




