package aula01;

import java.util.Scanner;

public class CalculadoraBasica {
	public static void main (String []args) {
		// Declaração de Variáveis
		Scanner leitor = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		
		int soma = 0;
		int subtracao = 0;
		int multiplicacao = 0;
		int divisao = 0;
		int resto = 0;
		
		// Entrada de dados
		System.out.println ("Digite o primeiro número:");
		numero1 = leitor.nextInt();
		
		System.out.println ("Digite o segundo numero:");
		numero2 = leitor.nextInt();
		
		leitor.close();
		
		// Processamento
		soma = (numero1 + numero2);
		subtracao = (numero1 - numero2);
		multiplicacao = (numero1 * numero2);
		divisao = (numero1 / numero2);
		resto = (numero1 % numero2);
		
		//Saída de dados
		System.out.println("A soma é:" + soma);
		System.out.println("A subtração é:" + subtracao);
		System.out.println("A multiplicação é:" + multiplicacao);
		System.out.println("A divisão é:" + divisao);
		System.out.println("O resto é:" + resto);
		
	}
}
