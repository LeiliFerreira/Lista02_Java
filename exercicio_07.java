// Faça um Programa que pergunte em que turno você estuda. 
// Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
// Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.

package exercicios02;

import java.util.Scanner; 

public class exercicio_07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		String entrada_usuario; 
		
		System.out.println("M - matutino"); 
		System.out.println("V - vespertino"); 
		System.out.println("N - noturno"); 
		System.out.println("Escolha uma opção: "); 
		
		entrada_usuario = entrada.nextLine().toUpperCase(); 
		
		if (entrada_usuario.equals("M")) {
			System.out.println("Bom dia!"); 
		} else if (entrada_usuario.equals("V")) {
			System.out.println("Boa tarde!"); 
		} else if (entrada_usuario.equals("N")) {
			System.out.println("Boa noite!"); 
		} else {
			System.out.println("Opção inválida!"); 
			
		}	
	}

}
	