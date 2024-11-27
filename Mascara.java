package aula07;

import java.util.Scanner;

public class Mascara {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	int numero = 0;
	
	// Entrada de dados
	do {
		System.out.print("Digite um número positivo: ");
		numero = leitor.nextInt();
		if (numero <= 0) {
			System.out.println("Resposta errada!");
		}
		
	} while (numero <=0); // Se a condição for verdadeira, volta a execução para o do
	
	// Saída de dados
	leitor.close();
	System.out.println("Obrigada por ser obediente!");
	
}
}