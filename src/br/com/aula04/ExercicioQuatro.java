package br.com.aula04;

import java.util.Scanner;

public class ExercicioQuatro {
		// 4. Faça um programa que leia um vetor de 8 posições 
		// e, em seguida, leia também dois valores X e Y quaisquer
		// correspondentes a duas posições no vetor. 
		// Ao final seu programa deverá escrever a soma dos 
		// valores encontrados nas respectivas posições X e Y.
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("## SOMA POR POSICAO ##");
			
			int[] numeros = new int[8];
			
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Entre com um valor: ");
				numeros[i] = teclado.nextInt();
			}
			
			int posicaoX = -1;
			while(posicaoX < 0 || posicaoX >= numeros.length) {
				System.out.println("Digite uma posicao do vetor: ");
				posicaoX = teclado.nextInt();
			}
			
			
			System.out.println("Digite outra posicao do vetor: ");
			int posicaoY = teclado.nextInt();
			
			int soma = numeros[posicaoX] + numeros[posicaoY];
			
			for (int valor : numeros) {
				System.out.printf("%d ", valor);
			}
			
			System.out.printf("\nA soma dos valores nas posições %d e %d é: %d", 
					posicaoX, posicaoY, soma);
			
			teclado.close();
		}
}
