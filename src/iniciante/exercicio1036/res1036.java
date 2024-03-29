package iniciante.exercicio1036;

import java.util.Locale;
import java.util.Scanner;

public class res1036 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = (Math.pow(b, 2.0)) - (4.0 * a * c);
		
		if (a == 0.0 || b == 0.0 || c == 0.0 || delta < 0.0)
			System.out.println("Impossivel calcular");
		else {
			double r1 = (-b + Math.sqrt(delta)) / (2.0 * a);
			double r2 = (-b - Math.sqrt(delta)) / (2.0 * a);
			
			System.out.printf("r1 = %.5f\n", r1);
			System.out.printf("r2 = %.5f\n", r2);
		}
		
		sc.close();
	}
}

