package br.com.generation.listaSequencial;

import java.util.Scanner;

public class Exercicio01 {
/*Exercicio 01
* Author: Abner Werley
* data:31/08/2021
*/
	public static void main(String[] args) {

		int idade, anos, meses, dias, diasTotais;
		String nome;

		Scanner leia = new Scanner(System.in);

		System.out.println("Ol�, qual � o seu nome?");
		nome = leia.nextLine();

		System.out.println("Muito bem, calcularei quantos dias voc� j� viveu.");

		System.out.println("Quantos anos voc� tem?");
		anos = leia.nextInt();

		System.out.println("H� quantos meses voc� fez anivers�rio?");
		meses = leia.nextInt();

		System.out.println("Por �lltimo, estamos em que dia do m�s?");
		dias = leia.nextInt();

		diasTotais = (anos * 365) + (meses * 30) + dias;

		System.out.println(nome + ", voc� j� viveu " + diasTotais + " dias at� agora.");
	
		leia.close();
	
	
	}
}
