package exerciciosEstruturasDeControle;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Vamos verificar se o ano é bissexto.");
		System.out.println("Digite o ano desejado!!!");
		int ano = entrada.nextInt();
		
		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0  || ano % 400 == 0);
		
		if(bissexto) {
			System.out.println("Ano é bissexto");
		} else {
			System.out.println("Ano não é bissexto");	
		}

		entrada.close();
		
	}

}

/* 2. Criar um programa informa se o ano atual é um ano bissexto; */