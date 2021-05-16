package br.com.aula04;

import java.util.Scanner;

public class ExercicioCinco {
		// 5. Leia um vetor de 10 posições. 
		// Contar e escrever quantos valores pares ele possui.
		
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("## CONTADOR DE PARES ##");
			int[] numeros = new int[10];
			
			int contadorDePares = 0;
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Digite um valor: ");
				numeros[i] = teclado.nextInt();
				
				if (numeros[i] % 2 == 0) {
					contadorDePares++;
				}
				
			}
			
			System.out.printf("Os valores pares inserido tem um total de: %d", contadorDePares);
			teclado.close();
		}
}
