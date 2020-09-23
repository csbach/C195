package C195.DAO;

import C195.Main;

import java.sql.*;

public class DAOUserImpl implements DAOUser {

    private static final Connection conn = Main.conn;
    //override method from DAOUser interface
    @Override
    public boolean login(String userName, String password){
        PreparedStatement stmt = null; //create statement for MySQL
        try { //try catch block to catch SQL Exception
            stmt = conn.prepareStatement("select userName and password from user where (userName = ?) and (password = ?)"); //begins statement on the connection to the db
            stmt.setString(1, userName);
            stmt.setString(2, password);
            ResultSet resultSet = stmt.executeQuery(); //init the results with the query through the statement
            if (resultSet.next()) { //if the result contains a match of the user and pw, returns true. log in successful
                return true;
            } else if (!resultSet.next()) { //if no result found, return false
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace(); //if exception thrown, print
        }
        return false; //safety return false
    }
}
