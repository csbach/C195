package C195;

import C195.DAO.DAOCustomer;
import C195.DAO.DAOCustomerImpl;
import C195.DAO.DAOUser;
import C195.DAO.DAOUserImpl;
import C195.models.Customer;
import C195.models.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import C195.utils.DBConnection;

import java.sql.Connection;
import java.time.LocalDateTime;

public class Main extends Application {

    public static Connection conn = DBConnection.startConnection();

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("ViewController/login.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        LocalDateTime javaTime = LocalDateTime.now();


        System.out.println(javaTime);
        DAOUser interfaceToDb = new DAOUserImpl();
        User user = new User(1, "test", "test");
        System.out.println(interfaceToDb.login(user.getUserName(), user.getPassword()));
        DAOCustomer interf = new DAOCustomerImpl();
        Customer customer = new Customer();
        customer.setCustomerName("babababa");
        customer.setAddressId(3);
        customer.setCustomerId(interf.addCustomer(customer));
        System.out.println(customer.getCustomerId());


        launch(args);
        DBConnection.closeConnection();
    }
}
