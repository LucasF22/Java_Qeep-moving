package br.com.aula02;

import java.util.Scanner;

public class ExercicioQuatro {
	//4. Receba a altura do degrau de uma escada e a altura que o 
	//usuário deseja alcançar subindo a escada. Calcule e mostre quantos degraus
	//o usuário deverá subir para atingir seu objetivo.
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("## altura para alcança ##");
		System.out.println("Digite a altura do degrau cm: ");
		float alturaDegrau = teclado.nextFloat();
		
		System.out.println("Altura da Escada em m: ");
		float alturaEscada = teclado.nextFloat();
		
		float qtdDegraus = (alturaEscada * 100) / alturaDegrau;
		
		System.out.printf("A quantidade de degraus dessa escada é %.0f", qtdDegraus);
		teclado.close();
		
	}
}
