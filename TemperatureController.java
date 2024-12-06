package com.georgianatilac.temperatureconverterapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class TemperatureController {
    @FXML
    private TextField inputField;

    @FXML
    private Label resultLabel;

    @FXML
    protected void handleConvert() {
        try {
            double celsius = Double.parseDouble(inputField.getText());
            double fahrenheit = TemperatureConverter.celsiusToFahrenheit(celsius);
            resultLabel.setText("Fahrenheit: " + fahrenheit);
        } catch (NumberFormatException e) {
            resultLabel.setText("Invalid input. Please enter a number.");
        }
    }
}
