package C195;

import C195.DAO.DAOUserImpl;
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
        Connection conn = DBConnection.startConnection();
        DAOUserImpl impl = new DAOUserImpl();
        User user = new User(1, "test", "test");
        System.out.println(impl.login(conn, user.getUserName(), user.getPassword()));
        launch(args);
        DBConnection.closeConnection();
    }
}
