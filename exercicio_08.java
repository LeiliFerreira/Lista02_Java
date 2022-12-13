// Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:

// - salários até R$ 280,00 (incluindo) : aumento de 20%
// - salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
// - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
// - salários de R$ 1500,00 em diante : aumento de 5% 

// Após o aumento ser realizado, informe na tela:

// - o salário antes do reajuste;
// - o percentual de aumento aplicado;
// - o valor do aumento;
// - o novo salário, após o aumento. 

package exercicios02;

import java.util.Scanner; 

public class exercicio_08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		double salario; 
		double ajuste; 
		double salario_ajustado; 
		
		System.out.print("Informe o valor salarial: R$"); 
		salario = entrada.nextDouble(); 
		
		if (salario <= 280) {
			ajuste = (salario * 20) / 100; 
			salario_ajustado = (ajuste + salario); 
			
			System.out.println("\nSalário antes do reajuste: R$" + salario); 
			System.out.println("Percentual de aumento: 20%"); 
			System.out.println("Valor do aumento: R$" + ajuste); 
			System.out.println("Salário reajustado: R$" + salario_ajustado);
		
		} else if ((salario > 280) && (salario <= 700)) {
			ajuste = (salario * 15) / 100; 
			salario_ajustado = (ajuste + salario); 
			
			System.out.println("\nSalário antes do reajuste: R$" + salario); 
			System.out.println("Percentual de aumento: 15%"); 
			System.out.println("Valor do aumento: R$" + ajuste); 
			System.out.println("Salário reajustado: R$" + salario_ajustado);
		
		} else if ((salario > 700) && (salario <= 1500)) {
			ajuste = (salario * 10) / 100; 
			salario_ajustado = (ajuste + salario); 
		
			System.out.println("\nSalário antes do reajuste: R$" + salario); 
			System.out.println("Percentual de aumento: 10%"); 
			System.out.println("Valor do aumento: R$" + ajuste); 
			System.out.println("Salário reajustado: R$" + salario_ajustado); 	
	
		} else if (salario > 1500) {
			ajuste = (salario * 5) / 100; 
			salario_ajustado = (ajuste + salario); 
		
			System.out.println("\nSalário antes do reajuste: R$" + salario); 
			System.out.println("Percentual de aumento: 5%"); 
			System.out.println("Valor do aumento: R$" + ajuste); 
			System.out.println("Salário reajustado: R$" + salario_ajustado); 	
		}
	}

}
