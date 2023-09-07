/*Escreva  um  algoritmo  para  ler  as  notas  da  1a.  e  2a.  avaliações  de  um  aluno,  calcule  e  imprima  amédia (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota.*/

package list2_uni;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double nota1, nota2, media;
		
		do {
			System.out.print("Nota da 1ª avaliação: ");
			nota1 = scanner.nextDouble();
			
			if (nota1 < 0 || nota1 > 10) {
				System.out.println("VALOR INVÁLIDO!");
			}
		} while (nota1 < 0 || nota1 > 10);
		
		do {
			System.out.print("Nota da 2ª avaliação: ");
			nota2 = scanner.nextDouble();
			
			if (nota2 < 0 || nota2 > 10) {
				System.out.println("VALOR INVÁLIDO!");
			}
		} while (nota2 < 0 || nota2 > 10);
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("A média do aluno é: " + media);
		
		scanner.close();
	}
}
