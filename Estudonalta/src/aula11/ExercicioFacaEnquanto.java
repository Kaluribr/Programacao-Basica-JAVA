package aula11;

import java.util.Scanner;

public class ExercicioFacaEnquanto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n = 0, valor = 0, par = 0, impar = 0, menor;
		String cont;
		
		do {
			System.out.println("{ Analisador de Numeros }");
			System.out.println("Digite o " + n + "° valor: ");
			valor = leia.nextInt();
			n ++;
			if(n % 2 != 0) {
				par++;
				
			}else {
				impar++;
			}
			
			System.out.println("Quer continuar? [S/N]");
			cont = leia.next();
			
		}while(cont == "s" || cont == "S");
		
		System.out.println("Ao todo, voce digitou " + n + " valores.");
		System.out.println("\nVoce digitou " + par + " PARES" );
		System.out.println("\nO valor " + n + " foi o menor numero IMPAR digitado");
		
	}

}
