package br.com.aula04;

import java.util.Scanner;

public class ExercicioQuatro {
		// 4. Fa�a um programa que leia um vetor de 8 posi��es 
		// e, em seguida, leia tamb�m dois valores X e Y quaisquer
		// correspondentes a duas posi��es no vetor. 
		// Ao final seu programa dever� escrever a soma dos 
		// valores encontrados nas respectivas posi��es X e Y.
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
			
			System.out.printf("\nA soma dos valores nas posi��es %d e %d �: %d", 
					posicaoX, posicaoY, soma);
			
			teclado.close();
		}
}
