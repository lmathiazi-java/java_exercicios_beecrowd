package iniciante.exercicio1011;

import java.util.Locale;
import java.util.Scanner;

public class res1011 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double pi = 3.14159;		
		double volume = ( ( (4.0 / 3.0) * pi) * Math.pow(input.nextDouble(), 3.0) );
		
		System.out.printf("VOLUME = %.3f\n", volume);
		
		input.close();
	}
}