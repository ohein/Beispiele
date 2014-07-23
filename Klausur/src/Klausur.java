
public class Klausur {

	public static void main(String[] args) {
		
		int K = 3;
		
		for (int j = 100; j>=1; j=j-20)
			if (j > 40)
				System.out.println(j); // Wie oft wird println ausgeführt?
		
		for (int j = 1; j<=10; j++) {
			int i=5;
			while (i <= 10) {
				System.out.println(i); // Wie oft wird println ausgeführt?
				i=i+1;
			}
		}
			
		for (int i=1; i<=20; i++)
			if (i == 5)
				for (int j = 1;j <= K;j++)
					System.out.println(j);	
		
		unkown();
		
	}	

	public static int f2 (int b) {
		return 2 * b;
	}
	
	public static int f1 (int a) {
		return a + 1;
	}
	
	public static void unkown() {
		int x = f2(3);
		int z = 1;
		for (int i=2; i<=x; i++)
			z = z + f1(i);
		System.out.println("z = " + z); // Wie lautet die Ausgabe für z
	}
}
