module com.example.lab3_j120 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.lab3_j120 to javafx.fxml;
    exports com.example.lab3_j120;
}