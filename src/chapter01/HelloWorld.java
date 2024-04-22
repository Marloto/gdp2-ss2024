package chapter01;
class HelloWorld {
	public static void main(String[] args) {
		String hallo = "Hello," + " World!";
		System.out.print(hallo);
		System.out.print("\n");
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		
		int x = scanner.nextInt();
		System.out.println(x + 5);
		
		int zaehler = 0;
		int a = ++ zaehler;
		System.out.println(a);
		
		if(42 == 21 * 2) {
			System.out.println("Passt...");
		}
		
		// int i = 10; <- nur zum start
		// i < 42 je durchlauf zum beginn
		// i ++ am ende
		foo: for(int i = 10; i < 42; i ++) {
			System.out.println(i);
			for(int j = 10; j < 42; j ++) {
				break foo;
			}
			break;
		}
		System.out.println("etwas schickes..");
	}
}