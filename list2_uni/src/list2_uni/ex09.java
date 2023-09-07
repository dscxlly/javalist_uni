/*Escreva um algoritmo para imprimir os 10 primeiros números inteiros maiores que 100.*/

package list2_uni;

public class ex09 {
	public static void main(String[] args) {
		int numero = 101;
		int contador = 0;
		
		while (contador < 10 ) {
			System.out.println(numero);
			numero++;
			contador++;
		}
	}
}
