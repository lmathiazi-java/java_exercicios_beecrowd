package iniciante.exercicio1038;

import java.util.Locale;
import java.util.Scanner;

public class res1038 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int item = sc.nextInt();
		int quantidade = sc.nextInt();
		double conta = 0.0;
		
		if (item == 1)
			conta = 4.00 * quantidade;
		else if (item == 2)
			conta = 4.50 * quantidade;
		else if (item == 3)
			conta = 5.00 * quantidade;
		else if (item == 4)
			conta = 2.00 * quantidade;
		else
			conta = 1.50 * quantidade;
		
		System.out.printf("Total: R$ %.2f\n", conta);
		
		sc.close();
	}
}