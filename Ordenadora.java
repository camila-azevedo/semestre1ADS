package aula12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ordenadora {
public static void main (String [] args) {
		
		// Declaração de Variáveis - Ordenação Direta, apenas para aprendizado!!
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		String[] vetor = new String[10];
		
		// Entrada de dados
		try {
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Digite a palavra da posição " + i + " do vetor: ");
			vetor[i] = leitor.readLine();
		}
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		// Processamento
		for (int i = 0 ; i < (vetor.length - 1) ; i++) { 		// primeiro ao penúltimo
			for (int j = (i + 1) ; j < vetor.length ; j++) { 	//próximo ao último
				 if (vetor[i].compareTo(vetor[j]) > 0) {
					 String temp = vetor [i];
					 vetor [i] = vetor [j];
					 vetor [j] = temp;
				 }
			}
		}
		
		// Saída de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.println(vetor[i]);
		}
		
}
}