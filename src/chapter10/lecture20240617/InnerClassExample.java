package chapter10.lecture20240617;

public class InnerClassExample {
	private int abc; // <- wie war es damit
	
	
	public class Something {
		public void foo() {
			// kann man hier auf abc zugreifen?
			System.out.println(abc);
		}
	}
	
	public InnerClassExample() {
		new Something().foo();
	}
	
	public void doSomething() {
		new Something();
	}
	
	public static void doOtherthing() {
		// new Something(); <- geht nicht
		
	}
	
	public static void main(String[] args) {
		// new Something(); // <- geht nicht
		
		new InnerClassExample();
	}
}
