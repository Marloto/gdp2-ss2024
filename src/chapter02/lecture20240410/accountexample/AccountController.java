package chapter02.lecture20240410.accountexample;

import java.util.Scanner;

public class AccountController {
	public static void main(String[] args) {
		Account[] accounts = new Account[] {
				new Account("DE02500105170137075030", 1234),
				new Account("DE91100000000123456789", 1234),
				new Account("DE02100100100006820101", 1234),
				new Account("DE02120300000000202051", 1234)
		};
		
		Scanner scanner = new Scanner(System.in);
		
		String iban = scanner.next();
		int pin = scanner.nextInt();
		
		Account current = null;
		for(int i = 0; i < accounts.length; i ++) {
			// iban vergleich, wie den pin
			if(accounts[i].getIban().equals(iban)) {
				current = accounts[i];
				break;
			}
		}
		if(current == null) {
			System.out.println("Error!");
			return;
		} else {
			if(current.check(pin)) {
				System.out.println("Login perfekt!");				
			}
		}
	}
}
