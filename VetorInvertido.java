package aula10;

import java.util.Scanner;

public class VetorInvertido {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	 int [] vetorOriginal = new int[5];
	 int [] vetorInvertido = new int [5];
	 
	 // Entrada de Dados
	 
	 for (int i = 0 ; i < vetorOriginal.length; i++) {
		 System.out.print("Digite o valor da posição " + i + " do vetor: ");
		 vetorOriginal[i] = leitor.nextInt();
	 }
	 leitor.close();
	 
	 // Processamento (4 - i) = (tamanho - 1 - i)
	 for (int i = 0 ; i < vetorInvertido.length; i++) {
	 vetorInvertido[i] = vetorOriginal[vetorOriginal.length - 1 - i];
	 	}
	 
	 // Saída de Dados
	 for (int i = 0 ; i < vetorInvertido.length; i++) {
		 System.out.println("Invertido [" + i + "] = " + vetorInvertido[i]);
	 }
	 
	 
}
}