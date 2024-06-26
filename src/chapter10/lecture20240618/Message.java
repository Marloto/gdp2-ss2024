package chapter10.lecture20240618;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

public class Message {
	private static Message last;
	
	private long time;
	private String message;

	public Message(long time, String message) {
		this.time = time;
		this.message = message;
	}
	
	public long getTime() {
		return time;
	}

	public String getMessage() {
		return message;
	}

	public String toString() {
		return this.formattedTime() + ": " + this.message;
	}

	public String formattedTime() {
		return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new Date(time));
	}
	
	public static void main(String[] args) {
		List<String> messages = Arrays.asList(
			    "1581697831661:Message 1",
			    "1581553746009:Message 2",
			    "1588854263313:Message 3",
			    "1589381962905:Message 4",
			    "1589379566771:Message 5");
		
		messages.stream()
			.map(logMessage -> logMessage.split(":"))
			.map(splittedLogMessage -> {
				long time = Long.parseLong(splittedLogMessage[0]);
				String msg = splittedLogMessage[1];
				return new Message(time, msg);
			})
			.filter(el -> last == null || el.getTime() >= last.getTime())
			.peek(cur -> last = cur)
			.forEach(System.out::println);
		// .map(splittedLogMessage -> new Message(Long.parseLong(splittedLogMessage[0]), splittedLogMessage[1]));
	}
}
