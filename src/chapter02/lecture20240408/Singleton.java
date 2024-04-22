// vgl. Software-Engineering Pattern
package chapter02.lecture20240408;


public class Singleton {
	private static Singleton instance;
	private Singleton() {
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
}
