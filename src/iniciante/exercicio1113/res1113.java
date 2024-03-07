package iniciante.exercicio1113;

import java.util.Scanner;

public class res1113 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		boolean loop = true;
		
		while (loop) {
			
			int X = leitor.nextInt();
			int Y = leitor.nextInt();
			
			int maior = Math.max(X, Y);
			
			if (X == Y) {
				loop = !loop;
			} else if (maior == X) {
				System.out.println("Decrescente");
			} else {
				System.out.println("Crescente");
			}		
		}
		
		leitor.close();
	}
}