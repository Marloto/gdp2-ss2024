package chapter03.lecture20240422;

// Kein Default-Konstruktor!
class A {
	A(int a) {} // parameter konstruktor
	
	int doSomething(int a) { return 0;}
}

class B extends A{
	public B() {
		super(1);
	}

	int doSomething(int a) {
		return 0;
	}
}



public class Struktur {
	public static void main(String[] args) {
		final B b = new B();
		b.doSomething(12);
		b.equals(b);
		new A(1);
	}
}
