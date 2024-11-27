package aula07;

import java.util.Scanner;

public class Fatorial {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	int numero = 0;
	double fatorial = 1; //Fatorial é multiplicação, então usamos a identidade da multiplicação, que é 1
	
	// Entrada de dados
	
	System.out.print("Digite o número: ");
	numero = leitor.nextInt();
	
	leitor.close();
	
	// Processamento
	for (int x = numero; x > 0; x--) {
		fatorial *= (x);	
	}
	
	// Saída de dados
	System.out.println(numero + "! = " + fatorial);
}
}
