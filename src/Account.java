class Account {
	String mail;
	String username;
	String password;
	
	public Account(String mail) {
		this.mail = mail;
		this.username = "";
		this.password = "";
	}
	
	public void setMail(String mail) {
		if(mail == null) {
			return;
		}
		this.mail = mail;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMail() {
		return mail;
	}

	boolean check(String password) {
		return false;
	}
	
	public static void main(String[] args) {
		// Lokale variablen: 
		//   <datentyp> <name> [= <wert>];
		Account someAcc1 = new Account("");
	}
	
	public boolean equals(Object obj) {
		if(obj == null) {
			return false;
		}
		if (this == obj) {
            return true;
        }
		Account acc = (Account) obj;
		String username = this.username;
		if(username == null && acc.username == null) {
			return this.mail.equals(acc.mail); 
		} else if(username == null) {
			return false;
		} else if(acc.username == null) {
			return false;
		}
		// Strings ebenfalls mit equals vergleichen!
		return this.mail.equals(acc.mail) &&
			   this.username.equals(acc.username);
		//           ^ ref. String
		//             equals an der String-Klasse wird aufgerufen
	}




}