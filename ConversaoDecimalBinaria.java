package aula11;

import java.util.Scanner;

public class ConversaoDecimalBinaria {
	public static void main (String [] args) {
		
		// Declaração de Variáveis
			Scanner leitor = new Scanner(System.in);
			int[] vetor = new int[1000];
			int tamanho = 0;
			int numero = 0;
			
			// Entrada de dados
			System.out.print("Digite o número decimal: ");
			numero = leitor.nextInt();
			
			leitor.close();
			
		// Processamento
			do {
				vetor[tamanho] = (numero % 2);
				numero = numero/2;
				tamanho++;
			} while (numero > 0);
			
		// Saída de Dados
			System.out.print("Número binário equivalente: ");
			for (int i = (tamanho - 1) ; i >=0 ; i--) {
				System.out.print(vetor[i]);
			}	
	}
}
