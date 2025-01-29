package elijahcom.example.lab_2;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

//import static javafx.application.Application.launch;

public class DemojavafxApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("demo-fxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 300, 150);
        stage.setTitle("Welcome");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
