package iniciante.exercicio1016;

import java.util.Locale;
import java.util.Scanner;

public class res1016 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int carroX = 60;
		int carroY = 90;
	
		int diferencaMinutosPorKM = 60 / (carroY - carroX);
		
		int novaDiferenca = input.nextInt() * diferencaMinutosPorKM;
		
		System.out.printf("%d minutos\n", novaDiferenca);
		
		input.close();
	}
}