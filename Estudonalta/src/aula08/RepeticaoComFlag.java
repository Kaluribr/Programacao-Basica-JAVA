package aula08;

import java.util.Scanner;

public class RepeticaoComFlag {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade = 0, soma = 0;
		
		while(idade != 9999) {
			System.out.println("Digite a sua idade");
			idade = leia.nextInt();
			if (idade != 9999) {
				soma += idade;
			}
			
		}
		System.out.println("A soma de todas as idades e " + soma);
		System.out.println("\n========= Programa encerrado ==========");
	}

}
