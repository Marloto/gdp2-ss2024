package chapter09.lecture20240603.restaurant.ui;

import java.util.ArrayList;
import java.util.List;

import chapter09.lecture20240603.restaurant.model.Article;
import chapter09.lecture20240603.restaurant.model.Reservation;
import chapter09.lecture20240603.restaurant.model.Table;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableManager extends Application {
    
    private ArrayList<Table> tables;
    private ArrayList<Article> articles;
    
    public void init() throws Exception {
        this.tables = new ArrayList<>();
        this.articles = new ArrayList<>();
        
        for(int i = 0; i < 10; i ++) {
            this.tables.add(new Table(i));
        }
        
        this.articles.add(new Article("Pizza Diavolo", 12.99));
        this.articles.add(new Article("Pizza Margherita", 9.99));
        this.articles.add(new Article("Spagetthi Carbonara", 8.99));
        this.articles.add(new Article("Lasagne Bolognese", 9.99));
        this.articles.add(new Article("Rotwein Chianti 0,75l", 14.99));
        this.articles.add(new Article("Gemischter Salat", 4.99));
    }

    
    public void start(Stage primaryStage) throws Exception {
        
    	// Layout-Objekte erzeugen
    	HBox main = new HBox();
    	FlowPane tables = new FlowPane();
    	VBox config = new VBox();
    	HBox formReservations = new HBox();
    	HBox formOrders = new HBox();
    	
    	// Control Objekte erzeugen
    	Label tableLabel = new Label("Tische");
    	ListView reservations = new ListView();
    	ListView orders = new ListView();
    	ChoiceBox articles = new ChoiceBox();
    	Button addArticle = new Button("Add");
    	TextField date = new TextField();
    	TextField name = new TextField();
    	Button addReservation = new Button("Add");
    	
    	// Wichtig: Bei mehreren gleichen auch auf Schleifen zurückgreifen
    	List<Button> list = new ArrayList<>();
    	for(int i = 0; i < this.tables.size(); i ++) {
    		Button button = new Button("Tisch " + i);
    		list.add(button);
    	}
    	
    	// Layout zusammenbauen
    	main.getChildren().addAll(tables, config);
    	for(Button tableButton : list) {
    		tables.getChildren().add(tableButton);
    	}
    	config.getChildren().addAll(tableLabel, reservations, formReservations, orders, formOrders);
    	formReservations.getChildren().addAll(date, name, addReservation);
    	formOrders.getChildren().addAll(articles, addArticle);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        Scene scene = new Scene(main);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
