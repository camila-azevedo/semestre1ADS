package aula03;

import java.util.Scanner;

public class QuantidadeAzulejo {

		public static void main (String [] args) {
			
			// Declaração de Variáveis
			Scanner leitor = new Scanner(System.in);
			double profundidade = 0;
			double largura = 0;
			double comprimento = 0;
			
			double areaParedeLonga = 0;
			double areaParedeCurta = 0;
			double areaDoPiso = 0;
			
			double areaDoAzulejo = 0.01;
			
			double quantidadeAzulejo = 0;
			
			
			
			// Entrada de dados
			System.out.print("Digite o valor da profundidade: ");
			profundidade = leitor.nextDouble();
			
			System.out.print("Digite o valor da largura: ");
			largura = leitor.nextDouble();
			
			System.out.print("Digite o valor do comprimento: ");
			comprimento = leitor.nextDouble();
			
			leitor.close();
			
			// Processamento
			
			areaParedeLonga = comprimento * profundidade;
			areaParedeCurta = largura * profundidade;
			areaDoPiso = comprimento * largura;
			
			quantidadeAzulejo = (2 * areaParedeLonga + 2 * areaParedeCurta + areaDoPiso) / areaDoAzulejo;
			
			// Saída de Dados
			
			System.out.println("A quantidade de azulejos necessários para revestir a piscina é " + quantidadeAzulejo);
			
			
			
			
}
}