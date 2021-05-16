package br.com.aula03;

import java.util.Scanner;

public class ExercicioTres {
		// 3. Escreva um programa que leia 10 números e escreva o menor
		// valor lido e o maior valor lido.
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("## MAIOR E MENOR ##");
			
			int maior = Integer.MIN_VALUE;
			int menor = Integer.MAX_VALUE;
			
			for (int i = 0; i < 10; i++) {
				System.out.println("Digite um valor: ");
				int valorLido = teclado.nextInt();
							
				if (valorLido > maior) {
					maior = valorLido;
				}
				
				if (valorLido < menor) {
					menor = valorLido;
				}
				
			}
			
			System.out.printf("O maior valor lido é %d"
					+ "\nO menor valor lido é %d.", maior, menor);
			
			teclado.close();
		}

}
