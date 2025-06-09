package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;

public class CatalogController {

    @FXML
    private void selectCar1() {
        showAlert("You have selected Sport-Car 1: MC-Laren for $5000/day.");
    }

    @FXML
    private void selectCar2() {
        showAlert("You have selected Sports-Car 2: Buggati for $7000/day.");
    }

    @FXML
    private void selectCar3() {
        showAlert("You have selected Sports-Car 3: Chevrolet for $4500/day.");
    }

    @FXML
    private void selectCar4() {
        showAlert("You have selected Sports-Car 4: Honda-Acura for $6000/day.");
    }
    @FXML
    private void selectCar5() {
        showAlert("You have selected Sports-Car 4: Lotus-Evija for $2000/day.");
    }
    @FXML
    private void selectCar6() {
        showAlert("You have selected Sports-Car 6: Noble-M500 for $2000/day.");
    }
    @FXML
    private void selectCar7() {
        showAlert("You have selected Sports-Car 7: Terzo-Milleno for $2000/day.");
    }
    @FXML
    private void selectCar8() {
        showAlert("You have selected Sports-Car 8: Mc-Laren for $4000/day.");
    }
    private void showAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Car Selection");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
