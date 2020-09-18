package C195.DAO;

import C195.models.Customer;

public interface DAOCustomer {

    public void addCustomer(Customer customer);
    public void modifyCustomer(Customer customer);
    public boolean deleteCustomer(Customer customer); //return true if deleted?

}
