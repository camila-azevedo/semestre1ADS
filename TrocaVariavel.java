package aula01;

public class TrocaVariavel {
	public static void main (String args[]) {
		// Declaração de variáveis
		int var1 = 0;
		int var2 = 0;
		int temp = 0;
		
		// Atribuição Inicial
		var1 = 3;
		var2 = 5;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
		// Troca propriamente dita
		temp = var1;
		var1 = var2;
		var2 = temp;
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		
				
	}
}
