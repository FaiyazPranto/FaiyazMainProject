/**
 * Name: Faiyaz Altaf Pranto
 * Group: 38
 * UCID: 30162576
 * Course: CPSC 233 Summer '22
 * Tutorial: 02
 * Date: 17 August, 2022
 */

package application;
	
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
			VBox root = loader.load(new FileInputStream("src/application/WorldCupTrackerView.fxml"));
			Scene scene = new Scene(root,1000, 800);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Football World Cup 2022 Tracker");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
