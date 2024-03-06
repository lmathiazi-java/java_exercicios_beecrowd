package iniciante.exercicio1008;

import java.util.Locale;
import java.util.Scanner;

public class res1008 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int numeroFuncionario = scan.nextInt();
		int horasTrabalhadas = scan.nextInt();
		
		double valorHora = scan.nextDouble();
		double salario = horasTrabalhadas * valorHora;
		
		System.out.printf("NUMBER = %d\n", numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", salario);
		
		scan.close();
	}
}