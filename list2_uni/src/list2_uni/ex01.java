/*Escreva  um  algoritmo  para  ler  2  valores  e se  o  segundo  valor  informado  for  ZERO,  deve  ser  lidoum  novo valor,  ou  seja,  para  o  segundo  valor  não  pode  ser  aceito  o  valor  zero e  imprimir  o  resultadoda  divisão  do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura REPITA).*/

package list2_uni;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double valor1, valor2, resultado;
		
		System.out.print("Digite um valor: ");
		valor1 = scanner.nextDouble();
		
		do {
			System.out.print("Informe outro valor (diferente de zero): ");
			valor2 = scanner.nextDouble();
			
			if (valor2 == 0) {
				System.out.println("O valor não pode ser zero. Tente novamente!");
			}
		} while (valor2 == 0);
		
		resultado = valor1 / valor2;
		System.out.println("O resultado é: " + resultado);
		
		scanner.close();
	}
}
