// Faça um Programa que leia três números e mostre o MAIOR deles.

package exercicios02;

import java.util.Scanner; 

public class exercicio_05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		double num1; 
		double num2; 
		double num3; 
		
		System.out.println("Digite o primeiro número: "); 
		num1 = entrada.nextDouble(); 
		
		System.out.println("Digite o segundo número: "); 
		num2 = entrada.nextDouble(); 
		
		System.out.println("Digite o terceiro número: "); 
		num3 = entrada.nextDouble(); 
		
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("Maior valor: " + num1); 
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println("Maior valor: " + num2); 
		} else if ((num3 > num1) && (num3 > num2)) {
			System.out.println("Maior valor: " + num3); 
		} else {
			System.out.println("Todos os números são iguais."); 
		}
	}
}
