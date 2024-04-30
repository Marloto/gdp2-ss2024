package chapter05.lecture20240430.observe;

public class App {
	public static void main(String[] args) {
		// Generelle Frage: wie logger und counter in sender integrieren?
		IReceiver counter = new MessageCounter();
		ChangeLogger logger = new ChangeLogger();
		IReceiver filter = new BadWordsFilter(
				new String[] {"World"});
		Sender sender = new Sender();
		sender.attach(counter);
		sender.attach(logger);
		sender.attach(filter);
		sender.setData("Hello World!");
		sender.setData("Hello Universe!");

		// Logger lässt sich auf beide Schnittstellen
		// zuweisen, schränkt den Methoden Umfang 
		// ein... Verwender von foo und bar
		// ist dann erstmal an diese gebunden
		Starter foo = logger;
		IReceiver bar = logger;
		
		
	
		
//		filter.doSomething("Hello World!");
		
		
	}
}
