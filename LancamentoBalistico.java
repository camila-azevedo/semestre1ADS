package aula09;

import java.text.DecimalFormat;
import java.util.Scanner;

public class LancamentoBalistico {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in);
	
	double angulo = 0;
	double velocidade = 0;
	
	// Entrada de dados
	
	System.out.print("Digite o ângulo: ");
	angulo = leitor.nextDouble();
	
	System.out.print("Digite a velocidade: ");
	velocidade = leitor.nextDouble();
	
	leitor.close();
	
	// Processamento
	angulo = ((Math.PI * angulo) / 180);
	double tempo = ((2 * velocidade * Math.sin(angulo)) / 9.82);
	double distanciaFinal = ((Math.pow(velocidade, 2) *
							Math.sin(2 * angulo)) / 9.82);
	
	
	//Saída de Dados
	System.out.println("Tempo \t Distância");
	
	for (double i = 0 ; i < tempo ; i++) {
		double distanciaTempoATempo = (velocidade * Math.cos(angulo) * i);
		System.out.println(new DecimalFormat("0.00").format(i) + "\t" + distanciaTempoATempo);
		
	}
	System.out.println(new DecimalFormat("0.00").format(tempo) + "\t" + distanciaFinal);    // \t = tab
	
	
	
	
}
}