// Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.

package exercicios02;

import java.util.Scanner; 

public class exercicio_02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int numero; 
		
		System.out.println("Insira um n�mero: "); 
		numero = entrada.nextInt(); 
		
		if (numero > 0) {
			System.out.println("O n�mero " + numero + " � positivo."); 
		} else if (numero < 0) {
			System.out.println("O n�mero " + numero + " � negativo."); 
		} else {
			System.out.println("O n�mero " + numero + " � neutro."); 
		}
	}
}