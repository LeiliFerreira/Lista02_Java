// Peça ao usuário um número e mostre na tela se ele é ímpar ou par. 

package exercicios02;

import java.util.Scanner; 

public class exercicio_09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 

		int numero; 
		
		System.out.println("Digite um número: "); 
		numero = entrada.nextInt(); 
		
		if (numero %2 == 0) {
			System.out.print("O número " + numero + " é par."); 
		} else {
			System.out.print("O número " + numero + " é ímpar."); 
		}	
	}
}