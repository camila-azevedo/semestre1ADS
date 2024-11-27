package aula05;

import java.util.Scanner;

public class Poligono {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	int quantidadeLados = 0;
	double tamanhoLado = 0;
	double perimetro = 0;
	double area = 0;
	
	
	// Entrada de dados
	
	System.out.print("Digite a quantidade de lados do polígono: ");
	quantidadeLados = leitor.nextInt();
	
	System.out.print("Digite o tamanho de cada lado do polígono em centímetros: ");
	tamanhoLado = leitor.nextDouble();
	
	leitor.close();
	
	
	//Processamento
	
	perimetro = (quantidadeLados * tamanhoLado);
	
	switch (quantidadeLados) {
	case 3:
		area = (Math.pow(tamanhoLado, 2) * (Math.sqrt(3))/4);
		break;
		
	case 4:
		area = (Math.pow(tamanhoLado, 2));
		break;
		
	case 5:
		area = ((5 * Math.pow(tamanhoLado, 2) / (4 * Math.tan(36))));
		break;
		
	case 6:
		area = ((3 * Math.pow(tamanhoLado, 2) * (Math.sqrt(3) / 2)));
		break;
		
	case 7:
		area =  (7 / 4) * Math.pow(tamanhoLado,  2) * (1/Math.tan(51.4285714));
		break;
		
	}
	
	//Saída de Dados
	
	System.out.println("Perímetro do Polígono: " + perimetro + " cm");
	
	System.out.println("Área do Polígono: " + area + " cm²");
	
	
	
	
	
}
}