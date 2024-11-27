package aula12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ContadorOcorrencias {
	public static void main (String [] args) {
		
		// Declaração de Variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		String texto = "";
		String procura = "";
		int ocorrencias = 0;
		
		// Entrada de dados
		 try {
			 System.out.print("Digite um texto: ");
			 texto = leitor.readLine();
			 
			 System.out.print("Digite algo para procurar no texto: ");
			 procura = leitor.readLine();
			 
		 } catch (Exception erro) {
			 System.out.println(erro);
		 }
		 
		 // Processamento
		 int posicao = -1;
		 do {
			 posicao = texto.indexOf(procura, posicao + 1);
			 if (posicao > -1) {
				 ocorrencias++;
			 } 
		 } while (posicao > -1);
		 
		 // Saída de dados
		 System.out.println("A quantidade de ocorrências é: " + ocorrencias);
			 
		 
	}
}