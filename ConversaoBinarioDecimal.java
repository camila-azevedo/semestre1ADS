package aula12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConversaoBinarioDecimal {
 public static void main (String [] args) {
	 
	 // Declaração de Variáveis
	 BufferedReader leitor = new BufferedReader(
			 				new InputStreamReader (System.in));
	 
	 
	 String binario = "";
	 int decimal = 0;
	 
	 // Entrada de Dados
	 try {
		 System.out.print("Digite o número binário: ");
		 binario = leitor.readLine();
	 } catch (Exception erro) {
		 System.out.println(erro);
	 }
	 
	 // Processamento
	 for (int i = 0 ; i < binario.length() ; i++) {
		 int numero = Integer.parseInt(binario.substring(i, i + 1));
		 decimal += (numero * Math.pow(2, binario.length() - 1 - i));
	 }
			 
	 // Saída de dados
	 System.out.println("O número decimal correspondente é: " + decimal);
	 
	 
	 
	 
}
}