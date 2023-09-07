/*Acrescentar  uma  mensagem  de 'VALOR  INVÁLIDO' no  exercício  [45]  caso  o  segundo  valor informado seja ZERO*/

package list2_uni;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valor1, valor2, resultado;
		
		System.out.print("Digite um valor: ");
		valor1 = scanner.nextDouble();
		
		System.out.print("Digite outro valor (diferente de zero): ");
		valor2 = scanner.nextDouble();
		
		while (valor2 == 0) {
			System.out.println("VALOR INVÁLIDO!");
			System.out.print("Digite outro valor (diferente de zero): ");
			valor2 = scanner.nextDouble();
		}
		
		resultado = valor1 / valor2;
		System.out.println("O resultado é: " + resultado);
		
		scanner.close();
	}
}
