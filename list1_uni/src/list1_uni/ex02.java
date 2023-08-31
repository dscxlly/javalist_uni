/*Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).*/

package list1_uni;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int valor = scanner.nextInt();
		
		if (valor >= 0) {
			System.out.println("POSITIVO!");
		} else {
			System.out.println("NEGATIVO!");
		}
		
		scanner.close();
	}
}