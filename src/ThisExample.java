
public class ThisExample {
	String foo;
	
	ThisExample() {
		this("abc");
		foo = this.getString();
		
		
	}
	
	ThisExample(String abc) {
		foo = abc;
	}
	
	String getString() {
		return "abc";
	}
	
	
	public static void main(String[] args) {
		ThisExample thisExample = new ThisExample("123");
		thisExample.doSomething("test");
	}

	void doSomething(String foo) {
		// implizites Attribut "this"
		System.out.println(this);
		ThisExample ex = this;
		
		
		this.foo = "ABC";
	}
}
