package aula03;

import java.util.Scanner;

public class MediaNotas {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	double prova1 = 0;
	double prova2 = 0;
	double prova3 = 0;
	double media = 0;
	
	// Entrada de dados
	System.out.print("Digite a nota da prova 1: ");
	prova1 = leitor.nextDouble();
	
	System.out.print("Digite a nota da prova 2: ");
	prova2 = leitor.nextDouble();
	
	System.out.print("Digite a nota da prova 3: ");
	prova3 = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento
	media = (prova1 + prova2 + prova3) / 3;
	
	
	// Saída de dados
	System.out.println("A média é " + media);
	
	
}
}