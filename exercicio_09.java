// Pe�a ao usu�rio um n�mero e mostre na tela se ele � �mpar ou par. 

package exercicios02;

import java.util.Scanner; 

public class exercicio_09 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 

		int numero; 
		
		System.out.println("Digite um n�mero: "); 
		numero = entrada.nextInt(); 
		
		if (numero %2 == 0) {
			System.out.print("O n�mero " + numero + " � par."); 
		} else {
			System.out.print("O n�mero " + numero + " � �mpar."); 
		}	
	}
}