package iniciante.exercicio1003;

import java.util.Scanner;

public class res1003 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int SOMA = A + B;
		
		System.out.printf("SOMA = %d\n", SOMA);			
		
		scan.close();
	}
}