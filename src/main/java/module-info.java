module elijahcom.example.lab_2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens elijahcom.example.lab_2 to javafx.fxml;
    exports elijahcom.example.lab_2;

    opens GUI2 to javafx.fxml;
    exports GUI2;

    opens GUI3 to javafx.fxml;
    exports GUI3;

    opens GUI4 to javafx.fxml;
    exports GUI4;
}