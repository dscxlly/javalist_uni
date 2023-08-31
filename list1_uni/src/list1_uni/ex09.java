/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 
horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.Escreva um 
programa que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do 
funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês 
possua 4 semanas exatas).*/

package list1_uni;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas em um mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        final int horasSemanais = 40;
        final int semanasNoMes = 4;
        double salarioTotal;

        if (horasTrabalhadas <= horasSemanais * semanasNoMes) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            double horasExtras = horasTrabalhadas - (horasSemanais * semanasNoMes);
            double salarioHoraExtra = salarioPorHora * 1.5;
            salarioTotal = (horasSemanais * semanasNoMes * salarioPorHora) + (horasExtras * salarioHoraExtra);
        }

        System.out.println("O salário total do funcionário é: R$" + salarioTotal);

        scanner.close();
    }
}
