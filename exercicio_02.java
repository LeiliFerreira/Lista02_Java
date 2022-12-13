// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

package exercicios02;

import java.util.Scanner; 

public class exercicio_02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int numero; 
		
		System.out.println("Insira um número: "); 
		numero = entrada.nextInt(); 
		
		if (numero > 0) {
			System.out.println("O número " + numero + " é positivo."); 
		} else if (numero < 0) {
			System.out.println("O número " + numero + " é negativo."); 
		} else {
			System.out.println("O número " + numero + " é neutro."); 
		}
	}
}