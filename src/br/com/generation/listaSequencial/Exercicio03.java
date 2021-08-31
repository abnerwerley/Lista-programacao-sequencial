package br.com.generation.listaSequencial;

import java.util.Scanner;

import java.math.*;

public class Exercicio03 {
/*Exercicio 01
* Author: Abner Werley
* data:31/08/2021
*/
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		double segundos, horas, minutos;
		
		System.out.println("Quantos segundos dura o evento na fábrica?");
		segundos = leia.nextDouble();
		
		minutos = segundos/60;
		horas = segundos/3600;
		
		System.out.println("Esse evento durou " + Math.round(horas) + " horas, ou seja " + Math.round(minutos) + " minutos, ou " 
								+ Math.round(segundos) + " segundos.");
		
		leia.close();
	}
}
