package aula04;

import java.util.Scanner;

public class ParidadeSinal {
public static void main (String [] args) {
	
	// Determinação de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	int numero = 0;
	String paridade = "";
	String sinal = "";
	
	
	// Entrada de dados
	System.out.print("Digite um número: ");
	numero = leitor.nextInt();
	leitor.close();
	
	//Processamento
	if ((numero % 2) == 0) {
		paridade = "PAR";
	} else {
		paridade = "ÍMPAR";
	}
	
	if (numero > 0) {
		sinal = "POSITIVO";
	} else if (numero < 0) {
	sinal ="NEGATIVO";
	} else {
		sinal = "ZERO";
	}
	
	// Saída de dados
	System.out.println("Paridade do Número? " + paridade);
	System.out.println("Sinal do número: " + sinal);
}
}