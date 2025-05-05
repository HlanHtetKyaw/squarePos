package com.hlan.squarePos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.hlan.squarePos.backend.product.domain.service.ProductService;
import com.hlan.squarePos.frontend.mainScreen.MainScreen;
import com.hlan.squarePos.frontend.router.Router;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

@SpringBootApplication
@Component
public class SquarePosApplication extends Application {

	private ConfigurableApplicationContext applicationContext;
	@Autowired
	private ProductService productService;
	private Stage primaryStage;
	private Stage loadingStage;
	private ProgressIndicator progressIndicator;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
//		showMainApp();
		showLoadingScreen();
		startSpringAndJavaFX();
	}

	private void showLoadingScreen() {
		loadingStage = new Stage();
		loadingStage.initStyle(StageStyle.UNDECORATED);
		loadingStage.setResizable(false);
		Label loadingLabel = new Label("Loading Application...");
		progressIndicator = new ProgressIndicator();
		progressIndicator.setPrefSize(50, 50);
		StackPane root = new StackPane();
		root.getChildren().addAll(loadingLabel, progressIndicator);
		StackPane.setAlignment(loadingLabel, Pos.CENTER);
		StackPane.setAlignment(progressIndicator, Pos.BOTTOM_CENTER);
		StackPane.setMargin(progressIndicator, new Insets(0, 0, 20, 0));
		Scene scene = new Scene(root, 400, 200);
		loadingStage.setScene(scene);
		loadingStage.show();
	}

	private void startSpringAndJavaFX() {
		Task<Void> initTask = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				SpringApplicationBuilder builder = new SpringApplicationBuilder(SquarePosApplication.class);
				applicationContext = builder.run();
				applicationContext.getAutowireCapableBeanFactory().autowireBean(SquarePosApplication.this);
				productService.gettingData();
				return null;
			}

			@Override
			protected void succeeded() {
				Platform.runLater(() -> {
					showMainApp();
					loadingStage.close();
				});
			}

			@Override
			protected void failed() {
				Platform.runLater(() -> {
					loadingStage.close();
					showError("Application initialization failed: " + getException().getMessage());
				});
			}
		};

		Thread thread = new Thread(initTask);
		thread.setDaemon(true);
		thread.start();
	}

	private void showMainApp() {
		MainScreen mainScreen = new MainScreen();
		Router router = new Router();
		primaryStage.setScene(mainScreen.getScene());
		primaryStage.setMaximized(true);
		primaryStage.show();
		router.initializeStage(primaryStage);
	}

	private void showError(String message) {
		Label errorLabel = new Label(message);
		StackPane root = new StackPane(errorLabel);
		Scene scene = new Scene(root, 400, 200);
		Stage errorStage = new Stage();
		errorStage.setScene(scene);
		errorStage.show();
	}

	@Override
	public void stop() throws Exception {
		if (applicationContext != null) {
			applicationContext.close();
		}
	}
}