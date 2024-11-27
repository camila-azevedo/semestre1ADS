package aula04;

import java.util.Scanner;

public class AumentoSalario {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	double salarioInicial = 0;
	double salarioFinal = 0;
	int tipo = 0;
	
	
	// Entrada de dados
	System.out.print("Digite o salário inicial: ");
	salarioInicial = leitor.nextDouble();
	
	System.out.print("Digite a categoria de funcionário: ");
	tipo = leitor.nextInt();
	
	leitor.close();
	
	// Processamento
	
	if (tipo == 1) {
		salarioFinal = salarioInicial * 1.1;
	} else if (tipo == 2) {
		salarioFinal = salarioInicial * 1.2;
	} else  { 
		salarioFinal = salarioInicial * 1.5;
	}
	
	// Saída de Dados
	System.out.println("O salário final é R$ " + salarioFinal);
		
}
}