package iniciante.exercicio1005;

import java.util.Locale;
import java.util.Scanner;

public class res1005 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double nota1 = input.nextDouble() * 3.5;
		double nota2 = input.nextDouble() * 7.5;
		
		double media = (nota1 + nota2) / 11.0;
		
		System.out.printf("MEDIA = %.5f\n", media);
		
		input.close();
	}
}
