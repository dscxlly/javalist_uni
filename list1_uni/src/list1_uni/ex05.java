/*Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou 
não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).*/

package list1_uni;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o ano atual: ");
		int anoAtual = scanner.nextInt();
		
		System.out.print("Digite seu ano de nascimento: ");
		int anoNasc = scanner.nextInt();
		
		int idade = anoAtual - anoNasc;
		
		if (idade >= 16) {
			System.out.println("Você poderá votar este ano!");
		} else {
			System.out.println("Você não poderá votar este ano!");
		}
		
		scanner.close();
	}
}
