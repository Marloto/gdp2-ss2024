package accountexample;

public class Account {
	private String iban;
	private int pin;
	private double balance;

	public Account(String iban, int pin, double balance) {
		this.iban = iban;
		this.pin = pin;
		this.balance = balance;
	}

	public Account(String iban, int pin) {
		this(iban, pin, 0);
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean equals(Object obj) {
		Account other = (Account) obj;
		return iban.equals(other.iban);
	}

	public String toString() {
		return "Account [iban=" + iban + ", balance=" + balance + "]";
	}


	public boolean check(int pin) {
		return this.pin == pin;
	}

}
