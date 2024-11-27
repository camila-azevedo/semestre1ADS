package aula08;

import java.util.Scanner;

public class ValidacaoCheque {
public static void main (String [] args) {
	
	//Declaração de Variáveis
	Scanner leitor = new Scanner (System.in);
	
	
	double valorLote = 0;
	int tamanhoLote = 0;
	int qtdCheque = 0;
	double somaValorCheque = 0;
	
	// Entrada de Dados
	
	System.out.print("Digite o tamanho do lote: ");
	tamanhoLote = leitor.nextInt();
	
	System.out.print("Digite o valor do lote: ");
	valorLote = leitor.nextDouble();
	
	do {
		System.out.print("Digite o valor do cheque: ");
		somaValorCheque += leitor.nextDouble();
		qtdCheque ++;
		
		System.out.print("Digite <S> se houver mais cheques: ");
		
	} while(leitor.next().equalsIgnoreCase("S"));
	
	leitor.close();

	// Saída de Dados
	
	if ((tamanhoLote == qtdCheque) && (valorLote == somaValorCheque)) {
		System.out.println("Parabéns, o lote bateu. ");
		
	} else {
	System.out.println("O lote está errado. ");
	}
}
}