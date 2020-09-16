package C195;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import C195.utils.DBConnection;

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
        DBConnection.startConnection();
        launch(args);
        DBConnection.closeConnection();
    }
}
