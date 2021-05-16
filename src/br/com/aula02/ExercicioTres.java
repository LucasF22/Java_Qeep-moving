package br.com.aula02;

import java.util.Scanner;

public class ExercicioTres {
	//3. Implemente um programa que calcule o ano de nascimento de uma pessoa
	//a partir de sua idade e do ano atual.
	//
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("## Ano de Nascimento ##");
		System.out.println("Digite sua idade: ");
		int idade = teclado.nextInt();
		
		System.out.println("Digite o ano do seu ultimo aniversário: ");
		int anoAtual = teclado.nextInt();
		
		int anoNascimento = anoAtual - idade;
		System.out.printf("O ano que você nasceu foi: %d", anoNascimento);
		teclado.close();	
	}

}
