package iniciante.exercicio1006;

import java.util.Locale;
import java.util.Scanner;

public class res1006 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double nota1 = input.nextDouble() * 2;
		double nota2 = input.nextDouble() * 3;
		double nota3 = input.nextDouble() * 5;
		
		double media = (nota1 + nota2 + nota3) / 10;
		
		System.out.printf("MEDIA = %.1f\n", media);
		
		input.close();
	}
}
