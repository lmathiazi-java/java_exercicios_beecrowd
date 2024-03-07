package iniciante.exercicio1044;

import java.util.Scanner;

public class res1044 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			if (numero1 % numero2 == 0)
				System.out.println("Sao Multiplos");
			else
				System.out.println("Nao sao Multiplos");
		}
		else if (numero2 % numero1 == 0)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");
		
		sc.close();
	}
}