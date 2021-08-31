package br.com.generation.listaSequencial;

import java.util.Scanner;

public class Exercicio08 {
/*Exercicio 08
 * Author: Abner Werley
 * data:31/08/2021
 */
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double custoConsumidor, custoFabrica, custoDistribuidor;
		
		System.out.println("Qual o preço de fábrica?");
		custoFabrica = leia.nextDouble();
		
		custoDistribuidor = custoFabrica +(custoFabrica*0.28);
		
		custoConsumidor = custoDistribuidor + (custoDistribuidor *0.45);
		
		System.out.println("O preço final é " + custoConsumidor);
		
		leia.close();
	}
}
