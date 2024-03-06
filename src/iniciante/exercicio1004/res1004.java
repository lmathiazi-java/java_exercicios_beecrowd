package iniciante.exercicio1004;

import java.util.Scanner;

public class res1004 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int PROD = scan.nextInt() * scan.nextInt();
		
		System.out.printf("PROD = %d\n", PROD);
		
		scan.close();
	}
}