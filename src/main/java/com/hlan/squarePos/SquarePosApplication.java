package com.hlan.squarePos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.hlan.squarePos.product.domain.service.ProductService;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

@SpringBootApplication
@Component
public class SquarePosApplication extends Application {

    private ConfigurableApplicationContext applicationContext;
    @Autowired
    private ProductService productService;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void init() throws Exception {
        applicationContext = SpringApplication.run(SquarePosApplication.class);
        applicationContext.getAutowireCapableBeanFactory().autowireBean(this);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane root = new Pane();
        Scene scene = new Scene(root);
        root.setBackground(Background.fill(Color.WHITE));
        primaryStage.setScene(scene);
        primaryStage.show();
        productService.gettingData();
    }

    @Override
    public void stop() throws Exception {
        applicationContext.close();
    }
}