package iniciante.exercicio1134;

import java.util.Scanner;

public class res1134 {
	
	public static void main(String[] args) {

		Scanner leitor = new Scanner (System.in);
		
		int voto, alcool = 0, gasolina = 0, diesel = 0;
		
		while(true) {
			
			voto = leitor.nextInt();
			
			if (voto == 1)
				alcool ++;
			else if (voto == 2)
				gasolina ++;
			else if (voto == 3)
				diesel ++;
			else if (voto == 4)
				break;
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		leitor.close();
	}
}