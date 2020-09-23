package C195.models;

public class City {

    private int cityId;
    private String cityName;
    private Country country;

    public City() {};

    public int getCityId() {
        return this.cityId;
    }

    public void setCityId(int id) {
        this.cityId = id;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String name) {
        this.cityName = name;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

}
