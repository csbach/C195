package C195.DAO;

import C195.models.Customer;
import javafx.collections.ObservableList;

public interface DAOCustomer {

    public int addCustomer(Customer customer);
    public Customer getCustomer(int id);
    public ObservableList<Customer> getAllCustomers();
    public void modifyCustomer(Customer customer);
    public void deleteCustomer(Customer customer);

}
