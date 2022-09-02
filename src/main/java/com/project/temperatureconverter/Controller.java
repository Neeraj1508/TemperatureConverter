package com.project.temperatureconverter;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller implements Initializable {
    @FXML
    public Label welcomeLabel;

    @FXML
    public ChoiceBox<String> choiceBox;

    @FXML
    public TextField userInputField;

    @FXML
    public Button convertButton;

    // Created the Constant Statements
    private static final String cel_to_feh_kel = "Celsius to Fahrenheit and Kelvin";
    private static final String feh_to_cel_kel = "Fahrenheit to Celcius and Kelvin";
    private static final String kel_to_cel_feh = "Kelvin to Celcius and Fehrenheit";

    private boolean iscel_to_feh_kel = true;
    private boolean isfeh_to_cel_kel = true;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        choiceBox.getItems().add(cel_to_feh_kel);
        choiceBox.getItems().add(feh_to_cel_kel);
        choiceBox.getItems().add(kel_to_cel_feh);

        choiceBox.setValue(cel_to_feh_kel);

        // Using LAMBDA express.
        choiceBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.equals(cel_to_feh_kel)) {
                iscel_to_feh_kel = true;
                isfeh_to_cel_kel = false;
            } else if(newValue.equals(feh_to_cel_kel)) {
                iscel_to_feh_kel = false;
                isfeh_to_cel_kel = true;
            } else {
                isfeh_to_cel_kel = false;
                iscel_to_feh_kel = false;
            }
        });

        convertButton.setOnAction(event -> convert());
    }

    private void convert() {

        String input = userInputField.getText();

        float enteredTemp;
        // Try and Catch Exception
        try {
            enteredTemp = Float.parseFloat(input);
        } catch (Exception e) {
            warnUser();
            return;
            //No Code Will be executed......
        }

        double newTemp;
        double newHeat;
        if (iscel_to_feh_kel) {
            newTemp = (enteredTemp * 9 / 5) + 32;             // feh
            newHeat = (enteredTemp + 273.15);                 // Kalvin
        } else if(isfeh_to_cel_kel) {
            newTemp = (enteredTemp - 32) * 5 / 9;             // Celcius
            newHeat = ((enteredTemp - 32) * 5 / 9) + 273;     // Kelvin
        } else {
            newTemp = (enteredTemp - 273.15);                 // Celcius
            newHeat = ((enteredTemp - 273) * 9 / 5) + 32;     //feh
        }

        display(newTemp, newHeat);
    }

    private void warnUser() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Occured");
        alert.setContentText("Please enter the valid number.");
        alert.show();
    }

    private void display(Double newTemp, double newHeat) {

        String unit1 = iscel_to_feh_kel ? "F" : "C";
        String unit2 = isfeh_to_cel_kel? "K" : "F";

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Result");
        alert.setContentText("The new temperature is: " + newTemp + unit1 +" and "+ newHeat + unit2);
        alert.show();
    }

}