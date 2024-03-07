package iniciante.exercicio1159;

import java.util.Scanner;

public class res1159 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		int num, soma = 0;
		
		while(true) {
			
			num = leitor.nextInt();
			
			if (num == 0)
				break;
			else if (num % 2 == 0)
				soma = (num * 5) + 20;
			else
				soma = ( (num + 1) * 5) + 20;
			
			if (soma > 0)
				System.out.println(soma);
		}

		leitor.close();
	}
}