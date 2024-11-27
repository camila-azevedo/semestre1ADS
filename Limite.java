package aula10;

import java.util.Scanner;

public class Limite {
	public static void main (String [] args) {
		
		// Declaração de Variáveis
			Scanner leitor = new Scanner(System.in);
		
			int[] vetorOriginal = new int[10];
			int[] vetorLimite = new int[10];
			int limite = 0;
			int indice = 0; 		// o índice representa quantos números vão para o vetor do limite
			
		// Entrada de dados
			for (int i = 0 ; i < vetorOriginal.length ; i++) {
				System.out.print("Digite o valor da posição " + i + " do vetor: ");
				vetorOriginal[i] = leitor.nextInt();
			}
			
			System.out.print("Digite o limite: ");
			limite = leitor.nextInt();
			
			leitor.close();
			
		// Processamento
			for (int i = 0 ; i < vetorOriginal.length ; i++) {
				if (vetorOriginal[i] > limite) {
					vetorLimite[indice] = vetorOriginal[i];
						indice++;
			}
		}
		
		// Saída de Dados
		for (int i = 0; i < indice ; i++) {
			System.out.println("VetorLimite[" + i + "] = " + vetorLimite[i]);
		}
			
			
}
}