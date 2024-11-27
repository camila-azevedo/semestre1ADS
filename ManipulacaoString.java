package aula12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ManipulacaoString {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	BufferedReader leitor = new BufferedReader(
						new InputStreamReader(System.in));
	
	String texto = "";
	String remocao = "";
	
	//Entrada de dados
	try {
		System.out.print("Digite um texto: ");
		texto = leitor.readLine();
		
		System.out.print("Digite algo para ser removido: ");
		remocao = leitor.readLine();
		
	} catch (Exception erro) {
		System.out.println(erro);
		
	}
	
	// Processamento
	System.out.println("Primeiro caractere: " + texto.substring(0,1));   // substring (começo, fim)
	System.out.println("Último caractere: " + texto.substring(texto.length() - 1));
	System.out.println("Tamanho do texto: " + texto.length());
	
	System.out.println("Texto em maiúsculo: " + texto.toUpperCase());
	System.out.println("Texto em minúsculo: " + texto.toLowerCase());
	
	System.out.println("Texto removido: " + texto.replaceAll(remocao, ""));
	
	
	// Testar os métodos
	// texto. alguma coisa
	
	
}
}
