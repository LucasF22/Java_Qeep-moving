package br.com.aula02;

import java.util.Scanner;

public class ExercicioCinco {
	//5. Faça um programa que leia o valor de um produto e imprima o valor
	// com desconto, tendo em vista que o desconto foi de 12%.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("## Valor de desconto ##");
		System.out.println("Digite o valor do produto: ");
		float valorProduto = teclado.nextFloat();
		
				
		float valorDesconto = valorProduto * 0.88F;
		
		System.out.printf("O valor produto com desconto de 12%% é %.2f", valorDesconto);
		teclado.close();

	}

}
