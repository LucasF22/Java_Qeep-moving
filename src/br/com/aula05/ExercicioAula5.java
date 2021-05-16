package br.com.aula05;

import java.util.Scanner;

public class ExercicioAula5 {
	public static int dobro(int valor) {
		return valor * 2;
		
	}
	public static int horasSegunsos(int horas, int minutos, int segundos) {
		return (horas * 3600) + (minutos * 60) + segundos;
	}
	public static float fahrenheit(float celsius) {
		return (celsius * 1.8F) + 32 ;
		//System.out.println("°F")
		//(0 °C × 9/5) + 32 = 32 °F
	}
	public static float VolumeCilindro(float raio, float altura) {
		float VolumeCilindro = 3.14F * (raio * raio) * altura;
		return VolumeCilindro;
	}
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	int sair = 0;
	do {		
		System.out.println("__________OPERAÇÕES DE MATEMÁTICAS___________");
		System.out.println("* 1 DOBRO ..................................*");
		System.out.println("* 2 CONVERSOR SEGUNDOS ...............,.....*");
		System.out.println("* 3 CONVERSOR DE CELSIUS PARA FAHRENHEIT ...*");
		System.out.println("* 4 VOLUME DO CILINDRO .....................*");
		System.out.println("_____________________________________________");
		
		System.out.println("Digite o número da opção: ");
		int opcao = teclado.nextInt();
		
		switch (opcao) {
		case 1 :
			System.out.println("\nDigite um número para obter seu dobro: ");
			int numero = teclado.nextInt();
			System.out.println("\nO Dobro é:");
			System.out.println(dobro(numero)); 
			System.out.println("_______________________________________");
			break;
		case 2:
			System.out.println("\nDigite as hora: ");
			int horas = teclado.nextInt();
			System.out.println("\nDigite os minutos: ");
			int minutos = teclado.nextInt();
			System.out.println("\nDigite segundos: ");
			int segundos = teclado.nextInt();
			int segundosTotais = horasSegunsos(horas, minutos, segundos);
			System.out.printf("\nSegundos são: %d s\n", segundosTotais);
			System.out.println("_______________________________________");
			break;
		case 3:
			System.out.println("\nDigite os Celsius para conversão: ");
			float celsius = teclado.nextFloat();
			System.out.print(fahrenheit(celsius)); System.out.println("°F\n");
			System.out.println("_______________________________________");
			break;
		case 4:
			System.out.println("\nDigite o raio do cilindro (em metros): ");
			float raio = teclado.nextFloat();
			System.out.println("\nDigite a altura do dilindro (em metros): ");
			float altura = teclado.nextFloat();
			
			System.out.println(VolumeCilindro(raio, altura)); System.out.println("m³\n");
			
			System.out.println("_______________________________________");
			break;
		default:
			System.out.println("OPÇÃO NÃO EXISTE!");
			System.out.println("_______________________________________");
		};
		
		System.out.println("\nDeseja fazer novo calculo?\n"
				+ "Digite 0 para sair ou 1 para continuar!"); 
		sair = teclado.nextInt(); 
		
	} while(sair != 0);
	System.out.println("OBRTIGADO POR TESTAR!");
	teclado.close();
			
	}

}
