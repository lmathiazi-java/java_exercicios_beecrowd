package iniciante.exercicio1154;

import java.util.Locale;
import java.util.Scanner;

public class res1154 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		int idade, cont = 0;
		double media = 0.0;
		
		while(true) {
			
			idade = leitor.nextInt();
			
			if (idade < 0) {
				media /= cont;
				if (media > 0)
					System.out.printf("%.2f\n", media);
				break;
			} else {
				media += idade;
				cont++;
			}
		}
		
		leitor.close();
	}
}