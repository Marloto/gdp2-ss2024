package chapter02.lecture20240327;

public class Building {
	String name;
	int floors;

	Building(String n, int e) {
		floors = e;
		name = n;
	}

	void addFloor() {
		floors++;
	}

	void print() {
		System.out.print("Building ");
		System.out.print(this.name);
		System.out.print(" has ");
		System.out.print(this.floors);
		System.out.println(" floors.");
	}

	public static void main(String[] args) {
		Building build1 = new Building("A", 3);
		Building build2 = new Building("B", 1);
		Building build3 = new Building("C", 12);
		Building build4 = build1;
		build4.addFloor();
		build4 = build2;
		build2.addFloor();
		build3.addFloor();
		build4.addFloor();

		build1.print(); // Was ist die Ausgabe und warum?
		build2.print(); // Was ist die Ausgabe und warum?
		build3.print(); // Was ist die Ausgabe und warum?
		build4.print(); // Was ist die Ausgabe und warum?
	}
}