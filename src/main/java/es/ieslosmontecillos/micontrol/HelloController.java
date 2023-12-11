package es.ieslosmontecillos.micontrol;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private MiControl aggControl;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onMouseClick(MouseEvent mouseEvent) {

            welcomeText.setText("Has clicado la zona roja!");
    }
}