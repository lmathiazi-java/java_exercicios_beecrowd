package iniciante.exercicio1019;

import java.util.Scanner;

public class res1019 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		int totalSegundos = input.nextInt();
		
		int hora =	totalSegundos / 3600;
		
		int sobra = totalSegundos % 3600;
		
		int minuto = sobra / 60;
		
		sobra = sobra % 60;
		
		System.out.println(hora + ":" + minuto + ":" + sobra);
		
		input.close();
	}
}