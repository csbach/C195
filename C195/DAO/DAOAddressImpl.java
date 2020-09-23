package C195.DAO;

import C195.Main;
import C195.models.Address;
import java.sql.*;

public class DAOAddressImpl implements DAOAddress {

    private static final Connection conn = Main.conn;

    private int getCurrentId() {
        int id = 0;
        PreparedStatement stmt = null;

        try {
            stmt = conn.prepareStatement("select max(addressId) from address");
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
    public int addAddress(Address address) {
        int id = getCurrentId();
        PreparedStatement stmt = null; //create statement for MySQL
        try { //try catch block to catch SQL Exception
            stmt = conn.prepareStatement("insert into address (addressId, address, address2, cityId, postalCode, phone, createDate, createdBy, lastUpdate, lastUpdateBy) " +
                    " values (?, ?, ?, ?, ?, ?, now(), 'admin', now(), 'admin')"); //begins statement on the connection to the db
            stmt.setInt(1, id);
            stmt.setString(2, address.getAddress());
            stmt.setString(3, address.getAddress2());
            stmt.setInt(4, address.getCityId());
            stmt.setString(5, address.getPostalCode());
            stmt.setString(6, address.getPhone());
            stmt.executeUpdate(); //init the results with the query through the statement
        } catch (SQLException e) {
            e.printStackTrace(); //if exception thrown, print
        }
        return id;
    }

    @Override
    public Address getAddress(int addressId) {
        return null;
    }

    @Override
    public void modifyAddress(Address address) {

    }

    @Override
    public void deleteAddress(Address address) {

    }
}
