package br.com.aula03;

public class ExercicioQuatro {
		// 4. Faça um programa que calcule e mostre a soma dos 
		// 50 primeiros números ímpares.
		public static void main(String[] args) {
	
			System.out.println("## SOMA 50 PRIMEIROS IMPARES ##\n");
			
			int soma = 0;
			int contador = 0;
			int numero = 1;
			while (contador < 50) {
				
				if (numero % 2 != 0) {
					soma += numero;
					contador++;
				}
				
				numero++;
			}
			
			System.out.printf("\nA soma dos 50 primeiros números ímpares é %d", soma);
			
		}
}
