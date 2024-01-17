module one.hw3 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens one.hw3 to javafx.fxml;
    exports one.hw3;
}