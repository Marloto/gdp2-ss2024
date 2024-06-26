package chapter10.lecture20240617;

import java.util.function.Consumer;

public class LambdaExample {
	public interface G<T, K> {
		T more(K val);
	}
	
	public static void main(String[] args) {
		G<Integer, String> example1 = (s) -> Integer.valueOf(s);
		// G<Integer, String> example2 = (s) -> { return "";}; // <- passt nicht, da
		// typ nicht zu Integer "Castbar"
		
		
		Consumer<String> doSomething = (ref) -> System.out.println(ref);
		Consumer<String> doSomething2 = System.out::println;
		
	}
}
