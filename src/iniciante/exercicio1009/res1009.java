package iniciante.exercicio1009;

import java.util.Locale;
import java.util.Scanner;

public class res1009 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nomeVendedor = input.next();
		
		double salario = input.nextDouble();
		double vendas = input.nextDouble();
		
		double comissao = vendas * (15.0 / 100.0);
		
		System.out.printf("TOTAL = R$ %.2f\n", (salario + comissao));
		
		input.close();
	}
}