package iniciante.exercicio1114;

import java.util.Scanner;

public class res1114 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		
		boolean loop = true;
		while (loop) {
			
			int senha = leitor.nextInt();
			
			if (senha == 2002) {
				System.out.println("Acesso Permitido");
				loop = !loop;
			} else {
				System.out.println("Senha Invalida");
			}
		}
		
		leitor.close();
	}
}