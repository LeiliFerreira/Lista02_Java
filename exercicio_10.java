// Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
//       "Telefonou para a v�tima?"
//       "Esteve no local do crime?"
//       "Mora perto da v�tima?"
//       "Devia para a v�tima?"
//       "J� trabalhou com a v�tima?"

// O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime. 

// Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita",
// entre 3 e 4 como "C�mplice" e 5 como "Assassino". 
// Caso contr�rio, ele ser� classificado como "Inocente". 

package exercicios02;

import java.util.Scanner; 

public class exercicio_10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int p1, p2, p3, p4, p5; 
		int quantidade = 0; 
		
		System.out.println("Telefonou para a v�tima? 1 - Sim / 2 - N�o");
		p1 = entrada.nextInt(); 
		
		if (p1 == 1) {
			quantidade = quantidade + 1; 
		}
		
		System.out.println("Esteve no local do crime? 1 - Sim / 2 - N�o");
		p2 = entrada.nextInt(); 
		
		if (p2 == 1) {
			quantidade = quantidade + 1; 
		}
		
		System.out.println("Mora perto da v�tima? 1 - Sim / 2 - N�o");
		p3 = entrada.nextInt(); 
		
		if (p3 == 1) {
			quantidade = quantidade + 1; 
		}
		
		System.out.println("Devia para a v�tima? 1 - Sim / 2 - N�o");
		p4 = entrada.nextInt(); 
		
		if (p4 == 1) {
			quantidade = quantidade + 1; 
		}
		
		System.out.println("J� trabalhou com a v�tima? 1 - Sim / 2 - N�o");
		p5 = entrada.nextInt(); 
		
		if (p5 == 1) {
			quantidade = quantidade + 1; 
		}
		
		if (quantidade == 2) {
			System.out.println("Situa��o: Suspeito!"); 
		} else if ((quantidade == 3) || (quantidade == 4)) {
			System.out.println("Situa��o: C�mplice!"); 
		} else if (quantidade == 5) {
			System.out.println("Situa��o: Culpado!"); 
		} else {
			System.out.println("Situa��o: Inocente!"); 
		}
		
	}

}
