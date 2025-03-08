module com.example.gestion_stock {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.gestion_stock to javafx.fxml;
    exports com.example.gestion_stock;
}