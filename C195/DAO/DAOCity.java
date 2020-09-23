package C195.DAO;

import C195.models.City;

public interface DAOCity {

    public int addCity(City city);
    public City getCity(int id);
    public void modifyCity(City city);
    public void deleteCity(City city);

}
