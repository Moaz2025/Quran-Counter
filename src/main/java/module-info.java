module com.example.qurancounter {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.QuranCounter to javafx.fxml;
    exports com.example.QuranCounter;
}