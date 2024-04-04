
class Tier {
	int alter;
}

class ParameterBeispiele {
	void doSomething(int xyz) {
		xyz = 21;
		System.out.println("doSomething: " + xyz);
	}
	
	void doSomething(Tier tier) {
		tier.alter = 21;
		System.out.println("doSomething (Tier): " + tier.alter);
	}
	
	
	public static void main(String[] args) {
		ParameterBeispiele beispiele = new ParameterBeispiele();
		
		int foo = 42;
		beispiele.doSomething(foo);
		System.out.println("main: " + foo);
		
		Tier tier1 = new Tier();
//		tier1.alter = 42;
		beispiele.doSomething(tier1);
		System.out.println("main (Tier): " + tier1.alter);
	}
}
