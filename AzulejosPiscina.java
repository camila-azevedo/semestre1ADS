package aula03;

import java.util.Scanner;

public class AzulejosPiscina {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	double profundidade = 0;
	double largura = 0;
	double comprimento = 0;
	double azulejo = 0.01;
	double areaPiscina = 0;
	double quantidadeAzulejo = 0;
	
	// Entrada de dados
	System.out.print("Digite o valor da profundidade: ");
	profundidade = leitor.nextDouble();
	
	System.out.print("Digite o valor da largura: ");
	largura = leitor.nextDouble();
	
	System.out.print("Digite o valor do comprimento: ");
	comprimento = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento
	
	areaPiscina = 2 * (largura * profundidade) + 2 * (comprimento * profundidade) + (comprimento * largura);
	quantidadeAzulejo = areaPiscina/ azulejo;
	
	
	// Saída de dados
	
	System.out.println("A quantidade de azulejos é " + quantidadeAzulejo);
	
}
}