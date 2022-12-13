// 4.	Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada 
// por aluno e apresentar:

// - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
// - A mensagem "Reprovado", se a média for menor do que sete;
// - A mensagem "Aprovado com Distinção", se a média for igual a dez. 

package exercicios02;

import java.util.Scanner; 

public class exercicio_04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome; 
		double nota1; 
		double nota2; 
		double media; 
		
		System.out.print("Nome: "); 
		nome = entrada.nextLine(); 
		
		System.out.print("Primeira nota: "); 
		nota1 = entrada.nextDouble(); 
		
		System.out.print("Segunda nota: "); 
		nota2 = entrada.nextDouble(); 
		
		media = (nota1 + nota2) / 2; 
		
		if ((media >= 7) && (media < 9.9)) {
			System.out.println(""); 
			System.out.println("Aluno(a): " + nome); 
			System.out.println("Média: " + media); 
			System.out.println("Situação: Aprovado!"); 
		} else if (media == 10) {
			System.out.println(""); 
			System.out.println("Aluno(a): " + nome); 
			System.out.println("Média: " + media); 
			System.out.println("Situação: Aprovado com distinção!"); 
		} else if (media < 7) {
			System.out.println(""); 
			System.out.println("Aluno(a): " + nome); 
			System.out.println("Média: " + media); 
			System.out.println("Situação: Reprovado!"); 
		}
	}
}