package br.com.generation.listaSequencial;

import java.util.Scanner;

public class Exercicio05 {
/*Exercicio 01
* Author: Abner Werley
* data:31/08/2021
*/	
	public static void main(String[] args) {
		
		double nota1,nota2,nota3,peso1,peso2,peso3,media;
		peso1 = 2;
		peso2 = 3;
		peso3  = 5;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("ol�, calcularei a m�dia das notas de Ingl�s, Portugu�s e Matem�tica.");
		
		System.out.println("Digite a nota de ingl�s: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a nota de Portugu�s: ");
		nota2 = leia.nextDouble();
	
		System.out.println("Digite a nota de matem�tica: ");
		nota3 = leia.nextDouble();
		
		media = ( nota1*peso1 + nota2*peso2 + nota3 * peso3 )/ (peso1 + peso2 + peso3);
		
		System.out.println("A sua m�dia foi " + Math.round(media));
	
		leia.close();
	}
}
