package aula06;

import java.util.Scanner;

public class Equacao2Grau {
public static void main (String [] args) {
	
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);	
	
	double a = 0;
	double b = 0;
	double c = 0;
	double delta = 0;
	double x1 = 0;
	double x2 = 0;
	
	
	// Entrada de dados
	
	System.out.print("Digite o valor de a: ");
	a = leitor.nextDouble();
	
	System.out.print("Digite o valor de b: ");
	b = leitor.nextDouble();
	
	System.out.print("Digite o valor de c: ");
	c = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento
	
	delta = (Math.pow(b, 2) - 4 * a * c);
	if (delta >=0) {
	
		x1 = (-b + Math.sqrt(delta))/ (2 * a);
		x2 = (-b + Math.sqrt(delta))/ (2 * a);
		
	}
	
	//Saída de dados
	
	if (delta < 0) {
		System.out.println("Não há raízes reais para essa equação! ");
		
	} else if (delta == 0) {
		System.out.println("Há apenas uma raiz real para essa equação: " + x1);
		
	} else {
		System.out.println("Há 2 raízes reais para essa equação: (" +x1 + " , " + x2 + ")");
	}
	
	
}



}