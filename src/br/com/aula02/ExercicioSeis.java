package br.com.aula02;

import java.util.Scanner;

public class ExercicioSeis {
	//6. Faça um programa que receba dois números e mostre qual deles é o maior
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Comparador de Números ##");
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		int segundoNumero = teclado.nextInt();
		
		if (primeiroNumero == segundoNumero) {
			System.out.print("Os números digitados são iguais");
		}else if (primeiroNumero > segundoNumero) {
			System.out.printf("O primeiro número é maior que o segundo");
		}else {
			System.out.printf("O segundo número é maior que o primeiro");
		}
		teclado.close();
		}
		
		
	}

