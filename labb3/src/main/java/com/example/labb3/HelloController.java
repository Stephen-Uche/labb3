package com.example.labb3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;

public class HelloController {

    HelloModel helloModel = new HelloModel();
    public Button Button1;
    public TextField textField1;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        //2String s = textField1.getText();
        //2welcomeText.setText(s);
        //1welcomeText.setText("Welcome to JavaFX Application!");
        helloModel.setText(textField1.getText());
        welcomeText.setText(helloModel.getText());
    }

    public void labelClicked(MouseEvent mouseEvent) {
        if( mouseEvent.isControlDown())
            welcomeText.setBackground(Background.fill(Color.RED));
    }
}