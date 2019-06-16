package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Updated Friend Book");
        primaryStage.setScene(new Scene(root, 1000, 425));
        primaryStage.show();
    }

    public static void main(String[] args) throws FileNotFoundException {
        launch(args);
    }
}
