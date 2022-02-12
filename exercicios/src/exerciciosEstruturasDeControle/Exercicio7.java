package exerciciosEstruturasDeControle;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int somadorDeNumeros = 0;
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (zero ou negativo para sair): ");
			numero = scanner.nextInt();
			if (numero >= 0) {
				somadorDeNumeros += numero; // Isso � igual a somadorDeNumeros = somadorDeNumeros + numero;
				System.out.printf("\nSoma at� o momento: %d\n", somadorDeNumeros);
			}
		}
		scanner.close();
	}

}


/*
 * 7. Criar um programa que enquanto estiver recebendo n�meros positivos,
 * imprime no console a soma dos n�meros inseridos, caso receba um n�mero
 * negativo, encerre o programa. Tente utilizar a estrutura do while.
 */