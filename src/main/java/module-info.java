module com.example.lab3_j120 {
    requires javafx.controls;
    requires javafx.fxml;


    opens exercise1_calculation to javafx.fxml;
    opens exercise2_game to javafx.fxml;
    exports exercise1_calculation;
    exports exercise2_game;
}