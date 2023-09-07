/*Reescreva o exercício anterior utilizando a estrutura ENQUANTO.*/

package list2_uni;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valor1, valor2, resultado;
		
		System.out.print("Digite um valor: ");
		valor1 = scanner.nextDouble();
		
		System.out.print("Digite outro valor (diferente de zero): ");
		valor2 = scanner.nextDouble();
		
		while (valor2 == 0) {
			System.out.println("O valor não pode ser zero. Tente novamente!");
			System.out.print("Digite outro valor (diferente de zero): ");
			valor2 = scanner.nextDouble();
		}
		
		resultado = valor1 / valor2;
		System.out.println("O resultado é: " + resultado);
		
		scanner.close();
	}
}
