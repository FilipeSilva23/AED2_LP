package edu.ufp.inf.aed2.edu.ufp.inf.aed2_lp2_2425_students;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Ola Mundo UFP JavaFX Application!!");
    }
}