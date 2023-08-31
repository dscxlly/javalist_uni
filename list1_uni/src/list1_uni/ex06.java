/*Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles*/

package list1_uni;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num1 = scanner.nextInt();
		
		System.out.print("Digite outro número: ");
		int num2 = scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println(num1);
		} else {
			System.out.println(num2);
		}
		
		scanner.close();
	}
}
