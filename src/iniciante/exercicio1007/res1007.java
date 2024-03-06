package iniciante.exercicio1007;

import java.util.Scanner;

public class res1007 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int D = scan.nextInt();
		
		int diferenca = ( (A * B) - (C * D) );
		
		System.out.printf("DIFERENCA = %d\n", diferenca);
		
		scan.close();
	}
}
