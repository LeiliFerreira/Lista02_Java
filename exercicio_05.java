// Fa�a um Programa que leia tr�s n�meros e mostre o MAIOR deles.

package exercicios02;

import java.util.Scanner; 

public class exercicio_05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		double num1; 
		double num2; 
		double num3; 
		
		System.out.println("Digite o primeiro n�mero: "); 
		num1 = entrada.nextDouble(); 
		
		System.out.println("Digite o segundo n�mero: "); 
		num2 = entrada.nextDouble(); 
		
		System.out.println("Digite o terceiro n�mero: "); 
		num3 = entrada.nextDouble(); 
		
		if ((num1 > num2) && (num1 > num3)) {
			System.out.println("Maior valor: " + num1); 
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println("Maior valor: " + num2); 
		} else if ((num3 > num1) && (num3 > num2)) {
			System.out.println("Maior valor: " + num3); 
		} else {
			System.out.println("Todos os n�meros s�o iguais."); 
		}
	}
}
