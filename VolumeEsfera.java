package aula02;

import java.util.Scanner;

public class VolumeEsfera {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	double raio = 0;
	double volumeEsfera = 0;
	
	
	
	// Entrada de dados
	System.out.print("Qual o valor do raio da esfera?");
	raio = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento
	volumeEsfera = (4 * Math.PI * Math.pow(raio, 3))/3;
			
	
	//Saída de dados
	System.out.println("O volume da esfera é " + volumeEsfera);
	
}

}