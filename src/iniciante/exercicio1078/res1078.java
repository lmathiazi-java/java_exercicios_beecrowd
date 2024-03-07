package iniciante.exercicio1078;

import java.util.Scanner;

public class res1078 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.printf("%d x %d = %d\n", i, n, (i * n));
		}
		
		leitor.close();
	}
}