package iniciante.exercicio1117;

import java.util.Locale;
import java.util.Scanner;

public class res1117 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		int cont = 0;
		double somaNota = 0.0, media = 0.0;
		
		boolean loop = true;
		while(loop) {
			
			double nota = leitor.nextDouble();
			
			if (nota > 0.0 && nota <= 10.0) {
				
				somaNota += nota;
				
				cont ++;
				if (cont == 2) {
					media = somaNota / cont;
					System.out.printf("media = %.2f\n", media);
					loop = !loop;
				}
			} else {
				System.out.println("nota invalida");
			}
		}
		
		leitor.close();
	}
}