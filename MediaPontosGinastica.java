package aula06;

import java.util.Scanner;

public class MediaPontosGinastica {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	double nota1 = 0;
	double nota2 = 0;
	double nota3 = 0;
	double nota4 = 0;
	double nota5 = 0;
	double nota6 = 0;
	
	double maior = 0;
	double menor = 0;
	
	double media = 0;
	
	// Entrada de variáveis
	
	System.out.print("Digite a primeira nota: ");
	nota1 = leitor.nextDouble();
	
	System.out.print("Digite a segunda nota: ");
	nota2 = leitor.nextDouble();
	
	System.out.print("Digite a terceira nota: ");
	nota3 = leitor.nextDouble();
	
	System.out.print("Digite a quarta nota: ");
	nota4 = leitor.nextDouble();
	
	System.out.print("Digite a quinta nota: ");
	nota5 = leitor.nextDouble();
	
	System.out.print("Digite a sexta nota: ");
	nota6 = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento
	
	maior = nota1;
	
	if (nota2 > maior) maior = nota2;
	if (nota3 > maior) maior = nota3;
	if (nota4 > maior) maior = nota4;
	if (nota5 > maior) maior = nota5;
	if (nota6 > maior) maior = nota6;
	
	menor = nota1;
	
	if (nota2 < menor) menor = nota2;
	if (nota3 < menor) menor = nota3;
	if (nota4 < menor) menor = nota4;
	if (nota5 < menor) menor = nota5;
	if (nota6 < menor) menor = nota6;
	
	
	media = (nota1 + nota2 + nota3 + nota4 + nota5 + nota6 - maior - menor)/ 4;
	
	
	// Saída de dados
	System.out.println("A média da ginasta é: " + media);
	
	
	
	
	
}
}