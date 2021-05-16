package br.com.aula01;

import java.util.Scanner;

public class ExercicioDois {
	//2. Faça um programa que leia um número real e o imprima.
	public static void main(String[] args) {
		 System.out.println("Olá querido usuário, digite um número:");
		 Scanner teclado = new Scanner(System.in);
		 float realLido = teclado.nextFloat();
		 
		 System.out.printf("\nO número lido foi: %.2f", realLido);
		 teclado.close();
	}
	

}
