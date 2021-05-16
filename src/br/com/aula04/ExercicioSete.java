package br.com.aula04;

import java.util.Scanner;

public class ExercicioSete {
	// 7. Escreva um programa que leia 10 números inteiros
	// e os armazene em um vetor. Imprima o vetor, o maior elemento
	// e a posição que ele se encontra.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## MAIOR DENTRO DE UM VETOR ##");
		int[] numeros = new int[10];
		
		int posMaior = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um valor: ");
			numeros[i] = teclado.nextInt();
						
			if (numeros[i] > numeros[posMaior]) {
				posMaior = i;
			}
			
		}
		
		System.out.printf("O maior valor é %d e ele se encontra na posição %d", 
				numeros[posMaior], posMaior);
		
		teclado.close();
	}
}
