// Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//       "Telefonou para a vítima?"
//       "Esteve no local do crime?"
//       "Mora perto da vítima?"
//       "Devia para a vítima?"
//       "Já trabalhou com a vítima?"

// O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 

// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita",
// entre 3 e 4 como "Cúmplice" e 5 como "Assassino". 
// Caso contrário, ele será classificado como "Inocente". 

package exercicios02;

import java.util.Scanner; 

public class exercicio_10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		int p1, p2, p3, p4, p5; 
		int quantidade = 0; 
		
		System.out.println("Telefonou para a vítima? 1 - Sim / 2 - Não");
		p1 = entrada.nextInt(); 
		
		if (p1 == 1) {
			quantidade = quantidade + 1; 
		}
		
		System.out.println("Esteve no local do crime? 1 - Sim / 2 - Não");
		p2 = entrada.nextInt(); 
		
		if (p2 == 1) {
			quantidade = quantidade + 1; 
		}
		
		System.out.println("Mora perto da vítima? 1 - Sim / 2 - Não");
		p3 = entrada.nextInt(); 
		
		if (p3 == 1) {
			quantidade = quantidade + 1; 
		}
		
		System.out.println("Devia para a vítima? 1 - Sim / 2 - Não");
		p4 = entrada.nextInt(); 
		
		if (p4 == 1) {
			quantidade = quantidade + 1; 
		}
		
		System.out.println("Já trabalhou com a vítima? 1 - Sim / 2 - Não");
		p5 = entrada.nextInt(); 
		
		if (p5 == 1) {
			quantidade = quantidade + 1; 
		}
		
		if (quantidade == 2) {
			System.out.println("Situação: Suspeito!"); 
		} else if ((quantidade == 3) || (quantidade == 4)) {
			System.out.println("Situação: Cúmplice!"); 
		} else if (quantidade == 5) {
			System.out.println("Situação: Culpado!"); 
		} else {
			System.out.println("Situação: Inocente!"); 
		}
		
	}

}
