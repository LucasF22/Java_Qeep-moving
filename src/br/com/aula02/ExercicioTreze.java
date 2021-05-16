package br.com.aula02;

import java.util.Scanner;

public class ExercicioTreze {
		// 13. Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve 
		// calcular a média alcançada por aluno e apresentar: 
		// A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		// A mensagem "Reprovado", se a média for menor do que sete;
		// A mensagem "Aprovado com Distinção", se a média for igual a dez.
		
		public static void main(String[] args) {
			
			Scanner teclado = new Scanner(System.in);
			System.out.println("## APROVAÇÃO ESCOLAR COM OPÇÃO DE DISTINÇÃO##");
			
			System.out.println("Digite a primeira nota: ");
			float primeiraNota = teclado.nextFloat();
			
			System.out.println("Digite a segunda nota: ");
			float segundaNota = teclado.nextFloat();
			
			float media = (primeiraNota + segundaNota) / 2F;
			
			if (media < 7) { 
				System.out.println("Reprovado");
			} else if (media < 10) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Aprovado com distinção");
			}
			
			teclado.close();
		}
}
