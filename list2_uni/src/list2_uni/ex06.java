/*Acrescente  uma  mensagem 'NOVO  CÁLCULO  (S/N)?' ao  final  do  exercício  [48].  Se  forrespondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o algoritmo.*/

package list2_uni;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char continuar;
		
		do {
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
		
			System.out.println("Deseja realizar um novo cálculo (S/N)? ");
			continuar = scanner.next().charAt(0);
		} while (continuar =='S' || continuar =='s');
		
		scanner.close();
	}
}
