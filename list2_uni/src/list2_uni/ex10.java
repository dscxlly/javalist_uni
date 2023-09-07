/*Ler  um valor  N  e  imprimir  todos os valores  inteiros  entre  1 (inclusive)  e  N  (inclusive).  Considereque  o  N será sempre maiorque ZERO.*/

package list2_uni;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um valor: ");
		int valor = scanner.nextInt();
		
		for (int i = 1; i <= valor; i++) {
			System.out.println(i);
		}
		
		scanner.close();
	}
}
