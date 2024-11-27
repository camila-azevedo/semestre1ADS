package aula03;

import java.util.Scanner;

public class Eleicao {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	int candidatoA = 0;
	int candidatoB = 0;
	int candidatoC = 0;
	int votosBrancos = 0;
	int votosNulos = 0;
	
	double votosValidos = 0;
	double votosInvalidos = 0;
	double votosTotais = 0;
	
	 
	double porcentagemA = 0;
	double porcentagemB = 0;
	double porcentagemC = 0;
	double porcentagemInvalidos = 0;
		
	
	
	// Entrada de dados
	System.out.print("Digite a quantidade de votos do candidato A: ");
	candidatoA = leitor.nextInt();
	
	System.out.print("Digite a quantidade de votos do candidato B: ");
	candidatoB = leitor.nextInt();
	
	System.out.print("Digite a quantidade de votos do candidato C: ");
	candidatoC = leitor.nextInt();
	
	System.out.print("Digite a quantidade de votos brancos: ");
	votosBrancos = leitor.nextInt();
	
	System.out.print("Digite a quantidade de votos nulos: ");
	votosNulos = leitor.nextInt();
	
	leitor.close();
	
	// Processamento
	votosValidos = candidatoA + candidatoB + candidatoC;
	votosInvalidos = votosBrancos + votosNulos;
	votosTotais = votosValidos + votosInvalidos;
	porcentagemA = (candidatoA/votosValidos) * 100;
	porcentagemB = (candidatoB/votosValidos) * 100;
	porcentagemC = (candidatoC/votosValidos) * 100;
	porcentagemInvalidos = ((votosBrancos + votosNulos) / votosTotais) * 100;
	
	
	
	// Saída de dados
	
	System.out.println("A porcentagem de votos do candidato A é " + porcentagemA + "%");
	System.out.println("A porcentagem de votos do candidato B é " + porcentagemB + "%");
	System.out.println("A porcentagem de votos do candidato C é " + porcentagemC + "%");
	System.out.println("A porcentagem de votos inválidos é " + porcentagemInvalidos + "%");
	
}
}