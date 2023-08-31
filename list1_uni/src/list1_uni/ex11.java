/*Faça um programa para ler: número da conta do cliente, saldo, débito e crédito. Após, calcular e escrever 
o saldo atual (saldo atual = saldo - débito + crédito). Também testar se saldo atual for maior ou igual a zero 
escrever a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.*/

package list1_uni;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta do cliente: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo atual: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o débito: ");
        double debito = scanner.nextDouble();

        System.out.print("Digite o crédito: ");
        double credito = scanner.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.println("Número da conta: " + numeroConta + "\n" + "Saldo atual: R$" + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        scanner.close();
    }
}
