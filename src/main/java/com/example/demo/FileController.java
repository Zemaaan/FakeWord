package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FileController {
	@FXML
	private Label welcomeText;

	@FXML
	protected void click() {
		welcomeText.setText("Welcome to JavaFX Application!");
	}
}
