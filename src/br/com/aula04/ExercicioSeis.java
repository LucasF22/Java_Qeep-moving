package br.com.aula04;

import java.util.Scanner;

public class ExercicioSeis {
		// 6.Fa�a um programa que receba do usu�rio um vetor com 
		// 10 posi��es. Em seguida dever� ser 
		// impresso o maior e o menor elemento do vetor.
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("## MAIOR MENOR DENTRO DE UM VETOR ##");
			int[] numeros = new int[10];
			
			int posMaior = 0;
			int posMenor = 0;
			
			for (int i = 0; i < numeros.length; i++) {
				System.out.println("Digite um valor: ");
				numeros[i] = teclado.nextInt();
							
				if (numeros[i] > numeros[posMaior]) {
					posMaior = i;
				}
				
				if (numeros[i] < numeros[posMenor]) {
					posMenor = i;
				}
				
			}
			
			System.out.printf("O menor valor � %d e ele se encontra na posi��o %d\n", 
					numeros[posMenor], posMenor);
			
			System.out.printf("O maior valor � %d e ele se encontra na posi��o %d", 
					numeros[posMaior], posMaior);
			
			teclado.close();
		}
}
