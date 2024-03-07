package iniciante.exercicio1071;

import java.util.Scanner;

public class res1071 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int x = leitor.nextInt();
		int y = leitor.nextInt();
		
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		
		int soma = 0;
		
		for (int i = (min + 1); i < max; i++) {
			if ( !(i % 2 == 0 )) {
				soma += i;
			}
		}
		
		System.out.println(soma);
		
		leitor.close();
	}
}