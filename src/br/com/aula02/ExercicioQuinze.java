package br.com.aula02;

import java.util.Scanner;

public class ExercicioQuinze {
	// 15. Faça um programa que mostre ao usuário um menu com 4 opções de operações
		// matemáticas (as básicas, por exemplo). O usuário escolhe uma das opções e o 
		// seu programa então pede dois valores numéricos e realiza a operação, 
		// mostrando o resultado e saindo.
		
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("## CALCULADORA ##");
			System.out.println(" ** Digite 1 para soma");
			System.out.println(" ** Digite 2 para subtração");
			System.out.println(" ** Digite 3 para multiplicação");
			System.out.println(" ** Digite 4 para divisão");
			int opcao = teclado.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.println("Digite o primeiro valor: ");
					float primeiroValor = teclado.nextFloat();
					System.out.println("Digite o segundo valor: ");
					float segundoValor = teclado.nextFloat();
					float soma = primeiroValor + segundoValor;
					System.out.printf("O resulatado da soma é: %.2f", soma);
					break;
				
				case 2:
					System.out.println("Digite o primeiro valor: ");
					float primeiroValorSubtracao = teclado.nextFloat();
					System.out.println("Digite o segundo valor: ");
					float segundoValorSubtracao = teclado.nextFloat();
					float subtracao = primeiroValorSubtracao - segundoValorSubtracao;
					System.out.printf("O resulatado da subtração é: %.2f", subtracao);
					break;
				
				case 3:
					System.out.println("Digite o primeiro valor: ");
					float primeiroValorMult = teclado.nextFloat();
					System.out.println("Digite o segundo valor: ");
					float segundoValorMult = teclado.nextFloat();
					float multiplicacao = primeiroValorMult * segundoValorMult;
					System.out.printf("A diferenca dos valores é: %.2f", multiplicacao);
					break;
				
				case 4:
					System.out.println("Digite o primeiro valor: ");
					float primeiroValorDiv = teclado.nextFloat();
					System.out.println("Digite o segundo valor: ");
					float segundoValorDiv = teclado.nextFloat();
					float divisao = primeiroValorDiv / segundoValorDiv;
					System.out.printf("A diferenca dos valores é: %.2f", divisao);
					break;
				
				default:
					System.out.println("Opção inválida.");
			
			}
			
			teclado.close();
		}
}
