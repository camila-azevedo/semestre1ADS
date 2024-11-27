package aula07;

import java.util.Scanner;

public class Somatorio {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	int limite = 0;
	double resultado = 0;
	
	// Entrada de Dados
	System.out.print("Digite o limite superior do somatório: ");
	limite = leitor.nextInt();
	
	leitor.close();
	
	// Processamento
	for (int x = 0 ; x <= limite ; x++) {
	resultado += (Math.pow(x, 2) + 3 * x + 5);
	System.out.println("Resultado parcial = " + resultado);
	}
	
	
	// Saída de Dados
	System.out.println("O resultado do somatório é: " + resultado);
}
}