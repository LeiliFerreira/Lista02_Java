// Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.

package exercicios02;

import java.util.Scanner; 

public class exercicio_01 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in); 
		
		double num1; 
		double num2; 
		
		System.out.println("Digite o primeiro n�mero: "); 
		num1 = entrada.nextDouble(); 
		
		System.out.println("Digite o segundo n�mero: "); 
		num2 = entrada.nextDouble(); 
		
		if (num1 > num2) {
			System.out.println("O maior n�mero �: " + num1); 
		} else if (num2 > num1) {
			System.out.println("O maior n�mero �: " + num2); 
		} else {
			System.out.println("Os n�meros s�o iguais"); 
		}
	}
}