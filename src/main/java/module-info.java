module com.example.sailab {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.sailab to javafx.fxml;
    exports com.example.sailab;
}