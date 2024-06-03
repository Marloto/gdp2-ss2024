package chapter09.lecture20240529;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class SomeActionHandler implements EventHandler<ActionEvent>{
	public void handle(ActionEvent event) {
		// was passiert wenn...
		System.out.println("Klick!");
	}

}
