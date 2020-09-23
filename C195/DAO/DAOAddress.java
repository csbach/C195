package C195.DAO;

import C195.models.Address;

public interface DAOAddress {

    public int addAddress(Address address);
    public Address getAddress(int addressId);
    public void modifyAddress(Address address);
    public void deleteAddress(Address address);

}
