package chapter05.lecture20240430.observe;

public class MessageCounter implements IReceiver {
	private int noMsgs = 0;
	private int totalSize = 0;

	public void dataChanged(String newData) {
		noMsgs++;
		totalSize += newData.length();
		System.out.printf("[MessageCounter] #msgs=%d, total size=%d bytes%n", noMsgs, totalSize);
	}
}
