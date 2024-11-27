package aula04;

import java.util.Scanner;

public class Maioridade {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner (System.in);
	int idade = 0;
			
	// Entrada de dados
	System.out.print("Digite a sua idade: ");
	idade = leitor.nextInt();
	
	leitor.close();
	
	// Saída de dados 
	if (idade >=18) {
		System.out.println("Maior de idade. Vá beber. ");
	} else {
		System.out.println("Menor de idade. Vá dormir. ");
	}
	
	
	
}
}