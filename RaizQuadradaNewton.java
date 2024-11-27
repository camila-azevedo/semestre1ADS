package aula09;

import java.util.Scanner;

public class RaizQuadradaNewton {
	public static void main (String [] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		double numero = 0;
		double raiz = 0;
		
		// Entrada de Dados
		
		System.out.println("Digite um número: ");
		numero = leitor.nextDouble();
		
		leitor.close();
		
		// Processamento
		raiz = numero / 2;
		for (int i = 0 ; i < 50 ; i++ ) {
			raiz = ((raiz + (numero / raiz)) / 2);
			
		
		}	

		
	// Saída de dados
		System.out.println("A raiz quadrada calculada por Newton é: " + raiz);
		
		System.out.println("A raíz quadrada calculada pelo Java é: " + Math.sqrt(numero));
}
}