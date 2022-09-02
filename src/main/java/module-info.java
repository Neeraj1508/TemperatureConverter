module com.project.temperatureconverter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.project.temperatureconverter to javafx.fxml;
    exports com.project.temperatureconverter;
}