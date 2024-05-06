package chapter05.lecture20240506.sorter;

public class Bubblesort {
    /**
     * Sortiert "studenten" aufsteigend gemäß Bubblesort-Verfahren. Sortiert nach
     * Matrikelnummer.
     */
    public static void sortiere(Sorter2[] arr) { // Object[] arr
        boolean getauscht = true;

        if (arr.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < arr.length - 1; ++i) {
            	// quadrate[i].getSeitenlaenge() > quadrate[i + 1].getSeitenlaenge()
            	// arr[i].getMatrikelnummer() > arr[i + 1].getMatrikelnummer()
            	// sorter.check(arr[i], arr[i + 1])
            	// Datentyp hat arr[i] (alles was in der Schnittstelle implementiert ist)
            	// Datentyp hat arr[i + 1]
            	// -> was kann aufgerufen werden?
            	// -> check aufrufen
                if (arr[i].check(arr[i + 1])) {
                    Sorter2 tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }
    
    /**
     * Sortiert "studenten" aufsteigend gemäß Bubblesort-Verfahren. Sortiert nach
     * Matrikelnummer.
     */
    public static void sortiere(Object[] arr, Sorter sorter) { // Object[] arr
        boolean getauscht = true;

        if (arr.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < arr.length - 1; ++i) {
            	// quadrate[i].getSeitenlaenge() > quadrate[i + 1].getSeitenlaenge()
            	// arr[i].getMatrikelnummer() > arr[i + 1].getMatrikelnummer()
                if (sorter.check(arr[i], arr[i + 1])) {
                    Object tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }
    
    /**
     * Sortiert "studenten" aufsteigend gemäß Bubblesort-Verfahren. Sortiert nach
     * Matrikelnummer.
     */
    public static void sortiereStudenten(Student[] studenten) { // Object[] arr
        boolean getauscht = true;

        if (studenten.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < studenten.length - 1; ++i) {
            	// Was ist notwendig für die sortierung, was wird benötigt
            	// und was könnte ein rückgabe wert sein?
            	// -> Was ist der "Input" -> zwei Objekte
            	// -> ergebnis als boolean
                if (studenten[i].getMatrikelnummer() > studenten[i + 1].getMatrikelnummer()) {
                    Student tmp = studenten[i];
                    studenten[i] = studenten[i + 1];
                    studenten[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }

    /**
     * Sortiert "quadrate" aufsteigend gemäß Bubblesort-Verfahren. Sortiert nach
     * Seitenlänge.
     */
    public static void sortiereQuadrate(Quadrat[] quadrate) {
        boolean getauscht = true;

        if (quadrate.length <= 1)
            return;

        while (getauscht) {
            getauscht = false;
            for (int i = 0; i < quadrate.length - 1; ++i) {
                if (quadrate[i].getSeitenlaenge() > quadrate[i + 1].getSeitenlaenge()) {
                    Quadrat tmp = quadrate[i];
                    quadrate[i] = quadrate[i + 1];
                    quadrate[i + 1] = tmp;
                    getauscht = true;
                }
            }
        }
    }
}
