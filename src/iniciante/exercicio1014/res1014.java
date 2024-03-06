package iniciante.exercicio1014;

import java.util.Locale;
import java.util.Scanner;

public class res1014 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int distancia = input.nextInt();
		double combustivel = input.nextDouble();
		
		double consumo = distancia / combustivel;

		System.out.printf("%.3f km/l\n", consumo);
		
		input.close();
	}
}