package chapter05.lecture20240430.observe;

public class ChangeLogger implements IReceiver, Starter {
	public void dataChanged(String newData) {
		System.out.println("[ChangeLogger] New data: " + newData);
	}

	public void init() {
		System.out.println("Init called");
	}
}
