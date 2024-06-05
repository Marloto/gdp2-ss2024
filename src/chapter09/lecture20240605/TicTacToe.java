package chapter09.lecture20240605;

import java.util.List;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TicTacToe extends Application {
	 
	  private Label nachrichtLabel;
	  private int dimension = 3; // Spielfeld-Dimension: 3 x 3
	  private TicTacToeButton[][] buttons = new TicTacToeButton[dimension][dimension];
	  
	  private char zeichen = 'X'; // <- gibt an, wer gerade dran ist
	  private EventHandler<ActionEvent> buttonHandler; // <- allgemeiner Handler
	  
	  
	 
	  public void start(Stage primaryStage) throws Exception {
	    buttonHandler = new EventHandler<ActionEvent>() {
	      public void handle(ActionEvent event) {
	        TicTacToeButton button = (TicTacToeButton) event.getTarget();
	        // ... Spielerwechsel + Button-Text anpassen + check ob gewonnen
	        // Aktuellen Button mit Symbol füllen
	        if(button.getText().isEmpty()) {	        	
	        	button.setZeichen(zeichen);
	        	
	        	boolean gewonnen = gewonnen();
	        	
	        	if(gewonnen) {
	        		// spiel vorbei
	        		nachrichtLabel.setText("Spieler " + zeichen + " hat gewonnen!");
	        		for(int i = 0; i < dimension * dimension; i ++) {
	        	    	int row = i / dimension;
	        	    	int col = i % dimension;
	        	    	buttons[row][col].setDisable(true);
	        		}
	        	} else {	        		
//	        if(zeichen == 'X') {
//	        	zeichen = 'O';
//	        } else {
//	        	zeichen = 'X';
//	        }
	        		zeichen = zeichen == 'X' ? 'O' : 'X';
	        		nachrichtLabel.setText("Spieler " + zeichen + " ist am Zug!");
	        		button.setDisable(true);
	        	}
	        	
	        }
	      }
	    };
	    
	    // Bzgl. Frage was das getChildren macht:
	    FlowPane pane2 = new FlowPane(); // HBox / VBox
	    List<Node> children = pane2.getChildren(); // alle Pane's verwalten Kinder in einer Liste
	 
	    GridPane pane = new GridPane();
	    
//		Variante 1 (Aufgabe 2 im Miro Board)
//	    for(int y = 0; y < dimension; y ++ ) { // <- row
//	    	for(int x = 0; x < dimension; x ++ ) { // <- col
//	    		buttons[y][x] = new Button();
//	            pane.add(buttons[y][x], x, y);
//	    	}
//	    }
	    
//		Variante 2 (Aufgabe 2 im Miro Board)
	    for(int i = 0; i < dimension * dimension; i ++) {
	    	int row = i / dimension;
	    	int col = i % dimension;
	    	buttons[row][col] = new TicTacToeButton();
	    	buttons[row][col].setFont(new Font(40)); // <- nicht nötig, nur für "gut" aussehen
	    	buttons[row][col].setMinSize(100, 100);  // <- nicht nötig, nur für "gut" aussehen
	    	buttons[row][col].setOnAction(buttonHandler); // <- nutze generelle Handle-Instanz
	    	pane.add(buttons[row][col], col, row);
	    }
	 

	    // Rest für Aufgabe 2, Label
	    nachrichtLabel = new Label("Spieler " + zeichen + " ist am Zug!");
	    pane.add(nachrichtLabel, 0, 4, dimension, 1); // <- alternativ geht auch eine VBox als zusätzliche Layoutstruktur
	 
	    Scene scene = new Scene(pane, 300, 320);
	    primaryStage.setScene(scene);
	    primaryStage.setTitle("Tic Tac Toe");
	    primaryStage.show();
	  }
	  
	  private boolean check(Button a, Button b, Button c) {
		  return a.getText().equals(b.getText()) && b.getText().equals(c.getText()) && !c.getText().isEmpty();
	  }
	 
	  private boolean gewonnen() {
		  // Array verwenden
		  // wenn etwas drei mal in einer Reihe ist
		  // wenn etwas drei mal in einer Spalte ist
		  // zzgl. diagonal
		  
		  for(int i = 0; i < dimension; i ++) {
			  if(check(buttons[i][0], buttons[i][1], buttons[i][2])) {
				  return true;
			  }
			  if(check(buttons[0][i], buttons[1][i], buttons[2][i])) {
				  return true;
			  }
		  }
		  if(check(buttons[0][0], buttons[1][1], buttons[2][2])) {
			  return true;
		  }
		  if(check(buttons[2][0], buttons[1][1], buttons[0][2])) {
			  return true;
		  }
		  
		  return false;
	  }
	 
}
