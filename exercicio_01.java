// Faça um Programa que peça dois números e imprima o maior deles.

package exercicios02;

import java.util.Scanner; 

public class exercicio_01 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in); 
		
		double num1; 
		double num2; 
		
		System.out.println("Digite o primeiro número: "); 
		num1 = entrada.nextDouble(); 
		
		System.out.println("Digite o segundo número: "); 
		num2 = entrada.nextDouble(); 
		
		if (num1 > num2) {
			System.out.println("O maior número é: " + num1); 
		} else if (num2 > num1) {
			System.out.println("O maior número é: " + num2); 
		} else {
			System.out.println("Os números são iguais"); 
		}
	}
}