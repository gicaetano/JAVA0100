package exerciciosEstruturasDeControle;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in); 
		
		System.out.print("Digite a Primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a Segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if(media >= 7) {
			System.out.println("APROVADO");
		} else if(media >= 4 && media < 7) {
			System.out.println("RECUPERACÃO");
		} else{
			System.out.println("REPROVADO");
		} 
		entrada.close();
	}

}


/*
 * 3. Criar um programa que receba duas notas parciais, calcular a média final.
 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se
 * a nota for menor que 7.0 e maior do que 4.0 imprime no console
 * "Recuperação", caso contrário imprime no console "Reprovado".
 */