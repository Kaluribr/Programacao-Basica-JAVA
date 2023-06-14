package aula08;

import java.util.Scanner;

public class Exe39 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n = 1, numero = 0, soma = 0;
		
		while(numero != 9999) {
			System.out.println(n + "º VALOR [9999 faz parar] ");
			System.out.println("------------");
			System.out.println("NUMERO: ");
			numero = leia.nextInt();
			System.out.println("------------");
			if (numero != 9999) {
				soma += numero; 
			}
			n ++;
		}
		System.out.println("Programa encerrado " + soma);
	}

}
