package aula10;

import java.util.Scanner;

public class Procuradora {
public static void main (String [] args) {
	
	// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
	
		int vetor[] = new int[100000];
		int valorProcurado = 0;
			
	// Construção do Vetor
		for (int i = 0; i < vetor.length ; i++) {	
		vetor[i] = ((int) (vetor.length * Math.random()));
		}
	
	// Pesquisas
		while (valorProcurado != -1) {
			System.out.print("Digite um valor a ser procurado: ");
			valorProcurado = leitor.nextInt();
			
			boolean achei = false;
			for (int i = 0 ; i < vetor.length ; i++) {
				if (vetor[i] == valorProcurado) {
					achei = true;
				}
			}
			 if (achei) {
				 System.out.println("Achei!");
			 } else { 
				 System.out.println("Não achei!!");
			 }
			
		}
		leitor.close();
		
		
		
	}
}