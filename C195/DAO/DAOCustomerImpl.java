package C195.DAO;

import C195.Main;
import C195.models.Customer;
import javafx.collections.ObservableList;

import java.sql.*;


public class DAOCustomerImpl implements DAOCustomer {

    private static final Connection conn = Main.conn;

    private int getCurrentId() {
        int id = 0;
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("select max(customerId) from customer");
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                id = resultSet.getInt(1);
                id++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }

    @Override
    public int addCustomer(Customer customer) {
        int id = getCurrentId();
        PreparedStatement stmt = null; //create statement for MySQL
        try { //try catch block to catch SQL Exception
            stmt = conn.prepareStatement("insert into customer (customerId, customerName, addressId, active, createDate, createdBy, lastUpdate, lastUpdateBy) " +
                    " values (?, ?, ?, 1, now(), 'admin', now(), 'admin')"); //begins statement on the connection to the db
            stmt.setInt(1, id);
            stmt.setString(2, customer.getCustomerName());
            stmt.setInt(3, customer.getAddressId());
            stmt.executeUpdate(); //init the results with the query through the statement
        } catch (SQLException e) {
            e.printStackTrace(); //if exception thrown, print
        }
        return id;
    }

    @Override
    public Customer getCustomer(int id) {
        int customerId = 0;
        PreparedStatement stmt = null;
        Customer returnedCustomer = new Customer();
        try {
            stmt = conn.prepareStatement("select * from customer where customerId = ?");
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                returnedCustomer.setCustomerId(id);
                returnedCustomer.setCustomerName(resultSet.getString("customerName"));
                returnedCustomer.setAddressId(resultSet.getInt("addressId"));
                returnedCustomer.setActive(resultSet.getInt("active"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return returnedCustomer;
    }

    @Override
    public ObservableList<Customer> getAllCustomers() {
        PreparedStatement stmt = null;
        ObservableList<Customer> customerObservableList = null;
        try {
            stmt = conn.prepareStatement("select * from customer");
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Customer currentCustomer = new Customer();
                currentCustomer.setCustomerId(resultSet.getInt("customerId"));
                currentCustomer.setCustomerName(resultSet.getString("customerName"));
                currentCustomer.setAddressId(resultSet.getInt("addressId"));
                customerObservableList.add(currentCustomer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerObservableList;
    }

    @Override
    public void modifyCustomer(Customer customer) {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("update customer set customerName = ?, addressId = ? where customerId = ?");
            stmt.setString(1, customer.getCustomerName());
            stmt.setInt(2, customer.getAddressId());
            stmt.setInt(3, customer.getCustomerId());
            stmt.executeUpdate(); //to submit the change
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteCustomer(Customer customer) {
        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement("update customer set active = 0 where customerId = ?");
            stmt.setInt(1, customer.getCustomerId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
