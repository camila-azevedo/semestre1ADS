package aula10;

import java.util.Scanner;

public class PreenchimentoVetor {
	public static void main (String [] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		int [] vetor = new int[10];
		
		// Entrada de Dados
		
		for (int i = 0; i < vetor.length; i++) {
		System.out.print("Digite o valor da posição " + i +" do vetor: ");
		vetor[i] = leitor.nextInt();
		}
		
		leitor.close();
		
		// Saída de Dados
		
		for (int i = 0; i < vetor.length; i++) {
		System.out.println("vetor [" +i + "] = " + vetor[i]);
		}	
}
}