package aula07;

import java.util.Scanner;

public class Exponencial {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	double base = 0;
	double expoente = 0;
	double potencia = 1;
	
	// Entrada de dados
	System.out.print("Digite a base: ");
	base = leitor.nextDouble();
	
	System.out.print("Digite o expoente: ");
	expoente = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento
	
	for (int i = 0; i < expoente; i++) {
	potencia  *= (base);
	}
	
	// Saída de dados
	System.out.println(base + "^" + expoente + " = " + potencia);
}
}