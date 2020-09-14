package utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    //This is the utility class for creating the connection to the db
    private static final String protocol = "jdbc";
    private static final String vendor = ":mysql:";
    private static final String address = "//wgudb.ucertify.com/U07lFX";

    //Full JDBC URL
    private static final String jdbcURL = protocol + vendor + address;

    //Driver and connection reference
    private static final String MYSQLJDBCDriver = "com.mysql.cj.jdbc.Driver";
    private static java.sql.Connection connection = null;

    //mySQL DB username and password
    private static final String username = "U07lFX";
    private static final String password = "xxxxx";

    public static Connection startConnection() {
        try {
            Class.forName(MYSQLJDBCDriver);
            connection = DriverManager.getConnection(jdbcURL, username, password);
            System.out.println("Connection Successful");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
            System.out.println("Connection Closed");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
