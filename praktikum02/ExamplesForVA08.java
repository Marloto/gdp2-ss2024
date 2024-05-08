import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExamplesForVA08 {
	public static void main(String[] args) {
		// Gestrichelte Linie: Dependency, bedeutet "Verwendung"
		// Liste (nachher in der Vorlesung)
		// -> beliebig viele AudioFile, was war das Problem mit Arrays?
		// -> Arrays haben eine feste Länge
		// -> Man hätte bei Arrays irgendwie diese "vergrößern" müssen
		
		// Eindache "dynamische" Array-like Struktur ist die ArrayList
		// -> vergrößert sich automatisch
		// -> spitze Klammern geben den Typ für einige Methoden (Parameter / Rückgabe) an, dieser wird
		//    dann verwendet
		ArrayList<AudioFile> arrayList1 = new ArrayList<AudioFile>();
//		ArrayList arrayList2 = new ArrayList();
		
		// Hinzufügen: arrayList1.add(...)
		// Löschen: arrayList1.remove(...)
		// Auslesen: AudioFile file = arrayList.get(0)
		
		// ArrayList kann auch in for-each-Schleifen genutzt werden
		for(AudioFile element : arrayList1) {
			System.out.println(element);
		}
		
		// Was nicht geht sind [<index>]
		
		// Was sind verketten Listen wird mit Referenzen auf die "nächsten", ggf. "vorherigen" Elemente
		// verwiesen
		List<AudioFile> list1 = new LinkedList<>();
		// Hinzufügen: list1.add(...)
		// Löschen: list1.remove(...)
		// Auslesen: list1 file = arrayList.get(0)
		
		// ... some minutes later ...
		
		// Sowohl ArrayList als auch LinkedList implementieren die Schnittstelle List
		
		
		// m3u-Files als Grundlage für PlayLists?
		
		// ----- File Read -----
		File file = new File("test.m3u");
//		Scanner scanner = null;
//		try {
//			scanner = new Scanner(file);
//			while (scanner.hasNextLine()) {
//				String line = scanner.nextLine();
//				// ... ergänzen Sie Ihre Logik um Kommentare (#), leere Zeilen und sinnvolle Zeilen
//				System.out.println(line);
//			}
//			
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			scanner.close();
//		}

		try(Scanner scanner = new Scanner(file)) {
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				// ... ergänzen Sie Ihre Logik um Kommentare (#), leere Zeilen und sinnvolle Zeilen
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ----- File Write -----
		File file2 = new File("test2.m3u");
//		FileWriter writer = null;
//		try {
//			writer = new FileWriter(file2);
//			// Hier sinnvoll mit der Datenstruktur und den AudioFiles arbeiten
//			writer.write("Test\n");
//			writer.write("Test\n");
//			writer.write("Test\n");
//			writer.write("Test\n");
//		} catch(Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				writer.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		try(FileWriter writer = new FileWriter(file2)) {
			// Hier sinnvoll mit der Datenstruktur und den AudioFiles arbeiten
			writer.write("Test\n");
			writer.write("Test\n");
			writer.write("Test\n");
			writer.write("Test\n");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
