package GUI2;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller2 {


    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label Submit;

    @FXML
    private void handleSubmit(){
        String user = username.getText();
        String pass = password.getText();
        Submit.setText("Your username is " + user + " and password is " + pass);


    }
    @FXML
    private void handleClear(){
        username.clear();
        password.clear();

    }
    @FXML
    private void handleExit(){
       System.exit(0);
    }




}
