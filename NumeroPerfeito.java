package aula09;

public class NumeroPerfeito {
	public static void main (String [] args) {
		
	// Processamento
	for (int candidato = 1 ; candidato < 1000000000 ; candidato++) {  //inicialização ; condição ; incremento
		long somaDivisores = 0;
		for (int divisor = 1 ; divisor <= (candidato/2) ; divisor++) {
			
	
	if ((candidato % divisor) == 0) {
		somaDivisores += divisor;
		}
	}
		
		if (somaDivisores == candidato) {
			System.out.println( candidato + " Achei um perfeito!!!");
		}
}
}
}