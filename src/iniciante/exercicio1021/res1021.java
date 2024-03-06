package iniciante.exercicio1021;

import java.util.Locale;
import java.util.Scanner;

public class res1021 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int nota100, nota50, nota20, nota10, nota5, nota2, moeda1;
		
		double moeda050, moeda025, moeda010, moeda005, moeda001, sobra, valorDefinido = sc.nextDouble();
	
		nota100 = (int)valorDefinido / 100;
		sobra = valorDefinido % 100.0;
		
		nota50 = (int)sobra / 50;
		sobra = sobra % 50.0;
		
		nota20 = (int)sobra / 20;
		sobra = sobra % 20.0;
		
		nota10 = (int)sobra / 10;
		sobra = sobra % 10.0;
		
		nota5 = (int)sobra / 5;
		sobra = sobra % 5.0;
		
		nota2 = (int)sobra / 2;
		sobra = sobra % 2.0;
		
		moeda1 = (int)sobra / 1;
		sobra = sobra % 1.0;
		
		moeda050 = sobra / 0.50;
		sobra = sobra % 0.50;
		
		moeda025 = sobra / 0.25;
		sobra = sobra % 0.25;
		
		moeda010 = sobra / 0.10;
		sobra = sobra % 0.10;
		
		moeda005 = sobra / 0.05;
		sobra = sobra % 0.05;
		
		moeda001 = sobra / 0.01;
		sobra = sobra % 0.01;

		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00\n", nota100);
		System.out.printf("%d nota(s) de R$ 50.00\n", nota50);
		System.out.printf("%d nota(s) de R$ 20.00\n", nota20);
		System.out.printf("%d nota(s) de R$ 10.00\n", nota10);
		System.out.printf("%d nota(s) de R$ 5.00\n", nota5);
		System.out.printf("%d nota(s) de R$ 2.00\n", nota2);
		
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00\n", moeda1);
		System.out.printf("%d moeda(s) de R$ 0.50\n", (int)moeda050);
		System.out.printf("%d moeda(s) de R$ 0.25\n", (int)moeda025);
		System.out.printf("%d moeda(s) de R$ 0.10\n", (int)moeda010);
		System.out.printf("%d moeda(s) de R$ 0.05\n", (int)moeda005);
		System.out.printf("%.0f moeda(s) de R$ 0.01\n", moeda001);
		
		sc.close();
	}
}