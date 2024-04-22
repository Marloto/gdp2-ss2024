package chapter03.lecture20240417.sub;

import chapter03.lecture20240417.Base;

public class Child extends Base {
	private int d;
	
	
	public void f() {
		a = 1;
		b = 2;
		//c = 3;
		//d = 4;
		f();
		g();
		//h();
		//k();
	}
	
	public static void main(String[] args) {
		Child child = new Child();
	}
}
