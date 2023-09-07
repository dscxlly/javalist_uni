/*Acrescentar  uma  mensagem  de 'VALOR  INVÁLIDO' no  exercício  [44]  caso  o  segundo  valor informado seja ZERO*/

package list2_uni;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valor1, valor2, resultado;
		
		System.out.print("Digite um valor: ");
		valor1 = scanner.nextDouble();
		
		do {
			System.out.print("Informe outro valor (diferente de zero): ");
			valor2 = scanner.nextDouble();
			
			if (valor2 == 0) {
				System.out.println("VALOR INVÁLIDO!");
			}
		} while (valor2 == 0);
		
		resultado = valor1 / valor2;
		System.out.println("O resultado é: " + resultado);
		
		scanner.close();
	}
}
