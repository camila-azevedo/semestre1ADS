package aula06;

import java.util.Scanner;

public class OperacaoBancaria {
public static void main (String [] args) {
	
	
	// Declaração de Variáveis
	Scanner leitor  =  new Scanner(System.in);
	
	double saldo1 = 0;
	int operacao = 0;
	double valor = 0;
	double saldoFinal = 0;
	
	
	// Entrada de dados
	
	
	System.out.print("Digite o saldo: ");
	saldo1 = leitor.nextDouble();
	
	System.out.println("+===============+");
	System.out.println("| Menu de Opções|");
	System.out.println("+===============+");
	System.out.println("| 1 - Saque     |");
	System.out.println("| 2 - Depósito  |");
	System.out.println("| 3 - Juros     |");
	System.out.println("+===============+");
	System.out.println("Escolha qual operação deseja efetuar: ");
	operacao = leitor.nextInt();
	
	
	// Processamento
	
	switch(operacao) {
	case 1:
		System.out.println("Digite o valor do saque: ");
		valor = leitor.nextDouble();
		saldoFinal = saldo1 - valor;
		break;
		
	case 2:
		System.out.println("Digite o valor do saque: ");
		valor = leitor.nextDouble();
		saldoFinal = (saldo1 + valor);
		break;
		
	case 3:
		System.out.println("Digite o percentual de juros: ");
		valor  = leitor.nextDouble();
		saldoFinal = (saldo1  + (saldo1 * valor)/ 100);
		break;
		
		default:
			System.out.println("Essa não é uma operação válida! ");
	}
	
	leitor.close();
	
	
	// Saída de Dados
	
	System.out.println("O seu saldo atualizado é R$" + saldoFinal);
	
	
}
}