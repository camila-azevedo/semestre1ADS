package aula04;

import java.util.Scanner;

public class SomaMenores {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	int n1 = 0;
	int n2 = 0;
	int n3 = 0;
	int soma = 0;
	
	
	// Entrada de dados
	System.out.print("Digite o primeiro número: ");
	n1 = leitor.nextInt();
		
	System.out.print("Digite o segundo número: ");
	n2 = leitor.nextInt();
		
		
	System.out.print("Digite o terceiro número: ");
	n3 = leitor.nextInt();
	
	leitor.close();
		
		
	// Processamento
		
		if ((n1>= n2) && (n1 >= n3)) {                     // n1 é o maior
			soma = n2 + n3;
		} else if ((n2 >= n1) && (n2 >= n3)) {               // n2 é o maior
			soma = n1 + n3;
		} else {
			soma = (n1+n2);
		}
		
		// Saída de dados
		System.out.println("A soma dos menores é: " + soma);
		
		
		
	
}
}