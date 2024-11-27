package aula12;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindromo {
public static void main (String [] args) {
		
		// Declaração de Variáveis
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		
		String texto = "";
		boolean palindromo = true;
		
		// Entrada de dados
		try {
			System.out.print("Digite um texto: ");
			texto = leitor.readLine();
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
		// Processamento
		texto = texto.toUpperCase();
		texto = texto.replaceAll(" ", "");
		texto = texto.replaceAll("-", "");
		texto = texto.replaceAll("\\.", "");
		for (int i = 0 ; i < (texto.length() / 2) ; i++) {
			if (texto.charAt(i) != texto.charAt(texto.length() - 1 - i)) {
				palindromo = false;
			}
		}
		// Saída de dados
		if (palindromo) {
			System.out.println("Parabéns, é um palíndromo!"); 	
		} else {
			System.out.println("Poxa, não é um palíndromo :( ");
		}
		
}
}