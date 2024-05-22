package chapter06.lecture20240515;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		int foo = 42;
//		doSomething();
		
		// try ... catch(... err)
//		try {			
//			throw new BeliebigeKlasse();
//		} catch(BeliebigeKlasse e) {
//			// Datentyp beschreibt, worum sich diese Block kümmert
//			e.printStackTrace();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		// Multi-Catch als bessere Lösung anstatt auf "Exception" zur Vereinfachung zu wechseln
		try {
			ExceptionExample.class.newInstance();
			ExceptionExample.class.getField("test");
		} catch (InstantiationException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		// Try-Catch-Ressource
		FileWriter writer = null;
		try {
			writer = new FileWriter(new File("abc"));
			writer.write("some string");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try(FileWriter writer2 = new FileWriter(new File("abc"))) {
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		// Was macht finally?
		// -> wenn ein Fehler passiert, dann wird das noch ausgeführt
		// -> auch wenn kein Fehler passiert, wird es mit ausgeführt
	}

	private static void doSomething() throws Exception {
		doOtherthing();
	}

	private static void doOtherthing() throws Exception {
		try {
			// <- wurde ausgeführt
			throw new BeliebigeKlasse();
			// <- wird nicht ausgeführt, weil abgebrochen
		} catch(Exception e) {
			// ... weiter im catch
//			e.printStackTrace();
			//Throwable cause = e.getCause();
			// Throwable ist die Elternklasse von Exception
			throw new Exception("Funktion falsch aufgerufen...", e);
		}
	}
	
	
	// Was steckt in einer Exception neben dem StackTrace / CallStack
	// -> Message: Informationen zum Nachvollziehen des Fehlers
	// -> Cause: cause ist der Grund warum eine Exception passiert ist
	//    wenn dies eine Exception war
	
}
