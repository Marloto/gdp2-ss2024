
class Zusatzklasse {
	private int foo;
	
	public void change(int foo) {
		this.foo = foo;
		
	}
	
	protected Zusatzklasse() {
	}
	
	public static void main(String[] args) {
		Zusatzklasse zusatzklasse = new Zusatzklasse();
		zusatzklasse.change(21);
	}
}
