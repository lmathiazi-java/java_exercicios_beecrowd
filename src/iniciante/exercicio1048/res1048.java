package iniciante.exercicio1048;

import java.util.Locale;
import java.util.Scanner;

public class res1048 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario = sc.nextDouble();
		double aumento;
		int percentual;

		if (salario > 0.0 && salario <= 400.0)
			percentual = 15;
		else if (salario <= 800.0)
			percentual = 12;
		else if (salario <= 1200.0)
			percentual = 10;
		else if (salario <= 2000.0)
			percentual = 7;
		else
			percentual = 4;

		aumento = (salario * percentual) / 100;
		System.out.printf("Novo salario: %.2f\n", (salario + aumento));
		System.out.printf("Reajuste ganho: %.2f\n", aumento);
		System.out.println("Em percentual: " + percentual + " %");

		sc.close();
	}
}