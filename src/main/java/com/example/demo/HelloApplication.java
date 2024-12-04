package com.example.demo;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
	@Override
	public void start(Stage stage) throws IOException {
		FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
		stage.setMaximized(true);
		HBox vbox1 = new HBox(0); // 10px spacing between elements
		Button CutButton = new Button("Cut");
		Button CopyButton = new Button("Copy");
		Button PasteButton = new Button("Paste");
		VBox InnerVBox = new VBox();
		InnerVBox.getChildren().addAll(CutButton, CopyButton);
		vbox1.getChildren().addAll(PasteButton, InnerVBox);

		// Create VBox 2
		VBox vbox2 = new VBox(0);
		Button BoldBUtton = new Button("Bold");
		Button BTN3x = new Button("Button 3");
		vbox2.getChildren().addAll(BTN3x, BoldBUtton);
		vbox2.setMargin(BoldBUtton, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox
		vbox2.setMargin(BTN3x, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox

		VBox vbox3 = new VBox(0);
		Button BTN3 = new Button("BTN3");
		Button BTN_Italic = new Button("Italic");
		vbox3.getChildren().addAll(BTN3, BTN_Italic);

		vbox3.setMargin(BTN3, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox
		vbox3.setMargin(BTN_Italic, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox


		Button BTN5 = new Button("5");
		Button BTN_Underline = new Button("Underline");
		VBox vbox4 = new VBox(0);
		vbox4.getChildren().addAll(BTN5, BTN_Underline);
		vbox4.setMargin(BTN5, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox
		vbox4.setMargin(BTN_Underline, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox

		Button BTN_Subscript = new Button("Subscript");
		Button BTN_FPlus = new Button("F+");
		VBox vbox5 = new VBox(0);
		vbox5.getChildren().addAll(BTN_FPlus, BTN_Subscript);
		vbox5.setMargin(BTN_Subscript, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox
		vbox5.setMargin(BTN_FPlus, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox

		Button BTN_Superscript = new Button("Subscript");
		Button BTN_FMinus = new Button("F-");
		VBox vbox6 = new VBox(0);
		vbox6.getChildren().addAll(BTN_FMinus, BTN_Superscript);
		vbox6.setMargin(BTN_Superscript, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox
		vbox6.setMargin(BTN_FMinus, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox

		VBox vbox7 = new VBox(0);
		Button BTN_Levo = new Button("Levo");
		Button RepairMe = new Button("-");
		vbox7.getChildren().addAll(BTN_Levo, RepairMe);
		vbox7.setMargin(BTN_Levo, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox
		vbox7.setMargin(RepairMe, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox

		Button BTN_Center = new Button("Center");
		Button BTN_X = new Button("X");
		VBox vbox8 = new VBox(0);
		vbox8.getChildren().addAll(BTN_Center, BTN_X);
		vbox8.setMargin(BTN_Center, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox
		vbox8.setMargin(BTN_X, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox

		Button BTN_Desno = new Button("Desno");
		Button BTN_Y = new Button("Y");
		VBox vbox9 = new VBox(0);
		vbox9.getChildren().addAll(BTN_Desno, BTN_Y);
		vbox9.setMargin(BTN_Desno, new Insets(0, 0, 	0, 20));  // Set left margin for the button inside the HBox
		vbox9.setMargin(BTN_Y, new Insets(0, 0, 0, 20));  // Set left margin for the button inside the HBox

		// Create HBox and place VBox1 and VBox2 side by side
		HBox hbox = new HBox(0); // 20px spacing between VBoxes
		hbox.getChildren().addAll(vbox1, vbox2, vbox3, vbox4, vbox5, vbox6, vbox7, vbox8, vbox9);

		String defaultStyle = "-fx-background-color: #ffffff;";
		String clickedStyle = "-fx-background-color: #ada9a9;";

		BTN_Center.setStyle(defaultStyle);
		BTN_Desno.setStyle(defaultStyle);
		BTN_Levo.setStyle(defaultStyle);
		BTN_Subscript.setStyle(defaultStyle);
		BTN_Superscript.setStyle(defaultStyle);
		BoldBUtton.setStyle(defaultStyle);
		BTN_Italic.setStyle(defaultStyle);
		BTN_Underline.setStyle(defaultStyle);

		Alert KopiranjeAlertOkno = new Alert(Alert.AlertType.NONE);
		EventHandler<ActionEvent> KopiranjeOpozoriloEvent = new
				EventHandler<ActionEvent>() {
					public void handle(ActionEvent e)
					{
						KopiranjeAlertOkno.setAlertType(Alert.AlertType.CONFIRMATION);
						KopiranjeAlertOkno.setTitle("Opozorilo za kopiranje");
						KopiranjeAlertOkno.setContentText("Uspešno kopiranje");
						KopiranjeAlertOkno.setHeaderText(null);
						KopiranjeAlertOkno.show();
					}
				};
		CopyButton.setOnAction(KopiranjeOpozoriloEvent);

		Alert PasteAlertOkno = new Alert(Alert.AlertType.NONE);
		EventHandler<ActionEvent> PasteeOpozoriloEvent = new
				EventHandler<ActionEvent>() {
					public void handle(ActionEvent e)
					{
						PasteAlertOkno.setAlertType(Alert.AlertType.CONFIRMATION);
						PasteAlertOkno.setTitle("Opozorilo za paste");
						PasteAlertOkno.setContentText("Uspešno paste");
						PasteAlertOkno.setHeaderText(null);
						PasteAlertOkno.show();
					}
				};
		PasteButton.setOnAction(PasteeOpozoriloEvent);

		Alert CutAlertOkno = new Alert(Alert.AlertType.NONE);
		EventHandler<ActionEvent> CutOpozoriloEvent = new
				EventHandler<ActionEvent>() {
					public void handle(ActionEvent e)
					{
						CutAlertOkno.setAlertType(Alert.AlertType.CONFIRMATION);
						CutAlertOkno.setTitle("Opozorilo za izrez");
						CutAlertOkno.setContentText("Uspešno rezanje");
						CutAlertOkno.setHeaderText(null);
						CutAlertOkno.show();
					}
				};

		CutButton.setOnAction(CutOpozoriloEvent);

		BTN_Center.setOnAction(event -> {
			if (BTN_Center.getStyle().equals(defaultStyle)) {
				BTN_Center.setStyle(clickedStyle);
				BTN_Desno.setStyle(defaultStyle);
				BTN_Levo.setStyle(defaultStyle);
			} else {
				BTN_Center.setStyle(defaultStyle);
			}
		});

		BTN_Desno.setOnAction(event -> {
			if (BTN_Desno.getStyle().equals(defaultStyle)) {
				BTN_Desno.setStyle(clickedStyle);
				BTN_Center.setStyle(defaultStyle);
				BTN_Levo.setStyle(defaultStyle);
			} else {
				BTN_Desno.setStyle(defaultStyle);
			}
		});

		BTN_Levo.setOnAction(event -> {
			if (BTN_Levo.getStyle().equals(defaultStyle)) {
				BTN_Levo.setStyle(clickedStyle);
				BTN_Desno.setStyle(defaultStyle);
				BTN_Center.setStyle(defaultStyle);
			} else {
				BTN_Levo.setStyle(defaultStyle);
			}
		});

		BTN_Superscript.setOnAction(event -> {
			if (BTN_Superscript.getStyle().equals(defaultStyle)) {
				BTN_Superscript.setStyle(clickedStyle);
				BTN_Subscript.setStyle(defaultStyle);
			} else {
				BTN_Superscript.setStyle(defaultStyle);
			}
		});

		BTN_Subscript.setOnAction(event -> {
			if (BTN_Subscript.getStyle().equals(defaultStyle)) {
				BTN_Superscript.setStyle(defaultStyle);
				BTN_Subscript.setStyle(clickedStyle);
			} else {
				BTN_Subscript.setStyle(defaultStyle);
			}
		});

		BoldBUtton.setOnAction(event -> {
			if (BoldBUtton.getStyle().equals(defaultStyle)) {
				BoldBUtton.setStyle(clickedStyle);
			} else {
				BoldBUtton.setStyle(defaultStyle);
			}
		});

		BTN_Italic.setOnAction(event -> {
			if (BTN_Italic.getStyle().equals(defaultStyle)) {
				BTN_Italic.setStyle(clickedStyle);
			} else {
				BTN_Italic.setStyle(defaultStyle);
			}
		});

		BTN_Underline.setOnAction(event -> {
			if (BTN_Underline.getStyle().equals(defaultStyle)) {
				BTN_Underline.setStyle(clickedStyle);
			} else {
				BTN_Underline.setStyle(defaultStyle);
			}
		});

		// Set up the scene and the stage
		Scene scene = new Scene(hbox, 300, 200);

		stage.setTitle("Visual Grouping Example");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}
}