module me.gamingcuber.calorietracker.calorietracker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens me.gamingcuber.calorietracker to javafx.fxml;
    exports me.gamingcuber.calorietracker;
}