/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas 
pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total 
da compra.*/

package list1_uni;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de maçãs compradas: ");
		int quantMacas = scanner.nextInt();
		
		double valorTotal;
		
		if (quantMacas < 12) {
			valorTotal = quantMacas * 1.30;
		} else {
			valorTotal = quantMacas * 1.00;
		}
		
		System.out.println("O valor total da compra é R$" + valorTotal);
		
		scanner.close();
	}
}
