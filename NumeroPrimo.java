package aula08;

public class NumeroPrimo {
	public static void main(String[] args) {

		// Declaração de Variáveis

		long candidatoPrimo = 1;
		boolean ehPrimo = false;

		// Processamento
		while (true) {
			ehPrimo = true;
			for (long divisor = 2; divisor < Math.sqrt(candidatoPrimo); divisor++) {
				if ((candidatoPrimo % divisor) == 0) {
					ehPrimo = false;
					break;
				}
			}

			if (ehPrimo) {
				System.out.println("Achei um primo: " + candidatoPrimo);
			}
			candidatoPrimo++;
		}
	}
}
