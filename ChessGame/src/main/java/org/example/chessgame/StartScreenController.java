package org.example.chessgame;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;

public class StartScreenController {

    @FXML
    private TextField nombreBlanco;

    @FXML
    private TextField nombreNegro;

    private HelloApplication mainApp;

    public void setMainApp(HelloApplication mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void handleStart() {
        String jugadorBlanco = nombreBlanco.getText();
        String jugadorNegro = nombreNegro.getText();

        if (jugadorBlanco.isEmpty() || jugadorNegro.isEmpty()) {
            mostrarMensaje("Campos vacíos", "Por favor, ingrese los nombres de ambos jugadores.", Alert.AlertType.WARNING);
            return;
        }

        mainApp.startGame(jugadorBlanco, jugadorNegro);
    }

    private void mostrarMensaje(String titulo, String contenido, Alert.AlertType tipo) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(contenido);
        alert.showAndWait();
    }
}
