package aula04;

import java.util.Scanner;

public class AprovacaoCurso {
public static void main (String [] args ) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	double nota1 = 0;
	double nota2 = 0;
	double nota3 = 0;
	double substitutiva = 0;
	double media = 0;
	
	
	// Entrada de dados
	System.out.print("Digite a nota 1: ");
	nota1 = leitor.nextDouble();
	
	System.out.print("Digite a nota 2: ");
	nota2 = leitor.nextDouble();
	
	System.out.print("Digite a nota 3: ");
	nota3 = leitor.nextDouble();
	
	// Processamento
	media = ( nota1 + nota2 + nota3 )/3;
	if (media >=5) {
		System.out.println("Passou! ");
	} else {
		System.out.print("Digite a nota da substitutiva: ");
		substitutiva = leitor.nextDouble();
	
	 
	 
		if (substitutiva >=5) {
			System.out.println("Passou raspando! ");
		} else {
			System.out.println("Não passou. ");
		}
	}
	leitor.close();
}
}