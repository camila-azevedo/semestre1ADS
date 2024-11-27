package aula05;

import java.util.Scanner;

public class CustoTotalCompra {
public static void main (String [] args) {
	
	//Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	double valorProduto = 0;
	int quantidadeCompra = 0;
	double valorTotal = 0;
	double valorDesconto = 0;
	
	
	//Entrada de dados
	
	System.out.print("Digite o valor do produto: R$");
	valorProduto = leitor.nextDouble();
	
	System.out.print("Digite a quantidade de produtos: ");
	quantidadeCompra = leitor.nextInt();
	
	leitor.close();
	
	
	//Processamento
	
	valorTotal = valorProduto * quantidadeCompra;
	
	if (quantidadeCompra >= 100) {
		valorDesconto = valorTotal * 0.5;
		
	} else if  (quantidadeCompra >= 50) {
		valorDesconto = valorTotal * 0.6;
		
	} else if  (quantidadeCompra >= 20) {
		valorDesconto = valorTotal * 0.7;
		
	} else if (quantidadeCompra >= 10) {
		valorDesconto = valorTotal * 0.9;
		
	} else {
		valorDesconto = valorTotal;
		
	}
	
	//Saída de Dados
	
	System.out.println("O valor total com desconto é de R$ " + valorDesconto );
	

}
}
