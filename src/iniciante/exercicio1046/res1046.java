package iniciante.exercicio1046;

import java.util.Scanner;

public class res1046 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int horas;
		
		if (inicio == fim)
			System.out.println("O JOGO DUROU 24 HORA(S)");
		else if (inicio > fim && inicio <= 23) {
			horas = (24 - inicio) + fim;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", horas);
		} else {
			horas = fim - inicio;
			System.out.printf("O JOGO DUROU %d HORA(S)\n", horas);
		}

		sc.close();
	}
}