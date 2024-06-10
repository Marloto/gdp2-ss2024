package chapter10.lecture20240610.classtypes;

import chapter10.lecture20240610.classtypes.ExampleA.ExampleD;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Main {
	public static void main(String[] args) {
		new ExampleA(1);
		new ExampleB();
		// new ExampleC(); geht nicht, kein umschließendes Objekt von ExampleA
		new ExampleD();
		
		EventHandler<ActionEvent> handler = ev -> System.out.println("Hello, World!");
	}
}
