/*Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.*/

package list1_uni;

import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Digite outro número: ");
		int num2 = scanner.nextInt();
		
		if (num1 < num2) {
			System.out.println(num1 + "\n" + num2);
		} else {
			System.out.println(num2 + "\n" + num1);
		}
		
		scanner.close();
	}
}
