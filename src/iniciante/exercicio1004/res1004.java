/*

exercício no beecrowd:
https://judge.beecrowd.com/pt/problems/view/1004

*/

package iniciante;

import java.util.Scanner;

public class exercicio_1004 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int PROD = scan.nextInt() * scan.nextInt();
		
		System.out.printf("PROD = %d\n", PROD);
		
		scan.close();
	}
}