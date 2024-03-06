package iniciante.exercicio1010;

import java.util.Locale;
import java.util.Scanner;

public class res1010 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
	
			int prod1_codigo = input.nextInt();
			int prod1_quantidade = input.nextInt();
			double prod1_precoUnidade = input.nextDouble();
			
			int prod2_codigo = input.nextInt();
			int prod2_quantidade = input.nextInt();
			double prod2_precoUnidade = input.nextDouble();
			
			double valorCompra = (prod1_quantidade * prod1_precoUnidade) + (prod2_quantidade * prod2_precoUnidade);
			
			System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorCompra);
		
		input.close();
	}
}