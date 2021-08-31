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

		System.out.println("Olá, qual é o seu nome?");
		nome = leia.nextLine();

		System.out.println("Muito bem, calcularei quantos dias você já viveu.");

		System.out.println("Quantos anos você tem?");
		anos = leia.nextInt();

		System.out.println("Há quantos meses você fez aniversário?");
		meses = leia.nextInt();

		System.out.println("Por úlltimo, estamos em que dia do mês?");
		dias = leia.nextInt();

		diasTotais = (anos * 365) + (meses * 30) + dias;

		System.out.println(nome + ", você já viveu " + diasTotais + " dias até agora.");
	
		leia.close();
	
	
	}
}
