package C195.DAO;

import C195.utils.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAOUserImpl implements DAOUser {

    Connection conn = DBConnection.startConnection();

    @Override
    public boolean login(Connection conn, String userName, String password){
        Statement stmt = null;
        String query = "select userName and password from U07lFX.user where (userName = '" + userName + "') and (password = '" + password + "');";
        try {
            stmt = conn.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);
            if (resultSet.next()) {
                return true;
            } else if (!resultSet.next()) {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
