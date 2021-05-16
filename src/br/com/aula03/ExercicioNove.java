package br.com.aula03;

import java.util.Scanner;

public class ExercicioNove {
		// 9. Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
		// 3 = 3 * 2 * 1; 
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("## FATORIAL ##");
			
			System.out.println("Digite um valor para calculo de fatorial: ");
			int numero = teclado.nextInt();
			
			int fatorial = 1;
			
			for (int i = numero; i > 1; i--) {
				fatorial = fatorial * i;
				
			}
			
			System.out.printf("O fatorial de %d é %d", 
					numero, fatorial);
			
			teclado.close();
		}
}
