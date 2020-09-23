package C195.models;

public class Country {

    private int countryId;
    private String countryName;

    public Country() {};

    public int getCountryId() {
        return this.countryId;
    }

    public void setCountryId(int id) {
        this.countryId = id;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public void setCountryName(String name) {
        this.countryName = name;
    }
}
