// Faça um programa que verifique se uma letra digitada é vogal ou consoante.

package exercicios02;

import java.util.Scanner; 

public class exercicio_03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		String letra; 
		
		System.out.println("Digite uma letra: "); 
		letra = entrada.nextLine().toUpperCase(); 
		
		if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
			System.out.println("A letra " + letra + " é uma vogal."); 
		} else {
			System.out.println("A letra " + letra + " é uma consoante."); 
		}
	}
}
