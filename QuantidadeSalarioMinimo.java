package aula02;

import java.util.Scanner;

public class QuantidadeSalarioMinimo {
 public static void main (String[] args) {
 
	 // Declaração de Variáveis
	 Scanner leitor = new Scanner(System.in);
	 double salarioMinimo = 1412;
	 double salario = 0;
	 double quantidadeSalariosMinimos = 0;
	 
	 // Entrada de dados
	 System.out.print("Digite o valor do seu salário:");
	 salario = leitor.nextDouble();
	 
	 leitor.close();
	 
	 // Processamento
	 quantidadeSalariosMinimos = (salario/ salarioMinimo);
	 
	 
	 // Saída de dados
	 System.out.println("A quantidade de salários mínimos é " + quantidadeSalariosMinimos);
 }
}
