// Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, baseado no sal�rio atual:

// - sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
// - sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
// - sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
// - sal�rios de R$ 1500,00 em diante : aumento de 5% 

// Ap�s o aumento ser realizado, informe na tela:

// - o sal�rio antes do reajuste;
// - o percentual de aumento aplicado;
// - o valor do aumento;
// - o novo sal�rio, ap�s o aumento. 

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
			
			System.out.println("\nSal�rio antes do reajuste: R$" + salario); 
			System.out.println("Percentual de aumento: 20%"); 
			System.out.println("Valor do aumento: R$" + ajuste); 
			System.out.println("Sal�rio reajustado: R$" + salario_ajustado);
		
		} else if ((salario > 280) && (salario <= 700)) {
			ajuste = (salario * 15) / 100; 
			salario_ajustado = (ajuste + salario); 
			
			System.out.println("\nSal�rio antes do reajuste: R$" + salario); 
			System.out.println("Percentual de aumento: 15%"); 
			System.out.println("Valor do aumento: R$" + ajuste); 
			System.out.println("Sal�rio reajustado: R$" + salario_ajustado);
		
		} else if ((salario > 700) && (salario <= 1500)) {
			ajuste = (salario * 10) / 100; 
			salario_ajustado = (ajuste + salario); 
		
			System.out.println("\nSal�rio antes do reajuste: R$" + salario); 
			System.out.println("Percentual de aumento: 10%"); 
			System.out.println("Valor do aumento: R$" + ajuste); 
			System.out.println("Sal�rio reajustado: R$" + salario_ajustado); 	
	
		} else if (salario > 1500) {
			ajuste = (salario * 5) / 100; 
			salario_ajustado = (ajuste + salario); 
		
			System.out.println("\nSal�rio antes do reajuste: R$" + salario); 
			System.out.println("Percentual de aumento: 5%"); 
			System.out.println("Valor do aumento: R$" + ajuste); 
			System.out.println("Sal�rio reajustado: R$" + salario_ajustado); 	
		}
	}

}
