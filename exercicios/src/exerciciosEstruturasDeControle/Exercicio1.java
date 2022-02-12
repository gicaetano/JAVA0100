package exerciciosEstruturasDeControle;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um numero de 0 a 10:");
		int numero = entrada.nextInt();
		
		if (numero > 0 && numero <= 10) {
			
			if(numero % 2 == 0) {
				System.out.println("Numero digitado é par!!!");			
			} else {
				System.out.println("Numero digitado é impar!!!");
			}		
		} else {
			System.out.println("Numero inválido, Digite um numero entre 0 e 10");
		}
		entrada.close();
	}
}

/*
 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
 * 10 e é par;
 */