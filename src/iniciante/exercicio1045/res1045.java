package iniciante.exercicio1045;

import java.util.Locale;
import java.util.Scanner;

public class res1045 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		double A = leitor.nextDouble();
		double B = leitor.nextDouble();
		double C = leitor.nextDouble();
		
		double maior = Math.max(A, B);
			   maior = Math.max(maior, C);
			   
		double menor1 = 0, menor2 = 0;
		
		if (maior == A) {
			menor1 = B;
			menor2 = C;
		} else if (maior == B) {
			menor1 = A;
			menor2 = C;
		} else {
			menor1 = A;
			menor2 = B;
		}
		
		if (maior >= (menor1 + menor2) ) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else {
			
			if (Math.pow(maior, 2) == ( Math.pow(menor1, 2) + Math.pow(menor2, 2) ) )
				System.out.println("TRIANGULO RETANGULO");
			
			if (Math.pow(maior, 2) > ( Math.pow(menor1, 2) + Math.pow(menor2, 2) ) )
				System.out.println("TRIANGULO OBTUSANGULO");
			
			if (Math.pow(maior, 2) < ( Math.pow(menor1, 2) + Math.pow(menor2, 2) ) )
				System.out.println("TRIANGULO ACUTANGULO");
			
			if (A == B && B == C)
				System.out.println("TRIANGULO EQUILATERO");
			
			if ( (A == B || C == B || A == C) && (A != B || C != B || A != C) )
				System.out.println("TRIANGULO ISOSCELES");
		}
		
		leitor.close();
	}
}