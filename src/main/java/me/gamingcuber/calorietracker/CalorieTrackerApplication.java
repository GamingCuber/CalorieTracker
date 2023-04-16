package me.gamingcuber.calorietracker;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.json.simple.JSONObject;

import java.io.IOException;
import java.time.OffsetDateTime;

public class CalorieTrackerApplication extends Application {
    int totalCalories;
    JSONObject calorieJSON = new JSONObject();
    Button enterButton;
    GridPane pane;
    Label caloricCountText = new Label();
    TextField calorieField;
    OffsetDateTime dateEntered;
    OffsetDateTime previousdateEntered;

    @Override
    public void start(Stage stage) throws IOException {

        pane = new GridPane();

        calorieField = new TextField("Enter your Calories here");
        pane.add(calorieField, 3, 3);

        enterButton = new Button();
        enterButton.setText("Enter your Calories");
        enterButton.setOnAction(e -> enterButtonClick());

        caloricCountText.setText("Total Calories Eaten: " + totalCalories);

        Scene scene = new Scene(pane, 320, 240);

        stage.setTitle("CalorieTracker");
        stage.setScene(scene);
        stage.show();
    }

    public void enterButtonClick() {

        dateEntered = OffsetDateTime.now();
        if (previousdateEntered.getDayOfYear() == dateEntered.getDayOfYear()) {

            int EnteredCalories = Integer.parseInt(calorieField.getText());
            totalCalories = totalCalories + EnteredCalories;
            caloricCountText.setText("Total Calorie Count: " + totalCalories);


        } else {



        }

    }

    @Override
    public void stop() {



    }

    public static void main(String[] args) {
        launch();
    }
}