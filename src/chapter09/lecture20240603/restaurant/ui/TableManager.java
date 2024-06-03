package chapter09.lecture20240603.restaurant.ui;

import java.util.ArrayList;
import java.util.List;

import chapter09.lecture20240603.restaurant.model.Article;
import chapter09.lecture20240603.restaurant.model.Reservation;
import chapter09.lecture20240603.restaurant.model.Table;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TableManager extends Application {
    
    private ArrayList<Table> tables;
    private ArrayList<Article> articles;
    
    private Table current;
	private Label tableLabel;
	private ListView<Reservation> reservations;
	private ListView<String> orders;
	private ChoiceBox<Article> selectArticle;
	private Button addArticle;
	private TextField date;
	private TextField name;
	private Button addReservation;
    
    public void init() throws Exception {
        this.tables = new ArrayList<>();
        this.articles = new ArrayList<>();
        
        for(int i = 0; i < 10; i ++) {
            this.tables.add(new Table(i));
        }
        
        this.tables.get(0).addReservation(new Reservation("10:00", "A"));
        this.tables.get(0).addReservation(new Reservation("20:00", "B"));
        this.tables.get(1).addReservation(new Reservation("20:00", "C"));
        
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
    	
    	tableLabel = new Label("Tische");
    	reservations = new ListView<>();
    	orders = new ListView<>();
    	selectArticle = new ChoiceBox<>();
    	addArticle = new Button("Add");
    	date = new TextField();
    	name = new TextField();
    	addReservation = new Button("Add");
    	
    	// Wichtig: Bei mehreren gleichen auch auf Schleifen zurückgreifen
    	List<Button> list = new ArrayList<>();
    	for(int i = 0; i < this.tables.size(); i ++) {
    		Table table = this.tables.get(i);
    		Button tableButton = new Button(table.toString());
    		list.add(tableButton);
    	}
    	
    	// Befüllen der Artikel
    	selectArticle.setItems(FXCollections.observableArrayList(this.articles));
    	
    	// Layout zusammenbauen
    	main.getChildren().addAll(tables, config);
    	for(Button tableButton : list) {
    		tables.getChildren().add(tableButton);
    	}
    	config.getChildren().addAll(tableLabel, reservations, formReservations, orders, formOrders);
    	formReservations.getChildren().addAll(date, name, addReservation);
    	formOrders.getChildren().addAll(selectArticle, addArticle);
    	
    	
    	
    	
    	// Event-Handling
    	//for(Button tableButton : list) {
    	for(int i = 0; i < list.size(); i ++) {
    		Button tableButton = list.get(i);
    		Table table = this.tables.get(i);
    		tableButton.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
//					System.out.println(tableButton);
//					System.out.println(event.getTarget());
					if(current == table) {
						current = null;
					} else {
						current = table;
					}
					refreshUi();
				}

    		});
    	}
    	
    	addReservation.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(current != null) {					
					String d = date.getText();
					String n = name.getText();
					// falls Variable und Attribut gleich benannt
					// -> TableManager.this.date.getText()
					current.addReservation(new Reservation(d, n));
					// Date is valid!?
					refreshUi();
				}
			}
    	});
    	
    	addArticle.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				if(current != null) {
					Article item = selectArticle.getSelectionModel().getSelectedItem();
					current.addToBill(item);
					refreshUi();
				}
			}
    	});
    	
    	
    	refreshUi();
    	
    	
        Scene scene = new Scene(main);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void refreshUi() {
    	ObservableList<Reservation> reservationItems = reservations.getItems();
    	reservationItems.clear();
    	
    	ObservableList<String> orderItems = orders.getItems();
    	orderItems.clear();
    	
    	if(current == null) {
    		tableLabel.setText("No table selected");
    		reservations.setDisable(true);
    		orders.setDisable(true);
    		name.setDisable(true);
    		date.setDisable(true);
    		selectArticle.setDisable(true);
    		addArticle.setDisable(true);
    		addReservation.setDisable(true);
    	} else {
    		reservations.setDisable(false);
    		orders.setDisable(false);
    		name.setDisable(false);
    		date.setDisable(false);
    		selectArticle.setDisable(false);
    		addArticle.setDisable(false);
    		addReservation.setDisable(false);
    		
    		tableLabel.setText(current.toString());
    		
    		for(Reservation r: current.getReservations()) {
    			reservationItems.add(r);
    		}
    		for(Article a: current.getArticle()) {
    			String text = current.getArticleCount(a) + "x " + a;
    			orderItems.add(text);
    		}
    	}
    }

}
