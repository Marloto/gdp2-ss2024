
public class ArrayAverage {
	public static void main(String[] args) {
		// Beispiel 1
		int[] numbers = new int[] {10, 2, 42, 21, -1};
		int sum = 0;
		int anzahl = 0;
		// for-schleife, for-each?
		// for(int i = 0; i < numbers.length; i ++) { ... }
		for(int zahl : numbers) {
			sum += zahl;
			anzahl ++;
		}
		System.out.println(sum / anzahl);
		
		// Beispiel 2
		Rechteck[] quadrate = new Rechteck[] {
			    new Rechteck(5),
			    new Rechteck(10),
			    new Rechteck(20)
		};
		
		sum = 0;
		for(Rechteck element : quadrate) {
			sum += element.breite;
		}
		System.out.println(sum / quadrate.length);
		
		// rechteck2[i].breite 
	}
}
