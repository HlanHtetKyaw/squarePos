package com.hlan.squarePos.frontend.mainScreen;

import com.hlan.squarePos.backend.product.domain.model.Product;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class MainScreen {
	private StackPane root;
	private Scene scene;
	private HBox buttonsBox;
	private Button addButton;
	public MainScreen(){
		root = new StackPane();
		scene = new Scene(root,500,500);
		managingComponents();
		root.setBackground(Background.fill(Color.WHITE));
	}

	private void managingComponents() {
		// Create the root StackPane
        StackPane root = new StackPane();

        // Create some sample data
        ObservableList<Product> data = FXCollections.observableArrayList(
//                new Product("Product 1", 19.99, 24.99, "Extra Data 1"),
//                new Product("Product 2", 29.99, 34.99, "Extra Data 2"),
//                new Product("Product 3", 9.99, 14.99, "Extra Data 3"),
//                new Product("Product 4", 49.99, 54.99, "Extra Data 4"),
//                new Product("Product 5", 14.99, 19.99, "Extra Data 5"),
//                new Product("Product 6", 24.99, 29.99, "Extra Data 6"),
//                new Product("Product 7", 39.99, 44.99, "Extra Data 7"),
//                new Product("Product 8", 59.99, 64.99, "Extra Data 8"),
//                new Product("Product 9", 69.99, 74.99, "Extra Data 9"),
//                new Product("Product 10", 79.99, 84.99, "Extra Data 10"),
//                new Product("Product 11", 89.99, 94.99, "Extra Data 11"),
//                new Product("Product 12", 99.99, 104.99, "Extra Data 12")
        );

        root.getChildren().addAll();

        // Create the Scene
        scene = new Scene(root, 600, 400); // Initial size
        
//		addButton = new Button("ADD");
//		buttonsBox = new HBox();
//		buttonsBox.getChildren().add(addButton);
//		buttonsBox.setBackground(Background.fill(Color.RED));
//		buttonsBox.maxWidthProperty().bind(scene.widthProperty().divide(1));
//		buttonsBox.setMaxHeight(100);
//		StackPane.setAlignment(buttonsBox, Pos.BOTTOM_CENTER);
//		root.getChildren().add(buttonsBox);
	}
	public Scene getScene() {
		return scene;
	}
}
