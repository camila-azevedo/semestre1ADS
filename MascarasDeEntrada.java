package aula13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MascarasDeEntrada {
 static int LerNumeroInteiroDoTeclado() {                                        // static = sem orientação a objeto
	 BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	 
	 int retorno = 0;
	 boolean deuCerto = false;
	 
	 while (! deuCerto) {
		try {
			System.out.print("Digite um número inteiro: ");
			retorno = Integer.parseInt(leitor.readLine());    // parse.int reconhece se o número é inteiro
			deuCerto = true;
		} catch (Exception erro) {
			System.out.println("Errouuuu. Tente novamente.");
			deuCerto = false;
		}
	 }
	 return retorno; 
   }
 	static double LerNumeroFracionarioDoTeclado() {                                        
	 BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	 
	 double retorno = 0;
	 boolean deuCerto = false;
	 
	 while (! deuCerto) {
		try {
			System.out.print("Digite um número fracionário: ");
			retorno = Double.parseDouble(leitor.readLine());    
			deuCerto = true;
		} catch (Exception erro) {
			System.out.println("Errouuuu. Tente novamente.");
			deuCerto = false;
		}
	 }
 	 return retorno;
 	}
 	
 	static String LerTextoTamanhoFixo(int tamanho) {
 		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
 		
 		String retorno = "";
 		boolean deuCerto = false;
 		
 		while (! deuCerto) {
 			try {
 				System.out.print("Digite um texto de tamanho " + tamanho + ": ");
 				retorno = leitor.readLine();
 				deuCerto = true;
 				if (retorno.length() != tamanho) {	
 					throw new Exception();
 				}	
 			} catch (Exception erro) {
 				System.out.println("Errouuuu. Tente novamente.");
 				deuCerto = false;
 			}
 		 }
 		
 		return retorno;
 	}
 	
 	static String LerNumeroDeTelefone() {
 		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
 		
 		String retorno = "";
 		boolean deuCerto = false;
 		
 		while (! deuCerto) {
 			try {
 				System.out.print("Digite um número de telefone: ");
 				retorno = leitor.readLine();
 				deuCerto = true;
 				
 				// ( posicao 0
 				if (! retorno.substring(0, 1).equals("(")) {          //substring = pega um pedaço da string
 					throw new Exception();
 				}
 				
 				// numero inteiro posição 1 e 2
 				Integer.parseInt(retorno.substring(1, 3));
 				
 				// ) posicao 3 
 				if (! retorno.substring(3, 4).equals(")")) {          
 				}
 				
 				// numero inteiro posição 4 a 8
 				Integer.parseInt(retorno.substring(4, 9));
 				
 				// hífen na posição 9
 				if (! retorno.substring(9, 10).equals("-")){
 					
 				}
 				
 				// numero inteiro posição 10 pra frente
 				Integer.parseInt(retorno.substring(10));
 				
 				// no máximo 14 caracteres
 				if (retorno.length() != 14) {
 					throw new Exception();
 				}
 				
 			} catch (Exception erro) {
 				System.out.println("Errouuuu. Tente novamente.");
 				deuCerto = false;
 			}
 		}
 		return retorno;
 	}
 	
 	public static void main (String [] args) {
 		// Declaração de variáveis
 		int numero = 0;
 		double fracionario = 0; 
 		String texto = "";
 		String telefone = "";
 		
 		// Entrada de Dados
 		numero = LerNumeroInteiroDoTeclado();
 		fracionario = LerNumeroFracionarioDoTeclado();
 		texto = LerTextoTamanhoFixo(6);
 		telefone = LerNumeroDeTelefone();
 		
 		
 		// Saída de Dados
 		System.out.println(numero);
 		System.out.println(fracionario);
 		System.out.println(texto);
 		System.out.println(telefone);
 	}
}



