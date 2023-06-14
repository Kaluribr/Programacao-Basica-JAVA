package aula08;

import java.util.Scanner;

public class RepeticaoComFlag2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n = 0, s = 0;
		char r = 's';
		
		while( r == 's') {
			System.out.println("Digite um número: ");
			
			n = leia.nextInt();
			s += n;
			System.out.println("Quer continuar? [S/N]");
			leia.skip("\\R?");
			r = leia.next().charAt(0);
		}
		System.out.println("A soma dos valores é " + s);

	}

}
