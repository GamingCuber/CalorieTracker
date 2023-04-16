package me.gamingcuber.calorietracker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.OffsetDateTime;

public class CalorieTrackerApplication extends Application {
    int totalCalories;
    Button enterButton;
    Button resetButton;
    BorderPane pane;
    Label caloricCountText = new Label();
    TextField calorieField;
    OffsetDateTime dateEntered;
    OffsetDateTime previousdateEntered;

    @Override
    public void start(Stage stage) throws IOException {

        pane = new BorderPane();

        calorieField = new TextField("Enter your Calories here");

        enterButton = new Button();
        enterButton.setText("Enter your Calories");
        enterButton.setOnAction(e -> enterButtonClick());

        resetButton = new Button();
        resetButton.setText("Click Here to Reset Your Calories");
        resetButton.setOnAction(e -> resetButtonClick());

        caloricCountText.setText("Total Calories Eaten: " + totalCalories);

        pane.setTop(calorieField);
        pane.setLeft(enterButton);
        pane.setCenter(resetButton);
        pane.setBottom(caloricCountText);

        Scene scene = new Scene(pane, 320, 240);

        stage.setTitle("CalorieTracker");
        stage.setScene(scene);
        stage.show();
    }

    private void resetButtonClick() {

        totalCalories = 0;

    }

    private void enterButtonClick() {

            int EnteredCalories = Integer.parseInt(calorieField.getText());
            totalCalories = totalCalories + EnteredCalories;
            if (totalCalories > 2000) {

                caloricCountText.setText("Oh no! Your calories for today have exceeded to " + totalCalories);

            } else {

                caloricCountText.setText("Total Calorie Count: " + totalCalories);

            }

    }

    public static void main(String[] args) {
        launch();
    }
}