package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
		// Create a container for visual grouping
		VBox vbox = new VBox(10); // VBox with spacing between elements
		vbox.setStyle("-fx-border-color: black; -fx-border-width: 0; -fx-padding: 20; -fx-background-color: #0078D7; -fx-min-width: 3840; -fx-color:#FFFFFF"); // TODO: kako narediti custom window title bar? - #0078D7

		// Add elements to the group
		Text labelFile = new Text("File");
		Text labelHome = new Text("Home");
		Text labelDesign = new Text("Design");
		Text labelLayout = new Text("Layout");
		Text labelReferences = new Text("References");
		Text labelMailings = new Text("Mailings");
		Text labelReview = new Text("Review");
		Text labelView = new Text("View");

		labelFile.setStyle("-fx-text-fill: white;"); // TODO: zmanjšati vse te izjave
		labelHome.setStyle("-fx-text-fill: white;");
		labelDesign.setStyle("-fx-text-fill: white;");
		labelLayout.setStyle("-fx-text-fill: white;");
		labelReferences.setStyle("-fx-text-fill: white;");
		labelMailings.setStyle("-fx-text-fill: white;");
		labelReview.setStyle("-fx-text-fill: white;");
		labelView.setStyle("-fx-text-fill: white;");

		HBox hbox = new HBox(50, labelFile, labelHome, labelDesign, labelLayout, labelReferences, labelMailings, labelReview, labelView); // TODO: niso vsi paddingi enaki
		vbox.getChildren().addAll(hbox);

		// Place the group in a Pane
		Pane root = new Pane(vbox);

		// Set up the Scene and Stage
		Scene scene = new Scene(root, 300, 200);
		stage.setTitle("Visual Grouping Example");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}