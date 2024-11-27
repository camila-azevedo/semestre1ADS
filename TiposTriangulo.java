package aula05;

import java.util.Scanner;

public class TiposTriangulo {
public static void main (String [] args) {
	
	//Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	double lado1 = 0;
	double lado2 = 0;
	double lado3 = 0;
	
	
	//Entrada de dados
	
	System.out.print("Informe o tamanho do primeiro lado: ");
	lado1 = leitor.nextDouble();
	
	System.out.print("Informe o tamanho do segundo lado: ");
	lado2 = leitor.nextDouble();
	
	System.out.print("Informe o tamanho do terceiro lado: ");
	lado3 = leitor.nextDouble();
	
	leitor.close();
	
	//Saída de Dados
	
	if (lado1 == lado2 && lado1 == lado3) {
		System.out.println("O triângulo é equilátero ");
		
	} else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
		System.out.println("O triângulo é isóceles ");
		
	} else {
		System.out.println("O triângulo é escaleno ");
	}

}
}