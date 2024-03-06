package iniciante.exercicio1017;

import java.util.Locale;
import java.util.Scanner;

public class res1017 {
	
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int tempo = input.nextInt();
		int velocidade = input.nextInt();
		
		double consumoLitros = (tempo * velocidade) / 12.0;
		
		System.out.printf("%.3f\n", consumoLitros);
		
		input.close();
	}
}