package C195.DAO;

import C195.models.Country;

public interface DAOCountry {

    public int addCountry(Country country);
    public Country getCountry(int id);
    public void modifyCountry(Country country);
    public void deleteCountry(Country country);

}
