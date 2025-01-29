module elijahcom.example.lab_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens elijahcom.example.lab_2 to javafx.fxml;
    exports elijahcom.example.lab_2;
}