package aula08;

import java.util.Scanner;

public class TrianguloAsteriscos {
	public static void main (String [] args) {
		
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	int tamanhoTriangulo = 0;
	
	//Entrada de dados
	System.out.print("Digite o tamanho do triângulo em asteriscos: ");
	tamanhoTriangulo = leitor.nextInt();
	
	leitor.close();
	
	//Saída de Dados
	for ( int i =0 ; i < tamanhoTriangulo ; i++) {  // linhas = i 3
		for (int j = 0 ; j <= i; j++) {			   // colunas = j
	System.out.print("*");
	}
		System.out.println();
	}	
}	
}