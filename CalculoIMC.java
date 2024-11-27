package aula03;

import java.util.Scanner;

public class CalculoIMC {
public static void main (String [] args) {
	
	// Definição de variáveis
	Scanner leitor = new Scanner(System.in);
	double peso = 0;
	double altura = 0;
	double imc= 0;
	

	// Entrada de dados
	System.out.print("Digite o peso: ");
	peso = leitor.nextDouble();
	
	System.out.print("Digite a altura: ");
	altura = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento
	imc = peso / (Math.pow (altura,2));
	
	
	// Saída de dados
	System.out.println("O IMC é " + imc);
}
}