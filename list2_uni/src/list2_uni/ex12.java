/* Escreva um algoritmo que calcule e imprima a tabuada do 8 (1 a 10).*/

package list2_uni;

public class ex12 {
	public static void main(String[] args) {
        int multiplicador = 8;

        System.out.println("Tabuada do 8:");

        for (int i = 1; i <= 10; i++) {
            int resultado = multiplicador * i;
            System.out.println(multiplicador + " x " + i + " = " + resultado);
        }
    }
}
