package iniciante.exercicio1072;

import java.util.Scanner;

public class res1072 {
	
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int n = leitor.nextInt();
		int in = 0, out = 0;
		
		for (int i = 0; i < n; i++) {
			
			int num = leitor.nextInt();
			
			if (num >= 10 && num <= 20)
				in++;
			else
				out++;
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		leitor.close();
	}
}