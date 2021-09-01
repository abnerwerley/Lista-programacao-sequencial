package br.com.generation.listaSequencial;

import java.util.Scanner;

import java.math.*;

public class Exercicio06 {
/*Exercicio 06
* Author: Abner Werley
* data:31/08/2021
*/
	public static void main(String[] args) {
		
		double Xa,Ya,Xb,Yb, distancia ;
		Scanner leia = new Scanner(System.in);
		double potenciaX;
		double potenciaY;
		
		System.out.println("Calcularei a distância entre dois pontos para você.");
		System.out.println("Insira x e y do primeiro ponto:");
		Xa = leia.nextDouble();
		Ya = leia.nextDouble();
		
		System.out.println("Insira x e y do segundo ponto:");
		Xb = leia.nextDouble();
		Yb = leia.nextDouble();
		
		potenciaX = Math.pow((Xa-Xb),2);
		
		potenciaY = Math.pow((Ya-Yb),2);
		
		distancia = Math.sqrt(potenciaX + potenciaY);
		
		System.out.println("A distancia entre os dois pontos é " + Math.round(distancia));
		
		leia.close();
		
	}
}
