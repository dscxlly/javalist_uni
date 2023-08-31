/*Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma 
mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é
aprovado). Escrever também a média calculada.*/

package list1_uni;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Nota da 1ª avaliação: ");
		float nota1 = scanner.nextFloat();
		
		System.out.print("Nota da 1ª avaliação: ");
		float nota2 = scanner.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		
		if (media >= 6) {
			System.out.println("Você foi aprovado(a)! Média: " + media);
		} else {
			System.out.println("Você foi reprovado(a). Média: " + media);
		}
		
		scanner.close();
	}
}
