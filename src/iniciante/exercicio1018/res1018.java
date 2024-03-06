package iniciante.exercicio1018;

import java.util.Scanner;

public class res1018 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int valor = input.nextInt();
		
		int nota100, nota50, nota20, nota10, nota5, nota2, nota1, resto;
		
		nota100 = valor / 100;
		resto = valor % 100;
		
		nota50 = resto / 50;
		resto = resto % 50;
		
		nota20 = resto / 20;
		resto = resto % 20;
		
		nota10 = resto / 10;
		resto = resto % 10;
		
		nota5 = resto / 5;
		resto = resto % 5;
		
		nota2 = resto / 2;
		resto = resto % 2;
		
		nota1 = resto / 1;
		resto = resto % 1;
		
		System.out.println(valor);
		System.out.printf("%d nota(s) de R$ 100,00\n", nota100);
		System.out.printf("%d nota(s) de R$ 50,00\n", nota50);
		System.out.printf("%d nota(s) de R$ 20,00\n", nota20);
		System.out.printf("%d nota(s) de R$ 10,00\n", nota10);
		System.out.printf("%d nota(s) de R$ 5,00\n", nota5);
		System.out.printf("%d nota(s) de R$ 2,00\n", nota2);
		System.out.printf("%d nota(s) de R$ 1,00\n", nota1);
		
		input.close();
	}
}