package aula11;

import java.util.Scanner;

public class Determinante {
	public static void main (String [] args) {
		
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	int [][] matriz = new int [3][3];
	int determinante = 0; 
	
	// Entrada de dados
		for (int i = 0 ; i < matriz.length ; i++) { // For das linhas i
		for (int j = 0 ; j < matriz[i]. length ; j++) { // For das colunas j
			System.out.print("matriz[" + i + "][" + j + "] = ");
			matriz[i][j] = leitor.nextInt();
		}
	}
	
		leitor.close();
	
		// Processamento
		determinante = ((matriz[0][0] * matriz[1][1] * matriz[2][2]) + 
						(matriz[0][1] * matriz[1][2] * matriz[2][0]) + 
						(matriz[0][2] * matriz[2][1] * matriz[1][0]) - 
						(matriz[0][2] * matriz[1][1] * matriz[2][0]) -
						(matriz[0][1] * matriz[1][0] * matriz[2][2]) - 
						(matriz[0][0] * matriz[2][1] * matriz[1][2]));
		
		// Saída de Dados
		System.out.println("O determinante dessa matriz é: " + determinante);
	
	
	
}
}