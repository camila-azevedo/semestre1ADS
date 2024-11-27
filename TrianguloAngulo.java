package aula06;

import java.util.Scanner;

public class TrianguloAngulo {
public static void main (String [] args) {
	
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	int angulo1 = 0;
	int angulo2 = 0;
	int angulo3 = 0;
	
	
	// Entrada de dados
	
	System.out.print("Digite o valor do primeiro ângulo do triângulo: ");
	angulo1 = leitor.nextInt();
	
	System.out.print("Digite o valor do segundo ângulo do triângulo: ");
	angulo2 = leitor.nextInt();
	
	System.out.print("Digite o valor do terceiro ângulo do triângulo: ");
	angulo3 = leitor.nextInt();
	
	leitor.close();
	
	
	// Saída de Dados
	
	if ((angulo1 <= 0) || (angulo2 <= 0) || (angulo3 <= 0 ) || (angulo1+ angulo2 + angulo3) != 180) {
		System.out.println("Isso não é um triângulo" );
		
	} else if ((angulo1 == 90) || (angulo2 ==90) || (angulo3 == 90)) {	
		System.out.println("Triângulo Retângulo ");
		
	} else if ((angulo1 < 90) && (angulo2 < 90) && (angulo3 < 90)) {
		System.out.println("Triângulo acutângulo");
		
	} else {
		System.out.println("Triângulo obtusângulo");
	}
	
	
	
}
}
