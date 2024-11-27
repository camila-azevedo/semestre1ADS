package aula08;

import java.util.Scanner;

public class SocioeconomicaIBGE {
public static void main (String [] args) {
	
	// Declaração de Variáveis
	Scanner leitor = new Scanner(System.in); 
	
	double rendaFamiliar = 0;
	double tamanhoFamilia = 0;
	double rendaMedia = 0;
	
	double classeA = 0;
	double classeB = 0;
	double classeC = 0;
	double classeD = 0;
	double classeE = 0;
	
	double tamanhoPopulacao = 0;
	
	// Entrada de Dados
	
	do {
		
	
	System.out.print("Informe a renda familiar:");
	rendaFamiliar = leitor.nextDouble();
	
	System.out.print("Informe a quantidade de pessoas na família: ");
	tamanhoFamilia = leitor.nextDouble();
	
	rendaMedia = rendaFamiliar / tamanhoFamilia;
	if (rendaMedia < 500 ) {
		classeE = classeE + tamanhoFamilia;
	} else if (rendaFamiliar < 2000) {
		classeD += tamanhoFamilia;
	} else if (rendaFamiliar < 5000) {
		classeC += tamanhoFamilia;
	} else if (rendaFamiliar < 10000) {
		classeB += tamanhoFamilia;
	} else {
		classeA += tamanhoFamilia; 
	}
	
	
	System.out.print("Digite <S> se houver mais casas na rua: ");
	} while (leitor.next().equalsIgnoreCase("S"));
	
	leitor.close();
	
	// Saída de Dados
	
	tamanhoPopulacao = classeA + classeB + classeC + classeD + classeE;
	
	System.out.println("Percentual de pessoas na classe A: " + (100 * classeA / tamanhoPopulacao + "%"));
	System.out.println("Percentual de pessoas na classe B: " + (100 * classeB / tamanhoPopulacao + "%"));
	System.out.println("Percentual de pessoas na classe C: " + (100 * classeC / tamanhoPopulacao + "%"));
	System.out.println("Percentual de pessoas na classe D: " + (100 * classeD / tamanhoPopulacao + "%"));
	System.out.println("Percentual de pessoas na classe E: " + (100 * classeE / tamanhoPopulacao + "%"));
}
}