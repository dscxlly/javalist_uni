/*Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele 
recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este 
valor, calcular e escrever o seu salário total.*/

package list1_uni;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor das vendas efetuadas pelo vendedor: ");
        double valorVendas = scanner.nextDouble();

        final double comissaoPrimeiraFaixa = 0.03;
        final double comissaoSegundaFaixa = 0.05;
        final double limitePrimeiraFaixa = 1500.00;

        double comissao;

        if (valorVendas <= limitePrimeiraFaixa) {
            comissao = valorVendas * comissaoPrimeiraFaixa;
        } else {
            double vendasNaPrimeiraFaixa = limitePrimeiraFaixa;
            double vendasNaSegundaFaixa = valorVendas - limitePrimeiraFaixa;

            comissao = (vendasNaPrimeiraFaixa * comissaoPrimeiraFaixa) + (vendasNaSegundaFaixa * comissaoSegundaFaixa);
        }

        double salarioTotal = salarioFixo + comissao;

        System.out.println("O salário total do vendedor é: R$" + salarioTotal);

        scanner.close();
    }
}
