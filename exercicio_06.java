// Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar, sabendo que a 
// decisão é sempre pelo mais barato.

package exercicios02;

import java.util.Scanner; 

public class exercicio_06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 

		double valor1; 
		double valor2; 
		double valor3; 
		
		System.out.print("Insira o primeiro valor: R$"); 
		valor1 = entrada.nextDouble(); 
		
		System.out.print("Insira o segundo valor: R$ "); 
		valor2 = entrada.nextDouble(); 
		
		System.out.print("Insira o terceiro valor: R$ "); 
		valor3 = entrada.nextDouble(); 
		
		if ((valor1 < valor2) && (valor1 < valor3)) {
			System.out.println("Preço mais econômico: R$ " + valor1); 
		} else if ((valor2 < valor1) && (valor2 < valor3)) {
			System.out.println("Preço mais econômico: R$ " + valor2); 
		} else if ((valor3 < valor1) && (valor3 < valor2)) {
			System.out.println("Preço mais econômico: R$ " + valor3); 
		} else {
			System.out.println("Todos os preços são iguals."); 
		}
	}
}
