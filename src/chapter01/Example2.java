package chapter01;

public class Example2 {
	static void doSomething(int a, int b) {
		System.out.println("Hello: " + a + " / " + b);
	}
	public static void main(String[] args) {
		doSomething(10, 42);
		doSomething(42, 10);
		
	}
}
