package com.hlan.squarePos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

@SpringBootApplication
public class SquarePosApplication extends Application {
	public static void main(String[] args) {
		SpringApplication.run(SquarePosApplication.class, args);
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
		
		Scene scene = new Scene(root);
		root.setBackground(Background.fill(Color.WHITE));
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
