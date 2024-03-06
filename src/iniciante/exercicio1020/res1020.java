package iniciante.exercicio1020;

import java.util.Scanner;

public class res1020 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int anos, meses, restoDias, valorDefinido = sc.nextInt();
		
		anos = valorDefinido / 365;
		restoDias = valorDefinido % 365;
		
		meses = restoDias / 30;
		restoDias = restoDias % 30;
		
		System.out.printf("%d ano(s)\n", anos);
		System.out.printf("%d mes(es)\n", meses);
		System.out.printf("%d dia(s)\n", restoDias);
		
		sc.close();
	}
}