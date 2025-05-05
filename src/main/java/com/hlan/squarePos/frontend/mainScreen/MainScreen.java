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
//	public static class Product {
//	    private String productName;
//	    private double originalPrice;
//	    private double sellPrice;
//	    private String extraColumn;
//
//	    public Product(String productName, double originalPrice, double sellPrice, String extraColumn) {
//	        this.productName = productName;
//	        this.originalPrice = originalPrice;
//	        this.sellPrice = sellPrice;
//	        this.extraColumn = extraColumn;
//	    }
//
//	    public String getProductName() {
//	        return productName;
//	    }
//
//	    public double getOriginalPrice() {
//	        return originalPrice;
//	    }
//
//	    public double getSellPrice() {
//	        return sellPrice;
//	    }
//
//	    public String getExtraColumn() {
//	        return extraColumn;
//	    }
//	}
	private void managingComponents() {
		// Create the root StackPane
        StackPane root = new StackPane();

        // Create the HBox for the buttons at the bottom
        HBox buttonBox = new HBox(10); // 10 is the spacing between buttons
        buttonBox.setAlignment(Pos.BASELINE_CENTER); // Align buttons to bottom center
        buttonBox.setMaxHeight(50); // Set a minimum height for the HBox

        // Create the four buttons
        Button button1 = new Button("Button 1");
        Button button2 = new Button("Button 2");
        Button button3 = new Button("Button 3");
        Button button4 = new Button("Button 4");
        
     // Set a larger font for all buttons
        Font buttonFont = Font.font("Arial", 18); // You can change "Arial" and 18
        button1.setFont(buttonFont);
        button2.setFont(buttonFont);
        button3.setFont(buttonFont);
        button4.setFont(buttonFont);
        
        // Add the buttons to the HBox
        buttonBox.getChildren().addAll(button1, button2, button3, button4);
        buttonBox.setStyle("-fx-background-color: blue;");
     // Create the TableView
        TableView<Product> table = new TableView<>();
        table.setPrefWidth(Double.MAX_VALUE); // Make table width flexible
        table.setPrefHeight(Double.MAX_VALUE);

        // Create the columns
        TableColumn<Product, String> productNameCol = new TableColumn<>("Product Name");
        productNameCol.setCellValueFactory(new PropertyValueFactory<>("productName"));

        TableColumn<Product, Double> originalPriceCol = new TableColumn<>("Original Price");
        originalPriceCol.setCellValueFactory(new PropertyValueFactory<>("originalPrice"));

        TableColumn<Product, Double> sellPriceCol = new TableColumn<>("Sell Price");
        sellPriceCol.setCellValueFactory(new PropertyValueFactory<>("sellPrice"));

        TableColumn<Product, String> extraColumnCol = new TableColumn<>("Extra Column");
        extraColumnCol.setCellValueFactory(new PropertyValueFactory<>("extraColumn"));

        // Add the columns to the table
        table.getColumns().addAll(productNameCol, originalPriceCol, sellPriceCol, extraColumnCol);

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
        table.setItems(data);

        // Wrap the table in a ScrollPane
        ScrollPane scrollPane = new ScrollPane(table);
        scrollPane.setFitToWidth(true); // Make the scrollpane fit the width
        scrollPane.setPrefWidth(Double.MAX_VALUE);
        scrollPane.setPrefHeight(Double.MAX_VALUE);

        // Create the Pane for the tables (to be added later)
        //Pane tablePane = new Pane();
        //tablePane.setStyle("-fx-background-color: lightgray;"); // Just for visualization

        // Add the HBox and tablePane to the StackPane
        root.getChildren().addAll(scrollPane, buttonBox);

        // Set layout constraints to position the HBox at the bottom
        StackPane.setAlignment(buttonBox, Pos.BOTTOM_CENTER);

        // Create the Scene
        scene = new Scene(root, 600, 400); // Initial size

        // Bind the HBox width to the scene width.  Make sure the buttons
        // resize properly when the scene is resized.
        buttonBox.prefWidthProperty().bind(scene.widthProperty());
        buttonBox.setMaxWidth(Double.MAX_VALUE); // Ensure HBox can expand to maxWidth

        // Position the tablePane at the top.
        StackPane.setAlignment(scrollPane, Pos.TOP_CENTER); // Use scrollPane here too
        // Bind scrollPane size to scene size, with a small top margin.
        scrollPane.prefWidthProperty().bind(scene.widthProperty());
        scrollPane.prefHeightProperty().bind(scene.heightProperty().subtract(buttonBox.getMinHeight()));

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
