package me.gamingcuber.calorietracker;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CalorieTrackerController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}