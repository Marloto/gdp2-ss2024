public class GgtMain {
	
	/* Vorlage in C:
			int ggt(int a, int b) {
			    while (b != 0) {
			        int temp = b;
			        b = a % b;
			        a = temp;
			    }
			    return a;
			}
		
	   Alternative in Java (Iteration)
			int ggt(int a, int b) {
			    while (b != 0) {
			        int temp = b;
			        b = a % b;
			        a = temp;
			    }
			    return a;
			}
			
	   Alternative in Java (Rekursion)
	 */
	public static int ggT(int num1, int num2) {
		 if (num2 == 0) {
             return num1;
         }
		 return ggT(num2, num1 % num2);
	}
	
	public static int kgV (int a, int b){
        return (a*b) / ggT(a,b);
    }
	
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("m = ");
		int m = scanner.nextInt();
		System.out.print("n = ");
		int n = scanner.nextInt();

		// ... ggT und kgV aufrufen
		int ggT = ggT(m,n);
		int kgV = kgV(m,n);

		// Nutze die folgenden Ausgaben
		System.out.printf("ggT( %d, %d) = %d\n", m, n, ggT); 
		System.out.printf("kgV( %d, %d) = %d\n", m, n, kgV); 
	}
}