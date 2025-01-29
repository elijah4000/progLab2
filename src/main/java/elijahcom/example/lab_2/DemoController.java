package elijahcom.example.lab_2;



import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class DemoController {

    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    private void handleLogin(){
        String user= username.getText();
        String pass= password.getText();
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setContentText(" Your username is " + user + " and you password is " + pass);
        alert.showAndWait();

    }



}
