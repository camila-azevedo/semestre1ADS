package aula05;

import java.util.Scanner;

public class DiaSemanaAniversario {
public static void main (String [] args) {
	
	//Declaração de Variáveis
	
	Scanner leitor = new Scanner(System.in);
			
	int dia = 0;
	int mes = 0;
	int ano = 0;
	int diaSemana = 0;
	
	
	//Entrada de dados
	
	System.out.print("Digite o dia do seu aniversário: ");
	dia = leitor.nextInt();
	
	System.out.print("Digite o mês do seu aniversário: ");
	mes = leitor.nextInt();
	
	System.out.print("Digite o ano que você nasceu: ");
	ano = leitor.nextInt();
	
	leitor.close();
	
	//Processamento
	diaSemana = (((dia) + (2 * mes) + ((3 * (mes + 1))/5) + ((ano) + (ano / 4)) - (ano / 100) +  (ano / 400) + 2) % 7);
	
	
	//Saída de Dados
	
	switch(diaSemana) {
	
	case 0:
		System.out.println("Você nasceu no sábado");
	break;
	
	case 1:
		System.out.println("Você nasceu no domingo");
	break;
	
	case 2:
		System.out.println("Você nasceu na segunda-feira");
	break;
	
	case 3:
		System.out.println("Você nasceu no terça-feira");
	break;
	
	case 4:
		System.out.println("Você nasceu na quarta-feira");
	break;
	
	case 5:
		System.out.println("Você nasceu na quinta-feira");
	break;
	
	case 6:
		System.out.println("Você nasceu na sexta feira");
	break;
	
	}
	
	
	
}
}
