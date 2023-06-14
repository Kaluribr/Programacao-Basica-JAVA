package aula09;

import java.util.Scanner;

public class RepeticaoComInterrupcao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int n;
		String r;
		
		while(true) {
			System.out.println("Valor: ");
			n = leia.nextInt();
			
			System.out.println("Quer continuar? ");
			r = leia.next();
			if(r == "N" || r == "n") {
			
			}break;
		}
		System.out.println("Usuario mandou parar...");
	}

}
