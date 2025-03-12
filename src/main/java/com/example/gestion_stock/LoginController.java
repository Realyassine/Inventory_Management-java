package com.example.gestion_stock;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    @FXML
    private Text txtVerifieEmail;  // Ensure this is linked to the FXML

    @FXML
    public void initialize() {
        loginButton.setOnAction(event -> checkAccount());
    }

    private void checkAccount() {
        String email = emailField.getText();
        String password = passwordField.getText();

        if ("Admin".equals(email) && "Admin".equals(password)) {
            txtVerifieEmail.setText("✅ Login successful!");
            txtVerifieEmail.setStyle("-fx-fill: green;");  // Make text green
        } else {
            txtVerifieEmail.setText("❌ Incorrect email or password.");
            txtVerifieEmail.setStyle("-fx-fill: red;");  // Make text red
        }
    }
}
