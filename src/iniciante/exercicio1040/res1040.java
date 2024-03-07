package iniciante.exercicio1040;

import java.util.Locale;
import java.util.Scanner;

public class res1040 {
	
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float nota1 = sc.nextFloat() * 2.0f;
		float nota2 = sc.nextFloat() * 3.0f;
		float nota3 = sc.nextFloat() * 4.0f;
		float nota4 = sc.nextFloat() * 1.0f;
		
		float mediaNotas = (nota1 + nota2 + nota3 + nota4) / 10.0f;
		
		if (mediaNotas < 5.0f) {
			
			System.out.printf("Media: %.1f\n", mediaNotas);
			System.out.println("Aluno reprovado.");
			
		} else if (mediaNotas <= 6.9f) {
			
			float notaExame = sc.nextFloat();
			float mediaFinal = (notaExame + mediaNotas) / 2.0f;
			String status = "Aluno reprovado.";
			
			if (mediaFinal >= 5.0f)
				status = "Aluno aprovado.";
			
			System.out.printf("Media: %.1f\n", mediaNotas);
			System.out.println("Aluno em exame.");
			System.out.printf("Nota do exame: %.1f\n", notaExame);
			System.out.printf("%s\n", status);
			System.out.printf("Media final: %.1f\n", mediaFinal);
		} else {
			
			System.out.printf("Media: %.1f\n", mediaNotas);
			System.out.printf("Aluno aprovado.\n");
		}
		
		sc.close();
	}
}
