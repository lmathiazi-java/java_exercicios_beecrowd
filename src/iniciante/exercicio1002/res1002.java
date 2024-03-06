package iniciante.exercicio1002;

import java.util.Locale;
import java.util.Scanner;

public class res1002 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double n = 3.14159;
		double area = n * Math.pow(scan.nextDouble(), 2);
		
		System.out.printf("A=%.4f\n", area);
		
		scan.close();		
	}
}