module me.gamingcuber.calorietracker{
    requires javafx.controls;
    requires javafx.fxml;

    requires json.simple;

    requires org.controlsfx.controls;

    opens me.gamingcuber.calorietracker to javafx.fxml;
    exports me.gamingcuber.calorietracker;
}