package br.com.aula03;

import java.util.Scanner;

public class ExercicioOito {
		// 8. Faça um programa que peça um número inteiro e determine se ele é ou não um número primo. 
		// Um número primo é aquele que é divisível somente por ele mesmo e por 1.
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("## NÚMEROS PRIMOS ##");
			
			System.out.println("Digite um número inteiro e "
					+ "direi se ele é ou não primo.");
			int numero = teclado.nextInt();
			
			int contador = 0;
			for (int i = numero - 1; i > 1; i--) {
				if (numero % i == 0) {
					contador++;
					break;
				}
				
			}
			
			if (contador == 1) {
				System.out.println("Não é primo!");
			} else {
				System.out.println("É primo!");
			}
			
			teclado.close();
		}
}
