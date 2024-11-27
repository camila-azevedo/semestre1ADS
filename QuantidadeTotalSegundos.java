package aula02;

import java.util.Scanner;

public class QuantidadeTotalSegundos {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	int horas = 0;
	int minutos = 0;
	int segundos = 0;
	int totalsegundos;
	
	// Entrada de dados
	System.out.print("Qual a quantidade de horas?" );
	horas = leitor.nextInt();
	
	System.out.print("Qual a quantidade de minutos?" );
	minutos = leitor.nextInt();
	
	System.out.print("Qual a quantidade de segundos?" );
	segundos = leitor.nextInt();
	
	leitor.close();
	
	
	// Processamento
	totalsegundos = (3600 * horas) + (60 * minutos) + segundos;
	
	
	// Saída de Dados
	System.out.println("A quantidade total de segundos é " + totalsegundos);
}
}