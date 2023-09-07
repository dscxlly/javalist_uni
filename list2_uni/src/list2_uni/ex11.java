/*Modifique o exercício anterior para aceitar somente valores maiores que 0 para N. Caso o valorinformado (para N) não seja maior que 0, deverá ser lido um novo valor para N.*/

package list2_uni;

import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor;

        do {
            System.out.print("Digite um valor maior que 0: ");
            valor = scanner.nextInt();

            if (valor <= 0) {
                System.out.println("O valor deve ser maior que 0. Tente novamente.");
            }
        } while (valor <= 0);

        for (int i = 1; i <= valor; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
