package br.com.aula01;

import java.util.Scanner;

public class ExercicioQuatro {
	//4. Leia um número real e imprima o resultado do quadrado desse número.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		float valorLido = teclado.nextFloat();
		
		float realQuadrado = valorLido * valorLido;
		System.out.printf("O valor quadrado: %.2f", realQuadrado);
		teclado.close();
	} 
}
