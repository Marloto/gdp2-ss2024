package chapter02.lecture20240325;
class Account {
	String mail;
	String username;
	String password;
	
	public Account(String mail) {
		this.mail = mail;
		this.username = "";
		this.password = "";
	}

	boolean check(String password) {
		return false;
	}
	
	public static void main(String[] args) {
		// Lokale variablen: 
		//   <datentyp> <name> [= <wert>];
		Account someAcc1 = new Account("");
	}




}