/*Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade 
mínima em estoque de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade 
máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual a quantidade média 
escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.*/

package list1_uni;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade atual em estoque: ");
        int quantidadeAtual = scanner.nextInt();

        System.out.print("Digite a quantidade máxima em estoque: ");
        int quantidadeMaxima = scanner.nextInt();

        System.out.print("Digite a quantidade mínima em estoque: ");
        int quantidadeMinima = scanner.nextInt();

        double quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2.0;

        System.out.println("Quantidade média: " + quantidadeMedia);

        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }

        scanner.close();
    }
}
