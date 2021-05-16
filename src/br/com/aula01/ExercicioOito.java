package br.com.aula01;

import java.util.Scanner;

public class ExercicioOito {
	//8. Leia um número inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("## Soma de inteiros ##");
		System.out.println("Digite um valor inteiro: ");
		int numero = teclado.nextInt();
		
		int somaSucessorTriplo = (numero * 3) + 1;
		int somaAntecessorDobro = (numero * 2) - 1;
		
		int soma = somaSucessorTriplo + somaAntecessorDobro;
		
		System.out.printf("A soma do seu sucessor triplo com o antecessor do dobro é %d", soma);
		teclado.close();
		
	}

}
