package aula11;

import java.util.Scanner;

public class QuadradoMagico {
	private static final int TAMANHO = 3;
public static void main (String [] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		int[][] quadrado = new int [TAMANHO][TAMANHO];
		int numeroMagico = 0;
		int numeroCalculado = 0;
		boolean quadradoMagico = false;
		
		// Entrada de dados
		for (int i = 0 ; i < TAMANHO ; i++) {
			for (int j = 0 ; j < TAMANHO ; j++) {
				System.out.print("quadrado[" + i + "][" + j + "] = ");
				quadrado[i][j] = leitor.nextInt();
		}
		}
		leitor.close();
		
		
		// Processamento
		// Diagonal principal
		quadradoMagico = true; 
		for(int i = 0 ; i < TAMANHO ; i++) {
			numeroMagico += quadrado[i][i]; 
		}
		
		// Diagonal invertida
		for(int i = 0 ; i < TAMANHO; i++) {
			numeroCalculado += quadrado[i][TAMANHO - 1 - i]; //Soma dos números da diagonal invertida
		}
		if (numeroMagico != numeroCalculado) {
			quadradoMagico = false;
		}
		
		// Soma das Linhas
		for(int i = 0 ; i < TAMANHO; i++) {
			numeroCalculado = 0;
			for(int j = 0 ; j < TAMANHO; j++) {
				numeroCalculado += quadrado[i][j];
				}
			if (numeroMagico != numeroCalculado) {
			quadradoMagico = false;
			}
		}
			
		// Soma das Colunas
		for(int i = 0 ; i < TAMANHO; i++) {
			numeroCalculado = 0;
			for(int j = 0 ; j < TAMANHO; j++) {
				numeroCalculado += quadrado[j][i];
				}
			if (numeroMagico != numeroCalculado) {
			quadradoMagico = false;
			}
		}
		
		// Saída de Dados
		if (quadradoMagico) {
			System.out.println("Parabéns, esse é um quadrado mágico!");
			
		} else {
			System.out.println("Esse não é um quadrado mágico... :(");
		}

}
}