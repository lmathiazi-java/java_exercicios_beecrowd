package iniciante.exercicio1035;

import java.util.Scanner;

public class res1035 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int somaCD = c + d;
		int somaAB = a + b;
		
		if (b > c && d > a && somaCD > somaAB && c > 0 && d > 0 && a % 2 == 0)
			System.out.println("Valores aceitos");
		else
			System.out.println("Valores nao aceitos");
		
		sc.close();
	}
}