package br.com.aula02;

import java.util.Scanner;

public class ExercixioSete {
	//7. Faça um programa que peça um valor e mostre na tela se o valor é 
	//positivo ou negativo.
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("## POSITIVO OU NEGATIVO ##");
		System.out.println("Digite um número: ");
		int numeroLido = teclado.nextInt();
				
		if (numeroLido == 0) {
			System.out.println("O número é nulo (igual a 0)");
		} else if (numeroLido > 0) {
			System.out.println("O número é positivo!");
		} else {
			System.out.println("O número é negativo!");
		}
		teclado.close();

	}

}
