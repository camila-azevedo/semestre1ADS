package aula13;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalcularDVCPF {
	static String calcularDV(String cpf) {
		int dv1 = 0;
		int dv2 = 0;
		int soma = 0;
		
		// Primeiro DV
		for (int i = 0; i < cpf.length() ; i++) {
			soma += ((10 - i) * Integer.parseInt(cpf.substring(i, i + 1)));
			dv1 = 11 - (soma % 11);
			if (dv1 >= 10) {
				dv1 = 0;
		}
		}
		
		// Segundo DV
		cpf = cpf + dv1;
		soma = 0;
		
		for (int i = 0 ; i < cpf.length() ; i++) {
			soma += ((11 - i) * Integer.parseInt(cpf.substring(i, i +1)));
			}
		dv2 = 11 - (soma % 11);
		if (dv2 >= 10) {
			dv2 = 0;
		}
	
	 // Retorno
	return ("" + dv1 + dv2);
	}

	public static void main (String [] args) {
	BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
	String cpf = "";
	
		try {
		// Entrada de Dados
			System.out.print("Digite o CPF sem DV: ");
			cpf = leitor.readLine();
		
		// Saída de dados
			System.out.println(cpf + "-" + calcularDV(cpf));
		} catch (Exception erro) {
			System.out.println(erro);
		}
		
	}
	}
