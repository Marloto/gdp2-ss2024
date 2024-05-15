package chapter06.lecture20240515;

public class ExceptionExample {
	public static void main(String[] args) {
		doSomething();
	}

	private static void doSomething() {
		doOtherthing();
	}

	private static void doOtherthing() {
		try {
			// <- wurde ausgeführt
			throw new Exception("Test");
			// <- wird nicht ausgeführt, weil abgebrochen
		} catch(Exception e) {
			// ... weiter im catch
		}
	}
}
