package br.com.aula02;

import java.util.Scanner;

public class ExercicioOito {
	//8. Escreva um programa que, dados dois números inteiros, mostre na tela o 
	//maior deles, assim como a diferença existente entre ambos.
	public static void main(String[] args) {
		Scanner  teclado = new Scanner(System.in);
		System.out.println("## Diferença dos números ##");
		System.out.println("Digite o primeiro número: ");
		int primeiroNumero = teclado.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int segundoNumero = teclado.nextInt();
		
		if (primeiroNumero == segundoNumero) {
			System.out.print("Os números digitados são iguais");
		}else if (primeiroNumero > segundoNumero) {
			int diferenca = primeiroNumero - segundoNumero;
			System.out.printf("O primeiro número é maior que o segundo \n "
					+ "E a diferança entre eles é de %d", diferenca);
		}else {
			int diferenca = segundoNumero - primeiroNumero;
			System.out.printf("O sugundo número é maior que o primeiro \n "
					+ "E a diferança entre eles é de %d", diferenca);
		}
		teclado.close();
	}

}
