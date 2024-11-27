package aula07;

import java.util.Scanner;

public class MediaAlunosCurso {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	double nota = 0;
	int qtdAlunos = 0;
	double somaDasNotas = 0;
	double media = 0;
	
	// Entrada de dados
	
	do {
		System.out.print("Digite a nota do aluno: ");
		nota = leitor.nextDouble();
		somaDasNotas += (nota);
		qtdAlunos++;
		
		System.out.print("Digite <S> para mais alunos: ");
	} while (leitor.next().equalsIgnoreCase("S"));
		
	leitor.close();
		 
	// Processamento 
	
	media = somaDasNotas / qtdAlunos;
	

	//Saída de dados
	 
	System.out.println("A média aritmética da turma é: " + media);
	
	
	
}
}
