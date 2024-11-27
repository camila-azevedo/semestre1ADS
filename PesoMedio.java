package aula08;

import java.util.Scanner;

public class PesoMedio {
public static void main (String [] args) {
	
	//Declaração de Variáveis
	Scanner leitor = new Scanner (System.in);
	
	double peso = 0;
	double somaPesos = 0;
	int tamanhoPopulacao = 0;
	double media = 0;
	
	//Entrada de dados
	
	do {
		System.out.print("Digite o peso: ");
		peso = leitor.nextDouble();
		
		somaPesos += peso;
		tamanhoPopulacao ++;
		
		System.out.print("Digite <S> se houver mais pessoas: ");
		
	} while (leitor.next().equalsIgnoreCase("S"));
	
	leitor.close();
	
	//Processamento
	
	media = somaPesos / tamanhoPopulacao; 
	
	//Saída de dados
	
	System.out.println("A média de pesos da população é " + media + "kg");
	
}
}