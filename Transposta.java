package aula11;

import java.util.Scanner;

public class Transposta {
	public static void main (String [] args) {
		
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		
		int[][] matrizOriginal = new int[2][3];
		int[][] matrizTransposta = new int[3][2];
		
		// Entrada de dados
		for (int i = 0 ; i < matrizOriginal.length ; i ++) {
			for (int j = 0 ; j < matrizOriginal[i].length ; j++) {
				System.out.print("matrizOriginal[" + i + "][" + j + "] = ");
				matrizOriginal [i][j] = leitor.nextInt();
			}
		}
		leitor.close();
		
		 // Processamento
		for (int i = 0 ; i < matrizOriginal.length ; i++) {
			for (int j = 0 ; j < matrizOriginal[i].length ; j++) {
				matrizTransposta[j][i] = matrizOriginal [i][j];
		}
		}
		
		// Saída de Dados
		System.out.println("Matriz Original");
		for (int i = 0 ; i < matrizOriginal.length ; i++) {
			for(int j = 0 ; j < matrizOriginal[i].length ; j++) {
				System.out.print(matrizOriginal[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("Matriz Transposta");
		for (int i = 0 ; i < matrizTransposta.length ; i++) {
			for(int j = 0 ; j < matrizTransposta[i].length ; j++) {
				System.out.print(matrizTransposta[i][j] + "\t");
			}
			System.out.println();
		}
		
		
}
}