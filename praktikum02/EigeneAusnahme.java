public class EigeneAusnahme extends Exception {
	private String a;
	private String b;
	private int c;

	public EigeneAusnahme(String a, String b, int c) {
		super(a + b + c);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public String getA() {
		return a;
	}
	
	public String getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
}
